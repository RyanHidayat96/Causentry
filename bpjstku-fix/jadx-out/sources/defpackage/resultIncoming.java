package defpackage;

import com.datadog.android.api.storage.EventType;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LresultIncoming;", "LImageAnalysisNonBlockingAnalyzer1;", "", "LImageReaderFormatRecommender;", "p0", "LgetSize;", "p1", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "p2", "<init>", "(LImageReaderFormatRecommender;LImageReaderFormatRecommender;LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;)V", "LImageAnalysisNonBlockingAnalyzer;", "Lcom/datadog/android/api/storage/EventType;", "", "b", "(LImageAnalysisNonBlockingAnalyzer;Ljava/lang/Object;Lcom/datadog/android/api/storage/EventType;)Z", "LImageReaderFormatRecommender;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class resultIncoming implements ImageAnalysisNonBlockingAnalyzer1<Object> {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[0];

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ImageReaderFormatRecommender<Object> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ImageReaderFormatRecommender<getSize> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public resultIncoming(ImageReaderFormatRecommender<Object> imageReaderFormatRecommender, ImageReaderFormatRecommender<getSize> imageReaderFormatRecommender2, ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(imageReaderFormatRecommender, "");
        Intrinsics.checkNotNullParameter(imageReaderFormatRecommender2, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0, "");
        this.TuitionPaymentFragmentbindingInflater1 = imageReaderFormatRecommender;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageReaderFormatRecommender2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzer1
    public final boolean b(ImageAnalysisNonBlockingAnalyzer p0, Object p1, EventType p2) {
        ImageCapture imageCapture;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImmutableImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, p1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return false;
        }
        if (p1 instanceof ViewEvent) {
            ViewEvent viewEvent = (ViewEvent) p1;
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new getSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewEvent.connect.connect, viewEvent.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            imageCapture = new ImageCapture(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            imageCapture = new ImageCapture(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, 2, null);
        }
        synchronized (this) {
            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageCapture, p2);
            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                if (p1 instanceof ViewEvent) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        }
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
