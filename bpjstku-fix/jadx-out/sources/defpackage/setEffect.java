package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class setEffect extends SQLiteOpenHelper {
    private static final String TuitionPaymentFragmentbindingInflater1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ParmDbHelper");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = String.format("create table %s (%s integer primary key autoincrement,%s integer not null,%s integer not null);", "parm", "_id", "visitorid", "sessionid");
    }

    public setEffect(Context context) {
        super(context, "DTXDbP", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Creating Db.Table(%s.%s)", "DTXDbP", "parm"));
        }
        sQLiteDatabase.execSQL(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase, i, i2, "Upgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase, i, i2, "Downgrading");
    }

    private void b(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s Db.Table(%s.%s) from version %s to %s.", str, "DTXDbP", "parm", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
            sb.append("parm");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("could not delete table ".concat("parm"));
            }
        }
        onCreate(sQLiteDatabase);
    }

    final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Cursor cursorQuery = getReadableDatabase().query(true, "parm", new String[]{str}, "_id=1", null, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        Long lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str))) : null;
        cursorQuery.close();
        return lValueOf;
    }
}
