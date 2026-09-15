package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class isProblematicMimeType<T> implements deriveMediaType<T>, BufferProviderState {
    private AtomicReference<BufferProviderState> b = new AtomicReference<>();

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        AtomicReference<BufferProviderState> atomicReference = this.b;
        Class<?> cls = getClass();
        share.b(bufferProviderState, "next is null");
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, bufferProviderState)) {
            return;
        }
        bufferProviderState.dispose();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls);
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.b.get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
    }
}
