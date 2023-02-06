package com.trinity.basemvvm.ui.main.activity.home

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<HomeCallBack>(appDatabase,interactCommon,scheduler) {

    companion object{
        const val ON_CLICK_LOGIN = 1
        const val ON_CLICK_NEW_ACCOUNT = 2
    }
    fun onClickLogin(){
        uiEventLiveData.value = ON_CLICK_LOGIN
    }
    fun onClickNewAccount(){
        uiEventLiveData.value = ON_CLICK_NEW_ACCOUNT
    }
}