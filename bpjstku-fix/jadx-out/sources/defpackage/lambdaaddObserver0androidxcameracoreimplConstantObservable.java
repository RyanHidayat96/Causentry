package defpackage;

import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
abstract class lambdaaddObserver0androidxcameracoreimplConstantObservable<I, O, F, T> extends removeObserver.TuitionPaymentFragmentbindingInflater1<O> implements Runnable {
    private ListenableFuture<? extends I> TuitionPaymentFragmentbindingInflater1;
    private F TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t);

    abstract T b(F f, I i) throws Exception;

    static <I, O> ListenableFuture<O> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenableFuture<I> listenableFuture, ConstantObservableExternalSyntheticLambda0<? super I, ? extends O> constantObservableExternalSyntheticLambda0, Executor executor) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFuture, constantObservableExternalSyntheticLambda0);
        if (executor != DirectExecutor.INSTANCE) {
            executor = new DeferrableSurfaceExternalSyntheticLambda0.AnonymousClass5(executor, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        listenableFuture.addListener(tuitionPaymentFragmentspecialinlinedviewModeldefault3, executor);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static <I, O> ListenableFuture<O> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListenableFuture<I> listenableFuture, getCameraRegistration<? super I, ? extends O> getcameraregistration, Executor executor) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(listenableFuture, getcameraregistration);
        if (executor != DirectExecutor.INSTANCE) {
            executor = new DeferrableSurfaceExternalSyntheticLambda0.AnonymousClass5(executor, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        listenableFuture.addListener(tuitionPaymentFragmentspecialinlinedviewModeldefault2, executor);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    lambdaaddObserver0androidxcameracoreimplConstantObservable(ListenableFuture<? extends I> listenableFuture, F f) {
        this.TuitionPaymentFragmentbindingInflater1 = listenableFuture;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.TuitionPaymentFragmentbindingInflater1;
        F f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if ((isCancelled() | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objB = b(f, getCloseFuture.b(listenableFuture));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(objB);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    setException(th);
                } finally {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                }
            }
        } catch (Error e2) {
            setException(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        } catch (Exception e4) {
            setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.withValue
    public final void afterDone() {
        maybePropagateCancellationTo(this.TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.withValue
    public String pendingToString() {
        String string;
        ListenableFuture<? extends I> listenableFuture = this.TuitionPaymentFragmentbindingInflater1;
        F f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strPendingToString = super.pendingToString();
        if (listenableFuture == null) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(listenableFuture);
            sb.append("], ");
            string = sb.toString();
        }
        if (f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        }
        if (strPendingToString == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(strPendingToString);
        return sb3.toString();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<I, O> extends lambdaaddObserver0androidxcameracoreimplConstantObservable<I, O, ConstantObservableExternalSyntheticLambda0<? super I, ? extends O>, ListenableFuture<? extends O>> {
        @Override // defpackage.lambdaaddObserver0androidxcameracoreimplConstantObservable
        final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
            setFuture((ListenableFuture) obj);
        }

        @Override // defpackage.lambdaaddObserver0androidxcameracoreimplConstantObservable
        final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) throws Exception {
            ConstantObservableExternalSyntheticLambda0 constantObservableExternalSyntheticLambda0 = (ConstantObservableExternalSyntheticLambda0) obj;
            ListenableFuture<O> listenableFutureApply = constantObservableExternalSyntheticLambda0.apply(obj2);
            if (listenableFutureApply != null) {
                return listenableFutureApply;
            }
            throw new NullPointerException(CameraStateRegistryCameraRegistration.b("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", constantObservableExternalSyntheticLambda0));
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenableFuture<? extends I> listenableFuture, ConstantObservableExternalSyntheticLambda0<? super I, ? extends O> constantObservableExternalSyntheticLambda0) {
            super(listenableFuture, constantObservableExternalSyntheticLambda0);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<I, O> extends lambdaaddObserver0androidxcameracoreimplConstantObservable<I, O, getCameraRegistration<? super I, ? extends O>, O> {
        @Override // defpackage.lambdaaddObserver0androidxcameracoreimplConstantObservable
        final /* synthetic */ Object b(Object obj, Object obj2) throws Exception {
            return ((getCameraRegistration) obj).apply(obj2);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListenableFuture<? extends I> listenableFuture, getCameraRegistration<? super I, ? extends O> getcameraregistration) {
            super(listenableFuture, getcameraregistration);
        }

        @Override // defpackage.lambdaaddObserver0androidxcameracoreimplConstantObservable
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(O o) {
            set(o);
        }
    }
}
