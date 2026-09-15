package com.bpjstku.data.support;

import com.bpjstku.data.lib.model.BaseRequestEmail;
import com.bpjstku.data.support.model.response.CallPmiResponse;
import com.bpjstku.data.support.remote.SupportApi;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/support/SupportDataStore;", "Lcom/bpjstku/data/support/SupportRepository;", "Lcom/bpjstku/data/support/remote/SupportApi;", "p0", "<init>", "(Lcom/bpjstku/data/support/remote/SupportApi;)V", "Lcom/bpjstku/data/lib/model/BaseRequestEmail;", "LderiveCodec;", "Lcom/bpjstku/data/support/model/response/CallPmiResponse;", "getDataPmi", "(Lcom/bpjstku/data/lib/model/BaseRequestEmail;)LderiveCodec;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/support/remote/SupportApi;", "getWebService", "()Lcom/bpjstku/data/support/remote/SupportApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportDataStore implements SupportRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final SupportApi webService;

    public SupportDataStore(SupportApi supportApi) {
        Intrinsics.checkNotNullParameter(supportApi, "");
        this.webService = supportApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7782getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final SupportApi m7783getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.support.SupportRepository
    public final deriveCodec<CallPmiResponse> getDataPmi(BaseRequestEmail p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CallPmiResponse>> dataPmi = m7783getWebService().getDataPmi(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(dataPmi, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.support.SupportDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDataStore.getDataPmi$lambda$0((CallPmiResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.support.SupportDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SupportDataStore.getDataPmi$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallPmiResponse getDataPmi$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CallPmiResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallPmiResponse getDataPmi$lambda$0(CallPmiResponse callPmiResponse) {
        Intrinsics.checkNotNullParameter(callPmiResponse, "");
        return callPmiResponse;
    }
}
