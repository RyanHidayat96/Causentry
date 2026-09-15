package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import defpackage.lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\b¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0011\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0012\u0010\u001e\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "nextOrClosed", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrIfClosed", "onClosedAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "next", "getNext", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "trySetNext", "", "value", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "()Z", "getPrev", "cleanPrev", "", "markAsClosed", "isRemoved", "remove", "aliveSegmentLeft", "getAliveSegmentLeft", "aliveSegmentRight", "getAliveSegmentRight", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput<N extends lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1 = AtomicReferenceFieldUpdater.newUpdater(lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicReferenceFieldUpdater.newUpdater(lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput(N n) {
        this._prev$volatile = n;
    }

    public final void asInterface() {
        Object obj;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object obj2 = TuitionPaymentFragmentbindingInflater1.get(this);
        if ((obj2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj2) == null) {
            return;
        }
        while (true) {
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            do {
                obj = atomicReferenceFieldUpdater.get(lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD);
            } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD, obj, ((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj) == null ? null : lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                TuitionPaymentFragmentbindingInflater1.set(lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD);
            }
            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                Object obj3 = TuitionPaymentFragmentbindingInflater1.get(lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputD);
                if ((obj3 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj3) != null) {
                    continue;
                }
            }
            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || !lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinputTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                return;
            }
        }
    }

    private final N d() {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object obj = TuitionPaymentFragmentbindingInflater1.get(this);
        N n = obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (N) obj;
        Intrinsics.checkNotNull(n);
        while (n.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            Object obj2 = TuitionPaymentFragmentbindingInflater1.get(n);
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = obj2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj2;
            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput == null) {
                break;
            }
            n = (N) lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
        }
        return n;
    }

    public static final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput) {
        return TuitionPaymentFragmentbindingInflater1.get(lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput);
    }

    private final N TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        N n = (N) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
        while (n != null && n.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            n = (N) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(n);
        }
        return n;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Object obj = TuitionPaymentFragmentbindingInflater1.get(this);
        return (obj == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj) == null;
    }
}
