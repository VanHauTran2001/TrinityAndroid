package com.trinity.basemvvm.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0006\u0010\u001c\u001a\u00020\u001dR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/trinity/basemvvm/common/MVVMApplication;", "Landroidx/multidex/MultiDexApplication;", "Ldagger/android/HasAndroidInjector;", "()V", "androidDispatchingInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidDispatchingInjector$app_debug", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidDispatchingInjector$app_debug", "(Ldagger/android/DispatchingAndroidInjector;)V", "appComponent", "Lcom/trinity/basemvvm/di/component/AppComponent;", "getAppComponent", "()Lcom/trinity/basemvvm/di/component/AppComponent;", "setAppComponent", "(Lcom/trinity/basemvvm/di/component/AppComponent;)V", "androidInjector", "Ldagger/android/AndroidInjector;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "attachBaseContext", "", "base", "Landroid/content/Context;", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "onCreate", "schedule", "Ljava/util/concurrent/Executor;", "app_debug"})
public final class MVVMApplication extends androidx.multidex.MultiDexApplication implements dagger.android.HasAndroidInjector {
    public com.trinity.basemvvm.di.component.AppComponent appComponent;
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidDispatchingInjector;
    
    public MVVMApplication() {
        super();
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.di.component.AppComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.di.component.AppComponent getAppComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidDispatchingInjector$app_debug() {
        return null;
    }
    
    public final void setAndroidDispatchingInjector$app_debug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.data.local.AppDatabase appDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.data.remote.InteractCommon interactCommon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor schedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
}