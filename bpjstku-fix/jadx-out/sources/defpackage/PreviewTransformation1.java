package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LPreviewTransformation1;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LPreviewView;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewTransformation1 implements videoProfileHdrFormatsToDynamicRangeEncoding<PreviewView> {
    public static final PreviewTransformation1 INSTANCE = new PreviewTransformation1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final createImageAnalysis b = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlinx.serialization.json.JsonNull", deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE, new createImageAnalysis[0], new isCameraInitialized());

    private PreviewTransformation1() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents);
        if (stoplisteningtorotationevents.decodeNotNullMark()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        stoplisteningtorotationevents.decodeNull();
        return PreviewView.INSTANCE;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter((PreviewView) obj, "");
        getTextureViewCorrectionMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(startlisteningtorotationevents);
        startlisteningtorotationevents.encodeNull();
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return b;
    }
}
