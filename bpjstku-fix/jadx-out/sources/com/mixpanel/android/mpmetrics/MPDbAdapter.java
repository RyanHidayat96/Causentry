package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.messaging.Constants;
import defpackage.calculateOutConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MPDbAdapter {
    private static final String TuitionPaymentFragmentbindingInflater1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f857a;
    private static final String asBinder;
    private static final String asInterface;
    private static final String b;
    private static final Map<Context, MPDbAdapter> d = new HashMap();
    private static final String g;
    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(Table.EVENTS.mTableName);
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE ");
        sb2.append(Table.PEOPLE.mTableName);
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        g = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CREATE TABLE ");
        sb3.append(Table.GROUPS.mTableName);
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        b = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CREATE TABLE ");
        sb4.append(Table.ANONYMOUS_PEOPLE.mTableName);
        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        TuitionPaymentFragmentbindingInflater1 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb5.append(Table.EVENTS.mTableName);
        sb5.append(" (created_at);");
        asInterface = sb5.toString();
        StringBuilder sb6 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb6.append(Table.PEOPLE.mTableName);
        sb6.append(" (created_at);");
        asBinder = sb6.toString();
        StringBuilder sb7 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb7.append(Table.GROUPS.mTableName);
        sb7.append(" (created_at);");
        f857a = sb7.toString();
        StringBuilder sb8 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb8.append(Table.ANONYMOUS_PEOPLE.mTableName);
        sb8.append(" (created_at);");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb8.toString();
    }

    public enum Table {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");

        final String mTableName;

        Table(String str) {
            this.mTableName = str;
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 extends SQLiteOpenHelper {
        final calculateOutConfig TuitionPaymentFragmentbindingInflater1;
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final File b;

        TuitionPaymentFragmentbindingInflater1(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.b = context.getDatabasePath(str);
            this.TuitionPaymentFragmentbindingInflater1 = calculateOutConfig.b(context);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sQLiteDatabase.execSQL(MPDbAdapter.g);
            sQLiteDatabase.execSQL(MPDbAdapter.b);
            sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentbindingInflater1);
            sQLiteDatabase.execSQL(MPDbAdapter.asInterface);
            sQLiteDatabase.execSQL(MPDbAdapter.asBinder);
            sQLiteDatabase.execSQL(MPDbAdapter.f857a);
            sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        private void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentbindingInflater1);
            sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            File file = new File(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String str : file.list(new FilenameFilter() { // from class: com.mixpanel.android.mpmetrics.MPDbAdapter.TuitionPaymentFragmentbindingInflater1.3
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str2) {
                        return str2.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
                    }
                })) {
                    SharedPreferences sharedPreferences = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getSharedPreferences(str.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                try {
                                    try {
                                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                                        String string2 = jSONObject.getString("$token");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                                        contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("automatic_data", Boolean.FALSE);
                                        contentValues.put("token", string2);
                                        sQLiteDatabase.insert(Table.ANONYMOUS_PEOPLE.mTableName, null, contentValues);
                                    } catch (JSONException unused) {
                                    }
                                } catch (Throwable th) {
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("waiting_array");
                        editorEdit.apply();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3;
            if (i < 4 || i2 > 7) {
                StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
                sb.append(Table.EVENTS.mTableName);
                sQLiteDatabase.execSQL(sb.toString());
                StringBuilder sb2 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb2.append(Table.PEOPLE.mTableName);
                sQLiteDatabase.execSQL(sb2.toString());
                StringBuilder sb3 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb3.append(Table.GROUPS.mTableName);
                sQLiteDatabase.execSQL(sb3.toString());
                StringBuilder sb4 = new StringBuilder("DROP TABLE IF EXISTS ");
                sb4.append(Table.ANONYMOUS_PEOPLE.mTableName);
                sQLiteDatabase.execSQL(sb4.toString());
                sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sQLiteDatabase.execSQL(MPDbAdapter.g);
                sQLiteDatabase.execSQL(MPDbAdapter.b);
                sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentbindingInflater1);
                sQLiteDatabase.execSQL(MPDbAdapter.asInterface);
                sQLiteDatabase.execSQL(MPDbAdapter.asBinder);
                sQLiteDatabase.execSQL(MPDbAdapter.f857a);
                sQLiteDatabase.execSQL(MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return;
            }
            if (i == 4) {
                StringBuilder sb5 = new StringBuilder("ALTER TABLE ");
                sb5.append(Table.EVENTS.mTableName);
                sb5.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL(sb5.toString());
                StringBuilder sb6 = new StringBuilder("ALTER TABLE ");
                sb6.append(Table.PEOPLE.mTableName);
                sb6.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL(sb6.toString());
                StringBuilder sb7 = new StringBuilder("ALTER TABLE ");
                sb7.append(Table.EVENTS.mTableName);
                sb7.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL(sb7.toString());
                StringBuilder sb8 = new StringBuilder("ALTER TABLE ");
                sb8.append(Table.PEOPLE.mTableName);
                sb8.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL(sb8.toString());
                StringBuilder sb9 = new StringBuilder("SELECT * FROM ");
                sb9.append(Table.EVENTS.mTableName);
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb9.toString(), null);
                while (true) {
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                    try {
                        String string = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) >= 0 ? cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : 1)).getJSONObject("properties").getString("token");
                        int i4 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("UPDATE ");
                        sb10.append(Table.EVENTS.mTableName);
                        sb10.append(" SET token = '");
                        sb10.append(string);
                        sb10.append("' WHERE _id = ");
                        sb10.append(i4);
                        sQLiteDatabase.execSQL(sb10.toString());
                    } catch (JSONException unused) {
                        sQLiteDatabase.delete(Table.EVENTS.mTableName, "_id = ".concat(String.valueOf(0)), null);
                    }
                }
                StringBuilder sb11 = new StringBuilder("SELECT * FROM ");
                sb11.append(Table.PEOPLE.mTableName);
                Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery(sb11.toString(), null);
                while (cursorRawQuery2.moveToNext()) {
                    try {
                        String string2 = new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) >= 0 ? cursorRawQuery2.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : 1)).getString("$token");
                        i3 = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                        try {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("UPDATE ");
                            sb12.append(Table.PEOPLE.mTableName);
                            sb12.append(" SET token = '");
                            sb12.append(string2);
                            sb12.append("' WHERE _id = ");
                            sb12.append(i3);
                            sQLiteDatabase.execSQL(sb12.toString());
                        } catch (JSONException unused2) {
                            sQLiteDatabase.delete(Table.PEOPLE.mTableName, "_id = ".concat(String.valueOf(i3)), null);
                        }
                    } catch (JSONException unused3) {
                        i3 = 0;
                    }
                }
                sQLiteDatabase.execSQL(MPDbAdapter.b);
                sQLiteDatabase.execSQL(MPDbAdapter.f857a);
                b(sQLiteDatabase);
            }
            if (i == 5) {
                sQLiteDatabase.execSQL(MPDbAdapter.b);
                sQLiteDatabase.execSQL(MPDbAdapter.f857a);
                b(sQLiteDatabase);
            }
            if (i == 6) {
                b(sQLiteDatabase);
            }
        }
    }

    private MPDbAdapter(Context context) {
        this(context, "mixpanel");
    }

    private MPDbAdapter(Context context, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentbindingInflater1(context, str);
    }

    public static MPDbAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        MPDbAdapter mPDbAdapter;
        Map<Context, MPDbAdapter> map = d;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                mPDbAdapter = new MPDbAdapter(applicationContext);
                map.put(applicationContext, mPDbAdapter);
            } else {
                mPDbAdapter = map.get(applicationContext);
            }
        }
        return mPDbAdapter;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[PHI: r0
  0x0083: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:16:0x006a, B:26:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.database.Cursor] */
    public final int b(JSONObject jSONObject, String str, Table table) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        if (a()) {
            return -2;
        }
        String str2 = table.mTableName;
        Cursor cursor = null;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("token", str);
                    writableDatabase.insert(str2, null, contentValues);
                    StringBuilder sb = new StringBuilder("SELECT COUNT(*) FROM ");
                    sb.append(str2);
                    sb.append(" WHERE token='");
                    sb.append(str);
                    sb.append("'");
                    cursorRawQuery = writableDatabase.rawQuery(sb.toString(), null);
                    try {
                        cursorRawQuery.moveToFirst();
                        int i = cursorRawQuery.getInt(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        return i;
                    } catch (SQLiteException unused) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        } else {
                            cursor = cursorRawQuery;
                        }
                        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        tuitionPaymentFragmentbindingInflater1.close();
                        tuitionPaymentFragmentbindingInflater1.b.delete();
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        return -1;
                    } catch (OutOfMemoryError unused2) {
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        return -1;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jSONObject != 0) {
                        jSONObject.close();
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    throw th;
                }
            } catch (SQLiteException unused3) {
                cursorRawQuery = null;
            } catch (OutOfMemoryError unused4) {
            }
        } catch (Throwable th3) {
            th = th3;
            jSONObject = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        if (a()) {
            return -2;
        }
        int i = -1;
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        Cursor cursor = null;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                    StringBuilder sb = new StringBuilder("SELECT * FROM ");
                    sb.append(Table.ANONYMOUS_PEOPLE.mTableName);
                    sb.append(" WHERE token = '");
                    sb.append(str);
                    sb.append("'");
                    cursorRawQuery = writableDatabase.rawQuery(new StringBuffer(sb.toString()).toString(), null);
                    try {
                        writableDatabase.beginTransaction();
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("created_at", Long.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("created_at") >= 0 ? cursorRawQuery.getColumnIndex("created_at") : 2)));
                                    contentValues.put("automatic_data", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("automatic_data") >= 0 ? cursorRawQuery.getColumnIndex("automatic_data") : 3)));
                                    contentValues.put("token", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("token") >= 0 ? cursorRawQuery.getColumnIndex("token") : 4));
                                    JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) >= 0 ? cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : 1));
                                    jSONObject.put("$distinct_id", str2);
                                    contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                                    writableDatabase.insert(Table.PEOPLE.mTableName, null, contentValues);
                                    int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                                    String str3 = Table.ANONYMOUS_PEOPLE.mTableName;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id = ");
                                    sb2.append(i2);
                                    writableDatabase.delete(str3, sb2.toString(), null);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            } catch (Throwable th2) {
                                writableDatabase.endTransaction();
                                throw th2;
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } catch (SQLiteException unused2) {
                        String str4 = Table.ANONYMOUS_PEOPLE.mTableName;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        } else {
                            cursor = cursorRawQuery;
                        }
                        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        tuitionPaymentFragmentbindingInflater1.close();
                        tuitionPaymentFragmentbindingInflater1.b.delete();
                        r6 = cursor;
                        if (cursor != null) {
                            cursor.close();
                            r6 = cursor;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r6 != 0) {
                        r6.close();
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    throw th;
                }
            } catch (SQLiteException unused3) {
                cursorRawQuery = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
            return i;
        } catch (Throwable th4) {
            r6 = str;
            th = th4;
        }
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, String> map, String str) throws Throwable {
        Cursor cursorRawQuery;
        if (a()) {
            return -2;
        }
        int i = 0;
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                StringBuilder sb = new StringBuilder("SELECT * FROM ");
                sb.append(Table.EVENTS.mTableName);
                sb.append(" WHERE token = '");
                sb.append(str);
                sb.append("'");
                cursorRawQuery = writableDatabase.rawQuery(new StringBuffer(sb.toString()).toString(), null);
                try {
                    try {
                        writableDatabase.beginTransaction();
                        int i2 = 0;
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                try {
                                    try {
                                        ContentValues contentValues = new ContentValues();
                                        JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) >= 0 ? cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : 1));
                                        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            jSONObject2.put(entry.getKey(), entry.getValue());
                                        }
                                        jSONObject.put("properties", jSONObject2);
                                        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                                        int i3 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                                        String str2 = Table.EVENTS.mTableName;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("_id = ");
                                        sb2.append(i3);
                                        writableDatabase.update(str2, contentValues, sb2.toString(), null);
                                        i2++;
                                    } catch (JSONException unused) {
                                    }
                                } catch (SQLiteException unused2) {
                                    i = i2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    } else {
                                        cursor = cursorRawQuery;
                                    }
                                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    tuitionPaymentFragmentbindingInflater1.close();
                                    tuitionPaymentFragmentbindingInflater1.b.delete();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                    return i;
                                }
                            } catch (Throwable th) {
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        return i2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        throw th;
                    }
                } catch (SQLiteException unused3) {
                }
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = cursor;
            }
        } catch (SQLiteException unused4) {
            cursorRawQuery = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    public final String[] TuitionPaymentFragmentbindingInflater1(Table table, String str) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursorRawQuery2;
        String strValueOf;
        String string;
        String string2;
        String str2 = table.mTableName;
        SQLiteDatabase readableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getReadableDatabase();
        Cursor cursor = null;
        try {
            StringBuilder sb = new StringBuilder("SELECT * FROM ");
            sb.append(str2);
            sb.append(" WHERE token = '");
            sb.append(str);
            sb.append("' ");
            StringBuffer stringBuffer = new StringBuffer(sb.toString());
            StringBuilder sb2 = new StringBuilder("SELECT COUNT(*) FROM ");
            sb2.append(str2);
            sb2.append(" WHERE token = '");
            sb2.append(str);
            sb2.append("' ");
            StringBuffer stringBuffer2 = new StringBuffer(sb2.toString());
            StringBuilder sb3 = new StringBuilder("ORDER BY created_at ASC LIMIT ");
            sb3.append(Integer.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.d));
            stringBuffer.append(sb3.toString());
            cursorRawQuery2 = readableDatabase.rawQuery(stringBuffer.toString(), null);
            try {
                cursorRawQuery = readableDatabase.rawQuery(stringBuffer2.toString(), null);
                try {
                    try {
                        cursorRawQuery.moveToFirst();
                        strValueOf = String.valueOf(cursorRawQuery.getInt(0));
                        try {
                            JSONArray jSONArray = new JSONArray();
                            string2 = null;
                            while (cursorRawQuery2.moveToNext()) {
                                if (cursorRawQuery2.isLast()) {
                                    string2 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                                }
                                try {
                                    jSONArray.put(new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) >= 0 ? cursorRawQuery2.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : 1)));
                                } catch (JSONException unused) {
                                }
                            }
                            string = jSONArray.length() > 0 ? jSONArray.toString() : null;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } catch (SQLiteException unused2) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            string = null;
                            string2 = null;
                        }
                    } catch (SQLiteException unused3) {
                        strValueOf = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorRawQuery2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (SQLiteException unused4) {
                cursorRawQuery = null;
                strValueOf = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                string = null;
                string2 = null;
                if (string2 != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = null;
            }
        } catch (SQLiteException unused5) {
            cursorRawQuery2 = null;
        } catch (Throwable th4) {
            th = th4;
            cursorRawQuery = null;
        }
        if (string2 != null || string == null) {
            return null;
        }
        return new String[]{string2, string, strValueOf};
    }

    private boolean a() {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (tuitionPaymentFragmentbindingInflater1.b.exists()) {
            return tuitionPaymentFragmentbindingInflater1.b.length() > Math.max(tuitionPaymentFragmentbindingInflater1.b.getUsableSpace(), (long) tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.INotificationSideChannel) || tuitionPaymentFragmentbindingInflater1.b.length() > ((long) tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.cancel);
        }
        return false;
    }

    public final void b(Table table, String str) {
        String str2 = table.mTableName;
        try {
            try {
                SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                StringBuilder sb = new StringBuilder("token = '");
                sb.append(str);
                sb.append("'");
                writableDatabase.delete(str2, sb.toString(), null);
            } catch (SQLiteException unused) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater1.close();
                tuitionPaymentFragmentbindingInflater1.b.delete();
            }
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(long j, Table table) {
        String str = table.mTableName;
        try {
            try {
                SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                StringBuilder sb = new StringBuilder("created_at <= ");
                sb.append(j);
                writableDatabase.delete(str, sb.toString(), null);
            } catch (SQLiteException unused) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater1.close();
                tuitionPaymentFragmentbindingInflater1.b.delete();
            }
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Table table, String str2) {
        String str3 = table.mTableName;
        try {
            try {
                SQLiteDatabase writableDatabase = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getWritableDatabase();
                StringBuilder sb = new StringBuilder("_id <= ");
                sb.append(str);
                sb.append(" AND token = '");
                sb.append(str2);
                sb.append("'");
                writableDatabase.delete(str3, new StringBuffer(sb.toString()).toString(), null);
            } catch (SQLiteException unused) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater1.close();
                tuitionPaymentFragmentbindingInflater1.b.delete();
            } catch (Exception unused2) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater2.close();
                tuitionPaymentFragmentbindingInflater2.b.delete();
            }
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
        }
    }
}
