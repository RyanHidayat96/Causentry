package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes7.dex */
public final class EncoderImpl11<T> extends onOutputBufferAvailable<T> {
    public EncoderImpl11(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public final boolean asInterface(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return g(th);
    }
}
