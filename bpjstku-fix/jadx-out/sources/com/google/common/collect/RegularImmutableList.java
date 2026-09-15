package com.google.common.collect;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.updateAndVerifyState;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new RegularImmutableList(new Object[0], 0);
    private transient Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final transient int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return 0;
    }

    RegularImmutableList(Object[] objArr, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = objArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final Object[] b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        System.arraycopy(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 0, objArr, i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return i + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.util.List
    public E get(int i) {
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i >= 0 && i < i2) {
            return (E) Objects.requireNonNull(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return super.writeReplace();
    }
}
