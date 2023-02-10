package com.example.test1.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, DB_Name, null, DB_VERSION) {

    companion object{
        private val DB_Name = "task"
        private val DB_VERSION = 1
        private val TABLE_NAME = "tasklist"
        private val ID = "id"
        private val TASK_NAME = "taskname"
        private val TASK_DETAILS = "taskdetails"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $TASK_NAME TEXT, $TASK_DETAILS TEXT)"
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}