package com.bpjstku.data.syariah;

import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahFaqItem;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckResponse;
import com.bpjstku.data.syariah.remote.SyariahApi;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/bpjstku/data/syariah/SyariahDataStore;", "Lcom/bpjstku/data/syariah/SyariahRepository;", "Lcom/bpjstku/data/syariah/remote/SyariahApi;", "p0", "<init>", "(Lcom/bpjstku/data/syariah/remote/SyariahApi;)V", "Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;", "LderiveCodec;", "Lcom/bpjstku/domain/general/model/BaseModel;", "updateMembershipSyariah", "(Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;", "", "Lcom/bpjstku/data/syariah/model/response/SyariahFaqItem;", "getFaqSyariahService", "(Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;", "Lokhttp3/ResponseBody;", "getEakadPdf", "(Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckItem;", "getEakadStatus", "(Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/syariah/remote/SyariahApi;", "getWebService", "()Lcom/bpjstku/data/syariah/remote/SyariahApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahDataStore implements SyariahRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final SyariahApi webService;

    public SyariahDataStore(SyariahApi syariahApi) {
        Intrinsics.checkNotNullParameter(syariahApi, "");
        this.webService = syariahApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7786getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final SyariahApi m7787getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.syariah.SyariahRepository
    public final deriveCodec<BaseModel> updateMembershipSyariah(SyariahUpdateMembershipRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseModel>> derivecodecUpdateMembershipSyariah = m7787getWebService().updateMembershipSyariah(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUpdateMembershipSyariah, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahDataStore.updateMembershipSyariah$lambda$0((BaseModel) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SyariahDataStore.updateMembershipSyariah$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel updateMembershipSyariah$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.syariah.SyariahRepository
    public final deriveCodec<List<SyariahFaqItem>> getFaqSyariahService(SyariahFaqRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SyariahFaqResponse>> faqSyariahService = m7787getWebService().getFaqSyariahService(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(faqSyariahService, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda4
            public static int TuitionPaymentFragmentbindingInflater1 = -126135056;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahDataStore.getFaqSyariahService$lambda$2((SyariahFaqResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SyariahDataStore.getFaqSyariahService$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFaqSyariahService$lambda$2(SyariahFaqResponse syariahFaqResponse) {
        Intrinsics.checkNotNullParameter(syariahFaqResponse, "");
        return syariahFaqResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFaqSyariahService$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.syariah.SyariahRepository
    public final deriveCodec<ResponseBody> getEakadPdf(SyariahEakadPdfRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResponseBody>> eakadPdf = m7787getWebService().getEakadPdf(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(eakadPdf, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahDataStore.getEakadPdf$lambda$4((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SyariahDataStore.getEakadPdf$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseBody getEakadPdf$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseBody) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.syariah.SyariahRepository
    public final deriveCodec<SyariahMembershipCheckItem> getEakadStatus(SyariahMembershipCheckRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SyariahMembershipCheckResponse>> eakadStatus = m7787getWebService().getEakadStatus(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(eakadStatus, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahDataStore.getEakadStatus$lambda$6((SyariahMembershipCheckResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.syariah.SyariahDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SyariahDataStore.getEakadStatus$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SyariahMembershipCheckItem getEakadStatus$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SyariahMembershipCheckItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SyariahMembershipCheckItem getEakadStatus$lambda$6(SyariahMembershipCheckResponse syariahMembershipCheckResponse) {
        Intrinsics.checkNotNullParameter(syariahMembershipCheckResponse, "");
        return syariahMembershipCheckResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseBody getEakadPdf$lambda$4(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return responseBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel updateMembershipSyariah$lambda$0(BaseModel baseModel) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        return baseModel;
    }
}
