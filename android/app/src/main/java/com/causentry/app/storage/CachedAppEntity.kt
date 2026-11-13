package com.causentry.app.storage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cached_apps")
data class CachedAppEntity(
    @PrimaryKey val packageName: String,
    val label: String,
    val isProtected: Boolean = false,
    val isSystem: Boolean = false,
    val lastUpdated: Long = System.currentTimeMillis()
)
