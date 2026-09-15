package kotlin.uuid;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017"}, d2 = {"Lkotlin/uuid/UuidSerialized;", "Ljava/io/Externalizable;", "", "p0", "p1", "<init>", "(JJ)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "mostSignificantBits", "J", "getMostSignificantBits", "()J", "setMostSignificantBits", "(J)V", "leastSignificantBits", "getLeastSignificantBits", "setLeastSignificantBits", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class UuidSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    private long leastSignificantBits;
    private long mostSignificantBits;

    public UuidSerialized(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final void setMostSignificantBits(long j) {
        this.mostSignificantBits = j;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final void setLeastSignificantBits(long j) {
        this.leastSignificantBits = j;
    }

    public UuidSerialized() {
        this(0L, 0L);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeLong(this.mostSignificantBits);
        p0.writeLong(this.leastSignificantBits);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.mostSignificantBits = p0.readLong();
        this.leastSignificantBits = p0.readLong();
    }

    private final Object readResolve() {
        return Uuid.INSTANCE.fromLongs(this.mostSignificantBits, this.leastSignificantBits);
    }
}
