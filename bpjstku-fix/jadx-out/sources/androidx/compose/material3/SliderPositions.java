package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Not necessary with the introduction of Slider state")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "p0", "", "p1", "<init>", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3_release", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange", "tickFractions$delegate", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderPositions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: activeRange$delegate, reason: from kotlin metadata */
    private final MutableState activeRange;

    /* JADX INFO: renamed from: tickFractions$delegate, reason: from kotlin metadata */
    private final MutableState tickFractions;

    public SliderPositions(ClosedFloatingPointRange<Float> closedFloatingPointRange, float[] fArr) {
        this.activeRange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(closedFloatingPointRange, null, 2, null);
        this.tickFractions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(ClosedFloatingPointRange closedFloatingPointRange, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange, (i & 2) != 0 ? new float[0] : fArr);
    }

    public final ClosedFloatingPointRange<Float> getActiveRange() {
        return (ClosedFloatingPointRange) this.activeRange.getValue();
    }

    public final void setActiveRange$material3_release(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.activeRange.setValue(closedFloatingPointRange);
    }

    public final float[] getTickFractions() {
        return (float[]) this.tickFractions.getValue();
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        this.tickFractions.setValue(fArr);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) p0;
        return Intrinsics.areEqual(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
