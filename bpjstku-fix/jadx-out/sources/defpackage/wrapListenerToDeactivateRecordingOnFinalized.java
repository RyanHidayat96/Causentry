package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LwrapListenerToDeactivateRecordingOnFinalized;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LclearEffects;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wrapListenerToDeactivateRecordingOnFinalized extends onRotationChanged<Byte, byte[], clearEffects> {
    public static final wrapListenerToDeactivateRecordingOnFinalized INSTANCE = new wrapListenerToDeactivateRecordingOnFinalized();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "");
        return new clearEffects(bArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeByteElement(getDescriptor(), i2, bArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        clearEffects cleareffects = (clearEffects) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(cleareffects, "");
        byte bDecodeByteElement = setactiverecording.decodeByteElement(getDescriptor(), i);
        clearEffects cleareffects2 = cleareffects;
        cleareffects2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cleareffects2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        byte[] bArr = cleareffects.b;
        int i2 = cleareffects.TuitionPaymentFragmentbindingInflater1;
        cleareffects.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
        bArr[i2] = bDecodeByteElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private wrapListenerToDeactivateRecordingOnFinalized() {
        super(unbindVideoAndRecreate.INSTANCE);
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ byte[] b() {
        return new byte[0];
    }
}
