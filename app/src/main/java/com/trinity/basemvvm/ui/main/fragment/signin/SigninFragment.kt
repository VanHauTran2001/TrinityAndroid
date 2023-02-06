package com.trinity.basemvvm.ui.main.fragment.signin

import androidx.databinding.ViewDataBinding
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentSigninBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel

class SigninFragment : BaseMvvmFragment<SigninCallBack,SigninViewModel>(),SigninCallBack {

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
       return R.layout.fragment_signin
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().signinViewModel = mModel
        mModel.uiEventLiveData.observe(this){
            when(it){
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()

            }
        }
    }

    override fun getBindingData() = mBinding as FragmentSigninBinding

    override fun getViewModel(): Class<SigninViewModel> {
        return SigninViewModel::class.java
    }
}