package com.bumba.apptheme.view

enum class ThemeColor(val buttonText: String) {
    DYNAMIC("Dynamic Color"),
    STATIC("Static Color")
}

fun ThemeColor.getOpposed(): ThemeColor {
    return when (this) {
        ThemeColor.DYNAMIC -> ThemeColor.STATIC
        else -> ThemeColor.DYNAMIC
    }
}