package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isErrorEnabled extends convertJpegBytesToImage<NetworkInfo> {
    public isErrorEnabled(File file, convertYUVToRGBInternal convertyuvtorgbinternal, ExecutorService executorService, ImageCaptureCapabilities<byte[]> imageCaptureCapabilities, getSavedUri getsaveduri, InternalLogger internalLogger, getSaveCollection getsavecollection) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(convertyuvtorgbinternal, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(imageCaptureCapabilities, "");
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Logger.Companion companion = Logger.INSTANCE;
        Intrinsics.checkNotNullParameter(file, "");
        getProcessingLatencyMillis getprocessinglatencymillis = new getProcessingLatencyMillis(new File(Logger.Companion.b(file), "network_information"), internalLogger);
        Logger.Companion companion2 = Logger.INSTANCE;
        Intrinsics.checkNotNullParameter(file, "");
        super(new takePicturedefault(convertyuvtorgbinternal, getprocessinglatencymillis, new getProcessingLatencyMillis(new File(Logger.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file), "network_information"), internalLogger), new ImageCaptureScreenFlashListener(getsaveduri, internalLogger), executorService, internalLogger), new setPostviewResolutionSelector(), imageCaptureCapabilities, internalLogger, getsavecollection);
    }
}
