package androidx.work.impl.utils;

import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest31;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "p0", "", "capabilities", "(Landroid/net/NetworkRequest;)[I", "transportTypes"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class NetworkRequest31 {
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    private NetworkRequest31() {
    }

    public final int[] capabilities(NetworkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] capabilities = p0.getCapabilities();
        Intrinsics.checkNotNullExpressionValue(capabilities, "");
        return capabilities;
    }

    public final int[] transportTypes(NetworkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] transportTypes = p0.getTransportTypes();
        Intrinsics.checkNotNullExpressionValue(transportTypes, "");
        return transportTypes;
    }
}
