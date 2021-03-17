package com.example.datapicker

import android.app.AlertDialog
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataPiker = findViewById<TextView>(R.id.date_picker)
        dataPiker.setOnClickListener {
            showDataPicker()
        }

    }

    private fun showDataPicker() {

        val dataPiker = findViewById<TextView>(R.id.date_picker)
        val datePickerDialog = DatePickerDialog(this,
                AlertDialog.THEME_HOLO_DARK,
                DatePickerDialog.OnDateSetListener() { view, year, month, dayOfMonth->
                    dataPiker.text = "${year}/${month + 1}/${dayOfMonth}"
                }, 2020, 12, 1)
        datePickerDialog.show()
    }
}