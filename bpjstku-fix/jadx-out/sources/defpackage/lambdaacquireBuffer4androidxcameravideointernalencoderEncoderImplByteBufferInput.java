package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaacquireBuffer4androidxcameravideointernalencoderEncoderImplByteBufferInput<T> implements addSignalEosTimeoutIfNeeded<T> {
    private final Function2<T, Continuation<? super Unit>, Object> TuitionPaymentFragmentbindingInflater1;
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdaacquireBuffer4androidxcameravideointernalencoderEncoderImplByteBufferInput(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, CoroutineContext coroutineContext) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = coroutineContext;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineContext);
        this.TuitionPaymentFragmentbindingInflater1 = new UndispatchedContextCollector$emitRef$1(addsignaleostimeoutifneeded, null);
    }

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda17.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, t, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
    }
}
