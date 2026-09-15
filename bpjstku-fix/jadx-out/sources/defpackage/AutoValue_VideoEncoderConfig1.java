package defpackage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VideoEncoderConfig1 extends getInputTimebase {
    private final Continuation<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.getInputTimebase
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoValue_VideoEncoderConfig1(Continuation<? super Unit> continuation) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = continuation;
    }

    @Override // defpackage.getInputTimebase
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        Continuation<Unit> continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
    }
}
