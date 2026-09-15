package androidx.database;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\t\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b+\u0010(J\u000f\u0010,\u001a\u00020\u0003H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b.\u0010*J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180/H'¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b2\u0010&J\u000f\u00103\u001a\u00020\u0015H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H&¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0007H&¢\u0006\u0004\b8\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/sqlite/SQLiteStatement;", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "", "p0", "", "p1", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindFloat", "(IF)V", "", "bindLong", "(IJ)V", "bindInt", "(II)V", "", "bindBoolean", "(IZ)V", "", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getFloat", "(I)F", "getLong", "(I)J", "getInt", "(I)I", "getBoolean", "(I)Z", "getText", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "", "getColumnNames", "()Ljava/util/List;", "getColumnType", "step", "()Z", "reset", "()V", "clearBindings", "close"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SQLiteStatement extends AutoCloseable {
    /* JADX INFO: renamed from: bindBlob */
    void mo7354bindBlob(int p0, byte[] p1);

    /* JADX INFO: renamed from: bindDouble */
    void mo7355bindDouble(int p0, double p1);

    /* JADX INFO: renamed from: bindLong */
    void mo7356bindLong(int p0, long p1);

    /* JADX INFO: renamed from: bindNull */
    void mo7357bindNull(int p0);

    /* JADX INFO: renamed from: bindText */
    void mo7358bindText(int p0, String p1);

    /* JADX INFO: renamed from: clearBindings */
    void mo7359clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int p0);

    int getColumnCount();

    String getColumnName(int p0);

    int getColumnType(int p0);

    double getDouble(int p0);

    long getLong(int p0);

    String getText(int p0);

    boolean isNull(int p0);

    void reset();

    boolean step();

    default void bindFloat(int p0, float p1) {
        mo7355bindDouble(p0, p1);
    }

    default void bindInt(int p0, int p1) {
        mo7356bindLong(p0, p1);
    }

    default void bindBoolean(int p0, boolean p1) {
        mo7356bindLong(p0, p1 ? 1L : 0L);
    }

    default float getFloat(int p0) {
        return (float) getDouble(p0);
    }

    default int getInt(int p0) {
        return (int) getLong(p0);
    }

    default boolean getBoolean(int p0) {
        return getLong(p0) != 0;
    }

    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }
}
