package com.android.mobilesdktast

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.repo.*

class MainActivity : AppCompatActivity() {

    /*
        This main class is used to test the SDK which is develop properly work or not
        to call sdk we have to implement project path of sdk in gradle file
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
            This function is used to call git sdk Repository
     */

    fun click(view: View?)
    {
        GetRepo.getRepos("android", "rakutentech")
    }

}