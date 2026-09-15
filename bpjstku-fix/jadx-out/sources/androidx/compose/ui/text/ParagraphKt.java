package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00172\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001aw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00172\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00172\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010 \u001a3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"\u001a3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\u001cH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\n*\u00020\u000eH\u0000¢\u0006\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\n8\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"", "p0", "Landroidx/compose/ui/text/TextStyle;", "p1", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "p2", "Landroidx/compose/ui/text/Placeholder;", "p3", "", "p4", "", "p5", "", "p6", "Landroidx/compose/ui/unit/Density;", "p7", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "p8", "Landroidx/compose/ui/text/Paragraph;", "Paragraph", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/unit/Constraints;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/style/TextOverflow;", "Paragraph-Ul8oQg4", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;II)Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "(Landroidx/compose/ui/text/ParagraphIntrinsics;IZF)Landroidx/compose/ui/text/Paragraph;", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "Paragraph-czeN-Hc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JII)Landroidx/compose/ui/text/Paragraph;", "ceilToInt", "(F)I", "DefaultMaxLines", "I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i, z, f, density, resourceLoader);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6661ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null), density, resolver);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    /* JADX INFO: renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6255ParagraphUdtVg6A(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6661ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), j, density, resolver);
    }

    /* JADX INFO: renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m6257ParagraphUl8oQg4(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6661ActualParagraphXGqx6AY(str, textStyle, list, list2, i, i2, j, density, resolver);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Paragraph(paragraphIntrinsics, i, z, f);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6660ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m6870getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null));
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6260Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m6259Paragraph_EkL_Y(paragraphIntrinsics, j, i, z);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    /* JADX INFO: renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6259Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6660ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m6870getClipgIe3tQ8(), j);
    }

    /* JADX INFO: renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6262ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = TextOverflow.INSTANCE.m6870getClipgIe3tQ8();
        }
        return m6261ParagraphczeNHc(paragraphIntrinsics, j, i, i2);
    }

    /* JADX INFO: renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m6261ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6660ActualParagraph4FmOz70(paragraphIntrinsics, i, i2, j);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }
}
