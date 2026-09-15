package com.google.firebase.sessions;

import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CameraControllerExternalSyntheticLambda6;
import defpackage.CameraControllerUseCases;
import defpackage.createImageAnalysis;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isUseCaseEnabled;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.setActiveRecording;
import defpackage.setImageAnalysisBackgroundExecutor;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails$$serializer;", "LgetVideoCaptureDynamicRange;", "Lcom/google/firebase/sessions/SessionDetails;", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "p0", "deserialize", "(LstopListeningToRotationEvents;)Lcom/google/firebase/sessions/SessionDetails;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Lcom/google/firebase/sessions/SessionDetails;)V", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class SessionDetails$$serializer implements getVideoCaptureDynamicRange<SessionDetails> {
    public static final SessionDetails$$serializer INSTANCE;
    private static final createImageAnalysis descriptor;

    static {
        SessionDetails$$serializer sessionDetails$$serializer = new SessionDetails$$serializer();
        INSTANCE = sessionDetails$$serializer;
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("com.google.firebase.sessions.SessionDetails", sessionDetails$$serializer, 4);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionId", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("firstSessionId", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionIndex", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionStartTimestampUs", false);
        descriptor = cameraControllerExternalSyntheticLambda3;
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{CameraControllerUseCases.INSTANCE, CameraControllerUseCases.INSTANCE, lambdanew1androidxcameraviewCameraController.INSTANCE, setImageAnalysisBackgroundExecutor.INSTANCE};
    }

    @Override // defpackage.isBitDepthMatched
    public final SessionDetails deserialize(stopListeningToRotationEvents p0) {
        String str;
        int i;
        int iDecodeIntElement;
        String str2;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 0);
            String strDecodeStringElement2 = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 1);
            str = strDecodeStringElement;
            i = 15;
            iDecodeIntElement = setactiverecordingBeginStructure.decodeIntElement(createimageanalysis, 2);
            str2 = strDecodeStringElement2;
            jDecodeLongElement = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 3);
        } else {
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            int i2 = 0;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = setactiverecordingBeginStructure.decodeStringElement(createimageanalysis, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = setactiverecordingBeginStructure.decodeIntElement(createimageanalysis, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 3);
                    i2 |= 8;
                }
            }
            str = strDecodeStringElement3;
            i = i2;
            iDecodeIntElement = iDecodeIntElement2;
            str2 = strDecodeStringElement4;
            jDecodeLongElement = jDecodeLongElement2;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new SessionDetails(i, str, str2, iDecodeIntElement, jDecodeLongElement, null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SessionDetails p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        SessionDetails.write$Self$com_google_firebase_firebase_sessions(p1, isusecaseenabledBeginStructure, createimageanalysis);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private SessionDetails$$serializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }
}
