package com.trinity.basemvvm.ui.main.fragment.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\r"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/signin/SigninViewModel;", "Lcom/trinity/basemvvm/ui/base/viewmodel/BaseViewModel;", "Lcom/trinity/basemvvm/ui/main/fragment/signin/SigninCallBack;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "scheduler", "Ljava/util/concurrent/Executor;", "(Lcom/trinity/basemvvm/data/local/AppDatabase;Lcom/trinity/basemvvm/data/remote/InteractCommon;Ljava/util/concurrent/Executor;)V", "onClickSigin", "", "Companion", "app_debug"})
public final class SigninViewModel extends com.trinity.basemvvm.ui.base.viewmodel.BaseViewModel<com.trinity.basemvvm.ui.main.fragment.signin.SigninCallBack> {
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.main.fragment.signin.SigninViewModel.Companion Companion = null;
    public static final int ON_CLICK_SIGNIN = 1;
    
    @javax.inject.Inject()
    public SigninViewModel(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.local.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.remote.InteractCommon interactCommon, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor scheduler) {
        super(null, null, null);
    }
    
    public final void onClickSigin() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/signin/SigninViewModel$Companion;", "", "()V", "ON_CLICK_SIGNIN", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}