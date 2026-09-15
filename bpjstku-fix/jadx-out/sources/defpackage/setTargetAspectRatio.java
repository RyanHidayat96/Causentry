package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetAspectRatio {
    private static final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Executor() { // from class: setTargetAspectRatio.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(runnable);
        }
    };
    private static final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Executor() { // from class: setTargetAspectRatio.3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public static Executor TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static Executor b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
