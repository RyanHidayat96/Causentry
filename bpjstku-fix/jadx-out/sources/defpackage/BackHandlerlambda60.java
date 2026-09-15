package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.pmi.PMIRegistrationRepository;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.pmi.model.PmiBranchOffice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BackHandlerlambda60 implements setContentdefault {
    private final PMIRegistrationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public BackHandlerlambda60(PMIRegistrationRepository pMIRegistrationRepository) {
        Intrinsics.checkNotNullParameter(pMIRegistrationRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pMIRegistrationRepository;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckPassportRequest checkPassportRequest) {
        Intrinsics.checkNotNullParameter(checkPassportRequest, "");
        deriveCodec<BaseItem> derivecodecPostCheckPassport = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postCheckPassport(checkPassportRequest);
        final Function1 function1 = new Function1() { // from class: setOwners
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: currentOnBackCompletedlambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostCheckPassport, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckResidenceInfoRequest checkResidenceInfoRequest) {
        Intrinsics.checkNotNullParameter(checkResidenceInfoRequest, "");
        deriveCodec<BaseItem> derivecodecPostCheckResidenceInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postCheckResidenceInfo(checkResidenceInfoRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdaqKfykMQp4wDIP5F992ec_PNzCNk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerKtExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostCheckResidenceInfo, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<Registration> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PmiRegistrationRequest pmiRegistrationRequest) {
        Intrinsics.checkNotNullParameter(pmiRegistrationRequest, "");
        deriveCodec<RegistrationItem> derivecodecPostPMIRegistration = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postPMIRegistration(pmiRegistrationRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerKtExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault2((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerKtBackHandlerlambda40inlinedonDispose1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPMIRegistration, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<List<PmiBranchOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<BranchOfficeItem>> branchOfficeLocations = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getBranchOfficeLocations(baseRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerKtBackHandlerlambda30inlinedonStopOrDispose1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerKtExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(branchOfficeLocations, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> placementCountries = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getPlacementCountries(baseRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerlambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentActivityKt
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(placementCountries, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> provinces = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getProvinces(baseRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerKtBackHandlerlambda60inlinedonStopOrDispose1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComposeBackHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(provinces, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CityRequest cityRequest) {
        Intrinsics.checkNotNullParameter(cityRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> cities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCities(cityRequest);
        final Function1 function1 = new Function1() { // from class: BackHandlerlambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackHandlerKtExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(cities, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setContentdefault
    public final deriveCodec<List<CodeNamePair>> b(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> jhtPayments = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getJhtPayments(baseRequest);
        final Function1 function1 = new Function1() { // from class: setContent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackHandlerlambda60.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: runStopOrDisposeEffect
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BackHandlerlambda60.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(jhtPayments, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onBackPressedInput_delegatelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CodeAndNamePairItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<BranchOfficeItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BranchOfficeItem branchOfficeItem : list2) {
            Intrinsics.checkNotNullParameter(branchOfficeItem, "");
            String kodeKantor = branchOfficeItem.getKodeKantor();
            if (kodeKantor == null) {
                kodeKantor = "";
            }
            String kodeRefPptkis = branchOfficeItem.getKodeRefPptkis();
            if (kodeRefPptkis == null) {
                kodeRefPptkis = "";
            }
            String namaDivisi = branchOfficeItem.getNamaDivisi();
            if (namaDivisi == null) {
                namaDivisi = "";
            }
            String namaKantor = branchOfficeItem.getNamaKantor();
            if (namaKantor == null) {
                namaKantor = "";
            }
            arrayList.add(new PmiBranchOffice(kodeKantor, kodeRefPptkis, namaDivisi, namaKantor));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseModel b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
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

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Registration g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Registration) function1.invoke(obj);
    }

    public static /* synthetic */ List d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onBackPressedInput_delegatelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CodeAndNamePairItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseModel asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
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
}
