package com.trinity.basemvvm.ui.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trinity.basemvvm.ui.base.BaseViewUI
import com.trinity.basemvvm.ui.base.activity.BaseActivity


interface ViewFragment : BaseViewUI {
    fun onCreateViewControl(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View

    fun onViewCreatedControl(view: View, savedInstanceState: Bundle?)

    fun onDestroyViewControl()

    fun reload(bundle: Bundle)

    fun getBaseActivity(): BaseActivity
}