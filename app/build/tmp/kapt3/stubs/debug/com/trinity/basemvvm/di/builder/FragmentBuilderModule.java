package com.trinity.basemvvm.di.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/trinity/basemvvm/di/builder/FragmentBuilderModule;", "", "()V", "contributeCheckRegisterFragment", "Lcom/trinity/basemvvm/ui/main/fragment/check_register/CheckRegisterFragment;", "contributeConfirmEmailFragment", "Lcom/trinity/basemvvm/ui/main/fragment/confirm_email/ConfirmEmailFragment;", "contributeCreateAccountFragment", "Lcom/trinity/basemvvm/ui/main/fragment/create_account/CreateAccountFragment;", "contributeLinkEmailFragment", "Lcom/trinity/basemvvm/ui/main/fragment/link_email/LinkEmailFragment;", "contributeProfileFragment", "Lcom/trinity/basemvvm/ui/main/fragment/profile/ProfileFragment;", "contributeSignINFragment", "Lcom/trinity/basemvvm/ui/main/fragment/signin/SigninFragment;", "contributeSignupFragment", "Lcom/trinity/basemvvm/ui/main/fragment/signup/SignupFragment;", "contributeUserFragment", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuilderModule {
    
    public FragmentBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.user.UserFragment contributeUserFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.signup.SignupFragment contributeSignupFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.signin.SigninFragment contributeSignINFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterFragment contributeCheckRegisterFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.confirm_email.ConfirmEmailFragment contributeConfirmEmailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.create_account.CreateAccountFragment contributeCreateAccountFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.link_email.LinkEmailFragment contributeLinkEmailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.trinity.basemvvm.ui.main.fragment.profile.ProfileFragment contributeProfileFragment();
}