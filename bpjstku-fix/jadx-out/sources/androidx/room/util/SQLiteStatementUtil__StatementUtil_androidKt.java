package androidx.room.util;

import android.os.Build;
import androidx.database.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Landroidx/sqlite/SQLiteStatement;", "", "p0", "", "columnIndexOf", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I", "findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iColumnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, str);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append('`');
        int iColumnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, sb.toString());
        return iColumnIndexOfCommon2 >= 0 ? iColumnIndexOfCommon2 : findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(sQLiteStatement, str);
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        String strConcat = ".".concat(String.valueOf(str));
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        sb.append('`');
        String string = sb.toString();
        for (int i = 0; i < columnCount; i++) {
            String columnName = sQLiteStatement.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (StringsKt.endsWith$default(columnName, strConcat, false, 2, (Object) null) || (columnName.charAt(0) == '`' && StringsKt.endsWith$default(columnName, string, false, 2, (Object) null)))) {
                return i;
            }
        }
        return -1;
    }
}
