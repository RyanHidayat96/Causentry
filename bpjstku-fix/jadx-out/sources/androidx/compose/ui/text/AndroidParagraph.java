package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBk\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\u0006\u0010\u0005\u001a\u00020\r\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\n\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010'\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b2\u0010)J\u0017\u00105\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b:\u00107J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u00107J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b<\u00107J\u0017\u0010=\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u00107J\u0017\u0010>\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020B2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\bG\u0010AJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\bH\u0010AJ\u0017\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010AJ\u001f\u0010J\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020BH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020L2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\bO\u0010NJ\u001b\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q*\u00020PH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010W\u001a\u00020B*\u00020U2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030VH\u0002¢\u0006\u0004\bW\u0010XJ3\u0010_\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020Y2\u0006\u0010\u0005\u001a\u00020Z2\b\u0010\u0007\u001a\u0004\u0018\u00010[2\b\u0010\t\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^JE\u0010_\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020Y2\u0006\u0010\u0005\u001a\u00020Z2\b\u0010\u0007\u001a\u0004\u0018\u00010[2\b\u0010\t\u001a\u0004\u0018\u00010\\2\b\u0010\u0012\u001a\u0004\u0018\u00010`2\u0006\u0010\u0013\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJM\u0010_\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020Y2\u0006\u0010\u0005\u001a\u00020d2\u0006\u0010\u0007\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010[2\b\u0010\u0012\u001a\u0004\u0018\u00010\\2\b\u0010\u0013\u001a\u0004\u0018\u00010`2\u0006\u0010\u0014\u001a\u00020aH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010_\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020YH\u0002¢\u0006\u0004\b_\u0010gJ[\u0010j\u001a\u00020P2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010h2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010p\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010q\u001a\u0004\bu\u0010sR\u001a\u0010v\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020P8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010|\u001a\u00020i8\u0001X\u0081\u0004¢\u0006\u0014\n\u0004\b|\u0010}\u0012\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0084\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001R\u0017\u0010\u0091\u0001\u001a\u00020B8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018AX\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0095\u0001\u0010\u0081\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0098\u0001\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010sR'\u0010\u0099\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000e8\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R \u0010¡\u0001\u001a\u00030\u009d\u00018AX\u0081\u0004¢\u0006\u0010\u0012\u0006\b \u0001\u0010\u0081\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "p0", "", "p1", "Landroidx/compose/ui/text/style/TextOverflow;", "p2", "Landroidx/compose/ui/unit/Constraints;", "p3", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/text/Placeholder;", "p4", "p5", "p6", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p7", "Landroidx/compose/ui/unit/Density;", "p8", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextGranularity;", "Landroidx/compose/ui/text/TextInclusionStrategy;", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineAscent$ui_text", "getLineBaseline", "getLineDescent$ui_text", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset$ui_text", "getLineEllipsisCount$ui_text", "getLineForOffset", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "getShaderBrushSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "hasSpan", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/graphics/BlendMode;", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/text/TextUtils$TruncateAt;", "", "constructTextLayout", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "maxLines", "I", "getMaxLines", "()I", "overflow", "getOverflow-gIe3tQ8", "constraints", "J", "getConstraints-msEJaDk", "()J", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "charSequence", "Ljava/lang/CharSequence;", "getCharSequence$ui_text", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text$annotations", "()V", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "Ljava/util/Locale;", "getTextLocale$ui_text", "()Ljava/util/Locale;", "getTextLocale$ui_text$annotations", "textLocale", "getLineCount", "lineCount", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text$annotations", "textPaint"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getCharSequence$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0165  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f2 A[LOOP:0: B:53:0x01ec->B:55:0x01f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x021b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0221  */
    /* JADX WARN: Code duplicated, block: B:61:0x023b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0251  */
    /* JADX WARN: Code duplicated, block: B:64:0x0253  */
    /* JADX WARN: Code duplicated, block: B:70:0x0266  */
    /* JADX WARN: Code duplicated, block: B:73:0x026f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0271  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0221, please report this as an issue */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j) {
        CharSequence charSequence;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        TextLayout textLayoutConstructTextLayout$default;
        boolean z;
        ShaderBrushSpan[] shaderBrushSpans;
        CharSequence charSequence2;
        Spanned spanned;
        ArrayList arrayList;
        int i3;
        ArrayList arrayListEmptyList;
        int spanEnd;
        int lineForOffset;
        boolean z2;
        boolean z3;
        boolean z4;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        Iterator it;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.overflow = i2;
        this.constraints = j;
        if (Constraints.m6889getMinHeightimpl(j) != 0 || Constraints.m6890getMinWidthimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        if (AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()))) {
            charSequence = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence());
        } else {
            charSequence = androidParagraphIntrinsics.getCharSequence();
        }
        CharSequence charSequence3 = charSequence;
        this.charSequence = charSequence3;
        int iM6203toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m6203toLayoutAlignaXe7zB0(style.m6438getTextAligne0LSkKk());
        boolean zM6815equalsimpl0 = TextAlign.m6815equalsimpl0(style.m6438getTextAligne0LSkKk(), TextAlign.INSTANCE.m6821getJustifye0LSkKk());
        int iM6205toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m6205toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle().getHyphens());
        int iM6204toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m6204toLayoutBreakStrategyxImikfE(LineBreak.m6727getStrategyfcGXIks(style.m6435getLineBreakrAG3T2k()));
        int iM6206toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m6206toLayoutLineBreakStylehpcqdu8(LineBreak.m6728getStrictnessusljTpc(style.m6435getLineBreakrAG3T2k()));
        int iM6207toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m6207toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m6729getWordBreakjp8hJ3c(style.m6435getLineBreakrAG3T2k()));
        if (TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (!TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6872getMiddleEllipsisgIe3tQ8())) {
                if (TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6873getStartEllipsisgIe3tQ8())) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM6203toLayoutAlignaXe7zB0, zM6815equalsimpl0 ? 1 : 0, truncateAt, i, iM6205toLayoutHyphenationFrequency3fSNIE, iM6204toLayoutBreakStrategyxImikfE, iM6206toLayoutLineBreakStylehpcqdu8, iM6207toLayoutLineBreakWordStylewPN0Rpw, null, 256, null);
                z = true;
                if (Build.VERSION.SDK_INT >= 35 && getTextPaint$ui_text().getLetterSpacing() != 0.0f && ((TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6873getStartEllipsisgIe3tQ8()) || TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6872getMiddleEllipsisgIe3tQ8())) && textLayoutConstructTextLayout$default.getLineEllipsisCount(0) > 0)) {
                    int lineEllipsisOffset = textLayoutConstructTextLayout$default.getLineEllipsisOffset(0);
                    textLayoutConstructTextLayout$default = constructTextLayout(iM6203toLayoutAlignaXe7zB0, zM6815equalsimpl0 ? 1 : 0, truncateAt, i, iM6205toLayoutHyphenationFrequency3fSNIE, iM6204toLayoutBreakStrategyxImikfE, iM6206toLayoutLineBreakStylehpcqdu8, iM6207toLayoutLineBreakWordStylewPN0Rpw, TextUtils.concat(charSequence3.subSequence(0, lineEllipsisOffset), "…", charSequence3.subSequence(textLayoutConstructTextLayout$default.getLineEllipsisCount(0) + lineEllipsisOffset, charSequence3.length())));
                }
                if (!TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()) && textLayoutConstructTextLayout$default.getHeight() > Constraints.m6887getMaxHeightimpl(j) && i > z) {
                    int iNumberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(textLayoutConstructTextLayout$default, Constraints.m6887getMaxHeightimpl(j));
                    if (iNumberOfLinesThatFitMaxHeight >= 0 && iNumberOfLinesThatFitMaxHeight != i) {
                        textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM6203toLayoutAlignaXe7zB0, zM6815equalsimpl0 ? 1 : 0, truncateAt, RangesKt.coerceAtLeast(iNumberOfLinesThatFitMaxHeight, (int) z), iM6205toLayoutHyphenationFrequency3fSNIE, iM6204toLayoutBreakStrategyxImikfE, iM6206toLayoutLineBreakStylehpcqdu8, iM6207toLayoutLineBreakWordStylewPN0Rpw, null, 256, null);
                    }
                    this.layout = textLayoutConstructTextLayout$default;
                } else {
                    z = z;
                    this.layout = textLayoutConstructTextLayout$default;
                }
                getTextPaint$ui_text().m6667setBrush12SF9DM(style.getBrush(), Size.m4034constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), style.getAlpha());
                shaderBrushSpans = getShaderBrushSpans(this.layout);
                if (shaderBrushSpans != null) {
                    it = ArrayIteratorKt.iterator(shaderBrushSpans);
                    while (it.hasNext()) {
                        ((ShaderBrushSpan) it.next()).m6690setSizeuvyYCjk(Size.m4034constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
                    }
                }
                charSequence2 = this.charSequence;
                if (charSequence2 instanceof Spanned) {
                    spanned = (Spanned) charSequence2;
                    Object[] spans = spanned.getSpans(0, charSequence2.length(), PlaceholderSpan.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                        int spanStart = spanned.getSpanStart(placeholderSpan);
                        spanEnd = spanned.getSpanEnd(placeholderSpan);
                        lineForOffset = this.layout.getLineForOffset(spanStart);
                        if (lineForOffset >= this.maxLines) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (this.layout.getLineEllipsisCount(lineForOffset) > 0 || spanEnd <= this.layout.getLineEllipsisOffset(lineForOffset)) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (spanEnd > this.layout.getLineEnd(lineForOffset)) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4 || z2) {
                            rect = null;
                        } else {
                            int i4 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                            if (i4 == z) {
                                horizontalPosition = getHorizontalPosition(spanStart, z);
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                horizontalPosition = getHorizontalPosition(spanStart, z) - placeholderSpan.getWidthPx();
                            }
                            float widthPx = placeholderSpan.getWidthPx();
                            TextLayout textLayout = this.layout;
                            switch (placeholderSpan.getVerticalAlign()) {
                                case 0:
                                    lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 1:
                                    lineTop = textLayout.getLineTop(lineForOffset);
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 2:
                                    lineBaseline = textLayout.getLineBottom(lineForOffset);
                                    heightPx = placeholderSpan.getHeightPx();
                                    lineTop = lineBaseline - heightPx;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 3:
                                    lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 4:
                                    heightPx2 = placeholderSpan.getFontMetrics().ascent;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = heightPx2 + lineBaseline2;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 5:
                                    lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                    heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                    lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                    lineTop = heightPx2 + lineBaseline2;
                                    rect = new Rect(horizontalPosition, lineTop, widthPx + horizontalPosition, placeholderSpan.getHeightPx() + lineTop);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        }
                        arrayList.add(rect);
                    }
                    arrayListEmptyList = arrayList;
                } else {
                    arrayListEmptyList = CollectionsKt.emptyList();
                }
                this.placeholderRects = arrayListEmptyList;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        truncateAt = truncateAt2;
        textLayoutConstructTextLayout$default = constructTextLayout$default(this, iM6203toLayoutAlignaXe7zB0, zM6815equalsimpl0 ? 1 : 0, truncateAt, i, iM6205toLayoutHyphenationFrequency3fSNIE, iM6204toLayoutBreakStrategyxImikfE, iM6206toLayoutLineBreakStylehpcqdu8, iM6207toLayoutLineBreakWordStylewPN0Rpw, null, 256, null);
        z = true;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (!TextOverflow.m6861equalsimpl0(i2, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) {
            z = z;
            this.layout = textLayoutConstructTextLayout$default;
        } else {
            z = z;
            this.layout = textLayoutConstructTextLayout$default;
        }
        getTextPaint$ui_text().m6667setBrush12SF9DM(style.getBrush(), Size.m4034constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), style.getAlpha());
        shaderBrushSpans = getShaderBrushSpans(this.layout);
        if (shaderBrushSpans != null) {
            it = ArrayIteratorKt.iterator(shaderBrushSpans);
            while (it.hasNext()) {
                ((ShaderBrushSpan) it.next()).m6690setSizeuvyYCjk(Size.m4034constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
            }
        }
        charSequence2 = this.charSequence;
        if (charSequence2 instanceof Spanned) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            spanned = (Spanned) charSequence2;
            Object[] spans2 = spanned.getSpans(0, charSequence2.length(), PlaceholderSpan.class);
            arrayList = new ArrayList(spans2.length);
            while (i3 < r4) {
                PlaceholderSpan placeholderSpan2 = (PlaceholderSpan) obj;
                int spanStart2 = spanned.getSpanStart(placeholderSpan2);
                spanEnd = spanned.getSpanEnd(placeholderSpan2);
                lineForOffset = this.layout.getLineForOffset(spanStart2);
                if (lineForOffset >= this.maxLines) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (this.layout.getLineEllipsisCount(lineForOffset) > 0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (spanEnd > this.layout.getLineEnd(lineForOffset)) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                if (z3) {
                    rect = null;
                } else {
                    rect = null;
                }
                arrayList.add(rect);
            }
            arrayListEmptyList = arrayList;
        }
        this.placeholderRects = arrayListEmptyList;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, i2, j, null);
    }

    /* JADX INFO: renamed from: getCharSequence$ui_text, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getWidth() {
        return Constraints.m6888getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text() {
        return this.paragraphIntrinsics.getTextPaint().getTextLocale();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final AndroidTextPaint getTextPaint$ui_text() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int getLineForVerticalPosition(float p0) {
        return this.layout.getLineForVertical((int) p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int mo6190getOffsetForPositionk4lQ0M(long p0) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Float.intBitsToFloat((int) (4294967295L & p0))), Float.intBitsToFloat((int) (p0 >> 32)));
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long mo6192getRangeForRect86BmAI(Rect p0, int p1, final TextInclusionStrategy p2) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(p0), AndroidParagraph_androidKt.m6208toLayoutTextGranularityduNsdkg(p1), new Function2() { // from class: androidx.compose.ui.text.AndroidParagraph$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AndroidParagraph.getRangeForRect_8_6BmAI$lambda$6(p2, (RectF) obj, (RectF) obj2));
            }
        });
        if (rangeForRect == null) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        return TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect_8_6BmAI$lambda$6(TextInclusionStrategy textInclusionStrategy, RectF rectF, RectF rectF2) {
        return textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect(rectF), RectHelper_androidKt.toComposeRect(rectF2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final Rect getBoundingBox(int p0) {
        if (p0 < 0 || p0 >= this.charSequence.length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0,");
            sb.append(this.charSequence.length());
            sb.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        RectF boundingBox = this.layout.getBoundingBox(p0);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void mo6188fillBoundingBoxes8ffj60Q(long p0, float[] p1, int p2) {
        this.layout.fillBoundingBoxes(TextRange.m6395getMinimpl(p0), TextRange.m6394getMaximpl(p0), p1, p2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final Path getPathForRange(int p0, int p1) {
        if (p0 < 0 || p0 > p1 || p1 > this.charSequence.length()) {
            StringBuilder sb = new StringBuilder("start(");
            sb.append(p0);
            sb.append(") or end(");
            sb.append(p1);
            sb.append(") is out of range [0..");
            sb.append(this.charSequence.length());
            sb.append("], or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(p0, p1, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final Rect getCursorRect(int p0) {
        if (p0 < 0 || p0 > this.charSequence.length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0,");
            sb.append(this.charSequence.length());
            sb.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, p0, false, 2, null);
        int lineForOffset = this.layout.getLineForOffset(p0);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long mo6193getWordBoundaryjx7JFs(int p0) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, p0), WordBoundary_androidKt.getWordEnd(wordIterator, p0));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineLeft(int p0) {
        return this.layout.getLineLeft(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineRight(int p0) {
        return this.layout.getLineRight(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineTop(int p0) {
        return this.layout.getLineTop(p0);
    }

    public final float getLineAscent$ui_text(int p0) {
        return this.layout.getLineAscent(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineBaseline(int p0) {
        return this.layout.getLineBaseline(p0);
    }

    public final float getLineDescent$ui_text(int p0) {
        return this.layout.getLineDescent(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineBottom(int p0) {
        return this.layout.getLineBottom(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineHeight(int p0) {
        return this.layout.getLineHeight(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getLineWidth(int p0) {
        return this.layout.getLineWidth(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int getLineStart(int p0) {
        return this.layout.getLineStart(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int getLineEnd(int p0, boolean p1) {
        if (p1) {
            return this.layout.getLineVisibleEnd(p0);
        }
        return this.layout.getLineEnd(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final boolean isLineEllipsized(int p0) {
        return this.layout.isLineEllipsized(p0);
    }

    public final int getLineEllipsisOffset$ui_text(int p0) {
        return this.layout.getLineEllipsisOffset(p0);
    }

    public final int getLineEllipsisCount$ui_text(int p0) {
        return this.layout.getLineEllipsisCount(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final int getLineForOffset(int p0) {
        return this.layout.getLineForOffset(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final float getHorizontalPosition(int p0, boolean p1) {
        if (p1) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, p0, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, p0, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final ResolvedTextDirection getParagraphDirection(int p0) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(p0)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public final ResolvedTextDirection getBidiRunDirection(int p0) {
        return this.layout.isRtlCharAt(p0) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        Intrinsics.checkNotNull(text2, "");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void mo6195paintRPmYEkk(Canvas p0, long p1, Shadow p2, TextDecoration p3) {
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m6669setColor8_81llA(p1);
        textPaint$ui_text.setShadow(p2);
        textPaint$ui_text.setTextDecoration(p3);
        paint(p0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void mo6194paintLG529CI(Canvas p0, long p1, Shadow p2, TextDecoration p3, DrawStyle p4, int p5) {
        int backingBlendMode = getTextPaint$ui_text().getBackingBlendMode();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m6669setColor8_81llA(p1);
        textPaint$ui_text.setShadow(p2);
        textPaint$ui_text.setTextDecoration(p3);
        textPaint$ui_text.setDrawStyle(p4);
        textPaint$ui_text.m6666setBlendModes9anfk8(p5);
        paint(p0);
        getTextPaint$ui_text().m6666setBlendModes9anfk8(backingBlendMode);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void mo6196painthn5TExg(Canvas p0, Brush p1, float p2, Shadow p3, TextDecoration p4, DrawStyle p5, int p6) {
        int backingBlendMode = getTextPaint$ui_text().getBackingBlendMode();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        float width = getWidth();
        textPaint$ui_text.m6667setBrush12SF9DM(p1, Size.m4034constructorimpl((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), p2);
        textPaint$ui_text.setShadow(p3);
        textPaint$ui_text.setTextDecoration(p4);
        textPaint$ui_text.setDrawStyle(p5);
        textPaint$ui_text.m6666setBlendModes9anfk8(p6);
        paint(p0);
        getTextPaint$ui_text().m6666setBlendModes9anfk8(backingBlendMode);
    }

    private final void paint(Canvas p0) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(p0);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return androidParagraph.constructTextLayout(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    private final TextLayout constructTextLayout(int p0, int p1, TextUtils.TruncateAt p2, int p3, int p4, int p5, int p6, int p7, CharSequence p8) {
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        int textDirectionHeuristic = this.paragraphIntrinsics.getTextDirectionHeuristic();
        LayoutIntrinsics layoutIntrinsics = this.paragraphIntrinsics.getLayoutIntrinsics();
        return new TextLayout(p8, width, textPaint$ui_text, p0, p2, textDirectionHeuristic, 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, p3, p5, p6, p7, p4, p1, null, null, layoutIntrinsics, 196736, null);
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, i2, j);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, int i2, long j, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, i2, j, resolver, density);
    }
}
