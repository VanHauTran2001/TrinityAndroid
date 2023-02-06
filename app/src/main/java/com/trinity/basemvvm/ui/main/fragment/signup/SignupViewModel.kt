package com.trinity.basemvvm.ui.main.fragment.signup

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class SignupViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<SignupCallBack>(appDatabase,interactCommon,scheduler) {

    companion object{
        const val ON_CLICK_SIGNUP = 1
    }
    fun onClickSigup(){
        uiEventLiveData.value = ON_CLICK_SIGNUP
    }
}