package com.google.common.base;

import defpackage.createFromImageProxy;
import defpackage.getAllExifTags;

/* JADX INFO: loaded from: classes4.dex */
public final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.google.common.base.Optional
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        return true;
    }

    Present(T t) {
        this.reference = t;
    }

    @Override // com.google.common.base.Optional
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        return this.reference;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        getAllExifTags.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = createFromImageProxy.TuitionPaymentFragmentbindingInflater1[0];
    }
}
