// Generated by data binding compiler. Do not edit!
package com.trinity.basemvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCheckRegisterBinding extends ViewDataBinding {
  @NonNull
  public final Button btnOpenEmail;

  @Bindable
  protected CheckRegisterViewModel mCheckRegisterViewModel;

  protected FragmentCheckRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnOpenEmail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnOpenEmail = btnOpenEmail;
  }

  public abstract void setCheckRegisterViewModel(
      @Nullable CheckRegisterViewModel checkRegisterViewModel);

  @Nullable
  public CheckRegisterViewModel getCheckRegisterViewModel() {
    return mCheckRegisterViewModel;
  }

  @NonNull
  public static FragmentCheckRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_check_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCheckRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCheckRegisterBinding>inflateInternal(inflater, R.layout.fragment_check_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCheckRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_check_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCheckRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCheckRegisterBinding>inflateInternal(inflater, R.layout.fragment_check_register, null, false, component);
  }

  public static FragmentCheckRegisterBinding bind(@NonNull View view) {
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
  public static FragmentCheckRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCheckRegisterBinding)bind(component, view, R.layout.fragment_check_register);
  }
}
