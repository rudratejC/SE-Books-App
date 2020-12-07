package com.example.secomputerengineerringbooks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bookLoad1(view: View){
    val intent = Intent(this, sem3Activity::class.java)
    startActivity(intent)
    }
    fun bookLoad2(view: View) {
        val intent = Intent(this, sem4Activity::class.java)
        startActivity(intent)
    }

    fun syl(view: View) {
        val url="https://drive.google.com/file/d/1Avj6mGBK9NUZ9kfriNd9hg2DRhQxwzK8/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
}