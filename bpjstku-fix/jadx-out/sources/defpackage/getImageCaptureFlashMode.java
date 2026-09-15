package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LgetImageCaptureFlashMode;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LgetImageCaptureMode;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getImageCaptureFlashMode extends onRotationChanged<Double, double[], getImageCaptureMode> {
    public static final getImageCaptureFlashMode INSTANCE = new getImageCaptureFlashMode();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "");
        return new getImageCaptureMode(dArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, double[] dArr, int i) {
        double[] dArr2 = dArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(dArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeDoubleElement(getDescriptor(), i2, dArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        getImageCaptureMode getimagecapturemode = (getImageCaptureMode) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(getimagecapturemode, "");
        double dDecodeDoubleElement = setactiverecording.decodeDoubleElement(getDescriptor(), i);
        getImageCaptureMode getimagecapturemode2 = getimagecapturemode;
        getimagecapturemode2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getimagecapturemode2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        double[] dArr = getimagecapturemode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = getimagecapturemode.TuitionPaymentFragmentbindingInflater1;
        getimagecapturemode.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
        dArr[i2] = dDecodeDoubleElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "");
        return dArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getImageCaptureFlashMode() {
        super(getImageCaptureIoExecutor.INSTANCE);
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ double[] b() {
        return new double[0];
    }
}
