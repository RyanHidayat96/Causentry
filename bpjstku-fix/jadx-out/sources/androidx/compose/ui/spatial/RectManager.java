package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\u001dH\u0007¢\u0006\u0004\b \u0010!JC\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\u001dH\u0007¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b)\u0010&J\u001d\u0010*\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010&J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010&J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010+J?\u00100\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u0007*\u0002022\u0006\u0010\u0004\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\n*\u0002022\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00107J\u0013\u0010;\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b<\u0010&J\u001f\u0010=\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b=\u0010>R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010W"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "p0", "<init>", "(Landroidx/collection/IntObjectMap;)V", "", "invalidate", "()V", "Landroidx/compose/ui/unit/IntOffset;", "p1", "Landroidx/compose/ui/graphics/Matrix;", "p2", "", "p3", "p4", "updateOffsets-gTq6Wqs", "(JJ[FII)V", "updateOffsets", "dispatchCallbacks", "", "scheduleDebounceCallback", "(Z)V", "Lkotlin/Function0;", "registerOnChangedCallback", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChangedCallback", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalLayoutCallback", "unregisterOnChangedCallback", "(Ljava/lang/Object;)V", "invalidateCallbacksFor", "(Landroidx/compose/ui/node/LayoutNode;)V", "updateFlagsFor", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "recalculateOffsetFromRoot", "insertOrUpdateTransformedNodeSubhierarchy", "insertOrUpdateTransformedNode", "p5", "insertOrUpdate", "(Landroidx/compose/ui/node/LayoutNode;ZIIII)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/geometry/MutableRect;", "boundingRectInRoot", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "applyLayerTransformation-2IdBmHc", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "applyLayerTransformation", "outerToInnerOffset-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "outerToInnerOffset", "remove", "isTargetDrawnFirst$ui_release", "(II)Z", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/collection/MutableObjectList;", "callbacks", "Landroidx/collection/MutableObjectList;", "isDirty", "Z", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "Ljava/lang/Object;", "scheduledDispatchDeadline", "J", "dispatchLambda", "Lkotlin/jvm/functions/Function0;", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<Function0<Unit>> callbacks;
    private final Function0<Unit> dispatchLambda;
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }

            {
                super(0);
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    /* JADX INFO: renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m6167updateOffsetsgTq6Wqs(long p0, long p1, float[] p2, int p3, int p4) {
        this.isScreenOrWindowDirty = this.throttledCallbacks.m6184updateOffsetsLDcG7Xg(p0, p1, (RectManagerKt.m6170analyzeComponents58bKbWc(p2) & 2) != 0 ? null : p2, p3, p4) || this.isScreenOrWindowDirty;
    }

    public final void dispatchCallbacks() {
        long[] jArr;
        final long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z = this.isDirty;
        int i = 0;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            MutableObjectList<Function0<Unit>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function0) objArr[i3]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr2 = rectList.items;
            int i4 = rectList.itemsSize;
            for (int i5 = 0; i5 < jArr2.length - 2 && i5 < i4; i5 += 3) {
                long j = jArr2[i5 + 2];
                if ((((int) (j >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j), jArr2[i5], jArr2[i5 + 1], jCurrentTimeMillis);
                }
            }
            MutableIntObjectMap<ThrottledCallbacks.Entry> rectChangedMap = this.throttledCallbacks.getRectChangedMap();
            Object[] objArr2 = rectChangedMap.values;
            long[] jArr3 = rectChangedMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr3[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = i;
                        while (i9 < i8) {
                            if ((255 & j2) < 128) {
                                final ThrottledCallbacks.Entry entry = (ThrottledCallbacks.Entry) objArr2[(i6 << 3) + i9];
                                ThrottledCallbacks.Entry next = entry;
                                while (next != null) {
                                    if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                        this.rects.withTopLeftBottomRight(entry.getId(), new Function2<Long, Long, Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchCallbacks$3$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke(l.longValue(), l2.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j3, long j4) {
                                                this.this$0.throttledCallbacks.fireWithUpdatedRect$ui_release(entry, j3, j4, jCurrentTimeMillis);
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }
                                        });
                                    }
                                    next = next.getNext();
                                    jArr3 = jArr3;
                                    i7 = 8;
                                }
                            }
                            long[] jArr4 = jArr3;
                            int i10 = i7;
                            j2 >>= i10;
                            i9++;
                            i7 = i10;
                            jArr3 = jArr4;
                        }
                        jArr = jArr3;
                        if (i8 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr3 = jArr;
                    i = 0;
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
    }

    public final void scheduleDebounceCallback(boolean p0) {
        boolean z = (p0 && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.removePost(obj);
            }
            long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
            long jMax = Math.max(minDebounceDeadline, 16 + jCurrentTimeMillis);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = Actual_androidKt.postDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
        }
    }

    public final Object registerOnChangedCallback(Function0<Unit> p0) {
        this.callbacks.add(p0);
        return p0;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int p0, long p1, long p2, DelegatableNode p3, Function1<? super RelativeLayoutBounds, Unit> p4) {
        DelegatableNode.RegistrationHandle registrationHandleRegisterOnRectChanged = this.throttledCallbacks.registerOnRectChanged(p0, p1, p2, p3, p4);
        invalidate();
        scheduleDebounceCallback(true);
        return registrationHandleRegisterOnRectChanged;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int p0, long p1, long p2, DelegatableNode p3, Function1<? super RelativeLayoutBounds, Unit> p4) {
        return this.throttledCallbacks.registerOnGlobalChange(p0, p1, p2, p3, p4);
    }

    public final void unregisterOnChangedCallback(Object p0) {
        if ((TypeIntrinsics.isFunctionOfArity(p0, 0) ? (Function0) p0 : null) == null) {
            return;
        }
        this.callbacks.remove(p0);
    }

    public final void invalidateCallbacksFor(LayoutNode p0) {
        this.isDirty = true;
        this.rects.markUpdated(p0.getSemanticsId());
        scheduleDebounceCallback(true);
    }

    public final void updateFlagsFor(LayoutNode p0, boolean p1, boolean p2) {
        if (p0.isAttached()) {
            this.rects.updateFlagsFor(p0.getSemanticsId(), p1, p2);
        }
    }

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode p0) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jM6166outerToInnerOffsetBjo55l4 = m6166outerToInnerOffsetBjo55l4(p0);
            if (RectManagerKt.m6171isSetgyyYBs(jM6166outerToInnerOffsetBjo55l4)) {
                p0.m5843setOuterToInnerOffsetgyyYBs$ui_release(jM6166outerToInnerOffsetBjo55l4);
                p0.setOuterToInnerOffsetDirty$ui_release(false);
                MutableVector<LayoutNode> mutableVector = p0.get_children$ui_release();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    onLayoutPositionChanged(layoutNodeArr[i], false);
                }
                invalidateCallbacksFor(p0);
                return;
            }
            insertOrUpdateTransformedNodeSubhierarchy(p0);
        }
    }

    public final void onLayoutPositionChanged(LayoutNode p0, boolean p1) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = p0.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            long offsetFromRoot = p0.getOffsetFromRoot();
            long lastSize = p0.getLastSize();
            int i = (int) (lastSize >> 32);
            int i2 = (int) (lastSize & 4294967295L);
            recalculateOffsetFromRoot(p0);
            long offsetFromRoot2 = p0.getOffsetFromRoot();
            if (!RectManagerKt.m6171isSetgyyYBs(offsetFromRoot2)) {
                insertOrUpdateTransformedNode(p0, p1);
                return;
            }
            p0.m5841setLastSizeozmzZPI$ui_release(IntSize.m7101constructorimpl((((long) measuredWidth) << 32) | (4294967295L & ((long) measuredHeight))));
            int iM7063getXimpl = IntOffset.m7063getXimpl(offsetFromRoot2);
            int iM7064getYimpl = IntOffset.m7064getYimpl(offsetFromRoot2);
            if (!p1 && IntOffset.m7062equalsimpl0(offsetFromRoot2, offsetFromRoot) && i == measuredWidth && i2 == measuredHeight) {
                return;
            }
            insertOrUpdate(p0, p1, iM7063getXimpl, iM7064getYimpl, iM7063getXimpl + measuredWidth, iM7064getYimpl + measuredHeight);
        }
    }

    private final void recalculateOffsetFromRoot(LayoutNode p0) {
        long outerToInnerOffset;
        NodeCoordinator outerCoordinator$ui_release = p0.getOuterCoordinator$ui_release();
        long jM6165applyLayerTransformation2IdBmHc = m6165applyLayerTransformation2IdBmHc(outerCoordinator$ui_release, IntOffset.INSTANCE.m7074getZeronOccac());
        if (!RectManagerKt.m6171isSetgyyYBs(jM6165applyLayerTransformation2IdBmHc)) {
            p0.m5842setOffsetFromRootgyyYBs$ui_release(IntOffset.INSTANCE.m7073getMaxnOccac());
            return;
        }
        long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(jM6165applyLayerTransformation2IdBmHc, outerCoordinator$ui_release.getPosition());
        LayoutNode parent$ui_release = p0.getParent$ui_release();
        if (parent$ui_release != null) {
            if (!RectManagerKt.m6171isSetgyyYBs(parent$ui_release.getOffsetFromRoot())) {
                recalculateOffsetFromRoot(parent$ui_release);
            }
            long offsetFromRoot = parent$ui_release.getOffsetFromRoot();
            if (!RectManagerKt.m6171isSetgyyYBs(offsetFromRoot)) {
                jM7067plusqkQi6aY = IntOffset.INSTANCE.m7073getMaxnOccac();
            } else {
                if (parent$ui_release.getOuterToInnerOffsetDirty()) {
                    outerToInnerOffset = m6166outerToInnerOffsetBjo55l4(parent$ui_release);
                    parent$ui_release.m5843setOuterToInnerOffsetgyyYBs$ui_release(outerToInnerOffset);
                    parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                } else {
                    outerToInnerOffset = parent$ui_release.getOuterToInnerOffset();
                }
                if (!RectManagerKt.m6171isSetgyyYBs(outerToInnerOffset)) {
                    jM7067plusqkQi6aY = IntOffset.INSTANCE.m7073getMaxnOccac();
                } else {
                    jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(IntOffset.m7067plusqkQi6aY(offsetFromRoot, outerToInnerOffset), jM7067plusqkQi6aY);
                }
            }
        }
        p0.m5842setOffsetFromRootgyyYBs$ui_release(jM7067plusqkQi6aY);
    }

    private final void insertOrUpdateTransformedNode(LayoutNode p0, boolean p1) {
        NodeCoordinator outerCoordinator$ui_release = p0.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = p0.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = p0.getSemanticsId();
        if (p1 || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui_release = p0.getParent$ui_release();
            this.rects.insert(semanticsId, left, top, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, p0.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(1024)), p0.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(16)));
        }
        invalidate();
    }

    private final void insertOrUpdate(LayoutNode p0, boolean p1, int p2, int p3, int p4, int p5) {
        int semanticsId = p0.getSemanticsId();
        if (p1 || !this.rects.move(semanticsId, p2, p3, p4, p5)) {
            LayoutNode parent$ui_release = p0.getParent$ui_release();
            this.rects.insert(semanticsId, p2, p3, p4, p5, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, p0.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(1024)), p0.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(16)));
        }
        invalidate();
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo5981getUnderlyingMatrixsQKQjiQ = layer.mo5981getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m4486isIdentity58bKbWc(fArrMo5981getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m4469mapimpl(fArrMo5981getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long position = nodeCoordinator.getPosition();
            mutableRect.m3959translatek4lQ0M(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(position))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(position))) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    /* JADX INFO: renamed from: applyLayerTransformation-2IdBmHc, reason: not valid java name */
    private final long m6165applyLayerTransformation2IdBmHc(NodeCoordinator nodeCoordinator, long j) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        if (layer == null) {
            return j;
        }
        float[] fArrMo5981getUnderlyingMatrixsQKQjiQ = layer.mo5981getUnderlyingMatrixsQKQjiQ();
        int iM6170analyzeComponents58bKbWc = RectManagerKt.m6170analyzeComponents58bKbWc(fArrMo5981getUnderlyingMatrixsQKQjiQ);
        if (iM6170analyzeComponents58bKbWc == 3) {
            return j;
        }
        if ((iM6170analyzeComponents58bKbWc & 2) == 0) {
            return IntOffset.INSTANCE.m7073getMaxnOccac();
        }
        return IntOffsetKt.m7080roundk4lQ0M(Matrix.m4467mapMKHz9U(fArrMo5981getUnderlyingMatrixsQKQjiQ, Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(j))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(j))) << 32))));
    }

    /* JADX INFO: renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m6166outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM7074getZeronOccac = IntOffset.INSTANCE.m7074getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release(); innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release; innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy()) {
            long jM6165applyLayerTransformation2IdBmHc = m6165applyLayerTransformation2IdBmHc(innerCoordinator$ui_release, jM7074getZeronOccac);
            if (IntOffset.m7062equalsimpl0(jM6165applyLayerTransformation2IdBmHc, IntOffset.INSTANCE.m7073getMaxnOccac())) {
                return IntOffset.INSTANCE.m7073getMaxnOccac();
            }
            jM7074getZeronOccac = IntOffset.m7067plusqkQi6aY(jM6165applyLayerTransformation2IdBmHc, innerCoordinator$ui_release.getPosition());
        }
        return jM7074getZeronOccac;
    }

    public final void remove(LayoutNode p0) {
        this.rects.remove(p0.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final boolean isTargetDrawnFirst$ui_release(int p0, int p1) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        LayoutNode parent$ui_release3 = this.layoutNodes.get(p0);
        if (parent$ui_release3 != null && (parent$ui_release = this.layoutNodes.get(p1)) != null && parent$ui_release3.getDepth() != 0 && parent$ui_release.getDepth() != 0) {
            while (parent$ui_release3.getDepth() > parent$ui_release.getDepth()) {
                parent$ui_release3 = parent$ui_release3.getParent$ui_release();
                if (parent$ui_release3 == null) {
                    return false;
                }
            }
            if (parent$ui_release3 == parent$ui_release) {
                return false;
            }
            while (parent$ui_release.getDepth() > parent$ui_release3.getDepth()) {
                parent$ui_release = parent$ui_release.getParent$ui_release();
                if (parent$ui_release == null) {
                    return false;
                }
            }
            if (parent$ui_release3 == parent$ui_release) {
                return false;
            }
            LayoutNode layoutNode = parent$ui_release;
            LayoutNode layoutNode2 = layoutNode;
            LayoutNode layoutNode3 = parent$ui_release3;
            while (parent$ui_release3 != layoutNode) {
                LayoutNode parent$ui_release4 = parent$ui_release3.getParent$ui_release();
                if (parent$ui_release4 == null || (parent$ui_release2 = layoutNode.getParent$ui_release()) == null) {
                    return false;
                }
                layoutNode3 = parent$ui_release3;
                parent$ui_release3 = parent$ui_release4;
                layoutNode2 = layoutNode;
                layoutNode = parent$ui_release2;
            }
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex() == layoutNode2.getMeasurePassDelegate$ui_release().getZIndex()) {
                return layoutNode3.getPlaceOrder$ui_release() < layoutNode2.getPlaceOrder$ui_release();
            }
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex() < layoutNode2.getMeasurePassDelegate$ui_release().getZIndex()) {
                return true;
            }
        }
        return false;
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode p0) {
        MutableVector<LayoutNode> mutableVector = p0.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            insertOrUpdateTransformedNode(layoutNode, false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
