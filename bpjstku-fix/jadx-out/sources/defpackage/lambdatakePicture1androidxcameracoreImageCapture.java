package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdatakePicture1androidxcameracoreImageCapture implements onCameraControlReady {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;
    private final ScheduledThreadPoolExecutor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getResolutionInfoInternal b;

    public lambdatakePicture1androidxcameracoreImageCapture(String str, ImageCaptureOnImageSavedCallback imageCaptureOnImageSavedCallback, lambdacreatePipeline3androidxcameracoreImageCapture lambdacreatepipeline3androidxcameracoreimagecapture, isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcamera, setFlashType setflashtype, lambdarotateYUV1 lambdarotateyuv1, getJpegQualityInternal getjpegqualityinternal, int i, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(imageCaptureOnImageSavedCallback, "");
        Intrinsics.checkNotNullParameter(lambdacreatepipeline3androidxcameracoreimagecapture, "");
        Intrinsics.checkNotNullParameter(issessionprocessorenabledincurrentcamera, "");
        Intrinsics.checkNotNullParameter(setflashtype, "");
        Intrinsics.checkNotNullParameter(lambdarotateyuv1, "");
        Intrinsics.checkNotNullParameter(getjpegqualityinternal, "");
        Intrinsics.checkNotNullParameter(scheduledThreadPoolExecutor, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scheduledThreadPoolExecutor;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.b = new getResolutionInfoInternal(str, scheduledThreadPoolExecutor, imageCaptureOnImageSavedCallback, lambdacreatepipeline3androidxcameracoreimagecapture, issessionprocessorenabledincurrentcamera, setflashtype, lambdarotateyuv1, getjpegqualityinternal, i, internalLogger);
    }

    @Override // defpackage.onCameraControlReady
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": data upload");
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(scheduledThreadPoolExecutor, sb.toString(), this.TuitionPaymentFragmentbindingInflater1, this.b);
    }

    @Override // defpackage.onCameraControlReady
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(this.b);
    }
}
