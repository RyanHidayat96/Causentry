package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.asik.model.Asik;
import com.bpjstku.domain.asik.model.AsikListKpj;
import com.bpjstku.domain.asik.model.AsikListKpjMobile;
import com.bpjstku.domain.asik.model.MaritalStatus;
import com.bpjstku.domain.asik.model.OtpAsik;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class select extends ViewModel {
    public final acquireBuffer INotificationSideChannel;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> INotificationSideChannelDefault;
    public final MutableLiveData<VirtualCameraAdapter1<Asik>> INotificationSideChannelStub;
    public final registerlambda1 INotificationSideChannelStubProxy;
    private MutableLiveData<VirtualCameraAdapter1<List<MaritalStatus>>> MediaBrowserCompat;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<List<AsikListKpj>>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<List<AsikListFamilyItem>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<List<AddressPostalCodeItem>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> f1351a;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<List<AsikListKpjMobile>>> b;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> cancel;
    public final MutableLiveData<VirtualCameraAdapter1<AccountBankItem>> cancelAll;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> connect;
    public final InterfaceC0833y d;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> g;
    public final MutableLiveData<VirtualCameraAdapter1<OtpAsik>> getInterfaceDescriptor;
    public final MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> notify;
    public final MutableLiveData<VirtualCameraAdapter1<SubmissionCheckItem>> onTransact;
    private final MutableLiveData<VirtualCameraAdapter1<BaseModel>> read;
    private final MutableLiveData<VirtualCameraAdapter1<BaseItem>> write;

    public select(InterfaceC0833y interfaceC0833y, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(interfaceC0833y, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.d = interfaceC0833y;
        this.INotificationSideChannel = acquirebuffer;
        this.INotificationSideChannelStubProxy = registerlambda1Var;
        this.MediaBrowserCompat = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<OtpAsik>> mutableLiveData = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData2 = new MutableLiveData<>();
        this.INotificationSideChannelDefault = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData3 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<Asik>> mutableLiveData4 = new MutableLiveData<>();
        this.INotificationSideChannelStub = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData5 = new MutableLiveData<>();
        this.connect = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<SubmissionCheckItem>> mutableLiveData6 = new MutableLiveData<>();
        this.onTransact = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<List<AsikListKpj>>> mutableLiveData7 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData8 = new MutableLiveData<>();
        this.read = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData9 = new MutableLiveData<>();
        this.g = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData10 = new MutableLiveData<>();
        this.f1351a = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData11 = new MutableLiveData<>();
        this.write = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData12 = new MutableLiveData<>();
        this.asBinder = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData13 = new MutableLiveData<>();
        this.cancel = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<List<AsikListFamilyItem>>> mutableLiveData14 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<AccountBankItem>> mutableLiveData15 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData16 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<List<AddressPostalCodeItem>>> mutableLiveData17 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData17;
        MutableLiveData<VirtualCameraAdapter1<List<AsikListKpjMobile>>> mutableLiveData18 = new MutableLiveData<>();
        this.b = mutableLiveData18;
        MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData19 = new MutableLiveData<>();
        this.notify = mutableLiveData19;
        MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData20 = new MutableLiveData<>();
        this.asInterface = mutableLiveData20;
        mutableLiveData8.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        this.MediaBrowserCompat.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData19.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData20.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData18.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion17 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData19.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion18 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData20.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OtpByEmailRequest otpByEmailRequest) {
        Intrinsics.checkNotNullParameter(otpByEmailRequest, "");
        MutableLiveData<VirtualCameraAdapter1<OtpAsik>> mutableLiveData = this.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.b(otpByEmailRequest)));
        final Function1 function1 = new Function1() { // from class: onTabSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (OtpAsik) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onTabUnselected
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onTabReselected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ActionBarDrawerToggle
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OtpByPhoneRequest otpByPhoneRequest) {
        Intrinsics.checkNotNullParameter(otpByPhoneRequest, "");
        MutableLiveData<VirtualCameraAdapter1<OtpAsik>> mutableLiveData = this.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.b(otpByPhoneRequest)));
        onScroll onscroll = new onScroll(new Function1() { // from class: AlertController3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (OtpAsik) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: AlertController5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(onscroll, new logToString() { // from class: AlertController4
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckSubmissionRequest checkSubmissionRequest) {
        Intrinsics.checkNotNullParameter(checkSubmissionRequest, "");
        MutableLiveData<VirtualCameraAdapter1<SubmissionCheckItem>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkSubmissionRequest)));
        final Function1 function1 = new Function1() { // from class: getDrawerToggleDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (SubmissionCheckItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: AlertController
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: canTextInput
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.notify(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: manageScrollIndicators
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikVerificationStepRequest asikVerificationStepRequest) {
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = this.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikVerificationStepRequest)));
        final Function1 function1 = new Function1() { // from class: ActionBarDrawerToggleDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: isNavigationVisible
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ActionBarDrawerToggleFrameworkActionBarDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.INotificationSideChannelDefault(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ActionBarDrawerToggleToolbarCompatDelegate
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.INotificationSideChannel.isDisposed()) {
            return;
        }
        this.INotificationSideChannel.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.f1351a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.INotificationSideChannelStub);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.f1351a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.INotificationSideChannelDefault);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(select selectVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(select selectVar, SubmissionCheckItem submissionCheckItem) {
        MutableLiveData<VirtualCameraAdapter1<SubmissionCheckItem>> mutableLiveData = selectVar.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(submissionCheckItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(select selectVar, OtpAsik otpAsik) {
        MutableLiveData<VirtualCameraAdapter1<OtpAsik>> mutableLiveData = selectVar.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpAsik));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(select selectVar, AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData = selectVar.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(asikVerifivationLivenessOnlyResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(select selectVar, OtpAsik otpAsik) {
        MutableLiveData<VirtualCameraAdapter1<OtpAsik>> mutableLiveData = selectVar.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(otpAsik));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(select selectVar, AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData = selectVar.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(asikVerifivationLivenessOnlyResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(select selectVar, Asik asik) {
        MutableLiveData<VirtualCameraAdapter1<Asik>> mutableLiveData = selectVar.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(asik));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(select selectVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<AddressPostalCodeItem>>> mutableLiveData = selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(select selectVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<AsikListFamilyItem>>> mutableLiveData = selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(select selectVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<AsikListKpj>>> mutableLiveData = selectVar.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit RemoteActionCompatParcelizer(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(select selectVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelDefault(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(select selectVar, AccountBankItem accountBankItem) {
        MutableLiveData<VirtualCameraAdapter1<AccountBankItem>> mutableLiveData = selectVar.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(accountBankItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(select selectVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, selectVar.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(select selectVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<AsikListKpjMobile>>> mutableLiveData = selectVar.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }
}
