package com.example.sophos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sophos.adapter.DocumentAdapter

class ShowDocumentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_documents)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rvDocuments)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DocumentAdapter(DocumentsProvider.documentsList)
    }
}