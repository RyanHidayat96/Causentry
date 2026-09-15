package defpackage;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class addTag<K, V> extends clearSurfaces<K, V> implements ConcurrentMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clearSurfaces
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1().replace(k, v, v2);
    }
}
