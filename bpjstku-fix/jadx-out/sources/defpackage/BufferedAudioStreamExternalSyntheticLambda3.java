package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamExternalSyntheticLambda3<T, B, V> extends notifySuspended<T, VideoRecordEventStart<T>> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<B> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super B, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public BufferedAudioStreamExternalSyntheticLambda3(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy2, readableMs<? super B, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, B, V> extends stopSendingAudio<T, Object, VideoRecordEventStart<T>> implements BufferProviderState {
        private AtomicLong INotificationSideChannel;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicReference<BufferProviderState> f94a;
        private int asBinder;
        final acquireBuffer asInterface;
        private List<UnicastSubject<T>> cancel;
        private readableMs<? super B, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> cancelAll;
        BufferProviderState d;
        private AtomicBoolean notify;
        private AutoValue_VideoValidatedEncoderProfilesProxy<B> onTransact;

        @Override // defpackage.stopSendingAudio, defpackage.isMotoC
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, Object obj) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super B, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, int i) {
            super(derivemediatype, new MpscLinkedQueue());
            this.f94a = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.INotificationSideChannel = atomicLong;
            this.notify = new AtomicBoolean();
            this.onTransact = autoValue_VideoValidatedEncoderProfilesProxy;
            this.cancelAll = readablems;
            this.asBinder = i;
            this.asInterface = new acquireBuffer();
            this.cancel = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.d, bufferProviderState)) {
                this.d = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                if (this.notify.get()) {
                    return;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.f94a, null, tuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    this.onTransact.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.b = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            if (this.INotificationSideChannel.decrementAndGet() == 0) {
                this.asInterface.dispose();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (this.g.getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            if (this.INotificationSideChannel.decrementAndGet() == 0) {
                this.asInterface.dispose();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.notify.compareAndSet(false, true)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f94a);
                if (this.INotificationSideChannel.decrementAndGet() == 0) {
                    this.d.dispose();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.notify.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List<UnicastSubject<T>> list = this.cancel;
            int iAddAndGet = 1;
            while (true) {
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                boolean z2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                if (z && z2) {
                    this.asInterface.dispose();
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f94a);
                    Throwable th = this.b;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof b) {
                        b bVar = (b) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bVar.b != null) {
                            if (list.remove(bVar.b)) {
                                bVar.b.onComplete();
                                if (this.INotificationSideChannel.decrementAndGet() == 0) {
                                    this.asInterface.dispose();
                                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f94a);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.notify.get()) {
                            UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder);
                            list.add(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            derivemediatype.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.cancelAll.apply(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "The ObservableSource supplied is null");
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                                    this.INotificationSideChannel.getAndIncrement();
                                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                }
                            } catch (Throwable th2) {
                                dumpMediaCodecListForFormat.b(th2);
                                this.notify.set(true);
                                derivemediatype.onError(th2);
                            }
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        }
                    }
                } else {
                    iAddAndGet = this.g.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
                Iterator<UnicastSubject<T>> it = this.cancel.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (this.g.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
                if (this.g.getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, B> {
        final B TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final UnicastSubject<T> b;

        b(UnicastSubject<T> unicastSubject, B b) {
            this.b = unicastSubject;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = b;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, B> extends isProblematicMimeType<B> {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, B, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, B, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(B b) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, B, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) new b(null, b));
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.g.getAndIncrement() == 0) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, B, ?> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.d.dispose();
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.dispose();
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, V> extends isProblematicMimeType<V> {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private UnicastSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, ?, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, ?, V> tuitionPaymentFragmentspecialinlinedviewModeldefault3, UnicastSubject<T> unicastSubject) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = unicastSubject;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(V v) {
            dispose();
            onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, ?, V> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.d.dispose();
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.dispose();
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, ?, V> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((U) new b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null));
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.g.getAndIncrement() == 0) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
    }
}
