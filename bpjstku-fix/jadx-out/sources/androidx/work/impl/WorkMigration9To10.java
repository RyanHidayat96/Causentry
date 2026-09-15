package androidx.work.impl;

import android.content.Context;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.room.migration.Migration;
import androidx.work.impl.utils.IdGeneratorKt;
import androidx.work.impl.utils.PreferenceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/work/impl/WorkMigration9To10;", "Landroidx/room/migration/Migration;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "context", "Landroid/content/Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkMigration9To10 extends Migration {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkMigration9To10(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.execSQL(PreferenceUtils.CREATE_PREFERENCE);
        PreferenceUtils.migrateLegacyPreferences(this.context, p0);
        IdGeneratorKt.migrateLegacyIdGenerator(this.context, p0);
    }
}
