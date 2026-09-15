package androidx.room.coroutines;

import androidx.collection.CircularArray;
import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import defpackage.VideoEncoderInfoImplExternalSyntheticLambda0;
import defpackage.dynamicRangeToCodecProfileLevelForMime;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\n2\n\u0010\u0003\u001a\u00060\u0016j\u0002`\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u00060\"j\u0002`#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Landroidx/room/coroutines/Pool;", "", "", "p0", "Lkotlin/Function0;", "Landroidx/sqlite/SQLiteConnection;", "p1", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "Lkotlin/time/Duration;", "", "Landroidx/room/coroutines/ConnectionWithLock;", "acquireWithTimeout-KLykuaI", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireWithTimeout", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOpenNewConnectionLocked", "()V", "recycle", "(Landroidx/room/coroutines/ConnectionWithLock;)V", "close", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "dump", "(Ljava/lang/StringBuilder;)V", "capacity", "I", "getCapacity", "()I", "connectionFactory", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/b;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "size", "", "isClosed", "Z", "", "connections", "[Landroidx/room/coroutines/ConnectionWithLock;", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "connectionPermits", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "Landroidx/collection/CircularArray;", "availableConnections", "Landroidx/collection/CircularArray;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Pool {
    private final CircularArray<ConnectionWithLock> availableConnections;
    private final int capacity;
    private final Function0<SQLiteConnection> connectionFactory;
    private final VideoEncoderInfoImplExternalSyntheticLambda0 connectionPermits;
    private final ConnectionWithLock[] connections;
    private boolean isClosed;
    private final ReentrantLock lock;
    private int size;

    /* JADX INFO: renamed from: androidx.room.coroutines.Pool$acquire$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0}, l = {231}, m = "acquire", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Pool.this.acquire(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pool(int i, Function0<? extends SQLiteConnection> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.capacity = i;
        this.connectionFactory = function0;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionWithLock[i];
        this.connectionPermits = dynamicRangeToCodecProfileLevelForMime.b(i);
        this.availableConnections = new CircularArray<>(i);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final Function0<SQLiteConnection> getConnectionFactory() {
        return this.connectionFactory;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:30:0x0079, B:34:0x0081, B:36:0x0085, B:39:0x008a), top: B:48:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:30:0x0079, B:34:0x0081, B:36:0x0085, B:39:0x008a), top: B:48:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:30:0x0079, B:34:0x0081, B:36:0x0085, B:39:0x008a), top: B:48:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:24:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0064
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: acquireWithTimeout-KLykuaI, reason: not valid java name */
    public final java.lang.Object m7353acquireWithTimeoutKLykuaI(long r9, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.coroutines.Continuation<? super androidx.room.coroutines.ConnectionWithLock> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 + r2
            r0.label = r12
            goto L19
        L14:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r0.<init>(r8, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            long r9 = r0.J$0
            java.lang.Object r11 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r5 = r0.L$0
            androidx.room.coroutines.Pool r5 = (androidx.room.coroutines.Pool) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L39
            goto L66
        L39:
            r12 = move-exception
            goto L70
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r8
        L47:
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r12, r5, r3)     // Catch: java.lang.Throwable -> L6b
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Throwable -> L6b
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6b
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L6b
            r0.L$2 = r12     // Catch: java.lang.Throwable -> L6b
            r0.J$0 = r9     // Catch: java.lang.Throwable -> L6b
            r0.label = r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r2 = kotlinx.coroutines.TimeoutKt.TuitionPaymentFragmentbindingInflater1(r9, r2, r0)     // Catch: java.lang.Throwable -> L6b
            if (r2 != r1) goto L64
            return r1
        L64:
            r2 = r11
            r11 = r12
        L66:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r3
            goto L75
        L6b:
            r2 = move-exception
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
        L70:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L75:
            boolean r6 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r6 == 0) goto L7f
            r11.invoke()     // Catch: java.lang.Throwable -> L7d
            goto L88
        L7d:
            r9 = move-exception
            goto L8b
        L7f:
            if (r0 != 0) goto L8a
            T r0 = r12.element     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L88
            T r9 = r12.element     // Catch: java.lang.Throwable -> L7d
            return r9
        L88:
            r0 = r2
            goto L47
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L7d
        L8b:
            T r10 = r12.element
            androidx.room.coroutines.ConnectionWithLock r10 = (androidx.room.coroutines.ConnectionWithLock) r10
            if (r10 == 0) goto L94
            r5.recycle(r10)
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.m7353acquireWithTimeoutKLykuaI(long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object acquire(Continuation<? super ConnectionWithLock> continuation) {
        AnonymousClass1 anonymousClass1;
        Pool pool;
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
            VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0 = this.connectionPermits;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (videoEncoderInfoImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pool = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pool = (Pool) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            ReentrantLock reentrantLock = pool.lock;
            reentrantLock.lock();
            try {
                if (pool.isClosed) {
                    SQLite.throwSQLiteException(21, "Connection pool is closed");
                    throw new KotlinNothingValueException();
                }
                if (pool.availableConnections.isEmpty()) {
                    pool.tryOpenNewConnectionLocked();
                }
                ConnectionWithLock connectionWithLockPopFirst = pool.availableConnections.popFirst();
                reentrantLock.unlock();
                return connectionWithLockPopFirst;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            pool.connectionPermits.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void tryOpenNewConnectionLocked() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionWithLock connectionWithLock = new ConnectionWithLock(this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        ConnectionWithLock[] connectionWithLockArr = this.connections;
        int i = this.size;
        this.size = i + 1;
        connectionWithLockArr[i] = connectionWithLock;
        this.availableConnections.addLast(connectionWithLock);
    }

    public final void recycle(ConnectionWithLock p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(p0);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.connectionPermits.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dump(StringBuilder p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int size = this.availableConnections.size();
            for (int i = 0; i < size; i++) {
                listCreateListBuilder.add(this.availableConnections.get(i));
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            StringBuilder sb = new StringBuilder();
            sb.append('\t');
            sb.append(super.toString());
            sb.append(" (");
            p0.append(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("capacity=");
            sb2.append(this.capacity);
            sb2.append(", ");
            p0.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            sb3.append(this.connectionPermits.b());
            sb3.append(", ");
            p0.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("queue=(size=");
            sb4.append(listBuild.size());
            sb4.append(")[");
            sb4.append(CollectionsKt.joinToString$default(listBuild, null, null, null, 0, null, null, 63, null));
            sb4.append("], ");
            p0.append(sb4.toString());
            p0.append(")\n");
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i3];
                i2++;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("\t\t[");
                sb5.append(i2);
                sb5.append("] - ");
                sb5.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                p0.append(sb5.toString());
                p0.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(p0);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
