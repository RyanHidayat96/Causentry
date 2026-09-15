package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u001aHÂ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u001cHÂ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b,\u0010#J\u0013\u0010/\u001a\u00020\rHÂ\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b2\u0010.J\u0010\u00103\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b3\u0010.J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014HÂ\u0003¢\u0006\u0004\b4\u00105JÁ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÇ\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u0002H\u0017¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010;H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010.J\u0010\u0010@\u001a\u00020?H×\u0001¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020\u000b*\u00020DH\u0016¢\u0006\u0004\bE\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010LR*\u0010N\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0017\u0010Q\u001a\u00020\r8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bQ\u0010LR\"\u0010R\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "Landroidx/compose/ui/text/TextStyle;", "p1", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "p3", "Landroidx/compose/ui/text/style/TextOverflow;", "p4", "", "p5", "", "p6", "p7", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "p8", "Landroidx/compose/ui/geometry/Rect;", "p9", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "p10", "Landroidx/compose/ui/graphics/ColorProducer;", "p11", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "component10", "()Lkotlin/jvm/functions/Function1;", "component11", "()Landroidx/compose/foundation/text/modifiers/SelectionController;", "component12", "()Landroidx/compose/ui/graphics/ColorProducer;", "component2", "()Landroidx/compose/ui/text/TextStyle;", "component3", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "component4", "component5-gIe3tQ8", "()I", "component5", "component6", "()Z", "component7", "component8", "component9", "()Ljava/util/List;", "copy-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "copy", "create", "()Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "update", "(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "maxLines", "I", "minLines", "onPlaceholderLayout", "Lkotlin/jvm/functions/Function1;", "onTextLayout", "overflow", "placeholders", "Ljava/util/List;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "softWrap", "Z", "style", "Landroidx/compose/ui/text/TextStyle;", "text", "Landroidx/compose/ui/text/AnnotatedString;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;
    private final Function1<TextLayoutResult, Unit> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? TextOverflow.INSTANCE.m6870getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function2, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function2, SelectionController selectionController, ColorProducer colorProducer) {
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
        this.color = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final SelectableTextAnnotatedStringNode getNode() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, 4096, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(SelectableTextAnnotatedStringNode p0) {
        p0.m1640updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) p0;
        return Intrinsics.areEqual(this.color, selectableTextAnnotatedStringElement.color) && Intrinsics.areEqual(this.text, selectableTextAnnotatedStringElement.text) && Intrinsics.areEqual(this.style, selectableTextAnnotatedStringElement.style) && Intrinsics.areEqual(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && Intrinsics.areEqual(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m6861equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && Intrinsics.areEqual(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.text.hashCode();
        int iHashCode2 = this.style.hashCode();
        int iHashCode3 = this.fontFamilyResolver.hashCode();
        Function1<TextLayoutResult, Unit> function1 = this.onTextLayout;
        int iHashCode4 = function1 != null ? function1.hashCode() : 0;
        int iM6862hashCodeimpl = TextOverflow.m6862hashCodeimpl(this.overflow);
        int iHashCode5 = Boolean.hashCode(this.softWrap);
        int i = this.maxLines;
        int i2 = this.minLines;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        Function1<List<Rect>, Unit> function2 = this.onPlaceholderLayout;
        int iHashCode7 = function2 != null ? function2.hashCode() : 0;
        SelectionController selectionController = this.selectionController;
        int iHashCode8 = selectionController != null ? selectionController.hashCode() : 0;
        ColorProducer colorProducer = this.color;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iM6862hashCodeimpl) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function2, selectionController, colorProducer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final AnnotatedString getText() {
        return this.text;
    }

    private final Function1<List<Rect>, Unit> component10() {
        return this.onPlaceholderLayout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    private final SelectionController getSelectionController() {
        return this.selectionController;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    private final ColorProducer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    private final Function1<TextLayoutResult, Unit> component4() {
        return this.onTextLayout;
    }

    /* JADX INFO: renamed from: component5-gIe3tQ8, reason: not valid java name and from getter */
    private final int getOverflow() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final int getMinLines() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: copy-VhcvRP8, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m1639copyVhcvRP8(AnnotatedString p0, TextStyle p1, FontFamily.Resolver p2, Function1<? super TextLayoutResult, Unit> p3, int p4, boolean p5, int p6, int p7, List<AnnotatedString.Range<Placeholder>> p8, Function1<? super List<Rect>, Unit> p9, SelectionController p10, ColorProducer p11) {
        return new SelectableTextAnnotatedStringElement(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableTextAnnotatedStringElement(text=");
        sb.append((Object) this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", fontFamilyResolver=");
        sb.append(this.fontFamilyResolver);
        sb.append(", onTextLayout=");
        sb.append(this.onTextLayout);
        sb.append(", overflow=");
        sb.append((Object) TextOverflow.m6863toStringimpl(this.overflow));
        sb.append(", softWrap=");
        sb.append(this.softWrap);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", minLines=");
        sb.append(this.minLines);
        sb.append(", placeholders=");
        sb.append(this.placeholders);
        sb.append(", onPlaceholderLayout=");
        sb.append(this.onPlaceholderLayout);
        sb.append(", selectionController=");
        sb.append(this.selectionController);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(')');
        return sb.toString();
    }
}
