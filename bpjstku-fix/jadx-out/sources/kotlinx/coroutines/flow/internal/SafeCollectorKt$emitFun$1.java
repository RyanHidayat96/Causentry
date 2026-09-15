package kotlinx.coroutines.flow.internal;

import defpackage.addSignalEosTimeoutIfNeeded;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Function3<addSignalEosTimeoutIfNeeded<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {
    public static final SafeCollectorKt$emitFun$1 TuitionPaymentFragmentbindingInflater1 = new SafeCollectorKt$emitFun$1();

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final Object invoke(addSignalEosTimeoutIfNeeded<Object> addsignaleostimeoutifneeded, Object obj, Continuation<? super Unit> continuation) {
        return addsignaleostimeoutifneeded.emit(obj, continuation);
    }

    SafeCollectorKt$emitFun$1() {
        super(3, addSignalEosTimeoutIfNeeded.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
