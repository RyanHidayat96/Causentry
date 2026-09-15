package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B*\b\u0004\u0012\u001f\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH ¢\u0006\u0004\b\f\u0010\rR3\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Landroidx/compose/ui/layout/Ruler;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p1", "p2", "calculateCoordinate$ui_release", "(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F", "calculate", "Lkotlin/jvm/functions/Function2;", "getCalculate$ui_release", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Ruler {
    public static final int $stable = 0;
    private final Function2<Placeable.PlacementScope, Float, Float> calculate;

    public abstract float calculateCoordinate$ui_release(float p0, LayoutCoordinates p1, LayoutCoordinates p2);

    /* JADX WARN: Multi-variable type inference failed */
    private Ruler(Function2<? super Placeable.PlacementScope, ? super Float, Float> function2) {
        this.calculate = function2;
    }

    public final Function2<Placeable.PlacementScope, Float, Float> getCalculate$ui_release() {
        return this.calculate;
    }

    public /* synthetic */ Ruler(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }
}
