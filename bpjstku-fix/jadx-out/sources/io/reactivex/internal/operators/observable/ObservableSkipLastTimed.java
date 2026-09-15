package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.appendBackupVideoProfile;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSkipLastTimed<T> extends notifySuspended<T, T> {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TimeUnit asBinder;
    private int b;

    public ObservableSkipLastTimed(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.asBinder = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new SkipLastTimedObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SkipLastTimedObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final deriveMediaType<? super T> downstream;
        Throwable error;
        final createMediaMuxer<Object> queue;
        final appendBackupVideoProfile scheduler;
        final long time;
        final TimeUnit unit;
        BufferProviderState upstream;

        SkipLastTimedObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, boolean z) {
            this.downstream = derivemediatype;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = appendbackupvideoprofile;
            this.queue = new createMediaMuxer<>(i);
            this.delayError = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Long.valueOf(appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit)), t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super T> derivemediatype = this.downstream;
                createMediaMuxer<Object> createmediamuxer = this.queue;
                boolean z = this.delayError;
                TimeUnit timeUnit = this.unit;
                long j = this.time;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z2 = this.done;
                    Long l = (Long) createmediamuxer.b();
                    boolean z3 = l == null;
                    long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(timeUnit);
                    if (!z3 && l.longValue() > jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.error;
                            if (th != null) {
                                this.queue.TuitionPaymentFragmentbindingInflater1();
                                derivemediatype.onError(th);
                                return;
                            } else if (z3) {
                                derivemediatype.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                derivemediatype.onError(th2);
                                return;
                            } else {
                                derivemediatype.onComplete();
                                return;
                            }
                        }
                    }
                    if (!z3) {
                        createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        derivemediatype.onNext(createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }
}
