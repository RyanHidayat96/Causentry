package kotlin.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "read", "()J", "Lkotlin/time/Duration;", "p0", "", "plusAssign-LRDsOJo", "(J)V", "plusAssign", "overflow-LRDsOJo", "overflow", "reading", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m9486plusAssignLRDsOJo(long p0) {
        long jM9413toLongimpl = Duration.m9413toLongimpl(p0, getUnit());
        if (((jM9413toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j = this.reading;
            long j2 = j + jM9413toLongimpl;
            if ((jM9413toLongimpl ^ j) >= 0 && (j ^ j2) < 0) {
                m9485overflowLRDsOJo(p0);
            }
            this.reading = j2;
            return;
        }
        long jM9377divUwyO8pc = Duration.m9377divUwyO8pc(p0, 2);
        if ((1 | (Duration.m9413toLongimpl(jM9377divUwyO8pc, getUnit()) - 1)) != Long.MAX_VALUE) {
            long j3 = this.reading;
            try {
                m9486plusAssignLRDsOJo(jM9377divUwyO8pc);
                m9486plusAssignLRDsOJo(Duration.m9402minusLRDsOJo(p0, jM9377divUwyO8pc));
                return;
            } catch (IllegalStateException e2) {
                this.reading = j3;
                throw e2;
            }
        }
        m9485overflowLRDsOJo(p0);
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m9485overflowLRDsOJo(long p0) {
        StringBuilder sb = new StringBuilder("TestTimeSource will overflow if its reading ");
        sb.append(this.reading);
        sb.append(DurationUnitKt.shortName(getUnit()));
        sb.append(" is advanced by ");
        sb.append((Object) Duration.m9414toStringimpl(p0));
        sb.append('.');
        throw new IllegalStateException(sb.toString());
    }
}
