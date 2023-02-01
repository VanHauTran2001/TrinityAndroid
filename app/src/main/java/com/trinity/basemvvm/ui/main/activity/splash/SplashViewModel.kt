package com.trinity.basemvvm.ui.main.activity.splash

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class SplashViewModel @Inject constructor(appDatabase: AppDatabase,
                                          interactCommon: InteractCommon,
                                          scheduler: Executor
) : BaseViewModel<SplashCallBack>(appDatabase,interactCommon,scheduler){
}