package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0094@¢\u0006\u0004\b\u0010\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LEncoderImplExternalSyntheticLambda2;", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda3;", "LclampVideoBitrateIfNotSupported;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(LclampVideoBitrateIfNotSupported;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "LaddSignalEosTimeoutIfNeeded;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LonEncodePaused;", "(LonEncodePaused;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LclampVideoBitrateIfNotSupported;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EncoderImplExternalSyntheticLambda2<S, T> extends EncoderImplExternalSyntheticLambda3<T> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final clampVideoBitrateIfNotSupported<S> b;

    public abstract Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderImplExternalSyntheticLambda2(clampVideoBitrateIfNotSupported<? extends S> clampvideobitrateifnotsupported, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.b = clampvideobitrateifnotsupported;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3, defpackage.clampVideoBitrateIfNotSupported
    public Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.TuitionPaymentFragmentbindingInflater1 == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContext = this.b;
            if (!((Boolean) coroutineContext.fold(Boolean.FALSE, new StretchedVideoResolutionQuirk())).booleanValue()) {
                coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.plus(coroutineContext);
            } else {
                coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, coroutineContext, false);
            }
            if (Intrinsics.areEqual(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, context)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(addsignaleostimeoutifneeded, continuation);
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault2 : Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ContinuationInterceptor.INSTANCE), context.get(ContinuationInterceptor.INSTANCE))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(addsignaleostimeoutifneeded instanceof cancelInputBuffer) && !(addsignaleostimeoutifneeded instanceof createPersistentInputSurface)) {
                    addsignaleostimeoutifneeded = new lambdaacquireBuffer4androidxcameravideointernalencoderEncoderImplByteBufferInput(addsignaleostimeoutifneeded, context2);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda17.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, addsignaleostimeoutifneeded, EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation);
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(addsignaleostimeoutifneeded, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(new cancelInputBuffer(onencodepaused), continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault2 : Unit.INSTANCE;
    }
}
