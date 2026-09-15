package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyActive extends SQLiteOpenHelper {
    public static final int TuitionPaymentFragmentbindingInflater1 = EventType.CRASH.protocolId;
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private SQLiteStatement TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private SQLiteStatement TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private SQLiteStatement b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("EventsDbHelper");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public notifyActive(Context context) {
        super(context, "DTXDb", (SQLiteDatabase.CursorFactory) null, 10);
        this.b = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ?");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        StringBuilder sb = new StringBuilder("DELETE FROM Events WHERE session_start + event_start < ? AND event_id <> ");
        sb.append(TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = writableDatabase.compileStatement(sb.toString());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getWritableDatabase().compileStatement("DELETE FROM Events WHERE event_id= ? AND id NOT IN (SELECT id FROM Events WHERE event_id= ? ORDER BY (session_start + event_start) DESC LIMIT ?)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Creating Db.Table(%s.%s)", "DTXDb", "Events"));
        }
        try {
            sQLiteDatabase.execSQL("CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);");
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);");
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        TuitionPaymentFragmentbindingInflater1(sQLiteDatabase, i, i2, "Upgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        TuitionPaymentFragmentbindingInflater1(sQLiteDatabase, i, i2, "Downgrading");
    }

    private void TuitionPaymentFragmentbindingInflater1(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s Db.Table(%s.%s) from version %s to %s.", str, "DTXDb", "Events", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
            sb.append("Events");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("could not delete table ".concat("Events"));
            }
        }
        onCreate(sQLiteDatabase);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, boolean z) {
        SQLiteStatement sQLiteStatement = z ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.b;
        sQLiteStatement.bindLong(1, j);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Rows deleted: ".concat(String.valueOf(iExecuteUpdateDelete)));
        }
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
        long j = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.bindLong(1, j);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.bindLong(2, j);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.bindLong(3, i2);
        int iExecuteUpdateDelete = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.executeUpdateDelete();
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Rows deleted: ".concat(String.valueOf(iExecuteUpdateDelete)));
        }
        return iExecuteUpdateDelete;
    }
}
