package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Landroidx/compose/material3/carousel/KeylineList;", "p0", "", "p1", "p2", "", "p3", "p4", "Landroidx/collection/FloatList;", "p5", "p6", "<init>", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFLandroidx/collection/FloatList;Landroidx/collection/FloatList;)V", "", "getKeylineListForScrollOffset$material3_release", "(FFZ)Landroidx/compose/material3/carousel/KeylineList;", "defaultKeylines", "Landroidx/compose/material3/carousel/KeylineList;", "endKeylineSteps", "Ljava/util/List;", "endShiftDistance", "F", "endShiftPoints", "Landroidx/collection/FloatList;", "startKeylineSteps", "startShiftDistance", "startShiftPoints", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Strategy {
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f, float f2, FloatList floatList, FloatList floatList2) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.startShiftDistance = f;
        this.endShiftDistance = f2;
        this.startShiftPoints = floatList;
        this.endShiftPoints = floatList2;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return strategy.getKeylineListForScrollOffset$material3_release(f, f2, z);
    }

    public final KeylineList getKeylineListForScrollOffset$material3_release(float p0, float p1, boolean p2) {
        int toStepIndex;
        float f = this.startShiftDistance;
        float f2 = p1 - this.endShiftDistance;
        if (f > p0 || p0 > f2) {
            float fLerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f, p0);
            FloatList floatList = this.startShiftPoints;
            List<KeylineList> list = this.startKeylineSteps;
            if (p0 > f2) {
                fLerp = StrategyKt.lerp(0.0f, 1.0f, f2, p1, p0);
                floatList = this.endShiftPoints;
                list = this.endKeylineSteps;
            }
            Companion.ShiftPointRange shiftPointRange = INSTANCE.getShiftPointRange(list.size(), floatList, fLerp);
            if (p2) {
                if (MathKt.roundToInt(shiftPointRange.getSteppedInterpolation()) == 0) {
                    toStepIndex = shiftPointRange.getFromStepIndex();
                } else {
                    toStepIndex = shiftPointRange.getToStepIndex();
                }
                return list.get(toStepIndex);
            }
            return StrategyKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
        }
        return this.defaultKeylines;
    }

    public /* synthetic */ Strategy(KeylineList keylineList, List list, List list2, float f, float f2, FloatList floatList, FloatList floatList2, DefaultConstructorMarker defaultConstructorMarker) {
        this(keylineList, list, list2, f, f2, floatList, floatList2);
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\rJ-\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/compose/material3/carousel/KeylineList;", "p1", "Landroidx/compose/material3/carousel/Strategy;", "create$material3_release", "(FLandroidx/compose/material3/carousel/KeylineList;)Landroidx/compose/material3/carousel/Strategy;", "", "getEndKeylineSteps", "(Landroidx/compose/material3/carousel/KeylineList;F)Ljava/util/List;", "", "Landroidx/collection/FloatList;", "p2", "Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "getShiftPointRange", "(ILandroidx/collection/FloatList;F)Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "getStartKeylineSteps", "", "getStepInterpolationPoints", "(FLjava/util/List;Z)Landroidx/collection/FloatList;", "p3", "moveKeylineAndCreateShiftedKeylineList", "(Landroidx/compose/material3/carousel/KeylineList;IIF)Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "move", "(Ljava/util/List;II)Ljava/util/List;", "ShiftPointRange"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Strategy create$material3_release(float p0, KeylineList p1) {
            List<KeylineList> startKeylineSteps = getStartKeylineSteps(p1, p0);
            List<KeylineList> endKeylineSteps = getEndKeylineSteps(p1, p0);
            KeylineList keylineList = p1;
            float unadjustedOffset = ((Keyline) CollectionsKt.first((List) CollectionsKt.last((List) startKeylineSteps))).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) keylineList)).getUnadjustedOffset();
            float unadjustedOffset2 = ((Keyline) CollectionsKt.last((List) keylineList)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) CollectionsKt.last((List) endKeylineSteps))).getUnadjustedOffset();
            return new Strategy(p1, startKeylineSteps, endKeylineSteps, unadjustedOffset, unadjustedOffset2, getStepInterpolationPoints(unadjustedOffset, startKeylineSteps, true), getStepInterpolationPoints(unadjustedOffset2, endKeylineSteps, false), null);
        }

        private final List<KeylineList> getStartKeylineSteps(KeylineList p0, float p1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0);
            if (!p0.isFirstFocalItemAtStartOfContainer()) {
                int firstNonAnchorIndex = p0.getFirstNonAnchorIndex();
                int firstFocalIndex = p0.getFirstFocalIndex() - firstNonAnchorIndex;
                if (firstFocalIndex <= 0 && p0.getFirstFocal().getCutoff() > 0.0f) {
                    arrayList.add(moveKeylineAndCreateShiftedKeylineList(p0, 0, 0, p1));
                    return arrayList;
                }
                for (int i = 0; i < firstFocalIndex; i++) {
                    KeylineList keylineList = (KeylineList) CollectionsKt.last((List) arrayList);
                    int i2 = firstNonAnchorIndex + i;
                    int lastIndex = CollectionsKt.getLastIndex(p0);
                    if (i2 > 0) {
                        lastIndex = keylineList.firstIndexAfterFocalRangeWithSize(p0.get(i2 - 1).getSize()) - 1;
                    }
                    arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, p0.getFirstNonAnchorIndex(), lastIndex, p1));
                }
            }
            return arrayList;
        }

        private final List<KeylineList> getEndKeylineSteps(KeylineList p0, float p1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0);
            if (!p0.isLastFocalItemAtEndOfContainer(p1)) {
                int lastFocalIndex = p0.getLastFocalIndex();
                int lastNonAnchorIndex = p0.getLastNonAnchorIndex();
                int i = lastNonAnchorIndex - lastFocalIndex;
                if (i <= 0 && p0.getLastFocal().getCutoff() > 0.0f) {
                    arrayList.add(moveKeylineAndCreateShiftedKeylineList(p0, 0, 0, p1));
                    return arrayList;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    KeylineList keylineList = (KeylineList) CollectionsKt.last((List) arrayList);
                    int i3 = lastNonAnchorIndex - i2;
                    arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, p0.getLastNonAnchorIndex(), i3 < CollectionsKt.getLastIndex(p0) ? keylineList.lastIndexBeforeFocalRangeWithSize(p0.get(i3 + 1).getSize()) + 1 : 0, p1));
                }
            }
            return arrayList;
        }

        private final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList p0, final int p1, final int p2, float p3) {
            int i = p1 > p2 ? 1 : -1;
            return KeylineKt.keylineListOf(p3, p0.getPivotIndex() + i, p0.getPivot().getOffset() + (p0.get(p1).getSize() * i), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                    invoke2(keylineListScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeylineListScope keylineListScope) {
                    List listMove = Strategy.INSTANCE.move(CollectionsKt.toMutableList((Collection) p0), p1, p2);
                    int size = listMove.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Keyline keyline = (Keyline) listMove.get(i2);
                        keylineListScope.add(keyline.getSize(), keyline.isAnchor());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }

        private final FloatList getStepInterpolationPoints(float p0, List<KeylineList> p1, boolean p2) {
            float unadjustedOffset;
            MutableFloatList mutableFloatListMutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
            if (p0 == 0.0f) {
                return mutableFloatListMutableFloatListOf;
            }
            IntRange intRangeUntil = RangesKt.until(1, p1.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i = iNextInt - 1;
                KeylineList keylineList = p1.get(i);
                KeylineList keylineList2 = p1.get(iNextInt);
                if (p2) {
                    unadjustedOffset = ((Keyline) CollectionsKt.first((List) keylineList2)).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) keylineList)).getUnadjustedOffset();
                } else {
                    unadjustedOffset = ((Keyline) CollectionsKt.last((List) keylineList)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) keylineList2)).getUnadjustedOffset();
                }
                arrayList.add(Boolean.valueOf(mutableFloatListMutableFloatListOf.add(iNextInt == CollectionsKt.getLastIndex(p1) ? 1.0f : mutableFloatListMutableFloatListOf.get(i) + (unadjustedOffset / p0))));
            }
            return mutableFloatListMutableFloatListOf;
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "", "", "p0", "p1", "", "p2", "<init>", "(IIF)V", "component1", "()I", "component2", "component3", "()F", "copy", "(IIF)Landroidx/compose/material3/carousel/Strategy$Companion$ShiftPointRange;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "fromStepIndex", "I", "getFromStepIndex", "steppedInterpolation", "F", "getSteppedInterpolation", "toStepIndex", "getToStepIndex"}, k = 1, mv = {1, 8, 0}, xi = 48)
        static final /* data */ class ShiftPointRange {
            private final int fromStepIndex;
            private final float steppedInterpolation;
            private final int toStepIndex;

            public ShiftPointRange(int i, int i2, float f) {
                this.fromStepIndex = i;
                this.toStepIndex = i2;
                this.steppedInterpolation = f;
            }

            public final int getFromStepIndex() {
                return this.fromStepIndex;
            }

            public final int getToStepIndex() {
                return this.toStepIndex;
            }

            public final float getSteppedInterpolation() {
                return this.steppedInterpolation;
            }

            public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i, int i2, float f, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = shiftPointRange.fromStepIndex;
                }
                if ((i3 & 2) != 0) {
                    i2 = shiftPointRange.toStepIndex;
                }
                if ((i3 & 4) != 0) {
                    f = shiftPointRange.steppedInterpolation;
                }
                return shiftPointRange.copy(i, i2, f);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getFromStepIndex() {
                return this.fromStepIndex;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getToStepIndex() {
                return this.toStepIndex;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final float getSteppedInterpolation() {
                return this.steppedInterpolation;
            }

            public final ShiftPointRange copy(int p0, int p1, float p2) {
                return new ShiftPointRange(p0, p1, p2);
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof ShiftPointRange)) {
                    return false;
                }
                ShiftPointRange shiftPointRange = (ShiftPointRange) p0;
                return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
            }

            public final int hashCode() {
                return (((Integer.hashCode(this.fromStepIndex) * 31) + Integer.hashCode(this.toStepIndex)) * 31) + Float.hashCode(this.steppedInterpolation);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
                sb.append(this.fromStepIndex);
                sb.append(", toStepIndex=");
                sb.append(this.toStepIndex);
                sb.append(", steppedInterpolation=");
                sb.append(this.steppedInterpolation);
                sb.append(')');
                return sb.toString();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ShiftPointRange getShiftPointRange(int p0, FloatList p1, float p2) {
            float f = p1.get(0);
            Iterator<Integer> it = RangesKt.until(1, p0).iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                float f2 = p1.get(iNextInt);
                if (p2 <= f2) {
                    return new ShiftPointRange(iNextInt - 1, iNextInt, StrategyKt.lerp(0.0f, 1.0f, f, f2, p2));
                }
                f = f2;
            }
            return new ShiftPointRange(0, 0, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Keyline> move(List<Keyline> list, int i, int i2) {
            Keyline keyline = list.get(i);
            list.remove(i);
            list.add(i2, keyline);
            return list;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
