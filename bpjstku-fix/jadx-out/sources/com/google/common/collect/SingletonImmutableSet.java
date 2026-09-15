package com.google.common.collect;

import defpackage.addImplementationOptions;
import defpackage.mergeOptionValue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    private transient E TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    SingletonImmutableSet(E e2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final mergeOptionValue<E> iterator() {
        return new addImplementationOptions.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> TuitionPaymentFragmentbindingInflater1() {
        return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        objArr[i] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new addImplementationOptions.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
