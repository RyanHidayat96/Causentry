package androidx.room;

import android.database.SQLException;
import androidx.database.SQLiteConnection;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001(B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0018J1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\u0004\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001cJ3\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\r2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\r2\u0006\u0010\u0004\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001fJ\u001b\u0010\"\u001a\u00020\n2\n\u0010\u0004\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/room/EntityUpsertAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/room/EntityInsertAdapter;", "p0", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "p1", "<init>", "(Landroidx/room/EntityInsertAdapter;Landroidx/room/EntityDeleteOrUpdateAdapter;)V", "Landroidx/sqlite/SQLiteConnection;", "", "upsert", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)V", "", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V", "", "upsertAndReturnId", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[J", "", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J", "", "upsertAndReturnIdsList", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)Ljava/util/List;", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[Ljava/lang/Long;", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[Ljava/lang/Long;", "Landroid/database/SQLException;", "Landroidx/sqlite/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "checkUniquenessException", "(Landroid/database/SQLException;)V", "entityInsertAdapter", "Landroidx/room/EntityInsertAdapter;", "updateAdapter", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EntityUpsertAdapter<T> {
    private static final String ErrorMsg = "unique";
    private static final String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";
    private static final String SQLITE_CONSTRAINT_UNIQUE = "2067";
    private final EntityInsertAdapter<T> entityInsertAdapter;
    private final EntityDeleteOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertAdapter(EntityInsertAdapter<T> entityInsertAdapter, EntityDeleteOrUpdateAdapter<T> entityDeleteOrUpdateAdapter) {
        Intrinsics.checkNotNullParameter(entityInsertAdapter, "");
        Intrinsics.checkNotNullParameter(entityDeleteOrUpdateAdapter, "");
        this.entityInsertAdapter = entityInsertAdapter;
        this.updateAdapter = entityDeleteOrUpdateAdapter;
    }

    public final void upsert(SQLiteConnection p0, T p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            this.entityInsertAdapter.insert(p0, p1);
        } catch (SQLException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(p0, p1);
        }
    }

    public final long upsertAndReturnId(SQLiteConnection p0, T p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return this.entityInsertAdapter.insertAndReturnId(p0, p1);
        } catch (SQLException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(p0, p1);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection p0, T[] p1) throws Exception {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new long[0];
        }
        int length = p1.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(p0, p1[i]);
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, p1[i]);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new long[0];
        }
        int size = p1.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(p0, (T) CollectionsKt.elementAt(p1, i));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, (T) CollectionsKt.elementAt(p1, i));
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection p0, T[] p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t : p1) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(p0, t)));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, t);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t : p1) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(p0, t)));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, t);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection p0, T[] p1) throws Exception {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new Long[0];
        }
        int length = p1.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(p0, p1[i]);
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, p1[i]);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new Long[0];
        }
        int size = p1.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(p0, (T) CollectionsKt.elementAt(p1, i));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0, (T) CollectionsKt.elementAt(p1, i));
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    private final void checkUniquenessException(SQLException p0) {
        String message = p0.getMessage();
        if (message == null) {
            throw p0;
        }
        String str = message;
        if (!StringsKt.contains((CharSequence) str, (CharSequence) ErrorMsg, true) && !StringsKt.contains$default((CharSequence) str, (CharSequence) SQLITE_CONSTRAINT_UNIQUE, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) SQLITE_CONSTRAINT_PRIMARYKEY, false, 2, (Object) null)) {
            throw p0;
        }
    }

    public final void upsert(SQLiteConnection p0, T[] p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 != null) {
            for (T t : p1) {
                try {
                    this.entityInsertAdapter.insert(p0, t);
                } catch (SQLException e2) {
                    checkUniquenessException(e2);
                    this.updateAdapter.handle(p0, t);
                }
            }
        }
    }

    public final void upsert(SQLiteConnection p0, Iterable<? extends T> p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 != null) {
            for (T t : p1) {
                try {
                    this.entityInsertAdapter.insert(p0, t);
                } catch (SQLException e2) {
                    checkUniquenessException(e2);
                    this.updateAdapter.handle(p0, t);
                }
            }
        }
    }
}
