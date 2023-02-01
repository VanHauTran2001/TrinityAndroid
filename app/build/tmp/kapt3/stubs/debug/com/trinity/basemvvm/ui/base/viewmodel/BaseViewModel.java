package com.trinity.basemvvm.ui.base.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\b&\u0018\u0000 <*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001<B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010&\u001a\u00020\u001cJ\u0016\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0*H\u0004J\b\u0010+\u001a\u00020(H\u0014J\u000e\u0010,\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001aJJ\u0010-\u001a\u00020(\"\b\b\u0001\u0010.*\u00020/2\u000e\u00100\u001a\n\u0012\u0004\u0012\u0002H.\u0018\u0001012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020(032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(03H\u0004JH\u00106\u001a\u0004\u0018\u000107\"\u0004\b\u0001\u0010.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u0002H.\u0018\u0001012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020(032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(03H\u0004JR\u00108\u001a\u00020(\"\u0010\b\u0001\u0010.*\n\u0012\u0006\b\u0001\u0012\u00020/092\u000e\u00100\u001a\n\u0012\u0004\u0012\u0002H.\u0018\u0001012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020(032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(03H\u0004JH\u0010:\u001a\u0004\u0018\u000107\"\u0004\b\u0001\u0010.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u0002H.\u0018\u0001012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020(032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(03H\u0004JF\u0010;\u001a\u00020(\"\u0004\b\u0001\u0010.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u0002H.\u0018\u0001012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020(032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(03H\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006="}, d2 = {"Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "CallBack", "Lcom/trinity/basemvvm/ui/base/callback/BaseCallBack;", "Landroidx/lifecycle/ViewModel;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "schedulers", "Ljava/util/concurrent/Executor;", "(Lcom/trinity/basemvvm/data/local/AppDatabase;Lcom/trinity/basemvvm/data/remote/InteractCommon;Ljava/util/concurrent/Executor;)V", "getAppDatabase", "()Lcom/trinity/basemvvm/data/local/AppDatabase;", "callBack", "Ljava/lang/ref/WeakReference;", "getCallBack", "()Ljava/lang/ref/WeakReference;", "setCallBack", "(Ljava/lang/ref/WeakReference;)V", "getInteractCommon", "()Lcom/trinity/basemvvm/data/remote/InteractCommon;", "mDiableAll", "Lio/reactivex/disposables/CompositeDisposable;", "getMDiableAll", "()Lio/reactivex/disposables/CompositeDisposable;", "mIsDestroy", "", "mIsLoading", "Landroidx/databinding/ObservableBoolean;", "getMIsLoading", "()Landroidx/databinding/ObservableBoolean;", "getSchedulers", "()Ljava/util/concurrent/Executor;", "uiEventLiveData", "Lcom/trinity/basemvvm/ui/base/SingleLiveData;", "", "getUiEventLiveData", "()Lcom/trinity/basemvvm/ui/base/SingleLiveData;", "isLoading", "makeFunOnOtherThread", "", "method", "Lkotlin/Function0;", "onCleared", "setIsLoading", "subscribeHasDispose", "T", "Lcom/trinity/basemvvm/data/model/api/IBaseResponse;", "observable", "Lio/reactivex/Observable;", "onNext", "Lkotlin/Function1;", "onError", "", "subscribeHasResultDispose", "Lio/reactivex/disposables/Disposable;", "subscribeListHasDispose", "", "subscribeListHasResultDispose", "subscribeNotDispose", "Companion", "app_debug"})
public abstract class BaseViewModel<CallBack extends com.trinity.basemvvm.ui.base.callback.BaseCallBack> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.trinity.basemvvm.data.local.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.trinity.basemvvm.data.remote.InteractCommon interactCommon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Executor schedulers = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<CallBack> callBack;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable mDiableAll = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean mIsLoading = null;
    private boolean mIsDestroy;
    @org.jetbrains.annotations.NotNull()
    private final com.trinity.basemvvm.ui.base.SingleLiveData<java.lang.Integer> uiEventLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel.Companion Companion = null;
    public static final int SHOW_TOAST = -2;
    public static final int FINISH_ACTIVITY = -1;
    public static final int BACK = 0;
    public static final int SHOW_ERROR = 1;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.trinity.basemvvm.data.local.AppDatabase getAppDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.trinity.basemvvm.data.remote.InteractCommon getInteractCommon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.Executor getSchedulers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<CallBack> getCallBack() {
        return null;
    }
    
    public final void setCallBack(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<CallBack> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getMDiableAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.databinding.ObservableBoolean getMIsLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.ui.base.SingleLiveData<java.lang.Integer> getUiEventLiveData() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.local.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.remote.InteractCommon interactCommon, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor schedulers) {
        super();
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    public final void setIsLoading(boolean isLoading) {
    }
    
    protected final <T extends com.trinity.basemvvm.data.model.api.IBaseResponse>void subscribeHasDispose(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    protected final <T extends java.util.List<? extends com.trinity.basemvvm.data.model.api.IBaseResponse>>void subscribeListHasDispose(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>io.reactivex.disposables.Disposable subscribeListHasResultDispose(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    protected final <T extends java.lang.Object>void subscribeNotDispose(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>io.reactivex.disposables.Disposable subscribeHasResultDispose(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        return null;
    }
    
    protected final void makeFunOnOtherThread(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> method) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel$Companion;", "", "()V", "BACK", "", "FINISH_ACTIVITY", "SHOW_ERROR", "SHOW_TOAST", "checkExpire", "", "data", "Lcom/trinity/basemvvm/data/model/api/IBaseResponse;", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean checkExpire(@org.jetbrains.annotations.NotNull()
        com.trinity.basemvvm.data.model.api.IBaseResponse data) {
            return false;
        }
        
        public final boolean checkExpire(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable data) {
            return false;
        }
    }
}