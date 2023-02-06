package com.trinity.basemvvm.ui.main.fragment.confirm_email

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class ConfirmEmailViewModel  @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<ConfirmEmailCallBack>(appDatabase,interactCommon,scheduler) {

    companion object{
        const val ON_CLICK_SETTING = 1
    }
    fun onClickSetting(){
        uiEventLiveData.value = ON_CLICK_SETTING
    }
}