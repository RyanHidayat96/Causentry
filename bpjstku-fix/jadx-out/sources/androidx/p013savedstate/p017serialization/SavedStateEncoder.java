package androidx.p013savedstate.p017serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.QualityAddedEncoderProfilesProvider;
import defpackage.createImageAnalysis;
import defpackage.isCameraAttached;
import defpackage.isUseCaseEnabled;
import defpackage.restartCameraIfAnalyzerResolutionChanged;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0/H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020\tH\u0017¢\u0006\u0004\bI\u0010JJ+\u0010L\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\n\u0010K\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\bL\u0010MJ+\u0010P\u001a\u00020\u0010\"\u0004\b\u0000\u0010N2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\bP\u0010QJ+\u0010R\u001a\u00020\u000b\"\u0004\b\u0000\u0010N2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SR\u001e\u0010T\u001a\u00060\u0002j\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010Z\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020^8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b"}, d2 = {"Landroidx/savedstate/serialization/SavedStateEncoder;", "LrestartCameraIfAnalyzerResolutionChanged;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p1", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "LcreateImageAnalysis;", "", "", "shouldEncodeElementDefault", "(LcreateImageAnalysis;I)Z", "encodeElement", "", "", "checkDiscriminatorCollisions", "(Landroid/os/Bundle;Ljava/lang/String;)V", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(LcreateImageAnalysis;I)V", "encodeNull", "()V", "", "encodeIntList", "(Ljava/util/List;)V", "encodeStringList", "", "encodeBooleanArray", "([Z)V", "", "encodeCharArray", "([C)V", "", "encodeDoubleArray", "([D)V", "", "encodeFloatArray", "([F)V", "", "encodeIntArray", "([I)V", "", "encodeLongArray", "([J)V", "", "encodeStringArray", "([Ljava/lang/String;)V", "LisUseCaseEnabled;", "beginStructure", "(LcreateImageAnalysis;)LisUseCaseEnabled;", "p2", "putClassDiscriminatorIfRequired", "(Landroidx/savedstate/serialization/SavedStateConfiguration;LcreateImageAnalysis;Landroid/os/Bundle;)V", ExifInterface.GPS_DIRECTION_TRUE, "LQualityAddedEncoderProfilesProvider;", "encodeSerializableValue", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)V", "encodeFormatSpecificTypes", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)Z", "savedState", "Landroid/os/Bundle;", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "key", "Ljava/lang/String;", "getKey$savedstate_release", "()Ljava/lang/String;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoder extends restartCameraIfAnalyzerResolutionChanged {
    private final SavedStateConfiguration configuration;
    private String key;
    private final Bundle savedState;
    private final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;

    /* JADX INFO: renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    public SavedStateEncoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
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

    @Override // defpackage.startListeningToRotationEvents
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.serializersModule;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.isUseCaseEnabled
    public final boolean shouldEncodeElementDefault(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.configuration.getEncodeDefaults();
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged
    public final boolean encodeElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        String strTuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentbindingInflater1(p1);
        this.key = strTuitionPaymentFragmentbindingInflater1;
        checkDiscriminatorCollisions(this.savedState, strTuitionPaymentFragmentbindingInflater1);
        return true;
    }

    private final void checkDiscriminatorCollisions(Bundle p0, String p1) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean zM7369containsimpl = SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(p0), "type");
            boolean zAreEqual = Intrinsics.areEqual(p1, "type");
            if (zM7369containsimpl && zAreEqual) {
                String strM7439getStringimpl = SavedStateReader.m7439getStringimpl(SavedStateReader.m7368constructorimpl(p0), "type");
                StringBuilder sb = new StringBuilder("SavedStateEncoder for ");
                sb.append(strM7439getStringimpl);
                sb.append(" has property '");
                sb.append(p1);
                sb.append("' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeBoolean(boolean p0) {
        SavedStateWriter.m7460putBooleanimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeByte(byte p0) {
        SavedStateWriter.m7471putIntimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeShort(short p0) {
        SavedStateWriter.m7471putIntimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeInt(int p0) {
        SavedStateWriter.m7471putIntimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeLong(long p0) {
        SavedStateWriter.m7475putLongimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeFloat(float p0) {
        SavedStateWriter.m7469putFloatimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeDouble(double p0) {
        SavedStateWriter.m7467putDoubleimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeChar(char p0) {
        SavedStateWriter.m7462putCharimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeString(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        SavedStateWriter.m7487putStringimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeEnum(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        SavedStateWriter.m7471putIntimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p1);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeNull() {
        SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key);
    }

    private final void encodeIntList(List<Integer> p0) {
        SavedStateWriter.m7473putIntListimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeStringList(List<String> p0) {
        SavedStateWriter.m7489putStringListimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeBooleanArray(boolean[] p0) {
        SavedStateWriter.m7461putBooleanArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeCharArray(char[] p0) {
        SavedStateWriter.m7463putCharArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeDoubleArray(double[] p0) {
        SavedStateWriter.m7468putDoubleArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeFloatArray(float[] p0) {
        SavedStateWriter.m7470putFloatArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeIntArray(int[] p0) {
        SavedStateWriter.m7472putIntArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeLongArray(long[] p0) {
        SavedStateWriter.m7476putLongArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    private final void encodeStringArray(String[] p0) {
        SavedStateWriter.m7488putStringArrayimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final isUseCaseEnabled beginStructure(createImageAnalysis p0) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, p0, this.savedState);
            return this;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        SavedStateWriter.m7481putSavedStateimpl(SavedStateWriter.m7454constructorimpl(this.savedState), this.key, bundleBundleOf);
        putClassDiscriminatorIfRequired(this.configuration, p0, bundleBundleOf);
        return new SavedStateEncoder(bundleBundleOf, this.configuration);
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration p0, createImageAnalysis p1, Bundle p2) {
        if (p0.getClassDiscriminatorMode() != 1 || SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(p2), "type")) {
            return;
        }
        if (Intrinsics.areEqual(p1.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE) || Intrinsics.areEqual(p1.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
            SavedStateWriter.m7487putStringimpl(SavedStateWriter.m7454constructorimpl(p2), "type", p1.getINotificationSideChannel());
        }
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final <T> void encodeSerializableValue(QualityAddedEncoderProfilesProvider<? super T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (encodeFormatSpecificTypes(p0, p1)) {
            return;
        }
        super.encodeSerializableValue(p0, p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean encodeFormatSpecificTypes(QualityAddedEncoderProfilesProvider<? super T> p0, T p1) {
        if (SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, p0, p1)) {
            return true;
        }
        createImageAnalysis descriptor = p0.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeIntList((List) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeStringList((List) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeBooleanArray((boolean[]) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeCharArray((char[]) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeDoubleArray((double[]) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeFloatArray((float[]) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeIntArray((int[]) p1);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            Intrinsics.checkNotNull(p1, "");
            encodeLongArray((long[]) p1);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return false;
        }
        Intrinsics.checkNotNull(p1, "");
        encodeStringArray((String[]) p1);
        return true;
    }
}
