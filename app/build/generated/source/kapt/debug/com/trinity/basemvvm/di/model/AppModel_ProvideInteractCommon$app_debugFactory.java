// Generated by Dagger (https://dagger.dev).
package com.trinity.basemvvm.di.model;

import com.trinity.basemvvm.data.remote.InteractCommon;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModel_ProvideInteractCommon$app_debugFactory implements Factory<InteractCommon> {
  private final AppModel module;

  public AppModel_ProvideInteractCommon$app_debugFactory(AppModel module) {
    this.module = module;
  }

  @Override
  public InteractCommon get() {
    return provideInteractCommon$app_debug(module);
  }

  public static AppModel_ProvideInteractCommon$app_debugFactory create(AppModel module) {
    return new AppModel_ProvideInteractCommon$app_debugFactory(module);
  }

  public static InteractCommon provideInteractCommon$app_debug(AppModel instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideInteractCommon$app_debug());
  }
}