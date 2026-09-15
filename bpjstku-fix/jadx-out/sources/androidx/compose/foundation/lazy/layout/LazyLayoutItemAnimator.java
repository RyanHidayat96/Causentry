package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003PQRB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\b\u0002\u0010\r\u001a\f0\fR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0089\u0001\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0005J!\u0010'\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u0007*\u00020)2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\fR\b\u0012\u0004\u0012\u00028\u00000\u0000058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088Gø\u0001\u0000¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\u00020<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010-R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010-R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010-R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010-R\u0018\u0010J\u001a\u00020\u0007*\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010M\u001a\u00020\u0017*\u00028\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0018\u0010O\u001a\u00020\u0007*\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010I\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "p0", "", "p1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimation", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "p2", "", "initializeAnimation", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "", "p3", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "p4", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "Lkotlinx/coroutines/CoroutineScope;", "p12", "Landroidx/compose/ui/graphics/GraphicsContext;", "p13", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V", "removeInfoForKey", "(Ljava/lang/Object;)V", "reset", "startPlacementAnimationsIfNeeded", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "", "updateAndReturnOffsetFor", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "disappearingItems", "Ljava/util/List;", "Landroidx/compose/ui/node/DrawModifierNode;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "firstVisibleIndex", "I", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Landroidx/collection/MutableScatterMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/collection/MutableScatterSet;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "getCrossAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "crossAxisOffset", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "hasAnimations", "getMainAxisOffset", "mainAxisOffset", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int p0, int p1, int p2, List<T> p3, LazyLayoutKeyIndexMap p4, LazyLayoutMeasuredItemProvider<T> p5, boolean p6, boolean p7, int p8, boolean p9, int p10, int p11, CoroutineScope p12, GraphicsContext p13) {
        long jIntOffset;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
        int[] iArr;
        int[] iArr2;
        int layoutMaxOffset;
        int layoutMinOffset;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int[] iArr3;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap4;
        long[] jArr3;
        Object[] objArr3;
        List<T> list = p3;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap5 = this.keyIndexMap;
        this.keyIndexMap = p4;
        int size = p3.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (getHasAnimations(list.get(i3))) {
                    break;
                } else {
                    i3++;
                }
            } else {
                if (!this.keyToItemInfoMap.isEmpty()) {
                    break;
                }
                reset();
                return;
            }
        }
        int i4 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) CollectionsKt.firstOrNull((List) p3);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        if (p6) {
            jIntOffset = IntOffsetKt.IntOffset(0, p0);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(p0, 0);
        }
        boolean z = p7 || !p9;
        MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr4 = mutableScatterMap.keys;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        boolean z2 = z;
        if (length >= 0) {
            while (true) {
                long j = jArr4[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            this.movingAwayKeys.add(objArr4[(i2 << 3) + i6]);
                        }
                        j >>= 8;
                        i6++;
                        objArr4 = objArr4;
                        jArr4 = jArr4;
                    }
                    jArr3 = jArr4;
                    objArr3 = objArr4;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                    objArr3 = objArr4;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr4 = objArr3;
                jArr4 = jArr3;
            }
        }
        int size2 = p3.size();
        int i7 = 0;
        while (i7 < size2) {
            T t = list.get(i7);
            this.movingAwayKeys.remove(t.getKey());
            if (getHasAnimations(t)) {
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t.getKey());
                int index = lazyLayoutKeyIndexMap5 != null ? lazyLayoutKeyIndexMap5.getIndex(t.getKey()) : -1;
                boolean z3 = index == -1 && lazyLayoutKeyIndexMap5 != null;
                if (itemInfo == null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t, p12, p13, p10, p11, 0, 32, null);
                    this.keyToItemInfoMap.set(t.getKey(), itemInfo2);
                    if (t.getIndex() == index || index == -1) {
                        long jMo1114getOffsetBjo55l4 = t.mo1114getOffsetBjo55l4(0);
                        initializeAnimation(t, t.getIsVertical() ? IntOffset.m7064getYimpl(jMo1114getOffsetBjo55l4) : IntOffset.m7063getXimpl(jMo1114getOffsetBjo55l4), itemInfo2);
                        if (z3) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (index < i4) {
                        this.movingInFromStartBound.add(t);
                    } else {
                        this.movingInFromEndBound.add(t);
                    }
                } else if (z2) {
                    ItemInfo.updateAnimation$default(itemInfo, t, p12, p13, p10, p11, 0, 32, null);
                    LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                    int length2 = animations2.length;
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = size2;
                        LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i8];
                        if (lazyLayoutItemAnimation2 != null) {
                            lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap5;
                            if (!IntOffset.m7062equalsimpl0(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.m1166getNotInitializednOccac())) {
                                lazyLayoutItemAnimation2.m1165setRawOffsetgyyYBs(IntOffset.m7067plusqkQi6aY(lazyLayoutItemAnimation2.getRawOffset(), jIntOffset));
                            }
                        } else {
                            lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap5;
                        }
                        i8++;
                        size2 = i9;
                        lazyLayoutKeyIndexMap5 = lazyLayoutKeyIndexMap4;
                    }
                    i = size2;
                    lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap5;
                    if (z3) {
                        for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                            if (lazyLayoutItemAnimation3 != null) {
                                if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                    this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                    DrawModifierNode drawModifierNode = this.displayingNode;
                                    if (drawModifierNode != null) {
                                        DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                }
                                lazyLayoutItemAnimation3.animateAppearance();
                            }
                        }
                    }
                    startPlacementAnimationsIfNeeded$default(this, t, false, 2, null);
                }
                i = size2;
                lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap5;
            } else {
                i = size2;
                lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap5;
                removeInfoForKey(t.getKey());
            }
            i7++;
            list = p3;
            size2 = i;
            lazyLayoutKeyIndexMap5 = lazyLayoutKeyIndexMap3;
        }
        int i10 = p8;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap6 = lazyLayoutKeyIndexMap5;
        int[] iArr4 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr4[i11] = 0;
        }
        if (!z2 || lazyLayoutKeyIndexMap6 == null) {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap6;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap6;
            } else {
                List<T> list2 = this.movingInFromStartBound;
                if (list2.size() > 1) {
                    lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap6;
                    CollectionsKt.sortWith(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t2).getKey())));
                        }
                    });
                } else {
                    lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap6;
                }
                List<T> list3 = this.movingInFromStartBound;
                int size3 = list3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    T t2 = list3.get(i12);
                    initializeAnimation$default(this, t2, p10 - updateAndReturnOffsetFor(iArr4, t2), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t2, false, 2, null);
                }
                ArraysKt.fill$default(iArr4, 0, 0, 0, 6, (Object) null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list4 = this.movingInFromEndBound;
                if (list4.size() > 1) {
                    CollectionsKt.sortWith(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t3, T t4) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                        }
                    });
                }
                List<T> list5 = this.movingInFromEndBound;
                int size4 = list5.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    T t3 = list5.get(i13);
                    initializeAnimation$default(this, t3, (p11 + updateAndReturnOffsetFor(iArr4, t3)) - t3.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t3, false, 2, null);
                }
                ArraysKt.fill$default(iArr4, 0, 0, 0, 6, (Object) null);
            }
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr5 = mutableScatterSet.elements;
        long[] jArr5 = mutableScatterSet.metadata;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i14 = 0;
            while (true) {
                long j2 = jArr5[i14];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length3)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            Object obj = objArr5[(i14 << 3) + i16];
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            Intrinsics.checkNotNull(itemInfo3);
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfo4 = itemInfo3;
                            int index2 = p4.getIndex(obj);
                            jArr2 = jArr5;
                            itemInfo4.setSpan(Math.min(i10, itemInfo4.getSpan()));
                            objArr2 = objArr5;
                            itemInfo4.setLane(Math.min(i10 - itemInfo4.getSpan(), itemInfo4.getLane()));
                            if (index2 == -1) {
                                LazyLayoutItemAnimation[] animations3 = itemInfo4.getAnimations();
                                int length4 = animations3.length;
                                int i17 = 0;
                                boolean z4 = false;
                                int i18 = 0;
                                while (i17 < length4) {
                                    LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i17];
                                    if (lazyLayoutItemAnimation4 != null) {
                                        if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                            lazyLayoutItemAnimationArr = animations3;
                                        } else {
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo4.getAnimations()[i18] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            } else {
                                                lazyLayoutItemAnimationArr = animations3;
                                                if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                    lazyLayoutItemAnimation4.animateDisappearance();
                                                }
                                                if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                    this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                    DrawModifierNode drawModifierNode3 = this.displayingNode;
                                                    if (drawModifierNode3 != null) {
                                                        DrawModifierNodeKt.invalidateDraw(drawModifierNode3);
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.release();
                                                    itemInfo4.getAnimations()[i18] = null;
                                                }
                                            }
                                            i17++;
                                            i18++;
                                            animations3 = lazyLayoutItemAnimationArr;
                                        }
                                        z4 = true;
                                        i17++;
                                        i18++;
                                        animations3 = lazyLayoutItemAnimationArr;
                                    } else {
                                        lazyLayoutItemAnimationArr = animations3;
                                    }
                                    i17++;
                                    i18++;
                                    animations3 = lazyLayoutItemAnimationArr;
                                }
                                if (!z4) {
                                    removeInfoForKey(obj);
                                }
                            } else {
                                Constraints constraints = itemInfo4.getConstraints();
                                Intrinsics.checkNotNull(constraints);
                                LazyLayoutMeasuredItem lazyLayoutMeasuredItemMo1116getAndMeasurehBUhpc = p5.mo1116getAndMeasurehBUhpc(index2, itemInfo4.getLane(), itemInfo4.getSpan(), constraints.getValue());
                                lazyLayoutMeasuredItemMo1116getAndMeasurehBUhpc.setNonScrollableItem(true);
                                LazyLayoutItemAnimation[] animations4 = itemInfo4.getAnimations();
                                int length5 = animations4.length;
                                iArr3 = iArr4;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < length5) {
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i19];
                                        int i20 = length5;
                                        if (lazyLayoutItemAnimation5 != null && lazyLayoutItemAnimation5.isPlacementAnimationInProgress()) {
                                        }
                                        i19++;
                                        animations4 = animations4;
                                        length5 = i20;
                                    } else if (lazyLayoutKeyIndexMap != null && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                                        removeInfoForKey(obj);
                                    }
                                    itemInfo4.updateAnimation(lazyLayoutMeasuredItemMo1116getAndMeasurehBUhpc, p12, p13, p10, p11, itemInfo4.getCrossAxisOffset());
                                    if (index2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add((T) lazyLayoutMeasuredItemMo1116getAndMeasurehBUhpc);
                                    } else {
                                        this.movingAwayToEndBound.add((T) lazyLayoutMeasuredItemMo1116getAndMeasurehBUhpc);
                                    }
                                }
                            }
                            j2 >>= 8;
                            i16++;
                            jArr5 = jArr2;
                            i10 = p8;
                            iArr4 = iArr3;
                            objArr5 = objArr2;
                        } else {
                            jArr2 = jArr5;
                            objArr2 = objArr5;
                        }
                        iArr3 = iArr4;
                        j2 >>= 8;
                        i16++;
                        jArr5 = jArr2;
                        i10 = p8;
                        iArr4 = iArr3;
                        objArr5 = objArr2;
                    }
                    lazyLayoutKeyIndexMap2 = p4;
                    jArr = jArr5;
                    objArr = objArr5;
                    iArr = iArr4;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    lazyLayoutKeyIndexMap2 = p4;
                    jArr = jArr5;
                    objArr = objArr5;
                    iArr = iArr4;
                }
                if (i14 == length3) {
                    break;
                }
                i14++;
                jArr5 = jArr;
                i10 = p8;
                iArr4 = iArr;
                objArr5 = objArr;
            }
        } else {
            lazyLayoutKeyIndexMap2 = p4;
            iArr = iArr4;
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            iArr2 = iArr;
        } else {
            List<T> list6 = this.movingAwayToStartBound;
            if (list6.size() > 1) {
                CollectionsKt.sortWith(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                    }
                });
            }
            List<T> list7 = this.movingAwayToStartBound;
            int size5 = list7.size();
            int i21 = 0;
            while (i21 < size5) {
                T t4 = list7.get(i21);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo5 = this.keyToItemInfoMap.get(t4.getKey());
                Intrinsics.checkNotNull(itemInfo5);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo6 = itemInfo5;
                int[] iArr5 = iArr;
                int iUpdateAndReturnOffsetFor = updateAndReturnOffsetFor(iArr5, t4);
                if (p7) {
                    layoutMinOffset = getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.first((List) p3));
                } else {
                    layoutMinOffset = itemInfo6.getLayoutMinOffset();
                }
                t4.position(layoutMinOffset - iUpdateAndReturnOffsetFor, itemInfo6.getCrossAxisOffset(), p1, p2);
                if (z2) {
                    startPlacementAnimationsIfNeeded(t4, true);
                }
                i21++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            ArraysKt.fill$default(iArr2, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list8 = this.movingAwayToEndBound;
            if (list8.size() > 1) {
                CollectionsKt.sortWith(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyLayoutMeasuredItem) t6).getKey())));
                    }
                });
            }
            List<T> list9 = this.movingAwayToEndBound;
            int size6 = list9.size();
            for (int i22 = 0; i22 < size6; i22++) {
                T t5 = list9.get(i22);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo7 = this.keyToItemInfoMap.get(t5.getKey());
                Intrinsics.checkNotNull(itemInfo7);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo8 = itemInfo7;
                int iUpdateAndReturnOffsetFor2 = updateAndReturnOffsetFor(iArr2, t5);
                if (p7) {
                    layoutMaxOffset = getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.last((List) p3));
                } else {
                    layoutMaxOffset = itemInfo8.getLayoutMaxOffset() - t5.getMainAxisSizeWithSpacings();
                }
                t5.position(layoutMaxOffset + iUpdateAndReturnOffsetFor2, itemInfo8.getCrossAxisOffset(), p1, p2);
                if (z2) {
                    startPlacementAnimationsIfNeeded(t5, true);
                }
            }
        }
        List<T> list10 = this.movingAwayToStartBound;
        CollectionsKt.reverse(list10);
        Unit unit5 = Unit.INSTANCE;
        p3.addAll(0, list10);
        p3.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    private final void removeInfoForKey(Object p0) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoRemove = this.keyToItemInfoMap.remove(p0);
        if (itemInfoRemove == null || (animations = itemInfoRemove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d A[LOOP:0: B:7:0x0017->B:22:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060 A[EDGE_INSN: B:27:0x0060->B:23:0x0060 BREAK  A[LOOP:0: B:7:0x0017->B:22:0x005d], SYNTHETIC] */
    public final void reset() {
        if (this.keyToItemInfoMap.isNotEmpty()) {
            MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
            Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i << 3) + i3]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            this.keyToItemInfoMap.clear();
        }
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(T p0, int p1, LazyLayoutItemAnimator<T>.ItemInfo p2) {
        long jM7059copyiSbpLlY$default;
        int i = 0;
        long jMo1114getOffsetBjo55l4 = p0.mo1114getOffsetBjo55l4(0);
        if (p0.getIsVertical()) {
            jM7059copyiSbpLlY$default = IntOffset.m7059copyiSbpLlY$default(jMo1114getOffsetBjo55l4, 0, p1, 1, null);
        } else {
            jM7059copyiSbpLlY$default = IntOffset.m7059copyiSbpLlY$default(jMo1114getOffsetBjo55l4, p1, 0, 2, null);
        }
        LazyLayoutItemAnimation[] animations = p2.getAnimations();
        int length = animations.length;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m1165setRawOffsetgyyYBs(IntOffset.m7067plusqkQi6aY(jM7059copyiSbpLlY$default, IntOffset.m7066minusqkQi6aY(p0.mo1114getOffsetBjo55l4(i2), jMo1114getOffsetBjo55l4)));
            }
            i++;
            i2++;
        }
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z);
    }

    private final void startPlacementAnimationsIfNeeded(T p0, boolean p1) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(p0.getKey());
        Intrinsics.checkNotNull(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            if (lazyLayoutItemAnimation != null) {
                long jMo1114getOffsetBjo55l4 = p0.mo1114getOffsetBjo55l4(i2);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m7062equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m1166getNotInitializednOccac()) && !IntOffset.m7062equalsimpl0(rawOffset, jMo1114getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m1158animatePlacementDeltaar5cAso(IntOffset.m7066minusqkQi6aY(jMo1114getOffsetBjo55l4, rawOffset), p1);
                }
                lazyLayoutItemAnimation.m1165setRawOffsetgyyYBs(jMo1114getOffsetBjo55l4);
            }
            i++;
            i2++;
        }
    }

    public final LazyLayoutItemAnimation getAnimation(Object p0, int p1) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(p0);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[p1];
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan();
        int iMax = 0;
        for (int i = lane; i < span + lane; i++) {
            int mainAxisSizeWithSpacings = iArr[i] + t.getMainAxisSizeWithSpacings();
            iArr[i] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
        }
        return iMax;
    }

    /* JADX INFO: renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m1167getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM7111getZeroYbymL2g = IntSizeKt.IntSize(Math.max(IntSize.m7106getWidthimpl(jM7111getZeroYbymL2g), IntOffset.m7063getXimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m7106getWidthimpl(layer.getSize())), Math.max(IntSize.m7105getHeightimpl(jM7111getZeroYbymL2g), IntOffset.m7064getYimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m7105getHeightimpl(layer.getSize())));
            }
        }
        return jM7111getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean getHasAnimations(T t) {
        int placeablesCount = t.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(t.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo1114getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1114getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m7064getYimpl(jMo1114getOffsetBjo55l4) : IntOffset.m7063getXimpl(jMo1114getOffsetBjo55l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo1114getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1114getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m7064getYimpl(jMo1114getOffsetBjo55l4) : IntOffset.m7063getXimpl(jMo1114getOffsetBjo55l4);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0087\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010)\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R$\u0010+\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R\"\u0010-\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "Landroidx/compose/ui/graphics/GraphicsContext;", "p2", "", "p3", "p4", "p5", "", "updateAnimation", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "I", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "", "isRunningPlacement", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", "span", "getSpan", "setSpan"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: getConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m1169setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void setCrossAxisOffset(int i) {
            this.crossAxisOffset = i;
        }

        public final int getLane() {
            return this.lane;
        }

        public final void setLane(int i) {
            this.lane = i;
        }

        public final int getSpan() {
            return this.span;
        }

        public final void setSpan(int i) {
            this.span = i;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i, i2, i3);
        }

        public final void updateAnimation(T p0, CoroutineScope p1, GraphicsContext p2, int p3, int p4, int p5) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = p3;
                this.layoutMaxOffset = p4;
            }
            int length = this.animations.length;
            for (int placeablesCount = p0.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != p0.getPlaceablesCount()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, p0.getPlaceablesCount());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m6875boximpl(p0.getConstraints());
            this.crossAxisOffset = p5;
            this.lane = p0.getLane();
            this.span = p0.getSpan();
            int placeablesCount2 = p0.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i = 0; i < placeablesCount2; i++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(p0.getParentData(i));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i];
                    if (lazyLayoutItemAnimation3 == null) {
                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = new LazyLayoutItemAnimation(p1, p2, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        });
                        this.animations[i] = lazyLayoutItemAnimation4;
                        lazyLayoutItemAnimation3 = lazyLayoutItemAnimation4;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0017*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "copy", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "create", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: create */
        public final DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void update(DisplayingDisappearingItemsNode p0) {
            p0.setAnimator(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> p0) {
            return new DisplayingDisappearingItemsElement(p0);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) p0).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return this.animator.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayingDisappearingItemsElement(animator=");
            sb.append(this.animator);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0016\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0012*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "copy", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "onAttach", "()V", "onDetach", "setAnimator", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM7063getXimpl = IntOffset.m7063getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    float fM7064getYimpl = IntOffset.m7064getYimpl(lazyLayoutItemAnimation.getFinalOffset());
                    ContentDrawScope contentDrawScope2 = contentDrawScope;
                    float fM7063getXimpl2 = fM7063getXimpl - IntOffset.m7063getXimpl(layer.getTopLeft());
                    float fM7064getYimpl2 = fM7064getYimpl - IntOffset.m7064getYimpl(layer.getTopLeft());
                    contentDrawScope2.getDrawContext().getTransform().translate(fM7063getXimpl2, fM7064getYimpl2);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                        contentDrawScope2.getDrawContext().getTransform().translate(-fM7063getXimpl2, -fM7064getYimpl2);
                    } catch (Throwable th) {
                        contentDrawScope2.getDrawContext().getTransform().translate(-fM7063getXimpl2, -fM7064getYimpl2);
                        throw th;
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> p0) {
            if (Intrinsics.areEqual(this.animator, p0) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) p0).displayingNode = this;
            this.animator = p0;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> p0) {
            return new DisplayingDisappearingItemsNode(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) p0).animator);
        }

        public final int hashCode() {
            return this.animator.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayingDisappearingItemsNode(animator=");
            sb.append(this.animator);
            sb.append(')');
            return sb.toString();
        }
    }
}
