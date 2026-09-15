package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderImplMediaCodecCallbackExternalSyntheticLambda8<T> implements AutoValue_VideoEncoderDataSpace<T> {
    private final ThreadLocal<T> TuitionPaymentFragmentbindingInflater1;
    private final CoroutineContext.Key<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public EncoderImplMediaCodecCallbackExternalSyntheticLambda8(T t, ThreadLocal<T> threadLocal) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
        this.TuitionPaymentFragmentbindingInflater1 = threadLocal;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda7(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.AutoValue_VideoEncoderDataSpace
    public final T updateThreadContext(CoroutineContext coroutineContext) {
        T t = this.TuitionPaymentFragmentbindingInflater1.get();
        this.TuitionPaymentFragmentbindingInflater1.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return t;
    }

    @Override // defpackage.AutoValue_VideoEncoderDataSpace
    public final void restoreThreadContext(CoroutineContext coroutineContext, T t) {
        this.TuitionPaymentFragmentbindingInflater1.set(t);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return Intrinsics.areEqual(getKey(), key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        if (!Intrinsics.areEqual(getKey(), key)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThreadLocal(value=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", threadLocal = ");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
