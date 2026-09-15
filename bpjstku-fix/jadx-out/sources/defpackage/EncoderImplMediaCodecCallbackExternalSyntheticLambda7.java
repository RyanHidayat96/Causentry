package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderImplMediaCodecCallbackExternalSyntheticLambda7 implements CoroutineContext.Key<EncoderImplMediaCodecCallbackExternalSyntheticLambda8<?>> {
    private final ThreadLocal<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public EncoderImplMediaCodecCallbackExternalSyntheticLambda7(ThreadLocal<?> threadLocal) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda7) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((EncoderImplMediaCodecCallbackExternalSyntheticLambda7) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThreadLocalKey(threadLocal=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }
}
