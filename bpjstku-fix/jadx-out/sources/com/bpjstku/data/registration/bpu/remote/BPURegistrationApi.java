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
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0003\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b&\u0010\u0012J#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\b0\u00072\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\b0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J#\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u000202H\u0017¢\u0006\u0004\b3\u00104J#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b5\u0010\u0016J#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b6\u00101J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApi;", "LunbindChildren;", "Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApiClient;)V", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/CheckResidenceItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postRegisterBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/OfficeLocationsItem;", "getWorkingLocations", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationResponse;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/bpu/model/response/JobTitlesItem;", "getJobTitles", "Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListTuitionRateResponse;", "getTuitionRate", "(Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "postUpdateProfileBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;)LderiveCodec;", "checkBpuRegistered", "Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListJmoPairResponse;", "listJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;", "postCheckResidenceInfoAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;", "postPhoneVerificationAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;)LderiveCodec;", "postRegisterBpuAuth", "checkBpuRegisteredAuth", "Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/GetDataSertakanDonaturResponse;", "GetDataDonaturSertakan", "(Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/registration/bpu/remote/BPURegistrationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BPURegistrationApi implements unbindChildren, BPURegistrationApiClient {
    public static final int $stable = 8;
    private final BPURegistrationApiClient apiClient;

    public BPURegistrationApi(BPURegistrationApiClient bPURegistrationApiClient) {
        Intrinsics.checkNotNullParameter(bPURegistrationApiClient, "");
        this.apiClient = bPURegistrationApiClient;
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailVerification(EmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postEmailVerification(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneVerification(PhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPhoneVerification(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<CheckResidenceItem>> postCheckResidenceInfo(CheckResidenceInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postCheckResidenceInfo(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<RegistrationItem>> postRegisterBpu(RegisterBpuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postRegisterBpu(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<OfficeLocationsItem>> getWorkingLocations(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getWorkingLocations(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<BranchOfficeLocationResponse>> getBranchOfficeLocations(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchOfficeLocations(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<JobTitlesItem>> getJobTitles(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJobTitles(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<ListTuitionRateResponse>> getTuitionRate(ListTuitionRateRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getTuitionRate(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<RegistrationItem>> postUpdateProfileBpu(UpdateProfileBpuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postUpdateProfileBpu(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<CheckResidenceItem>> checkBpuRegistered(CheckResidenceInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkBpuRegistered(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<BaseItem>> insertJmoPair(InsertJmoPairRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.insertJmoPair(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<ListJmoPairResponse>> listJmoPair(ListJmoPairRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.listJmoPair(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<CheckResidenceItem>> postCheckResidenceInfoAuth(CheckResidenceInfoRequestAuth p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postCheckResidenceInfoAuth(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneVerificationAuth(PhoneVerificationRequestAuth p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPhoneVerificationAuth(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<RegistrationItem>> postRegisterBpuAuth(RegisterBpuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postRegisterBpuAuth(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<CheckResidenceItem>> checkBpuRegisteredAuth(CheckResidenceInfoRequestAuth p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkBpuRegisteredAuth(p0);
    }

    @Override // com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient
    public final deriveCodec<Response<GetDataSertakanDonaturResponse>> GetDataDonaturSertakan(GetDataSertakanDonaturWebviewRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.GetDataDonaturSertakan(p0);
    }
}
