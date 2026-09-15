package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class getAdditionalTransformMatrixAppliedByProcessor<T, Y> {
    private final Map<T, TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LinkedHashMap(100, 0.75f, true);
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b;

    public int TuitionPaymentFragmentbindingInflater1(Y y) {
        return 1;
    }

    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t, Y y) {
    }

    public getAdditionalTransformMatrixAppliedByProcessor(long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
    }

    public final long TuitionPaymentFragmentbindingInflater1() {
        long j;
        synchronized (this) {
            j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return j;
    }

    public final Y TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        Y y;
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(t);
            y = tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 : null;
        }
        return y;
    }

    public final Y TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t, Y y) {
        synchronized (this) {
            int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(y);
            long j = iTuitionPaymentFragmentbindingInflater1;
            if (j >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(t, y);
                return null;
            }
            if (y != null) {
                this.b += j;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y> tuitionPaymentFragmentspecialinlinedviewModeldefault3Put = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(t, y == null ? null : new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>(y, iTuitionPaymentFragmentbindingInflater1));
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3Put != null) {
                this.b -= (long) tuitionPaymentFragmentspecialinlinedviewModeldefault3Put.b;
                if (!tuitionPaymentFragmentspecialinlinedviewModeldefault3Put.TuitionPaymentFragmentbindingInflater1.equals(y)) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(t, tuitionPaymentFragmentspecialinlinedviewModeldefault3Put.TuitionPaymentFragmentbindingInflater1);
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3Put != null ? tuitionPaymentFragmentspecialinlinedviewModeldefault3Put.TuitionPaymentFragmentbindingInflater1 : null;
        }
    }

    public final Y TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y> tuitionPaymentFragmentspecialinlinedviewModeldefault3Remove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(t);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3Remove == null) {
                return null;
            }
            this.b -= (long) tuitionPaymentFragmentspecialinlinedviewModeldefault3Remove.b;
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3Remove.TuitionPaymentFragmentbindingInflater1;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(0L);
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        synchronized (this) {
            while (this.b > j) {
                Iterator<Map.Entry<T, TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y>>> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet().iterator();
                Map.Entry<T, TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y>> next = it.next();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y> value = next.getValue();
                this.b -= (long) value.b;
                T key = next.getKey();
                it.remove();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(key, value.TuitionPaymentFragmentbindingInflater1);
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<Y> {
        final Y TuitionPaymentFragmentbindingInflater1;
        final int b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Y y, int i) {
            this.TuitionPaymentFragmentbindingInflater1 = y;
            this.b = i;
        }
    }
}
