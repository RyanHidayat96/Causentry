package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0015J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u00102\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u00020\u000f*\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "", "p0", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p1", "Landroidx/compose/ui/text/TextLayoutResult;", "p2", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "appendSelectableInfoToBuilder", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getCenterYForOffset", "(I)F", "Landroidx/compose/foundation/text/selection/Selection;", "", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLastVisibleOffset", "()I", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getLineLeft", "getLineRight", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "_previousLastVisibleOffset", "I", "_previousTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "coordinatesCallback", "Lkotlin/jvm/functions/Function0;", "layoutResultCallback", "selectableId", "J", "getSelectableId", "()J", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "lastVisibleOffset"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    private int _previousLastVisibleOffset = -1;
    private TextLayoutResult _previousTextLayoutResult;
    private final Function0<LayoutCoordinates> coordinatesCallback;
    private final Function0<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, Function0<? extends LayoutCoordinates> function0, Function0<TextLayoutResult> function1) {
        this.selectableId = j;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function1;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long getSelectableId() {
        return this.selectableId;
    }

    private final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i;
        int lineCount;
        synchronized (this) {
            if (this._previousTextLayoutResult != textLayoutResult) {
                if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = textLayoutResult.getLineCount() - 1;
                } else {
                    int iCoerceAtMost = RangesKt.coerceAtMost(textLayoutResult.getLineForVerticalPosition(IntSize.m7105getHeightimpl(textLayoutResult.getSize())), textLayoutResult.getLineCount() - 1);
                    while (iCoerceAtMost >= 0 && textLayoutResult.getLineTop(iCoerceAtMost) >= IntSize.m7105getHeightimpl(textLayoutResult.getSize())) {
                        iCoerceAtMost--;
                    }
                    lineCount = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
                }
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
            i = this._previousLastVisibleOffset;
        }
        return i;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final void appendSelectableInfoToBuilder(SelectionLayoutBuilder p0) {
        TextLayoutResult textLayoutResultInvoke;
        long jM3978minusMKHz9U;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (textLayoutResultInvoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        long jMo5646localPositionOfR5De75A = p0.getContainerCoordinates().mo5646localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3990getZeroF1C5BW0());
        long jM3978minusMKHz9U2 = Offset.m3978minusMKHz9U(p0.getCurrentPosition(), jMo5646localPositionOfR5De75A);
        if (OffsetKt.m3995isUnspecifiedk4lQ0M(p0.getPreviousHandlePosition())) {
            jM3978minusMKHz9U = Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
        } else {
            jM3978minusMKHz9U = Offset.m3978minusMKHz9U(p0.getPreviousHandlePosition(), jMo5646localPositionOfR5De75A);
        }
        MultiWidgetSelectionDelegateKt.m1651appendSelectableInfoParwq6A(p0, textLayoutResultInvoke, jM3978minusMKHz9U2, jM3978minusMKHz9U, getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResultInvoke.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResultInvoke.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public final long mo1649getHandlePositiondBAh8RU(Selection p0, boolean p1) {
        TextLayoutResult textLayoutResultInvoke;
        if ((p1 && p0.getStart().getSelectableId() != getSelectableId()) || (!p1 && p0.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (textLayoutResultInvoke = this.layoutResultCallback.invoke()) != null) {
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultInvoke, RangesKt.coerceIn((p1 ? p0.getStart() : p0.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResultInvoke)), p1, p0.getHandlesCrossed());
        }
        return Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinatesInvoke = this.coordinatesCallback.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        return textLayoutResultInvoke == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Rect getBoundingBox(int p0) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return Rect.INSTANCE.getZero();
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        if (length <= 0) {
            return Rect.INSTANCE.getZero();
        }
        return textLayoutResultInvoke.getBoundingBox(RangesKt.coerceIn(p0, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getLineLeft(int p0) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (lineForOffset = textLayoutResultInvoke.getLineForOffset(p0)) < textLayoutResultInvoke.getLineCount()) {
            return textLayoutResultInvoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getLineRight(int p0) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (lineForOffset = textLayoutResultInvoke.getLineForOffset(p0)) < textLayoutResultInvoke.getLineCount()) {
            return textLayoutResultInvoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getCenterYForOffset(int p0) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null || (lineForOffset = textLayoutResultInvoke.getLineForOffset(p0)) >= textLayoutResultInvoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = textLayoutResultInvoke.getLineTop(lineForOffset);
        return ((textLayoutResultInvoke.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public final long mo1650getRangeOfLineContainingjx7JFs(int p0) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResultInvoke);
        if (lastVisibleOffset <= 0) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResultInvoke.getLineForOffset(RangesKt.coerceIn(p0, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResultInvoke.getLineStart(lineForOffset), textLayoutResultInvoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final int getLastVisibleOffset() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResultInvoke);
    }
}
