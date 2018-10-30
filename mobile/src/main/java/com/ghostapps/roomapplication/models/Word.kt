package com.ghostapps.roomapplication.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "word_table")
class Word (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "word")
    var mWord: String)