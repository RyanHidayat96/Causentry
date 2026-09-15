package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
public class CameraControlInternal2 implements Closeable {
    public final int TuitionPaymentFragmentbindingInflater1;
    public final CameraFactoryProvider TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            if (i == 0) {
                throw new NullPointerException();
            }
        }
    }
}
