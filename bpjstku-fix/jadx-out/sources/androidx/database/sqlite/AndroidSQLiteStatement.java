package androidx.database.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import androidx.database.SQLite;
import androidx.database.SQLiteStatement;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001c\u001d"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "throwIfClosed", "()V", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getDb", "()Landroid/database/sqlite/SQLiteDatabase;", "sql", "Ljava/lang/String;", "getSql", "()Ljava/lang/String;", "", "isClosed", "Z", "()Z", "setClosed", "(Z)V", "Companion", "SelectAndroidSQLiteStatement", "OtherAndroidSQLiteStatement", "Landroidx/sqlite/driver/AndroidSQLiteStatement$OtherAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement$SelectAndroidSQLiteStatement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidSQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SQLiteDatabase db;
    private boolean isClosed;
    private final String sql;

    private AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.db = sQLiteDatabase;
        this.sql = str;
    }

    protected final SQLiteDatabase getDb() {
        return this.db;
    }

    protected final String getSql() {
        return this.sql;
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    protected final void setClosed(boolean z) {
        this.isClosed = z;
    }

    protected final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    public /* synthetic */ AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDatabase, str);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$Companion;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", "create", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Landroidx/sqlite/driver/AndroidSQLiteStatement;", "", "isRowStatement", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AndroidSQLiteStatement create(SQLiteDatabase p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (isRowStatement(p1)) {
                return new SelectAndroidSQLiteStatement(p0, p1);
            }
            return new OtherAndroidSQLiteStatement(p0, p1);
        }

        private final boolean isRowStatement(String p0) {
            String string = StringsKt.trim((CharSequence) p0).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010*J\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0003\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\n2\u0006\u0010\u0003\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$SelectAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "ensureCapacity", "(II)V", "ensureCursor", "Landroid/database/sqlite/SQLiteProgram;", "bindTo", "(Landroid/database/sqlite/SQLiteProgram;)V", "Landroid/database/Cursor;", "throwIfNoRow", "()Landroid/database/Cursor;", "throwIfInvalidColumn", "(Landroid/database/Cursor;I)V", "", "bindingTypes", "[I", "", "longBindings", "[J", "", "doubleBindings", "[D", "", "stringBindings", "[Ljava/lang/String;", "blobBindings", "[[B", "cursor", "Landroid/database/Cursor;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SelectAndroidSQLiteStatement extends AndroidSQLiteStatement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private Cursor cursor;
        private double[] doubleBindings;
        private long[] longBindings;
        private String[] stringBindings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectAndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
            super(sQLiteDatabase, str, null);
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public final void mo7354bindBlob(int p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            ensureCapacity(4, p0);
            this.bindingTypes[p0] = 4;
            this.blobBindings[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public final void mo7355bindDouble(int p0, double p1) {
            throwIfClosed();
            ensureCapacity(2, p0);
            this.bindingTypes[p0] = 2;
            this.doubleBindings[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public final void mo7356bindLong(int p0, long p1) {
            throwIfClosed();
            ensureCapacity(1, p0);
            this.bindingTypes[p0] = 1;
            this.longBindings[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public final void mo7358bindText(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            ensureCapacity(3, p0);
            this.bindingTypes[p0] = 3;
            this.stringBindings[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public final void mo7357bindNull(int p0) {
            throwIfClosed();
            ensureCapacity(5, p0);
            this.bindingTypes[p0] = 5;
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, p0);
            byte[] blob = cursorThrowIfNoRow.getBlob(p0);
            Intrinsics.checkNotNullExpressionValue(blob, "");
            return blob;
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, p0);
            return cursorThrowIfNoRow.getDouble(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, p0);
            return cursorThrowIfNoRow.getLong(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final String getText(int p0) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, p0);
            String string = cursorThrowIfNoRow.getString(p0);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, p0);
            return cursorThrowIfNoRow.isNull(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.database.SQLiteStatement
        public final String getColumnName(int p0) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            throwIfInvalidColumn(cursor, p0);
            String columnName = cursor.getColumnName(p0);
            Intrinsics.checkNotNullExpressionValue(columnName, "");
            return columnName;
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            throwIfInvalidColumn(cursor, p0);
            return INSTANCE.getDataType(cursor, p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public final void mo7359clearBindings() {
            throwIfClosed();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            if (!getIsClosed()) {
                reset();
            }
            setClosed(true);
        }

        private final void ensureCapacity(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                this.bindingTypes = iArrCopyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.blobBindings;
                if (bArr.length < i) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
                    this.blobBindings = (byte[][]) objArrCopyOf2;
                }
            }
        }

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.driver.AndroidSQLiteStatement$SelectAndroidSQLiteStatement$$ExternalSyntheticLambda0
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return AndroidSQLiteStatement.SelectAndroidSQLiteStatement.ensureCursor$lambda$0(this.f$0, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, getSql(), new String[0], null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cursor ensureCursor$lambda$0(SelectAndroidSQLiteStatement selectAndroidSQLiteStatement, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            Intrinsics.checkNotNull(sQLiteQuery);
            selectAndroidSQLiteStatement.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private final void bindTo(SQLiteProgram p0) {
            int length = this.bindingTypes.length;
            for (int i = 1; i < length; i++) {
                int i2 = this.bindingTypes[i];
                if (i2 == 1) {
                    p0.bindLong(i, this.longBindings[i]);
                } else if (i2 == 2) {
                    p0.bindDouble(i, this.doubleBindings[i]);
                } else if (i2 == 3) {
                    p0.bindString(i, this.stringBindings[i]);
                } else if (i2 == 4) {
                    p0.bindBlob(i, this.blobBindings[i]);
                } else if (i2 == 5) {
                    p0.bindNull(i);
                }
            }
        }

        private final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        private final void throwIfInvalidColumn(Cursor p0, int p1) {
            if (p1 < 0 || p1 >= p0.getColumnCount()) {
                SQLite.throwSQLiteException(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$SelectAndroidSQLiteStatement$Companion;", "", "<init>", "()V", "Landroid/database/Cursor;", "", "p0", "getDataType", "(Landroid/database/Cursor;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010*R\u0018\u0010/\u001a\u00060-j\u0002`.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteStatement$OtherAndroidSQLiteStatement;", "Landroidx/sqlite/driver/AndroidSQLiteStatement;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "Landroid/database/sqlite/SQLiteStatement;", "Landroidx/sqlite/driver/TuitionPaymentFragmentbindingInflater1;", "delegate", "Landroid/database/sqlite/SQLiteStatement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class OtherAndroidSQLiteStatement extends AndroidSQLiteStatement {
        private final android.database.sqlite.SQLiteStatement delegate;

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherAndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
            super(sQLiteDatabase, str, null);
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
            Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "");
            this.delegate = sQLiteStatementCompileStatement;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public final void mo7354bindBlob(int p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            this.delegate.bindBlob(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public final void mo7355bindDouble(int p0, double p1) {
            throwIfClosed();
            this.delegate.bindDouble(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public final void mo7356bindLong(int p0, long p1) {
            throwIfClosed();
            this.delegate.bindLong(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public final void mo7358bindText(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            this.delegate.bindString(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public final void mo7357bindNull(int p0) {
            throwIfClosed();
            this.delegate.bindNull(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final String getText(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.database.SQLiteStatement
        public final String getColumnName(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }

        @Override // androidx.database.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public final void mo7359clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            this.delegate.close();
            setClosed(true);
        }
    }
}
