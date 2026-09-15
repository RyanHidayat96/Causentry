package com.bpjstku.data.registration.bpu.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.response.BranchOfficeLocationResponse;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.GetDataSertakanDonaturWebviewRequest;
import com.bpjstku.data.registration.bpu.model.request.InsertJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.RegisterBpuRequest;
import com.bpjstku.data.registration.bpu.model.request.UpdateProfileBpuRequest;
import com.bpjstku.data.registration.bpu.model.response.CheckResidenceItem;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.data.registration.bpu.model.response.JobTitlesItem;
import com.bpjstku.data.registration.bpu.model.response.ListJmoPairResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.data.registration.bpu.model.response.OfficeLocationsItem;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0019\u0010\u0017J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u001b\u0010\u0017J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H'¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b#\u0010\u000fJ%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020/H'¢\u0006\u0004\b0\u00101J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b2\u0010\u0013J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b3\u0010.J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApiClient;", "", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/CheckResidenceItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postRegisterBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/OfficeLocationsItem;", "getWorkingLocations", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationResponse;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/bpu/model/response/JobTitlesItem;", "getJobTitles", "Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListTuitionRateResponse;", "getTuitionRate", "(Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "postUpdateProfileBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;)LderiveCodec;", "checkBpuRegistered", "Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListJmoPairResponse;", "listJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;", "postCheckResidenceInfoAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;", "postPhoneVerificationAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;)LderiveCodec;", "postRegisterBpuAuth", "checkBpuRegisteredAuth", "Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/GetDataSertakanDonaturResponse;", "GetDataDonaturSertakan", "(Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BPURegistrationApiClient {
    @POST("sertakan/generateid")
    deriveCodec<Response<GetDataSertakanDonaturResponse>> GetDataDonaturSertakan(@Body GetDataSertakanDonaturWebviewRequest p0);

    @POST("pendaftaran/bpu/cek-peserta-bpu")
    deriveCodec<Response<CheckResidenceItem>> checkBpuRegistered(@Body CheckResidenceInfoRequest p0);

    @POST("pendaftaran/bpu/auth/cek-peserta-bpu")
    deriveCodec<Response<CheckResidenceItem>> checkBpuRegisteredAuth(@Body CheckResidenceInfoRequestAuth p0);

    @POST("pendaftaran/bpu/kantor-cabang")
    deriveCodec<Response<BranchOfficeLocationResponse>> getBranchOfficeLocations(@Body BaseRequest p0);

    @POST("pendaftaran/bpu/pekerjaan")
    deriveCodec<Response<JobTitlesItem>> getJobTitles(@Body BaseRequest p0);

    @POST("pendaftaran/bpu/tarif-iuran")
    deriveCodec<Response<ListTuitionRateResponse>> getTuitionRate(@Body ListTuitionRateRequest p0);

    @POST("pendaftaran/bpu/lokasi-bekerja")
    deriveCodec<Response<OfficeLocationsItem>> getWorkingLocations(@Body BaseRequest p0);

    @POST("pendaftaran/bpu/insert-jmo-pair")
    deriveCodec<Response<BaseItem>> insertJmoPair(@Body InsertJmoPairRequest p0);

    @POST("pendaftaran/bpu/list-jmo-pair")
    deriveCodec<Response<ListJmoPairResponse>> listJmoPair(@Body ListJmoPairRequest p0);

    @POST("pendaftaran/bpu/cek-data-kependudukan")
    deriveCodec<Response<CheckResidenceItem>> postCheckResidenceInfo(@Body CheckResidenceInfoRequest p0);

    @POST("pendaftaran/bpu/auth/cek-data-kependudukan")
    deriveCodec<Response<CheckResidenceItem>> postCheckResidenceInfoAuth(@Body CheckResidenceInfoRequestAuth p0);

    @POST("pendaftaran/bpu/validasi-email")
    deriveCodec<Response<VerificationItem>> postEmailVerification(@Body EmailVerificationRequest p0);

    @POST("pendaftaran/bpu/validasi-handphone")
    deriveCodec<Response<VerificationItem>> postPhoneVerification(@Body PhoneVerificationRequest p0);

    @POST("pendaftaran/bpu/auth/validasi-handphone")
    deriveCodec<Response<VerificationItem>> postPhoneVerificationAuth(@Body PhoneVerificationRequestAuth p0);

    @POST("pendaftaran/bpu/daftar-peserta")
    deriveCodec<Response<RegistrationItem>> postRegisterBpu(@Body RegisterBpuRequest p0);

    @POST("pendaftaran/bpu/auth/daftar-peserta")
    deriveCodec<Response<RegistrationItem>> postRegisterBpuAuth(@Body RegisterBpuRequest p0);

    @POST("pendaftaran/bpu/ubah-profile-peserta-bpu")
    deriveCodec<Response<RegistrationItem>> postUpdateProfileBpu(@Body UpdateProfileBpuRequest p0);
}
