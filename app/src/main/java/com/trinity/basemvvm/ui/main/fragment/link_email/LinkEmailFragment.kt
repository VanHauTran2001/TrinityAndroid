package com.trinity.basemvvm.ui.main.fragment.link_email

import android.view.View
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.FragmentLinkEmailBinding
import com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.utils.Utils

class LinkEmailFragment : BaseMvvmFragment<LinkEmailCallBack,LinkEmailViewModel>(),LinkEmailCallBack {

    override fun error(id: String, error: Throwable) {
       showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.fragment_link_email
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().linkEmailViewModel = mModel
        mModel.uiEventLiveData.observe(this){
            when(it){
                BaseViewModel.FINISH_ACTIVITY -> finishActivity()
            }
        }
        Utils.title!!.text = getString(R.string.txtSignup)
    }

    override fun getBindingData() = mBinding as FragmentLinkEmailBinding

    override fun getViewModel(): Class<LinkEmailViewModel> {
         return LinkEmailViewModel::class.java
    }
    companion object{
        val TAG = LinkEmailFragment::class.java.name
    }
}