package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0016J\u0013\u0010!\u001a\u00020\u0012*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R+\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00101\u001a\u00020\u00058\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010&R\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R/\u0010<\u001a\u0004\u0018\u0001062\b\u0010\u0004\u001a\u0004\u0018\u0001068C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010(\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0019\u0010A\u001a\u00020@8\u0002@\u0002X\u0083\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "p2", "Landroidx/compose/material/ripple/RippleAlpha;", "p3", "Landroid/view/ViewGroup;", "p4", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Lkotlinx/coroutines/CoroutineScope;", "", "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "dispose", "()V", "Landroidx/compose/material/ripple/RippleContainer;", "getOrCreateRippleContainer", "()Landroidx/compose/material/ripple/RippleContainer;", "onAbandoned", "onForgotten", "onRemembered", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "resetHostView", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "bounded", "Z", TypedValues.Custom.S_COLOR, "Landroidx/compose/runtime/State;", "invalidateTick$delegate", "Landroidx/compose/runtime/MutableState;", "getInvalidateTick", "()Z", "setInvalidateTick", "(Z)V", "invalidateTick", "Lkotlin/Function0;", "onInvalidateRipple", "Lkotlin/jvm/functions/Function0;", "radius", "F", "rippleAlpha", "rippleContainer", "Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView$delegate", "getRippleHostView", "()Landroidx/compose/material/ripple/RippleHostView;", "setRippleHostView", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "", "rippleRadius", "I", "Landroidx/compose/ui/geometry/Size;", "rippleSize", "J", "view", "Landroid/view/ViewGroup;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    public static final int $stable = 8;
    private final boolean bounded;
    private final State<Color> color;

    /* JADX INFO: renamed from: invalidateTick$delegate, reason: from kotlin metadata */
    private final MutableState invalidateTick;
    private final Function0<Unit> onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;

    /* JADX INFO: renamed from: rippleHostView$delegate, reason: from kotlin metadata */
    private final MutableState rippleHostView;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    private AndroidRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.rippleSize = Size.INSTANCE.m4052getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AndroidRippleIndicationInstance androidRippleIndicationInstance = this.this$0;
                androidRippleIndicationInstance.setInvalidateTick(!androidRippleIndicationInstance.getInvalidateTick());
            }

            {
                super(0);
            }
        };
    }

    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView.getValue();
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView.setValue(rippleHostView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z) {
        this.invalidateTick.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void drawIndication(ContentDrawScope contentDrawScope) {
        int iRoundToInt;
        this.rippleSize = contentDrawScope.mo4798getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            iRoundToInt = MathKt.roundToInt(RippleAnimationKt.m1738getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo4798getSizeNHjbRc()));
        } else {
            iRoundToInt = contentDrawScope.mo688roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = iRoundToInt;
        long jM4228unboximpl = this.color.getValue().m4228unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        m1743drawStateLayerH2RKhps(contentDrawScope2, this.radius, jM4228unboximpl);
        Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m1742updateRipplePropertiesbiQXAtU(contentDrawScope.mo4798getSizeNHjbRc(), this.rippleRadius, jM4228unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void addRipple(PressInteraction.Press p0, CoroutineScope p1) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1741addRippleKOepWvA(p0, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m4228unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void removeRipple(PressInteraction.Press p0) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        dispose();
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    public final void resetHostView() {
        setRippleHostView(null);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            Intrinsics.checkNotNull(rippleContainer);
            return rippleContainer;
        }
        int childCount = this.view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.view.getChildAt(i);
            if (childAt instanceof RippleContainer) {
                this.rippleContainer = (RippleContainer) childAt;
                break;
            }
        }
        if (this.rippleContainer == null) {
            RippleContainer rippleContainer2 = new RippleContainer(this.view.getContext());
            this.view.addView(rippleContainer2);
            this.rippleContainer = rippleContainer2;
        }
        RippleContainer rippleContainer3 = this.rippleContainer;
        Intrinsics.checkNotNull(rippleContainer3);
        return rippleContainer3;
    }

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2, viewGroup);
    }
}
