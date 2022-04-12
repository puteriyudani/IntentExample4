package com.puteriyudani.intentexample4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone number")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var m_uri: Uri
        var m_intent: Intent = Intent()
        when (item?.toString()) {
            "Web" -> {
                m_uri = Uri.parse("https://www.apress.com") //pindah ke aplikasi web pada perangkat
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Map" -> {
                m_uri = Uri.parse("geo:40.7113399,-74.0263469") //pindah ke aplikasi map pada perangkat
                //ini akan berhasil
                // m_uri = Uri.parse("https://maps.google.com/maps?q = 40.7113399, -74.0263469")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Phone number" -> {
                m_uri = Uri.parse("tel:081275116838") //pindah ke aplikasi telepon pada perangkat
                m_intent = Intent(Intent.ACTION_DIAL, m_uri)
            }
        }
        startActivity(m_intent)
        return true
    }
}