package defpackage;

import android.os.Process;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes3.dex */
public final class setSurfaceOccupancyPriority<K, V> extends ArrayMap<K, V> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V setValueAt(int i, V v) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        return (V) super.setValueAt(i, v);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final V put(K k, V v) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        return (V) super.put(k, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V removeAt(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = super.hashCode();
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5612575;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        TuitionPaymentFragmentbindingInflater1 = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
