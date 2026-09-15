package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", i = {}, l = {1292}, m = "invokeSuspend", n = {}, s = {})
final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", i = {}, l = {1296, 1298}, m = "invokeSuspend", n = {}, s = {})
                static final class C00911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
                    
                        if (r4.this$0.state.animateToCurrent$material3_release(r4) == r0) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
                    
                        if (r4.this$0.state.settle(r4) == r0) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
                    
                        return r0;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                        /*
                            r4 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r4.label
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L1b
                            if (r1 == r3) goto L17
                            if (r1 != r2) goto Lf
                            goto L17
                        Lf:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L17:
                            kotlin.ResultKt.throwOnFailure(r5)
                            goto L85
                        L1b:
                            kotlin.ResultKt.throwOnFailure(r5)
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            androidx.compose.material3.TimePickerState r5 = androidx.compose.material3.ClockDialNode.access$getState$p(r5)
                            int r5 = r5.m2702getSelectionJiIwxys$material3_release()
                            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.INSTANCE
                            int r1 = r1.m2378getHourJiIwxys()
                            boolean r5 = androidx.compose.material3.Selection.m2374equalsimpl0(r5, r1)
                            if (r5 == 0) goto L5d
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            boolean r5 = androidx.compose.material3.ClockDialNode.access$getAutoSwitchToMinute$p(r5)
                            if (r5 == 0) goto L5d
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            androidx.compose.material3.TimePickerState r5 = androidx.compose.material3.ClockDialNode.access$getState$p(r5)
                            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.INSTANCE
                            int r1 = r1.m2379getMinuteJiIwxys()
                            r5.m2705setSelectioniHAOin8$material3_release(r1)
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            androidx.compose.material3.TimePickerState r5 = androidx.compose.material3.ClockDialNode.access$getState$p(r5)
                            r1 = r4
                            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                            r4.label = r3
                            java.lang.Object r5 = r5.animateToCurrent$material3_release(r1)
                            if (r5 != r0) goto L85
                            goto L84
                        L5d:
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            androidx.compose.material3.TimePickerState r5 = androidx.compose.material3.ClockDialNode.access$getState$p(r5)
                            int r5 = r5.m2702getSelectionJiIwxys$material3_release()
                            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.INSTANCE
                            int r1 = r1.m2379getMinuteJiIwxys()
                            boolean r5 = androidx.compose.material3.Selection.m2374equalsimpl0(r5, r1)
                            if (r5 == 0) goto L85
                            androidx.compose.material3.ClockDialNode r5 = r4.this$0
                            androidx.compose.material3.TimePickerState r5 = androidx.compose.material3.ClockDialNode.access$getState$p(r5)
                            r1 = r4
                            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                            r4.label = r2
                            java.lang.Object r5 = r5.settle(r1)
                            if (r5 != r0) goto L85
                        L84:
                            return r0
                        L85:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.AnonymousClass1.C00911.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00911(ClockDialNode clockDialNode, Continuation<? super C00911> continuation) {
                        super(2, continuation);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00911(this.this$0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    b.TuitionPaymentFragmentbindingInflater1(clockDialNode.getCoroutineScope(), null, null, new C00911(clockDialNode, null), 3, null);
                }

                {
                    super(0);
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, function0, null, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m1877invokeUv8p0NA(pointerInputChange, offset.m3984unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1305}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.offsetX += Offset.m3974getXimpl(this.$dragAmount);
                            this.this$0.offsetY += Offset.m3975getYimpl(this.$dragAmount);
                            this.label = 1;
                            if (TimePickerState.update$material3_release$default(this.this$0.state, TimePickerKt.atan(this.this$0.offsetY - IntOffset.m7064getYimpl(this.this$0.state.m2701getCenternOccac$material3_release()), this.this$0.offsetX - IntOffset.m7063getXimpl(this.this$0.state.m2701getCenternOccac$material3_release())), false, this, 2, null) == coroutine_suspended) {
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
                    AnonymousClass1(ClockDialNode clockDialNode, long j, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m1877invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                    b.TuitionPaymentFragmentbindingInflater1(clockDialNode2.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode2, j, null), 3, null);
                    clockDialNode2.state.moveSelector$material3_release(clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.getMaxDist());
                }

                {
                    super(2);
                }
            }, this, 5, null) == coroutine_suspended) {
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
    ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, Continuation<? super ClockDialNode$pointerInputDragNode$1> continuation) {
        super(2, continuation);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, continuation);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
