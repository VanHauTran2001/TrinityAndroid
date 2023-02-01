package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.activity.splash.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilderModule_ContributeSplashActivity.SplashActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeSplashActivity {
  private ActivityBuilderModule_ContributeSplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashActivity> {}
  }
}
