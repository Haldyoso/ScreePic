package com.maha.screepic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.preference.PreferenceActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.HandlerCompat
import androidx.core.os.HandlerCompat.postDelayed
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    val numberList : MutableList<String> = ArrayList()

    var page = 1
    var isLoading = false
    val limit = 10

    lateinit var adapter: NumberAdapter
    lateinit var layoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ScreePic)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
       recyclerView.layoutManager= layoutManager
        getPage()
    }

    fun  getPage(){

        ProgressBar.INVISIBLE= View.VISIBLE
        val start: Int = (page-1)*limit //to (page*limit) +1
        val end: Int = (page)*limit


        for (i: Int in  start..end){
            numberList.add("item" + i.toString())
        }

        Handler().postDelayed({
            if (::adapter.isInitialized){
                adapter.notifyDataSetChanged()
            }else
                adapter = NumberAdapter(this)
                recyclerView.adapter = adapter


        },5000)


    }

// main category - working buttons
    fun setMainText(view: View) {
        findViewById<TextView>(R.id.textMenu).text = view.tag.toString()
    }




class NumberAdapter(val activity: MainActivity) : RecyclerView.Adapter<NumberAdapter.NumberViewHolder>(){
        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NumberViewHolder {
            return NumberViewHolder(LayoutInflater.from(activity).inflate(R.layout.rv_child_number,p0,false))
        }

        override fun onBindViewHolder(p0:NumberViewHolder, p1: Int) {
            p0.tvNumber.text = activity.numberList[p1]
        }

        override fun getItemCount(): Int {
            return activity.numberList.size
        }

        class NumberViewHolder(v: View) : RecyclerView.ViewHolder(v){
            val tvNumber = v.findViewById<TextView>(R.id.tv_number)
        }
}





}


