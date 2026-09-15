package defpackage;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LlambdasetValue0androidxcameraviewPendingValue;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UByte;", "<init>", "()V", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetValue0androidxcameraviewPendingValue implements videoProfileHdrFormatsToDynamicRangeEncoding<UByte> {
    public static final lambdasetValue0androidxcameraviewPendingValue INSTANCE = new lambdasetValue0androidxcameraviewPendingValue();
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    private lambdasetValue0androidxcameraviewPendingValue() {
    }

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return UByte.m8036boximpl(UByte.m8042constructorimpl(stoplisteningtorotationevents.decodeInline(getDescriptor()).decodeByte()));
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        byte data = ((UByte) obj).getData();
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeInline(getDescriptor()).encodeByte(data);
    }

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasetCameraSelector3androidxcameraviewCameraController.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlin.UByte", unbindVideoAndRecreate.INSTANCE);
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
