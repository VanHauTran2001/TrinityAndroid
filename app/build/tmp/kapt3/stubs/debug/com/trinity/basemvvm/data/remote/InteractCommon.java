package com.trinity.basemvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\t\u00a2\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u000fJ\"\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\u0012J(\u0010\u0013\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000f0\u0012J\"\u0010\u0014\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\u0012J(\u0010\u0015\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000f0\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/trinity/basemvvm/data/remote/InteractCommon;", "", "()V", "apiUser", "Lcom/trinity/basemvvm/data/remote/ApiUser;", "bus", "Lcom/vmodev/realmmvp/eventbus/Bus;", "post", "", "T", "idObjectPost", "", "t", "(Ljava/lang/String;Ljava/lang/Object;)V", "postList", "", "register", "action", "Lcom/trinity/basemvvm/common/eventbus/ActionBus;", "registerList", "unregister", "unregisterList", "app_debug"})
public final class InteractCommon {
    private final com.trinity.basemvvm.data.remote.ApiUser apiUser = null;
    private final com.vmodev.realmmvp.eventbus.Bus bus = null;
    
    public InteractCommon() {
        super();
    }
    
    public final <T extends java.lang.Object>void register(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<T> action) {
    }
    
    public final <T extends java.lang.Object>void registerList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<java.util.List<T>> action) {
    }
    
    public final <T extends java.lang.Object>void unregister(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<T> action) {
    }
    
    public final <T extends java.lang.Object>void unregisterList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<java.util.List<T>> action) {
    }
    
    public final <T extends java.lang.Object>void post(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, T t) {
    }
    
    public final <T extends java.lang.Object>void postList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    java.util.List<T> t) {
    }
}