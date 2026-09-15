package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean TuitionPaymentFragmentbindingInflater1();

    public abstract T TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract T TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t);

    public static <T> Optional<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return Absent.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static <T> Optional<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        return new Present(t);
    }

    Optional() {
    }
}
