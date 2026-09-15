package androidx.room.driver;

import androidx.database.SQLiteConnection;
import androidx.database.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/room/driver/SupportSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "Landroidx/room/driver/SupportSQLiteStatement;", "prepare", "(Ljava/lang/String;)Landroidx/room/driver/SupportSQLiteStatement;", "", "close", "()V", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDb", "()Landroidx/sqlite/db/SupportSQLiteDatabase;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportSQLiteConnection implements SQLiteConnection {
    private final SupportSQLiteDatabase db;

    public SupportSQLiteConnection(SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        this.db = supportSQLiteDatabase;
    }

    public final SupportSQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.database.SQLiteConnection
    public final SupportSQLiteStatement prepare(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return SupportSQLiteStatement.INSTANCE.create(this.db, p0);
    }

    @Override // androidx.database.SQLiteConnection, java.lang.AutoCloseable
    public final void close() {
        this.db.close();
    }
}
