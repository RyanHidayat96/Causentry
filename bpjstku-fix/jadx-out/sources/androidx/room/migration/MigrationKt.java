package androidx.room.migration;

import androidx.database.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "p0", "p1", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "p2", "Landroidx/room/migration/Migration;", "Migration", "(IILkotlin/jvm/functions/Function1;)Landroidx/room/migration/Migration;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MigrationKt {
    public static final Migration Migration(int i, int i2, Function1<? super SupportSQLiteDatabase, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new MigrationImpl(i, i2, function1);
    }
}
