package com.bpjstku.data.registration.general;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.registration.general.remote.RegistrationApi;
import com.bpjstku.data.setting.model.response.KeyResponse;
import defpackage.Api23Impl;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001fJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J%\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010'J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010/J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b1\u00102J%\u00101\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000200H\u0017¢\u0006\u0004\b1\u00103J\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00072\u0006\u0010\u0003\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J%\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000204H\u0017¢\u0006\u0004\b6\u00108J%\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000209H\u0017¢\u0006\u0004\b:\u0010;J%\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020<H\u0017¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010.J%\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010/J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b@\u00102J%\u0010@\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000200H\u0017¢\u0006\u0004\b@\u00103J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00072\u0006\u0010\u0003\u001a\u00020AH\u0017¢\u0006\u0004\bC\u0010DJ%\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020AH\u0017¢\u0006\u0004\bC\u0010ER\u001a\u0010F\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010K\u001a\u0004\u0018\u00010J8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N"}, d2 = {"Lcom/bpjstku/data/registration/general/RegistrationDataStore;", "Lcom/bpjstku/data/registration/general/RegistrationRepository;", "Lcom/bpjstku/data/registration/general/remote/RegistrationApi;", "p0", "<init>", "(Lcom/bpjstku/data/registration/general/remote/RegistrationApi;)V", "Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postRegistration", "(Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "postMembershipCheckInfo", "(Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "postMembershipCheckEligibleResetAccount", "(Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "postEmailActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;", "postPhoneActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "postActivation", "(Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;", "verifyCountBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;", "verifyBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "generateKey", "(Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;", "postNewRegistration", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;", "postNewActivation", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;)LderiveCodec;", "verifyCountActivationBiometric", "verifyActivationBiometric", "Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "ocrKtp", "(Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/registration/general/remote/RegistrationApi;", "getWebService", "()Lcom/bpjstku/data/registration/general/remote/RegistrationApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationDataStore implements RegistrationRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final RegistrationApi webService;

    public RegistrationDataStore(RegistrationApi registrationApi) {
        Intrinsics.checkNotNullParameter(registrationApi, "");
        this.webService = registrationApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7730getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final RegistrationApi m7731getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<BaseItem> postRegistration(RegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostRegistration = m7731getWebService().postRegistration(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostRegistration, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postRegistration$lambda$0((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda53
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postRegistration$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postRegistration$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postEmailVerification(@Body EmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailVerification = m7731getWebService().postEmailVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postEmailVerification$lambda$2((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postEmailVerification$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postEmailVerification(String p0, @Body EmailVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailVerification = m7731getWebService().postEmailVerification(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postEmailVerification$lambda$4((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postEmailVerification$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneVerification(@Body PhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneVerification = m7731getWebService().postPhoneVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postPhoneVerification$lambda$6((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda55
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postPhoneVerification$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneVerification$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneVerification(String p0, PhoneVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneVerification = m7731getWebService().postPhoneVerification(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postPhoneVerification$lambda$8((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda39
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postPhoneVerification$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneVerification$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<MembershipCheckItem> postMembershipCheckInfo(MembershipCheckRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MembershipCheckItem>> derivecodecPostMembershipCheckInfo = m7731getWebService().postMembershipCheckInfo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostMembershipCheckInfo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postMembershipCheckInfo$lambda$10((MembershipCheckItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda43
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postMembershipCheckInfo$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MembershipCheckItem postMembershipCheckInfo$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MembershipCheckItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<MembershipCheckItem> postMembershipCheckInfo(String p0, MembershipCheckRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<MembershipCheckItem>> derivecodecPostMembershipCheckInfo = m7731getWebService().postMembershipCheckInfo(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostMembershipCheckInfo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postMembershipCheckInfo$lambda$12((MembershipCheckItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda51
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postMembershipCheckInfo$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MembershipCheckItem postMembershipCheckInfo$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MembershipCheckItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<ActivationItem> postMembershipCheckEligibleResetAccount(ActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ActivationItem>> derivecodecPostMembershipCheckEligibleResetAccount = m7731getWebService().postMembershipCheckEligibleResetAccount(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostMembershipCheckEligibleResetAccount, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postMembershipCheckEligibleResetAccount$lambda$14((ActivationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda35
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postMembershipCheckEligibleResetAccount$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivationItem postMembershipCheckEligibleResetAccount$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<ActivationItem> postMembershipCheckEligibleResetAccount(String p0, ActivationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<ActivationItem>> derivecodecPostMembershipCheckEligibleResetAccount = m7731getWebService().postMembershipCheckEligibleResetAccount(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostMembershipCheckEligibleResetAccount, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postMembershipCheckEligibleResetAccount$lambda$16((ActivationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postMembershipCheckEligibleResetAccount$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivationItem postMembershipCheckEligibleResetAccount$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postEmailActivationVerification(EmailActivationVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailActivationVerification = m7731getWebService().postEmailActivationVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailActivationVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postEmailActivationVerification$lambda$18((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda46
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postEmailActivationVerification$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailActivationVerification$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postEmailActivationVerification(String p0, EmailActivationVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailActivationVerification = m7731getWebService().postEmailActivationVerification(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailActivationVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postEmailActivationVerification$lambda$20((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postEmailActivationVerification$lambda$21(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailActivationVerification$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneActivationVerification(PhoneActivationVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneActivationVerification = m7731getWebService().postPhoneActivationVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneActivationVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postPhoneActivationVerification$lambda$22((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postPhoneActivationVerification$lambda$23(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneActivationVerification$lambda$23(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerificationItem> postPhoneActivationVerification(String p0, PhoneActivationVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneActivationVerification = m7731getWebService().postPhoneActivationVerification(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneActivationVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postPhoneActivationVerification$lambda$24((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda48
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postPhoneActivationVerification$lambda$25(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneActivationVerification$lambda$25(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerificationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<BaseItem> postActivation(UpdateActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostActivation = m7731getWebService().postActivation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostActivation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postActivation$lambda$26((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda41
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postActivation$lambda$27(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postActivation$lambda$27(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyCountBiometric(VerifyCountBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyCountBiometric = m7731getWebService().verifyCountBiometric(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyCountBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyCountBiometric$lambda$28((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyCountBiometric$lambda$29(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountBiometric$lambda$29(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyCountBiometric(String p0, VerifyCountBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyCountBiometric = m7731getWebService().verifyCountBiometric(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyCountBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyCountBiometric$lambda$30((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda32
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyCountBiometric$lambda$31(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountBiometric$lambda$31(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyBiometric(VerifyBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File file = p0.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p0.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p0.getFile3();
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyBiometric = registrationApiM7731getWebService.verifyBiometric(partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyBiometric$lambda$32((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda50
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyBiometric$lambda$33(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyBiometric$lambda$33(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyBiometric(String p0, VerifyBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p1.getPartMap();
        File file = p1.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p1.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p1.getFile3();
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyBiometric = registrationApiM7731getWebService.verifyBiometric(p0, partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyBiometric$lambda$34((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyBiometric$lambda$35(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyBiometric$lambda$35(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<KeyResponse> generateKey(GenerateKeyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<KeyResponse>> derivecodecGenerateKey = m7731getWebService().generateKey(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecGenerateKey, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.generateKey$lambda$36((KeyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.generateKey$lambda$37(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyResponse generateKey$lambda$37(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (KeyResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<KeyResponse> generateKey(String p0, GenerateKeyRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<KeyResponse>> derivecodecGenerateKey = m7731getWebService().generateKey(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecGenerateKey, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.generateKey$lambda$38((KeyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.generateKey$lambda$39(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyResponse generateKey$lambda$39(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (KeyResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<BaseItem> postNewRegistration(String p0, NewRegisterRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p1.getPartMap();
        File file = p1.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p1.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p1.getFile3();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault4 = file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null;
        File fileKtp = p1.getFileKtp();
        deriveCodec<Response<BaseItem>> derivecodecPostNewRegistration = registrationApiM7731getWebService.postNewRegistration(p0, partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, partTuitionPaymentFragmentspecialinlinedviewModeldefault4, fileKtp != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileKtp, "fileKtp") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostNewRegistration, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postNewRegistration$lambda$40((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postNewRegistration$lambda$41(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postNewRegistration$lambda$41(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<BaseItem> postNewActivation(String p0, NewActivationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p1.getPartMap();
        File file = p1.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p1.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p1.getFile3();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault4 = file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null;
        File fileKtp = p1.getFileKtp();
        deriveCodec<Response<BaseItem>> derivecodecPostNewActivation = registrationApiM7731getWebService.postNewActivation(p0, partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, partTuitionPaymentFragmentspecialinlinedviewModeldefault4, fileKtp != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileKtp, "fileKtp") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostNewActivation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda14
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 780184226;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.postNewActivation$lambda$42((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.postNewActivation$lambda$43(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postNewActivation$lambda$43(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyCountActivationBiometric(VerifyCountBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyCountActivationBiometric = m7731getWebService().verifyCountActivationBiometric(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyCountActivationBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyCountActivationBiometric$lambda$44((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda28
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyCountActivationBiometric$lambda$45(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountActivationBiometric$lambda$45(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyCountActivationBiometric(String p0, VerifyCountBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyCountActivationBiometric = m7731getWebService().verifyCountActivationBiometric(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyCountActivationBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyCountActivationBiometric$lambda$46((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyCountActivationBiometric$lambda$47(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountActivationBiometric$lambda$47(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyActivationBiometric(VerifyBiometricRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        File file = p0.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p0.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p0.getFile3();
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyActivationBiometric = registrationApiM7731getWebService.verifyActivationBiometric(partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyActivationBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyActivationBiometric$lambda$48((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyActivationBiometric$lambda$49(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyActivationBiometric$lambda$49(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<VerifyBiometricResponse> verifyActivationBiometric(String p0, VerifyBiometricRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RegistrationApi registrationApiM7731getWebService = m7731getWebService();
        Map<String, RequestBody> partMap = p1.getPartMap();
        File file = p1.getFile();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, "file") : null;
        File file2 = p1.getFile2();
        MultipartBody.Part partTuitionPaymentFragmentspecialinlinedviewModeldefault3 = file2 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, "file2") : null;
        File file3 = p1.getFile3();
        deriveCodec<Response<VerifyBiometricResponse>> derivecodecVerifyActivationBiometric = registrationApiM7731getWebService.verifyActivationBiometric(p0, partMap, partTuitionPaymentFragmentspecialinlinedviewModeldefault2, partTuitionPaymentFragmentspecialinlinedviewModeldefault3, file3 != null ? createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, "file3") : null);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyActivationBiometric, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.verifyActivationBiometric$lambda$50((VerifyBiometricResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.verifyActivationBiometric$lambda$51(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyActivationBiometric$lambda$51(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (VerifyBiometricResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<OcrKtpResponse> ocrKtp(OcrKtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OcrKtpResponse>> derivecodecOcrKtp = m7731getWebService().ocrKtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecOcrKtp, unbindVar);
        final RegistrationDataStore$$ExternalSyntheticLambda36 registrationDataStore$$ExternalSyntheticLambda36 = new RegistrationDataStore$$ExternalSyntheticLambda36();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda37
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.ocrKtp$lambda$53(registrationDataStore$$ExternalSyntheticLambda36, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrKtpResponse ocrKtp$lambda$53(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OcrKtpResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.registration.general.RegistrationRepository
    public final deriveCodec<OcrKtpResponse> ocrKtp(String p0, OcrKtpRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<OcrKtpResponse>> derivecodecOcrKtp = m7731getWebService().ocrKtp(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecOcrKtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationDataStore.ocrKtp$lambda$54((OcrKtpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return RegistrationDataStore.ocrKtp$lambda$55(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrKtpResponse ocrKtp$lambda$55(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OcrKtpResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyResponse generateKey$lambda$36(KeyResponse keyResponse) {
        Intrinsics.checkNotNullParameter(keyResponse, "");
        return keyResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyResponse generateKey$lambda$38(KeyResponse keyResponse) {
        Intrinsics.checkNotNullParameter(keyResponse, "");
        return keyResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrKtpResponse ocrKtp$lambda$52(OcrKtpResponse ocrKtpResponse) {
        Intrinsics.checkNotNullParameter(ocrKtpResponse, "");
        return ocrKtpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrKtpResponse ocrKtp$lambda$54(OcrKtpResponse ocrKtpResponse) {
        Intrinsics.checkNotNullParameter(ocrKtpResponse, "");
        return ocrKtpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postActivation$lambda$26(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailActivationVerification$lambda$18(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailActivationVerification$lambda$20(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$2(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postEmailVerification$lambda$4(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivationItem postMembershipCheckEligibleResetAccount$lambda$14(ActivationItem activationItem) {
        Intrinsics.checkNotNullParameter(activationItem, "");
        return activationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivationItem postMembershipCheckEligibleResetAccount$lambda$16(ActivationItem activationItem) {
        Intrinsics.checkNotNullParameter(activationItem, "");
        return activationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MembershipCheckItem postMembershipCheckInfo$lambda$10(MembershipCheckItem membershipCheckItem) {
        Intrinsics.checkNotNullParameter(membershipCheckItem, "");
        return membershipCheckItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MembershipCheckItem postMembershipCheckInfo$lambda$12(MembershipCheckItem membershipCheckItem) {
        Intrinsics.checkNotNullParameter(membershipCheckItem, "");
        return membershipCheckItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postNewActivation$lambda$42(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postNewRegistration$lambda$40(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneActivationVerification$lambda$22(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneActivationVerification$lambda$24(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneVerification$lambda$6(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationItem postPhoneVerification$lambda$8(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        return verificationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postRegistration$lambda$0(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyActivationBiometric$lambda$48(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyActivationBiometric$lambda$50(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyBiometric$lambda$32(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyBiometric$lambda$34(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountActivationBiometric$lambda$44(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountActivationBiometric$lambda$46(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountBiometric$lambda$28(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyBiometricResponse verifyCountBiometric$lambda$30(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        return verifyBiometricResponse;
    }
}
