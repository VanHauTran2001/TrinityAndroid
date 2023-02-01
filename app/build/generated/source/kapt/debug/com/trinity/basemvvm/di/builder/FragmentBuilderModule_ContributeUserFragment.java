package com.trinity.basemvvm.di.builder;

import com.trinity.basemvvm.ui.main.fragment.user.UserFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBuilderModule_ContributeUserFragment.UserFragmentSubcomponent.class)
public abstract class FragmentBuilderModule_ContributeUserFragment {
  private FragmentBuilderModule_ContributeUserFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UserFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UserFragmentSubcomponent extends AndroidInjector<UserFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UserFragment> {}
  }
}
