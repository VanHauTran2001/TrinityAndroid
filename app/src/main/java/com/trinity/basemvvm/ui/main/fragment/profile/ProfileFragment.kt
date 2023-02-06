package com.trinity.basemvvm.ui.main.fragment.profile

import android.view.View
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentProfileBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.utils.Utils

class ProfileFragment : BaseMvvmFragment<ProfileCallBack,ProfileViewModel>(),ProfileCallBack {
    private var checkBirthday = 1
    private var checkWeight = 2
    private var checkSex = 3
    private var checkHand = 4
    private var check = 0
    override fun error(id: String, error: Throwable) {
       showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.fragment_profile
    }

    override fun setEvents() {

    }

    override fun initComponents() {
       getBindingData().profileViewModel = mModel
       mModel.uiEventLiveData.observe(this){
           when(it){
               BaseViewModel.FINISH_ACTIVITY -> finishActivity()
               ProfileViewModel.ON_CLICK_NEXT -> onClickNext()
           }
       }
        Utils.title!!.text = getString(R.string.titleprofile)
    }

    private fun onClickNext() {
//        check++
//        if (check ==checkBirthday){
//            getBindingData().txtTitle.text = getString(R.string.txtBirthday)
//            getBindingData().edtBirthday.visibility = View.VISIBLE
//            getBindingData().edtNickName.visibility = View.GONE
//        }else if (check == checkWeight){
//            getBindingData().txtTitle.text = getString(R.string.txtWeight)
//            getBindingData().edtBirthday.visibility = View.GONE
//            getBindingData().edtNickName.visibility = View.GONE
//            getBindingData().edtWeight.visibility = View.VISIBLE
//        }
    }

    override fun getBindingData() = mBinding as FragmentProfileBinding

    override fun getViewModel(): Class<ProfileViewModel> {
        return ProfileViewModel::class.java
    }
    companion object{
        val TAG = ProfileFragment::class.java.name
    }
}