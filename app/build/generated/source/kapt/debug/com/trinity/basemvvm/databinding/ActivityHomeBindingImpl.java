package com.trinity.basemvvm.databinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding implements com.trinity.basemvvm.generated.callback.OnClickListener.Listener {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            );
        this.btnLogin.setTag(null);
        this.btnNewAccount.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.trinity.basemvvm.generated.callback.OnClickListener(this, 1);
        mCallback6 = new com.trinity.basemvvm.generated.callback.OnClickListener(this, 2);
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
        if (BR.homeViewModel == variableId) {
            setHomeViewModel((com.trinity.basemvvm.ui.main.activity.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeViewModel(@Nullable com.trinity.basemvvm.ui.main.activity.home.HomeViewModel HomeViewModel) {
        this.mHomeViewModel = HomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.homeViewModel);
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
        com.trinity.basemvvm.ui.main.activity.home.HomeViewModel homeViewModel = mHomeViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback6);
            this.btnNewAccount.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // homeViewModel != null
                boolean homeViewModelJavaLangObjectNull = false;
                // homeViewModel
                com.trinity.basemvvm.ui.main.activity.home.HomeViewModel homeViewModel = mHomeViewModel;



                homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
                if (homeViewModelJavaLangObjectNull) {


                    homeViewModel.onClickLogin();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // homeViewModel != null
                boolean homeViewModelJavaLangObjectNull = false;
                // homeViewModel
                com.trinity.basemvvm.ui.main.activity.home.HomeViewModel homeViewModel = mHomeViewModel;



                homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
                if (homeViewModelJavaLangObjectNull) {


                    homeViewModel.onClickNewAccount();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}