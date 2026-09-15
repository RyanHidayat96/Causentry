package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001|BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010%J%\u00102\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002002\u0006\u0010\b\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002002\u0006\u0010\b\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b4\u00103J*\u0010;\u001a\u0002082\u0006\u0010\u0006\u001a\u0002052\u0006\u0010\b\u001a\u0002062\u0006\u0010\n\u001a\u000207H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:J%\u0010<\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002002\u0006\u0010\b\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b<\u00103J%\u0010=\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002002\u0006\u0010\b\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b=\u00103J\u0017\u0010>\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010?Ja\u0010@\u001a\u00020\u00112\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJV\u0010F\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\bG\u0010?J\u0013\u0010I\u001a\u00020\r*\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\r*\u00020(H\u0016¢\u0006\u0004\bK\u0010*J#\u0010L\u001a\u00020\u0013*\u0002002\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u00103J#\u0010M\u001a\u00020\u0013*\u0002002\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u00103J&\u0010O\u001a\u000208*\u0002052\u0006\u0010\u0006\u001a\u0002062\u0006\u0010\b\u001a\u000207H\u0017ø\u0001\u0000¢\u0006\u0004\bN\u0010:J#\u0010P\u001a\u00020\u0013*\u0002002\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u00103J#\u0010Q\u001a\u00020\u0013*\u0002002\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\bQ\u00103R\u0018\u0010R\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR*\u0010V\u001a\u0010\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u0013\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010%R\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010[R\u0016\u0010]\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010^R,\u0010`\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010b\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010aR$\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0019\u0010d\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bd\u0010^R\u0018\u0010e\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR$\u0010g\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR*\u0010l\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0k\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010aR\u0014\u0010o\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR$\u0010v\u001a\u0004\u0018\u00010 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "Landroidx/compose/ui/text/TextStyle;", "p1", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "p3", "Landroidx/compose/ui/text/style/TextOverflow;", "p4", "", "p5", "", "p6", "p7", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "p8", "Landroidx/compose/ui/geometry/Rect;", "p9", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "p10", "Landroidx/compose/ui/graphics/ColorProducer;", "p11", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "p12", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "clearSubstitution$foundation_release", "()V", "doInvalidations", "(ZZZZ)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawNonExtension", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "getLayoutCache", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "invalidateForTranslate", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "maxIntrinsicHeightNonExtension", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidthNonExtension", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "minIntrinsicHeightNonExtension", "minIntrinsicWidthNonExtension", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "updateCallbacks", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Lkotlin/jvm/functions/Function1;)Z", "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "updateText$foundation_release", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "draw", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure-3p2s80s", "measure", "minIntrinsicHeight", "minIntrinsicWidth", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "baselineCache", "Ljava/util/Map;", "getBaselineCache$annotations", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "maxLines", "I", "minLines", "onPlaceholderLayout", "Lkotlin/jvm/functions/Function1;", "onShowTranslation", "onTextLayout", "overflow", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "placeholders", "Ljava/util/List;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "", "semanticsTextLayoutResult", "getShouldClearDescendantSemantics", "()Z", "shouldClearDescendantSemantics", "softWrap", "Z", "style", "Landroidx/compose/ui/text/TextStyle;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "textSubstitution", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "getTextSubstitution$foundation_release", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "TextSubstitutionValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private MultiParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private Function1<? super List<Rect>, Unit> onPlaceholderLayout;
    private Function1<? super TextSubstitutionValue, Unit> onShowTranslation;
    private Function1<? super TextLayoutResult, Unit> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final boolean getIsClearingSemantics() {
        return true;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, Function1 function3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function2, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, (i4 & 4096) != 0 ? null : function3, null);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function2, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextSubstitutionValue, Unit> function3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.onShowTranslation = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density p0) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(p0);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(p0);
        return layoutCache2;
    }

    public final boolean updateDraw(ColorProducer p0, TextStyle p1) {
        boolean zAreEqual = Intrinsics.areEqual(p0, this.overrideColor);
        this.overrideColor = p0;
        return (zAreEqual && p1.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    public final boolean updateText$foundation_release(AnnotatedString p0) {
        boolean zAreEqual = Intrinsics.areEqual(this.text.getText(), p0.getText());
        boolean z = (zAreEqual && Intrinsics.areEqual(this.text.getSpanStyles(), p0.getSpanStyles()) && Intrinsics.areEqual(this.text.getParagraphStyles(), p0.getParagraphStyles()) && this.text.hasEqualAnnotations(p0)) ? false : true;
        if (z) {
            this.text = p0;
        }
        if (!zAreEqual) {
            clearSubstitution$foundation_release();
        }
        return z;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-MPT68mk, reason: not valid java name */
    public final boolean m1642updateLayoutRelatedArgsMPT68mk(TextStyle p0, List<AnnotatedString.Range<Placeholder>> p1, int p2, int p3, boolean p4, FontFamily.Resolver p5, int p6) {
        boolean z = !this.style.hasSameLayoutAffectingAttributes(p0);
        this.style = p0;
        if (!Intrinsics.areEqual(this.placeholders, p1)) {
            this.placeholders = p1;
            z = true;
        }
        if (this.minLines != p2) {
            this.minLines = p2;
            z = true;
        }
        if (this.maxLines != p3) {
            this.maxLines = p3;
            z = true;
        }
        if (this.softWrap != p4) {
            this.softWrap = p4;
            z = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, p5)) {
            this.fontFamilyResolver = p5;
            z = true;
        }
        if (TextOverflow.m6861equalsimpl0(this.overflow, p6)) {
            return z;
        }
        this.overflow = p6;
        return true;
    }

    public final boolean updateCallbacks(Function1<? super TextLayoutResult, Unit> p0, Function1<? super List<Rect>, Unit> p1, SelectionController p2, Function1<? super TextSubstitutionValue, Unit> p3) {
        boolean z;
        if (this.onTextLayout != p0) {
            this.onTextLayout = p0;
            z = true;
        } else {
            z = false;
        }
        if (this.onPlaceholderLayout != p1) {
            this.onPlaceholderLayout = p1;
            z = true;
        }
        if (!Intrinsics.areEqual(this.selectionController, p2)) {
            this.selectionController = p2;
            z = true;
        }
        if (this.onShowTranslation == p3) {
            return z;
        }
        this.onShowTranslation = p3;
        return true;
    }

    public final void doInvalidations(boolean p0, boolean p1, boolean p2, boolean p3) {
        if (p1 || p2 || p3) {
            getLayoutCache().m1630updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        if (getIsAttached()) {
            if (p1 || (p0 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (p1 || p2 || p3) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (p0) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\fR\"\u0010(\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "p1", "", "p2", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "p3", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "component2", "component3", "()Z", "component4", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "copy", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isShowingSubstitution", "Z", "setShowingSubstitution", "(Z)V", "layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "getLayoutCache", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "original", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginal", "substitution", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : multiParagraphLayoutCache);
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z, MultiParagraphLayoutCache multiParagraphLayoutCache, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z, multiParagraphLayoutCache);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString p0, AnnotatedString p1, boolean p2, MultiParagraphLayoutCache p3) {
            return new TextSubstitutionValue(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) p0;
            return Intrinsics.areEqual(this.original, textSubstitutionValue.original) && Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final int hashCode() {
            int iHashCode = this.original.hashCode();
            int iHashCode2 = this.substitution.hashCode();
            int iHashCode3 = Boolean.hashCode(this.isShowingSubstitution);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitutionValue(original=");
            sb.append((Object) this.original);
            sb.append(", substitution=");
            sb.append((Object) this.substitution);
            sb.append(", isShowingSubstitution=");
            sb.append(this.isShowingSubstitution);
            sb.append(", layoutCache=");
            sb.append(this.layoutCache);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: getTextSubstitution$foundation_release, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    public final void setTextSubstitution$foundation_release(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString p0) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (Intrinsics.areEqual(p0, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(p0);
            MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m1630updateZNqEYIc(p0, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return unit != null;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, p0, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(p0, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity());
        textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<? super List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.1
                /* JADX WARN: Code duplicated, block: B:11:0x00b8  */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(List<TextLayoutResult> list) {
                    TextLayoutResult textLayoutResultM6365copyO0kMr_c$default;
                    TextLayoutResult layoutOrNull = TextAnnotatedStringNode.this.getLayoutCache().getLayoutCache();
                    if (layoutOrNull != null) {
                        AnnotatedString text = layoutOrNull.getLayoutInput().getText();
                        TextStyle textStyle = TextAnnotatedStringNode.this.style;
                        ColorProducer colorProducer = TextAnnotatedStringNode.this.overrideColor;
                        textLayoutResultM6365copyO0kMr_c$default = TextLayoutResult.m6365copyO0kMr_c$default(layoutOrNull, new TextLayoutInput(text, textStyle.m6442mergedA7vx0o((16777214 & 1) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.m4299invoke0d7_KjU() : Color.INSTANCE.m4254getUnspecified0d7_KjU(), (16777214 & 2) != 0 ? TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : 0L, (16777214 & 4096) != 0 ? null : null, (16777214 & 8192) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? TextAlign.INSTANCE.m6825getUnspecifiede0LSkKk() : 0, (16777214 & 65536) != 0 ? TextDirection.INSTANCE.m6838getUnspecifieds_7Xco() : 0, (16777214 & 131072) != 0 ? TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE() : 0L, (16777214 & 262144) != 0 ? null : null, (16777214 & 524288) != 0 ? null : null, (16777214 & 1048576) != 0 ? LineBreak.INSTANCE.m6740getUnspecifiedrAG3T2k() : 0, (16777214 & 2097152) != 0 ? Hyphens.INSTANCE.m6719getUnspecifiedvmbZdU8() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null), layoutOrNull.getLayoutInput().getPlaceholders(), layoutOrNull.getLayoutInput().getMaxLines(), layoutOrNull.getLayoutInput().getSoftWrap(), layoutOrNull.getLayoutInput().getOverflow(), layoutOrNull.getLayoutInput().getDensity(), layoutOrNull.getLayoutInput().getLayoutDirection(), layoutOrNull.getLayoutInput().getFontFamilyResolver(), layoutOrNull.getLayoutInput().getConstraints(), (DefaultConstructorMarker) null), 0L, 2, null);
                        if (textLayoutResultM6365copyO0kMr_c$default != null) {
                            list.add(textLayoutResultM6365copyO0kMr_c$default);
                        } else {
                            textLayoutResultM6365copyO0kMr_c$default = null;
                        }
                    } else {
                        textLayoutResultM6365copyO0kMr_c$default = null;
                    }
                    return Boolean.valueOf(textLayoutResultM6365copyO0kMr_c$default != null);
                }

                {
                    super(1);
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }

            {
                super(1);
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.3
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z) {
                if (TextAnnotatedStringNode.this.getTextSubstitution() != null) {
                    Function1 function2 = TextAnnotatedStringNode.this.onShowTranslation;
                    if (function2 != null) {
                        TextSubstitutionValue textSubstitution = TextAnnotatedStringNode.this.getTextSubstitution();
                        Intrinsics.checkNotNull(textSubstitution);
                        function2.invoke(textSubstitution);
                    }
                    TextSubstitutionValue textSubstitution2 = TextAnnotatedStringNode.this.getTextSubstitution();
                    if (textSubstitution2 != null) {
                        textSubstitution2.setShowingSubstitution(z);
                    }
                    TextAnnotatedStringNode.this.invalidateForTranslate();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }

            {
                super(1);
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }

            {
                super(0);
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    /* JADX INFO: renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m1641measureNonExtension3p2s80s(MeasureScope p0, Measurable p1, long p2) {
        return mo412measure3p2s80s(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean zM1629layoutWithConstraintsK40F9xA = layoutCache.m1629layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (zM1629layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1<? super TextLayoutResult, Unit> function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            LinkedHashMap linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        Function1<? super List<Rect>, Unit> function2 = this.onPlaceholderLayout;
        if (function2 != null) {
            function2.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(Constraints.INSTANCE.m6897fitPrioritizingWidthZbe2FdA(IntSize.m7106getWidthimpl(textLayoutResult.getSize()), IntSize.m7106getWidthimpl(textLayoutResult.getSize()), IntSize.m7105getHeightimpl(textLayoutResult.getSize()), IntSize.m7105getHeightimpl(textLayoutResult.getSize())));
        int iM7106getWidthimpl = IntSize.m7106getWidthimpl(textLayoutResult.getSize());
        int iM7105getHeightimpl = IntSize.m7105getHeightimpl(textLayoutResult.getSize());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.layout(iM7106getWidthimpl, iM7105getHeightimpl, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            {
                super(1);
            }
        });
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope p0, IntrinsicMeasurable p1, int p2) {
        return minIntrinsicWidth(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope p0, IntrinsicMeasurable p1, int p2) {
        return minIntrinsicHeight(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope p0, IntrinsicMeasurable p1, int p2) {
        return maxIntrinsicWidth(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope p0, IntrinsicMeasurable p1, int p2) {
        return maxIntrinsicHeight(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final void drawNonExtension(ContentDrawScope p0) {
        draw(p0);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        List<AnnotatedString.Range<Placeholder>> list;
        if (getIsAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m6861equalsimpl0(this.overflow, TextOverflow.INSTANCE.m6874getVisiblegIe3tQ8());
            if (z) {
                Rect rectM4014Recttz77jQw = RectKt.m4014Recttz77jQw(Offset.INSTANCE.m3990getZeroF1C5BW0(), SizeKt.Size(IntSize.m7106getWidthimpl(textLayoutResult.getSize()), IntSize.m7105getHeightimpl(textLayoutResult.getSize())));
                canvas.save();
                Canvas.m4191clipRectmtrdDE$default(canvas, rectM4014Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.INSTANCE.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.INSTANCE.getNone();
                }
                Shadow shadow2 = shadow;
                Fill drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    multiParagraph.m6243painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : this.style.getAlpha(), (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : 0);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jM4299invoke0d7_KjU = colorProducer != null ? colorProducer.m4299invoke0d7_KjU() : Color.INSTANCE.m4254getUnspecified0d7_KjU();
                    if (jM4299invoke0d7_KjU == 16) {
                        if (this.style.m6427getColor0d7_KjU() != 16) {
                            jM4299invoke0d7_KjU = this.style.m6427getColor0d7_KjU();
                        } else {
                            jM4299invoke0d7_KjU = Color.INSTANCE.m4244getBlack0d7_KjU();
                        }
                    }
                    multiParagraph.m6241paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : jM4299invoke0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) && TextAnnotatedStringNodeKt.hasLinks(this.text)) || !((list = this.placeholders) == null || list.isEmpty())) {
                    contentDrawScope.drawContent();
                }
            } catch (Throwable th) {
                if (z) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function2, selectionController, colorProducer, function3);
    }
}
