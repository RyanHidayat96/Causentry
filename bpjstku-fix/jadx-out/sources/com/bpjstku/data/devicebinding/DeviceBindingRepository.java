package com.bpjstku.data.devicebinding;

import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessBeginRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessEndRequest;
import com.bpjstku.data.devicebinding.model.request.SendEmailOtpRequest;
import com.bpjstku.data.devicebinding.model.request.SubmitDeviceBindingRequest;
import com.bpjstku.data.devicebinding.model.request.VerifyOtpRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/devicebinding/DeviceBindingRepository;", "LgetChildrenOutConfigs;", "", "p0", "Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "p1", "LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "checkMembership", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SendEmailOtpResponse;", "sendEmailOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "verifyOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SubmitDeviceBindingResponse;", "submitDeviceBinding", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "livenessBegin", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "livenessEnd", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DeviceBindingRepository extends getChildrenOutConfigs {
    deriveCodec<CheckMembershipResponse> checkMembership(String p0, CheckMembershipRequest p1);

    deriveCodec<LivenessBeginResponse> livenessBegin(String p0, LivenessBeginRequest p1);

    deriveCodec<LivenessEndResponse> livenessEnd(String p0, LivenessEndRequest p1);

    deriveCodec<SendEmailOtpResponse> sendEmailOtp(String p0, SendEmailOtpRequest p1);

    deriveCodec<SubmitDeviceBindingResponse> submitDeviceBinding(String p0, SubmitDeviceBindingRequest p1);

    deriveCodec<BaseItem> verifyOtp(String p0, VerifyOtpRequest p1);
}
