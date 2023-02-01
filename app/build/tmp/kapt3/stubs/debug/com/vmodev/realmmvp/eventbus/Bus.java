package com.vmodev.realmmvp.eventbus;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u0002H\bH\u0007\u00a2\u0006\u0002\u0010\fJ$\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004H\u0007J\"\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\b0\u0011J(\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00040\u0011J\"\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\b0\u0011J(\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00040\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/vmodev/realmmvp/eventbus/Bus;", "", "()V", "elementBuses", "", "Lcom/trinity/basemvvm/common/eventbus/ElementBus;", "post", "", "T", "idObjectPost", "", "t", "(Ljava/lang/String;Ljava/lang/Object;)V", "postList", "list", "register", "actionBus", "Lcom/trinity/basemvvm/common/eventbus/ActionBus;", "registerList", "unregister", "unregisterList", "app_debug"})
public final class Bus {
    private final java.util.List<com.trinity.basemvvm.common.eventbus.ElementBus> elementBuses = null;
    
    public Bus() {
        super();
    }
    
    public final <T extends java.lang.Object>void register(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<T> actionBus) {
    }
    
    public final <T extends java.lang.Object>void registerList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<java.util.List<T>> actionBus) {
    }
    
    public final <T extends java.lang.Object>void unregister(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<T> actionBus) {
    }
    
    public final <T extends java.lang.Object>void unregisterList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.common.eventbus.ActionBus<java.util.List<T>> actionBus) {
    }
    
    @androidx.annotation.MainThread()
    public final <T extends java.lang.Object>void post(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, T t) {
    }
    
    @androidx.annotation.MainThread()
    public final <T extends java.lang.Object>void postList(@org.jetbrains.annotations.NotNull()
    java.lang.String idObjectPost, @org.jetbrains.annotations.NotNull()
    java.util.List<T> list) {
    }
}