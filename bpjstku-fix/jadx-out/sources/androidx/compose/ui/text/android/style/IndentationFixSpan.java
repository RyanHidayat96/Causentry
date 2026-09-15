package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJw\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/android/style/IndentationFixSpan;", "Landroid/text/style/LeadingMarginSpan;", "<init>", "()V", "", "p0", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "Landroid/text/Layout;", "p11", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean p0) {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas p0, Paint p1, int p2, int p3, int p4, int p5, int p6, CharSequence p7, int p8, int p9, boolean p10, Layout p11) {
        int lineForOffset;
        if (p11 == null || p1 == null || (lineForOffset = p11.getLineForOffset(p8)) != p11.getLineCount() - 1 || !TextLayout_androidKt.isLineEllipsized(p11, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding(p11, lineForOffset, p1) + IndentationFixSpan_androidKt.getEllipsizedRightPadding(p11, lineForOffset, p1);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        Intrinsics.checkNotNull(p0);
        p0.translate(ellipsizedLeftPadding, 0.0f);
    }
}
