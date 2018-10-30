package com.ghostapps.roomapplication.repositories

import android.app.Application
import android.arch.lifecycle.LiveData
import com.ghostapps.roomapplication.models.Word

class WordRepository (val application: Application) {

    var wordDAO: WordDAO? = null
    var allWords: LiveData<List<Word>>? = null

    init {
        val db = WordDatabase.getDatabase(application)
        wordDAO = db.wordDAO
        allWords = wordDAO?.getAllWords()
    }

    fun insert (word: Word) {
        wordDAO?.insert(word)
    }

}