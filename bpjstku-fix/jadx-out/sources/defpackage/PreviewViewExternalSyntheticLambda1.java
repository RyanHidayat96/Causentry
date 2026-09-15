package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewViewExternalSyntheticLambda1 extends isOutputSizeEqual {
    private final stopListeningToDisplayChange TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreviewViewImplementationOnSurfaceNotInUseListener b;

    public PreviewViewExternalSyntheticLambda1(stopListeningToDisplayChange stoplisteningtodisplaychange, PreviewStreamStateObserver2 previewStreamStateObserver2) {
        Intrinsics.checkNotNullParameter(stoplisteningtodisplaychange, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stoplisteningtodisplaychange;
        this.b = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.setActiveRecording
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.b;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final int decodeInt() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strA = stoplisteningtodisplaychange.a();
        try {
            return UStringsKt.toUInt(strA);
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'UInt' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final long decodeLong() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strA = stoplisteningtodisplaychange.a();
        try {
            return UStringsKt.toULong(strA);
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'ULong' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final byte decodeByte() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strA = stoplisteningtodisplaychange.a();
        try {
            return UStringsKt.toUByte(strA);
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'UByte' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final short decodeShort() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strA = stoplisteningtodisplaychange.a();
        try {
            return UStringsKt.toUShort(strA);
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'UShort' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }
}
