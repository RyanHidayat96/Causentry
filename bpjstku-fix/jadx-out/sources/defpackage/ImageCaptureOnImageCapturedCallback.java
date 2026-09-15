package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageCaptureOnImageCapturedCallback implements ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda1 {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;
    private final getContentValues TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getContentResolver b;

    public ImageCaptureOnImageCapturedCallback(ExecutorService executorService, InternalLogger internalLogger, getContentValues getcontentvalues, getContentResolver getcontentresolver) {
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getcontentvalues, "");
        Intrinsics.checkNotNullParameter(getcontentresolver, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = executorService;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcontentvalues;
        this.b = getcontentresolver;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda1
    public final void b() {
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "dataStoreClearAllData", this.TuitionPaymentFragmentbindingInflater1, new Runnable() { // from class: setReversedVertical
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureOnImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageCaptureOnImageCapturedCallback imageCaptureOnImageCapturedCallback) {
        Intrinsics.checkNotNullParameter(imageCaptureOnImageCapturedCallback, "");
        getContentResolver getcontentresolver = imageCaptureOnImageCapturedCallback.b;
        getFile getfile = getcontentresolver.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        File fileB = getFile.b(getcontentresolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getcontentresolver.b);
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileB, getcontentresolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            InternalLogger internalLogger = getcontentresolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(fileB, "");
            Intrinsics.checkNotNullParameter(internalLogger, "");
            Intrinsics.checkNotNullParameter(fileB, "");
            Intrinsics.checkNotNullParameter(internalLogger, "");
            File[] fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileB, null, internalLogger, FileExtKt$listFilesSafe$1.TuitionPaymentFragmentbindingInflater1);
            if (fileArr != null) {
                for (File file : fileArr) {
                    ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file, internalLogger);
                }
            }
        }
    }
}
