package com.bpjstku.data.setting;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.model.request.AddKpjRequest;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePasswordRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.ChangeProfilePictureRequest;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.request.VerificationOtpRequest;
import com.bpjstku.data.setting.model.response.ApitoClientResponse;
import com.bpjstku.data.setting.model.response.ChangeEmailItem;
import com.bpjstku.data.setting.model.response.ChangePasswordItem;
import com.bpjstku.data.setting.model.response.ChangePhoneItem;
import com.bpjstku.data.setting.model.response.ClientToApiResponse;
import com.bpjstku.data.setting.model.response.ExpResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.data.setting.model.response.KpjItemAdded;
import com.bpjstku.data.setting.model.response.ProfilePictureItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b'\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\u0007J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b*\u0010!J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b+\u0010%J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b/\u0010%J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b0\u0010\u001aJ\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020(0\u0004H'¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u0004H'¢\u0006\u0004\b3\u00102J\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\u0006\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0004H'¢\u0006\u0004\b9\u00102J-\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\u0006\u0010\u0003\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H'¢\u0006\u0004\b?\u0010@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/setting/SettingRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ChangeEmailItem;", "postChangeEmail", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "Lcom/bpjstku/data/setting/model/response/KpjItemAdded;", "postAddKpj", "(Lcom/bpjstku/data/setting/model/request/AddKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;", "Lcom/bpjstku/data/setting/model/response/ProfilePictureItem;", "postChangeProfilePicture", "(Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePhoneItem;", "postChangePhoneNumber", "(Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePasswordItem;", "postChangePassword", "(Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "changeEmailVerificationHandphone", "(Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "changeEmailVerificationHandphoneOtp", "(Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;)LderiveCodec;", "changeEmailVerification", "changeEmailVerificationOtp", "Lcom/bpjstku/data/lib/model/BaseItem;", "changeEmail", "changeHandphoneVerificationEmail", "changeHandphoneVerificationEmailOtp", "Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "changeHandphoneVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;)LderiveCodec;", "changeHandphoneVerificationOtp", "changeHandphone", "getTimeServer", "()LderiveCodec;", "getTimeDetailServer", "Lcom/bpjstku/data/setting/model/request/KeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "getGenerateKey", "(Lcom/bpjstku/data/setting/model/request/KeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "getApiToClient", "", "p1", "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "p2", "Lcom/bpjstku/data/setting/model/response/ClientToApiResponse;", "getClientToApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/ExpResponse;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SettingRepository extends getChildrenOutConfigs {
    deriveCodec<BaseItem> changeEmail(ChangeEmailRequest p0);

    deriveCodec<VerificationItem> changeEmailVerification(ChangeEmailVerificationRequest p0);

    deriveCodec<VerificationItem> changeEmailVerificationHandphone(ChangeDataFirstVerificationRequest p0);

    deriveCodec<VerificationSignatureItem> changeEmailVerificationHandphoneOtp(VerificationOtpRequest p0);

    deriveCodec<VerificationSignatureItem> changeEmailVerificationOtp(VerificationOtpRequest p0);

    deriveCodec<BaseItem> changeHandphone(ChangePhoneNumberRequest p0);

    deriveCodec<VerificationItem> changeHandphoneVerification(ChangeHandphoneVerificationRequest p0);

    deriveCodec<VerificationItem> changeHandphoneVerificationEmail(ChangeDataFirstVerificationRequest p0);

    deriveCodec<VerificationSignatureItem> changeHandphoneVerificationEmailOtp(VerificationOtpRequest p0);

    deriveCodec<VerificationSignatureItem> changeHandphoneVerificationOtp(VerificationOtpRequest p0);

    deriveCodec<ApitoClientResponse> getApiToClient();

    deriveCodec<ClientToApiResponse> getClientToApi(String p0, String p1, ExpResponse p2);

    deriveCodec<KeyResponse> getGenerateKey(KeyRequest p0);

    deriveCodec<BaseItem> getTimeDetailServer();

    deriveCodec<BaseItem> getTimeServer();

    deriveCodec<KpjItemAdded> postAddKpj(AddKpjRequest p0);

    deriveCodec<ChangeEmailItem> postChangeEmail(ChangeEmailRequest p0);

    deriveCodec<ChangePasswordItem> postChangePassword(ChangePasswordRequest p0);

    deriveCodec<ChangePhoneItem> postChangePhoneNumber(ChangePhoneNumberRequest p0);

    deriveCodec<ProfilePictureItem> postChangeProfilePicture(ChangeProfilePictureRequest p0);

    deriveCodec<VerificationItem> postEmailVerification(ChangeEmailVerificationRequest p0);

    deriveCodec<VerificationItem> postPhoneVerification(PhoneVerificationRequest p0);
}
