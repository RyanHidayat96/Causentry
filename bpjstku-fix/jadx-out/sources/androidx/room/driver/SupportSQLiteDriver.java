package androidx.room.driver;

import androidx.database.SQLiteDriver;
import androidx.database.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/room/driver/SupportSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "p0", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "", "Landroidx/room/driver/SupportSQLiteConnection;", "open", "(Ljava/lang/String;)Landroidx/room/driver/SupportSQLiteConnection;", "openHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportSQLiteDriver implements SQLiteDriver {
    private final SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "");
        this.openHelper = supportSQLiteOpenHelper;
    }

    public final SupportSQLiteOpenHelper getOpenHelper() {
        return this.openHelper;
    }

    @Override // androidx.database.SQLiteDriver
    public final SupportSQLiteConnection open(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new SupportSQLiteConnection(this.openHelper.getWritableDatabase());
    }
}
