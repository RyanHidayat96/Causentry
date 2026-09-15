package com.google.common.base;

/* JADX INFO: loaded from: classes4.dex */
final class Absent<T> extends Optional<T> {
    private static Absent<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Optional
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        return t;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    static <T> Optional<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private Absent() {
    }

    @Override // com.google.common.base.Optional
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final String toString() {
        return "Optional.absent()";
    }

    private Object readResolve() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
