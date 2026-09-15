package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isLogLevelEnabled extends convertJpegBytesToImage<lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer> {
    public isLogLevelEnabled(File file, convertYUVToRGBInternal convertyuvtorgbinternal, ExecutorService executorService, ImageCaptureCapabilities<byte[]> imageCaptureCapabilities, getSavedUri getsaveduri, InternalLogger internalLogger, getSaveCollection getsavecollection) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(imageCaptureCapabilities, "");
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Logger.Companion companion = Logger.INSTANCE;
        Intrinsics.checkNotNullParameter(file, "");
        getProcessingLatencyMillis getprocessinglatencymillis = new getProcessingLatencyMillis(new File(Logger.Companion.b(file), "user_information"), internalLogger);
        Logger.Companion companion2 = Logger.INSTANCE;
        Intrinsics.checkNotNullParameter(file, "");
        super(new takePicturedefault(convertyuvtorgbinternal, getprocessinglatencymillis, new getProcessingLatencyMillis(new File(Logger.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file), "user_information"), internalLogger), new ImageCaptureScreenFlashListener(getsaveduri, internalLogger), executorService, internalLogger), new ImageProxyPlaneProxy(), imageCaptureCapabilities, internalLogger, getsavecollection);
    }
}
