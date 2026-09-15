package androidx.room;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.util.SQLiteConnectionUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H%¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0012J'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000e2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u000e2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001cJ1\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00112\u0006\u0010\t\u001a\u00020\u000e2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00112\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001fJ1\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0011H\u0007¢\u0006\u0004\b!\u0010\"J/\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010\t\u001a\u00020\u000e2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0018H\u0007¢\u0006\u0004\b!\u0010#"}, d2 = {"Landroidx/room/EntityInsertAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "createQuery", "()Ljava/lang/String;", "Landroidx/sqlite/SQLiteStatement;", "p0", "p1", "", "bind", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V", "Landroidx/sqlite/SQLiteConnection;", "insert", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)V", "", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[Ljava/lang/Long;", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)Ljava/util/List;", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EntityInsertAdapter<T> {
    protected abstract void bind(SQLiteStatement p0, T p1);

    protected abstract String createQuery();

    public final void insert(SQLiteConnection p0, T p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, p1);
            sQLiteStatement.step();
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(SQLiteConnection p0, T[] p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            Iterator it = ArrayIteratorKt.iterator(p1);
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    bind(sQLiteStatement, next);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final void insert(SQLiteConnection p0, Iterable<? extends T> p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : p1) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final long insertAndReturnId(SQLiteConnection p0, T p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, p1);
            sQLiteStatement.step();
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(p0);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int size = p1.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object objElementAt = CollectionsKt.elementAt(p1, i);
                if (objElementAt != null) {
                    bind(sQLiteStatement, objElementAt);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(p0);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i] = lastInsertedRowId;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(SQLiteConnection p0, T[] p1) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int length = p1.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                T t = p1[i];
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(p0);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i] = lastInsertedRowId;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int size = p1.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object objElementAt = CollectionsKt.elementAt(p1, i);
                if (objElementAt != null) {
                    bind(sQLiteStatement, objElementAt);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(p0);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i] = Long.valueOf(lastInsertedRowId);
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection p0, T[] p1) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int length = p1.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                T t = p1[i];
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(p0);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i] = Long.valueOf(lastInsertedRowId);
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection p0, T[] p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : p1) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    listCreateListBuilder.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(p0)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return CollectionsKt.build(listCreateListBuilder);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection p0, Collection<? extends T> p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : p1) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    listCreateListBuilder.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(p0)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return CollectionsKt.build(listCreateListBuilder);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
