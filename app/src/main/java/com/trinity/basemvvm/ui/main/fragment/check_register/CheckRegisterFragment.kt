package com.trinity.basemvvm.ui.main.fragment.check_register

import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentCheckRegisterBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel

class CheckRegisterFragment : BaseMvvmFragment<CheckRegisterCallBack,CheckRegisterViewModel>(),CheckRegisterCallBack {

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.fragment_check_register
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().checkRegisterViewModel = mModel
        mModel.uiEventLiveData.observe(this) {
            when (it) {
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()
            }
        }
    }

    override fun getBindingData() = mBinding as FragmentCheckRegisterBinding

    override fun getViewModel(): Class<CheckRegisterViewModel> {
        return CheckRegisterViewModel::class.java
    }
    companion object{
        val TAG = CheckRegisterFragment::class.java.name
    }
}