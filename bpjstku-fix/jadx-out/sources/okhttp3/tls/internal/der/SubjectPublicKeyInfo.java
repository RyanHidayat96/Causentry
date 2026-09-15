package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "p0", "Lokhttp3/tls/internal/der/BitString;", "p1", "<init>", "(Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "component1", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component2", "()Lokhttp3/tls/internal/der/BitString;", "copy", "(Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "algorithm", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getAlgorithm", "subjectPublicKey", "Lokhttp3/tls/internal/der/BitString;", "getSubjectPublicKey"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SubjectPublicKeyInfo {
    private final AlgorithmIdentifier algorithm;
    private final BitString subjectPublicKey;

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, BitString bitString) {
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "");
        Intrinsics.checkNotNullParameter(bitString, "");
        this.algorithm = algorithmIdentifier;
        this.subjectPublicKey = bitString;
    }

    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public static /* synthetic */ SubjectPublicKeyInfo copy$default(SubjectPublicKeyInfo subjectPublicKeyInfo, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i, Object obj) {
        if ((i & 1) != 0) {
            algorithmIdentifier = subjectPublicKeyInfo.algorithm;
        }
        if ((i & 2) != 0) {
            bitString = subjectPublicKeyInfo.subjectPublicKey;
        }
        return subjectPublicKeyInfo.copy(algorithmIdentifier, bitString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public final SubjectPublicKeyInfo copy(AlgorithmIdentifier p0, BitString p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new SubjectPublicKeyInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubjectPublicKeyInfo)) {
            return false;
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) p0;
        return Intrinsics.areEqual(this.algorithm, subjectPublicKeyInfo.algorithm) && Intrinsics.areEqual(this.subjectPublicKey, subjectPublicKeyInfo.subjectPublicKey);
    }

    public final int hashCode() {
        return (this.algorithm.hashCode() * 31) + this.subjectPublicKey.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubjectPublicKeyInfo(algorithm=");
        sb.append(this.algorithm);
        sb.append(", subjectPublicKey=");
        sb.append(this.subjectPublicKey);
        sb.append(')');
        return sb.toString();
    }
}
