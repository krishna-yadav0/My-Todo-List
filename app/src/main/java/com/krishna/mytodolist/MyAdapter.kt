package com.krishna.mytodolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val task: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val Inflater = LayoutInflater.from(parent.context)
        val View = Inflater.inflate(R.layout.task_items, parent, false)
        return MyViewHolder(View)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = task[position]
    }

    override fun getItemCount(): Int {
        return task.size
    }

    class MyViewHolder(TaskItem: View) : RecyclerView.ViewHolder(TaskItem) {
        var textView = TaskItem.findViewById<TextView>(R.id.txtView)
    }
}

