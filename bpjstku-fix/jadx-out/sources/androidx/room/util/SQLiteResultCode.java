package androidx.room.util;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/room/util/SQLiteResultCode;", "", "<init>", "()V", "", "SQLITE_ERROR", "I", "SQLITE_BUSY", "SQLITE_MISUSE"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SQLiteResultCode {
    public static final SQLiteResultCode INSTANCE = new SQLiteResultCode();
    public static final int SQLITE_BUSY = 5;
    public static final int SQLITE_ERROR = 1;
    public static final int SQLITE_MISUSE = 21;

    private SQLiteResultCode() {
    }
}
