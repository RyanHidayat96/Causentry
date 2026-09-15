package com.bpjstku.data.programinfo.remote;

import com.bpjstku.data.programinfo.model.request.ProgramInfoRequest;
import com.bpjstku.data.programinfo.model.response.ProgramInfoItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/data/programinfo/remote/ProgramInfoApi;", "LunbindChildren;", "Lcom/bpjstku/data/programinfo/remote/ProgramInfoApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/programinfo/remote/ProgramInfoApiClient;)V", "Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/programinfo/model/response/ProgramInfoItem;", "getProgramInfo", "(Lcom/bpjstku/data/programinfo/model/request/ProgramInfoRequest;)LderiveCodec;", "programInfoApiClient", "Lcom/bpjstku/data/programinfo/remote/ProgramInfoApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgramInfoApi implements unbindChildren, ProgramInfoApiClient {
    public static final int $stable = 8;
    private final ProgramInfoApiClient programInfoApiClient;

    public ProgramInfoApi(ProgramInfoApiClient programInfoApiClient) {
        Intrinsics.checkNotNullParameter(programInfoApiClient, "");
        this.programInfoApiClient = programInfoApiClient;
    }

    @Override // com.bpjstku.data.programinfo.remote.ProgramInfoApiClient
    public final deriveCodec<Response<ProgramInfoItem>> getProgramInfo(ProgramInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.programInfoApiClient.getProgramInfo(p0);
    }
}
