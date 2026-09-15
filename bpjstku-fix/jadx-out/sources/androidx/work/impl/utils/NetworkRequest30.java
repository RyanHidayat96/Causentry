package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest30;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "p0", "Landroid/net/NetworkSpecifier;", "getNetworkSpecifier", "(Landroid/net/NetworkRequest;)Landroid/net/NetworkSpecifier;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetworkRequest30 {
    public static final NetworkRequest30 INSTANCE = new NetworkRequest30();

    private NetworkRequest30() {
    }

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getNetworkSpecifier();
    }
}
