// Generated by data binding compiler. Do not edit!
package com.trinity.basemvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.ui.main.fragment.user.UserViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUserBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView btnBack;

  @NonNull
  public final LinearLayout lnActionbar;

  @NonNull
  public final RecyclerView rcListUser;

  @NonNull
  public final SwipeRefreshLayout swRefresh;

  @Bindable
  protected UserViewModel mUserViewModel;

  protected FragmentUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView btnBack, LinearLayout lnActionbar, RecyclerView rcListUser,
      SwipeRefreshLayout swRefresh) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.lnActionbar = lnActionbar;
    this.rcListUser = rcListUser;
    this.swRefresh = swRefresh;
  }

  public abstract void setUserViewModel(@Nullable UserViewModel userViewModel);

  @Nullable
  public UserViewModel getUserViewModel() {
    return mUserViewModel;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserBinding>inflateInternal(inflater, R.layout.fragment_user, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserBinding>inflateInternal(inflater, R.layout.fragment_user, null, false, component);
  }

  public static FragmentUserBinding bind(@NonNull View view) {
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
  public static FragmentUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserBinding)bind(component, view, R.layout.fragment_user);
  }
}