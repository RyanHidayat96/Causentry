package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getSurfaceEdge implements checkReadyToRelease {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = true;
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final void b(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.checkReadyToRelease
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    @Override // defpackage.checkReadyToRelease
    public lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor i_() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
