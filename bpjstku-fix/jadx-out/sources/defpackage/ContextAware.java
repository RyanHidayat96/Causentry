package defpackage;

import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.request.SyariahUpdateMembershipRequest;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.syariah.model.FaqSyariah;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ContextAware {
    deriveCodec<SyariahMembershipCheckItem> TuitionPaymentFragmentbindingInflater1(SyariahMembershipCheckRequest syariahMembershipCheckRequest);

    deriveCodec<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahEakadPdfRequest syariahEakadPdfRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahUpdateMembershipRequest syariahUpdateMembershipRequest);

    deriveCodec<List<FaqSyariah>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahFaqRequest syariahFaqRequest);
}
