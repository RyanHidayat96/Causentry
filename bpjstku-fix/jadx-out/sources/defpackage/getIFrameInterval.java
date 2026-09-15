package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
final class getIFrameInterval<T> extends getInputTimebase {
    private final CancellableContinuationImpl<T> b;

    @Override // defpackage.getInputTimebase
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getIFrameInterval(CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.b = cancellableContinuationImpl;
    }

    @Override // defpackage.getInputTimebase
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        Object interfaceDescriptor = TuitionPaymentFragmentbindingInflater1().getInterfaceDescriptor();
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (interfaceDescriptor instanceof isVivoY91i) {
            CancellableContinuationImpl<T> cancellableContinuationImpl = this.b;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(((isVivoY91i) interfaceDescriptor).TuitionPaymentFragmentbindingInflater1)));
        } else {
            CancellableContinuationImpl<T> cancellableContinuationImpl2 = this.b;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(interfaceDescriptor)));
        }
    }
}
