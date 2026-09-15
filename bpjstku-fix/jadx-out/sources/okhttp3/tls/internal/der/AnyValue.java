package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\"\u0010!\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u00102"}, d2 = {"Lokhttp3/tls/internal/der/AnyValue;", "", "", "p0", "", "p1", "", "p2", "p3", "Lokio/ByteString;", "p4", "<init>", "(IJZJLokio/ByteString;)V", "component1", "()I", "component2", "()J", "component3", "()Z", "component4", "component5", "()Lokio/ByteString;", "copy", "(IJZJLokio/ByteString;)Lokhttp3/tls/internal/der/AnyValue;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "bytes", "Lokio/ByteString;", "getBytes", "constructed", "Z", "getConstructed", "setConstructed", "(Z)V", "length", "J", "getLength", "setLength", "(J)V", "tag", "getTag", "setTag", "tagClass", "I", "getTagClass", "setTagClass", "(I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AnyValue {
    private final ByteString bytes;
    private boolean constructed;
    private long length;
    private long tag;
    private int tagClass;

    public AnyValue(int i, long j, boolean z, long j2, ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this.tagClass = i;
        this.tag = j;
        this.constructed = z;
        this.length = j2;
        this.bytes = byteString;
    }

    public /* synthetic */ AnyValue(int i, long j, boolean z, long j2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? -1L : j2, byteString);
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public final void setTagClass(int i) {
        this.tagClass = i;
    }

    public final long getTag() {
        return this.tag;
    }

    public final void setTag(long j) {
        this.tag = j;
    }

    public final boolean getConstructed() {
        return this.constructed;
    }

    public final void setConstructed(boolean z) {
        this.constructed = z;
    }

    public final long getLength() {
        return this.length;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final ByteString getBytes() {
        return this.bytes;
    }

    public final int hashCode() {
        int i = this.tagClass;
        int i2 = (int) this.tag;
        boolean z = this.constructed;
        return (((((((i * 31) + i2) * 31) + (!z ? 1 : 0)) * 31) + ((int) this.length)) * 31) + this.bytes.hashCode();
    }

    public static /* synthetic */ AnyValue copy$default(AnyValue anyValue, int i, long j, boolean z, long j2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anyValue.tagClass;
        }
        if ((i2 & 2) != 0) {
            j = anyValue.tag;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            z = anyValue.constructed;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            j2 = anyValue.length;
        }
        long j4 = j2;
        if ((i2 & 16) != 0) {
            byteString = anyValue.bytes;
        }
        return anyValue.copy(i, j3, z2, j4, byteString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getConstructed() {
        return this.constructed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    public final AnyValue copy(int p0, long p1, boolean p2, long p3, ByteString p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        return new AnyValue(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AnyValue)) {
            return false;
        }
        AnyValue anyValue = (AnyValue) p0;
        return this.tagClass == anyValue.tagClass && this.tag == anyValue.tag && this.constructed == anyValue.constructed && this.length == anyValue.length && Intrinsics.areEqual(this.bytes, anyValue.bytes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnyValue(tagClass=");
        sb.append(this.tagClass);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", constructed=");
        sb.append(this.constructed);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", bytes=");
        sb.append(this.bytes);
        sb.append(')');
        return sb.toString();
    }
}
