package com.koushikdutta.async.util;

import defpackage.removeTransformationUpdateListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class ArrayDeque<E> extends AbstractCollection<E> implements removeTransformationUpdateListener<E>, Cloneable, Serializable {
    private static final long serialVersionUID = 2340985798034038923L;
    public transient int TuitionPaymentFragmentbindingInflater1;
    public transient int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public transient Object[] b = new Object[16];

    private void TuitionPaymentFragmentbindingInflater1() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object[] objArr = this.b;
        int length = objArr.length;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, i, objArr2, 0, i2);
        System.arraycopy(this.b, 0, objArr2, i2, i);
        this.b = objArr2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        this.TuitionPaymentFragmentbindingInflater1 = length;
    }

    private <T> T[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(T[] tArr) {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i < i2) {
            System.arraycopy(this.b, i, tArr, 0, size());
            return tArr;
        }
        if (i > i2) {
            Object[] objArr = this.b;
            int length = objArr.length - i;
            System.arraycopy(objArr, i, tArr, 0, length);
            System.arraycopy(this.b, 0, tArr, length, this.TuitionPaymentFragmentbindingInflater1);
        }
        return tArr;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2) {
        if (e2 == null) {
            throw new NullPointerException("e == null");
        }
        Object[] objArr = this.b;
        int length = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1) & (objArr.length - 1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = length;
        objArr[length] = e2;
        if (length == this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
        if (e2 == null) {
            throw new NullPointerException("e == null");
        }
        Object[] objArr = this.b;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        objArr[i] = e2;
        int length = (objArr.length - 1) & (i + 1);
        this.TuitionPaymentFragmentbindingInflater1 = length;
        if (length == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    public final E TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object[] objArr = this.b;
        E e2 = (E) objArr[i];
        if (e2 == null) {
            return null;
        }
        objArr[i] = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (i + 1) & (objArr.length - 1);
        return e2;
    }

    public final E b() {
        Object[] objArr = this.b;
        E e2 = (E) objArr[(this.TuitionPaymentFragmentbindingInflater1 - 1) & (objArr.length - 1)];
        if (e2 != null) {
            return e2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
        return true;
    }

    @Override // java.util.Queue
    public E poll() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        Object[] objArr = this.b;
        int length = objArr.length - 1;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = this.TuitionPaymentFragmentbindingInflater1;
        int i4 = (i - i2) & length;
        int i5 = (i3 - i) & length;
        if (i4 >= ((i3 - i2) & length)) {
            throw new ConcurrentModificationException();
        }
        if (i4 < i5) {
            if (i2 <= i) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i2, objArr, i2 + 1, length - i2);
            }
            objArr[i2] = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (i2 + 1) & length;
            return false;
        }
        if (i < i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i5);
            this.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
        } else {
            System.arraycopy(objArr, i + 1, objArr, i, length - i);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i3);
            this.TuitionPaymentFragmentbindingInflater1 = (i3 - 1) & length;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.TuitionPaymentFragmentbindingInflater1 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) & (this.b.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (byte) 0);
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Iterator<E> {
        private int TuitionPaymentFragmentbindingInflater1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int b;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ArrayDeque.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.b = ArrayDeque.this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = -1;
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(ArrayDeque arrayDeque, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != this.b;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != this.b) {
                E e2 = (E) ArrayDeque.this.b[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2];
                if (ArrayDeque.this.TuitionPaymentFragmentbindingInflater1 != this.b || e2 == null) {
                    throw new ConcurrentModificationException();
                }
                int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentbindingInflater1 = i;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (i + 1) & (ArrayDeque.this.b.length - 1);
                return e2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.TuitionPaymentFragmentbindingInflater1;
            if (i >= 0) {
                if (ArrayDeque.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i)) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1) & (ArrayDeque.this.b.length - 1);
                    this.b = ArrayDeque.this.TuitionPaymentFragmentbindingInflater1;
                }
                this.TuitionPaymentFragmentbindingInflater1 = -1;
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.b.length;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        while (true) {
            Object obj2 = this.b[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                return true;
            }
            i = (i + 1) & (length - 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i != i2) {
            this.TuitionPaymentFragmentbindingInflater1 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int length = this.b.length;
            do {
                this.b[i] = null;
                i = (i + 1) & (length - 1);
            } while (i != i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((Object[]) tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public ArrayDeque<E> clone() {
        try {
            ArrayDeque<E> arrayDeque = (ArrayDeque) super.clone();
            Object[] objArr = this.b;
            System.arraycopy(objArr, 0, arrayDeque.b, 0, objArr.length);
            return arrayDeque;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        int length = this.b.length;
        for (int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i != this.TuitionPaymentFragmentbindingInflater1; i = (i + 1) & (length - 1)) {
            objectOutputStream.writeObject(this.b[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        int i2 = 8;
        if (i >= 8) {
            int i3 = (i >>> 1) | i;
            int i4 = i3 | (i3 >>> 2);
            int i5 = i4 | (i4 >>> 4);
            int i6 = i5 | (i5 >>> 8);
            i2 = (i6 | (i6 >>> 16)) + 1;
            if (i2 < 0) {
                i2 >>>= 1;
            }
        }
        this.b = new Object[i2];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        for (int i7 = 0; i7 < i; i7++) {
            this.b[i7] = objectInputStream.readObject();
        }
    }

    @Override // java.util.Queue
    public E element() {
        E e2 = (E) this.b[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2];
        if (e2 != null) {
            return e2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return (E) this.b[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2];
    }

    @Override // java.util.Queue
    public E remove() {
        E eTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (eTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return eTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.b.length;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        while (true) {
            Object obj2 = this.b[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                return true;
            }
            i = (i + 1) & (length - 1);
        }
    }
}
