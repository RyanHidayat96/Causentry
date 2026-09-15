package androidx.room.driver;

import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/room/driver/SupportSQLiteConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/room/driver/SupportSQLiteDriver;", "p0", "<init>", "(Landroidx/room/driver/SupportSQLiteDriver;)V", "R", "", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "p1", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "supportDriver", "Landroidx/room/driver/SupportSQLiteDriver;", "getSupportDriver$room_runtime_release", "()Landroidx/room/driver/SupportSQLiteDriver;", "Landroidx/room/driver/SupportSQLitePooledConnection;", "getSupportConnection", "()Landroidx/room/driver/SupportSQLitePooledConnection;", "supportConnection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportSQLiteConnectionPool implements ConnectionPool {
    private final SupportSQLiteDriver supportDriver;

    public SupportSQLiteConnectionPool(SupportSQLiteDriver supportSQLiteDriver) {
        Intrinsics.checkNotNullParameter(supportSQLiteDriver, "");
        this.supportDriver = supportSQLiteDriver;
    }

    /* JADX INFO: renamed from: getSupportDriver$room_runtime_release, reason: from getter */
    public final SupportSQLiteDriver getSupportDriver() {
        return this.supportDriver;
    }

    private final SupportSQLitePooledConnection getSupportConnection() {
        String name = this.supportDriver.getOpenHelper().getName();
        if (name == null) {
            name = ":memory:";
        }
        return new SupportSQLitePooledConnection(this.supportDriver.open(name));
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public final <R> Object useConnection(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return function2.invoke(getSupportConnection(), continuation);
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public final void close() {
        this.supportDriver.getOpenHelper().close();
    }
}
