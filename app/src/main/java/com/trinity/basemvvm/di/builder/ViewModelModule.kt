package com.trinity.basemvvm.di.builder

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.trinity.basemvvm.di.model.ViewModelFactory
import com.trinity.basemvvm.di.model.ViewModelKey
import com.trinity.basemvvm.ui.main.activity.login.LoginViewModel
import com.trinity.basemvvm.ui.main.activity.home.HomeViewModel
import com.trinity.basemvvm.ui.main.activity.splash.SplashViewModel
import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel
import com.trinity.basemvvm.ui.main.fragment.confirm_email.ConfirmEmailViewModel
import com.trinity.basemvvm.ui.main.fragment.create_account.CreateAccountViewModel
import com.trinity.basemvvm.ui.main.fragment.link_email.LinkEmailViewModel
import com.trinity.basemvvm.ui.main.fragment.profile.ProfileViewModel
import com.trinity.basemvvm.ui.main.fragment.signin.SigninViewModel
import com.trinity.basemvvm.ui.main.fragment.signup.SignupViewModel
import com.trinity.basemvvm.ui.main.fragment.user.UserViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindsLoginViewModel(loginViewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindsSplashViewModel(splashViewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindsHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun bindsUserViewModel(userViewModel: UserViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignupViewModel::class)
    abstract fun bindsSignupViewModel(signupViewModel: SignupViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SigninViewModel::class)
    abstract fun bindsSigninViewModel(signinViewModel: SigninViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CheckRegisterViewModel::class)
    abstract fun bindsCheckRegisterViewModel(checkRegisterViewModel: CheckRegisterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ConfirmEmailViewModel::class)
    abstract fun bindsConfirmEmailViewModel(confirmEmailViewModel: ConfirmEmailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CreateAccountViewModel::class)
    abstract fun bindsCreateAccountViewModel(createAccountViewModel: CreateAccountViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LinkEmailViewModel::class)
    abstract fun bindsLinkEmailViewModel(linkEmailViewModel: LinkEmailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindsProfileViewModel(profileViewModel: ProfileViewModel): ViewModel

    @Binds
    abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}