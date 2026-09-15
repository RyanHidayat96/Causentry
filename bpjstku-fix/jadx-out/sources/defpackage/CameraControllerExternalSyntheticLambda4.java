package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraControllerExternalSyntheticLambda4 {
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, createImageAnalysis[] createimageanalysisArr) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(createimageanalysisArr, "");
        int iHashCode = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault1().hashCode();
        int iHashCode2 = Arrays.hashCode(createimageanalysisArr);
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        createPreview.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new createPreview.TuitionPaymentFragmentbindingInflater1(createimageanalysis);
        Iterator<createImageAnalysis> it = tuitionPaymentFragmentbindingInflater1.iterator();
        int iHashCode3 = 1;
        int i = 1;
        while (true) {
            int iHashCode4 = 0;
            if (!it.hasNext()) {
                break;
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                iHashCode4 = strTuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            }
            i = (i * 31) + iHashCode4;
        }
        Iterator<createImageAnalysis> it2 = tuitionPaymentFragmentbindingInflater1.iterator();
        while (it2.hasNext()) {
            deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater1 = it2.next().TuitionPaymentFragmentbindingInflater1();
            iHashCode3 = (iHashCode3 * 31) + (deactivaterecordingTuitionPaymentFragmentbindingInflater1 != null ? deactivaterecordingTuitionPaymentFragmentbindingInflater1.hashCode() : 0);
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode3;
    }
}
