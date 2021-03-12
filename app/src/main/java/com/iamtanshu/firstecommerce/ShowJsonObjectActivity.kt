package com.iamtanshu.firstecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShowJsonObjectActivity : AppCompatActivity() {
    val btnSubmit: Button = findViewById(R.id.btnSubmit)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_json_object)
        btnSubmit.setOnClickListener{
            
        }
    }
}