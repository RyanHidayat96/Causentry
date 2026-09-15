package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.lambdaselectSampleRateOrNearestSupported0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001QB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\"\u0010+\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u000201*\u0002002\u0006\u0010\u0006\u001a\u000200H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u000201*\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00103J \u00108\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010CR'\u0010M\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00198\u0001@BX\u0081\u000eø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/Orientation;", "p0", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "p1", "", "p2", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "p3", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "", "bringChildIntoView", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "", "calculateScrollDelta", "(Landroidx/compose/foundation/gestures/BringIntoViewSpec;)F", "Landroidx/compose/ui/unit/IntSize;", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "computeDestination", "findBringIntoViewRequest", "()Landroidx/compose/ui/geometry/Rect;", "getFocusedChildBounds", "launchAnimation", "()V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onFocusBoundsChanged", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "relocationOffset", "requireBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "update", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/ui/geometry/Size;", "", "compareTo-iLBOSCw", "(JJ)I", "compareTo", "compareTo-TemP2vQ", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "isMaxVisible", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "isAnimationRunning", "Z", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "trackingFocusedChild", "viewportSize", "J", "getViewportSize-YbymL2g$foundation_release", "()J", "Request"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.INSTANCE.m7111getZeroYbymL2g();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Rect calculateRectForParent(Rect p0) {
        if (IntSize.m7104equalsimpl0(this.viewportSize, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        return m718computeDestinationO0kMr_c(p0, this.viewportSize);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || m720isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates p0) {
        this.focusedChild = p0;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final void mo684onRemeasuredozmzZPI(long p0) {
        Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = p0;
        if (m716compareToTemP2vQ(p0, j) >= 0 || (focusedChildBounds = getFocusedChildBounds()) == null) {
            return;
        }
        Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
        if (rect == null) {
            rect = focusedChildBounds;
        }
        if (!this.isAnimationRunning && !this.trackingFocusedChild && m719isMaxVisibleO0kMr_c(rect, j) && !m719isMaxVisibleO0kMr_c(focusedChildBounds, p0)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(new UpdatableAnimationState(bringIntoViewSpecRequireBringIntoViewSpec.getScrollAnimationSpec()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            CancellationException cancellationException = null;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = VideoMimeInfo.TuitionPaymentFragmentbindingInflater1(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        this.label = 1;
                        if (ContentInViewNode.this.scrollingLogic.scroll(MutatePriority.Default, new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ VideoMimeInfoBuilder $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    UpdatableAnimationState updatableAnimationState = this.$animationState;
                    final ContentInViewNode contentInViewNode = this.this$0;
                    final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                    final VideoMimeInfoBuilder videoMimeInfoBuilder = this.$animationJob;
                    Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(Float f) {
                            invoke(f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f) {
                            float f2 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM819toFloatk4lQ0M = f2 * scrollingLogic.m819toFloatk4lQ0M(scrollingLogic.m817reverseIfNeededMKHz9U(nestedScrollScope.mo775scrollByOzD1aCk(scrollingLogic.m817reverseIfNeededMKHz9U(scrollingLogic.m820toOffsettuRUvjQ(f2 * f)), NestedScrollSource.INSTANCE.m5401getUserInputWNlRxjI())));
                            if (Math.abs(fM819toFloatk4lQ0M) < Math.abs(f)) {
                                VideoMimeInfoBuilder videoMimeInfoBuilder2 = videoMimeInfoBuilder;
                                StringBuilder sb = new StringBuilder("Scroll animation cancelled because scroll was not consumed (");
                                sb.append(fM819toFloatk4lQ0M);
                                sb.append(" < ");
                                sb.append(f);
                                sb.append(')');
                                CancellationException cancellationException = new CancellationException(sb.toString());
                                cancellationException.initCause(null);
                                videoMimeInfoBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    final ContentInViewNode contentInViewNode2 = this.this$0;
                    final UpdatableAnimationState updatableAnimationState3 = this.$animationState;
                    final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(function1, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Rect focusedChildBounds;
                            Rect rectInvoke;
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode3 = contentInViewNode2;
                            while (bringIntoViewRequestPriorityQueue.requests.isNotEmpty() && ((rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke()) == null || ContentInViewNode.m720isMaxVisibleO0kMr_c$default(contentInViewNode3, rectInvoke, 0L, 1, null))) {
                                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> continuation = ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                                Unit unit = Unit.INSTANCE;
                                Result.Companion companion = Result.INSTANCE;
                                continuation.resumeWith(Result.m8024constructorimpl(unit));
                            }
                            if (contentInViewNode2.trackingFocusedChild && (focusedChildBounds = contentInViewNode2.getFocusedChildBounds()) != null && ContentInViewNode.m720isMaxVisibleO0kMr_c$default(contentInViewNode2, focusedChildBounds, 0L, 1, null)) {
                                contentInViewNode2.trackingFocusedChild = false;
                            }
                            updatableAnimationState3.setValue(contentInViewNode2.calculateScrollDelta(bringIntoViewSpec));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, VideoMimeInfoBuilder videoMimeInfoBuilder, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = videoMimeInfoBuilder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ContentInViewNode.this.new AnonymousClass2(this.$animationState, this.$bringIntoViewSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec p0) {
        if (IntSize.m7104equalsimpl0(this.viewportSize, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return p0.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Size.m4040getHeightimpl(jM7118toSizeozmzZPI));
        }
        if (i == 2) {
            return p0.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Size.m4043getWidthimpl(jM7118toSizeozmzZPI));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rectInvoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m717compareToiLBOSCw(rectInvoke.m4007getSizeNHjbRc(), IntSizeKt.m7118toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rectInvoke : rect;
                    }
                    rect = rectInvoke;
                }
                i--;
            } while (i >= 0);
        }
        return rect;
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m718computeDestinationO0kMr_c(Rect p0, long p1) {
        return p0.m4011translatek4lQ0M(Offset.m3983unaryMinusF1C5BW0(m721relocationOffsetBMxPBkI(p0, p1)));
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    static /* synthetic */ boolean m720isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m719isMaxVisibleO0kMr_c(rect, j);
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m719isMaxVisibleO0kMr_c(Rect rect, long j) {
        long jM721relocationOffsetBMxPBkI = m721relocationOffsetBMxPBkI(rect, j);
        return Math.abs(Offset.m3974getXimpl(jM721relocationOffsetBMxPBkI)) <= 0.5f && Math.abs(Offset.m3975getYimpl(jM721relocationOffsetBMxPBkI)) <= 0.5f;
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m721relocationOffsetBMxPBkI(Rect p0, long p1) {
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(p1);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return OffsetKt.Offset(0.0f, requireBringIntoViewSpec().calculateScrollDistance(p0.getTop(), p0.getBottom() - p0.getTop(), Size.m4040getHeightimpl(jM7118toSizeozmzZPI)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OffsetKt.Offset(requireBringIntoViewSpec().calculateScrollDistance(p0.getLeft(), p0.getRight() - p0.getLeft(), Size.m4043getWidthimpl(jM7118toSizeozmzZPI)), 0.0f);
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m716compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.compare(IntSize.m7105getHeightimpl(j), IntSize.m7105getHeightimpl(j2));
        }
        if (i == 2) {
            return Intrinsics.compare(IntSize.m7106getWidthimpl(j), IntSize.m7106getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m717compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Size.m4040getHeightimpl(j), Size.m4040getHeightimpl(j2));
        }
        if (i == 2) {
            return Float.compare(Size.m4043getWidthimpl(j), Size.m4043getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void update(Orientation p0, boolean p1, BringIntoViewSpec p2) {
        this.orientation = p0;
        this.reverseDirection = p1;
        this.bringIntoViewSpec = p2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "p0", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;)V", "", "toString", "()Ljava/lang/String;", "continuation", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "getContinuation", "()LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "currentBounds", "Lkotlin/jvm/functions/Function0;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request {
        public static final int $stable = 8;
        private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> continuation;
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> function0, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.currentBounds = function0;
            this.continuation = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> getContinuation() {
            return this.continuation;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        public final String toString() {
            String string;
            lambdaselectSampleRateOrNearestSupported0 lambdaselectsamplerateornearestsupported0 = (lambdaselectSampleRateOrNearestSupported0) this.continuation.get$context().get(lambdaselectSampleRateOrNearestSupported0.INSTANCE);
            String str = lambdaselectsamplerateornearestsupported0 != null ? lambdaselectsamplerateornearestsupported0.TuitionPaymentFragmentbindingInflater1 : null;
            StringBuilder sb = new StringBuilder("Request@");
            String string2 = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "");
            sb.append(string2);
            if (str != null) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(str);
                sb2.append("](");
                string = sb2.toString();
                if (string == null) {
                    string = "(";
                }
            } else {
                string = "(";
            }
            sb.append(string);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }
}
