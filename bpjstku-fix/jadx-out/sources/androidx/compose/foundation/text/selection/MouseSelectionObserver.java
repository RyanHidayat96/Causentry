package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "", "Landroidx/compose/ui/geometry/Offset;", "p0", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p1", "", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDrag", "", "onDragDone", "()V", "onExtend-k-4lQ0M", "(J)Z", "onExtend", "onExtendDrag-k-4lQ0M", "onExtendDrag", "onStart-3MmeM6k", "onStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MouseSelectionObserver {
    /* JADX INFO: renamed from: onDrag-3MmeM6k */
    boolean mo1593onDrag3MmeM6k(long p0, SelectionAdjustment p1);

    void onDragDone();

    /* JADX INFO: renamed from: onExtend-k-4lQ0M */
    boolean mo1594onExtendk4lQ0M(long p0);

    /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
    boolean mo1595onExtendDragk4lQ0M(long p0);

    /* JADX INFO: renamed from: onStart-3MmeM6k */
    boolean mo1596onStart3MmeM6k(long p0, SelectionAdjustment p1);
}
