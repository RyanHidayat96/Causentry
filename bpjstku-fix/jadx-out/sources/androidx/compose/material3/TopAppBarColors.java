package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001d\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "containerColor-vNxB06k$material3_release", "(F)J", "containerColor", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "actionIconContentColor", "J", "getActionIconContentColor-0d7_KjU", "()J", "getContainerColor-0d7_KjU", "navigationIconContentColor", "getNavigationIconContentColor-0d7_KjU", "scrolledContainerColor", "getScrolledContainerColor-0d7_KjU", "titleContentColor", "getTitleContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5) {
        this.containerColor = j;
        this.scrolledContainerColor = j2;
        this.navigationIconContentColor = j3;
        this.titleContentColor = j4;
        this.actionIconContentColor = j5;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* JADX INFO: renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2802containerColorvNxB06k$material3_release(float p0) {
        return ColorKt.m4269lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(p0));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) p0;
        return Color.m4219equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m4219equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m4219equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m4219equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m4219equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.containerColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.scrolledContainerColor);
        return (((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + Color.m4225hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m4225hashCodeimpl(this.titleContentColor)) * 31) + Color.m4225hashCodeimpl(this.actionIconContentColor);
    }

    /* JADX INFO: renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m2803copyt635Npw(long p0, long p1, long p2, long p3, long p4) {
        return new TopAppBarColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.scrolledContainerColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.navigationIconContentColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.titleContentColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.actionIconContentColor : p4, null);
    }

    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }
}
