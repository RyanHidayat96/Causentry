package defpackage;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.digitalcard.model.PMIMembershipInformation;
import com.bpjstku.domain.digitalcard.model.PUMembershipInformation;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ensureViewModelStore {
    deriveCodec<List<DigitalCard>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(DigitalCardRequest digitalCardRequest);

    InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(DigitalCardImageRequest digitalCardImageRequest);

    deriveCodec<PMIMembershipInformation> TuitionPaymentFragmentspecialinlinedviewModeldefault2(MembershipInformationRequest membershipInformationRequest);

    deriveCodec<PUMembershipInformation> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MembershipInformationRequest membershipInformationRequest);

    deriveCodec<BPUMembershipInformation> b(MembershipInformationRequest membershipInformationRequest);
}
