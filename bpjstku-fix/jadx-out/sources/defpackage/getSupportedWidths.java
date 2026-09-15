package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J'\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001e¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\f2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001cH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u0004\u0018\u00010\fJ\b\u0010#\u001a\u0004\u0018\u00010\fJ\u0012\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0017H\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J)\u0010,\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020+H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u00100\u001a\u00020)*\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0011\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¨\u00061"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "bufferSize", "", "getBufferSize", "()I", "size", "getSize$kotlinx_coroutines_core", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "Lkotlinx/atomicfu/AtomicInt;", "consumerIndex", "blockingTasksInBuffer", "poll", "add", "task", "fair", "", "addLast", "trySteal", "", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "stealWithExclusiveMode", "(I)Lkotlinx/coroutines/scheduling/Task;", "pollBlocking", "pollCpu", "pollWithExclusiveMode", "onlyBlocking", "tryExtractFromTheMiddle", FirebaseAnalytics.Param.INDEX, "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "tryStealLastScheduled", "pollTo", "queue", "pollBuffer", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSupportedWidths {
    public final AtomicReferenceArray<getSupportedHeightsFor> b = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicReferenceFieldUpdater.newUpdater(getSupportedWidths.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicIntegerFieldUpdater.newUpdater(getSupportedWidths.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicIntegerFieldUpdater.newUpdater(getSupportedWidths.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentbindingInflater1 = AtomicIntegerFieldUpdater.newUpdater(getSupportedWidths.class, "blockingTasksInBuffer$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public final long TuitionPaymentFragmentbindingInflater1(int i, Ref.ObjectRef<getSupportedHeightsFor> objectRef) {
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        T t;
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i == 3) {
            getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        }
        if (t != 0) {
            t = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            t = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            objectRef.element = t;
            return -1L;
        }
        t = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        t = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, objectRef);
    }

    public final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, boolean z) {
        int i2 = i & 127;
        getSupportedHeightsFor getsupportedheightsfor = this.b.get(i2);
        if (getsupportedheightsfor != null && getsupportedheightsfor.asInterface == z) {
            AtomicReferenceArray<getSupportedHeightsFor> atomicReferenceArray = this.b;
            while (!atomicReferenceArray.compareAndSet(i2, getsupportedheightsfor, null)) {
                if (atomicReferenceArray.get(i2) != getsupportedheightsfor) {
                }
            }
            if (z) {
                TuitionPaymentFragmentbindingInflater1.decrementAndGet(this);
            }
            return getsupportedheightsfor;
        }
        return null;
    }

    public final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        getSupportedHeightsFor andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.b.getAndSet(i & 127, null)) != null) {
                if (andSet != null && andSet.asInterface) {
                    TuitionPaymentFragmentbindingInflater1.decrementAndGet(this);
                    scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                return andSet;
            }
        }
    }

    private final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
        boolean z = i == 1;
        while (true) {
            getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (i2 == i3) {
                break;
            }
            if (!z || TuitionPaymentFragmentbindingInflater1.get(this) != 0) {
                getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, z);
                if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    break;
                }
                i2++;
            } else {
                return null;
            }
        }
        return getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, getSupportedHeightsFor, java.lang.Object] */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Ref.ObjectRef<getSupportedHeightsFor> objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            r1 = (getSupportedHeightsFor) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.asInterface ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long jTuitionPaymentFragmentbindingInflater1 = getSupportedHeights.g.TuitionPaymentFragmentbindingInflater1() - r1.d;
            if (jTuitionPaymentFragmentbindingInflater1 < getSupportedHeights.TuitionPaymentFragmentbindingInflater1) {
                return getSupportedHeights.TuitionPaymentFragmentbindingInflater1 - jTuitionPaymentFragmentbindingInflater1;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, r1, null));
        objectRef.element = r1;
        return -1L;
    }
}
