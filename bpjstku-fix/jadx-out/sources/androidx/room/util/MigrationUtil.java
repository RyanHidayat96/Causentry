package androidx.room.util;

import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "p0", "p1", "", "isMigrationRequired", "(Landroidx/room/DatabaseConfiguration;II)Z", "Landroidx/room/RoomDatabase$MigrationContainer;", "contains", "(Landroidx/room/RoomDatabase$MigrationContainer;II)Z", "", "Landroidx/room/migration/Migration;", "findMigrationPath", "(Landroidx/room/RoomDatabase$MigrationContainer;II)Ljava/util/List;", "", "p2", "p3", "findUpMigrationPath", "(Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZII)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MigrationUtil {
    public static final boolean isMigrationRequired(DatabaseConfiguration databaseConfiguration, int i, int i2) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        if (i > i2 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i)));
    }

    public static final boolean contains(RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i))) {
            return false;
        }
        Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i2));
    }

    public static final List<Migration> findMigrationPath(RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "");
        if (i == i2) {
            return CollectionsKt.emptyList();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i2 > i, i, i2);
    }

    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z, int i, int i2) {
        Pair<Map<Integer, Migration>, Iterable<Integer>> sortedNodes$room_runtime_release;
        int iIntValue;
        boolean z2;
        while (true) {
            if (z) {
                if (i >= i2) {
                    return list;
                }
            } else if (i <= i2) {
                return list;
            }
            if (z) {
                sortedNodes$room_runtime_release = migrationContainer.getSortedDescendingNodes$room_runtime_release(i);
            } else {
                sortedNodes$room_runtime_release = migrationContainer.getSortedNodes$room_runtime_release(i);
            }
            if (sortedNodes$room_runtime_release == null) {
                return null;
            }
            Map<Integer, Migration> mapComponent1 = sortedNodes$room_runtime_release.component1();
            Iterator<Integer> it = sortedNodes$room_runtime_release.component2().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = i;
                    z2 = false;
                    break;
                }
                iIntValue = it.next().intValue();
                if (!z) {
                    if (i2 <= iIntValue && iIntValue < i) {
                        Migration migration = mapComponent1.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(migration);
                        list.add(migration);
                        z2 = true;
                        break;
                    }
                } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                    Migration migration2 = mapComponent1.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(migration2);
                    list.add(migration2);
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                return null;
            }
            i = iIntValue;
        }
    }
}
