package okhttp3.internal.connection;

import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "Lokhttp3/Route;", "p0", "", "connected", "(Lokhttp3/Route;)V", TransactionResult.STATUS_FAILED, "", "shouldPostpone", "(Lokhttp3/Route;)Z", "", "failedRoutes", "Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final void failed(Route p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.failedRoutes.add(p0);
        }
    }

    public final void connected(Route p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.failedRoutes.remove(p0);
        }
    }

    public final boolean shouldPostpone(Route p0) {
        boolean zContains;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            zContains = this.failedRoutes.contains(p0);
        }
        return zContains;
    }
}
