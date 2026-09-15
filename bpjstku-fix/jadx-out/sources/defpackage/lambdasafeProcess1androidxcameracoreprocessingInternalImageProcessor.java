package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lambdasafeProcess1androidxcameracoreprocessingInternalImageProcessor<T, F> extends DefaultSurfaceProcessorExternalSyntheticLambda5<T> implements DefaultSurfaceProcessorExternalSyntheticLambda14<F> {
    protected abstract void TuitionPaymentFragmentbindingInflater1(F f) throws Exception;

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
    public final void TuitionPaymentFragmentbindingInflater1(Exception exc, F f) {
        if (isCancelled()) {
            return;
        }
        if (exc != null) {
            b(exc);
            return;
        }
        try {
            TuitionPaymentFragmentbindingInflater1(f);
        } catch (Exception e2) {
            b(e2);
        }
    }

    protected void b(Exception exc) {
        b(exc, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
    }
}
