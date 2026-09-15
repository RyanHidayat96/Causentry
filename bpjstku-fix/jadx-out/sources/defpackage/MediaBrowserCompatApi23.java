package defpackage;

import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u0010"}, d2 = {"LMediaBrowserCompatApi23;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Lcoil/size/Scale;", "p4", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(IIIILcoil/size/Scale;)I", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(IIIILcoil/size/Scale;)D", "(DDDDLcoil/size/Scale;)D"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaBrowserCompatApi23 {
    public static final MediaBrowserCompatApi23 INSTANCE = new MediaBrowserCompatApi23();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MediaBrowserCompatApi23() {
    }

    @JvmStatic
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0, int p1, int p2, int p3, Scale p4) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(p0 / p2);
        int iHighestOneBit2 = Integer.highestOneBit(p1 / p3);
        int i = WhenMappings.$EnumSwitchMapping$0[p4.ordinal()];
        if (i == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.coerceAtLeast(iMin, 1);
    }

    @JvmStatic
    public static final double TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0, int p1, int p2, int p3, Scale p4) {
        double d = ((double) p2) / ((double) p0);
        double d2 = ((double) p3) / ((double) p1);
        int i = WhenMappings.$EnumSwitchMapping$0[p4.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Math.min(d, d2);
    }

    @JvmStatic
    public static final double TuitionPaymentFragmentspecialinlinedviewModeldefault2(double p0, double p1, double p2, double p3, Scale p4) {
        double d = p2 / p0;
        double d2 = p3 / p1;
        int i = WhenMappings.$EnumSwitchMapping$0[p4.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Math.min(d, d2);
    }
}
