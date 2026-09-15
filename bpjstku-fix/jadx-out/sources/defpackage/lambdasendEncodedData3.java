package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import defpackage.resolveAudioMimeInfo;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0002J\u001e\u0010\u0016\u001a\u00060\u0000j\u0002`\u00112\n\u0010\u0017\u001a\u00060\u0000j\u0002`\u0011H\u0082\u0010¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u0011¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u00112\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eJ%\u0010#\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0001¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u000bH\u0016J\u0015\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0001¢\u0006\u0002\u0010\u0013J\u0019\u0010'\u001a\u00020!2\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0002¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0082\u0010¢\u0006\u0002\u0010\u0013J'\u0010*\u001a\u00020!2\n\u0010+\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0000¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020/H\u0016R\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004R\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005X\u0082\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "removed", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "findPrevNonRemoved", "current", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "addOneIfEmpty", "node", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addLast", "permissionsBitmask", "", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;I)Z", "close", "", "forbiddenElementsBit", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "remove", "removeOrNext", "finishAdd", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "correctPrev", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class lambdasendEncodedData3 {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lambdasendEncodedData3.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicReferenceFieldUpdater.newUpdater(lambdasendEncodedData3.class, Object.class, "_prev$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicReferenceFieldUpdater.newUpdater(lambdasendEncodedData3.class, Object.class, "_removedRef$volatile");

    public boolean n_() {
        return asBinder() instanceof lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback;
    }

    public final lambdasendEncodedData3 d() {
        lambdasendEncodedData3 lambdasendencodeddata3;
        Object objAsBinder = asBinder();
        lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback = objAsBinder instanceof lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback ? (lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback) objAsBinder : null;
        if (lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback != null && (lambdasendencodeddata3 = lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback.b) != null) {
            return lambdasendencodeddata3;
        }
        Intrinsics.checkNotNull(objAsBinder, "");
        return (lambdasendEncodedData3) objAsBinder;
    }

    public final lambdasendEncodedData3 a() {
        lambdasendEncodedData3 lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            Object obj = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
            while (true) {
                lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (lambdasendEncodedData3) obj;
                if (!lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2.n_()) {
                    break;
                }
                obj = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return lambdasendencodeddata3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasendEncodedData3 lambdasendencodeddata3, int i) {
        lambdasendEncodedData3 lambdasendencodeddata3A;
        do {
            lambdasendencodeddata3A = a();
            if (lambdasendencodeddata3A instanceof checkBufferInfo) {
                return (((checkBufferInfo) lambdasendencodeddata3A).b & i) == 0 && lambdasendencodeddata3A.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasendencodeddata3, i);
            }
        } while (!lambdasendencodeddata3A.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasendencodeddata3, this));
        return true;
    }

    public boolean q_() {
        return g() == null;
    }

    private lambdasendEncodedData3 g() {
        Object objAsBinder;
        lambdasendEncodedData3 lambdasendencodeddata3;
        do {
            objAsBinder = asBinder();
            if (objAsBinder instanceof lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback) {
                return ((lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback) objAsBinder).b;
            }
            if (objAsBinder == this) {
                return (lambdasendEncodedData3) objAsBinder;
            }
            Intrinsics.checkNotNull(objAsBinder, "");
            lambdasendencodeddata3 = (lambdasendEncodedData3) objAsBinder;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(b, this, objAsBinder, lambdasendencodeddata3.asInterface()));
        lambdasendencodeddata3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this.receiver);
            }
        });
        sb.append('@');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        return sb.toString();
    }

    private final lambdasendEncodedData3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        lambdasendEncodedData3 lambdasendencodeddata3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            lambdasendEncodedData3 lambdasendencodeddata4 = (lambdasendEncodedData3) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
            lambdasendencodeddata3 = lambdasendencodeddata4;
            while (true) {
                lambdasendEncodedData3 lambdasendencodeddata5 = null;
                while (true) {
                    atomicReferenceFieldUpdater = b;
                    obj = atomicReferenceFieldUpdater.get(lambdasendencodeddata3);
                    if (obj == this) {
                        if (lambdasendencodeddata4 != lambdasendencodeddata3 && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, lambdasendencodeddata4, lambdasendencodeddata3)) {
                            break;
                        }
                        break;
                    }
                    if (n_()) {
                        return null;
                    }
                    if (!(obj instanceof lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback)) {
                        Intrinsics.checkNotNull(obj, "");
                        lambdasendencodeddata5 = lambdasendencodeddata3;
                        lambdasendencodeddata3 = (lambdasendEncodedData3) obj;
                    } else {
                        if (lambdasendencodeddata5 != null) {
                            break;
                        }
                        lambdasendencodeddata3 = (lambdasendEncodedData3) TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(lambdasendencodeddata3);
                    }
                }
                if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, lambdasendencodeddata5, lambdasendencodeddata3, ((lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback) obj).b)) {
                    break;
                }
                lambdasendencodeddata3 = lambdasendencodeddata5;
            }
        }
        return lambdasendencodeddata3;
    }

    private final void b(lambdasendEncodedData3 lambdasendencodeddata3) {
        lambdasendEncodedData3 lambdasendencodeddata4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            lambdasendencodeddata4 = (lambdasendEncodedData3) atomicReferenceFieldUpdater.get(lambdasendencodeddata3);
            if (asBinder() != lambdasendencodeddata3) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdasendencodeddata3, lambdasendencodeddata4, this));
        if (n_()) {
            lambdasendencodeddata3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    private final lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback asInterface() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback = (lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback) atomicReferenceFieldUpdater.get(this);
        if (lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback != null) {
            return lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback;
        }
        lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback2 = new lambdaonOutputFormatChanged7androidxcameravideointernalencoderEncoderImplMediaCodecCallback(this);
        atomicReferenceFieldUpdater.set(this, lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback2);
        return lambdaonoutputformatchanged7androidxcameravideointernalencoderencoderimplmediacodeccallback2;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasendEncodedData3 lambdasendencodeddata3, lambdasendEncodedData3 lambdasendencodeddata4) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(lambdasendencodeddata3, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.set(lambdasendencodeddata3, lambdasendencodeddata4);
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, lambdasendencodeddata4, lambdasendencodeddata3)) {
            return false;
        }
        lambdasendencodeddata3.b(lambdasendencodeddata4);
        return true;
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(lambdasendEncodedData3 lambdasendencodeddata3) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(lambdasendencodeddata3, this);
        b.set(lambdasendencodeddata3, this);
        while (asBinder() == this) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(b, this, this, lambdasendencodeddata3)) {
                lambdasendencodeddata3.b(this);
                return true;
            }
        }
        return false;
    }

    public final Object asBinder() {
        return b.get(this);
    }
}
