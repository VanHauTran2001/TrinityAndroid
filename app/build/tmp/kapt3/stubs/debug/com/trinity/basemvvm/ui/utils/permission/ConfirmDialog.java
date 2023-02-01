package com.trinity.basemvvm.ui.utils.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000eB\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "resContent", "", "interf", "Lcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;", "(Landroid/content/Context;ILcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;)V", "content", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;)V", "themeResId", "(Landroid/content/Context;IILcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;)V", "(Landroid/content/Context;ILjava/lang/String;Lcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;)V", "mInterf", "inits", "", "onClick", "view", "Landroid/view/View;", "IConfirmDialog", "app_debug"})
public final class ConfirmDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private com.trinity.basemvvm.ui.utils.permission.ConfirmDialog.IConfirmDialog mInterf;
    
    public ConfirmDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.StringRes()
    int resContent, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.utils.permission.ConfirmDialog.IConfirmDialog interf) {
        super(null);
    }
    
    public ConfirmDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.utils.permission.ConfirmDialog.IConfirmDialog interf) {
        super(null);
    }
    
    public ConfirmDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int themeResId, @androidx.annotation.StringRes()
    int resContent, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.utils.permission.ConfirmDialog.IConfirmDialog interf) {
        super(null);
    }
    
    public ConfirmDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int themeResId, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.utils.permission.ConfirmDialog.IConfirmDialog interf) {
        super(null);
    }
    
    private final void inits(java.lang.String content) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/trinity/basemvvm/ui/utils/permission/ConfirmDialog$IConfirmDialog;", "", "onClickCancel", "", "onClickOk", "app_debug"})
    public static abstract interface IConfirmDialog {
        
        public abstract void onClickCancel();
        
        public abstract void onClickOk();
    }
}