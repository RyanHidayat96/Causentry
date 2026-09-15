package androidx.database.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.database.db.SimpleSQLiteQuery;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteQuery;
import androidx.database.db.SupportSQLiteStatement;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 b2\u00020\u0001:\u0002cbB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010 \u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010&J)\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00062\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001fH\u0017¢\u0006\u0004\b%\u0010'J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b%\u0010)J!\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020(2\b\u0010!\u001a\u0004\u0018\u00010*H\u0017¢\u0006\u0004\b%\u0010+J'\u0010/\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020,2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0012\u0010.\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010 \u0018\u00010\u001fH\u0016¢\u0006\u0004\b1\u00102JE\u00105\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020,2\u0006\u0010.\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u00010\u00062\u0012\u00104\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010 \u0018\u00010\u001fH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00108J)\u00107\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001fH\u0016¢\u0006\u0004\b7\u0010#J\u0017\u00109\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020,H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020,H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0017H\u0016¢\u0006\u0004\bB\u0010\u0019J\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010\fJ\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010\fJ\u0015\u0010E\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0019R$\u0010M\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010?R$\u0010Q\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\b\u001d\u0010PR\u0014\u0010R\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0019R$\u0010U\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010O\"\u0004\bT\u0010PR\u0014\u0010V\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0019R\u0014\u0010W\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0019R\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0019R(\u0010`\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060]\u0018\u00010\\8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0019"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "beginTransactionReadOnly", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "beginTransactionWithListenerReadOnly", "internalBeginTransactionWithListenerReadOnly", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "(J)Z", "setMaximumSize", "(J)J", "", "", "p1", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "", "Landroid/content/ContentValues;", "p2", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "p3", "p4", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "setMaxSqlCacheSize", "(I)V", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "isDelegate", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "delegate", "Landroid/database/sqlite/SQLiteDatabase;", "isDbLockedByCurrentThread", "getVersion", "()I", "setVersion", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "isExecPerConnectionSQLSupported", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Companion", "Api30Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    private final SQLiteDatabase delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final Lazy<Method> getThreadSessionMethod$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
        }
    });
    private static final Lazy<Method> beginTransactionMethod$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
        }
    });

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        this.delegate = sQLiteDatabase;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(p0);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() throws IllegalAccessException, InvocationTargetException {
        internalBeginTransactionWithListenerReadOnly(null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.beginTransactionWithListener(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.beginTransactionWithListenerNonExclusive(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerReadOnly(SQLiteTransactionListener p0) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(p0, "");
        internalBeginTransactionWithListenerReadOnly(p0);
    }

    private final void internalBeginTransactionWithListenerReadOnly(SQLiteTransactionListener p0) throws IllegalAccessException, InvocationTargetException {
        Companion companion = INSTANCE;
        if (companion.getBeginTransactionMethod() == null || companion.getGetThreadSessionMethod() == null) {
            if (p0 != null) {
                beginTransactionWithListener(p0);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method beginTransactionMethod = companion.getBeginTransactionMethod();
        Intrinsics.checkNotNull(beginTransactionMethod);
        Method getThreadSessionMethod = companion.getGetThreadSessionMethod();
        Intrinsics.checkNotNull(getThreadSessionMethod);
        Object objInvoke = getThreadSessionMethod.invoke(this.delegate, new Object[0]);
        if (objInvoke != null) {
            beginTransactionMethod.invoke(objInvoke, 0, p0, 0, null);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long p0) {
        return this.delegate.yieldIfContendedSafely(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    /* JADX INFO: renamed from: setMaximumSize, reason: collision with other method in class */
    public final void m7496setMaximumSize(long j) {
        this.delegate.setMaximumSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long setMaximumSize(long p0) {
        this.delegate.setMaximumSize(p0);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execPerConnectionSQL(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, p0, p1);
        } else {
            StringBuilder sb = new StringBuilder("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: ");
            sb.append(Build.VERSION.SDK_INT);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return query(new SimpleSQLiteQuery(p0));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return query(new SimpleSQLiteQuery(p0, p1));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(final SupportSQLiteQuery p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Function4 function4 = new Function4() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return FrameworkSQLiteDatabase.query$lambda$0(p0, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$1(function4, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, p0.getQuery(), EMPTY_STRING_ARRAY, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "");
        return cursorRawQueryWithFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor query$lambda$0(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNull(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(Function4 function4, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) function4.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final Cursor query(final SupportSQLiteQuery p0, CancellationSignal p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$2(p0, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        String query = p0.getQuery();
        String[] strArr = EMPTY_STRING_ARRAY;
        Intrinsics.checkNotNull(p1);
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, query, strArr, null, p1);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "");
        return cursorRawQueryWithFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$2(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNull(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long insert(String p0, int p1, ContentValues p2) throws SQLException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.delegate.insertWithOnConflict(p0, null, p2, p1);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int delete(String p0, String p1, Object[] p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(p0);
        String str = p1;
        if (str != null && str.length() != 0) {
            sb.append(" WHERE ");
            sb.append(p1);
        }
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb.toString());
        SimpleSQLiteQuery.INSTANCE.bind(supportSQLiteStatementCompileStatement, p2);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int update(String p0, int p1, ContentValues p2, String p3, Object[] p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (p2.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = p2.size();
        int length = p4 == null ? size : p4.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(CONFLICT_VALUES[p1]);
        sb.append(p0);
        sb.append(" SET ");
        int i = 0;
        for (String str : p2.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr[i] = p2.get(str);
            sb.append("=?");
            i++;
        }
        if (p4 != null) {
            for (int i2 = size; i2 < length; i2++) {
                objArr[i2] = p4[i2 - size];
            }
        }
        if (!TextUtils.isEmpty(p3)) {
            sb.append(" WHERE ");
            sb.append(p3);
        }
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb.toString());
        SimpleSQLiteQuery.INSTANCE.bind(supportSQLiteStatementCompileStatement, objArr);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(String p0) throws SQLException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.delegate.execSQL(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(String p0, Object[] p1) throws SQLException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.delegate.execSQL(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int p0) {
        return this.delegate.needUpgrade(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.delegate.getPath();
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
    public final void setForeignKeyConstraintsEnabled(boolean p0) {
        this.delegate.setForeignKeyConstraintsEnabled(p0);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.delegate.close();
    }

    public final boolean isDelegate(SQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return Intrinsics.areEqual(this.delegate, p0);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "", "p2", "", "execPerConnectionSQL", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(SQLiteDatabase p0, String p1, Object[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            p0.execPerConnectionSQL(p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\t8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "<init>", "()V", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Lkotlin/Lazy;", "getGetThreadSessionMethod", "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "getBeginTransactionMethod", "beginTransactionMethod"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetThreadSessionMethod() {
            return (Method) FrameworkSQLiteDatabase.getThreadSessionMethod$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getBeginTransactionMethod() {
            return (Method) FrameworkSQLiteDatabase.beginTransactionMethod$delegate.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getThreadSessionMethod_delegate$lambda$7() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method beginTransactionMethod_delegate$lambda$8() {
        Class<?> returnType;
        try {
            Method getThreadSessionMethod = INSTANCE.getGetThreadSessionMethod();
            if (getThreadSessionMethod == null || (returnType = getThreadSessionMethod.getReturnType()) == null) {
                return null;
            }
            return returnType.getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
