package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001cR$\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R$\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010+"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "p6", "<init>", "(FIIZZFZ)V", "", "Landroid/graphics/Paint$FontMetricsInt;", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "calculateTargetMetrics", "(Landroid/graphics/Paint$FontMetricsInt;)V", "copy$ui_text", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeight", "F", "getLineHeight", "()F", "startIndex", "I", "endIndex", "trimFirstLineTop", "Z", "trimLastLineBottom", "getTrimLastLineBottom", "()Z", "topRatio", "preserveMinimumHeight", "firstAscent", "ascent", "descent", "lastDescent", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescentDiff", "getLastDescentDiff"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final boolean preserveMinimumHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, boolean z3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.preserveMinimumHeight = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence p0, int p1, int p2, int p3, int p4, Paint.FontMetricsInt p5) {
        if (LineHeightStyleSpan_androidKt.lineHeight(p5) > 0) {
            boolean z = p1 == this.startIndex;
            boolean z2 = p2 == this.endIndex;
            if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom) {
                return;
            }
            if (this.firstAscent == Integer.MIN_VALUE) {
                calculateTargetMetrics(p5);
            }
            p5.ascent = z ? this.firstAscent : this.ascent;
            p5.descent = z2 ? this.lastDescent : this.descent;
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt p0) {
        double dCeil;
        int iLineHeight = LineHeightStyleSpan_androidKt.lineHeight(p0);
        int iCeil = (int) Math.ceil(this.lineHeight);
        int i = iCeil - iLineHeight;
        if (this.preserveMinimumHeight && i <= 0) {
            this.ascent = p0.ascent;
            int i2 = p0.descent;
            this.descent = i2;
            this.firstAscent = this.ascent;
            this.lastDescent = i2;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(p0.ascent) / LineHeightStyleSpan_androidKt.lineHeight(p0);
        }
        if (i <= 0) {
            dCeil = Math.ceil(i * fAbs);
        } else {
            dCeil = Math.ceil(i * (1.0f - fAbs));
        }
        int i3 = p0.descent + ((int) dCeil);
        this.descent = i3;
        int i4 = i3 - iCeil;
        this.ascent = i4;
        if (this.trimFirstLineTop) {
            i4 = p0.ascent;
        }
        this.firstAscent = i4;
        this.lastDescent = this.trimLastLineBottom ? p0.descent : this.descent;
        this.firstAscentDiff = p0.ascent - this.firstAscent;
        this.lastDescentDiff = this.lastDescent - p0.descent;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i, i2, z);
    }

    public final LineHeightStyleSpan copy$ui_text(int p0, int p1, boolean p2) {
        return new LineHeightStyleSpan(this.lineHeight, p0, p1, p2, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }
}
