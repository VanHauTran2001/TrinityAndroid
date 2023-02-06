package com.trinity.basemvvm.di.builder

import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterFragment
import com.trinity.basemvvm.ui.main.fragment.confirm_email.ConfirmEmailFragment
import com.trinity.basemvvm.ui.main.fragment.create_account.CreateAccountFragment
import com.trinity.basemvvm.ui.main.fragment.link_email.LinkEmailFragment
import com.trinity.basemvvm.ui.main.fragment.profile.ProfileFragment
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
    @ContributesAndroidInjector
    abstract fun contributeConfirmEmailFragment() : ConfirmEmailFragment
    @ContributesAndroidInjector
    abstract fun contributeCreateAccountFragment() : CreateAccountFragment
    @ContributesAndroidInjector
    abstract fun contributeLinkEmailFragment() : LinkEmailFragment
    @ContributesAndroidInjector
    abstract fun contributeProfileFragment() : ProfileFragment
}