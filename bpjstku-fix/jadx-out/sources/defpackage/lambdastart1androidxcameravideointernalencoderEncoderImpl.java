package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class lambdastart1androidxcameravideointernalencoderEncoderImpl<T> extends access102<T> {
    private final Function2<addSignalEosTimeoutIfNeeded<? super T>, Continuation<? super Unit>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdastart1androidxcameravideointernalencoderEncoderImpl(Function2<? super addSignalEosTimeoutIfNeeded<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
    }

    @Override // defpackage.access102
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        Object objInvoke = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(addsignaleostimeoutifneeded, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }
}
