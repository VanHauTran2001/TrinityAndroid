// Generated by data binding compiler. Do not edit!
package com.trinity.basemvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.ui.main.fragment.signin.SigninViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSigninBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSignin;

  @NonNull
  public final ImageView imgGoolge;

  @Bindable
  protected SigninViewModel mSigninViewModel;

  protected FragmentSigninBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSignin, ImageView imgGoolge) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSignin = btnSignin;
    this.imgGoolge = imgGoolge;
  }

  public abstract void setSigninViewModel(@Nullable SigninViewModel signinViewModel);

  @Nullable
  public SigninViewModel getSigninViewModel() {
    return mSigninViewModel;
  }

  @NonNull
  public static FragmentSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signin, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSigninBinding>inflateInternal(inflater, R.layout.fragment_signin, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signin, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSigninBinding>inflateInternal(inflater, R.layout.fragment_signin, null, false, component);
  }

  public static FragmentSigninBinding bind(@NonNull View view) {
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
  public static FragmentSigninBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSigninBinding)bind(component, view, R.layout.fragment_signin);
  }
}
