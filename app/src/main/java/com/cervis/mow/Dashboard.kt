   package com.cervis.mow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun goHome(view: View) {
        val intent = Intent(this, NavigationActivity::class.java)
        startActivity(intent)
    }

    fun goAbout(view: View) {
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }
    fun goContact(view: View) {
        val intent = Intent(this, Contact::class.java)
        startActivity(intent)
    }
}