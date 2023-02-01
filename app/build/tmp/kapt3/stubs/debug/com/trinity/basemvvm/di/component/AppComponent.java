package com.trinity.basemvvm.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/trinity/basemvvm/di/component/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/DaggerApplication;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "context", "Landroid/content/Context;", "inject", "", "application", "Lcom/trinity/basemvvm/common/MVVMApplication;", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "schedule", "Ljava/util/concurrent/Executor;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.trinity.basemvvm.di.model.AppModel.class, dagger.android.AndroidInjectionModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.trinity.basemvvm.di.builder.ActivityBuilderModule.class, com.trinity.basemvvm.di.builder.FragmentBuilderModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<dagger.android.DaggerApplication> {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.MVVMApplication application);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trinity.basemvvm.data.local.AppDatabase appDatabase();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trinity.basemvvm.data.remote.InteractCommon interactCommon();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.concurrent.Executor schedule();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/trinity/basemvvm/di/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/trinity/basemvvm/di/component/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.trinity.basemvvm.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.trinity.basemvvm.di.component.AppComponent build();
    }
}