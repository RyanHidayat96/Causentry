package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@LayoutScopeMarker
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\b8'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\b8'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "", "getIndexInLine", "()I", "indexInLine", "getLineIndex", "lineIndex", "Landroidx/compose/ui/unit/Dp;", "getMaxHeightInLine-D9Ej5fM", "()F", "maxHeightInLine", "getMaxWidth-D9Ej5fM", "maxWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContextualFlowColumnScope extends FlowColumnScope {
    int getIndexInLine();

    int getLineIndex();

    /* JADX INFO: renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo919getMaxHeightInLineD9Ej5fM();

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo920getMaxWidthD9Ej5fM();
}
