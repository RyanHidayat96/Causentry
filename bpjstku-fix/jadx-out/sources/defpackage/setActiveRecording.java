package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 52\u00020\u0001:\u00015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH'¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH'¢\u0006\u0004\b)\u0010*JC\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b/\u00100JE\u00101\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\b\u0010.\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b1\u00100R\u0014\u00105\u001a\u0002028'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104"}, d2 = {"LsetActiveRecording;", "", "LcreateImageAnalysis;", "p0", "", "endStructure", "(LcreateImageAnalysis;)V", "", "decodeSequentially", "()Z", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "decodeCollectionSize", "p1", "decodeBooleanElement", "(LcreateImageAnalysis;I)Z", "", "decodeByteElement", "(LcreateImageAnalysis;I)B", "", "decodeCharElement", "(LcreateImageAnalysis;I)C", "", "decodeShortElement", "(LcreateImageAnalysis;I)S", "decodeIntElement", "(LcreateImageAnalysis;I)I", "", "decodeLongElement", "(LcreateImageAnalysis;I)J", "", "decodeFloatElement", "(LcreateImageAnalysis;I)F", "", "decodeDoubleElement", "(LcreateImageAnalysis;I)D", "", "decodeStringElement", "(LcreateImageAnalysis;I)Ljava/lang/String;", "LstopListeningToRotationEvents;", "decodeInlineElement", "(LcreateImageAnalysis;I)LstopListeningToRotationEvents;", ExifInterface.GPS_DIRECTION_TRUE, "LisBitDepthMatched;", "p2", "p3", "decodeSerializableElement", "(LcreateImageAnalysis;ILisBitDepthMatched;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setActiveRecording {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentbindingInflater1;

    boolean decodeBooleanElement(createImageAnalysis p0, int p1);

    byte decodeByteElement(createImageAnalysis p0, int p1);

    char decodeCharElement(createImageAnalysis p0, int p1);

    int decodeCollectionSize(createImageAnalysis p0);

    double decodeDoubleElement(createImageAnalysis p0, int p1);

    int decodeElementIndex(createImageAnalysis p0);

    float decodeFloatElement(createImageAnalysis p0, int p1);

    stopListeningToRotationEvents decodeInlineElement(createImageAnalysis p0, int p1);

    int decodeIntElement(createImageAnalysis p0, int p1);

    long decodeLongElement(createImageAnalysis p0, int p1);

    <T> T decodeNullableSerializableElement(createImageAnalysis p0, int p1, isBitDepthMatched<? extends T> p2, T p3);

    boolean decodeSequentially();

    <T> T decodeSerializableElement(createImageAnalysis p0, int p1, isBitDepthMatched<? extends T> p2, T p3);

    short decodeShortElement(createImageAnalysis p0, int p1);

    String decodeStringElement(createImageAnalysis p0, int p1);

    void endStructure(createImageAnalysis p0);

    PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule();

    /* JADX INFO: renamed from: setActiveRecording$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentbindingInflater1 = new Companion();

        private Companion() {
        }
    }
}
