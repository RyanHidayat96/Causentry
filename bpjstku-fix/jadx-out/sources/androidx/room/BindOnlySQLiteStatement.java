package androidx.room;

import androidx.database.SQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ \u0010!\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b%\u0010&J \u0010(\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b*\u0010+J \u0010,\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0018\u00103\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b3\u0010\u0014J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f04H\u0097\u0001¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b9\u0010\u0019"}, d2 = {"Landroidx/room/BindOnlySQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "p0", "<init>", "(Landroidx/sqlite/SQLiteStatement;)V", "", "", "getBlob", "(I)[B", "", "getDouble", "(I)D", "", "getLong", "(I)J", "", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "", "reset", "()V", "close", "p1", "bindBlob", "(I[B)V", "bindBoolean", "(IZ)V", "bindDouble", "(ID)V", "", "bindFloat", "(IF)V", "bindInt", "(II)V", "bindLong", "(IJ)V", "bindNull", "(I)V", "bindText", "(ILjava/lang/String;)V", "clearBindings", "getBoolean", "", "getColumnNames", "()Ljava/util/List;", "getFloat", "(I)F", "getInt", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BindOnlySQLiteStatement implements SQLiteStatement {
    private static final String ONLY_BIND_CALLS_ALLOWED_ERROR = "Only bind*() calls are allowed on the RoomRawQuery received statement.";
    private final /* synthetic */ SQLiteStatement $$delegate_0;

    public BindOnlySQLiteStatement(SQLiteStatement sQLiteStatement) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        this.$$delegate_0 = sQLiteStatement;
    }

    @Override // androidx.database.SQLiteStatement
    public final byte[] getBlob(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final double getDouble(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final long getLong(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final String getText(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean isNull(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnCount() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final String getColumnName(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnType(int p0) {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean step() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    public final void reset() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException(ONLY_BIND_CALLS_ALLOWED_ERROR.toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindBlob */
    public final void mo7354bindBlob(int p0, byte[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.$$delegate_0.mo7354bindBlob(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindBoolean(int p0, boolean p1) {
        this.$$delegate_0.bindBoolean(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindDouble */
    public final void mo7355bindDouble(int p0, double p1) {
        this.$$delegate_0.mo7355bindDouble(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindFloat(int p0, float p1) {
        this.$$delegate_0.bindFloat(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindInt(int p0, int p1) {
        this.$$delegate_0.bindInt(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindLong */
    public final void mo7356bindLong(int p0, long p1) {
        this.$$delegate_0.mo7356bindLong(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindNull */
    public final void mo7357bindNull(int p0) {
        this.$$delegate_0.mo7357bindNull(p0);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: bindText */
    public final void mo7358bindText(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.$$delegate_0.mo7358bindText(p0, p1);
    }

    @Override // androidx.database.SQLiteStatement
    /* JADX INFO: renamed from: clearBindings */
    public final void mo7359clearBindings() {
        this.$$delegate_0.mo7359clearBindings();
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean getBoolean(int p0) {
        return this.$$delegate_0.getBoolean(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final List<String> getColumnNames() {
        return this.$$delegate_0.getColumnNames();
    }

    @Override // androidx.database.SQLiteStatement
    public final float getFloat(int p0) {
        return this.$$delegate_0.getFloat(p0);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getInt(int p0) {
        return this.$$delegate_0.getInt(p0);
    }
}
