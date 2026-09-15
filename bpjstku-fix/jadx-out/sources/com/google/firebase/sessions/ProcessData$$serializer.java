package com.google.firebase.sessions;

import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CameraControllerExternalSyntheticLambda6;
import defpackage.CameraControllerUseCases;
import defpackage.createImageAnalysis;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isUseCaseEnabled;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.setActiveRecording;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/ProcessData$$serializer;", "LgetVideoCaptureDynamicRange;", "Lcom/google/firebase/sessions/ProcessData;", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "p0", "deserialize", "(LstopListeningToRotationEvents;)Lcom/google/firebase/sessions/ProcessData;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Lcom/google/firebase/sessions/ProcessData;)V", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class ProcessData$$serializer implements getVideoCaptureDynamicRange<ProcessData> {
    public static final ProcessData$$serializer INSTANCE;
    private static final createImageAnalysis descriptor;

    static {
        ProcessData$$serializer processData$$serializer = new ProcessData$$serializer();
        INSTANCE = processData$$serializer;
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("com.google.firebase.sessions.ProcessData", processData$$serializer, 2);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("pid", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("uuid", false);
        descriptor = cameraControllerExternalSyntheticLambda3;
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{lambdanew1androidxcameraviewCameraController.INSTANCE, CameraControllerUseCases.INSTANCE};
    }

    @Override // defpackage.isBitDepthMatched
    public final ProcessData deserialize(stopListeningToRotationEvents p0) {
        int iDecodeIntElement;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            iDecodeIntElement = setactiverecordingBeginStructure.decodeIntElement(createimageanalysis, 0);
            strDecodeStringElement = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 1);
            i = 3;
        } else {
            String strDecodeStringElement2 = null;
            iDecodeIntElement = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = setactiverecordingBeginStructure.decodeIntElement(createimageanalysis, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 1);
                    i2 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new ProcessData(i, iDecodeIntElement, strDecodeStringElement, null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, ProcessData p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        ProcessData.write$Self$com_google_firebase_firebase_sessions(p1, isusecaseenabledBeginStructure, createimageanalysis);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private ProcessData$$serializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }
}
