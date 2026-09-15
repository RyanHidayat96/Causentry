package com.google.common.collect;

import defpackage.mergeOptionValue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final transient int TuitionPaymentFragmentbindingInflater1;
    private final transient int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private transient Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private transient Object[] asInterface;
    private final transient int b;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    final boolean asInterface() {
        return true;
    }

    static {
        Object[] objArr = new Object[0];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.asInterface = objArr2;
        this.b = i2;
        this.TuitionPaymentFragmentbindingInflater1 = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.asInterface;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.b;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final mergeOptionValue<E> iterator() {
        return TuitionPaymentFragmentbindingInflater1().iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final Object[] b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        System.arraycopy(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, objArr, i, this.TuitionPaymentFragmentbindingInflater1);
        return i + this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // com.google.common.collect.ImmutableSet
    final ImmutableList<E> a() {
        return ImmutableList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return TuitionPaymentFragmentbindingInflater1().iterator();
    }
}
