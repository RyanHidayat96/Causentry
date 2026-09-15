package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.bpu.BPURegistrationRepository;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.GetDataSertakanDonaturWebviewRequest;
import com.bpjstku.data.registration.bpu.model.request.InsertJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.RegisterBpuRequest;
import com.bpjstku.data.registration.bpu.model.request.UpdateProfileBpuRequest;
import com.bpjstku.data.registration.bpu.model.response.CheckResidenceItem;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.general.model.Verification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class trackPipAnimationHintViewpositionInWindow implements getDarkScrimactivity {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final BPURegistrationRepository b;

    public trackPipAnimationHintViewpositionInWindow(BPURegistrationRepository bPURegistrationRepository) {
        Intrinsics.checkNotNullParameter(bPURegistrationRepository, "");
        this.b = bPURegistrationRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostEmailVerification = this.b.postEmailVerification(emailVerificationRequest);
        final Function1 function1 = new Function1() { // from class: light
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.b((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: emit
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostEmailVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneVerification = this.b.postPhoneVerification(phoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: getNightModeactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDetectDarkModeactivity
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneVerification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Registration> TuitionPaymentFragmentbindingInflater1(RegisterBpuRequest registerBpuRequest) {
        Intrinsics.checkNotNullParameter(registerBpuRequest, "");
        deriveCodec<RegistrationItem> derivecodecPostRegisterBpu = this.b.postRegisterBpu(registerBpuRequest);
        final Function1 function1 = new Function1() { // from class: invokeSuspendlambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostRegisterBpu, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Registration> TuitionPaymentFragmentbindingInflater1(UpdateProfileBpuRequest updateProfileBpuRequest) {
        Intrinsics.checkNotNullParameter(updateProfileBpuRequest, "");
        deriveCodec<RegistrationItem> derivecodecUpdateProfileBpu = this.b.updateProfileBpu(updateProfileBpuRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdanoXGr5XZ6ZQiw0NE_bFNhh3sxIQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.b((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PipHintTrackerKttrackPipAnimationHintViewflow1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecUpdateProfileBpu, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> workingLocations = this.b.getWorkingLocations(baseRequest);
        final Function1 function1 = new Function1() { // from class: accesstrackPipAnimationHintViewpositionInWindow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PipHintTrackerKttrackPipAnimationHintView2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(workingLocations, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<List<CodeNamePair>> b(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> jobTitles = this.b.getJobTitles(baseRequest);
        final Function1 function1 = new Function1() { // from class: create
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onLayoutChange
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(jobTitles, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<ListTuitionRateResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListTuitionRateRequest listTuitionRateRequest) {
        Intrinsics.checkNotNullParameter(listTuitionRateRequest, "");
        deriveCodec<ListTuitionRateResponse> tuitionRate = this.b.getTuitionRate(listTuitionRateRequest);
        final Function1 function1 = new Function1() { // from class: onViewAttachedToWindow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ListTuitionRateResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(tuitionRate, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckResidenceInfoRequest checkResidenceInfoRequest) {
        Intrinsics.checkNotNullParameter(checkResidenceInfoRequest, "");
        deriveCodec<BaseItem> derivecodecCheckBpuRegistered = this.b.checkBpuRegistered(checkResidenceInfoRequest);
        final Function1 function1 = new Function1() { // from class: invokeSuspendlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaJlDmmAtrK939XIgV9x1wNcsCteM
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckBpuRegistered, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<BaseItem> b(InsertJmoPairRequest insertJmoPairRequest) {
        Intrinsics.checkNotNullParameter(insertJmoPairRequest, "");
        deriveCodec<BaseItem> derivecodecInsertJmoPair = this.b.insertJmoPair(insertJmoPairRequest);
        final Function1 function1 = new Function1() { // from class: onScrollChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecInsertJmoPair, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<BaseModel> b(CheckResidenceInfoRequestAuth checkResidenceInfoRequestAuth) {
        Intrinsics.checkNotNullParameter(checkResidenceInfoRequestAuth, "");
        deriveCodec<CheckResidenceItem> derivecodecCheckBpuRegisteredAuth = this.b.checkBpuRegisteredAuth(checkResidenceInfoRequestAuth);
        final Function1 function1 = new Function1() { // from class: SystemBarStyle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CheckResidenceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: auto
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckBpuRegisteredAuth, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Registration> TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterBpuRequest registerBpuRequest) {
        Intrinsics.checkNotNullParameter(registerBpuRequest, "");
        deriveCodec<RegistrationItem> derivecodecPostRegisterBpuAuth = this.b.postRegisterBpuAuth(registerBpuRequest);
        final Function1 function1 = new Function1() { // from class: Rid
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: R
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostRegisterBpuAuth, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequestAuth phoneVerificationRequestAuth) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequestAuth, "");
        deriveCodec<VerificationItem> derivecodecPostPhoneVerificationAuth = this.b.postPhoneVerificationAuth(phoneVerificationRequestAuth);
        final Function1 function1 = new Function1() { // from class: PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onViewDetachedFromWindow
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPhoneVerificationAuth, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getDarkScrimactivity
    public final deriveCodec<GetDataSertakanDonaturResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetDataSertakanDonaturWebviewRequest getDataSertakanDonaturWebviewRequest) {
        Intrinsics.checkNotNullParameter(getDataSertakanDonaturWebviewRequest, "");
        deriveCodec<GetDataSertakanDonaturResponse> derivecodecGetDataDonaturSertakan = this.b.GetDataDonaturSertakan(new GetDataSertakanDonaturWebviewRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getDataSertakanDonaturWebviewRequest.getIdentifierDonatur().toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getDataSertakanDonaturWebviewRequest.getNikDonatur().toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getDataSertakanDonaturWebviewRequest.getNamaDonatur().toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getDataSertakanDonaturWebviewRequest.getPhoneNumberDonatur().toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, getDataSertakanDonaturWebviewRequest.getCustomField(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        final Function1 function1 = new Function1() { // from class: r8lambdaEzNCIbjtfjz3Ar8jZpBbve6Davg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1((GetDataSertakanDonaturResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: invokeSuspendlambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return trackPipAnimationHintViewpositionInWindow.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecGetDataDonaturSertakan, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onBackPressedInput_delegatelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CodeAndNamePairItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ ListTuitionRateResponse b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ListTuitionRateResponse) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onBackPressedInput_delegatelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CodeAndNamePairItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Registration a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Registration) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ Registration g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Registration) function1.invoke(obj);
    }

    public static /* synthetic */ Registration asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Registration) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ ListTuitionRateResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListTuitionRateResponse listTuitionRateResponse) {
        Intrinsics.checkNotNullParameter(listTuitionRateResponse, "");
        return listTuitionRateResponse;
    }

    public static /* synthetic */ Verification b(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckResidenceItem checkResidenceItem) {
        Intrinsics.checkNotNullParameter(checkResidenceItem, "");
        CheckResidenceItem checkResidenceItem2 = checkResidenceItem;
        Intrinsics.checkNotNullParameter(checkResidenceItem2, "");
        return new BaseModel(checkResidenceItem2.getIsSuccessful(), checkResidenceItem2.getMessage());
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ Verification d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }

    public static /* synthetic */ GetDataSertakanDonaturResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(GetDataSertakanDonaturResponse getDataSertakanDonaturResponse) {
        Intrinsics.checkNotNullParameter(getDataSertakanDonaturResponse, "");
        return getDataSertakanDonaturResponse;
    }

    public static /* synthetic */ List onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ BaseModel cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Registration b(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationItem);
    }

    public static /* synthetic */ GetDataSertakanDonaturResponse notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetDataSertakanDonaturResponse) function1.invoke(obj);
    }
}
