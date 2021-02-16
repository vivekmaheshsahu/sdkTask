package com.android.mobilesdktast

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.repo.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View?)
    {
        GetRepo.getRepos("android", "rakutentech")
    }

}