package com.ghostapps.roomapplication.repositories

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.ghostapps.roomapplication.models.Word

@Database(entities = [Word::class], version = 1)
abstract class WordDatabase(
    val wordDAO: WordDAO
): RoomDatabase() {

    companion object {
        var databaseInstance: WordDatabase? = null

        fun getDatabase(context: Context): WordDatabase {
            return databaseInstance
                ?: createDataBase(context)
        }

        private fun createDataBase(context: Context): WordDatabase {
            databaseInstance = Room.databaseBuilder(context.applicationContext,
                WordDatabase::class.java, "word_database").build()
            return databaseInstance!!
        }

    }


}