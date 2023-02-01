package com.trinity.basemvvm.ui.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/trinity/basemvvm/ui/base/activity/ViewActivity;", "Lcom/trinity/basemvvm/ui/base/BaseViewUI;", "findFragmentByTag", "Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment;", "tag", "", "onBackParent", "", "onCreateControl", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyControl", "onStartControl", "onStopControl", "setViewRoot", "viewRoot", "Landroid/view/View;", "app_debug"})
public abstract interface ViewActivity extends com.trinity.basemvvm.ui.base.BaseViewUI {
    
    public abstract void onCreateControl(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public abstract void onDestroyControl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trinity.basemvvm.ui.base.fragment.BaseFragment findFragmentByTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    public abstract void setViewRoot(@org.jetbrains.annotations.NotNull()
    android.view.View viewRoot);
    
    public abstract void onBackParent();
    
    public abstract void onStartControl();
    
    public abstract void onStopControl();
}