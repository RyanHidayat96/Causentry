package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.privacy.TrackingConsent;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0012\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0015"}, d2 = {"LgetTakePictureRequest;", "LtakePicturedefault;", "LconvertYUVToRGBInternal;", "p0", "Ljava/io/File;", "p1", "", "p2", "Ljava/util/concurrent/ExecutorService;", "p3", "LgetSaveCollection;", "p4", "Lcom/datadog/android/api/InternalLogger;", "p5", "LImageCaptureExternalSyntheticLambda5;", "p6", "<init>", "(LconvertYUVToRGBInternal;Ljava/io/File;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;LgetSaveCollection;Lcom/datadog/android/api/InternalLogger;LImageCaptureExternalSyntheticLambda5;)V", "LImageCaptureOutputFileOptionsBuilder;", "LImageCaptureExtKttakePicture21;", "Lcom/datadog/android/privacy/TrackingConsent;", "(LconvertYUVToRGBInternal;LImageCaptureOutputFileOptionsBuilder;LImageCaptureOutputFileOptionsBuilder;LImageCaptureExtKttakePicture21;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getTakePictureRequest extends takePicturedefault {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex b = new Regex("([a-z]+-)+v[0-9]+");
    private static final Regex asInterface = new Regex("([a-z]+-)+pending-v[0-9]+");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getTakePictureRequest(convertYUVToRGBInternal convertyuvtorgbinternal, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2, ImageCaptureExtKttakePicture21<TrackingConsent> imageCaptureExtKttakePicture21, ExecutorService executorService, InternalLogger internalLogger) {
        super(convertyuvtorgbinternal, imageCaptureOutputFileOptionsBuilder, imageCaptureOutputFileOptionsBuilder2, imageCaptureExtKttakePicture21, executorService, internalLogger);
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder2, "");
        Intrinsics.checkNotNullParameter(imageCaptureExtKttakePicture21, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
    }

    public getTakePictureRequest(convertYUVToRGBInternal convertyuvtorgbinternal, File file, String str, ExecutorService executorService, getSaveCollection getsavecollection, InternalLogger internalLogger, ImageCaptureExternalSyntheticLambda5 imageCaptureExternalSyntheticLambda5) {
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(imageCaptureExternalSyntheticLambda5, "");
        String str2 = String.format(Locale.US, "%s-pending-v2", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        applyPixelShiftForYUV applypixelshiftforyuv = new applyPixelShiftForYUV(new File(file, str2), getsavecollection, internalLogger, imageCaptureExternalSyntheticLambda5);
        String str3 = String.format(Locale.US, "%s-v2", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        this(convertyuvtorgbinternal, applypixelshiftforyuv, new applyPixelShiftForYUV(new File(file, str3), getsavecollection, internalLogger, imageCaptureExternalSyntheticLambda5), new ImageCaptureScreenFlashListener(new getSavedUri(internalLogger), internalLogger), executorService, internalLogger);
    }

    /* JADX INFO: renamed from: getTakePictureRequest$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"LgetTakePictureRequest$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/text/Regex;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Regex TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return getTakePictureRequest.b;
        }

        public static Regex TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return getTakePictureRequest.asInterface;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
