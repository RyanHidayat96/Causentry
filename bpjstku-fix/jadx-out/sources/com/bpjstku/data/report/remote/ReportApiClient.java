package com.bpjstku.data.report.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.response.NearestHealthcareResponse;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/report/remote/ReportApiClient;", "", "Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/report/model/response/NearestHealthcareResponse;", "getNearestHealthcare", "(Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postDataCorrection", "(Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "postReportWorkAccident", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "postUnregisteredCompany", "Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "Lcom/bpjstku/data/report/model/response/PreloadDataResponse;", "postPreloadData", "(Lcom/bpjstku/data/report/model/request/PreloadDataRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReportApiClient {
    @POST("pelaporan/plkk-terdekat")
    deriveCodec<Response<NearestHealthcareResponse>> getNearestHealthcare(@Body NearestHealthcareRequest p0);

    @POST("pelaporan/ketidaksesuaiandata")
    deriveCodec<Response<BaseItem>> postDataCorrection(@Body DataCorrectionRequest p0);

    @POST("pelaporan/preload-data")
    deriveCodec<Response<PreloadDataResponse>> postPreloadData(@Body PreloadDataRequest p0);

    @POST("pelaporan/kecelakaan-kerja")
    @Multipart
    deriveCodec<Response<BaseItem>> postReportWorkAccident(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("pelaporan/perusahaan-belum-daftar")
    @Multipart
    deriveCodec<Response<BaseItem>> postUnregisteredCompany(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);
}
