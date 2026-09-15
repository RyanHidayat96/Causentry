package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public class resolveAudioSourceFormat<T> extends isFHDProblematicDevice<T> implements Deferred<T> {
    public resolveAudioSourceFormat(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.Deferred
    public final T b() {
        return (T) cancelAll();
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation<? super T> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Continuation<Object>) continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
