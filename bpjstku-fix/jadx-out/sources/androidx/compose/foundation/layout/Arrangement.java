package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005DEFGHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0014J/\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0019\u0010\u0014J/\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\"J6\u0010$\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00102\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120#H\u0082\b¢\u0006\u0004\b$\u0010%R \u0010&\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R \u00100\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0003\u001a\u0004\b2\u00103R \u00105\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010.R \u00108\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010,\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010.R \u0010;\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010,\u0012\u0004\b=\u0010\u0003\u001a\u0004\b<\u0010.R \u0010>\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u00101\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u00103R \u0010A\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010'\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "aligned", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "", "p1", "p2", "", "p3", "", "placeCenter$foundation_layout_release", "(I[I[IZ)V", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeRightOrBottom$foundation_layout_release", "placeSpaceAround$foundation_layout_release", "placeSpaceBetween$foundation_layout_release", "placeSpaceEvenly$foundation_layout_release", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Lkotlin/Function2;", "forEachIndexed", "([IZLkotlin/jvm/functions/Function2;)V", "Bottom", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getBottom", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getBottom$annotations", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "End", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getEnd", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getEnd$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations", "Start", "getStart", "getStart$annotations", "Top", "getTop", "getTop$annotations", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m6935constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m6935constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m6935constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m6935constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    private Arrangement() {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\r8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "p0", "", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "p3", "", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Horizontal {
        void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m890getSpacingD9Ej5fM(Horizontal horizontal) {
                return Horizontal.super.getSpacing();
            }
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m6935constructorimpl(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u000b8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "p0", "", "p1", "p2", "", "arrange", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Vertical {
        void arrange(Density density, int i, int[] iArr, int[] iArr2);

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m898getSpacingD9Ej5fM(Vertical vertical) {
                return Vertical.super.getSpacing();
            }
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m6935constructorimpl(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m892getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.getSpacing();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m6935constructorimpl(0.0f);
        }
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m882spacedBy0680j_4(float p0) {
        return new SpacedAligned(p0, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.INSTANCE.getStart().align(0, i, layoutDirection));
            }
        }, null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m883spacedByD5KLDUw(float p0, final Alignment.Horizontal p1) {
        return new SpacedAligned(p0, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(p1.align(0, i, layoutDirection));
            }

            {
                super(2);
            }
        }, null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m884spacedByD5KLDUw(float p0, final Alignment.Vertical p1) {
        return new SpacedAligned(p0, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(p1.align(0, i));
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            {
                super(2);
            }
        }, null);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\r\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0013R \u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\u0017R \u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\u0017R \u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u0017R \u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u0017R \u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0015\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "aligned", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "p1", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "Left", "getLeft", "getLeft$annotations", "Right", "getRight", "getRight$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getLeft$annotations() {
        }

        public static /* synthetic */ void getRight$annotations() {
        }

        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        private Absolute() {
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m885spacedBy0680j_4(float p0) {
            return new SpacedAligned(p0, false, null, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m886spacedByD5KLDUw(float p0, final Alignment.Horizontal p1) {
            return new SpacedAligned(p0, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(p1.align(0, i, layoutDirection));
                }

                {
                    super(2);
                }
            }, null);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m887spacedByD5KLDUw(float p0, final Alignment.Vertical p1) {
            return new SpacedAligned(p0, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(p1.align(0, i));
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                {
                    super(2);
                }
            }, null);
        }

        public final Horizontal aligned(final Alignment.Horizontal p0) {
            return new SpacedAligned(Dp.m6935constructorimpl(0.0f), false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i, LayoutDirection layoutDirection) {
                    return Integer.valueOf(p0.align(0, i, layoutDirection));
                }

                {
                    super(2);
                }
            }, null);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\"\u001a\u00020!*\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J+\u0010\"\u001a\u00020!*\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010$R.\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0010R\u001d\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\rR\u001d\u0010.\u001a\u00020\u00028\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Dp;", "p0", "", "p1", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Z", "component3", "()Lkotlin/jvm/functions/Function2;", "copy-8Feqmps", "(FZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "", "p3", "", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "alignment", "Lkotlin/jvm/functions/Function2;", "getAlignment", "rtlMirror", "Z", "getRtlMirror", "space", "F", "getSpace-D9Ej5fM", "spacing", "getSpacing-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;
        private final Function2<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f, boolean z, Function2<? super Integer, ? super LayoutDirection, Integer> function2) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = function2;
            this.spacing = f;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m896getSpaceD9Ej5fM() {
            return this.space;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public final float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iMo688roundToPx0680j_4 = density.mo688roundToPx0680j_4(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (!z) {
                int length = iArr.length;
                i2 = 0;
                int i3 = 0;
                iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    int iMin2 = Math.min(i2, i - i5);
                    iArr2[i4] = iMin2;
                    int iMin3 = Math.min(iMo688roundToPx0680j_4, (i - iMin2) - i5);
                    i3++;
                    int i6 = iArr2[i4] + i5 + iMin3;
                    i4++;
                    iMin = iMin3;
                    i2 = i6;
                }
            } else {
                i2 = 0;
                iMin = 0;
                for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                    int i7 = iArr[length2];
                    int iMin4 = Math.min(i2, i - i7);
                    iArr2[length2] = iMin4;
                    iMin = Math.min(iMo688roundToPx0680j_4, (i - iMin4) - i7);
                    i2 = iArr2[length2] + i7 + iMin;
                }
            }
            int i8 = i2 - iMin;
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            if (function2 == null || i8 >= i) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i - i8), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            arrange(density, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.m6946toStringimpl(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ SpacedAligned(float f, boolean z, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m893copy8Feqmps$default(SpacedAligned spacedAligned, float f, boolean z, Function2 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacedAligned.space;
            }
            if ((i & 2) != 0) {
                z = spacedAligned.rtlMirror;
            }
            if ((i & 4) != 0) {
                function2 = spacedAligned.alignment;
            }
            return spacedAligned.m895copy8Feqmps(f, z, function2);
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpace() {
            return this.space;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m895copy8Feqmps(float p0, boolean p1, Function2<? super Integer, ? super LayoutDirection, Integer> p2) {
            return new SpacedAligned(p0, p1, p2, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) p0;
            return Dp.m6940equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && Intrinsics.areEqual(this.alignment, spacedAligned.alignment);
        }

        public final int hashCode() {
            int iM6941hashCodeimpl = Dp.m6941hashCodeimpl(this.space);
            int iHashCode = Boolean.hashCode(this.rtlMirror);
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            return (((iM6941hashCodeimpl * 31) + iHashCode) * 31) + (function2 == null ? 0 : function2.hashCode());
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int p0, int[] p1, int[] p2, boolean p3) {
        if (p1.length == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float fMax = (p0 - i2) / Math.max(ArraysKt.getLastIndex(p1), 1);
        float f = (p3 && p1.length == 1) ? fMax : 0.0f;
        if (!p3) {
            int length = p1.length;
            int i4 = 0;
            while (i < length) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + fMax;
                i++;
                i4++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i6 = p1[length2];
            p2[length2] = Math.round(f);
            f += i6 + fMax;
        }
    }

    public final Horizontal aligned(final Alignment.Horizontal p0) {
        return new SpacedAligned(Dp.m6935constructorimpl(0.0f), true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.1
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(p0.align(0, i, layoutDirection));
            }

            {
                super(2);
            }
        }, null);
    }

    public final Vertical aligned(final Alignment.Vertical p0) {
        return new SpacedAligned(Dp.m6935constructorimpl(0.0f), false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.2
            public final Integer invoke(int i, LayoutDirection layoutDirection) {
                return Integer.valueOf(p0.align(0, i));
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            {
                super(2);
            }
        }, null);
    }

    public final void placeRightOrBottom$foundation_layout_release(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        int i4 = p0 - i2;
        if (!p3) {
            int length = p1.length;
            int i5 = 0;
            while (i < length) {
                int i6 = p1[i];
                p2[i5] = i4;
                i4 += i6;
                i++;
                i5++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i7 = p1[length2];
            p2[length2] = i4;
            i4 += i7;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] p0, int[] p1, boolean p2) {
        int i = 0;
        if (!p2) {
            int length = p0.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = p0[i];
                p1[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = p0.length - 1; length2 >= 0; length2--) {
            int i5 = p0[length2];
            p1[length2] = i;
            i += i5;
        }
    }

    public final void placeCenter$foundation_layout_release(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float f = (p0 - i2) / 2.0f;
        if (!p3) {
            int length = p1.length;
            int i4 = 0;
            while (i < length) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5;
                i++;
                i4++;
            }
            return;
        }
        for (int length2 = p1.length - 1; length2 >= 0; length2--) {
            int i6 = p1[length2];
            p2[length2] = Math.round(f);
            f += i6;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float length = (p0 - i2) / (p1.length + 1);
        if (!p3) {
            int length2 = p1.length;
            float f = length;
            int i4 = 0;
            while (i < length2) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + length;
                i++;
                i4++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = p1.length - 1; length3 >= 0; length3--) {
            int i6 = p1[length3];
            p2[length3] = Math.round(f2);
            f2 += i6 + length;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int p0, int[] p1, int[] p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        for (int i3 : p1) {
            i2 += i3;
        }
        float length = p1.length == 0 ? 0.0f : (p0 - i2) / p1.length;
        float f = length / 2.0f;
        if (!p3) {
            int length2 = p1.length;
            int i4 = 0;
            while (i < length2) {
                int i5 = p1[i];
                p2[i4] = Math.round(f);
                f += i5 + length;
                i++;
                i4++;
            }
            return;
        }
        for (int length3 = p1.length - 1; length3 >= 0; length3--) {
            int i6 = p1[length3];
            p2[length3] = Math.round(f);
            f += i6 + length;
        }
    }

    private final void forEachIndexed(int[] iArr, boolean z, Function2<? super Integer, ? super Integer, Unit> function2) {
        if (z) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                function2.invoke(Integer.valueOf(length), Integer.valueOf(iArr[length]));
            }
            return;
        }
        int length2 = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            function2.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
    }
}
