package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 V2\u00020\u0001:\u0001VBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010#\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00188\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001fR\u0011\u00103\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00102R\u0011\u00108\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b7\u00102R\u001a\u00109\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00102R\u0014\u0010>\u001a\u00020;8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001d\u0010?\u001a\u00020\u000b8\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00102R$\u0010A\u001a\u0004\u0018\u00010;8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010=\"\u0004\bD\u0010ER&\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "Landroidx/compose/ui/text/TextStyle;", "p1", "", "p2", "p3", "", "p4", "Landroidx/compose/ui/text/style/TextOverflow;", "p5", "Landroidx/compose/ui/unit/Density;", "p6", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p7", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "p8", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/TextLayoutResult;", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layout", "", "layoutIntrinsics", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/text/MultiParagraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutText", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "getMaxIntrinsicWidth", "()I", "maxIntrinsicWidth", "maxLines", "I", "getMaxLines", "getMinIntrinsicWidth", "minIntrinsicWidth", "minLines", "getMinLines", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getNonNullIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "nonNullIntrinsics", "overflow", "getOverflow-gIe3tQ8", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "placeholders", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "softWrap", "Z", "getSoftWrap", "()Z", "style", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextDelegate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (i <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i2 > i) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i3, density, resolver, (i4 & 256) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: getParagraphIntrinsics$foundation_release, reason: from getter */
    public final MultiParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* JADX INFO: renamed from: getIntrinsicsLayoutDirection$foundation_release, reason: from getter */
    public final LayoutDirection getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final void layoutIntrinsics(LayoutDirection p0) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || p0 != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = p0;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, p0), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1374layoutTextK40F9xA(long p0, LayoutDirection p1) {
        layoutIntrinsics(p1);
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(p0);
        int iM6888getMaxWidthimpl = ((this.softWrap || TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) && Constraints.m6884getHasBoundedWidthimpl(p0)) ? Constraints.m6888getMaxWidthimpl(p0) : Integer.MAX_VALUE;
        int i = (this.softWrap || !TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (iM6890getMinWidthimpl != iM6888getMaxWidthimpl) {
            iM6888getMaxWidthimpl = RangesKt.coerceIn(getMaxIntrinsicWidth(), iM6890getMinWidthimpl, iM6888getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.INSTANCE.m6897fitPrioritizingWidthZbe2FdA(0, iM6888getMaxWidthimpl, 0, Constraints.m6887getMaxHeightimpl(p0)), i, TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m1373layoutNN6EwU$default(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
        if ((i & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m1376layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m1376layoutNN6EwU(long p0, LayoutDirection p1, TextLayoutResult p2) {
        if (p2 != null && TextLayoutHelperKt.m1409canReuse7_7YC6M(p2, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, p1, this.fontFamilyResolver, p0)) {
            return p2.m6366copyO0kMr_c(new TextLayoutInput(p2.getLayoutInput().getText(), this.style, p2.getLayoutInput().getPlaceholders(), p2.getLayoutInput().getMaxLines(), p2.getLayoutInput().getSoftWrap(), p2.getLayoutInput().getOverflow(), p2.getLayoutInput().getDensity(), p2.getLayoutInput().getLayoutDirection(), p2.getLayoutInput().getFontFamilyResolver(), p0, (DefaultConstructorMarker) null), ConstraintsKt.m6902constrain4WqzIAM(p0, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(p2.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(p2.getMultiParagraph().getHeight()))));
        }
        MultiParagraph multiParagraphM1374layoutTextK40F9xA = m1374layoutTextK40F9xA(p0, p1);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, p1, this.fontFamilyResolver, p0, (DefaultConstructorMarker) null), multiParagraphM1374layoutTextK40F9xA, ConstraintsKt.m6902constrain4WqzIAM(p0, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraphM1374layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraphM1374layoutTextK40F9xA.getHeight()))), null);
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i, i2, z, i3, density, resolver, list);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void paint(Canvas p0, TextLayoutResult p1) {
            TextPainter.INSTANCE.paint(p0, p1);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
