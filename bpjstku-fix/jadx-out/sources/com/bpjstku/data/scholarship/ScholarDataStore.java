package com.bpjstku.data.scholarship;

import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInfoRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest;
import com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipHistoryListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInfoResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.data.scholarship.remote.ScholarApi;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.google.gson.Gson;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\t\u0012\u00070!¢\u0006\u0002\b\"0\u001f2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u0002062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020504H\u0017¢\u0006\u0004\b9\u0010:J\u0011\u0010;\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0002062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00072\u0006\u0010\u0003\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BR\u001c\u0010D\u001a\u0004\u0018\u00010C8\u0017X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010O"}, d2 = {"Lcom/bpjstku/data/scholarship/ScholarDataStore;", "Lcom/bpjstku/data/scholarship/ScholarRepository;", "Lcom/bpjstku/data/scholarship/remote/ScholarApi;", "p0", "<init>", "(Lcom/bpjstku/data/scholarship/remote/ScholarApi;)V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;", "LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationResponse;", "getEducationList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryListResponse;", "getHistoryList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "getBenefitPersonList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "getBenefitPerson", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "getEligible", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "getInfo", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "uploadProve", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "insertScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "facematchScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "facematchBeginScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;)LderiveCodec;", "", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "", "setScholarDetailList", "(Ljava/util/List;)V", "getScholarDetailList", "()Ljava/util/List;", "getEligibleResponse", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "setEligibleResponse", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;)V", "Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;", "Lcom/bpjstku/data/scholarship/model/response/ConfirmResponse;", "updateConfirmation", "(Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;)LderiveCodec;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/scholarship/remote/ScholarApi;", "getWebService", "()Lcom/bpjstku/data/scholarship/remote/ScholarApi;", "scholarDetailListCache", "Ljava/util/List;", "eligibleResponse", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarDataStore implements ScholarRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private ScholarshipEligibleResponse eligibleResponse;
    private List<ScholarPersonDetail> scholarDetailListCache;
    private final ScholarApi webService;

    public ScholarDataStore(ScholarApi scholarApi) {
        Intrinsics.checkNotNullParameter(scholarApi, "");
        this.webService = scholarApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7761getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final ScholarApi m7762getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipEducationResponse> getEducationList(ScholarshipEducationListRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipEducationResponse>> educationList = m7762getWebService().getEducationList(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(educationList, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getEducationList$lambda$0((ScholarshipEducationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getEducationList$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipEducationResponse getEducationList$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipEducationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipHistoryListResponse> getHistoryList(ScholarshipHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipHistoryListResponse>> historyList = m7762getWebService().getHistoryList(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(historyList, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getHistoryList$lambda$2((ScholarshipHistoryListResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getHistoryList$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipHistoryListResponse getHistoryList$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipHistoryListResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipBenefitListResponse> getBenefitPersonList(ScholarshipBenefitListRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipBenefitListResponse>> benefitPersonList = m7762getWebService().getBenefitPersonList(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(benefitPersonList, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getBenefitPersonList$lambda$4((ScholarshipBenefitListResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getBenefitPersonList$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipBenefitListResponse getBenefitPersonList$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipBenefitListResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipBenefitResponse> getBenefitPerson(ScholarshipBenefitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipBenefitResponse>> benefitPerson = m7762getWebService().getBenefitPerson(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(benefitPerson, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getBenefitPerson$lambda$6((ScholarshipBenefitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getBenefitPerson$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipBenefitResponse getBenefitPerson$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipBenefitResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipEligibleResponse> getEligible(ScholarshipEligibleRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipEligibleResponse>> eligible = m7762getWebService().getEligible(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(eligible, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getEligible$lambda$8((ScholarshipEligibleResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getEligible$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipEligibleResponse getEligible$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipEligibleResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipInfoResponse> getInfo(ScholarshipInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipInfoResponse>> info = m7762getWebService().getInfo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(info, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.getInfo$lambda$10((ScholarshipInfoResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.getInfo$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipInfoResponse getInfo$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipInfoResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipDocumentResponse> uploadProve(Map<String, RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<ScholarshipDocumentResponse>> derivecodecUploadProve = m7762getWebService().uploadProve(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUploadProve, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.uploadProve$lambda$12((ScholarshipDocumentResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.uploadProve$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipDocumentResponse uploadProve$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipDocumentResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipInsertResponse> insertScholarship(ScholarshipInsertRequest p0) {
        MultipartBody.Part partCreateFormData;
        MultipartBody.Part partCreateFormData2;
        MultipartBody.Part partCreateFormData3;
        MultipartBody.Part partCreateFormData4;
        MultipartBody.Part partCreateFormData5;
        MultipartBody.Part partCreateFormData6;
        Intrinsics.checkNotNullParameter(p0, "");
        ScholarApi scholarApiM7762getWebService = m7762getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File photoLiveness1 = p0.getPhotoLiveness1();
        if (photoLiveness1 == null || (partCreateFormData = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness1, "photoLiveness1")) == null) {
            partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("photoLiveness1", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File photoLiveness2 = p0.getPhotoLiveness2();
        if (photoLiveness2 == null || (partCreateFormData2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness2, "photoLiveness2")) == null) {
            partCreateFormData2 = MultipartBody.Part.INSTANCE.createFormData("photoLiveness2", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File photoLiveness3 = p0.getPhotoLiveness3();
        if (photoLiveness3 == null || (partCreateFormData3 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness3, "photoLiveness3")) == null) {
            partCreateFormData3 = MultipartBody.Part.INSTANCE.createFormData("photoLiveness3", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File dataDokumenBeasiswa1 = p0.getDataDokumenBeasiswa1();
        if (dataDokumenBeasiswa1 == null || (partCreateFormData4 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dataDokumenBeasiswa1, "dataDokumenBeasiswa1")) == null) {
            partCreateFormData4 = MultipartBody.Part.INSTANCE.createFormData("dataDokumenBeasiswa1", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File dataDokumenBeasiswa2 = p0.getDataDokumenBeasiswa2();
        if (dataDokumenBeasiswa2 == null || (partCreateFormData5 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dataDokumenBeasiswa2, "dataDokumenBeasiswa2")) == null) {
            partCreateFormData5 = MultipartBody.Part.INSTANCE.createFormData("dataDokumenBeasiswa2", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File dataDokumenBeasiswa3 = p0.getDataDokumenBeasiswa3();
        if (dataDokumenBeasiswa3 == null || (partCreateFormData6 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dataDokumenBeasiswa3, "dataDokumenBeasiswa3")) == null) {
            partCreateFormData6 = MultipartBody.Part.INSTANCE.createFormData("dataDokumenBeasiswa3", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        deriveCodec<Response<ScholarshipInsertResponse>> derivecodecInsertScholarship = scholarApiM7762getWebService.insertScholarship(partMap, partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, partCreateFormData5, partCreateFormData6);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertScholarship, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.insertScholarship$lambda$14((ScholarshipInsertResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.insertScholarship$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipInsertResponse insertScholarship$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipInsertResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipVerificationResponse> facematchScholarship(ScholarshipFmRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ScholarApi scholarApiM7762getWebService = m7762getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File file = p0.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p0.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p0.getFile3();
        deriveCodec<Response<ScholarshipVerificationResponse>> derivecodecFacematchScholarship = scholarApiM7762getWebService.facematchScholarship(partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecFacematchScholarship, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.facematchScholarship$lambda$16((ScholarshipVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.facematchScholarship$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipVerificationResponse facematchScholarship$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ScholarshipFmResponse> facematchBeginScholarship(ScholarshipFmBeginRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ScholarshipFmResponse>> derivecodecFacematchBeginScholarship = m7762getWebService().facematchBeginScholarship(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecFacematchBeginScholarship, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.facematchBeginScholarship$lambda$18((ScholarshipFmResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.facematchBeginScholarship$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipFmResponse facematchBeginScholarship$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ScholarshipFmResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final void setScholarDetailList(List<ScholarPersonDetail> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.scholarDetailListCache = p0;
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final List<ScholarPersonDetail> getScholarDetailList() {
        List<ScholarPersonDetail> list = this.scholarDetailListCache;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final ScholarshipEligibleResponse getEligibleResponse() {
        return this.eligibleResponse;
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final void setEligibleResponse(ScholarshipEligibleResponse p0) {
        this.eligibleResponse = p0;
    }

    @Override // com.bpjstku.data.scholarship.ScholarRepository
    public final deriveCodec<ConfirmResponse> updateConfirmation(UpdateConfirmationRequest p0) {
        MultipartBody.Part partCreateFormData;
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(p0, "");
        ScholarApi scholarApiM7762getWebService = m7762getWebService();
        RequestBody requestBodyCreate = RequestBody.INSTANCE.create(p0.getChannelId(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate2 = RequestBody.INSTANCE.create(p0.getNikPelapor(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate3 = RequestBody.INSTANCE.create(p0.getNamaPelapor(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate4 = RequestBody.INSTANCE.create(p0.getEmailPelapor(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate5 = RequestBody.INSTANCE.create(p0.getNikTk(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate6 = RequestBody.INSTANCE.create(p0.getTglLahirPelapor(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate7 = RequestBody.INSTANCE.create(p0.getKodePengajuan(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate8 = RequestBody.INSTANCE.create(new Gson().toJson(p0.getDataPenerima()).toString(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate9 = RequestBody.INSTANCE.create(p0.getScoreLiveness(), MediaType.INSTANCE.parse("text/plain"));
        RequestBody requestBodyCreate10 = RequestBody.INSTANCE.create(p0.getScoreManipulation(), MediaType.INSTANCE.parse("text/plain"));
        File photoLiveness1 = p0.getPhotoLiveness1();
        if (photoLiveness1 == null || (partCreateFormData = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness1, "photoLiveness1")) == null) {
            partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("photoLiveness1", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain")));
        }
        File photoLiveness2 = p0.getPhotoLiveness2();
        MultipartBody.Part partCreateFormData2 = (photoLiveness2 == null || (partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness2, "photoLiveness2")) == null) ? MultipartBody.Part.INSTANCE.createFormData("photoLiveness2", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain"))) : partTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        File photoLiveness3 = p0.getPhotoLiveness3();
        deriveCodec<Response<ConfirmResponse>> derivecodecUpdateKonfirmasi = scholarApiM7762getWebService.updateKonfirmasi(requestBodyCreate, requestBodyCreate4, requestBodyCreate5, requestBodyCreate3, requestBodyCreate2, requestBodyCreate6, requestBodyCreate7, requestBodyCreate8, requestBodyCreate9, requestBodyCreate10, partCreateFormData, partCreateFormData2, (photoLiveness3 == null || (partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(photoLiveness3, "photoLiveness3")) == null) ? MultipartBody.Part.INSTANCE.createFormData("photoLiveness3", null, RequestBody.INSTANCE.create("-", MediaType.INSTANCE.parse("text/plain"))) : partTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUpdateKonfirmasi, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarDataStore.updateConfirmation$lambda$20((ConfirmResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.scholarship.ScholarDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ScholarDataStore.updateConfirmation$lambda$21(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmResponse updateConfirmation$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ConfirmResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipFmResponse facematchBeginScholarship$lambda$18(ScholarshipFmResponse scholarshipFmResponse) {
        Intrinsics.checkNotNullParameter(scholarshipFmResponse, "");
        return scholarshipFmResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipVerificationResponse facematchScholarship$lambda$16(ScholarshipVerificationResponse scholarshipVerificationResponse) {
        Intrinsics.checkNotNullParameter(scholarshipVerificationResponse, "");
        return scholarshipVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipBenefitResponse getBenefitPerson$lambda$6(ScholarshipBenefitResponse scholarshipBenefitResponse) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitResponse, "");
        return scholarshipBenefitResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipBenefitListResponse getBenefitPersonList$lambda$4(ScholarshipBenefitListResponse scholarshipBenefitListResponse) {
        Intrinsics.checkNotNullParameter(scholarshipBenefitListResponse, "");
        return scholarshipBenefitListResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipEducationResponse getEducationList$lambda$0(ScholarshipEducationResponse scholarshipEducationResponse) {
        Intrinsics.checkNotNullParameter(scholarshipEducationResponse, "");
        return scholarshipEducationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipEligibleResponse getEligible$lambda$8(ScholarshipEligibleResponse scholarshipEligibleResponse) {
        Intrinsics.checkNotNullParameter(scholarshipEligibleResponse, "");
        return scholarshipEligibleResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipHistoryListResponse getHistoryList$lambda$2(ScholarshipHistoryListResponse scholarshipHistoryListResponse) {
        Intrinsics.checkNotNullParameter(scholarshipHistoryListResponse, "");
        return scholarshipHistoryListResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipInfoResponse getInfo$lambda$10(ScholarshipInfoResponse scholarshipInfoResponse) {
        Intrinsics.checkNotNullParameter(scholarshipInfoResponse, "");
        return scholarshipInfoResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipInsertResponse insertScholarship$lambda$14(ScholarshipInsertResponse scholarshipInsertResponse) {
        Intrinsics.checkNotNullParameter(scholarshipInsertResponse, "");
        return scholarshipInsertResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmResponse updateConfirmation$lambda$20(ConfirmResponse confirmResponse) {
        Intrinsics.checkNotNullParameter(confirmResponse, "");
        return confirmResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScholarshipDocumentResponse uploadProve$lambda$12(ScholarshipDocumentResponse scholarshipDocumentResponse) {
        Intrinsics.checkNotNullParameter(scholarshipDocumentResponse, "");
        return scholarshipDocumentResponse;
    }
}
