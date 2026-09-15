package com.bpjstku.data.devicebinding.remote;

import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessBeginRequest;
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
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJW\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApi;", "LunbindChildren;", "Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApiClient;)V", "", "Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "p1", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "checkMembership", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SendEmailOtpResponse;", "sendEmailOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "verifyOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SubmitDeviceBindingResponse;", "submitDeviceBinding", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "livenessBegin", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;)LderiveCodec;", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p2", "p3", "p4", "Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "livenessEnd", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceBindingApi implements unbindChildren, DeviceBindingApiClient {
    public static final int $stable = 8;
    private final DeviceBindingApiClient apiClient;

    public DeviceBindingApi(DeviceBindingApiClient deviceBindingApiClient) {
        Intrinsics.checkNotNullParameter(deviceBindingApiClient, "");
        this.apiClient = deviceBindingApiClient;
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<CheckMembershipResponse>> checkMembership(String p0, CheckMembershipRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.checkMembership(p0, p1);
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<SendEmailOtpResponse>> sendEmailOtp(String p0, SendEmailOtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.sendEmailOtp(p0, p1);
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<BaseItem>> verifyOtp(String p0, VerifyOtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.verifyOtp(p0, p1);
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<SubmitDeviceBindingResponse>> submitDeviceBinding(String p0, SubmitDeviceBindingRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.submitDeviceBinding(p0, p1);
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<LivenessBeginResponse>> livenessBegin(String p0, LivenessBeginRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.livenessBegin(p0, p1);
    }

    @Override // com.bpjstku.data.devicebinding.remote.DeviceBindingApiClient
    public final deriveCodec<Response<LivenessEndResponse>> livenessEnd(String p0, Map<String, ? extends RequestBody> p1, MultipartBody.Part p2, MultipartBody.Part p3, MultipartBody.Part p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.livenessEnd(p0, p1, p2, p3, p4);
    }
}
