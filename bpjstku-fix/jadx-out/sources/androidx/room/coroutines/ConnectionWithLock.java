package androidx.room.coroutines;

import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import defpackage.VideoEncoderConfig;
import defpackage.isSizeSupported;
import defpackage.toIllegalArgumentException;
import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0096A¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00178\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\"\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00020,8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock;", "Landroidx/sqlite/SQLiteConnection;", "LVideoEncoderConfig;", "p0", "p1", "<init>", "(Landroidx/sqlite/SQLiteConnection;LVideoEncoderConfig;)V", "Lkotlin/coroutines/CoroutineContext;", "markAcquired", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/room/coroutines/ConnectionWithLock;", "markReleased", "()Landroidx/room/coroutines/ConnectionWithLock;", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "dump", "(Ljava/lang/StringBuilder;)V", "", "toString", "()Ljava/lang/String;", "close", "()V", "", "", "holdsLock", "(Ljava/lang/Object;)Z", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteStatement;", "prepare", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "delegate", "Landroidx/sqlite/SQLiteConnection;", "LVideoEncoderConfig;", "acquireCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "", "acquireThrowable", "Ljava/lang/Throwable;", "isLocked", "()Z", "LisSizeSupported;", "getOnLock", "()LisSizeSupported;", "onLock"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ConnectionWithLock implements SQLiteConnection, VideoEncoderConfig {
    private CoroutineContext acquireCoroutineContext;
    private Throwable acquireThrowable;
    private final SQLiteConnection delegate;
    private final VideoEncoderConfig lock;

    public ConnectionWithLock(SQLiteConnection sQLiteConnection, VideoEncoderConfig videoEncoderConfig) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(videoEncoderConfig, "");
        this.delegate = sQLiteConnection;
        this.lock = videoEncoderConfig;
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, VideoEncoderConfig videoEncoderConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteConnection, (i & 2) != 0 ? toIllegalArgumentException.b(false) : videoEncoderConfig);
    }

    public final ConnectionWithLock markAcquired(CoroutineContext p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.acquireCoroutineContext = p0;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public final ConnectionWithLock markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    public final void dump(StringBuilder p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.acquireCoroutineContext != null || this.acquireThrowable != null) {
            p0.append("\t\tStatus: Acquired connection\n");
            CoroutineContext coroutineContext = this.acquireCoroutineContext;
            if (coroutineContext != null) {
                p0.append("\t\tCoroutine: ".concat(String.valueOf(coroutineContext)));
                p0.append('\n');
            }
            Throwable th = this.acquireThrowable;
            if (th != null) {
                p0.append("\t\tAcquired:\n");
                Iterator it = CollectionsKt.drop(StringsKt.lines(ExceptionsKt.stackTraceToString(th)), 1).iterator();
                while (it.hasNext()) {
                    p0.append("\t\t".concat(String.valueOf((String) it.next())));
                    p0.append('\n');
                }
                return;
            }
            return;
        }
        p0.append("\t\tStatus: Free connection\n");
    }

    public final String toString() {
        return this.delegate.toString();
    }

    @Override // androidx.database.SQLiteConnection, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    @Override // defpackage.VideoEncoderConfig
    public final isSizeSupported<Object, VideoEncoderConfig> getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // defpackage.VideoEncoderConfig
    public final boolean holdsLock(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.lock.holdsLock(p0);
    }

    @Override // defpackage.VideoEncoderConfig
    public final boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // defpackage.VideoEncoderConfig
    public final Object lock(Object obj, Continuation<? super Unit> continuation) {
        return this.lock.lock(obj, continuation);
    }

    @Override // androidx.database.SQLiteConnection
    public final SQLiteStatement prepare(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.delegate.prepare(p0);
    }

    @Override // defpackage.VideoEncoderConfig
    public final boolean tryLock(Object p0) {
        return this.lock.tryLock(p0);
    }

    @Override // defpackage.VideoEncoderConfig
    public final void unlock(Object p0) {
        this.lock.unlock(p0);
    }
}
