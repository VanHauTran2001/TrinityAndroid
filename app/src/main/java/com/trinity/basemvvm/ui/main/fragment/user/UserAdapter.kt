package com.trinity.basemvvm.ui.main.fragment.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trinity.basemvvm.data.model.User
import com.trinity.basemvvm.databinding.ItemUserBinding

class UserAdapter(private val inter: IUserAdapter) :
    RecyclerView.Adapter<UserAdapter.Companion.UserViewHolder>() {

    companion object {
        class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)
    }

    interface IUserAdapter {
        fun count(): Int
        fun getData(position: Int): User
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.user = inter.getData(position)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return inter.count()
    }
}