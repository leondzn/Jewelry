package com.snekbyte.jewelry.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Red = Color(0xFFC10016)
val Gold = Color(0xFFAC9852)
val Black = Color(0xFF0D0D0D)
val DarkGray = Color(0xFFDCD7CA)
val LightGray = Color(0xFFF6F5EF)
val White = Color(0xFFFFFFFF)

class JewelryColors(
    primary: Color,
    secondary: Color,
    onPrimary: Color,
    error: Color,
) {
    var primary by mutableStateOf(primary)
        internal set
    var secondary by mutableStateOf(secondary)
        internal set
    var onPrimary by mutableStateOf(onPrimary)
        internal set
    var error by mutableStateOf(error)
        internal set

    fun copy(
        primary: Color = this.primary,
        secondary: Color = this.secondary,
        onPrimary: Color = this.onPrimary,
        error: Color = this.error,
    ): JewelryColors = JewelryColors(
        primary,
        secondary,
        onPrimary,
        error,
    )
}

internal fun JewelryColors.updateColorsFrom(other: JewelryColors) {
    primary = other.primary
    secondary = other.secondary
    onPrimary = other.onPrimary
    error = other.error
}

internal val LocalColors = staticCompositionLocalOf {
    JewelryColors(
        primary = Red,
        secondary = Gold,
        onPrimary = White,
        error = Red
    )
}
