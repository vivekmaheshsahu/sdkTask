package com.android.mobilesdktast

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CheckfunctionParameterTest{

    @Test
    fun emptyParameter()
    {
        val result = CheckfunctionParameter.CheckfunctionParameter(
                "",""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun checkValue()
    {
        val result = CheckfunctionParameter.CheckfunctionParameter(
                "android","rakutentech"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun oneParameterMissing()
    {
        val result = CheckfunctionParameter.CheckfunctionParameter(
                "android",""
        )
        assertThat(result).isFalse()
    }

}