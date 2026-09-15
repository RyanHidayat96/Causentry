package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.AtomicInt;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002&'B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aJ(\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\fH\u0002J\u0014\u0010\"\u001a\u00020\u00042\f\b\u0002\u0010#\u001a\u00060$j\u0002`%R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "onNewAwaiters", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "lock", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "failureCause", "", "pendingAwaitersCountUnlocked", "Landroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount;", "Landroidx/compose/runtime/internal/AtomicInt;", "awaiters", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "spareList", "hasAwaiters", "", "getHasAwaiters", "()Z", "sendFrame", "timeNanos", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fail", "cause", "cancel", "cancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "FrameAwaiter", "AtomicAwaitersCount", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private MutableObjectList<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final Function0<Unit> onNewAwaiters;
    private final AtomicInt pendingAwaitersCountUnlocked;
    private MutableObjectList<FrameAwaiter<?>> spareList;

    public BroadcastFrameClock(Function0<Unit> function0) {
        this.onNewAwaiters = function0;
        this.lock = new Object();
        this.pendingAwaitersCountUnlocked = AtomicAwaitersCount.m3445constructorimpl();
        this.awaiters = new MutableObjectList<>(0, 1, null);
        this.spareList = new MutableObjectList<>(0, 1, null);
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "Lkotlin/Function1;", "", "p0", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;)V", "", "cancel", "()V", "resume", "(J)V", "", "resumeWithException", "(Ljava/lang/Throwable;)V", "onFrame", "Lkotlin/jvm/functions/Function1;", "continuation", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FrameAwaiter<R> {
        private MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super R> continuation;
        private Function1<? super Long, ? extends R> onFrame;

        public FrameAwaiter(Function1<? super Long, ? extends R> function1, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super R> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.onFrame = function1;
            this.continuation = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        public final void cancel() {
            this.onFrame = null;
            this.continuation = null;
        }

        public final void resume(long p0) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super R> mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
            Object objM8024constructorimpl;
            Function1<? super Long, ? extends R> function1 = this.onFrame;
            if (function1 == null || (mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation) == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                FrameAwaiter<R> frameAwaiter = this;
                objM8024constructorimpl = Result.m8024constructorimpl(function1.invoke(Long.valueOf(p0)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(objM8024constructorimpl);
        }

        public final void resumeWithException(Throwable p0) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super R> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation;
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p0)));
            }
        }
    }

    public final boolean getHasAwaiters() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }

    public final void sendFrame(long timeNanos) {
        int i;
        int i2;
        synchronized (this.lock) {
            MutableObjectList<FrameAwaiter<?>> mutableObjectList = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = mutableObjectList;
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m3456packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
            int size = mutableObjectList.getSize();
            for (i2 = 0; i2 < size; i2++) {
                mutableObjectList.get(i2).resume(timeNanos);
            }
            mutableObjectList.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable cause) {
        int i;
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = cause;
            MutableObjectList<FrameAwaiter<?>> mutableObjectList = this.awaiters;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((FrameAwaiter) objArr[i3]).resumeWithException(cause);
            }
            this.awaiters.clear();
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, AtomicAwaitersCount.m3456packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083@\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0017¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0086\b¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00102\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0017H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0019\u0010+\u001a\u00020\u0010*\u00020\u00108Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0019\u0010-\u001a\u00020\u0010*\u00020\u00108Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*\u0088\u0001'\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount;", "", "Landroidx/compose/runtime/internal/AtomicInt;", "p0", "constructor-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "()Landroidx/compose/runtime/internal/AtomicInt;", "", "hasAwaiters-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Z", "hasAwaiters", "", "incrementVersionAndResetCount-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)V", "incrementVersionAndResetCount", "Lkotlin/Function0;", "", "incrementCountAndGetVersion-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Lkotlin/jvm/functions/Function0;)I", "incrementCountAndGetVersion", "decrementCount-impl", "(Landroidx/compose/runtime/internal/AtomicInt;I)V", "decrementCount", "Lkotlin/Function1;", "update-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Lkotlin/jvm/functions/Function1;)I", "update", "p1", "pack-impl", "(Landroidx/compose/runtime/internal/AtomicInt;II)I", "pack", "", "toString-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "value", "Landroidx/compose/runtime/internal/AtomicInt;", "getVersion-impl", "(Landroidx/compose/runtime/internal/AtomicInt;I)I", "version", "getCount-impl", "count", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    static final class AtomicAwaitersCount {
        private static final int COUNT_BITS = 27;
        private static final int VERSION_BITS = 4;
        private final AtomicInt value;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static AtomicInt m3446constructorimpl(AtomicInt atomicInt) {
            return atomicInt;
        }

        /* JADX INFO: renamed from: getCount-impl, reason: not valid java name */
        private static final int m3450getCountimpl(AtomicInt atomicInt, int i) {
            return 134217727 & i;
        }

        /* JADX INFO: renamed from: getVersion-impl, reason: not valid java name */
        private static final int m3451getVersionimpl(AtomicInt atomicInt, int i) {
            return (i >>> 27) & 15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: pack-impl, reason: not valid java name */
        public static final int m3456packimpl(AtomicInt atomicInt, int i, int i2) {
            return ((i & 15) << 27) | (134217727 & i2);
        }

        private /* synthetic */ AtomicAwaitersCount(AtomicInt atomicInt) {
            this.value = atomicInt;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static AtomicInt m3445constructorimpl() {
            return m3446constructorimpl(new AtomicInt(0));
        }

        /* JADX INFO: renamed from: hasAwaiters-impl, reason: not valid java name */
        public static final boolean m3452hasAwaitersimpl(AtomicInt atomicInt) {
            return (atomicInt.get() & 134217727) > 0;
        }

        /* JADX INFO: renamed from: update-impl, reason: not valid java name */
        private static final int m3458updateimpl(AtomicInt atomicInt, Function1<? super Integer, Integer> function1) {
            int i;
            int iIntValue;
            do {
                i = atomicInt.get();
                iIntValue = function1.invoke(Integer.valueOf(i)).intValue();
            } while (!atomicInt.compareAndSet(i, iIntValue));
            return iIntValue;
        }

        public final String toString() {
            return m3457toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3457toStringimpl(AtomicInt atomicInt) {
            int i = atomicInt.get();
            StringBuilder sb = new StringBuilder("AtomicAwaitersCount(version = ");
            sb.append((i >>> 27) & 15);
            sb.append(", count = ");
            sb.append(i & 134217727);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: renamed from: incrementVersionAndResetCount-impl, reason: not valid java name */
        public static final void m3455incrementVersionAndResetCountimpl(AtomicInt atomicInt) {
            int i;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, m3456packimpl(atomicInt, ((i >>> 27) & 15) + 1, 0)));
        }

        /* JADX INFO: renamed from: incrementCountAndGetVersion-impl, reason: not valid java name */
        public static final int m3454incrementCountAndGetVersionimpl(AtomicInt atomicInt, Function0<Unit> function0) {
            int i;
            int i2;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                function0.invoke();
            }
            return (i2 >>> 27) & 15;
        }

        /* JADX INFO: renamed from: decrementCount-impl, reason: not valid java name */
        public static final void m3447decrementCountimpl(AtomicInt atomicInt, int i) {
            int i2;
            do {
                i2 = atomicInt.get();
            } while (!atomicInt.compareAndSet(i2, ((i2 >>> 27) & 15) == i ? i2 - 1 : i2));
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AtomicAwaitersCount m3444boximpl(AtomicInt atomicInt) {
            return new AtomicAwaitersCount(atomicInt);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3448equalsimpl(AtomicInt atomicInt, Object obj) {
            return (obj instanceof AtomicAwaitersCount) && Intrinsics.areEqual(atomicInt, ((AtomicAwaitersCount) obj).getValue());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3449equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
            return Intrinsics.areEqual(atomicInt, atomicInt2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3453hashCodeimpl(AtomicInt atomicInt) {
            return atomicInt.hashCode();
        }

        public final boolean equals(Object p0) {
            return m3448equalsimpl(this.value, p0);
        }

        public final int hashCode() {
            return m3453hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ AtomicInt getValue() {
            return this.value;
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        int i;
        int i2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl2);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th == null) {
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                    i2 = i + 1;
                } while (!atomicInt.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                intRef.element = (i2 >>> 27) & 15;
                this.awaiters.add(frameAwaiter);
                cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        int i3;
                        frameAwaiter.cancel();
                        AtomicInt atomicInt2 = this.pendingAwaitersCountUnlocked;
                        int i4 = intRef.element;
                        do {
                            i3 = atomicInt2.get();
                        } while (!atomicInt2.compareAndSet(i3, ((i3 >>> 27) & 15) == i4 ? i3 - 1 : i3));
                    }
                });
                if (z && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            } else {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
