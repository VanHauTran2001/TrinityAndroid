package com.trinity.basemvvm.ui.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0016J/\u0010#\u001a\u00020$\"\u0004\b\u0002\u0010%2\u0006\u0010&\u001a\u0002H%2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020$0(H\u0004\u00a2\u0006\u0002\u0010)J\u000b\u0010*\u001a\u00020+\u00a2\u0006\u0002\u0010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010.H$J\u0012\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020$H\u0002R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00063"}, d2 = {"Lcom/trinity/basemvvm/ui/base/activity/BaseMVVMActivity;", "CallBack", "Lcom/trinity/basemvvm/ui/base/callback/BaseCallBack;", "Model", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "Lcom/trinity/basemvvm/ui/base/activity/BaseActivity;", "Ldagger/android/HasAndroidInjector;", "()V", "fragmentAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getFragmentAndroidInjector$app_debug", "()Ldagger/android/DispatchingAndroidInjector;", "setFragmentAndroidInjector$app_debug", "(Ldagger/android/DispatchingAndroidInjector;)V", "mFirstLoad", "", "getMFirstLoad", "()J", "setMFirstLoad", "(J)V", "mModel", "getMModel", "()Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "setMModel", "(Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;)V", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "androidInjector", "Ldagger/android/AndroidInjector;", "finishLoad", "", "T", "t", "action", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getBindingVariable", "error/NonExistentClass", "()Lerror/NonExistentClass;", "getViewModel", "Ljava/lang/Class;", "onCreateControl", "savedInstanceState", "Landroid/os/Bundle;", "performDataBinding", "app_debug"})
public abstract class BaseMVVMActivity<CallBack extends com.trinity.basemvvm.ui.base.callback.BaseCallBack, Model extends com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel<CallBack>> extends com.trinity.basemvvm.ui.base.activity.BaseActivity implements dagger.android.HasAndroidInjector {
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> fragmentAndroidInjector;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    protected Model mModel;
    private long mFirstLoad = 0L;
    
    public BaseMVVMActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getFragmentAndroidInjector$app_debug() {
        return null;
    }
    
    public final void setFragmentAndroidInjector$app_debug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final Model getMModel() {
        return null;
    }
    
    protected final void setMModel(@org.jetbrains.annotations.NotNull()
    Model p0) {
    }
    
    protected final long getMFirstLoad() {
        return 0L;
    }
    
    protected final void setMFirstLoad(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<Model> getViewModel();
    
    @java.lang.Override()
    public void onCreateControl(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getBindingVariable() {
        return null;
    }
    
    private final void performDataBinding() {
    }
    
    protected final <T extends java.lang.Object>void finishLoad(T t, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
}