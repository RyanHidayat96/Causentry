package androidx.database;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\f"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "", "p0", "", "execSQL", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V", "", "p1", "", "throwSQLiteException", "(ILjava/lang/String;)Ljava/lang/Void;", "SQLITE_DATA_INTEGER", "I", "SQLITE_DATA_FLOAT", "SQLITE_DATA_TEXT", "SQLITE_DATA_BLOB", "SQLITE_DATA_NULL"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(SQLiteConnection sQLiteConnection, String str) throws Exception {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(str, "");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final Void throwSQLiteException(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: ".concat(String.valueOf(i)));
        if (str != null) {
            sb.append(", message: ".concat(String.valueOf(str)));
        }
        throw new SQLException(sb.toString());
    }
}
