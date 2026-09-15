package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LFlashModeConverter;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LExperimentalPreviewViewScreenFlash;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlashModeConverter extends onRotationChanged<Short, short[], ExperimentalPreviewViewScreenFlash> {
    public static final FlashModeConverter INSTANCE = new FlashModeConverter();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "");
        return new ExperimentalPreviewViewScreenFlash(sArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, short[] sArr, int i) {
        short[] sArr2 = sArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(sArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeShortElement(getDescriptor(), i2, sArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        ExperimentalPreviewViewScreenFlash experimentalPreviewViewScreenFlash = (ExperimentalPreviewViewScreenFlash) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(experimentalPreviewViewScreenFlash, "");
        short sDecodeShortElement = setactiverecording.decodeShortElement(getDescriptor(), i);
        ExperimentalPreviewViewScreenFlash experimentalPreviewViewScreenFlash2 = experimentalPreviewViewScreenFlash;
        experimentalPreviewViewScreenFlash2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(experimentalPreviewViewScreenFlash2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        short[] sArr = experimentalPreviewViewScreenFlash.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = experimentalPreviewViewScreenFlash.TuitionPaymentFragmentbindingInflater1;
        experimentalPreviewViewScreenFlash.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
        sArr[i2] = sDecodeShortElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FlashModeConverter() {
        super(CameraControllerOutputSize.INSTANCE);
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ short[] b() {
        return new short[0];
    }
}
