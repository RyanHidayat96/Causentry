package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(JA\u0010,\u001a\u00020\u0004\"\n\b\u0000\u0010)*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010+\u001a\u00028\u0000H&¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004\"\b\b\u0000\u0010)*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010+\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b.\u0010-"}, d2 = {"LisUseCaseEnabled;", "", "LcreateImageAnalysis;", "p0", "", "endStructure", "(LcreateImageAnalysis;)V", "", "p1", "", "shouldEncodeElementDefault", "(LcreateImageAnalysis;I)Z", "p2", "encodeBooleanElement", "(LcreateImageAnalysis;IZ)V", "", "encodeByteElement", "(LcreateImageAnalysis;IB)V", "", "encodeShortElement", "(LcreateImageAnalysis;IS)V", "", "encodeCharElement", "(LcreateImageAnalysis;IC)V", "encodeIntElement", "(LcreateImageAnalysis;II)V", "", "encodeLongElement", "(LcreateImageAnalysis;IJ)V", "", "encodeFloatElement", "(LcreateImageAnalysis;IF)V", "", "encodeDoubleElement", "(LcreateImageAnalysis;ID)V", "", "encodeStringElement", "(LcreateImageAnalysis;ILjava/lang/String;)V", "LstartListeningToRotationEvents;", "encodeInlineElement", "(LcreateImageAnalysis;I)LstartListeningToRotationEvents;", ExifInterface.GPS_DIRECTION_TRUE, "LQualityAddedEncoderProfilesProvider;", "p3", "encodeSerializableElement", "(LcreateImageAnalysis;ILQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)V", "encodeNullableSerializableElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isUseCaseEnabled {
    void encodeBooleanElement(createImageAnalysis p0, int p1, boolean p2);

    void encodeByteElement(createImageAnalysis p0, int p1, byte p2);

    void encodeCharElement(createImageAnalysis p0, int p1, char p2);

    void encodeDoubleElement(createImageAnalysis p0, int p1, double p2);

    void encodeFloatElement(createImageAnalysis p0, int p1, float p2);

    startListeningToRotationEvents encodeInlineElement(createImageAnalysis p0, int p1);

    void encodeIntElement(createImageAnalysis p0, int p1, int p2);

    void encodeLongElement(createImageAnalysis p0, int p1, long p2);

    <T> void encodeNullableSerializableElement(createImageAnalysis p0, int p1, QualityAddedEncoderProfilesProvider<? super T> p2, T p3);

    <T> void encodeSerializableElement(createImageAnalysis p0, int p1, QualityAddedEncoderProfilesProvider<? super T> p2, T p3);

    void encodeShortElement(createImageAnalysis p0, int p1, short p2);

    void encodeStringElement(createImageAnalysis p0, int p1, String p2);

    void endStructure(createImageAnalysis p0);

    boolean shouldEncodeElementDefault(createImageAnalysis p0, int p1);
}
