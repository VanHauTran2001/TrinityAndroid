package com.trinity.basemvvm.ui.main.activity.login

import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.ActivityLoginBinding
import com.trinity.basemvvm.ui.base.activity.BaseMVVMActivity
import com.trinity.basemvvm.ui.main.fragment.signup.SignupFragment
import com.trinity.basemvvm.ui.utils.OpenFragmentUtils
import com.trinity.basemvvm.ui.utils.Utils

class LoginActivity : BaseMVVMActivity<LoginCallBack, LoginViewModel>(), LoginCallBack {

    override fun getLayoutMain() = R.layout.activity_login

    override fun setEvents() {
    }

    override fun initComponents() {
        getBindingData().viewModel = mModel
        Utils.title = getBindingData().txtTitleLogin
        Utils.txtBack = getBindingData().txtBack
        Utils.imgBackLogin = getBindingData().imgBack
        OpenFragmentUtils.replaceFragments(supportFragmentManager,SignupFragment())
    }

    override fun getViewModel(): Class<LoginViewModel> {
        return LoginViewModel::class.java
    }

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getBindingData() = mBinding as ActivityLoginBinding

}