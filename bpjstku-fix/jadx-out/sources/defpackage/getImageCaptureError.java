package defpackage;

import com.datadog.android.api.InternalLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004"}, d2 = {"LgetImageCaptureError;", "LImageCaptureCapabilities;", "", "LImageCaptureOutputFormat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface getImageCaptureError extends ImageCaptureCapabilities<byte[]>, ImageCaptureOutputFormat<byte[]> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getImageCaptureError$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Companion();

        private Companion() {
        }

        public static getImageCaptureError TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger internalLogger, onOutputSurface onoutputsurface) {
            Intrinsics.checkNotNullParameter(internalLogger, "");
            ImageCaptureException imageCaptureException = new ImageCaptureException(internalLogger);
            if (onoutputsurface == null) {
                return imageCaptureException;
            }
            return new ImageCaptureOutputFileOptions(onoutputsurface, imageCaptureException, internalLogger);
        }
    }
}
