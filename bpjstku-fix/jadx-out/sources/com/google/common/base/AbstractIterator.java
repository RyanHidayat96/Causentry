package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {
    private State TuitionPaymentFragmentbindingInflater1 = State.NOT_READY;
    private T b;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T b();

    protected final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1 = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.TuitionPaymentFragmentbindingInflater1 != State.FAILED) {
            int iOrdinal = this.TuitionPaymentFragmentbindingInflater1.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal != 2) {
                this.TuitionPaymentFragmentbindingInflater1 = State.FAILED;
                this.b = b();
                if (this.TuitionPaymentFragmentbindingInflater1 != State.DONE) {
                    this.TuitionPaymentFragmentbindingInflater1 = State.READY;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.TuitionPaymentFragmentbindingInflater1 = State.NOT_READY;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
