package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceEdgeExternalSyntheticLambda2<K, V> {
    private int TuitionPaymentFragmentbindingInflater1;
    private final LinkedHashMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int asBinder;
    public long b;
    private long d;

    protected long b(K k, V v) {
        return 1L;
    }

    public void b(boolean z, K k, V v, V v2) {
    }

    public SurfaceEdgeExternalSyntheticLambda2(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V b(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(k);
            if (v != null) {
                this.TuitionPaymentFragmentbindingInflater1++;
                return v;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
            return null;
        }
    }

    public final V TuitionPaymentFragmentbindingInflater1(K k, V v) {
        V vPut;
        K key;
        V value;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.asBinder++;
            this.d += TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, v);
            vPut = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(k, v);
            if (vPut != null) {
                this.d -= TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, vPut);
            }
        }
        if (vPut != null) {
            b(false, k, vPut, v);
        }
        long j = this.b;
        while (true) {
            synchronized (this) {
                if (this.d < 0 || (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty() && this.d != 0)) {
                    break;
                }
                if (this.d > j && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                    Map.Entry<K, V> next = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(key);
                    this.d -= TuitionPaymentFragmentspecialinlinedviewModeldefault1(key, value);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                }
                return vPut;
            }
            b(true, key, value, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(sb.toString());
    }

    public final V TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(k);
            if (vRemove != null) {
                this.d -= TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, vRemove);
            }
        }
        if (vRemove != null) {
            b(false, k, vRemove, null);
        }
        return vRemove;
    }

    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k, V v) {
        long jB = b(k, v);
        if (jB >= 0) {
            return jB;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = this.b;
        }
        return j;
    }

    public final String toString() {
        String str;
        synchronized (this) {
            int i = this.TuitionPaymentFragmentbindingInflater1;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i;
            str = String.format(Locale.ENGLISH, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Long.valueOf(this.b), Integer.valueOf(this.TuitionPaymentFragmentbindingInflater1), Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
        }
        return str;
    }
}
