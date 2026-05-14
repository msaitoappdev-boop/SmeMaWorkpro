package com.msaitodev.sme.ma.workpro.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.msaitodev.core.common.ui.LocalAppColors
import com.msaitodev.core.common.ui.AppColors

private val LightColorScheme = lightColorScheme(
    primary = BrandPrimary,
    secondary = BrandSecondary,
    tertiary = BrandTertiary,
    background = AppBackground,
    surface = AppBackground,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = Color(0xFF004D40), // Teal 900 (CaregiverのGreen 900相当)
    onSurface = Color(0xFF004D40),
)

private val DarkColorScheme = darkColorScheme(
    primary = BrandPrimaryDark,
    secondary = BrandSecondaryDark,
    tertiary = BrandTertiaryDark,
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

// アプリケーション用のセマンティックカラー定義（ライトモード用）
private val LightAppColors = AppColors(
    correctBorder = Color(0xFF00796B),    // Teal 700 (CaregiverのGreen 700相当)
    correctBackground = Color(0xFFE0F2F1), // Teal 50
    wrongBorder = Color(0xFFC53030),      // 警告の赤は共通
    wrongBackground = Color(0xFFFFE0E0),
    selectedBackground = Color(0xFFE5E5E5)
)

// アプリケーション用のセマンティックカラー定義（ダークモード用）
private val DarkAppColors = AppColors(
    correctBorder = Color(0xFF80CBC4),    // Teal 200
    correctBackground = Color(0xFF004D40), // Teal 900
    wrongBorder = Color(0xFFF56565),
    wrongBackground = Color(0xFF652B19),
    selectedBackground = Color(0xFF4A5568)
)

@Composable
fun SmeMaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val appColors = if (darkTheme) DarkAppColors else LightAppColors

    CompositionLocalProvider(
        LocalAppColors provides appColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}
