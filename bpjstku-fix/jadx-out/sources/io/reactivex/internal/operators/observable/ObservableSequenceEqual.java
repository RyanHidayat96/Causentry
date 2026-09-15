package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpEncoderCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSequenceEqual<T> extends VideoRecordEventStart<Boolean> {
    private dumpEncoderCapabilities<? super T, ? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> b;

    public ObservableSequenceEqual(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities, int i) {
        this.b = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpencodercapabilities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Boolean> derivemediatype) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        derivemediatype.onSubscribe(equalCoordinator);
        b<T>[] bVarArr = equalCoordinator.observers;
        equalCoordinator.first.subscribe(bVarArr[0]);
        equalCoordinator.second.subscribe(bVarArr[1]);
    }

    static final class EqualCoordinator<T> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final dumpEncoderCapabilities<? super T, ? super T> comparer;
        final deriveMediaType<? super Boolean> downstream;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> first;
        final b<T>[] observers;
        final ArrayCompositeDisposable resources = new ArrayCompositeDisposable();
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> second;
        T v1;
        T v2;

        EqualCoordinator(deriveMediaType<? super Boolean> derivemediatype, int i, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities) {
            this.downstream = derivemediatype;
            this.first = autoValue_VideoValidatedEncoderProfilesProxy;
            this.second = autoValue_VideoValidatedEncoderProfilesProxy2;
            this.comparer = dumpencodercapabilities;
            this.observers = new b[]{new b<>(this, 0, i), new b<>(this, 1, i)};
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.observers;
                bVarArr[0].b.TuitionPaymentFragmentbindingInflater1();
                bVarArr[1].b.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.observers;
                b<T> bVar = bVarArr[0];
                createMediaMuxer<T> createmediamuxer = bVar.b;
                b<T> bVar2 = bVarArr[1];
                createMediaMuxer<T> createmediamuxer2 = bVar2.b;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (!z || (th2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                        boolean z2 = bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (!z2 || (th = bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                            if (this.v1 == null) {
                                this.v1 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                            boolean z3 = this.v1 == null;
                            if (this.v2 == null) {
                                this.v2 = createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                            T t = this.v2;
                            boolean z4 = t == null;
                            if (z && z2 && z3 && z4) {
                                this.downstream.onNext(Boolean.TRUE);
                                this.downstream.onComplete();
                                return;
                            }
                            if (z && z2 && z3 != z4) {
                                this.cancelled = true;
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                                this.downstream.onNext(Boolean.FALSE);
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z3 && !z4) {
                                try {
                                    if (this.comparer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.v1, t)) {
                                        this.v1 = null;
                                        this.v2 = null;
                                    } else {
                                        this.cancelled = true;
                                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                        createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                                        this.downstream.onNext(Boolean.FALSE);
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    dumpMediaCodecListForFormat.b(th3);
                                    this.cancelled = true;
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                                    this.downstream.onError(th3);
                                    return;
                                }
                            }
                            if (z3 || z4) {
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            }
                        } else {
                            this.cancelled = true;
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                            this.downstream.onError(th);
                            return;
                        }
                    } else {
                        this.cancelled = true;
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                        createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                        this.downstream.onError(th2);
                        return;
                    }
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    static final class b<T> implements deriveMediaType<T> {
        private EqualCoordinator<T> TuitionPaymentFragmentbindingInflater1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final createMediaMuxer<T> b;

        b(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.TuitionPaymentFragmentbindingInflater1 = equalCoordinator;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.b = new createMediaMuxer<>(i2);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            EqualCoordinator<T> equalCoordinator = this.TuitionPaymentFragmentbindingInflater1;
            equalCoordinator.resources.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.b.TuitionPaymentFragmentbindingInflater1(t);
            this.TuitionPaymentFragmentbindingInflater1.b();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.TuitionPaymentFragmentbindingInflater1.b();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.TuitionPaymentFragmentbindingInflater1.b();
        }
    }
}
