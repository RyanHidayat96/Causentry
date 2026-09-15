package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
final class setPresentationTimeUs<T> extends isFHDProblematicDevice<T> {
    private final BackupHdrProfileEncoderProfilesProvider<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setPresentationTimeUs(CoroutineContext coroutineContext, BackupHdrProfileEncoderProfilesProvider<T> backupHdrProfileEncoderProfilesProvider) {
        super(coroutineContext, false, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = backupHdrProfileEncoderProfilesProvider;
    }

    @Override // defpackage.isFHDProblematicDevice
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t);
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
