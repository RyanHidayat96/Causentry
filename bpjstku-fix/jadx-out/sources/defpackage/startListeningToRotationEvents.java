package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\"H'¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\"H'¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H'¢\u0006\u0004\b+\u0010,J1\u0010/\u001a\u00020\u0002\"\n\b\u0000\u0010-*\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010#\u001a\u00028\u0000H&¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"LstartListeningToRotationEvents;", "", "", "encodeNotNullMark", "()V", "encodeNull", "", "p0", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeChar", "(C)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeString", "(Ljava/lang/String;)V", "LcreateImageAnalysis;", "p1", "encodeEnum", "(LcreateImageAnalysis;I)V", "encodeInline", "(LcreateImageAnalysis;)LstartListeningToRotationEvents;", "LisUseCaseEnabled;", "beginStructure", "(LcreateImageAnalysis;)LisUseCaseEnabled;", "beginCollection", "(LcreateImageAnalysis;I)LisUseCaseEnabled;", ExifInterface.GPS_DIRECTION_TRUE, "LQualityAddedEncoderProfilesProvider;", "encodeSerializableValue", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)V", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface startListeningToRotationEvents {
    isUseCaseEnabled beginCollection(createImageAnalysis p0, int p1);

    isUseCaseEnabled beginStructure(createImageAnalysis p0);

    void encodeBoolean(boolean p0);

    void encodeByte(byte p0);

    void encodeChar(char p0);

    void encodeDouble(double p0);

    void encodeEnum(createImageAnalysis p0, int p1);

    void encodeFloat(float p0);

    startListeningToRotationEvents encodeInline(createImageAnalysis p0);

    void encodeInt(int p0);

    void encodeLong(long p0);

    void encodeNotNullMark();

    void encodeNull();

    <T> void encodeSerializableValue(QualityAddedEncoderProfilesProvider<? super T> p0, T p1);

    void encodeShort(short p0);

    void encodeString(String p0);

    PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule();
}
