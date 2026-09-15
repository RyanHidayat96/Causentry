package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\"\u0010 J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b#\u0010 J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b$\u0010 J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b%\u0010 J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b&\u0010 J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b'\u0010 J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b(\u0010 J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b)\u0010 J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b0\u0010+J\u0015\u00101\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b1\u0010+J\u0015\u00102\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b2\u0010+J\u001d\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b8\u0010+J\u0015\u00109\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b9\u0010/J\u0015\u0010:\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b:\u0010+J%\u0010=\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020;¢\u0006\u0004\b=\u0010>J9\u0010A\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f0@¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020CH\u0000¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020C2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020\bH\u0007¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020J¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000fH\u0000¢\u0006\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010NR\u001a\u0010X\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bY\u0010NR\u001a\u0010Z\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\ba\u0010_R\u001a\u0010c\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010V\u001a\u0004\bd\u0010NR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0011\u0010j\u001a\u00020e8G¢\u0006\u0006\u001a\u0004\bh\u0010iR \u0010l\u001a\u00020k8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u001a\u0010r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR \u0010v\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bv\u0010s\u0012\u0004\bx\u0010q\u001a\u0004\bw\u0010uR \u0010y\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\by\u0010s\u0012\u0004\b{\u0010q\u001a\u0004\bz\u0010uR\u0014\u0010|\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010}R\u0014\u0010\u007f\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010VR\u001a\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010sR!\u0010\u0086\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u0084\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008b\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0014\u0010\u0093\u0001\u001a\u00020\u00028G¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0013\u0010\u0095\u0001\u001a\u00020\b8G¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010u"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "p0", "", "p1", "Landroid/text/TextPaint;", "p2", "", "p3", "Landroid/text/TextUtils$TruncateAt;", "p4", "p5", "p6", "p7", "", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "", "p16", "p17", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "p18", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "getHorizontalPadding", "(I)F", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "getLineForVertical", "getOffsetForHorizontal", "(IF)I", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "Landroid/graphics/Path;", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "Lkotlin/Function2;", "getRangeForRect", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "fillLineHorizontalBounds$ui_text", "(I[F)V", "fillBoundingBoxes", "(II[FI)V", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text", "()Z", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "includePadding", "Z", "getIncludePadding", "fallbackLineSpacing", "getFallbackLineSpacing", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "didExceedMaxLines", "getDidExceedMaxLines", "Landroidx/compose/ui/text/android/selection/WordIterator;", "backingWordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text", "getTopPadding$ui_text$annotations", "bottomPadding", "getBottomPadding$ui_text", "getBottomPadding$ui_text$annotations", "leftPadding", "F", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "backingLayoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextLayout {
    public static final int $stable = 8;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    public static /* synthetic */ void getBottomPadding$ui_text$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout staticLayoutCreate;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f && !z5) {
                this.isBoringLayout = true;
                z3 = true;
                staticLayoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, z2, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = false;
            } else {
                z3 = true;
                this.isBoringLayout = false;
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                staticLayoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristic2, alignment, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.layout = staticLayoutCreate;
            Trace.endSection();
            int iMin = Math.min(staticLayoutCreate.getLineCount(), i3);
            this.lineCount = iMin;
            int i9 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i3 && (staticLayoutCreate.getEllipsisCount(i9) > 0 || staticLayoutCreate.getLineEnd(i9) != charSequence.length())) ? z3 : z4;
            long verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m6450getTopPaddingimpl(verticalPaddings), VerticalPaddings.m6450getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m6449getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m6449getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i9)) : z4;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(staticLayoutCreate, i9, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(staticLayoutCreate, i9, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        this(charSequence, f, textPaint, i10, truncateAt2, i11, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & 262144) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i11) : layoutIntrinsics);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        WordIterator wordIterator2 = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    /* JADX INFO: renamed from: getTopPadding$ui_text, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    /* JADX INFO: renamed from: getBottomPadding$ui_text, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper == null) {
            LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
            this.backingLayoutHelper = layoutHelper2;
            return layoutHelper2;
        }
        Intrinsics.checkNotNull(layoutHelper);
        return layoutHelper;
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    private final float getHorizontalPadding(int p0) {
        if (p0 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    public final float getLineLeft(int p0) {
        return this.layout.getLineLeft(p0) + (p0 == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int p0) {
        return this.layout.getLineRight(p0) + (p0 == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final float getLineTop(int p0) {
        return this.layout.getLineTop(p0) + (p0 == 0 ? 0 : this.topPadding);
    }

    public final float getLineBottom(int p0) {
        if (p0 != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(p0) + (p0 == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(p0 - 1) + this.lastLineFontMetrics.bottom;
    }

    public final float getLineAscent(int p0) {
        int lineAscent;
        Paint.FontMetricsInt fontMetricsInt;
        if (p0 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineAscent = fontMetricsInt.ascent;
        } else {
            lineAscent = this.layout.getLineAscent(p0);
        }
        return lineAscent;
    }

    public final float getLineBaseline(int p0) {
        float lineBaseline;
        float f = this.topPadding;
        if (p0 == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            lineBaseline = getLineTop(p0) - this.lastLineFontMetrics.ascent;
        } else {
            lineBaseline = this.layout.getLineBaseline(p0);
        }
        return f + lineBaseline;
    }

    public final float getLineDescent(int p0) {
        int lineDescent;
        Paint.FontMetricsInt fontMetricsInt;
        if (p0 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineDescent = fontMetricsInt.descent;
        } else {
            lineDescent = this.layout.getLineDescent(p0);
        }
        return lineDescent;
    }

    public final float getLineHeight(int p0) {
        return getLineBottom(p0) - getLineTop(p0);
    }

    public final float getLineWidth(int p0) {
        return this.layout.getLineWidth(p0);
    }

    public final int getLineStart(int p0) {
        return this.layout.getLineStart(p0);
    }

    public final int getLineEnd(int p0) {
        if (TextLayout_androidKt.isLineEllipsized(this.layout, p0) && this.ellipsize == TextUtils.TruncateAt.END) {
            return this.layout.getText().length();
        }
        return this.layout.getLineEnd(p0);
    }

    public final int getLineVisibleEnd(int p0) {
        if (TextLayout_androidKt.isLineEllipsized(this.layout, p0) && this.ellipsize == TextUtils.TruncateAt.END) {
            return this.layout.getLineStart(p0) + this.layout.getEllipsisStart(p0);
        }
        return getLayoutHelper().getLineVisibleEnd(p0);
    }

    public final boolean isLineEllipsized(int p0) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, p0);
    }

    public final int getLineEllipsisOffset(int p0) {
        return this.layout.getEllipsisStart(p0);
    }

    public final int getLineEllipsisCount(int p0) {
        return this.layout.getEllipsisCount(p0);
    }

    public final int getLineForVertical(int p0) {
        return this.layout.getLineForVertical(p0 - this.topPadding);
    }

    public final int getOffsetForHorizontal(int p0, float p1) {
        return this.layout.getOffsetForHorizontal(p0, p1 + (getHorizontalPadding(p0) * (-1.0f)));
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public final float getPrimaryHorizontal(int p0, boolean p1) {
        return getLayoutHelper().getHorizontalPosition(p0, true, p1) + getHorizontalPadding(getLineForOffset(p0));
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final float getSecondaryHorizontal(int p0, boolean p1) {
        return getLayoutHelper().getHorizontalPosition(p0, false, p1) + getHorizontalPadding(getLineForOffset(p0));
    }

    public final int getLineForOffset(int p0) {
        return this.layout.getLineForOffset(p0);
    }

    public final boolean isRtlCharAt(int p0) {
        return this.layout.isRtlCharAt(p0);
    }

    public final int getParagraphDirection(int p0) {
        return this.layout.getParagraphDirection(p0);
    }

    public final void getSelectionPath(int p0, int p1, Path p2) {
        this.layout.getSelectionPath(p0, p1, p2);
        if (this.topPadding == 0 || p2.isEmpty()) {
            return;
        }
        p2.offset(0.0f, this.topPadding);
    }

    public final int[] getRangeForRect(RectF p0, int p1, Function2<? super RectF, ? super RectF, Boolean> p2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text(this, p0, p1, p2);
        }
        return TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), p0, p1, p2);
    }

    public final void fillLineHorizontalBounds$ui_text(int p0, float[] p1) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(p0);
        int lineEnd = getLineEnd(p0);
        if (p1.length < (lineEnd - lineStart) * 2) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        int i = 0;
        boolean z = getParagraphDirection(p0) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else if (z && zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(lineStart + 1);
            }
            p1[i] = secondaryDownstream;
            p1[i + 1] = secondaryUpstream;
            i += 2;
            lineStart++;
        }
    }

    public final void fillBoundingBoxes(int p0, int p1, float[] p2, int p3) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (p0 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (p0 >= length) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (p1 <= p0) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (p1 > length) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (p2.length - p3 < (p1 - p0) * 4) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(p0);
        int lineForOffset2 = getLineForOffset(p1 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLineStart(lineForOffset);
            int lineEnd = getLineEnd(lineForOffset);
            int iMin = Math.min(p1, lineEnd);
            float lineTop = getLineTop(lineForOffset);
            float lineBottom = getLineBottom(lineForOffset);
            boolean z = getParagraphDirection(lineForOffset) == 1;
            for (int iMax = Math.max(p0, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (z && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (!z && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                }
                p2[p3] = secondaryDownstream;
                p2[p3 + 1] = lineTop;
                p2[p3 + 2] = secondaryUpstream;
                p2[p3 + 3] = lineBottom;
                p3 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final RectF getBoundingBox(int p0) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(p0);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(p0);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(p0, false);
                primaryHorizontal2 = getSecondaryHorizontal(p0 + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(p0, false);
                primaryHorizontal2 = getPrimaryHorizontal(p0 + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(p0, false);
                secondaryHorizontal2 = getSecondaryHorizontal(p0 + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(p0, false);
            secondaryHorizontal2 = getPrimaryHorizontal(p0 + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final void paint(Canvas p0) {
        if (p0.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                p0.translate(0.0f, i);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(p0);
            this.layout.draw(textAndroidCanvas);
            int i2 = this.topPadding;
            if (i2 != 0) {
                p0.translate(0.0f, i2 * (-1.0f));
            }
        }
    }

    public final boolean isFallbackLinespacingApplied$ui_text() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            Intrinsics.checkNotNull(layout, "");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        Intrinsics.checkNotNull(layout2, "");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }
}
