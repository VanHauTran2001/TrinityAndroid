// Generated by data binding compiler. Do not edit!
package com.trinity.basemvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.ui.main.activity.splash.SplashViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySplashBinding extends ViewDataBinding {
  @Bindable
  protected SplashViewModel mSplashViewModel;

  protected ActivitySplashBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setSplashViewModel(@Nullable SplashViewModel splashViewModel);

  @Nullable
  public SplashViewModel getSplashViewModel() {
    return mSplashViewModel;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, null, false, component);
  }

  public static ActivitySplashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySplashBinding)bind(component, view, R.layout.activity_splash);
  }
}
