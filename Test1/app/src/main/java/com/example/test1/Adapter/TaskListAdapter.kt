package com.example.test1.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test1.R
import com.example.test1.add_task
import com.example.test1.model.TaskListModel

class TaskListAdapter(tasklist: List<TaskListModel>, internal var context: Context):RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>() {

    internal var tasklist : List<TaskListModel> = ArrayList()
    init {
        this.tasklist = tasklist
    }

    inner class TaskViewHolder(view: View): RecyclerView.ViewHolder(view){
        var name: TextView = view.findViewById(R.id.txt_name)
        var details: TextView = view.findViewById(R.id.txt_details)
        var btn_edit: TextView = view.findViewById(R.id.btn_edit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_task_list, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasklist[position]
        holder.name.text = task.name
        holder.details.text = task.details

        holder.btn_edit.setOnClickListener {
            val i = Intent(context, add_task::class.java)
            i.putExtra("Mode", "E")
            i.putExtra("Id", task.id)
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return tasklist.size
    }
}