package com.example.secomputerengineerringbooks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat

class sem3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem3)
    }

    fun EM3(view: View) {
            val url="https://drive.google.com/file/d/1_NlHDh-PSamgvAsPlHeAi7k45cvOoiF4/view?usp=sharing"
            val builder= CustomTabsIntent.Builder()
            builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
            builder.addDefaultShareMenuItem()

            val anotherCustom= CustomTabsIntent.Builder().build()
            val customTabsIntent= builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
    }

    fun dsgt(view: View) {
        val url="https://drive.google.com/file/d/1g0STDy2_nC6XWXTj0iLkDtHdmoeOINu2/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }

    fun ds(view: View) {
        val url="https://drive.google.com/file/d/14xD7GNs02L5LK3YnEboBMM8nAsUWrV3M/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }

    fun dlcoa(view: View) {
        val url="https://drive.google.com/file/d/10GeAkbPSlMtFPI3VTO5JmeMoYkX68ryo/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }

    fun cg(view: View) {
        val url="https://drive.google.com/file/d/17RNXgBbm6aGZ-5yovPf90L3UzvwGdZ-S/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }

    fun oopm(view: View) {
        val url="https://drive.google.com/file/d/12keUCRHf9TOggYeSqrA6a0iQIRBdAmdh/view?usp=sharing"
        val builder= CustomTabsIntent.Builder()
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.design_default_color_primary))
        builder.addDefaultShareMenuItem()

        val anotherCustom= CustomTabsIntent.Builder().build()
        val customTabsIntent= builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))
    }
}