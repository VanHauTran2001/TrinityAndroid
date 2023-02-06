package com.trinity.basemvvm.ui.main.fragment.create_account

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class CreateAccountViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<CreateAccountCallBack>(appDatabase,interactCommon,scheduler) {

    companion object{
        const val ON_CLICK_CREATE_ACCOUNT = 1
        const val ON_CLICK_PROFILE = 2
    }
    fun onClickCreateAccount(){
        uiEventLiveData.value = ON_CLICK_CREATE_ACCOUNT
    }
    fun onCLickProfile(){
        uiEventLiveData.value = ON_CLICK_PROFILE
    }
}