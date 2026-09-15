package androidx.room.util;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "p0", "", "getLastInsertedRowId", "(Landroidx/sqlite/SQLiteConnection;)J", "", "getTotalChangedRows", "(Landroidx/sqlite/SQLiteConnection;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SQLiteConnectionUtil {
    public static final long getLastInsertedRowId(SQLiteConnection sQLiteConnection) throws Exception {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        if (getTotalChangedRows(sQLiteConnection) == 0) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT last_insert_rowid()");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            long j = sQLiteStatement.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final int getTotalChangedRows(SQLiteConnection sQLiteConnection) throws Exception {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            int i = (int) sQLiteStatement.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
