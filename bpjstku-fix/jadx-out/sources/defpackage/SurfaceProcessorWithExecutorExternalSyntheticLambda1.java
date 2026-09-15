package defpackage;

import java.lang.ref.Reference;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SurfaceProcessorWithExecutorExternalSyntheticLambda1<K, V, R extends Reference<V>> {
    Hashtable<K, R> b = new Hashtable<>();

    protected abstract R TuitionPaymentFragmentspecialinlinedviewModeldefault2(V v);

    public final V TuitionPaymentFragmentspecialinlinedviewModeldefault3(K k, V v) {
        R rPut = this.b.put(k, (R) TuitionPaymentFragmentspecialinlinedviewModeldefault2(v));
        if (rPut == null) {
            return null;
        }
        return (V) rPut.get();
    }
}
