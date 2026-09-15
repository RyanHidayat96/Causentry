package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010!\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J*\u0010&\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\"2\u0006\u0010\b\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\"\u0010,\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0012J\"\u00103\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "p0", "Landroid/view/View;", "p1", "Landroidx/compose/foundation/layout/SideCalculator;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "", "", "adjustInsets", "(F)V", "animationEnded", "()V", "dispose", "Landroidx/compose/ui/unit/Velocity;", "", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fling", "Landroid/view/WindowInsetsAnimationController;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelled", "(Landroid/view/WindowInsetsAnimationController;)V", "onFinished", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "requestAnimationController", "scroll-8S9VItk", "(JF)J", "scroll", "animationController", "Landroid/view/WindowInsetsAnimationController;", "LVideoMimeInfoBuilder;", "animationJob", "LVideoMimeInfoBuilder;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "continuation", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "isControllerRequested", "Z", "partialConsumption", "F", "sideCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private VideoMimeInfoBuilder animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super WindowInsetsAnimationController> continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final View getView() {
        return this.view;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(Continuation<? super WindowInsetsAnimationController> continuation) {
        Object result = this.animationController;
        if (result == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.continuation = cancellableContinuationImpl;
            requestAnimationController();
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return result;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo1078onPreScrollOzD1aCk(long p0, int p1) {
        return m1076scroll8S9VItk(p0, this.sideCalculator.hideMotion(Offset.m3974getXimpl(p0), Offset.m3975getYimpl(p0)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo804onPostScrollDzOQY0M(long p0, long p1, int p2) {
        return m1076scroll8S9VItk(p1, this.sideCalculator.showMotion(Offset.m3974getXimpl(p1), Offset.m3975getYimpl(p1)));
    }

    /* JADX INFO: renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m1076scroll8S9VItk(long p0, float p1) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.animationJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (p1 != 0.0f) {
            if (this.windowInsets.isVisible() != (p1 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo1028consumedOffsetsMKHz9U(p0);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (p1 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.INSTANCE.m3990getZeroF1C5BW0();
                }
                float f = iValueOf3 + p1 + this.partialConsumption;
                int iCoerceIn = RangesKt.coerceIn(Math.round(f), iValueOf, iValueOf2);
                this.partialConsumption = f - Math.round(f);
                if (iCoerceIn != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iCoerceIn), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo1028consumedOffsetsMKHz9U(p0);
            }
        }
        return Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final Object mo1077onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        return m1075flinghuYlsQE(j, this.sideCalculator.hideMotion(Velocity.m7173getXimpl(j), Velocity.m7174getYimpl(j)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo803onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        return m1075flinghuYlsQE(j2, this.sideCalculator.showMotion(Velocity.m7173getXimpl(j2), Velocity.m7174getYimpl(j2)), true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: fling-huYlsQE, reason: not valid java name */
    public final Object m1075flinghuYlsQE(long j, float f, boolean z, Continuation<? super Velocity> continuation) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        long j2;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        Ref.FloatRef floatRef;
        long j3;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3;
        long j4;
        float f2 = f;
        if (continuation instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) continuation;
            if ((windowInsetsNestedScrollConnection$fling$1.label & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.label -= Integer.MIN_VALUE;
            } else {
                windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, continuation);
            }
        } else {
            windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, continuation);
        }
        Object obj = windowInsetsNestedScrollConnection$fling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = windowInsetsNestedScrollConnection$fling$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            VideoMimeInfoBuilder videoMimeInfoBuilder = this.animationJob;
            if (videoMimeInfoBuilder != null) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new WindowInsetsAnimationCancelledException());
            }
            this.animationJob = null;
            this.partialConsumption = 0.0f;
            if ((f2 == 0.0f && !z) || (this.animationController == null && this.windowInsets.isVisible() == z)) {
                return Velocity.m7164boximpl(Velocity.INSTANCE.m7184getZero9UxMQ8M());
            }
            windowInsetsNestedScrollConnection$fling$1.L$0 = this;
            windowInsetsNestedScrollConnection$fling$1.J$0 = j;
            windowInsetsNestedScrollConnection$fling$1.F$0 = f2;
            windowInsetsNestedScrollConnection$fling$1.label = 1;
            Object animationController = getAnimationController(windowInsetsNestedScrollConnection$fling$1);
            if (animationController != coroutine_suspended) {
                j2 = j;
                obj = animationController;
                windowInsetsNestedScrollConnection = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                j3 = windowInsetsNestedScrollConnection$fling$1.J$0;
                floatRef = (Ref.FloatRef) windowInsetsNestedScrollConnection$fling$1.L$1;
                windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                ResultKt.throwOnFailure(obj);
                return Velocity.m7164boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo1029consumedVelocityQWom1Mo(j3, floatRef.element));
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = windowInsetsNestedScrollConnection$fling$1.J$0;
            windowInsetsNestedScrollConnection3 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
            ResultKt.throwOnFailure(obj);
            return Velocity.m7164boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo1029consumedVelocityQWom1Mo(j4, 0.0f));
        }
        f2 = windowInsetsNestedScrollConnection$fling$1.F$0;
        j2 = windowInsetsNestedScrollConnection$fling$1.J$0;
        windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
        ResultKt.throwOnFailure(obj);
        WindowInsetsAnimationController windowInsetsAnimationController = (WindowInsetsAnimationController) obj;
        if (windowInsetsAnimationController == null) {
            return Velocity.m7164boximpl(Velocity.INSTANCE.m7184getZero9UxMQ8M());
        }
        int iValueOf = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
        int iValueOf2 = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
        int iValueOf3 = windowInsetsNestedScrollConnection.sideCalculator.valueOf(windowInsetsAnimationController.getCurrentInsets());
        if ((f2 <= 0.0f && iValueOf3 == iValueOf) || (f2 >= 0.0f && iValueOf3 == iValueOf2)) {
            windowInsetsAnimationController.finish(iValueOf3 == iValueOf2);
            windowInsetsNestedScrollConnection.animationController = null;
            return Velocity.m7164boximpl(Velocity.INSTANCE.m7184getZero9UxMQ8M());
        }
        SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection.density);
        float fFlingDistance = iValueOf3 + splineBasedFloatDecayAnimationSpec.flingDistance(f2);
        float f3 = iValueOf;
        boolean z2 = (fFlingDistance - f3) / ((float) (iValueOf2 - iValueOf)) > 0.5f;
        int i2 = z2 ? iValueOf2 : iValueOf;
        if (fFlingDistance > iValueOf2 || fFlingDistance < f3) {
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(windowInsetsNestedScrollConnection, iValueOf3, f2, splineBasedFloatDecayAnimationSpec, iValueOf, iValueOf2, floatRef2, windowInsetsAnimationController, z2, null);
            windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection$fling$1.L$1 = floatRef2;
            windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
            windowInsetsNestedScrollConnection$fling$1.label = 2;
            if (CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) != coroutine_suspended) {
                windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                floatRef = floatRef2;
                j3 = j2;
                return Velocity.m7164boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo1029consumedVelocityQWom1Mo(j3, floatRef.element));
            }
        } else {
            WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(windowInsetsNestedScrollConnection, iValueOf3, i2, f2, windowInsetsAnimationController, z2, null);
            windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
            windowInsetsNestedScrollConnection$fling$1.label = 3;
            if (CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) != coroutine_suspended) {
                windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection;
                j4 = j2;
                return Velocity.m7164boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo1029consumedVelocityQWom1Mo(j4, 0.0f));
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float p0) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(p0)), 1.0f, 0.0f);
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onReady(WindowInsetsAnimationController p0, int p1) {
        this.animationController = p0;
        this.isControllerRequested = false;
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super WindowInsetsAnimationController> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation;
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(p0, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
    }

    public final void dispose() {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super WindowInsetsAnimationController> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation;
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b((Object) null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.animationJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onFinished(WindowInsetsAnimationController p0) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onCancelled(WindowInsetsAnimationController p0) {
        animationEnded();
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super WindowInsetsAnimationController> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation;
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b((Object) null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.animationJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }
}
