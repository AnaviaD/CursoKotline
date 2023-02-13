package com.example.test1.database

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.test1.model.TaskListModel

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, DB_Name, null, DB_VERSION) {

    companion object{
        private val DB_Name = "task"
        private val DB_VERSION = 1
        private val TABLE_NAME = "tasklist"
        private val ID = "id"
        private val TASK_NAME = "taskname"
        private val TASK_DETAILS = "taskdetails"
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $TASK_NAME TEXT, $TASK_DETAILS TEXT);"
        p0?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
        p0?.execSQL(DROP_TABLE)
        onCreate(p0)
    }

    fun getAllTask(): List<TaskListModel>{
        val tasklist = ArrayList<TaskListModel>()
        val db:SQLiteDatabase = writableDatabase
        val selectQuery = "SELECT * FROM $TABLE_NAME"
        val cursor = db.rawQuery(selectQuery, null)
        if (cursor != null){
            if (cursor.moveToFirst()){
                do {
                    val tasks = TaskListModel()
                    tasks.id = Integer.parseInt(cursor.getString(cursor.getColumnIndexOrThrow(ID)))
                    tasks.name = cursor.getString(cursor.getColumnIndexOrThrow(TABLE_NAME))
                    tasks.details = cursor.getString(cursor.getColumnIndexOrThrow(TASK_DETAILS))
                    tasklist.add(tasks)
                }while (cursor.moveToNext())
            }
        }
        cursor.close()
        return tasklist
    }


}