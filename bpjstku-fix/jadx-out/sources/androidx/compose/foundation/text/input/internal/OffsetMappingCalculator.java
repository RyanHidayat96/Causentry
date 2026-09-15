package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "<init>", "()V", "", "p0", "", "p1", "Landroidx/compose/ui/text/TextRange;", "map-fzxv0v0", "(IZ)J", "map", "mapFromDest--jx7JFs", "(I)J", "mapFromDest", "mapFromSource--jx7JFs", "mapFromSource", "p2", "p3", "p4", "mapStep-C6u-MEY", "(IIIIZ)J", "mapStep", "", "recordEditOperation", "(III)V", "Landroidx/compose/foundation/text/input/internal/OpArray;", "ops", "[I", "opsSize", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m1503constructorimpl(10);
    private int opsSize;

    public final void recordEditOperation(int p0, int p1, int p2) {
        if (p2 < 0) {
            throw new IllegalArgumentException("Expected newLen to be ≥ 0, was ".concat(String.valueOf(p2)).toString());
        }
        int iMin = Math.min(p0, p1);
        int iMax = Math.max(iMin, p1) - iMin;
        if (iMax >= 2 || iMax != p2) {
            int i = this.opsSize + 1;
            if (i > OpArray.m1510getSizeimpl(this.ops)) {
                this.ops = OpArray.m1505copyOfpSmdads(this.ops, Math.max(i * 2, OpArray.m1510getSizeimpl(this.ops) * 2));
            }
            OpArray.m1512setimpl(this.ops, this.opsSize, iMin, iMax, p2);
            this.opsSize = i;
        }
    }

    /* JADX INFO: renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1501mapFromSourcejx7JFs(int p0) {
        return m1498mapfzxv0v0(p0, true);
    }

    /* JADX INFO: renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1500mapFromDestjx7JFs(int p0) {
        return m1498mapfzxv0v0(p0, false);
    }

    /* JADX INFO: renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1498mapfzxv0v0(int p0, boolean p1) {
        int i;
        int[] iArr = this.ops;
        int i2 = this.opsSize;
        if (i2 < 0) {
            i = p0;
        } else if (p1) {
            int i3 = 0;
            int iMin = p0;
            while (i3 < i2) {
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                long jM1499mapStepC6uMEY = m1499mapStepC6uMEY(iMin, i5, i6, i7, p1);
                long jM1499mapStepC6uMEY2 = m1499mapStepC6uMEY(p0, i5, i6, i7, p1);
                i3++;
                iMin = Math.min(TextRange.m6397getStartimpl(jM1499mapStepC6uMEY), TextRange.m6397getStartimpl(jM1499mapStepC6uMEY2));
                p0 = Math.max(TextRange.m6392getEndimpl(jM1499mapStepC6uMEY), TextRange.m6392getEndimpl(jM1499mapStepC6uMEY2));
            }
            i = p0;
            p0 = iMin;
        } else {
            int i8 = i2 - 1;
            int iMin2 = p0;
            while (i8 >= 0) {
                int i9 = i8 * 3;
                int i10 = iArr[i9];
                int i11 = iArr[i9 + 1];
                int i12 = iArr[i9 + 2];
                long jM1499mapStepC6uMEY3 = m1499mapStepC6uMEY(iMin2, i10, i11, i12, p1);
                long jM1499mapStepC6uMEY4 = m1499mapStepC6uMEY(p0, i10, i11, i12, p1);
                i8--;
                iMin2 = Math.min(TextRange.m6397getStartimpl(jM1499mapStepC6uMEY3), TextRange.m6397getStartimpl(jM1499mapStepC6uMEY4));
                p0 = Math.max(TextRange.m6392getEndimpl(jM1499mapStepC6uMEY3), TextRange.m6392getEndimpl(jM1499mapStepC6uMEY4));
            }
            i = p0;
            p0 = iMin2;
        }
        return TextRangeKt.TextRange(p0, i);
    }

    /* JADX INFO: renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1499mapStepC6uMEY(int p0, int p1, int p2, int p3, boolean p4) {
        int i = p4 ? p2 : p3;
        if (p4) {
            p2 = p3;
        }
        if (p0 < p1) {
            return TextRangeKt.TextRange(p0);
        }
        if (p0 == p1) {
            if (i == 0) {
                return TextRangeKt.TextRange(p1, p2 + p1);
            }
            return TextRangeKt.TextRange(p1);
        }
        if (p0 >= p1 + i) {
            return TextRangeKt.TextRange((p0 - i) + p2);
        }
        if (p2 == 0) {
            return TextRangeKt.TextRange(p1);
        }
        return TextRangeKt.TextRange(p1, p2 + p1);
    }
}
