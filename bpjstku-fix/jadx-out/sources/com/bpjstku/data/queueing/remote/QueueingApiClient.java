package com.bpjstku.data.queueing.remote;

import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.request.GetDataAntrianRequest;
import com.bpjstku.data.queueing.model.request.InsertAntrianRequest;
import com.bpjstku.data.queueing.model.request.NearestOfficeRequest;
import com.bpjstku.data.queueing.model.request.QuotaBookingRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/queueing/remote/QueueingApiClient;", "", "Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeResponse;", "getNearestOffice", "(Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingResponse;", "getQuotaBooking", "(Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/InsertAntrianResponse;", "insertAntrian", "(Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "getDataAntrian", "(Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;", "Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "getAntrianOnlineUrl", "(Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface QueueingApiClient {
    @POST("user/antrian-online")
    deriveCodec<Response<AntrianOnlineUrlResponse>> getAntrianOnlineUrl(@Body AntrianOnlineUrlRequest p0);

    @POST("v1/registrasi/get-data-antrian")
    deriveCodec<Response<GetDataAntrianResponse>> getDataAntrian(@Body GetDataAntrianRequest p0);

    @POST("v1/registrasi/get-data-antrian")
    deriveCodec<Response<GetDataAntrianResponse>> getDataAntrian(@Header("x-transaction-id") String p0, @Body GetDataAntrianRequest p1);

    @POST("v1/registrasi/nearestOffice")
    deriveCodec<Response<NearestOfficeResponse>> getNearestOffice(@Body NearestOfficeRequest p0);

    @POST("v1/registrasi/quotaBooking")
    deriveCodec<Response<QuotaBookingResponse>> getQuotaBooking(@Body QuotaBookingRequest p0);

    @POST("v1/registrasi/insert-antrian")
    deriveCodec<Response<InsertAntrianResponse>> insertAntrian(@Body InsertAntrianRequest p0);

    @POST("v1/registrasi/insert-antrian")
    deriveCodec<Response<InsertAntrianResponse>> insertAntrian(@Header("x-transaction-id") String p0, @Body InsertAntrianRequest p1);
}
