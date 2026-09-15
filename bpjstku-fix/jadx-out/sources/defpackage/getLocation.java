package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010 \u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"LgetLocation;", "LImageAnalysisNonBlockingAnalyzer;", "Ljava/io/File;", "p0", "p1", "LImageCaptureCapabilities;", "LImageCapture;", "p2", "LgetImageCaptureError;", "p3", "LgetSaveCollection;", "p4", "Lcom/datadog/android/api/InternalLogger;", "p5", "<init>", "(Ljava/io/File;Ljava/io/File;LImageCaptureCapabilities;LgetImageCaptureError;LgetSaveCollection;Lcom/datadog/android/api/InternalLogger;)V", "", "Lcom/datadog/android/api/storage/EventType;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LImageCapture;Lcom/datadog/android/api/storage/EventType;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/File;", "b", "LImageCaptureCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetSaveCollection;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "g", "asBinder", "LgetImageCaptureError;", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getLocation implements ImageAnalysisNonBlockingAnalyzer {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final getSaveCollection TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final File b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final getImageCaptureError d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ImageCaptureCapabilities<ImageCapture> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public getLocation(File file, File file2, ImageCaptureCapabilities<ImageCapture> imageCaptureCapabilities, getImageCaptureError getimagecaptureerror, getSaveCollection getsavecollection, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(imageCaptureCapabilities, "");
        Intrinsics.checkNotNullParameter(getimagecaptureerror, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureCapabilities;
        this.d = getimagecaptureerror;
        this.TuitionPaymentFragmentbindingInflater1 = getsavecollection;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    @Override // defpackage.ImageAnalysisNonBlockingAnalyzer
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageCapture imageCapture, EventType eventType) {
        Intrinsics.checkNotNullParameter(imageCapture, "");
        Intrinsics.checkNotNullParameter(eventType, "");
        if (imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length == 0) {
            return true;
        }
        final int length = imageCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
        if (length <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.b, imageCapture, true);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.FileEventBatchWriter$checkEventSize$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(length), Long.valueOf(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
        return false;
    }
}
