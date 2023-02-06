package com.trinity.basemvvm.ui.main.fragment.profile

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class ProfileViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<ProfileCallBack>(appDatabase,interactCommon,scheduler) {
    companion object{
        const val ON_CLICK_NEXT = 1
    }
    fun onClickNext(){
        uiEventLiveData.value = ON_CLICK_NEXT
    }
}