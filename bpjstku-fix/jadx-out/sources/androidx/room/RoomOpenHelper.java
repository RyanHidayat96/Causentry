package androidx.room;

import android.database.Cursor;
import androidx.database.db.SimpleSQLiteQuery;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteOpenHelper;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Replaced by RoomConnectionManager and no longer used in generated code.")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 $2\u00020\u0001:\u0003%&$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\""}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/room/DatabaseConfiguration;", "p0", "Landroidx/room/RoomOpenHelper$Delegate;", "p1", "", "p2", "p3", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "onConfigure", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onCreate", "", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen", "checkIdentity", "updateIdentity", "createMasterTableIfNotExists", "configuration", "Landroidx/room/DatabaseConfiguration;", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "Ljava/util/List;", "delegate", "Landroidx/room/RoomOpenHelper$Delegate;", "identityHash", "Ljava/lang/String;", "legacyHash", "Companion", "Delegate", "ValidationResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<RoomDatabase.Callback> callbacks;
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        Intrinsics.checkNotNullParameter(delegate, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.callbacks = databaseConfiguration.callbacks;
        this.configuration = databaseConfiguration;
        this.delegate = delegate;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str) {
        this(databaseConfiguration, delegate, "", str);
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        Intrinsics.checkNotNullParameter(delegate, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onConfigure(p0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        boolean zHasEmptySchema$room_runtime_release = INSTANCE.hasEmptySchema$room_runtime_release(p0);
        this.delegate.createAllTables(p0);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(p0);
            if (!validationResultOnValidateSchema.isValid) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(validationResultOnValidateSchema.expectedFoundMsg);
                throw new IllegalStateException(sb.toString());
            }
        }
        updateIdentity(p0);
        this.delegate.onCreate(p0);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(p0);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase p0, int p1, int p2) {
        List<Migration> listFindMigrationPath;
        Intrinsics.checkNotNullParameter(p0, "");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(p1, p2)) != null) {
            this.delegate.onPreMigrate(p0);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(p0));
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(p0);
            if (!validationResultOnValidateSchema.isValid) {
                StringBuilder sb = new StringBuilder("Migration didn't properly handle: ");
                sb.append(validationResultOnValidateSchema.expectedFoundMsg);
                throw new IllegalStateException(sb.toString());
            }
            this.delegate.onPostMigrate(p0);
            updateIdentity(p0);
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(p1, p2)) {
            if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
                INSTANCE.dropAllTables$room_runtime_release(p0);
            } else {
                this.delegate.dropAllTables(p0);
            }
            List<RoomDatabase.Callback> list = this.callbacks;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(p0);
                }
            }
            this.delegate.createAllTables(p0);
            return;
        }
        StringBuilder sb2 = new StringBuilder("A migration from ");
        sb2.append(p1);
        sb2.append(" to ");
        sb2.append(p2);
        sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(sb2.toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase p0, int p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        onUpgrade(p0, p1, p2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onOpen(p0);
        checkIdentity(p0);
        this.delegate.onOpen(p0);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(p0);
            }
        }
        this.configuration = null;
    }

    private final void checkIdentity(SupportSQLiteDatabase p0) {
        if (INSTANCE.hasRoomMasterTable$room_runtime_release(p0)) {
            Cursor cursorQuery = p0.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                Cursor cursor = cursorQuery;
                String string = cursor.moveToFirst() ? cursor.getString(0) : null;
                CloseableKt.closeFinally(cursorQuery, null);
                if (Intrinsics.areEqual(this.identityHash, string) || Intrinsics.areEqual(this.legacyHash, string)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                sb.append(this.identityHash);
                sb.append(", found: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }
        ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(p0);
        if (!validationResultOnValidateSchema.isValid) {
            StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
            sb2.append(validationResultOnValidateSchema.expectedFoundMsg);
            throw new IllegalStateException(sb2.toString());
        }
        this.delegate.onPostMigrate(p0);
        updateIdentity(p0);
    }

    private final void updateIdentity(SupportSQLiteDatabase p0) {
        createMasterTableIfNotExists(p0);
        p0.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase p0) {
        p0.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    @Deprecated(message = "Replaced by OpenDelegate  and no longer used in generated code.")
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "", "p0", "<init>", "(I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "dropAllTables", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/RoomOpenHelper$ValidationResult;", "onValidateSchema", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/room/RoomOpenHelper$ValidationResult;", "onPreMigrate", "onPostMigrate", "version", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Delegate {
        public final int version;

        public abstract void createAllTables(SupportSQLiteDatabase p0);

        public abstract void dropAllTables(SupportSQLiteDatabase p0);

        public abstract void onCreate(SupportSQLiteDatabase p0);

        public abstract void onOpen(SupportSQLiteDatabase p0);

        public Delegate(int i) {
            this.version = i;
        }

        @Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            validateMigration(p0);
            return new ValidationResult(true, null);
        }

        public void onPostMigrate(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }

        public void onPreMigrate(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    @Deprecated(message = "Replaced by OpenDelegate.ValidationResult and no longer used in generated code.")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "isValid", "Z", "expectedFoundMsg", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "hasRoomMasterTable$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Z", "hasEmptySchema$room_runtime_release", "", "dropAllTables$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Cursor cursorQuery = p0.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst() && cursor.getInt(0) != 0) {
                    z = true;
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Cursor cursorQuery = p0.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                    z = true;
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }

        public final void dropAllTables$room_runtime_release(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Cursor cursorQuery = p0.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = cursorQuery;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    Intrinsics.checkNotNull(string);
                    if (!StringsKt.startsWith$default(string, "sqlite_", false, 2, (Object) null) && !Intrinsics.areEqual(string, "android_metadata")) {
                        listCreateListBuilder.add(TuplesKt.to(string, Boolean.valueOf(Intrinsics.areEqual(cursor.getString(1), "view"))));
                    }
                }
                List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
                CloseableKt.closeFinally(cursorQuery, null);
                for (Pair pair : listBuild) {
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        p0.execSQL("DROP VIEW IF EXISTS ".concat(String.valueOf(str)));
                    } else {
                        p0.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
