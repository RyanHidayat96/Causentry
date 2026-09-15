package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llambdanew0androidxcameraviewCameraController;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LisVideoCaptureEnabled;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdanew0androidxcameraviewCameraController extends onRotationChanged<Integer, int[], isVideoCaptureEnabled> {
    public static final lambdanew0androidxcameraviewCameraController INSTANCE = new lambdanew0androidxcameraviewCameraController();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "");
        return new isVideoCaptureEnabled(iArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, int[] iArr, int i) {
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeIntElement(getDescriptor(), i2, iArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        isVideoCaptureEnabled isvideocaptureenabled = (isVideoCaptureEnabled) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(isvideocaptureenabled, "");
        int iDecodeIntElement = setactiverecording.decodeIntElement(getDescriptor(), i);
        isVideoCaptureEnabled isvideocaptureenabled2 = isvideocaptureenabled;
        isvideocaptureenabled2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isvideocaptureenabled2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        int[] iArr = isvideocaptureenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = isvideocaptureenabled.TuitionPaymentFragmentbindingInflater1;
        isvideocaptureenabled.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
        iArr[i2] = iDecodeIntElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private lambdanew0androidxcameraviewCameraController() {
        super(lambdanew1androidxcameraviewCameraController.INSTANCE);
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ int[] b() {
        return new int[0];
    }
}
