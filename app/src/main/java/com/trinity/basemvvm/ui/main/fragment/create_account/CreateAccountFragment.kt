package com.trinity.basemvvm.ui.main.fragment.create_account

import android.view.View
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentCreateAccountBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.fragment.link_email.LinkEmailFragment
import com.trinity.basemvvm.ui.main.fragment.profile.ProfileFragment
import com.trinity.basemvvm.ui.utils.OpenFragmentUtils
import com.trinity.basemvvm.ui.utils.Utils

class CreateAccountFragment : BaseMvvmFragment<CreateAccountCallBack,CreateAccountViewModel>(),CreateAccountCallBack {

    override fun error(id: String, error: Throwable) {
      showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.fragment_create_account
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().createAccountViewModel = mModel
        mModel.uiEventLiveData.observe(this){
            when(it){
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()
                CreateAccountViewModel.ON_CLICK_CREATE_ACCOUNT -> onClickCreateAccount()
                CreateAccountViewModel.ON_CLICK_PROFILE -> onClickProfile()
            }
        }
        Utils.imgBackLogin!!.visibility = View.VISIBLE
        Utils.title!!.visibility = View.VISIBLE
        Utils.txtBack!!.visibility = View.VISIBLE
        Utils.title!!.text = getString(R.string.txtTitleAcount)
    }

    private fun onClickProfile() {
        OpenFragmentUtils.replaceFragmentAddStack(requireActivity().supportFragmentManager,ProfileFragment(),ProfileFragment.TAG)
    }

    private fun onClickCreateAccount() {
        OpenFragmentUtils.replaceFragmentAddStack(requireActivity().supportFragmentManager,LinkEmailFragment(),LinkEmailFragment.TAG)
    }

    override fun getBindingData() = mBinding as FragmentCreateAccountBinding

    override fun getViewModel(): Class<CreateAccountViewModel> {
       return CreateAccountViewModel::class.java
    }
    companion object{
        val TAG = CreateAccountFragment::class.java.name
    }
}