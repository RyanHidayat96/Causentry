package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0094@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/ReceiveChannel;", "consume", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "markConsumed", "", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceImpl", "Lkotlinx/coroutines/CoroutineScope;", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "additionalToStringProps", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EncoderConfig<T> extends EncoderImplExternalSyntheticLambda3<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicIntegerFieldUpdater.newUpdater(EncoderConfig.class, "consumed$volatile");
    private final EncoderSurfaceInput<T> TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ int consumed$volatile;
    private final boolean d;

    public /* synthetic */ EncoderConfig(EncoderSurfaceInput encoderSurfaceInput, boolean z, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(encoderSurfaceInput, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EncoderConfig(EncoderSurfaceInput<? extends T> encoderSurfaceInput, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.TuitionPaymentFragmentbindingInflater1 = encoderSurfaceInput;
        this.d = z;
        this.consumed$volatile = 0;
    }

    private final void b() {
        if (this.d && TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new EncoderConfig(this.TuitionPaymentFragmentbindingInflater1, this.d, coroutineContext, i, bufferOverflow);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1() {
        return new EncoderConfig(this.TuitionPaymentFragmentbindingInflater1, this.d, null, 0, null, 28, null);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanotifyError11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new cancelInputBuffer(onencodepaused), this.TuitionPaymentFragmentbindingInflater1, this.d, continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final EncoderSurfaceInput<T> b(CoroutineScope coroutineScope) {
        b();
        if (this.TuitionPaymentFragmentbindingInflater1 == -3) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        return super.b(coroutineScope);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3, defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) throws Throwable {
        if (this.TuitionPaymentFragmentbindingInflater1 == -3) {
            b();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanotifyError11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addsignaleostimeoutifneeded, this.TuitionPaymentFragmentbindingInflater1, this.d, continuation);
            return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
        }
        Object objCollect = super.collect(addsignaleostimeoutifneeded, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        StringBuilder sb = new StringBuilder("channel=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        return sb.toString();
    }
}
