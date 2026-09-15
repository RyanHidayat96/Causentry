package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Landroidx/compose/ui/unit/IntOffset;", "p0", "p1", "", "p2", "p3", "<init>", "(JJZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "firstIsSelectionStart", "Z", "getFirstIsSelectionStart", "()Z", "gridEndCoordinates", "J", "getGridEndCoordinates-nOcc-ac", "()J", "gridStartCoordinates", "getGridStartCoordinates-nOcc-ac", "lastIsSelectionEnd", "getLastIsSelectionEnd", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectedRangeInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    private SelectedRangeInfo(long j, long j2, boolean z, boolean z2) {
        this.gridStartCoordinates = j;
        this.gridEndCoordinates = j2;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    /* JADX INFO: renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name and from getter */
    public final long getGridStartCoordinates() {
        return this.gridStartCoordinates;
    }

    /* JADX INFO: renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name and from getter */
    public final long getGridEndCoordinates() {
        return this.gridEndCoordinates;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/CalendarMonth;", "p0", "Landroidx/compose/material3/CalendarDate;", "p1", "p2", "Landroidx/compose/material3/SelectedRangeInfo;", "calculateRangeInfo", "(Landroidx/compose/material3/CalendarMonth;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/SelectedRangeInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth p0, CalendarDate p1, CalendarDate p2) {
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            if (p1.getUtcTimeMillis() > p0.getEndUtcTimeMillis() || p2.getUtcTimeMillis() < p0.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = p1.getUtcTimeMillis() >= p0.getStartUtcTimeMillis();
            boolean z2 = p2.getUtcTimeMillis() <= p0.getEndUtcTimeMillis();
            if (z) {
                daysFromStartOfWeekToFirstOfMonth = (p0.getDaysFromStartOfWeekToFirstOfMonth() + p1.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth = p0.getDaysFromStartOfWeekToFirstOfMonth();
            }
            if (z2) {
                daysFromStartOfWeekToFirstOfMonth2 = (p0.getDaysFromStartOfWeekToFirstOfMonth() + p2.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth2 = (p0.getDaysFromStartOfWeekToFirstOfMonth() + p0.getNumberOfDays()) - 1;
            }
            return new SelectedRangeInfo(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7), IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7), z, z2, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j, long j2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, z2);
    }
}
