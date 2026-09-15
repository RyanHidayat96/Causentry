package androidx.room.util;

import androidx.database.SQLiteStatement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0097\u0001¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b7\u00102J\u0018\u00108\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b:\u0010-J\u0018\u0010;\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010)J\u0010\u0010<\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b<\u0010$J\u0010\u0010=\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Landroidx/room/util/MappedColumnsSQLiteStatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "p0", "", "", "p1", "", "p2", "<init>", "(Landroidx/sqlite/SQLiteStatement;[Ljava/lang/String;[I)V", "", "getColumnIndex", "(Ljava/lang/String;)I", "", "", "bindBlob", "(I[B)V", "", "bindBoolean", "(IZ)V", "", "bindDouble", "(ID)V", "", "bindFloat", "(IF)V", "bindInt", "(II)V", "", "bindLong", "(IJ)V", "bindNull", "(I)V", "bindText", "(ILjava/lang/String;)V", "clearBindings", "()V", "close", "getBlob", "(I)[B", "getBoolean", "(I)Z", "getColumnCount", "()I", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()Ljava/util/List;", "getColumnType", "(I)I", "getDouble", "(I)D", "getFloat", "(I)F", "getInt", "getLong", "(I)J", "getText", "isNull", "reset", "step", "()Z", "delegate", "Landroidx/sqlite/SQLiteStatement;", "columnNames", "[Ljava/lang/String;", "mapping", "[I", "", "columnNameToIndexMap", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {
    private final Map<String, Integer> columnNameToIndexMap;
    private final String[] columnNames;
    private final SQLiteStatement delegate;
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(SQLiteStatement sQLiteStatement, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.delegate = sQLiteStatement;
        this.columnNames = strArr;
        this.mapping = iArr;
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size".toString());
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            mapCreateMapBuilder.put(strArr[i], Integer.valueOf(this.mapping[i2]));
            i++;
            i2++;
        }
        int columnCount = getColumnCount();
        for (int i3 = 0; i3 < columnCount; i3++) {
            if (!mapCreateMapBuilder.containsKey(getColumnName(i3))) {
                mapCreateMapBuilder.put(getColumnName(i3), Integer.valueOf(i3));
            }
        }
        this.columnNameToIndexMap = MapsKt.build(mapCreateMapBuilder);
    }

    public final int getColumnIndex(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Integer num = this.columnNameToIndexMap.get(p0);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindBlob */
    public final void mo7354bindBlob(int p0, byte[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.delegate.mo7354bindBlob(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindBoolean(int p0, boolean p1) {
        this.delegate.bindBoolean(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindDouble */
    public final void mo7355bindDouble(int p0, double p1) {
        this.delegate.mo7355bindDouble(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindFloat(int p0, float p1) {
        this.delegate.bindFloat(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindInt(int p0, int p1) {
        this.delegate.bindInt(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindLong */
    public final void mo7356bindLong(int p0, long p1) {
        this.delegate.mo7356bindLong(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindNull */
    public final void mo7357bindNull(int p0) {
        this.delegate.mo7357bindNull(p0);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindText */
    public final void mo7358bindText(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.delegate.mo7358bindText(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: clearBindings */
    public final void mo7359clearBindings() {
        this.delegate.mo7359clearBindings();
    }

    @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    @Override // androidx.database.SQLiteStatement
    public final byte[] getBlob(int p0) {
        return this.delegate.getBlob(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean getBoolean(int p0) {
        return this.delegate.getBoolean(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    @Override // androidx.database.SQLiteStatement
    public final String getColumnName(int p0) {
        return this.delegate.getColumnName(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnType(int p0) {
        return this.delegate.getColumnType(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final double getDouble(int p0) {
        return this.delegate.getDouble(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final float getFloat(int p0) {
        return this.delegate.getFloat(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getInt(int p0) {
        return this.delegate.getInt(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final long getLong(int p0) {
        return this.delegate.getLong(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final String getText(int p0) {
        return this.delegate.getText(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean isNull(int p0) {
        return this.delegate.isNull(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final void reset() {
        this.delegate.reset();
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean step() {
        return this.delegate.step();
    }
}
