package kotlin.time;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlin/time/InstantSerialized;", "Ljava/io/Externalizable;", "", "p0", "", "p1", "<init>", "(JI)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "epochSeconds", "J", "getEpochSeconds", "()J", "setEpochSeconds", "(J)V", "nanosecondsOfSecond", "I", "getNanosecondsOfSecond", "()I", "setNanosecondsOfSecond", "(I)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InstantSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    private long epochSeconds;
    private int nanosecondsOfSecond;

    public InstantSerialized(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final void setEpochSeconds(long j) {
        this.epochSeconds = j;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public final void setNanosecondsOfSecond(int i) {
        this.nanosecondsOfSecond = i;
    }

    public InstantSerialized() {
        this(0L, 0);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeLong(this.epochSeconds);
        p0.writeInt(this.nanosecondsOfSecond);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.epochSeconds = p0.readLong();
        this.nanosecondsOfSecond = p0.readInt();
    }

    private final Object readResolve() {
        return Instant.INSTANCE.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
    }
}
