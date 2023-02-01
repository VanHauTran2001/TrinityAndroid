package com.trinity.basemvvm.ui.main.fragment.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0014J\b\u0010\u0015\u001a\u00020\tH\u0017J\b\u0010\u0016\u001a\u00020\tH\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserFragment;", "Lcom/trinity/basemvvm/ui/base/fragment/BaseMvvmFragment;", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserCallBack;", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserViewModel;", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$IUserAdapter;", "()V", "count", "", "error", "", "id", "", "", "getBindingData", "Lcom/trinity/basemvvm/databinding/FragmentUserBinding;", "getData", "Lcom/trinity/basemvvm/data/model/User;", "position", "getLayoutMain", "getViewModel", "Ljava/lang/Class;", "initComponents", "setEvents", "app_debug"})
public final class UserFragment extends com.trinity.basemvvm.ui.base.fragment.BaseMvvmFragment<com.trinity.basemvvm.ui.main.fragment.user.UserCallBack, com.trinity.basemvvm.ui.main.fragment.user.UserViewModel> implements com.trinity.basemvvm.ui.main.fragment.user.UserCallBack, com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.IUserAdapter {
    
    public UserFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutMain() {
        return 0;
    }
    
    @java.lang.Override()
    public void setEvents() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void initComponents() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trinity.basemvvm.databinding.FragmentUserBinding getBindingData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.trinity.basemvvm.ui.main.fragment.user.UserViewModel> getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trinity.basemvvm.data.model.User getData(int position) {
        return null;
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
}