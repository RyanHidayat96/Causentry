package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "<init>", "()V", "", "p0", "p1", "Landroid/net/NetworkRequest;", "createNetworkRequest", "([I[I)Landroid/net/NetworkRequest;", "Landroidx/work/impl/utils/NetworkRequestCompat;", "createNetworkRequestCompat$work_runtime_release", "([I[I)Landroidx/work/impl/utils/NetworkRequestCompat;", "", "", "hasCapability$work_runtime_release", "(Landroid/net/NetworkRequest;I)Z", "hasTransport$work_runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.hasCapability(p1);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.hasTransport(p1);
    }

    @JvmStatic
    public static final NetworkRequest createNetworkRequest(int[] p0, int[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : p0) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e2) {
                Logger logger = Logger.get();
                String tag = NetworkRequestCompat.INSTANCE.getTAG();
                StringBuilder sb = new StringBuilder("Ignoring adding capability '");
                sb.append(i);
                sb.append('\'');
                logger.warning(tag, sb.toString(), e2);
            }
        }
        for (int i2 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!ArraysKt.contains(p0, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e3) {
                    Logger logger2 = Logger.get();
                    String tag2 = NetworkRequestCompat.INSTANCE.getTAG();
                    StringBuilder sb2 = new StringBuilder("Ignoring removing default capability '");
                    sb2.append(i2);
                    sb2.append('\'');
                    logger2.warning(tag2, sb2.toString(), e3);
                }
            }
        }
        for (int i3 : p1) {
            builder.addTransportType(i3);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] p0, int[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new NetworkRequestCompat(createNetworkRequest(p0, p1));
    }
}
