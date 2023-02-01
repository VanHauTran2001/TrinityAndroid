package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.activity.home.HomeAcitivty;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_ContributeHomeActivity.HomeAcitivtySubcomponent.class)
public abstract class ActivityBuilderModule_ContributeHomeActivity {
  private ActivityBuilderModule_ContributeHomeActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HomeAcitivty.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeAcitivtySubcomponent.Factory builder);

  @Subcomponent
  public interface HomeAcitivtySubcomponent extends AndroidInjector<HomeAcitivty> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeAcitivty> {}
  }
}
