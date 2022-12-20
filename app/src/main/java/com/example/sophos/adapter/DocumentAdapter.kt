package com.example.sophos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sophos.R
import com.example.sophos.model.Document

class DocumentAdapter(private val documentList:List<Document>):RecyclerView.Adapter<DocumentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DocumentViewHolder(layoutInflater.inflate(R.layout.item_document, parent, false))
    }

    override fun onBindViewHolder(holder: DocumentViewHolder, position: Int) {
        val item = documentList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = documentList.size
}