package defpackage;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LPendingValueExternalSyntheticLambda0;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UByteArray;", "LonRotationChanged;", "Lkotlin/UByte;", "LPendingValue;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingValueExternalSyntheticLambda0 extends onRotationChanged<UByte, UByteArray, PendingValue> {
    public static final PendingValueExternalSyntheticLambda0 INSTANCE = new PendingValueExternalSyntheticLambda0();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return new PendingValue(storage, null);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, UByteArray uByteArray, int i) {
        byte[] storage = uByteArray.getStorage();
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(storage, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeInlineElement(getDescriptor(), i2).encodeByte(UByteArray.m8105getw2LRezQ(storage, i2));
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        PendingValue pendingValue = (PendingValue) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(pendingValue, "");
        byte bM8042constructorimpl = UByte.m8042constructorimpl(setactiverecording.decodeInlineElement(getDescriptor(), i).decodeByte());
        PendingValue pendingValue2 = pendingValue;
        pendingValue2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pendingValue2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        byte[] bArr = pendingValue.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = pendingValue.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        pendingValue.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 + 1;
        UByteArray.m8110setVurrAj0(bArr, i2, bM8042constructorimpl);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return UByteArray.m8106getSizeimpl(storage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PendingValueExternalSyntheticLambda0() {
        super(lambdasetValue0androidxcameraviewPendingValue.INSTANCE);
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ UByteArray b() {
        return UByteArray.m8098boximpl(UByteArray.m8099constructorimpl(0));
    }
}
