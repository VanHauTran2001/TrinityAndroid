package com.trinity.basemvvm.ui.main.fragment.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$Companion$UserViewHolder;", "inter", "Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$IUserAdapter;", "(Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$IUserAdapter;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "IUserAdapter", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.Companion.UserViewHolder> {
    private final com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.IUserAdapter inter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.Companion Companion = null;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.IUserAdapter inter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.Companion.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.trinity.basemvvm.ui.main.fragment.user.UserAdapter.Companion.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$IUserAdapter;", "", "count", "", "getData", "Lcom/trinity/basemvvm/data/model/User;", "position", "app_debug"})
    public static abstract interface IUserAdapter {
        
        public abstract int count();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.trinity.basemvvm.data.model.User getData(int position);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$Companion;", "", "()V", "UserViewHolder", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/trinity/basemvvm/ui/main/fragment/user/UserAdapter$Companion$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/trinity/basemvvm/databinding/ItemUserBinding;", "(Lcom/trinity/basemvvm/databinding/ItemUserBinding;)V", "getBinding", "()Lcom/trinity/basemvvm/databinding/ItemUserBinding;", "app_debug"})
        public static final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final com.trinity.basemvvm.databinding.ItemUserBinding binding = null;
            
            public UserViewHolder(@org.jetbrains.annotations.NotNull()
            com.trinity.basemvvm.databinding.ItemUserBinding binding) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.trinity.basemvvm.databinding.ItemUserBinding getBinding() {
                return null;
            }
        }
    }
}