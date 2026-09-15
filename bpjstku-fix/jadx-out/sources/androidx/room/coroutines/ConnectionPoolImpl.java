package androidx.room.coroutines;

import android.database.SQLException;
import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteDriver;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJB\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0003\u001a\u00020\r2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00140#j\b\u0012\u0004\u0012\u00020\u0014`$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u00060'j\u0002`(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010,\"\u0004\b7\u0010\u001a"}, d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "", "p2", "p3", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;II)V", "R", "", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/coroutines/PooledConnectionImpl;", "Lkotlin/coroutines/CoroutineContext;", "createConnectionContext", "(Landroidx/room/coroutines/PooledConnectionImpl;)Lkotlin/coroutines/CoroutineContext;", "", "onTimeout", "(Z)V", "close", "()V", "driver", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/room/coroutines/Pool;", "readers", "Landroidx/room/coroutines/Pool;", "writers", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "threadLocal", "Ljava/lang/ThreadLocal;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/TuitionPaymentFragmentbindingInflater1;", "_isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "()Z", "Lkotlin/time/Duration;", "timeout", "J", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "throwOnTimeout", "Z", "getThrowOnTimeout$room_runtime_release", "setThrowOnTimeout$room_runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectionPoolImpl implements ConnectionPool {
    private final AtomicBoolean _isClosed;
    private final SQLiteDriver driver;
    private final Pool readers;
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private boolean throwOnTimeout;
    private long timeout;
    private final Pool writers;

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 3, 3}, l = {116, 120, 138, 143}, m = "useConnection", n = {"this", "block", "pool", "connection", "currentContext", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1"})
    static final class AnonymousClass1<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    /* JADX INFO: renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m7352setTimeoutLRDsOJo$room_runtime_release(long j) {
        this.timeout = j;
    }

    /* JADX INFO: renamed from: getThrowOnTimeout$room_runtime_release, reason: from getter */
    public final boolean getThrowOnTimeout() {
        return this.throwOnTimeout;
    }

    public final void setThrowOnTimeout$room_runtime_release(boolean z) {
        this.throwOnTimeout = z;
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str) {
        Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        this.driver = sQLiteDriver;
        Pool pool = new Pool(1, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sQLiteDriver.open(str);
            }
        });
        this.readers = pool;
        this.writers = pool;
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        if (i <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Maximum number of writers must be greater than 0".toString());
        }
        this.driver = sQLiteDriver;
        this.readers = new Pool(i, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectionPoolImpl._init_$lambda$4(sQLiteDriver, str);
            }
        });
        this.writers = new Pool(i2, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sQLiteDriver.open(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) throws Exception {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x016b A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #5 {all -> 0x017c, blocks: (B:72:0x0165, B:74:0x016b), top: B:106:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    @Override // androidx.room.coroutines.ConnectionPool
    public final <R> Object useConnection(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        AnonymousClass1 anonymousClass1;
        Pool pool;
        Ref.ObjectRef objectRef;
        Throwable th;
        Pool pool2;
        ConnectionPoolImpl connectionPoolImpl;
        Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function3;
        Ref.ObjectRef objectRef2;
        Pool pool3;
        CoroutineContext coroutineContext;
        Ref.ObjectRef objectRef3;
        Throwable th2;
        PooledConnectionImpl pooledConnectionImpl;
        final boolean z2 = z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objTuitionPaymentFragmentbindingInflater1 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        boolean z3 = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                    return objTuitionPaymentFragmentbindingInflater1;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                    return objTuitionPaymentFragmentbindingInflater1;
                }
                if (i == 3) {
                    z2 = anonymousClass1.Z$0;
                    objectRef2 = (Ref.ObjectRef) anonymousClass1.L$5;
                    CoroutineContext coroutineContext2 = (CoroutineContext) anonymousClass1.L$4;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) anonymousClass1.L$3;
                    pool3 = (Pool) anonymousClass1.L$2;
                    function3 = (Function2) anonymousClass1.L$1;
                    connectionPoolImpl = (ConnectionPoolImpl) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                        coroutineContext = coroutineContext2;
                        objectRef = objectRef4;
                    } catch (Throwable th3) {
                        th2 = th3;
                        objectRef3 = objectRef4;
                        pool2 = pool3;
                        objectRef = objectRef3;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) anonymousClass1.L$1;
                    pool2 = (Pool) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                    } catch (Throwable th4) {
                        th2 = th4;
                        objectRef = objectRef3;
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            try {
                                PooledConnectionImpl pooledConnectionImpl2 = (PooledConnectionImpl) objectRef.element;
                                if (pooledConnectionImpl2 == null) {
                                    throw th5;
                                }
                                pooledConnectionImpl2.markRecycled();
                                pooledConnectionImpl2.getDelegate().markReleased();
                                pool2.recycle(pooledConnectionImpl2.getDelegate());
                                throw th5;
                            } catch (Throwable th6) {
                                ExceptionsKt.addSuppressed(th, th6);
                                throw th5;
                            }
                        }
                    }
                }
                try {
                    pooledConnectionImpl = (PooledConnectionImpl) objectRef3.element;
                    if (pooledConnectionImpl != null) {
                        pooledConnectionImpl.markRecycled();
                        pooledConnectionImpl.getDelegate().markReleased();
                        pool2.recycle(pooledConnectionImpl.getDelegate());
                    }
                } catch (Throwable unused) {
                }
                return objTuitionPaymentFragmentbindingInflater1;
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
            if (isClosed()) {
                SQLite.throwSQLiteException(21, "Connection pool is closed");
                throw new KotlinNothingValueException();
            }
            PooledConnectionImpl connectionWrapper = this.threadLocal.get();
            if (connectionWrapper == null) {
                ConnectionElement connectionElement = (ConnectionElement) anonymousClass1.get$context().get(ConnectionElement.INSTANCE);
                connectionWrapper = connectionElement != null ? connectionElement.getConnectionWrapper() : null;
            }
            if (connectionWrapper != null) {
                if (!z2 && connectionWrapper.getIsReadOnly()) {
                    SQLite.throwSQLiteException(1, "Cannot upgrade connection from reader to writer");
                    throw new KotlinNothingValueException();
                }
                if (anonymousClass1.get$context().get(ConnectionElement.INSTANCE) == null) {
                    CoroutineContext coroutineContextCreateConnectionContext = createConnectionContext(connectionWrapper);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(function2, connectionWrapper, null);
                    anonymousClass1.label = 1;
                    Object objTuitionPaymentFragmentbindingInflater2 = BuildersKt.TuitionPaymentFragmentbindingInflater1(coroutineContextCreateConnectionContext, anonymousClass2, anonymousClass1);
                    if (objTuitionPaymentFragmentbindingInflater2 != coroutine_suspended) {
                        return objTuitionPaymentFragmentbindingInflater2;
                    }
                } else {
                    anonymousClass1.label = 2;
                    Object objInvoke = function2.invoke(connectionWrapper, anonymousClass1);
                    if (objInvoke != coroutine_suspended) {
                        return objInvoke;
                    }
                }
            } else {
                if (z2) {
                    pool = this.readers;
                } else {
                    pool = this.writers;
                }
                objectRef = new Ref.ObjectRef();
                try {
                    CoroutineContext coroutineContext3 = anonymousClass1.get$context();
                    long j = this.timeout;
                    Function0<Unit> function0 = new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConnectionPoolImpl.useConnection$lambda$6(this.f$0, z2);
                        }
                    };
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = function2;
                    anonymousClass1.L$2 = pool;
                    anonymousClass1.L$3 = objectRef;
                    anonymousClass1.L$4 = coroutineContext3;
                    anonymousClass1.L$5 = objectRef;
                    anonymousClass1.Z$0 = z2;
                    anonymousClass1.label = 3;
                    Object objM7353acquireWithTimeoutKLykuaI = pool.m7353acquireWithTimeoutKLykuaI(j, function0, anonymousClass1);
                    if (objM7353acquireWithTimeoutKLykuaI != coroutine_suspended) {
                        connectionPoolImpl = this;
                        function3 = function2;
                        objectRef2 = objectRef;
                        pool3 = pool;
                        objTuitionPaymentFragmentbindingInflater1 = objM7353acquireWithTimeoutKLykuaI;
                        coroutineContext = coroutineContext3;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    pool2 = pool;
                    throw th;
                }
            }
            return coroutine_suspended;
            ConnectionWithLock connectionWithLockMarkAcquired = ((ConnectionWithLock) objTuitionPaymentFragmentbindingInflater1).markAcquired(coroutineContext);
            if (connectionPoolImpl.readers == connectionPoolImpl.writers || !z2) {
                z3 = false;
            }
            objectRef2.element = new PooledConnectionImpl(connectionWithLockMarkAcquired, z3);
            if (objectRef.element == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            CoroutineContext coroutineContextCreateConnectionContext2 = connectionPoolImpl.createConnectionContext((PooledConnectionImpl) objectRef.element);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(function3, objectRef, null);
            anonymousClass1.L$0 = pool3;
            anonymousClass1.L$1 = objectRef;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 4;
            objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(coroutineContextCreateConnectionContext2, anonymousClass4, anonymousClass1);
            if (objTuitionPaymentFragmentbindingInflater1 != coroutine_suspended) {
                objectRef3 = objectRef;
                pool2 = pool3;
                pooledConnectionImpl = (PooledConnectionImpl) objectRef3.element;
                if (pooledConnectionImpl != null) {
                    pooledConnectionImpl.markRecycled();
                    pooledConnectionImpl.getDelegate().markReleased();
                    pool2.recycle(pooledConnectionImpl.getDelegate());
                }
                return objTuitionPaymentFragmentbindingInflater1;
            }
            return coroutine_suspended;
        } catch (Throwable th8) {
            th2 = th8;
            objectRef3 = objectRef;
            pool2 = pool3;
            objectRef = objectRef3;
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function2<Transactor, Continuation<? super R>, Object> function2 = this.$block;
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = function2.invoke(pooledConnectionImpl, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, PooledConnectionImpl pooledConnectionImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$block, this.$confinedConnection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z) {
        connectionPoolImpl.onTimeout(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<PooledConnectionImpl> $connection;
        int label;

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.room.coroutines.ConnectionPoolImpl$useConnection$4<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r3.$block
                kotlin.jvm.internal.Ref$ObjectRef<androidx.room.coroutines.PooledConnectionImpl> r1 = r3.$connection
                T r1 = r1.element
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Ref.ObjectRef<PooledConnectionImpl> objectRef, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$connection = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$block, this.$connection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final CoroutineContext createConnectionContext(PooledConnectionImpl p0) {
        return new ConnectionElement(p0).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, p0));
    }

    private final void onTimeout(boolean p0) {
        String str = p0 ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Timed out attempting to acquire a ");
        sb2.append(str);
        sb2.append(" connection.");
        sb.append(sb2.toString());
        sb.append("\n\nWriter pool:\n");
        this.writers.dump(sb);
        sb.append("Reader pool:\n");
        this.readers.dump(sb);
        try {
            SQLite.throwSQLiteException(5, sb.toString());
            throw new KotlinNothingValueException();
        } catch (SQLException e2) {
            if (this.throwOnTimeout) {
                throw e2;
            }
            e2.printStackTrace();
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public final void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }
}
