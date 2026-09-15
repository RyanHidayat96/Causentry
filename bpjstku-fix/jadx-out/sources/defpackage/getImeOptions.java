package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.data.registration.bpu.model.response.ListJmoPairResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.ValidationOtp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getImeOptions extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<ListTuitionRateResponse>> INotificationSideChannel;
    private final MutableLiveData<VirtualCameraAdapter1<ListJmoPairResponse>> INotificationSideChannelDefault;
    private final MutableLiveData<VirtualCameraAdapter1<Verification>> INotificationSideChannelStub;
    private final registerlambda1 INotificationSideChannelStubProxy;
    private final MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> MediaBrowserCompat;
    private final MutableLiveData<VirtualCameraAdapter1<Verification>> RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentbindingInflater1;
    public final getDarkScrimactivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<Registration>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<Registration>> f943a;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> asBinder;
    public final acquireBuffer asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<Registration>> b;
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> cancel;
    private final MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> cancelAll;
    public final MutableLiveData<VirtualCameraAdapter1<GetDataSertakanDonaturResponse>> d;
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> g;
    private final MutableLiveData<VirtualCameraAdapter1<Verification>> getInterfaceDescriptor;
    private final MutableLiveData<VirtualCameraAdapter1<BaseModel>> notify;
    private final MutableLiveData<VirtualCameraAdapter1<BaseModel>> onTransact;

    public getImeOptions(getDarkScrimactivity getdarkscrimactivity, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(getdarkscrimactivity, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getdarkscrimactivity;
        this.INotificationSideChannelStubProxy = registerlambda1Var;
        this.asInterface = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = new MutableLiveData<>();
        this.INotificationSideChannelStub = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData2 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData4 = new MutableLiveData<>();
        this.f943a = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData5 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData6 = new MutableLiveData<>();
        this.notify = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData7 = new MutableLiveData<>();
        this.cancel = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData8 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData9 = new MutableLiveData<>();
        this.g = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<ListTuitionRateResponse>> mutableLiveData10 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData11 = new MutableLiveData<>();
        this.asBinder = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<ListJmoPairResponse>> mutableLiveData12 = new MutableLiveData<>();
        this.INotificationSideChannelDefault = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData13 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData14 = new MutableLiveData<>();
        this.b = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData15 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData16 = new MutableLiveData<>();
        this.onTransact = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> mutableLiveData17 = new MutableLiveData<>();
        this.MediaBrowserCompat = mutableLiveData17;
        MutableLiveData<VirtualCameraAdapter1<GetDataSertakanDonaturResponse>> mutableLiveData18 = new MutableLiveData<>();
        this.d = mutableLiveData18;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion17 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion18 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData18.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: getInputType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getSuggestionRowLayout
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getQuery
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.d(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getQueryHint
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: getSuggestionCommitIconResId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: launchQuerySearch
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isIconfiedByDefault
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isQueryRefinementEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListTuitionRateRequest listTuitionRateRequest) {
        Intrinsics.checkNotNullParameter(listTuitionRateRequest, "");
        MutableLiveData<VirtualCameraAdapter1<ListTuitionRateResponse>> mutableLiveData = this.INotificationSideChannel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(listTuitionRateRequest)));
        final Function1 function1 = new Function1() { // from class: isIconified
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.b(this.b, (ListTuitionRateResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: isSubmitButtonEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onSubmitQuery
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.g(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onItemClicked
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.asInterface.isDisposed()) {
            return;
        }
        this.asInterface.dispose();
    }

    public static /* synthetic */ Unit b(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getImeOptions getimeoptions, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getImeOptions getimeoptions, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = getimeoptions.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getImeOptions getimeoptions, GetDataSertakanDonaturResponse getDataSertakanDonaturResponse) {
        MutableLiveData<VirtualCameraAdapter1<GetDataSertakanDonaturResponse>> mutableLiveData = getimeoptions.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getDataSertakanDonaturResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getImeOptions getimeoptions, Registration registration) {
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(registration));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getImeOptions getimeoptions, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = getimeoptions.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getImeOptions getimeoptions, Registration registration) {
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = getimeoptions.f943a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(registration));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.f943a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getImeOptions getimeoptions, ListTuitionRateResponse listTuitionRateResponse) {
        MutableLiveData<VirtualCameraAdapter1<ListTuitionRateResponse>> mutableLiveData = getimeoptions.INotificationSideChannel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(listTuitionRateResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getImeOptions getimeoptions, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getimeoptions.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getImeOptions getimeoptions, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = getimeoptions.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getImeOptions getimeoptions, Registration registration) {
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = getimeoptions.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(registration));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(getImeOptions getimeoptions, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getimeoptions.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }
}
