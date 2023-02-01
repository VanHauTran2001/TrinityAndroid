package com.trinity.basemvvm.ui.main.activity.home

import android.content.Intent
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.ActivityHomeBinding
import com.trinity.basemvvm.ui.base.activity.BaseMVVMActivity
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.activity.login.LoginActivity

class HomeAcitivty : BaseMVVMActivity<HomeCallBack, HomeViewModel>(), HomeCallBack{

    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.activity_home
    }

    override fun setEvents() {

    }

    override fun initComponents() {
       getBindingData().homeViewModel = mModel
        mModel.uiEventLiveData.observe(this){
            when(it){
                BaseViewModel.FINISH_ACTIVITY -> finish()
            }
        }
        getBindingData().btnLogin.setOnClickListener {
            startActivity(Intent(this@HomeAcitivty,LoginActivity::class.java))
        }
        getBindingData().btnNewAccount.setOnClickListener {
            startActivity(Intent(this@HomeAcitivty,LoginActivity::class.java))
        }
    }

    override fun getBindingData() = mBinding as ActivityHomeBinding

    override fun getViewModel(): Class<HomeViewModel> {
       return HomeViewModel::class.java
    }
}