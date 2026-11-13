package com.causentry.app.model

data class AppInfo(
    val packageName: String,
    val label: String,
    val isProtected: Boolean = false,
    val isHardened: Boolean = false,
    val isSystem: Boolean = false,
    val devOff: Boolean = false,
    val mock: Boolean = false,
    val isolate: Boolean = false,
    val hideTemplate: String? = null,
    val isHiddenInAnyTemplate: Boolean = false
)

enum class AppFilter {
    ALL,
    PROTECTED,
    USER,
    SYSTEM
}
