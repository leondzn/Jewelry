package com.snekbyte.jewelry.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.snekbyte.jewelry.R


private val BrilliantCut = FontFamily(
    Font(R.font.brilliant_cut_regular),
    Font(R.font.brilliant_cut_medium, FontWeight.Medium),
    Font(R.font.brilliant_cut_bold, FontWeight.Bold),
)

private val FancyCut = FontFamily(
    Font(R.font.fancy_cut_regular),
    Font(R.font.fancy_cut_light, FontWeight.Light),
    Font(R.font.fancy_cut_bold, FontWeight.Bold),
    Font(R.font.fancy_cut_italic, style = FontStyle.Italic),
    Font(R.font.fancy_cut_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
)

data class JewelryTypography(
    val articleTitle: TextStyle = TextStyle(
        fontFamily = BrilliantCut,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp
    ),
    val articleTitleCard: TextStyle = TextStyle(
        fontFamily = BrilliantCut,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp
    ),
    val eyebrow: TextStyle = TextStyle(
        fontFamily = BrilliantCut,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp
    ),
    val bodySmall: TextStyle = TextStyle(
        fontFamily = FancyCut,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    val chapterTitle: TextStyle = TextStyle(
        fontFamily = BrilliantCut,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    val body: TextStyle = TextStyle(
        fontFamily = FancyCut,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    val quote: TextStyle = TextStyle(
        fontFamily = FancyCut,
        fontWeight = FontWeight.Light,
        fontSize = 29.sp
    ),
    val timestamp: TextStyle = TextStyle(
        fontFamily = FancyCut,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    val cta: TextStyle = TextStyle(
        fontFamily = BrilliantCut,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp
    ),
)

internal val LocalTypography = staticCompositionLocalOf { JewelryTypography() }