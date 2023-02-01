package com.trinity.basemvvm.ui.main.fragment.user

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import com.trinity.basemvvm.common.Constants
import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.model.User
import com.trinity.basemvvm.data.remote.ApiHelp
import com.trinity.basemvvm.data.remote.ApiUser
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executor
import javax.inject.Inject

class UserViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<UserCallBack>(appDatabase, interactCommon, scheduler) {
    val mIsRefreshing = ObservableBoolean(false)
    private val api: ApiUser
    val obUsers = MutableLiveData<MutableList<User>>()
        get

    init {
        api = ApiHelp.createRetrofit(endpoint = Constants.BASE_URL, formatDate = Constants.LIST_FORMAT_TIME).create(
            ApiUser::class.java)
        getUsers()
    }

    fun getUsers() : Disposable?{
        setIsLoading(true)
        return subscribeHasResultDispose(
            api.getUsers().subscribeOn(Schedulers.from(schedulers))
                .observeOn(Schedulers.computation()),
            {
                setIsLoading(false)
                mIsRefreshing.set(false)
                makeFunOnOtherThread {
                    appDatabase.userDao().insertListUser(it.data!!)
                }
                obUsers.postValue(it.data)
            },{
                mIsRefreshing.set(false)
                setIsLoading(false)
                callBack?.get()?.error(User::class.java.name, it)
            }
        )
    }

    fun getAllUserOffline(){
        obUsers.postValue(appDatabase.userDao().findAll())
    }

    fun onRefresh(){
        mIsRefreshing.set(true)
        getUsers()
    }
}