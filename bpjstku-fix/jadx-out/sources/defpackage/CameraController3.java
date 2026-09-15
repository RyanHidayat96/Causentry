package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraController3 implements createImageAnalysis {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final checkAudioPermissionGranted b;

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return 0;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return false;
    }

    public CameraController3(String str, checkAudioPermissionGranted checkaudiopermissiongranted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkaudiopermissiongranted, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = checkaudiopermissiongranted;
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final String getB() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimitiveDescriptor(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraController3)) {
            return false;
        }
        CameraController3 cameraController3 = (CameraController3) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cameraController3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, cameraController3.b);
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final /* synthetic */ deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return this.b;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }
}
