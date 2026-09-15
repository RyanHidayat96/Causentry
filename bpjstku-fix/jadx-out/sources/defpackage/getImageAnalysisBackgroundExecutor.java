package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LgetImageAnalysisBackgroundExecutor;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getImageAnalysisBackgroundExecutor implements videoProfileHdrFormatsToDynamicRangeEncoding<Character> {
    public static final getImageAnalysisBackgroundExecutor INSTANCE = new getImageAnalysisBackgroundExecutor();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraController3("kotlin.Char", checkAudioPermissionGranted.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE);

    private getImageAnalysisBackgroundExecutor() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return Character.valueOf(stoplisteningtorotationevents.decodeChar());
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeChar(cCharValue);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
