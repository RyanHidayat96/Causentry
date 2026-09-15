package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LthrowExceptionForInvalidScreenFlashCapture;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LunbindImageAnalysisAndRecreate;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class throwExceptionForInvalidScreenFlashCapture extends onRotationChanged<Boolean, boolean[], unbindImageAnalysisAndRecreate> {
    public static final throwExceptionForInvalidScreenFlashCapture INSTANCE = new throwExceptionForInvalidScreenFlashCapture();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "");
        return new unbindImageAnalysisAndRecreate(zArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(zArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeBooleanElement(getDescriptor(), i2, zArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        unbindImageAnalysisAndRecreate unbindimageanalysisandrecreate = (unbindImageAnalysisAndRecreate) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(unbindimageanalysisandrecreate, "");
        boolean zDecodeBooleanElement = setactiverecording.decodeBooleanElement(getDescriptor(), i);
        unbindImageAnalysisAndRecreate unbindimageanalysisandrecreate2 = unbindimageanalysisandrecreate;
        unbindimageanalysisandrecreate2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(unbindimageanalysisandrecreate2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        boolean[] zArr = unbindimageanalysisandrecreate.b;
        int i2 = unbindimageanalysisandrecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        unbindimageanalysisandrecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 + 1;
        zArr[i2] = zDecodeBooleanElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "");
        return zArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private throwExceptionForInvalidScreenFlashCapture() {
        super(unbindPreviewAndRecreate.INSTANCE);
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ boolean[] b() {
        return new boolean[0];
    }
}
