package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int b;

    public BlockingObservableIterable(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.b);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BlockingObservableIterator<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, Iterator<T>, BufferProviderState {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final Lock lock;
        final createMediaMuxer<T> queue;

        BlockingObservableIterator(int i) {
            this.queue = new createMediaMuxer<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.done;
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                    }
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        return false;
                    }
                }
                if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return true;
                }
                try {
                    this.lock.lock();
                    while (!this.done && this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && !isDisposed()) {
                        try {
                            this.condition.await();
                        } catch (Throwable th2) {
                            this.lock.unlock();
                            throw th2;
                        }
                    }
                    this.lock.unlock();
                } catch (InterruptedException e2) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
                }
            }
            Throwable th3 = this.error;
            if (th3 == null) {
                return false;
            }
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th3);
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                return this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            throw new NoSuchElementException();
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.queue.TuitionPaymentFragmentbindingInflater1(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }
}
