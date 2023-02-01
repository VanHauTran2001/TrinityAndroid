package com.trinity.basemvvm.ui.base.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0006J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\fH\u0016J\u0006\u0010&\u001a\u00020\'J\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010(\u001a\u00020\u0006H\u0016J\"\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0011H\u0016J$\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105J&\u00106\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00107\u001a\u00020\u0006H\u0016J\b\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\fH\u0016J\u0006\u0010;\u001a\u00020\u0006J\b\u0010<\u001a\u00020\u0006H\u0016J\u0006\u0010=\u001a\u00020\u0006J\b\u0010>\u001a\u00020\u0006H\u0016J\u0018\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105J\u001a\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u000205H\u0016J\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0011J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0011H\u0016J\u0010\u0010H\u001a\u00020\u00062\u0006\u0010J\u001a\u00020KH\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001f\u00a8\u0006M"}, d2 = {"Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/trinity/basemvvm/ui/base/fragment/ViewFragment;", "()V", "actionWhenResume", "Lkotlin/Function0;", "", "getActionWhenResume", "()Lkotlin/jvm/functions/Function0;", "setActionWhenResume", "(Lkotlin/jvm/functions/Function0;)V", "isDestroyView", "", "()Z", "isResume", "isVisibleView", "mAnimationContinueId", "", "getMAnimationContinueId", "()I", "setMAnimationContinueId", "(I)V", "mBinding", "Landroidx/databinding/ViewDataBinding;", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "mIsDestroyView", "getMIsDestroyView", "setMIsDestroyView", "(Z)V", "appDatabase", "Lcom/trinity/basemvvm/data/local/AppDatabase;", "finishActivity", "getBaseActivity", "Lcom/trinity/basemvvm/ui/base/activity/BaseActivity;", "hideKeyBoard", "interactCommon", "Lcom/trinity/basemvvm/data/remote/InteractCommon;", "onBackRoot", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateViewControl", "onDestroyView", "onDestroyViewControl", "onHiddenChanged", "hidden", "onPause", "onPauseControl", "onResume", "onResumeControl", "onViewCreated", "view", "onViewCreatedControl", "reload", "bundle", "schedule", "Ljava/util/concurrent/Executor;", "setAnimationContinueId", "runAnimationContitue", "showMessage", "messageId", "message", "", "Companion", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.trinity.basemvvm.ui.base.fragment.ViewFragment {
    private boolean mIsDestroyView = true;
    private int mAnimationContinueId = 0;
    private boolean isResume = false;
    private boolean isVisibleView = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> actionWhenResume;
    protected androidx.databinding.ViewDataBinding mBinding;
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.base.fragment.BaseFragment.Companion Companion = null;
    
    public BaseFragment() {
        super();
    }
    
    protected final boolean getMIsDestroyView() {
        return false;
    }
    
    protected final void setMIsDestroyView(boolean p0) {
    }
    
    protected final int getMAnimationContinueId() {
        return 0;
    }
    
    protected final void setMAnimationContinueId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.jvm.functions.Function0<kotlin.Unit> getActionWhenResume() {
        return null;
    }
    
    protected final void setActionWhenResume(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.databinding.ViewDataBinding getMBinding() {
        return null;
    }
    
    protected final void setMBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateViewControl(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public final void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreatedControl(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setAnimationContinueId(int runAnimationContitue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.animation.Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }
    
    @java.lang.Override()
    public void showMessage(int messageId) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public final void onResume() {
    }
    
    @java.lang.Override()
    public void onResumeControl() {
    }
    
    @java.lang.Override()
    public final void onPause() {
    }
    
    @java.lang.Override()
    public void onPauseControl() {
    }
    
    public final boolean isVisibleView() {
        return false;
    }
    
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroyViewControl() {
    }
    
    @java.lang.Override()
    public boolean hideKeyBoard() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trinity.basemvvm.ui.base.activity.BaseActivity getBaseActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void reload(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onBackRoot() {
    }
    
    @java.lang.Override()
    public boolean isDestroyView() {
        return false;
    }
    
    public final void finishActivity() {
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
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final androidx.fragment.app.Fragment openFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends com.trinity.basemvvm.ui.base.fragment.BaseFragment> clazz, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, boolean hasAddbackstack, boolean hasCommitTransaction, @org.jetbrains.annotations.Nullable()
    com.trinity.basemvvm.ui.base.AnimationScreen animations, int fragmentContent) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void openFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.base.fragment.BaseFragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, boolean hasAddbackstack, boolean hasCommitTransaction, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.base.AnimationScreen animations, int fragmentContent) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void hideFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.base.AnimationScreen animations, boolean hasAddBackstack, boolean hasCommit, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void removeFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.base.AnimationScreen animations, boolean hasAddBackStack, boolean hasCommit, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.trinity.basemvvm.ui.base.fragment.BaseFragment getCurrentFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007JJ\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007JV\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J8\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u00a8\u0006!"}, d2 = {"Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment$Companion;", "", "()V", "getCurrentFragment", "Lcom/trinity/basemvvm/ui/base/fragment/BaseFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "hideFragment", "", "manager", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "animations", "Lcom/trinity/basemvvm/ui/base/AnimationScreen;", "hasAddBackstack", "", "hasCommit", "tag", "", "openFragment", "fragment", "bundle", "Landroid/os/Bundle;", "hasAddbackstack", "hasCommitTransaction", "fragmentContent", "", "Landroidx/fragment/app/Fragment;", "clazz", "Ljava/lang/Class;", "removeFragment", "hasAddBackStack", "setAnimationFragment", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final androidx.fragment.app.Fragment openFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
        java.lang.Class<? extends com.trinity.basemvvm.ui.base.fragment.BaseFragment> clazz, @org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle, boolean hasAddbackstack, boolean hasCommitTransaction, @org.jetbrains.annotations.Nullable()
        com.trinity.basemvvm.ui.base.AnimationScreen animations, int fragmentContent) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void openFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
        com.trinity.basemvvm.ui.base.fragment.BaseFragment fragment, @org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle, boolean hasAddbackstack, boolean hasCommitTransaction, @org.jetbrains.annotations.NotNull()
        com.trinity.basemvvm.ui.base.AnimationScreen animations, int fragmentContent) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void hideFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
        com.trinity.basemvvm.ui.base.AnimationScreen animations, boolean hasAddBackstack, boolean hasCommit, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void removeFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.NotNull()
        com.trinity.basemvvm.ui.base.AnimationScreen animations, boolean hasAddBackStack, boolean hasCommit, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
        
        private final void setAnimationFragment(androidx.fragment.app.FragmentTransaction transaction, com.trinity.basemvvm.ui.base.AnimationScreen animations) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.trinity.basemvvm.ui.base.fragment.BaseFragment getCurrentFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
            return null;
        }
    }
}