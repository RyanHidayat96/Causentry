package kotlinx.coroutines;

import defpackage.getInputTimebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
        ((getInputTimebase) this.receiver).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, getInputTimebase.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }
}
