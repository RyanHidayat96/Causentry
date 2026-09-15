package com.bpjstku.presentation.account.setting;

import com.bpjstku.presentation.account.model.ItemAutodebitParticipant;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.getEntries;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.account.setting.NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1", f = "NonactiveAutodebitBottomSheetDialogFragment.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ItemAutodebitParticipant $data;
    int label;
    final /* synthetic */ getEntries this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Function1 function1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getEntries.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0);
        if (function1TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            function1TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(this.$data);
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1(getEntries getentries, ItemAutodebitParticipant itemAutodebitParticipant, Continuation<? super NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = getentries;
        this.$data = itemAutodebitParticipant;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1(this.this$0, this.$data, continuation);
    }
}
