package com.trinity.basemvvm.di.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/trinity/basemvvm/di/model/AppModel;", "", "()V", "provideAppDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "application", "Landroid/app/Application;", "provideAppDatabase$app_debug", "provideContext", "Landroid/content/Context;", "provideContext$app_debug", "provideInteractCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "provideInteractCommon$app_debug", "provideSchedule", "Ljava/util/concurrent/Executor;", "provideSchedule$app_debug", "app_debug"})
@dagger.Module(includes = {com.trinity.basemvvm.di.builder.ViewModelModule.class})
public final class AppModel {
    
    public AppModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.trinity.basemvvm.data.local.AppDatabase provideAppDatabase$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.trinity.basemvvm.data.remote.InteractCommon provideInteractCommon$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.util.concurrent.Executor provideSchedule$app_debug() {
        return null;
    }
}