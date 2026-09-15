package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b0\u00101J%\u00103\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\u000e¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\u001a¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\"¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020%¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020(¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bE\u0010FJA\u0010J\u001a\u00020\t\"\n\b\u0000\u0010G*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0006\u0010I\u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010KJA\u0010L\u001a\u00020\t\"\b\b\u0000\u0010G*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000H2\b\u0010I\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bL\u0010K"}, d2 = {"LrestartCameraIfAnalyzerResolutionChanged;", "LstartListeningToRotationEvents;", "LisUseCaseEnabled;", "<init>", "()V", "LcreateImageAnalysis;", "p0", "beginStructure", "(LcreateImageAnalysis;)LisUseCaseEnabled;", "", "endStructure", "(LcreateImageAnalysis;)V", "", "p1", "", "encodeElement", "(LcreateImageAnalysis;I)Z", "", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(LcreateImageAnalysis;I)V", "encodeInline", "(LcreateImageAnalysis;)LstartListeningToRotationEvents;", "p2", "encodeBooleanElement", "(LcreateImageAnalysis;IZ)V", "encodeByteElement", "(LcreateImageAnalysis;IB)V", "encodeShortElement", "(LcreateImageAnalysis;IS)V", "encodeIntElement", "(LcreateImageAnalysis;II)V", "encodeLongElement", "(LcreateImageAnalysis;IJ)V", "encodeFloatElement", "(LcreateImageAnalysis;IF)V", "encodeDoubleElement", "(LcreateImageAnalysis;ID)V", "encodeCharElement", "(LcreateImageAnalysis;IC)V", "encodeStringElement", "(LcreateImageAnalysis;ILjava/lang/String;)V", "encodeInlineElement", "(LcreateImageAnalysis;I)LstartListeningToRotationEvents;", ExifInterface.GPS_DIRECTION_TRUE, "LQualityAddedEncoderProfilesProvider;", "p3", "encodeSerializableElement", "(LcreateImageAnalysis;ILQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)V", "encodeNullableSerializableElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class restartCameraIfAnalyzerResolutionChanged implements startListeningToRotationEvents, isUseCaseEnabled {
    @Override // defpackage.startListeningToRotationEvents
    public void encodeNotNullMark() {
    }

    @Override // defpackage.startListeningToRotationEvents
    public isUseCaseEnabled beginCollection(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return beginStructure(createimageanalysis);
    }

    public <T> void encodeNullableSerializableValue(QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        if (qualityAddedEncoderProfilesProvider.getDescriptor().d()) {
            encodeSerializableValue(qualityAddedEncoderProfilesProvider, t);
        } else if (t == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(qualityAddedEncoderProfilesProvider, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.startListeningToRotationEvents
    public <T> void encodeSerializableValue(QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        qualityAddedEncoderProfilesProvider.serialize(this, t);
    }

    @Override // defpackage.startListeningToRotationEvents
    public isUseCaseEnabled beginStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this;
    }

    public void encodeValue(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder("Non-serializable ");
        sb.append(Reflection.getOrCreateKotlinClass(p0.getClass()));
        sb.append(" is not supported by ");
        sb.append(Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeBoolean(boolean p0) {
        encodeValue(Boolean.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeByte(byte p0) {
        encodeValue(Byte.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeShort(short p0) {
        encodeValue(Short.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeInt(int p0) {
        encodeValue(Integer.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeLong(long p0) {
        encodeValue(Long.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeFloat(float p0) {
        encodeValue(Float.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeDouble(double p0) {
        encodeValue(Double.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeChar(char p0) {
        encodeValue(Character.valueOf(p0));
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeString(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        encodeValue(p0);
    }

    @Override // defpackage.startListeningToRotationEvents
    public void encodeEnum(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        encodeValue(Integer.valueOf(p1));
    }

    @Override // defpackage.startListeningToRotationEvents
    public startListeningToRotationEvents encodeInline(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this;
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeBooleanElement(createImageAnalysis p0, int p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeBoolean(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeByteElement(createImageAnalysis p0, int p1, byte p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeByte(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeShortElement(createImageAnalysis p0, int p1, short p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeShort(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeIntElement(createImageAnalysis p0, int p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeInt(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeLongElement(createImageAnalysis p0, int p1, long p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeLong(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeFloatElement(createImageAnalysis p0, int p1, float p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeFloat(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeDoubleElement(createImageAnalysis p0, int p1, double p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeDouble(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeCharElement(createImageAnalysis p0, int p1, char p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeElement(p0, p1)) {
            encodeChar(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final void encodeStringElement(createImageAnalysis p0, int p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (encodeElement(p0, p1)) {
            encodeString(p2);
        }
    }

    @Override // defpackage.isUseCaseEnabled
    public final startListeningToRotationEvents encodeInlineElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return encodeElement(p0, p1) ? encodeInline(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1)) : setPinchToZoomEnabled.INSTANCE;
    }

    @Override // defpackage.isUseCaseEnabled
    public <T> void encodeSerializableElement(createImageAnalysis p0, int p1, QualityAddedEncoderProfilesProvider<? super T> p2, T p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (encodeElement(p0, p1)) {
            encodeSerializableValue(p2, p3);
        }
    }

    public <T> void encodeNullableSerializableElement(createImageAnalysis p0, int p1, QualityAddedEncoderProfilesProvider<? super T> p2, T p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (encodeElement(p0, p1)) {
            encodeNullableSerializableValue(p2, p3);
        }
    }

    public boolean shouldEncodeElementDefault(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return true;
    }

    public boolean encodeElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return true;
    }

    public void endStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
