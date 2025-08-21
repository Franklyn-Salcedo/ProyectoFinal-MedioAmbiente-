package com.medioambiente.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.medioambiente.R
import com.medioambiente.adapters.DeveloperAdapter
import com.medioambiente.models.Developer

class AcercaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var developerAdapter: DeveloperAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca)

        recyclerView = findViewById(R.id.recyclerViewAcerca)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val developers = listOf(
            Developer(
                nombre = "Maria Mercedes Rosario",
                matricula = "2023-1897",
                telefono = "(809) 383-2270",
                telegram = "MariaRosarioEsc",
                foto = R.drawable.maria
            ),
            Developer(
                nombre = "Franklyn Muñoz Salcedo",
                matricula = "2021-2296",
                telefono = "(829) 343-1938",
                telegram = "FrankSalcedo96",
                foto = R.drawable.frank
            )
        )

        developerAdapter = DeveloperAdapter(developers)
        recyclerView.adapter = developerAdapter
    }
}