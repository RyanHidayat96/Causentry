package com.bpjstku.data.registration.bpu;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
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
import com.bpjstku.data.registration.bpu.model.response.ListJmoPairResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\"\u0010\u000eJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H'¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b*\u0010\u0012J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H'¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020.H'¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H'¢\u0006\u0004\b2\u0010-J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u0010\u0003\u001a\u000203H'¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/bpu/BPURegistrationRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postRegisterBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getWorkingLocations", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "getJobTitles", "Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListTuitionRateResponse;", "getTuitionRate", "(Lcom/bpjstku/data/registration/bpu/model/request/ListTuitionRateRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "updateProfileBpu", "(Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;)LderiveCodec;", "checkBpuRegistered", "Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;", "insertJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/InsertJmoPairRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/ListJmoPairResponse;", "listJmoPair", "(Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;)LderiveCodec;", "postRegisterBpuAuth", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;", "postCheckResidenceInfoAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;", "postPhoneVerificationAuth", "(Lcom/bpjstku/data/registration/bpu/model/request/PhoneVerificationRequestAuth;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/response/CheckResidenceItem;", "checkBpuRegisteredAuth", "Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;", "Lcom/bpjstku/data/registration/bpu/model/response/GetDataSertakanDonaturResponse;", "GetDataDonaturSertakan", "(Lcom/bpjstku/data/registration/bpu/model/request/GetDataSertakanDonaturWebviewRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BPURegistrationRepository extends getChildrenOutConfigs {
    deriveCodec<GetDataSertakanDonaturResponse> GetDataDonaturSertakan(@Body GetDataSertakanDonaturWebviewRequest p0);

    deriveCodec<BaseItem> checkBpuRegistered(@Body CheckResidenceInfoRequest p0);

    deriveCodec<CheckResidenceItem> checkBpuRegisteredAuth(@Body CheckResidenceInfoRequestAuth p0);

    deriveCodec<List<RegionalOfficeItem>> getBranchOfficeLocations(@Body BaseRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getJobTitles(@Body BaseRequest p0);

    deriveCodec<ListTuitionRateResponse> getTuitionRate(@Body ListTuitionRateRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getWorkingLocations(@Body BaseRequest p0);

    deriveCodec<BaseItem> insertJmoPair(@Body InsertJmoPairRequest p0);

    deriveCodec<ListJmoPairResponse> listJmoPair(@Body ListJmoPairRequest p0);

    deriveCodec<BaseItem> postCheckResidenceInfo(@Body CheckResidenceInfoRequest p0);

    deriveCodec<BaseItem> postCheckResidenceInfoAuth(@Body CheckResidenceInfoRequestAuth p0);

    deriveCodec<VerificationItem> postEmailVerification(@Body EmailVerificationRequest p0);

    deriveCodec<VerificationItem> postPhoneVerification(@Body PhoneVerificationRequest p0);

    deriveCodec<VerificationItem> postPhoneVerificationAuth(@Body PhoneVerificationRequestAuth p0);

    deriveCodec<RegistrationItem> postRegisterBpu(@Body RegisterBpuRequest p0);

    deriveCodec<RegistrationItem> postRegisterBpuAuth(@Body RegisterBpuRequest p0);

    deriveCodec<RegistrationItem> updateProfileBpu(@Body UpdateProfileBpuRequest p0);
}
