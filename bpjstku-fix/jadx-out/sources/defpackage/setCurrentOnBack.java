package defpackage;

import com.bpjstku.data.scholarship.ScholarRepository;
import com.bpjstku.data.scholarship.model.request.Penerima;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest;
import com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducation;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipHistoryItem;
import com.bpjstku.data.scholarship.model.response.ScholarshipHistoryListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class setCurrentOnBack implements ManagedActivityResultLauncher {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final ScholarRepository b;

    public setCurrentOnBack(ScholarRepository scholarRepository) {
        Intrinsics.checkNotNullParameter(scholarRepository, "");
        this.b = scholarRepository;
        this.TuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<List<ScholarshipEducationListResponse>> b(ScholarshipEducationListRequest scholarshipEducationListRequest) {
        Intrinsics.checkNotNullParameter(scholarshipEducationListRequest, "");
        deriveCodec<ScholarshipEducationResponse> educationList = this.b.getEducationList(new ScholarshipEducationListRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipEducationListRequest.getNikPelapor(), this.TuitionPaymentFragmentbindingInflater1), scholarshipEducationListRequest.getEmail(), scholarshipEducationListRequest.getNikPenerima().length() > 0 ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipEducationListRequest.getNikPenerima(), this.TuitionPaymentFragmentbindingInflater1) : "", scholarshipEducationListRequest.getKodeKlaim()));
        final Function1 function1 = new Function1() { // from class: LocalFullyDrawnReporterOwnerExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.b((ScholarshipEducationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalOnBackPressedDispatcherOwnerlambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(educationList, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<List<ScholarBenefit>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipHistoryRequest scholarshipHistoryRequest) {
        Intrinsics.checkNotNullParameter(scholarshipHistoryRequest, "");
        deriveCodec<ScholarshipHistoryListResponse> historyList = this.b.getHistoryList(new ScholarshipHistoryRequest(scholarshipHistoryRequest.getEmail(), scholarshipHistoryRequest.getNikPenerima().length() > 0 ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipHistoryRequest.getNikPenerima(), this.TuitionPaymentFragmentbindingInflater1) : ""));
        final Function1 function1 = new Function1() { // from class: provides
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ScholarshipHistoryListResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getCurrent
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(historyList, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<List<ScholarPerson>> b(ScholarshipBenefitListRequest scholarshipBenefitListRequest) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitListRequest, "");
        deriveCodec<ScholarshipBenefitListResponse> benefitPersonList = this.b.getBenefitPersonList(scholarshipBenefitListRequest);
        final Function1 function1 = new Function1() { // from class: r8lambdawBFRk42QbGMzH6KGUFS_2JEBCf4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentbindingInflater1((ScholarshipBenefitListResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalFullyDrawnReporterOwner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(benefitPersonList, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarPersonDetail> TuitionPaymentFragmentbindingInflater1(ScholarshipBenefitRequest scholarshipBenefitRequest) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitRequest, "");
        deriveCodec<ScholarshipBenefitResponse> benefitPerson = this.b.getBenefitPerson(scholarshipBenefitRequest);
        final Function1 function1 = new Function1() { // from class: LocalCompositionlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.b((ScholarshipBenefitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalActivityResultRegistryOwnerExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(benefitPerson, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarshipEligibleResponse> b(ScholarshipEligibleRequest scholarshipEligibleRequest) {
        Intrinsics.checkNotNullParameter(scholarshipEligibleRequest, "");
        deriveCodec<ScholarshipEligibleResponse> eligible = this.b.getEligible(scholarshipEligibleRequest);
        final Function1 function1 = new Function1() { // from class: getLocalActivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ScholarshipEligibleResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalActivityKtExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(eligible, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarshipDocumentResponse> b(File file, String str, PredictiveBackHandlerKt predictiveBackHandlerKt) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(predictiveBackHandlerKt, "");
        ScholarRepository scholarRepository = this.b;
        Intrinsics.checkNotNullParameter(predictiveBackHandlerKt, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chId", RequestBody.INSTANCE.create(predictiveBackHandlerKt.getChannelId(), MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("email", RequestBody.INSTANCE.create(predictiveBackHandlerKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1, MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("kodePengajuan", RequestBody.INSTANCE.create(predictiveBackHandlerKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2, MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("noUrut", RequestBody.INSTANCE.create(predictiveBackHandlerKt.TuitionPaymentFragmentbindingInflater1, MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("kodeDokumen", RequestBody.INSTANCE.create(predictiveBackHandlerKt.b, MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("isUpdate", RequestBody.INSTANCE.create(predictiveBackHandlerKt.TuitionPaymentFragmentspecialinlinedviewModeldefault3, MediaType.INSTANCE.get("text/plain")));
        linkedHashMap.put("pathFile", RequestBody.INSTANCE.create(predictiveBackHandlerKt.a, MediaType.INSTANCE.get("text/plain")));
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter("file", "");
        return scholarRepository.uploadProve(linkedHashMap, MultipartBody.Part.INSTANCE.createFormData("file", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(str))));
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarshipInsertResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipInsertRequest scholarshipInsertRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(scholarshipInsertRequest, "");
        deriveCodec<ScholarshipInsertResponse> derivecodecInsertScholarship = this.b.insertScholarship(new ScholarshipInsertRequest(scholarshipInsertRequest.getEmailPelapor(), scholarshipInsertRequest.getKodeKlaim(), scholarshipInsertRequest.getKodeKlaimAkhir(), scholarshipInsertRequest.getNikPeserta(), scholarshipInsertRequest.getNikPelapor(), scholarshipInsertRequest.getNamaPelapor(), scholarshipInsertRequest.getTglLahirPelapor(), scholarshipInsertRequest.getNoUrutPenerima(), scholarshipInsertRequest.getAmount(), scholarshipInsertRequest.getMasihSekolah(), scholarshipInsertRequest.getStatusNaik(), scholarshipInsertRequest.getTahunBeasiswa(), scholarshipInsertRequest.getLembagaPendidikan(), scholarshipInsertRequest.getOldLembagaPendidikan(), scholarshipInsertRequest.getJenjangPendidikan(), scholarshipInsertRequest.getOldJenjangPendidikan(), scholarshipInsertRequest.getTingkatPendidikan(), scholarshipInsertRequest.getOldTingkatPendidikan(), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipInsertRequest.getSkorManipulation(), this.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipInsertRequest.getSkorLive(), this.TuitionPaymentFragmentbindingInflater1), scholarshipInsertRequest.getPhotoLiveness1(), scholarshipInsertRequest.getPhotoLiveness2(), scholarshipInsertRequest.getPhotoLiveness3(), scholarshipInsertRequest.getDataDokumenBeasiswa1(), scholarshipInsertRequest.getDataDokumenBeasiswa2(), scholarshipInsertRequest.getDataDokumenBeasiswa3()));
        final Function1 function1 = new Function1() { // from class: getContract
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ScholarshipInsertResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaRl8XqmM9xvRKsFiHyJMmCCg3M
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecInsertScholarship, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarshipVerificationResponse> b(String str, ScholarshipFmRequest scholarshipFmRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scholarshipFmRequest, "");
        String signature = scholarshipFmRequest.getSignature();
        String email = scholarshipFmRequest.getEmail();
        String brand = scholarshipFmRequest.getBrand();
        String deviceId = scholarshipFmRequest.getDeviceId();
        String model = scholarshipFmRequest.getModel();
        String manufacture = scholarshipFmRequest.getManufacture();
        String sdk = scholarshipFmRequest.getSdk();
        File file = scholarshipFmRequest.getFile();
        File file2 = scholarshipFmRequest.getFile2();
        File file3 = scholarshipFmRequest.getFile3();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scholarshipFmRequest.getFlData(), this.TuitionPaymentFragmentbindingInflater1);
        String kodeKlaim = scholarshipFmRequest.getKodeKlaim();
        String nikPekerja = scholarshipFmRequest.getNikPekerja();
        String transactionIdSdk = scholarshipFmRequest.getTransactionIdSdk();
        String scoreLiveness = scholarshipFmRequest.getScoreLiveness();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = scoreLiveness != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreLiveness, this.TuitionPaymentFragmentbindingInflater1) : null;
        String scoreManipulation = scholarshipFmRequest.getScoreManipulation();
        deriveCodec<ScholarshipVerificationResponse> derivecodecFacematchScholarship = this.b.facematchScholarship(new ScholarshipFmRequest(signature, email, brand, deviceId, model, manufacture, sdk, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, file, file2, file3, kodeKlaim, nikPekerja, transactionIdSdk, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, scoreManipulation != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreManipulation, this.TuitionPaymentFragmentbindingInflater1) : null));
        final Function1 function1 = new Function1() { // from class: LocalActivitylambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ScholarshipVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalOnBackPressedDispatcherOwner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecFacematchScholarship, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ScholarshipFmResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipFmBeginRequest scholarshipFmBeginRequest) {
        Intrinsics.checkNotNullParameter(scholarshipFmBeginRequest, "");
        deriveCodec<ScholarshipFmResponse> derivecodecFacematchBeginScholarship = this.b.facematchBeginScholarship(scholarshipFmBeginRequest);
        final LocalActivityResultRegistryOwner localActivityResultRegistryOwner = new LocalActivityResultRegistryOwner();
        readableMs readablems = new readableMs() { // from class: r8lambdaZboyhwMBcCFOYz7yYNav9JBYw
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(localActivityResultRegistryOwner, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecFacematchBeginScholarship, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<ScholarPersonDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.b.setScholarDetailList(list);
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final List<ScholarPersonDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b.getScholarDetailList();
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final ScholarshipEligibleResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b.getEligibleResponse();
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipEligibleResponse scholarshipEligibleResponse) {
        this.b.setEligibleResponse(scholarshipEligibleResponse);
    }

    @Override // defpackage.ManagedActivityResultLauncher
    public final deriveCodec<ConfirmResponse> b(UpdateConfirmationRequest updateConfirmationRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(updateConfirmationRequest, "");
        String emailPelapor = updateConfirmationRequest.getEmailPelapor();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getNikTk(), this.TuitionPaymentFragmentbindingInflater1);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getNamaPelapor(), this.TuitionPaymentFragmentbindingInflater1);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getNikPelapor(), this.TuitionPaymentFragmentbindingInflater1);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getTglLahirPelapor(), this.TuitionPaymentFragmentbindingInflater1);
        String kodePengajuan = updateConfirmationRequest.getKodePengajuan();
        List<Penerima> dataPenerima = updateConfirmationRequest.getDataPenerima();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataPenerima, 10));
        for (Penerima penerima : dataPenerima) {
            arrayList.add(Penerima.copy$default(penerima, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, penerima.getNikPenerima(), this.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, penerima.getNamaPenerima(), this.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, createCameraSelectorById.b(penerima.getTglLahirPenerima()), this.TuitionPaymentFragmentbindingInflater1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null));
        }
        deriveCodec<ConfirmResponse> derivecodecUpdateConfirmation = this.b.updateConfirmation(new UpdateConfirmationRequest(emailPelapor, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, kodePengajuan, arrayList, updateConfirmationRequest.getPhotoLiveness1(), updateConfirmationRequest.getPhotoLiveness2(), updateConfirmationRequest.getPhotoLiveness3(), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getScoreLiveness(), this.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, updateConfirmationRequest.getScoreManipulation(), this.TuitionPaymentFragmentbindingInflater1)));
        final Function1 function1 = new Function1() { // from class: LocalFullyDrawnReporterOwnerlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCurrentOnBack.b((ConfirmResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaaTOGOAF76NLQQoannI7OSKsbI50
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return setCurrentOnBack.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecUpdateConfirmation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ ScholarPersonDetail TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarPersonDetail) function1.invoke(obj);
    }

    public static /* synthetic */ ScholarshipEligibleResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipEligibleResponse scholarshipEligibleResponse) {
        Intrinsics.checkNotNullParameter(scholarshipEligibleResponse, "");
        return scholarshipEligibleResponse;
    }

    public static /* synthetic */ ScholarPersonDetail b(ScholarshipBenefitResponse scholarshipBenefitResponse) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitResponse, "");
        List<ScholarshipBenefitPerson> personBenefitList = scholarshipBenefitResponse.getPersonBenefitList();
        if (personBenefitList == null) {
            personBenefitList = CollectionsKt.emptyList();
        }
        Iterator<ScholarshipBenefitPerson> it = personBenefitList.iterator();
        if (it.hasNext()) {
            return LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(it.next(), "", "");
        }
        return null;
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(ScholarshipBenefitListResponse scholarshipBenefitListResponse) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitListResponse, "");
        ArrayList arrayList = new ArrayList();
        List<ScholarshipBenefitPersonForList> personBenefitList = scholarshipBenefitListResponse.getPersonBenefitList();
        if (personBenefitList == null) {
            personBenefitList = CollectionsKt.emptyList();
        }
        for (ScholarshipBenefitPersonForList scholarshipBenefitPersonForList : personBenefitList) {
            Intrinsics.checkNotNullParameter(scholarshipBenefitPersonForList, "");
            String namaPenerima = scholarshipBenefitPersonForList.getNamaPenerima();
            String str = namaPenerima == null ? "" : namaPenerima;
            String kodeKlaim = scholarshipBenefitPersonForList.getKodeKlaim();
            String str2 = kodeKlaim == null ? "" : kodeKlaim;
            String nikPenerima = scholarshipBenefitPersonForList.getNikPenerima();
            arrayList.add(new ScholarPerson(str, str2, nikPenerima == null ? "" : nikPenerima, null, null, null, null, 120, null));
        }
        return arrayList;
    }

    public static /* synthetic */ ScholarshipVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipVerificationResponse scholarshipVerificationResponse) {
        Intrinsics.checkNotNullParameter(scholarshipVerificationResponse, "");
        Intrinsics.checkNotNullParameter(scholarshipVerificationResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return new ScholarshipVerificationResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarshipVerificationResponse.isSuspend(), strB), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarshipVerificationResponse.isSuccessful(), strB), scholarshipVerificationResponse.getMessage(), scholarshipVerificationResponse.getStatusCode(), scholarshipVerificationResponse.getKodePengajuan());
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ ScholarshipFmResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipFmResponse scholarshipFmResponse) {
        Intrinsics.checkNotNullParameter(scholarshipFmResponse, "");
        Intrinsics.checkNotNullParameter(scholarshipFmResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strIsSuccessful = scholarshipFmResponse.isSuccessful();
        if (strIsSuccessful == null) {
            strIsSuccessful = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIsSuccessful, strB);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String strIsSuspend = scholarshipFmResponse.isSuspend();
        return new ScholarshipFmResponse(null, scholarshipFmResponse.getScore(), scholarshipFmResponse.getScoreLive(), strTuitionPaymentFragmentspecialinlinedviewModeldefault3, companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIsSuspend != null ? strIsSuspend : "", strB), scholarshipFmResponse.getMessage(), 1, null);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipHistoryListResponse scholarshipHistoryListResponse) {
        Intrinsics.checkNotNullParameter(scholarshipHistoryListResponse, "");
        ArrayList arrayList = new ArrayList();
        ScholarshipHistoryItem data = scholarshipHistoryListResponse.getData();
        List<ScholarshipEducation> tingkatPendidikan = data != null ? data.getTingkatPendidikan() : null;
        if (tingkatPendidikan == null) {
            tingkatPendidikan = CollectionsKt.emptyList();
        }
        for (ScholarshipEducation scholarshipEducation : tingkatPendidikan) {
            Intrinsics.checkNotNullParameter(scholarshipEducation, "");
            String tahun = scholarshipEducation.getTahun();
            String str = tahun == null ? "" : tahun;
            String jenjang = scholarshipEducation.getJenjang();
            String tingkat = scholarshipEducation.getTingkat();
            StringBuilder sb = new StringBuilder();
            sb.append(jenjang);
            sb.append(" / ");
            sb.append(tingkat);
            String string = sb.toString();
            String manfaat = scholarshipEducation.getManfaat();
            String str2 = manfaat == null ? "" : manfaat;
            String jenisBeasiswa = scholarshipEducation.getJenisBeasiswa();
            String str3 = jenisBeasiswa == null ? "" : jenisBeasiswa;
            String lembaga = scholarshipEducation.getLembaga();
            arrayList.add(new ScholarBenefit(str, string, str2, str3, lembaga == null ? "" : lembaga, scholarshipEducation.getTanggal(), scholarshipEducation.getFlag()));
        }
        return arrayList;
    }

    public static /* synthetic */ ScholarshipFmResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipFmResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ScholarshipVerificationResponse b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ConfirmResponse b(ConfirmResponse confirmResponse) {
        Intrinsics.checkNotNullParameter(confirmResponse, "");
        return confirmResponse;
    }

    public static /* synthetic */ List b(ScholarshipEducationResponse scholarshipEducationResponse) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(scholarshipEducationResponse, "");
        List<ScholarshipEducationListResponse> data = scholarshipEducationResponse.getData();
        if (data == null) {
            return null;
        }
        List<ScholarshipEducationListResponse> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ScholarshipEducationListResponse scholarshipEducationListResponse : list) {
            Intrinsics.checkNotNullParameter(scholarshipEducationListResponse, "");
            String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String nikPenerima = scholarshipEducationListResponse.getNikPenerima();
            if (nikPenerima == null) {
                nikPenerima = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nikPenerima, strB);
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String namaPenerima = scholarshipEducationListResponse.getNamaPenerima();
            if (namaPenerima == null) {
                namaPenerima = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaPenerima, strB);
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String tempatLahir = scholarshipEducationListResponse.getTempatLahir();
            if (tempatLahir == null) {
                tempatLahir = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tempatLahir, strB);
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String tglLahir = scholarshipEducationListResponse.getTglLahir();
            if (tglLahir == null) {
                tglLahir = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tglLahir, strB);
            List<ScholarshipEducation> tingkatPendidikan = scholarshipEducationListResponse.getTingkatPendidikan();
            if (tingkatPendidikan != null) {
                List<ScholarshipEducation> list2 = tingkatPendidikan;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add((ScholarshipEducation) it.next());
                }
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            arrayList.add(new ScholarshipEducationListResponse(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, listEmptyList));
        }
        return arrayList;
    }

    public static /* synthetic */ ScholarshipInsertResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipInsertResponse) function1.invoke(obj);
    }

    public static /* synthetic */ ScholarshipInsertResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipInsertResponse scholarshipInsertResponse) {
        Intrinsics.checkNotNullParameter(scholarshipInsertResponse, "");
        return scholarshipInsertResponse;
    }

    public static /* synthetic */ ScholarshipEligibleResponse g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipEligibleResponse) function1.invoke(obj);
    }

    public static /* synthetic */ List a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ ConfirmResponse d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ConfirmResponse) function1.invoke(obj);
    }

    public static /* synthetic */ List asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}
