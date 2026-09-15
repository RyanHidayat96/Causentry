package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class TakePictureRequestRetryControl<T> implements ExtraSupportedResolutionQuirk<T> {
    private static final Object TuitionPaymentFragmentbindingInflater1 = new Object();
    private volatile Object TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1;
    private volatile ExtraSupportedResolutionQuirk<T> b;

    public TakePictureRequestRetryControl(ExtraSupportedResolutionQuirk<T> extraSupportedResolutionQuirk) {
        this.b = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final T get() {
        T t;
        T t2 = (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = TuitionPaymentFragmentbindingInflater1;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (t == obj) {
                t = this.b.get();
                Object obj2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (obj2 != obj && obj2 != t) {
                    StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj2);
                    sb.append(" & ");
                    sb.append(t);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
                this.b = null;
            }
        }
        return t;
    }
}
