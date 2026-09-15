package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lokhttp3/tls/internal/der/BasicConstraints;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/Long;)V", "component1", "()Z", "component2", "()Ljava/lang/Long;", "copy", "(ZLjava/lang/Long;)Lokhttp3/tls/internal/der/BasicConstraints;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ca", "Z", "getCa", "maxIntermediateCas", "Ljava/lang/Long;", "getMaxIntermediateCas"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BasicConstraints {
    private final boolean ca;
    private final Long maxIntermediateCas;

    public BasicConstraints(boolean z, Long l) {
        this.ca = z;
        this.maxIntermediateCas = l;
    }

    public final boolean getCa() {
        return this.ca;
    }

    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    public static /* synthetic */ BasicConstraints copy$default(BasicConstraints basicConstraints, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = basicConstraints.ca;
        }
        if ((i & 2) != 0) {
            l = basicConstraints.maxIntermediateCas;
        }
        return basicConstraints.copy(z, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCa() {
        return this.ca;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    public final BasicConstraints copy(boolean p0, Long p1) {
        return new BasicConstraints(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BasicConstraints)) {
            return false;
        }
        BasicConstraints basicConstraints = (BasicConstraints) p0;
        return this.ca == basicConstraints.ca && Intrinsics.areEqual(this.maxIntermediateCas, basicConstraints.maxIntermediateCas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.ca;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        Long l = this.maxIntermediateCas;
        return (r0 * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicConstraints(ca=");
        sb.append(this.ca);
        sb.append(", maxIntermediateCas=");
        sb.append(this.maxIntermediateCas);
        sb.append(')');
        return sb.toString();
    }
}
