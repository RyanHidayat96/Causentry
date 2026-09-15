package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lokhttp3/tls/internal/der/Extension;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;ZLjava/lang/Object;)Lokhttp3/tls/internal/der/Extension;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "critical", "Z", "getCritical", "id", "Ljava/lang/String;", "getId", "value", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Extension {
    private final boolean critical;
    private final String id;
    private final Object value;

    public Extension(String str, boolean z, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.critical = z;
        this.value = obj;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getCritical() {
        return this.critical;
    }

    public final Object getValue() {
        return this.value;
    }

    public static /* synthetic */ Extension copy$default(Extension extension, String str, boolean z, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = extension.id;
        }
        if ((i & 2) != 0) {
            z = extension.critical;
        }
        if ((i & 4) != 0) {
            obj = extension.value;
        }
        return extension.copy(str, z, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCritical() {
        return this.critical;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final Extension copy(String p0, boolean p1, Object p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new Extension(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) p0;
        return Intrinsics.areEqual(this.id, extension.id) && this.critical == extension.critical && Intrinsics.areEqual(this.value, extension.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        boolean z = this.critical;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        Object obj = this.value;
        return (((iHashCode * 31) + r1) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Extension(id=");
        sb.append(this.id);
        sb.append(", critical=");
        sb.append(this.critical);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
