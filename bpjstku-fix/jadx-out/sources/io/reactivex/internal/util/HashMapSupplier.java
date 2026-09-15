package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public enum HashMapSupplier implements Callable<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> Callable<Map<K, V>> TuitionPaymentFragmentbindingInflater1() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
