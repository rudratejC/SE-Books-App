package com.example.secomputerengineerringbooks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat

class sem4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem4)
    }

    fun EM4(view: View) {
        val url="https://drive.google.com/file/d/1-bCWMUthaIrWW8PhpMpH98lINcdifTrA/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
    fun AoA(view: View) {
        val url="https://drive.google.com/file/d/1-WMl5n34D8dOjx5bTilWWq3VkLbkW52j/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
    fun dbms(view: View) {
        val url="https://drive.google.com/file/d/1-an-SQ2YckoToNKTMgpuuTx28z5vOg6H/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
    fun os(view: View) {
        val url="https://drive.google.com/file/d/1-RprA2MjLjJ8DQq4C-73g5UOC7uYp28-/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
    fun mp(view: View) {
        val url="https://drive.google.com/file/d/1-FM7lL8J5UvD9GffnRRKUcGrA82CHoBH/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
    fun py(view: View) {
        val url="https://drive.google.com/file/d/1-Pcc2tgYQAOYkuFvWPTH2uv2-CPDKjFS/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.teal_200))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
}