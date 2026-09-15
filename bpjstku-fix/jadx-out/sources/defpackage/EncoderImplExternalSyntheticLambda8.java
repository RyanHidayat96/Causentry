package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u000e\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"LEncoderImplExternalSyntheticLambda8;", ExifInterface.GPS_DIRECTION_TRUE, "LEncoderImplExternalSyntheticLambda3;", "", "LclampVideoBitrateIfNotSupported;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "Lkotlinx/coroutines/CoroutineScope;", "LEncoderSurfaceInput;", "(Lkotlinx/coroutines/CoroutineScope;)LEncoderSurfaceInput;", "LonEncodePaused;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LonEncodePaused;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Iterable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplExternalSyntheticLambda8<T> extends EncoderImplExternalSyntheticLambda3<T> {
    private final Iterable<clampVideoBitrateIfNotSupported<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ EncoderImplExternalSyntheticLambda8(Iterable iterable, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EncoderImplExternalSyntheticLambda8(Iterable<? extends clampVideoBitrateIfNotSupported<? extends T>> iterable, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iterable;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    protected final EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext p0, int p1, BufferOverflow p2) {
        return new EncoderImplExternalSyntheticLambda8(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p0, p1, p2);
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final EncoderSurfaceInput<T> b(CoroutineScope p0) {
        return setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, this.b, this.TuitionPaymentFragmentbindingInflater1, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, new ChannelFlow$collectToFun$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.EncoderImplExternalSyntheticLambda3
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
        cancelInputBuffer cancelinputbuffer = new cancelInputBuffer(onencodepaused);
        Iterator<clampVideoBitrateIfNotSupported<T>> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        while (it.hasNext()) {
            b.TuitionPaymentFragmentbindingInflater1(onencodepaused, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(it.next(), cancelinputbuffer, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
