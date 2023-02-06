package com.trinity.basemvvm.ui.main.fragment.check_register

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class CheckRegisterViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<CheckRegisterCallBack>(appDatabase,interactCommon,scheduler) {
    companion object{
        const val ON_CLICK_OPEN_EMAIL = 1
    }
    fun onClickOpenEmail(){
        uiEventLiveData.value = ON_CLICK_OPEN_EMAIL
    }
}