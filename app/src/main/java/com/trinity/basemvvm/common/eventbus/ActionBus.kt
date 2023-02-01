package com.trinity.basemvvm.common.eventbus
interface ActionBus<Data> :BaseAction {
    fun call(data: Data)
}