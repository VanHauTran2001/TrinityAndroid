package com.trinity.basemvvm.di.builder

import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterFragment
import com.trinity.basemvvm.ui.main.fragment.signin.SigninFragment
import com.trinity.basemvvm.ui.main.fragment.signup.SignupFragment
import com.trinity.basemvvm.ui.main.fragment.user.UserFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeUserFragment(): UserFragment
    @ContributesAndroidInjector
    abstract fun contributeSignupFragment() : SignupFragment
    @ContributesAndroidInjector
    abstract fun contributeSignINFragment() : SigninFragment
    @ContributesAndroidInjector
    abstract fun contributeCheckRegisterFragment() : CheckRegisterFragment
}