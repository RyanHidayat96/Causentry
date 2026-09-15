package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.system.SystemInfo;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010#\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010,\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"LgetResolutionInfoInternal;", "LsetCropAspectRatio;", "", "p0", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "p1", "LImageCaptureOnImageSavedCallback;", "p2", "LlambdacreatePipeline3androidxcameracoreImageCapture;", "p3", "LisSessionProcessorEnabledInCurrentCamera;", "p4", "LsetFlashType;", "p5", "LlambdarotateYUV1;", "p6", "LgetJpegQualityInternal;", "p7", "", "p8", "Lcom/datadog/android/api/InternalLogger;", "p9", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ScheduledThreadPoolExecutor;LImageCaptureOnImageSavedCallback;LlambdacreatePipeline3androidxcameracoreImageCapture;LisSessionProcessorEnabledInCurrentCamera;LsetFlashType;LlambdarotateYUV1;LgetJpegQualityInternal;ILcom/datadog/android/api/InternalLogger;)V", "", "run", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LisSessionProcessorEnabledInCurrentCamera;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LlambdacreatePipeline3androidxcameracoreImageCapture;", "Ljava/lang/String;", "b", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "I", "asBinder", "LsetFlashType;", "g", "LImageCaptureOnImageSavedCallback;", "d", "LlambdarotateYUV1;", "asInterface", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "cancelAll", "LgetJpegQualityInternal;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getResolutionInfoInternal implements setCropAspectRatio {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final isSessionProcessorEnabledInCurrentCamera TuitionPaymentFragmentbindingInflater1;
    private final lambdacreatePipeline3androidxcameracoreImageCapture TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final setFlashType g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ScheduledThreadPoolExecutor a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final getJpegQualityInternal asInterface;
    private final lambdarotateYUV1 d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ImageCaptureOnImageSavedCallback asBinder;

    public getResolutionInfoInternal(String str, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, ImageCaptureOnImageSavedCallback imageCaptureOnImageSavedCallback, lambdacreatePipeline3androidxcameracoreImageCapture lambdacreatepipeline3androidxcameracoreimagecapture, isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcamera, setFlashType setflashtype, lambdarotateYUV1 lambdarotateyuv1, getJpegQualityInternal getjpegqualityinternal, int i, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scheduledThreadPoolExecutor, "");
        Intrinsics.checkNotNullParameter(imageCaptureOnImageSavedCallback, "");
        Intrinsics.checkNotNullParameter(lambdacreatepipeline3androidxcameracoreimagecapture, "");
        Intrinsics.checkNotNullParameter(issessionprocessorenabledincurrentcamera, "");
        Intrinsics.checkNotNullParameter(setflashtype, "");
        Intrinsics.checkNotNullParameter(lambdarotateyuv1, "");
        Intrinsics.checkNotNullParameter(getjpegqualityinternal, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.a = scheduledThreadPoolExecutor;
        this.asBinder = imageCaptureOnImageSavedCallback;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdacreatepipeline3androidxcameracoreimagecapture;
        this.TuitionPaymentFragmentbindingInflater1 = issessionprocessorenabledincurrentcamera;
        this.g = setflashtype;
        this.d = lambdarotateyuv1;
        this.asInterface = getjpegqualityinternal;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // java.lang.Runnable
    public final void run() {
        submitStillCaptureRequest submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ImageCaptureBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        int i = 0;
        if (this.g.getTuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentbindingInflater1 != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
            SystemInfo systemInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if ((systemInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || systemInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 || systemInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 10) && !systemInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
                recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i2 = this.b;
                do {
                    i2--;
                    ImageCaptureFlashType imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    if (imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        ImageCaptureImageCaptureCapabilitiesImpl imageCaptureImageCaptureCapabilitiesImpl = imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        List<ImageCapture> list = imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr = imageCaptureFlashTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                        submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(recalculatetransformmatrixandcroprectTuitionPaymentFragmentspecialinlinedviewModeldefault2, list);
                        if (submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof submitStillCaptureRequest.a) {
                            tuitionPaymentFragmentbindingInflater1 = ImageCaptureBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                        } else {
                            tuitionPaymentFragmentbindingInflater1 = new ImageCaptureBuilder.TuitionPaymentFragmentbindingInflater1(submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
                        }
                        this.asBinder.b(imageCaptureImageCaptureCapabilitiesImpl, tuitionPaymentFragmentbindingInflater1, !submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    }
                    if (submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        i++;
                    }
                    if (i2 <= 0) {
                        break;
                    }
                } while (submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof submitStillCaptureRequest.g);
            } else {
                submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            }
        } else {
            submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        long jB = this.asInterface.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i, submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? Integer.valueOf(submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.b) : null, submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? submitstillcapturerequestTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 : null);
        getResolutionInfoInternal getresolutioninfointernal = this;
        this.a.remove(getresolutioninfointernal);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": data upload");
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1(scheduledThreadPoolExecutor, sb.toString(), jB, TimeUnit.MILLISECONDS, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getresolutioninfointernal);
    }
}
