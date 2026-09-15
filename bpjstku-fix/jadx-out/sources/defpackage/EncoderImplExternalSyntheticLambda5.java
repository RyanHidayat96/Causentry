package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"LEncoderImplExternalSyntheticLambda5;", ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda2;", "LclampVideoBitrateIfNotSupported;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(LclampVideoBitrateIfNotSupported;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "LEncoderImplExternalSyntheticLambda3;", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "TuitionPaymentFragmentbindingInflater1", "()LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplExternalSyntheticLambda5<T> extends EncoderImplExternalSyntheticLambda2<T, T> {
    public /* synthetic */ EncoderImplExternalSyntheticLambda5(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(clampvideobitrateifnotsupported, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public EncoderImplExternalSyntheticLambda5(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(clampvideobitrateifnotsupported, coroutineContext, i, bufferOverflow);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    protected final EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext p0, int p1, BufferOverflow p2) {
        return new EncoderImplExternalSyntheticLambda5(this.b, p0, p1, p2);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1() {
        return (clampVideoBitrateIfNotSupported<T>) this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.EncoderImplExternalSyntheticLambda2
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        Object objCollect = this.b.collect((addSignalEosTimeoutIfNeeded<? super S>) addsignaleostimeoutifneeded, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
