package com.google.firebase.sessions;

import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CameraControllerExternalSyntheticLambda6;
import defpackage.createImageAnalysis;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isUseCaseEnabled;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/Time$$serializer;", "LgetVideoCaptureDynamicRange;", "Lcom/google/firebase/sessions/Time;", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "p0", "deserialize", "(LstopListeningToRotationEvents;)Lcom/google/firebase/sessions/Time;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Lcom/google/firebase/sessions/Time;)V", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Time$$serializer implements getVideoCaptureDynamicRange<Time> {
    public static final Time$$serializer INSTANCE;
    private static final createImageAnalysis descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        INSTANCE = time$$serializer;
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("com.google.firebase.sessions.Time", time$$serializer, 3);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("ms", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("us", true);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("seconds", true);
        descriptor = cameraControllerExternalSyntheticLambda3;
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{setImageAnalysisBackgroundExecutor.INSTANCE, setImageAnalysisBackgroundExecutor.INSTANCE, setImageAnalysisBackgroundExecutor.INSTANCE};
    }

    @Override // defpackage.isBitDepthMatched
    public final Time deserialize(stopListeningToRotationEvents p0) {
        int i;
        long jDecodeLongElement;
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 0);
            long jDecodeLongElement3 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 1);
            jDecodeLongElement = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 2);
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement2;
            i = 7;
        } else {
            long jDecodeLongElement4 = 0;
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement6 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement5 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = setactiverecordingBeginStructure.decodeLongElement(createimageanalysis, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            jDecodeLongElement = jDecodeLongElement4;
            j = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new Time(i, j2, j, jDecodeLongElement, null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, Time p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        Time.write$Self$com_google_firebase_firebase_sessions(p1, isusecaseenabledBeginStructure, createimageanalysis);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private Time$$serializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }
}
