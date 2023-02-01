package com.trinity.basemvvm.databinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserBindingImpl extends ItemUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivUserAvatar.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.user == variableId) {
            setUser((com.trinity.basemvvm.data.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.trinity.basemvvm.data.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userEmail = null;
        java.lang.String userAvatar = null;
        java.lang.String userFirstName = null;
        com.trinity.basemvvm.data.model.User user = mUser;
        java.lang.String userLastName = null;
        java.lang.String userFirstNameChar = null;
        java.lang.String userFirstNameCharUserLastName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.avatar
                    userAvatar = user.getAvatar();
                    // read user.firstName
                    userFirstName = user.getFirstName();
                    // read user.lastName
                    userLastName = user.getLastName();
                }


                // read (user.firstName) + (' ')
                userFirstNameChar = (userFirstName) + (' ');


                // read ((user.firstName) + (' ')) + (user.lastName)
                userFirstNameCharUserLastName = (userFirstNameChar) + (userLastName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.trinity.basemvvm.ui.utils.LoadDataBinding.setUrlImage(this.ivUserAvatar, userAvatar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, userFirstNameCharUserLastName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}