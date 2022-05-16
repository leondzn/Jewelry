package com.snekbyte.jewelry.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember

@Composable
fun JewelryTheme(
    colors: JewelryColors = JewelryTheme.colors,
    typography: JewelryTypography = JewelryTheme.typography,
    content: @Composable () -> Unit
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography,
    ) {
        content()
    }
}

object JewelryTheme {
    val colors: JewelryColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
    val typography: JewelryTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}