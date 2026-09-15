package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class initializePreview extends PreviewViewImplementationOnSurfaceNotInUseListener {
    private final Map<KClass<?>, Function1<?, QualityAddedEncoderProfilesProvider<?>>> TuitionPaymentFragmentbindingInflater1;
    private final Map<KClass<?>, Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Map<KClass<?>, Function1<String, isBitDepthMatched<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Map<KClass<?>, PreviewViewStreamState> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<KClass<?>, Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> f1203a;
    private final boolean b;

    @Override // defpackage.PreviewViewImplementationOnSurfaceNotInUseListener
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public initializePreview(Map<KClass<?>, ? extends PreviewViewStreamState> map, Map<KClass<?>, ? extends Map<KClass<?>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>>> map2, Map<KClass<?>, ? extends Function1<?, ? extends QualityAddedEncoderProfilesProvider<?>>> map3, Map<KClass<?>, ? extends Map<String, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>>> map4, Map<KClass<?>, ? extends Function1<? super String, ? extends isBitDepthMatched<?>>> map5, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Intrinsics.checkNotNullParameter(map4, "");
        Intrinsics.checkNotNullParameter(map5, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        this.f1203a = map2;
        this.TuitionPaymentFragmentbindingInflater1 = map3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map5;
        this.b = z;
    }

    @Override // defpackage.PreviewViewImplementationOnSurfaceNotInUseListener
    public final <T> QualityAddedEncoderProfilesProvider<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<? super T> kClass, T t) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(t, "");
        if (!kClass.isInstance(t)) {
            return null;
        }
        Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map = this.f1203a.get(kClass);
        videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding = map != null ? map.get(Reflection.getOrCreateKotlinClass(t.getClass())) : null;
        videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding2 = videoprofilehdrformatstodynamicrangeencoding instanceof QualityAddedEncoderProfilesProvider ? videoprofilehdrformatstodynamicrangeencoding : null;
        if (videoprofilehdrformatstodynamicrangeencoding2 != null) {
            return videoprofilehdrformatstodynamicrangeencoding2;
        }
        Function1<?, QualityAddedEncoderProfilesProvider<?>> function1 = this.TuitionPaymentFragmentbindingInflater1.get(kClass);
        Function1<?, QualityAddedEncoderProfilesProvider<?>> function2 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (QualityAddedEncoderProfilesProvider) function2.invoke(t);
        }
        return null;
    }

    @Override // defpackage.PreviewViewImplementationOnSurfaceNotInUseListener
    public final <T> isBitDepthMatched<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<? super T> kClass, String str) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
        videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding = map != null ? map.get(str) : null;
        if (!(videoprofilehdrformatstodynamicrangeencoding instanceof videoProfileHdrFormatsToDynamicRangeEncoding)) {
            videoprofilehdrformatstodynamicrangeencoding = null;
        }
        if (videoprofilehdrformatstodynamicrangeencoding != null) {
            return videoprofilehdrformatstodynamicrangeencoding;
        }
        Function1<String, isBitDepthMatched<?>> function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(kClass);
        Function1<String, isBitDepthMatched<?>> function2 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (isBitDepthMatched) function2.invoke(str);
        }
        return null;
    }

    @Override // defpackage.PreviewViewImplementationOnSurfaceNotInUseListener
    public final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(KClass<T> kClass, List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> list) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        PreviewViewStreamState previewViewStreamState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(kClass);
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding = previewViewStreamState != null ? (videoProfileHdrFormatsToDynamicRangeEncoding<T>) previewViewStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list) : null;
        if (videoprofilehdrformatstodynamicrangeencoding instanceof videoProfileHdrFormatsToDynamicRangeEncoding) {
            return videoprofilehdrformatstodynamicrangeencoding;
        }
        return null;
    }

    @Override // defpackage.PreviewViewImplementationOnSurfaceNotInUseListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewViewMeteringPointFactory previewViewMeteringPointFactory) {
        Intrinsics.checkNotNullParameter(previewViewMeteringPointFactory, "");
        for (Map.Entry<KClass<?>, PreviewViewStreamState> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
            KClass<?> key = entry.getKey();
            PreviewViewStreamState value = entry.getValue();
            if (value instanceof PreviewViewStreamState.TuitionPaymentFragmentbindingInflater1) {
                Intrinsics.checkNotNull(key, "");
                videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding = ((PreviewViewStreamState.TuitionPaymentFragmentbindingInflater1) value).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNull(videoprofilehdrformatstodynamicrangeencoding, "");
                previewViewMeteringPointFactory.b(key, videoprofilehdrformatstodynamicrangeencoding);
            } else {
                if (!(value instanceof PreviewViewStreamState.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                previewViewMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault3(key, ((PreviewViewStreamState.b) value).TuitionPaymentFragmentbindingInflater1);
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> entry2 : this.f1203a.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                videoProfileHdrFormatsToDynamicRangeEncoding<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "");
                Intrinsics.checkNotNull(key3, "");
                Intrinsics.checkNotNull(value2, "");
                previewViewMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, QualityAddedEncoderProfilesProvider<?>>> entry4 : this.TuitionPaymentFragmentbindingInflater1.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, QualityAddedEncoderProfilesProvider<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "");
            Intrinsics.checkNotNull(value3, "");
            previewViewMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, isBitDepthMatched<?>>> entry5 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, isBitDepthMatched<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "");
            Intrinsics.checkNotNull(value4, "");
            previewViewMeteringPointFactory.TuitionPaymentFragmentbindingInflater1(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }
}
