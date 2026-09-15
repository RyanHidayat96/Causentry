package androidx.database.db;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "", "p0", "", "", "p1", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", SearchIntents.EXTRA_QUERY, "Ljava/lang/String;", "bindArgs", "[Ljava/lang/Object;", "getSql", "()Ljava/lang/String;", "sql", "", "getArgCount", "()I", "argCount", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Object[] bindArgs;
    private final String query;

    public SimpleSQLiteQuery(String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        this.query = str;
        this.bindArgs = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(String str) {
        this(str, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: getSql, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.bind(p0, this.bindArgs);
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "p0", "", "p1", "", "bind", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V", "", "p2", "(Landroidx/sqlite/db/SupportSQLiteProgram;ILjava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final void bind(SupportSQLiteProgram p0, Object[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 != null) {
                int length = p1.length;
                int i = 0;
                while (i < length) {
                    Object obj = p1[i];
                    i++;
                    bind(p0, i, obj);
                }
            }
        }

        private final void bind(SupportSQLiteProgram p0, int p1, Object p2) {
            if (p2 == null) {
                p0.bindNull(p1);
                return;
            }
            if (p2 instanceof byte[]) {
                p0.bindBlob(p1, (byte[]) p2);
                return;
            }
            if (p2 instanceof Float) {
                p0.bindDouble(p1, ((Number) p2).floatValue());
                return;
            }
            if (p2 instanceof Double) {
                p0.bindDouble(p1, ((Number) p2).doubleValue());
                return;
            }
            if (p2 instanceof Long) {
                p0.bindLong(p1, ((Number) p2).longValue());
                return;
            }
            if (p2 instanceof Integer) {
                p0.bindLong(p1, ((Number) p2).intValue());
                return;
            }
            if (p2 instanceof Short) {
                p0.bindLong(p1, ((Number) p2).shortValue());
                return;
            }
            if (p2 instanceof Byte) {
                p0.bindLong(p1, ((Number) p2).byteValue());
                return;
            }
            if (p2 instanceof String) {
                p0.bindString(p1, (String) p2);
                return;
            }
            if (p2 instanceof Boolean) {
                p0.bindLong(p1, ((Boolean) p2).booleanValue() ? 1L : 0L);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot bind ");
            sb.append(p2);
            sb.append(" at index ");
            sb.append(p1);
            sb.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            throw new IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final void bind(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        INSTANCE.bind(supportSQLiteProgram, objArr);
    }
}
