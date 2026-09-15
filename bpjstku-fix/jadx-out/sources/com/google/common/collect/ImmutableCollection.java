package com.google.common.collect;

import defpackage.addAllCameraCaptureCallbacks;
import defpackage.mergeOptionValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object[0];
    private static final long serialVersionUID = 912559;

    abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    Object[] b() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract mergeOptionValue<E> iterator();

    ImmutableCollection() {
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            Object[] objArrB = b();
            if (objArrB != null) {
                return (T[]) Arrays.copyOfRange(objArrB, TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TuitionPaymentFragmentspecialinlinedviewModeldefault1(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(tArr, 0);
        return tArr;
    }

    int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        throw new UnsupportedOperationException();
    }

    int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> TuitionPaymentFragmentbindingInflater1() {
        return isEmpty() ? ImmutableList.asInterface() : ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(toArray());
    }

    int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        mergeOptionValue<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static abstract class TuitionPaymentFragmentbindingInflater1<E> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1191343493;

        public abstract TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentbindingInflater1(E e2);

        static int TuitionPaymentFragmentbindingInflater1(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        public TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E... eArr) {
            for (E e2 : eArr) {
                TuitionPaymentFragmentbindingInflater1(e2);
            }
            return this;
        }

        public TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                TuitionPaymentFragmentbindingInflater1(it.next());
            }
            return this;
        }
    }

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> extends TuitionPaymentFragmentbindingInflater1<E> {
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public int b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, "initialCapacity");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object[i];
            this.b = 0;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(objArr.length, this.b + i);
            if (iTuitionPaymentFragmentbindingInflater1 > objArr.length || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> TuitionPaymentFragmentbindingInflater1(E e2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = e2;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E... eArr) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.b = ((ImmutableCollection) collection).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b);
                    return this;
                }
            }
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable);
            return this;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] == null) {
                    throw new NullPointerException("at index ".concat(String.valueOf(i2)));
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
            System.arraycopy(objArr, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, i);
            this.b += i;
        }
    }
}
