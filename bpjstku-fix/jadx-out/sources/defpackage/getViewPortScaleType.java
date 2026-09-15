package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LgetViewPortScaleType;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LshouldReuseImplementation;", "<init>", "()V", "LcreateImageAnalysis;", "b", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getViewPortScaleType implements videoProfileHdrFormatsToDynamicRangeEncoding<shouldReuseImplementation> {
    public static final getViewPortScaleType INSTANCE = new getViewPortScaleType();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlinx.serialization.json.JsonPrimitive", checkAudioPermissionGranted.g.INSTANCE, new createImageAnalysis[0], new isCameraInitialized());

    private getViewPortScaleType() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentbindingInflater1 = getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents).TuitionPaymentFragmentbindingInflater1();
        if (!(istransformationinforeadyTuitionPaymentFragmentbindingInflater1 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentbindingInflater1.getClass()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentbindingInflater1.toString());
        }
        return (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(startlisteningtorotationevents);
        if (shouldreuseimplementation instanceof PreviewView) {
            startlisteningtorotationevents.encodeSerializableValue(PreviewTransformation1.INSTANCE, PreviewView.INSTANCE);
        } else {
            startlisteningtorotationevents.encodeSerializableValue(overrideWithDisplayRotation.INSTANCE, (setTransformationInfo) shouldreuseimplementation);
        }
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
