package androidx.database.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import com.google.android.gms.actions.SearchIntents;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0017H&¢\u0006\u0004\b\u0016\u0010\u0018J+\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0017H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J)\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H'¢\u0006\u0004\b!\u0010#J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b!\u0010%J!\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020$2\b\u0010\u001b\u001a\u0004\u0018\u00010&H'¢\u0006\u0004\b!\u0010'J'\u0010+\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020(2\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0012\u0010*\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H&¢\u0006\u0004\b-\u0010.JE\u00101\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020(2\u0006\u0010*\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0012\u00100\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b3\u00104J)\u00103\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H&¢\u0006\u0004\b3\u0010\u001dJ\u0017\u00105\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020(H&¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020(H&¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H&¢\u0006\u0004\b>\u0010\u0015J\u000f\u0010?\u001a\u00020\u0007H&¢\u0006\u0004\b?\u0010\tR\u0014\u0010@\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0015R\u0014\u0010A\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0015R\u001c\u0010E\u001a\u00020(8'@'X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010;R\u0014\u0010H\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001c\u0010L\u001a\u00020\u00178'@'X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010G\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0015R\u0014\u0010N\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0015R\u0016\u0010Q\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0015R(\u0010W\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020T\u0018\u00010S8'X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "", "p0", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "beginTransactionReadOnly", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "beginTransactionWithListenerReadOnly", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "(J)Z", "", "", "p1", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "setMaximumSize", "(J)J", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "", "Landroid/content/ContentValues;", "p2", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "p3", "p4", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "setMaxSqlCacheSize", "(I)V", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "getVersion", "()I", "setVersion", "version", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(SQLiteTransactionListener p0);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener p0);

    SupportSQLiteStatement compileStatement(String p0);

    int delete(String p0, String p1, Object[] p2);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(String p0) throws SQLException;

    void execSQL(String p0, Object[] p1) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String p0, int p1, ContentValues p2) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int p0);

    Cursor query(SupportSQLiteQuery p0);

    Cursor query(SupportSQLiteQuery p0, CancellationSignal p1);

    Cursor query(String p0);

    Cursor query(String p0, Object[] p1);

    void setForeignKeyConstraintsEnabled(boolean p0);

    void setLocale(Locale p0);

    void setMaxSqlCacheSize(int p0);

    long setMaximumSize(long p0);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(String p0, int p1, ContentValues p2, String p3, Object[] p4);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long p0);

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    default void beginTransactionWithListenerReadOnly(SQLiteTransactionListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        beginTransactionWithListener(p0);
    }

    default void execPerConnectionSQL(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new UnsupportedOperationException();
    }
}
