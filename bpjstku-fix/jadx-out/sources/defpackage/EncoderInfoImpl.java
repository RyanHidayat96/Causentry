package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
final class EncoderInfoImpl extends isFHDProblematicDevice<Unit> {
    private final VideoEncoderSessionVideoEncoderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.isFHDProblematicDevice
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Unit unit) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
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

    public EncoderInfoImpl(CoroutineContext coroutineContext, VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
        super(coroutineContext, false, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoEncoderSessionVideoEncoderState;
    }

    @Override // defpackage.isFHDProblematicDevice
    public final void b(Throwable th, boolean z) {
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
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
