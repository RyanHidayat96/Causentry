package io.reactivex.internal.operators.observable;

import android.os.Process;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.appendBackupVideoProfile;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableTakeLastTimed<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long asBinder;
    private TimeUnit asInterface;
    private long b;

    public ObservableTakeLastTimed(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = j;
        this.asBinder = j2;
        this.asInterface = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TakeLastTimedObserver(derivemediatype, this.b, this.asBinder, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState {
        public static int TuitionPaymentFragmentbindingInflater1 = 0;
        public static int b = 0;
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final deriveMediaType<? super T> downstream;
        Throwable error;
        final createMediaMuxer<Object> queue;
        final appendBackupVideoProfile scheduler;
        final long time;
        final TimeUnit unit;
        BufferProviderState upstream;

        TakeLastTimedObserver(deriveMediaType<? super T> derivemediatype, long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, boolean z) {
            this.downstream = derivemediatype;
            this.count = j;
            this.time = j2;
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
            long j;
            long j2;
            createMediaMuxer<Object> createmediamuxer = this.queue;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit);
            long j3 = this.time;
            long j4 = this.count;
            boolean z = j4 == Long.MAX_VALUE;
            createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Long.valueOf(jTuitionPaymentFragmentspecialinlinedviewModeldefault2), t);
            while (!createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                if (((Long) createmediamuxer.b()).longValue() > jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j3) {
                    if (z) {
                        return;
                    }
                    long j5 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                    while (true) {
                        j = createmediamuxer.TuitionPaymentFragmentbindingInflater1.get();
                        j2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                        if (j5 == j2) {
                            break;
                        } else {
                            j5 = j2;
                        }
                    }
                    if ((((int) (j - j2)) >> 1) <= j4) {
                        return;
                    }
                }
                createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.error = th;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            Throwable th;
            if (compareAndSet(false, true)) {
                deriveMediaType<? super T> derivemediatype = this.downstream;
                createMediaMuxer<Object> createmediamuxer = this.queue;
                boolean z = this.delayError;
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit);
                long j = this.time;
                while (!this.cancelled) {
                    if (!z && (th = this.error) != null) {
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(th);
                        return;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            derivemediatype.onError(th2);
                            return;
                        } else {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (((Long) objTuitionPaymentFragmentspecialinlinedviewModeldefault2).longValue() >= jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j) {
                        derivemediatype.onNext(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 9559508;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            b = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }
}
