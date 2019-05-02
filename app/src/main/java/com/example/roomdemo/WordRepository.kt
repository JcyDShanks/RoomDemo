package com.example.roomdemo

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWord()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}