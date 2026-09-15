package defpackage;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LoverrideWithDisplayRotation;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LsetTransformationInfo;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentbindingInflater1", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class overrideWithDisplayRotation implements videoProfileHdrFormatsToDynamicRangeEncoding<setTransformationInfo> {
    public static final overrideWithDisplayRotation INSTANCE = new overrideWithDisplayRotation();
    private static final createImageAnalysis TuitionPaymentFragmentbindingInflater1 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlinx.serialization.json.JsonLiteral", checkAudioPermissionGranted.g.INSTANCE);

    private overrideWithDisplayRotation() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentbindingInflater1 = getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents).TuitionPaymentFragmentbindingInflater1();
        if (!(istransformationinforeadyTuitionPaymentFragmentbindingInflater1 instanceof setTransformationInfo)) {
            StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentbindingInflater1.getClass()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentbindingInflater1.toString());
        }
        return (setTransformationInfo) istransformationinforeadyTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        setTransformationInfo settransformationinfo = (setTransformationInfo) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(settransformationinfo, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(startlisteningtorotationevents);
        if (!settransformationinfo.TuitionPaymentFragmentbindingInflater1) {
            if (settransformationinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                startlisteningtorotationevents.encodeInline(settransformationinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1).encodeString(settransformationinfo.b);
                return;
            }
            Long longOrNull = StringsKt.toLongOrNull(settransformationinfo.b);
            if (longOrNull != null) {
                startlisteningtorotationevents.encodeLong(longOrNull.longValue());
                return;
            }
            ULong uLongOrNull = UStringsKt.toULongOrNull(settransformationinfo.b);
            if (uLongOrNull != null) {
                long data = uLongOrNull.getData();
                Intrinsics.checkNotNullParameter(ULong.INSTANCE, "");
                startlisteningtorotationevents.encodeInline(cancelFlow.INSTANCE.getDescriptor()).encodeLong(data);
                return;
            }
            Double doubleOrNull = StringsKt.toDoubleOrNull(settransformationinfo.b);
            if (doubleOrNull != null) {
                startlisteningtorotationevents.encodeDouble(doubleOrNull.doubleValue());
                return;
            }
            Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(settransformationinfo.b);
            if (booleanStrictOrNull != null) {
                startlisteningtorotationevents.encodeBoolean(booleanStrictOrNull.booleanValue());
                return;
            }
        }
        startlisteningtorotationevents.encodeString(settransformationinfo.b);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
