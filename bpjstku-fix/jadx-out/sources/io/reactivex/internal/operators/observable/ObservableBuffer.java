package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends notifySuspended<T, U> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Callable<U> b;

    public ObservableBuffer(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, int i, int i2, Callable<U> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        this.b = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i == i2) {
            b bVar = new b(derivemediatype, i2, this.b);
            if (bVar.b()) {
                this.TuitionPaymentFragmentbindingInflater1.subscribe(bVar);
                return;
            }
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new BufferSkipObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
    }

    static final class b<T, U extends Collection<? super T>> implements deriveMediaType<T>, BufferProviderState {
        private Callable<U> TuitionPaymentFragmentbindingInflater1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private U TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private deriveMediaType<? super U> b;
        private BufferProviderState d;

        b(deriveMediaType<? super U> derivemediatype, int i, Callable<U> callable) {
            this.b = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.TuitionPaymentFragmentbindingInflater1 = callable;
        }

        final boolean b() {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (U) share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                BufferProviderState bufferProviderState = this.d;
                if (bufferProviderState == null) {
                    EmptyDisposable.b(th, this.b);
                    return false;
                }
                bufferProviderState.dispose();
                this.b.onError(th);
                return false;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.d, bufferProviderState)) {
                this.d = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.d.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            U u = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (u != null) {
                u.add(t);
                int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
                if (i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    this.b.onNext(u);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    b();
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            this.b.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            U u = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (u != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                if (!u.isEmpty()) {
                    this.b.onNext(u);
                }
                this.b.onComplete();
            }
        }
    }

    static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final deriveMediaType<? super U> downstream;
        long index;
        final int skip;
        BufferProviderState upstream;

        BufferSkipObserver(deriveMediaType<? super U> derivemediatype, int i, int i2, Callable<U> callable) {
            this.downstream = derivemediatype;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.upstream.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((U) ((Collection) share.b(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }
    }
}
