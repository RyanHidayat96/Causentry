package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.acquireBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpCodecCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends notifySuspended<TLeft, R> {
    private readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private dumpCodecCapabilities<? super TLeft, ? super TRight, ? extends R> b;

    public ObservableJoin(AutoValue_VideoValidatedEncoderProfilesProxy<TLeft> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> autoValue_VideoValidatedEncoderProfilesProxy2, readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super TLeft, ? super TRight, ? extends R> dumpcodeccapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems2;
        this.b = dumpcodeccapabilities;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        JoinDisposable joinDisposable = new JoinDisposable(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
        derivemediatype.onSubscribe(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        joinDisposable.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightObserver);
        ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new ObservableGroupJoin.LeftRightObserver(joinDisposable, false);
        joinDisposable.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightObserver2);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(leftRightObserver);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(leftRightObserver2);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements BufferProviderState, ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1 {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final deriveMediaType<? super R> downstream;
        final readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> leftEnd;
        int leftIndex;
        final dumpCodecCapabilities<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> rightEnd;
        int rightIndex;
        private static Integer b = 1;
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2;
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3;
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 4;
        final acquireBuffer disposables = new acquireBuffer();
        final createMediaMuxer<Object> queue = new createMediaMuxer<>(VideoRecordEventStart.bufferSize());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        JoinDisposable(deriveMediaType<? super R> derivemediatype, readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super TLeft, ? super TRight, ? extends R> dumpcodeccapabilities) {
            this.downstream = derivemediatype;
            this.leftEnd = readablems;
            this.rightEnd = readablems2;
            this.resultSelector = dumpcodeccapabilities;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.disposables.dispose();
            if (getAndIncrement() == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void b(deriveMediaType<?> derivemediatype) {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error);
            this.lefts.clear();
            this.rights.clear();
            derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        private void TuitionPaymentFragmentbindingInflater1() {
            if (getAndIncrement() == 0) {
                createMediaMuxer<Object> createmediamuxer = this.queue;
                deriveMediaType<? super R> derivemediatype = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                        this.disposables.dispose();
                        b(derivemediatype);
                        return;
                    }
                    boolean z = this.active.get() == 0;
                    Integer num = (Integer) createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        derivemediatype.onComplete();
                        return;
                    }
                    if (!z2) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (num == b) {
                            int i = this.leftIndex;
                            this.leftIndex = i + 1;
                            this.lefts.put(Integer.valueOf(i), (TLeft) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.leftEnd.apply(objTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The leftEnd returned a null ObservableSource");
                                ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new ObservableGroupJoin.LeftRightEndObserver(this, true, i);
                                this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightEndObserver);
                                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(leftRightEndObserver);
                                if (this.error.get() != null) {
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    this.disposables.dispose();
                                    b(derivemediatype);
                                    return;
                                }
                                Iterator<TRight> it = this.rights.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        derivemediatype.onNext((Object) share.b(this.resultSelector.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault2, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        dumpMediaCodecListForFormat.b(th);
                                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th);
                                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                        this.disposables.dispose();
                                        b(derivemediatype);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                dumpMediaCodecListForFormat.b(th2);
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th2);
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                this.disposables.dispose();
                                b(derivemediatype);
                                return;
                            }
                        } else if (num == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            int i2 = this.rightIndex;
                            this.rightIndex = i2 + 1;
                            this.rights.put(Integer.valueOf(i2), (TRight) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy2 = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.rightEnd.apply(objTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The rightEnd returned a null ObservableSource");
                                ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new ObservableGroupJoin.LeftRightEndObserver(this, false, i2);
                                this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightEndObserver2);
                                autoValue_VideoValidatedEncoderProfilesProxy2.subscribe(leftRightEndObserver2);
                                if (this.error.get() != null) {
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    this.disposables.dispose();
                                    b(derivemediatype);
                                    return;
                                }
                                Iterator<TLeft> it2 = this.lefts.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        derivemediatype.onNext((Object) share.b(this.resultSelector.b(it2.next(), objTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The resultSelector returned a null value"));
                                    } catch (Throwable th3) {
                                        dumpMediaCodecListForFormat.b(th3);
                                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th3);
                                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                        this.disposables.dispose();
                                        b(derivemediatype);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                dumpMediaCodecListForFormat.b(th4);
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th4);
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                this.disposables.dispose();
                                b(derivemediatype);
                                return;
                            }
                        } else if (num == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (ObservableGroupJoin.LeftRightEndObserver) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            this.lefts.remove(Integer.valueOf(leftRightEndObserver3.index));
                            if (this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightEndObserver3)) {
                                leftRightEndObserver3.dispose();
                            }
                        } else {
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (ObservableGroupJoin.LeftRightEndObserver) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            this.rights.remove(Integer.valueOf(leftRightEndObserver4.index));
                            if (this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightEndObserver4)) {
                                leftRightEndObserver4.dispose();
                            }
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void b(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                this.active.decrementAndGet();
                TuitionPaymentFragmentbindingInflater1();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightObserver);
            this.active.decrementAndGet();
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, Object obj) {
            synchronized (this) {
                this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z ? b : TuitionPaymentFragmentspecialinlinedviewModeldefault1, obj);
            }
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void b(boolean z, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z ? TuitionPaymentFragmentspecialinlinedviewModeldefault2 : TuitionPaymentFragmentspecialinlinedviewModeldefault3, leftRightEndObserver);
            }
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                TuitionPaymentFragmentbindingInflater1();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
