package com.android.repo

import android.content.ContentValues
import android.util.Log
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class GetRepo {

    /**
     *  performing network call using retrofit and list of model is providing in response after executing function
     */

    private val url = "https://api.github.com/search/repositories?q=android+org:rakutentech"

    companion object {
        private val gson = GsonBuilder().create()
        private val okHttpClientBuilder = OkHttpClient.Builder()

        /**
         * @param platform
         * @param organizationName
         * this are the two different parameter provided to function if function is missing parameter
         * then it will be providing empty list
         */

        fun getRepos(platform: String?, organizationName: String?): Any? {
            if (platform == null || organizationName == null) {
                Log.d("TAG","invalid input to function")
                return ArrayList<Any?>()
            }
            val repos: MutableList<RepoModel?> = ArrayList()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/search/")
                .client(okHttpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            val service = retrofit.create(GithubService::class.java)
            val call = service.listRepos("$platform+org:$organizationName")
            call!!.enqueue(object : Callback<RepoResponse?> {
                override fun onResponse(
                    call: Call<RepoResponse?>,
                    response: Response<RepoResponse?>
                ) {
                    if (response.isSuccessful) {
                        for (repo in response.body()!!.items!!) {
                            repos.add(repo)
                            Log.d("TAG","Success");
                        }
                    } else {
                        Log.e(ContentValues.TAG, response.message())
                    }
                }

                override fun onFailure(call: Call<RepoResponse?>, t: Throwable) {
                    Log.e(ContentValues.TAG, t.message)
                }
            })
            return repos
        }
    }
}




