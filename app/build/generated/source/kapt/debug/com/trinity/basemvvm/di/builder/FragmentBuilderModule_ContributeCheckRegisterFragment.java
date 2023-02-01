package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuilderModule_ContributeCheckRegisterFragment.CheckRegisterFragmentSubcomponent.class
)
public abstract class FragmentBuilderModule_ContributeCheckRegisterFragment {
  private FragmentBuilderModule_ContributeCheckRegisterFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CheckRegisterFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CheckRegisterFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CheckRegisterFragmentSubcomponent
      extends AndroidInjector<CheckRegisterFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CheckRegisterFragment> {}
  }
}
