package com.causentry.app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.TextTertiary
import com.causentry.app.ui.theme.WarningAmber

@Composable
fun AppItemCard(
    app: AppInfo,
    iconLoader: IconLoader,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AppIconItem(
            packageName = app.packageName,
            label = app.label,
            iconLoader = iconLoader,
            size = 42.dp
        )

        Spacer(modifier = Modifier.width(14.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = app.label,
                color = TextPrimary,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = app.packageName,
                color = TextSecondary,
                fontSize = 12.sp,
                fontFamily = FontFamily.Monospace,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Row(
                modifier = Modifier.padding(top = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                if (app.isProtected) {
                    StatusPill(text = "PROTECTED", color = SuccessGreen)
                }
                if (app.isHiddenInAnyTemplate) {
                    StatusPill(text = "CLOAKED", color = WarningAmber)
                }
                if (app.isHardened) {
                    StatusPill(text = "ISOLATED", color = PrimaryBlue)
                }
                if (app.isSystem) {
                    StatusPill(text = "SYSTEM", color = TextTertiary)
                }
            }
        }

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "›",
            color = TextSecondary,
            fontSize = 22.sp,
            fontWeight = FontWeight.Light
        )
    }
}
