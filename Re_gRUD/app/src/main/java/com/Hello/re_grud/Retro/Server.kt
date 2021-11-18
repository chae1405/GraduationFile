package com.Hello.re_grud.Retro

import com.Hello.re_grud.Login.*

import com.Hello.re_grud.Retro.RetroClient.Companion.getInstance

import retrofit2.Call
import retrofit2.create

import retrofit2.http.*

interface Server {
    companion object {
        fun RetrofitClient(): Server? = getInstance()?.create(Server::class.java)
        fun create(): Server? {
            return getInstance()?.create()
        }
    }
    @POST("/user/")
    fun userlogin(@Body user : UserCreationElement):Call<Get_List>

    @POST("/login/")
    fun requestLogin(@Body login:Logindata):Call<Get_Login>
}