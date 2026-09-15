package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LgetTransformedSurfaceRect;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LisTransformationInfoReady;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransformedSurfaceRect implements videoProfileHdrFormatsToDynamicRangeEncoding<isTransformationInfoReady> {
    public static final getTransformedSurfaceRect INSTANCE = new getTransformedSurfaceRect();
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlinx.serialization.json.JsonElement", CameraController.INSTANCE, new createImageAnalysis[0], new Function1() { // from class: setMatrixRectToRect
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return getTransformedSurfaceRect.b((calculateUptimeToRealtimeOffsetUs) obj);
        }
    });

    private getTransformedSurfaceRect() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents).TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(startlisteningtorotationevents);
        if (istransformationinfoready instanceof shouldReuseImplementation) {
            startlisteningtorotationevents.encodeSerializableValue(getViewPortScaleType.INSTANCE, istransformationinfoready);
        } else if (istransformationinfoready instanceof getDisplayManager) {
            startlisteningtorotationevents.encodeSerializableValue(startListeningToDisplayChange.INSTANCE, istransformationinfoready);
        } else {
            if (!(istransformationinfoready instanceof PreviewStreamStateObserverExternalSyntheticLambda2)) {
                throw new NoWhenBranchMatchedException();
            }
            startlisteningtorotationevents.encodeSerializableValue(PreviewTransformation.INSTANCE, istransformationinfoready);
        }
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Unit b(calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        calculateuptimetorealtimeoffsetus.b("JsonPrimitive", new getTextureViewCorrectionMatrix.TuitionPaymentFragmentbindingInflater1(new Function0() { // from class: getPreviewViewToNormalizedSensorMatrix
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getViewPortScaleType.INSTANCE.getDescriptor();
            }
        }), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("JsonNull", new getTextureViewCorrectionMatrix.TuitionPaymentFragmentbindingInflater1(new Function0() { // from class: getSurfaceCropRect
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewTransformation1.INSTANCE.getDescriptor();
            }
        }), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("JsonLiteral", new getTextureViewCorrectionMatrix.TuitionPaymentFragmentbindingInflater1(new Function0() { // from class: getSurfaceToPreviewViewMatrix
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return overrideWithDisplayRotation.INSTANCE.getDescriptor();
            }
        }), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("JsonObject", new getTextureViewCorrectionMatrix.TuitionPaymentFragmentbindingInflater1(new Function0() { // from class: getPreviewViewViewportRectForMismatchedAspectRatios
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return startListeningToDisplayChange.INSTANCE.getDescriptor();
            }
        }), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("JsonArray", new getTextureViewCorrectionMatrix.TuitionPaymentFragmentbindingInflater1(new Function0() { // from class: getSensorToViewTransform
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewTransformation.INSTANCE.getDescriptor();
            }
        }), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }
}
