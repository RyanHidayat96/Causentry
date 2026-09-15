package com.bpjstku.data.payment;

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
import com.bpjstku.data.payment.model.request.FlaggingRecurringRequest;
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
import com.bpjstku.data.payment.model.response.CustomerObjectResponse;
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
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b8\u00107J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u000209H'¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020=H'¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\b\b\u0001\u0010\u0003\u001a\u00020@H'¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020DH'¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0004H'¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00042\b\b\u0001\u0010\u0003\u001a\u00020JH'¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020NH'¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00042\b\b\u0001\u0010\u0003\u001a\u00020QH'¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u00020NH'¢\u0006\u0004\bU\u0010Pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/payment/PaymentRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectResponse;", "getCustomerObject", "(Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "createCustomerObject", "(Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "createEwalletPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "Lcom/bpjstku/data/payment/model/response/RecurringPlanResponse;", "createRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "createOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;", "Lcom/bpjstku/data/payment/model/response/CheckOneTimePaymentResponse;", "checkOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "checkStatusRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "createMandiriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;", "", "getListPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "createBriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "Lcom/bpjstku/data/payment/model/response/AuthOtpBriDirectDebitResponse;", "authOtpBriRecurring", "(Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/ForceExpirePaymentMethodResponse;", "forceExpirePaymentMethod", "(Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectUpdated;", "editCustomerObject", "(Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;)LderiveCodec;", "modifyCustomerObject", "Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertVasTxPayment", "(Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "flaggingRecurring", "(Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/payment/model/response/GetListSertakanAutodebetResponse;", "getListSertakanAutodebet", "(Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "nonactiveAutodebit", "(Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/GetListKodenonaktifAutodebitResponse;", "kodeNonactiveAutodebit", "()LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "insertProfilAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "verifyOtpInsertAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitNonactiveAutodebetBniResponse;", "submitNonaktifAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;)LderiveCodec;", "verifyOtpNonactiveAutodebetBni"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PaymentRepository extends getChildrenOutConfigs {
    deriveCodec<AuthOtpBriDirectDebitResponse> authOtpBriRecurring(@Body AuthOtpBriDirectDebitRequest p0);

    deriveCodec<CheckOneTimePaymentResponse> checkOneTimePayment(@Body CheckOneTimePaymentStatusRequest p0);

    deriveCodec<GetStatusRecurringPlanResponse> checkStatusRecurringPlan(@Body CheckRecurringStatusRequest p0);

    deriveCodec<CreatePaymentMethodGeneralResponse> createBriDDRecurring(@Body CreatePaymentMethodWithDebitCard p0);

    deriveCodec<CustomerObjectItem> createCustomerObject(@Body CreateCustomerObjectRequest p0);

    deriveCodec<PaymentMethodItem> createEwalletPaymentMethod(@Body CreatePaymentMethodRequest p0);

    deriveCodec<PaymentMethodResult> createMandiriDDRecurring(@Body CreatePaymentMethodGeneralRequest p0);

    deriveCodec<CreateOneTimePaymentResponse> createOneTimePayment(@Body CreateOneTimePaymentRequest p0);

    deriveCodec<RecurringPlanResponse> createRecurringPlan(@Body CreateRecurringPlanRequest p0);

    deriveCodec<CustomerObjectUpdated> editCustomerObject(@Body EditCustomerObjectRequest p0);

    deriveCodec<BaseItem> flaggingRecurring(@Body FlaggingRecurringRequest p0);

    deriveCodec<ForceExpirePaymentMethodResponse> forceExpirePaymentMethod(@Body ForceExpirePaymentMethodRequest p0);

    deriveCodec<CustomerObjectResponse> getCustomerObject(@Body GetCustomerObjectRequest p0);

    deriveCodec<List<PaymentMethodItem>> getListPaymentMethod(@Body GetListPaymentMethodRequest p0);

    deriveCodec<GetListSertakanAutodebetResponse> getListSertakanAutodebet(@Body GetListSertakanAutodebetRequest p0);

    deriveCodec<SubmitAutodebitBniAutopayResponse> insertProfilAutodebetBni(@Body SubmitAutodebitBniAutopayRequest p0);

    deriveCodec<BaseItem> insertVasTxPayment(@Body InsertVasTxPaymentRequest p0);

    deriveCodec<GetListKodenonaktifAutodebitResponse> kodeNonactiveAutodebit();

    deriveCodec<CustomerObjectUpdated> modifyCustomerObject(@Body EditCustomerObjectRequest p0);

    deriveCodec<BaseItem> nonactiveAutodebit(@Body NonactiveAutodebetRequest p0);

    deriveCodec<SubmitNonactiveAutodebetBniResponse> submitNonaktifAutodebetBni(@Body SubmitNonactiveAutodebitBniRequest p0);

    deriveCodec<BaseItem> verifyOtpInsertAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);

    deriveCodec<BaseItem> verifyOtpNonactiveAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);
}
