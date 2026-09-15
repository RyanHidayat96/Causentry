package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b!\u0010 J\"\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0017¢\u0006\u0004\b*\u0010+JH\u0010.\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00100R.\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0003\u001a\u0004\u0018\u0001028\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0019\u0010D\u001a\u00020C8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010ER%\u0010G\u001a\u00020F8\u0001@\u0001X\u0081\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bG\u0010E\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u00100R\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u00100R\u0014\u0010S\u001a\u00020\u001c8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0019\u0010T\u001a\u00020\b8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u00100R$\u0010U\u001a\u0004\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0019\u0010]\u001a\u00020\u00148\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010ER\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010:R\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "", "p0", "Landroidx/compose/ui/text/TextStyle;", "p1", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p2", "Landroidx/compose/ui/text/style/TextOverflow;", "p3", "", "p4", "", "p5", "p6", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/text/Paragraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutText", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "", "markDirty", "()V", "maxIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "minIntrinsicWidth", "newLayoutWillBeDifferent-K40F9xA", "newLayoutWillBeDifferent", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextLayoutResult;", "toString", "()Ljava/lang/String;", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "cachedIntrinsicHeight", "I", "cachedIntrinsicHeightInputWidth", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "didOverflow", "Z", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "lastDensity", "J", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "maxLines", "minLines", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "observeFontChanges", "overflow", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "prevConstraints", "softWrap", "style", "Landroidx/compose/ui/text/TextStyle;", "text", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.lastDensity = InlineDensity.INSTANCE.m1619getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.INSTANCE.m6898fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }

    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        Density density2 = this.density;
        long jM1611constructorimpl = density != null ? InlineDensity.m1611constructorimpl(density) : InlineDensity.INSTANCE.m1619getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM1611constructorimpl;
        } else if (density == null || !InlineDensity.m1613equalsimpl0(this.lastDensity, jM1611constructorimpl)) {
            this.density = density;
            this.lastDensity = jM1611constructorimpl;
            markDirty();
        }
    }

    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getParagraph$foundation_release, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final void setParagraph$foundation_release(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    /* JADX INFO: renamed from: getDidOverflow$foundation_release, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.didOverflow = z;
    }

    /* JADX INFO: renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    /* JADX INFO: renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m1635setLayoutSizeozmzZPI$foundation_release(long j) {
        this.layoutSize = j;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1634layoutWithConstraintsK40F9xA(long p0, LayoutDirection p1) {
        boolean z = true;
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, p1, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = minLinesConstrainerFrom;
            p0 = minLinesConstrainerFrom.m1623coerceMinLinesOh53vG4$foundation_release(p0, this.minLines);
        }
        boolean z2 = false;
        if (!m1632newLayoutWillBeDifferentK40F9xA(p0, p1)) {
            if (!Constraints.m6881equalsimpl0(p0, this.prevConstraints)) {
                Paragraph paragraph = this.paragraph;
                Intrinsics.checkNotNull(paragraph);
                long jM6902constrain4WqzIAM = ConstraintsKt.m6902constrain4WqzIAM(p0, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                this.layoutSize = jM6902constrain4WqzIAM;
                if (TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6874getVisiblegIe3tQ8()) || (IntSize.m7106getWidthimpl(jM6902constrain4WqzIAM) >= paragraph.getWidth() && IntSize.m7105getHeightimpl(jM6902constrain4WqzIAM) >= paragraph.getHeight())) {
                    z = false;
                }
                this.didOverflow = z;
                this.prevConstraints = p0;
            }
            return false;
        }
        Paragraph paragraphM1631layoutTextK40F9xA = m1631layoutTextK40F9xA(p0, p1);
        this.prevConstraints = p0;
        long jM6902constrain4WqzIAM2 = ConstraintsKt.m6902constrain4WqzIAM(p0, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraphM1631layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(paragraphM1631layoutTextK40F9xA.getHeight())));
        this.layoutSize = jM6902constrain4WqzIAM2;
        if (!TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6874getVisiblegIe3tQ8()) && (IntSize.m7106getWidthimpl(jM6902constrain4WqzIAM2) < paragraphM1631layoutTextK40F9xA.getWidth() || IntSize.m7105getHeightimpl(jM6902constrain4WqzIAM2) < paragraphM1631layoutTextK40F9xA.getHeight())) {
            z2 = true;
        }
        this.didOverflow = z2;
        this.paragraph = paragraphM1631layoutTextK40F9xA;
        return true;
    }

    public final int intrinsicHeight(int p0, LayoutDirection p1) {
        int i = this.cachedIntrinsicHeightInputWidth;
        int i2 = this.cachedIntrinsicHeight;
        if (p0 == i && i != -1) {
            return i2;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m1631layoutTextK40F9xA(ConstraintsKt.Constraints(0, p0, 0, Integer.MAX_VALUE), p1).getHeight());
        this.cachedIntrinsicHeightInputWidth = p0;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m1636updateL6sJoHM(String p0, TextStyle p1, FontFamily.Resolver p2, int p3, boolean p4, int p5, int p6) {
        this.text = p0;
        this.style = p1;
        this.fontFamilyResolver = p2;
        this.overflow = p3;
        this.softWrap = p4;
        this.maxLines = p5;
        this.minLines = p6;
        markDirty();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection p0) {
        ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = this.paragraphIntrinsics;
        if (paragraphIntrinsicsParagraphIntrinsics$default == null || p0 != this.intrinsicsLayoutDirection || paragraphIntrinsicsParagraphIntrinsics$default.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = p0;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, p0);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsicsParagraphIntrinsics$default = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, textStyleResolveDefaults, (List) null, (List) null, density, this.fontFamilyResolver, 12, (Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsicsParagraphIntrinsics$default;
        return paragraphIntrinsicsParagraphIntrinsics$default;
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final Paragraph m1631layoutTextK40F9xA(long p0, LayoutDirection p1) {
        ParagraphIntrinsics layoutDirection = setLayoutDirection(p1);
        return ParagraphKt.m6259Paragraph_EkL_Y(layoutDirection, LayoutUtilsKt.m1620finalConstraintstfFHcEY(p0, this.softWrap, this.overflow, layoutDirection.getMaxIntrinsicWidth()), LayoutUtilsKt.m1621finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()));
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m1632newLayoutWillBeDifferentK40F9xA(long p0, LayoutDirection p1) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || p1 != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m6881equalsimpl0(p0, this.prevConstraints)) {
            return false;
        }
        return Constraints.m6888getMaxWidthimpl(p0) != Constraints.m6888getMaxWidthimpl(this.prevConstraints) || ((float) Constraints.m6887getMaxHeightimpl(p0)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.INSTANCE.m6898fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle p0) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jM6878copyZbe2FdA$default = Constraints.m6878copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, p0, CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM6878copyZbe2FdA$default, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, p0, (List<AnnotatedString.Range<Placeholder>>) CollectionsKt.emptyList(), density, this.fontFamilyResolver), jM6878copyZbe2FdA$default, this.maxLines, TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()), (DefaultConstructorMarker) null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(LayoutDirection p0) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(p0).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(LayoutDirection p0) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(p0).getMaxIntrinsicWidth());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m1617toStringimpl(this.lastDensity));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }
}
