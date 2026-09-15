package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Landroid/text/TextPaint;", "p1", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "createGraphemeClusterSegmentFinder", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroidx/compose/ui/text/android/selection/SegmentFinder;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SegmentFinder_androidKt {
    public static final SegmentFinder createGraphemeClusterSegmentFinder(CharSequence charSequence, TextPaint textPaint) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new GraphemeClusterSegmentFinderApi29(charSequence, textPaint);
        }
        return new GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
