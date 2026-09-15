package androidx.metrics.performance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl;", "", "Landroidx/metrics/performance/JankStats;", "p0", "<init>", "(Landroidx/metrics/performance/JankStats;)V", "", "", "setupFrameTimer", "(Z)V", "jankStats", "Landroidx/metrics/performance/JankStats;", "getJankStats", "()Landroidx/metrics/performance/JankStats;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JankStatsBaseImpl {
    public static final int NANOS_PER_MS = 1000000;
    private final JankStats jankStats;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static long frameDuration = -1;

    public void setupFrameTimer(boolean p0) {
    }

    public JankStatsBaseImpl(JankStats jankStats) {
        Intrinsics.checkNotNullParameter(jankStats, "");
        this.jankStats = jankStats;
    }

    public final JankStats getJankStats() {
        return this.jankStats;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl$Companion;", "", "<init>", "()V", "", "NANOS_PER_MS", "I", "", "frameDuration", "J", "getFrameDuration", "()J", "setFrameDuration", "(J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getFrameDuration() {
            return JankStatsBaseImpl.frameDuration;
        }

        public final void setFrameDuration(long j) {
            JankStatsBaseImpl.frameDuration = j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
