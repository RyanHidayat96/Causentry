package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u00020\t*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ,\u0010\u0014\u001a\u00020\u0011*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\t*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ)\u0010\u0016\u001a\u00020\t*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\fR\u001e\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "p0", "<init>", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "p1", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "maxIntrinsicWidth", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "minIntrinsicHeight", "minIntrinsicWidth", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        final int i;
        int width;
        final int height;
        int lastIndex;
        int height2;
        ?? it;
        Placeable placeable3;
        int height3;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
        int size2 = list.size();
        int iM7105getHeightimpl = 0;
        int i2 = 0;
        while (true) {
            placeable = null;
            if (i2 >= size2) {
                break;
            }
            Measurable measurable = list.get(i2);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
                long jIntSize = IntSizeKt.IntSize(placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight());
                Unit unit = Unit.INSTANCE;
                placeableArr[i2] = placeableMo5637measureBRTryo0;
                jM7111getZeroYbymL2g = jIntSize;
            }
            i2++;
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Measurable measurable2 = list.get(i3);
            if (placeableArr[i3] == null) {
                placeableArr[i3] = measurable2.mo5637measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = IntSize.m7106getWidthimpl(jM7111getZeroYbymL2g);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int lastIndex2 = ArraysKt.getLastIndex(placeableArr);
                if (lastIndex2 != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    ?? it2 = new IntRange(1, lastIndex2).iterator();
                    while (it2.hasNext()) {
                        Placeable placeable4 = placeableArr[it2.nextInt()];
                        int width3 = placeable4 != null ? placeable4.getWidth() : 0;
                        if (width2 < width3) {
                            placeable2 = placeable4;
                            width2 = width3;
                        }
                    }
                }
            }
            if (placeable2 != null) {
                width = placeable2.getWidth();
            } else {
                i = 0;
            }
            if (measureScope.isLookingAhead()) {
                iM7105getHeightimpl = IntSize.m7105getHeightimpl(jM7111getZeroYbymL2g);
            } else {
                if (size != 0) {
                    placeable = placeableArr[0];
                    lastIndex = ArraysKt.getLastIndex(placeableArr);
                    if (lastIndex != 0) {
                        if (placeable != null) {
                            height2 = placeable.getHeight();
                        } else {
                            height2 = 0;
                        }
                        it = new IntRange(1, lastIndex).iterator();
                        while (it.hasNext()) {
                            placeable3 = placeableArr[it.nextInt()];
                            if (placeable3 != null) {
                                height3 = placeable3.getHeight();
                            } else {
                                height3 = 0;
                            }
                            if (height2 < height3) {
                                placeable = placeable3;
                                height2 = height3;
                            }
                        }
                    }
                }
                if (placeable != null) {
                    height = placeable.getHeight();
                }
                if (!measureScope.isLookingAhead()) {
                    this.rootScope.m384setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i, height));
                }
                return MeasureScope.layout$default(measureScope, i, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable[] placeableArr2 = placeableArr;
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                        int i4 = i;
                        int i5 = height;
                        for (Placeable placeable5 : placeableArr2) {
                            if (placeable5 != null) {
                                long jMo3697alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3697alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i4, i5), LayoutDirection.Ltr);
                                Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m7063getXimpl(jMo3697alignKFBX0sM), IntOffset.m7064getYimpl(jMo3697alignKFBX0sM), 0.0f, 4, null);
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, null);
            }
            height = iM7105getHeightimpl;
            if (!measureScope.isLookingAhead()) {
                this.rootScope.m384setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i, height));
            }
            return MeasureScope.layout$default(measureScope, i, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable[] placeableArr2 = placeableArr;
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                    int i4 = i;
                    int i5 = height;
                    for (Placeable placeable5 : placeableArr2) {
                        if (placeable5 != null) {
                            long jMo3697alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3697alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i4, i5), LayoutDirection.Ltr);
                            Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m7063getXimpl(jMo3697alignKFBX0sM), IntOffset.m7064getYimpl(jMo3697alignKFBX0sM), 0.0f, 4, null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }, 4, null);
        }
        i = width;
        if (measureScope.isLookingAhead()) {
            iM7105getHeightimpl = IntSize.m7105getHeightimpl(jM7111getZeroYbymL2g);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                lastIndex = ArraysKt.getLastIndex(placeableArr);
                if (lastIndex != 0) {
                    if (placeable != null) {
                        height2 = placeable.getHeight();
                    } else {
                        height2 = 0;
                    }
                    it = new IntRange(1, lastIndex).iterator();
                    while (it.hasNext()) {
                        placeable3 = placeableArr[it.nextInt()];
                        if (placeable3 != null) {
                            height3 = placeable3.getHeight();
                        } else {
                            height3 = 0;
                        }
                        if (height2 < height3) {
                            placeable = placeable3;
                            height2 = height3;
                        }
                    }
                }
            }
            if (placeable != null) {
                height = placeable.getHeight();
            }
            if (!measureScope.isLookingAhead()) {
                this.rootScope.m384setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i, height));
            }
            return MeasureScope.layout$default(measureScope, i, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable[] placeableArr2 = placeableArr;
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                    int i4 = i;
                    int i5 = height;
                    for (Placeable placeable5 : placeableArr2) {
                        if (placeable5 != null) {
                            long jMo3697alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3697alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i4, i5), LayoutDirection.Ltr);
                            Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m7063getXimpl(jMo3697alignKFBX0sM), IntOffset.m7064getYimpl(jMo3697alignKFBX0sM), 0.0f, 4, null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }, 4, null);
        }
        height = iM7105getHeightimpl;
        if (!measureScope.isLookingAhead()) {
            this.rootScope.m384setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i, height));
        }
        return MeasureScope.layout$default(measureScope, i, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i4 = i;
                int i5 = height;
                for (Placeable placeable5 : placeableArr2) {
                    if (placeable5 != null) {
                        long jMo3697alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3697alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i4, i5), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m7063getXimpl(jMo3697alignKFBX0sM), IntOffset.m7064getYimpl(jMo3697alignKFBX0sM), 0.0f, 4, null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
