package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getAnalysisSize implements getConfigType.b {
    private /* synthetic */ long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ LogEventDropped.Reason TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ String b;

    public /* synthetic */ getAnalysisSize(String str, LogEventDropped.Reason reason, long j) {
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = reason;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
    }

    @Override // getConfigType.b
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        String str = this.b;
        LogEventDropped.Reason reason = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((Boolean) getConfigType.b(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new getConfigType.b() { // from class: CameraCaptureMetaDataAfState
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
            }
        })).booleanValue()) {
            StringBuilder sb = new StringBuilder("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
            sb.append(j);
            sb.append(" WHERE log_source = ? AND reason = ?");
            sQLiteDatabase.execSQL(sb.toString(), new String[]{str, Integer.toString(reason.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }
}
