package com.trinity.basemvvm.databinding;
import com.trinity.basemvvm.R;
import com.trinity.basemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserBindingImpl extends FragmentUserBinding implements com.trinity.basemvvm.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ln_actionbar, 2);
        sViewsWithIds.put(R.id.btn_back, 3);
        sViewsWithIds.put(R.id.rc_list_user, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.swRefresh.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.trinity.basemvvm.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.userViewModel == variableId) {
            setUserViewModel((com.trinity.basemvvm.ui.main.fragment.user.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserViewModel(@Nullable com.trinity.basemvvm.ui.main.fragment.user.UserViewModel UserViewModel) {
        this.mUserViewModel = UserViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserViewModelMIsRefreshing((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserViewModelMIsRefreshing(androidx.databinding.ObservableBoolean UserViewModelMIsRefreshing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.databinding.ObservableBoolean userViewModelMIsRefreshing = null;
        com.trinity.basemvvm.ui.main.fragment.user.UserViewModel userViewModel = mUserViewModel;
        boolean userViewModelMIsRefreshingGet = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (userViewModel != null) {
                    // read userViewModel.mIsRefreshing
                    userViewModelMIsRefreshing = userViewModel.getMIsRefreshing();
                }
                updateRegistration(0, userViewModelMIsRefreshing);


                if (userViewModelMIsRefreshing != null) {
                    // read userViewModel.mIsRefreshing.get()
                    userViewModelMIsRefreshingGet = userViewModelMIsRefreshing.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.swRefresh.setRefreshing(userViewModelMIsRefreshingGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.swRefresh.setOnRefreshListener(mCallback9);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // userViewModel
        com.trinity.basemvvm.ui.main.fragment.user.UserViewModel userViewModel = mUserViewModel;
        // userViewModel != null
        boolean userViewModelJavaLangObjectNull = false;



        userViewModelJavaLangObjectNull = (userViewModel) != (null);
        if (userViewModelJavaLangObjectNull) {


            userViewModel.onRefresh();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userViewModel.mIsRefreshing
        flag 1 (0x2L): userViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}