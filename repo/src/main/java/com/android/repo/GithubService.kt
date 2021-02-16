package com.android.repo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("repositories")
    fun listRepos(@Query("q") query: String?): Call<RepoResponse?>?
}
