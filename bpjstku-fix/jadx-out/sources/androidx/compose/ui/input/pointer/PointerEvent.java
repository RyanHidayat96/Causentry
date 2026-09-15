package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\"\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\fR\u001a\u0010%\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\fR*\u0010'\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "p0", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "p1", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "Landroidx/compose/ui/input/pointer/PointerEventType;", "calculatePointerEventType-7fucELk", "()I", "calculatePointerEventType", "component1", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "copy", "(Ljava/util/List;Landroid/view/MotionEvent;)Landroidx/compose/ui/input/pointer/PointerEvent;", "changes", "Ljava/util/List;", "getChanges", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "motionEvent", "", "classification", "I", "getClassification", "Landroidx/compose/ui/input/pointer/PointerButtons;", "buttons", "getButtons-ry648PA", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "keyboardModifiers", "getKeyboardModifiers-k7X9c1A", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final int classification;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        MotionEvent motionEvent;
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        this.classification = (Build.VERSION.SDK_INT < 29 || (motionEvent = getMotionEvent()) == null) ? 0 : motionEvent.getClassification();
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = PointerButtons.m5442constructorimpl(motionEvent2 != null ? motionEvent2.getButtonState() : 0);
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = PointerKeyboardModifiers.m5571constructorimpl(motionEvent3 != null ? motionEvent3.getMetaState() : 0);
        this.type = m5448calculatePointerEventType7fucELk();
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    /* JADX INFO: renamed from: getInternalPointerEvent$ui_release, reason: from getter */
    public final InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final MotionEvent getMotionEvent() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    public final int getClassification() {
        return this.classification;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name and from getter */
    public final int getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name and from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m5452setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m5448calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent();
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.INSTANCE.m5467getScroll7fucELk();
                            case 9:
                                return PointerEventType.INSTANCE.m5462getEnter7fucELk();
                            case 10:
                                return PointerEventType.INSTANCE.m5463getExit7fucELk();
                            default:
                                return PointerEventType.INSTANCE.m5468getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.INSTANCE.m5464getMove7fucELk();
                }
                return PointerEventType.INSTANCE.m5466getRelease7fucELk();
            }
            return PointerEventType.INSTANCE.m5465getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list.get(i);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.INSTANCE.m5466getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.INSTANCE.m5465getPress7fucELk();
            }
        }
        return PointerEventType.INSTANCE.m5464getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> p0, MotionEvent p1) {
        if (p1 == null) {
            return new PointerEvent(p0, null);
        }
        if (Intrinsics.areEqual(p1, getMotionEvent())) {
            return new PointerEvent(p0, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(p0.size());
        ArrayList arrayList = new ArrayList(p0.size());
        int size = p0.size();
        int i = 0;
        while (i < size) {
            PointerInputChange pointerInputChange = p0.get(i);
            longSparseArray.put(pointerInputChange.getId(), pointerInputChange);
            ArrayList arrayList2 = arrayList;
            long jM5507getIdJ3iCeTQ = pointerInputChange.getId();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long jM5509getPositionF1C5BW0 = pointerInputChange.getPosition();
            long jM5509getPositionF1C5BW1 = pointerInputChange.getPosition();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int iM5512getTypeT8wyACA = pointerInputChange.getType();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i2 = i;
            arrayList2.add(new PointerInputEventData(jM5507getIdJ3iCeTQ, uptimeMillis, jM5509getPositionF1C5BW0, jM5509getPositionF1C5BW1, pressed, pressure, iM5512getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m5437activeHoverEvent0FcD4WY(pointerInputChange.getId()), null, 0L, 0L, 1792, null));
            i = i2 + 1;
        }
        return new PointerEvent(p0, new InternalPointerEvent(longSparseArray, new PointerInputEvent(p1.getEventTime(), arrayList, p1)));
    }
}
