package androidx.room.support;

import android.os.SystemClock;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteOpenHelper;
import androidx.exifinterface.media.ExifInterface;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 E2\u00020\u0001:\u0002FEB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fJ\u001b\u0010\u001d\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010<\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010@\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001c8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C"}, d2 = {"Landroidx/room/support/AutoCloser;", "", "", "p0", "Ljava/util/concurrent/TimeUnit;", "p1", "Landroidx/room/support/AutoCloser$Watch;", "p2", "<init>", "(JLjava/util/concurrent/TimeUnit;Landroidx/room/support/AutoCloser$Watch;)V", "", "autoCloseDatabase", "()V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "initOpenHelper", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "Lkotlinx/coroutines/CoroutineScope;", "initCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "executeRefCountingFunction", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "incrementCountAndEnsureDbIsOpen", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "decrementCountAndScheduleClose", "closeDatabaseIfOpen", "Lkotlin/Function0;", "setAutoCloseCallback", "(Lkotlin/jvm/functions/Function0;)V", "watch", "Landroidx/room/support/AutoCloser$Watch;", "delegateOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onAutoCloseCallback", "Lkotlin/jvm/functions/Function0;", "lock", "Ljava/lang/Object;", "autoCloseTimeoutInMs", "J", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastDecrementRefCountTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "delegateDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDelegateDatabase$room_runtime_release", "setDelegateDatabase$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "manuallyClosed", "Z", "LVideoMimeInfoBuilder;", "autoCloseJob", "LVideoMimeInfoBuilder;", "isActive", "()Z", "getAutoCloseCallbackForTest$room_runtime_release", "()Lkotlin/jvm/functions/Function0;", "autoCloseCallbackForTest", "", "getRefCountForTest$room_runtime_release", "()I", "refCountForTest", "Companion", "Watch"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoCloser {
    public static final String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private VideoMimeInfoBuilder autoCloseJob;
    private final long autoCloseTimeoutInMs;
    private CoroutineScope coroutineScope;
    private SupportSQLiteDatabase delegateDatabase;
    private SupportSQLiteOpenHelper delegateOpenHelper;
    private AtomicLong lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private Function0<Unit> onAutoCloseCallback;
    private final AtomicInteger referenceCount;
    private final Watch watch;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/support/AutoCloser$Watch;", "", "", "getMillis", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Watch {
        long getMillis();
    }

    public AutoCloser(long j, TimeUnit timeUnit, Watch watch) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(watch, "");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.getMillis());
    }

    public /* synthetic */ AutoCloser(long j, TimeUnit timeUnit, Watch watch, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, timeUnit, (i & 4) != 0 ? new Watch() { // from class: androidx.room.support.AutoCloser$$ExternalSyntheticLambda0
            @Override // androidx.room.support.AutoCloser.Watch
            public final long getMillis() {
                return SystemClock.uptimeMillis();
            }
        } : watch);
    }

    /* JADX INFO: renamed from: getDelegateDatabase$room_runtime_release, reason: from getter */
    public final SupportSQLiteDatabase getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final void setDelegateDatabase$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoCloseDatabase() {
        synchronized (this.lock) {
            if (this.watch.getMillis() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                return;
            }
            if (this.referenceCount.get() != 0) {
                return;
            }
            Function0<Unit> function0 = this.onAutoCloseCallback;
            if (function0 == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            function0.invoke();
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void initOpenHelper(SupportSQLiteOpenHelper p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 instanceof AutoClosingRoomOpenHelper) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.delegateOpenHelper = p0;
    }

    public final void initCoroutineScope(CoroutineScope p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.coroutineScope = p0;
    }

    public final <V> V executeRefCountingFunction(Function1<? super SupportSQLiteDatabase, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return p0.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.autoCloseJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = null;
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
        synchronized (this.lock) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = this.delegateOpenHelper;
            if (supportSQLiteOpenHelper2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                supportSQLiteOpenHelper = supportSQLiteOpenHelper2;
            }
            SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void decrementCountAndScheduleClose() {
        CoroutineScope coroutineScope;
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.".toString());
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.getMillis());
        if (iDecrementAndGet == 0) {
            CoroutineScope coroutineScope2 = this.coroutineScope;
            if (coroutineScope2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                coroutineScope = null;
            } else {
                coroutineScope = coroutineScope2;
            }
            this.autoCloseJob = b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AutoCloser.this.autoCloseTimeoutInMs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AutoCloser.this.autoCloseDatabase();
            return Unit.INSTANCE;
        }

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutoCloser.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            VideoMimeInfoBuilder videoMimeInfoBuilder = this.autoCloseJob;
            if (videoMimeInfoBuilder != null) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            this.autoCloseJob = null;
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(Function0<Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.onAutoCloseCallback = p0;
    }

    public final Function0<Unit> getAutoCloseCallbackForTest$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final int getRefCountForTest$room_runtime_release() {
        return this.referenceCount.get();
    }
}
