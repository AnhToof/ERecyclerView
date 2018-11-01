package com.example.toof.erecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.item_hero.view.*

class HeroAdapter(private val context: Context, private val list: ArrayList<Int>) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_hero, p0, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.mImageView.setImageResource(list[p1])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.image_view
    }
}