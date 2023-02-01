package com.trinity.basemvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/data/remote/ApiUser;", "", "getUsers", "Lio/reactivex/Observable;", "Lcom/trinity/basemvvm/data/model/api/UserResponse;", "", "Lcom/trinity/basemvvm/data/model/User;", "app_debug"})
public abstract interface ApiUser {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/users")
    public abstract io.reactivex.Observable<com.trinity.basemvvm.data.model.api.UserResponse<java.util.List<com.trinity.basemvvm.data.model.User>>> getUsers();
}