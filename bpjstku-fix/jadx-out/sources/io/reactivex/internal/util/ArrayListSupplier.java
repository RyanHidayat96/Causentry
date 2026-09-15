package io.reactivex.internal.util;

import defpackage.readableMs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, readableMs<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> b() {
        return INSTANCE;
    }

    public static <T, O> readableMs<O, List<T>> TuitionPaymentFragmentbindingInflater1() {
        return INSTANCE;
    }

    @Override // defpackage.readableMs
    public final /* synthetic */ List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<Object> call() throws Exception {
        return new ArrayList();
    }
}
