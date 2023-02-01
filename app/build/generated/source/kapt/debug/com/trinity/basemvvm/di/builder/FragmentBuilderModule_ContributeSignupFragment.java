package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.fragment.signup.SignupFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuilderModule_ContributeSignupFragment.SignupFragmentSubcomponent.class
)
public abstract class FragmentBuilderModule_ContributeSignupFragment {
  private FragmentBuilderModule_ContributeSignupFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignupFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignupFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SignupFragmentSubcomponent extends AndroidInjector<SignupFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignupFragment> {}
  }
}
