package androidx.room.coroutines;

import androidx.database.SQLiteDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/sqlite/SQLiteDriver;", "p0", "", "p1", "Landroidx/room/coroutines/ConnectionPool;", "newSingleConnectionPool", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)Landroidx/room/coroutines/ConnectionPool;", "", "p2", "p3", "newConnectionPool", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;II)Landroidx/room/coroutines/ConnectionPool;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConnectionPoolKt {
    public static final ConnectionPool newSingleConnectionPool(SQLiteDriver sQLiteDriver, String str) {
        Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ConnectionPoolImpl(sQLiteDriver, str);
    }

    public static final ConnectionPool newConnectionPool(SQLiteDriver sQLiteDriver, String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ConnectionPoolImpl(sQLiteDriver, str, i, i2);
    }
}
