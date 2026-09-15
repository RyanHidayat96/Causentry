package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setCompatibilityId extends SQLiteOpenHelper {
    static int TuitionPaymentFragmentbindingInflater1;
    private static final List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final String b;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder sb = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        b = sb.toString();
        TuitionPaymentFragmentbindingInflater1 = 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Arrays.asList(new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: CameraConfigBuilder
            public static int TuitionPaymentFragmentbindingInflater1 = 1601969049;

            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: getUseCaseCombinationRequiredRule
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: setUseCaseCombinationRequiredRule
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: setPostviewSupported
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: setSessionProcessor
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(setCompatibilityId.b);
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: CameraConfigRequiredRule
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: setUseCaseConfigFactory
            @Override // setCompatibilityId.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
            }
        });
    }

    @isSamsungJ6
    setCompatibilityId(Context context, @getSupportedBitrateRange(TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "SQLITE_DB_NAME") String str, @getSupportedBitrateRange(TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onConfigure(sQLiteDatabase);
        }
        TuitionPaymentFragmentbindingInflater1(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onConfigure(sQLiteDatabase);
        }
        TuitionPaymentFragmentbindingInflater1(sQLiteDatabase, 0, i2);
    }

    private static void TuitionPaymentFragmentbindingInflater1(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> list = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i2 <= list.size()) {
            while (i < i2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(list.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onConfigure(sQLiteDatabase);
        }
        TuitionPaymentFragmentbindingInflater1(sQLiteDatabase, i, i2);
    }
}
