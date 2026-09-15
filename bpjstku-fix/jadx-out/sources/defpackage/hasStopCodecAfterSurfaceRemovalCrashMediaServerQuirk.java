package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R;\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"LhasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk;", ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda3;", "Lkotlin/Function2;", "LonEncodePaused;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LonEncodePaused;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk<T> extends EncoderImplExternalSyntheticLambda3<T> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function2<onEncodePaused<? super T>, Continuation<? super Unit>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk(Function2 function2, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk(Function2<? super onEncodePaused<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext p0, int p1, BufferOverflow p2) {
        return new hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p0, p1, p2);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public String toString() {
        StringBuilder sb = new StringBuilder("block[");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("] -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
        Object objInvoke = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(onencodepaused, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }
}
