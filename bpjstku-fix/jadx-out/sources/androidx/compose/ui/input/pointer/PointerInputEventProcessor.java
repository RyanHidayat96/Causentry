package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "p0", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "p1", "", "p2", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "()V", "clearPreviouslyHitModifierNodes", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "Landroidx/compose/ui/node/HitTestResult;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m5529processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m5530processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0034, B:14:0x003b, B:17:0x0041, B:19:0x004c, B:21:0x0058, B:26:0x0092, B:23:0x005e, B:25:0x007c, B:27:0x0095, B:39:0x00cb, B:41:0x00d6, B:46:0x00eb, B:44:0x00e7, B:30:0x00a4, B:32:0x00af, B:34:0x00bf, B:37:0x00c7), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: all -> 0x00f2, LOOP:2: B:40:0x00d4->B:44:0x00e7, LOOP_END, TryCatch #0 {all -> 0x00f2, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0034, B:14:0x003b, B:17:0x0041, B:19:0x004c, B:21:0x0058, B:26:0x0092, B:23:0x005e, B:25:0x007c, B:27:0x0095, B:39:0x00cb, B:41:0x00d6, B:46:0x00eb, B:44:0x00e7, B:30:0x00a4, B:32:0x00af, B:34:0x00bf, B:37:0x00c7), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m5530processBIzXfog(PointerInputEvent p0, PositionCalculator p1, boolean p2) {
        int i;
        boolean z;
        boolean z2;
        int size;
        int i2;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        boolean z3 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(p0, p1);
            int size2 = internalPointerEventProduce.getChanges().size();
            while (true) {
                if (i >= size2) {
                    z = true;
                    break;
                }
                PointerInputChange pointerInputChangeValueAt = internalPointerEventProduce.getChanges().valueAt(i);
                i = (pointerInputChangeValueAt.getPressed() || pointerInputChangeValueAt.getPreviousPressed()) ? 0 : i + 1;
                z = false;
                break;
            }
            int size3 = internalPointerEventProduce.getChanges().size();
            for (int i3 = 0; i3 < size3; i3++) {
                PointerInputChange pointerInputChangeValueAt2 = internalPointerEventProduce.getChanges().valueAt(i3);
                if (z || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2)) {
                    LayoutNode.m5830hitTest6fMxITs$ui_release$default(this.root, pointerInputChangeValueAt2.getPosition(), this.hitResult, pointerInputChangeValueAt2.getType(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m5434addHitPathQJqDSyo(pointerInputChangeValueAt2.getId(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce, p2);
            if (!internalPointerEventProduce.getSuppressMovementConsumption()) {
                int size4 = internalPointerEventProduce.getChanges().size();
                int i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        PointerInputChange pointerInputChangeValueAt3 = internalPointerEventProduce.getChanges().valueAt(i4);
                        if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChangeValueAt3) && pointerInputChangeValueAt3.isConsumed()) {
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                size = internalPointerEventProduce.getChanges().size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = false;
                        break;
                    }
                    if (internalPointerEventProduce.getChanges().valueAt(i2).isConsumed()) {
                        break;
                    }
                    i2++;
                }
                return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z2, z3);
            }
            z2 = false;
            size = internalPointerEventProduce.getChanges().size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    z3 = false;
                    break;
                }
                if (internalPointerEventProduce.getChanges().valueAt(i2).isConsumed()) {
                    break;
                    break;
                }
                i2++;
            }
            return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z2, z3);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }
}
