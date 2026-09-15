package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoTimebaseConverter1 implements createImageAnalysis {
    public final KClass<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String b;

    public VideoTimebaseConverter1(createImageAnalysis createimageanalysis, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kClass;
        StringBuilder sb = new StringBuilder();
        sb.append(createimageanalysis.getB());
        sb.append(Typography.less);
        sb.append(kClass.getSimpleName());
        sb.append(Typography.greater);
        this.b = sb.toString();
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        VideoTimebaseConverter1 videoTimebaseConverter1 = obj instanceof VideoTimebaseConverter1 ? (VideoTimebaseConverter1) obj : null;
        return videoTimebaseConverter1 != null && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, videoTimebaseConverter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(videoTimebaseConverter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextDescriptor(kClass: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", original: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i);
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(str);
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(i);
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
    }

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d();
    }
}
