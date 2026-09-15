package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isImageAnalysisEnabled extends CameraControllerExternalSyntheticLambda3 {
    private final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isImageAnalysisEnabled(String str, getVideoCaptureDynamicRange<?> getvideocapturedynamicrange) {
        super(str, getvideocapturedynamicrange, 1);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getvideocapturedynamicrange, "");
        this.TuitionPaymentFragmentbindingInflater1 = true;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3, defpackage.createImageAnalysis
    public final boolean b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3
    public final boolean equals(Object obj) {
        isImageAnalysisEnabled isimageanalysisenabled = this;
        if (isimageanalysisenabled == obj) {
            return true;
        }
        if (!(obj instanceof isImageAnalysisEnabled)) {
            return false;
        }
        createImageAnalysis createimageanalysis = (createImageAnalysis) obj;
        if (!Intrinsics.areEqual(isimageanalysisenabled.getINotificationSideChannel(), createimageanalysis.getINotificationSideChannel())) {
            return false;
        }
        isImageAnalysisEnabled isimageanalysisenabled2 = (isImageAnalysisEnabled) obj;
        if (!isimageanalysisenabled2.TuitionPaymentFragmentbindingInflater1 || !Arrays.equals(asBinder(), isimageanalysisenabled2.asBinder()) || isimageanalysisenabled.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() != createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return false;
        }
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = isimageanalysisenabled.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            if (!Intrinsics.areEqual(isimageanalysisenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel()) || !Intrinsics.areEqual(isimageanalysisenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1())) {
                return false;
            }
        }
        return true;
    }
}
