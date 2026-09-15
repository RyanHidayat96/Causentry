package androidx.room.support;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteQuery;
import androidx.database.db.SupportSQLiteStatement;
import androidx.room.RoomDatabase;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001aH\u0017¢\u0006\u0004\b\u0018\u0010\u001cJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u0018\u0010\u001eJ!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b\u0018\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010!\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001aH\u0016¢\u0006\u0004\b!\u0010#J\u0010\u0010$\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010\u000fJ\u0018\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b%\u0010\u0013J\u0010\u0010&\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010\u000fJ6\u0010(\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b*\u0010\u000fJ\u0010\u0010,\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b,\u0010-J,\u0010.\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH\u0096\u0001¢\u0006\u0004\b.\u0010#J\u0010\u0010/\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b/\u0010-J(\u00102\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0006\u001a\u000200H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u00020\r2\u0006\u0010\u0002\u001a\u000208H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u0002012\u0006\u0010\u0002\u001a\u000201H\u0096\u0001¢\u0006\u0004\b=\u0010>JF\u0010A\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0006\u001a\u0002002\b\u0010?\u001a\u0004\u0018\u00010\t2\u0012\u0010@\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020+H\u0096\u0001¢\u0006\u0004\bC\u0010-J\u0018\u0010C\u001a\u00020+2\u0006\u0010\u0002\u001a\u000201H\u0096\u0001¢\u0006\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010O\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0L\u0018\u00010K8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020+8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010-R\u0014\u0010Q\u001a\u00020+8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010-R\u0014\u0010R\u001a\u00020+8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010-R\u0014\u0010S\u001a\u00020+8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010-R\u0014\u0010T\u001a\u00020+8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010-R\u0014\u0010U\u001a\u00020+8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010-R\u0014\u0010X\u001a\u0002018\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001c\u0010\\\u001a\u0002018\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\bY\u0010W\"\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0004\u0018\u00010\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001c\u0010c\u001a\u00020'8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010<"}, d2 = {"Landroidx/room/support/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "Landroidx/room/RoomDatabase$QueryCallback;", "p2", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Lkotlinx/coroutines/CoroutineScope;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "beginTransactionReadOnly", "beginTransactionWithListenerReadOnly", "close", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "()Z", "execPerConnectionSQL", "inTransaction", "Landroid/content/ContentValues;", "", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "needUpgrade", "(I)Z", "setForeignKeyConstraintsEnabled", "(Z)V", "Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "setMaxSqlCacheSize", "(I)V", "setMaximumSize", "(J)J", "p3", "p4", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "(J)Z", "delegate", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "queryCallbackScope", "Lkotlinx/coroutines/CoroutineScope;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", "getVersion", "()I", "setVersion", "version"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final CoroutineScope queryCallbackScope;

    public QueryInterceptorDatabase(SupportSQLiteDatabase supportSQLiteDatabase, CoroutineScope coroutineScope, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(queryCallback, "");
        this.delegate = supportSQLiteDatabase;
        this.queryCallbackScope = coroutineScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new QueryInterceptorStatement(this.delegate.compileStatement(p0), p0, this.queryCallbackScope, this.queryCallback);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransaction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransaction$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new AnonymousClass1(null), 3, null);
        this.delegate.beginTransaction();
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        C06681(Continuation<? super C06681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06681(null), 3, null);
        this.delegate.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        C06691(Continuation<? super C06691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06691(null), 3, null);
        this.delegate.beginTransactionWithListener(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        C06701(Continuation<? super C06701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06701(null), 3, null);
        this.delegate.beginTransactionWithListenerNonExclusive(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$endTransaction$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("END TRANSACTION", CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }

        C06711(Continuation<? super C06711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void endTransaction() {
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06711(null), 3, null);
        this.delegate.endTransaction();
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }

        C06751(Continuation<? super C06751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06751(null), 3, null);
        this.delegate.setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$query$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$query$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $query;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06731(String str, Continuation<? super C06731> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06731(this.$query, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06731(p0, null), 3, null);
        return this.delegate.query(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$query$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$query$2", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06742 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $query;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, this.$argsCopy);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06742(String str, List<? extends Object> list, Continuation<? super C06742> continuation) {
            super(2, continuation);
            this.$query = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06742(this.$query, this.$argsCopy, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06742(p0, ArraysKt.toList(p1), null), 3, null);
        return this.delegate.query(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        p0.bindTo(queryInterceptorProgram);
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new AnonymousClass3(p0, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$query$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$query$3", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getQuery(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new AnonymousClass3(this.$query, this.$queryInterceptorProgram, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery p0, CancellationSignal p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        p0.bindTo(queryInterceptorProgram);
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new AnonymousClass4(p0, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$query$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$query$4", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getQuery(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new AnonymousClass4(this.$query, this.$queryInterceptorProgram, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$execSQL$1", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sql;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06721(String str, Continuation<? super C06721> continuation) {
            super(2, continuation);
            this.$sql = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new C06721(this.$sql, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new C06721(p0, null), 3, null);
        this.delegate.execSQL(p0);
    }

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$execSQL$2", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $sql;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, this.$argsCopy);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, List<? extends Object> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sql = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorDatabase.this.new AnonymousClass2(this.$sql, this.$argsCopy, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        b.TuitionPaymentFragmentbindingInflater1(this.queryCallbackScope, null, null, new AnonymousClass2(p0, ArraysKt.toList(p1), null), 3, null);
        this.delegate.execSQL(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        this.delegate.beginTransactionReadOnly();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerReadOnly(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.beginTransactionWithListenerReadOnly(p0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int delete(String p0, String p1, Object[] p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.delegate.delete(p0, p1, p2);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execPerConnectionSQL(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.execPerConnectionSQL(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long insert(String p0, int p1, ContentValues p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.delegate.insert(p0, p1, p2);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int p0) {
        return this.delegate.needUpgrade(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean p0) {
        this.delegate.setForeignKeyConstraintsEnabled(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setLocale(Locale p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.setLocale(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int p0) {
        this.delegate.setMaxSqlCacheSize(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long setMaximumSize(long p0) {
        return this.delegate.setMaximumSize(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int update(String p0, int p1, ContentValues p2, String p3, Object[] p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.delegate.update(p0, p1, p2, p3, p4);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long p0) {
        return this.delegate.yieldIfContendedSafely(p0);
    }
}
