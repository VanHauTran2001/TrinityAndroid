package com.trinity.basemvvm.ui.base.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/ui/base/callback/BaseCallBack;", "Lcom/trinity/basemvvm/ui/base/BaseViewUI;", "error", "", "id", "", "", "app_debug"})
public abstract interface BaseCallBack extends com.trinity.basemvvm.ui.base.BaseViewUI {
    
    public abstract void error(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable error);
}