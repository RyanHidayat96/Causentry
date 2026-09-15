package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class InputConfigurationCompat extends ViewModel {
    final MutableLiveData<VirtualCameraAdapter1<PaymentHistoryResponse>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BpuTuitionOneMonth>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ensureViewModelStore f157a;
    public final MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> b;
    private final MutableLiveData<VirtualCameraAdapter1<BaseItem>> d;
    public final ActivityResult g;

    public InputConfigurationCompat(ActivityResult activityResult, ensureViewModelStore ensureviewmodelstore, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        Intrinsics.checkNotNullParameter(ensureviewmodelstore, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.g = activityResult;
        this.f157a = ensureviewmodelstore;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = new MutableLiveData<>();
        this.asInterface = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<PaymentHistoryResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData3 = new MutableLiveData<>();
        this.b = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData4 = new MutableLiveData<>();
        this.d = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BpuTuitionOneMonth>> mutableLiveData5 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData6;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentRequest tuitionPaymentRequest) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = this.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentRequest)));
        final Function1 function1 = new Function1() { // from class: getInputConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BpuCheckPaymentItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: InputConfigurationCompatInputConfigurationCompatImpl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final addSurface addsurface = new addSurface(this);
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getDynamicRangeProfile
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                addsurface.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentRequest tuitionPaymentRequest) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentRequest)));
        final Function1 function1 = new Function1() { // from class: enableSurfaceSharing
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (BpuCheckPaymentItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: removeSurface
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getSurface
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getSurfaceGroupId
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PaymentHistoryRequest paymentHistoryRequest = new PaymentHistoryRequest(str);
        MutableLiveData<VirtualCameraAdapter1<PaymentHistoryResponse>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentHistoryRequest)));
        final Function1 function1 = new Function1() { // from class: OutputConfigurationCompatOutputConfigurationCompatImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (PaymentHistoryResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setDynamicRangeProfile
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setStreamUseCase
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setPhysicalCameraId
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BpuOneMonthTuitionRequest bpuOneMonthTuitionRequest) {
        Intrinsics.checkNotNullParameter(bpuOneMonthTuitionRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BpuTuitionOneMonth>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentbindingInflater1(bpuOneMonthTuitionRequest)));
        final Function1 function1 = new Function1() { // from class: InputConfigurationCompatInputConfigurationCompatBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.b(this.TuitionPaymentFragmentbindingInflater1, (BpuTuitionOneMonth) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: InputConfigurationCompatInputConfigurationCompatApi23Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: OutputConfigurationCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getMaxSharedSurfaceCount
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputConfigurationCompat inputConfigurationCompat, BpuCheckPaymentItem bpuCheckPaymentItem) {
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputConfigurationCompat inputConfigurationCompat, BpuCheckPaymentItem bpuCheckPaymentItem) {
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = inputConfigurationCompat.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(InputConfigurationCompat inputConfigurationCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, inputConfigurationCompat.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(InputConfigurationCompat inputConfigurationCompat, BpuCheckPaymentItem bpuCheckPaymentItem) {
        MutableLiveData<VirtualCameraAdapter1<BpuCheckPaymentItem>> mutableLiveData = inputConfigurationCompat.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(InputConfigurationCompat inputConfigurationCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(InputConfigurationCompat inputConfigurationCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, inputConfigurationCompat.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(InputConfigurationCompat inputConfigurationCompat, PaymentHistoryResponse paymentHistoryResponse) {
        MutableLiveData<VirtualCameraAdapter1<PaymentHistoryResponse>> mutableLiveData = inputConfigurationCompat.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(paymentHistoryResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputConfigurationCompat inputConfigurationCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(InputConfigurationCompat inputConfigurationCompat, BpuTuitionOneMonth bpuTuitionOneMonth) {
        MutableLiveData<VirtualCameraAdapter1<BpuTuitionOneMonth>> mutableLiveData = inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bpuTuitionOneMonth));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputConfigurationCompat inputConfigurationCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, inputConfigurationCompat.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }
}
