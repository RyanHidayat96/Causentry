package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class isNokia1<T> implements deriveMediaType<T> {
    private BufferProviderState b;

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        BufferProviderState bufferProviderState2 = this.b;
        Class<?> cls = getClass();
        share.b(bufferProviderState, "next is null");
        if (bufferProviderState2 == null) {
            this.b = bufferProviderState;
            return;
        }
        bufferProviderState.dispose();
        if (bufferProviderState2 != DisposableHelper.DISPOSED) {
            isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls);
        }
    }
}
