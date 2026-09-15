package defpackage;

import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class TakePictureManagerExternalSyntheticLambda1 implements Executor {
    private final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    TakePictureManagerExternalSyntheticLambda1(Executor executor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(runnable));
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        private final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT < 26) {
                    sdkVersion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", "Executor");
                }
            }
        }
    }
}
