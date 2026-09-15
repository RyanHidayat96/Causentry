package com.google.common.collect;

import defpackage.mergeOptionValue;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractIterator<T> extends mergeOptionValue<T> {
    private State TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.NOT_READY;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T b();

    protected final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != State.FAILED) {
            int iOrdinal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal != 2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.FAILED;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = b();
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != State.DONE) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.READY;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.NOT_READY;
        T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        return t;
    }
}
