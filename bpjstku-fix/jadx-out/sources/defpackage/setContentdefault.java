package defpackage;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.pmi.model.PmiBranchOffice;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setContentdefault {
    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest);

    deriveCodec<Registration> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PmiRegistrationRequest pmiRegistrationRequest);

    deriveCodec<List<PmiBranchOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckPassportRequest checkPassportRequest);

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckResidenceInfoRequest checkResidenceInfoRequest);

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CityRequest cityRequest);

    deriveCodec<List<CodeNamePair>> b(BaseRequest baseRequest);
}
