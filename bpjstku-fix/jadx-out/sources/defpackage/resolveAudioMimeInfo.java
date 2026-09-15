package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class resolveAudioMimeInfo {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String TuitionPaymentFragmentbindingInflater1(Continuation<?> continuation) {
        Object objM8024constructorimpl;
        if (continuation instanceof EncoderImplByteBufferInputExternalSyntheticLambda4) {
            return ((EncoderImplByteBufferInputExternalSyntheticLambda4) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(continuation);
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(continuation)));
            objM8024constructorimpl = Result.m8024constructorimpl(sb.toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8027exceptionOrNullimpl(objM8024constructorimpl) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(continuation.getClass().getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(continuation)));
            objM8024constructorimpl = sb2.toString();
        }
        return (String) objM8024constructorimpl;
    }

    public static final String TuitionPaymentFragmentbindingInflater1(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
