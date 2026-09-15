package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lokhttp3/tls/internal/der/BitString;", "", "Lokio/ByteString;", "p0", "", "p1", "<init>", "(Lokio/ByteString;I)V", "component1", "()Lokio/ByteString;", "component2", "()I", "copy", "(Lokio/ByteString;I)Lokhttp3/tls/internal/der/BitString;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "byteString", "Lokio/ByteString;", "getByteString", "unusedBitsCount", "I", "getUnusedBitsCount"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BitString {
    private final ByteString byteString;
    private final int unusedBitsCount;

    public BitString(ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this.byteString = byteString;
        this.unusedBitsCount = i;
    }

    public final ByteString getByteString() {
        return this.byteString;
    }

    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    public final int hashCode() {
        return (this.byteString.hashCode() * 31) + this.unusedBitsCount;
    }

    public static /* synthetic */ BitString copy$default(BitString bitString, ByteString byteString, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            byteString = bitString.byteString;
        }
        if ((i2 & 2) != 0) {
            i = bitString.unusedBitsCount;
        }
        return bitString.copy(byteString, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteString getByteString() {
        return this.byteString;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    public final BitString copy(ByteString p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new BitString(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BitString)) {
            return false;
        }
        BitString bitString = (BitString) p0;
        return Intrinsics.areEqual(this.byteString, bitString.byteString) && this.unusedBitsCount == bitString.unusedBitsCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitString(byteString=");
        sb.append(this.byteString);
        sb.append(", unusedBitsCount=");
        sb.append(this.unusedBitsCount);
        sb.append(')');
        return sb.toString();
    }
}
