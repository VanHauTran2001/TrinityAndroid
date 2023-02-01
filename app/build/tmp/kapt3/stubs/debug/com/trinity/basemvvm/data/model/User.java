package com.trinity.basemvvm.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "User")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/trinity/basemvvm/data/model/User;", "", "()V", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "firstName", "getFirstName", "setFirstName", "id", "", "getId", "()I", "setId", "(I)V", "lastName", "getLastName", "setLastName", "app_debug"})
public final class User {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "email")
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "first_name")
    @com.google.gson.annotations.SerializedName(value = "first_name")
    private java.lang.String firstName = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "last_name")
    @com.google.gson.annotations.SerializedName(value = "last_name")
    private java.lang.String lastName = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "avatar")
    @com.google.gson.annotations.SerializedName(value = "avatar")
    private java.lang.String avatar = "";
    
    public User() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    public final void setAvatar(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}