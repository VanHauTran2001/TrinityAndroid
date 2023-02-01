package com.trinity.basemvvm.common.eventbus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/common/eventbus/ActionBus;", "Data", "Lcom/trinity/basemvvm/common/eventbus/BaseAction;", "call", "", "data", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface ActionBus<Data extends java.lang.Object> extends com.trinity.basemvvm.common.eventbus.BaseAction {
    
    public abstract void call(Data data);
}