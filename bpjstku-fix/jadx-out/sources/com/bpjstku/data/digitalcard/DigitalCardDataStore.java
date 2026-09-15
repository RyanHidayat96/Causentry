package com.bpjstku.data.digitalcard;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.DigitalCardItem;
import com.bpjstku.data.digitalcard.model.response.DigitalCardResponse;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationResponse;
import com.bpjstku.data.digitalcard.remote.DigitalCardApi;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/bpjstku/data/digitalcard/DigitalCardDataStore;", "Lcom/bpjstku/data/digitalcard/DigitalCardRepository;", "Lcom/bpjstku/data/digitalcard/remote/DigitalCardApi;", "p0", "<init>", "(Lcom/bpjstku/data/digitalcard/remote/DigitalCardApi;)V", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/digitalcard/model/response/DigitalCardItem;", "getDigitalCards", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getDigitalCardImage", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;)Lretrofit2/Response;", "Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;", "Lcom/bpjstku/data/digitalcard/model/response/PMIMembershipInformationItem;", "getPMIMembershipInformation", "(Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationItem;", "getBPUMembershipInformation", "Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationItem;", "getPUMembershipInformation", "webService", "Lcom/bpjstku/data/digitalcard/remote/DigitalCardApi;", "getWebService", "()Lcom/bpjstku/data/digitalcard/remote/DigitalCardApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigitalCardDataStore implements DigitalCardRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final DigitalCardApi webService;

    public DigitalCardDataStore(DigitalCardApi digitalCardApi) {
        Intrinsics.checkNotNullParameter(digitalCardApi, "");
        this.webService = digitalCardApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7604getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final DigitalCardApi m7605getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.digitalcard.DigitalCardRepository
    public final deriveCodec<List<DigitalCardItem>> getDigitalCards(DigitalCardRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<DigitalCardResponse>> digitalCards = m7605getWebService().getDigitalCards(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(digitalCards, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalCardDataStore.getDigitalCards$lambda$0((DigitalCardResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DigitalCardDataStore.getDigitalCards$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDigitalCards$lambda$0(DigitalCardResponse digitalCardResponse) {
        Intrinsics.checkNotNullParameter(digitalCardResponse, "");
        return digitalCardResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDigitalCards$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.digitalcard.DigitalCardRepository
    public final Response<ResponseBody> getDigitalCardImage(DigitalCardImageRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return m7605getWebService().getDigitalCardImage(p0).b();
    }

    @Override // com.bpjstku.data.digitalcard.DigitalCardRepository
    public final deriveCodec<PMIMembershipInformationItem> getPMIMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PMIMembershipInformationResponse>> pMIMembershipInformation = m7605getWebService().getPMIMembershipInformation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(pMIMembershipInformation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalCardDataStore.getPMIMembershipInformation$lambda$2((PMIMembershipInformationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DigitalCardDataStore.getPMIMembershipInformation$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PMIMembershipInformationItem getPMIMembershipInformation$lambda$2(PMIMembershipInformationResponse pMIMembershipInformationResponse) {
        Intrinsics.checkNotNullParameter(pMIMembershipInformationResponse, "");
        return pMIMembershipInformationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PMIMembershipInformationItem getPMIMembershipInformation$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PMIMembershipInformationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.digitalcard.DigitalCardRepository
    public final deriveCodec<BPUMembershipInformationItem> getBPUMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BPUMembershipInformationResponse>> bPUMembershipInformation = m7605getWebService().getBPUMembershipInformation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(bPUMembershipInformation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalCardDataStore.getBPUMembershipInformation$lambda$4((BPUMembershipInformationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DigitalCardDataStore.getBPUMembershipInformation$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BPUMembershipInformationItem getBPUMembershipInformation$lambda$4(BPUMembershipInformationResponse bPUMembershipInformationResponse) {
        Intrinsics.checkNotNullParameter(bPUMembershipInformationResponse, "");
        return bPUMembershipInformationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BPUMembershipInformationItem getBPUMembershipInformation$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BPUMembershipInformationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.digitalcard.DigitalCardRepository
    public final deriveCodec<PUMembershipInformationItem> getPUMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PUMembershipInformationResponse>> pUMembershipInformation = m7605getWebService().getPUMembershipInformation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(pUMembershipInformation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalCardDataStore.getPUMembershipInformation$lambda$6((PUMembershipInformationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.digitalcard.DigitalCardDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DigitalCardDataStore.getPUMembershipInformation$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PUMembershipInformationItem getPUMembershipInformation$lambda$6(PUMembershipInformationResponse pUMembershipInformationResponse) {
        Intrinsics.checkNotNullParameter(pUMembershipInformationResponse, "");
        return pUMembershipInformationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PUMembershipInformationItem getPUMembershipInformation$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PUMembershipInformationItem) function1.invoke(obj);
    }
}
