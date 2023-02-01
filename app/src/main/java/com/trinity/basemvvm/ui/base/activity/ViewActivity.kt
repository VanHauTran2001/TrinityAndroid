package com.trinity.basemvvm.ui.base.activity

import android.os.Bundle
import android.view.View
import com.trinity.basemvvm.ui.base.BaseViewUI
import com.trinity.basemvvm.ui.base.fragment.BaseFragment


interface ViewActivity : BaseViewUI{

    fun onCreateControl(savedInstanceState: Bundle?)

    fun onDestroyControl()

    fun findFragmentByTag(tag: String): BaseFragment

    fun setViewRoot(viewRoot: View)

    fun onBackParent()

    fun onStartControl()

    fun onStopControl()
}