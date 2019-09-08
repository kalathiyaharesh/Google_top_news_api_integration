package com.dasharath.googlenewsretrofir

import retrofit2.Call
import retrofit2.http.GET

interface NewsApi {

    @GET("v2/top-headlines?sources=google-news&apiKey=57e243b5c6b84c49856cf2ebbd4ec96d")
    fun getNews():Call<WorldNews>
}