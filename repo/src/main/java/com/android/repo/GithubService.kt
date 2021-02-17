package com.android.repo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    /**
     * To implement the retrofit network call we have create service interface
     *  request type is git with its parameter
     */

    @GET("repositories")
    fun listRepos(@Query("q") query: String?): Call<RepoResponse?>?
}
