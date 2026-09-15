package kotlinx.coroutines;

import defpackage.VideoMimeInfoBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlinx/coroutines/a", "kotlinx/coroutines/b"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class BuildersKt {
    public static final <T> Object TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return b.TuitionPaymentFragmentbindingInflater1(coroutineContext, function2, continuation);
    }

    public static final <T> Deferred<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final VideoMimeInfoBuilder b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return b.b(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> T runBlocking(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) a.runBlocking(coroutineContext, function2);
    }
}
