package androidx.room;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.util.SQLiteConnectionUtil;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H%¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000e2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0016"}, d2 = {"Landroidx/room/EntityDeleteOrUpdateAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "createQuery", "()Ljava/lang/String;", "Landroidx/sqlite/SQLiteStatement;", "p0", "p1", "", "bind", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V", "Landroidx/sqlite/SQLiteConnection;", "", "handle", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I", "", "handleMultiple", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EntityDeleteOrUpdateAdapter<T> {
    protected abstract void bind(SQLiteStatement p0, T p1);

    protected abstract String createQuery();

    public final int handle(SQLiteConnection p0, T p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, p1);
            sQLiteStatement.step();
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(p0);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final int handleMultiple(SQLiteConnection p0, Iterable<? extends T> p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        int totalChangedRows = 0;
        if (p1 == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = p0.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : p1) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(p0);
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return totalChangedRows;
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
    public final int handleMultiple(SQLiteConnection p0, T[] p1) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        int totalChangedRows = 0;
        if (p1 == null) {
            return 0;
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
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(p0);
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return totalChangedRows;
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
