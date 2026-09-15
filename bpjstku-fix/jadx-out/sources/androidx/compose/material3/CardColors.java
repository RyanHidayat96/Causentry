package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/CardColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "containerColor-vNxB06k$material3_release", "(Z)J", "containerColor", "contentColor-vNxB06k$material3_release", "contentColor", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/CardColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "disabledContainerColor", "getDisabledContainerColor-0d7_KjU", "disabledContentColor", "getDisabledContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private CardColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1811containerColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.containerColor : this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1812contentColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.contentColor : this.disabledContentColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof CardColors)) {
            return false;
        }
        CardColors cardColors = (CardColors) p0;
        return Color.m4219equalsimpl0(this.containerColor, cardColors.containerColor) && Color.m4219equalsimpl0(this.contentColor, cardColors.contentColor) && Color.m4219equalsimpl0(this.disabledContainerColor, cardColors.disabledContainerColor) && Color.m4219equalsimpl0(this.disabledContentColor, cardColors.disabledContentColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.containerColor);
        return (((((iM4225hashCodeimpl * 31) + Color.m4225hashCodeimpl(this.contentColor)) * 31) + Color.m4225hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4225hashCodeimpl(this.disabledContentColor);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final CardColors m1813copyjRlVdoo(long p0, long p1, long p2, long p3) {
        return new CardColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.contentColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledContainerColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledContentColor : p3, null);
    }

    public /* synthetic */ CardColors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }
}
