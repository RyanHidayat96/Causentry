package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes7.dex */
public final class clearPreviewSurface {
    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    public static final <T> CameraControllerOutputSizeOutputAspectRatio<T> b(Function1<? super KClass<?>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? new getImageAnalysisResolutionSelector<>(function1) : new getImageCaptureTargetSize<>(function1);
    }

    public static final <T> startCameraAndTrackStates<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? new getImageAnalysisImageQueueDepth<>(function2) : new getImageCaptureResolutionSelector<>(function2);
    }
}
