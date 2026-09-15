package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\n2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\b\u0010\u0011\u001a\u0004\u0018\u00010\"H\u0014J\r\u0010#\u001a\u00020\u000eH\u0010¢\u0006\u0002\b$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/Function1;", "", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendImpl", "isSendOp", "trySendImpl-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendDropLatest", "trySendDropLatest-Mj0NB7M", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EncoderEncoderInput<E> extends EncodeExceptionErrorType<E> {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final BufferOverflow asBinder;

    public /* synthetic */ EncoderEncoderInput(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : function1);
    }

    public EncoderEncoderInput(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i, function1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.asBinder = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
            sb.append(Reflection.getOrCreateKotlinClass(EncodeExceptionErrorType.class).getSimpleName());
            sb.append(" instead");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i > 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Buffered channel capacity must be at least 1, but ");
        sb2.append(i);
        sb2.append(" was specified");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Override // defpackage.EncodeExceptionErrorType
    protected final boolean g() {
        return this.asBinder == BufferOverflow.DROP_OLDEST;
    }

    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2, boolean z) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionB;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
        if (EncodedDataImplExternalSyntheticLambda0.asInterface(objTuitionPaymentFragmentspecialinlinedviewModeldefault3) || EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (z && (function1 = this.TuitionPaymentFragmentbindingInflater1) != null && (undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, e2, null)) != null) {
            throw undeliveredElementExceptionB;
        }
        EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
        return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
    }

    @Override // defpackage.EncodeExceptionErrorType, defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionB;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder == BufferOverflow.DROP_LATEST ? TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) e2, true) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Function1<E, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null && (undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, e2, null)) != null) {
                ExceptionsKt.addSuppressed(undeliveredElementExceptionB, b());
                throw undeliveredElementExceptionB;
            }
            throw b();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.EncodeExceptionErrorType, defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
        return this.asBinder == BufferOverflow.DROP_LATEST ? TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) e2, false) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
    }
}
