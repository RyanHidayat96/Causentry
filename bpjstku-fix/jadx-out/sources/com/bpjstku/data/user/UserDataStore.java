package com.bpjstku.data.user;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.user.model.request.ForgotAccountRequest;
import com.bpjstku.data.user.model.request.ForgotPasswd;
import com.bpjstku.data.user.model.request.ForgotPasswordByEmailRequest;
import com.bpjstku.data.user.model.request.ForgotPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.LoginRequest;
import com.bpjstku.data.user.model.request.LoginV2Request;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.data.user.model.request.NotificationBadgeRequest;
import com.bpjstku.data.user.model.request.ProfilePictureRequest;
import com.bpjstku.data.user.model.request.RefreshTokenRequest;
import com.bpjstku.data.user.model.request.ResetPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.ResetPasswordRequest;
import com.bpjstku.data.user.model.request.UpdateDeviceToken;
import com.bpjstku.data.user.model.request.UpdateFCMRequest;
import com.bpjstku.data.user.model.request.UserRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotAccountItem;
import com.bpjstku.data.user.model.response.ForgotAccountResponse;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.data.user.model.response.LoginItem;
import com.bpjstku.data.user.model.response.LoginV2Response;
import com.bpjstku.data.user.model.response.NotificationBadgeResponse;
import com.bpjstku.data.user.model.response.RefreshTokenResponse;
import com.bpjstku.data.user.model.response.ResetPasswordItem;
import com.bpjstku.data.user.model.response.UserProfileItem;
import com.bpjstku.data.user.model.response.ValidationOtpItem;
import com.bpjstku.data.user.remote.UserApi;
import defpackage.ActivityResultRegistryExternalSyntheticLambda1;
import defpackage.Api23Impl;
import defpackage.VideoEncoderSession1;
import defpackage.deriveCodec;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.lambdasetCaptureRequestOptions0androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setOnImageAvailableListener;
import defpackage.share;
import defpackage.unbind;
import defpackage.unbindChildren;
import defpackage.unregisteractivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t2\u0006\u0010\u0003\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\t2\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\t2\u0006\u0010\u0003\u001a\u00020#H\u0017¢\u0006\u0004\b,\u0010&J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\t2\u0006\u0010\u0003\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\t2\u0006\u0010\u0003\u001a\u000201H\u0017¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002060\t2\u0006\u0010\u0003\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002020\t2\u0006\u0010\u0003\u001a\u000209H\u0017¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b<\u0010\u001bJ\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020(0\t2\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b=\u0010*J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020>H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020BH\u0017¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u0002060\t2\u0006\u0010\u0003\u001a\u000209H\u0017¢\u0006\u0004\bE\u0010;J\u001d\u0010G\u001a\b\u0012\u0004\u0012\u0002060\t2\u0006\u0010\u0003\u001a\u00020FH\u0017¢\u0006\u0004\bG\u0010HJ\u001d\u0010I\u001a\b\u0012\u0004\u0012\u0002020\t2\u0006\u0010\u0003\u001a\u000201H\u0017¢\u0006\u0004\bI\u00104J\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010\u0003\u001a\u00020JH\u0096@¢\u0006\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010T\u001a\u0004\u0018\u00010S8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010Z"}, d2 = {"Lcom/bpjstku/data/user/UserDataStore;", "Lcom/bpjstku/data/user/UserRepository;", "Lcom/bpjstku/data/user/remote/UserApi;", "p0", "Lcom/bpjstku/data/lib/PreferenceManager;", "p1", "<init>", "(Lcom/bpjstku/data/user/remote/UserApi;Lcom/bpjstku/data/lib/PreferenceManager;)V", "Lcom/bpjstku/data/user/model/request/LoginRequest;", "LderiveCodec;", "Lcom/bpjstku/data/user/model/response/LoginItem;", "postLogin", "(Lcom/bpjstku/data/user/model/request/LoginRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LoginV2Request;", "Lcom/bpjstku/data/user/model/response/LoginV2Response;", "postLoginV2", "(Lcom/bpjstku/data/user/model/request/LoginV2Request;)LderiveCodec;", "", "isLoggedIn", "()Z", "Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;", "Lcom/bpjstku/data/user/model/response/RefreshTokenResponse;", "postRefreshToken", "(Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;", "Lcom/bpjstku/data/user/model/response/ResetPasswordItem;", "postResetPassword", "(Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;", "postResetPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Lokhttp3/ResponseBody;", "getProfilePicture", "(Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UserRequest;", "Lcom/bpjstku/data/user/model/response/UserProfileItem;", "getProfile", "(Lcom/bpjstku/data/user/model/request/UserRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postLogout", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/response/KpjItem;", "getKpj", "Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;", "Lcom/bpjstku/data/user/model/response/ForgotAccountItem;", "postForgotAccount", "(Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;", "Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "postValidationOtpRequest", "(Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswd;", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "postForgotPasswdByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswd;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;", "postValidationOtpByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;)LderiveCodec;", "postResetPasswdByEmail", "postCustomLogout", "Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "LVideoEncoderSession1;", "updateRegistrationId", "(Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;)LVideoEncoderSession1;", "Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "updateDeviceToken", "(Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;)LVideoEncoderSession1;", "postForgotPasswordByEmail", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;", "postForgotPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;)LderiveCodec;", "postValidationOtpRequestAuth", "Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;", "LsetOnImageAvailableListener;", "LActivityResultRegistryExternalSyntheticLambda1;", "notificationBadge", "(Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userApi", "Lcom/bpjstku/data/user/remote/UserApi;", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "getWebService", "()Lcom/bpjstku/data/user/remote/UserApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserDataStore implements UserRepository {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final mergeChildrenConfigs dbService;
    private final PreferenceManager preferenceManager;
    private final UserApi userApi;
    private final UserApi webService;
    private static final byte[] $$d = {104, 27, -72, 120, 16, 1, 1, -7, 2, 18, -10, 50, -27, -9, 11, -10, 20, 64, -45, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -5, 6, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 209;
    private static final byte[] $$a = {19, 78, 114, 113, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 236;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX INFO: renamed from: com.bpjstku.data.user.UserDataStore$notificationBadge$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.data.user.UserDataStore", f = "UserDataStore.kt", i = {}, l = {198}, m = "notificationBadge", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserDataStore.this.notificationBadge(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r0 = com.bpjstku.data.user.UserDataStore.$$a
            int r6 = r6 + 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.UserDataStore.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 114 - r8
            int r7 = r7 * 3
            int r7 = r7 + 50
            byte[] r0 = com.bpjstku.data.user.UserDataStore.$$d
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.UserDataStore.d(short, byte, short, java.lang.Object[]):void");
    }

    public UserDataStore(UserApi userApi, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(userApi, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.userApi = userApi;
        this.preferenceManager = preferenceManager;
        this.webService = userApi;
    }

    /* JADX INFO: renamed from: getWebService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ unbindChildren m7805getWebService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        UserApi webService = getWebService();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return webService;
    }

    public final mergeChildrenConfigs getDbService() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        mergeChildrenConfigs mergechildrenconfigs = this.dbService;
        int i5 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return mergechildrenconfigs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UserApi getWebService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        UserApi userApi = this.webService;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return userApi;
    }

    private static final LoginItem postLogin$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        LoginItem loginItem = (LoginItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return loginItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<LoginItem> postLogin(LoginRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<LoginItem>> derivecodecPostLogin = getWebService().postLogin(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostLogin, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$1wA3LwNOgZR9cZAZQDDM1uKzLyc((LoginItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$cK36SQib4uoLzGQkRl9iNpIr0UQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final LoginV2Response postLoginV2$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        LoginV2Response loginV2Response = (LoginV2Response) function1.invoke(obj);
        int i4 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return loginV2Response;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<LoginV2Response> postLoginV2(LoginV2Request p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<LoginV2Response>> derivecodecPostLoginV2 = getWebService().postLoginV2(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostLoginV2, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.m7796$r8$lambda$7Qvcf34zJAPRxqfZ50ebNyHS2I((LoginV2Response) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$ZMEYloPP4lxHyEhIDmE9tVwlPDg(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final boolean isLoggedIn() {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (PreferenceManager.getString$default(this.preferenceManager, "USER_ACCESS_TOKEN", null, 2, null).length() > 0) {
            int i4 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static final RefreshTokenResponse postRefreshToken$lambda$5(Function1 function1, Object obj) {
        RefreshTokenResponse refreshTokenResponse;
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            refreshTokenResponse = (RefreshTokenResponse) function1.invoke(obj);
            int i3 = 99 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            refreshTokenResponse = (RefreshTokenResponse) function1.invoke(obj);
        }
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return refreshTokenResponse;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<RefreshTokenResponse> postRefreshToken(RefreshTokenRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RefreshTokenResponse>> derivecodecPostRefreshToken = getWebService().postRefreshToken(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostRefreshToken, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$LbmiMIunFNXeUpsI9zF8WYYIMxo((RefreshTokenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$W3MiIB0jBTtd7VucaKRDVFDEjZo(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ResetPasswordItem postResetPassword$lambda$7(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ResetPasswordItem resetPasswordItem = (ResetPasswordItem) function1.invoke(obj);
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return resetPasswordItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ResetPasswordItem> postResetPassword(ResetPasswordRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResetPasswordItem>> derivecodecPostResetPassword = getWebService().postResetPassword(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostResetPassword, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$6PyKSmgBQFm1OW5WN3zJjmqai0A((ResetPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7797$r8$lambda$BmGLvK7gjvx9d5csGHZE1ZBCqU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final ResetPasswordItem postResetPasswordByPhone$lambda$9(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResetPasswordItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ResetPasswordItem resetPasswordItem = (ResetPasswordItem) function1.invoke(obj);
        int i3 = 90 / 0;
        return resetPasswordItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ResetPasswordItem> postResetPasswordByPhone(ResetPasswordByPhoneRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResetPasswordItem>> derivecodecPostResetPasswordByPhone = getWebService().postResetPasswordByPhone(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostResetPasswordByPhone, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$o2w4lvDRr02HsA48QeMN_6O0FNU((ResetPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$rGPrL56aVql43njMtBVmxxGFELs(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 71;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 19472), 2624 - View.MeasureSpec.getMode(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 39422), Drawable.resolveOpacity(0, 0) + 481, 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39423 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 481, 37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 7;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final ResponseBody getProfilePicture$lambda$11(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseBody) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ResponseBody> getProfilePicture(ProfilePictureRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResponseBody>> profilePicture = getWebService().getProfilePicture(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(profilePicture, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$MSFZoKN_IQDmfZDNco_Ne0bT0Fo((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$3c4cNROs3Dc1tbpZsbBGkLeOOjI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final UserProfileItem getProfile$lambda$13(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        UserProfileItem userProfileItem = (UserProfileItem) function1.invoke(obj);
        int i3 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return userProfileItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<UserProfileItem> getProfile(UserRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<UserProfileItem>> profile = getWebService().getProfile(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(profile, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.m7794$r8$lambda$2sd03sHjYEX80jtBCA0oKCdESw((UserProfileItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$QROW0R2yGSoQN4uNCnzLuxG1YbU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return api23Impl;
    }

    private static final BaseItem postLogout$lambda$15(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (BaseItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<BaseItem> postLogout(LogoutRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostLogout = getWebService().postLogout(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostLogout, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$BO9AvA5H_VMhSpnrkmlnpvffE_4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda28
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7799$r8$lambda$US4dL8ew_EXIKJvoHvI4ESl0(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    /* JADX INFO: renamed from: com.bpjstku.data.user.UserDataStore$notificationBadge$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.data.user.UserDataStore$notificationBadge$2", f = "UserDataStore.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Response<NotificationBadgeResponse>>, Object> {
        final /* synthetic */ NotificationBadgeRequest $request;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objNotificationBadge = UserDataStore.this.getWebService().notificationBadge(this.$request, this);
            return objNotificationBadge == coroutine_suspended ? coroutine_suspended : objNotificationBadge;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$request = notificationBadgeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UserDataStore.this.new AnonymousClass2(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<NotificationBadgeResponse>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private static final KpjItem getKpj$lambda$17(Function1 function1, Object obj) {
        KpjItem kpjItem;
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            kpjItem = (KpjItem) function1.invoke(obj);
            int i3 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            kpjItem = (KpjItem) function1.invoke(obj);
        }
        int i4 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return kpjItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<KpjItem> getKpj(UserRequest p0) throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<KpjItem>> kpj = getWebService().getKpj(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
            int iBlue = Color.blue(0) + 921;
            int iGreen = Color.green(0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iBlue, iGreen, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{11439, 34051, 32748, 53333, 35373, 31880, 54648, 36757, 25017, 55814, 36030, 26268, 57107, 45562, 27216, 56358, 46739, 28510, 49620, 48056, 27665, 50938}, 43427 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{11435, 62755, 40877, 41021, 19129, 4910, 13740, 56859, 57507, 35110, 21416, 29745, 7851, 10030, 51621}, Process.getGidForName("") + 55682, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
            int iGreen2 = Color.green(0) + 28;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i3, iGreen2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int i4 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b5 = $$a[80];
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 50), (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iKeyCodeFromString, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (-165639206) + ((~((-1743514268) | i5)) * 979) + ((iIdentityHashCode | 30565376) * (-979)) + (((~(iIdentityHashCode | (-1743514268))) | (~(i5 | 30565376))) * 979) + 1035021119;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            i = b + 21;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{11439, 36053, 27712, 52707, 44405, 3822, 60948, 20435, 12039, 34979, 26668, 51687, 43507, 2396, 60124, 19068, 11240, 35682, 25728, 50200, 42430, 1343, 59058, 17960, 9815, 34759}, 41077 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{11437, 54288, 56810, 50877, 52743, 63479, 63672, 57378, 59878, 37565, 39436, 33790, 33961, 35840, 46560, 48802, 42513, 45051}, 63659 - Drawable.resolveOpacity(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = b + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{11428, 4258, 21666, 39048, 56532, 227, 17633, 35067, 52417, 12437, 29727, 47160, 64545, Typography.ndash, 25629, 43104}, 15373 - TextUtils.getOffsetAfter("", 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{11431, 40779, 19305, 14083, 58174, 44994, 7164, 51088, 45966, 32326, 10871, 38413, 16897, 3788, 64228, 42628}, 46049 - KeyEvent.normalizeMetaState(0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1035021119};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                short s = (short) (b6 - 1);
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(s, b7, (byte) (b7 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d((short) ($$e >>> 2), bArr3[5], bArr3[8], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                    int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int modifierMetaStateMask2 = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b8 = $$a[80];
                    Object[] objArr15 = new Object[1];
                    a(b8, (byte) (b8 | 50), (byte) 37, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, i11, modifierMetaStateMask2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{11439, 34051, 32748, 53333, 35373, 31880, 54648, 36757, 25017, 55814, 36030, 26268, 57107, 45562, 27216, 56358, 46739, 28510, 49620, 48056, 27665, 50938}, 43427 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{11435, 62755, 40877, 41021, 19129, 4910, 13740, 56859, 57507, 35110, 21416, 29745, 7851, 10030, 51621}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55680, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int i12 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[80];
                        byte b10 = bArr4[5];
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, (byte) (b10 & 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i12, packedPositionChild, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iMyTid = (Process.myTid() >> 22) + 28;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        Object[] objArr19 = new Object[1];
                        a(b11, bArr5[5], b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, windowTouchSlop, iMyTid, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    i = b + 49;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i13 = i % 2;
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i16 = b + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i21 = ~startUptimeMillis;
        int i22 = (~((-201704780) | i21)) | 201359680;
        int i23 = ~(startUptimeMillis | 1572719963);
        int i24 = i20 + (-222576101) + ((i22 | i23) * (-502)) + ((i23 | (~(i21 | (-345100)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr20[0])[0] = i26 ^ (i26 << 5);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(kpj, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$TEg9CKi5EfaUiZB3b1PRYVx0_eA((KpjItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$2wOt1Mfcws7YpVGimoRBieqEuXI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        int i27 = ((int[]) objArr20[0])[0];
        int i28 = i27 * i27;
        int i29 = -(1294817125 * i27);
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        int i31 = -(i27 * 1199732269);
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        int i33 = (i32 ^ (-525612591)) + (((-525612591) & i32) << 1);
        int i34 = i33 >> 19;
        int i35 = (((i34 & (-16383)) + (i34 | (-16383))) / 8192) + 1;
        int i36 = -(((i33 ^ i35) + ((i35 & i33) << 1)) ^ ((((i33 >> 18) - 32767) / 16384) + 1));
        int i37 = ((i36 | 6) << 1) - (i36 ^ 6);
        int i38 = i37 >> 20;
        int i39 = ((i38 & (-8191)) + (i38 | (-8191))) / 4096;
        int i40 = ((i39 | 1) << 1) - (i39 ^ 1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "14/3/map(...)".substring(30810 / (((-((i40 & 1) + (i40 | 1))) & i37) * 1027)));
        return api23Impl;
    }

    private static final ForgotAccountItem postForgotAccount$lambda$19(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ForgotAccountItem forgotAccountItem = (ForgotAccountItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return forgotAccountItem;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ForgotAccountItem> postForgotAccount(ForgotAccountRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ForgotAccountResponse>> derivecodecPostForgotAccount = getWebService().postForgotAccount(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostForgotAccount, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.m7801$r8$lambda$fRA1OXkjIYt2BhS09eZYazpOmQ((ForgotAccountResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$2XvlWEdnGI9Ik_rcyJ_B53bUEGU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final ForgotAccountItem postForgotAccount$lambda$18(ForgotAccountResponse forgotAccountResponse) {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(forgotAccountResponse, "");
        ForgotAccountItem forgotAccountItem = forgotAccountResponse.getForgotAccountItem();
        int i4 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return forgotAccountItem;
    }

    private static final ValidationOtpItem postValidationOtpRequest$lambda$21(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ValidationOtpItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ValidationOtpItem> postValidationOtpRequest(ValidationOtpRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ValidationOtpItem>> derivecodecPostValidationOtpRequest = getWebService().postValidationOtpRequest(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostValidationOtpRequest, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$W8OJ1ON6Rj5AnTbyI4QB7vlGl4Q((ValidationOtpItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda35
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$nH36JIwITHhHZYEhkZY9Ow29HGo(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ForgotPasswordItem postForgotPasswdByEmail$lambda$23(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ForgotPasswordItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ForgotPasswordItem> postForgotPasswdByEmail(ForgotPasswd p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ForgotPasswordItem>> derivecodecPostForgotPasswdByEmail = getWebService().postForgotPasswdByEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostForgotPasswdByEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$x7QSDob535BV_JDp8r66P0ryvF8((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7795$r8$lambda$591ukZIfYgVleoUjpAplPdWqt0(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ValidationOtpItem postValidationOtpByEmail$lambda$25(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ValidationOtpItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ValidationOtpItem> postValidationOtpByEmail(ForgotPasswordByEmailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ValidationOtpItem>> derivecodecPostValidationByEmail = getWebService().postValidationByEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostValidationByEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$FOYN5JjSmigkh1TMOTRLcthUOos((ValidationOtpItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7798$r8$lambda$MlH_rbl1i8RsWPapJ1HY6DC4mk(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ResetPasswordItem postResetPasswdByEmail$lambda$27(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ResetPasswordItem resetPasswordItem = (ResetPasswordItem) function1.invoke(obj);
        int i4 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return resetPasswordItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ResetPasswordItem> postResetPasswdByEmail(ResetPasswordRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ResetPasswordItem>> derivecodecPostResetPasswdByEmail = getWebService().postResetPasswdByEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostResetPasswdByEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$t_cuGYzz2LFD9KPQGBdvbAZwyL4((ResetPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda31
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$AsYb1IZhjmqn1axbOcYtC7XJOw4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final BaseItem postCustomLogout$lambda$29(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<BaseItem> postCustomLogout(LogoutRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostCustomLogout = getWebService().postCustomLogout(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostCustomLogout, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.m7800$r8$lambda$bKdZBMD5tCrsPOzCXeyfOgFHQ((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda29
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$8Y4qEbVehEHsDBMqsVqQwmPKz8o(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final VideoEncoderSession1 updateRegistrationId(UpdateFCMRequest p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, bArr[5], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, touchSlop, packedPositionGroup, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{11439, 34051, 32748, 53333, 35373, 31880, 54648, 36757, 25017, 55814, 36030, 26268, 57107, 45562, 27216, 56358, 46739, 28510, 49620, 48056, 27665, 50938}, 43427 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{11435, 62755, 40877, 41021, 19129, 4910, 13740, 56859, 57507, 35110, 21416, 29745, 7851, 10030, 51621}, ExpandableListView.getPackedPositionGroup(0L) + 55681, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37568);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 625;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 14;
            Object[] objArr6 = new Object[1];
            a($$a[80], (byte) 88, (byte) 52, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iNormalizeMetaState, offsetAfter, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
                int scrollDefaultDelay = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                byte b4 = bArr2[5];
                Object[] objArr7 = new Object[1];
                a(b3, b4, (byte) (b4 & 52), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, scrollDefaultDelay, iIndexOf, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr8[2])[0];
            int i5 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (~((-1608127698) | iIdentityHashCode)) | 215487505;
            int i7 = ~iIdentityHashCode;
            int i8 = (-1533646234) + ((i6 | (~(1608250615 | i7))) * 886) + (((~(i7 | 1608127697)) | 215610423) * (-1772)) + ((~(i7 | 215610423)) * 886) + 2027292104;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{11439, 36053, 27712, 52707, 44405, 3822, 60948, 20435, 12039, 34979, 26668, 51687, 43507, 2396, 60124, 19068, 11240, 35682, 25728, 50200, 42430, 1343, 59058, 17960, 9815, 34759}, 41078 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{11437, 54288, 56810, 50877, 52743, 63479, 63672, 57378, 59878, 37565, 39436, 33790, 33961, 35840, 46560, 48802, 42513, 45051}, 63659 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{11428, 4258, 21666, 39048, 56532, 227, 17633, 35067, 52417, 12437, 29727, 47160, 64545, Typography.ndash, 25629, 43104}, 15373 - View.resolveSize(0, 0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{11431, 40779, 19305, 14083, 58174, 44994, 7164, 51088, 45966, 32326, 10871, 38413, 16897, 3788, 64228, 42628}, 46049 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c(new char[]{11516, 9132, 12966, 442, 4275, 26511, 30338, 17865, 21711, 43927, 47854, 35254, 39167, 61424, 65229, 52626, 56457, 54152, 8838, 12590, 'w', 5994, 26211, 29965, 17411, 23382, 43546, 47426, 34873, 40801, 60968, 64814, 52247, 49992, 53778, 8450, 12291, 252, 6140, 26302, 30128, 17636, 23516, 43739, 47516, 34960, 40895, 61106, 65023, 52393, 50088, 53962, 8598, 12421, 1926, 5677, 25983, 29817, 19308, 23089, 43272, 47107, 36686, 40469}, TextUtils.indexOf("", "", 0, 0) + 3847, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c(new char[]{11437, 45210, 5312, 63591, 23594, 8690, 34194, 27018, 52483, 20853, 14060, 39659, 32471, 49741, 42574, 3041, 61356, 29560, 55106, 47890, 6367, 64672, 16422, 9275, 34900, 28119, 61902, 21856, 14641, 40694, 25281, 50845, 43607, 3705, 37873, 30656, 56206, 48898, 881, 57583, 17588, 10454, 35866, 4127, 62949, 22955, 15739, 33094, 25863, 51848, 44717, 12920, 38504, 31235, 57299, 41887, 1845, 60261, 18686, 11469, 45251, 5215, 63534, 23971}, 39988 - Process.getGidForName(""), objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            b = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 2027292104};
                byte[] bArr3 = $$d;
                short s = bArr3[0];
                byte b5 = bArr3[5];
                Object[] objArr16 = new Object[1];
                d(s, (byte) (b5 - 1), b5, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                d((short) 153, bArr3[5], bArr3[8], objArr17);
                Object[] objArr18 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i15 = ((int[]) objArr18[0])[0];
                int i16 = ((int[]) objArr18[2])[0];
                if (applicationContext != null) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (37568 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int i19 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 14;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[80];
                        byte b7 = bArr4[5];
                        Object[] objArr19 = new Object[1];
                        a(b6, b7, (byte) (b7 & 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i19, iMyPid, -973632554, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr18);
                    try {
                        Object[] objArr20 = new Object[1];
                        c(new char[]{11439, 34051, 32748, 53333, 35373, 31880, 54648, 36757, 25017, 55814, 36030, 26268, 57107, 45562, 27216, 56358, 46739, 28510, 49620, 48056, 27665, 50938}, View.MeasureSpec.makeMeasureSpec(0, 0) + 43427, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        c(new char[]{11435, 62755, 40877, 41021, 19129, 4910, 13740, 56859, 57507, 35110, 21416, 29745, 7851, 10030, 51621}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55681, objArr21);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                            int iResolveSize = View.resolveSize(0, 0) + 625;
                            int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13;
                            Object[] objArr22 = new Object[1];
                            a($$a[80], (byte) 88, (byte) 52, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, iResolveSize, i20, -976899241, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37567);
                            int absoluteGravity = 625 - Gravity.getAbsoluteGravity(0, 0);
                            int i21 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr23 = new Object[1];
                            a(b8, bArr5[5], b8, objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, absoluteGravity, i21, -477065106, false, (String) objArr23[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr18;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[2])[0];
        if (i23 == i22) {
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = i24 + (-1833679940) + ((iIdentityHashCode2 | 1792623795) * 140) + (((~(1792623795 | i27)) | 16941124) * (-280)) + (((~(iIdentityHashCode2 | (-16941125))) | (~(31114325 | i27)) | 1778450594) * 140);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[]{i26}, new int[1], new int[]{i25}, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                b = i31 % 128;
                int i32 = i31 % 2 != 0 ? 1 : 0;
                while (i32 < strArr4.length) {
                    arrayList.add(strArr4[i32]);
                    i32++;
                    int i33 = b + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            int[] iArr = new int[i23];
            int i35 = i23 - 1;
            iArr[i35] = 1;
            Toast.makeText((Context) null, iArr[((i23 * i35) % 2) - 1], 1).show();
            int i36 = ((int[]) objArr[1])[0];
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr2 = {i37};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode3;
            int i40 = i36 + 1912624136 + ((iIdentityHashCode3 | 1793930136) * 140) + (((~(1793930136 | i39)) | 16958560) * (-280)) + (((~(iIdentityHashCode3 | (-16958561))) | (~(29807984 | i39)) | 1781080712) * 140);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr2[1])[0] = i42 ^ (i42 << 5);
            objArr2 = new Object[]{new int[]{i38}, new int[1], iArr2, strArr5};
        }
        deriveCodec<Response<BaseItem>> derivecodecUpdateFCM = getWebService().updateFCM(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        lambdastart1androidxcameravideointernalaudioAudioSource lambdastart1androidxcameravideointernalaudioaudiosource = new lambdastart1androidxcameravideointernalaudioAudioSource(new setBufferSizeInBytes(derivecodecUpdateFCM, unbindVar));
        int i43 = ((int[]) objArr2[1])[0];
        int i44 = ((i43 * i43) - (~(-(375833908 * i43)))) - 1;
        int i45 = -(i43 * 1480206394);
        int i46 = (((i44 | i45) << 1) - (i45 ^ i44)) - (-191706833);
        int i47 = i46 >> 23;
        int i48 = (((i47 | (-1023)) << 1) - (i47 ^ (-1023))) / 512;
        int i49 = (i48 ^ 1) + ((i48 & 1) << 1);
        int i50 = (i46 ^ i49) + ((i49 & i46) << 1);
        int i51 = i46 >> 16;
        int i52 = (((-131071) ^ i51) + ((i51 & (-131071)) << 1)) / 65536;
        int i53 = -(((i52 & 1) + (i52 | 1)) ^ i50);
        int i54 = (i53 & 5) + (i53 | 5);
        int i55 = ((i54 >> 17) - 65535) / 32768;
        int i56 = (i55 & 1) + (i55 | 1);
        Intrinsics.checkNotNullExpressionValue(lambdastart1androidxcameravideointernalaudioaudiosource, "19\\ignoreElement(...)".substring(24555 / (((-((i56 ^ 1) + ((i56 & 1) << 1))) & i54) * 1637)));
        return lambdastart1androidxcameravideointernalaudioaudiosource;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final VideoEncoderSession1 updateDeviceToken(UpdateDeviceToken p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecUpdateDeviceToken = getWebService().updateDeviceToken(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        lambdastart1androidxcameravideointernalaudioAudioSource lambdastart1androidxcameravideointernalaudioaudiosource = new lambdastart1androidxcameravideointernalaudioAudioSource(new setBufferSizeInBytes(derivecodecUpdateDeviceToken, unbindVar));
        Intrinsics.checkNotNullExpressionValue(lambdastart1androidxcameravideointernalaudioaudiosource, "");
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return lambdastart1androidxcameravideointernalaudioaudiosource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ForgotPasswordItem postForgotPasswordByEmail$lambda$31(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ForgotPasswordItem forgotPasswordItem = (ForgotPasswordItem) function1.invoke(obj);
        int i4 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return forgotPasswordItem;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ForgotPasswordItem> postForgotPasswordByEmail(ForgotPasswordByEmailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ForgotPasswordItem>> derivecodecPostForgotPasswordByEmail = getWebService().postForgotPasswordByEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostForgotPasswordByEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.m7804$r8$lambda$sQxBLAphmQGi6q0wdZQr7DhRAI((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7802$r8$lambda$hFnnd9RrBzxFpe03RbmUvnAqZ8(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final ForgotPasswordItem postForgotPasswordByPhone$lambda$33(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ForgotPasswordItem forgotPasswordItem = (ForgotPasswordItem) function1.invoke(obj);
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return forgotPasswordItem;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ForgotPasswordItem> postForgotPasswordByPhone(ForgotPasswordByPhoneRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ForgotPasswordItem>> derivecodecPostForgotPasswordByPhone = getWebService().postForgotPasswordByPhone(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostForgotPasswordByPhone, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$ck_yswtoPTn4nyivz4pLUECyJsE((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.$r8$lambda$g01UQK_ckb5lpPwyhwz19cML_k0(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return api23Impl;
    }

    private static final ValidationOtpItem postValidationOtpRequestAuth$lambda$35(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ValidationOtpItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.user.UserRepository
    public final deriveCodec<ValidationOtpItem> postValidationOtpRequestAuth(ValidationOtpRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ValidationOtpItem>> derivecodecPostValidationOtpRequestAuth = getWebService().postValidationOtpRequestAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostValidationOtpRequestAuth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataStore.$r8$lambda$OETD0cOd_W7tGmWQOIoz6kL9B6s((ValidationOtpItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.user.UserDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return UserDataStore.m7803$r8$lambda$kaIME4_tNF9WhK3KB3hp3rZiHA(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // com.bpjstku.data.user.UserRepository
    public final Object notificationBadge(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> continuation) {
        AnonymousClass1 anonymousClass1;
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuation instanceof AnonymousClass1;
            obj.hashCode();
            throw null;
        }
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objB = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objB);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(notificationBadgeRequest, null);
            anonymousClass1.label = 1;
            objB = lambdasetCaptureRequestOptions0androidxcameracamera2interopCamera2CameraControl.b(anonymousClass2, anonymousClass1);
            if (objB == coroutine_suspended) {
                int i4 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            b = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.throwOnFailure(objB);
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        setOnImageAvailableListener setonimageavailablelistener = (setOnImageAvailableListener) objB;
        if (setonimageavailablelistener instanceof setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            NotificationBadgeResponse notificationBadgeResponse = (NotificationBadgeResponse) ((setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) setonimageavailablelistener).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
            return new setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(notificationBadgeResponse));
        }
        if (setonimageavailablelistener instanceof setOnImageAvailableListener.b) {
            return new setOnImageAvailableListener.b(((setOnImageAvailableListener.b) setonimageavailablelistener).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (!(setonimageavailablelistener instanceof setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 != 0) {
            return setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
        }
        int i11 = 98 / 0;
        return setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
    }

    public static /* synthetic */ LoginItem $r8$lambda$1wA3LwNOgZR9cZAZQDDM1uKzLyc(LoginItem loginItem) {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        LoginItem loginItemPostLogin$lambda$0 = postLogin$lambda$0(loginItem);
        int i4 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return loginItemPostLogin$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ ForgotAccountItem $r8$lambda$2XvlWEdnGI9Ik_rcyJ_B53bUEGU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            postForgotAccount$lambda$19(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ForgotAccountItem forgotAccountItemPostForgotAccount$lambda$19 = postForgotAccount$lambda$19(function1, obj);
        int i3 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return forgotAccountItemPostForgotAccount$lambda$19;
    }

    /* JADX INFO: renamed from: $r8$lambda$2sd03-sHjYEX80jtBCA0oKCdESw, reason: not valid java name */
    public static /* synthetic */ UserProfileItem m7794$r8$lambda$2sd03sHjYEX80jtBCA0oKCdESw(UserProfileItem userProfileItem) {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        UserProfileItem profile$lambda$12 = getProfile$lambda$12(userProfileItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return profile$lambda$12;
        }
        throw null;
    }

    public static /* synthetic */ KpjItem $r8$lambda$2wOt1Mfcws7YpVGimoRBieqEuXI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            getKpj$lambda$17(function1, obj);
            obj2.hashCode();
            throw null;
        }
        KpjItem kpj$lambda$17 = getKpj$lambda$17(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return kpj$lambda$17;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ResponseBody $r8$lambda$3c4cNROs3Dc1tbpZsbBGkLeOOjI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        ResponseBody profilePicture$lambda$11 = getProfilePicture$lambda$11(function1, obj);
        int i4 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return profilePicture$lambda$11;
    }

    /* JADX INFO: renamed from: $r8$lambda$591ukZIfYgVleoUjpAplP-dWqt0, reason: not valid java name */
    public static /* synthetic */ ForgotPasswordItem m7795$r8$lambda$591ukZIfYgVleoUjpAplPdWqt0(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswdByEmail$lambda$23 = postForgotPasswdByEmail$lambda$23(function1, obj);
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return forgotPasswordItemPostForgotPasswdByEmail$lambda$23;
    }

    public static /* synthetic */ ResetPasswordItem $r8$lambda$6PyKSmgBQFm1OW5WN3zJjmqai0A(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return postResetPassword$lambda$6(resetPasswordItem);
        }
        postResetPassword$lambda$6(resetPasswordItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$7Qvcf3-4zJAPRxqfZ50ebNyHS2I, reason: not valid java name */
    public static /* synthetic */ LoginV2Response m7796$r8$lambda$7Qvcf34zJAPRxqfZ50ebNyHS2I(LoginV2Response loginV2Response) {
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        LoginV2Response loginV2ResponsePostLoginV2$lambda$2 = postLoginV2$lambda$2(loginV2Response);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return loginV2ResponsePostLoginV2$lambda$2;
    }

    public static /* synthetic */ BaseItem $r8$lambda$8Y4qEbVehEHsDBMqsVqQwmPKz8o(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemPostCustomLogout$lambda$29 = postCustomLogout$lambda$29(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItemPostCustomLogout$lambda$29;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ResetPasswordItem $r8$lambda$AsYb1IZhjmqn1axbOcYtC7XJOw4(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordItem resetPasswordItemPostResetPasswdByEmail$lambda$27 = postResetPasswdByEmail$lambda$27(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return resetPasswordItemPostResetPasswdByEmail$lambda$27;
        }
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$BO9AvA5H_VMhSpnrkmlnpvffE_4(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            postLogout$lambda$14(baseItem);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseItem baseItemPostLogout$lambda$14 = postLogout$lambda$14(baseItem);
        int i3 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return baseItemPostLogout$lambda$14;
    }

    /* JADX INFO: renamed from: $r8$lambda$BmGLvK7gj-vx9d5csGHZE1ZBCqU, reason: not valid java name */
    public static /* synthetic */ ResetPasswordItem m7797$r8$lambda$BmGLvK7gjvx9d5csGHZE1ZBCqU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return postResetPassword$lambda$7(function1, obj);
        }
        postResetPassword$lambda$7(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ValidationOtpItem $r8$lambda$FOYN5JjSmigkh1TMOTRLcthUOos(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ValidationOtpItem validationOtpItemPostValidationOtpByEmail$lambda$24 = postValidationOtpByEmail$lambda$24(validationOtpItem);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return validationOtpItemPostValidationOtpByEmail$lambda$24;
    }

    public static /* synthetic */ RefreshTokenResponse $r8$lambda$LbmiMIunFNXeUpsI9zF8WYYIMxo(RefreshTokenResponse refreshTokenResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        RefreshTokenResponse refreshTokenResponsePostRefreshToken$lambda$4 = postRefreshToken$lambda$4(refreshTokenResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
        return refreshTokenResponsePostRefreshToken$lambda$4;
    }

    public static /* synthetic */ ResponseBody $r8$lambda$MSFZoKN_IQDmfZDNco_Ne0bT0Fo(ResponseBody responseBody) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getProfilePicture$lambda$10(responseBody);
            obj.hashCode();
            throw null;
        }
        ResponseBody profilePicture$lambda$10 = getProfilePicture$lambda$10(responseBody);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return profilePicture$lambda$10;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$MlH_-rbl1i8RsWPapJ1HY6DC4mk, reason: not valid java name */
    public static /* synthetic */ ValidationOtpItem m7798$r8$lambda$MlH_rbl1i8RsWPapJ1HY6DC4mk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ValidationOtpItem validationOtpItemPostValidationOtpByEmail$lambda$25 = postValidationOtpByEmail$lambda$25(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return validationOtpItemPostValidationOtpByEmail$lambda$25;
    }

    public static /* synthetic */ ValidationOtpItem $r8$lambda$OETD0cOd_W7tGmWQOIoz6kL9B6s(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        ValidationOtpItem validationOtpItemPostValidationOtpRequestAuth$lambda$34 = postValidationOtpRequestAuth$lambda$34(validationOtpItem);
        int i4 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return validationOtpItemPostValidationOtpRequestAuth$lambda$34;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ UserProfileItem $r8$lambda$QROW0R2yGSoQN4uNCnzLuxG1YbU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        UserProfileItem profile$lambda$13 = getProfile$lambda$13(function1, obj);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return profile$lambda$13;
    }

    public static /* synthetic */ KpjItem $r8$lambda$TEg9CKi5EfaUiZB3b1PRYVx0_eA(KpjItem kpjItem) {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        KpjItem kpj$lambda$16 = getKpj$lambda$16(kpjItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        b = i4 % 128;
        int i5 = i4 % 2;
        return kpj$lambda$16;
    }

    /* JADX INFO: renamed from: $r8$lambda$US4-dL8ew_EXIK-J-voHvI4ESl0, reason: not valid java name */
    public static /* synthetic */ BaseItem m7799$r8$lambda$US4dL8ew_EXIKJvoHvI4ESl0(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemPostLogout$lambda$15 = postLogout$lambda$15(function1, obj);
        int i4 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItemPostLogout$lambda$15;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ RefreshTokenResponse $r8$lambda$W3MiIB0jBTtd7VucaKRDVFDEjZo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        RefreshTokenResponse refreshTokenResponsePostRefreshToken$lambda$5 = postRefreshToken$lambda$5(function1, obj);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return refreshTokenResponsePostRefreshToken$lambda$5;
    }

    public static /* synthetic */ ValidationOtpItem $r8$lambda$W8OJ1ON6Rj5AnTbyI4QB7vlGl4Q(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            postValidationOtpRequest$lambda$20(validationOtpItem);
            throw null;
        }
        ValidationOtpItem validationOtpItemPostValidationOtpRequest$lambda$20 = postValidationOtpRequest$lambda$20(validationOtpItem);
        int i3 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return validationOtpItemPostValidationOtpRequest$lambda$20;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ LoginV2Response $r8$lambda$ZMEYloPP4lxHyEhIDmE9tVwlPDg(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        LoginV2Response loginV2ResponsePostLoginV2$lambda$3 = postLoginV2$lambda$3(function1, obj);
        int i4 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return loginV2ResponsePostLoginV2$lambda$3;
    }

    /* JADX INFO: renamed from: $r8$lambda$bKdZBMD5tC-rsPOz-CXeyfOgFHQ, reason: not valid java name */
    public static /* synthetic */ BaseItem m7800$r8$lambda$bKdZBMD5tCrsPOzCXeyfOgFHQ(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemPostCustomLogout$lambda$28 = postCustomLogout$lambda$28(baseItem);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return baseItemPostCustomLogout$lambda$28;
    }

    public static /* synthetic */ LoginItem $r8$lambda$cK36SQib4uoLzGQkRl9iNpIr0UQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        LoginItem loginItemPostLogin$lambda$1 = postLogin$lambda$1(function1, obj);
        int i4 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return loginItemPostLogin$lambda$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ForgotPasswordItem $r8$lambda$ck_yswtoPTn4nyivz4pLUECyJsE(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswordByPhone$lambda$32 = postForgotPasswordByPhone$lambda$32(forgotPasswordItem);
        int i4 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return forgotPasswordItemPostForgotPasswordByPhone$lambda$32;
        }
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$fRA1OXkjI-Yt2BhS09eZYazpOmQ, reason: not valid java name */
    public static /* synthetic */ ForgotAccountItem m7801$r8$lambda$fRA1OXkjIYt2BhS09eZYazpOmQ(ForgotAccountResponse forgotAccountResponse) {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return postForgotAccount$lambda$18(forgotAccountResponse);
        }
        postForgotAccount$lambda$18(forgotAccountResponse);
        throw null;
    }

    public static /* synthetic */ ForgotPasswordItem $r8$lambda$g01UQK_ckb5lpPwyhwz19cML_k0(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswordByPhone$lambda$33 = postForgotPasswordByPhone$lambda$33(function1, obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return forgotPasswordItemPostForgotPasswordByPhone$lambda$33;
    }

    /* JADX INFO: renamed from: $r8$lambda$hFnnd9RrBzxFpe03R-bmUvnAqZ8, reason: not valid java name */
    public static /* synthetic */ ForgotPasswordItem m7802$r8$lambda$hFnnd9RrBzxFpe03RbmUvnAqZ8(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswordByEmail$lambda$31 = postForgotPasswordByEmail$lambda$31(function1, obj);
        int i4 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return forgotPasswordItemPostForgotPasswordByEmail$lambda$31;
    }

    /* JADX INFO: renamed from: $r8$lambda$k-aIME4_tNF9WhK3KB3hp3rZiHA, reason: not valid java name */
    public static /* synthetic */ ValidationOtpItem m7803$r8$lambda$kaIME4_tNF9WhK3KB3hp3rZiHA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return postValidationOtpRequestAuth$lambda$35(function1, obj);
        }
        postValidationOtpRequestAuth$lambda$35(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ValidationOtpItem $r8$lambda$nH36JIwITHhHZYEhkZY9Ow29HGo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        ValidationOtpItem validationOtpItemPostValidationOtpRequest$lambda$21 = postValidationOtpRequest$lambda$21(function1, obj);
        int i4 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return validationOtpItemPostValidationOtpRequest$lambda$21;
    }

    public static /* synthetic */ ResetPasswordItem $r8$lambda$o2w4lvDRr02HsA48QeMN_6O0FNU(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordItem resetPasswordItemPostResetPasswordByPhone$lambda$8 = postResetPasswordByPhone$lambda$8(resetPasswordItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i4 % 128;
        int i5 = i4 % 2;
        return resetPasswordItemPostResetPasswordByPhone$lambda$8;
    }

    public static /* synthetic */ ResetPasswordItem $r8$lambda$rGPrL56aVql43njMtBVmxxGFELs(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordItem resetPasswordItemPostResetPasswordByPhone$lambda$9 = postResetPasswordByPhone$lambda$9(function1, obj);
        int i4 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPasswordItemPostResetPasswordByPhone$lambda$9;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$sQxBLAphmQGi-6q0wdZQr7DhRAI, reason: not valid java name */
    public static /* synthetic */ ForgotPasswordItem m7804$r8$lambda$sQxBLAphmQGi6q0wdZQr7DhRAI(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswordByEmail$lambda$30 = postForgotPasswordByEmail$lambda$30(forgotPasswordItem);
        int i4 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return forgotPasswordItemPostForgotPasswordByEmail$lambda$30;
        }
        throw null;
    }

    public static /* synthetic */ ResetPasswordItem $r8$lambda$t_cuGYzz2LFD9KPQGBdvbAZwyL4(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordItem resetPasswordItemPostResetPasswdByEmail$lambda$26 = postResetPasswdByEmail$lambda$26(resetPasswordItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
        return resetPasswordItemPostResetPasswdByEmail$lambda$26;
    }

    public static /* synthetic */ ForgotPasswordItem $r8$lambda$x7QSDob535BV_JDp8r66P0ryvF8(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        ForgotPasswordItem forgotPasswordItemPostForgotPasswdByEmail$lambda$22 = postForgotPasswdByEmail$lambda$22(forgotPasswordItem);
        int i4 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return forgotPasswordItemPostForgotPasswdByEmail$lambda$22;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private static final KpjItem getKpj$lambda$16(KpjItem kpjItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpjItem, "");
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return kpjItem;
    }

    private static final UserProfileItem getProfile$lambda$12(UserProfileItem userProfileItem) {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(userProfileItem, "");
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return userProfileItem;
    }

    private static final ResponseBody getProfilePicture$lambda$10(ResponseBody responseBody) {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseBody, "");
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return responseBody;
    }

    private static final BaseItem postCustomLogout$lambda$28(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static final ForgotPasswordItem postForgotPasswdByEmail$lambda$22(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return forgotPasswordItem;
    }

    private static final ForgotPasswordItem postForgotPasswordByEmail$lambda$30(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i4 % 128;
        int i5 = i4 % 2;
        return forgotPasswordItem;
    }

    private static final ForgotPasswordItem postForgotPasswordByPhone$lambda$32(ForgotPasswordItem forgotPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        int i4 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return forgotPasswordItem;
        }
        throw null;
    }

    private static final LoginItem postLogin$lambda$0(LoginItem loginItem) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginItem, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i4 % 128;
        int i5 = i4 % 2;
        return loginItem;
    }

    private static final LoginV2Response postLoginV2$lambda$2(LoginV2Response loginV2Response) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginV2Response, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        return loginV2Response;
    }

    private static final BaseItem postLogout$lambda$14(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 == 0) {
            return baseItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RefreshTokenResponse postRefreshToken$lambda$4(RefreshTokenResponse refreshTokenResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(refreshTokenResponse, "");
        int i4 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return refreshTokenResponse;
    }

    private static final ResetPasswordItem postResetPasswdByEmail$lambda$26(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPasswordItem;
        }
        obj.hashCode();
        throw null;
    }

    private static final ResetPasswordItem postResetPassword$lambda$6(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return resetPasswordItem;
    }

    private static final ResetPasswordItem postResetPasswordByPhone$lambda$8(ResetPasswordItem resetPasswordItem) {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return resetPasswordItem;
    }

    private static final ValidationOtpItem postValidationOtpByEmail$lambda$24(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(validationOtpItem, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return validationOtpItem;
        }
        obj.hashCode();
        throw null;
    }

    private static final ValidationOtpItem postValidationOtpRequest$lambda$20(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(validationOtpItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return validationOtpItem;
        }
        throw null;
    }

    private static final ValidationOtpItem postValidationOtpRequestAuth$lambda$34(ValidationOtpItem validationOtpItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(validationOtpItem, "");
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return validationOtpItem;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7835368670482892245L;
    }
}
