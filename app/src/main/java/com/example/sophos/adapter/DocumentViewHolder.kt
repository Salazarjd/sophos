package com.example.sophos.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sophos.R
import com.example.sophos.model.Document
import org.w3c.dom.Text

class DocumentViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val documentDate = view.findViewById<TextView>(R.id.tvDate)
    val documentUserName = view.findViewById<TextView>(R.id.tvUserName)

    fun render(documentModel:Document){
        documentDate.text = "${documentModel.date} - ${documentModel.typeAttached}"
        documentUserName.text = "${documentModel.name} ${documentModel.lastName}"
    }
}