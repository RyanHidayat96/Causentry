package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.GetDataSertakanDonaturWebviewRequest;
import com.bpjstku.data.registration.bpu.model.request.InsertJmoPairRequest;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.bpu.model.request.RegisterBpuRequest;
import com.bpjstku.data.registration.bpu.model.request.UpdateProfileBpuRequest;
import com.bpjstku.data.registration.bpu.model.response.GetDataSertakanDonaturResponse;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.general.model.Verification;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getDarkScrimactivity {
    deriveCodec<Registration> TuitionPaymentFragmentbindingInflater1(RegisterBpuRequest registerBpuRequest);

    deriveCodec<Registration> TuitionPaymentFragmentbindingInflater1(UpdateProfileBpuRequest updateProfileBpuRequest);

    deriveCodec<ListTuitionRateResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListTuitionRateRequest listTuitionRateRequest);

    deriveCodec<Registration> TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterBpuRequest registerBpuRequest);

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckResidenceInfoRequest checkResidenceInfoRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequestAuth phoneVerificationRequestAuth);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationRequest emailVerificationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequest phoneVerificationRequest);

    deriveCodec<GetDataSertakanDonaturResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetDataSertakanDonaturWebviewRequest getDataSertakanDonaturWebviewRequest);

    deriveCodec<List<CodeNamePair>> b(BaseRequest baseRequest);

    deriveCodec<BaseModel> b(CheckResidenceInfoRequestAuth checkResidenceInfoRequestAuth);

    deriveCodec<BaseItem> b(InsertJmoPairRequest insertJmoPairRequest);
}
