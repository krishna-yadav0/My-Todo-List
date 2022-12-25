package com.krishna.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val allTask = arrayListOf<String>(
            "Study Maths from 11:00 am to 2:00 pm",
            "Complete school assignment",
            "Meeting from 3:00 pm",
            "Study Maths from 11:00 am to 2:00 pm",
            "Complete school assignment",
            "Meeting from 3:00 pm",
            "Study Maths from 11:00 am to 2:00 pm",
            "Complete school assignment",
            "Meeting from 3:00 pm",
            "Study Maths from 11:00 am to 2:00 pm",
            "Complete school assignment",
            "Meeting from 3:00 pm"
        )

        val taskLists = findViewById<RecyclerView>(R.id.taskList)
        taskLists.adapter = MyAdapter(allTask)
        taskLists.layoutManager = LinearLayoutManager(this)

        val button1 = findViewById<Button>(R.id.btnAdd)
        val taskEditField = findViewById<EditText>(R.id.txtEdit)

        button1.setOnClickListener {
            val taskValue = taskEditField.text.toString()
            if (taskValue.isEmpty())
                return@setOnClickListener
            allTask.add(taskValue)
            taskLists.adapter
            taskEditField.text.clear()
            taskLists.adapter?.notifyDataSetChanged()

        }


    }
}