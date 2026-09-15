package defpackage;

import android.graphics.Bitmap;
import com.bpjstku.data.user.model.request.ForgotAccountRequest;
import com.bpjstku.data.user.model.request.ForgotPasswd;
import com.bpjstku.data.user.model.request.ForgotPasswordByEmailRequest;
import com.bpjstku.data.user.model.request.ForgotPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.LoginRequest;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.data.user.model.request.NotificationBadgeRequest;
import com.bpjstku.data.user.model.request.ProfilePictureRequest;
import com.bpjstku.data.user.model.request.ResetPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.ResetPasswordRequest;
import com.bpjstku.data.user.model.request.UserRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.ForgotAccount;
import com.bpjstku.domain.user.model.Login;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.user.model.UserAccessToken;
import com.bpjstku.domain.user.model.ValidationOtp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0016H&¢\u0006\u0004\b\n\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0016H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0016H'¢\u0006\u0004\b\u000e\u0010\u001cJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\r\u001a\u00020\u001dH'¢\u0006\u0004\b\u0014\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H'¢\u0006\u0004\b \u0010\bJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010\r\u001a\u00020!H'¢\u0006\u0004\b\u0014\u0010#J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010\r\u001a\u00020$H'¢\u0006\u0004\b\u000e\u0010%J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020'0\u00052\u0006\u0010\r\u001a\u00020&H'¢\u0006\u0004\b\u001b\u0010(J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020*0\u00052\u0006\u0010\r\u001a\u00020)H'¢\u0006\u0004\b\u000e\u0010+J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020*0\u00052\u0006\u0010\r\u001a\u00020,H'¢\u0006\u0004\b\u0017\u0010-J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020/0\u00052\u0006\u0010\r\u001a\u00020.H'¢\u0006\u0004\b\u0017\u00100J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002020\u00052\u0006\u0010\r\u001a\u000201H'¢\u0006\u0004\b\u0017\u00103J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\r\u001a\u000204H'¢\u0006\u0004\b\u000e\u00105J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010\r\u001a\u000206H'¢\u0006\u0004\b\u001b\u00107J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u00108\u001a\u00020\u0016H'¢\u0006\u0004\b8\u0010\u0018J\u000f\u0010\u000e\u001a\u00020\u0016H'¢\u0006\u0004\b\u000e\u0010\u0018J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010\r\u001a\u000209H¦@¢\u0006\u0004\b\n\u0010<J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020>0\u00052\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0016H'¢\u0006\u0004\b\u000e\u0010?ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lregisterlambda1;", "", "", "g", "()Z", "LderiveCodec;", "Lcom/bpjstku/domain/general/model/BaseModel;", "a", "()LderiveCodec;", "", "TuitionPaymentFragmentbindingInflater1", "()V", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "p0", "b", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)LderiveCodec;", "Lcom/bpjstku/domain/user/model/User;", "asBinder", "()Lcom/bpjstku/domain/user/model/User;", "Lcom/bpjstku/domain/user/model/Login;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcom/bpjstku/domain/user/model/Login;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "LVideoEncoderSession1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)LVideoEncoderSession1;", "Lcom/bpjstku/data/user/model/request/LoginRequest;", "(Lcom/bpjstku/data/user/model/request/LoginRequest;)LderiveCodec;", "Lcom/bpjstku/domain/user/model/UserAccessToken;", "asInterface", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;", "Lcom/bpjstku/domain/user/model/ForgotAccount;", "(Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;", "LActivityResultRegistryExternalSyntheticLambda0;", "(Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;", "(Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Landroid/graphics/Bitmap;", "(Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;", "Lcom/bpjstku/domain/user/model/ValidationOtp;", "(Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UserRequest;", "(Lcom/bpjstku/data/user/model/request/UserRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswd;", "(Lcom/bpjstku/data/user/model/request/ForgotPasswd;)LderiveCodec;", "d", "Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;", "LsetOnImageAvailableListener;", "LActivityResultRegistryExternalSyntheticLambda1;", "(Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p1", "LonRestoreInstanceState;", "(Ljava/lang/String;Ljava/lang/String;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface registerlambda1 {
    Object TuitionPaymentFragmentbindingInflater1(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> continuation);

    void TuitionPaymentFragmentbindingInflater1();

    void TuitionPaymentFragmentbindingInflater1(String p0);

    Login TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    deriveCodec<ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForgotPasswordByEmailRequest p0);

    deriveCodec<User> TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoginRequest p0);

    VideoEncoderSession1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0);

    deriveCodec<ForgotAccount> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotAccountRequest p0);

    deriveCodec<ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotPasswd p0);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    deriveCodec<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ProfilePictureRequest p0);

    deriveCodec<ActivityResultRegistryExternalSyntheticLambda0> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ResetPasswordByPhoneRequest p0);

    deriveCodec<ValidationOtp> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ValidationOtpRequest p0);

    String TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    deriveCodec<BaseModel> a();

    User asBinder();

    deriveCodec<UserAccessToken> asInterface();

    VideoEncoderSession1 b(String p0);

    deriveCodec<ForgotPasswordItem> b(ForgotPasswordByPhoneRequest p0);

    deriveCodec<BaseModel> b(LogoutRequest p0);

    deriveCodec<ActivityResultRegistryExternalSyntheticLambda0> b(ResetPasswordRequest p0);

    deriveCodec<User> b(UserRequest p0);

    deriveCodec<onRestoreInstanceState> b(String p0, String p1);

    String b();

    String d();

    boolean g();
}
