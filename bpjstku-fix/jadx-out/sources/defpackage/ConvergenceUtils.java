package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConvergenceUtils<V> extends printGlobalDebugCounts<V> implements ListenableFuture<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.printGlobalDebugCounts
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListenableFuture<? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    protected ConvergenceUtils() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1().addListener(runnable, executor);
    }

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3<V> extends ConvergenceUtils<V> {
        private final ListenableFuture<V> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        protected TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenableFuture<V> listenableFuture) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = listenableFuture;
        }

        @Override // defpackage.ConvergenceUtils
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
        protected final ListenableFuture<V> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.ConvergenceUtils, defpackage.printGlobalDebugCounts, defpackage.addCameraCaptureCallback
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.ConvergenceUtils, defpackage.printGlobalDebugCounts
        protected final /* synthetic */ Future TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
