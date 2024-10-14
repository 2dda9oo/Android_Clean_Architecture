package com.example.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.data.entity.SampleEntity

//임시 Dao
@Dao
interface SampleDao {

    @Insert
    fun insertSample(sample: SampleEntity)
}