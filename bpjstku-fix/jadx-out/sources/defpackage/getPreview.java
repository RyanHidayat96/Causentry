package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes7.dex */
public final class getPreview {
    public static final WriteMode TuitionPaymentFragmentbindingInflater1(PreviewStreamStateObserver2 previewStreamStateObserver2, createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater1 = createimageanalysis.TuitionPaymentFragmentbindingInflater1();
        if (deactivaterecordingTuitionPaymentFragmentbindingInflater1 instanceof resolveInputTimebase) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE)) {
            return WriteMode.OBJ;
        }
        createImageAnalysis createimageanalysisTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0), previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater2 = createimageanalysisTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        if ((deactivaterecordingTuitionPaymentFragmentbindingInflater2 instanceof checkAudioPermissionGranted) || Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater2, deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
            return WriteMode.MAP;
        }
        if (previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return WriteMode.LIST;
        }
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentbindingInflater1(createimageanalysisTuitionPaymentFragmentbindingInflater1);
    }

    public static final createImageAnalysis TuitionPaymentFragmentbindingInflater1(createImageAnalysis createimageanalysis, PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener) {
        createImageAnalysis createimageanalysisTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListener, "");
        if (!Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE)) {
            return createimageanalysis.b() ? TuitionPaymentFragmentbindingInflater1(createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0), previewViewImplementationOnSurfaceNotInUseListener) : createimageanalysis;
        }
        createImageAnalysis createimageanalysisB = convertToUptimeUs.b(previewViewImplementationOnSurfaceNotInUseListener, createimageanalysis);
        return (createimageanalysisB == null || (createimageanalysisTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(createimageanalysisB, previewViewImplementationOnSurfaceNotInUseListener)) == null) ? createimageanalysis : createimageanalysisTuitionPaymentFragmentbindingInflater1;
    }
}
