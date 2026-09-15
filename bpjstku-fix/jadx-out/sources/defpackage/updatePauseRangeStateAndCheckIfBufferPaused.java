package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002/0B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0013\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J1\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010!J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010#\u001a\u00020$H\u0002J%\u0010%\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0002\u0010'J%\u0010(\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0002\u0010'J&\u0010)\u001a\b\u0012\u0004\u0012\u0002H+0*\"\u0004\b\u0001\u0010+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H+0-J\u0006\u0010.\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u000bX\u0082\u0004R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", ExifInterface.LONGITUDE_EAST, "", "capacity", "", "singleConsumer", "", "<init>", "(IZ)V", "mask", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "size", "getSize", "()I", "close", "addLast", "element", "(Ljava/lang/Object;)I", "fillPlaceholder", "Lkotlinx/coroutines/internal/Core;", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "next", "markFrozen", "", "allocateOrGetNextCopy", RemoteConfigConstants.ResponseFieldKey.STATE, "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateNextCopy", "map", "", "R", "transform", "Lkotlin/Function1;", "isClosed", "Placeholder", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updatePauseRangeStateAndCheckIfBufferPaused<E> {
    private final /* synthetic */ AtomicReferenceArray TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final int asBinder;
    private final boolean asInterface;
    private final int g;
    private static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(updatePauseRangeStateAndCheckIfBufferPaused.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicLongFieldUpdater.newUpdater(updatePauseRangeStateAndCheckIfBufferPaused.class, "_state$volatile");
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("REMOVE_FROZEN");

    public updatePauseRangeStateAndCheckIfBufferPaused(int i, boolean z) {
        this.g = i;
        this.asInterface = z;
        int i2 = i - 1;
        this.asBinder = i2;
        this.TuitionPaymentFragmentbindingInflater1 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class b {
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public b(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f"}, d2 = {"LupdatePauseRangeStateAndCheckIfBufferPaused$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(JJ)J", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(J)I", "LEncoderImplMediaCodecCallbackExternalSyntheticLambda0;", "LEncoderImplMediaCodecCallbackExternalSyntheticLambda0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {
        public static long TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, long j2) {
            return j & (~j2);
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        private TuitionPaymentFragmentbindingInflater1() {
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final updatePauseRangeStateAndCheckIfBufferPaused<E> TuitionPaymentFragmentbindingInflater1(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            updatePauseRangeStateAndCheckIfBufferPaused<E> updatepauserangestateandcheckifbufferpaused = (updatePauseRangeStateAndCheckIfBufferPaused) atomicReferenceFieldUpdater.get(this);
            if (updatepauserangestateandcheckifbufferpaused != null) {
                return updatepauserangestateandcheckifbufferpaused;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            updatePauseRangeStateAndCheckIfBufferPaused updatepauserangestateandcheckifbufferpaused2 = new updatePauseRangeStateAndCheckIfBufferPaused(this.g * 2, this.asInterface);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.asBinder;
                if ((i & i3) != (i3 & i2)) {
                    Object bVar = this.TuitionPaymentFragmentbindingInflater1.get(i3 & i);
                    if (bVar == null) {
                        bVar = new b(i);
                    }
                    updatepauserangestateandcheckifbufferpaused2.TuitionPaymentFragmentbindingInflater1.set(updatepauserangestateandcheckifbufferpaused2.asBinder & i, bVar);
                    i++;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(updatepauserangestateandcheckifbufferpaused2, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, 1152921504606846976L));
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, updatepauserangestateandcheckifbufferpaused2);
        }
    }

    private final updatePauseRangeStateAndCheckIfBufferPaused<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, E e2) {
        Object obj = this.TuitionPaymentFragmentbindingInflater1.get(this.asBinder & i);
        if (!(obj instanceof b) || ((b) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i) {
            return null;
        }
        this.TuitionPaymentFragmentbindingInflater1.set(i & this.asBinder, e2);
        return this;
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final updatePauseRangeStateAndCheckIfBufferPaused<E> b(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (j & 1073741823);
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if ((1152921504606846976L & j) != 0) {
                return TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(this, j, ((long) i2) | TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, 1073741823L)));
        this.TuitionPaymentFragmentbindingInflater1.set(this.asBinder & i3, null);
        return null;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = this.asBinder;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.asInterface && this.TuitionPaymentFragmentbindingInflater1.get(i2 & i3) != null) {
                int i4 = this.g;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(this, j, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, 1152921503533105152L) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.TuitionPaymentFragmentbindingInflater1.set(i2 & i3, e2);
                updatePauseRangeStateAndCheckIfBufferPaused<E> updatepauserangestateandcheckifbufferpausedTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this;
                while ((TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(updatepauserangestateandcheckifbufferpausedTuitionPaymentFragmentspecialinlinedviewModeldefault1) & 1152921504606846976L) != 0 && (updatepauserangestateandcheckifbufferpausedTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updatepauserangestateandcheckifbufferpausedTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(updatepauserangestateandcheckifbufferpausedTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, e2)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.asBinder;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = this.TuitionPaymentFragmentbindingInflater1.get(i2 & i);
            if (obj == null) {
                if (this.asInterface) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(this, j, ((long) i3) | TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, 1073741823L))) {
                    this.TuitionPaymentFragmentbindingInflater1.set(this.asBinder & i, null);
                    return obj;
                }
                if (this.asInterface) {
                    updatePauseRangeStateAndCheckIfBufferPaused<E> updatepauserangestateandcheckifbufferpausedB = this;
                    do {
                        updatepauserangestateandcheckifbufferpausedB = updatepauserangestateandcheckifbufferpausedB.b(i, i3);
                    } while (updatepauserangestateandcheckifbufferpausedB != null);
                    return obj;
                }
            }
        }
    }
}
