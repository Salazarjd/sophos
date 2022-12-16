package com.example.sophos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.sophos.databinding.ActivitySendDocumentBinding

class SendDocumentActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivitySendDocumentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendDocumentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDocumentList()
    }

    private fun setDocumentList() {
        val documentTypes = resources.getStringArray(R.array.document_types)
        val adapter = ArrayAdapter(this,R.layout.list_item, documentTypes)

        with(binding.acTypeDocument){
            setAdapter(adapter)
            onItemClickListener = this@SendDocumentActivity
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this@SendDocumentActivity, item, Toast.LENGTH_SHORT).show()
    }


}