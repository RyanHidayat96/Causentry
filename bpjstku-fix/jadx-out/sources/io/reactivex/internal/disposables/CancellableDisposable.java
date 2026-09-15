package io.reactivex.internal.disposables;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.readableUs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class CancellableDisposable extends AtomicReference<readableUs> implements BufferProviderState {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(readableUs readableus) {
        super(readableus);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        readableUs andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } catch (Exception e2) {
            dumpMediaCodecListForFormat.b(e2);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }
}
