package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.modules.SerializerAlreadyRegisteredException;

/* JADX INFO: loaded from: classes5.dex */
public final class onSurfaceProvided implements PreviewViewMeteringPointFactory {
    private boolean b;
    private final Map<KClass<?>, PreviewViewStreamState> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
    private final Map<KClass<?>, Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> d = new HashMap();
    private final Map<KClass<?>, Function1<?, QualityAddedEncoderProfilesProvider<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
    private final Map<KClass<?>, Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> TuitionPaymentFragmentbindingInflater1 = new HashMap();
    private final Map<KClass<?>, Function1<String, isBitDepthMatched<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap();

    @Override // defpackage.PreviewViewMeteringPointFactory
    public final <T> void b(KClass<T> kClass, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((KClass) kClass, (PreviewViewStreamState) new PreviewViewStreamState.TuitionPaymentFragmentbindingInflater1(videoprofilehdrformatstodynamicrangeencoding), false);
    }

    @Override // defpackage.PreviewViewMeteringPointFactory
    public final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(KClass<T> kClass, Function1<? super List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((KClass) kClass, (PreviewViewStreamState) new PreviewViewStreamState.b(function1), false);
    }

    @Override // defpackage.PreviewViewMeteringPointFactory
    public final <Base> void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Base> kClass, Function1<? super Base, ? extends QualityAddedEncoderProfilesProvider<? super Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TuitionPaymentFragmentbindingInflater1(kClass, function1, false);
    }

    @Override // defpackage.PreviewViewMeteringPointFactory
    public final <Base> void TuitionPaymentFragmentbindingInflater1(KClass<Base> kClass, Function1<? super String, ? extends isBitDepthMatched<? extends Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((KClass) kClass, (Function1) function1, false);
    }

    public final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<T> kClass, PreviewViewStreamState previewViewStreamState, boolean z) {
        PreviewViewStreamState previewViewStreamState2;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(previewViewStreamState, "");
        if (!z && (previewViewStreamState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(kClass)) != null && !Intrinsics.areEqual(previewViewStreamState2, previewViewStreamState)) {
            StringBuilder sb = new StringBuilder("Contextual serializer or serializer provider for ");
            sb.append(kClass);
            sb.append(" already registered in this module");
            throw new SerializerAlreadyRegisteredException(sb.toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(kClass, previewViewStreamState);
        Intrinsics.checkNotNullParameter(kClass, "");
        if (JvmClassMappingKt.getJavaClass((KClass) kClass).isInterface()) {
            this.b = true;
        }
    }

    public final <Base> void TuitionPaymentFragmentbindingInflater1(KClass<Base> kClass, Function1<? super Base, ? extends QualityAddedEncoderProfilesProvider<? super Base>> function1, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Function1<?, QualityAddedEncoderProfilesProvider<?>> function2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(kClass);
        if (function2 != null && !Intrinsics.areEqual(function2, function1) && !z) {
            StringBuilder sb = new StringBuilder("Default serializers provider for ");
            sb.append(kClass);
            sb.append(" is already registered: ");
            sb.append(function2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(kClass, function1);
    }

    public final <Base> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<Base> kClass, Function1<? super String, ? extends isBitDepthMatched<? extends Base>> function1, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Function1<String, isBitDepthMatched<?>> function2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
        if (function2 != null && !Intrinsics.areEqual(function2, function1) && !z) {
            StringBuilder sb = new StringBuilder("Default deserializers provider for ");
            sb.append(kClass);
            sb.append(" is already registered: ");
            sb.append(function2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(kClass, function1);
    }

    public final <Base, Sub extends Base> void TuitionPaymentFragmentbindingInflater1(KClass<Base> kClass, KClass<Sub> kClass2, videoProfileHdrFormatsToDynamicRangeEncoding<Sub> videoprofilehdrformatstodynamicrangeencoding, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        String iNotificationSideChannel = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel();
        Map<KClass<?>, Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> map = this.d;
        Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map2 = map.get(kClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(kClass, map2);
        }
        Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map3 = map2;
        videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding2 = map3.get(kClass2);
        Map<KClass<?>, Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>>> map4 = this.TuitionPaymentFragmentbindingInflater1;
        Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map5 = map4.get(kClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(kClass, map5);
        }
        Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map6 = map5;
        if (z) {
            if (videoprofilehdrformatstodynamicrangeencoding2 != null) {
                map6.remove(videoprofilehdrformatstodynamicrangeencoding2.getDescriptor().getINotificationSideChannel());
            }
            map3.put(kClass2, videoprofilehdrformatstodynamicrangeencoding);
            map6.put(iNotificationSideChannel, videoprofilehdrformatstodynamicrangeencoding);
            return;
        }
        if (videoprofilehdrformatstodynamicrangeencoding2 != null) {
            if (!Intrinsics.areEqual(videoprofilehdrformatstodynamicrangeencoding2, videoprofilehdrformatstodynamicrangeencoding)) {
                throw new SerializerAlreadyRegisteredException(kClass, kClass2);
            }
            map6.remove(videoprofilehdrformatstodynamicrangeencoding2.getDescriptor().getINotificationSideChannel());
        }
        videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding3 = map6.get(iNotificationSideChannel);
        if (videoprofilehdrformatstodynamicrangeencoding3 != null) {
            Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> map7 = this.d.get(kClass);
            Intrinsics.checkNotNull(map7);
            for (Object obj : MapsKt.asSequence(map7)) {
                if (((Map.Entry) obj).getValue() == videoprofilehdrformatstodynamicrangeencoding3) {
                    StringBuilder sb = new StringBuilder("Multiple polymorphic serializers for base class '");
                    sb.append(kClass);
                    sb.append("' have the same serial name '");
                    sb.append(iNotificationSideChannel);
                    sb.append("': '");
                    sb.append(kClass2);
                    sb.append("' and '");
                    sb.append((Map.Entry) obj);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            obj = null;
            StringBuilder sb2 = new StringBuilder("Multiple polymorphic serializers for base class '");
            sb2.append(kClass);
            sb2.append("' have the same serial name '");
            sb2.append(iNotificationSideChannel);
            sb2.append("': '");
            sb2.append(kClass2);
            sb2.append("' and '");
            sb2.append((Map.Entry) obj);
            sb2.append('\'');
            throw new IllegalArgumentException(sb2.toString());
        }
        map3.put(kClass2, videoprofilehdrformatstodynamicrangeencoding);
        map6.put(iNotificationSideChannel, videoprofilehdrformatstodynamicrangeencoding);
    }

    public final PreviewViewImplementationOnSurfaceNotInUseListener TuitionPaymentFragmentbindingInflater1() {
        return new initializePreview(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
    }

    @Override // defpackage.PreviewViewMeteringPointFactory
    public final <Base, Sub extends Base> void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Base> kClass, KClass<Sub> kClass2, videoProfileHdrFormatsToDynamicRangeEncoding<Sub> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        TuitionPaymentFragmentbindingInflater1(kClass, kClass2, videoprofilehdrformatstodynamicrangeencoding, false);
    }
}
