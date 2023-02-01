package com.trinity.basemvvm.ui.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u0006H\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\fH\u0016J\u0006\u0010)\u001a\u00020*J\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\u0006J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\u0012\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0012\u00101\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00102\u001a\u00020\u0006H\u0004J\b\u00103\u001a\u00020\u0006H\u0016J\b\u00104\u001a\u00020\u0006H\u0004J\b\u00105\u001a\u00020\u0006H\u0016J-\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\'0:2\u0006\u0010;\u001a\u00020<H\u0016\u00a2\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0006H\u0004J\b\u0010?\u001a\u00020\u0006H\u0016J\b\u0010@\u001a\u00020\u0006H\u0004J\b\u0010A\u001a\u00020\u0006H\u0016J\b\u0010B\u001a\u00020\u0006H\u0004J\b\u0010C\u001a\u00020\u0006H\u0016J\u0006\u0010D\u001a\u00020EJ\u0010\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020 H\u0016J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010I\u001a\u000208H\u0016J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\'H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u0018R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/trinity/basemvvm/ui/base/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/trinity/basemvvm/ui/base/activity/ViewActivity;", "()V", "actionWhenResume", "Lkotlin/Function0;", "", "getActionWhenResume", "()Lkotlin/jvm/functions/Function0;", "setActionWhenResume", "(Lkotlin/jvm/functions/Function0;)V", "isDestroyView", "", "()Z", "isVisibleView", "mBinding", "Landroidx/databinding/ViewDataBinding;", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "mIsClearMemoryActivity", "getMIsClearMemoryActivity", "setMIsClearMemoryActivity", "(Z)V", "mIsDestroyView", "getMIsDestroyView", "setMIsDestroyView", "mIsStarted", "getMIsStarted", "setMIsStarted", "mViewRoot", "Landroid/view/View;", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "beforLoadUI", "findFragmentByTag", "Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment;", "tag", "", "hideKeyBoard", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "onBackParent", "onBackPressed", "onBackRoot", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateControl", "onDestroy", "onDestroyControl", "onPause", "onPauseControl", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onResumeControl", "onStart", "onStartControl", "onStop", "onStopControl", "schedule", "Ljava/util/concurrent/Executor;", "setViewRoot", "viewRoot", "showMessage", "messageId", "message", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.trinity.basemvvm.ui.base.activity.ViewActivity {
    private boolean mIsClearMemoryActivity = false;
    private boolean mIsDestroyView = true;
    private android.view.View mViewRoot;
    private boolean mIsStarted = false;
    protected androidx.databinding.ViewDataBinding mBinding;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> actionWhenResume;
    private boolean isVisibleView = false;
    
    public BaseActivity() {
        super();
    }
    
    protected final boolean getMIsClearMemoryActivity() {
        return false;
    }
    
    protected final void setMIsClearMemoryActivity(boolean p0) {
    }
    
    protected final boolean getMIsDestroyView() {
        return false;
    }
    
    protected final void setMIsDestroyView(boolean p0) {
    }
    
    protected final boolean getMIsStarted() {
        return false;
    }
    
    protected final void setMIsStarted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.databinding.ViewDataBinding getMBinding() {
        return null;
    }
    
    protected final void setMBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.jvm.functions.Function0<kotlin.Unit> getActionWhenResume() {
        return null;
    }
    
    protected final void setActionWhenResume(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateControl(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected final void beforLoadUI() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trinity.basemvvm.ui.base.fragment.BaseFragment findFragmentByTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    @java.lang.Override()
    public void setViewRoot(@org.jetbrains.annotations.NotNull()
    android.view.View viewRoot) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showMessage(int messageId) {
    }
    
    @java.lang.Override()
    public final void onBackParent() {
    }
    
    @java.lang.Override()
    public void onBackRoot() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected final void onResume() {
    }
    
    @java.lang.Override()
    public void onResumeControl() {
    }
    
    @java.lang.Override()
    protected final void onPause() {
    }
    
    public final boolean isVisibleView() {
        return false;
    }
    
    @java.lang.Override()
    public void onPauseControl() {
    }
    
    @java.lang.Override()
    public boolean hideKeyBoard() {
        return false;
    }
    
    @java.lang.Override()
    protected final void onStart() {
    }
    
    @java.lang.Override()
    public void onStartControl() {
    }
    
    @java.lang.Override()
    protected final void onStop() {
    }
    
    @java.lang.Override()
    public void onStopControl() {
    }
    
    @java.lang.Override()
    protected final void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDestroyControl() {
    }
    
    @java.lang.Override()
    public boolean isDestroyView() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.data.local.AppDatabase appDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinity.basemvvm.data.remote.InteractCommon interactCommon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor schedule() {
        return null;
    }
}