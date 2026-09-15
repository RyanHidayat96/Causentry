package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_AudioSettings1;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.logToString;
import defpackage.mergeEncoderProfiles;
import defpackage.usesAffectedSoc;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRefCount<T> extends VideoRecordEventStart<T> {
    final long TuitionPaymentFragmentbindingInflater1;
    final usesAffectedSoc<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    RefConnection TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final TimeUnit b;
    private int g;

    public ObservableRefCount(usesAffectedSoc<T> usesaffectedsoc) {
        this(usesaffectedsoc, TimeUnit.NANOSECONDS);
    }

    private ObservableRefCount(usesAffectedSoc<T> usesaffectedsoc, TimeUnit timeUnit) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = usesaffectedsoc;
        this.g = 1;
        this.TuitionPaymentFragmentbindingInflater1 = 0L;
        this.b = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && refConnection.timer != null) {
                refConnection.timer.dispose();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            if (refConnection.connected || j2 != this.g) {
                z = false;
            } else {
                z = true;
                refConnection.connected = true;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(new RefCountObserver(derivemediatype, this, refConnection));
        if (z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(refConnection);
        }
    }

    final void b(RefConnection refConnection) {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof AutoValue_AudioSettings1) {
                RefConnection refConnection2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    if (refConnection.timer != null) {
                        refConnection.timer.dispose();
                        refConnection.timer = null;
                    }
                }
                long j = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j;
                if (j == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(refConnection);
                }
            } else {
                RefConnection refConnection3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (refConnection3 != null && refConnection3 == refConnection) {
                    if (refConnection.timer != null) {
                        refConnection.timer.dispose();
                        refConnection.timer = null;
                    }
                    long j2 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j2;
                    if (j2 == 0) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(refConnection);
                    }
                }
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RefConnection refConnection) {
        usesAffectedSoc<T> usesaffectedsoc = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (usesaffectedsoc instanceof BufferProviderState) {
            ((BufferProviderState) usesaffectedsoc).dispose();
        } else if (usesaffectedsoc instanceof mergeEncoderProfiles) {
            ((mergeEncoderProfiles) usesaffectedsoc).TuitionPaymentFragmentspecialinlinedviewModeldefault2(refConnection.get());
        }
    }

    final void TuitionPaymentFragmentbindingInflater1(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                BufferProviderState bufferProviderState = refConnection.get();
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(refConnection);
                usesAffectedSoc<T> usesaffectedsoc = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (usesaffectedsoc instanceof BufferProviderState) {
                    ((BufferProviderState) usesaffectedsoc).dispose();
                } else if (usesaffectedsoc instanceof mergeEncoderProfiles) {
                    if (bufferProviderState == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((mergeEncoderProfiles) usesaffectedsoc).TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferProviderState);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RefConnection extends AtomicReference<BufferProviderState> implements Runnable, logToString<BufferProviderState> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        BufferProviderState timer;

        @Override // defpackage.logToString
        public final /* synthetic */ void accept(BufferProviderState bufferProviderState) throws Exception {
            BufferProviderState bufferProviderState2 = bufferProviderState;
            DisposableHelper.b(this, bufferProviderState2);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((mergeEncoderProfiles) this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferProviderState2);
                }
            }
        }

        RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.parent.TuitionPaymentFragmentbindingInflater1(this);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RefCountObserver<T> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final deriveMediaType<? super T> downstream;
        final ObservableRefCount<T> parent;
        BufferProviderState upstream;

        RefCountObserver(deriveMediaType<? super T> derivemediatype, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = derivemediatype;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.b(this.connection);
                this.downstream.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.b(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount<T> observableRefCount = this.parent;
                RefConnection refConnection = this.connection;
                synchronized (observableRefCount) {
                    RefConnection refConnection2 = observableRefCount.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (refConnection2 == null || refConnection2 != refConnection) {
                        return;
                    }
                    long j = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j;
                    if (j == 0 && refConnection.connected) {
                        if (observableRefCount.TuitionPaymentFragmentbindingInflater1 == 0) {
                            observableRefCount.TuitionPaymentFragmentbindingInflater1(refConnection);
                            return;
                        }
                        refConnection.timer = new SequentialDisposable();
                        appendBackupVideoProfile appendbackupvideoprofile = observableRefCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        long j2 = observableRefCount.TuitionPaymentFragmentbindingInflater1;
                        TimeUnit timeUnit = observableRefCount.b;
                        throw null;
                    }
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
