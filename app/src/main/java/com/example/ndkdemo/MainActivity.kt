package com.example.ndkdemo

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_one->CounterNative.nativeExecute(20)
            R.id.button_two->nativeCounter.nativeExe(100)
        }
    }

    private lateinit var nativeCounter: CounterNative


    object StaticParams{
        lateinit var titleChangeListener: TitleChangeListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pageTitleView: TextView = findViewById(R.id.page_title)
        findViewById<TextView>(R.id.button_one).setOnClickListener(this)
        findViewById<TextView>(R.id.button_two).setOnClickListener(this)
        StaticParams.titleChangeListener= object: MyTitleChangeListener(pageTitleView){}

        nativeCounter = CounterNative()

    }

    companion object{
        fun setPageTitle(str:String): Boolean {
            StaticParams.titleChangeListener.onTitleChange(str)
            return true
        }
    }

    open class MyTitleChangeListener(view: TextView) : TitleChangeListener{

        private val v:TextView=view

        override fun onTitleChange(str: String) {
            v.text = str
        }

    }

    interface TitleChangeListener{
        fun onTitleChange(str: String)
    }
}
