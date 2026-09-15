package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0087\u0001\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJq\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001f2\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000fH\u0007¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "", "p3", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/style/TextOverflow;", "", "p4", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "p5", "Landroidx/compose/ui/unit/Constraints;", "p6", "p7", "p8", "p9", "p10", "Landroidx/compose/ui/text/TextLayoutResult;", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "measure", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "I", "Landroidx/compose/ui/text/TextLayoutCache;", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextMeasurer {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? 8 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6371measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        return textMeasurer.m6373measurexDpz5zY(annotatedString, (i3 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (i3 & 4) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & 256) != 0 ? textMeasurer.defaultDensity : density, (i3 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & 1024) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m6373measurexDpz5zY(AnnotatedString p0, TextStyle p1, int p2, boolean p3, int p4, List<AnnotatedString.Range<Placeholder>> p5, long p6, LayoutDirection p7, Density p8, FontFamily.Resolver p9, boolean p10) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(p0, p1, p5, p4, p3, p2, p8, p7, p9, p6, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (p10 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m6366copyO0kMr_c(textLayoutInput, ConstraintsKt.m6902constrain4WqzIAM(p6, IntSize.m7101constructorimpl((((long) ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight())) & 4294967295L) | (((long) ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth())) << 32))));
        }
        TextLayoutResult textLayoutResultLayout = INSTANCE.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        }
        return textLayoutResultLayout;
    }

    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m6372measurewNUYSr0(String p0, TextStyle p1, int p2, boolean p3, int p4, long p5, LayoutDirection p6, Density p7, FontFamily.Resolver p8, boolean p9) {
        return m6371measurexDpz5zY$default(this, new AnnotatedString(p0, null, 2, null), p1, p2, p3, p4, null, p5, p6, p7, p8, p9, 32, null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextLayoutInput;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "layout", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput p0) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(p0.getText(), TextStyleKt.resolveDefaults(p0.getStyle(), p0.getLayoutDirection()), p0.getPlaceholders(), p0.getDensity(), p0.getFontFamilyResolver());
            int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(p0.getConstraints());
            int iM6888getMaxWidthimpl = ((p0.getSoftWrap() || TextMeasurerKt.m6375isEllipsisMW5ApA(p0.getOverflow())) && Constraints.m6884getHasBoundedWidthimpl(p0.getConstraints())) ? Constraints.m6888getMaxWidthimpl(p0.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (p0.getSoftWrap() || !TextMeasurerKt.m6375isEllipsisMW5ApA(p0.getOverflow())) ? p0.getMaxLines() : 1;
            if (iM6890getMinWidthimpl != iM6888getMaxWidthimpl) {
                iM6888getMaxWidthimpl = RangesKt.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM6890getMinWidthimpl, iM6888getMaxWidthimpl);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, Constraints.INSTANCE.m6897fitPrioritizingWidthZbe2FdA(0, iM6888getMaxWidthimpl, 0, Constraints.m6887getMaxHeightimpl(p0.getConstraints())), maxLines, p0.getOverflow(), (DefaultConstructorMarker) null);
            return new TextLayoutResult(p0, multiParagraph, ConstraintsKt.m6902constrain4WqzIAM(p0.getConstraints(), IntSize.m7101constructorimpl((((long) ((int) Math.ceil(multiParagraph.getHeight()))) & 4294967295L) | (((long) ((int) Math.ceil(multiParagraph.getWidth()))) << 32))), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
