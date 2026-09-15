package retrofit2.adapter.rxjava2;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
final class ResultObservable<T> extends VideoRecordEventStart<Result<T>> {
    private final VideoRecordEventStart<Response<T>> upstream;

    ResultObservable(VideoRecordEventStart<Response<T>> videoRecordEventStart) {
        this.upstream = videoRecordEventStart;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Result<T>> derivemediatype) {
        this.upstream.subscribe(new ResultObserver(derivemediatype));
    }

    static class ResultObserver<R> implements deriveMediaType<Response<R>> {
        private final deriveMediaType<? super Result<R>> observer;

        ResultObserver(deriveMediaType<? super Result<R>> derivemediatype) {
            this.observer = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public void onSubscribe(BufferProviderState bufferProviderState) {
            this.observer.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        @Override // defpackage.deriveMediaType
        public void onError(Throwable th) {
            try {
                this.observer.onNext(Result.error(th));
                this.observer.onComplete();
            } catch (Throwable th2) {
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    dumpMediaCodecListForFormat.b(th3);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th2, th3));
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public void onComplete() {
            this.observer.onComplete();
        }
    }
}
