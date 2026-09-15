package defpackage;

import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public class CaptureBundles<T> implements Resource<T> {
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public CaptureBundles(T t) {
        if (t != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return (Class<T>) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final T TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
