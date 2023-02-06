package com.trinity.basemvvm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.trinity.basemvvm.databinding.ActivityHomeBindingImpl;
import com.trinity.basemvvm.databinding.ActivityLoginBindingImpl;
import com.trinity.basemvvm.databinding.ActivitySplashBindingImpl;
import com.trinity.basemvvm.databinding.FragmentCheckRegisterBindingImpl;
import com.trinity.basemvvm.databinding.FragmentConfirmEmailBindingImpl;
import com.trinity.basemvvm.databinding.FragmentCreateAccountBindingImpl;
import com.trinity.basemvvm.databinding.FragmentLinkEmailBindingImpl;
import com.trinity.basemvvm.databinding.FragmentProfileBindingImpl;
import com.trinity.basemvvm.databinding.FragmentSigninBindingImpl;
import com.trinity.basemvvm.databinding.FragmentSignupBindingImpl;
import com.trinity.basemvvm.databinding.FragmentUserBindingImpl;
import com.trinity.basemvvm.databinding.ItemUserBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_FRAGMENTCHECKREGISTER = 4;

  private static final int LAYOUT_FRAGMENTCONFIRMEMAIL = 5;

  private static final int LAYOUT_FRAGMENTCREATEACCOUNT = 6;

  private static final int LAYOUT_FRAGMENTLINKEMAIL = 7;

  private static final int LAYOUT_FRAGMENTPROFILE = 8;

  private static final int LAYOUT_FRAGMENTSIGNIN = 9;

  private static final int LAYOUT_FRAGMENTSIGNUP = 10;

  private static final int LAYOUT_FRAGMENTUSER = 11;

  private static final int LAYOUT_ITEMUSER = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_check_register, LAYOUT_FRAGMENTCHECKREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_confirm_email, LAYOUT_FRAGMENTCONFIRMEMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_create_account, LAYOUT_FRAGMENTCREATEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_link_email, LAYOUT_FRAGMENTLINKEMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_signin, LAYOUT_FRAGMENTSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_signup, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.fragment_user, LAYOUT_FRAGMENTUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trinity.basemvvm.R.layout.item_user, LAYOUT_ITEMUSER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKREGISTER: {
          if ("layout/fragment_check_register_0".equals(tag)) {
            return new FragmentCheckRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_check_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMEMAIL: {
          if ("layout/fragment_confirm_email_0".equals(tag)) {
            return new FragmentConfirmEmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirm_email is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEACCOUNT: {
          if ("layout/fragment_create_account_0".equals(tag)) {
            return new FragmentCreateAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLINKEMAIL: {
          if ("layout/fragment_link_email_0".equals(tag)) {
            return new FragmentLinkEmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_link_email is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNIN: {
          if ("layout/fragment_signin_0".equals(tag)) {
            return new FragmentSigninBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signin is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_signup_0".equals(tag)) {
            return new FragmentSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSER: {
          if ("layout/fragment_user_0".equals(tag)) {
            return new FragmentUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSER: {
          if ("layout/item_user_0".equals(tag)) {
            return new ItemUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "checkRegisterViewModel");
      sKeys.put(2, "confirmEmailViewModel");
      sKeys.put(3, "createAccountViewModel");
      sKeys.put(4, "homeViewModel");
      sKeys.put(5, "linkEmailViewModel");
      sKeys.put(6, "profileViewModel");
      sKeys.put(7, "signinViewModel");
      sKeys.put(8, "signupViewModel");
      sKeys.put(9, "splashViewModel");
      sKeys.put(10, "user");
      sKeys.put(11, "userViewModel");
      sKeys.put(12, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_home_0", com.trinity.basemvvm.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.trinity.basemvvm.R.layout.activity_login);
      sKeys.put("layout/activity_splash_0", com.trinity.basemvvm.R.layout.activity_splash);
      sKeys.put("layout/fragment_check_register_0", com.trinity.basemvvm.R.layout.fragment_check_register);
      sKeys.put("layout/fragment_confirm_email_0", com.trinity.basemvvm.R.layout.fragment_confirm_email);
      sKeys.put("layout/fragment_create_account_0", com.trinity.basemvvm.R.layout.fragment_create_account);
      sKeys.put("layout/fragment_link_email_0", com.trinity.basemvvm.R.layout.fragment_link_email);
      sKeys.put("layout/fragment_profile_0", com.trinity.basemvvm.R.layout.fragment_profile);
      sKeys.put("layout/fragment_signin_0", com.trinity.basemvvm.R.layout.fragment_signin);
      sKeys.put("layout/fragment_signup_0", com.trinity.basemvvm.R.layout.fragment_signup);
      sKeys.put("layout/fragment_user_0", com.trinity.basemvvm.R.layout.fragment_user);
      sKeys.put("layout/item_user_0", com.trinity.basemvvm.R.layout.item_user);
    }
  }
}
