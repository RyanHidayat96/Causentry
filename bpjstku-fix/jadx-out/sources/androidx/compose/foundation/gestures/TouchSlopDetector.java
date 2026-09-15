package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0017\u001a\u00020\u0007*\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "p0", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "p1", "Landroidx/compose/ui/geometry/Offset;", "addPointerInputChange-GcwITfU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)Landroidx/compose/ui/geometry/Offset;", "addPointerInputChange", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "calculatePostSlopOffset", "", "reset", "()V", "crossAxis-k-4lQ0M", "(J)F", "crossAxis", "mainAxis-k-4lQ0M", "mainAxis", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "totalPositionChange", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TouchSlopDetector {
    private final Orientation orientation;
    private long totalPositionChange;

    public TouchSlopDetector(Orientation orientation) {
        this.orientation = orientation;
        this.totalPositionChange = Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m827mainAxisk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m3974getXimpl(j) : Offset.m3975getYimpl(j);
    }

    /* JADX INFO: renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m826crossAxisk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m3975getYimpl(j) : Offset.m3974getXimpl(j);
    }

    /* JADX INFO: renamed from: addPointerInputChange-GcwITfU, reason: not valid java name */
    public final Offset m825addPointerInputChangeGcwITfU(PointerInputChange p0, float p1) {
        float fAbs;
        long jM3979plusMKHz9U = Offset.m3979plusMKHz9U(this.totalPositionChange, Offset.m3978minusMKHz9U(p0.getPosition(), p0.getPreviousPosition()));
        this.totalPositionChange = jM3979plusMKHz9U;
        if (this.orientation == null) {
            fAbs = Offset.m3972getDistanceimpl(jM3979plusMKHz9U);
        } else {
            fAbs = Math.abs(m827mainAxisk4lQ0M(jM3979plusMKHz9U));
        }
        if (fAbs >= p1) {
            return Offset.m3963boximpl(m824calculatePostSlopOffsettuRUvjQ(p1));
        }
        return null;
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m824calculatePostSlopOffsettuRUvjQ(float p0) {
        if (this.orientation == null) {
            long j = this.totalPositionChange;
            return Offset.m3978minusMKHz9U(this.totalPositionChange, Offset.m3981timestuRUvjQ(Offset.m3969divtuRUvjQ(j, Offset.m3972getDistanceimpl(j)), p0));
        }
        float fM827mainAxisk4lQ0M = m827mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m827mainAxisk4lQ0M(this.totalPositionChange)) * p0);
        float fM826crossAxisk4lQ0M = m826crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(fM827mainAxisk4lQ0M, fM826crossAxisk4lQ0M);
        }
        return OffsetKt.Offset(fM826crossAxisk4lQ0M, fM827mainAxisk4lQ0M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TouchSlopDetector() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
