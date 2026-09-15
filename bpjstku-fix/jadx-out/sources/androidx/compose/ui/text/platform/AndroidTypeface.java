package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/Typeface;", "Landroidx/compose/ui/text/font/FontWeight;", "p0", "Landroidx/compose/ui/text/font/FontStyle;", "p1", "Landroidx/compose/ui/text/font/FontSynthesis;", "p2", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AndroidTypeface extends Typeface {
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    android.graphics.Typeface mo6653getNativeTypefacePYhJU0U(FontWeight p0, int p1, int p2);
}
