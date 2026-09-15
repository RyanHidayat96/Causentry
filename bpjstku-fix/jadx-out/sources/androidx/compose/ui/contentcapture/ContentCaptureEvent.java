package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010&\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "", "p0", "", "p1", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "p2", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "p3", "<init>", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "component1", "()I", "component2", "()J", "component3", "()Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "component4", "()Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "copy", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;)Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "id", "I", "getId", "timestamp", "J", "getTimestamp", "type", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "getType", "structureCompat", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "getStructureCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ContentCaptureEvent {
    private final int id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.id = i;
        this.timestamp = j;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentCaptureEvent.id;
        }
        if ((i2 & 2) != 0) {
            j = contentCaptureEvent.timestamp;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        ContentCaptureEventType contentCaptureEventType2 = contentCaptureEventType;
        if ((i2 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i, j2, contentCaptureEventType2, viewStructureCompat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ContentCaptureEventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final ContentCaptureEvent copy(int p0, long p1, ContentCaptureEventType p2, ViewStructureCompat p3) {
        return new ContentCaptureEvent(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) p0;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && Intrinsics.areEqual(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = Long.hashCode(this.timestamp);
        int iHashCode3 = this.type.hashCode();
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.id);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", structureCompat=");
        sb.append(this.structureCompat);
        sb.append(')');
        return sb.toString();
    }
}
