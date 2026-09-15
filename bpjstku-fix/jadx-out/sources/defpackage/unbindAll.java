package defpackage;

import com.nbs.nucleo.utils.exception.ApiException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class unbindAll<T> implements VideoRecordEventFinalizeVideoRecordError<T, Response<T>> {

    public static final class TuitionPaymentFragmentbindingInflater1 implements AudioConfig<Response<T>> {
        private /* synthetic */ AudioConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
        }

        TuitionPaymentFragmentbindingInflater1(AudioConfig audioConfig) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = audioConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AudioConfig
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            Response response = (Response) obj;
            if (response != null && !response.isSuccessful()) {
                AudioConfig audioConfig = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                resetChildren resetchildren = resetChildren.INSTANCE;
                audioConfig.onError(resetChildren.TuitionPaymentFragmentspecialinlinedviewModeldefault3(response));
            } else {
                if (response != null && response.code() == 204) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(new ApiException(new lambdasubmitStillCaptureRequests0(204, "Data Empty", "No Content"), response));
                    return;
                }
                AudioConfig audioConfig2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objBody = response != null ? response.body() : null;
                if (objBody == null) {
                    Intrinsics.throwNpe();
                }
                audioConfig2.onNext(objBody);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }

        @Override // defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(outputTransform);
        }
    }

    @Override // defpackage.VideoRecordEventFinalizeVideoRecordError
    public final AudioConfig<? super Response<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioConfig<? super T> audioConfig) {
        return new TuitionPaymentFragmentbindingInflater1(audioConfig);
    }
}
