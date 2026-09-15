package com.bpjstku.data.registration.pmi;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.response.JobTitlesItem;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeItem;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.JhtPaymentItem;
import com.bpjstku.data.registration.pmi.model.response.PlacementCountryItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import com.bpjstku.data.registration.pmi.remote.PMIRegistrationApi;
import defpackage.Api23Impl;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001f\u0010\u001aJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b!\u0010\u001aJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\"\u0010\u001aJ\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0017¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/bpjstku/data/registration/pmi/PMIRegistrationDataStore;", "Lcom/bpjstku/data/registration/pmi/PMIRegistrationRepository;", "Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApi;", "p0", "<init>", "(Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApi;)V", "Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;", "LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postPMIRegistration", "(Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;", "postCheckPassport", "(Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getJhtPayments", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "getProvinces", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "getJobTitles", "Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeItem;", "getBranchOfficeLocations", "getPlacementCountries", "checkSourceApi", "()LderiveCodec;", "webService", "Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApi;", "getWebService", "()Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PMIRegistrationDataStore implements PMIRegistrationRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PMIRegistrationApi webService;

    public PMIRegistrationDataStore(PMIRegistrationApi pMIRegistrationApi) {
        Intrinsics.checkNotNullParameter(pMIRegistrationApi, "");
        this.webService = pMIRegistrationApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7741getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final PMIRegistrationApi m7742getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<RegistrationItem> postPMIRegistration(PmiRegistrationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        PMIRegistrationApi pMIRegistrationApiM7742getWebService = m7742getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        if (partMap == null) {
            partMap = MapsKt.emptyMap();
        }
        File identityImageFile = p0.getIdentityImageFile();
        Intrinsics.checkNotNull(identityImageFile);
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(identityImageFile, "fileIdentitas");
        File pksImageFile = p0.getPksImageFile();
        Intrinsics.checkNotNull(pksImageFile);
        deriveCodec<Response<RegistrationItem>> derivecodecPostPmiRegistration = pMIRegistrationApiM7742getWebService.postPmiRegistration(partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(pksImageFile, "filePks"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPmiRegistration, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.postPMIRegistration$lambda$0((RegistrationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.postPMIRegistration$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegistrationItem postPMIRegistration$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RegistrationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<BaseItem> postCheckResidenceInfo(CheckResidenceInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostCheckResidenceInfo = m7742getWebService().postCheckResidenceInfo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCheckResidenceInfo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.postCheckResidenceInfo$lambda$2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.postCheckResidenceInfo$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postCheckResidenceInfo$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<BaseItem> postCheckPassport(CheckPassportRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostCheckPassport = m7742getWebService().postCheckPassport(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCheckPassport, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.postCheckPassport$lambda$4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.postCheckPassport$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postCheckPassport$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<VerificationItem> postEmailVerification(EmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailVerification = m7742getWebService().postEmailVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailVerification, unbindVar);
        final PMIRegistrationDataStore$$ExternalSyntheticLambda7 pMIRegistrationDataStore$$ExternalSyntheticLambda7 = new PMIRegistrationDataStore$$ExternalSyntheticLambda7();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.postEmailVerification$lambda$7(pMIRegistrationDataStore$$ExternalSyntheticLambda7, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getJhtPayments(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtPaymentItem>> jhtPayments = m7742getWebService().getJhtPayments(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jhtPayments, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getJhtPayments$lambda$8((JhtPaymentItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getJhtPayments$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getJhtPayments$lambda$8(JhtPaymentItem jhtPaymentItem) {
        Intrinsics.checkNotNullParameter(jhtPaymentItem, "");
        return jhtPaymentItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getJhtPayments$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ProvinceItem>> provinces = m7742getWebService().getProvinces(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(provinces, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getProvinces$lambda$10((ProvinceItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getProvinces$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinces$lambda$10(ProvinceItem provinceItem) {
        Intrinsics.checkNotNullParameter(provinceItem, "");
        return provinceItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinces$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CityItem>> cities = m7742getWebService().getCities(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(cities, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getCities$lambda$12((CityItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getCities$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCities$lambda$12(CityItem cityItem) {
        Intrinsics.checkNotNullParameter(cityItem, "");
        return cityItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCities$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getJobTitles(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JobTitlesItem>> jobTitles = m7742getWebService().getJobTitles(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jobTitles, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getJobTitles$lambda$14((JobTitlesItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getJobTitles$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getJobTitles$lambda$14(JobTitlesItem jobTitlesItem) {
        Intrinsics.checkNotNullParameter(jobTitlesItem, "");
        return jobTitlesItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getJobTitles$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<BranchOfficeItem>> getBranchOfficeLocations(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchOfficeLocationsItem>> branchOfficeLocations = m7742getWebService().getBranchOfficeLocations(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchOfficeLocations, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getBranchOfficeLocations$lambda$16((BranchOfficeLocationsItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getBranchOfficeLocations$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOfficeLocations$lambda$16(BranchOfficeLocationsItem branchOfficeLocationsItem) {
        Intrinsics.checkNotNullParameter(branchOfficeLocationsItem, "");
        return branchOfficeLocationsItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOfficeLocations$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<List<CodeAndNamePairItem>> getPlacementCountries(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PlacementCountryItem>> placementCountries = m7742getWebService().getPlacementCountries(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(placementCountries, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.getPlacementCountries$lambda$18((PlacementCountryItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.getPlacementCountries$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPlacementCountries$lambda$18(PlacementCountryItem placementCountryItem) {
        Intrinsics.checkNotNullParameter(placementCountryItem, "");
        return placementCountryItem.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPlacementCountries$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.pmi.PMIRegistrationRepository
    public final deriveCodec<BaseItem> checkSourceApi() {
        deriveCodec<Response<BaseItem>> derivecodecCheckSourceIp = m7742getWebService().checkSourceIp();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckSourceIp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PMIRegistrationDataStore.checkSourceApi$lambda$20((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PMIRegistrationDataStore.checkSourceApi$lambda$21(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem checkSourceApi$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem checkSourceApi$lambda$20(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postCheckPassport$lambda$4(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postCheckResidenceInfo$lambda$2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$6(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegistrationItem postPMIRegistration$lambda$0(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        return registrationItem;
    }
}
