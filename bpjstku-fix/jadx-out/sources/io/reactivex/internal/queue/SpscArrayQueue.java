package io.reactivex.internal.queue;

import defpackage.getBytesPerFrame;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements getBytesPerFrame<E> {
    private static final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.mask;
        long j = this.producerIndex.get();
        int i2 = ((int) j) & i;
        if (j >= this.producerLookAhead) {
            long j2 = ((long) this.lookAheadStep) + j;
            if (get(i & ((int) j2)) == null) {
                this.producerLookAhead = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e2);
        this.producerIndex.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.getBytesPerFrame, defpackage.AudioSettingsBuilder
    public final E TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        long j = this.consumerIndex.get();
        int i = ((int) j) & this.mask;
        E e2 = get(i);
        if (e2 == null) {
            return null;
        }
        this.consumerIndex.lazySet(j + 1);
        lazySet(i, null);
        return e2;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        while (true) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null && this.producerIndex.get() == this.consumerIndex.get()) {
                return;
            }
        }
    }

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, TuitionPaymentFragmentspecialinlinedviewModeldefault1.intValue());
    }
}
