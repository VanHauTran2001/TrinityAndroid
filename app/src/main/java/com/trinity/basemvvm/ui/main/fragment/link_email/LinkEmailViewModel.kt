package com.trinity.basemvvm.ui.main.fragment.link_email

import com.trinity.basemvvm.data.local.AppDatabase
import com.trinity.basemvvm.data.remote.InteractCommon
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import java.util.concurrent.Executor
import javax.inject.Inject

class LinkEmailViewModel @Inject constructor(
    appDatabase: AppDatabase,
    interactCommon: InteractCommon,
    scheduler: Executor
) : BaseViewModel<LinkEmailCallBack>(appDatabase,interactCommon,scheduler) {

}