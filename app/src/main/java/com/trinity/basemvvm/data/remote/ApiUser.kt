package com.trinity.basemvvm.data.remote

import com.trinity.basemvvm.data.model.User
import com.trinity.basemvvm.data.model.api.UserResponse
import io.reactivex.Observable
import retrofit2.http.GET


interface ApiUser {
    @GET("/api/users")
    fun getUsers(
    ): Observable<UserResponse<MutableList<User>>>
}