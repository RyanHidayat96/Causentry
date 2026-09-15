package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "", "p0", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "p1", "Lokio/ByteString;", "p2", "<init>", "(JLokhttp3/tls/internal/der/AlgorithmIdentifier;Lokio/ByteString;)V", "component1", "()J", "component2", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component3", "()Lokio/ByteString;", "copy", "(JLokhttp3/tls/internal/der/AlgorithmIdentifier;Lokio/ByteString;)Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "algorithmIdentifier", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getAlgorithmIdentifier", "privateKey", "Lokio/ByteString;", "getPrivateKey", "version", "J", "getVersion"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PrivateKeyInfo {
    private final AlgorithmIdentifier algorithmIdentifier;
    private final ByteString privateKey;
    private final long version;

    public PrivateKeyInfo(long j, AlgorithmIdentifier algorithmIdentifier, ByteString byteString) {
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        this.version = j;
        this.algorithmIdentifier = algorithmIdentifier;
        this.privateKey = byteString;
    }

    public final long getVersion() {
        return this.version;
    }

    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public final ByteString getPrivateKey() {
        return this.privateKey;
    }

    public final int hashCode() {
        return (((((int) this.version) * 31) + this.algorithmIdentifier.hashCode()) * 31) + this.privateKey.hashCode();
    }

    public static /* synthetic */ PrivateKeyInfo copy$default(PrivateKeyInfo privateKeyInfo, long j, AlgorithmIdentifier algorithmIdentifier, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = privateKeyInfo.version;
        }
        if ((i & 2) != 0) {
            algorithmIdentifier = privateKeyInfo.algorithmIdentifier;
        }
        if ((i & 4) != 0) {
            byteString = privateKeyInfo.privateKey;
        }
        return privateKeyInfo.copy(j, algorithmIdentifier, byteString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ByteString getPrivateKey() {
        return this.privateKey;
    }

    public final PrivateKeyInfo copy(long p0, AlgorithmIdentifier p1, ByteString p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new PrivateKeyInfo(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PrivateKeyInfo)) {
            return false;
        }
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) p0;
        return this.version == privateKeyInfo.version && Intrinsics.areEqual(this.algorithmIdentifier, privateKeyInfo.algorithmIdentifier) && Intrinsics.areEqual(this.privateKey, privateKeyInfo.privateKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivateKeyInfo(version=");
        sb.append(this.version);
        sb.append(", algorithmIdentifier=");
        sb.append(this.algorithmIdentifier);
        sb.append(", privateKey=");
        sb.append(this.privateKey);
        sb.append(')');
        return sb.toString();
    }
}
