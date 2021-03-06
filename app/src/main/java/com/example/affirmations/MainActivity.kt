package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset=DataSource().loadAffirmation()
        val recycleView=findViewById<RecyclerView>(R.id.recyclerView)
        recycleView.adapter=ItemAdapter(this,myDataset)
        recycleView.setHasFixedSize(true)
    }
}