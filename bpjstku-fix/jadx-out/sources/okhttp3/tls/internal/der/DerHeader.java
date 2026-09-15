package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\"\u0010 \u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010$R\"\u0010(\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010,"}, d2 = {"Lokhttp3/tls/internal/der/DerHeader;", "", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(IJZJ)V", "component1", "()I", "component2", "()J", "component3", "()Z", "component4", "copy", "(IJZJ)Lokhttp3/tls/internal/der/DerHeader;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "constructed", "Z", "getConstructed", "setConstructed", "(Z)V", "isEndOfData", "length", "J", "getLength", "setLength", "(J)V", "tag", "getTag", "setTag", "tagClass", "I", "getTagClass", "setTagClass", "(I)V", "Companion"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DerHeader {
    public static final int TAG_CLASS_APPLICATION = 64;
    public static final int TAG_CLASS_CONTEXT_SPECIFIC = 128;
    public static final int TAG_CLASS_PRIVATE = 192;
    public static final int TAG_CLASS_UNIVERSAL = 0;
    public static final long TAG_END_OF_CONTENTS = 0;
    private boolean constructed;
    private long length;
    private long tag;
    private int tagClass;

    public DerHeader(int i, long j, boolean z, long j2) {
        this.tagClass = i;
        this.tag = j;
        this.constructed = z;
        this.length = j2;
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

    public final boolean isEndOfData() {
        return this.tagClass == 0 && this.tag == 0;
    }

    public final int hashCode() {
        int i = this.tagClass;
        return (((((i * 31) + ((int) this.tag)) * 31) + (!this.constructed ? 1 : 0)) * 31) + ((int) this.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tagClass);
        sb.append('/');
        sb.append(this.tag);
        return sb.toString();
    }

    public static /* synthetic */ DerHeader copy$default(DerHeader derHeader, int i, long j, boolean z, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = derHeader.tagClass;
        }
        if ((i2 & 2) != 0) {
            j = derHeader.tag;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            z = derHeader.constructed;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            j2 = derHeader.length;
        }
        return derHeader.copy(i, j3, z2, j2);
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

    public final DerHeader copy(int p0, long p1, boolean p2, long p3) {
        return new DerHeader(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DerHeader)) {
            return false;
        }
        DerHeader derHeader = (DerHeader) p0;
        return this.tagClass == derHeader.tagClass && this.tag == derHeader.tag && this.constructed == derHeader.constructed && this.length == derHeader.length;
    }
}
