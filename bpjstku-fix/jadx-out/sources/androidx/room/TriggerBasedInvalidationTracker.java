package androidx.room;

import androidx.database.SQLite;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import androidx.room.concurrent.CloseBarrier;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.hasEndOfStreamFlag;
import defpackage.lambdaselectSampleRateOrNearestSupported0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 N2\u00020\u0001:\u0001NBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00172\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0000¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b'\u0010&J@\u0010)\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0(2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0(H\u0080@¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0(2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0(H\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b-\u0010#J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0082@¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0000¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R&\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u00060Dj\u0002`E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR(\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "p0", "", "", "p1", "", "p2", "", "p3", "", "p4", "Lkotlin/Function1;", "", "", "p5", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Landroidx/sqlite/SQLiteConnection;", "configureConnection", "(Landroidx/sqlite/SQLiteConnection;)V", "", "LclampVideoBitrateIfNotSupported;", "createFlow$room_runtime_release", "([Ljava/lang/String;[IZ)LclampVideoBitrateIfNotSupported;", "Lkotlin/Pair;", "validateTableNames$room_runtime_release", "([Ljava/lang/String;)Lkotlin/Pair;", "resolveViews", "([Ljava/lang/String;)[Ljava/lang/String;", "onObserverAdded$room_runtime_release", "([I)Z", "onObserverRemoved$room_runtime_release", "syncTriggers$room_runtime_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/PooledConnection;", "startTrackingTable", "(Landroidx/room/PooledConnection;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTrackingTable", "Lkotlin/Function0;", "refreshInvalidation$room_runtime_release", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshInvalidationAsync$room_runtime_release", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "notifyInvalidation", "checkInvalidatedTables", "(Landroidx/room/PooledConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetSync$room_runtime_release", "()V", "database", "Landroidx/room/RoomDatabase;", "shadowTablesMap", "Ljava/util/Map;", "viewTables", "useTempTable", "Z", "onInvalidatedTablesIds", "Lkotlin/jvm/functions/Function1;", "tableIdLookup", "tablesNames", "[Ljava/lang/String;", "Landroidx/room/ObservedTableStates;", "observedTableStates", "Landroidx/room/ObservedTableStates;", "Landroidx/room/ObservedTableVersions;", "observedTableVersions", "Landroidx/room/ObservedTableVersions;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/TuitionPaymentFragmentbindingInflater1;", "pendingRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onAllowRefresh", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime_release", "()Lkotlin/jvm/functions/Function0;", "setOnAllowRefresh$room_runtime_release", "(Lkotlin/jvm/functions/Function0;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriggerBasedInvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String DROP_TRACKING_TABLE_SQL = "DROP TABLE IF EXISTS room_table_modification_log";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    private static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    private static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private final RoomDatabase database;
    private final ObservedTableStates observedTableStates;
    private final ObservedTableVersions observedTableVersions;
    private Function0<Boolean> onAllowRefresh;
    private final Function1<Set<Integer>, Unit> onInvalidatedTablesIds;
    private final AtomicBoolean pendingRefresh;
    private final Map<String, String> shadowTablesMap;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final boolean useTempTable;
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] TRIGGERS = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 1}, l = {440, 448}, m = "checkInvalidatedTables", n = {"connection", "invalidatedTableIds"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.checkInvalidatedTables(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {412}, m = "notifyInvalidation", n = {"this", "$this$ifNotClosed$iv"}, s = {"L$0", "L$1"})
    static final class C06621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C06621(Continuation<? super C06621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.notifyInvalidation(this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {323, 328}, m = "startTrackingTable", n = {"this", "connection", "tableId", "this", "connection", "tableName", "tableId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
    static final class C06631 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C06631(Continuation<? super C06631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.startTrackingTable(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {342}, m = "stopTrackingTable", n = {"connection", "tableName"}, s = {"L$0", "L$1"})
    static final class C06641 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C06641(Continuation<? super C06641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.stopTrackingTable(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAllowRefresh$lambda$0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, ? extends Set<String>> map2, String[] strArr, boolean z, Function1<? super Set<Integer>, Unit> function1) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(roomDatabase, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.useTempTable = z;
        this.onInvalidatedTablesIds = function1;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new Function0() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(TriggerBasedInvalidationTracker.onAllowRefresh$lambda$0());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase2 = strArr[i].toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i));
            String str = this.shadowTablesMap.get(strArr[i]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String lowerCase3 = entry.getValue().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, (Integer) MapsKt.getValue(map3, lowerCase3));
            }
        }
        this.observedTableStates = new ObservedTableStates(this.tablesNames.length);
        this.observedTableVersions = new ObservedTableVersions(this.tablesNames.length);
    }

    public final Function0<Boolean> getOnAllowRefresh$room_runtime_release() {
        return this.onAllowRefresh;
    }

    public final void setOnAllowRefresh$room_runtime_release(Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onAllowRefresh = function0;
    }

    public final void configureConnection(SQLiteConnection p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        SQLiteStatement sQLiteStatementPrepare = p0.prepare("PRAGMA query_only");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            boolean z = sQLiteStatement.getBoolean(0);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            if (z) {
                return;
            }
            SQLite.execSQL(p0, "PRAGMA temp_store = MEMORY");
            SQLite.execSQL(p0, "PRAGMA recursive_triggers = 1");
            SQLite.execSQL(p0, DROP_TRACKING_TABLE_SQL);
            if (this.useTempTable) {
                SQLite.execSQL(p0, CREATE_TRACKING_TABLE_SQL);
            } else {
                SQLite.execSQL(p0, StringsKt.replace$default(CREATE_TRACKING_TABLE_SQL, "TEMP", "", false, 4, (Object) null));
            }
            this.observedTableStates.forceNeedSync$room_runtime_release();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final clampVideoBitrateIfNotSupported<Set<String>> createFlow$room_runtime_release(String[] p0, int[] p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TriggerBasedInvalidationTracker$createFlow$1(this, p1, p2, p0, null));
    }

    public final Pair<String[], int[]> validateTableNames$room_runtime_release(String[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String[] strArrResolveViews = resolveViews(p0);
        int length = strArrResolveViews.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str = strArrResolveViews[i];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str)));
            }
            iArr[i] = num.intValue();
        }
        return TuplesKt.to(strArrResolveViews, iArr);
    }

    private final String[] resolveViews(String[] p0) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : p0) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
    }

    public final boolean onObserverAdded$room_runtime_release(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.observedTableStates.onObserverAdded$room_runtime_release(p0);
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.observedTableStates.onObserverRemoved$room_runtime_release(p0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object syncTriggers$room_runtime_release(Continuation<? super Unit> continuation) throws Throwable {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        CloseBarrier closeBarrier;
        Throwable th;
        if (continuation instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuation;
            if ((triggerBasedInvalidationTracker$syncTriggers$1.label & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.label -= Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuation);
            }
        } else {
            triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuation);
        }
        Object obj = triggerBasedInvalidationTracker$syncTriggers$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = triggerBasedInvalidationTracker$syncTriggers$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CloseBarrier closeBarrier2 = this.database.getCloseBarrier();
            if (closeBarrier2.block$room_runtime_release()) {
                try {
                    RoomDatabase roomDatabase = this.database;
                    TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, null);
                    triggerBasedInvalidationTracker$syncTriggers$1.L$0 = closeBarrier2;
                    triggerBasedInvalidationTracker$syncTriggers$1.label = 1;
                    if (roomDatabase.useConnection$room_runtime_release(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeBarrier = closeBarrier2;
                    closeBarrier.unblock$room_runtime_release();
                } catch (Throwable th2) {
                    closeBarrier = closeBarrier2;
                    th = th2;
                    closeBarrier.unblock$room_runtime_release();
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier = (CloseBarrier) triggerBasedInvalidationTracker$syncTriggers$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                closeBarrier.unblock$room_runtime_release();
            } catch (Throwable th3) {
                th = th3;
                closeBarrier.unblock$room_runtime_release();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f8 -> B:29:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object startTrackingTable(androidx.room.PooledConnection r18, int r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.startTrackingTable(androidx.room.PooledConnection, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0083 -> B:20:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object stopTrackingTable(androidx.room.PooledConnection r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.room.TriggerBasedInvalidationTracker.C06641
            if (r0 == 0) goto L14
            r0 = r12
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C06641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 + r2
            r0.label = r12
            goto L19
        L14:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$2
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$0
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r4
            goto L85
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = androidx.room.TriggerBasedInvalidationTracker.TRIGGERS
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L53:
            if (r4 >= r10) goto L89
            r5 = r2[r4]
            androidx.room.TriggerBasedInvalidationTracker$Companion r6 = androidx.room.TriggerBasedInvalidationTracker.INSTANCE
            java.lang.String r5 = androidx.room.TriggerBasedInvalidationTracker.Companion.access$getTriggerName(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.I$0 = r4
            r0.I$1 = r10
            r0.label = r3
            java.lang.Object r5 = androidx.room.TransactorKt.execSQL(r11, r5, r0)
            if (r5 != r1) goto L83
            return r1
        L83:
            r5 = r11
            r11 = r4
        L85:
            int r4 = r11 + 1
            r11 = r5
            goto L53
        L89:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.stopTrackingTable(androidx.room.PooledConnection, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object refreshInvalidation$room_runtime_release(String[] strArr, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super Boolean> continuation) {
        TriggerBasedInvalidationTracker$refreshInvalidation$1 triggerBasedInvalidationTracker$refreshInvalidation$1;
        int[] iArrComponent2;
        if (continuation instanceof TriggerBasedInvalidationTracker$refreshInvalidation$1) {
            triggerBasedInvalidationTracker$refreshInvalidation$1 = (TriggerBasedInvalidationTracker$refreshInvalidation$1) continuation;
            if ((triggerBasedInvalidationTracker$refreshInvalidation$1.label & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$refreshInvalidation$1.label -= Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$refreshInvalidation$1 = new TriggerBasedInvalidationTracker$refreshInvalidation$1(this, continuation);
            }
        } else {
            triggerBasedInvalidationTracker$refreshInvalidation$1 = new TriggerBasedInvalidationTracker$refreshInvalidation$1(this, continuation);
        }
        Object objNotifyInvalidation = triggerBasedInvalidationTracker$refreshInvalidation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = triggerBasedInvalidationTracker$refreshInvalidation$1.label;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objNotifyInvalidation);
                iArrComponent2 = validateTableNames$room_runtime_release(strArr).component2();
                function0.invoke();
                triggerBasedInvalidationTracker$refreshInvalidation$1.L$0 = function1;
                triggerBasedInvalidationTracker$refreshInvalidation$1.L$1 = iArrComponent2;
                triggerBasedInvalidationTracker$refreshInvalidation$1.label = 1;
                objNotifyInvalidation = notifyInvalidation(triggerBasedInvalidationTracker$refreshInvalidation$1);
                if (objNotifyInvalidation == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArrComponent2 = (int[]) triggerBasedInvalidationTracker$refreshInvalidation$1.L$1;
                function1 = (Function0) triggerBasedInvalidationTracker$refreshInvalidation$1.L$0;
                ResultKt.throwOnFailure(objNotifyInvalidation);
            }
            Set set = (Set) objNotifyInvalidation;
            if (iArrComponent2.length == 0) {
                if (set.isEmpty()) {
                    z = false;
                    break;
                }
            } else {
                int length = iArrComponent2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (set.contains(Boxing.boxInt(iArrComponent2[i2]))) {
                        break;
                    }
                    i2++;
                }
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
            function1.invoke();
            return boolBoxBoolean;
        } catch (Throwable th) {
            function1.invoke();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object refreshInvalidation$room_runtime_release$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, String[] strArr, Function0 function0, Function0 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = new Function0() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return triggerBasedInvalidationTracker.refreshInvalidation$room_runtime_release(strArr, function0, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshInvalidationAsync$room_runtime_release$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function1 = new Function0() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        triggerBasedInvalidationTracker.refreshInvalidationAsync$room_runtime_release(function0, function1);
    }

    public final void refreshInvalidationAsync$room_runtime_release(Function0<Unit> p0, Function0<Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            p0.invoke();
            b.TuitionPaymentFragmentbindingInflater1(this.database.getCoroutineScope(), new lambdaselectSampleRateOrNearestSupported0("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, p1, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object notifyInvalidation(Continuation<? super Set<Integer>> continuation) throws Throwable {
        C06621 c06621;
        CloseBarrier closeBarrier;
        CloseBarrier closeBarrier2;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
        if (continuation instanceof C06621) {
            c06621 = (C06621) continuation;
            if ((c06621.label & Integer.MIN_VALUE) != 0) {
                c06621.label -= Integer.MIN_VALUE;
            } else {
                c06621 = new C06621(continuation);
            }
        } else {
            c06621 = new C06621(continuation);
        }
        Object obj = c06621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06621.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.block$room_runtime_release()) {
                try {
                    if (!this.pendingRefresh.compareAndSet(true, false)) {
                        Set setEmptySet = SetsKt.emptySet();
                        closeBarrier.unblock$room_runtime_release();
                        return setEmptySet;
                    }
                    if (!this.onAllowRefresh.invoke().booleanValue()) {
                        Set setEmptySet2 = SetsKt.emptySet();
                        closeBarrier.unblock$room_runtime_release();
                        return setEmptySet2;
                    }
                    RoomDatabase roomDatabase = this.database;
                    TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this, null);
                    c06621.L$0 = this;
                    c06621.L$1 = closeBarrier;
                    c06621.label = 1;
                    Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1, c06621);
                    if (objUseConnection$room_runtime_release == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeBarrier2 = closeBarrier;
                    obj = objUseConnection$room_runtime_release;
                    triggerBasedInvalidationTracker = this;
                } catch (Throwable th) {
                    th = th;
                    closeBarrier.unblock$room_runtime_release();
                    throw th;
                }
            } else {
                return SetsKt.emptySet();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier2 = (CloseBarrier) c06621.L$1;
            triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) c06621.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                closeBarrier = closeBarrier2;
                closeBarrier.unblock$room_runtime_release();
                throw th;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            triggerBasedInvalidationTracker.observedTableVersions.increment(set);
            triggerBasedInvalidationTracker.onInvalidatedTablesIds.invoke(set);
        }
        closeBarrier2.unblock$room_runtime_release();
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object checkInvalidatedTables(PooledConnection pooledConnection, Continuation<? super Set<Integer>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objUsePrepared = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objUsePrepared);
            Function1 function1 = new Function1() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TriggerBasedInvalidationTracker.checkInvalidatedTables$lambda$14((SQLiteStatement) obj);
                }
            };
            anonymousClass1.L$0 = pooledConnection;
            anonymousClass1.label = 1;
            objUsePrepared = pooledConnection.usePrepared(SELECT_UPDATED_TABLES_SQL, function1, anonymousClass1);
            if (objUsePrepared != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objUsePrepared);
            return set;
        }
        pooledConnection = (PooledConnection) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objUsePrepared);
        Set set2 = (Set) objUsePrepared;
        if (!set2.isEmpty()) {
            anonymousClass1.L$0 = set2;
            anonymousClass1.label = 2;
            if (TransactorKt.execSQL(pooledConnection, RESET_UPDATED_TABLES_SQL, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return set2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set checkInvalidatedTables$lambda$14(SQLiteStatement sQLiteStatement) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        while (sQLiteStatement.step()) {
            setCreateSetBuilder.add(Integer.valueOf((int) sQLiteStatement.getLong(0)));
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    public final void resetSync$room_runtime_release() {
        this.observedTableStates.resetTriggerState$room_runtime_release();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker$Companion;", "", "<init>", "()V", "", "p0", "p1", "getTriggerName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTriggerName(String p0, String p1) {
            StringBuilder sb = new StringBuilder("room_table_modification_trigger_");
            sb.append(p0);
            sb.append('_');
            sb.append(p1);
            return sb.toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
