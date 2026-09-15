package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010 \u001a\u00020\u00028AX\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001d\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001d\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001d\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001d\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/NavigationBarItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-4JmcsL4", "(JJJJJJJ)Landroidx/compose/material3/NavigationBarItemColors;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/runtime/State;", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "textColor$material3_release", "disabledIconColor", "J", "getDisabledIconColor-0d7_KjU", "()J", "disabledTextColor", "getDisabledTextColor-0d7_KjU", "getIndicatorColor-0d7_KjU$material3_release", "indicatorColor", "selectedIconColor", "getSelectedIconColor-0d7_KjU", "selectedIndicatorColor", "getSelectedIndicatorColor-0d7_KjU", "selectedTextColor", "getSelectedTextColor-0d7_KjU", "unselectedIconColor", "getUnselectedIconColor-0d7_KjU", "unselectedTextColor", "getUnselectedTextColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationBarItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
        this.disabledIconColor = j6;
        this.disabledTextColor = j7;
    }

    /* JADX INFO: renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedIconColor() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedTextColor() {
        return this.selectedTextColor;
    }

    /* JADX INFO: renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2214getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedIconColor() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedTextColor() {
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    public final State<Color> iconColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1012982249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1012982249, i, -1, "androidx.compose.material3.NavigationBarItemColors.iconColor (NavigationBar.kt:423)");
        }
        if (!z2) {
            j = this.disabledIconColor;
        } else if (z) {
            j = this.selectedIconColor;
        } else {
            j = this.unselectedIconColor;
        }
        State<Color> stateM435animateColorAsStateeuL9pac = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM435animateColorAsStateeuL9pac;
    }

    public final State<Color> textColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1833866293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1833866293, i, -1, "androidx.compose.material3.NavigationBarItemColors.textColor (NavigationBar.kt:442)");
        }
        if (!z2) {
            j = this.disabledTextColor;
        } else if (z) {
            j = this.selectedTextColor;
        } else {
            j = this.unselectedTextColor;
        }
        State<Color> stateM435animateColorAsStateeuL9pac = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM435animateColorAsStateeuL9pac;
    }

    /* JADX INFO: renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getSelectedIndicatorColor() {
        return this.selectedIndicatorColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) p0;
        return Color.m4219equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m4219equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m4219equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m4219equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m4219equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor) && Color.m4219equalsimpl0(this.disabledIconColor, navigationBarItemColors.disabledIconColor) && Color.m4219equalsimpl0(this.disabledTextColor, navigationBarItemColors.disabledTextColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.selectedIconColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.unselectedIconColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.selectedTextColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.unselectedTextColor);
        return (((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + Color.m4225hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m4225hashCodeimpl(this.disabledIconColor)) * 31) + Color.m4225hashCodeimpl(this.disabledTextColor);
    }

    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationBarItemColors m2209copy4JmcsL4(long p0, long p1, long p2, long p3, long p4, long p5, long p6) {
        return new NavigationBarItemColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedIconColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedTextColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedIndicatorColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.unselectedIconColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.unselectedTextColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledIconColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledTextColor : p6, null);
    }

    public /* synthetic */ NavigationBarItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }
}
