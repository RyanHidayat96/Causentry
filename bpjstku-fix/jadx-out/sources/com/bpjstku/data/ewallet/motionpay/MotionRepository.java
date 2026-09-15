package com.bpjstku.data.ewallet.motionpay;

import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/MotionRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "linkAccount", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "checkConnect", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "Lcom/bpjstku/domain/general/model/BaseModel;", "unLinkAccountMpay", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MotionRepository extends getChildrenOutConfigs {
    deriveCodec<MotionCheckConnectResponse> checkConnect(MotionCheckConnectRequest p0);

    deriveCodec<MotionLinkingResponse> linkAccount(MotionLinkingRequest p0);

    deriveCodec<BaseModel> unLinkAccountMpay(MotionUnlinkRequest p0);
}
