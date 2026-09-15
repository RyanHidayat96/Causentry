package com.bpjstku.presentation.report;

import defpackage.getListenerExecutor;
import java.io.File;
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
@DebugMetadata(c = "com.bpjstku.presentation.report.ReportAccidentActivity$compressAndShowImage$1", f = "ReportAccidentActivity.kt", i = {}, l = {405}, m = "invokeSuspend", n = {}, s = {})
final class ReportAccidentActivity$compressAndShowImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ ReportAccidentActivity this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getListenerExecutor getlistenerexecutor = getListenerExecutor.INSTANCE;
            this.label = 1;
            obj = getListenerExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, new File(this.$it), null, null, this, 12);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        File file = (File) obj;
        ReportAccidentActivity.TuitionPaymentFragmentbindingInflater1(this.this$0, file);
        ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.this$0, file);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReportAccidentActivity$compressAndShowImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportAccidentActivity$compressAndShowImage$1(ReportAccidentActivity reportAccidentActivity, String str, Continuation<? super ReportAccidentActivity$compressAndShowImage$1> continuation) {
        super(2, continuation);
        this.this$0 = reportAccidentActivity;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReportAccidentActivity$compressAndShowImage$1(this.this$0, this.$it, continuation);
    }
}
