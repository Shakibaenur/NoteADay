package com.shakibaenur.noteaday.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shakibaenur.noteaday.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao

}