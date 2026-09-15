package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0019\u001a\u00020\u0016*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001f\u001a\u00020\u0004*\u00020\u001c2\u0016\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u001dj\b\u0012\u0004\u0012\u00020\u0014`\u001e2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "", "getOffsetForPosition-3MmeM6k", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/selection/Direction;", "getXDirection-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "getXDirection", "getYDirection-3MmeM6k", "getYDirection", "", "isSelected", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Z", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "p2", "", "p3", "", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "appendSelectableInfo", "getDirectionById", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "getPreviousAdjustedOffset", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MultiWidgetSelectionDelegateKt {
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[PHI: r0
  0x00b4: PHI (r0v2 int) = (r0v1 int), (r0v1 int), (r0v9 int), (r0v9 int) binds: [B:25:0x00a1, B:27:0x00a7, B:20:0x0086, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1651appendSelectableInfoParwq6A(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j, long j2, long j3) {
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection;
        Direction direction;
        Direction direction2;
        Direction direction3;
        Direction direction4;
        int iM1652getOffsetForPosition3MmeM6k;
        Selection.AnchorInfo start;
        int previousAdjustedOffset;
        int previousAdjustedOffset2;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m7106getWidthimpl(textLayoutResult.getSize()), IntSize.m7105getHeightimpl(textLayoutResult.getSize()));
        Direction directionM1653getXDirection3MmeM6k = m1653getXDirection3MmeM6k(j, rect);
        Direction directionM1654getYDirection3MmeM6k = m1654getYDirection3MmeM6k(j, rect);
        if (selectionLayoutBuilder.getIsStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(directionM1653getXDirection3MmeM6k, directionM1654getYDirection3MmeM6k, selectionLayoutBuilder, j3, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction4 = direction3;
            direction = directionM1653getXDirection3MmeM6k;
            direction2 = directionM1654getYDirection3MmeM6k;
        } else {
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(directionM1653getXDirection3MmeM6k, directionM1654getYDirection3MmeM6k, selectionLayoutBuilder, j3, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction2 = direction;
            direction3 = directionM1653getXDirection3MmeM6k;
            direction4 = directionM1654getYDirection3MmeM6k;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(directionM1653getXDirection3MmeM6k, directionM1654getYDirection3MmeM6k), directionAppendSelectableInfo_Parwq6A$otherDirection)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.getIsStartHandle()) {
                iM1652getOffsetForPosition3MmeM6k = m1652getOffsetForPosition3MmeM6k(j, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                if (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) {
                    previousAdjustedOffset2 = iM1652getOffsetForPosition3MmeM6k;
                    previousAdjustedOffset = previousAdjustedOffset2;
                } else {
                    previousAdjustedOffset2 = iM1652getOffsetForPosition3MmeM6k;
                    previousAdjustedOffset = getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
                }
            } else {
                iM1652getOffsetForPosition3MmeM6k = m1652getOffsetForPosition3MmeM6k(j, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                if (previousSelection4 == null || (start = previousSelection4.getStart()) == null) {
                    previousAdjustedOffset2 = iM1652getOffsetForPosition3MmeM6k;
                    previousAdjustedOffset = previousAdjustedOffset2;
                } else {
                    previousAdjustedOffset = iM1652getOffsetForPosition3MmeM6k;
                    previousAdjustedOffset2 = getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
                }
            }
            selectionLayoutBuilder.appendInfo(j3, previousAdjustedOffset2, direction, direction2, previousAdjustedOffset, direction3, direction4, OffsetKt.m3995isUnspecifiedk4lQ0M(j2) ? -1 : m1652getOffsetForPosition3MmeM6k(j2, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j, int i) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i : anchorInfo.getOffset();
    }

    /* JADX INFO: renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1653getXDirection3MmeM6k(long j, Rect rect) {
        if (Offset.m3974getXimpl(j) < rect.getLeft()) {
            return Direction.BEFORE;
        }
        return Offset.m3974getXimpl(j) > rect.getRight() ? Direction.AFTER : Direction.ON;
    }

    /* JADX INFO: renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1654getYDirection3MmeM6k(long j, Rect rect) {
        if (Offset.m3975getYimpl(j) < rect.getTop()) {
            return Direction.BEFORE;
        }
        return Offset.m3975getYimpl(j) > rect.getBottom() ? Direction.AFTER : Direction.ON;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j, long j2) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j), Long.valueOf(j2));
        if (iCompare < 0) {
            return Direction.BEFORE;
        }
        if (iCompare > 0) {
            return Direction.AFTER;
        }
        return Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1652getOffsetForPosition3MmeM6k(long j, TextLayoutResult textLayoutResult) {
        if (Offset.m3975getYimpl(j) <= 0.0f) {
            return 0;
        }
        return Offset.m3975getYimpl(j) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m6367getOffsetForPositionk4lQ0M(j);
    }
}
