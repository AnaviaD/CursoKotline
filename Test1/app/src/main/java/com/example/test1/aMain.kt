package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test1.Adapter.TaskListAdapter
import com.example.test1.database.DatabaseHelper
import com.example.test1.model.TaskListModel

class aMain : AppCompatActivity() {

    lateinit var recycler_task: RecyclerView
    lateinit var btn_add: Button
    var taskListAdapter: TaskListAdapter ?= null
    var dbHandler: DatabaseHelper ?= null
    var tasklist: List<TaskListModel> = ArrayList<TaskListModel>()
    var linearLayoutManager: LinearLayoutManager ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amain)

        recycler_task = findViewById(R.id.rv_list)
        btn_add = findViewById(R.id.bt_add_items)

        dbHandler = DatabaseHelper(this)
        fetchlist()

        btn_add.setOnClickListener {
            val i = Intent(applicationContext, add_task::class.java)
            startActivity(i)
        }
    }

    private fun fetchlist(){
        tasklist = dbHandler!!.getAllTask()
        taskListAdapter = TaskListAdapter(tasklist, applicationContext)
        linearLayoutManager = LinearLayoutManager(applicationContext)
        recycler_task.layoutManager = linearLayoutManager
        recycler_task.adapter = taskListAdapter
        taskListAdapter?.notifyDataSetChanged()
    }

}