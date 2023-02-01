package com.trinity.basemvvm.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.trinity.basemvvm.data.local.dao.UserDao
import com.trinity.basemvvm.data.model.User

@Database(entities = arrayOf(User::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
//    abstract fun fileDao() : FileDao
    abstract fun userDao() : UserDao
}