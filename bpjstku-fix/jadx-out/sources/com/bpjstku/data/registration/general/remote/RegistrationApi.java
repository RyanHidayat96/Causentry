package com.bpjstku.data.registration.general.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u0012J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010 J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J+\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010$J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010'J+\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010(J#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J+\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020,H\u0017¢\u0006\u0004\b.\u00100J\\\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u0001042\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\b7\u00108Jd\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u001b\b\u0001\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u0001042\n\b\u0001\u00109\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\b7\u0010:J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010>J+\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010?Jp\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u001b\b\u0001\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u0001042\n\b\u0001\u00109\u001a\u0004\u0018\u0001042\n\b\u0001\u0010@\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\bA\u0010BJp\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u001b\b\u0001\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u0001042\n\b\u0001\u00109\u001a\u0004\u0018\u0001042\n\b\u0001\u0010@\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\bC\u0010BJ#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\bD\u0010/J+\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020,H\u0017¢\u0006\u0004\bD\u00100J\\\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u0001042\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\bE\u00108Jd\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u001b\b\u0001\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u000702¢\u0006\u0002\b3\u0018\u0001012\n\b\u0001\u00105\u001a\u0004\u0018\u0001042\n\b\u0001\u00106\u001a\u0004\u0018\u0001042\n\b\u0001\u00109\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\bE\u0010:J#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\b0\u00072\u0006\u0010\u0003\u001a\u00020FH\u0017¢\u0006\u0004\bH\u0010IJ+\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020FH\u0017¢\u0006\u0004\bH\u0010JR\u0014\u0010K\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010L"}, d2 = {"Lcom/bpjstku/data/registration/general/remote/RegistrationApi;", "LunbindChildren;", "Lcom/bpjstku/data/registration/general/remote/RegistrationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/registration/general/remote/RegistrationApiClient;)V", "Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postRegistration", "(Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "postMembershipCheckInfo", "(Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "postMembershipCheckEligibleResetAccount", "(Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "postEmailActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;", "postPhoneActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "postActivation", "(Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;", "verifyCountBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p2", "p3", "verifyBiometric", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "p4", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "generateKey", "(Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "p5", "postNewRegistration", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "postNewActivation", "verifyCountActivationBiometric", "verifyActivationBiometric", "Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "ocrKtp", "(Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/registration/general/remote/RegistrationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationApi implements unbindChildren, RegistrationApiClient {
    public static final int $stable = 8;
    private final RegistrationApiClient apiClient;

    public RegistrationApi(RegistrationApiClient registrationApiClient) {
        Intrinsics.checkNotNullParameter(registrationApiClient, "");
        this.apiClient = registrationApiClient;
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postRegistration(RegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postRegistration(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailVerification(@Body EmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postEmailVerification(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailVerification(String p0, EmailVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postEmailVerification(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneVerification(@Body PhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPhoneVerification(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneVerification(String p0, PhoneVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postPhoneVerification(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<MembershipCheckItem>> postMembershipCheckInfo(MembershipCheckRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postMembershipCheckInfo(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<MembershipCheckItem>> postMembershipCheckInfo(String p0, MembershipCheckRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postMembershipCheckInfo(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<ActivationItem>> postMembershipCheckEligibleResetAccount(ActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postMembershipCheckEligibleResetAccount(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<ActivationItem>> postMembershipCheckEligibleResetAccount(String p0, ActivationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postMembershipCheckEligibleResetAccount(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailActivationVerification(@Body EmailActivationVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postEmailActivationVerification(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailActivationVerification(String p0, EmailActivationVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postEmailActivationVerification(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneActivationVerification(@Body PhoneActivationVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPhoneActivationVerification(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneActivationVerification(String p0, PhoneActivationVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postPhoneActivationVerification(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postActivation(UpdateActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postActivation(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyCountBiometric(VerifyCountBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyCountBiometric(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyCountBiometric(String p0, VerifyCountBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.verifyCountBiometric(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyBiometric(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3) {
        return this.apiClient.verifyBiometric(p0, p1, p2, p3);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyBiometric(String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyBiometric(p0, p1, p2, p3, p4);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<KeyResponse>> generateKey(GenerateKeyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.generateKey(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<KeyResponse>> generateKey(String p0, GenerateKeyRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.generateKey(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postNewRegistration(String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postNewRegistration(p0, p1, p2, p3, p4, p5);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postNewActivation(String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postNewActivation(p0, p1, p2, p3, p4, p5);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyCountActivationBiometric(VerifyCountBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyCountActivationBiometric(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyCountActivationBiometric(String p0, VerifyCountBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.verifyCountActivationBiometric(p0, p1);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyActivationBiometric(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3) {
        return this.apiClient.verifyActivationBiometric(p0, p1, p2, p3);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<VerifyBiometricResponse>> verifyActivationBiometric(String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyActivationBiometric(p0, p1, p2, p3, p4);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<OcrKtpResponse>> ocrKtp(OcrKtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.ocrKtp(p0);
    }

    @Override // com.bpjstku.data.registration.general.remote.RegistrationApiClient
    public final deriveCodec<Response<OcrKtpResponse>> ocrKtp(String p0, OcrKtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.ocrKtp(p0, p1);
    }
}
