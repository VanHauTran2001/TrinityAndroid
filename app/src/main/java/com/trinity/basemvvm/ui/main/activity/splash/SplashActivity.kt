package com.trinity.basemvvm.ui.main.activity.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Handler
import com.trinity.basemvvm.R
import com.trinity.basemvvm.databinding.ActivitySplashBinding
import com.trinity.basemvvm.ui.base.activity.BaseMVVMActivity
import com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel
import com.trinity.basemvvm.ui.main.activity.home.HomeAcitivty

@SuppressLint("CustomSplashScreen")
class SplashActivity :BaseMVVMActivity<SplashCallBack,SplashViewModel>(),SplashCallBack {
    override fun error(id: String, error: Throwable) {
        showMessage(error.message!!)
    }

    override fun getLayoutMain(): Int {
        return R.layout.activity_splash
    }

    override fun setEvents() {

    }

    override fun initComponents() {
        getBindingData().splashViewModel = mModel
        mModel.uiEventLiveData.observe(this) {
            when (it) {
                BaseViewModel.FINISH_ACTIVITY -> finish()
            }
        }
    }

    override fun getBindingData() = mBinding as ActivitySplashBinding

    override fun getViewModel(): Class<SplashViewModel> {
       return SplashViewModel::class.java
    }
    override fun onResumeControl() {
        super.onResumeControl()
        val handler = Handler()
        handler.postDelayed(Runnable {
            navigateToHomeScreen()
        }, 2000)
    }

    private fun navigateToHomeScreen() {
        startActivity(Intent(this@SplashActivity,HomeAcitivty::class.java))
    }
}