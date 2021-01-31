package com.maha.screepic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.ContactsContract
import android.view.View
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler = Handler()

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ScreePic)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()


    }


    fun setMainText(view: View) {
        findViewById<TextView>(R.id.textMenu).text = view.tag.toString()
    }

    private fun  addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }
    private fun initRecyclerView(){
        findViewById<RecyclerView>(R.id.recycler_view).apply {

            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecoration = TopSpacingItemDecoration (30)
            addItemDecoration(topSpacingDecoration)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }

    }



}


