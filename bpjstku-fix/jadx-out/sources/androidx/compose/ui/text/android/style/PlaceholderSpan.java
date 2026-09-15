package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8\u0007@BX\u0087.¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010!R$\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010!R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "", "Landroid/graphics/Paint$FontMetricsInt;", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "p6", "p7", "p8", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "width", "F", "widthUnit", "I", "height", "heightUnit", "pxPerSp", "verticalAlign", "getVerticalAlign", "()I", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "widthPx", "getWidthPx", "heightPx", "getHeightPx", "", "isLaidOut", "Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;
    public static final int $stable = 8;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas p0, CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, Paint p8) {
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public PlaceholderSpan(float f, int i, float f2, int i2, float f3, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.pxPerSp = f3;
        this.verticalAlign = i3;
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint p0, CharSequence p1, int p2, int p3, Paint.FontMetricsInt p4) {
        float f;
        int iCeilToInt;
        this.isLaidOut = true;
        float textSize = p0.getTextSize();
        this.fontMetrics = p0.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.widthUnit;
        if (i == 0) {
            f = this.width * this.pxPerSp;
        } else if (i == 1) {
            f = this.width * textSize;
        } else {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
            throw new KotlinNothingValueException();
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f);
        int i2 = this.heightUnit;
        if (i2 == 0) {
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * this.pxPerSp);
        } else if (i2 == 1) {
            iCeilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * textSize);
        } else {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
            throw new KotlinNothingValueException();
        }
        this.heightPx = iCeilToInt;
        if (p4 != null) {
            p4.ascent = getFontMetrics().ascent;
            p4.descent = getFontMetrics().descent;
            p4.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (p4.ascent > (-getHeightPx())) {
                        p4.ascent = -getHeightPx();
                    }
                    break;
                case 1:
                case 4:
                    if (p4.ascent + getHeightPx() > p4.descent) {
                        p4.descent = p4.ascent + getHeightPx();
                    }
                    break;
                case 2:
                case 5:
                    if (p4.ascent > p4.descent - getHeightPx()) {
                        p4.ascent = p4.descent - getHeightPx();
                    }
                    break;
                case 3:
                case 6:
                    if (p4.descent - p4.ascent < getHeightPx()) {
                        p4.ascent -= (getHeightPx() - (p4.descent - p4.ascent)) / 2;
                        p4.descent = p4.ascent + getHeightPx();
                    }
                    break;
                default:
                    InlineClassHelperKt.throwIllegalArgumentException("Unknown verticalAlign.");
                    break;
            }
            p4.top = Math.min(getFontMetrics().top, p4.ascent);
            p4.bottom = Math.max(getFontMetrics().bottom, p4.descent);
        }
        return getWidthPx();
    }
}
