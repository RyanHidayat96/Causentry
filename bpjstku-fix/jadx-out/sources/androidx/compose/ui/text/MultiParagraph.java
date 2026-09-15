package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fB[\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\n\u0010\u001bB[\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u001dB[\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u001eB[\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u001fJ9\u0010'\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020!2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&JM\u0010'\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020!2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020)¢\u0006\u0004\b*\u0010+JU\u0010'\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020,2\b\b\u0002\u0010\u0007\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0018\u001a\u00020)¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u0015\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u000204¢\u0006\u0004\b5\u00106J%\u0010>\u001a\u00020;2\u0006\u0010\u0003\u001a\u0002082\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u0007\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b?\u0010@J'\u0010D\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020A2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020G2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\bJ\u0010IJ\u0015\u0010M\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\bN\u0010@J\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\u0015\u0010U\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bV\u0010RJ\u0015\u0010W\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bW\u0010RJ\u0015\u0010X\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bX\u0010RJ\u0015\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bY\u0010PJ\u001f\u0010Z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\f¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010_J\u0017\u0010a\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010_R\u001a\u0010b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0011\u0010o\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010q\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bp\u0010nR\u001a\u0010r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010nR\u001a\u0010y\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010w\u001a\u0004\bz\u0010nR\u0011\u0010|\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b{\u0010nR\u0011\u0010~\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b}\u0010nR\u001b\u0010\u007f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010g\u001a\u0005\b\u0080\u0001\u0010iR'\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00128\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00128\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "", "p2", "Landroidx/compose/ui/text/style/TextOverflow;", "p3", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "p4", "p5", "Landroidx/compose/ui/unit/Density;", "p6", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "p7", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/style/TextDecoration;", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/graphics/BlendMode;", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextGranularity;", "Landroidx/compose/ui/text/TextInclusionStrategy;", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "requireIndexInRange", "(I)V", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "I", "getMaxLines", "()I", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "width", "F", "getWidth", "height", "getHeight", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "lineCount", "getLineCount", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2) {
        boolean z;
        int iM6887getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m6890getMinWidthimpl(j) != 0 || Constraints.m6889getMinHeightimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text = multiParagraphIntrinsics.getInfoList$ui_text();
        int size = infoList$ui_text.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text.get(i5);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
            if (Constraints.m6883getHasBoundedHeightimpl(j)) {
                iM6887getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m6887getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f), i3);
            } else {
                iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
            }
            Paragraph paragraphM6261ParagraphczeNHc = ParagraphKt.m6261ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM6888getMaxWidthimpl, 0, iM6887getMaxHeightimpl, 5, null), this.maxLines - i4, i2);
            float height = f + paragraphM6261ParagraphczeNHc.getHeight();
            int lineCount = i4 + paragraphM6261ParagraphczeNHc.getLineCount();
            List<ParagraphIntrinsicInfo> list = infoList$ui_text;
            arrayList.add(new ParagraphInfo(paragraphM6261ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f, height));
            if (paragraphM6261ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i5 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text()))) {
                z = true;
                i4 = lineCount;
                f = height;
                break;
            } else {
                i5++;
                i4 = lineCount;
                f = height;
                i3 = 0;
                infoList$ui_text = list;
            }
        }
        this.height = f;
        this.lineCount = i4;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m6888getMaxWidthimpl(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ArrayList arrayList4 = arrayList3;
                Rect rect = placeholderRects.get(i7);
                arrayList4.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        ArrayList arrayListPlus = arrayList2;
        if (arrayListPlus.size() < this.intrinsics.getPlaceholders().size()) {
            ArrayList arrayList5 = arrayListPlus;
            int size4 = this.intrinsics.getPlaceholders().size() - arrayListPlus.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList6.add(null);
            }
            arrayListPlus = CollectionsKt.plus((Collection) arrayList5, (Iterable) arrayList6);
        }
        this.placeholderRects = arrayListPlus;
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        this(multiParagraphIntrinsics, j, i, z ? TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m6870getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, jConstraints$default, i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 4) != 0 ? CollectionsKt.emptyList() : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 32) != 0 ? CollectionsKt.emptyList() : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z);
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, j, i, z ? companion.m6871getEllipsisgIe3tQ8() : companion.m6870getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i, (i3 & 128) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i2, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, i2, (DefaultConstructorMarker) null);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m6235paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Color.INSTANCE.m4254getUnspecified0d7_KjU();
        }
        multiParagraph.m6242paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m6242paintRPmYEkk(Canvas p0, long p1, Shadow p2, TextDecoration p3) {
        p0.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            Paragraph.m6246paintLG529CI$default(paragraphInfo.getParagraph(), p0, p1, p2, p3, null, 0, 48, null);
            p0.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        p0.restore();
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m6241paintLG529CI(Canvas p0, long p1, Shadow p2, TextDecoration p3, DrawStyle p4, int p5) {
        p0.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo6194paintLG529CI(p0, p1, p2, p3, p4, p5);
            p0.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        p0.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m6243painthn5TExg(Canvas p0, Brush p1, float p2, Shadow p3, TextDecoration p4, DrawStyle p5, int p6) {
        AndroidMultiParagraphDraw_androidKt.m6655drawMultiParagraph7AXcY_I(this, p0, p1, p2, p3, p4, p5, p6);
    }

    public final Path getPathForRange(final int p0, final int p1) {
        if (p0 < 0 || p0 > p1 || p1 > getAnnotatedString().getText().length()) {
            StringBuilder sb = new StringBuilder("Start(");
            sb.append(p0);
            sb.append(") or End(");
            sb.append(p1);
            sb.append(") is out of range [0..");
            sb.append(getAnnotatedString().getText().length());
            sb.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (p0 == p1) {
            return AndroidPath_androidKt.Path();
        }
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m6245findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(p0, p1), new Function1() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiParagraph.getPathForRange$lambda$11(Path, p0, p1, (ParagraphInfo) obj);
            }
        });
        return Path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPathForRange$lambda$11(Path path, int i, int i2, ParagraphInfo paragraphInfo) {
        Path.m4501addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
        return Unit.INSTANCE;
    }

    public final int getLineForVerticalPosition(float p0) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, p0));
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(p0)));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m6238getOffsetForPositionk4lQ0M(long p0) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & p0))));
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo6190getOffsetForPositionk4lQ0M(paragraphInfo.m6254toLocalMKHz9U(p0)));
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m6239getRangeForRect86BmAI(Rect p0, int p1, TextInclusionStrategy p2) {
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, p0.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= p0.getBottom() || iFindParagraphByY == CollectionsKt.getLastIndex(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m6252toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo6192getRangeForRect86BmAI(paragraphInfo.toLocal(p0), p1, p2), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, p0.getBottom());
        long jM6402getZerod9O1mEE = TextRange.INSTANCE.m6402getZerod9O1mEE();
        while (TextRange.m6390equalsimpl0(jM6402getZerod9O1mEE, TextRange.INSTANCE.m6402getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM6402getZerod9O1mEE = ParagraphInfo.m6252toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo6192getRangeForRect86BmAI(paragraphInfo2.toLocal(p0), p1, p2), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m6390equalsimpl0(jM6402getZerod9O1mEE, TextRange.INSTANCE.m6402getZerod9O1mEE())) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        long jM6402getZerod9O1mEE2 = TextRange.INSTANCE.m6402getZerod9O1mEE();
        while (TextRange.m6390equalsimpl0(jM6402getZerod9O1mEE2, TextRange.INSTANCE.m6402getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM6402getZerod9O1mEE2 = ParagraphInfo.m6252toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo6192getRangeForRect86BmAI(paragraphInfo3.toLocal(p0), p1, p2), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m6390equalsimpl0(jM6402getZerod9O1mEE2, TextRange.INSTANCE.m6402getZerod9O1mEE()) ? jM6402getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m6397getStartimpl(jM6402getZerod9O1mEE), TextRange.m6392getEndimpl(jM6402getZerod9O1mEE2));
    }

    public final Rect getBoundingBox(int p0) {
        requireIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(p0)));
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m6237fillBoundingBoxes8ffj60Q(final long p0, final float[] p1, int p2) {
        requireIndexInRange(TextRange.m6395getMinimpl(p0));
        requireIndexInRangeInclusiveEnd(TextRange.m6394getMaximpl(p0));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = p2;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.m6245findParagraphsByRangeSbBc2M(this.paragraphInfoList, p0, new Function1() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$19(p0, p1, intRef, floatRef, (ParagraphInfo) obj);
            }
        });
        return p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillBoundingBoxes_8ffj60Q$lambda$19(long j, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef, ParagraphInfo paragraphInfo) {
        long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m6395getMinimpl(j) ? paragraphInfo.getStartIndex() : TextRange.m6395getMinimpl(j)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m6394getMaximpl(j) ? paragraphInfo.getEndIndex() : TextRange.m6394getMaximpl(j)));
        paragraphInfo.getParagraph().mo6188fillBoundingBoxes8ffj60Q(jTextRange, fArr, intRef.element);
        int iM6393getLengthimpl = intRef.element + (TextRange.m6393getLengthimpl(jTextRange) * 4);
        for (int i = intRef.element; i < iM6393getLengthimpl; i += 4) {
            int i2 = i + 1;
            fArr[i2] = fArr[i2] + floatRef.element;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + floatRef.element;
        }
        intRef.element = iM6393getLengthimpl;
        floatRef.element += paragraphInfo.getParagraph().getHeight();
        return Unit.INSTANCE;
    }

    public final float getHorizontalPosition(int p0, boolean p1) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(p0);
        if (p0 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(p0), p1);
    }

    public final ResolvedTextDirection getParagraphDirection(int p0) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(p0);
        if (p0 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(p0));
    }

    public final ResolvedTextDirection getBidiRunDirection(int p0) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(p0);
        if (p0 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(p0));
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m6240getWordBoundaryjx7JFs(int p0) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(p0);
        if (p0 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.m6253toGlobalxdX6G0(paragraphInfo.getParagraph().mo6193getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(p0)), false);
    }

    public final Rect getCursorRect(int p0) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(p0);
        if (p0 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(p0)));
    }

    public final int getLineForOffset(int p0) {
        int iFindParagraphByIndex;
        if (p0 >= getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = p0 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, p0);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(p0)));
    }

    public final float getLineLeft(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(p0));
    }

    public final float getLineRight(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(p0));
    }

    public final float getLineTop(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(p0)));
    }

    public final float getLineBaseline(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(p0)));
    }

    public final float getLineBottom(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(p0)));
    }

    public final float getLineHeight(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(p0));
    }

    public final float getLineWidth(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(p0));
    }

    public final int getLineStart(int p0) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(p0)));
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    public final int getLineEnd(int p0, boolean p1) {
        requireLineIndexInRange(p0);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(p0), p1));
    }

    public final boolean isLineEllipsized(int p0) {
        requireLineIndexInRange(p0);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, p0)).getParagraph().isLineEllipsized(p0);
    }

    private final void requireIndexInRange(int p0) {
        if (p0 < 0 || p0 >= getAnnotatedString().getText().length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(getAnnotatedString().length());
            sb.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int p0) {
        if (p0 < 0 || p0 > getAnnotatedString().getText().length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(getAnnotatedString().length());
            sb.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final void requireLineIndexInRange(int p0) {
        if (p0 < 0 || p0 >= this.lineCount) {
            StringBuilder sb = new StringBuilder("lineIndex(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(this.lineCount);
            sb.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, i2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, z);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, i2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }
}
