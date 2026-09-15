package defpackage;

import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest;
import com.bpjstku.data.report.model.request.ReportWorkAccidentRequest;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.report.model.Healthcare;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ComposePredictiveBackHandlerlaunchNewGesture11 {
    deriveCodec<BaseModel> TuitionPaymentFragmentbindingInflater1(ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest);

    deriveCodec<PreloadDataResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreloadDataRequest preloadDataRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(DataCorrectionRequest dataCorrectionRequest);

    deriveCodec<List<Healthcare>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NearestHealthcareRequest nearestHealthcareRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportWorkAccidentRequest reportWorkAccidentRequest);
}
