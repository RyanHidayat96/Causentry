package defpackage;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LcancelFlow;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/ULong;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelFlow implements videoProfileHdrFormatsToDynamicRangeEncoding<ULong> {
    public static final cancelFlow INSTANCE = new cancelFlow();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private cancelFlow() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return ULong.m8197boximpl(ULong.m8203constructorimpl(stoplisteningtorotationevents.decodeInline(getDescriptor()).decodeLong()));
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        long data = ((ULong) obj).getData();
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeInline(getDescriptor()).encodeLong(data);
    }

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdasetCameraSelector3androidxcameraviewCameraController.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlin.ULong", setImageAnalysisBackgroundExecutor.INSTANCE);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
