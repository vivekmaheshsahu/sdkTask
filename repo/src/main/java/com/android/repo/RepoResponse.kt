package com.android.repo

class RepoResponse {

    /**
     * To parase the response of retrofit call this class is created
       In network call we get few details then json array of RepoModel is available
     */

    var total_count = 0
    var incomplete_results = false
    var items: List<RepoModel>? = null
}
