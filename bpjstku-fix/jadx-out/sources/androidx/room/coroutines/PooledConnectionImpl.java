package androidx.room.coroutines;

import android.database.SQLException;
import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import defpackage.VideoEncoderConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u000389:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0004\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0004\u001a\u00020\u000f2-\u0010\u0006\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f2-\u0010\u0006\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0082@¢\u0006\u0004\b\u001c\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0082H¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u00060/j\u0002`08\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00107\u001a\u0002048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "Landroidx/room/coroutines/ConnectionWithLock;", "p0", "", "p1", "<init>", "(Landroidx/room/coroutines/ConnectionWithLock;Z)V", "R", "", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "usePrepared", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/Transactor$SQLiteTransactionType;", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "withTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inTransaction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markRecycled", "()V", "transaction", "beginTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endTransaction", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "withStateCheck", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delegate", "Landroidx/room/coroutines/ConnectionWithLock;", "getDelegate", "()Landroidx/room/coroutines/ConnectionWithLock;", "isReadOnly", "Z", "()Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "transactionStack", "Lkotlin/collections/ArrayDeque;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/TuitionPaymentFragmentbindingInflater1;", "_isRecycled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecycled", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "TransactionItem", "TransactionImpl", "StatementWrapper"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {
    private final AtomicBoolean _isRecycled;
    private final ConnectionWithLock delegate;
    private final boolean isReadOnly;
    private final ArrayDeque<TransactionItem> transactionStack;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.beginTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "endTransaction", n = {"this", "$this$withLock_u24default$iv", "success"}, s = {"L$0", "L$1", "Z$0"})
    static final class C06651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C06651(Continuation<? super C06651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.endTransaction(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$transaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 1, 1, 4}, l = {395, 399, 412, 412, 412}, m = "transaction", n = {"this", "block", "this", "success", "exception"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0"})
    static final class C06661<R> extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C06661(Continuation<? super C06661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.transaction(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$usePrepared$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {573}, m = "usePrepared", n = {"this", "sql", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C06671<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C06671(Continuation<? super C06671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.usePrepared(null, null, this);
        }
    }

    public PooledConnectionImpl(ConnectionWithLock connectionWithLock, boolean z) {
        Intrinsics.checkNotNullParameter(connectionWithLock, "");
        this.delegate = connectionWithLock;
        this.isReadOnly = z;
        this.transactionStack = new ArrayDeque<>();
        this._isRecycled = new AtomicBoolean(false);
    }

    public final ConnectionWithLock getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: isReadOnly, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecycled() {
        return this._isRecycled.get();
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public final SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.room.PooledConnection
    public final <R> Object usePrepared(String str, Function1<? super SQLiteStatement, ? extends R> function1, Continuation<? super R> continuation) {
        C06671 c06671;
        ConnectionWithLock connectionWithLock;
        PooledConnectionImpl pooledConnectionImpl;
        if (continuation instanceof C06671) {
            c06671 = (C06671) continuation;
            if ((c06671.label & Integer.MIN_VALUE) != 0) {
                c06671.label -= Integer.MIN_VALUE;
            } else {
                c06671 = new C06671(continuation);
            }
        } else {
            c06671 = new C06671(continuation);
        }
        Object obj = c06671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06671.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (isRecycled()) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            ConnectionElement connectionElement = (ConnectionElement) c06671.get$context().get(ConnectionElement.INSTANCE);
            if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
                connectionWithLock = this.delegate;
                c06671.L$0 = this;
                c06671.L$1 = str;
                c06671.L$2 = function1;
                c06671.L$3 = connectionWithLock;
                c06671.label = 1;
                if (connectionWithLock.lock(null, c06671) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pooledConnectionImpl = this;
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
                throw new KotlinNothingValueException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) c06671.L$3;
            function1 = (Function1) c06671.L$2;
            String str2 = (String) c06671.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) c06671.L$0;
            ResultKt.throwOnFailure(obj);
            connectionWithLock = videoEncoderConfig;
            str = str2;
        }
        try {
            StatementWrapper statementWrapper = new StatementWrapper(pooledConnectionImpl, pooledConnectionImpl.delegate.prepare(str));
            try {
                R rInvoke = function1.invoke(statementWrapper);
                AutoCloseableKt.closeFinally(statementWrapper, null);
                connectionWithLock.unlock(null);
                return rInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(statementWrapper, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            connectionWithLock.unlock(null);
            throw th3;
        }
    }

    public final void markRecycled() throws Exception {
        if (this._isRecycled.compareAndSet(false, true)) {
            try {
                SQLite.execSQL(this.delegate, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
    
        if (r13.endTransaction(false, r0) == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.room.coroutines.PooledConnectionImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r12, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super R> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.transaction(androidx.room.Transactor$SQLiteTransactionType, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object beginTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        ConnectionWithLock connectionWithLock;
        PooledConnectionImpl pooledConnectionImpl;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            connectionWithLock = this.delegate;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = sQLiteTransactionType;
            anonymousClass1.L$2 = connectionWithLock;
            anonymousClass1.label = 1;
            if (connectionWithLock.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) anonymousClass1.L$2;
            Transactor.SQLiteTransactionType sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) anonymousClass1.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            connectionWithLock = videoEncoderConfig;
            sQLiteTransactionType = sQLiteTransactionType2;
        }
        try {
            int size = pooledConnectionImpl.transactionStack.size();
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                if (i2 == 1) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i2 == 2) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                ConnectionWithLock connectionWithLock2 = pooledConnectionImpl.delegate;
                StringBuilder sb = new StringBuilder("SAVEPOINT '");
                sb.append(size);
                sb.append('\'');
                SQLite.execSQL(connectionWithLock2, sb.toString());
            }
            pooledConnectionImpl.transactionStack.addLast(new TransactionItem(size, false));
            Unit unit = Unit.INSTANCE;
            connectionWithLock.unlock(null);
            return unit;
        } catch (Throwable th) {
            connectionWithLock.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object endTransaction(boolean z, Continuation<? super Unit> continuation) {
        C06651 c06651;
        PooledConnectionImpl pooledConnectionImpl;
        VideoEncoderConfig videoEncoderConfig;
        if (continuation instanceof C06651) {
            c06651 = (C06651) continuation;
            if ((c06651.label & Integer.MIN_VALUE) != 0) {
                c06651.label -= Integer.MIN_VALUE;
            } else {
                c06651 = new C06651(continuation);
            }
        } else {
            c06651 = new C06651(continuation);
        }
        Object obj = c06651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06651.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConnectionWithLock connectionWithLock = this.delegate;
            c06651.L$0 = this;
            c06651.L$1 = connectionWithLock;
            c06651.Z$0 = z;
            c06651.label = 1;
            if (connectionWithLock.lock(null, c06651) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
            videoEncoderConfig = connectionWithLock;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c06651.Z$0;
            videoEncoderConfig = (VideoEncoderConfig) c06651.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) c06651.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction".toString());
            }
            TransactionItem transactionItem = (TransactionItem) CollectionsKt.removeLast(pooledConnectionImpl.transactionStack);
            if (z && !transactionItem.getShouldRollback()) {
                if (pooledConnectionImpl.transactionStack.isEmpty()) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "END TRANSACTION");
                } else {
                    ConnectionWithLock connectionWithLock2 = pooledConnectionImpl.delegate;
                    StringBuilder sb = new StringBuilder("RELEASE SAVEPOINT '");
                    sb.append(transactionItem.getId());
                    sb.append('\'');
                    SQLite.execSQL(connectionWithLock2, sb.toString());
                }
            } else if (pooledConnectionImpl.transactionStack.isEmpty()) {
                SQLite.execSQL(pooledConnectionImpl.delegate, "ROLLBACK TRANSACTION");
            } else {
                ConnectionWithLock connectionWithLock3 = pooledConnectionImpl.delegate;
                StringBuilder sb2 = new StringBuilder("ROLLBACK TRANSACTION TO SAVEPOINT '");
                sb2.append(transactionItem.getId());
                sb2.append('\'');
                SQLite.execSQL(connectionWithLock3, sb2.toString());
            }
            Unit unit = Unit.INSTANCE;
            videoEncoderConfig.unlock(null);
            return unit;
        } catch (Throwable th) {
            videoEncoderConfig.unlock(null);
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "", "", "p0", "", "p1", "<init>", "(IZ)V", "id", "I", "getId", "()I", "shouldRollback", "Z", "getShouldRollback", "()Z", "setShouldRollback", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TransactionItem {
        private final int id;
        private boolean shouldRollback;

        public TransactionItem(int i, boolean z) {
            this.id = i;
            this.shouldRollback = z;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public final void setShouldRollback(boolean z) {
            this.shouldRollback = z;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;)V", "R", "", "p0", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "p1", "usePrepared", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "withNestedTransaction", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rollback", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public final SQLiteConnection getRawConnection() {
            return PooledConnectionImpl.this.getRawConnection();
        }

        @Override // androidx.room.PooledConnection
        public final <R> Object usePrepared(String str, Function1<? super SQLiteStatement, ? extends R> function1, Continuation<? super R> continuation) {
            return PooledConnectionImpl.this.usePrepared(str, function1, continuation);
        }

        @Override // androidx.room.TransactionScope
        public final <R> Object withNestedTransaction(Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
            PooledConnectionImpl pooledConnectionImpl = PooledConnectionImpl.this;
            if (pooledConnectionImpl.isRecycled()) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            ConnectionElement connectionElement = (ConnectionElement) continuation.get$context().get(ConnectionElement.INSTANCE);
            if (connectionElement != null && connectionElement.getConnectionWrapper() == pooledConnectionImpl) {
                return pooledConnectionImpl.transaction(null, function2, continuation);
            }
            SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // androidx.room.TransactionScope
        public final Object rollback(T t, Continuation<?> continuation) throws ConnectionPool.RollbackException {
            PooledConnectionImpl$TransactionImpl$rollback$1 pooledConnectionImpl$TransactionImpl$rollback$1;
            Object obj;
            PooledConnectionImpl pooledConnectionImpl;
            VideoEncoderConfig videoEncoderConfig;
            if (continuation instanceof PooledConnectionImpl$TransactionImpl$rollback$1) {
                pooledConnectionImpl$TransactionImpl$rollback$1 = (PooledConnectionImpl$TransactionImpl$rollback$1) continuation;
                if ((pooledConnectionImpl$TransactionImpl$rollback$1.label & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$TransactionImpl$rollback$1.label -= Integer.MIN_VALUE;
                } else {
                    pooledConnectionImpl$TransactionImpl$rollback$1 = new PooledConnectionImpl$TransactionImpl$rollback$1(this, continuation);
                }
            } else {
                pooledConnectionImpl$TransactionImpl$rollback$1 = new PooledConnectionImpl$TransactionImpl$rollback$1(this, continuation);
            }
            Object obj2 = pooledConnectionImpl$TransactionImpl$rollback$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = pooledConnectionImpl$TransactionImpl$rollback$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                PooledConnectionImpl pooledConnectionImpl2 = PooledConnectionImpl.this;
                if (pooledConnectionImpl2.isRecycled()) {
                    SQLite.throwSQLiteException(21, "Connection is recycled");
                    throw new KotlinNothingValueException();
                }
                ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$TransactionImpl$rollback$1.get$context().get(ConnectionElement.INSTANCE);
                if (connectionElement != null && connectionElement.getConnectionWrapper() == pooledConnectionImpl2) {
                    if (pooledConnectionImpl2.transactionStack.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction".toString());
                    }
                    ConnectionWithLock delegate = pooledConnectionImpl2.getDelegate();
                    pooledConnectionImpl$TransactionImpl$rollback$1.L$0 = t;
                    pooledConnectionImpl$TransactionImpl$rollback$1.L$1 = pooledConnectionImpl2;
                    pooledConnectionImpl$TransactionImpl$rollback$1.L$2 = delegate;
                    pooledConnectionImpl$TransactionImpl$rollback$1.label = 1;
                    if (delegate.lock(null, pooledConnectionImpl$TransactionImpl$rollback$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = t;
                    pooledConnectionImpl = pooledConnectionImpl2;
                    videoEncoderConfig = delegate;
                } else {
                    SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
                    throw new KotlinNothingValueException();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoEncoderConfig = (VideoEncoderConfig) pooledConnectionImpl$TransactionImpl$rollback$1.L$2;
                pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$TransactionImpl$rollback$1.L$1;
                obj = pooledConnectionImpl$TransactionImpl$rollback$1.L$0;
                ResultKt.throwOnFailure(obj2);
            }
            try {
                ((TransactionItem) pooledConnectionImpl.transactionStack.last()).setShouldRollback(true);
                Unit unit = Unit.INSTANCE;
                throw new ConnectionPool.RollbackException(obj);
            } finally {
                videoEncoderConfig.unlock(null);
            }
        }
    }

    private final <R> Object withStateCheck(Function0<? extends R> function0, Continuation<? super R> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010)J$\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0082\b¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$StatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "p0", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;Landroidx/sqlite/SQLiteStatement;)V", "", "", "p1", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "R", "Lkotlin/Function0;", "withStateCheck", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "delegate", "Landroidx/sqlite/SQLiteStatement;", "threadId", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class StatementWrapper implements SQLiteStatement {
        private final SQLiteStatement delegate;
        final /* synthetic */ PooledConnectionImpl this$0;
        private final long threadId;

        public StatementWrapper(PooledConnectionImpl pooledConnectionImpl, SQLiteStatement sQLiteStatement) {
            Intrinsics.checkNotNullParameter(sQLiteStatement, "");
            this.this$0 = pooledConnectionImpl;
            this.delegate = sQLiteStatement;
            this.threadId = ThreadLocal_jvmAndroidKt.currentThreadId();
        }

        private final <R> R withStateCheck(Function0<? extends R> p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId != ThreadLocal_jvmAndroidKt.currentThreadId()) {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
            return p0.invoke();
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public final void mo7354bindBlob(int p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7354bindBlob(p0, p1);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public final void mo7355bindDouble(int p0, double p1) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7355bindDouble(p0, p1);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public final void mo7356bindLong(int p0, long p1) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7356bindLong(p0, p1);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public final void mo7358bindText(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7358bindText(p0, p1);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public final void mo7357bindNull(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7357bindNull(p0);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getBlob(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getDouble(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getLong(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final String getText(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getText(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.isNull(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnCount();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final String getColumnName(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnName(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnType(p0);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.step();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.reset();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public final void mo7359clearBindings() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo7359clearBindings();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.close();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // androidx.room.Transactor
    public final <R> Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.get$context().get(ConnectionElement.INSTANCE);
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return transaction(sQLiteTransactionType, function2, continuation);
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.Transactor
    public final Object inTransaction(Continuation<? super Boolean> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.get$context().get(ConnectionElement.INSTANCE);
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return Boxing.boxBoolean(!this.transactionStack.isEmpty());
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }
}
