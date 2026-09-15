package io.reactivex.internal.queue;

import defpackage.getBytesPerFrame;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements getBytesPerFrame<T> {
    private final AtomicReference<LinkedQueueNode<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final AtomicReference<LinkedQueueNode<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MpscLinkedQueue() {
        AtomicReference<LinkedQueueNode<T>> atomicReference = new AtomicReference<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReference;
        AtomicReference<LinkedQueueNode<T>> atomicReference2 = new AtomicReference<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReference2;
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        atomicReference2.lazySet(linkedQueueNode);
        atomicReference.getAndSet(linkedQueueNode);
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(linkedQueueNode).lazySet(linkedQueueNode);
        return true;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        while (TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() != this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
        }
    }

    static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        E value;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e2) {
            this.value = e2;
        }
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
    }

    @Override // defpackage.getBytesPerFrame, defpackage.AudioSettingsBuilder
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode<T> linkedQueueNode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            T t = linkedQueueNode3.value;
            linkedQueueNode3.value = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.lazySet(linkedQueueNode3);
            return t;
        }
        if (linkedQueueNode2 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        T t2 = linkedQueueNode.value;
        linkedQueueNode.value = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.lazySet(linkedQueueNode);
        return t2;
    }
}
