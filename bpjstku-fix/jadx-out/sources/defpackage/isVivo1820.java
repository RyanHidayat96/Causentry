package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
public final class isVivo1820 extends CountDownLatch implements logToString<Throwable>, formatInterval {
    public Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.logToString
    public final /* synthetic */ void accept(Throwable th) throws Exception {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
        countDown();
    }

    public isVivo1820() {
        super(1);
    }

    @Override // defpackage.formatInterval
    public final void run() {
        countDown();
    }
}
