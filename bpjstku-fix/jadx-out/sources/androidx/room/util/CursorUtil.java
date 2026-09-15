package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.core.os.EnvironmentCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\b\u001a%\u0010\n\u001a\u00020\u00062\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\f\u001a1\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\u00020\u00002\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroid/database/Cursor;", "p0", "copyAndClose", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "p1", "", "getColumnIndex", "(Landroid/database/Cursor;Ljava/lang/String;)I", "getColumnIndexOrThrow", "findColumnIndexBySuffix", "", "([Ljava/lang/String;Ljava/lang/String;)I", "R", "Lkotlin/Function1;", "useCursor", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "p2", "wrapMappedColumns", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CursorUtil {
    public static final int getColumnIndex(Cursor cursor, String str) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append('`');
        int columnIndex2 = cursor.getColumnIndex(sb.toString());
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(cursor, str);
    }

    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "");
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e2) {
            strJoinToString$default = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        StringBuilder sb = new StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: ");
        sb.append(strJoinToString$default);
        throw new IllegalArgumentException(sb.toString());
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNull(columnNames);
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int findColumnIndexBySuffix(String[] strArr, String str) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strConcat = ".".concat(String.valueOf(str));
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        sb.append('`');
        String string = sb.toString();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (str2.length() >= str.length() + 2 && (StringsKt.endsWith$default(str2, strConcat, false, 2, (Object) null) || (str2.charAt(0) == '`' && StringsKt.endsWith$default(str2, string, false, 2, (Object) null)))) {
                return i2;
            }
            i++;
            i2++;
        }
        return -1;
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Cursor cursor2 = cursor;
        try {
            R rInvoke = function1.invoke(cursor2);
            CloseableKt.closeFinally(cursor2, null);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor2, th);
                throw th2;
            }
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] strArr, final int[] iArr) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (strArr.length != iArr.length) {
            throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
        }
        return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
            @Override // android.database.CursorWrapper, android.database.Cursor
            public final int getColumnIndex(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                String[] strArr2 = strArr;
                int[] iArr2 = iArr;
                int length = strArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (StringsKt.equals(strArr2[i], p0, true)) {
                        return iArr2[i2];
                    }
                    i++;
                    i2++;
                }
                return super.getColumnIndex(p0);
            }
        };
    }

    public static final Cursor copyAndClose(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            MatrixCursor matrixCursor = new MatrixCursor(cursor3.getColumnNames(), cursor3.getCount());
            while (cursor3.moveToNext()) {
                Object[] objArr = new Object[cursor3.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor3.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor3.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor3.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor3.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor3.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(cursor2, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor2, th);
                throw th2;
            }
        }
    }
}
