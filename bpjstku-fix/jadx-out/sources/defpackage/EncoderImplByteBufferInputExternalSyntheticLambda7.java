package defpackage;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplByteBufferInputExternalSyntheticLambda7 {
    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        Object objM8024constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Result.m8031isSuccessimpl(objM8024constructorimpl);
    }

    public static final boolean b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
