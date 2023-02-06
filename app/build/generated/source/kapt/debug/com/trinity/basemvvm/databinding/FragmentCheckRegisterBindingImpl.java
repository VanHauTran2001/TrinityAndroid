package com.trinity.basemvvm.databinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckRegisterBindingImpl extends FragmentCheckRegisterBinding implements com.trinity.basemvvm.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentCheckRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            );
        this.btnOpenEmail.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.trinity.basemvvm.generated.callback.OnClickListener(this, 1);
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
        if (BR.checkRegisterViewModel == variableId) {
            setCheckRegisterViewModel((com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckRegisterViewModel(@Nullable com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel CheckRegisterViewModel) {
        this.mCheckRegisterViewModel = CheckRegisterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.checkRegisterViewModel);
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
        com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel checkRegisterViewModel = mCheckRegisterViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnOpenEmail.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // checkRegisterViewModel != null
        boolean checkRegisterViewModelJavaLangObjectNull = false;
        // checkRegisterViewModel
        com.trinity.basemvvm.ui.main.fragment.check_register.CheckRegisterViewModel checkRegisterViewModel = mCheckRegisterViewModel;



        checkRegisterViewModelJavaLangObjectNull = (checkRegisterViewModel) != (null);
        if (checkRegisterViewModelJavaLangObjectNull) {


            checkRegisterViewModel.onClickOpenEmail();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): checkRegisterViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}