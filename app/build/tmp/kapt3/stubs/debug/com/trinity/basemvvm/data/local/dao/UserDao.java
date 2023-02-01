package com.trinity.basemvvm.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004H\'\u00a8\u0006\r"}, d2 = {"Lcom/trinity/basemvvm/data/local/dao/UserDao;", "", "findAll", "", "Lcom/trinity/basemvvm/data/model/User;", "findUserById", "userId", "", "insertListUser", "", "item", "insertUser", "", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User WHERE User.id=:userId")
    public abstract com.trinity.basemvvm.data.model.User findUserById(int userId);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insertUser(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.data.model.User item);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertListUser(@org.jetbrains.annotations.NotNull()
    java.util.List<com.trinity.basemvvm.data.model.User> item);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User")
    public abstract java.util.List<com.trinity.basemvvm.data.model.User> findAll();
}