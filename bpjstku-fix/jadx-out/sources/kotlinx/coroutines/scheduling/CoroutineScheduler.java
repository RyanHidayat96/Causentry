package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda0;
import defpackage.SwappedVideoEncoderInfo;
import defpackage.getSupportedHeights;
import defpackage.getSupportedHeightsFor;
import defpackage.getSupportedWidths;
import defpackage.lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback;
import defpackage.resolveAudioMimeInfo;
import defpackage.scaleAndClampBitrate;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0003MNOB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u0012\u0010\u001b\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000J\u000e\u0010\u001c\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\u0014\u0010\u001d\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000H\u0002J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0086\bJ\t\u0010(\u001a\u00020\u0004H\u0082\bJ\t\u0010)\u001a\u00020\u0004H\u0082\bJ\t\u0010*\u001a\u00020\u0007H\u0082\bJ\t\u0010+\u001a\u00020\u0016H\u0082\bJ\t\u0010,\u001a\u00020\u0010H\u0082\bJ\t\u0010-\u001a\u00020\u0007H\u0082\bJ\u0019\u00102\u001a\u00020\u00162\n\u00103\u001a\u000605j\u0002`4H\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0016H\u0016J\u000e\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0007J/\u0010:\u001a\u00020\u00162\n\u0010;\u001a\u000605j\u0002`42\f\b\u0002\u0010<\u001a\u00060\u0010j\u0002`=2\b\b\u0002\u0010>\u001a\u00020\u0010¢\u0006\u0002\u0010?J#\u0010@\u001a\u00020\u00122\n\u0010;\u001a\u000605j\u0002`42\n\u0010<\u001a\u00060\u0010j\u0002`=¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0010H\u0002J\u0006\u0010E\u001a\u00020\u0016J\u0012\u0010F\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0010H\u0002J\b\u0010H\u001a\u00020\u0004H\u0002J$\u0010I\u001a\u0004\u0018\u00010\u0012*\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0010H\u0002J\u000e\u0010J\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\b\u0010K\u001a\u00020\tH\u0016J\u000e\u0010L\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u001a\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00000\u001f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010 \u001a\u00020\u0014X\u0082\u0004R\u0015\u0010!\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010$\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\t\u0010.\u001a\u00020/X\u0082\u0004R\u0011\u00100\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006P"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "<init>", "(IIJLjava/lang/String;)V", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "addToGlobalQueue", "", "task", "Lkotlinx/coroutines/scheduling/Task;", "parkedWorkersStack", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStackTopUpdate", "", "worker", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "oldIndex", "newIndex", "parkedWorkersStackPush", "parkedWorkersStackPop", "parkedWorkersStackNextIndex", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "controlState", "createdWorkers", "getCreatedWorkers", "()I", "availableCpuPermits", "getAvailableCpuPermits", RemoteConfigConstants.ResponseFieldKey.STATE, "blockingTasks", "incrementCreatedWorkers", "decrementCreatedWorkers", "incrementBlockingTasks", "decrementBlockingTasks", "tryAcquireCpuPermit", "releaseCpuPermit", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "isTerminated", "()Z", "execute", "command", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "close", "shutdown", "timeout", "dispatch", "block", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "(Ljava/lang/Runnable;ZZ)V", "createTask", "(Ljava/lang/Runnable;Z)Lkotlinx/coroutines/scheduling/Task;", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "tryCreateWorker", "tryUnpark", "createNewWorker", "submitToLocalQueue", "currentWorker", "toString", "runSafely", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoroutineScheduler implements Executor, Closeable {
    static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final /* synthetic */ AtomicLongFieldUpdater d;
    private int INotificationSideChannel;
    public final int TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwappedVideoEncoderInfo f1243a;
    public final String asBinder;
    public final long asInterface;
    public final SwappedVideoEncoderInfo b;
    private volatile /* synthetic */ long controlState$volatile;
    public final lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback<TuitionPaymentFragmentspecialinlinedviewModeldefault3> g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.INotificationSideChannel = i2;
        this.asInterface = j;
        this.asBinder = str;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Max pool size ");
            sb2.append(i2);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (i2 > 2097150) {
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(i2);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (j <= 0) {
            StringBuilder sb4 = new StringBuilder("Idle worker keep alive time ");
            sb4.append(j);
            sb4.append(" must be positive");
            throw new IllegalArgumentException(sb4.toString().toString());
        }
        this.f1243a = new SwappedVideoEncoderInfo();
        this.b = new SwappedVideoEncoderInfo();
        this.g = new lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : j, (i3 & 8) != 0 ? getSupportedHeights.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LEncoderImplMediaCodecCallbackExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LEncoderImplMediaCodecCallbackExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
        d = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NOT_IN_STACK");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.TuitionPaymentFragmentbindingInflater1(runnable, false, z);
    }

    public final void TuitionPaymentFragmentbindingInflater1(Runnable runnable, boolean z, boolean z2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(runnable, z);
        boolean z3 = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
        long jAddAndGet = z3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1, getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3, z2);
        if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface) {
                zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } else {
                zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.asBinder);
                sb.append(" was terminated");
                throw new RejectedExecutionException(sb.toString());
            }
        }
        boolean z4 = z2 && tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 != null;
        if (z3) {
            TuitionPaymentFragmentbindingInflater1(jAddAndGet, z4);
            return;
        }
        if (z4) {
            return;
        }
        do {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this))) {
                    return;
                }
                do {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        return;
                    }
                } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1, 0));
                LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, -1, 0));
        LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private static getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable, boolean z) {
        long jTuitionPaymentFragmentbindingInflater1 = getSupportedHeights.g.TuitionPaymentFragmentbindingInflater1();
        if (runnable instanceof getSupportedHeightsFor) {
            getSupportedHeightsFor getsupportedheightsfor = (getSupportedHeightsFor) runnable;
            getsupportedheightsfor.d = jTuitionPaymentFragmentbindingInflater1;
            getsupportedheightsfor.asInterface = z;
            return getsupportedheightsfor;
        }
        return getSupportedHeights.TuitionPaymentFragmentbindingInflater1(runnable, jTuitionPaymentFragmentbindingInflater1, z);
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.TuitionPaymentFragmentbindingInflater1) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1 && this.TuitionPaymentFragmentbindingInflater1 > 1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0) {
                return true;
            }
        }
        return false;
    }

    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this.g) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iCoerceAtLeast >= this.TuitionPaymentFragmentbindingInflater1) {
                return 0;
            }
            if (i >= this.INotificationSideChannel) {
                return 0;
            }
            int i2 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i2 > 0) {
                AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = this.g.array;
                if ((i2 < atomicReferenceArray.length() ? atomicReferenceArray.get(i2) : null) == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, i2);
                    this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.start();
                    return iCoerceAtLeast + 1;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, getSupportedHeightsFor getsupportedheightsfor, boolean z) {
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.TERMINATED || (!getsupportedheightsfor.asInterface && tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.BLOCKING)) {
            return getsupportedheightsfor;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        getSupportedWidths getsupportedwidths = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (!z && (getsupportedheightsfor = (getSupportedHeightsFor) getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndSet(getsupportedwidths, getsupportedheightsfor)) == null) {
            return null;
        }
        if (getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(getsupportedwidths) - getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(getsupportedwidths) == 127) {
            return getsupportedheightsfor;
        }
        if (getsupportedheightsfor.asInterface) {
            getSupportedWidths.TuitionPaymentFragmentbindingInflater1.incrementAndGet(getsupportedwidths);
        }
        int i = getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(getsupportedwidths) & 127;
        while (getsupportedwidths.b.get(i) != null) {
            Thread.yield();
        }
        getsupportedwidths.b.lazySet(i, getsupportedheightsfor);
        getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.incrementAndGet(getsupportedwidths);
        return null;
    }

    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1() {
        Thread threadCurrentThread = Thread.currentThread();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = threadCurrentThread instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? (TuitionPaymentFragmentspecialinlinedviewModeldefault3) threadCurrentThread : null;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.g.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < length) {
            AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = this.g.array;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 < atomicReferenceArray.length() ? atomicReferenceArray.get(i6) : null;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                getSupportedWidths getsupportedwidths = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i7 = getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(getsupportedwidths) != null ? (getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(getsupportedwidths) - getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(getsupportedwidths)) + 1 : getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(getsupportedwidths) - getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(getsupportedwidths);
                int i8 = WhenMappings.$EnumSwitchMapping$0[tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i8 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
            i6++;
        }
        long j = TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.asBinder);
        sb4.append('@');
        sb4.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.TuitionPaymentFragmentbindingInflater1);
        sb4.append(", max = ");
        sb4.append(this.INotificationSideChannel);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1243a.TuitionPaymentFragmentbindingInflater1());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.b.TuitionPaymentFragmentbindingInflater1());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.TuitionPaymentFragmentbindingInflater1 - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getSupportedHeightsFor getsupportedheightsfor) {
        try {
            getsupportedheightsfor.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0002J\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020$J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0014H\u0002J\u000e\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020$J\n\u00106\u001a\u0004\u0018\u00010\u0014H\u0002J\n\u00107\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u00109\u001a\u00020$H\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\u001b\u0010;\u001a\u0004\u0018\u00010\u00142\n\u0010<\u001a\u00060\u0005j\u0002`=H\u0002¢\u0006\u0002\u0010>R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "terminationDeadline", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "tryAcquireCpuPermit", "", "tryReleaseCpu", "newState", "run", "", "mayHaveLocalTasks", "runWorker", "runSingleTask", "isIo", "tryPark", "inStack", "executeTask", "task", "nextInt", "upperBound", PlaceTypes.PARK, "tryTerminateWorker", "findTask", "findBlockingTask", "findCpuTask", "findAnyTask", "scanLocalQueue", "pollGlobalQueues", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "(I)Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(TuitionPaymentFragmentspecialinlinedviewModeldefault3.class, "workerCtl$volatile");
        private long TuitionPaymentFragmentbindingInflater1;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final getSupportedWidths TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public WorkerState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Ref.ObjectRef<getSupportedHeightsFor> f1244a;
        private long asInterface;
        private int d;
        volatile int indexInArray;
        volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getSupportedWidths();
            this.f1244a = new Ref.ObjectRef<>();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iNanoTime = (int) System.nanoTime();
            this.d = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.asBinder);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineScheduler coroutineScheduler, int i) {
            this();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            long j;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            do {
                j = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean TuitionPaymentFragmentbindingInflater1(WorkerState workerState) {
            WorkerState workerState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = workerState;
            }
            return z;
        }

        private int b(int i) {
            int i2 = this.d;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.d = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            getSupportedHeightsFor getsupportedheightsfor;
            getSupportedWidths getsupportedwidths = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            do {
                getsupportedheightsfor = (getSupportedHeightsFor) getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(getsupportedwidths);
                if (getsupportedheightsfor == null || !getsupportedheightsfor.asInterface) {
                    int i = getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(getsupportedwidths);
                    int i2 = getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(getsupportedwidths);
                    while (true) {
                        if (i == i2 || getSupportedWidths.TuitionPaymentFragmentbindingInflater1.get(getsupportedwidths) == 0) {
                            getsupportedheightsfor = null;
                            break;
                        }
                        i2--;
                        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getsupportedwidths.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, true);
                        if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            getsupportedheightsfor = getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            break;
                        }
                    }
                }
            } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getsupportedwidths, getsupportedheightsfor, null));
            if (getsupportedheightsfor != null) {
                return getsupportedheightsfor;
            }
            getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScheduler.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(1) : getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
            getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentbindingInflater1;
            getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentbindingInflater2;
            if (z) {
                boolean z2 = b(CoroutineScheduler.this.TuitionPaymentFragmentbindingInflater1 * 2) == 0;
                if (z2 && (getsupportedheightsforTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1()) != null) {
                    return getsupportedheightsforTuitionPaymentFragmentbindingInflater2;
                }
                getSupportedWidths getsupportedwidths = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (getSupportedHeightsFor) getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndSet(getsupportedwidths, null);
                if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getsupportedwidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    return getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                if (!z2 && (getsupportedheightsforTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1()) != null) {
                    return getsupportedheightsforTuitionPaymentFragmentbindingInflater1;
                }
            } else {
                getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1();
                if (getsupportedheightsforTuitionPaymentFragmentbindingInflater3 != null) {
                    return getsupportedheightsforTuitionPaymentFragmentbindingInflater3;
                }
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(3);
        }

        private final getSupportedHeightsFor TuitionPaymentFragmentbindingInflater1() {
            if (b(2) == 0) {
                getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScheduler.this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 : CoroutineScheduler.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CoroutineScheduler.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 : CoroutineScheduler.this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        private final getSupportedHeightsFor TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
            int i2 = (int) (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iB = b(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iB++;
                if (iB > i2) {
                    iB = 1;
                }
                AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = coroutineScheduler.g.array;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = iB < atomicReferenceArray.length() ? atomicReferenceArray.get(iB) : null;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && tuitionPaymentFragmentspecialinlinedviewModeldefault3 != this) {
                    long jTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(i, this.f1244a);
                    if (jTuitionPaymentFragmentbindingInflater1 == -1) {
                        getSupportedHeightsFor getsupportedheightsfor = this.f1244a.element;
                        this.f1244a.element = null;
                        return getsupportedheightsfor;
                    }
                    if (jTuitionPaymentFragmentbindingInflater1 > 0) {
                        jMin = Math.min(jMin, jTuitionPaymentFragmentbindingInflater1);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.TuitionPaymentFragmentbindingInflater1 = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j;
            int i;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(CoroutineScheduler.this) != 0 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2() ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        this.TuitionPaymentFragmentbindingInflater1 = 0L;
                        this.asInterface = 0L;
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.PARKING) {
                            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkerState.BLOCKING;
                        }
                        if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) {
                            if (TuitionPaymentFragmentbindingInflater1(WorkerState.BLOCKING)) {
                                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                while (true) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = coroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                        if (b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, -1, 0)) {
                                            LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                            break;
                                        }
                                    } else {
                                        if (coroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(coroutineScheduler))) {
                                            break;
                                        }
                                        while (true) {
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = coroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                break;
                                            } else if (b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1, 0)) {
                                                LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.addAndGet(CoroutineScheduler.this, -2097152L);
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.TERMINATED) {
                                break;
                            }
                            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkerState.DORMANT;
                            break;
                        }
                        CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        break;
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                    if (this.TuitionPaymentFragmentbindingInflater1 != 0) {
                        if (z) {
                            TuitionPaymentFragmentbindingInflater1(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.TuitionPaymentFragmentbindingInflater1);
                            this.TuitionPaymentFragmentbindingInflater1 = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker == CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                        if (this.nextParkedWorker == CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.d;
                            do {
                                j = atomicLongFieldUpdater.get(coroutineScheduler2);
                                int i2 = (int) (j & 2097151);
                                i = this.indexInArray;
                                scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = coroutineScheduler2.g.array;
                                this.nextParkedWorker = i2 < atomicReferenceArray.length() ? atomicReferenceArray.get(i2) : null;
                            } while (!CoroutineScheduler.d.compareAndSet(coroutineScheduler2, j, ((j + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152)) | ((long) i)));
                        }
                    } else {
                        b.set(this, -1);
                        while (this.nextParkedWorker != CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            if (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(CoroutineScheduler.this) != 0 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == WorkerState.TERMINATED) {
                                break;
                            }
                            TuitionPaymentFragmentbindingInflater1(WorkerState.PARKING);
                            Thread.interrupted();
                            if (this.asInterface == 0) {
                                this.asInterface = System.nanoTime() + CoroutineScheduler.this.asInterface;
                            }
                            LockSupport.parkNanos(CoroutineScheduler.this.asInterface);
                            if (System.nanoTime() - this.asInterface >= 0) {
                                this.asInterface = 0L;
                                lambdaonInputBufferAvailable0androidxcameravideointernalencoderEncoderImplMediaCodecCallback<TuitionPaymentFragmentspecialinlinedviewModeldefault3> lambdaoninputbufferavailable0androidxcameravideointernalencoderencoderimplmediacodeccallback = CoroutineScheduler.this.g;
                                CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                synchronized (lambdaoninputbufferavailable0androidxcameravideointernalencoderencoderimplmediacodeccallback) {
                                    if (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(coroutineScheduler3) == 0) {
                                        if (((int) (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(coroutineScheduler3) & 2097151)) > coroutineScheduler3.TuitionPaymentFragmentbindingInflater1 && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                            int i3 = this.indexInArray;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
                                            coroutineScheduler3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, i3, 0);
                                            int andDecrement = (int) (CoroutineScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndDecrement(coroutineScheduler3) & 2097151);
                                            if (andDecrement != i3) {
                                                AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray2 = coroutineScheduler3.g.array;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = andDecrement < atomicReferenceArray2.length() ? atomicReferenceArray2.get(andDecrement) : null;
                                                Intrinsics.checkNotNull(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                coroutineScheduler3.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, tuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                                tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3);
                                                coroutineScheduler3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault4, andDecrement, i3);
                                            }
                                            coroutineScheduler3.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(andDecrement, null);
                                            Unit unit = Unit.INSTANCE;
                                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkerState.TERMINATED;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            TuitionPaymentFragmentbindingInflater1(WorkerState.TERMINATED);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[], still in use, count: 1, list:
  (r0v1 kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[]) from 0x003a: INVOKE (r0v1 kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private WorkerState() {
            super(str, i);
        }

        static {
            EnumEntriesKt.enumEntries(workerStateArr);
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f1245a.clone();
        }
    }

    private static int b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        Object obj = tuitionPaymentFragmentspecialinlinedviewModeldefault3.nextParkedWorker;
        while (obj != TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (obj == null) {
                return 0;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            int i = tuitionPaymentFragmentspecialinlinedviewModeldefault4.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = tuitionPaymentFragmentspecialinlinedviewModeldefault4.nextParkedWorker;
        }
        return -1;
    }

    final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = this.g.array;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = i < atomicReferenceArray.length() ? atomicReferenceArray.get(i) : null;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                return null;
            }
            int iB = b(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (iB >= 0 && d.compareAndSet(this, j, ((long) iB) | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)))) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.nextParkedWorker = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1(long j, boolean z) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (z) {
            return;
        }
        do {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(j)) {
                    return;
                }
                do {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        return;
                    }
                } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1, 0));
                LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.compareAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2, -1, 0));
        LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(this, 0, 1)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            synchronized (this.g) {
                i = (int) (TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(this) & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    AtomicReferenceArray<TuitionPaymentFragmentspecialinlinedviewModeldefault3> atomicReferenceArray = this.g.array;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 < atomicReferenceArray.length() ? atomicReferenceArray.get(i2) : null;
                    Intrinsics.checkNotNull(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault4 != tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1) {
                        while (tuitionPaymentFragmentspecialinlinedviewModeldefault4.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(tuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            tuitionPaymentFragmentspecialinlinedviewModeldefault4.join(10000L);
                        }
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        getSupportedWidths getsupportedwidths = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        SwappedVideoEncoderInfo swappedVideoEncoderInfo = this.b;
                        getSupportedHeightsFor getsupportedheightsfor = (getSupportedHeightsFor) getSupportedWidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndSet(getsupportedwidths, null);
                        if (getsupportedheightsfor != null) {
                            swappedVideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsfor);
                        }
                        while (true) {
                            getSupportedHeightsFor getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getsupportedwidths.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                break;
                            } else {
                                swappedVideoEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            while (true) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 == null) {
                    getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) == null) {
                        break;
                    }
                } else {
                    getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() ? tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true) : tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f1243a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                            break;
                            break;
                        }
                    }
                }
                try {
                    getsupportedheightsforTuitionPaymentFragmentspecialinlinedviewModeldefault1.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread = Thread.currentThread();
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                }
            }
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(WorkerState.TERMINATED);
            }
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            d.set(this, 0L);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        TuitionPaymentFragmentbindingInflater1(command, false, false);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iB = (int) (2097151 & j);
            if (iB == i) {
                iB = i2 == 0 ? b(tuitionPaymentFragmentspecialinlinedviewModeldefault3) : i2;
            }
            if (iB >= 0 && d.compareAndSet(this, j, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)) | ((long) iB))) {
                return;
            }
        }
    }
}
