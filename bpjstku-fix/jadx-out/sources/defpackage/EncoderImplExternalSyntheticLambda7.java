package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bm\u00128\u0010\u000b\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0002\b\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0019\u0010\u001aRF\u0010\u001b\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0002\b\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"LEncoderImplExternalSyntheticLambda7;", ExifInterface.GPS_DIRECTION_TRUE, "R", "LEncoderImplExternalSyntheticLambda2;", "Lkotlin/Function3;", "LaddSignalEosTimeoutIfNeeded;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "LclampVideoBitrateIfNotSupported;", "p1", "Lkotlin/coroutines/CoroutineContext;", "p2", "", "p3", "Lkotlinx/coroutines/channels/BufferOverflow;", "p4", "<init>", "(Lkotlin/jvm/functions/Function3;LclampVideoBitrateIfNotSupported;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "LEncoderImplExternalSyntheticLambda3;", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplExternalSyntheticLambda7<T, R> extends EncoderImplExternalSyntheticLambda2<T, R> {
    private final Function3<addSignalEosTimeoutIfNeeded<? super R>, T, Continuation<? super Unit>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ EncoderImplExternalSyntheticLambda7(Function3 function3, clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, clampvideobitrateifnotsupported, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EncoderImplExternalSyntheticLambda7(Function3<? super addSignalEosTimeoutIfNeeded<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(clampvideobitrateifnotsupported, coroutineContext, i, bufferOverflow);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function3;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    protected final EncoderImplExternalSyntheticLambda3<R> b(CoroutineContext p0, int p1, BufferOverflow p2) {
        return new EncoderImplExternalSyntheticLambda7(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, p0, p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.EncoderImplExternalSyntheticLambda2
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(addSignalEosTimeoutIfNeeded<? super R> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ChannelFlowTransformLatest$flowCollect$3(this, addsignaleostimeoutifneeded, null), continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : Unit.INSTANCE;
    }
}
