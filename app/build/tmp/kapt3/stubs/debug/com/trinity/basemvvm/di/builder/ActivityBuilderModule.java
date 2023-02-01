package com.trinity.basemvvm.di.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/trinity/basemvvm/di/builder/ActivityBuilderModule;", "", "()V", "contributeHomeActivity", "Lcom/trinity/basemvvm/ui/main/activity/home/HomeAcitivty;", "contributeLoginActivity", "Lcom/trinity/basemvvm/ui/main/activity/login/LoginActivity;", "contributeSplashActivity", "Lcom/trinity/basemvvm/ui/main/activity/splash/SplashActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilderModule {
    
    public ActivityBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.activity.login.LoginActivity contributeLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.activity.splash.SplashActivity contributeSplashActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.activity.home.HomeAcitivty contributeHomeActivity();
}