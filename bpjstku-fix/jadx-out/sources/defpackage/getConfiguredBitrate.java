package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public class getConfiguredBitrate<E> extends isFHDProblematicDevice<Unit> implements Encoder<E> {
    private final Encoder<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected final Encoder<E> g() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public getConfiguredBitrate(CoroutineContext coroutineContext, Encoder<E> encoder) {
        super(coroutineContext, true, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = encoder;
    }

    @Override // defpackage.AudioEncoderConfigBuilder, defpackage.VideoMimeInfoBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CancellationException cancellationException) {
        if (d()) {
            return;
        }
        if (cancellationException == null) {
            getConfiguredBitrate<E> getconfiguredbitrate = this;
            cancellationException = new JobCancellationException(getconfiguredbitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, getconfiguredbitrate);
        }
        CancellationException cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((Throwable) cancellationException, (String) null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        CancellationException cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, (String) null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) cancellationExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final boolean a_(Throwable th) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a_(th);
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final void b(Function1<? super Throwable, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(function1);
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.EncoderSurfaceInput
    public final getEncoderInfo<E> a() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a();
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Continuation<? super E> continuation) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(continuation);
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object TuitionPaymentFragmentbindingInflater1(Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends E>> continuation) {
        Object objTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, Continuation<? super Unit> continuation) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, continuation);
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object asBinder() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder();
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
    }
}
