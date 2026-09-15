package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010#\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0018J0\u0010'\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "", "p1", "Landroidx/compose/ui/geometry/Size;", "p2", "", "p3", "Landroidx/compose/ui/graphics/Color;", "p4", "", "p5", "Lkotlin/Function0;", "", "p6", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "addRipple", "createRipple", "(Z)V", "disposeRipple", "()V", "Landroid/graphics/drawable/Drawable;", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "onLayout", "(ZIIII)V", "onMeasure", "(II)V", "refreshDrawableState", "removeRipple", "setRippleState", "updateRippleProperties-biQXAtU", "(JIJF)V", "updateRippleProperties", "bounded", "Ljava/lang/Boolean;", "", "lastRippleStateChangeTimeMillis", "Ljava/lang/Long;", "onInvalidateRipple", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Ljava/lang/Runnable;", "Landroidx/compose/material/ripple/UnprojectedRipple;", "ripple", "Landroidx/compose/material/ripple/UnprojectedRipple;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private Function0<Unit> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;
    public static final int $stable = 8;
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    private static final int[] RestingState = new int[0];

    @Override // android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public RippleHostView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onMeasure(int p0, int p1) {
        setMeasuredDimension(0, 0);
    }

    private final void createRipple(boolean p0) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(p0);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable p0) {
        Function0<Unit> function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1741addRippleKOepWvA(PressInteraction.Press p0, boolean p1, long p2, int p3, long p4, float p5, Function0<Unit> p6) {
        if (this.ripple == null || !Intrinsics.areEqual(Boolean.valueOf(p1), this.bounded)) {
            createRipple(p1);
            this.bounded = Boolean.valueOf(p1);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        Intrinsics.checkNotNull(unprojectedRipple);
        this.onInvalidateRipple = p6;
        m1742updateRipplePropertiesbiQXAtU(p2, p3, p4, p5);
        if (p1) {
            unprojectedRipple.setHotspot(Offset.m3974getXimpl(p0.getPressPosition()), Offset.m3975getYimpl(p0.getPressPosition()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: updateRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1742updateRipplePropertiesbiQXAtU(long p0, int p1, long p2, float p3) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(p1);
        unprojectedRipple.m1749setColorDxMtmZc(p2, p3);
        Rect rect = new Rect(0, 0, MathKt.roundToInt(Size.m4043getWidthimpl(p0)), MathKt.roundToInt(Size.m4040getHeightimpl(p0)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    private final void setRippleState(boolean p0) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (!p0 && jCurrentAnimationTimeMillis - jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.RippleHostView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f$0);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, ResetRippleDelayDuration);
        } else {
            int[] iArr = p0 ? PressedState : RestingState;
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }
}
