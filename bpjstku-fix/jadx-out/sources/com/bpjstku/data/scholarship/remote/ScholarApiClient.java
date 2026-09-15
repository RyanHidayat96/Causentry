package com.bpjstku.data.scholarship.remote;

import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInfoRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipHistoryListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInfoResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\u00042\u0019\b\u0001\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001d2\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b$\u0010%J\u0080\u0001\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b \u0018\u00010\u001d2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b,\u0010-J\\\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b \u0018\u00010\u001d2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010!2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b/\u00100J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000201H'¢\u0006\u0004\b3\u00104J\u009d\u0001\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001f2\b\b\u0001\u0010\"\u001a\u00020\u001f2\b\b\u0001\u0010&\u001a\u00020\u001f2\b\b\u0001\u0010'\u001a\u00020\u001f2\b\b\u0001\u0010(\u001a\u00020\u001f2\b\b\u0001\u0010)\u001a\u00020\u001f2\b\b\u0001\u0010*\u001a\u00020\u001f2\b\b\u0001\u00105\u001a\u00020\u001f2\b\b\u0001\u00106\u001a\u00020\u001f2\b\b\u0001\u00107\u001a\u00020\u001f2\b\b\u0001\u00108\u001a\u00020!2\b\b\u0001\u00109\u001a\u00020!2\b\b\u0001\u0010:\u001a\u00020!H'¢\u0006\u0004\b<\u0010=ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/scholarship/remote/ScholarApiClient;", "", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationResponse;", "getEducationList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryListResponse;", "getHistoryList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "getBenefitPersonList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "getBenefitPerson", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "getEligible", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "getInfo", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "uploadProve", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "p2", "p3", "p4", "p5", "p6", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "insertScholarship", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "facematchScholarship", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "facematchBeginScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;)LderiveCodec;", "p7", "p8", "p9", "p10", "p11", "p12", "Lcom/bpjstku/data/scholarship/model/response/ConfirmResponse;", "updateKonfirmasi", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ScholarApiClient {
    @POST("beasiswa/ekyc-liveness-begin")
    deriveCodec<Response<ScholarshipFmResponse>> facematchBeginScholarship(@Body ScholarshipFmBeginRequest p0);

    @POST("beasiswa/ekyc-liveness-end")
    @Multipart
    deriveCodec<Response<ScholarshipVerificationResponse>> facematchScholarship(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3);

    @POST("beasiswa/penerima-manfaat")
    deriveCodec<Response<ScholarshipBenefitResponse>> getBenefitPerson(@Body ScholarshipBenefitRequest p0);

    @POST("beasiswa/daftar-penerima")
    deriveCodec<Response<ScholarshipBenefitListResponse>> getBenefitPersonList(@Body ScholarshipBenefitListRequest p0);

    @POST("beasiswa/list-pendidikan")
    deriveCodec<Response<ScholarshipEducationResponse>> getEducationList(@Body ScholarshipEducationListRequest p0);

    @POST("beasiswa/check-eligible")
    deriveCodec<Response<ScholarshipEligibleResponse>> getEligible(@Body ScholarshipEligibleRequest p0);

    @POST("beasiswa/list-history")
    deriveCodec<Response<ScholarshipHistoryListResponse>> getHistoryList(@Body ScholarshipHistoryRequest p0);

    @POST("beasiswa/info-manfaat")
    deriveCodec<Response<ScholarshipInfoResponse>> getInfo(@Body ScholarshipInfoRequest p0);

    @POST("beasiswa/insert-konfirmasi")
    @Multipart
    deriveCodec<Response<ScholarshipInsertResponse>> insertScholarship(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5, @Part MultipartBody.Part p6);

    @POST("beasiswa/update-konfirmasi")
    @Multipart
    deriveCodec<Response<ConfirmResponse>> updateKonfirmasi(@Part("chId") RequestBody p0, @Part("emailPelapor") RequestBody p1, @Part("nikTk") RequestBody p2, @Part("namaPelapor") RequestBody p3, @Part("nikPelapor") RequestBody p4, @Part("tglLahirPelapor") RequestBody p5, @Part("kodePengajuan") RequestBody p6, @Part("dataPenerima") RequestBody p7, @Part("scoreLiveness") RequestBody p8, @Part("scoreManipulation") RequestBody p9, @Part MultipartBody.Part p10, @Part MultipartBody.Part p11, @Part MultipartBody.Part p12);

    @POST("beasiswa/upload-document")
    @Multipart
    deriveCodec<Response<ScholarshipDocumentResponse>> uploadProve(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);
}
