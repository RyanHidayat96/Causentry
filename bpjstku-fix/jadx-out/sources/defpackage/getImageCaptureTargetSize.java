package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
final class getImageCaptureTargetSize<T> implements CameraControllerOutputSizeOutputAspectRatio<T> {
    private final Function1<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<T>> TuitionPaymentFragmentbindingInflater1;
    private final ConcurrentHashMap<Class<?>, attachPreviewSurface<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public getImageCaptureTargetSize(Function1<? super KClass<?>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ConcurrentHashMap<>();
    }

    @Override // defpackage.CameraControllerOutputSizeOutputAspectRatio
    public final videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Object> kClass) {
        attachPreviewSurface<T> attachpreviewsurfacePutIfAbsent;
        Intrinsics.checkNotNullParameter(kClass, "");
        ConcurrentHashMap<Class<?>, attachPreviewSurface<T>> concurrentHashMap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
        attachPreviewSurface<T> attachpreviewsurface = concurrentHashMap.get(javaClass);
        if (attachpreviewsurface == null && (attachpreviewsurfacePutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (attachpreviewsurface = new attachPreviewSurface<>(this.TuitionPaymentFragmentbindingInflater1.invoke(kClass))))) != null) {
            attachpreviewsurface = attachpreviewsurfacePutIfAbsent;
        }
        return attachpreviewsurface.TuitionPaymentFragmentbindingInflater1;
    }
}
