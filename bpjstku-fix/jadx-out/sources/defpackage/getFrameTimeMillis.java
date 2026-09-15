package defpackage;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface getFrameTimeMillis {
    deriveCodec<List<RegionalOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest);

    deriveCodec<BranchOfficeDefaultSelectedResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BranchOfficeDefaultSelectedRequest branchOfficeDefaultSelectedRequest);

    deriveCodec<List<Office>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BranchOfficeRequest branchOfficeRequest);

    deriveCodec<List<RegionalOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest);

    deriveCodec<List<Office>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest);

    deriveCodec<Office> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NearestBranchOfficeRequest nearestBranchOfficeRequest);
}
