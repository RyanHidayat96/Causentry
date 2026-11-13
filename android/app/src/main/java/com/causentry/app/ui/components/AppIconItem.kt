package com.causentry.app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.data.IconLoader
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary

@Composable
fun AppIconItem(
    packageName: String,
    label: String,
    iconLoader: IconLoader,
    modifier: Modifier = Modifier,
    size: Dp = 44.dp
) {
    // Asynchronously load the icon without ever blocking the UI thread
    val iconState = produceState<ImageBitmap?>(initialValue = iconLoader.getCached(packageName), packageName) {
        if (value == null) {
            value = iconLoader.getIcon(packageName)
        }
    }

    val icon = iconState.value
    if (icon != null) {
        Image(
            bitmap = icon,
            contentDescription = label,
            modifier = modifier
                .size(size)
                .clip(RoundedCornerShape(10.dp))
        )
    } else {
        // Fallback Monogram avatar
        val initial = (label.firstOrNull() ?: packageName.firstOrNull() ?: '?')
            .uppercaseChar()
            .toString()

        Box(
            modifier = modifier
                .size(size)
                .clip(RoundedCornerShape(10.dp))
                .background(SurfaceHighDark),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = initial,
                color = PrimaryBlue,
                fontSize = (size.value * 0.45f).sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
