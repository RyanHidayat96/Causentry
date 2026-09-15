package com.google.firebase.sessions.settings;

import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CameraControllerExternalSyntheticLambda6;
import defpackage.addExtraSupportedSize;
import defpackage.createImageAnalysis;
import defpackage.getImageCaptureIoExecutor;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isUseCaseEnabled;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.setActiveRecording;
import defpackage.setImageAnalysisBackgroundExecutor;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.unbindPreviewAndRecreate;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$$serializer;", "LgetVideoCaptureDynamicRange;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "p0", "deserialize", "(LstopListeningToRotationEvents;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Lcom/google/firebase/sessions/settings/SessionConfigs;)V", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class SessionConfigs$$serializer implements getVideoCaptureDynamicRange<SessionConfigs> {
    public static final SessionConfigs$$serializer INSTANCE;
    private static final createImageAnalysis descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        INSTANCE = sessionConfigs$$serializer;
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionsEnabled", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionSamplingRate", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionTimeoutSeconds", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("cacheDurationSeconds", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("cacheUpdatedTimeSeconds", false);
        descriptor = cameraControllerExternalSyntheticLambda3;
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(unbindPreviewAndRecreate.INSTANCE), addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getImageCaptureIoExecutor.INSTANCE), addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdanew1androidxcameraviewCameraController.INSTANCE), addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdanew1androidxcameraviewCameraController.INSTANCE), addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setImageAnalysisBackgroundExecutor.INSTANCE)};
    }

    @Override // defpackage.isBitDepthMatched
    public final SessionConfigs deserialize(stopListeningToRotationEvents p0) {
        int i;
        Integer num;
        Long l;
        Integer num2;
        Boolean bool;
        Double d;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        Integer num3 = null;
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 0, unbindPreviewAndRecreate.INSTANCE, null);
            Double d2 = (Double) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 1, getImageCaptureIoExecutor.INSTANCE, null);
            Integer num4 = (Integer) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 2, lambdanew1androidxcameraviewCameraController.INSTANCE, null);
            bool = bool2;
            num = (Integer) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 3, lambdanew1androidxcameraviewCameraController.INSTANCE, null);
            l = (Long) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 4, setImageAnalysisBackgroundExecutor.INSTANCE, null);
            num2 = num4;
            d = d2;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            Long l2 = null;
            Integer num5 = null;
            Boolean bool3 = null;
            Double d3 = null;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 0, unbindPreviewAndRecreate.INSTANCE, bool3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d3 = (Double) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 1, getImageCaptureIoExecutor.INSTANCE, d3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num5 = (Integer) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 2, lambdanew1androidxcameraviewCameraController.INSTANCE, num5);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num3 = (Integer) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 3, lambdanew1androidxcameraviewCameraController.INSTANCE, num3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l2 = (Long) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 4, setImageAnalysisBackgroundExecutor.INSTANCE, l2);
                    i2 |= 16;
                }
            }
            i = i2;
            num = num3;
            l = l2;
            num2 = num5;
            bool = bool3;
            d = d3;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new SessionConfigs(i, bool, d, num2, num, l, null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SessionConfigs p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(p1, isusecaseenabledBeginStructure, createimageanalysis);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }
}
