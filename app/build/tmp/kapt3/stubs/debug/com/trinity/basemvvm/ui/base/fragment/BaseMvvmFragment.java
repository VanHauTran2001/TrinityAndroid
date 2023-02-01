package com.trinity.basemvvm.ui.base.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH$J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010*\u001a\u00020\u001fH\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006+"}, d2 = {"Lcom/trinity/basemvvm/ui/base/fragment/BaseMvvmFragment;", "CallBack", "Lcom/trinity/basemvvm/ui/base/callback/BaseCallBack;", "Model", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment;", "()V", "mFirstLoad", "", "getMFirstLoad", "()J", "setMFirstLoad", "(J)V", "mModel", "getMModel", "()Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "setMModel", "(Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;)V", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getBindingVariable", "error/NonExistentClass", "()Lerror/NonExistentClass;", "getViewModel", "Ljava/lang/Class;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateViewControl", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreatedControl", "view", "performDataBinding", "app_debug"})
public abstract class BaseMvvmFragment<CallBack extends com.trinity.basemvvm.ui.base.callback.BaseCallBack, Model extends com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel<CallBack>> extends com.trinity.basemvvm.ui.base.fragment.BaseFragment {
    private long mFirstLoad = 0L;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    protected Model mModel;
    
    public BaseMvvmFragment() {
        super();
    }
    
    protected final long getMFirstLoad() {
        return 0L;
    }
    
    protected final void setMFirstLoad(long p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<Model> getViewModel();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateViewControl(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreatedControl(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getBindingVariable() {
        return null;
    }
    
    private final void performDataBinding() {
    }
}