package defpackage;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LPreviewStreamStateObserverExternalSyntheticLambda0;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UShort;", "<init>", "()V", "LcreateImageAnalysis;", "b", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewStreamStateObserverExternalSyntheticLambda0 implements videoProfileHdrFormatsToDynamicRangeEncoding<UShort> {
    public static final PreviewStreamStateObserverExternalSyntheticLambda0 INSTANCE = new PreviewStreamStateObserverExternalSyntheticLambda0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final createImageAnalysis TuitionPaymentFragmentbindingInflater1;

    private PreviewStreamStateObserverExternalSyntheticLambda0() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return UShort.m8304boximpl(UShort.m8310constructorimpl(stoplisteningtorotationevents.decodeInline(getDescriptor()).decodeShort()));
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        short data = ((UShort) obj).getData();
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeInline(getDescriptor()).encodeShort(data);
    }

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "");
        TuitionPaymentFragmentbindingInflater1 = lambdasetCameraSelector3androidxcameraviewCameraController.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlin.UShort", CameraControllerOutputSize.INSTANCE);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
