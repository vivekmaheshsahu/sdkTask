package com.android.repo

import com.google.gson.annotations.SerializedName

class RepoModel(

        //private is android keyword thatwhy it is declare with serializedName to get proper response

    @field:SerializedName(value = "name") var repoName: String,
    var description: String,
    var language: String,
    @field:SerializedName(
        value = "private"
    )
    var isPrivate: Boolean
) {

    /*
        To print the value in console we use toString function it will display the value of model class
     */
    override fun toString(): String {
        return "RepoModel{" +
                "repoName='" + repoName + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", isPrivate=" + isPrivate +
                '}'
    }
}
