package androidx.room.paging;

import android.database.Cursor;
import androidx.database.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u000f\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0007H\u0017¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\nH\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\rH\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\"H\u0017¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroid/database/Cursor;", "p0", "<init>", "(Landroid/database/Cursor;)V", "", "", "getBlob", "(I)[B", "", "getDouble", "(I)D", "", "getLong", "(I)J", "", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "", "reset", "()V", "close", "p1", "", "bindBlob", "(I[B)Ljava/lang/Void;", "bindDouble", "(ID)Ljava/lang/Void;", "bindLong", "(IJ)Ljava/lang/Void;", "bindText", "(ILjava/lang/String;)Ljava/lang/Void;", "bindNull", "(I)Ljava/lang/Void;", "clearBindings", "()Ljava/lang/Void;", "cursor", "Landroid/database/Cursor;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CursorSQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Cursor cursor;

    public CursorSQLiteStatement(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        this.cursor = cursor;
    }

    @Override // androidx.database.SQLiteStatement
    public final byte[] getBlob(int p0) {
        byte[] blob = this.cursor.getBlob(p0);
        Intrinsics.checkNotNullExpressionValue(blob, "");
        return blob;
    }

    @Override // androidx.database.SQLiteStatement
    public final double getDouble(int p0) {
        return this.cursor.getDouble(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final long getLong(int p0) {
        return this.cursor.getLong(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final String getText(int p0) {
        String string = this.cursor.getString(p0);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean isNull(int p0) {
        return this.cursor.isNull(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // androidx.database.SQLiteStatement
    public final String getColumnName(int p0) {
        String columnName = this.cursor.getColumnName(p0);
        Intrinsics.checkNotNullExpressionValue(columnName, "");
        return columnName;
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnType(int p0) {
        return INSTANCE.getDataType(this.cursor, p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean step() {
        return this.cursor.moveToNext();
    }

    @Override // androidx.database.SQLiteStatement
    public final void reset() {
        this.cursor.moveToPosition(-1);
    }

    @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
    public final void close() {
        this.cursor.close();
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public final Void mo7354bindBlob(int p0, byte[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public final Void mo7355bindDouble(int p0, double p1) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public final Void mo7356bindLong(int p0, long p1) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public final Void mo7358bindText(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public final Void mo7357bindNull(int p0) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public final Void mo7359clearBindings() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement$Companion;", "", "<init>", "()V", "Landroid/database/Cursor;", "", "p0", "getDataType", "(Landroid/database/Cursor;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getDataType(Cursor cursor, int i) {
            int type = cursor.getType(i);
            int type2 = cursor.getType(i);
            if (type2 == 0) {
                return 5;
            }
            int i2 = 1;
            if (type2 != 1) {
                i2 = 2;
                if (type2 != 2) {
                    i2 = 3;
                    if (type2 != 3) {
                        if (type2 == 4) {
                            return 4;
                        }
                        throw new IllegalStateException("Unknown field type: ".concat(String.valueOf(type)).toString());
                    }
                }
            }
            return i2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
