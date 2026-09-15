package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "No longer used by generated code.", replaceWith = @ReplaceWith(expression = "EntityUpsertAdapter", imports = {}))
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f¢\u0006\u0004\b\n\u0010\rJ\u001b\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001bJ'\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/room/EntityInsertionAdapter;", "p0", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "p1", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "", "upsert", "(Ljava/lang/Object;)V", "", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "upsertAndReturnId", "(Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "", "(Ljava/util/Collection;)[J", "", "upsertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroid/database/sqlite/SQLiteConstraintException;", "checkUniquenessException", "(Landroid/database/sqlite/SQLiteConstraintException;)V", "insertionAdapter", "Landroidx/room/EntityInsertionAdapter;", "updateAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> entityInsertionAdapter, EntityDeletionOrUpdateAdapter<T> entityDeletionOrUpdateAdapter) {
        Intrinsics.checkNotNullParameter(entityInsertionAdapter, "");
        Intrinsics.checkNotNullParameter(entityDeletionOrUpdateAdapter, "");
        this.insertionAdapter = entityInsertionAdapter;
        this.updateAdapter = entityDeletionOrUpdateAdapter;
    }

    public final void upsert(T p0) {
        try {
            this.insertionAdapter.insert(p0);
        } catch (SQLiteConstraintException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(p0);
        }
    }

    public final long upsertAndReturnId(T p0) {
        try {
            return this.insertionAdapter.insertAndReturnId(p0);
        } catch (SQLiteConstraintException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(p0);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] p0) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        int length = p0.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(p0[i]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0[i]);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> p0) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends T> it = p0.iterator();
        int size = p0.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t : p0) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t : p0) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] p0) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        int length = p0.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(p0[i]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(p0[i]);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> p0) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends T> it = p0.iterator();
        int size = p0.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    private final void checkUniquenessException(SQLiteConstraintException p0) {
        String message = p0.getMessage();
        if (message == null) {
            throw p0;
        }
        String str = message;
        if (!StringsKt.contains((CharSequence) str, (CharSequence) "unique", true) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "2067", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "1555", false, 2, (Object) null)) {
            throw p0;
        }
    }

    public final void upsert(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (T t : p0) {
            try {
                this.insertionAdapter.insert(t);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final void upsert(Iterable<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (T t : p0) {
            try {
                this.insertionAdapter.insert(t);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
            }
        }
    }
}
