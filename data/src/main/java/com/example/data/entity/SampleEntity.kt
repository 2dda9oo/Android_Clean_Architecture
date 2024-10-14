package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


//임시 Entity
@Entity(tableName = "sample")
data class SampleEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String = ""
)
