package com.android.repo

import com.google.gson.annotations.SerializedName

class RepoModel(
    @field:SerializedName(value = "name") var repoName: String,
    var description: String,
    var language: String,
    @field:SerializedName(
        value = "private"
    )
    var isPrivate: Boolean
) {

    override fun toString(): String {
        return "RepoModel{" +
                "repoName='" + repoName + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", isPrivate=" + isPrivate +
                '}'
    }
}
