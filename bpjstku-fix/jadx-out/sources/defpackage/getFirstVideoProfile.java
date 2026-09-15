package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class getFirstVideoProfile<T> extends setTargetOutputSize<T> {
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final KClass<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private List<? extends Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getFirstVideoProfile(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kClass;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: createParentFolder
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getFirstVideoProfile.b(this.b);
            }
        });
    }

    @Override // defpackage.setTargetOutputSize
    public final KClass<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return (createImageAnalysis) this.TuitionPaymentFragmentbindingInflater1.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ createImageAnalysis b(final getFirstVideoProfile getfirstvideoprofile) {
        createImageAnalysis createimageanalysisTuitionPaymentFragmentbindingInflater1 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlinx.serialization.Polymorphic", resolveInputTimebase.TuitionPaymentFragmentbindingInflater1.INSTANCE, new createImageAnalysis[0], new Function1() { // from class: EncoderProfilesUtil
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFirstVideoProfile.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (calculateUptimeToRealtimeOffsetUs) obj);
            }
        });
        KClass<T> kClass = getfirstvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(createimageanalysisTuitionPaymentFragmentbindingInflater1, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return new VideoTimebaseConverter1(createimageanalysisTuitionPaymentFragmentbindingInflater1, kClass);
    }

    public static /* synthetic */ Unit b(getFirstVideoProfile getfirstvideoprofile, calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "");
        calculateuptimetorealtimeoffsetus.b("type", CameraControllerUseCases.INSTANCE.getDescriptor(), CollectionsKt.emptyList(), false);
        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
        sb.append(getfirstvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSimpleName());
        sb.append(Typography.greater);
        calculateuptimetorealtimeoffsetus.b("value", getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1(sb.toString(), deactivateRecording.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE, new createImageAnalysis[0], new isCameraInitialized()), CollectionsKt.emptyList(), false);
        List<? extends Annotation> list = getfirstvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(list, "");
        calculateuptimetorealtimeoffsetus.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        return Unit.INSTANCE;
    }
}
