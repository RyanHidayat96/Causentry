package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b#\u0010$Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0017¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H×\u0001¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u0013\u00106\u001a\u000202*\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010;"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "", "p0", "p1", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "p2", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p3", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "p4", "Landroidx/compose/ui/graphics/Brush;", "p5", "p6", "Landroidx/compose/foundation/ScrollState;", "p7", "Landroidx/compose/foundation/gestures/Orientation;", "p8", "<init>", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "component1", "()Z", "component2", "component3", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "component4", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "component5", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "component6", "()Landroidx/compose/ui/graphics/Brush;", "component7", "component8", "()Landroidx/compose/foundation/ScrollState;", "component9", "()Landroidx/compose/foundation/gestures/Orientation;", "copy", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "isDragHovered", "Z", "isFocused", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "writeable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;
    private final Orientation orientation;
    private final ScrollState scrollState;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final boolean writeable;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public TextFieldCoreModifier(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final TextFieldCoreModifierNode getNode() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(TextFieldCoreModifierNode p0) {
        p0.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final boolean getIsFocused() {
        return this.isFocused;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final boolean getIsDragHovered() {
        return this.isDragHovered;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final Brush getCursorBrush() {
        return this.cursorBrush;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final boolean getWriteable() {
        return this.writeable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final ScrollState getScrollState() {
        return this.scrollState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final Orientation getOrientation() {
        return this.orientation;
    }

    public final TextFieldCoreModifier copy(boolean p0, boolean p1, TextLayoutState p2, TransformedTextFieldState p3, TextFieldSelectionState p4, Brush p5, boolean p6, ScrollState p7, Orientation p8) {
        return new TextFieldCoreModifier(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) p0;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && Intrinsics.areEqual(this.textLayoutState, textFieldCoreModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldState, textFieldCoreModifier.textFieldState) && Intrinsics.areEqual(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && Intrinsics.areEqual(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && Intrinsics.areEqual(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isFocused) * 31) + Boolean.hashCode(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldCoreModifier(isFocused=");
        sb.append(this.isFocused);
        sb.append(", isDragHovered=");
        sb.append(this.isDragHovered);
        sb.append(", textLayoutState=");
        sb.append(this.textLayoutState);
        sb.append(", textFieldState=");
        sb.append(this.textFieldState);
        sb.append(", textFieldSelectionState=");
        sb.append(this.textFieldSelectionState);
        sb.append(", cursorBrush=");
        sb.append(this.cursorBrush);
        sb.append(", writeable=");
        sb.append(this.writeable);
        sb.append(", scrollState=");
        sb.append(this.scrollState);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(')');
        return sb.toString();
    }
}
