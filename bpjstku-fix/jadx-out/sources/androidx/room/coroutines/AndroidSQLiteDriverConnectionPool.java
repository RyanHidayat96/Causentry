package androidx.room.coroutines;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteDriver;
import androidx.database.sqlite.AndroidSQLiteConnection;
import androidx.room.Transactor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0003\u001a\u00020\t2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/room/coroutines/AndroidSQLiteDriverConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "R", "", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "driver", "Landroidx/sqlite/SQLiteDriver;", "fileName", "Ljava/lang/String;", "Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "androidConnection$delegate", "Lkotlin/Lazy;", "getAndroidConnection", "()Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "androidConnection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {

    /* JADX INFO: renamed from: androidConnection$delegate, reason: from kotlin metadata */
    private final Lazy androidConnection;
    private final SQLiteDriver driver;
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(SQLiteDriver sQLiteDriver, String str) {
        Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.driver = sQLiteDriver;
        this.fileName = str;
        this.androidConnection = LazyKt.lazy(new Function0() { // from class: androidx.room.coroutines.AndroidSQLiteDriverConnectionPool$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidSQLiteDriverConnectionPool.androidConnection_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final AndroidSQLiteDriverPooledConnection getAndroidConnection() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection sQLiteConnectionOpen = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        Intrinsics.checkNotNull(sQLiteConnectionOpen, "");
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) sQLiteConnectionOpen);
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final <R> Object useConnection(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return function2.invoke(getAndroidConnection(), continuation);
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public final void close() {
        getAndroidConnection().getDelegate().close();
    }
}
