package androidx.p013savedstate.p017serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.createImageAnalysis;
import defpackage.isBitDepthMatched;
import defpackage.isCameraAttached;
import defpackage.isOutputSizeEqual;
import defpackage.setActiveRecording;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\fJ\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020$0(H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020$0>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\tH\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010\u000fJ#\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010E2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0016¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010E2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0002¢\u0006\u0004\bI\u0010HR\u001e\u0010J\u001a\u00060\u0002j\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010P\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020$8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010&R\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020U8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y"}, d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "LisOutputSizeEqual;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p1", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "LcreateImageAnalysis;", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "", "decodeBoolean", "()Z", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "decodeEnum", "", "decodeIntList", "()Ljava/util/List;", "decodeStringList", "", "decodeBooleanArray", "()[Z", "", "decodeCharArray", "()[C", "", "decodeDoubleArray", "()[D", "", "decodeFloatArray", "()[F", "", "decodeIntArray", "()[I", "", "decodeLongArray", "()[J", "", "decodeStringArray", "()[Ljava/lang/String;", "LsetActiveRecording;", "beginStructure", "(LcreateImageAnalysis;)LsetActiveRecording;", "decodeNotNullMark", ExifInterface.GPS_DIRECTION_TRUE, "LisBitDepthMatched;", "decodeSerializableValue", "(LisBitDepthMatched;)Ljava/lang/Object;", "decodeFormatSpecificTypes", "savedState", "Landroid/os/Bundle;", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "key", "Ljava/lang/String;", "getKey$savedstate_release", FirebaseAnalytics.Param.INDEX, "I", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoder extends isOutputSizeEqual {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;

    /* JADX INFO: renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    public SavedStateDecoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        this.savedState = bundle;
        this.configuration = savedStateConfiguration;
        this.key = "";
        this.serializersModule = savedStateConfiguration.getSerializersModule();
    }

    /* JADX INFO: renamed from: getKey$savedstate_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // defpackage.setActiveRecording
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.serializersModule;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis p0) {
        int iM7448sizeimpl;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE) || Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE)) {
            iM7448sizeimpl = SavedStateReader.m7448sizeimpl(SavedStateReader.m7368constructorimpl(this.savedState));
        } else {
            iM7448sizeimpl = p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        while (true) {
            int i = this.index;
            if (i >= iM7448sizeimpl || !p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i) || decodeElementIndex$presentInEncoding(this, p0, this.index)) {
                break;
            }
            this.index++;
        }
        int i2 = this.index;
        if (i2 >= iM7448sizeimpl) {
            return -1;
        }
        this.key = p0.TuitionPaymentFragmentbindingInflater1(i2);
        int i3 = this.index;
        this.index = i3 + 1;
        return i3;
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder savedStateDecoder, createImageAnalysis createimageanalysis, int i) {
        return SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(savedStateDecoder.savedState), createimageanalysis.TuitionPaymentFragmentbindingInflater1(i));
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final boolean decodeBoolean() {
        return SavedStateReader.m7377getBooleanimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final byte decodeByte() {
        return (byte) SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final short decodeShort() {
        return (short) SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final int decodeInt() {
        return SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final long decodeLong() {
        return SavedStateReader.m7409getLongimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final float decodeFloat() {
        return SavedStateReader.m7395getFloatimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final double decodeDouble() {
        return SavedStateReader.m7391getDoubleimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final char decodeChar() {
        return SavedStateReader.m7381getCharimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final String decodeString() {
        return SavedStateReader.m7439getStringimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final int decodeEnum(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final List<Integer> decodeIntList() {
        return SavedStateReader.m7402getIntListimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final List<String> decodeStringList() {
        return SavedStateReader.m7442getStringListimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final boolean[] decodeBooleanArray() {
        return SavedStateReader.m7378getBooleanArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final char[] decodeCharArray() {
        return SavedStateReader.m7382getCharArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final double[] decodeDoubleArray() {
        return SavedStateReader.m7392getDoubleArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final float[] decodeFloatArray() {
        return SavedStateReader.m7396getFloatArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final int[] decodeIntArray() {
        return SavedStateReader.m7400getIntArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final long[] decodeLongArray() {
        return SavedStateReader.m7410getLongArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    private final String[] decodeStringArray() {
        return SavedStateReader.m7440getStringArrayimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final setActiveRecording beginStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(this.key, "")) {
            return this;
        }
        return new SavedStateDecoder(SavedStateReader.m7425getSavedStateimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final boolean decodeNotNullMark() {
        return !SavedStateReader.m7447isNullimpl(SavedStateReader.m7368constructorimpl(this.savedState), this.key);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final <T> T decodeSerializableValue(isBitDepthMatched<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T t = (T) decodeFormatSpecificTypes(p0);
        return t == null ? (T) super.decodeSerializableValue(p0) : t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(isBitDepthMatched<? extends T> p0) {
        T t = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, p0);
        if (t != null) {
            return t;
        }
        createImageAnalysis descriptor = p0.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            return (T) decodeIntList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            return (T) decodeStringList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            return (T) decodeBooleanArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            return (T) decodeCharArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            return (T) decodeDoubleArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            return (T) decodeFloatArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            return (T) decodeIntArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            return (T) decodeLongArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) decodeStringArray();
        }
        return null;
    }
}
