package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class createAudioRecordBuilder<T> extends deriveCodec<T> {
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public createAudioRecordBuilder(T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        getdefaultvideoprofile.onSubscribe(EmptyDisposable.INSTANCE);
        getdefaultvideoprofile.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
