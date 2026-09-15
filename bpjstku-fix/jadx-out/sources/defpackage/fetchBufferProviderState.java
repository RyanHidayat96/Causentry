package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fetchBufferProviderState<T> extends isSettingsSupported<T> {
    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
            this.b.dispose();
            countDown();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentbindingInflater1 = th;
        }
        countDown();
    }
}
