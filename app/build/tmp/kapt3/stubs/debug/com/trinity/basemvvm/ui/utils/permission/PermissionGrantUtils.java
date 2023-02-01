package com.trinity.basemvvm.ui.utils.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0007\u00a2\u0006\u0002\u0010\u000fJ3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007\u00a2\u0006\u0002\u0010\u0015J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007\u00a2\u0006\u0002\u0010\u0018J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0003J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0003\u00a8\u0006\u001b"}, d2 = {"Lcom/trinity/basemvvm/ui/utils/permission/PermissionGrantUtils;", "", "()V", "checkPermissionFinish", "", "activity", "Landroid/app/Activity;", "pernissions", "", "", "granted", "", "(Landroid/app/Activity;[Ljava/lang/String;[I)Z", "checkPermissionOnResult", "permissions", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "checkPermissionReadWriteExternalStore", "perCheck", "requestCode", "", "backCancelancelIf", "(Landroid/app/Activity;[Ljava/lang/String;IZ)Z", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;IZ)Z", "showDialogConfirmOpenSetting", "", "app_debug"})
public final class PermissionGrantUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.utils.permission.PermissionGrantUtils INSTANCE = null;
    
    private PermissionGrantUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionReadWriteExternalStore(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int requestCode, boolean backCancelancelIf) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionReadWriteExternalStore(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode, boolean backCancelancelIf) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionReadWriteExternalStore(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] perCheck, int requestCode, boolean backCancelancelIf) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionReadWriteExternalStore(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String[] perCheck, int requestCode, boolean backCancelancelIf) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    private static final void showDialogConfirmOpenSetting(androidx.fragment.app.Fragment fragment, int requestCode, boolean backCancelancelIf) {
    }
    
    @kotlin.jvm.JvmStatic()
    private static final void showDialogConfirmOpenSetting(android.app.Activity activity, int requestCode, boolean backCancelancelIf) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionFinish(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] pernissions, @org.jetbrains.annotations.NotNull()
    int[] granted) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean checkPermissionOnResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
}