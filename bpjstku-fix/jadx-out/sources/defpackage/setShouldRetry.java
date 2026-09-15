package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class setShouldRetry implements Runnable {
    private final wrapImageProxy TuitionPaymentFragmentbindingInflater1;
    private final getImageReaderProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ImageAnalysisBlockingAnalyzer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final long b;

    public setShouldRetry(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, wrapImageProxy wrapimageproxy, getImageReaderProxy getimagereaderproxy, ScheduledExecutorService scheduledExecutorService, long j) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(wrapimageproxy, "");
        Intrinsics.checkNotNullParameter(getimagereaderproxy, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBlockingAnalyzer;
        this.TuitionPaymentFragmentbindingInflater1 = wrapimageproxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getimagereaderproxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = scheduledExecutorService;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double dTuitionPaymentFragmentbindingInflater1;
        MetadataImageReaderExternalSyntheticLambda0.Companion companion = MetadataImageReaderExternalSyntheticLambda0.INSTANCE;
        if (MetadataImageReaderExternalSyntheticLambda0.Companion.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rum")).notify == RumViewScope.RumViewType.FOREGROUND && (dTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1()) != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dTuitionPaymentFragmentbindingInflater1.doubleValue());
        }
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Vitals monitoring", this.b, TimeUnit.MILLISECONDS, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), this);
    }
}
