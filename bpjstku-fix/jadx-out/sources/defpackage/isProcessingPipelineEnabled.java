package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LisProcessingPipelineEnabled;", "Lokhttp3/Interceptor;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class isProcessingPipelineEnabled implements Interceptor {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    public isProcessingPipelineEnabled(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Request request = p0.request();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody == null || request.header("Content-Encoding") != null || (requestBodyBody instanceof MultipartBody)) {
            return p0.proceed(request);
        }
        try {
            request = request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(requestBodyBody)).build();
        } catch (Exception e2) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor$intercept$compressedRequest$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Unable to gzip request body";
                }
            }, e2, false, null);
        }
        return p0.proceed(request);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RequestBody {
        private /* synthetic */ RequestBody TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return -1L;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(RequestBody requestBody) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = requestBody;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getContentType() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getContentType();
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(RotationProviderListener rotationProviderListener) throws IOException {
            Intrinsics.checkNotNullParameter(rotationProviderListener, "");
            RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(new updateScreenFlash(rotationProviderListener));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.writeTo(rotationProviderListenerTuitionPaymentFragmentbindingInflater1);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
        }
    }
}
