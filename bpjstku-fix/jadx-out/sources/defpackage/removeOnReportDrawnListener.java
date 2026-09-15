package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.PaymentRepository;
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
import com.bpjstku.data.payment.model.request.PaymentProfileItem;
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
import com.bpjstku.domain.payment.PaymentUseCase;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class removeOnReportDrawnListener implements PaymentUseCase {
    private final PaymentRepository TuitionPaymentFragmentbindingInflater1;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String b;

    public removeOnReportDrawnListener(PaymentRepository paymentRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(paymentRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = paymentRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = preferenceManager;
        this.b = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<List<CustomerObjectItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetCustomerObjectRequest getCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(getCustomerObjectRequest, "");
        String referenceId = getCustomerObjectRequest.getReferenceId();
        if (referenceId == null) {
            referenceId = "";
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("#");
        sb.append(referenceId);
        deriveCodec<CustomerObjectResponse> customerObject = this.TuitionPaymentFragmentbindingInflater1.getCustomerObject(new GetCustomerObjectRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion, sb.toString(), this.b)));
        final Function1 function1 = new Function1() { // from class: ImmLeaksCleanerFailedInitialization
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CustomerObjectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: OnBackPressedCallback
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(customerObject, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<CustomerObjectItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CreateCustomerObjectRequest createCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(createCustomerObjectRequest, "");
        deriveCodec<CustomerObjectItem> derivecodecCreateCustomerObject = this.TuitionPaymentFragmentbindingInflater1.createCustomerObject(createCustomerObjectRequest);
        final Function1 function1 = new Function1() { // from class: handleOnBackProgressed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CustomerObjectItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: handleOnBackCancelled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.INotificationSideChannelStubProxy(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateCustomerObject, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<PaymentMethodItem> b(CreatePaymentMethodRequest createPaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(createPaymentMethodRequest, "");
        deriveCodec<PaymentMethodItem> derivecodecCreateEwalletPaymentMethod = this.TuitionPaymentFragmentbindingInflater1.createEwalletPaymentMethod(createPaymentMethodRequest);
        final Function1 function1 = new Function1() { // from class: createNavigationEventHandleractivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1((PaymentMethodItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addCloseableactivity
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateEwalletPaymentMethod, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<RecurringPlanResponse> b(CreateRecurringPlanRequest createRecurringPlanRequest) {
        Intrinsics.checkNotNullParameter(createRecurringPlanRequest, "");
        deriveCodec<RecurringPlanResponse> derivecodecCreateRecurringPlan = this.TuitionPaymentFragmentbindingInflater1.createRecurringPlan(new CreateRecurringPlanRequest(accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getReferenceId()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getCustomerId()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getAmount().toString()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getPaymentMethodId()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getCustomField()), new PaymentProfileItem(accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getPaymentProfile().getKodeRef()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getPaymentProfile().getNik()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getNamaLengkap())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getTglLahir())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getNoHp())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getEmail())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getTipeRekening())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getKodePaket())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createRecurringPlanRequest.getPaymentProfile().getNominal().toString()), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getKodeIuran())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getKodePayment())), accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(createRecurringPlanRequest.getPaymentProfile().getSalary())))));
        final Function1 function1 = new Function1() { // from class: fullyDrawnReported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((RecurringPlanResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: FullyDrawnReporterKtreportWhenComplete1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.write(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateRecurringPlan, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<CreateOneTimePaymentResponse> b(CreateOneTimePaymentRequest createOneTimePaymentRequest) {
        Intrinsics.checkNotNullParameter(createOneTimePaymentRequest, "");
        String externalId = createOneTimePaymentRequest.getExternalId();
        if (externalId == null) {
            externalId = "";
        }
        String amount = createOneTimePaymentRequest.getAmount();
        if (amount == null) {
            amount = "";
        }
        String description = createOneTimePaymentRequest.getDescription();
        if (description == null) {
            description = "";
        }
        String customField = createOneTimePaymentRequest.getCustomField();
        if (customField == null) {
            customField = "";
        }
        deriveCodec<CreateOneTimePaymentResponse> derivecodecCreateOneTimePayment = this.TuitionPaymentFragmentbindingInflater1.createOneTimePayment(new CreateOneTimePaymentRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, externalId, this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, amount, this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, description, this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, customField, this.b), createOneTimePaymentRequest.getPaymentMethod(), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, String.valueOf(createOneTimePaymentRequest.getCheckSum()), this.b)));
        final OnBackPressedCallbackOnBackPressedEventHandler onBackPressedCallbackOnBackPressedEventHandler = new OnBackPressedCallbackOnBackPressedEventHandler();
        readableMs readablems = new readableMs() { // from class: onBackCancelled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.cancelAll(onBackPressedCallbackOnBackPressedEventHandler, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateOneTimePayment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<CheckOneTimePaymentResponse> TuitionPaymentFragmentbindingInflater1(CheckOneTimePaymentStatusRequest checkOneTimePaymentStatusRequest) {
        Intrinsics.checkNotNullParameter(checkOneTimePaymentStatusRequest, "");
        deriveCodec<CheckOneTimePaymentResponse> derivecodecCheckOneTimePayment = this.TuitionPaymentFragmentbindingInflater1.checkOneTimePayment(checkOneTimePaymentStatusRequest);
        final Function1 function1 = new Function1() { // from class: invokeSuspend
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CheckOneTimePaymentResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: reportWhenComplete
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckOneTimePayment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<GetStatusRecurringPlanResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CheckRecurringStatusRequest checkRecurringStatusRequest) {
        Intrinsics.checkNotNullParameter(checkRecurringStatusRequest, "");
        deriveCodec<GetStatusRecurringPlanResponse> derivecodecCheckStatusRecurringPlan = this.TuitionPaymentFragmentbindingInflater1.checkStatusRecurringPlan(checkRecurringStatusRequest);
        final Function1 function1 = new Function1() { // from class: getLock
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1((GetStatusRecurringPlanResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ImmLeaksCleanerExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckStatusRecurringPlan, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<PaymentMethodResult> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreatePaymentMethodGeneralRequest createPaymentMethodGeneralRequest) {
        Intrinsics.checkNotNullParameter(createPaymentMethodGeneralRequest, "");
        deriveCodec<PaymentMethodResult> derivecodecCreateMandiriDDRecurring = this.TuitionPaymentFragmentbindingInflater1.createMandiriDDRecurring(createPaymentMethodGeneralRequest);
        final Function1 function1 = new Function1() { // from class: OnBackPressedDispatcher
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.b((PaymentMethodResult) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: accessgetOnHasEnabledCallbacksChangedp
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.getInterfaceDescriptor(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateMandiriDDRecurring, readablems);
        final Function1 function2 = new Function1() { // from class: r8lambdaiiX9Jer_cEEQ3w8VduDToheLxl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (PaymentMethodResult) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: FullyDrawnReporterExternalSyntheticLambda0
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<List<PaymentMethodItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetListPaymentMethodRequest getListPaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(getListPaymentMethodRequest, "");
        deriveCodec<List<PaymentMethodItem>> listPaymentMethod = this.TuitionPaymentFragmentbindingInflater1.getListPaymentMethod(getListPaymentMethodRequest);
        final Function1 function1 = new Function1() { // from class: clearNextServedView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: handleOnBackPressed
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listPaymentMethod, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<CreatePaymentMethodGeneralResponse> b(CreatePaymentMethodWithDebitCard createPaymentMethodWithDebitCard) {
        Intrinsics.checkNotNullParameter(createPaymentMethodWithDebitCard, "");
        deriveCodec<CreatePaymentMethodGeneralResponse> derivecodecCreateBriDDRecurring = this.TuitionPaymentFragmentbindingInflater1.createBriDDRecurring(createPaymentMethodWithDebitCard);
        final Function1 function1 = new Function1() { // from class: reportWhenCompleteforInline
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CreatePaymentMethodGeneralResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: FullyDrawnReporterKt
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCreateBriDDRecurring, readablems);
        final Function1 function2 = new Function1() { // from class: r8lambdaExo1Z5q5y2pqqGK3kDcOXUK9u98
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (CreatePaymentMethodGeneralResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: cleaner_delegatelambda0
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<AuthOtpBriDirectDebitResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AuthOtpBriDirectDebitRequest authOtpBriDirectDebitRequest) {
        Intrinsics.checkNotNullParameter(authOtpBriDirectDebitRequest, "");
        deriveCodec<AuthOtpBriDirectDebitResponse> derivecodecAuthOtpBriRecurring = this.TuitionPaymentFragmentbindingInflater1.authOtpBriRecurring(authOtpBriDirectDebitRequest);
        final Function1 function1 = new Function1() { // from class: ImmLeaksCleanerValidCleaner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((AuthOtpBriDirectDebitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: isLifecycleActive
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecAuthOtpBriRecurring, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<ForceExpirePaymentMethodResponse> b(ForceExpirePaymentMethodRequest forceExpirePaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(forceExpirePaymentMethodRequest, "");
        deriveCodec<ForceExpirePaymentMethodResponse> derivecodecForceExpirePaymentMethod = this.TuitionPaymentFragmentbindingInflater1.forceExpirePaymentMethod(forceExpirePaymentMethodRequest);
        final Function1 function1 = new Function1() { // from class: onBackCompleted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ForceExpirePaymentMethodResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onBackProgressed
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecForceExpirePaymentMethod, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<CustomerObjectUpdated> TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditCustomerObjectRequest editCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(editCustomerObjectRequest, "");
        deriveCodec<CustomerObjectUpdated> derivecodecEditCustomerObject = this.TuitionPaymentFragmentbindingInflater1.editCustomerObject(editCustomerObjectRequest);
        final Function1 function1 = new Function1() { // from class: OnBackPressedCallbackInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CustomerObjectUpdated) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setLifecycleActive
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.read(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecEditCustomerObject, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(InsertVasTxPaymentRequest insertVasTxPaymentRequest) {
        Intrinsics.checkNotNullParameter(insertVasTxPaymentRequest, "");
        deriveCodec<BaseItem> derivecodecInsertVasTxPayment = this.TuitionPaymentFragmentbindingInflater1.insertVasTxPayment(insertVasTxPaymentRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaCe6hmwzpZeR4nJ6cSxwnPFSCXfY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: copy
            private static final byte[] $$c = {27, -8, 5, 78};
            private static final int $$f = 46;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 1, 2, 17, 5, 1, -56, 0, 64, 10, 11, -10, 18, 1, -8, 16, -57, 58, 17, 4, -6, 23, 2, 5, -8, 14, 11, -65, 43, 18, 23, -3, -21, 41, -11, 21, -11};
            private static final int $$e = 12;
            private static final byte[] $$a = {25, 31, 20, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 193;
            private static int asBinder = 0;
            private static int g = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47251, 47238, 47248, 47234, 47237, 47243, 47174, 47233, 47201, 47291, 47232, 47247, 47239, 47217, 47240, 47249, 47241, 47236, 47202, 47219, 47294, 47200, 47244, 47295, 47242, 47245, 47212};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719476;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentbindingInflater1 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = defpackage.copy.$$a
                    int r9 = r9 * 15
                    int r9 = 53 - r9
                    int r7 = r7 * 52
                    int r7 = 107 - r7
                    int r8 = r8 * 4
                    int r8 = r8 + 84
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L29
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L29:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2e:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copy.a(int, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.copy.$$d
                    int r7 = r7 * 36
                    int r1 = r7 + 1
                    int r8 = r8 * 36
                    int r8 = 39 - r8
                    int r6 = r6 * 13
                    int r6 = 111 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2f
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    int r8 = r8 + 1
                    r1[r3] = r4
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r0[r8]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2f:
                    int r6 = r6 + r8
                    int r6 = r6 + (-5)
                    r8 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copy.d(byte, byte, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                if (cArr3 != null) {
                    int i3 = $11 + 35;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) (31340 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2994;
                                int i7 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 17;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i6, i7, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr4[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getEdgeSlop() >> 16)), (Process.myPid() >> 22) + 253, 22 - (Process.myTid() >> 22), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                char c2 = '0';
                int i8 = 1687675375;
                if (TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $11 + 7;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 1;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 33602), TextUtils.indexOf("", c2, 0, 0) + 3086, View.combineMeasuredStates(0, 0) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        c2 = '0';
                        i8 = 1687675375;
                    }
                    objArr[0] = new String(cArr2);
                    return;
                }
                if (!b) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i10 = $11 + 71;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr5);
                    int i12 = $11 + 67;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 50 / 0;
                        return;
                    }
                    return;
                }
                int i14 = $11 + 87;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 33603), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084, ExpandableListView.getPackedPositionType(0L) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x01e9  */
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                    int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, threadPriority, iIndexOf, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(null, null, 127 - Gravity.getAbsoluteGravity(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int keyRepeatDelay = 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[3];
                    byte b5 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, minimumFlingVelocity, keyRepeatDelay, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iArgb = 2267 - Color.argb(0, 0, 0, 0);
                        int deadChar2 = 33 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b6, b6, bArr3[3], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iArgb, deadChar2, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i2 = ((int[]) objArr7[0])[0];
                    int i3 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = ((((~((-67314452) | iIdentityHashCode)) * 521) - 337491272) + (((~((~iIdentityHashCode) | (-67314452))) | (-938946560)) * 521)) - 583250441;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(null, null, View.resolveSize(0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i7 = g + 81;
                            asBinder = i7 % 128;
                            int i8 = i7 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                int i9 = asBinder + 69;
                                g = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i10 = 3 / 4;
                                }
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -583250441};
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[10];
                        byte b8 = bArr4[4];
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr4[4];
                        byte b10 = bArr4[10];
                        Object[] objArr14 = new Object[1];
                        d(b9, b10, b10, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i11 = asBinder + 3;
                            g = i11 % 128;
                            int i12 = i11 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 2268;
                                int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0);
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[7];
                                Object[] objArr15 = new Object[1];
                                a(b11, b11, bArr5[3], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iIndexOf2, iLastIndexOf, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                    int touchSlop = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                                    int iAlpha = 33 - Color.alpha(0);
                                    byte[] bArr6 = $$a;
                                    byte b12 = bArr6[3];
                                    byte b13 = bArr6[7];
                                    Object[] objArr18 = new Object[1];
                                    a(b12, b13, b13, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, touchSlop, iAlpha, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char defaultSize = (char) View.getDefaultSize(0, 0);
                                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 2267;
                                    int modifierMetaStateMask = 32 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    byte[] bArr7 = $$a;
                                    byte b14 = bArr7[37];
                                    byte b15 = bArr7[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b14, b15, b15, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, iIndexOf3, modifierMetaStateMask, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i13 = ((int[]) objArr[3])[0];
                int i14 = ((int[]) objArr[0])[0];
                if (i14 == i13) {
                    Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i15 = ((int[]) objArr[2])[0];
                    int i16 = ((int[]) objArr[0])[0];
                    int i17 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[1];
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i18 = ~(1039847416 | iFreeMemory);
                    int i19 = i15 + 899175408 + (((-1040113661) | i18) * (-814)) + ((i18 | (~((~iFreeMemory) | 231134100)) | 230867856) * 407) + (((~(iFreeMemory | (-231134101))) | (~((-1039847417) | iFreeMemory)) | 230867856) * 407);
                    int i20 = (i19 << 13) ^ i19;
                    int i21 = i20 ^ (i20 >>> 17);
                    ((int[]) objArr20[2])[0] = i21 ^ (i21 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[1];
                    if (strArr3 != null) {
                        int i22 = g + 45;
                        asBinder = i22 % 128;
                        int i23 = i22 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i14];
                    int i24 = i14 - 1;
                    iArr[i24] = 1;
                    Toast.makeText((Context) null, iArr[((i14 * i24) % 2) - 1], 1).show();
                    Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i25 = ((int[]) objArr[2])[0];
                    int i26 = ((int[]) objArr[0])[0];
                    int i27 = ((int[]) objArr[3])[0];
                    String[] strArr4 = (String[]) objArr[1];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i28 = ~((-5505129) | iIdentityHashCode2);
                    int i29 = ~iIdentityHashCode2;
                    int i30 = i25 + (-178194277) + ((i28 | (~((-662720914) | i29))) * 920) + (((~((-140487275) | i29)) | 5505128) * 920) + (((~(iIdentityHashCode2 | (-662720914))) | (~((-5505129) | i29)) | (~((-134982147) | iIdentityHashCode2))) * 920);
                    int i31 = (i30 << 13) ^ i30;
                    int i32 = i31 ^ (i31 >>> 17);
                    ((int[]) objArr21[2])[0] = i32 ^ (i32 << 5);
                    int i33 = g + 53;
                    asBinder = i33 % 128;
                    int i34 = i33 % 2;
                }
                return removeOnReportDrawnListener.RemoteActionCompatParcelizer(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, short r7, int r8) {
                /*
                    int r6 = 68 - r6
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    int r8 = r8 * 2
                    int r8 = 1 - r8
                    byte[] r0 = defpackage.copy.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2a:
                    int r6 = -r6
                    int r6 = r6 + r7
                    int r7 = r3 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.copy.$$g(short, short, int):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecInsertVasTxPayment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<GetListSertakanAutodebetResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetListSertakanAutodebetRequest getListSertakanAutodebetRequest) {
        Intrinsics.checkNotNullParameter(getListSertakanAutodebetRequest, "");
        deriveCodec<GetListSertakanAutodebetResponse> listSertakanAutodebet = this.TuitionPaymentFragmentbindingInflater1.getListSertakanAutodebet(new GetListSertakanAutodebetRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getListSertakanAutodebetRequest.getEmail(), this.b)));
        final Function1 function1 = new Function1() { // from class: accessgetCleanerdelegatecp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1((GetListSertakanAutodebetResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ImmLeaksCleaner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listSertakanAutodebet, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonactiveAutodebetRequest nonactiveAutodebetRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(nonactiveAutodebetRequest, "");
        deriveCodec<BaseItem> derivecodecNonactiveAutodebit = this.TuitionPaymentFragmentbindingInflater1.nonactiveAutodebit(new NonactiveAutodebetRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, nonactiveAutodebetRequest.getKodePlanRecurring(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, nonactiveAutodebetRequest.getEmail(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, nonactiveAutodebetRequest.getKeterangan(), this.b)));
        final Function1 function1 = new Function1() { // from class: copydefault
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onBackStarted
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecNonactiveAutodebit, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<GetListKodenonaktifAutodebitResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        deriveCodec<GetListKodenonaktifAutodebitResponse> derivecodecKodeNonactiveAutodebit = this.TuitionPaymentFragmentbindingInflater1.kodeNonactiveAutodebit();
        final Function1 function1 = new Function1() { // from class: getServedView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((GetListKodenonaktifAutodebitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ImmLeaksCleanerCleaner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.INotificationSideChannelDefault(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecKodeNonactiveAutodebit, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<SubmitAutodebitBniAutopayResponse> insertProfilAutodebetBni(SubmitAutodebitBniAutopayRequest submitAutodebitBniAutopayRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(submitAutodebitBniAutopayRequest, "");
        deriveCodec<SubmitAutodebitBniAutopayResponse> derivecodecInsertProfilAutodebetBni = this.TuitionPaymentFragmentbindingInflater1.insertProfilAutodebetBni(new SubmitAutodebitBniAutopayRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNik(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNamaLengkap(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getKodePaket(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNominal(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getKodeIuran(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNomorRekening(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNomorKartu(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getTglLahir(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getNoHp(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitAutodebitBniAutopayRequest.getEmail(), this.b)));
        final Function1 function1 = new Function1() { // from class: getCleaner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.b((SubmitAutodebitBniAutopayResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ImmLeaksCleanerCompanion
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecInsertProfilAutodebetBni, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<BaseItem> verifyOtpInsertAutodebetBni(VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest) {
        Intrinsics.checkNotNullParameter(verifyOtpSubmitAutodebitBniRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyOtpInsertAutodebetBni = this.TuitionPaymentFragmentbindingInflater1.verifyOtpInsertAutodebetBni(new VerifyOtpSubmitAutodebitBniRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getOtp(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getReferenceNo(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getChargeToken(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getNik(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getEmail(), this.b)));
        final Function1 function1 = new Function1() { // from class: removeCloseableactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: handleOnBackStarted
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.INotificationSideChannelStub(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpInsertAutodebetBni, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<SubmitNonactiveAutodebetBniResponse> submitNonaktifAutodebetBni(SubmitNonactiveAutodebitBniRequest submitNonactiveAutodebitBniRequest) {
        Intrinsics.checkNotNullParameter(submitNonactiveAutodebitBniRequest, "");
        deriveCodec<SubmitNonactiveAutodebetBniResponse> derivecodecSubmitNonaktifAutodebetBni = this.TuitionPaymentFragmentbindingInflater1.submitNonaktifAutodebetBni(new SubmitNonactiveAutodebitBniRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitNonactiveAutodebitBniRequest.getKodePlanRecurring(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitNonactiveAutodebitBniRequest.getKeterangan(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, submitNonactiveAutodebitBniRequest.getPetugasUbah(), this.b)));
        final Function1 function1 = new Function1() { // from class: isFullyDrawnReported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentbindingInflater1((SubmitNonactiveAutodebetBniResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: FullyDrawnReporterOwner
            private static short[] g;
            private static final byte[] $$a = {48, -110, 22, 55};
            private static final int $$b = 200;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int d = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f148a = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 291407571;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795524;
            private static int b = 1663931446;
            private static byte[] TuitionPaymentFragmentbindingInflater1 = {-29, -22, 12, -18, 3, -36, -17, -18, -23, 26, -30, 57, 16, -6, 55, -47, -26, 7, -23, 53, 48, -88, -17, -18, -23, 26, -30, 57, 16, -5, 31, -29, 34, -61, 45, -15, -12, 108, 43, 42, 45, -34, 38, -3, -44, 63, -37, -57, 24, 43, 42, 45, -34, 38, -3, -44, 62, -13, 9, 46, -56, 42, 27, -89, 72, -86, 93, -92, 119, 78, -31, 93, 82, -86, 93, -92, 87, 110, -111, -96, -95, -90, 85, -83, 86, 18, -40, 44, 51, -55, -34, 38, -42, 40, 34, 49, -4, 47, -34, -31, -88, 91, -93, 86, -88, -79, 77, 91, -93, 83, -83, -89, -76, -121, 100, 88, -25, 31, -93, -84, 84, -93, 90, -87, -112, 111, 94, 95, 88, -85, 83, -88, 22, -50, 51, Base64.padSymbol, -63, -45, 51, -57, 62, 54, 13, -14, 0, -4, 45, 31, 18, -16, 29, 25, -32, 30, 22, -31, -18, -63, Base64.padSymbol, 18, -16, 12, -18, 20, -22, 29, -18, -44, 54, -37, -33, 38, -40, -48, 39, 40, 7, 47, 44, -34, -8, 15, -97, 39, 40, 39, 16, -112, 32, 46, -46, -40, 55, -37, -41, 96, -24, -50, 48, -46, 27, -30, 24, -18, -17, 28, -20, 30, -53, -55, -23, 18, 52, 13, -8, 23, 18, -31, 4, -53, 54, -26, 23};
            private static char[] asBinder = {39568, 35144, 48426, 41442, 54734, 63947, 60539, 4186, 1025, 10468, 23734, 16514, 30570, 39732, 36702, 46022, 42943, 52109, 65092, 57981, 5886, 14976, 12008, 23871, 16668, 30009, 39329, 36235, 45534, 42061, 51250, 64542, 57588, 5290, 14485, 12115, 21303, 18409, 45563, 41514, 38478, 35509, 65201, 53984, 50949, 15160, 12131, 914, 30703, 27628, 23574, 45130, 42097, 39076, 36062, 54078, 49391, 62603, 59504, 40052, 45093, 42432, 23037, 19878, 24919, 5422, 2342, 16091, 53889, 45565, 41505, 38494, 35479, 65215, 53994, 50954, 15223, 12135, 920, 30668, 27641, 23581, 45125, 42082, 39151, 36060, 57586, 54628, 51557, 15745, 4528, 1493, 30216, 27187, 24162, 45755, 42675, 39662, 36628, 45558, 41518, 38476, 35460, 65278, 54000, 50955, 15162, 12145, 901, 30667, 27641, 23553, 45061, 42101, 39076, 36062, 57579, 54628, 51574, 15749, 4513, 1482, 30208, 27186, 24174, 45713, 42684, 39676, 36638, 58208, 55152, 52127, 16347, 5109, 1079, 30793, 34509, 38172, 41336, 48538, 51592, 58822, 61484, 3086, 6236, 13474, 16625, 45565, 41505, 38494, 35479, 65215, 53994, 50954, 15223, 12135, 920, 30668, 27641, 23581, 45125, 42082, 39151, 36060, 57586, 54628, 51558, 15753, 4532, 1488, 30216, 27168, 24178, 45696, 42680, 15358, 10294, 7278, 138, 29874, 22768, 19769, 45373, 42336, 35200, 64973};
            private static long asInterface = 1223472642506269263L;

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = f148a + 31;
                d = i2 % 128;
                int i3 = i2 % 2;
                SubmitNonactiveAutodebetBniResponse submitNonactiveAutodebetBniResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
                int i4 = f148a + 59;
                d = i4 % 128;
                int i5 = i4 % 2;
                return submitNonactiveAutodebetBniResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $11 + 99;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(asBinder[i + i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 2187, 40 - Color.red(0), 841711447, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myTid() >> 22) + 33017), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3011, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 321985076, false, $$c(b4, (byte) (b4 | 6), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), 3376 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 18, -968507904, false, $$c(b5, b6, (byte) (b6 - 4)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $11 + 111;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, -968507904, false, $$c(b7, b8, (byte) (b8 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr);
            }

            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    int i5 = 0;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf("", "") + 2267, 33 - TextUtils.indexOf("", ""), 1387473586, false, $$c(b3, (byte) (b3 | 8), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i6 = iIntValue == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                        if (bArr != null) {
                            int i7 = $11 + 71;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                try {
                                    Object[] objArr3 = new Object[1];
                                    objArr3[i5] = Integer.valueOf(bArr[i9]);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) i5;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', i5, i5) + 3359, View.MeasureSpec.makeMeasureSpec(i5, i5) + 18, -1054011043, false, $$c(b4, (byte) (b4 | 12), (byte) (-1)), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    i9++;
                                    i5 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i10 = $11 + 59;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1387473586, false, $$c(b5, (byte) (b5 | 8), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i6;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2854 - ImageFormat.getBitsPerPixel(0), 13 - (KeyEvent.getMaxKeyCode() >> 16), -1529949196, false, $$c(b6, (byte) (b6 | 9), (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i12 = 0;
                            while (i12 < length2) {
                                int i13 = $11 + 125;
                                $10 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    bArr5[i12] = (byte) (((long) bArr4[i12]) + 3046761265686732006L);
                                } else {
                                    bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                                    i12++;
                                }
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            int i14 = $11 + 83;
                            $10 = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                            if (!z) {
                                short[] sArr = g;
                                int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                                int i17 = $11 + 59;
                                $10 = i17 % 128;
                                int i18 = i17 % 2;
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                Object obj;
                Object[] objArr;
                int iResolveSize;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3;
                Object[] objArr2;
                Method method;
                short packedPositionGroup;
                int threadPriority;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int iIndexOf;
                int i11;
                int i12;
                int i13;
                int i14 = 2 % 2;
                if (context != null) {
                    try {
                        int i15 = -Color.red(0);
                        int i16 = i15 * 69;
                        int i17 = (i16 & (-1363903257)) + (i16 | (-1363903257));
                        int i18 = f148a;
                        int i19 = (i18 & 63) + (i18 | 63);
                        int i20 = i19 % 128;
                        d = i20;
                        int i21 = i19 % 2;
                        int i22 = ~i15;
                        int i23 = (i22 & (-276772724)) | (i22 ^ (-276772724));
                        int i24 = ~i;
                        int i25 = ~((i23 & i24) | (i23 ^ i24));
                        int i26 = ~(i15 | 276772723);
                        int i27 = (i25 & i26) | (i25 ^ i26);
                        int i28 = ~((i ^ 276772723) | (i & 276772723));
                        int i29 = ((i27 & i28) | (i27 ^ i28)) * (-68);
                        int i30 = (i17 & i29) + (i29 | i17);
                        int i31 = i20 + 39;
                        f148a = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = ~i15;
                        int i34 = ~i;
                        int i35 = (i33 ^ i34) | (i33 & i34);
                        int i36 = (~((i35 & 276772723) | (i35 ^ 276772723))) * (-68);
                        int i37 = ((i30 | i36) << 1) - (i36 ^ i30);
                        int i38 = ~(((-276772724) & i34) | ((-276772724) ^ i34));
                        int i39 = i37 + (((i33 & i38) | (i33 ^ i38)) * 68);
                        int i40 = -(-KeyEvent.normalizeMetaState(0));
                        int i41 = ((i40 | (-27)) << 1) - (i40 ^ (-27));
                        short sRed = (short) Color.red(0);
                        int i42 = -(-View.MeasureSpec.getSize(0));
                        byte b2 = (byte) ((i42 & (-14)) + (i42 | (-14)));
                        int i43 = f148a;
                        int i44 = (i43 ^ 115) + ((i43 & 115) << 1);
                        d = i44 % 128;
                        if (i44 % 2 != 0) {
                            int i45 = -(ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1));
                            int i46 = (i45 ^ 1644963276) + ((i45 & 1644963276) << 1);
                            Object[] objArr3 = new Object[1];
                            c(i39, i41, sRed, b2, i46, objArr3);
                            obj = objArr3[0];
                        } else {
                            int i47 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i48 = (i47 ^ 1644963276) + ((i47 & 1644963276) << 1);
                            Object[] objArr4 = new Object[1];
                            c(i39, i41, sRed, b2, i48, objArr4);
                            obj = objArr4[0];
                        }
                        String str = (String) obj;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i49 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i50 = (i49 & (-1082543600)) | ((-1082543600) ^ i49);
                        int i51 = (~((i50 ^ (-1480848157)) | (i50 & (-1480848157)))) * 433;
                        int i52 = (2049594758 ^ i51) + ((i51 & 2049594758) << 1);
                        int i53 = ~((1480848156 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (1480848156 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i54 = i52 + (((i53 & (-1082543600)) | ((-1082543600) ^ i53)) * (-433));
                        int i55 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-1082543600)) | ((-1082543600) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i56 = -(-(((i55 & 406958608) | (i55 ^ 406958608)) * 433));
                        int i57 = ((i54 | i56) << 1) - (i54 ^ i56);
                        int i58 = (-1724578675) - (~((((-1087021255) & i24) | ((-1087021255) ^ i24)) * 184));
                        int i59 = ~(((-1291515096) & i24) | (i24 ^ (-1291515096)));
                        int i60 = (319030048 ^ i59) | (i59 & 319030048);
                        int i61 = ((i60 ^ 204493841) | (i60 & 204493841)) * 184;
                        try {
                            if (i57 > (i58 & i61) + (i61 | i58)) {
                                objArr = new Object[0];
                                objArr[0] = str;
                                iResolveSize = View.resolveSize(1, 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i3 = 31564;
                            } else {
                                objArr = new Object[]{str};
                                iResolveSize = View.resolveSize(0, 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i3 = 11110;
                            }
                            int i62 = iResolveSize * 755;
                            int i63 = -(-(i3 * (-753)));
                            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                            int i65 = ~iResolveSize;
                            int i66 = (i65 & i3) | (i65 ^ i3);
                            int i67 = ~i66;
                            int i68 = f148a;
                            int i69 = ((i68 | 55) << 1) - (i68 ^ 55);
                            d = i69 % 128;
                            int i70 = i69 % 2;
                            int i71 = ~iResolveSize;
                            int i72 = (~(i71 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) | i67;
                            int i73 = ~((i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i74 = -(-((-754) * ((i72 ^ i73) | (i72 & i73))));
                            int i75 = ((i64 | i74) << 1) - (i64 ^ i74);
                            int i76 = ~((i66 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i66 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i77 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i78 = (i77 ^ iResolveSize) | (iResolveSize & i77);
                            int i79 = ~((i78 & i3) | (i78 ^ i3));
                            int i80 = ((i76 & i79) | (i76 ^ i79)) * (-754);
                            int i81 = ((i75 | i80) << 1) - (i80 ^ i75);
                            int i82 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i83 = ((i82 & i71) | (i71 ^ i82)) * 754;
                            char c = (char) ((i81 ^ i83) + ((i83 & i81) << 1));
                            int i84 = (-2) - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                            int i85 = f148a;
                            int i86 = (i85 & 117) + (i85 | 117);
                            d = i86 % 128;
                            int i87 = i86 % 2;
                            int i88 = (38 & capsMode) + (capsMode | 38);
                            Object[] objArr5 = new Object[1];
                            e(c, i84, i88, objArr5);
                            Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                            int jumpTapTimeout = 276772723 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i89 = -Color.alpha(0);
                            int i90 = (i89 & (-27)) + (i89 | (-27));
                            short pressedStateDuration = (short) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i91 = -TextUtils.indexOf("", "", 0, 0);
                            Object[] objArr6 = new Object[1];
                            c(jumpTapTimeout, i90, pressedStateDuration, (byte) ((i91 ^ 54) + ((i91 & 54) << 1)), Process.getGidForName("") + 1644963307, objArr6);
                            try {
                                Object[] objArr7 = {(String) objArr6[0]};
                                int i92 = f148a + 121;
                                d = i92 % 128;
                                int i93 = i92 % 2;
                                int i94 = -(Process.myTid() >> 22);
                                Object[] objArr8 = new Object[1];
                                e((char) ((i94 & 11110) + (i94 | 11110)), View.MeasureSpec.makeMeasureSpec(0, 0), 38 - (KeyEvent.getMaxKeyCode() >> 16), objArr8);
                                Object objNewInstance2 = Class.forName((String) objArr8[0]).getDeclaredConstructor(String.class).newInstance(objArr7);
                                try {
                                    int i95 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i96 = ((i95 | 276772754) << 1) - (i95 ^ 276772754);
                                    int i97 = -View.MeasureSpec.getSize(0);
                                    int i98 = (i97 ^ (-27)) + ((i97 & (-27)) << 1);
                                    short capsMode2 = (short) TextUtils.getCapsMode("", 0, 0);
                                    int iMyPid = Process.myPid() >> 22;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i99 = iMyPid * 69;
                                    int i100 = ((i99 | 4489) << 1) - (i99 ^ 4489);
                                    int i101 = ~iMyPid;
                                    int i102 = (i101 ^ 66) | (i101 & 66);
                                    int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i104 = ~((i102 ^ i103) | (i102 & i103));
                                    int i105 = ~((iMyPid ^ (-67)) | (iMyPid & (-67)));
                                    int i106 = (i104 ^ i105) | (i105 & i104);
                                    int i107 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ (-67)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-67)));
                                    int i108 = -(-(((i106 ^ i107) | (i106 & i107)) * (-68)));
                                    int i109 = (i100 ^ i108) + ((i108 & i100) << 1);
                                    int i110 = ~iMyPid;
                                    int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i112 = (i111 & i110) | (i110 ^ i111);
                                    int i113 = (~((i112 & (-67)) | (i112 ^ (-67)))) * (-68);
                                    int i114 = ~((66 & i103) | (66 ^ i103));
                                    byte b3 = (byte) ((((i109 ^ i113) + ((i113 & i109) << 1)) - (~(((i110 & i114) | (i110 ^ i114)) * 68))) - 1);
                                    int iCombineMeasuredStates = 1644963337 - View.combineMeasuredStates(0, 0);
                                    int i115 = f148a;
                                    int i116 = (i115 & 97) + (i115 | 97);
                                    d = i116 % 128;
                                    int i117 = i116 % 2;
                                    Object[] objArr9 = new Object[1];
                                    c(i96, i98, capsMode2, b3, iCombineMeasuredStates, objArr9);
                                    Class<?> cls = Class.forName((String) objArr9[0]);
                                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                    int i118 = modifierMetaStateMask * 714;
                                    int i119 = d;
                                    int i120 = (i119 ^ 59) + ((i119 & 59) << 1);
                                    f148a = i120 % 128;
                                    int i121 = i120 % 2;
                                    int i122 = (i118 & (-712)) + (i118 | (-712));
                                    int i123 = ~modifierMetaStateMask;
                                    int i124 = ~((i123 & i34) | (i123 ^ i34));
                                    int i125 = ~modifierMetaStateMask;
                                    int i126 = ~((i125 & 1) | (i125 ^ 1));
                                    int i127 = (i124 & i126) | (i124 ^ i126);
                                    int i128 = modifierMetaStateMask | (-2);
                                    int i129 = (i128 & i) | (i128 ^ i);
                                    int i130 = (i119 & 1) + (i119 | 1);
                                    int i131 = i130 % 128;
                                    f148a = i131;
                                    int i132 = i130 % 2;
                                    int i133 = ~i129;
                                    int i134 = (-713) * ((i127 & i133) | (i127 ^ i133));
                                    int i135 = (i122 ^ i134) + ((i122 & i134) << 1);
                                    int i136 = -(-((~i129) * 1426));
                                    int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                                    int i138 = ((-2) ^ i24) | ((-2) & i24);
                                    int i139 = i131 + 27;
                                    d = i139 % 128;
                                    if (i139 % 2 != 0) {
                                        Object[] objArr10 = new Object[1];
                                        e((char) (i137 % (713 << (~i138))), 89 >> KeyEvent.keyCodeFromString(""), 32 << View.MeasureSpec.getMode(1), objArr10);
                                        objArr2 = null;
                                        method = cls.getMethod((String) objArr10[0], null);
                                    } else {
                                        int i140 = -(-((~i138) * 713));
                                        char c2 = (char) (((i137 | i140) << 1) - (i140 ^ i137));
                                        int iKeyCodeFromString = 38 - KeyEvent.keyCodeFromString("");
                                        int mode = View.MeasureSpec.getMode(0);
                                        int i141 = (mode & 17) + (mode | 17);
                                        Object[] objArr11 = new Object[1];
                                        e(c2, iKeyCodeFromString, i141, objArr11);
                                        String str2 = (String) objArr11[0];
                                        objArr2 = null;
                                        method = cls.getMethod(str2, null);
                                    }
                                    Object objInvoke = method.invoke(context, objArr2);
                                    try {
                                        int i142 = 276772752 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        int i143 = d + 101;
                                        f148a = i143 % 128;
                                        int i144 = -(jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1));
                                        int i145 = ((i144 | (-26)) << 1) - (i144 ^ (-26));
                                        if (i143 % 2 == 0) {
                                            packedPositionGroup = (short) ExpandableListView.getPackedPositionGroup(1L);
                                            threadPriority = Process.getThreadPriority(1);
                                            i4 = 111;
                                            i5 = 19;
                                        } else {
                                            packedPositionGroup = (short) ExpandableListView.getPackedPositionGroup(0L);
                                            threadPriority = Process.getThreadPriority(0);
                                            i4 = -67;
                                            i5 = 20;
                                        }
                                        short s = packedPositionGroup;
                                        byte b4 = (byte) (i4 + ((((threadPriority | i5) << 1) - (threadPriority ^ i5)) >> 6));
                                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                        int i146 = f148a + 83;
                                        d = i146 % 128;
                                        int i147 = i146 % 2;
                                        int i148 = 1644963336 - (~(-fadingEdgeLength));
                                        Object[] objArr12 = new Object[1];
                                        c(i142, i145, s, b4, i148, objArr12);
                                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                                        int i149 = -(Process.myTid() >> 22);
                                        int i150 = (i149 & 276772759) + (i149 | 276772759);
                                        int iResolveSize2 = View.resolveSize(0, 0);
                                        int i151 = (iResolveSize2 & (-27)) + (iResolveSize2 | (-27));
                                        short s2 = (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i152 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        byte b5 = (byte) ((i152 & (-57)) + (i152 | (-57)));
                                        int i153 = f148a;
                                        int i154 = (i153 ^ 101) + ((i153 & 101) << 1);
                                        d = i154 % 128;
                                        int i155 = i154 % 2;
                                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                        int i156 = ((iCombineMeasuredStates2 | 1644963360) << 1) - (iCombineMeasuredStates2 ^ 1644963360);
                                        Object[] objArr13 = new Object[1];
                                        c(i150, i151, s2, b5, i156, objArr13);
                                        try {
                                            Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 276772753;
                                            int i157 = (-28) - (~View.MeasureSpec.getSize(0));
                                            short scrollDefaultDelay = (short) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i158 = d;
                                            int i159 = (i158 & 115) + (i158 | 115);
                                            f148a = i159 % 128;
                                            int i160 = i159 % 2;
                                            int i161 = ~iIndexOf2;
                                            int i162 = ((-69) ^ iIndexOf2) | ((-69) & iIndexOf2);
                                            Object obj2 = objNewInstance2;
                                            int i163 = (~i162) | (~((i161 ^ 68) | (i161 & 68)));
                                            int i164 = ~(((-69) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-69) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                            int i165 = ((-523) * iIndexOf2) + 17884 + (((i163 ^ i164) | (i163 & i164)) * 262);
                                            int i166 = (~i162) * (-786);
                                            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                                            int i168 = i158 + 17;
                                            f148a = i168 % 128;
                                            int i169 = i168 % 2;
                                            int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i171 = -(-(262 * ((~(((-69) & i170) | ((-69) ^ i170))) | (~((i161 ^ 68) | (i161 & 68))) | (~(((-69) & iIndexOf2) | ((-69) ^ iIndexOf2))))));
                                            Object[] objArr15 = new Object[1];
                                            c(keyRepeatTimeout, i157, scrollDefaultDelay, (byte) ((i167 ^ i171) + ((i171 & i167) << 1)), 1644963375 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr15);
                                            Class<?> cls3 = Class.forName((String) objArr15[0]);
                                            int i172 = -(Process.myPid() >> 22);
                                            Object[] objArr16 = new Object[1];
                                            e((char) ((i172 ^ 25285) + ((i172 & 25285) << 1)), ExpandableListView.getPackedPositionGroup(0L) + 55, 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr16);
                                            Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i173 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                            Object[] objArr17 = new Object[1];
                                            e(c3, (i173 ^ 68) + ((i173 & 68) << 1), 29 - (~(-Color.alpha(0))), objArr17);
                                            Class<?> cls4 = Class.forName((String) objArr17[0]);
                                            int i174 = -TextUtils.indexOf("", "", 0, 0);
                                            int i175 = (i174 * 934) - 254184812;
                                            int i176 = ~i174;
                                            int i177 = ~((i176 & i24) | (i176 ^ i24));
                                            int i178 = -(-(((i177 & (-276772772)) | ((-276772772) ^ i177)) * (-933)));
                                            int i179 = ((i175 | i178) << 1) - (i175 ^ i178);
                                            int i180 = -(-(((~((-276772772) | i24)) | (~((-276772772) | i174))) * 933));
                                            int i181 = (i179 & i180) + (i180 | i179) + ((~(i174 | 276772771)) * 933);
                                            int i182 = -TextUtils.indexOf("", "");
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i183 = ~i182;
                                            int i184 = ((i182 * (-716)) - 38745) + (((i183 ^ (-27)) | (i183 & (-27))) * (-1434));
                                            int i185 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                            int i186 = ~(i185 | (-27));
                                            int i187 = ~((i182 ^ (-27)) | (i182 & (-27)));
                                            int i188 = i186 | i187;
                                            int i189 = (i183 & 26) | (i183 ^ 26);
                                            int i190 = ~((i189 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i189 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                            int i191 = (i184 - (~(((i190 & i188) | (i188 ^ i190)) * 717))) - 1;
                                            int i192 = 26;
                                            int i193 = (~i182) | 26;
                                            int i194 = ~((i193 & i185) | (i193 ^ i185));
                                            int i195 = (i194 & i187) | (i194 ^ i187);
                                            int i196 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-27)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ (-27)));
                                            int i197 = -(-(((i195 & i196) | (i195 ^ i196)) * 717));
                                            int i198 = ((i191 | i197) << 1) - (i197 ^ i191);
                                            short s3 = (short) ((-2) - ((-TextUtils.lastIndexOf("", '0', 0)) ^ (-1)));
                                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                            int i199 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                            Object[] objArr18 = new Object[1];
                                            c(i181, i198, s3, (byte) ((windowTouchSlop & 38) + (windowTouchSlop | 38)), (i199 & 1644963407) + (i199 | 1644963407), objArr18);
                                            Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                            int length = objArr19.length;
                                            int i200 = 0;
                                            while (true) {
                                                if (i200 < length) {
                                                    Object obj3 = objArr19[i200];
                                                    int i201 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int i202 = (i201 * (-518)) - 1634360106;
                                                    int i203 = d;
                                                    int i204 = ((i203 | 75) << 1) - (i203 ^ 75);
                                                    f148a = i204 % 128;
                                                    if (i204 % 2 == 0) {
                                                        int i205 = ~i201;
                                                        int i206 = ~((i205 & i24) | (i205 ^ i24));
                                                        i6 = i202 % (519 >>> ((i206 & 276772743) | (i206 ^ 276772743)));
                                                        int i207 = (~i201) | i24;
                                                        i7 = ~((i207 & 276772743) | (i207 ^ 276772743));
                                                        i8 = i201 | 276772743;
                                                    } else {
                                                        int i208 = ~i201;
                                                        int i209 = (i208 & i24) | (i208 ^ i24);
                                                        i6 = i202 + (((~i209) | 276772743) * 519);
                                                        i7 = ~((i209 & 276772743) | (i209 ^ 276772743));
                                                        i8 = (i201 ^ 276772743) | (i201 & 276772743);
                                                    }
                                                    int i210 = -(-((-519) * (i7 | (~(i8 | i)))));
                                                    int i211 = ((i6 | i210) << 1) - (i6 ^ i210);
                                                    int i212 = ~((i ^ 276772743) | (276772743 & i));
                                                    int i213 = i211 + (((i201 & i212) | (i201 ^ i212)) * 519);
                                                    int i214 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                    int i215 = f148a + 67;
                                                    d = i215 % 128;
                                                    if (i215 % 2 != 0) {
                                                        int i216 = -(-i214);
                                                        int i217 = ((i216 | 141) << 1) - (i216 ^ 141);
                                                        i9 = (((i217 | (-8928)) << 1) - (i217 ^ (-8928))) + ((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ (-27)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-27))) + 140;
                                                    } else {
                                                        int i218 = i214 * 141;
                                                        int i219 = (i218 & 7533) + (i218 | 7533);
                                                        int i220 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | (-27)) * 140;
                                                        i9 = ((i219 | i220) << 1) - (i220 ^ i219);
                                                    }
                                                    int i221 = ~i214;
                                                    int i222 = ~((i221 & (-27)) | (i221 ^ (-27)));
                                                    int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                    int i224 = (-280) * (i222 | (~((i223 & (-27)) | (i223 ^ (-27)))));
                                                    int i225 = (i9 & i224) + (i9 | i224);
                                                    int i226 = ~((i192 ^ i214) | (i192 & i214));
                                                    int i227 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                    int i228 = ~((i227 & i214) | (i227 ^ i214));
                                                    int i229 = (i226 & i228) | (i226 ^ i228);
                                                    int i230 = ~i214;
                                                    int i231 = (i230 & (-27)) | (i230 ^ (-27));
                                                    int i232 = ~((i231 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i231 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                    int i233 = -(-(((i232 & i229) | (i229 ^ i232)) * 140));
                                                    int i234 = ((i225 | i233) << 1) - (i233 ^ i225);
                                                    short absoluteGravity = (short) Gravity.getAbsoluteGravity(0, 0);
                                                    int i235 = -ExpandableListView.getPackedPositionType(0L);
                                                    int i236 = i235 * 829;
                                                    int i237 = (i236 & 24041) + (i236 | 24041);
                                                    int i238 = ~i235;
                                                    int i239 = (i24 ^ i235) | (i24 & i235);
                                                    int i240 = i237 + (((~((i238 & (-30)) | (i238 ^ (-30)))) | (~((i239 & 29) | (i239 ^ 29)))) * (-828));
                                                    int i241 = (i235 & 29) | (i235 ^ 29);
                                                    int i242 = -(-(((i241 ^ i24) | (i241 & i24)) * (-828)));
                                                    byte b6 = (byte) ((((i240 & i242) + (i242 | i240)) - (~(-(-((~i241) * 828))))) - 1);
                                                    int i243 = -(-Color.rgb(0, 0, 0));
                                                    int i244 = (i243 ^ 1661740633) + ((i243 & 1661740633) << 1);
                                                    Object[] objArr20 = new Object[1];
                                                    c(i213, i234, absoluteGravity, b6, i244, objArr20);
                                                    try {
                                                        Object[] objArr21 = {(String) objArr20[0]};
                                                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                                        int i245 = 100 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int i246 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int i247 = (i246 ^ 37) + ((i246 & 37) << 1);
                                                        Object[] objArr22 = new Object[1];
                                                        e(cAxisFromString, i245, i247, objArr22);
                                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                                        int i248 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                        char c4 = (char) (((i248 | 14134) << 1) - (i248 ^ 14134));
                                                        long elapsedCpuTime = Process.getElapsedCpuTime();
                                                        int i249 = d;
                                                        int i250 = ((i249 | 91) << 1) - (i249 ^ 91);
                                                        f148a = i250 % 128;
                                                        if (i250 % 2 == 0) {
                                                            i10 = 135 << (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1));
                                                            iIndexOf = TextUtils.indexOf("", "", 1, 0);
                                                            i11 = 7;
                                                        } else {
                                                            i10 = 134 - (~(-(-(elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)))));
                                                            iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                                            i11 = 11;
                                                        }
                                                        int i251 = -(-iIndexOf);
                                                        int i252 = ((i11 | i251) << 1) - (i11 ^ i251);
                                                        Object[] objArr23 = new Object[1];
                                                        e(c4, i10, i252, objArr23);
                                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                        try {
                                                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                            int i253 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            Object[] objArr24 = new Object[1];
                                                            e(absoluteGravity2, (i253 & 147) + (i253 | 147), 27 - (~(-(Process.myPid() >> 22))), objArr24);
                                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                                            char c5 = (char) (35349 - (~(-TextUtils.indexOf("", "", 0))));
                                                            int i254 = -(-(Process.myPid() >> 22));
                                                            int i255 = (i254 ^ 175) + ((i254 & 175) << 1);
                                                            int i256 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                            Object[] objArr25 = objArr19;
                                                            Object[] objArr26 = new Object[1];
                                                            e(c5, i255, (i256 ^ 11) + ((i256 & 11) << 1), objArr26);
                                                            try {
                                                                Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr26[0], null).invoke(obj3, null))};
                                                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0');
                                                                int i257 = iIndexOf3 | 1;
                                                                int i258 = (iIndexOf3 * (-830)) + 832 + (((~(((-2) ^ i34) | ((-2) & i34))) | (~((i257 & i) | (i257 ^ i)))) * (-831));
                                                                int i259 = (-2) | iIndexOf3;
                                                                int i260 = (~((i259 & i) | (i259 ^ i))) * (-1662);
                                                                int i261 = (i258 ^ i260) + ((i258 & i260) << 1);
                                                                int i262 = ~iIndexOf3;
                                                                int i263 = ~((i262 & i34) | (i262 ^ i34));
                                                                int i264 = ~((iIndexOf3 & i) | (iIndexOf3 ^ i));
                                                                int i265 = (i263 & i264) | (i263 ^ i264);
                                                                i12 = i ^ 1;
                                                                char c6 = (char) ((i261 - (~((i265 | (~((i & 1) | i12))) * 831))) - 1);
                                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 100;
                                                                int i266 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                int i267 = (i266 * 371) + 13727;
                                                                int i268 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                int i269 = ~(((-38) ^ i268) | ((-38) & i268));
                                                                int i270 = length;
                                                                int i271 = ~i266;
                                                                int i272 = ~((i271 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i271 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                int i273 = ((i269 ^ i272) | (i272 & i269)) * (-370);
                                                                int i274 = (i267 & i273) + (i273 | i267);
                                                                int i275 = ~i266;
                                                                int i276 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                int i277 = ~((i275 ^ i276) | (i275 & i276));
                                                                int i278 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault8 | (-38));
                                                                int i279 = (i277 & i278) | (i277 ^ i278);
                                                                int i280 = (i266 & 37) | (i266 ^ 37);
                                                                int i281 = ~i280;
                                                                int i282 = i274 + (((i279 & i281) | (i279 ^ i281)) * (-370)) + ((~i280) * 370);
                                                                Object[] objArr28 = new Object[1];
                                                                e(c6, iLastIndexOf, i282, objArr28);
                                                                Class<?> cls7 = Class.forName((String) objArr28[0]);
                                                                int i283 = d + 29;
                                                                f148a = i283 % 128;
                                                                int i284 = i283 % 2;
                                                                int i285 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                                Object[] objArr29 = new Object[1];
                                                                c((i285 & 276772759) + (i285 | 276772759), (-26) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (0 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (byte) (4 - (~(-(-ExpandableListView.getPackedPositionType(0L))))), 1644963421 - (~(-Color.blue(0))), objArr29);
                                                                Object objInvoke4 = cls7.getMethod((String) objArr29[0], InputStream.class).invoke(objInvoke3, objArr27);
                                                                try {
                                                                    int i286 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                    int i287 = i286 * (-500);
                                                                    int i288 = (i287 & (-947427528)) + (i287 | (-947427528));
                                                                    int i289 = ~((-276772763) | i286);
                                                                    int i290 = (~i286) | 276772762;
                                                                    int i291 = ~((i290 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i290 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                    int i292 = -(-(((i289 & i291) | (i289 ^ i291)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                    int i293 = (i288 & i292) + (i292 | i288);
                                                                    int i294 = ~i286;
                                                                    int i295 = (~(((-276772763) & i294) | (i294 ^ (-276772763)))) * 1002;
                                                                    int i296 = (i293 & i295) + (i295 | i293);
                                                                    int i297 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                    int i298 = (~((i294 & i297) | (i294 ^ i297) | 276772762)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                                    int i299 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                    int i300 = ((i299 | (-27)) << 1) - (i299 ^ (-27));
                                                                    short sIndexOf = (short) TextUtils.indexOf("", "", 0, 0);
                                                                    int i301 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int iIndexOf4 = TextUtils.indexOf("", "", 0);
                                                                    int i302 = (iIndexOf4 & 1644963441) + (1644963441 | iIndexOf4);
                                                                    Object[] objArr30 = new Object[1];
                                                                    c((i296 & i298) + (i298 | i296), i300, sIndexOf, (byte) ((i301 & (-61)) + (i301 | (-61))), i302, objArr30);
                                                                    Class<?> cls8 = Class.forName((String) objArr30[0]);
                                                                    int i303 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                    int i304 = 609 - (~(i303 * 306));
                                                                    int i305 = (i304 ^ (-1206881666)) + ((i304 & (-1206881666)) << 1);
                                                                    int i306 = ~((i303 ^ 276772759) | (i303 & 276772759));
                                                                    int i307 = ~(i303 | i);
                                                                    int i308 = -(-(((i306 & i307) | (i306 ^ i307)) * 305));
                                                                    int i309 = (((i305 | i308) << 1) - (i308 ^ i305)) + (((~((i303 & i34) | (i34 ^ i303))) | (-276772760)) * 305);
                                                                    int i310 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                    int i311 = (i310 & (-27)) + (i310 | (-27));
                                                                    int i312 = -(-AndroidCharacter.getMirror('0'));
                                                                    int i313 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                    int i314 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                                                    int i315 = (i314 ^ 1644963474) + ((i314 & 1644963474) << 1);
                                                                    Object[] objArr31 = new Object[1];
                                                                    c(i309, i311, (short) ((i312 & (-48)) + (i312 | (-48))), (byte) ((i313 & 15) + (i313 | 15)), i315, objArr31);
                                                                    if (objNewInstance.equals(cls8.getMethod((String) objArr31[0], null).invoke(objInvoke4, null))) {
                                                                        break;
                                                                    }
                                                                    int i316 = f148a;
                                                                    int i317 = (i316 ^ 71) + ((i316 & 71) << 1);
                                                                    d = i317 % 128;
                                                                    int i318 = i317 % 2;
                                                                    try {
                                                                        char mirror = AndroidCharacter.getMirror('0');
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i319 = mirror * 65036;
                                                                        int i320 = (i319 ^ (-947403528)) + ((i319 & (-947403528)) << 1);
                                                                        int i321 = ~(((-276772715) & mirror) | ((-276772715) ^ mirror));
                                                                        int i322 = ~mirror;
                                                                        int i323 = i322 | 276772714;
                                                                        int i324 = ~((i323 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i323 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                        int i325 = (i320 - (~(((i321 ^ i324) | (i321 & i324)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))) - 1;
                                                                        int i326 = -(-((~((i322 ^ (-276772715)) | ((-276772715) & i322))) * 1002));
                                                                        int i327 = ((i325 | i326) << 1) - (i325 ^ i326);
                                                                        int i328 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                        int i329 = (i322 & i328) | (i322 ^ i328);
                                                                        int i330 = -(-((~((i329 & 276772714) | (i329 ^ 276772714))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                                        int i331 = (i327 & i330) + (i327 | i330);
                                                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) - 27;
                                                                        short s4 = (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                        int i332 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                        int i333 = ~i332;
                                                                        int i334 = ~((i333 & (-61)) | (i333 ^ (-61)));
                                                                        int i335 = ~((60 ^ i332) | (60 & i332));
                                                                        int i336 = (i334 ^ i335) | (i334 & i335);
                                                                        int i337 = ~(i332 | i);
                                                                        int i338 = ((((i332 * 659) + 40077) + (((i336 ^ i337) | (i336 & i337)) * (-658))) - (~(-(-((~(60 | i332)) * 658))))) - 1;
                                                                        int i339 = ~((60 & i332) | (60 ^ i332));
                                                                        int i340 = ~((i332 & i) | (i332 ^ i));
                                                                        Object[] objArr32 = new Object[1];
                                                                        c(i331, iMakeMeasureSpec, s4, (byte) (i338 + (((i340 & i339) | (i339 ^ i340)) * 658)), 1644963440 - ImageFormat.getBitsPerPixel(0), objArr32);
                                                                        Class<?> cls9 = Class.forName((String) objArr32[0]);
                                                                        int i341 = 276772757 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                                                                        int i342 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i343 = (i342 * (-183)) - 4995;
                                                                        int i344 = ~i342;
                                                                        int i345 = ~((i344 ^ (-27)) | (i344 & (-27)));
                                                                        int i346 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                        int i347 = ~((i346 ^ (-27)) | (i346 & (-27)));
                                                                        int i348 = -(-(((i345 ^ i347) | (i345 & i347)) * 184));
                                                                        int i349 = (i343 & i348) + (i348 | i343);
                                                                        int i350 = ((~((i342 & 26) | (26 ^ i342))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11) * (-184);
                                                                        int i351 = (i349 & i350) + (i349 | i350);
                                                                        int i352 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                        int i353 = i351 + ((~((i352 & i344) | (i344 ^ i352))) * 184);
                                                                        short sMyPid = (short) (Process.myPid() >> 22);
                                                                        int i354 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                        int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i355 = ~pressedStateDuration2;
                                                                        int i356 = ~((i355 ^ (-1644963476)) | (i355 & (-1644963476)));
                                                                        int i357 = ~(((-1644963476) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | ((-1644963476) & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                                                        int i358 = ((pressedStateDuration2 * (-575)) - 961193005) + (((i356 ^ i357) | (i356 & i357)) * 576);
                                                                        int i359 = ~pressedStateDuration2;
                                                                        int i360 = ~(1644963475 | i359);
                                                                        int i361 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                                        int i362 = ((-1644963476) ^ i361) | ((-1644963476) & i361);
                                                                        int i363 = ~((i362 ^ pressedStateDuration2) | (pressedStateDuration2 & i362));
                                                                        Object[] objArr33 = new Object[1];
                                                                        c(i341, i353, sMyPid, (byte) ((i354 ^ 15) + ((i354 & 15) << 1)), ((i358 + (((i360 & i363) | (i360 ^ i363)) * 576)) - (~((~((i359 & (-1644963476)) | (i359 ^ (-1644963476)))) * 576))) - 1, objArr33);
                                                                        Object obj4 = obj2;
                                                                        if (obj4.equals(cls9.getMethod((String) objArr33[0], null).invoke(objInvoke4, null))) {
                                                                            break;
                                                                        }
                                                                        i200 = ((i200 | 1) << 1) - (i200 ^ 1);
                                                                        obj2 = obj4;
                                                                        objArr19 = objArr25;
                                                                        length = i270;
                                                                        i192 = 26;
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                } else {
                                                    int i364 = f148a + 23;
                                                    d = i364 % 128;
                                                    int i365 = i364 % 2;
                                                }
                                            }
                                            Object[] objArr34 = new Object[4];
                                            int[] iArr = new int[1];
                                            objArr34[0] = iArr;
                                            objArr34[1] = new int[1];
                                            int[] iArr2 = new int[1];
                                            int i366 = f148a;
                                            int i367 = (i366 & 93) + (i366 | 93);
                                            int i368 = i367 % 128;
                                            d = i368;
                                            int i369 = i367 % 2;
                                            objArr34[2] = iArr2;
                                            iArr[0] = i;
                                            iArr2[0] = i12;
                                            int i370 = i368 + 19;
                                            f148a = i370 % 128;
                                            if (i370 % 2 == 0) {
                                                objArr34[3] = null;
                                                Runtime.getRuntime().maxMemory();
                                                NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                throw null;
                                            }
                                            objArr34[3] = null;
                                            int i371 = (-1820379008) + ((i | 688742989) * (-50)) + (((~((-151593478) | i)) | (~(800026237 | i34))) * 50) + (((~(688742989 | i34)) | (~(648432760 | i34)) | (-800026238)) * 50);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i372 = 4048 + (i371 * 253);
                                            int i373 = ~i371;
                                            int i374 = ~(((-17) & i373) | ((-17) ^ i373));
                                            int i375 = ~i371;
                                            int i376 = d;
                                            int i377 = ((i376 | 45) << 1) - (i376 ^ 45);
                                            f148a = i377 % 128;
                                            if (i377 % 2 == 0) {
                                                int i378 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i379 = i374 | (~((i375 & i378) | (i375 ^ i378)));
                                                int i380 = i371 | 16;
                                                int i381 = ~((i380 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i380 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                                i13 = (i372 >>> ((-252) >> ((i379 & i381) | (i379 ^ i381)))) >> ((-252) / ((i371 ^ 16) | (i371 & 16)));
                                            } else {
                                                int i382 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                int i383 = i374 | (~((i375 & i382) | (i375 ^ i382)));
                                                int i384 = (i371 ^ 16) | (i371 & 16);
                                                int i385 = ~(i384 | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                                                int i386 = i372 + (((i383 & i385) | (i383 ^ i385)) * (-252));
                                                int i387 = -(-(i384 * (-252)));
                                                i13 = ((i386 | i387) << 1) - (i386 ^ i387);
                                            }
                                            int i388 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                            int i389 = (i373 & i388) | (i373 ^ i388);
                                            int i390 = ~((i389 & 16) | (i389 ^ 16));
                                            int i391 = (i371 & 16) | (16 ^ i371);
                                            int i392 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i391) | (i391 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                            int i393 = 252 * ((i392 & i390) | (i390 ^ i392));
                                            int i394 = (i13 & i393) + (i393 | i13);
                                            int i395 = (i2 & i394) + (i2 | i394);
                                            int i396 = i395 << 13;
                                            int i397 = (i396 | i395) & (~(i395 & i396));
                                            int i398 = i397 >>> 17;
                                            int i399 = (i397 | i398) & (~(i397 & i398));
                                            int i400 = i399 << 5;
                                            ((int[]) objArr34[1])[0] = ((~i399) & i400) | ((~i400) & i399);
                                            return objArr34;
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused) {
                    }
                }
                int[] iArr3 = new int[1];
                Object[] objArr35 = {new int[]{i}, iArr3, new int[]{i}, null};
                int i401 = ~((-683273003) | (~i));
                int i402 = (((((-788266880) | i401) | (~(683273002 | i))) * (-338)) - 105922860) + (((~(i | (-104993878))) | i401) * 338);
                int i403 = ((i2 | i402) << 1) - (i2 ^ i402);
                int i404 = i403 << 13;
                int i405 = ((~i403) & i404) | ((~i404) & i403);
                int i406 = i405 ^ (i405 >>> 17);
                int i407 = i406 << 5;
                iArr3[0] = ((~i406) & i407) | ((~i407) & i406);
                return objArr35;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r7, byte r8, byte r9) {
                /*
                    byte[] r0 = defpackage.FullyDrawnReporterOwner.$$a
                    int r9 = r9 + 4
                    int r7 = r7 * 4
                    int r7 = r7 + 1
                    int r8 = r8 + 109
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r7
                    r8 = r9
                    r4 = r2
                    goto L28
                L13:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L24:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                L28:
                    int r9 = r9 + r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.FullyDrawnReporterOwner.$$c(short, byte, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecSubmitNonaktifAutodebetBni, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.payment.PaymentUseCase
    public final deriveCodec<BaseItem> verifyOtpNonactiveAutodebetBni(VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest) {
        Intrinsics.checkNotNullParameter(verifyOtpSubmitAutodebitBniRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyOtpNonactiveAutodebetBni = this.TuitionPaymentFragmentbindingInflater1.verifyOtpNonactiveAutodebetBni(new VerifyOtpSubmitAutodebitBniRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getOtp(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getReferenceNo(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getChargeToken(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getNik(), this.b), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, verifyOtpSubmitAutodebitBniRequest.getEmail(), this.b)));
        final Function1 function1 = new Function1() { // from class: isEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setEnabled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return removeOnReportDrawnListener.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpNonactiveAutodebetBni, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ CreatePaymentMethodGeneralResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse) {
        Intrinsics.checkNotNullParameter(createPaymentMethodGeneralResponse, "");
        return createPaymentMethodGeneralResponse;
    }

    public static /* synthetic */ BaseItem b(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ SubmitNonactiveAutodebetBniResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmitNonactiveAutodebetBniResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ForceExpirePaymentMethodResponse TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForceExpirePaymentMethodResponse) function1.invoke(obj);
    }

    public static /* synthetic */ GetStatusRecurringPlanResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetStatusRecurringPlanResponse) function1.invoke(obj);
    }

    public static /* synthetic */ CreateOneTimePaymentResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(CreateOneTimePaymentResponse createOneTimePaymentResponse) {
        Intrinsics.checkNotNullParameter(createOneTimePaymentResponse, "");
        return createOneTimePaymentResponse;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ PaymentMethodResult b(PaymentMethodResult paymentMethodResult) {
        Intrinsics.checkNotNullParameter(paymentMethodResult, "");
        return paymentMethodResult;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ AuthOtpBriDirectDebitResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(AuthOtpBriDirectDebitResponse authOtpBriDirectDebitResponse) {
        Intrinsics.checkNotNullParameter(authOtpBriDirectDebitResponse, "");
        return authOtpBriDirectDebitResponse;
    }

    public static /* synthetic */ CheckOneTimePaymentResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckOneTimePaymentResponse checkOneTimePaymentResponse) {
        Intrinsics.checkNotNullParameter(checkOneTimePaymentResponse, "");
        return checkOneTimePaymentResponse;
    }

    public static /* synthetic */ GetListKodenonaktifAutodebitResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetListKodenonaktifAutodebitResponse getListKodenonaktifAutodebitResponse) {
        Intrinsics.checkNotNullParameter(getListKodenonaktifAutodebitResponse, "");
        return getListKodenonaktifAutodebitResponse;
    }

    public static /* synthetic */ CustomerObjectItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerObjectItem customerObjectItem) {
        Intrinsics.checkNotNullParameter(customerObjectItem, "");
        return customerObjectItem;
    }

    public static /* synthetic */ BaseItem b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(removeOnReportDrawnListener removeonreportdrawnlistener, CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse) {
        removeonreportdrawnlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2.saveString("USER_BRI_PAYMENT_METHOD", createPaymentMethodGeneralResponse.getData().getPmId());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ SubmitAutodebitBniAutopayResponse a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmitAutodebitBniAutopayResponse) function1.invoke(obj);
    }

    public static /* synthetic */ CreatePaymentMethodGeneralResponse d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CreatePaymentMethodGeneralResponse) function1.invoke(obj);
    }

    public static /* synthetic */ SubmitAutodebitBniAutopayResponse b(SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse) {
        Intrinsics.checkNotNullParameter(submitAutodebitBniAutopayResponse, "");
        return accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(submitAutodebitBniAutopayResponse);
    }

    public static /* synthetic */ List asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ RecurringPlanResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(RecurringPlanResponse recurringPlanResponse) {
        Intrinsics.checkNotNullParameter(recurringPlanResponse, "");
        return recurringPlanResponse;
    }

    public static /* synthetic */ SubmitNonactiveAutodebetBniResponse TuitionPaymentFragmentbindingInflater1(SubmitNonactiveAutodebetBniResponse submitNonactiveAutodebetBniResponse) {
        Intrinsics.checkNotNullParameter(submitNonactiveAutodebetBniResponse, "");
        return submitNonactiveAutodebetBniResponse;
    }

    public static /* synthetic */ GetStatusRecurringPlanResponse TuitionPaymentFragmentbindingInflater1(GetStatusRecurringPlanResponse getStatusRecurringPlanResponse) {
        Intrinsics.checkNotNullParameter(getStatusRecurringPlanResponse, "");
        return accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStatusRecurringPlanResponse);
    }

    public static /* synthetic */ AuthOtpBriDirectDebitResponse asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AuthOtpBriDirectDebitResponse) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ CheckOneTimePaymentResponse notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckOneTimePaymentResponse) function1.invoke(obj);
    }

    public static /* synthetic */ GetListSertakanAutodebetResponse onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetListSertakanAutodebetResponse) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerObjectResponse customerObjectResponse) {
        Intrinsics.checkNotNullParameter(customerObjectResponse, "");
        return accesssetHasEnabledCallbacksp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(customerObjectResponse.getInfo());
    }

    public static /* synthetic */ CreateOneTimePaymentResponse cancelAll(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CreateOneTimePaymentResponse) function1.invoke(obj);
    }

    public static /* synthetic */ PaymentMethodItem cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentMethodItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ PaymentMethodItem TuitionPaymentFragmentbindingInflater1(PaymentMethodItem paymentMethodItem) {
        Intrinsics.checkNotNullParameter(paymentMethodItem, "");
        return paymentMethodItem;
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    public static /* synthetic */ CustomerObjectItem INotificationSideChannelStubProxy(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectItem) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ GetListKodenonaktifAutodebitResponse INotificationSideChannelDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetListKodenonaktifAutodebitResponse) function1.invoke(obj);
    }

    public static /* synthetic */ PaymentMethodResult getInterfaceDescriptor(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentMethodResult) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem INotificationSideChannelStub(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(removeOnReportDrawnListener removeonreportdrawnlistener, PaymentMethodResult paymentMethodResult) {
        removeonreportdrawnlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2.saveString("USER_MANDIRI_PAYMENT_METHOD", paymentMethodResult.getPmId());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ RecurringPlanResponse write(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RecurringPlanResponse) function1.invoke(obj);
    }

    public static /* synthetic */ CustomerObjectUpdated read(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectUpdated) function1.invoke(obj);
    }

    public static /* synthetic */ ForceExpirePaymentMethodResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForceExpirePaymentMethodResponse forceExpirePaymentMethodResponse) {
        Intrinsics.checkNotNullParameter(forceExpirePaymentMethodResponse, "");
        return forceExpirePaymentMethodResponse;
    }

    public static /* synthetic */ CustomerObjectUpdated TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomerObjectUpdated customerObjectUpdated) {
        Intrinsics.checkNotNullParameter(customerObjectUpdated, "");
        return customerObjectUpdated;
    }

    public static /* synthetic */ GetListSertakanAutodebetResponse TuitionPaymentFragmentbindingInflater1(GetListSertakanAutodebetResponse getListSertakanAutodebetResponse) {
        Intrinsics.checkNotNullParameter(getListSertakanAutodebetResponse, "");
        return accesssetHasEnabledCallbacksp.b(getListSertakanAutodebetResponse);
    }
}
