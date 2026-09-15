package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "p0", "<init>", "(F)V", "", "", "p1", "p2", "p3", "p4", "Landroid/graphics/Paint$FontMetricsInt;", "p5", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "lineHeight", "F", "getLineHeight", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private final float lineHeight;

    public LineHeightSpan(float f) {
        this.lineHeight = f;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence p0, int p1, int p2, int p3, int p4, Paint.FontMetricsInt p5) {
        int iLineHeight = LineHeightStyleSpan_androidKt.lineHeight(p5);
        if (iLineHeight <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.lineHeight);
        p5.descent = (int) Math.ceil(((double) p5.descent) * ((double) ((iCeil * 1.0f) / iLineHeight)));
        p5.ascent = p5.descent - iCeil;
    }
}
