package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bc\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Landroid/graphics/Insets;", "p0", "", "p1", "adjustInsets", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Landroidx/compose/ui/geometry/Offset;", "consumedOffsets-MK-Hz9U", "(J)J", "consumedOffsets", "Landroidx/compose/ui/unit/Velocity;", "", "consumedVelocity-QWom1Mo", "(JF)J", "consumedVelocity", "hideMotion", "(FF)F", "motionOf", "showMotion", "valueOf", "(Landroid/graphics/Insets;)I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
interface SideCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Insets adjustInsets(Insets p0, int p1);

    /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo1028consumedOffsetsMKHz9U(long p0);

    /* JADX INFO: renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo1029consumedVelocityQWom1Mo(long p0, float p1);

    float motionOf(float p0, float p1);

    int valueOf(Insets p0);

    default float showMotion(float p0, float p1) {
        return RangesKt.coerceAtLeast(motionOf(p0, p1), 0.0f);
    }

    default float hideMotion(float p0, float p1) {
        return RangesKt.coerceAtMost(motionOf(p0, p1), 0.0f);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "BottomSideCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "LeftSideCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "RightSideCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "TopSideCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float p0, float p1) {
                return p0;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(Insets p0) {
                return p0.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final Insets adjustInsets(Insets p0, int p1) {
                return Insets.of(p1, p0.top, p0.right, p0.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1028consumedOffsetsMKHz9U(long p0) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3974getXimpl(p0), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public final long mo1029consumedVelocityQWom1Mo(long p0, float p1) {
                return VelocityKt.Velocity(Velocity.m7173getXimpl(p0) - p1, 0.0f);
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float p0, float p1) {
                return p1;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(Insets p0) {
                return p0.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final Insets adjustInsets(Insets p0, int p1) {
                return Insets.of(p0.left, p1, p0.right, p0.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1028consumedOffsetsMKHz9U(long p0) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3975getYimpl(p0));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public final long mo1029consumedVelocityQWom1Mo(long p0, float p1) {
                return VelocityKt.Velocity(0.0f, Velocity.m7174getYimpl(p0) - p1);
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float p0, float p1) {
                return -p0;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(Insets p0) {
                return p0.right;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final Insets adjustInsets(Insets p0, int p1) {
                return Insets.of(p0.left, p0.top, p1, p0.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1028consumedOffsetsMKHz9U(long p0) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3974getXimpl(p0), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public final long mo1029consumedVelocityQWom1Mo(long p0, float p1) {
                return VelocityKt.Velocity(Velocity.m7173getXimpl(p0) + p1, 0.0f);
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float p0, float p1) {
                return -p1;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(Insets p0) {
                return p0.bottom;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final Insets adjustInsets(Insets p0, int p1) {
                return Insets.of(p0.left, p0.top, p0.right, p1);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1028consumedOffsetsMKHz9U(long p0) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3975getYimpl(p0));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public final long mo1029consumedVelocityQWom1Mo(long p0, float p1) {
                return VelocityKt.Velocity(0.0f, Velocity.m7174getYimpl(p0) + p1);
            }
        };

        private Companion() {
        }

        /* JADX INFO: renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m1030chooseCalculatorni1skBw(int p0, LayoutDirection p1) {
            if (WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1096getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1099getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1097getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1093getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1098getStartJoeWqyM())) {
                if (p1 == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            }
            if (!WindowInsetsSides.m1082equalsimpl0(p0, WindowInsetsSides.INSTANCE.m1094getEndJoeWqyM())) {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
            if (p1 == LayoutDirection.Ltr) {
                return RightSideCalculator;
            }
            return LeftSideCalculator;
        }
    }
}
