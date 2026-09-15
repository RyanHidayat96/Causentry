package com.bpjstku.data.syariah.remote;

import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckResponse;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/syariah/remote/SyariahApi;", "LunbindChildren;", "Lcom/bpjstku/data/syariah/remote/SyariahApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/syariah/remote/SyariahApiClient;)V", "Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/domain/general/model/BaseModel;", "updateMembershipSyariah", "(Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahFaqResponse;", "getFaqSyariahService", "(Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;", "Lokhttp3/ResponseBody;", "getEakadPdf", "(Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckResponse;", "getEakadStatus", "(Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/syariah/remote/SyariahApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahApi implements unbindChildren, SyariahApiClient {
    public static final int $stable = 8;
    private final SyariahApiClient apiClient;

    public SyariahApi(SyariahApiClient syariahApiClient) {
        Intrinsics.checkNotNullParameter(syariahApiClient, "");
        this.apiClient = syariahApiClient;
    }

    @Override // com.bpjstku.data.syariah.remote.SyariahApiClient
    public final deriveCodec<Response<BaseModel>> updateMembershipSyariah(SyariahUpdateMembershipRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.updateMembershipSyariah(p0);
    }

    @Override // com.bpjstku.data.syariah.remote.SyariahApiClient
    public final deriveCodec<Response<SyariahFaqResponse>> getFaqSyariahService(SyariahFaqRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getFaqSyariahService(p0);
    }

    @Override // com.bpjstku.data.syariah.remote.SyariahApiClient
    public final deriveCodec<Response<ResponseBody>> getEakadPdf(SyariahEakadPdfRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getEakadPdf(p0);
    }

    @Override // com.bpjstku.data.syariah.remote.SyariahApiClient
    public final deriveCodec<Response<SyariahMembershipCheckResponse>> getEakadStatus(SyariahMembershipCheckRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getEakadStatus(p0);
    }
}
