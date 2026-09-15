package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda8<T, R> extends notifySuspended<T, R> {
    private readableMs<? super T, ? extends VideoRecordEventStatus<R>> b;

    public AudioSourceExternalSyntheticLambda8(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends VideoRecordEventStatus<R>> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, R> implements deriveMediaType<T>, BufferProviderState {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private readableMs<? super T, ? extends VideoRecordEventStatus<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private deriveMediaType<? super R> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends VideoRecordEventStatus<R>> readablems) {
            this.b = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            Throwable thB = null;
            if (this.TuitionPaymentFragmentbindingInflater1) {
                if (t instanceof VideoRecordEventStatus) {
                    VideoRecordEventStatus videoRecordEventStatus = (VideoRecordEventStatus) t;
                    if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                        Object obj = videoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj)) {
                            thB = NotificationLite.b(obj);
                        }
                        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(thB);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                VideoRecordEventStatus videoRecordEventStatus2 = (VideoRecordEventStatus) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(t), "The selector returned a null Notification");
                if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoRecordEventStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                    Object obj2 = videoRecordEventStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj2)) {
                        thB = NotificationLite.b(obj2);
                    }
                    onError(thB);
                    return;
                }
                if (videoRecordEventStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                    onComplete();
                    return;
                }
                deriveMediaType<? super R> derivemediatype = this.b;
                Object obj3 = videoRecordEventStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (obj3 != null && !NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj3)) {
                    thB = (Object) videoRecordEventStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                derivemediatype.onNext(thB);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                this.b.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.b.onComplete();
        }
    }
}
