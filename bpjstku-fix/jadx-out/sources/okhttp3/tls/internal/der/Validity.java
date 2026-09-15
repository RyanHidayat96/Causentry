package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lokhttp3/tls/internal/der/Validity;", "", "", "p0", "p1", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lokhttp3/tls/internal/der/Validity;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "notAfter", "J", "getNotAfter", "notBefore", "getNotBefore"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Validity {
    private final long notAfter;
    private final long notBefore;

    public Validity(long j, long j2) {
        this.notBefore = j;
        this.notAfter = j2;
    }

    public final long getNotBefore() {
        return this.notBefore;
    }

    public final long getNotAfter() {
        return this.notAfter;
    }

    public final int hashCode() {
        return (((int) this.notBefore) * 31) + ((int) this.notAfter);
    }

    public static /* synthetic */ Validity copy$default(Validity validity, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = validity.notBefore;
        }
        if ((i & 2) != 0) {
            j2 = validity.notAfter;
        }
        return validity.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getNotBefore() {
        return this.notBefore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getNotAfter() {
        return this.notAfter;
    }

    public final Validity copy(long p0, long p1) {
        return new Validity(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Validity)) {
            return false;
        }
        Validity validity = (Validity) p0;
        return this.notBefore == validity.notBefore && this.notAfter == validity.notAfter;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Validity(notBefore=");
        sb.append(this.notBefore);
        sb.append(", notAfter=");
        sb.append(this.notAfter);
        sb.append(')');
        return sb.toString();
    }
}
