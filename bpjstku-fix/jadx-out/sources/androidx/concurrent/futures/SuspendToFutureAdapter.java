package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "p0", "", "p1", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "p2", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;", "GlobalListenableFutureScope", "Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "GlobalListenableFutureAwaitContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "DeferredFuture"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendToFutureAdapter {
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new CoroutineScope() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final CoroutineContext coroutineContext = Dispatchers.TuitionPaymentFragmentbindingInflater1();

        @Override // kotlinx.coroutines.CoroutineScope
        public final CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }
    };
    private static final CoroutineDispatcher GlobalListenableFutureAwaitContext = Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return suspendToFutureAdapter.launchFuture(coroutineContext, z, function2);
    }

    public final <T> ListenableFuture<T> launchFuture(CoroutineContext p0, boolean p1, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> p2) {
        Deferred deferredTuitionPaymentFragmentspecialinlinedviewModeldefault1 = BuildersKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(GlobalListenableFutureScope, p0, p1 ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT, p2);
        DeferredFuture deferredFuture = new DeferredFuture(deferredTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(new SuspendToFutureAdapter$launchFuture$1$1(deferredTuitionPaymentFragmentspecialinlinedviewModeldefault1), deferredFuture);
        Result.Companion companion = Result.INSTANCE;
        continuationCreateCoroutine.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        return deferredFuture;
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006*\u00028\u00008\u00000\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/Deferred;", "p0", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/Executor;", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "Lkotlin/Result;", "resumeWith", "(Ljava/lang/Object;)V", "resultDeferred", "Lkotlinx/coroutines/Deferred;", "Landroidx/concurrent/futures/ResolvableFuture;", "delegateFuture", "Landroidx/concurrent/futures/ResolvableFuture;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DeferredFuture<T> implements ListenableFuture<T>, Continuation<T> {
        private final ResolvableFuture<T> delegateFuture = ResolvableFuture.create();
        private final Deferred<T> resultDeferred;

        /* JADX WARN: Multi-variable type inference failed */
        public DeferredFuture(Deferred<? extends T> deferred) {
            this.resultDeferred = deferred;
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean p0) {
            boolean zCancel = this.delegateFuture.cancel(p0);
            if (zCancel) {
                this.resultDeferred.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.delegateFuture.get();
        }

        @Override // java.util.concurrent.Future
        public final T get(long p0, TimeUnit p1) {
            return this.delegateFuture.get(p0, p1);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable p0, Executor p1) {
            this.delegateFuture.addListener(p0, p1);
        }

        @Override // kotlin.coroutines.Continuation
        public final CoroutineContext getContext() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object p0) {
            Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(p0);
            if (thM8027exceptionOrNullimpl == null) {
                this.delegateFuture.set(p0);
            } else if (thM8027exceptionOrNullimpl instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(thM8027exceptionOrNullimpl);
            }
        }
    }
}
