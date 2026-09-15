package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LgetVideoCaptureTargetFrameRate;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getVideoCaptureTargetFrameRate implements videoProfileHdrFormatsToDynamicRangeEncoding<Float> {
    public static final getVideoCaptureTargetFrameRate INSTANCE = new getVideoCaptureTargetFrameRate();
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraController3("kotlin.Float", checkAudioPermissionGranted.TuitionPaymentFragmentbindingInflater1.INSTANCE);

    private getVideoCaptureTargetFrameRate() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return Float.valueOf(stoplisteningtorotationevents.decodeFloat());
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeFloat(fFloatValue);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
