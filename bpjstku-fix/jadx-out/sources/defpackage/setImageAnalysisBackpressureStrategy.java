package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017\u0082\u0001\u0005\u001f !\"#"}, d2 = {"LsetImageAnalysisBackpressureStrategy;", "LcreateImageAnalysis;", "p0", "<init>", "(LcreateImageAnalysis;)V", "", "", "TuitionPaymentFragmentbindingInflater1", "(I)Ljava/lang/String;", "(Ljava/lang/String;)I", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(I)Z", "", "", "b", "(I)Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)LcreateImageAnalysis;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LcreateImageAnalysis;", "LdeactivateRecording;", "()LdeactivateRecording;", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LunbindAllAndRecreate;", "LstopRecording;", "LisRecording;", "LsetEnabledUseCases;", "LCameraControllerExternalSyntheticLambda5;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setImageAnalysisBackpressureStrategy implements createImageAnalysis {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final createImageAnalysis b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return false;
    }

    private setImageAnalysisBackpressureStrategy(createImageAnalysis createimageanalysis) {
        this.b = createimageanalysis;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    }

    @Override // defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int p0) {
        return String.valueOf(p0);
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Integer intOrNull = StringsKt.toIntOrNull(p0);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append(" is not a valid list index");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
        if (p0 >= 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Illegal index ");
        sb.append(p0);
        sb.append(", ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int p0) {
        if (p0 < 0) {
            StringBuilder sb = new StringBuilder("Illegal index ");
            sb.append(p0);
            sb.append(", ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            sb.append(" expects only non-negative indices");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        if (p0 < 0) {
            StringBuilder sb = new StringBuilder("Illegal index ");
            sb.append(p0);
            sb.append(", ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            sb.append(" expects only non-negative indices");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return this.b;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setImageAnalysisBackpressureStrategy)) {
            return false;
        }
        setImageAnalysisBackpressureStrategy setimageanalysisbackpressurestrategy = (setImageAnalysisBackpressureStrategy) p0;
        return Intrinsics.areEqual(this.b, setimageanalysisbackpressurestrategy.b) && Intrinsics.areEqual(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setimageanalysisbackpressurestrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + TuitionPaymentFragmentspecialinlinedviewModeldefault1().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append('(');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return CollectionsKt.emptyList();
    }

    public /* synthetic */ setImageAnalysisBackpressureStrategy(createImageAnalysis createimageanalysis, DefaultConstructorMarker defaultConstructorMarker) {
        this(createimageanalysis);
    }
}
