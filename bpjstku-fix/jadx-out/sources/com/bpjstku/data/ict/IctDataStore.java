package com.bpjstku.data.ict;

import com.bpjstku.data.ict.model.request.IctTokenRequest;
import com.bpjstku.data.ict.model.response.IctTokenResponse;
import com.bpjstku.data.ict.remote.IctApi;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/ict/IctDataStore;", "Lcom/bpjstku/data/ict/IctRepository;", "Lcom/bpjstku/data/ict/remote/IctApi;", "p0", "<init>", "(Lcom/bpjstku/data/ict/remote/IctApi;)V", "Lcom/bpjstku/data/ict/model/request/IctTokenRequest;", "LderiveCodec;", "Lcom/bpjstku/data/ict/model/response/IctTokenResponse;", "generateTokenIct", "(Lcom/bpjstku/data/ict/model/request/IctTokenRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/ict/remote/IctApi;", "getWebService", "()Lcom/bpjstku/data/ict/remote/IctApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IctDataStore implements IctRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final IctApi webService;

    public IctDataStore(IctApi ictApi) {
        Intrinsics.checkNotNullParameter(ictApi, "");
        this.webService = ictApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7609getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final IctApi m7610getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.ict.IctRepository
    public final deriveCodec<IctTokenResponse> generateTokenIct(IctTokenRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<IctTokenResponse>> derivecodecGenerateTokenIct = m7610getWebService().generateTokenIct(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecGenerateTokenIct, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.ict.IctDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IctDataStore.generateTokenIct$lambda$0((IctTokenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.ict.IctDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return IctDataStore.generateTokenIct$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IctTokenResponse generateTokenIct$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (IctTokenResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IctTokenResponse generateTokenIct$lambda$0(IctTokenResponse ictTokenResponse) {
        Intrinsics.checkNotNullParameter(ictTokenResponse, "");
        return ictTokenResponse;
    }
}
