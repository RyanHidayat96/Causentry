package androidx.work.impl;

import androidx.database.db.SupportSQLiteDatabase;
import androidx.room.RoomDatabase;
import androidx.work.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "Landroidx/work/Clock;", "p0", "<init>", "(Landroidx/work/Clock;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "onOpen", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "clock", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "", "getPruneDate", "()J", "pruneDate", "", "getPruneSQL", "()Ljava/lang/String;", "pruneSQL"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CleanupCallback extends RoomDatabase.Callback {
    private final Clock clock;

    public CleanupCallback(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "");
        this.clock = clock;
    }

    public final Clock getClock() {
        return this.clock;
    }

    private final String getPruneSQL() {
        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
        sb.append(getPruneDate());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    private final long getPruneDate() {
        return this.clock.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onOpen(p0);
        p0.beginTransaction();
        try {
            p0.execSQL(getPruneSQL());
            p0.setTransactionSuccessful();
        } finally {
            p0.endTransaction();
        }
    }
}
