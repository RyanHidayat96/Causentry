package defpackage;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getViewportAspectRatioStrategy {
    public static final createImageAnalysis TuitionPaymentFragmentbindingInflater1(String str, createImageAnalysis[] createimageanalysisArr, Function1<? super calculateUptimeToRealtimeOffsetUs, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createimageanalysisArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus = new calculateUptimeToRealtimeOffsetUs(str);
        function1.invoke(calculateuptimetorealtimeoffsetus);
        return new createVideoCapture(str, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, calculateuptimetorealtimeoffsetus.b.size(), ArraysKt.toList(createimageanalysisArr), calculateuptimetorealtimeoffsetus);
    }

    public static final createImageAnalysis TuitionPaymentFragmentbindingInflater1(String str, checkAudioPermissionGranted checkaudiopermissiongranted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkaudiopermissiongranted, "");
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        return CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, checkaudiopermissiongranted);
    }

    public static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (createimageanalysis.TuitionPaymentFragmentbindingInflater1() instanceof checkAudioPermissionGranted) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead".toString());
        }
        if (Intrinsics.areEqual(str, createimageanalysis.getINotificationSideChannel())) {
            StringBuilder sb = new StringBuilder("The name of the wrapped descriptor (");
            sb.append(str);
            sb.append(") cannot be the same as the name of the original descriptor (");
            sb.append(createimageanalysis.getINotificationSideChannel());
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return new isPreviewViewAttached(str, createimageanalysis);
    }

    public static final createImageAnalysis TuitionPaymentFragmentbindingInflater1(String str, deactivateRecording deactivaterecording, createImageAnalysis[] createimageanalysisArr, Function1<? super calculateUptimeToRealtimeOffsetUs, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deactivaterecording, "");
        Intrinsics.checkNotNullParameter(createimageanalysisArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (Intrinsics.areEqual(deactivaterecording, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus = new calculateUptimeToRealtimeOffsetUs(str);
        function1.invoke(calculateuptimetorealtimeoffsetus);
        return new createVideoCapture(str, deactivaterecording, calculateuptimetorealtimeoffsetus.b.size(), ArraysKt.toList(createimageanalysisArr), calculateuptimetorealtimeoffsetus);
    }
}
