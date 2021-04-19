package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
//        TODO("Not yet implemented")
        val listViewID: List<Int> =
                listOf(R.id.box_one_text, R.id.box_two_text,
                        R.id.box_three_text, R.id.box_four_text,
                        R.id.box_five_text, R.id.constrain_layout,
                        R.id.red_button, R.id.yellow_button, R.id.green_button)
        for (ViewID in listViewID) {
            findViewById<View>(ViewID).setOnClickListener { makeColor(it) }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColor(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_four_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)

            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(R.color.my_red)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(R.color.my_yellow)
            R.id.green_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundColor(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}