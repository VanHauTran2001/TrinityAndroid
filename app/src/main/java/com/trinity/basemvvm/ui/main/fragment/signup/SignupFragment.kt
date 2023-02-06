package com.trinity.basemvvm.ui.main.fragment.signup
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentSignupBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterFragment
import com.trinity.basemvvm.ui.utils.OpenFragmentUtils
import com.trinity.basemvvm.ui.utils.Utils

class SignupFragment : BaseMvvmFragment<SignupCallBack,SignupViewModel>(),SignupCallBack {

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
      return R.layout.fragment_signup
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().signupViewModel = mModel
        mModel.uiEventLiveData.observe(this){
            when(it){
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()
                SignupViewModel.ON_CLICK_SIGNUP -> onClickSignup()
            }
        }
    }

    private fun onClickSignup() {
        OpenFragmentUtils.replaceFragmentAddStack(requireActivity().supportFragmentManager,CheckRegisterFragment(),CheckRegisterFragment.TAG)
    }

    override fun getBindingData() = mBinding as FragmentSignupBinding

    override fun getViewModel(): Class<SignupViewModel> {
        return SignupViewModel::class.java
    }
    companion object{
        val TAG = SignupFragment::class.java.name
    }
}