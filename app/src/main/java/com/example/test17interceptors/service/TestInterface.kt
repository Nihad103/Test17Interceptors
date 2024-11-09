package com.example.test17interceptors.service

import com.example.test17interceptors.model.TestResponse
import retrofit2.http.GET

interface TestInterface {

    @GET("posts/1")
    suspend fun testapi() : TestResponse
}