package com.example.vikaslandge.navigationmenutoobar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class randomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        val r= Random()

        textView3.text= r.nextInt(15).toString()
    }
}
