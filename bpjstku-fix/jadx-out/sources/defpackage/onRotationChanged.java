package defpackage;

import defpackage.CameraControllerExternalSyntheticLambda7;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onRotationChanged<Element, Array, Builder extends CameraControllerExternalSyntheticLambda7<Array>> extends getImageAnalysisOutputImageFormat<Element, Array, Builder> {
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, Array array, int i);

    protected abstract Array b();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        CameraControllerExternalSyntheticLambda7 cameraControllerExternalSyntheticLambda7 = (CameraControllerExternalSyntheticLambda7) obj;
        Intrinsics.checkNotNullParameter(cameraControllerExternalSyntheticLambda7, "");
        return cameraControllerExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        CameraControllerExternalSyntheticLambda7 cameraControllerExternalSyntheticLambda7 = (CameraControllerExternalSyntheticLambda7) obj;
        Intrinsics.checkNotNullParameter(cameraControllerExternalSyntheticLambda7, "");
        return cameraControllerExternalSyntheticLambda7.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
        Intrinsics.checkNotNullParameter((CameraControllerExternalSyntheticLambda7) obj, "");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        CameraControllerExternalSyntheticLambda7 cameraControllerExternalSyntheticLambda7 = (CameraControllerExternalSyntheticLambda7) obj;
        Intrinsics.checkNotNullParameter(cameraControllerExternalSyntheticLambda7, "");
        cameraControllerExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onRotationChanged(videoProfileHdrFormatsToDynamicRangeEncoding<Element> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraControllerExternalSyntheticLambda5(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.speedUpZoomBy2X
    protected final Iterator<Element> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents startlisteningtorotationevents, Array array) {
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        int iB = b(array);
        createImageAnalysis createimageanalysis = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        isUseCaseEnabled isusecaseenabledBeginCollection = startlisteningtorotationevents.beginCollection(createimageanalysis, iB);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(isusecaseenabledBeginCollection, array, iB);
        isusecaseenabledBeginCollection.endStructure(createimageanalysis);
    }

    @Override // defpackage.speedUpZoomBy2X, defpackage.isBitDepthMatched
    public final Array deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoplisteningtorotationevents);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentbindingInflater1(b());
    }
}
