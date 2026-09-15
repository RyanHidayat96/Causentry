package com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck;

import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.isModeInList;
import defpackage.setButtonPanelLayoutHint;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity$initProcess$1", f = "OldDaySecurityBalanceCheckActivity.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
final class OldDaySecurityBalanceCheckActivity$initProcess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OldDaySecurityBalanceCheckActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object[] objArr = {this.this$0};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ((isModeInList) OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1400691460, objArr, -1400691458, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OldDaySecurityBalanceCheckActivity$initProcess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OldDaySecurityBalanceCheckActivity$initProcess$1(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity, Continuation<? super OldDaySecurityBalanceCheckActivity$initProcess$1> continuation) {
        super(2, continuation);
        this.this$0 = oldDaySecurityBalanceCheckActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OldDaySecurityBalanceCheckActivity$initProcess$1(this.this$0, continuation);
    }
}
