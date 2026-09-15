package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.request.CreateCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodGeneralRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.EditCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.ForceExpirePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest;
import com.bpjstku.data.payment.model.request.SubmitAutodebitBniAutopayRequest;
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
import com.bpjstku.domain.payment.PaymentUseCase;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ListPopupWindow2 extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<List<CustomerObjectItem>>> INotificationSideChannel;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> INotificationSideChannelDefault;
    public final MutableLiveData<VirtualCameraAdapter1<GetListSertakanAutodebetResponse>> INotificationSideChannelStub;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> INotificationSideChannelStubProxy;
    private final MutableLiveData<VirtualCameraAdapter1<BaseItem>> IconCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> MediaBrowserCompat;
    public final MutableLiveData<VirtualCameraAdapter1<SubmitAutodebitBniAutopayResponse>> RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<CustomerObjectItem>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<CreatePaymentMethodGeneralResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<AuthOtpBriDirectDebitResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<CheckOneTimePaymentResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<RecurringPlanResponse>> f164a;
    public final MutableLiveData<VirtualCameraAdapter1<PaymentMethodItem>> asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<CreateOneTimePaymentResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<GetStatusRecurringPlanResponse>> b;
    public final MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> cancel;
    public final MutableLiveData<VirtualCameraAdapter1<ForceExpirePaymentMethodResponse>> cancelAll;
    private final MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> connect;
    public final MutableLiveData<VirtualCameraAdapter1<PaymentMethodResult>> d;
    public final acquireBuffer g;
    public final MutableLiveData<VirtualCameraAdapter1<GetListKodenonaktifAutodebitResponse>> getInterfaceDescriptor;
    public final MutableLiveData<VirtualCameraAdapter1<List<PaymentMethodItem>>> notify;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> onTransact;
    private final MutableLiveData<VirtualCameraAdapter1<SubmitNonactiveAutodebetBniResponse>> read;
    public final PaymentUseCase write;

    public ListPopupWindow2(PaymentUseCase paymentUseCase, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(paymentUseCase, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.write = paymentUseCase;
        this.g = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectItem>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<CustomerObjectItem>>> mutableLiveData2 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodItem>> mutableLiveData3 = new MutableLiveData<>();
        this.asBinder = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<RecurringPlanResponse>> mutableLiveData4 = new MutableLiveData<>();
        this.f164a = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<CreateOneTimePaymentResponse>> mutableLiveData5 = new MutableLiveData<>();
        this.asInterface = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<CheckOneTimePaymentResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<GetStatusRecurringPlanResponse>> mutableLiveData7 = new MutableLiveData<>();
        this.b = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodResult>> mutableLiveData8 = new MutableLiveData<>();
        this.d = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<List<PaymentMethodItem>>> mutableLiveData9 = new MutableLiveData<>();
        this.notify = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<CreatePaymentMethodGeneralResponse>> mutableLiveData10 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<AuthOtpBriDirectDebitResponse>> mutableLiveData11 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<ForceExpirePaymentMethodResponse>> mutableLiveData12 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> mutableLiveData13 = new MutableLiveData<>();
        this.cancel = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> mutableLiveData14 = new MutableLiveData<>();
        this.connect = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData15 = new MutableLiveData<>();
        this.INotificationSideChannelDefault = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData16 = new MutableLiveData<>();
        this.onTransact = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<GetListSertakanAutodebetResponse>> mutableLiveData17 = new MutableLiveData<>();
        this.INotificationSideChannelStub = mutableLiveData17;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData18 = new MutableLiveData<>();
        this.INotificationSideChannelStubProxy = mutableLiveData18;
        MutableLiveData<VirtualCameraAdapter1<GetListKodenonaktifAutodebitResponse>> mutableLiveData19 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData19;
        MutableLiveData<VirtualCameraAdapter1<SubmitAutodebitBniAutopayResponse>> mutableLiveData20 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData20;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData21 = new MutableLiveData<>();
        this.MediaBrowserCompat = mutableLiveData21;
        MutableLiveData<VirtualCameraAdapter1<SubmitNonactiveAutodebetBniResponse>> mutableLiveData22 = new MutableLiveData<>();
        this.read = mutableLiveData22;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData23 = new MutableLiveData<>();
        this.IconCompatParcelizer = mutableLiveData23;
        mutableLiveData10.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData11.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData18.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData19.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData20.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData21.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData22.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar17 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData23.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CreateCustomerObjectRequest createCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(createCustomerObjectRequest, "");
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectItem>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createCustomerObjectRequest)));
        final Function1 function1 = new Function1() { // from class: getDragToOpenListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentbindingInflater1(this.b, (CustomerObjectItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: PopupMenu1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: PopupMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.INotificationSideChannelStub(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getMenuListView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(GetCustomerObjectRequest getCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(getCustomerObjectRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<CustomerObjectItem>>> mutableLiveData = this.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCustomerObjectRequest)));
        final Function1 function1 = new Function1() { // from class: getQuantityText
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getResourcePackageName
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getResourceName
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getValueForDensity
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(CreatePaymentMethodRequest createPaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(createPaymentMethodRequest, "");
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodItem>> mutableLiveData = this.asBinder;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.b(createPaymentMethodRequest)));
        final Function1 function1 = new Function1() { // from class: ListPopupWindowPopupDataSetObserver
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (PaymentMethodItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ListPopupWindowPopupTouchInterceptor
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ListPopupWindowPopupScrollListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ListPopupWindowResizePopupRunnable
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(CreateRecurringPlanRequest createRecurringPlanRequest) {
        Intrinsics.checkNotNullParameter(createRecurringPlanRequest, "");
        MutableLiveData<VirtualCameraAdapter1<RecurringPlanResponse>> mutableLiveData = this.f164a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.b(createRecurringPlanRequest)));
        final Function1 function1 = new Function1() { // from class: ResourceManagerInternalAvdcInflateDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentbindingInflater1(this.b, (RecurringPlanResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getAnimation
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ResourceManagerInternalResourceManagerHooks
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ResourceManagerInternalInflateDelegate
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckRecurringStatusRequest checkRecurringStatusRequest) {
        Intrinsics.checkNotNullParameter(checkRecurringStatusRequest, "");
        MutableLiveData<VirtualCameraAdapter1<GetStatusRecurringPlanResponse>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkRecurringStatusRequest)));
        final Function1 function1 = new Function1() { // from class: MenuPopupWindowApi29Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (GetStatusRecurringPlanResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MenuPopupWindowApi23Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setTouchModal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.d(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: clearSelection
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(CreatePaymentMethodGeneralRequest createPaymentMethodGeneralRequest) {
        Intrinsics.checkNotNullParameter(createPaymentMethodGeneralRequest, "");
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodResult>> mutableLiveData = this.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createPaymentMethodGeneralRequest)));
        final Function1 function1 = new Function1() { // from class: ResourceManagerInternalAsldcInflateDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (PaymentMethodResult) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: loadDrawableFromDelegates
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.b(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setHooks
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetListPaymentMethodRequest getListPaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(getListPaymentMethodRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<PaymentMethodItem>>> mutableLiveData = this.notify;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListPaymentMethodRequest)));
        final Function1 function1 = new Function1() { // from class: ListPopupWindowApi29Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.b(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setIsClippedToScreen
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setHoverListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.INotificationSideChannelStubProxy(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: createCacheKey
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(CreatePaymentMethodWithDebitCard createPaymentMethodWithDebitCard) {
        Intrinsics.checkNotNullParameter(createPaymentMethodWithDebitCard, "");
        MutableLiveData<VirtualCameraAdapter1<CreatePaymentMethodGeneralResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.b(createPaymentMethodWithDebitCard)));
        final Function1 function1 = new Function1() { // from class: ResourceManagerInternalVdcInflateDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (CreatePaymentMethodGeneralResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ResourcesWrapper
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getDimension
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.cancelAll(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getDimensionPixelOffset
            private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
            private static final int $$f = 173;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {29, 88, -118, 32, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
            private static final int $$e = 243;
            private static final byte[] $$a = {87, 51, -85, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 127;
            private static int g = 0;
            private static int d = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 62874;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 52762;
            private static char b = 56457;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 23367;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    int r0 = 53 - r7
                    int r6 = r6 * 52
                    int r6 = 55 - r6
                    byte[] r1 = defpackage.getDimensionPixelOffset.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L17
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2e:
                    int r6 = r6 + r3
                    int r6 = r6 + (-10)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getDimensionPixelOffset.a(byte, int, short, java.lang.Object[]):void");
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
            private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 15
                    int r7 = r7 + 84
                    int r6 = r6 * 5
                    int r0 = 53 - r6
                    byte[] r1 = defpackage.getDimensionPixelOffset.$$d
                    int r8 = r8 * 47
                    int r8 = r8 + 4
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L19
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r1[r8]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2f:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + 3
                    int r8 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getDimensionPixelOffset.e(int, short, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        break;
                    }
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i4 = $10 + 45;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 58224;
                    int i7 = 0;
                    while (i7 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                        int i9 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i9);
                            objArr2[1] = Integer.valueOf(i8);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47773);
                                int iIndexOf = 467 - TextUtils.indexOf((CharSequence) "", '0', i3, i3);
                                int iAlpha = Color.alpha(i3) + 13;
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iIndexOf, iAlpha, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i10 = i7;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + 47774), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 467, TextUtils.indexOf((CharSequence) "", '0') + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7 = i10 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.combineMeasuredStates(0, 0), 2323 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // defpackage.logToString
            public final void accept(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = d + 37;
                g = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                    int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iBlue = Color.blue(0) + 28;
                    byte b2 = $$a[37];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) ($$b & 180), b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, scrollBarFadeDuration, iBlue, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{60939, 45044, 38806, 27558, 54603, 46389, 42989, 5622, 15367, 31975, 37803, 13905, 60479, 40399, 60153, 20779, 49928, 47407, 7805, 56846, 50522, 43510, 22955, 28460}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{11377, 4068, 4781, 7084, 26992, 52015, 36209, 26617, 4209, 46672, 31680, 58945, 45676, 60575, 26402, 18368, 59535, 12426}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                    int i4 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 28;
                    byte[] bArr = $$a;
                    byte b3 = bArr[37];
                    byte b4 = bArr[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, iMyTid, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = g + 59;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                        int mode = View.MeasureSpec.getMode(0) + 921;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        byte[] bArr2 = $$a;
                        byte b5 = bArr2[80];
                        Object[] objArr6 = new Object[1];
                        a(b5, bArr2[33], b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, mode, longPressTimeout, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int i7 = ~((int) Runtime.getRuntime().maxMemory());
                    int i8 = 1833208815 + (((~(1459334523 | i7)) | 314745120) * (-828)) + ((i7 | 1459334523) * (-828)) + 382143576;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{33874, 3150, 44841, 8902, 27744, 4385, 13882, 18169, 35228, 29210, 24570, 13343, 23728, 54752, 26893, 23182, 23176, 14054, 25911, 22640, 3670, 4282, 777, 5753, 22625, 43342, 19980, 65319}, (ViewConfiguration.getPressedStateDuration() >> 16) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{35956, 19039, 41952, 33633, 1600, 61559, 27849, 27953, 26028, 33161, 52832, 4745, 43748, 29832, 42168, 14101, 13014, 15076, 18534, 65379}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{1466, 8454, 8942, 33640, 16531, 50943, 16869, 49695, 20155, 4815, 45022, 25393, 50945, 35938, 65441, 26529, 3806, 52743}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{53533, 41525, 28993, 15849, 31320, 65152, 9674, 16788, 51059, 16309, 51470, 31604, 62812, 13452, 10908, 37919, 55422, 35249}, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1825319272};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[39];
                        byte b7 = b6;
                        Object[] objArr13 = new Object[1];
                        e(b6, b7, (byte) (b7 - 1), objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[39];
                        byte b9 = (byte) (b8 - 1);
                        Object[] objArr14 = new Object[1];
                        e(b9, b9, b8, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[80];
                            Object[] objArr16 = new Object[1];
                            a(b10, bArr4[33], b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, minimumFlingVelocity, threadPriority, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{60939, 45044, 38806, 27558, 54603, 46389, 42989, 5622, 15367, 31975, 37803, 13905, 60479, 40399, 60153, 20779, 49928, 47407, 7805, 56846, 50522, 43510, 22955, 28460}, (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{11377, 4068, 4781, 7084, 26992, 52015, 36209, 26617, 4209, 46672, 31680, 58945, 45676, 60575, 26402, 18368, 59535, 12426}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                                int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[37];
                                byte b12 = bArr5[80];
                                Object[] objArr19 = new Object[1];
                                a(b11, b12, b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iMakeMeasureSpec, touchSlop, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                                byte b13 = $$a[37];
                                Object[] objArr20 = new Object[1];
                                a(b13, (byte) ($$b & 180), b13, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, maximumFlingVelocity, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i11 = ((int[]) objArr[1])[0];
                int i12 = ((int[]) objArr[3])[0];
                if (i12 == i11) {
                    int i13 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iMyPid = Process.myPid();
                    int i14 = ~iMyPid;
                    int i15 = i13 + 1435835933 + (((~((-1002705364) | i14)) | 302252307) * 98) + (((~(i14 | (-771374281))) | (-1002705364) | (~(771374280 | iMyPid))) * (-49)) + (((~(iMyPid | (-1002705364))) | (-1073626588)) * 49);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i18 = g + 87;
                        d = i18 % 128;
                        int i19 = i18 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i12];
                    int i20 = i12 - 1;
                    iArr[i20] = 1;
                    Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
                    int i21 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i22 = i21 + (-1801181589) + (((~((-1667101161) | iIdentityHashCode)) | (-106978484)) * (-964)) + (((~((~iIdentityHashCode) | (-1667101161))) | 1629331784) * (-964));
                    int i23 = (i22 << 13) ^ i22;
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr22[0])[0] = i24 ^ (i24 << 5);
                }
                function2.invoke(obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, byte r7, byte r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = 108 - r8
                    byte[] r0 = defpackage.getDimensionPixelOffset.$$c
                    int r6 = r6 + 4
                    int r7 = r7 * 4
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L17
                    r4 = r8
                    r3 = r2
                    r8 = r6
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r4 = r0[r6]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2c:
                    int r6 = r6 + r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getDimensionPixelOffset.$$g(int, byte, byte):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForceExpirePaymentMethodRequest forceExpirePaymentMethodRequest) {
        Intrinsics.checkNotNullParameter(forceExpirePaymentMethodRequest, "");
        MutableLiveData<VirtualCameraAdapter1<ForceExpirePaymentMethodResponse>> mutableLiveData = this.cancelAll;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.b(forceExpirePaymentMethodRequest)));
        final Function1 function1 = new Function1() { // from class: createDrawableIfNeeded
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (ForceExpirePaymentMethodResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getTintListFromCache
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: installDefaultInflateDelegates
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.INotificationSideChannel(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getCachedDrawable
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditCustomerObjectRequest editCustomerObjectRequest) {
        Intrinsics.checkNotNullParameter(editCustomerObjectRequest, "");
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> mutableLiveData = this.cancel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editCustomerObjectRequest)));
        final Function1 function1 = new Function1() { // from class: getIdentifier
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CustomerObjectUpdated) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getQuantityString
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getTextArray
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.cancel(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ListPopupWindowListSelectorHider
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(GetListSertakanAutodebetRequest getListSertakanAutodebetRequest) {
        Intrinsics.checkNotNullParameter(getListSertakanAutodebetRequest, "");
        MutableLiveData<VirtualCameraAdapter1<GetListSertakanAutodebetResponse>> mutableLiveData = this.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getListSertakanAutodebetRequest)));
        final Function1 function1 = new Function1() { // from class: PopupMenu2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (GetListSertakanAutodebetResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ResourceManagerInternal
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: PopupMenuOnDismissListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.a(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: PopupMenuOnMenuItemClickListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SubmitAutodebitBniAutopayRequest submitAutodebitBniAutopayRequest) {
        Intrinsics.checkNotNullParameter(submitAutodebitBniAutopayRequest, "");
        MutableLiveData<VirtualCameraAdapter1<SubmitAutodebitBniAutopayResponse>> mutableLiveData = this.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.write.insertProfilAutodebetBni(submitAutodebitBniAutopayRequest)));
        addDelegate adddelegate = new addDelegate(new Function1() { // from class: addTintListToCache
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (SubmitAutodebitBniAutopayResponse) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: checkVectorDrawableSetup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.INotificationSideChannelDefault(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(adddelegate, new logToString() { // from class: addDrawableToCache
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, GetListSertakanAutodebetResponse getListSertakanAutodebetResponse) {
        MutableLiveData<VirtualCameraAdapter1<GetListSertakanAutodebetResponse>> mutableLiveData = listPopupWindow2.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getListSertakanAutodebetResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListPopupWindow2 listPopupWindow2, SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse) {
        MutableLiveData<VirtualCameraAdapter1<SubmitAutodebitBniAutopayResponse>> mutableLiveData = listPopupWindow2.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(submitAutodebitBniAutopayResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.INotificationSideChannelDefault);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, PaymentMethodResult paymentMethodResult) {
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodResult>> mutableLiveData = listPopupWindow2.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(paymentMethodResult));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CustomerObjectItem>>> mutableLiveData = listPopupWindow2.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.f164a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListPopupWindow2 listPopupWindow2, CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse) {
        MutableLiveData<VirtualCameraAdapter1<CreatePaymentMethodGeneralResponse>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(createPaymentMethodGeneralResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.INotificationSideChannelStub);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, ForceExpirePaymentMethodResponse forceExpirePaymentMethodResponse) {
        MutableLiveData<VirtualCameraAdapter1<ForceExpirePaymentMethodResponse>> mutableLiveData = listPopupWindow2.cancelAll;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(forceExpirePaymentMethodResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ListPopupWindow2 listPopupWindow2, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<PaymentMethodItem>>> mutableLiveData = listPopupWindow2.notify;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListPopupWindow2 listPopupWindow2, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, CustomerObjectItem customerObjectItem) {
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectItem>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(customerObjectItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStub(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, CreateOneTimePaymentResponse createOneTimePaymentResponse) {
        MutableLiveData<VirtualCameraAdapter1<CreateOneTimePaymentResponse>> mutableLiveData = listPopupWindow2.asInterface;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(createOneTimePaymentResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, CheckOneTimePaymentResponse checkOneTimePaymentResponse) {
        MutableLiveData<VirtualCameraAdapter1<CheckOneTimePaymentResponse>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(checkOneTimePaymentResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ListPopupWindow2 listPopupWindow2, RecurringPlanResponse recurringPlanResponse) {
        MutableLiveData<VirtualCameraAdapter1<RecurringPlanResponse>> mutableLiveData = listPopupWindow2.f164a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(recurringPlanResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, PaymentMethodItem paymentMethodItem) {
        MutableLiveData<VirtualCameraAdapter1<PaymentMethodItem>> mutableLiveData = listPopupWindow2.asBinder;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(paymentMethodItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListPopupWindow2 listPopupWindow2, GetStatusRecurringPlanResponse getStatusRecurringPlanResponse) {
        MutableLiveData<VirtualCameraAdapter1<GetStatusRecurringPlanResponse>> mutableLiveData = listPopupWindow2.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getStatusRecurringPlanResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListPopupWindow2 listPopupWindow2, AuthOtpBriDirectDebitResponse authOtpBriDirectDebitResponse) {
        MutableLiveData<VirtualCameraAdapter1<AuthOtpBriDirectDebitResponse>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(authOtpBriDirectDebitResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, CustomerObjectUpdated customerObjectUpdated) {
        MutableLiveData<VirtualCameraAdapter1<CustomerObjectUpdated>> mutableLiveData = listPopupWindow2.cancel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(customerObjectUpdated));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListPopupWindow2 listPopupWindow2, GetListKodenonaktifAutodebitResponse getListKodenonaktifAutodebitResponse) {
        MutableLiveData<VirtualCameraAdapter1<GetListKodenonaktifAutodebitResponse>> mutableLiveData = listPopupWindow2.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getListKodenonaktifAutodebitResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.INotificationSideChannelStubProxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ListPopupWindow2 listPopupWindow2, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.MediaBrowserCompat;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelDefault(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(ListPopupWindow2 listPopupWindow2, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, listPopupWindow2.MediaBrowserCompat);
        return Unit.INSTANCE;
    }
}
