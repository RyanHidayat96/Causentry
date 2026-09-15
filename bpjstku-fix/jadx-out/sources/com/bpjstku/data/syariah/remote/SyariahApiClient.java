package com.bpjstku.data.syariah.remote;

import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckResponse;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/syariah/remote/SyariahApiClient;", "", "Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/domain/general/model/BaseModel;", "updateMembershipSyariah", "(Lcom/bpjstku/data/syariah/model/request/SyariahUpdateMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahFaqResponse;", "getFaqSyariahService", "(Lcom/bpjstku/data/syariah/model/request/SyariahFaqRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;", "Lokhttp3/ResponseBody;", "getEakadPdf", "(Lcom/bpjstku/data/syariah/model/request/SyariahEakadPdfRequest;)LderiveCodec;", "Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;", "Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckResponse;", "getEakadStatus", "(Lcom/bpjstku/data/syariah/model/request/SyariahMembershipCheckRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SyariahApiClient {
    @POST("syariah/eakad-pdf")
    deriveCodec<Response<ResponseBody>> getEakadPdf(@Body SyariahEakadPdfRequest p0);

    @POST("syariah/check-status-eakad")
    deriveCodec<Response<SyariahMembershipCheckResponse>> getEakadStatus(@Body SyariahMembershipCheckRequest p0);

    @POST("syariah/faq")
    deriveCodec<Response<SyariahFaqResponse>> getFaqSyariahService(@Body SyariahFaqRequest p0);

    @POST("syariah/update-membership")
    deriveCodec<Response<BaseModel>> updateMembershipSyariah(@Body SyariahUpdateMembershipRequest p0);
}
