package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setTargetOutputSize<T> implements videoProfileHdrFormatsToDynamicRangeEncoding<T> {
    public abstract KClass<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents startlisteningtorotationevents, T t) {
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(t, "");
        QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProviderB = deriveVideoProfile.b(this, startlisteningtorotationevents, t);
        createImageAnalysis descriptor = getDescriptor();
        isUseCaseEnabled isusecaseenabledBeginStructure = startlisteningtorotationevents.beginStructure(descriptor);
        isusecaseenabledBeginStructure.encodeStringElement(getDescriptor(), 0, qualityAddedEncoderProfilesProviderB.getDescriptor().getINotificationSideChannel());
        createImageAnalysis descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(qualityAddedEncoderProfilesProviderB, "");
        isusecaseenabledBeginStructure.encodeSerializableElement(descriptor2, 1, qualityAddedEncoderProfilesProviderB, t);
        isusecaseenabledBeginStructure.endStructure(descriptor);
    }

    @Override // defpackage.isBitDepthMatched
    public final T deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        T t;
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        createImageAnalysis descriptor = getDescriptor();
        setActiveRecording setactiverecordingBeginStructure = stoplisteningtorotationevents.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            t = (T) setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 1, deriveVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, setactiverecordingBeginStructure, setactiverecordingBeginStructure.decodeStringElement(getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement = null;
            while (true) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement != null) {
                        Intrinsics.checkNotNull(objDecodeSerializableElement, "");
                        t = (T) objDecodeSerializableElement;
                        break;
                    }
                    StringBuilder sb = new StringBuilder("Polymorphic value has not been read for class ");
                    sb.append((String) objectRef.element);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (iDecodeElementIndex == 0) {
                    objectRef.element = (T) setactiverecordingBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else if (iDecodeElementIndex == 1) {
                    T t2 = objectRef.element;
                    if (t2 == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    objectRef.element = t2;
                    objDecodeSerializableElement = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, deriveVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, setactiverecordingBeginStructure, (String) objectRef.element), null);
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) objectRef.element;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iDecodeElementIndex);
                    throw new SerializationException(sb2.toString());
                }
            }
        }
        setactiverecordingBeginStructure.endStructure(descriptor);
        return t;
    }

    public isBitDepthMatched<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActiveRecording setactiverecording, String str) {
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        return setactiverecording.getSerializersModule().TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), str);
    }

    public QualityAddedEncoderProfilesProvider<T> TuitionPaymentFragmentbindingInflater1(startListeningToRotationEvents startlisteningtorotationevents, T t) {
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(t, "");
        return startlisteningtorotationevents.getSerializersModule().TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), t);
    }
}
