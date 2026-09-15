package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
final class EncoderImplExternalSyntheticLambda12 extends EncoderImplExternalSyntheticLambda15<EncoderImplExternalSyntheticLambda1<?>> {
    private final AtomicReference<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicReference<>(null);

    @Override // defpackage.EncoderImplExternalSyntheticLambda15
    public final /* synthetic */ Continuation[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncoderImplExternalSyntheticLambda1<?> encoderImplExternalSyntheticLambda1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(null);
        return EncoderImplExternalSyntheticLambda16.b;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda15
    public final /* synthetic */ boolean b(EncoderImplExternalSyntheticLambda1<?> encoderImplExternalSyntheticLambda1) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get() != null) {
            return false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return true;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        AtomicReference<Object> atomicReference = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        while (true) {
            Object obj = atomicReference.get();
            if (obj == null || obj == EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            if (obj == EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, obj, EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1)) {
                    return;
                }
            } else if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, obj, EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                Result.Companion companion = Result.INSTANCE;
                ((CancellableContinuationImpl) obj).resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Object andSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndSet(EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNull(andSet);
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return andSet == EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1;
    }

    public final Object TuitionPaymentFragmentbindingInflater1(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancellableContinuationImpl2)) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
