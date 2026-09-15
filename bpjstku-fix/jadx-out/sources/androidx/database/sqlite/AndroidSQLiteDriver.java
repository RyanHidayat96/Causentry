package androidx.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "<init>", "()V", "", "p0", "Landroidx/sqlite/SQLiteConnection;", "open", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteConnection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSQLiteDriver implements SQLiteDriver {
    @Override // androidx.database.SQLiteDriver
    public final SQLiteConnection open(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(p0, (SQLiteDatabase.CursorFactory) null);
        Intrinsics.checkNotNull(sQLiteDatabaseOpenOrCreateDatabase);
        return new AndroidSQLiteConnection(sQLiteDatabaseOpenOrCreateDatabase);
    }
}
