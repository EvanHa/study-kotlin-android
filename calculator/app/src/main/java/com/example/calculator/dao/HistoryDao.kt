package com.example.calculator.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.calculator.model.History

//https://developer.android.com/training/data-storage/room/accessing-data?hl=ko

@Dao
interface HistoryDao {
    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()
}