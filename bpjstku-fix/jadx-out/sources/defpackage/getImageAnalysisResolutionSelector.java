package defpackage;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
final class getImageAnalysisResolutionSelector<T> implements CameraControllerOutputSizeOutputAspectRatio<T> {
    private final getImageAnalysisTargetSize<attachPreviewSurface<T>> TuitionPaymentFragmentbindingInflater1;
    final Function1<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public getImageAnalysisResolutionSelector(Function1<? super KClass<?>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.b = function1;
        this.TuitionPaymentFragmentbindingInflater1 = new getImageAnalysisTargetSize<>();
    }

    @Override // defpackage.CameraControllerOutputSizeOutputAspectRatio
    public final videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Object> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        attachPreviewSurface<T> attachpreviewsurface = this.TuitionPaymentFragmentbindingInflater1.get(JvmClassMappingKt.getJavaClass((KClass) kClass));
        Intrinsics.checkNotNullExpressionValue(attachpreviewsurface, "");
        setImageCaptureFlashMode setimagecaptureflashmode = (setImageCaptureFlashMode) attachpreviewsurface;
        T t = setimagecaptureflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        if (t == null) {
            t = (T) setimagecaptureflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass));
        }
        return t.TuitionPaymentFragmentbindingInflater1;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function0<T> {
        private /* synthetic */ KClass TuitionPaymentFragmentbindingInflater1;

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new attachPreviewSurface(getImageAnalysisResolutionSelector.this.b.invoke(this.TuitionPaymentFragmentbindingInflater1));
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass kClass) {
            this.TuitionPaymentFragmentbindingInflater1 = kClass;
        }
    }
}
