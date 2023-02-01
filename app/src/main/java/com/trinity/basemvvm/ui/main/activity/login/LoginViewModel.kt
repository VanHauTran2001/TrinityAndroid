package com.trinity.basemvvm.ui.main.activity.login

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.activity.login.LoginCallBack
import java.util.concurrent.Executor
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<LoginCallBack>(appDatabase, interactCommon, scheduler) {

   init {

   }
}