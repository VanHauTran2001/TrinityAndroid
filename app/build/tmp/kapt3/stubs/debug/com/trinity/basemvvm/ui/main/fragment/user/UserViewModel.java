package com.trinity.basemvvm.ui.main.fragment.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118F\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserViewModel;", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserCallBack;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "scheduler", "Ljava/util/concurrent/Executor;", "(Lcom/trinity/basemvvm/data/local/AppDatabase;Lcom/trinity/basemvvm/data/remote/InteractCommon;Ljava/util/concurrent/Executor;)V", "api", "Lcom/trinity/basemvvm/data/remote/ApiUser;", "mIsRefreshing", "Landroidx/databinding/ObservableBoolean;", "getMIsRefreshing", "()Landroidx/databinding/ObservableBoolean;", "obUsers", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/trinity/basemvvm/data/model/User;", "getObUsers", "()Landroidx/lifecycle/MutableLiveData;", "getAllUserOffline", "", "getUsers", "Lio/reactivex/disposables/Disposable;", "onRefresh", "app_debug"})
public final class UserViewModel extends com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel<com.trinity.basemvvm.ui.main.fragment.user.UserCallBack> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean mIsRefreshing = null;
    private final com.trinity.basemvvm.data.remote.ApiUser api = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.trinity.basemvvm.data.model.User>> obUsers = null;
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.local.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.remote.InteractCommon interactCommon, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor scheduler) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getMIsRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.trinity.basemvvm.data.model.User>> getObUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable getUsers() {
        return null;
    }
    
    public final void getAllUserOffline() {
    }
    
    public final void onRefresh() {
    }
}