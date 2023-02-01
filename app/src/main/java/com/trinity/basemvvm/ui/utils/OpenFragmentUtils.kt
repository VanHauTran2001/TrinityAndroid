package com.trinity.basemvvm.ui.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.trinity.basemvvm.R
import com.trinity.basemvvm.ui.base.AnimationScreen
import com.trinity.basemvvm.ui.base.fragment.BaseFragment
import com.trinity.basemvvm.ui.main.fragment.user.UserFragment


object OpenFragmentUtils {
    @JvmStatic
    fun getAnimationScreenFullOpen(): AnimationScreen {
        return AnimationScreen(
            R.anim.enter_to_left,
            R.anim.exit_to_left,
            R.anim.enter_to_right,
            R.anim.exit_to_right
        )
    }

    @JvmStatic
    fun openUserFragment(manager: FragmentManager) {
        val transaction = manager.beginTransaction()
        BaseFragment.openFragment(
            manager,
            transaction,
            UserFragment::class.java,
            null,
            false,
            true,
            null,
            R.id.content
        )
    }
    fun replaceFragmentAddStack(manager: FragmentManager,fragment : Fragment, tag:String){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.content, fragment)
        transaction.addToBackStack(tag)
        transaction.commit()
    }
    fun replaceFragments(manager: FragmentManager,fragment : Fragment){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.content, fragment)
        transaction.commit()
    }
    fun replaceFragmentRemoveStack(manager: FragmentManager, fragment: Fragment) {
        manager.popBackStackImmediate()
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.content, fragment).addToBackStack(null)
        transaction.commit()
    }
}