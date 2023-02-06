package com.trinity.basemvvm.ui.main.fragment.confirm_email

import android.view.View
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentConfirmEmailBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.fragment.create_account.CreateAccountFragment
import com.trinity.basemvvm.ui.utils.OpenFragmentUtils
import com.trinity.basemvvm.ui.utils.Utils
import okio.Utf8

class ConfirmEmailFragment : BaseMvvmFragment<ConfirmEmailCallBack,ConfirmEmailViewModel>(),ConfirmEmailCallBack {

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
       return R.layout.fragment_confirm_email
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().confirmEmailViewModel = mModel
        mModel.uiEventLiveData.observe(this) {
            when (it) {
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()
                ConfirmEmailViewModel.ON_CLICK_SETTING -> onClickSetting()
            }
        }
        Utils.imgBackLogin!!.visibility = View.GONE
        Utils.title!!.visibility = View.GONE
        Utils.txtBack!!.visibility = View.GONE
    }

    private fun onClickSetting() {
        OpenFragmentUtils.replaceFragmentAddStack(requireActivity().supportFragmentManager,CreateAccountFragment(),CreateAccountFragment.TAG)
    }

    override fun getBindingData() = mBinding as FragmentConfirmEmailBinding

    override fun getViewModel(): Class<ConfirmEmailViewModel> {
        return ConfirmEmailViewModel::class.java
    }
    companion object{
        val TAG = ConfirmEmailFragment::class.java.name
    }
}