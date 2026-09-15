package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\bH\u0082@¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0011\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0014\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0017\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001a$\u0010\u001b\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001a\u001a$\u0010\u001c\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001c\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\u0012*\u00020\u00122\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u001dH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0002X\u0083T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0018\u0010#\u001a\u00020\u0005*\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "p0", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "p1", "p2", "", "distanceIsTolerable", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "", "mouseSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionBtf2", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextDragObserver;", "selectionGestureInput", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "selectionGesturePointerInputBtf2", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelectionFirstPress", "touchSelectionSubsequentPress", "Lkotlin/Function1;", "updateSelectionTouchMode", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "STATIC_KEY", "I", "isPrecisePointer", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1}, l = {158, 181}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C04101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04101(Continuation<? super C04101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1}, l = {351, 377}, m = "mouseSelectionBtf2", n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C04111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04111(Continuation<? super C04111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {124, 128}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C04131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04131(Continuation<? super C04131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {238, 241}, m = "touchSelectionFirstPress", n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C04151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04151(Continuation<? super C04151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {276, 315}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    static final class C04161 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C04161(Continuation<? super C04161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class C04171 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {93}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        static final class C00731 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: Code duplicated, block: B:11:0x0032 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0032
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r5)
                    goto L33
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    kotlin.ResultKt.throwOnFailure(r5)
                    java.lang.Object r5 = r4.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                    r1 = r5
                L23:
                    androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r3 = r4
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    r4.L$0 = r1
                    r4.label = r2
                    java.lang.Object r5 = r1.awaitPointerEvent(r5, r3)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.$updateTouchMode
                    boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C04171.C00731.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00731(Function1<? super Boolean, Unit> function1, Continuation<? super C00731> continuation) {
                super(2, continuation);
                this.$updateTouchMode = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00731 c00731 = new C00731(this.$updateTouchMode, continuation);
                c00731.L$0 = obj;
                return c00731;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00731) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((PointerInputScope) this.L$0).awaitPointerEventScope(new C00731(this.$updateTouchMode, null), this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        C04171(Function1<? super Boolean, Unit> function1, Continuation<? super C04171> continuation) {
            super(2, continuation);
            this.$updateTouchMode = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04171 c04171 = new C04171(this.$updateTouchMode, continuation);
            c04171.L$0 = obj;
            return c04171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C04171) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Modifier updateSelectionTouchMode(Modifier modifier, Function1<? super Boolean, Unit> function1) {
        return modifier.then(new SuspendPointerInputElement(Integer.valueOf(STATIC_KEY), null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new C04171(function1, null)), 6, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class C04121 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                ClicksCounter clicksCounter = new ClicksCounter(pointerInputScope.getViewConfiguration());
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, new C00721(this.$mouseSelectionObserver, clicksCounter, this.$textDragObserver, null), this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {105, 111, 113}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class C00721 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ClicksCounter $clicksCounter;
            final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
            final /* synthetic */ TextDragObserver $textDragObserver;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
            
                if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r1, r9.$mouseSelectionObserver, r9.$clicksCounter, r10, r9) == r0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
            
                if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(r1, r9.$textDragObserver, r10, r9) == r0) goto L33;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L91
                L1f:
                    java.lang.Object r1 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L3c
                L27:
                    kotlin.ResultKt.throwOnFailure(r10)
                    java.lang.Object r10 = r9.L$0
                    r1 = r10
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    r10 = r9
                    kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                    r9.L$0 = r1
                    r9.label = r4
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r10)
                    if (r10 == r0) goto L94
                L3c:
                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                    boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                    r5 = 0
                    if (r4 == 0) goto L7b
                    int r4 = r10.getButtons()
                    boolean r4 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m5482isPrimaryPressedaHzCxE(r4)
                    if (r4 == 0) goto L7b
                    java.util.List r4 = r10.getChanges()
                    int r6 = r4.size()
                    r7 = 0
                L58:
                    if (r7 >= r6) goto L69
                    java.lang.Object r8 = r4.get(r7)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    boolean r8 = r8.isConsumed()
                    if (r8 != 0) goto L7b
                    int r7 = r7 + 1
                    goto L58
                L69:
                    androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                    androidx.compose.foundation.text.selection.ClicksCounter r4 = r9.$clicksCounter
                    r6 = r9
                    kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                    r9.L$0 = r5
                    r9.label = r3
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r1, r2, r4, r10, r6)
                    if (r10 != r0) goto L91
                    goto L94
                L7b:
                    boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                    if (r3 != 0) goto L91
                    androidx.compose.foundation.text.TextDragObserver r3 = r9.$textDragObserver
                    r4 = r9
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    r9.L$0 = r5
                    r9.label = r2
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r1, r3, r10, r4)
                    if (r10 != r0) goto L91
                    goto L94
                L91:
                    kotlin.Unit r10 = kotlin.Unit.INSTANCE
                    return r10
                L94:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C04121.C00721.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00721(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, Continuation<? super C00721> continuation) {
                super(2, continuation);
                this.$mouseSelectionObserver = mouseSelectionObserver;
                this.$clicksCounter = clicksCounter;
                this.$textDragObserver = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00721 c00721 = new C00721(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, continuation);
                c00721.L$0 = obj;
                return c00721;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00721) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04121(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super C04121> continuation) {
            super(2, continuation);
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04121 c04121 = new C04121(this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            c04121.L$0 = obj;
            return c04121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C04121) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Modifier selectionGestureInput(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return modifier.then(new SuspendPointerInputElement(mouseSelectionObserver, textDragObserver, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new C04121(mouseSelectionObserver, textDragObserver, null)), 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[Catch: CancellationException -> 0x00d4, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object touchSelection(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        C04131 c04131;
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes;
        int size;
        int i;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof C04131) {
            c04131 = (C04131) continuation;
            if ((c04131.label & Integer.MIN_VALUE) != 0) {
                c04131.label -= Integer.MIN_VALUE;
            } else {
                c04131 = new C04131(continuation);
            }
        } else {
            c04131 = new C04131(continuation);
        }
        Object objM735awaitLongPressOrCancellationrnUCldI = c04131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04131.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                long id2 = pointerInputChange.getId();
                c04131.L$0 = awaitPointerEventScope;
                c04131.L$1 = textDragObserver;
                c04131.L$2 = pointerInputChange;
                c04131.label = 1;
                objM735awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m735awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, c04131);
                if (objM735awaitLongPressOrCancellationrnUCldI != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                PointerInputChange pointerInputChange3 = (PointerInputChange) c04131.L$2;
                textDragObserver = (TextDragObserver) c04131.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) c04131.L$0;
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = pointerInputChange3;
                awaitPointerEventScope = awaitPointerEventScope2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) c04131.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) c04131.L$0;
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
            }
            if (((Boolean) objM735awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                size = changes.size();
                for (i = 0; i < size; i++) {
                    pointerInputChange2 = changes.get(i);
                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                        pointerInputChange2.consume();
                    }
                }
                textDragObserver.onStop();
            } else {
                textDragObserver.onCancel();
            }
            return Unit.INSTANCE;
            PointerInputChange pointerInputChange4 = (PointerInputChange) objM735awaitLongPressOrCancellationrnUCldI;
            if (pointerInputChange4 != null && distanceIsTolerable(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange4)) {
                textDragObserver.mo1381onStartk4lQ0M(pointerInputChange4.getPosition());
                long id3 = pointerInputChange4.getId();
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection.2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange5) {
                        textDragObserver.mo1380onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }

                    {
                        super(1);
                    }
                };
                c04131.L$0 = awaitPointerEventScope;
                c04131.L$1 = textDragObserver;
                c04131.L$2 = null;
                c04131.label = 2;
                objM735awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m743dragjO51t88(awaitPointerEventScope, id3, function1, c04131);
                if (objM735awaitLongPressOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objM735awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                    changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    size = changes.size();
                    while (i < size) {
                        pointerInputChange2 = changes.get(i);
                        if (PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                    }
                    textDragObserver.onStop();
                } else {
                    textDragObserver.onCancel();
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e2) {
            textDragObserver.onCancel();
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, final androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {209, 217, 220, 221}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(r1, r12.$mouseSelectionObserver, r12.$clicksCounter, r13, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r1, r12.$textDragObserver, r13, r12) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(r1, r12.$textDragObserver, r13, r12) == r0) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.ResultKt.throwOnFailure(r13)
                goto Lad
            L22:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L3f
            L2a:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r13 = r12
                kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
                r12.L$0 = r1
                r12.label = r5
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r13)
                if (r13 == r0) goto Lb0
            L3f:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.$clicksCounter
                r6.update(r13)
                boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
                r7 = 0
                if (r6 == 0) goto L83
                int r8 = r13.getButtons()
                boolean r8 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m5482isPrimaryPressedaHzCxE(r8)
                if (r8 == 0) goto L83
                java.util.List r8 = r13.getChanges()
                int r9 = r8.size()
                r10 = 0
            L60:
                if (r10 >= r9) goto L71
                java.lang.Object r11 = r8.get(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.isConsumed()
                if (r11 != 0) goto L83
                int r10 = r10 + 1
                goto L60
            L71:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
                androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.$clicksCounter
                r5 = r12
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r12.L$0 = r7
                r12.label = r4
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r1, r2, r3, r13, r5)
                if (r13 != r0) goto Lad
                goto Lb0
            L83:
                if (r6 != 0) goto Lad
                androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.$clicksCounter
                int r4 = r4.getClicks()
                if (r4 != r5) goto L9d
                androidx.compose.foundation.text.TextDragObserver r2 = r12.$textDragObserver
                r4 = r12
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r12.L$0 = r7
                r12.label = r3
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r1, r2, r13, r4)
                if (r13 != r0) goto Lad
                goto Lb0
            L9d:
                androidx.compose.foundation.text.TextDragObserver r3 = r12.$textDragObserver
                r4 = r12
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r12.L$0 = r7
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r1, r3, r13, r4)
                if (r13 != r0) goto Lad
                goto Lb0
            Lad:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            Lb0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$clicksCounter = clicksCounter;
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[Catch: CancellationException -> 0x00d4, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[Catch: CancellationException -> 0x00d4, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d4, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a8, B:34:0x00b7, B:36:0x00c3, B:37:0x00c6, B:38:0x00c9, B:39:0x00cd, B:18:0x004a, B:23:0x0070, B:25:0x0074, B:27:0x007e, B:21:0x0054), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object touchSelectionFirstPress(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        C04151 c04151;
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes;
        int size;
        int i;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof C04151) {
            c04151 = (C04151) continuation;
            if ((c04151.label & Integer.MIN_VALUE) != 0) {
                c04151.label -= Integer.MIN_VALUE;
            } else {
                c04151 = new C04151(continuation);
            }
        } else {
            c04151 = new C04151(continuation);
        }
        Object objM735awaitLongPressOrCancellationrnUCldI = c04151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04151.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                long id2 = pointerInputChange.getId();
                c04151.L$0 = awaitPointerEventScope;
                c04151.L$1 = textDragObserver;
                c04151.L$2 = pointerInputChange;
                c04151.label = 1;
                objM735awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m735awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, c04151);
                if (objM735awaitLongPressOrCancellationrnUCldI != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                PointerInputChange pointerInputChange3 = (PointerInputChange) c04151.L$2;
                textDragObserver = (TextDragObserver) c04151.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) c04151.L$0;
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
                pointerInputChange = pointerInputChange3;
                awaitPointerEventScope = awaitPointerEventScope2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) c04151.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) c04151.L$0;
                ResultKt.throwOnFailure(objM735awaitLongPressOrCancellationrnUCldI);
            }
            if (((Boolean) objM735awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                size = changes.size();
                for (i = 0; i < size; i++) {
                    pointerInputChange2 = changes.get(i);
                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                        pointerInputChange2.consume();
                    }
                }
                textDragObserver.onStop();
            } else {
                textDragObserver.onCancel();
            }
            return Unit.INSTANCE;
            PointerInputChange pointerInputChange4 = (PointerInputChange) objM735awaitLongPressOrCancellationrnUCldI;
            if (pointerInputChange4 != null && distanceIsTolerable(awaitPointerEventScope.getViewConfiguration(), pointerInputChange, pointerInputChange4)) {
                textDragObserver.mo1381onStartk4lQ0M(pointerInputChange4.getPosition());
                long id3 = pointerInputChange4.getId();
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange5) {
                        textDragObserver.mo1380onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }

                    {
                        super(1);
                    }
                };
                c04151.L$0 = awaitPointerEventScope;
                c04151.L$1 = textDragObserver;
                c04151.L$2 = null;
                c04151.label = 2;
                objM735awaitLongPressOrCancellationrnUCldI = DragGestureDetectorKt.m743dragjO51t88(awaitPointerEventScope, id3, function1, c04151);
                if (objM735awaitLongPressOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objM735awaitLongPressOrCancellationrnUCldI).booleanValue()) {
                    changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    size = changes.size();
                    while (i < size) {
                        pointerInputChange2 = changes.get(i);
                        if (PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                    }
                    textDragObserver.onStop();
                } else {
                    textDragObserver.onCancel();
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e2) {
            textDragObserver.onCancel();
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: CancellationException -> 0x0113, TryCatch #1 {CancellationException -> 0x0113, blocks: (B:13:0x0033, B:42:0x00df, B:44:0x00e7, B:46:0x00f6, B:48:0x0102, B:49:0x0105, B:50:0x0108, B:51:0x010c, B:25:0x00a0, B:27:0x00a4, B:28:0x00a6, B:30:0x00aa, B:32:0x00ad, B:34:0x00b8, B:36:0x00be, B:38:0x00c2, B:39:0x00c7, B:23:0x0063), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6 A[Catch: CancellationException -> 0x0113, TryCatch #1 {CancellationException -> 0x0113, blocks: (B:13:0x0033, B:42:0x00df, B:44:0x00e7, B:46:0x00f6, B:48:0x0102, B:49:0x0105, B:50:0x0108, B:51:0x010c, B:25:0x00a0, B:27:0x00a4, B:28:0x00a6, B:30:0x00aa, B:32:0x00ad, B:34:0x00b8, B:36:0x00be, B:38:0x00c2, B:39:0x00c7, B:23:0x0063), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[Catch: CancellationException -> 0x0113, TryCatch #1 {CancellationException -> 0x0113, blocks: (B:13:0x0033, B:42:0x00df, B:44:0x00e7, B:46:0x00f6, B:48:0x0102, B:49:0x0105, B:50:0x0108, B:51:0x010c, B:25:0x00a0, B:27:0x00a4, B:28:0x00a6, B:30:0x00aa, B:32:0x00ad, B:34:0x00b8, B:36:0x00be, B:38:0x00c2, B:39:0x00c7, B:23:0x0063), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010c A[Catch: CancellationException -> 0x0113, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0113, blocks: (B:13:0x0033, B:42:0x00df, B:44:0x00e7, B:46:0x00f6, B:48:0x0102, B:49:0x0105, B:50:0x0108, B:51:0x010c, B:25:0x00a0, B:27:0x00a4, B:28:0x00a6, B:30:0x00aa, B:32:0x00ad, B:34:0x00b8, B:36:0x00be, B:38:0x00c2, B:39:0x00c7, B:23:0x0063), top: B:61:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object touchSelectionSubsequentPress(AwaitPointerEventScope awaitPointerEventScope, final TextDragObserver textDragObserver, PointerEvent pointerEvent, Continuation<? super Unit> continuation) {
        C04161 c04161;
        TextDragObserver textDragObserver2;
        PointerInputChange pointerInputChange;
        long id2;
        Ref.LongRef longRef;
        Object objWithTimeoutOrNull;
        List<PointerInputChange> changes;
        int size;
        int i;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof C04161) {
            c04161 = (C04161) continuation;
            if ((c04161.label & Integer.MIN_VALUE) != 0) {
                c04161.label -= Integer.MIN_VALUE;
            } else {
                c04161 = new C04161(continuation);
            }
        } else {
            c04161 = new C04161(continuation);
        }
        Object objM743dragjO51t88 = c04161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04161.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM743dragjO51t88);
                pointerInputChange = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                id2 = pointerInputChange.getId();
                longRef = new Ref.LongRef();
                longRef.element = Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
                long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(id2, longRef, null);
                c04161.L$0 = awaitPointerEventScope;
                c04161.L$1 = textDragObserver;
                c04161.L$2 = pointerInputChange;
                c04161.L$3 = longRef;
                c04161.J$0 = id2;
                c04161.label = 1;
                objWithTimeoutOrNull = awaitPointerEventScope.withTimeoutOrNull(longPressTimeoutMillis, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, c04161);
                if (objWithTimeoutOrNull != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                long j = c04161.J$0;
                Ref.LongRef longRef2 = (Ref.LongRef) c04161.L$3;
                pointerInputChange = (PointerInputChange) c04161.L$2;
                textDragObserver2 = (TextDragObserver) c04161.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) c04161.L$0;
                try {
                    ResultKt.throwOnFailure(objM743dragjO51t88);
                    longRef = longRef2;
                    objWithTimeoutOrNull = objM743dragjO51t88;
                    id2 = j;
                    textDragObserver = textDragObserver2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                } catch (CancellationException e2) {
                    e = e2;
                    textDragObserver2.onCancel();
                    throw e;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textDragObserver = (TextDragObserver) c04161.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) c04161.L$0;
                ResultKt.throwOnFailure(objM743dragjO51t88);
            }
            if (((Boolean) objM743dragjO51t88).booleanValue()) {
                changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                size = changes.size();
                for (i = 0; i < size; i++) {
                    pointerInputChange2 = changes.get(i);
                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                        pointerInputChange2.consume();
                    }
                }
                textDragObserver.onStop();
            } else {
                textDragObserver.onCancel();
            }
            return Unit.INSTANCE;
            DownResolution downResolution = (DownResolution) objWithTimeoutOrNull;
            if (downResolution == null) {
                downResolution = DownResolution.Timeout;
            }
            if (downResolution == DownResolution.Cancel) {
                return Unit.INSTANCE;
            }
            textDragObserver.mo1381onStartk4lQ0M(pointerInputChange.getPosition());
            if (downResolution == DownResolution.Up) {
                textDragObserver.onStop();
                return Unit.INSTANCE;
            }
            if (downResolution == DownResolution.Drag) {
                textDragObserver.mo1380onDragk4lQ0M(longRef.element);
            }
            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                    invoke2(pointerInputChange3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PointerInputChange pointerInputChange3) {
                    textDragObserver.mo1380onDragk4lQ0M(PointerEventKt.positionChange(pointerInputChange3));
                    pointerInputChange3.consume();
                }

                {
                    super(1);
                }
            };
            c04161.L$0 = awaitPointerEventScope;
            c04161.L$1 = textDragObserver;
            c04161.L$2 = null;
            c04161.L$3 = null;
            c04161.label = 2;
            objM743dragjO51t88 = DragGestureDetectorKt.m743dragjO51t88(awaitPointerEventScope, id2, function1, c04161);
            if (objM743dragjO51t88 == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objM743dragjO51t88).booleanValue()) {
                changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                size = changes.size();
                while (i < size) {
                    pointerInputChange2 = changes.get(i);
                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                        pointerInputChange2.consume();
                    }
                }
                textDragObserver.onStop();
            } else {
                textDragObserver.onCancel();
            }
            return Unit.INSTANCE;
        } catch (CancellationException e3) {
            e = e3;
            textDragObserver2 = textDragObserver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        if (r11 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, final androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f A[LOOP:0: B:19:0x0051->B:22:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 + r2
            r0.label = r8
            goto L19
        L14:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L46
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
        L39:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L51:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 == 0) goto L39
            int r5 = r5 + 1
            goto L51
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m3972getDistanceimpl(Offset.m3978minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.m746pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m5580equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m5585getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
