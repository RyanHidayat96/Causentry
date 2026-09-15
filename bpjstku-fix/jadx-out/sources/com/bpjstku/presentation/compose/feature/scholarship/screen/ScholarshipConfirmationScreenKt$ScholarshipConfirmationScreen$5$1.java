package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.bpjstku.domain.user.model.User;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
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
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1", f = "ScholarshipConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ MutableState<User> $user$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.$accountViewModel;
        User value = this.$user$delegate.getValue();
        String str = value != null ? value.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        User value2 = this.$user$delegate.getValue();
        String str2 = value2 != null ? value2.TuitionPaymentFragmentbindingInflater1 : null;
        activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2 != null ? str2 : "");
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, MutableState<User> mutableState, Continuation<? super ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1> continuation) {
        super(2, continuation);
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$user$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(this.$accountViewModel, this.$user$delegate, continuation);
    }

    public static int b() {
        int i = b;
        int i2 = i % 9760008;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }
}
