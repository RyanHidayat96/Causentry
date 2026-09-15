package defpackage;

import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessEndRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.model.BaseItem;

/* JADX INFO: loaded from: classes3.dex */
public interface r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ {
    deriveCodec<SubmitDeviceBindingResponse> TuitionPaymentFragmentbindingInflater1(String str);

    deriveCodec<LivenessBeginResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2);

    deriveCodec<SendEmailOtpResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str);

    deriveCodec<CheckMembershipResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, CheckMembershipRequest checkMembershipRequest);

    deriveCodec<LivenessEndResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, LivenessEndRequest livenessEndRequest);
}
