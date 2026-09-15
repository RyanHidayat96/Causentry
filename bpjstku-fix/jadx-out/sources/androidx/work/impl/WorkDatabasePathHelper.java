package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/io/File;", "getDatabasePath", "(Landroid/content/Context;)Ljava/io/File;", "getDefaultDatabasePath", "getNoBackupPath", "", "migrateDatabase", "(Landroid/content/Context;)V", "", "migrationPaths", "(Landroid/content/Context;)Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @JvmStatic
    public static final void migrateDatabase(Context p0) {
        String string;
        Intrinsics.checkNotNullParameter(p0, "");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(p0).exists()) {
            Logger.get().debug(WorkDatabasePathHelperKt.TAG, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(p0).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger.get().warning(WorkDatabasePathHelperKt.TAG, "Over-writing contents of ".concat(String.valueOf(value)));
                    }
                    if (key.renameTo(value)) {
                        StringBuilder sb = new StringBuilder("Migrated ");
                        sb.append(key);
                        sb.append("to ");
                        sb.append(value);
                        string = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder("Renaming ");
                        sb2.append(key);
                        sb2.append(" to ");
                        sb2.append(value);
                        sb2.append(" failed");
                        string = sb2.toString();
                    }
                    Logger.get().debug(WorkDatabasePathHelperKt.TAG, string);
                }
            }
        }
    }

    public final Map<File, File> migrationPaths(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        File defaultDatabasePath = getDefaultDatabasePath(p0);
        File databasePath = getDatabasePath(p0);
        String[] strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(defaultDatabasePath.getPath());
            sb.append(str);
            File file = new File(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(databasePath.getPath());
            sb2.append(str);
            Pair pair = TuplesKt.to(file, new File(sb2.toString()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.to(defaultDatabasePath, databasePath));
    }

    public final File getDefaultDatabasePath(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        File databasePath = p0.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        Intrinsics.checkNotNullExpressionValue(databasePath, "");
        return databasePath;
    }

    public final File getDatabasePath(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getNoBackupPath(p0);
    }

    private final File getNoBackupPath(Context p0) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(p0), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }
}
