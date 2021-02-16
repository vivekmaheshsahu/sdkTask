package com.android.mobilesdktast

object CheckfunctionParameter {

    val data = listOf("android","rakutentech")

    /**
     * The input is not valid if....
     * ... the platform/organization is empty
     */

    fun CheckfunctionParameter(
        platform: String,
        organization: String
    ): Boolean {
        return true
    }

}