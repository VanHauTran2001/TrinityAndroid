package com.trinity.basemvvm.ui.main.fragment.check_register

import android.view.View
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentCheckRegisterBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.fragment.confirm_email.ConfirmEmailFragment
import com.trinity.basemvvm.ui.utils.OpenFragmentUtils
import com.trinity.basemvvm.ui.utils.Utils

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
                CheckRegisterViewModel.ON_CLICK_OPEN_EMAIL -> onClickOpenEmail()
            }
        }
        Utils.imgBackLogin!!.visibility = View.VISIBLE
        Utils.title!!.visibility = View.VISIBLE
        Utils.txtBack!!.visibility = View.VISIBLE
        Utils.title!!.text = getString(R.string.txtSignup)
    }

    private fun onClickOpenEmail() {
        OpenFragmentUtils.replaceFragmentAddStack(requireActivity().supportFragmentManager,ConfirmEmailFragment(),ConfirmEmailFragment.TAG)
    }

    override fun getBindingData() = mBinding as FragmentCheckRegisterBinding

    override fun getViewModel(): Class<CheckRegisterViewModel> {
        return CheckRegisterViewModel::class.java
    }
    companion object{
        val TAG = CheckRegisterFragment::class.java.name
    }
}