package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultSurfaceProcessorExternalSyntheticLambda13 implements DefaultSurfaceProcessorExternalSyntheticLambda1 {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor b;

    public void TuitionPaymentFragmentbindingInflater1() {
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
    public boolean isDone() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public boolean b() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return false;
            }
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return false;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.b = null;
            TuitionPaymentFragmentbindingInflater1();
            return true;
        }
    }

    @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return false;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor = this.b;
            this.b = null;
            if (lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
                lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentbindingInflater1();
            return true;
        }
    }

    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.b = lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor;
            return true;
        }
    }

    @Override // defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
    public boolean isCancelled() {
        boolean z;
        lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor;
        synchronized (this) {
            z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || ((lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor = this.b) != null && lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor.isCancelled());
        }
        return z;
    }

    static {
        new DefaultSurfaceProcessorExternalSyntheticLambda13() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda13.4
            {
                b();
            }
        };
        new DefaultSurfaceProcessorExternalSyntheticLambda13() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda13.2
            {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        };
    }

    public lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.TuitionPaymentFragmentbindingInflater1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        return this;
    }
}
