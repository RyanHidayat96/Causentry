package androidx.room;

import androidx.database.SQLiteStatement;
import androidx.database.db.SupportSQLiteProgram;
import androidx.database.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002EDB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\rJ\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\rR\u001a\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\rR\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010\rR\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\rR\u001a\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\rR$\u0010?\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)R\u0014\u0010C\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "p0", "<init>", "(I)V", "", "p1", "", "init", "(Ljava/lang/String;I)V", "release", "()V", "Landroidx/room/RoomRawQuery;", "toRoomRawQuery", "()Landroidx/room/RoomRawQuery;", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "Landroidx/sqlite/SQLiteStatement;", "(Landroidx/sqlite/SQLiteStatement;)V", "bindNull", "", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "bindText", "", "bindBlob", "(I[B)V", "close", "copyArgumentsFrom", "(Landroidx/room/RoomSQLiteQuery;)V", "clearBindings", "capacity", "I", "getCapacity", "()I", SearchIntents.EXTRA_QUERY, "Ljava/lang/String;", "", "longBindings", "[J", "getLongBindings$annotations", "", "doubleBindings", "[D", "getDoubleBindings$annotations", "", "stringBindings", "[Ljava/lang/String;", "getStringBindings$annotations", "blobBindings", "[[B", "getBlobBindings$annotations", "", "bindingTypes", "[I", "getBindingTypes$annotations", "argCount", "getArgCount", "getSql", "()Ljava/lang/String;", "sql", "Companion", "Binding"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2][];
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final int getArgCount() {
        return this.argCount;
    }

    public final void init(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.query = p0;
        this.argCount = p1;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toRoomRawQuery$lambda$1(RoomSQLiteQuery roomSQLiteQuery, SQLiteStatement sQLiteStatement) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        roomSQLiteQuery.bindTo(sQLiteStatement);
        return Unit.INSTANCE;
    }

    public final RoomRawQuery toRoomRawQuery() {
        return new RoomRawQuery(getQuery(), new Function1() { // from class: androidx.room.RoomSQLiteQuery$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomSQLiteQuery.toRoomRawQuery$lambda$1(this.f$0, (SQLiteStatement) obj);
            }
        });
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: getSql */
    public final String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int argCount = getArgCount();
        if (argCount <= 0) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                p0.bindNull(i);
            } else if (i2 == 2) {
                p0.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                p0.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                p0.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                p0.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void bindTo(SQLiteStatement p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int argCount = getArgCount();
        if (argCount <= 0) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                p0.mo7357bindNull(i);
            } else if (i2 == 2) {
                p0.mo7356bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                p0.mo7355bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                p0.mo7358bindText(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                p0.mo7354bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindNull(int p0) {
        this.bindingTypes[p0] = 1;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindLong(int p0, long p1) {
        this.bindingTypes[p0] = 2;
        this.longBindings[p0] = p1;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindDouble(int p0, double p1) {
        this.bindingTypes[p0] = 3;
        this.doubleBindings[p0] = p1;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindString(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.bindingTypes[p0] = 4;
        this.stringBindings[p0] = p1;
    }

    public final void bindText(int p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        bindString(p0, p1);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void bindBlob(int p0, byte[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.bindingTypes[p0] = 5;
        this.blobBindings[p0] = p1;
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int argCount = p0.getArgCount() + 1;
        System.arraycopy(p0.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(p0.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(p0.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(p0.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(p0.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public final void clearBindings() {
        ArraysKt.fill$default(this.bindingTypes, 1, 0, 0, 6, (Object) null);
        ArraysKt.fill$default(this.stringBindings, (Object) null, 0, 0, 6, (Object) null);
        ArraysKt.fill$default(this.blobBindings, (Object) null, 0, 0, 6, (Object) null);
        this.query = null;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\n8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteQuery;", "p0", "Landroidx/room/RoomSQLiteQuery;", "copyFrom", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/room/RoomSQLiteQuery;", "", "", "p1", "acquire", "(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;", "", "prunePoolLocked$room_runtime_release", "POOL_LIMIT", "I", "getPOOL_LIMIT$annotations", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "NULL", "LONG", "DOUBLE", "STRING", "BLOB"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(p0.getQuery(), p0.getArgCount());
            p0.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.database.db.SupportSQLiteProgram
                public final void bindBlob(int p1, byte[] p2) {
                    Intrinsics.checkNotNullParameter(p2, "");
                    roomSQLiteQueryAcquire.bindBlob(p1, p2);
                }

                @Override // androidx.database.db.SupportSQLiteProgram
                public final void bindDouble(int p1, double p2) {
                    roomSQLiteQueryAcquire.bindDouble(p1, p2);
                }

                @Override // androidx.database.db.SupportSQLiteProgram
                public final void bindLong(int p1, long p2) {
                    roomSQLiteQueryAcquire.bindLong(p1, p2);
                }

                @Override // androidx.database.db.SupportSQLiteProgram
                public final void bindNull(int p1) {
                    roomSQLiteQueryAcquire.bindNull(p1);
                }

                @Override // androidx.database.db.SupportSQLiteProgram
                public final void bindString(int p1, String p2) {
                    Intrinsics.checkNotNullParameter(p2, "");
                    roomSQLiteQueryAcquire.bindString(p1, p2);
                }

                @Override // androidx.database.db.SupportSQLiteProgram
                public final void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        @JvmStatic
        public final RoomSQLiteQuery acquire(String p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            synchronized (RoomSQLiteQuery.queryPool) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = RoomSQLiteQuery.queryPool.ceilingEntry(Integer.valueOf(p1));
                if (entryCeilingEntry != null) {
                    RoomSQLiteQuery.queryPool.remove(entryCeilingEntry.getKey());
                    RoomSQLiteQuery value = entryCeilingEntry.getValue();
                    value.init(p0, p1);
                    Intrinsics.checkNotNull(value);
                    return value;
                }
                Unit unit = Unit.INSTANCE;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(p1, null);
                roomSQLiteQuery.init(p0, p1);
                return roomSQLiteQuery;
            }
        }

        public final void prunePoolLocked$room_runtime_release() {
            if (RoomSQLiteQuery.queryPool.size() > 15) {
                Iterator<Integer> it = RoomSQLiteQuery.queryPool.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                for (int size = RoomSQLiteQuery.queryPool.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @JvmStatic
    public static final RoomSQLiteQuery acquire(String str, int i) {
        return INSTANCE.acquire(str, i);
    }

    @JvmStatic
    public static final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        return INSTANCE.copyFrom(supportSQLiteQuery);
    }
}
