package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", i = {}, l = {689, 691}, m = "invokeSuspend", n = {}, s = {})
final class TimePickerState$update$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromTap;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r7.this$0.getCurrentAngle$material3_release().snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7.this$0.getMinuteAngle$material3_release()), r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r7.this$0.getCurrentAngle$material3_release().snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7.this$0.offsetHour(r7.$value)), r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            goto Laf
        L1c:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            int r8 = r8.m2702getSelectionJiIwxys$material3_release()
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.INSTANCE
            int r1 = r1.m2378getHourJiIwxys()
            boolean r8 = androidx.compose.material3.Selection.m2374equalsimpl0(r8, r1)
            if (r8 == 0) goto L44
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            float r1 = r7.$value
            int r1 = androidx.compose.material3.TimePickerState.access$toHour(r8, r1)
            int r1 = r1 % 12
            float r1 = (float) r1
            r4 = 1057360530(0x3f060a92, float:0.5235988)
            float r1 = r1 * r4
            r8.setHourAngle$material3_release(r1)
            goto L71
        L44:
            boolean r8 = r7.$fromTap
            r1 = 1037465424(0x3dd67750, float:0.10471976)
            if (r8 == 0) goto L64
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            float r4 = r7.$value
            int r4 = androidx.compose.material3.TimePickerState.access$toMinute(r8, r4)
            androidx.compose.material3.TimePickerState r5 = r7.this$0
            float r6 = r7.$value
            int r5 = androidx.compose.material3.TimePickerState.access$toMinute(r5, r6)
            int r5 = r5 % 5
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 * r1
            r8.setMinuteAngle$material3_release(r4)
            goto L71
        L64:
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            float r4 = r7.$value
            int r4 = androidx.compose.material3.TimePickerState.access$toMinute(r8, r4)
            float r4 = (float) r4
            float r4 = r4 * r1
            r8.setMinuteAngle$material3_release(r4)
        L71:
            boolean r8 = r7.$fromTap
            if (r8 == 0) goto L91
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            androidx.compose.animation.core.Animatable r8 = r8.getCurrentAngle$material3_release()
            androidx.compose.material3.TimePickerState r1 = r7.this$0
            float r1 = r1.getMinuteAngle$material3_release()
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r2 = r7
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r7.label = r3
            java.lang.Object r8 = r8.snapTo(r1, r2)
            if (r8 != r0) goto Laf
            goto Lae
        L91:
            androidx.compose.material3.TimePickerState r8 = r7.this$0
            androidx.compose.animation.core.Animatable r8 = r8.getCurrentAngle$material3_release()
            androidx.compose.material3.TimePickerState r1 = r7.this$0
            float r3 = r7.$value
            float r1 = androidx.compose.material3.TimePickerState.access$offsetHour(r1, r3)
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r3 = r7
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r7.label = r2
            java.lang.Object r8 = r8.snapTo(r1, r3)
            if (r8 != r0) goto Laf
        Lae:
            return r0
        Laf:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState$update$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerState$update$2(TimePickerState timePickerState, float f, boolean z, Continuation<? super TimePickerState$update$2> continuation) {
        super(1, continuation);
        this.this$0 = timePickerState;
        this.$value = f;
        this.$fromTap = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TimePickerState$update$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
