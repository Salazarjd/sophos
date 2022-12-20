package com.example.sophos

import com.example.sophos.model.Document

class DocumentsProvider {
    companion object {
        val documentsList = listOf<Document>(
            Document(
                "12382",
                "20/12/22",
                "CC",
                "Cédula",
                "Juan",
                "Salazar",
                "Medellín",
                "salazar.jd@gmail.com",
                "pdf",
                "cedula.pdf"
            ),
            Document(
                "123442",
                "20/12/22",
                "CE",
                "Cédula",
                "Diego",
                "Salazar",
                "Medellín",
                "salazar.jd@gmail.com",
                "pdf",
                "cedula.pdf"
            ),
        )
    }
}