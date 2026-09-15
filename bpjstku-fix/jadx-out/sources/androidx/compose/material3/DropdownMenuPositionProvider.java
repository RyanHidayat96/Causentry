package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012$\b\u0002\u0010\f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0017\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001c\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\bHÇ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062$\b\u0002\u0010\f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\bHÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010'\u001a\u00020&H×\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001d\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019R\u0014\u00105\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00106R6\u00108\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001dR\u0014\u0010;\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u0014\u0010<\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010+R\u0014\u0010>\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010+R\u001a\u0010?\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "", "p2", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "", "p3", "<init>", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()I", "component4", "()Lkotlin/jvm/functions/Function2;", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "copy", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/material3/MenuPosition$Vertical;", "bottomToAnchorTop", "Landroidx/compose/material3/MenuPosition$Vertical;", "bottomToWindowBottom", "centerToAnchorTop", "contentOffset", "J", "getContentOffset-RKDOV3M", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "Landroidx/compose/material3/MenuPosition$Horizontal;", "endToAnchorEnd", "Landroidx/compose/material3/MenuPosition$Horizontal;", "leftToWindowLeft", "onPositionCalculated", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "verticalMargin", "I", "getVerticalMargin"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, Density density, int i, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = i;
        this.onPositionCalculated = function2;
        int iMo688roundToPx0680j_4 = density.mo688roundToPx0680j_4(DpOffset.m6996getXD9Ej5fM(j));
        this.startToAnchorStart = MenuPosition.INSTANCE.startToAnchorStart(iMo688roundToPx0680j_4);
        this.endToAnchorEnd = MenuPosition.INSTANCE.endToAnchorEnd(iMo688roundToPx0680j_4);
        this.leftToWindowLeft = MenuPosition.INSTANCE.leftToWindowLeft(0);
        this.rightToWindowRight = MenuPosition.INSTANCE.rightToWindowRight(0);
        int iMo688roundToPx0680j_5 = density.mo688roundToPx0680j_4(DpOffset.m6998getYD9Ej5fM(j));
        this.topToAnchorBottom = MenuPosition.INSTANCE.topToAnchorBottom(iMo688roundToPx0680j_5);
        this.bottomToAnchorTop = MenuPosition.INSTANCE.bottomToAnchorTop(iMo688roundToPx0680j_5);
        this.centerToAnchorTop = MenuPosition.INSTANCE.centerToAnchorTop(iMo688roundToPx0680j_5);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i);
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m2068getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, AnonymousClass2 anonymousClass2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i2 & 4) != 0 ? density.mo688roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i, (i2 & 8) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.DropdownMenuPositionProvider.2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : anonymousClass2, null);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo666calculatePositionllwVHH4(IntRect p0, long p1, LayoutDirection p2, long p3) {
        MenuPosition.Horizontal horizontal;
        Object obj;
        Object obj2;
        MenuPosition.Vertical vertical;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        if (IntOffset.m7063getXimpl(p0.m7087getCenternOccac()) < IntSize.m7106getWidthimpl(p1) / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        horizontalArr[2] = horizontal;
        List listListOf = CollectionsKt.listOf((Object[]) horizontalArr);
        ArrayList arrayList = new ArrayList(listListOf.size());
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((MenuPosition.Horizontal) listListOf.get(i)).mo1753position95KtPRI(p0, p1, IntSize.m7106getWidthimpl(p3), p2)));
        }
        ArrayList arrayList2 = arrayList;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList2.get(i2);
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 0 && iIntValue + IntSize.m7106getWidthimpl(p3) <= IntSize.m7106getWidthimpl(p1)) {
                break;
            }
            i2++;
        }
        Integer num = (Integer) obj2;
        int iIntValue2 = num != null ? num.intValue() : ((Number) CollectionsKt.last((List) arrayList2)).intValue();
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        verticalArr[2] = this.centerToAnchorTop;
        if (IntOffset.m7064getYimpl(p0.m7087getCenternOccac()) < IntSize.m7105getHeightimpl(p1) / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        verticalArr[3] = vertical;
        List listListOf2 = CollectionsKt.listOf((Object[]) verticalArr);
        ArrayList arrayList3 = new ArrayList(listListOf2.size());
        int size3 = listListOf2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList3.add(Integer.valueOf(((MenuPosition.Vertical) listListOf2.get(i3)).mo1754positionJVtK1S4(p0, p1, IntSize.m7105getHeightimpl(p3))));
        }
        ArrayList arrayList4 = arrayList3;
        int size4 = arrayList4.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Object obj3 = arrayList4.get(i4);
            int iIntValue3 = ((Number) obj3).intValue();
            if (iIntValue3 >= this.verticalMargin && iIntValue3 + IntSize.m7105getHeightimpl(p3) <= IntSize.m7105getHeightimpl(p1) - this.verticalMargin) {
                obj = obj3;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        long jIntOffset = IntOffsetKt.IntOffset(iIntValue2, num2 != null ? num2.intValue() : ((Number) CollectionsKt.last((List) arrayList4)).intValue());
        this.onPositionCalculated.invoke(p0, IntRectKt.m7096IntRectVbeCjmY(jIntOffset, p3));
        return jIntOffset;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, i, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m2065copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i2 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m2067copyuVxBXkw(j2, density2, i3, function2);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> component4() {
        return this.onPositionCalculated;
    }

    /* JADX INFO: renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m2067copyuVxBXkw(long p0, Density p1, int p2, Function2<? super IntRect, ? super IntRect, Unit> p3) {
        return new DropdownMenuPositionProvider(p0, p1, p2, p3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) p0;
        return DpOffset.m6995equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public final int hashCode() {
        return (((((DpOffset.m7000hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropdownMenuPositionProvider(contentOffset=");
        sb.append((Object) DpOffset.m7003toStringimpl(this.contentOffset));
        sb.append(", density=");
        sb.append(this.density);
        sb.append(", verticalMargin=");
        sb.append(this.verticalMargin);
        sb.append(", onPositionCalculated=");
        sb.append(this.onPositionCalculated);
        sb.append(')');
        return sb.toString();
    }
}
