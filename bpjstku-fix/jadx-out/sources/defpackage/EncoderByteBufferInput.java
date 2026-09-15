package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class EncoderByteBufferInput {
    public static final void b(EncoderSurfaceInput<?> encoderSurfaceInput, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        encoderSurfaceInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
    }
}
