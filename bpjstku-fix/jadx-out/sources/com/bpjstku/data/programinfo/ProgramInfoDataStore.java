package com.bpjstku.data.programinfo;

import com.bpjstku.data.programinfo.model.request.ProgramInfoRequest;
import com.bpjstku.data.programinfo.model.response.ProgramInfoItem;
import com.bpjstku.data.programinfo.remote.ProgramInfoApi;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/programinfo/ProgramInfoDataStore;", "Lcom/bpjstku/data/programinfo/ProgramInfoRepository;", "Lcom/bpjstku/data/programinfo/remote/ProgramInfoApi;", "p0", "<init>", "(Lcom/bpjstku/data/programinfo/remote/ProgramInfoApi;)V", "Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;", "LderiveCodec;", "Lcom/bpjstku/data/programinfo/model/response/ProgramInfoItem;", "getProgramInfo", "(Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;)LderiveCodec;", "programInfoApi", "Lcom/bpjstku/data/programinfo/remote/ProgramInfoApi;", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "getWebService", "()Lcom/bpjstku/data/programinfo/remote/ProgramInfoApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgramInfoDataStore implements ProgramInfoRepository {
    public static final int $stable = 8;
    private final mergeChildrenConfigs dbService;
    private final ProgramInfoApi programInfoApi;
    private final ProgramInfoApi webService;

    public ProgramInfoDataStore(ProgramInfoApi programInfoApi) {
        Intrinsics.checkNotNullParameter(programInfoApi, "");
        this.programInfoApi = programInfoApi;
        this.webService = programInfoApi;
    }

    public final mergeChildrenConfigs getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final ProgramInfoApi m7694getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.programinfo.ProgramInfoRepository
    public final deriveCodec<ProgramInfoItem> getProgramInfo(ProgramInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ProgramInfoItem>> programInfo = this.programInfoApi.getProgramInfo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(programInfo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.programinfo.ProgramInfoDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramInfoDataStore.getProgramInfo$lambda$0((ProgramInfoItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.programinfo.ProgramInfoDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ProgramInfoDataStore.getProgramInfo$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramInfoItem getProgramInfo$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ProgramInfoItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramInfoItem getProgramInfo$lambda$0(ProgramInfoItem programInfoItem) {
        Intrinsics.checkNotNullParameter(programInfoItem, "");
        return programInfoItem;
    }
}
