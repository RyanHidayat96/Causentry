package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CameraController2ExternalSyntheticLambda0 implements createImageAnalysis, createUseCaseGroup {
    private final String TuitionPaymentFragmentbindingInflater1;
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return true;
    }

    public CameraController2ExternalSyntheticLambda0(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis;
        StringBuilder sb = new StringBuilder();
        sb.append(createimageanalysis.getB());
        sb.append('?');
        this.TuitionPaymentFragmentbindingInflater1 = sb.toString();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(createimageanalysis);
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final String getB() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.createUseCaseGroup
    public final Set<String> a() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraController2ExternalSyntheticLambda0) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((CameraController2ExternalSyntheticLambda0) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append('?');
        return sb.toString();
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(i);
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(str);
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(i);
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
    }

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
    }
}
