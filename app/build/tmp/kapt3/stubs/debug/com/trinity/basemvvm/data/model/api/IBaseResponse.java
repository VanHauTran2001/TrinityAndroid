package com.trinity.basemvvm.data.model.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/data/model/api/IBaseResponse;", "", "getErrorCode", "", "getMsg", "", "getStatus", "app_debug"})
public abstract interface IBaseResponse {
    
    public abstract int getErrorCode();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getMsg();
    
    public abstract int getStatus();
}