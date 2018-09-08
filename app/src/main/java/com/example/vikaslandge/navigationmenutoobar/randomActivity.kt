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
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        textView3.text= r.nextInt(count).toString()
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
