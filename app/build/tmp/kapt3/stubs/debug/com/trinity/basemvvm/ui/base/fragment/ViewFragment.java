package com.trinity.basemvvm.ui.base.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH&\u00a8\u0006\u0012"}, d2 = {"Lcom/trinity/basemvvm/ui/base/fragment/ViewFragment;", "Lcom/trinity/basemvvm/ui/base/BaseViewUI;", "getBaseActivity", "Lcom/trinity/basemvvm/ui/base/activity/BaseActivity;", "onCreateViewControl", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyViewControl", "", "onViewCreatedControl", "view", "reload", "bundle", "app_debug"})
public abstract interface ViewFragment extends com.trinity.basemvvm.ui.base.BaseViewUI {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View onCreateViewControl(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public abstract void onViewCreatedControl(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public abstract void onDestroyViewControl();
    
    public abstract void reload(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trinity.basemvvm.ui.base.activity.BaseActivity getBaseActivity();
}