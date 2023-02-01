package com.trinity.basemvvm.ui.base.callback

import com.trinity.basemvvm.ui.base.BaseViewUI


interface BaseCallBack : BaseViewUI {
    fun error(id: String, error: Throwable)
}