package com.trinity.basemvvm.di.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/trinity/basemvvm/di/builder/ViewModelModule;", "", "()V", "bindsCheckRegisterViewModel", "Landroidx/lifecycle/ViewModel;", "checkRegisterViewModel", "Lcom/trinity/basemvvm/ui/main/fragment/check_register/CheckRegisterViewModel;", "bindsHomeViewModel", "homeViewModel", "Lcom/trinity/basemvvm/ui/main/activity/home/HomeViewModel;", "bindsLoginViewModel", "loginViewModel", "Lcom/trinity/basemvvm/ui/main/activity/login/LoginViewModel;", "bindsSigninViewModel", "signinViewModel", "Lcom/trinity/basemvvm/ui/main/fragment/signin/SigninViewModel;", "bindsSignupViewModel", "signupViewModel", "Lcom/trinity/basemvvm/ui/main/fragment/signup/SignupViewModel;", "bindsSplashViewModel", "splashViewModel", "Lcom/trinity/basemvvm/ui/main/activity/splash/SplashViewModel;", "bindsUserViewModel", "userViewModel", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserViewModel;", "bindsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/trinity/basemvvm/di/model/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.activity.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsLoginViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.activity.login.LoginViewModel loginViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.activity.splash.SplashViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsSplashViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.activity.splash.SplashViewModel splashViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.activity.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.activity.home.HomeViewModel homeViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.fragment.user.UserViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsUserViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.user.UserViewModel userViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.fragment.signup.SignupViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsSignupViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.signup.SignupViewModel signupViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.fragment.signin.SigninViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsSigninViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.signin.SigninViewModel signinViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.trinity.basemvvm.di.model.ViewModelKey(value = com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsCheckRegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel checkRegisterViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.di.model.ViewModelFactory viewModelFactory);
}