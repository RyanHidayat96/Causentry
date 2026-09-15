package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b+\u0010,J5\u00100\u001a\u00028\u0000\"\n\b\u0000\u0010-*\u0004\u0018\u00010\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u00012\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0015H\u0017¢\u0006\u0004\bI\u0010JJ=\u0010M\u001a\u00028\u0000\"\u0004\b\u0000\u0010-2\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u00152\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000.2\b\u0010L\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010/\u001a\u00020\u00152\u000e\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000.2\b\u0010L\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bO\u0010N"}, d2 = {"LisOutputSizeEqual;", "LstopListeningToRotationEvents;", "LsetActiveRecording;", "<init>", "()V", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "LcreateImageAnalysis;", "p0", "decodeEnum", "(LcreateImageAnalysis;)I", "decodeInline", "(LcreateImageAnalysis;)LstopListeningToRotationEvents;", ExifInterface.GPS_DIRECTION_TRUE, "LisBitDepthMatched;", "p1", "decodeSerializableValue", "(LisBitDepthMatched;Ljava/lang/Object;)Ljava/lang/Object;", "beginStructure", "(LcreateImageAnalysis;)LsetActiveRecording;", "", "endStructure", "(LcreateImageAnalysis;)V", "decodeBooleanElement", "(LcreateImageAnalysis;I)Z", "decodeByteElement", "(LcreateImageAnalysis;I)B", "decodeShortElement", "(LcreateImageAnalysis;I)S", "decodeIntElement", "(LcreateImageAnalysis;I)I", "decodeLongElement", "(LcreateImageAnalysis;I)J", "decodeFloatElement", "(LcreateImageAnalysis;I)F", "decodeDoubleElement", "(LcreateImageAnalysis;I)D", "decodeCharElement", "(LcreateImageAnalysis;I)C", "decodeStringElement", "(LcreateImageAnalysis;I)Ljava/lang/String;", "decodeInlineElement", "(LcreateImageAnalysis;I)LstopListeningToRotationEvents;", "p2", "p3", "decodeSerializableElement", "(LcreateImageAnalysis;ILisBitDepthMatched;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class isOutputSizeEqual implements stopListeningToRotationEvents, setActiveRecording {
    @Override // defpackage.stopListeningToRotationEvents
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public Void decodeNull() {
        return null;
    }

    @Override // defpackage.setActiveRecording
    public boolean decodeSequentially() {
        return false;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public <T> T decodeNullableSerializableValue(isBitDepthMatched<? extends T> isbitdepthmatched) {
        return (T) stopListeningToRotationEvents.DefaultImpls.decodeNullableSerializableValue(this, isbitdepthmatched);
    }

    @Override // defpackage.stopListeningToRotationEvents
    public <T> T decodeSerializableValue(isBitDepthMatched<? extends T> isbitdepthmatched) {
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        return isbitdepthmatched.deserialize(this);
    }

    public Object decodeValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" can't retrieve untyped values");
        throw new SerializationException(sb.toString());
    }

    @Override // defpackage.stopListeningToRotationEvents
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return (String) objDecodeValue;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public int decodeEnum(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public stopListeningToRotationEvents decodeInline(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this;
    }

    public static /* synthetic */ Object decodeSerializableValue$default(isOutputSizeEqual isoutputsizeequal, isBitDepthMatched isbitdepthmatched, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return isoutputsizeequal.decodeSerializableValue(isbitdepthmatched, obj);
    }

    public <T> T decodeSerializableValue(isBitDepthMatched<? extends T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) decodeSerializableValue(p0);
    }

    @Override // defpackage.stopListeningToRotationEvents
    public setActiveRecording beginStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this;
    }

    @Override // defpackage.setActiveRecording
    public final boolean decodeBooleanElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeBoolean();
    }

    @Override // defpackage.setActiveRecording
    public final byte decodeByteElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeByte();
    }

    @Override // defpackage.setActiveRecording
    public final short decodeShortElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeShort();
    }

    @Override // defpackage.setActiveRecording
    public final int decodeIntElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeInt();
    }

    @Override // defpackage.setActiveRecording
    public final long decodeLongElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeLong();
    }

    @Override // defpackage.setActiveRecording
    public final float decodeFloatElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeFloat();
    }

    @Override // defpackage.setActiveRecording
    public final double decodeDoubleElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeDouble();
    }

    @Override // defpackage.setActiveRecording
    public final char decodeCharElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeChar();
    }

    @Override // defpackage.setActiveRecording
    public final String decodeStringElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeString();
    }

    @Override // defpackage.setActiveRecording
    public stopListeningToRotationEvents decodeInlineElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return decodeInline(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1));
    }

    public <T> T decodeSerializableElement(createImageAnalysis p0, int p1, isBitDepthMatched<? extends T> p2, T p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return (T) decodeSerializableValue(p2, p3);
    }

    @Override // defpackage.setActiveRecording
    public final <T> T decodeNullableSerializableElement(createImageAnalysis p0, int p1, isBitDepthMatched<? extends T> p2, T p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        isOutputSizeEqual isoutputsizeequal = this;
        return (p2.getDescriptor().d() || isoutputsizeequal.decodeNotNullMark()) ? (T) decodeSerializableValue(p2, p3) : (T) isoutputsizeequal.decodeNull();
    }

    @Override // defpackage.setActiveRecording
    public int decodeCollectionSize(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return -1;
    }

    public void endStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
