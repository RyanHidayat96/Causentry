package androidx.room;

import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteDriver;
import androidx.database.SQLiteStatement;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.migration.Migration;
import androidx.room.util.MigrationUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 <2\u00020\u0001:\u0002=<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0011¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u001aJ\u0013\u0010&\u001a\u00020\u001d*\u00020%H\u0004¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u001d*\u00020%H\u0004¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0013R\u0014\u0010/\u001a\u00020,8%X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008%X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048%X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010:"}, d2 = {"Landroidx/room/BaseRoomConnectionManager;", "", "<init>", "()V", "R", "", "p0", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "p1", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "resolveFileName$room_runtime_release", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/sqlite/SQLiteConnection;", "", "configureDatabase", "(Landroidx/sqlite/SQLiteConnection;)V", "configurationConnection", "configureJournalMode", "configureSynchronousFlag", "configureBusyTimeout", "onCreate", "hasEmptySchema", "(Landroidx/sqlite/SQLiteConnection;)Z", "updateIdentity", "createMasterTableIfNotExists", "", "p2", "onMigrate", "(Landroidx/sqlite/SQLiteConnection;II)V", "dropAllTables", "onOpen", "checkIdentity", "hasRoomMasterTable", "Landroidx/room/RoomDatabase$JournalMode;", "getMaxNumberOfReaders", "(Landroidx/room/RoomDatabase$JournalMode;)I", "getMaxNumberOfWriters", "invokeCreateCallback", "invokeDestructiveMigrationCallback", "invokeOpenCallback", "Landroidx/room/DatabaseConfiguration;", "getConfiguration", "()Landroidx/room/DatabaseConfiguration;", "configuration", "Landroidx/room/RoomOpenDelegate;", "getOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "openDelegate", "", "Landroidx/room/RoomDatabase$Callback;", "getCallbacks", "()Ljava/util/List;", "callbacks", "isConfigured", "Z", "isInitializing", "Companion", "DriverWrapper"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseRoomConnectionManager {
    public static final int BUSY_TIMEOUT_MS = 3000;
    private boolean isConfigured;
    private boolean isInitializing;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected abstract List<RoomDatabase.Callback> getCallbacks();

    protected abstract DatabaseConfiguration getConfiguration();

    protected abstract RoomOpenDelegate getOpenDelegate();

    public abstract <R> Object useConnection(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/BaseRoomConnectionManager$DriverWrapper;", "Landroidx/sqlite/SQLiteDriver;", "p0", "<init>", "(Landroidx/room/BaseRoomConnectionManager;Landroidx/sqlite/SQLiteDriver;)V", "", "Landroidx/sqlite/SQLiteConnection;", "open", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteConnection;", "openLocked", "actual", "Landroidx/sqlite/SQLiteDriver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected final class DriverWrapper implements SQLiteDriver {
        private final SQLiteDriver actual;
        final /* synthetic */ BaseRoomConnectionManager this$0;

        public DriverWrapper(BaseRoomConnectionManager baseRoomConnectionManager, SQLiteDriver sQLiteDriver) {
            Intrinsics.checkNotNullParameter(sQLiteDriver, "");
            this.this$0 = baseRoomConnectionManager;
            this.actual = sQLiteDriver;
        }

        @Override // androidx.database.SQLiteDriver
        public final SQLiteConnection open(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return openLocked(this.this$0.resolveFileName$room_runtime_release(p0));
        }

        private final SQLiteConnection openLocked(final String p0) {
            ExclusiveLock exclusiveLock = new ExclusiveLock(p0, (this.this$0.isConfigured || this.this$0.isInitializing || Intrinsics.areEqual(p0, ":memory:")) ? false : true);
            final BaseRoomConnectionManager baseRoomConnectionManager = this.this$0;
            return (SQLiteConnection) exclusiveLock.withLock(new Function0() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseRoomConnectionManager.DriverWrapper.openLocked$lambda$1(baseRoomConnectionManager, this, p0);
                }
            }, new Function1() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    StringBuilder sb = new StringBuilder("Unable to open database '");
                    sb.append(p0);
                    sb.append("'. Was a proper path / name used in Room's database builder?");
                    throw new IllegalStateException(sb.toString(), th);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SQLiteConnection openLocked$lambda$1(BaseRoomConnectionManager baseRoomConnectionManager, DriverWrapper driverWrapper, String str) throws Exception {
            if (baseRoomConnectionManager.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?".toString());
            }
            SQLiteConnection sQLiteConnectionOpen = driverWrapper.actual.open(str);
            if (!baseRoomConnectionManager.isConfigured) {
                try {
                    baseRoomConnectionManager.isInitializing = true;
                    baseRoomConnectionManager.configureDatabase(sQLiteConnectionOpen);
                    return sQLiteConnectionOpen;
                } finally {
                    baseRoomConnectionManager.isInitializing = false;
                }
            }
            baseRoomConnectionManager.configurationConnection(sQLiteConnectionOpen);
            return sQLiteConnectionOpen;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDatabase(SQLiteConnection p0) throws Exception {
        Object objM8024constructorimpl;
        configureJournalMode(p0);
        configureSynchronousFlag(p0);
        configureBusyTimeout(p0);
        SQLiteStatement sQLiteStatementPrepare = p0.prepare("PRAGMA user_version");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            int i = (int) sQLiteStatement.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            if (i != getOpenDelegate().getVersion()) {
                SQLite.execSQL(p0, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    BaseRoomConnectionManager baseRoomConnectionManager = this;
                    if (i == 0) {
                        onCreate(p0);
                    } else {
                        onMigrate(p0, i, getOpenDelegate().getVersion());
                    }
                    StringBuilder sb = new StringBuilder("PRAGMA user_version = ");
                    sb.append(getOpenDelegate().getVersion());
                    SQLite.execSQL(p0, sb.toString());
                    objM8024constructorimpl = Result.m8024constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8031isSuccessimpl(objM8024constructorimpl)) {
                    SQLite.execSQL(p0, "END TRANSACTION");
                }
                Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(objM8024constructorimpl);
                if (thM8027exceptionOrNullimpl != null) {
                    SQLite.execSQL(p0, "ROLLBACK TRANSACTION");
                    throw thM8027exceptionOrNullimpl;
                }
            }
            onOpen(p0);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurationConnection(SQLiteConnection p0) throws Exception {
        configureSynchronousFlag(p0);
        configureBusyTimeout(p0);
        getOpenDelegate().onOpen(p0);
    }

    private final void configureJournalMode(SQLiteConnection p0) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(p0, "PRAGMA journal_mode = WAL");
        } else {
            SQLite.execSQL(p0, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void configureSynchronousFlag(SQLiteConnection p0) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(p0, "PRAGMA synchronous = NORMAL");
        } else {
            SQLite.execSQL(p0, "PRAGMA synchronous = FULL");
        }
    }

    private final void configureBusyTimeout(SQLiteConnection p0) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = p0.prepare("PRAGMA busy_timeout");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            long j = sQLiteStatement.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            if (j < 3000) {
                SQLite.execSQL(p0, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    protected final void onCreate(SQLiteConnection p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        boolean zHasEmptySchema = hasEmptySchema(p0);
        getOpenDelegate().createAllTables(p0);
        if (!zHasEmptySchema) {
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(p0);
            if (!validationResultOnValidateSchema.isValid) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(validationResultOnValidateSchema.expectedFoundMsg);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        updateIdentity(p0);
        getOpenDelegate().onCreate(p0);
        invokeCreateCallback(p0);
    }

    private final boolean hasEmptySchema(SQLiteConnection p0) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = p0.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            boolean z = false;
            if (sQLiteStatement.step() && sQLiteStatement.getLong(0) == 0) {
                z = true;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return z;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private final void updateIdentity(SQLiteConnection p0) throws Exception {
        createMasterTableIfNotExists(p0);
        SQLite.execSQL(p0, RoomMasterTable.createInsertQuery(getOpenDelegate().getIdentityHash()));
    }

    private final void createMasterTableIfNotExists(SQLiteConnection p0) throws Exception {
        SQLite.execSQL(p0, RoomMasterTable.CREATE_QUERY);
    }

    protected final void onMigrate(SQLiteConnection p0, int p1, int p2) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        List<Migration> listFindMigrationPath = MigrationUtil.findMigrationPath(getConfiguration().migrationContainer, p1, p2);
        if (listFindMigrationPath != null) {
            getOpenDelegate().onPreMigrate(p0);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(p0);
            }
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(p0);
            if (!validationResultOnValidateSchema.isValid) {
                StringBuilder sb = new StringBuilder("Migration didn't properly handle: ");
                sb.append(validationResultOnValidateSchema.expectedFoundMsg);
                throw new IllegalStateException(sb.toString().toString());
            }
            getOpenDelegate().onPostMigrate(p0);
            updateIdentity(p0);
            return;
        }
        if (MigrationUtil.isMigrationRequired(getConfiguration(), p1, p2)) {
            StringBuilder sb2 = new StringBuilder("A migration from ");
            sb2.append(p1);
            sb2.append(" to ");
            sb2.append(p2);
            sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        dropAllTables(p0);
        invokeDestructiveMigrationCallback(p0);
        getOpenDelegate().createAllTables(p0);
    }

    private final void dropAllTables(SQLiteConnection p0) throws Exception {
        if (getConfiguration().allowDestructiveMigrationForAllTables) {
            SQLiteStatement sQLiteStatementPrepare = p0.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                while (sQLiteStatement.step()) {
                    String text = sQLiteStatement.getText(0);
                    if (!StringsKt.startsWith$default(text, "sqlite_", false, 2, (Object) null) && !Intrinsics.areEqual(text, "android_metadata")) {
                        listCreateListBuilder.add(TuplesKt.to(text, Boolean.valueOf(Intrinsics.areEqual(sQLiteStatement.getText(1), "view"))));
                    }
                }
                List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                for (Pair pair : listBuild) {
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        SQLite.execSQL(p0, "DROP VIEW IF EXISTS ".concat(String.valueOf(str)));
                    } else {
                        SQLite.execSQL(p0, "DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
                    }
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                    throw th2;
                }
            }
        }
        getOpenDelegate().dropAllTables(p0);
    }

    protected final void onOpen(SQLiteConnection p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        checkIdentity(p0);
        getOpenDelegate().onOpen(p0);
        invokeOpenCallback(p0);
        this.isConfigured = true;
    }

    private final void checkIdentity(SQLiteConnection p0) throws Exception {
        Object objM8024constructorimpl;
        if (hasRoomMasterTable(p0)) {
            SQLiteStatement sQLiteStatementPrepare = p0.prepare(RoomMasterTable.READ_QUERY);
            try {
                SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
                String text = sQLiteStatement.step() ? sQLiteStatement.getText(0) : null;
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                if (Intrinsics.areEqual(getOpenDelegate().getIdentityHash(), text) || Intrinsics.areEqual(getOpenDelegate().getLegacyIdentityHash(), text)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                sb.append(getOpenDelegate().getIdentityHash());
                sb.append(", found: ");
                sb.append(text);
                throw new IllegalStateException(sb.toString().toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                    throw th2;
                }
            }
        }
        SQLite.execSQL(p0, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseRoomConnectionManager baseRoomConnectionManager = this;
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(p0);
            if (!validationResultOnValidateSchema.isValid) {
                StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb2.append(validationResultOnValidateSchema.expectedFoundMsg);
                throw new IllegalStateException(sb2.toString().toString());
            }
            getOpenDelegate().onPostMigrate(p0);
            updateIdentity(p0);
            objM8024constructorimpl = Result.m8024constructorimpl(Unit.INSTANCE);
            if (Result.m8031isSuccessimpl(objM8024constructorimpl)) {
                SQLite.execSQL(p0, "END TRANSACTION");
            }
            Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(objM8024constructorimpl);
            if (thM8027exceptionOrNullimpl != null) {
                SQLite.execSQL(p0, "ROLLBACK TRANSACTION");
                throw thM8027exceptionOrNullimpl;
            }
            Result.m8023boximpl(objM8024constructorimpl);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th3));
        }
    }

    private final boolean hasRoomMasterTable(SQLiteConnection p0) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = p0.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            boolean z = false;
            if (sQLiteStatement.step() && sQLiteStatement.getLong(0) != 0) {
                z = true;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return z;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    protected final int getMaxNumberOfReaders(RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "");
        int i = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        StringBuilder sb = new StringBuilder("Can't get max number of reader for journal mode '");
        sb.append(journalMode);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    protected final int getMaxNumberOfWriters(RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "");
        int i = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("Can't get max number of writers for journal mode '");
        sb.append(journalMode);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    private final void invokeCreateCallback(SQLiteConnection p0) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onCreate(p0);
        }
    }

    private final void invokeDestructiveMigrationCallback(SQLiteConnection p0) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(p0);
        }
    }

    private final void invokeOpenCallback(SQLiteConnection p0) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onOpen(p0);
        }
    }

    public String resolveFileName$room_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
