package com.trinity.basemvvm.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/trinity/basemvvm/ui/base/BaseViewUI;", "", "isDestroyView", "", "()Z", "getBindingData", "Landroidx/databinding/ViewDataBinding;", "getLayoutMain", "", "hideKeyBoard", "initComponents", "", "onBackRoot", "onPauseControl", "onResumeControl", "setEvents", "showMessage", "messageId", "message", "", "app_debug"})
public abstract interface BaseViewUI {
    
    public abstract int getLayoutMain();
    
    public abstract void setEvents();
    
    public abstract void initComponents();
    
    public abstract void onBackRoot();
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showMessage(int messageId);
    
    public abstract boolean isDestroyView();
    
    public abstract void onResumeControl();
    
    public abstract void onPauseControl();
    
    public abstract boolean hideKeyBoard();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ViewDataBinding getBindingData();
}