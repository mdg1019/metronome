package dev.markgoodwin.metronome.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import dev.markgoodwin.metronome.R


private val LatoFontFamily = FontFamily(
    Font(R.font.lato_regular, FontWeight.Normal)
)

val Typography = Typography(
    displayLarge = TextStyle(fontFamily = LatoFontFamily),
    displayMedium = TextStyle(fontFamily = LatoFontFamily),
    displaySmall = TextStyle(fontFamily = LatoFontFamily),
)