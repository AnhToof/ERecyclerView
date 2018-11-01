package com.example.toof.erecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf(R.drawable.hero1, R.drawable.hero3, R.drawable.hero4)
        recycler_view.adapter = HeroAdapter(this, list)

    }
}
