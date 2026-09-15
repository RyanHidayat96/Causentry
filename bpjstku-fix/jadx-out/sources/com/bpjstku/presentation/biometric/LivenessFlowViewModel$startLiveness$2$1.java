package com.bpjstku.presentation.biometric;

import defpackage.Encoder;
import defpackage.getContentPaddingRight;
import defpackage.populateOptionsMenu;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.biometric.LivenessFlowViewModel$startLiveness$2$1", f = "LivenessFlowViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
public final class LivenessFlowViewModel$startLiveness$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ populateOptionsMenu this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.b.isDisposed()) {
                Encoder encoder = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Throwable th = this.$throwable;
                Intrinsics.checkNotNull(th);
                this.label = 1;
                if (encoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(this.$throwable);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivenessFlowViewModel$startLiveness$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessFlowViewModel$startLiveness$2$1(populateOptionsMenu populateoptionsmenu, Throwable th, Continuation<? super LivenessFlowViewModel$startLiveness$2$1> continuation) {
        super(2, continuation);
        this.this$0 = populateoptionsmenu;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivenessFlowViewModel$startLiveness$2$1(this.this$0, this.$throwable, continuation);
    }
}
