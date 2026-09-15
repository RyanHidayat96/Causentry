package com.bpjstku.data.jp;

import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.CheckEligibilityJpResponse;
import com.bpjstku.data.jp.model.response.GetCountClaimJpResponse;
import com.bpjstku.data.jp.model.response.GetJpBenefitResponse;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.jp.remote.JpApi;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.Api23Impl;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/bpjstku/data/jp/JpDataStore;", "Lcom/bpjstku/data/jp/JpRepository;", "Lcom/bpjstku/data/jp/remote/JpApi;", "p0", "<init>", "(Lcom/bpjstku/data/jp/remote/JpApi;)V", "Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;", "LderiveCodec;", "Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "getCountClaimJp", "(Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "checkEligibilityJp", "(Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;", "Lcom/bpjstku/data/jp/model/response/GetJpBenefitResponse;", "getJpBenefitInformation", "(Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertConfirmationJp", "(Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;", "Lcom/bpjstku/data/jp/model/response/JpVerificationResponse;", "verificationJpLivenessBegin", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;", "verificationJpLivenessEnd", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;)LderiveCodec;", "webService", "Lcom/bpjstku/data/jp/remote/JpApi;", "getWebService", "()Lcom/bpjstku/data/jp/remote/JpApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpDataStore implements JpRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final JpApi webService;

    public JpDataStore(JpApi jpApi) {
        Intrinsics.checkNotNullParameter(jpApi, "");
        this.webService = jpApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7639getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final JpApi m7640getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<GetCountClaimJpResponse> getCountClaimJp(GetCountClaimJpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetCountClaimJpResponse>> countClaimJp = m7640getWebService().getCountClaimJp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(countClaimJp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.getCountClaimJp$lambda$0((GetCountClaimJpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.getCountClaimJp$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCountClaimJpResponse getCountClaimJp$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetCountClaimJpResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<CheckEligibilityJpResponse> checkEligibilityJp(CheckEligibilityJpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckEligibilityJpResponse>> derivecodecCheckEligibility = m7640getWebService().checkEligibility(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligibility, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.checkEligibilityJp$lambda$2((CheckEligibilityJpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.checkEligibilityJp$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligibilityJpResponse checkEligibilityJp$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckEligibilityJpResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<GetJpBenefitResponse> getJpBenefitInformation(GetJpBenefitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetJpBenefitResponse>> jpBenefitInformation = m7640getWebService().getJpBenefitInformation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(jpBenefitInformation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.getJpBenefitInformation$lambda$4((GetJpBenefitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.getJpBenefitInformation$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetJpBenefitResponse getJpBenefitInformation$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetJpBenefitResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<BaseItem> insertConfirmationJp(JpInstantConfirmationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        JpApi jpApiM7640getWebService = m7640getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File file = p0.getFile();
        Intrinsics.checkNotNull(file);
        deriveCodec<Response<BaseItem>> derivecodecInsertConfirmationJp = jpApiM7640getWebService.insertConfirmationJp(partMap, createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertConfirmationJp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.insertConfirmationJp$lambda$6((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.insertConfirmationJp$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem insertConfirmationJp$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<JpVerificationResponse> verificationJpLivenessBegin(JpVerificationLivenessBegin p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JpVerificationResponse>> derivecodecVerificationJpLivenessBegin = m7640getWebService().verificationJpLivenessBegin(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerificationJpLivenessBegin, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.verificationJpLivenessBegin$lambda$8((JpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.verificationJpLivenessBegin$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpVerificationResponse verificationJpLivenessBegin$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jp.JpRepository
    public final deriveCodec<JpVerificationResponse> verificationJpLivenessEnd(JpVerificationLivenessEnd p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JpVerificationResponse>> derivecodecVerificationJpLivenessEnd = m7640getWebService().verificationJpLivenessEnd(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerificationJpLivenessEnd, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpDataStore.verificationJpLivenessEnd$lambda$10((JpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jp.JpDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JpDataStore.verificationJpLivenessEnd$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpVerificationResponse verificationJpLivenessEnd$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpVerificationResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligibilityJpResponse checkEligibilityJp$lambda$2(CheckEligibilityJpResponse checkEligibilityJpResponse) {
        Intrinsics.checkNotNullParameter(checkEligibilityJpResponse, "");
        return checkEligibilityJpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCountClaimJpResponse getCountClaimJp$lambda$0(GetCountClaimJpResponse getCountClaimJpResponse) {
        Intrinsics.checkNotNullParameter(getCountClaimJpResponse, "");
        return getCountClaimJpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetJpBenefitResponse getJpBenefitInformation$lambda$4(GetJpBenefitResponse getJpBenefitResponse) {
        Intrinsics.checkNotNullParameter(getJpBenefitResponse, "");
        return getJpBenefitResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem insertConfirmationJp$lambda$6(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpVerificationResponse verificationJpLivenessBegin$lambda$8(JpVerificationResponse jpVerificationResponse) {
        Intrinsics.checkNotNullParameter(jpVerificationResponse, "");
        return jpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpVerificationResponse verificationJpLivenessEnd$lambda$10(JpVerificationResponse jpVerificationResponse) {
        Intrinsics.checkNotNullParameter(jpVerificationResponse, "");
        return jpVerificationResponse;
    }
}
