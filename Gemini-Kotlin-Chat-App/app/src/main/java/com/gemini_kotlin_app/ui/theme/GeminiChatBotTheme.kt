package com.gemini_kotlin_app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF0077B6),  // Bleu vibrante (énergie)
    secondary = Color(0xFF3A84EF),  // Vert bleu pâle (fraîcheur)
    background = Color(0xFF09090A),  // Gris sombre avec une touche bleutée
    surface = Color(0xFF000000),  // Surface plus claire pour éviter trop d'intensité
    onPrimary = Color.White,  // Texte blanc sur couleur primaire
    onSecondary = Color.Black,  // Texte noir sur couleur secondaire
    onBackground = Color.White,  // Texte blanc sur fond sombre
    onSurface = Color.White  // Texte blanc sur surface
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF00A5CF),  // Bleu turquoise (dynamisme)
    secondary = Color(0xFF32A852),  // Vert tendre (nature)
    background = Color(0xFFF1F5F8),  // Fond clair et apaisant
    surface = Color(0xFFFFFFFF),  // Surface blanche classique
    onPrimary = Color.White,  // Texte blanc sur couleur primaire
    onSecondary = Color.Black,  // Texte noir sur couleur secondaire
    onBackground = Color.Black,  // Texte noir sur fond clair
    onSurface = Color.Black  // Texte noir sur surface blanche
)



@Composable
fun GeminiChatBotTheme(
    darkTheme: Boolean = false, // You can pass this parameter to switch between light and dark theme
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
