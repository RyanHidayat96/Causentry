package androidx.compose.ui.input.indirect;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "Landroidx/compose/ui/geometry/Offset;", "getPosition-F1C5BW0", "()J", "position", "", "getUptimeMillis", "uptimeMillis", "Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "getType-LxEHWp8", "()I", "type", "Landroidx/compose/ui/input/indirect/PlatformIndirectTouchEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IndirectTouchEvent {
    /* JADX INFO: renamed from: getPosition-F1C5BW0 */
    long mo5038getPositionF1C5BW0();

    /* JADX INFO: renamed from: getType-LxEHWp8 */
    int mo5039getTypeLxEHWp8();

    long getUptimeMillis();
}
