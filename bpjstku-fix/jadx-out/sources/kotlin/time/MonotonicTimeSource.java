package kotlin.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "read", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "markNow", "p0", "Lkotlin/time/Duration;", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "p1", "differenceBetween-fRLX17w", "(JJ)J", "differenceBetween", "adjustReading-6QKq23U", "adjustReading", "zero", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public final /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m9490boximpl(m9484markNowz9LOYto());
    }

    @Override // kotlin.time.TimeSource
    public final /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m9490boximpl(m9484markNowz9LOYto());
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public final long m9484markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m9493constructorimpl(read());
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m9483elapsedFrom6eNON_k(long p0) {
        return LongSaturatedMathKt.saturatingDiff(read(), p0, DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m9482differenceBetweenfRLX17w(long p0, long p1) {
        return LongSaturatedMathKt.saturatingOriginsDiff(p0, p1, DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m9481adjustReading6QKq23U(long p0, long p1) {
        return TimeSource.Monotonic.ValueTimeMark.m9493constructorimpl(LongSaturatedMathKt.m9479saturatingAddNuflL3o(p0, DurationUnit.NANOSECONDS, p1));
    }
}
