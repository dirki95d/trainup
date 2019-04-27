package com.example.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = arrayOf(
        ForeignKey(
            entity = TrainingDay::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("dayId"),
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = TrainUnit::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("unitId"),
            onDelete = ForeignKey.CASCADE
        )
    )
)
data class TrainingSet(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val dayId: Long,
    val unitId: Long
// parameters
)
