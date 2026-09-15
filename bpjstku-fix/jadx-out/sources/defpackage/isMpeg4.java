package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
final class isMpeg4 implements isAvc {
    private final Future<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public isMpeg4(Future<?> future) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = future;
    }

    @Override // defpackage.isAvc
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancel(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelFutureOnCancel[");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(']');
        return sb.toString();
    }
}
