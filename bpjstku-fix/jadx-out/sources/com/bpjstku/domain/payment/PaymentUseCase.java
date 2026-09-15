package com.bpjstku.domain.payment;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.AuthOtpBriDirectDebitRequest;
import com.bpjstku.data.payment.model.request.CheckOneTimePaymentStatusRequest;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.request.CreateCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.CreateOneTimePaymentRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodGeneralRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.EditCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.ForceExpirePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest;
import com.bpjstku.data.payment.model.request.InsertVasTxPaymentRequest;
import com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest;
import com.bpjstku.data.payment.model.request.SubmitAutodebitBniAutopayRequest;
import com.bpjstku.data.payment.model.request.SubmitNonactiveAutodebitBniRequest;
import com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest;
import com.bpjstku.data.payment.model.response.AuthOtpBriDirectDebitResponse;
import com.bpjstku.data.payment.model.response.CheckOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CreatePaymentMethodGeneralResponse;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.CustomerObjectUpdated;
import com.bpjstku.data.payment.model.response.ForceExpirePaymentMethodResponse;
import com.bpjstku.data.payment.model.response.GetListKodenonaktifAutodebitResponse;
import com.bpjstku.data.payment.model.response.GetListSertakanAutodebetResponse;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.payment.model.response.PaymentMethodResult;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import com.bpjstku.data.payment.model.response.SubmitNonactiveAutodebetBniResponse;
import defpackage.deriveCodec;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\r\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001b\u0010\u001fJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0!0\u00042\u0006\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b\r\u0010&J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0003\u001a\u00020'H'¢\u0006\u0004\b\"\u0010)J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020+0\u00042\u0006\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b\r\u0010,J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b\"\u0010/J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b\u0017\u00102J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002040\u00042\u0006\u0010\u0003\u001a\u000203H'¢\u0006\u0004\b\u0007\u00105J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u000206H'¢\u0006\u0004\b\"\u00107J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u0002080\u0004H'¢\u0006\u0004\b\"\u00109J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0001\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00042\b\b\u0001\u0010\u0003\u001a\u00020AH'¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\bE\u0010@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/domain/payment/PaymentUseCase;", "", "Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "(Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "b", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "Lcom/bpjstku/data/payment/model/response/RecurringPlanResponse;", "(Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "(Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;", "Lcom/bpjstku/data/payment/model/response/CheckOneTimePaymentResponse;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "Lcom/bpjstku/data/payment/model/response/AuthOtpBriDirectDebitResponse;", "(Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/ForceExpirePaymentMethodResponse;", "(Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectUpdated;", "(Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "(Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/payment/model/response/GetListSertakanAutodebetResponse;", "(Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "(Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/GetListKodenonaktifAutodebitResponse;", "()LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "insertProfilAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "verifyOtpInsertAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitNonactiveAutodebetBniResponse;", "submitNonaktifAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;)LderiveCodec;", "verifyOtpNonactiveAutodebetBni"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PaymentUseCase {
    deriveCodec<CheckOneTimePaymentResponse> TuitionPaymentFragmentbindingInflater1(CheckOneTimePaymentStatusRequest p0);

    deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(InsertVasTxPaymentRequest p0);

    deriveCodec<GetStatusRecurringPlanResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CheckRecurringStatusRequest p0);

    deriveCodec<PaymentMethodResult> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreatePaymentMethodGeneralRequest p0);

    deriveCodec<CustomerObjectItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CreateCustomerObjectRequest p0);

    deriveCodec<List<CustomerObjectItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetCustomerObjectRequest p0);

    deriveCodec<GetListSertakanAutodebetResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetListSertakanAutodebetRequest p0);

    deriveCodec<GetListKodenonaktifAutodebitResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    deriveCodec<AuthOtpBriDirectDebitResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AuthOtpBriDirectDebitRequest p0);

    deriveCodec<CustomerObjectUpdated> TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditCustomerObjectRequest p0);

    deriveCodec<List<PaymentMethodItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetListPaymentMethodRequest p0);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonactiveAutodebetRequest p0);

    deriveCodec<CreateOneTimePaymentResponse> b(CreateOneTimePaymentRequest p0);

    deriveCodec<PaymentMethodItem> b(CreatePaymentMethodRequest p0);

    deriveCodec<CreatePaymentMethodGeneralResponse> b(CreatePaymentMethodWithDebitCard p0);

    deriveCodec<RecurringPlanResponse> b(CreateRecurringPlanRequest p0);

    deriveCodec<ForceExpirePaymentMethodResponse> b(ForceExpirePaymentMethodRequest p0);

    deriveCodec<SubmitAutodebitBniAutopayResponse> insertProfilAutodebetBni(@Body SubmitAutodebitBniAutopayRequest p0);

    deriveCodec<SubmitNonactiveAutodebetBniResponse> submitNonaktifAutodebetBni(@Body SubmitNonactiveAutodebitBniRequest p0);

    deriveCodec<BaseItem> verifyOtpInsertAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);

    deriveCodec<BaseItem> verifyOtpNonactiveAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);
}
