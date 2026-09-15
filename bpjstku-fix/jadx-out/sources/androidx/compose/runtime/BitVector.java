package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ,\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "<init>", "()V", "", "p0", "", "get", "(I)Z", "p1", "", "set", "(IZ)V", "nextSet", "(I)I", "nextClear", "Lkotlin/Function1;", "", "nextBit", "(ILkotlin/jvm/functions/Function1;)I", "setRange", "(II)V", "", "toString", "()Ljava/lang/String;", "first", "J", "second", "", "others", "[J", "getSize", "()I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitVector {
    public static final int $stable = 8;
    private long first;
    private long[] others = SlotTableKt.EmptyLongArray;
    private long second;

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final boolean get(int p0) {
        int i;
        if (p0 < 64) {
            return ((1 << p0) & this.first) != 0;
        }
        if (p0 < 128) {
            return ((1 << (p0 - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        return (length == 0 || (i = (p0 / 64) + (-2)) >= length || ((1 << (p0 % 64)) & jArr[i]) == 0) ? false : true;
    }

    public final void set(int p0, boolean p1) {
        if (p0 < 64) {
            this.first = ((~(1 << p0)) & this.first) | ((p1 ? 1L : 0L) << p0);
            return;
        }
        if (p0 < 128) {
            this.second = ((~(1 << (p0 - 64))) & this.second) | ((p1 ? 1L : 0L) << p0);
            return;
        }
        int i = p0 / 64;
        int i2 = i - 2;
        int i3 = p0 % 64;
        long[] jArrCopyOf = this.others;
        if (i2 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i2] = ((~(1 << i3)) & jArrCopyOf[i2]) | ((p1 ? 1L : 0L) << i3);
    }

    private final int nextBit(int p0, Function1<? super Long, Long> p1) {
        int iNumberOfTrailingZeros;
        if (p0 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((p1.invoke(Long.valueOf(this.first)).longValue() >>> p0) << p0)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (p0 < 128) {
            int i = p0 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((p1.invoke(Long.valueOf(this.second)).longValue() >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(p0, 128);
        int i2 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long jLongValue = p1.invoke(Long.valueOf(jArr[i3])).longValue();
            if (i3 == i2) {
                int i4 = iMax % 64;
                jLongValue = (jLongValue >>> i4) << i4;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void setRange(int p0, int p1) {
        long j = p0 < p1 ? -1L : 0L;
        this.first = (((((long) (p0 < 64 ? 1 : 0)) * j) >>> (64 - (Math.min(64, p1) - p0))) << p0) | this.first;
        if (p1 > 64) {
            int iMax = Math.max(p0, 64);
            this.second = (((j * ((long) (iMax < 128 ? 1 : 0))) >>> (128 - (Math.min(128, p1) - iMax))) << iMax) | this.second;
            if (p1 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < p1; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(']');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final int nextSet(int p0) {
        int iNumberOfTrailingZeros;
        if (p0 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> p0) << p0)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (p0 < 128) {
            int i = p0 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(p0, 128);
        int i2 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = jArr[i3];
            if (i3 == i2) {
                int i4 = iMax % 64;
                j = (j >>> i4) << i4;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextClear(int p0) {
        int iNumberOfTrailingZeros;
        if (p0 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> p0) << p0)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (p0 < 128) {
            int i = p0 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i) << i);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(p0, 128);
        int i2 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = ~jArr[i3];
            if (i3 == i2) {
                int i4 = iMax % 64;
                j = (j >>> i4) << i4;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }
}
