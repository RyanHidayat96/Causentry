package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import com.bpjstku.domain.jp.model.JpDataTk;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.stopRepeating;
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
@DebugMetadata(c = "com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity$getInformation$1", f = "JpnPeriodicInformationVerifiedActivity.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
final class JpnPeriodicInformationVerifiedActivity$getInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ JpnPeriodicInformationVerifiedActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        stopRepeating stoprepeatingA = JpnPeriodicInformationVerifiedActivity.a(this.this$0);
        JpDataTk jpDataTkTuitionPaymentFragmentbindingInflater1 = JpnPeriodicInformationVerifiedActivity.TuitionPaymentFragmentbindingInflater1(this.this$0);
        stoprepeatingA.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(jpDataTkTuitionPaymentFragmentbindingInflater1 != null ? jpDataTkTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JpnPeriodicInformationVerifiedActivity$getInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JpnPeriodicInformationVerifiedActivity$getInformation$1(JpnPeriodicInformationVerifiedActivity jpnPeriodicInformationVerifiedActivity, Continuation<? super JpnPeriodicInformationVerifiedActivity$getInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = jpnPeriodicInformationVerifiedActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JpnPeriodicInformationVerifiedActivity$getInformation$1(this.this$0, continuation);
    }
}
