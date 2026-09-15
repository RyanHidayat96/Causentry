package defpackage;

import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;

/* JADX INFO: loaded from: classes3.dex */
public interface onBackPressedDispatcher_delegatelambda00 {
    deriveCodec<MotionLinkingResponse> TuitionPaymentFragmentbindingInflater1(MotionLinkingRequest motionLinkingRequest);

    deriveCodec<MotionCheckConnectResponse> b(MotionCheckConnectRequest motionCheckConnectRequest);

    deriveCodec<BaseModel> b(MotionUnlinkRequest motionUnlinkRequest);
}
