package com.google.firebase.sessions;

import defpackage.CameraController1;
import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CameraControllerExternalSyntheticLambda6;
import defpackage.addExtraSupportedSize;
import defpackage.createImageAnalysis;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isUseCaseEnabled;
import defpackage.setActiveRecording;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionData$$serializer;", "LgetVideoCaptureDynamicRange;", "Lcom/google/firebase/sessions/SessionData;", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "p0", "deserialize", "(LstopListeningToRotationEvents;)Lcom/google/firebase/sessions/SessionData;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Lcom/google/firebase/sessions/SessionData;)V", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class SessionData$$serializer implements getVideoCaptureDynamicRange<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    private static final createImageAnalysis descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionDetails", false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("backgroundTime", true);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("processDataMap", true);
        descriptor = cameraControllerExternalSyntheticLambda3;
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{SessionDetails$$serializer.INSTANCE, addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Time$$serializer.INSTANCE), addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SessionData.access$get$childSerializers$cp()[2])};
    }

    @Override // defpackage.isBitDepthMatched
    public final SessionData deserialize(stopListeningToRotationEvents p0) {
        int i;
        Time time;
        Map map;
        SessionDetails sessionDetails;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArrAccess$get$childSerializers$cp = SessionData.access$get$childSerializers$cp();
        Time time2 = null;
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            SessionDetails sessionDetails2 = (SessionDetails) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 0, SessionDetails$$serializer.INSTANCE, null);
            Time time3 = (Time) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 1, Time$$serializer.INSTANCE, null);
            map = (Map) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 2, videoprofilehdrformatstodynamicrangeencodingArrAccess$get$childSerializers$cp[2], null);
            sessionDetails = sessionDetails2;
            time = time3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            Map map2 = null;
            SessionDetails sessionDetails3 = null;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sessionDetails3 = (SessionDetails) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 0, SessionDetails$$serializer.INSTANCE, sessionDetails3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    time2 = (Time) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 1, Time$$serializer.INSTANCE, time2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) setactiverecordingBeginStructure.decodeNullableSerializableElement(createimageanalysis, 2, videoprofilehdrformatstodynamicrangeencodingArrAccess$get$childSerializers$cp[2], map2);
                    i2 |= 4;
                }
            }
            i = i2;
            time = time2;
            map = map2;
            sessionDetails = sessionDetails3;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new SessionData(i, sessionDetails, time, map, (CameraController1) null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SessionData p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        SessionData.write$Self$com_google_firebase_firebase_sessions(p1, isusecaseenabledBeginStructure, createimageanalysis);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private SessionData$$serializer() {
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return descriptor;
    }
}
