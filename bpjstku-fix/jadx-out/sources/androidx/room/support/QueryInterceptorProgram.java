package androidx.room.support;

import androidx.database.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/room/support/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "<init>", "()V", "", "p0", "", "bindNull", "(I)V", "", "p1", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "close", "", "saveArgsToCache", "(ILjava/lang/Object;)V", "", "bindArgsCache", "Ljava/util/List;", "getBindArgsCache$room_runtime_release", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindNull(int p0) {
        saveArgsToCache(p0, null);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindLong(int p0, long p1) {
        saveArgsToCache(p0, Long.valueOf(p1));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindDouble(int p0, double p1) {
        saveArgsToCache(p0, Double.valueOf(p1));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindString(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        saveArgsToCache(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindBlob(int p0, byte[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        saveArgsToCache(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void clearBindings() {
        this.bindArgsCache.clear();
    }

    private final void saveArgsToCache(int p0, Object p1) {
        int size;
        int i = p0 - 1;
        if (i >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i, p1);
    }
}
