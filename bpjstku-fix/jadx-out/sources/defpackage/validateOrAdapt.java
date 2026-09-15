package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class validateOrAdapt implements BufferProviderState {
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicBoolean();

    protected abstract void TuitionPaymentFragmentbindingInflater1();

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                TuitionPaymentFragmentbindingInflater1();
            } else {
                dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Runnable() { // from class: validateOrAdapt.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        validateOrAdapt.this.TuitionPaymentFragmentbindingInflater1();
                    }
                });
            }
        }
    }
}
