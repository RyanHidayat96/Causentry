package okhttp3.tls.internal.der;

import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÇ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "algorithm", "Ljava/lang/String;", "getAlgorithm", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Ljava/lang/Object;", "getParameters"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AlgorithmIdentifier {
    private final String algorithm;
    private final Object parameters;

    public AlgorithmIdentifier(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algorithm = str;
        this.parameters = obj;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final Object getParameters() {
        return this.parameters;
    }

    public static /* synthetic */ AlgorithmIdentifier copy$default(AlgorithmIdentifier algorithmIdentifier, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = algorithmIdentifier.algorithm;
        }
        if ((i & 2) != 0) {
            obj = algorithmIdentifier.parameters;
        }
        return algorithmIdentifier.copy(str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getParameters() {
        return this.parameters;
    }

    public final AlgorithmIdentifier copy(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new AlgorithmIdentifier(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AlgorithmIdentifier)) {
            return false;
        }
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) p0;
        return Intrinsics.areEqual(this.algorithm, algorithmIdentifier.algorithm) && Intrinsics.areEqual(this.parameters, algorithmIdentifier.parameters);
    }

    public final int hashCode() {
        int iHashCode = this.algorithm.hashCode();
        Object obj = this.parameters;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlgorithmIdentifier(algorithm=");
        sb.append(this.algorithm);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(')');
        return sb.toString();
    }
}
