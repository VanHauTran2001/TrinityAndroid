package com.trinity.basemvvm.ui.utils.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0007J \u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/trinity/basemvvm/ui/utils/permission/SharedPfPermissionUtils;", "", "()V", "SYSTEM_CONFIG", "", "getSYSTEM_CONFIG", "()Ljava/lang/String;", "getNumberDeniedPermission", "", "context", "Landroid/content/Context;", "permissionType", "increaseNumberDeniedPermission", "", "numberIncrease", "saveNumberDeniedPermission", "number", "app_debug"})
public final class SharedPfPermissionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.utils.permission.SharedPfPermissionUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SYSTEM_CONFIG = "SYSTEM_CONFIG";
    
    private SharedPfPermissionUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSYSTEM_CONFIG() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getNumberDeniedPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permissionType) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void increaseNumberDeniedPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permissionType, int numberIncrease) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void saveNumberDeniedPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permissionType, int number) {
    }
}