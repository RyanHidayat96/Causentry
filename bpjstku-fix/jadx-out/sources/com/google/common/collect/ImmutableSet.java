package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import defpackage.CaptureStage;
import defpackage.mergeOptionValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final long serialVersionUID = 912559;
    private transient ImmutableList<E> TuitionPaymentFragmentbindingInflater1;

    boolean asInterface() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public abstract mergeOptionValue<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> ImmutableSet<E> g() {
        return RegularImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2) {
        return new SingletonImmutableSet(e2);
    }

    public static <E> ImmutableSet<E> b(E e2, E e3) {
        return b(2, e2, e3);
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentbindingInflater1(E e2, E e3, E e4) {
        return b(3, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2, E e3, E e4, E e5) {
        return b(4, e2, e3, e4, e5);
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentbindingInflater1(E e2, E e3, E e4, E e5, E e6) {
        return b(5, e2, e3, e4, e5, e6);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> TuitionPaymentFragmentbindingInflater1(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        if (eArr.length <= 2147483641) {
            int length = eArr.length + 6;
            Object[] objArr = new Object[length];
            objArr[0] = e2;
            objArr[1] = e3;
            objArr[2] = e4;
            objArr[3] = e5;
            objArr[4] = e6;
            objArr[5] = e7;
            System.arraycopy(eArr, 0, objArr, 6, eArr.length);
            return b(length, objArr);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> b(int i, Object... objArr) {
        while (i != 0) {
            if (i != 1) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                Object[] objArr2 = new Object[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                int i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int iHashCode = obj.hashCode();
                        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
                        while (true) {
                            int i6 = iRotateLeft & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += iHashCode;
                                i4++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            iRotateLeft++;
                        }
                    } else {
                        throw new NullPointerException("at index ".concat(String.valueOf(i5)));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new SingletonImmutableSet(Objects.requireNonNull(objArr[0]));
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(i4) >= iTuitionPaymentFragmentspecialinlinedviewModeldefault1 / 2) {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
                }
                i = i4;
            } else {
                return new SingletonImmutableSet(Objects.requireNonNull(objArr[0]));
            }
        }
        return RegularImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return BasicMeasure.EXACTLY;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return b(array.length, array);
    }

    public static <E> ImmutableSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return RegularImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return new SingletonImmutableSet(eArr[0]);
    }

    ImmutableSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && asInterface() && ((ImmutableSet) obj).asInterface() && hashCode() != obj.hashCode()) {
            return false;
        }
        return CaptureStage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return CaptureStage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> TuitionPaymentFragmentbindingInflater1() {
        ImmutableList<E> immutableList = this.TuitionPaymentFragmentbindingInflater1;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListA = a();
        this.TuitionPaymentFragmentbindingInflater1 = immutableListA;
        return immutableListA;
    }

    ImmutableList<E> a() {
        return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(toArray());
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.elements);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> asBinder() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>();
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> extends ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> {
        private Object[] TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> TuitionPaymentFragmentbindingInflater1(E e2) {
            this.TuitionPaymentFragmentbindingInflater1 = null;
            super.TuitionPaymentFragmentbindingInflater1(e2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E... eArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable<? extends E> iterable) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable);
            return this;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
            return this;
        }

        public ImmutableSet<E> TuitionPaymentFragmentbindingInflater1() {
            int i = this.b;
            if (i == 0) {
                return ImmutableSet.g();
            }
            if (i != 1) {
                ImmutableSet<E> immutableSetB = ImmutableSet.b(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.b = immutableSetB.size();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentbindingInflater1 = null;
                return immutableSetB;
            }
            return ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Objects.requireNonNull(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]));
        }
    }
}
