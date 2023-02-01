package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.fragment.signin.SigninFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuilderModule_ContributeSignINFragment.SigninFragmentSubcomponent.class
)
public abstract class FragmentBuilderModule_ContributeSignINFragment {
  private FragmentBuilderModule_ContributeSignINFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SigninFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SigninFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SigninFragmentSubcomponent extends AndroidInjector<SigninFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SigninFragment> {}
  }
}
