package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.VideoEncoderConfig;
import defpackage.toIllegalArgumentException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u0010*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u001f*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001a*\u00020\u000fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u001a*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0018J\u0014\u0010(\u001a\u00020'*\u00020&H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001e*\u00020\u001fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010!J\u0017\u0010.\u001a\u00020\u0014*\u00020\u000fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u0014*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u0017\u0010.\u001a\u00020\u0014*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u001a8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u001a8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00102R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "p0", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "awaitRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "release", "reset", "", "tryAwaitRelease", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "getDensity", "()F", "density", "getFontScale", "fontScale", "isCanceled", "Z", "isReleased", "LVideoEncoderConfig;", "mutex", "LVideoEncoderConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final VideoEncoderConfig mutex = toIllegalArgumentException.b(false);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {363}, m = "awaitRelease", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
    static final class C02951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02951(Continuation<? super C02951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {370}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    static final class C02961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02961(Continuation<? super C02961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.tryAwaitRelease(this);
        }
    }

    public PressGestureScopeImpl(Density density) {
        this.$$delegate_0 = density;
    }

    public final void cancel() {
        this.isCanceled = true;
        this.mutex.unlock(null);
    }

    public final void release() {
        this.isReleased = true;
        this.mutex.unlock(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object reset(Continuation<? super Unit> continuation) {
        C02951 c02951;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof C02951) {
            c02951 = (C02951) continuation;
            if ((c02951.label & Integer.MIN_VALUE) != 0) {
                c02951.label -= Integer.MIN_VALUE;
            } else {
                c02951 = new C02951(continuation);
            }
        } else {
            c02951 = new C02951(continuation);
        }
        Object obj = c02951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02951.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            VideoEncoderConfig videoEncoderConfig = this.mutex;
            c02951.L$0 = this;
            c02951.label = 1;
            if (videoEncoderConfig.lock(null, c02951) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) c02951.L$0;
            ResultKt.throwOnFailure(obj);
        }
        pressGestureScopeImpl.isReleased = false;
        pressGestureScopeImpl.isCanceled = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    public final Object awaitRelease(Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objTryAwaitRelease = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTryAwaitRelease);
            anonymousClass1.label = 1;
            objTryAwaitRelease = tryAwaitRelease(anonymousClass1);
            if (objTryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTryAwaitRelease);
        }
        if (!((Boolean) objTryAwaitRelease).booleanValue()) {
            throw new GestureCancellationException("The press gesture was canceled.");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    public final Object tryAwaitRelease(Continuation<? super Boolean> continuation) {
        C02961 c02961;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof C02961) {
            c02961 = (C02961) continuation;
            if ((c02961.label & Integer.MIN_VALUE) != 0) {
                c02961.label -= Integer.MIN_VALUE;
            } else {
                c02961 = new C02961(continuation);
            }
        } else {
            c02961 = new C02961(continuation);
        }
        Object obj = c02961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02961.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.isReleased || this.isCanceled) {
                pressGestureScopeImpl = this;
            } else {
                VideoEncoderConfig videoEncoderConfig = this.mutex;
                c02961.L$0 = this;
                c02961.label = 1;
                if (videoEncoderConfig.lock(null, c02961) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pressGestureScopeImpl = this;
            }
            return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pressGestureScopeImpl = (PressGestureScopeImpl) c02961.L$0;
        ResultKt.throwOnFailure(obj);
        pressGestureScopeImpl.mutex.unlock(null);
        return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo687roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo687roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo688roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo688roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo689toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo689toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo690toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo690toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo691toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo691toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo692toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo692toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo693toPxR2X_6o(long j) {
        return this.$$delegate_0.mo693toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo694toPx0680j_4(float f) {
        return this.$$delegate_0.mo694toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo695toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo695toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo696toSp0xMU5do(float f) {
        return this.$$delegate_0.mo696toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo697toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo697toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo698toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo698toSpkPz2Gy4(i);
    }
}
