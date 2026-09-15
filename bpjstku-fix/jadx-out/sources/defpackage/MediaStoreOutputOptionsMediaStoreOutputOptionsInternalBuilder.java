package defpackage;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i);

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, float f);

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, float f) {
        float f2 = i + f;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1() - 1;
        if (f2 == fTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            f2 = fTuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fTuitionPaymentFragmentspecialinlinedviewModeldefault1 || i2 < 0) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, i3, f2 % 1.0f);
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator<Integer> it = RangesKt.until(i4, i2).iterator();
                while (it.hasNext()) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(((IntIterator) it).nextInt());
                }
            }
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i3 < i5) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                Iterator<Integer> it2 = new IntRange(i2 + 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).iterator();
                while (it2.hasNext()) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(((IntIterator) it2).nextInt());
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
    }
}
