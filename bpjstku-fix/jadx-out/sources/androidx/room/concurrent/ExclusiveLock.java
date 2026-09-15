package androidx.room.concurrent;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/room/concurrent/ExclusiveLock;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lkotlin/Function1;", "", "", "withLock", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/b;", "threadLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/FileLock;", "fileLock", "Landroidx/room/concurrent/FileLock;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExclusiveLock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, ReentrantLock> threadLocksMap = new LinkedHashMap();
    private final FileLock fileLock;
    private final ReentrantLock threadLock;

    public ExclusiveLock(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Companion companion = INSTANCE;
        this.threadLock = companion.getThreadLock(str);
        this.fileLock = z ? companion.getFileLock(str) : null;
    }

    public final <T> T withLock(Function0<? extends T> p0, Function1 p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.threadLock.lock();
        boolean z = false;
        try {
            FileLock fileLock = this.fileLock;
            if (fileLock != null) {
                fileLock.lock();
            }
            z = true;
            try {
                T tInvoke = p0.invoke();
                FileLock fileLock2 = this.fileLock;
                if (fileLock2 != null) {
                    fileLock2.unlock();
                }
                this.threadLock.unlock();
                return tInvoke;
            } catch (Throwable th) {
                FileLock fileLock3 = this.fileLock;
                if (fileLock3 != null) {
                    fileLock3.unlock();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (z) {
                    throw th2;
                }
                p1.invoke(th2);
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                this.threadLock.unlock();
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/room/concurrent/ExclusiveLock$Companion;", "", "Landroidx/room/concurrent/SynchronizedObject;", "<init>", "()V", "", "p0", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/b;", "getThreadLock", "(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/FileLock;", "getFileLock", "(Ljava/lang/String;)Landroidx/room/concurrent/FileLock;", "", "threadLocksMap", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FileLock getFileLock(String p0) {
            return new FileLock(p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReentrantLock getThreadLock(String p0) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                Map map = ExclusiveLock.threadLocksMap;
                Object reentrantLock2 = map.get(p0);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    map.put(p0, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            }
            return reentrantLock;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
