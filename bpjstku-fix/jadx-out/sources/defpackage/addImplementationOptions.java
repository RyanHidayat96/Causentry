package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class addImplementationOptions {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Iterator<?> it, int i) {
        int i2 = 0;
        if (i >= 0) {
            while (i2 < i && it.hasNext()) {
                it.next();
                i2++;
            }
            return i2;
        }
        throw new IllegalArgumentException("numberToAdvance must be nonnegative");
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends CameraThreadConfig<T> {
        static final hasConflict<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[0]);
        private final T[] b;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(T[] tArr) {
            super(tArr.length, 0);
            this.b = tArr;
        }

        @Override // defpackage.CameraThreadConfig
        protected final T b(int i) {
            return this.b[i];
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1<T> extends mergeOptionValue<T> {
        private final T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean b;

        public TuitionPaymentFragmentbindingInflater1(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b) {
                throw new NoSuchElementException();
            }
            this.b = true;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> implements CaptureConfigOptionUnpacker<E> {
        private final Iterator<? extends E> TuitionPaymentFragmentbindingInflater1;
        private E TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterator<? extends E> it) {
            this.TuitionPaymentFragmentbindingInflater1 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || this.TuitionPaymentFragmentbindingInflater1.hasNext();
        }

        @Override // defpackage.CaptureConfigOptionUnpacker, java.util.Iterator
        public final E next() {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return this.TuitionPaymentFragmentbindingInflater1.next();
            }
            E e2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            return e2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentbindingInflater1.remove();
                return;
            }
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }

        @Override // defpackage.CaptureConfigOptionUnpacker
        public final E TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.next();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements Iterator<T> {
        private Iterator<? extends T> TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Iterator<? extends Iterator<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Iterator<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Deque<Iterator<? extends Iterator<? extends T>>> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterator<? extends Iterator<? extends T>> it) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (!this.TuitionPaymentFragmentbindingInflater1.hasNext()) {
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (it2 == null || !it2.hasNext()) {
                        Deque<Iterator<? extends Iterator<? extends T>>> deque = this.b;
                        if (deque == null || deque.isEmpty()) {
                            it = null;
                            break;
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.removeFirst();
                    } else {
                        it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        break;
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.TuitionPaymentFragmentbindingInflater1 = next;
                if (next instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) next;
                    this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                    if (this.b == null) {
                        this.b = new ArrayDeque();
                    }
                    this.b.addFirst(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.b != null) {
                        while (!tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.isEmpty()) {
                            this.b.addFirst(tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.removeLast());
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.TuitionPaymentFragmentbindingInflater1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator<? extends T> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
    }
}
