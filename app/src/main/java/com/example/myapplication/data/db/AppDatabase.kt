package com.example.myapplication.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CompanyEntity::class], version=1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun companyDao(): CompanyDao

    companion object {
        private const val DATABASE_NAME = "d_bugging.db"

        fun build(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }
}
