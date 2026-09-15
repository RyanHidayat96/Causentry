package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveCodec;
import defpackage.deriveMediaType;
import defpackage.dumpEncoderCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getDefaultVideoProfile;
import defpackage.newSharedInstance;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSequenceEqualSingle<T> extends deriveCodec<Boolean> implements newSharedInstance<Boolean> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private dumpEncoderCapabilities<? super T, ? super T> b;

    public ObservableSequenceEqualSingle(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.b = dumpencodercapabilities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b);
        getdefaultvideoprofile.onSubscribe(equalCoordinator);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = equalCoordinator.observers;
        equalCoordinator.first.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[0]);
        equalCoordinator.second.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[1]);
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new ObservableSequenceEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class EqualCoordinator<T> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final dumpEncoderCapabilities<? super T, ? super T> comparer;
        final getDefaultVideoProfile<? super Boolean> downstream;
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> first;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] observers;
        final ArrayCompositeDisposable resources = new ArrayCompositeDisposable();
        final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> second;
        T v1;
        T v2;

        EqualCoordinator(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile, int i, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities) {
            this.downstream = getdefaultvideoprofile;
            this.first = autoValue_VideoValidatedEncoderProfilesProxy;
            this.second = autoValue_VideoValidatedEncoderProfilesProxy2;
            this.comparer = dumpencodercapabilities;
            this.observers = new TuitionPaymentFragmentspecialinlinedviewModeldefault1[]{new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(this, 0, i), new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(this, 1, i)};
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = this.observers;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[0].b.TuitionPaymentFragmentbindingInflater1();
                tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[1].b.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = this.observers;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[0];
                createMediaMuxer<T> createmediamuxer = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[1];
                createMediaMuxer<T> createmediamuxer2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!z || (th2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) == null) {
                        boolean z2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!z2 || (th = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) == null) {
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
                                this.downstream.b(Boolean.TRUE);
                                return;
                            }
                            if (z && z2 && z3 != z4) {
                                this.cancelled = true;
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
                                this.downstream.b(Boolean.FALSE);
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
                                        this.downstream.b(Boolean.FALSE);
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

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T> {
        Throwable TuitionPaymentFragmentbindingInflater1;
        volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private EqualCoordinator<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final createMediaMuxer<T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = equalCoordinator;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.b = new createMediaMuxer<>(i2);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            EqualCoordinator<T> equalCoordinator = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            equalCoordinator.resources.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.b.TuitionPaymentFragmentbindingInflater1(t);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
