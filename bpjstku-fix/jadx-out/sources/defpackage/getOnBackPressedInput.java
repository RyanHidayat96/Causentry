package defpackage;

import com.bpjstku.data.ewallet.motionpay.MotionRepository;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnBackPressedInput implements onBackPressedDispatcher_delegatelambda00 {
    private final MotionRepository TuitionPaymentFragmentbindingInflater1;

    public getOnBackPressedInput(MotionRepository motionRepository) {
        Intrinsics.checkNotNullParameter(motionRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = motionRepository;
    }

    @Override // defpackage.onBackPressedDispatcher_delegatelambda00
    public final deriveCodec<MotionLinkingResponse> TuitionPaymentFragmentbindingInflater1(MotionLinkingRequest motionLinkingRequest) {
        Intrinsics.checkNotNullParameter(motionLinkingRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.linkAccount(motionLinkingRequest);
    }

    @Override // defpackage.onBackPressedDispatcher_delegatelambda00
    public final deriveCodec<MotionCheckConnectResponse> b(MotionCheckConnectRequest motionCheckConnectRequest) {
        Intrinsics.checkNotNullParameter(motionCheckConnectRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.checkConnect(motionCheckConnectRequest);
    }

    @Override // defpackage.onBackPressedDispatcher_delegatelambda00
    public final deriveCodec<BaseModel> b(MotionUnlinkRequest motionUnlinkRequest) {
        Intrinsics.checkNotNullParameter(motionUnlinkRequest, "");
        return this.TuitionPaymentFragmentbindingInflater1.unLinkAccountMpay(motionUnlinkRequest);
    }
}
