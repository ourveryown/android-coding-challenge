package au.com.ourveryown.ovoandroidhomeworktask.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun AndroidCodingChallengeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = when {
        darkTheme -> darkColors(
            primary = MaterialTheme.colors.primary,
            primaryVariant = MaterialTheme.colors.primaryVariant,
            secondary = MaterialTheme.colors.secondary
        )

        else -> lightColors(
            primary = MaterialTheme.colors.primary,
            primaryVariant = MaterialTheme.colors.primaryVariant,
            secondary = MaterialTheme.colors.secondary
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        content = content
    )
}
