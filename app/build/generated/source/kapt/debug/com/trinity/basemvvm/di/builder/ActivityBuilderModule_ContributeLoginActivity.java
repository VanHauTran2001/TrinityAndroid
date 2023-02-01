package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.activity.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilderModule_ContributeLoginActivity.LoginActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeLoginActivity {
  private ActivityBuilderModule_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginActivity> {}
  }
}
