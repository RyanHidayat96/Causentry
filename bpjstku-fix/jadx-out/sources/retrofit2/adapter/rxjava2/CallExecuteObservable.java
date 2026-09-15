package retrofit2.adapter.rxjava2;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import io.reactivex.exceptions.CompositeException;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
final class CallExecuteObservable<T> extends VideoRecordEventStart<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Response<T>> derivemediatype) {
        boolean z;
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        derivemediatype.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                derivemediatype.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                derivemediatype.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                dumpMediaCodecListForFormat.b(th);
                if (z) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    derivemediatype.onError(th);
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    static final class CallDisposable implements BufferProviderState {
        private final Call<?> call;
        private volatile boolean disposed;

        CallDisposable(Call<?> call) {
            this.call = call;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.disposed;
        }
    }
}
