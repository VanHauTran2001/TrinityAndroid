package com.trinity.basemvvm.di.builder

import com.trinity.basemvvm.ui.main.activity.login.LoginActivity
import com.trinity.basemvvm.ui.main.activity.home.HomeAcitivty
import com.trinity.basemvvm.ui.main.activity.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): LoginActivity
    @ContributesAndroidInjector
    abstract fun contributeSplashActivity():SplashActivity
    @ContributesAndroidInjector
    abstract fun contributeHomeActivity():HomeAcitivty
}