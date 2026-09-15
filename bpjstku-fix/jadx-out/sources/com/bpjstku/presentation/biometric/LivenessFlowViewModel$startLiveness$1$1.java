package com.bpjstku.presentation.biometric;

import defpackage.Encoder;
import defpackage.TwilightManager;
import defpackage.populateOptionsMenu;
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
@DebugMetadata(c = "com.bpjstku.presentation.biometric.LivenessFlowViewModel$startLiveness$1$1", f = "LivenessFlowViewModel.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class LivenessFlowViewModel$startLiveness$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TwilightManager $result;
    int label;
    final /* synthetic */ populateOptionsMenu this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Encoder encoder = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TwilightManager twilightManager = this.$result;
            Intrinsics.checkNotNull(twilightManager);
            this.label = 1;
            if (encoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(twilightManager, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivenessFlowViewModel$startLiveness$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessFlowViewModel$startLiveness$1$1(populateOptionsMenu populateoptionsmenu, TwilightManager twilightManager, Continuation<? super LivenessFlowViewModel$startLiveness$1$1> continuation) {
        super(2, continuation);
        this.this$0 = populateoptionsmenu;
        this.$result = twilightManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivenessFlowViewModel$startLiveness$1$1(this.this$0, this.$result, continuation);
    }
}
