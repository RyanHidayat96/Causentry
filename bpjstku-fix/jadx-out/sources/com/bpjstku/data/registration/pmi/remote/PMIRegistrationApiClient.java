package com.bpjstku.data.registration.pmi.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.response.JobTitlesItem;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.JhtPaymentItem;
import com.bpjstku.data.registration.pmi.model.response.PlacementCountryItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\bJ%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020#H'¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u0004H'¢\u0006\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApiClient;", "", "Lcom/bpjstku/data/lib/model/BaseRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/registration/pmi/model/response/PlacementCountryItem;", "getPlacementCountries", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/response/JobTitlesItem;", "getJobTitles", "Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeLocationsItem;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "getProvinces", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/CityItem;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/response/JhtPaymentItem;", "getJhtPayments", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;", "postCheckPassport", "(Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "p2", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postPmiRegistration", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "checkSourceIp", "()LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PMIRegistrationApiClient {
    @GET("pendaftaran/pmi/checkip")
    deriveCodec<Response<BaseItem>> checkSourceIp();

    @POST("pendaftaran/pmi/kantor-cabang")
    deriveCodec<Response<BranchOfficeLocationsItem>> getBranchOfficeLocations(@Body BaseRequest p0);

    @POST("pendaftaran/pmi/kabupaten")
    deriveCodec<Response<CityItem>> getCities(@Body CityRequest p0);

    @POST("pendaftaran/pmi/iuran-jht")
    deriveCodec<Response<JhtPaymentItem>> getJhtPayments(@Body BaseRequest p0);

    @POST("pendaftaran/pmi/jenis-pekerjaan")
    deriveCodec<Response<JobTitlesItem>> getJobTitles(@Body BaseRequest p0);

    @POST("pendaftaran/pmi/negara-penempatan")
    deriveCodec<Response<PlacementCountryItem>> getPlacementCountries(@Body BaseRequest p0);

    @POST("pendaftaran/pmi/propinsi")
    deriveCodec<Response<ProvinceItem>> getProvinces(@Body BaseRequest p0);

    @POST("pendaftaran/pmi/cek-data-passpor")
    deriveCodec<Response<BaseItem>> postCheckPassport(@Body CheckPassportRequest p0);

    @POST("pendaftaran/pmi/cek-data-kependudukan")
    deriveCodec<Response<BaseItem>> postCheckResidenceInfo(@Body CheckResidenceInfoRequest p0);

    @POST("pendaftaran/bpu/validasi-email")
    deriveCodec<Response<VerificationItem>> postEmailVerification(@Body EmailVerificationRequest p0);

    @POST("pendaftaran/pmi/daftar-peserta")
    @Multipart
    deriveCodec<Response<RegistrationItem>> postPmiRegistration(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2);
}
