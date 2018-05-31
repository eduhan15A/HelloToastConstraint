package com.mtw.eduardolujan.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowCount =  findViewById(R.id.show_count) as TextView
    }

    fun countUp(view: View) {
        // What happens when user clicks on the button_count Button goes here.
        mCount = mCount +1
        if (mShowCount != null)
            mShowCount!!.setText(mCount.toString() );
    }


    fun showToast(view: View) {
        // What happens when user clicks on the button_toast Button goes here.

        val toast = Toast.makeText(applicationContext, getString(R.string.toast_message), Toast.LENGTH_LONG)
        toast.show();

    }
}
