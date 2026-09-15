package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.vocation.VocationRepository;
import com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest;
import com.bpjstku.data.vocation.model.request.BlkProfileRequest;
import com.bpjstku.data.vocation.model.request.SaveSurveyRequest;
import com.bpjstku.data.vocation.model.request.TrainingFieldRequest;
import com.bpjstku.data.vocation.model.request.VocationEligibilityRequest;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.data.vocation.model.request.VocationRegisterRequest;
import com.bpjstku.data.vocation.model.request.VocationTrainingRequest;
import com.bpjstku.data.vocation.model.response.AccountSimilarityItem;
import com.bpjstku.data.vocation.model.response.BankItem;
import com.bpjstku.data.vocation.model.response.BlkProfileItem;
import com.bpjstku.data.vocation.model.response.BlkProfileResponse;
import com.bpjstku.data.vocation.model.response.ExpertiseFieldItem;
import com.bpjstku.data.vocation.model.response.IksBlkItem;
import com.bpjstku.data.vocation.model.response.SurveyItem;
import com.bpjstku.data.vocation.model.response.TrainingItem;
import com.bpjstku.data.vocation.model.response.VocationProfileItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.domain.vocation.model.Training;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.domain.vocation.model.VocationProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getFlagsMask implements setMaxItems {
    private final VocationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getFlagsMask(VocationRepository vocationRepository) {
        Intrinsics.checkNotNullParameter(vocationRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = vocationRepository;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<BaseModel> b(VocationEligibilityRequest vocationEligibilityRequest) {
        Intrinsics.checkNotNullParameter(vocationEligibilityRequest, "");
        deriveCodec<BaseItem> derivecodecCheckEligibility = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkEligibility(vocationEligibilityRequest);
        final Function1 function1 = new Function1() { // from class: setMediaType
            public static int TuitionPaymentFragmentbindingInflater1 = -965889211;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setOrderedSelection
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckEligibility, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> provinces = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getProvinces(baseRequest);
        final Function1 function1 = new Function1() { // from class: IntentSenderRequestCompanionCREATOR1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getAccentColor
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(provinces, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CityRequest cityRequest) {
        Intrinsics.checkNotNullParameter(cityRequest, "");
        deriveCodec<List<CodeAndNamePairItem>> cities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCities(cityRequest);
        final Function1 function1 = new Function1() { // from class: setAccentColoractivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setDefaultTab
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(cities, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<VocationProfile> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationProfileRequest vocationProfileRequest) {
        Intrinsics.checkNotNullParameter(vocationProfileRequest, "");
        deriveCodec<VocationProfileItem> profile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getProfile(vocationProfileRequest);
        setMediaTypeactivity setmediatypeactivity = new setMediaTypeactivity(new Function1() { // from class: setAccentColor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault1((VocationProfileItem) obj);
            }
        });
        share.b(setmediatypeactivity, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(profile, setmediatypeactivity);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<Training>> TuitionPaymentFragmentbindingInflater1(VocationTrainingRequest vocationTrainingRequest) {
        Intrinsics.checkNotNullParameter(vocationTrainingRequest, "");
        deriveCodec<List<TrainingItem>> vocationTrainings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getVocationTrainings(vocationTrainingRequest);
        final Function1 function1 = new Function1() { // from class: isOrderedSelection
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getMaxItems
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(vocationTrainings, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<setMediaCapabilitiesForTranscoding> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AccountNameSimilarityRequest accountNameSimilarityRequest) {
        Intrinsics.checkNotNullParameter(accountNameSimilarityRequest, "");
        deriveCodec<AccountSimilarityItem> derivecodecCheckAccountNameSimilarity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkAccountNameSimilarity(accountNameSimilarityRequest);
        final Function1 function1 = new Function1() { // from class: setOrderedSelectionactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault1((AccountSimilarityItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PickVisualMediaRequestBuilder
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckAccountNameSimilarity, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<Bank>> b(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<BankItem>> bankList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getBankList(baseRequest);
        final Function1 function1 = new Function1() { // from class: setCustomAccentColorAppliedactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setDefaultTabactivity
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(bankList, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<TrainingField>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrainingFieldRequest trainingFieldRequest) {
        Intrinsics.checkNotNullParameter(trainingFieldRequest, "");
        deriveCodec<List<ExpertiseFieldItem>> expertiseField = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getExpertiseField(trainingFieldRequest);
        final Function1 function1 = new Function1() { // from class: IntentSenderRequestCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.asInterface((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDefaultTab
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.cancel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(expertiseField, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>> b(BlkProfileRequest blkProfileRequest) {
        Intrinsics.checkNotNullParameter(blkProfileRequest, "");
        deriveCodec<BlkProfileResponse> blkProfile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getBlkProfile(blkProfileRequest);
        final Function1 function1 = new Function1() { // from class: setMediaCapabilitiesForTranscodingactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.b((BlkProfileResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setMaxItemsactivity
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(blkProfile, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<BaseModel> b(VocationRegisterRequest vocationRegisterRequest) {
        Intrinsics.checkNotNullParameter(vocationRegisterRequest, "");
        deriveCodec<BaseItem> derivecodecRegister = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.register(vocationRegisterRequest);
        final Function1 function1 = new Function1() { // from class: isCustomAccentColorApplied
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getMediaCapabilitiesForTranscoding
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecRegister, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationPhoneVerificationRequest vocationPhoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(vocationPhoneVerificationRequest, "");
        deriveCodec<VerificationItem> derivecodecVerifyPhoneNumber = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyPhoneNumber(vocationPhoneVerificationRequest);
        final Function1 function1 = new Function1() { // from class: setFillInIntent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentbindingInflater1((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: PickVisualMediaRequest
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyPhoneNumber, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<List<ActivityResultContractSynchronousResult>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<SurveyItem>> surveys = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getSurveys(baseRequest);
        final Function1 function1 = new Function1() { // from class: PickVisualMediaRequestKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getFlagsValues
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(surveys, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.setMaxItems
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault1(SaveSurveyRequest saveSurveyRequest) {
        Intrinsics.checkNotNullParameter(saveSurveyRequest, "");
        deriveCodec<BaseItem> derivecodecSaveSurvey = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.saveSurvey(saveSurveyRequest);
        final Function1 function1 = new Function1() { // from class: getIntentSender
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getMediaType
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getFlagsMask.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecSaveSurvey, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ VocationProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VocationProfile) function1.invoke(obj);
    }

    public static /* synthetic */ Pair b(BlkProfileResponse blkProfileResponse) {
        ArrayList arrayListEmptyList;
        ArrayList arrayListEmptyList2;
        Intrinsics.checkNotNullParameter(blkProfileResponse, "");
        Intrinsics.checkNotNullParameter(blkProfileResponse, "");
        List<BlkProfileItem> blkProfileItem = blkProfileResponse.getBlkProfileItem();
        if (blkProfileItem != null) {
            List<BlkProfileItem> list = blkProfileItem;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (BlkProfileItem blkProfileItem2 : list) {
                Intrinsics.checkNotNullParameter(blkProfileItem2, "");
                String address = blkProfileItem2.getAddress();
                String str = address == null ? "" : address;
                String bankCode = blkProfileItem2.getBankCode();
                String str2 = bankCode == null ? "" : bankCode;
                String email = blkProfileItem2.getEmail();
                String str3 = email == null ? "" : email;
                String contactNumber = blkProfileItem2.getContactNumber();
                String str4 = contactNumber == null ? "" : contactNumber;
                String operationalPermit = blkProfileItem2.getOperationalPermit();
                String str5 = operationalPermit == null ? "" : operationalPermit;
                String blkCode = blkProfileItem2.getBlkCode();
                String str6 = blkCode == null ? "" : blkCode;
                String ownershipCode = blkProfileItem2.getOwnershipCode();
                String str7 = ownershipCode == null ? "" : ownershipCode;
                String permitExpiration = blkProfileItem2.getPermitExpiration();
                String str8 = permitExpiration == null ? "" : permitExpiration;
                String bankName = blkProfileItem2.getBankName();
                String str9 = bankName == null ? "" : bankName;
                String blkName = blkProfileItem2.getBlkName();
                String str10 = blkName == null ? "" : blkName;
                String accountName = blkProfileItem2.getAccountName();
                String str11 = accountName == null ? "" : accountName;
                String contactName = blkProfileItem2.getContactName();
                String str12 = contactName == null ? "" : contactName;
                String ownerName = blkProfileItem2.getOwnerName();
                String str13 = ownerName == null ? "" : ownerName;
                String accountNumber = blkProfileItem2.getAccountNumber();
                String str14 = accountNumber == null ? "" : accountNumber;
                String phoneNumber = blkProfileItem2.getPhoneNumber();
                String str15 = phoneNumber == null ? "" : phoneNumber;
                String npp = blkProfileItem2.getNpp();
                String str16 = npp == null ? "" : npp;
                String npwp = blkProfileItem2.getNpwp();
                arrayList.add(new PickVisualMediaRequestdefault(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, npwp == null ? "" : npwp));
            }
            arrayListEmptyList = arrayList;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        List<IksBlkItem> iksBlkList = blkProfileResponse.getIksBlkList();
        if (iksBlkList != null) {
            List<IksBlkItem> list2 = iksBlkList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (IksBlkItem iksBlkItem : list2) {
                Intrinsics.checkNotNullParameter(iksBlkItem, "");
                String iksEnd = iksBlkItem.getIksEnd();
                String str17 = iksEnd == null ? "" : iksEnd;
                String iksStart = iksBlkItem.getIksStart();
                String str18 = iksStart == null ? "" : iksStart;
                String blkIksCode = iksBlkItem.getBlkIksCode();
                String str19 = blkIksCode == null ? "" : blkIksCode;
                String iksNumber = iksBlkItem.getIksNumber();
                String str20 = iksNumber == null ? "" : iksNumber;
                String activeStatus = iksBlkItem.getActiveStatus();
                arrayList2.add(new getSynchronousResult(str17, str18, str19, str20, activeStatus == null ? "" : activeStatus));
            }
            arrayListEmptyList2 = arrayList2;
        } else {
            arrayListEmptyList2 = CollectionsKt.emptyList();
        }
        return new Pair(arrayListEmptyList, arrayListEmptyList2);
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

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<SurveyItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (SurveyItem surveyItem : list2) {
            Intrinsics.checkNotNullParameter(surveyItem, "");
            String remarks = surveyItem.getRemarks();
            if (remarks == null) {
                remarks = "";
            }
            String surveyCode = surveyItem.getSurveyCode();
            if (surveyCode == null) {
                surveyCode = "";
            }
            String surveyName = surveyItem.getSurveyName();
            if (surveyName == null) {
                surveyName = "";
            }
            arrayList.add(new ActivityResultContractSynchronousResult(remarks, surveyCode, surveyName));
        }
        return arrayList;
    }

    public static /* synthetic */ VocationProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationProfileItem vocationProfileItem) {
        Intrinsics.checkNotNullParameter(vocationProfileItem, "");
        Intrinsics.checkNotNullParameter(vocationProfileItem, "");
        String presence = vocationProfileItem.getPresence();
        String str = presence == null ? "" : presence;
        String address = vocationProfileItem.getAddress();
        String str2 = address == null ? "" : address;
        String officeAddress = vocationProfileItem.getOfficeAddress();
        String str3 = officeAddress == null ? "" : officeAddress;
        String bankCode = vocationProfileItem.getBankCode();
        String str4 = bankCode == null ? "" : bankCode;
        String email = vocationProfileItem.getEmail();
        String str5 = email == null ? "" : email;
        String result = vocationProfileItem.getResult();
        String str6 = result == null ? "" : result;
        String gender = vocationProfileItem.getGender();
        String str7 = gender == null ? "" : gender;
        String trainingType = vocationProfileItem.getTrainingType();
        String str8 = trainingType == null ? "" : trainingType;
        String remarks = vocationProfileItem.getRemarks();
        String str9 = remarks == null ? "" : remarks;
        String iksBlkDtlCode = vocationProfileItem.getIksBlkDtlCode();
        String str10 = iksBlkDtlCode == null ? "" : iksBlkDtlCode;
        String scheduleCode = vocationProfileItem.getScheduleCode();
        String str11 = scheduleCode == null ? "" : scheduleCode;
        String officeCode = vocationProfileItem.getOfficeCode();
        String str12 = officeCode == null ? "" : officeCode;
        String externalEmployeeCode = vocationProfileItem.getExternalEmployeeCode();
        String str13 = externalEmployeeCode == null ? "" : externalEmployeeCode;
        String trainingCode = vocationProfileItem.getTrainingCode();
        String str14 = trainingCode == null ? "" : trainingCode;
        String registrationCode = vocationProfileItem.getRegistrationCode();
        String str15 = registrationCode == null ? "" : registrationCode;
        String tkCode = vocationProfileItem.getTkCode();
        String str16 = tkCode == null ? "" : tkCode;
        String kpj = vocationProfileItem.getKpj();
        String str17 = kpj == null ? "" : kpj;
        String name = vocationProfileItem.getName();
        String str18 = name == null ? "" : name;
        String blkName = vocationProfileItem.getBlkName();
        String str19 = blkName == null ? "" : blkName;
        String bankBranchOfficeName = vocationProfileItem.getBankBranchOfficeName();
        String str20 = bankBranchOfficeName == null ? "" : bankBranchOfficeName;
        String accountName = vocationProfileItem.getAccountName();
        String str21 = accountName == null ? "" : accountName;
        String officeName = vocationProfileItem.getOfficeName();
        String str22 = officeName == null ? "" : officeName;
        String trainingName = vocationProfileItem.getTrainingName();
        String str23 = trainingName == null ? "" : trainingName;
        String nik = vocationProfileItem.getNik();
        String str24 = nik == null ? "" : nik;
        String score = vocationProfileItem.getScore();
        String str25 = score == null ? "" : score;
        String phoneNumber = vocationProfileItem.getPhoneNumber();
        String str26 = phoneNumber == null ? "" : phoneNumber;
        String accountNumber = vocationProfileItem.getAccountNumber();
        String str27 = accountNumber == null ? "" : accountNumber;
        String npwp = vocationProfileItem.getNpwp();
        String str28 = npwp == null ? "" : npwp;
        String formalEducation = vocationProfileItem.getFormalEducation();
        String str29 = formalEducation == null ? "" : formalEducation;
        String nonFormalEducation = vocationProfileItem.getNonFormalEducation();
        String str30 = nonFormalEducation == null ? "" : nonFormalEducation;
        String wagePreference = vocationProfileItem.getWagePreference();
        String str31 = wagePreference == null ? "" : wagePreference;
        String activeStatus = vocationProfileItem.getActiveStatus();
        boolean z = activeStatus != null && StringsKt.equals(activeStatus, "Y", true);
        String confirmationStatus = vocationProfileItem.getConfirmationStatus();
        boolean z2 = confirmationStatus != null && StringsKt.equals(confirmationStatus, "Y", true);
        String ratingStatus = vocationProfileItem.getRatingStatus();
        boolean z3 = ratingStatus != null && StringsKt.equals(ratingStatus, "Y", true);
        String trainingEndDate = vocationProfileItem.getTrainingEndDate();
        String str32 = trainingEndDate == null ? "" : trainingEndDate;
        String activeDate = vocationProfileItem.getActiveDate();
        String str33 = activeDate == null ? "" : activeDate;
        String confirmationDate = vocationProfileItem.getConfirmationDate();
        String str34 = confirmationDate == null ? "" : confirmationDate;
        String birthdate = vocationProfileItem.getBirthdate();
        String str35 = birthdate == null ? "" : birthdate;
        String bankName = vocationProfileItem.getBankName();
        return new VocationProfile(str, str2, str3, str4, bankName == null ? "" : bankName, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, z, z2, z3, str32, str33, str34, str35);
    }

    public static /* synthetic */ setMediaCapabilitiesForTranscoding b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (setMediaCapabilitiesForTranscoding) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<BankItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BankItem bankItem : list2) {
            Intrinsics.checkNotNullParameter(bankItem, "");
            String bankCode = bankItem.getBankCode();
            if (bankCode == null) {
                bankCode = "";
            }
            String centralBankCode = bankItem.getCentralBankCode();
            if (centralBankCode == null) {
                centralBankCode = "";
            }
            String bankName = bankItem.getBankName();
            if (bankName == null) {
                bankName = "";
            }
            String transferType = bankItem.getTransferType();
            if (transferType == null) {
                transferType = "";
            }
            arrayList.add(new Bank(bankCode, centralBankCode, bankName, transferType));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<TrainingItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (TrainingItem trainingItem : list2) {
            Intrinsics.checkNotNullParameter(trainingItem, "");
            String iksEnd = trainingItem.getIksEnd();
            String str = iksEnd == null ? "" : iksEnd;
            String iksStart = trainingItem.getIksStart();
            String str2 = iksStart == null ? "" : iksStart;
            String trainingDuration = trainingItem.getTrainingDuration();
            String str3 = trainingDuration == null ? "" : trainingDuration;
            String trainingType = trainingItem.getTrainingType();
            String str4 = trainingType == null ? "" : trainingType;
            String remarks = trainingItem.getRemarks();
            String str5 = remarks == null ? "" : remarks;
            String blkCode = trainingItem.getBlkCode();
            String str6 = blkCode == null ? "" : blkCode;
            String iksBlkDetilCode = trainingItem.getIksBlkDetilCode();
            String str7 = iksBlkDetilCode == null ? "" : iksBlkDetilCode;
            String cityCode = trainingItem.getCityCode();
            String str8 = cityCode == null ? "" : cityCode;
            String trainingCode = trainingItem.getTrainingCode();
            String str9 = trainingCode == null ? "" : trainingCode;
            String module = trainingItem.getModule();
            String str10 = module == null ? "" : module;
            String blkName = trainingItem.getBlkName();
            String str11 = blkName == null ? "" : blkName;
            String cityName = trainingItem.getCityName();
            String str12 = cityName == null ? "" : cityName;
            String trainingName = trainingItem.getTrainingName();
            String str13 = trainingName == null ? "" : trainingName;
            String no = trainingItem.getNo();
            String str14 = no == null ? "" : no;
            String unscheduledRegistration = trainingItem.getUnscheduledRegistration();
            String str15 = unscheduledRegistration == null ? "" : unscheduledRegistration;
            String scheduledRegistration = trainingItem.getScheduledRegistration();
            String str16 = scheduledRegistration == null ? "" : scheduledRegistration;
            String rate = trainingItem.getRate();
            String str17 = rate == null ? "" : rate;
            String numberOfApplicants = trainingItem.getNumberOfApplicants();
            arrayList.add(new Training(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, numberOfApplicants == null ? "" : numberOfApplicants));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ setMediaCapabilitiesForTranscoding TuitionPaymentFragmentspecialinlinedviewModeldefault1(AccountSimilarityItem accountSimilarityItem) {
        Intrinsics.checkNotNullParameter(accountSimilarityItem, "");
        Intrinsics.checkNotNullParameter(accountSimilarityItem, "");
        Float score = accountSimilarityItem.getScore();
        return new setMediaCapabilitiesForTranscoding(score != null ? score.floatValue() : 0.0f);
    }

    public static /* synthetic */ BaseModel a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ List g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Verification TuitionPaymentFragmentbindingInflater1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return BackHandlerKtExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(verificationItem);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ Pair asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ List d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
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

    public static /* synthetic */ List cancel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List asInterface(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ExpertiseFieldItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ExpertiseFieldItem expertiseFieldItem : list2) {
            Intrinsics.checkNotNullParameter(expertiseFieldItem, "");
            String trainingCode = expertiseFieldItem.getTrainingCode();
            if (trainingCode == null) {
                trainingCode = "";
            }
            String trainingName = expertiseFieldItem.getTrainingName();
            if (trainingName == null) {
                trainingName = "";
            }
            arrayList.add(new TrainingField(trainingCode, trainingName));
        }
        return arrayList;
    }

    public static /* synthetic */ List onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Verification notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Verification) function1.invoke(obj);
    }
}
