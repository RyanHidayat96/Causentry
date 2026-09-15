package androidx.room.migration;

import androidx.database.SQLiteConnection;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.room.driver.SupportSQLiteConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/migration/AutoMigrationSpec;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "onPostMigrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/sqlite/SQLiteConnection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AutoMigrationSpec {
    default void onPostMigrate(SQLiteConnection p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 instanceof SupportSQLiteConnection) {
            onPostMigrate(((SupportSQLiteConnection) p0).getDb());
        }
    }

    default void onPostMigrate(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
