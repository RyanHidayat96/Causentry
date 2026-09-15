package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableZip<T, R> extends VideoRecordEventStart<R> {
    private readableMs<? super Object[], ? extends R> TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    public ObservableZip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems, int i, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxyArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iterable;
        this.TuitionPaymentFragmentbindingInflater1 = readablems;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        int length;
        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr == null) {
            autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[8];
            length = 0;
            for (AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (length == autoValue_VideoValidatedEncoderProfilesProxyArr.length) {
                    AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr2 = new AutoValue_VideoValidatedEncoderProfilesProxy[(length >> 2) + length];
                    System.arraycopy(autoValue_VideoValidatedEncoderProfilesProxyArr, 0, autoValue_VideoValidatedEncoderProfilesProxyArr2, 0, length);
                    autoValue_VideoValidatedEncoderProfilesProxyArr = autoValue_VideoValidatedEncoderProfilesProxyArr2;
                }
                autoValue_VideoValidatedEncoderProfilesProxyArr[length] = autoValue_VideoValidatedEncoderProfilesProxy;
                length++;
            }
        } else {
            length = autoValue_VideoValidatedEncoderProfilesProxyArr.length;
        }
        if (length == 0) {
            EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(derivemediatype, this.TuitionPaymentFragmentbindingInflater1, length, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i = this.b;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R>[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr = zipCoordinator.observers;
        int length2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i2] = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(zipCoordinator, i);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.downstream.onSubscribe(zipCoordinator);
        for (int i3 = 0; i3 < length2 && !zipCoordinator.cancelled; i3++) {
            autoValue_VideoValidatedEncoderProfilesProxyArr[i3].subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i3]);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ZipCoordinator<T, R> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final deriveMediaType<? super R> downstream;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R>[] observers;
        final T[] row;
        final readableMs<? super Object[], ? extends R> zipper;

        ZipCoordinator(deriveMediaType<? super R> derivemediatype, readableMs<? super Object[], ? extends R> readablems, int i, boolean z) {
            this.downstream = derivemediatype;
            this.zipper = readablems;
            this.observers = new TuitionPaymentFragmentspecialinlinedviewModeldefault2[i];
            this.row = (T[]) new Object[i];
            this.delayError = z;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.observers) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
            }
            if (getAndIncrement() == 0) {
                for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> tuitionPaymentFragmentspecialinlinedviewModeldefault3 : this.observers) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R>[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr = this.observers;
            deriveMediaType<? super R> derivemediatype = this.downstream;
            T[] tArr = this.row;
            boolean z = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr) {
                    if (tArr[i2] == null) {
                        boolean z2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z3 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (this.cancelled) {
                            TuitionPaymentFragmentbindingInflater1();
                            return;
                        }
                        if (z2) {
                            if (!z) {
                                Throwable th2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                if (th2 != null) {
                                    this.cancelled = true;
                                    TuitionPaymentFragmentbindingInflater1();
                                    derivemediatype.onError(th2);
                                    return;
                                } else if (z3) {
                                    this.cancelled = true;
                                    TuitionPaymentFragmentbindingInflater1();
                                    derivemediatype.onComplete();
                                    return;
                                }
                            } else if (z3) {
                                Throwable th3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                                this.cancelled = true;
                                TuitionPaymentFragmentbindingInflater1();
                                if (th3 != null) {
                                    derivemediatype.onError(th3);
                                    return;
                                } else {
                                    derivemediatype.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        }
                    } else if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && !z && (th = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) != null) {
                        this.cancelled = true;
                        TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i == 0) {
                    try {
                        derivemediatype.onNext((Object) share.b(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th4) {
                        dumpMediaCodecListForFormat.b(th4);
                        TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(th4);
                        return;
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        private void TuitionPaymentFragmentbindingInflater1() {
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.observers) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
            }
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> tuitionPaymentFragmentspecialinlinedviewModeldefault3 : this.observers) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> implements deriveMediaType<T> {
        Throwable TuitionPaymentFragmentbindingInflater1;
        volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ZipCoordinator<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final createMediaMuxer<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final AtomicReference<BufferProviderState> b = new AtomicReference<>();

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = zipCoordinator;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new createMediaMuxer<>(i);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.b, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(t);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
