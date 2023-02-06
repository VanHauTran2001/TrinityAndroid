package com.trinity.basemvvm.ui.main.fragment.signin

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class SigninViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<SigninCallBack>(appDatabase,interactCommon,scheduler) {

    companion object{
        const val ON_CLICK_SIGNIN = 1
    }
    fun onClickSigin(){
        uiEventLiveData.value = ON_CLICK_SIGNIN
    }
}