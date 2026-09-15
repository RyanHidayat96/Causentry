package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
final class InputBufferImplExternalSyntheticLambda0<T> extends isFHDProblematicDevice<T> {
    private final getOutputResults<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public InputBufferImplExternalSyntheticLambda0(CoroutineContext coroutineContext, getOutputResults<T> getoutputresults) {
        super(coroutineContext, false, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getoutputresults;
    }

    @Override // defpackage.isFHDProblematicDevice
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        try {
            if (t == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t);
            }
        } catch (Throwable th) {
            CoroutineContext coroutineContext = get$context();
            if (th instanceof CancellationException) {
                return;
            }
            try {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, th);
            }
        }
    }

    @Override // defpackage.isFHDProblematicDevice
    public final void b(Throwable th, boolean z) {
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        CoroutineContext coroutineContext = get$context();
        if (th instanceof CancellationException) {
            return;
        }
        try {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        } catch (Throwable th3) {
            ExceptionsKt.addSuppressed(th, th3);
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, th);
        }
    }
}
