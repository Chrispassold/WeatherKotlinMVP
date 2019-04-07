package com.chrispassold.weatherkotlinmvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chrispassold.weatherkotlinmvp.R
import dagger.android.AndroidInjection

//https://code.luasoftware.com/tutorials/android/setup-dagger2-for-android-kotlin/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}