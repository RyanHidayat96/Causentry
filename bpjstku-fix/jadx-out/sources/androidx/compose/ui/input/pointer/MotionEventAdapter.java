package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0010J/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u00020\"8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010/"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "p1", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "", "endStream", "(I)V", "addFreshIds", "(Landroid/view/MotionEvent;)V", "removeStaleIds", "", "hasPointerId", "(Landroid/view/MotionEvent;I)Z", "Landroidx/compose/ui/input/pointer/PointerId;", "getComposePointerId-_I2yYro", "(I)J", "getComposePointerId", "clearOnDeviceChange", "p2", "p3", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;IZ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "nextId", "J", "Landroid/util/SparseLongArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "Landroid/util/SparseBooleanArray;", "", "pointers", "Ljava/util/List;", "previousToolType", "I", "previousSource"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    /* JADX INFO: renamed from: getMotionEventToComposePointerIdMap$ui_release, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent p0, PositionCalculator p1) {
        int actionIndex;
        int actionMasked = p0.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        clearOnDeviceChange(p0);
        addFreshIds(p0);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(p0.getPointerId(p0.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : p0.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        int pointerCount = p0.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.pointers.add(createPointerInputEventData(p1, p0, i, (z || i == actionIndex || (z2 && p0.getButtonState() == 0)) ? false : true));
            i++;
        }
        removeStaleIds(p0);
        return new PointerInputEvent(p0.getEventTime(), this.pointers, p0);
    }

    public final void endStream(int p0) {
        this.activeHoverIds.delete(p0);
        this.motionEventToComposePointerIdMap.delete(p0);
    }

    private final void addFreshIds(MotionEvent p0) {
        int actionMasked = p0.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = p0.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j = this.nextId;
                    this.nextId = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = p0.getActionIndex();
        int pointerId2 = p0.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (p0.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void removeStaleIds(MotionEvent p0) {
        int actionMasked = p0.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = p0.getPointerId(p0.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > p0.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; size >= 0; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(p0, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m5439getComposePointerId_I2yYro(int p0) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(p0);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(p0, jValueAt);
        }
        return PointerId.m5489constructorimpl(jValueAt);
    }

    private final void clearOnDeviceChange(MotionEvent p0) {
        if (p0.getPointerCount() == 1) {
            int toolType = p0.getToolType(0);
            int source = p0.getSource();
            if (toolType == this.previousToolType && source == this.previousSource) {
                return;
            }
            this.previousToolType = toolType;
            this.previousSource = source;
            this.activeHoverIds.clear();
            this.motionEventToComposePointerIdMap.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0083  */
    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    /* JADX WARN: Code duplicated, block: B:16:0x0089  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x011f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    private final PointerInputEventData createPointerInputEventData(PositionCalculator p0, MotionEvent p1, int p2, boolean p3) {
        long j;
        long jMo5589localToScreenMKHz9U;
        long jM5440toRawOffsetdBAh8RU;
        long jMo5590screenToLocalMKHz9U;
        int toolType;
        int iM5588getUnknownT8wyACA;
        int historySize;
        int i;
        long jM3990getZeroF1C5BW0;
        float historicalX;
        int i2 = p2;
        long jM5439getComposePointerId_I2yYro = m5439getComposePointerId_I2yYro(p1.getPointerId(p2));
        float pressure = p1.getPressure(p2);
        long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(p1.getY(p2))) & 4294967295L) | (((long) Float.floatToRawIntBits(p1.getX(p2))) << 32));
        long jM3968copydBAh8RU$default = Offset.m3968copydBAh8RU$default(jM3966constructorimpl, 0.0f, 0.0f, 3, null);
        if (i2 != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                jM5440toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m5440toRawOffsetdBAh8RU(p1, i2);
                jMo5590screenToLocalMKHz9U = p0.mo5590screenToLocalMKHz9U(jM5440toRawOffsetdBAh8RU);
            } else {
                j = jM3966constructorimpl;
                jMo5589localToScreenMKHz9U = p0.mo5589localToScreenMKHz9U(jM3966constructorimpl);
            }
            toolType = p1.getToolType(p2);
            if (toolType == 0) {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5588getUnknownT8wyACA();
            } else if (toolType != 1) {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5587getTouchT8wyACA();
            } else if (toolType != 2) {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5586getStylusT8wyACA();
            } else if (toolType != 3) {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5585getMouseT8wyACA();
            } else if (toolType == 4) {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5588getUnknownT8wyACA();
            } else {
                iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5584getEraserT8wyACA();
            }
            int i3 = iM5588getUnknownT8wyACA;
            ArrayList arrayList = new ArrayList(p1.getHistorySize());
            i = 0;
            for (historySize = p1.getHistorySize(); i < historySize; historySize = historySize) {
                historicalX = p1.getHistoricalX(i2, i);
                float historicalY = p1.getHistoricalY(i2, i);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jM3966constructorimpl2 = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(historicalY)) & 4294967295L) | (Float.floatToRawIntBits(historicalX) << 32));
                    arrayList.add(new HistoricalChange(p1.getHistoricalEventTime(i), jM3966constructorimpl2, jM3966constructorimpl2, null));
                }
                i++;
                i2 = p2;
            }
            if (p1.getActionMasked() == 8) {
                jM3990getZeroF1C5BW0 = Offset.INSTANCE.m3990getZeroF1C5BW0();
            } else {
                jM3990getZeroF1C5BW0 = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits((-p1.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(p1.getAxisValue(10))) << 32));
            }
            return new PointerInputEventData(jM5439getComposePointerId_I2yYro, p1.getEventTime(), jMo5589localToScreenMKHz9U, j, p3, pressure, i3, this.activeHoverIds.get(p1.getPointerId(p2), false), arrayList, jM3990getZeroF1C5BW0, jM3968copydBAh8RU$default, null);
        }
        jM5440toRawOffsetdBAh8RU = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(p1.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(p1.getRawX())) << 32));
        jMo5590screenToLocalMKHz9U = p0.mo5590screenToLocalMKHz9U(jM5440toRawOffsetdBAh8RU);
        jMo5589localToScreenMKHz9U = jM5440toRawOffsetdBAh8RU;
        j = jMo5590screenToLocalMKHz9U;
        toolType = p1.getToolType(p2);
        if (toolType == 0) {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5588getUnknownT8wyACA();
        } else if (toolType != 1) {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5587getTouchT8wyACA();
        } else if (toolType != 2) {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5586getStylusT8wyACA();
        } else if (toolType != 3) {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5585getMouseT8wyACA();
        } else if (toolType == 4) {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5588getUnknownT8wyACA();
        } else {
            iM5588getUnknownT8wyACA = PointerType.INSTANCE.m5584getEraserT8wyACA();
        }
        int i4 = iM5588getUnknownT8wyACA;
        ArrayList arrayList2 = new ArrayList(p1.getHistorySize());
        i = 0;
        while (i < historySize) {
            historicalX = p1.getHistoricalX(i2, i);
            float historicalY2 = p1.getHistoricalY(i2, i);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i++;
            i2 = p2;
        }
        if (p1.getActionMasked() == 8) {
            jM3990getZeroF1C5BW0 = Offset.INSTANCE.m3990getZeroF1C5BW0();
        } else {
            jM3990getZeroF1C5BW0 = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits((-p1.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(p1.getAxisValue(10))) << 32));
        }
        return new PointerInputEventData(jM5439getComposePointerId_I2yYro, p1.getEventTime(), jMo5589localToScreenMKHz9U, j, p3, pressure, i4, this.activeHoverIds.get(p1.getPointerId(p2), false), arrayList2, jM3990getZeroF1C5BW0, jM3968copydBAh8RU$default, null);
    }
}
