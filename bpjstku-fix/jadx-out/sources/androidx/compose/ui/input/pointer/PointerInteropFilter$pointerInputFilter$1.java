package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u000b\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "Landroidx/compose/ui/unit/IntSize;", "p2", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "()V", "reset", "", "dispatchToView", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)V", "stopDispatching", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "getShareWithSiblings", "()Z", "shareWithSiblings", "lastEventDispatchedToInitialPass", "Landroidx/compose/ui/input/pointer/PointerEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerEvent lastEventDispatchedToInitialPass;
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final boolean getShareWithSiblings() {
        return true;
    }

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo5532onPointerEventH0pRuoY(PointerEvent p0, PointerEventPass p1, long p2) {
        boolean z;
        boolean z2;
        boolean z3;
        List<PointerInputChange> changes = p0.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (changes.get(i2).isConsumed()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (this.this$0.getDisallowIntercept()) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2 || !ComposeUiFlags.isPointerInteropFilterDispatchingFixEnabled) {
                    z3 = false;
                    break;
                }
            } else {
                PointerInputChange pointerInputChange2 = changes.get(i3);
                if (!PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) && !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (p1 == PointerEventPass.Initial && z3) {
                this.lastEventDispatchedToInitialPass = p0;
                dispatchToView(p0, !z || this.this$0.getDisallowIntercept());
            }
            if (p1 == PointerEventPass.Main && z && Intrinsics.areEqual(p0, this.lastEventDispatchedToInitialPass) && this.this$0.getDisallowIntercept() && ComposeUiFlags.isPointerInteropFilterDispatchingFixEnabled) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    changes.get(i4).consume();
                }
            }
            if (!ComposeUiFlags.isPointerInteropFilterDispatchingFixEnabled ? !(p1 != PointerEventPass.Final || z3) : !(p1 != PointerEventPass.Final || z3 || Intrinsics.areEqual(p0, this.lastEventDispatchedToInitialPass))) {
                dispatchToView(p0, true);
            }
        }
        if (p1 == PointerEventPass.Final) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 < size5) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    reset();
                    break;
                }
            }
            if (Intrinsics.areEqual(p0, this.lastEventDispatchedToInitialPass) && z && ComposeUiFlags.isPointerInteropFilterDispatchingFixEnabled) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (changes.get(i6).isConsumed()) {
                        if (this.this$0.getDisallowIntercept()) {
                            break;
                        }
                        stopDispatching(p0);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    changes.get(i7).consume();
                }
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MotionEvent motionEvent) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }

                {
                    super(1);
                }
            });
            reset();
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
        this.lastEventDispatchedToInitialPass = null;
    }

    private final void dispatchToView(PointerEvent p0, boolean p1) {
        List<PointerInputChange> changes = p0.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).isConsumed()) {
                stopDispatching(p0);
                return;
            }
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates != null) {
            long jMo5648localToRootMKHz9U = layoutCoordinates.mo5648localToRootMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0());
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.m5568toMotionEventScoped4ec7I(p0, jMo5648localToRootMKHz9U, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MotionEvent motionEvent) {
                    PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    if (motionEvent.getActionMasked() == 0) {
                        PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
                        if (pointerInteropFilter.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
                        } else {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
                        }
                        pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                if (!ComposeUiFlags.isPointerInteropFilterDispatchingFixEnabled) {
                    int size2 = list.size();
                    while (i < size2) {
                        changes.get(i).consume();
                        i++;
                    }
                } else if (p1) {
                    int size3 = list.size();
                    while (i < size3) {
                        changes.get(i).consume();
                        i++;
                    }
                }
                InternalPointerEvent internalPointerEvent$ui_release = p0.getInternalPointerEvent();
                if (internalPointerEvent$ui_release != null) {
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void stopDispatching(PointerEvent p0) {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
            if (layoutCoordinates != null) {
                long jMo5648localToRootMKHz9U = layoutCoordinates.mo5648localToRootMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0());
                final PointerInteropFilter pointerInteropFilter = this.this$0;
                PointerInteropUtils_androidKt.m5567toCancelMotionEventScoped4ec7I(p0, jMo5648localToRootMKHz9U, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                        invoke2(motionEvent);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(MotionEvent motionEvent) {
                        pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                    }

                    {
                        super(1);
                    }
                });
            } else {
                throw new IllegalStateException("layoutCoordinates not set".toString());
            }
        }
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }
}
