package androidx.p013savedstate.p017serialization;

import defpackage.CameraControllerUseCases;
import defpackage.createImageAnalysis;
import defpackage.deactivateRecordingByListener;
import defpackage.getImageCaptureFlashMode;
import defpackage.getVideoCaptureQualitySelector;
import defpackage.lambdaaccept0androidxcameraviewCameraController2;
import defpackage.lambdanew0androidxcameraviewCameraController;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.setImageAnalysisOutputImageFormat;
import defpackage.throwExceptionForInvalidScreenFlashCapture;
import defpackage.unbindImageCaptureAndRecreate;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0016\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004"}, d2 = {"LcreateImageAnalysis;", "intListDescriptor", "LcreateImageAnalysis;", "getIntListDescriptor", "()LcreateImageAnalysis;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateCodecUtilsKt {
    private static final createImageAnalysis booleanArrayDescriptor;
    private static final createImageAnalysis charArrayDescriptor;
    private static final createImageAnalysis doubleArrayDescriptor;
    private static final createImageAnalysis floatArrayDescriptor;
    private static final createImageAnalysis intArrayDescriptor;
    private static final createImageAnalysis intListDescriptor;
    private static final createImageAnalysis longArrayDescriptor;
    private static final createImageAnalysis stringArrayDescriptor;
    private static final createImageAnalysis stringListDescriptor;

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "");
        lambdanew1androidxcameraviewCameraController lambdanew1androidxcameraviewcameracontroller = lambdanew1androidxcameraviewCameraController.INSTANCE;
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameraviewcameracontroller, "");
        intListDescriptor = new unbindImageCaptureAndRecreate(lambdanew1androidxcameraviewcameracontroller).getDescriptor();
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "");
        CameraControllerUseCases cameraControllerUseCases = CameraControllerUseCases.INSTANCE;
        Intrinsics.checkNotNullParameter(cameraControllerUseCases, "");
        stringListDescriptor = new unbindImageCaptureAndRecreate(cameraControllerUseCases).getDescriptor();
        booleanArrayDescriptor = throwExceptionForInvalidScreenFlashCapture.INSTANCE.getDescriptor();
        charArrayDescriptor = deactivateRecordingByListener.INSTANCE.getDescriptor();
        doubleArrayDescriptor = getImageCaptureFlashMode.INSTANCE.getDescriptor();
        floatArrayDescriptor = getVideoCaptureQualitySelector.INSTANCE.getDescriptor();
        intArrayDescriptor = lambdanew0androidxcameraviewCameraController.INSTANCE.getDescriptor();
        longArrayDescriptor = setImageAnalysisOutputImageFormat.INSTANCE.getDescriptor();
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "");
        CameraControllerUseCases cameraControllerUseCases2 = CameraControllerUseCases.INSTANCE;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(cameraControllerUseCases2, "");
        stringArrayDescriptor = new lambdaaccept0androidxcameraviewCameraController2(orCreateKotlinClass, cameraControllerUseCases2).getDescriptor();
    }

    public static final createImageAnalysis getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final createImageAnalysis getStringListDescriptor() {
        return stringListDescriptor;
    }

    public static final createImageAnalysis getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final createImageAnalysis getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final createImageAnalysis getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final createImageAnalysis getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final createImageAnalysis getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final createImageAnalysis getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final createImageAnalysis getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }
}
