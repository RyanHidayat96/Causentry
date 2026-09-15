package com.bpjstku.presentation.account;

import com.bpjstku.R;
import com.bpjstku.data.lib.exception.RefreshTokenExpiredException;
import com.bpjstku.data.lib.exception.UnauthorisedException;
import com.bpjstku.data.user.model.request.NotificationBadgeRequest;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.gson.JsonSyntaxException;
import com.nbs.nucleo.utils.exception.ApiException;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.registerlambda1;
import defpackage.setOnImageAvailableListener;
import java.io.IOException;
import java.net.SocketTimeoutException;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/bpjstku/util/utils/ViewModelExtKt$handleApiCall$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.account.AccountViewModel$notificationBadge$$inlined$handleApiCall$1", f = "AccountViewModel.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
public final class AccountViewModel$notificationBadge$$inlined$handleApiCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NotificationBadgeRequest $request$inlined;
    final /* synthetic */ lambdastop3androidxcameravideointernalencoderEncoderImpl $stateFlow;
    int label;
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$stateFlow.b(setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                AccountViewModel$notificationBadge$$inlined$handleApiCall$1 accountViewModel$notificationBadge$$inlined$handleApiCall$1 = this;
                registerlambda1 registerlambda1Var = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                NotificationBadgeRequest notificationBadgeRequest = this.$request$inlined;
                this.label = 1;
                obj = registerlambda1Var.TuitionPaymentFragmentbindingInflater1(notificationBadgeRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$stateFlow.b((setOnImageAvailableListener) obj);
        } catch (Exception e2) {
            Exception exc = e2;
            lambdastop3androidxcameravideointernalencoderEncoderImpl lambdastop3androidxcameravideointernalencoderencoderimpl = this.$stateFlow;
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(lambdastop3androidxcameravideointernalencoderencoderimpl, "");
            if (exc instanceof ApiException) {
                ApiException apiException = (ApiException) exc;
                String string = Intrinsics.areEqual(apiException.getApiError().getB(), "Invalid Response") ? ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_invalid_response) : apiException.getApiError().getB();
                Intrinsics.checkNotNull(string);
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string));
            } else if (exc instanceof SocketTimeoutException) {
                String string2 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_no_internet_socket);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string2));
            } else if (exc instanceof IOException) {
                String string3 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_no_internet_revamp);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string3));
            } else if (exc instanceof JsonSyntaxException) {
                String string4 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_error_occured_revamp);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string4));
            } else if (exc instanceof UnauthorisedException) {
                String string5 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_message_session_ends);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string5));
            } else if (exc instanceof RefreshTokenExpiredException) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), null, false, 6);
            } else {
                String string6 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_unable_to_connect_server);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(new setOnImageAvailableListener.b(string6));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountViewModel$notificationBadge$$inlined$handleApiCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountViewModel$notificationBadge$$inlined$handleApiCall$1(lambdastop3androidxcameravideointernalencoderEncoderImpl lambdastop3androidxcameravideointernalencoderencoderimpl, Continuation continuation, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, NotificationBadgeRequest notificationBadgeRequest) {
        super(2, continuation);
        this.$stateFlow = lambdastop3androidxcameravideointernalencoderencoderimpl;
        this.this$0 = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$request$inlined = notificationBadgeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountViewModel$notificationBadge$$inlined$handleApiCall$1(this.$stateFlow, continuation, this.this$0, this.$request$inlined);
    }
}
