package org.aj.astra.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppDarkColorScheme = darkColorScheme(
    primary = PrimaryAccent,
    onPrimary = Color.White,

    secondary = PrimarySecondary,
    onSecondary = Color.White,

    background = Primary,
    onBackground = Color.White,

    surface = Surface,
    onSurface = Color.White,

    outline = PrimarySecondary,

    error = Color(0xFFEF4444),
    onError = Color.White
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppDarkColorScheme,
        content = content
    )
}