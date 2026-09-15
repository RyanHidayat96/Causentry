package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.CodecStuckOnFlushQuirk;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableGroupBy<T, K, V> extends notifySuspended<T, CodecStuckOnFlushQuirk<K, V>> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private readableMs<? super T, ? extends K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super T, ? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public ObservableGroupBy(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super CodecStuckOnFlushQuirk<K, V>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new GroupByObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        final deriveMediaType<? super CodecStuckOnFlushQuirk<K, V>> downstream;
        final readableMs<? super T, ? extends K> keySelector;
        BufferProviderState upstream;
        final readableMs<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final Map<Object, TuitionPaymentFragmentbindingInflater1<K, V>> groups = new ConcurrentHashMap();

        public GroupByObserver(deriveMediaType<? super CodecStuckOnFlushQuirk<K, V>> derivemediatype, readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, int i, boolean z) {
            this.downstream = derivemediatype;
            this.keySelector = readablems;
            this.valueSelector = readablems2;
            this.bufferSize = i;
            this.delayError = z;
            lazySet(1);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            try {
                K kApply = this.keySelector.apply(t);
                Object obj = kApply != null ? kApply : TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                TuitionPaymentFragmentbindingInflater1<K, V> tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.groups.get(obj);
                if (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    getAndIncrement();
                    this.downstream.onNext(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                try {
                    Object objB = share.b(this.valueSelector.apply(t), "The value supplied is null");
                    State<V, K> state = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                    state.queue.TuitionPaymentFragmentbindingInflater1((T) objB);
                    state.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                State<T, K> state = ((TuitionPaymentFragmentbindingInflater1) it.next()).b;
                state.error = th;
                state.done = true;
                state.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                State<T, K> state = ((TuitionPaymentFragmentbindingInflater1) it.next()).b;
                state.done = true;
                state.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(K k) {
            if (k == null) {
                k = (K) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            this.groups.remove(k);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<K, T> extends CodecStuckOnFlushQuirk<K, T> {
        final State<T, K> b;

        public static <T, K> TuitionPaymentFragmentbindingInflater1<K, T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k, int i, GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new TuitionPaymentFragmentbindingInflater1<>(k, new State(i, groupByObserver, k, z));
        }

        private TuitionPaymentFragmentbindingInflater1(K k, State<T, K> state) {
            super(k);
            this.b = state;
        }

        @Override // defpackage.VideoRecordEventStart
        public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
            this.b.subscribe(derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class State<T, K> extends AtomicInteger implements BufferProviderState, AutoValue_VideoValidatedEncoderProfilesProxy<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final GroupByObserver<?, K, T> parent;
        final createMediaMuxer<T> queue;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicReference<deriveMediaType<? super T>> actual = new AtomicReference<>();

        State(int i, GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.queue = new createMediaMuxer<>(i);
            this.parent = groupByObserver;
            this.key = k;
            this.delayError = z;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.key);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // defpackage.AutoValue_VideoValidatedEncoderProfilesProxy
        public final void subscribe(deriveMediaType<? super T> derivemediatype) {
            if (this.once.compareAndSet(false, true)) {
                derivemediatype.onSubscribe(this);
                this.actual.lazySet(derivemediatype);
                if (this.cancelled.get()) {
                    this.actual.lazySet(null);
                    return;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
            }
            EmptyDisposable.b(new IllegalStateException("Only one Observer allowed!"), derivemediatype);
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            if (getAndIncrement() != 0) {
                return;
            }
            createMediaMuxer<T> createmediamuxer = this.queue;
            boolean z = this.delayError;
            deriveMediaType<? super T> derivemediatype = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (derivemediatype != null) {
                    while (true) {
                        boolean z2 = this.done;
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z3 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (!TuitionPaymentFragmentbindingInflater1(z2, z3, derivemediatype, z)) {
                            if (z3) {
                                break;
                            } else {
                                derivemediatype.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        } else {
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (derivemediatype == null) {
                    derivemediatype = this.actual.get();
                }
            }
        }

        private boolean TuitionPaymentFragmentbindingInflater1(boolean z, boolean z2, deriveMediaType<? super T> derivemediatype, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.key);
                this.actual.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                this.actual.lazySet(null);
                if (th != null) {
                    derivemediatype.onError(th);
                } else {
                    derivemediatype.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
                this.actual.lazySet(null);
                derivemediatype.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.actual.lazySet(null);
            derivemediatype.onComplete();
            return true;
        }
    }
}
