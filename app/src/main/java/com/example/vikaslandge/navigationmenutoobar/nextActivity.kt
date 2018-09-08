package com.example.vikaslandge.navigationmenutoobar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_next.*

class nextActivity : AppCompatActivity() {
    var count1: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Next Activity")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)



    }

    fun random(view: View){
        var i = Intent(this,randomActivity::class.java)
        i.putExtra(randomActivity.TOTAL_COUNT,count1)
        startActivity(i)
    }
    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun countMe (view: View) {
        // Get the text view
        val showCountTextView = findViewById(R.id.textView) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        count1 = count
        // Display the new value in the text view.
        showCountTextView.text = count.toString();


    }
    override fun onCreateOptionsMenu(menu :Menu): Boolean {

         menuInflater.inflate(R.menu.next_menu,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item!!.itemId) {


        }
        return true
    }
}
