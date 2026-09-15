package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplByteBufferInputExternalSyntheticLambda0 implements CoroutineScope {
    private final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public EncoderImplByteBufferInputExternalSyntheticLambda0(CoroutineContext coroutineContext) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(getCoroutineContext());
        sb.append(')');
        return sb.toString();
    }
}
