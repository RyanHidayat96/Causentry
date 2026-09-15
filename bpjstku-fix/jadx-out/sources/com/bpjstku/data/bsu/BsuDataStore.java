package com.bpjstku.data.bsu;

import com.bpjstku.data.bsu.model.request.CheckEligibleBsuRequest;
import com.bpjstku.data.bsu.model.request.UpdateRekeningBsuRequest;
import com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse;
import com.bpjstku.data.bsu.remote.BsuApi;
import com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/bsu/BsuDataStore;", "Lcom/bpjstku/data/bsu/BsuRepository;", "Lcom/bpjstku/data/bsu/remote/BsuApi;", "p0", "<init>", "(Lcom/bpjstku/data/bsu/remote/BsuApi;)V", "Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;", "LderiveCodec;", "Lcom/bpjstku/data/bsu/model/response/CheckEligibleBsuResponse;", "checkEligibleBsu", "(Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;)LderiveCodec;", "Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;", "Lcom/bpjstku/data/bsu/remote/UpdateRekeningBsuResponse;", "updateRekeningBsu", "(Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/bsu/remote/BsuApi;", "getWebService", "()Lcom/bpjstku/data/bsu/remote/BsuApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BsuDataStore implements BsuRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final BsuApi webService;

    public BsuDataStore(BsuApi bsuApi) {
        Intrinsics.checkNotNullParameter(bsuApi, "");
        this.webService = bsuApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7582getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final BsuApi m7583getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.bsu.BsuRepository
    public final deriveCodec<CheckEligibleBsuResponse> checkEligibleBsu(CheckEligibleBsuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckEligibleBsuResponse>> derivecodecCheckEligibleBsu = m7583getWebService().checkEligibleBsu(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligibleBsu, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.bsu.BsuDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BsuDataStore.checkEligibleBsu$lambda$0((CheckEligibleBsuResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.bsu.BsuDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BsuDataStore.checkEligibleBsu$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligibleBsuResponse checkEligibleBsu$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckEligibleBsuResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.bsu.BsuRepository
    public final deriveCodec<UpdateRekeningBsuResponse> updateRekeningBsu(UpdateRekeningBsuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<UpdateRekeningBsuResponse>> derivecodecUpdateRekeningBsu = m7583getWebService().updateRekeningBsu(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUpdateRekeningBsu, unbindVar);
        final BsuDataStore$$ExternalSyntheticLambda2 bsuDataStore$$ExternalSyntheticLambda2 = new BsuDataStore$$ExternalSyntheticLambda2();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.bsu.BsuDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return BsuDataStore.updateRekeningBsu$lambda$3(bsuDataStore$$ExternalSyntheticLambda2, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateRekeningBsuResponse updateRekeningBsu$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UpdateRekeningBsuResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligibleBsuResponse checkEligibleBsu$lambda$0(CheckEligibleBsuResponse checkEligibleBsuResponse) {
        Intrinsics.checkNotNullParameter(checkEligibleBsuResponse, "");
        return checkEligibleBsuResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateRekeningBsuResponse updateRekeningBsu$lambda$2(UpdateRekeningBsuResponse updateRekeningBsuResponse) {
        Intrinsics.checkNotNullParameter(updateRekeningBsuResponse, "");
        return updateRekeningBsuResponse;
    }
}
