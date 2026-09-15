package androidx.room;

import androidx.database.SQLiteConnection;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteOpenHelper;
import androidx.database.sqlite.AndroidSQLiteDriver;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.driver.SupportSQLiteDriver;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u000256B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0003\u001a\u00020\u000f2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\rJ\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00048\u0015X\u0095\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Landroidx/room/RoomConnectionManager;", "Landroidx/room/BaseRoomConnectionManager;", "Landroidx/room/DatabaseConfiguration;", "p0", "Landroidx/room/RoomOpenDelegate;", "p1", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenDelegate;)V", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;)V", "", "init", "()V", "R", "", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "resolveFileName$room_runtime_release", "(Ljava/lang/String;)Ljava/lang/String;", "close", "isSupportDatabaseOpen", "()Z", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "installOnOpenCallback", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/room/DatabaseConfiguration;", "configuration", "Landroidx/room/DatabaseConfiguration;", "getConfiguration", "()Landroidx/room/DatabaseConfiguration;", "openDelegate", "Landroidx/room/RoomOpenDelegate;", "getOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "Ljava/util/List;", "getCallbacks", "()Ljava/util/List;", "Landroidx/room/coroutines/ConnectionPool;", "connectionPool", "Landroidx/room/coroutines/ConnectionPool;", "getSupportOpenHelper$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "supportOpenHelper", "supportDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "SupportOpenHelperCallback", "NoOpOpenDelegate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomConnectionManager extends BaseRoomConnectionManager {
    private final List<RoomDatabase.Callback> callbacks;
    private final DatabaseConfiguration configuration;
    private final ConnectionPool connectionPool;
    private final RoomOpenDelegate openDelegate;
    private SupportSQLiteDatabase supportDatabase;

    @Override // androidx.room.BaseRoomConnectionManager
    protected final DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    protected final RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    protected final List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
        SupportSQLiteDriver supportDriver;
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool == null || (supportDriver = supportSQLiteConnectionPool.getSupportDriver()) == null) {
            return null;
        }
        return supportDriver.getOpenHelper();
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, RoomOpenDelegate roomOpenDelegate) {
        AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPoolNewConnectionPool;
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        Intrinsics.checkNotNullParameter(roomOpenDelegate, "");
        this.configuration = databaseConfiguration;
        this.openDelegate = roomOpenDelegate;
        List<RoomDatabase.Callback> list = databaseConfiguration.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        if (databaseConfiguration.sqliteDriver == null) {
            if (databaseConfiguration.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!".toString());
            }
            androidSQLiteDriverConnectionPoolNewConnectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new SupportOpenHelperCallback(roomOpenDelegate.getVersion())).build())));
        } else {
            if (databaseConfiguration.sqliteDriver instanceof AndroidSQLiteDriver) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver);
                String str = databaseConfiguration.name;
                androidSQLiteDriverConnectionPoolNewConnectionPool = new AndroidSQLiteDriverConnectionPool(driverWrapper, str != null ? str : ":memory:");
            } else if (databaseConfiguration.name == null) {
                androidSQLiteDriverConnectionPoolNewConnectionPool = ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver), ":memory:");
            } else {
                androidSQLiteDriverConnectionPoolNewConnectionPool = ConnectionPoolKt.newConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver), databaseConfiguration.name, getMaxNumberOfReaders(databaseConfiguration.journalMode), getMaxNumberOfWriters(databaseConfiguration.journalMode));
            }
        }
        this.connectionPool = androidSQLiteDriverConnectionPoolNewConnectionPool;
        init();
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, Function1<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper> function1) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.configuration = databaseConfiguration;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = databaseConfiguration.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(function1.invoke(installOnOpenCallback(databaseConfiguration, new Function1() { // from class: androidx.room.RoomConnectionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomConnectionManager._init_$lambda$1(this.f$0, (SupportSQLiteDatabase) obj);
            }
        }))));
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        roomConnectionManager.supportDatabase = supportSQLiteDatabase;
        return Unit.INSTANCE;
    }

    private final void init() {
        boolean z = getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z);
        }
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public final <R> Object useConnection(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return this.connectionPool.useConnection(z, function2, continuation);
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public final String resolveFileName$room_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, ":memory:")) {
            return p0;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(p0).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    public final void close() {
        this.connectionPool.close();
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\t"}, d2 = {"Landroidx/room/RoomConnectionManager$SupportOpenHelperCallback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "p0", "<init>", "(Landroidx/room/RoomConnectionManager;I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "onCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "p1", "p2", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i) {
            super(i);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onCreate(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(p0));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onUpgrade(SupportSQLiteDatabase p0, int p1, int p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(p0), p1, p2);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onDowngrade(SupportSQLiteDatabase p0, int p1, int p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            onUpgrade(p0, p1, p2);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onOpen(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(p0));
            RoomConnectionManager.this.supportDatabase = p0;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/room/RoomConnectionManager$NoOpOpenDelegate;", "Landroidx/room/RoomOpenDelegate;", "<init>", "()V", "Landroidx/sqlite/SQLiteConnection;", "p0", "", "onCreate", "(Landroidx/sqlite/SQLiteConnection;)V", "onPreMigrate", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "onValidateSchema", "(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;", "onPostMigrate", "onOpen", "createAllTables", "dropAllTables"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onCreate(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onPreMigrate(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onPostMigrate(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onOpen(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void createAllTables(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void dropAllTables(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final Function1<? super SupportSQLiteDatabase, Unit> function1) {
        List<RoomDatabase.Callback> listEmptyList = databaseConfiguration.callbacks;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, CollectionsKt.plus((Collection<? extends RoomDatabase.Callback>) listEmptyList, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public final void onOpen(SupportSQLiteDatabase p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                function1.invoke(p0);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }
}
