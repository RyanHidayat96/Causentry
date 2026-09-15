package com.bpjstku.data.setting;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.bpjstku.data.setting.remote.SettingApi;
import defpackage.Api23Impl;
import defpackage.SessionProcessor;
import defpackage.createCameraSelectorById;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import defpackage.unbindChildren;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0006\u0010\u0003\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010\u0003\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b)\u0010\u0012J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b*\u0010(J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b,\u0010\nJ\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b-\u0010$J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b.\u0010(J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010\u0003\u001a\u00020%H\u0017¢\u0006\u0004\b2\u0010(J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u00072\u0006\u0010\u0003\u001a\u00020\u001aH\u0017¢\u0006\u0004\b3\u0010\u001dJ\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020+0\u0007H\u0017¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020+0\u0007H\u0017¢\u0006\u0004\b6\u00105J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0007H\u0017¢\u0006\u0004\b<\u00105J-\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00072\u0006\u0010\u0003\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L"}, d2 = {"Lcom/bpjstku/data/setting/SettingDataStore;", "Lcom/bpjstku/data/setting/SettingRepository;", "Lcom/bpjstku/data/setting/remote/SettingApi;", "p0", "<init>", "(Lcom/bpjstku/data/setting/remote/SettingApi;)V", "Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ChangeEmailItem;", "postChangeEmail", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "Lcom/bpjstku/data/setting/model/response/KpjItemAdded;", "postAddKpj", "(Lcom/bpjstku/data/setting/model/request/AddKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;", "Lcom/bpjstku/data/setting/model/response/ProfilePictureItem;", "postChangeProfilePicture", "(Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePhoneItem;", "postChangePhoneNumber", "(Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePasswordItem;", "postChangePassword", "(Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "changeEmailVerificationHandphone", "(Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "changeEmailVerificationHandphoneOtp", "(Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;)LderiveCodec;", "changeEmailVerification", "changeEmailVerificationOtp", "Lcom/bpjstku/data/lib/model/BaseItem;", "changeEmail", "changeHandphoneVerificationEmail", "changeHandphoneVerificationEmailOtp", "Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "changeHandphoneVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;)LderiveCodec;", "changeHandphoneVerificationOtp", "changeHandphone", "getTimeServer", "()LderiveCodec;", "getTimeDetailServer", "Lcom/bpjstku/data/setting/model/request/KeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "getGenerateKey", "(Lcom/bpjstku/data/setting/model/request/KeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "getApiToClient", "", "p1", "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "p2", "Lcom/bpjstku/data/setting/model/response/ClientToApiResponse;", "getClientToApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/ExpResponse;)LderiveCodec;", "webService", "Lcom/bpjstku/data/setting/remote/SettingApi;", "getWebService", "()Lcom/bpjstku/data/setting/remote/SettingApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingDataStore implements SettingRepository {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private final Void dbService;
    private final SettingApi webService;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, -4, -32, -15, -14, -8, -20, -28, 49, -13, -51, -34, -34, 0, -29, -9, -32, -2, -30, 25, -42, -30, -7, -25, -10, -30, Base64.padSymbol, -51, -52, -13, -24, -9, 6, -37, -32, -50, -5, -28, -6, -23, -16, 13, -34, -41, -5, -9, -26, -23, 29, -61, 0, -23, -23, -9, -26, -23, 1, -24, -22, -7, -22, -22, -10, 13, -54, -9, -23, -6, -36, -2, -30, 48, -6, -30, -5, -26, -20, -12, 19, -44, -18, -26, -23, -6, -14, -20, -13, -30, 32, -51, -34, -6, -23, -16};
    private static final int $$e = 25;
    private static final byte[] $$a = {77, -106, 83, 4, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 209;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = 108 - r5
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.data.setting.SettingDataStore.$$a
            int r7 = r7 * 52
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.setting.SettingDataStore.$$d
            int r7 = 96 - r7
            int r1 = 38 - r6
            int r8 = r8 * 2
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = 37 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-17)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore.d(byte, short, byte, java.lang.Object[]):void");
    }

    public SettingDataStore(SettingApi settingApi) {
        Intrinsics.checkNotNullParameter(settingApi, "");
        this.webService = settingApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7778getDbService() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        mergeChildrenConfigs mergechildrenconfigs = (mergeChildrenConfigs) getDbService();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return mergechildrenconfigs;
    }

    /* JADX INFO: renamed from: getWebService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ unbindChildren m7779getWebService() {
        int i = 2 % 2;
        int i2 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        SettingApi webService = getWebService();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i4 % 128;
        int i5 = i4 % 2;
        return webService;
    }

    public final SettingApi getWebService() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        SettingApi settingApi = this.webService;
        int i5 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return settingApi;
    }

    public final Void getDbService() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Void r2 = this.dbService;
        int i5 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return r2;
    }

    private static final ChangeEmailItem postChangeEmail$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ChangeEmailItem changeEmailItem = (ChangeEmailItem) function1.invoke(obj);
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return changeEmailItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ChangeEmailItem> postChangeEmail(ChangeEmailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ChangeEmailItem>> derivecodecPostChangeEmail = getWebService().postChangeEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostChangeEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7772$r8$lambda$bhjfalmQCMkoD_Q9F0OFSFAwW4((ChangeEmailItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$xdc49lisrpkhFpfA9d1OSxVKlwY(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final KpjItemAdded postAddKpj$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (KpjItemAdded) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        KpjItemAdded kpjItemAdded = (KpjItemAdded) function1.invoke(obj);
        int i3 = 5 / 0;
        return kpjItemAdded;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<KpjItemAdded> postAddKpj(AddKpjRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<KpjItemAdded>> derivecodecPostAddKpj = getWebService().postAddKpj(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostAddKpj, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$U3iz0BrmEdbMVlw9piIhI6dlFZo((KpjItemAdded) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$hr6nfhT1rvMEbRjlAwvuNDY5a8U(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final VerificationItem postEmailVerification$lambda$5(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> postEmailVerification(ChangeEmailVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostEmailVerification = getWebService().postEmailVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostEmailVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7777$r8$lambda$z53OYa0suNYt6iAz4zKsQf6G8Q((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7770$r8$lambda$URdtYhRg1KOWanEQXm2RlpqOiw(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final VerificationItem postPhoneVerification$lambda$7(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> postPhoneVerification(PhoneVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecPostPhoneVerification = getWebService().postPhoneVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPhoneVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$c9nFw9ZUi3FAhiVX6Nn0UQMu6Ww((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda35
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7765$r8$lambda$7p1pBuJPQxkcg_4jwGcuYhrqlg(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final ProfilePictureItem postChangeProfilePicture$lambda$9(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ProfilePictureItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ProfilePictureItem profilePictureItem = (ProfilePictureItem) function1.invoke(obj);
        int i3 = 57 / 0;
        return profilePictureItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ProfilePictureItem> postChangeProfilePicture(ChangeProfilePictureRequest p0) {
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        SettingApi webService = getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        if (partMap == null) {
            int i4 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            partMap = MapsKt.emptyMap();
        }
        deriveCodec<Response<ProfilePictureItem>> derivecodecPostChangeProfilePicture = webService.postChangeProfilePicture(partMap, createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getProfilePictureImageFile(), "foto"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostChangeProfilePicture, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31
            private static final byte[] $$c = {119, -103, 14, -22};
            private static final int $$f = 214;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {109, 7, 114, -90, 6, 23, -26, 23, 27, -3, 13, 1, -12, 41, 13, -5, 1, -57, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
            private static final int $$e = 25;
            private static final byte[] $$a = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 90;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60048, 60052, 60117, 60090, 60034, 60088, 59744, 59748, 60057, 59747, 60040, 60054, 60073, 60047, 60049, 60046, 60058, 60051, 59746, 60063, 60072, 59745, 60041, 60053, 60061, 60055, 60045, 60043, 59749, 60050, 60083, 60060, 60059, 60056, 60079, 60062};
            private static char b = 57191;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 52
                    int r8 = r8 + 4
                    int r7 = r7 * 3
                    int r7 = r7 + 84
                    int r6 = r6 * 15
                    int r0 = r6 + 38
                    byte[] r1 = com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = r6 + 37
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L31
                L18:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1c:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L31:
                    int r7 = -r7
                    int r8 = r8 + r7
                    int r8 = r8 + (-11)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.a(short, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 52
                    int r0 = 53 - r6
                    int r7 = r7 * 5
                    int r7 = r7 + 98
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    byte[] r1 = com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.$$d
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L19
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2f:
                    int r7 = r7 + r8
                    int r8 = r3 + 1
                    int r7 = r7 + (-8)
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.d(short, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0220  */
            /* JADX WARN: Code duplicated, block: B:27:0x022b  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i6 = 2 % 2;
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iIndexOf = 2266 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iIndexOf, edgeSlop, -887667012, false, (String) objArr2[0], null);
                }
                Object obj2 = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{17, 22, 20, 23, 5, 25, 20, 1, 4, 7, '\b', 26, '\n', 16, 17, 31, 17, 11, 31, 7, 30, 3}, (byte) (106 - Process.getGidForName("")), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{31, 29, 15, 28, 11, Typography.quote, 18, '\r', Typography.quote, 17, 31, 19, '#', 17, 13887}, (byte) ((Process.myPid() >> 22) + 64), 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cRed = (char) Color.red(0);
                    int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr2[7], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iResolveOpacity, maximumFlingVelocity, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int i9 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 34;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b5, b5, bArr3[40], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i9, iLastIndexOf, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i10 = ((int[]) objArr7[0])[0];
                    int i11 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i12 = ~((-361231556) | iIdentityHashCode);
                    int i13 = ~iIdentityHashCode;
                    int i14 = 150868453 + ((i12 | (~(531625955 | i13))) * (-406)) + ((~((-84144196) | i13)) * (-406)) + (((~(iIdentityHashCode | (-447481761))) | (~(361231555 | i13))) * 406) + 1101406283;
                    int i15 = (i14 << 13) ^ i14;
                    int i16 = i15 ^ (i15 >>> 17);
                    ((int[]) objArr[2])[0] = i16 ^ (i16 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{17, 22, 20, 23, 5, 25, 20, 1, 15, 28, 26, 3, '\t', 3, 17, 25, 27, 24, 16, 1, '#', 16, 23, Typography.quote, '\r', 22}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 35), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{3, 21, 13914, 13914, 5, 29, 15, 1, 13916, 13916, 26, 24, Typography.quote, 15, 17, 25, 5, 19}, (byte) (114 - TextUtils.getCapsMode("", 0, 0)), TextUtils.getOffsetBefore("", 0) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                            if (i17 % 2 != 0) {
                                int i18 = 9 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                                    int i20 = i19 % 2;
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i110 % 128;
                                int i21 = i110 % 2;
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{15, 17, 28, 14, 1, 26, 17, 22, ' ', 1, 22, 2, 7, 16, 5, 17}, (byte) (24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{25, 23, 5, 29, 17, 25, 16, 1, Typography.quote, '\f', 11, 16, 0, 2, 23, 31}, (byte) (21 - (ViewConfiguration.getTouchSlop() >> 8)), 16 - TextUtils.getOffsetAfter("", 0), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                    int i23 = i22 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1101406283};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[29];
                        byte b7 = bArr4[11];
                        Object[] objArr13 = new Object[1];
                        d(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr4[11];
                        byte b9 = bArr4[29];
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, b9, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                            int i25 = i24 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                                int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                byte[] bArr5 = $$a;
                                byte b10 = bArr5[7];
                                Object[] objArr15 = new Object[1];
                                a(b10, b10, bArr5[40], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, tapTimeout, fadingEdgeLength, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(new char[]{17, 22, 20, 23, 5, 25, 20, 1, 4, 7, '\b', 26, '\n', 16, 17, 31, 17, 11, 31, 7, 30, 3}, (byte) (107 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(new char[]{31, 29, 15, 28, 11, Typography.quote, 18, '\r', Typography.quote, 17, 31, 19, '#', 17, 13887}, (byte) (64 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i26 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                                    int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                    byte[] bArr6 = $$a;
                                    byte b11 = bArr6[5];
                                    Object[] objArr18 = new Object[1];
                                    a(b11, bArr6[7], b11, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i26, iMakeMeasureSpec, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                    int i27 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                                    int i28 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                                    byte[] bArr7 = $$a;
                                    byte b12 = bArr7[5];
                                    byte b13 = bArr7[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b12, b13, b13, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i27, i28, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[1];
                    if (strArr2 == null) {
                        throw null;
                    }
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
                int i30 = i29 % 2;
                Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i31 = ((int[]) objArr[2])[0];
                int i32 = ((int[]) objArr[0])[0];
                int i33 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i34 = ~iIdentityHashCode2;
                int i35 = 21155039 + (((~((-754536146) | i34)) | 3673232 | (~((-54177171) | i34)) | (~(805040083 | iIdentityHashCode2))) * (-84));
                int i36 = (~(iIdentityHashCode2 | (-54177171))) | 754536145;
                int i37 = ~(i34 | 54177170);
                int i38 = i31 + i35 + ((i36 | i37) * (-84)) + (((-805040084) | i37) * 84);
                int i39 = (i38 << 13) ^ i38;
                int i40 = i39 ^ (i39 >>> 17);
                ((int[]) objArr20[2])[0] = i40 ^ (i40 << 5);
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41 % 128;
                ProfilePictureItem profilePictureItem = (ProfilePictureItem) obj;
                if (i41 % 2 != 0) {
                    return SettingDataStore.m7767$r8$lambda$OTtdfSOHkMCFYclePQMZEH2CNQ(profilePictureItem);
                }
                SettingDataStore.m7767$r8$lambda$OTtdfSOHkMCFYclePQMZEH2CNQ(profilePictureItem);
                obj2.hashCode();
                throw null;
            }

            private static void c(char[] cArr, byte b2, int i6, Object[] objArr) throws Throwable {
                int i7;
                Object obj;
                int length;
                char[] cArr2;
                int i8 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
                int i9 = 1770390596;
                Object obj2 = null;
                if (cArr3 != null) {
                    int i10 = $11 + 7;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i11++;
                            i9 = 1770390596;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr3 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.alpha(0) + 2267, 33 - (ViewConfiguration.getScrollBarSize() >> 8), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i6];
                if (i6 % 2 != 0) {
                    int i12 = $10 + 65;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        i7 = i6 + 6;
                        cArr4[i7] = (char) (cArr[i7] >>> b2);
                    } else {
                        i7 = i6 - 1;
                        cArr4[i7] = (char) (cArr[i7] - b2);
                    }
                } else {
                    i7 = i6;
                }
                if (i7 > 1) {
                    int i13 = $10 + 121;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i7) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 1;
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - TextUtils.getCapsMode("", 0, 0)), 3261 - KeyEvent.keyCodeFromString(""), 29 - TextUtils.lastIndexOf("", '0'), -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 3;
                                    byte b10 = (byte) (b9 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22878), TextUtils.indexOf((CharSequence) "", '0', 0) + 595, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                                } else {
                                    int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i20 = 0; i20 < i6; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, int r7, short r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 3 - r7
                    int r6 = r6 + 113
                    byte[] r0 = com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.$$c
                    int r8 = r8 * 4
                    int r1 = r8 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2b:
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda31.$$g(byte, int, short):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda32
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$5L_6ZMzAvbSb8ZTpxfRZU84qT2E(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    private static final ChangePhoneItem postChangePhoneNumber$lambda$11(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ChangePhoneItem changePhoneItem = (ChangePhoneItem) function1.invoke(obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return changePhoneItem;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ChangePhoneItem> postChangePhoneNumber(ChangePhoneNumberRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ChangePhoneItem>> derivecodecPostChangePhoneNumber = getWebService().postChangePhoneNumber(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostChangePhoneNumber, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$4l1Pv1KDGNc8qRm1Exb8kVGJNDg((ChangePhoneItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$AoWvj24hBEpBxjDyK2KdZrdssBY(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return api23Impl;
    }

    private static final ChangePasswordItem postChangePassword$lambda$13(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ChangePasswordItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ChangePasswordItem> postChangePassword(ChangePasswordRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ChangePasswordItem>> derivecodecPostChangePassword = getWebService().postChangePassword(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostChangePassword, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$qoFRNPokK4GqIEFxSAuoMYFzdHA((ChangePasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda28
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$yhmJx1aGZvJFFoaRIzhnJGNGafM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return api23Impl;
    }

    private static final VerificationItem changeEmailVerificationHandphone$lambda$15(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> changeEmailVerificationHandphone(ChangeDataFirstVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecChangeEmailVerificationHandphone = getWebService().changeEmailVerificationHandphone(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeEmailVerificationHandphone, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$aE2h8VOyLF8nFm3mNyrDcj5gcLg((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7773$r8$lambda$ktDRx1wP2to0Qtn3MrOLJ7akpo(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VerificationSignatureItem changeEmailVerificationHandphoneOtp$lambda$17(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationSignatureItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationSignatureItem verificationSignatureItem = (VerificationSignatureItem) function1.invoke(obj);
        int i3 = 26 / 0;
        return verificationSignatureItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationSignatureItem> changeEmailVerificationHandphoneOtp(VerificationOtpRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationSignatureItem>> derivecodecChangeEmailVerificationHandphoneOtp = getWebService().changeEmailVerificationHandphoneOtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeEmailVerificationHandphoneOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7771$r8$lambda$UyOHLSWJPlHkiETficSVdC4rkU((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda37
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$63qutvxc2BIFVxdfdnFDgWqRBYM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $10 + 33;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) (8328 - (ViewConfiguration.getTouchSlop() >> 8));
                    int iAxisFromString = MotionEvent.axisFromString("") + 1236;
                    int i8 = 36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b2 = (byte) ($$f & 15);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iAxisFromString, i8, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2763, ExpandableListView.getPackedPositionType(0L) + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 253, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 1;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2891 - View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i9 = $10 + 45;
        $11 = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> changeEmailVerification(ChangeEmailVerificationRequest p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecChangeEmailVerification = getWebService().changeEmailVerification(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
            int i4 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[40];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 12), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, minimumFlingVelocity, i4, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{43444, 43834, 51289, 29526}, new char[]{8170, 46613, 468, 52995}, (char) Color.red(0), (Process.getThreadPriority(0) + 20) >> 6, new char[]{13633, 7165, 7328, 48621, 42982, 37181, 23372, 45149, 41837, 46085, 2559, 53003, 57880, 10358, 33253, 36740, 13910, 19291, 65168, 4127, 38754, 50932}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{43444, 43834, 51289, 29526}, new char[]{61504, 52071, 11519, 26730}, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27180), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 3446800, new char[]{64920, 63062, 45076, 12442, 13736, 1772, 11833, 58528, 17394, 12196, 53180, 54312, 3709, 419, 17272}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int defaultSize = View.getDefaultSize(0, 0) + 876;
            int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[40], bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, defaultSize, i5, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = b + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iAlpha = Color.alpha(0) + 876;
                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[5], bArr3[10], bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iAlpha, trimmedLength, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = 1092559324 + (((~((-2716941) | i8)) | 43027169) * 220) + (((~(i8 | (-70087965))) | 110398193) * (-440)) + ((iIdentityHashCode | (-2716941)) * 220) + 416762510;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{8131, 51059, 32089, 65138}, (char) (29309 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-1) - TextUtils.lastIndexOf("", '0', 0), new char[]{14802, 51199, 53292, 41947, 56204, 6216, 27535, 2407, 34639, 35413, 7769, 63392, 17979, 49042, 28855, 21754, 51565, 17110, 15906, 37733, 8820, 30760, 46103, 59210, 11684, 43024}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{17863, 60287, 59578, 58759}, (char) (34792 - Color.alpha(0)), TextUtils.getCapsMode("", 0, 0), new char[]{5578, 49306, 51464, 15380, 15570, 4056, 38305, 18903, 39053, 46163, 22010, 49059, 40698, 65026, 7331, 64383, 9932, 8473}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{20871, 60144, 6967, 11937}, (char) (41242 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{60383, 'g', 7477, 39896, 37904, 2773, 36606, 56775, 47113, 41595, 62546, 13870, 50227, 50071, 12987, 17885}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{9433, 39644, 21850, 48217}, (char) (22869 - (Process.myPid() >> 22)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{10354, 50608, 5223, 4154, 39991, 14389, 60647, 50852, 36776, 37388, 37939, 4252, 36073, 45491, 57869, 22600}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 416762510};
                byte b3 = (byte) ($$e | 68);
                byte[] bArr4 = $$d;
                Object[] objArr13 = new Object[1];
                d((byte) 3, b3, bArr4[16], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr4[16];
                Object[] objArr14 = new Object[1];
                d(b4, (byte) (b4 | 59), (byte) (-bArr4[6]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr5[5], bArr5[10], bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, keyRepeatDelay, i12, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{43444, 43834, 51289, 29526}, new char[]{8170, 46613, 468, 52995}, (char) TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0), new char[]{13633, 7165, 7328, 48621, 42982, 37181, 23372, 45149, 41837, 46085, 2559, 53003, 57880, 10358, 33253, 36740, 13910, 19291, 65168, 4127, 38754, 50932}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{43444, 43834, 51289, 29526}, new char[]{61504, 52071, 11519, 26730}, (char) (27181 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-3446801) - ImageFormat.getBitsPerPixel(0), new char[]{64920, 63062, 45076, 12442, 13736, 1772, 11833, 58528, 17394, 12196, 53180, 54312, 3709, 419, 17272}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                            int iGreen = Color.green(0) + 876;
                            int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr6 = $$a;
                            byte b5 = bArr6[40];
                            byte b6 = bArr6[7];
                            byte b7 = bArr6[5];
                            Object[] objArr19 = new Object[1];
                            a(b5, b6, b7, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, iGreen, edgeSlop, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                            byte[] bArr7 = $$a;
                            byte b8 = bArr7[40];
                            Object[] objArr20 = new Object[1];
                            a(b8, (byte) (b8 | 12), bArr7[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, iKeyCodeFromString, packedPositionType2, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i13 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = i15 + (-890957716) + (((~((-268437505) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | (-228127276)))) * (-318)) + (((~(811731280 | iIdentityHashCode2)) | (-1039858556)) * (-318)) + (((~(iIdentityHashCode2 | (-811731281))) | 771421051) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeEmailVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$UqpwKnIisFkgWO4GfOrWpL5cOQ0((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$2zpxulEO5sR2N7KkwjViCpA6MZQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        int i19 = ((int[]) objArr21[1])[0];
        int i20 = ((i19 * i19) - (~(-(1781067150 * i19)))) - 1;
        int i21 = -(i19 * (-191761694));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = (i22 ^ 1239485504) + ((1239485504 & i22) << 1);
        int i24 = i23 >> 29;
        int i25 = (((i24 | (-15)) << 1) - (i24 ^ (-15))) / 8;
        int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
        int i27 = (i23 ^ i26) + ((i26 & i23) << 1);
        int i28 = i23 >> 23;
        int i29 = (((i28 | (-1023)) << 1) - (i28 ^ (-1023))) / 512;
        int i30 = -((((i29 | 1) << 1) - (i29 ^ 1)) ^ i27);
        int i31 = (i30 ^ 8) + ((i30 & 8) << 1);
        int i32 = i31 >> 27;
        int i33 = (((i32 | (-63)) << 1) - (i32 ^ (-63))) / 32;
        int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "21,31,map(...)".substring(9792 / (((-((i34 ^ 1) + ((i34 & 1) << 1))) & i31) * 204)));
        return api23Impl;
    }

    private static final VerificationItem changeEmailVerification$lambda$19(Function1 function1, Object obj) {
        VerificationItem verificationItem;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            verificationItem = (VerificationItem) function1.invoke(obj);
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            verificationItem = (VerificationItem) function1.invoke(obj);
        }
        int i4 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItem;
    }

    private static final VerificationSignatureItem changeEmailVerificationOtp$lambda$21(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationSignatureItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationSignatureItem verificationSignatureItem = (VerificationSignatureItem) function1.invoke(obj);
        int i3 = 46 / 0;
        return verificationSignatureItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationSignatureItem> changeEmailVerificationOtp(VerificationOtpRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationSignatureItem>> derivecodecChangeEmailVerificationOtp = getWebService().changeEmailVerificationOtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeEmailVerificationOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$JJfU_PyxitYK2Nnqnu0aHCB3bj4((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda39
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$OYq6DvirmdCNjalXW0cnIDuXo8s(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final BaseItem changeEmail$lambda$23(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return baseItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<BaseItem> changeEmail(ChangeEmailRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecChangeEmail = getWebService().changeEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7766$r8$lambda$HNBK_lBd7uOJKn73GXHUs671w((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda41
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$EmUxvg2gpv0aoAT1eXL12HEsWAI(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final VerificationItem changeHandphoneVerificationEmail$lambda$25(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i3 = 58 / 0;
        return verificationItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> changeHandphoneVerificationEmail(ChangeDataFirstVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecChangeHandphoneVerificationEmail = getWebService().changeHandphoneVerificationEmail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeHandphoneVerificationEmail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$L6ukdK8AROHVhRqX5NQZkUzsEQs((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$mEYs7kwMP4JhK1yVFftJim5eYLw(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        b = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final VerificationSignatureItem changeHandphoneVerificationEmailOtp$lambda$27(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationSignatureItem verificationSignatureItem = (VerificationSignatureItem) function1.invoke(obj);
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return verificationSignatureItem;
        }
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationSignatureItem> changeHandphoneVerificationEmailOtp(VerificationOtpRequest p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationSignatureItem>> derivecodecChangeHandphoneVerificationEmailOtp = getWebService().changeHandphoneVerificationEmailOtp(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37567);
            int keyRepeatTimeout2 = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iKeyCodeFromString = 14 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[40];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 12), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, keyRepeatTimeout2, iKeyCodeFromString, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{43444, 43834, 51289, 29526}, new char[]{8170, 46613, 468, 52995}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), ViewConfiguration.getTapTimeout() >> 16, new char[]{13633, 7165, 7328, 48621, 42982, 37181, 23372, 45149, 41837, 46085, 2559, 53003, 57880, 10358, 33253, 36740, 13910, 19291, 65168, 4127, 38754, 50932}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{43444, 43834, 51289, 29526}, new char[]{61504, 52071, 11519, 26730}, (char) (27180 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) - 3446800, new char[]{64920, 63062, 45076, 12442, 13736, 1772, 11833, 58528, 17394, 12196, 53180, 54312, 3709, 419, 17272}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) (37567 - KeyEvent.getDeadChar(0, 0));
            int threadPriority = 625 - ((Process.getThreadPriority(0) + 20) >> 6);
            int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[7], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, threadPriority, tapTimeout, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b4, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionType, doubleTapTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int[] iArr2 = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 37887912 + ((iIdentityHashCode | 808111212) * (-50));
            int i9 = ~((-805833741) | iIdentityHashCode);
            int i10 = ~iIdentityHashCode;
            int i11 = i8 + ((i9 | (~((-209793169) | i10))) * 50) + (((~(i10 | 808111212)) | (~((-1015626909) | i10)) | 209793168) * 50) + 1488906454;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{8131, 51059, 32089, 65138}, (char) (29309 - (ViewConfiguration.getLongPressTimeout() >> 16)), Process.myTid() >> 22, new char[]{14802, 51199, 53292, 41947, 56204, 6216, 27535, 2407, 34639, 35413, 7769, 63392, 17979, 49042, 28855, 21754, 51565, 17110, 15906, 37733, 8820, 30760, 46103, 59210, 11684, 43024}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{17863, 60287, 59578, 58759}, (char) (Drawable.resolveOpacity(0, 0) + 34792), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{5578, 49306, 51464, 15380, 15570, 4056, 38305, 18903, 39053, 46163, 22010, 49059, 40698, 65026, 7331, 64383, 9932, 8473}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{20871, 60144, 6967, 11937}, (char) (41242 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.argb(0, 0, 0, 0), new char[]{60383, 'g', 7477, 39896, 37904, 2773, 36606, 56775, 47113, 41595, 62546, 13870, 50227, 50071, 12987, 17885}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{9433, 39644, 21850, 48217}, (char) (22868 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{10354, 50608, 5223, 4154, 39991, 14389, 60647, 50852, 36776, 37388, 37939, 4252, 36073, 45491, 57869, 22600}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{13554, 46854, 52756, 29850}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.getMaxKeyCode() >> 16, new char[]{8706, 32699, 59578, 51435, 22764, 13864, 13481, 21104, 59741, 11477, 12726, 28635, 60677, 310, 19982, 21641, 37816, 25810, 52887, 6301, 57432, 2029, 47020, 49700, 14285, 26434, 56931, 54540, 4845, 136, 31522, 22290, 54794, 2752, 12573, 59896, 57322, 37904, 62259, 19575, 7680, 34465, 7742, 2947, 64569, 32181, 59398, 38715, 38588, 43491, 57482, 62479, 8933, 43389, 29695, 6535, 10701, 11915, 49452, 2383, 5575, 43875, 7218, 65282}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{43444, 43834, 51289, 29526}, new char[]{35760, 5383, 5253, 51313}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getSize(0), new char[]{27745, 31462, 26577, 26149, 6716, 42202, 27560, 3873, 64321, 6116, 26547, 50151, 8778, 24811, 65466, 16863, 27599, 14594, 24449, 45159, 43950, 59064, 61059, 10041, 37669, 8031, 42908, 37919, 49799, 62353, 55816, 65281, 7116, 63179, 22822, 59517, 61063, 63828, 50222, 38331, 42670, 63110, 43918, 57643, 34605, 15174, 2906, 21497, 27501, 45220, 28725, 2900, 47259, 57740, 42520, 15820, 52026, 10931, 56842, 53093, 52088, 47678, 30137, 3834}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = b + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1488906454};
                byte[] bArr4 = $$d;
                Object[] objArr15 = new Object[1];
                d((byte) (-bArr4[6]), (byte) (-bArr4[61]), bArr4[59], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                d((byte) (-bArr4[36]), bArr4[16], (byte) (-bArr4[8]), objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 37567);
                        int i18 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
                        int i19 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b5, b5, bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i18, i19, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{43444, 43834, 51289, 29526}, new char[]{8170, 46613, 468, 52995}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), new char[]{13633, 7165, 7328, 48621, 42982, 37181, 23372, 45149, 41837, 46085, 2559, 53003, 57880, 10358, 33253, 36740, 13910, 19291, 65168, 4127, 38754, 50932}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{43444, 43834, 51289, 29526}, new char[]{61504, 52071, 11519, 26730}, (char) (ExpandableListView.getPackedPositionGroup(0L) + 27180), (-3446800) - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{64920, 63062, 45076, 12442, 13736, 1772, 11833, 58528, 17394, 12196, 53180, 54312, 3709, 419, 17272}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char tapTimeout2 = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                            int i20 = 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int iArgb = Color.argb(0, 0, 0, 0) + 14;
                            byte[] bArr6 = $$a;
                            byte b6 = bArr6[5];
                            Object[] objArr20 = new Object[1];
                            a(b6, bArr6[7], b6, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout2, i20, iArgb, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
                            int i21 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 626;
                            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
                            byte[] bArr7 = $$a;
                            byte b7 = bArr7[40];
                            Object[] objArr21 = new Object[1];
                            a(b7, (byte) (b7 | 12), bArr7[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, i21, modifierMetaStateMask2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
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
        if (i23 != i22) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                int i25 = i24 % 128;
                b = i25;
                int i26 = i24 % 2;
                int i27 = i25 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                int i28 = i27 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i23));
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[2])[0];
        int i31 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr3 = {i30};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i32 = ~iIdentityHashCode2;
        int i33 = i29 + (-1313098276) + ((~((-810374359) | i32)) * 979) + ((iIdentityHashCode2 | 1013363762) * (-979)) + (((~(iIdentityHashCode2 | (-810374359))) | (~(i32 | 1013363762))) * 979);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr[1])[0] = i35 ^ (i35 << 5);
        Object[] objArr22 = {new int[]{i31}, new int[1], iArr3, strArr4};
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeHandphoneVerificationEmailOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$MGVg8my9MbtxBAV6YVdjqOZPjY4((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$7lwPfIlqtG39jSdynyd9ZTx3ZL8(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        int i36 = ((int[]) objArr22[1])[0];
        int i37 = i36 * i36;
        int i38 = -(1606437064 * i36);
        int i39 = (i37 & i38) + (i37 | i38);
        int i40 = -(i36 * (-976604658));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        int i42 = (i41 ^ (-1586877767)) + (((-1586877767) & i41) << 1);
        int i43 = ((i42 >> 22) - 2047) / 1024;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        int i45 = ((i42 | i44) << 1) - (i44 ^ i42);
        int i46 = ((i42 >> 25) - 255) / 128;
        int i47 = -(i45 ^ (((i46 | 1) << 1) - (i46 ^ 1)));
        int i48 = ((i47 | 3) << 1) - (i47 ^ 3);
        int i49 = i48 >> 21;
        int i50 = ((((i49 | (-4095)) << 1) - (i49 ^ (-4095))) / 2048) + 1;
        Intrinsics.checkNotNullExpressionValue(api23Impl, "16/map(...)".substring(3141 / (((-((i50 ^ 1) + ((i50 & 1) << 1))) & i48) * 349)));
        return api23Impl;
    }

    private static final VerificationItem changeHandphoneVerification$lambda$29(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationItem verificationItem = (VerificationItem) function1.invoke(obj);
        int i3 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return verificationItem;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationItem> changeHandphoneVerification(ChangeHandphoneVerificationRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationItem>> derivecodecChangeHandphoneVerification = getWebService().changeHandphoneVerification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeHandphoneVerification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7776$r8$lambda$v_QTcu_QppnVRdkjGTbSog5J0((VerificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$ERRHOGy3cAe79J6waWYHwvLoNrU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VerificationSignatureItem changeHandphoneVerificationOtp$lambda$31(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (VerificationSignatureItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        VerificationSignatureItem verificationSignatureItem = (VerificationSignatureItem) function1.invoke(obj);
        int i3 = 18 / 0;
        return verificationSignatureItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<VerificationSignatureItem> changeHandphoneVerificationOtp(VerificationOtpRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VerificationSignatureItem>> derivecodecChangeHandphoneVerificationOtp = getWebService().changeHandphoneVerificationOtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeHandphoneVerificationOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7769$r8$lambda$SNPO6iORfKfFYUxUFyNHJ1CyEo((VerificationSignatureItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7774$r8$lambda$qsLqoGwvUZqesq1jRiZGN15WQ4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem changeHandphone$lambda$33(Function1 function1, Object obj) {
        BaseItem baseItem;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            baseItem = (BaseItem) function1.invoke(obj);
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            baseItem = (BaseItem) function1.invoke(obj);
        }
        int i4 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<BaseItem> changeHandphone(ChangePhoneNumberRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecChangeHandphone = getWebService().changeHandphone(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecChangeHandphone, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$wNmfUU12nbrZ6KpflBXkH0JpZPM((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda43
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$by3SI5x6yE0bkjIT8OU3muLmLFE(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem getTimeServer$lambda$35(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<BaseItem> getTimeServer() {
        int i = 2 % 2;
        deriveCodec<Response<BaseItem>> timeServer = getWebService().getTimeServer();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(timeServer, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$b0rlTeB3dutxzq1oqj37A77ZhQQ((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$xYsrtnZlKX5Q8c1aIG5sJ6yyvZQ(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    private static final BaseItem getTimeDetailServer$lambda$37(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i3 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return baseItem;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<BaseItem> getTimeDetailServer() {
        int i = 2 % 2;
        deriveCodec<Response<BaseItem>> timeDetailServer = getWebService().getTimeDetailServer();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(timeDetailServer, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.m7763$r8$lambda$YNjB0rKgSsgDmdzay4IUO7ObnQ((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7764$r8$lambda$3Tf5aM_9X2RTha3UfOHmLyXQgM(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final KeyResponse getGenerateKey$lambda$39(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        KeyResponse keyResponse = (KeyResponse) function1.invoke(obj);
        int i4 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return keyResponse;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<KeyResponse> getGenerateKey(KeyRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<KeyResponse>> generateKey = getWebService().getGenerateKey(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(generateKey, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$QnQFfwRV91BkOCluPH9a4XRCn6c((KeyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.$r8$lambda$Dp7DxebOSlNyD7rqyEmUx0pi2OA(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return api23Impl;
    }

    private static final ApitoClientResponse getApiToClient$lambda$41(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ApitoClientResponse apitoClientResponse = (ApitoClientResponse) function1.invoke(obj);
        int i4 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return apitoClientResponse;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ApitoClientResponse> getApiToClient() {
        int i = 2 % 2;
        deriveCodec<Response<ApitoClientResponse>> apitoClient = getWebService().getApitoClient();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(apitoClient, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$aFrnyh95DdRVxW1MnkvsuxWDR0U((ApitoClientResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7775$r8$lambda$tPHBdok2dARaitgBMVM9UZvs0s(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return api23Impl;
    }

    private static final ClientToApiResponse getClientToApi$lambda$43(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ClientToApiResponse clientToApiResponse = (ClientToApiResponse) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
        return clientToApiResponse;
    }

    @Override // com.bpjstku.data.setting.SettingRepository
    public final deriveCodec<ClientToApiResponse> getClientToApi(String p0, String p1, ExpResponse p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        deriveCodec<Response<ClientToApiResponse>> clienttoApi = getWebService().getClienttoApi(p0, p1, p2);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(clienttoApi, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingDataStore.$r8$lambda$pRys1v88lGfnYUtSIuH0lLgjbY0((ClientToApiResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.setting.SettingDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SettingDataStore.m7768$r8$lambda$QpyR65y6X2_YeLv63GUyHniuTw(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return api23Impl;
    }

    /* JADX INFO: renamed from: $r8$lambda$-YNjB0rKgSsgDmdzay4IUO7ObnQ, reason: not valid java name */
    public static /* synthetic */ BaseItem m7763$r8$lambda$YNjB0rKgSsgDmdzay4IUO7ObnQ(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        BaseItem timeDetailServer$lambda$36 = getTimeDetailServer$lambda$36(baseItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return timeDetailServer$lambda$36;
        }
        throw null;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$2zpxulEO5sR2N7KkwjViCpA6MZQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeEmailVerification$lambda$19 = changeEmailVerification$lambda$19(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationItemChangeEmailVerification$lambda$19;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$3Tf5aM_9X2RT-ha3UfOHmLyXQgM, reason: not valid java name */
    public static /* synthetic */ BaseItem m7764$r8$lambda$3Tf5aM_9X2RTha3UfOHmLyXQgM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        BaseItem timeDetailServer$lambda$37 = getTimeDetailServer$lambda$37(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return timeDetailServer$lambda$37;
        }
        throw null;
    }

    public static /* synthetic */ ChangePhoneItem $r8$lambda$4l1Pv1KDGNc8qRm1Exb8kVGJNDg(ChangePhoneItem changePhoneItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        ChangePhoneItem changePhoneItemPostChangePhoneNumber$lambda$10 = postChangePhoneNumber$lambda$10(changePhoneItem);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return changePhoneItemPostChangePhoneNumber$lambda$10;
    }

    public static /* synthetic */ ProfilePictureItem $r8$lambda$5L_6ZMzAvbSb8ZTpxfRZU84qT2E(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ProfilePictureItem profilePictureItemPostChangeProfilePicture$lambda$9 = postChangeProfilePicture$lambda$9(function1, obj);
        int i4 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return profilePictureItemPostChangeProfilePicture$lambda$9;
    }

    public static /* synthetic */ VerificationSignatureItem $r8$lambda$63qutvxc2BIFVxdfdnFDgWqRBYM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeEmailVerificationHandphoneOtp$lambda$17 = changeEmailVerificationHandphoneOtp$lambda$17(function1, obj);
        int i4 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItemChangeEmailVerificationHandphoneOtp$lambda$17;
    }

    public static /* synthetic */ VerificationSignatureItem $r8$lambda$7lwPfIlqtG39jSdynyd9ZTx3ZL8(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeHandphoneVerificationEmailOtp$lambda$27 = changeHandphoneVerificationEmailOtp$lambda$27(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return verificationSignatureItemChangeHandphoneVerificationEmailOtp$lambda$27;
    }

    /* JADX INFO: renamed from: $r8$lambda$7p1pBuJPQxkcg_4jwG-cuYhrqlg, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7765$r8$lambda$7p1pBuJPQxkcg_4jwGcuYhrqlg(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return postPhoneVerification$lambda$7(function1, obj);
        }
        postPhoneVerification$lambda$7(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ChangePhoneItem $r8$lambda$AoWvj24hBEpBxjDyK2KdZrdssBY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        ChangePhoneItem changePhoneItemPostChangePhoneNumber$lambda$11 = postChangePhoneNumber$lambda$11(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return changePhoneItemPostChangePhoneNumber$lambda$11;
    }

    public static /* synthetic */ KeyResponse $r8$lambda$Dp7DxebOSlNyD7rqyEmUx0pi2OA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        KeyResponse generateKey$lambda$39 = getGenerateKey$lambda$39(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i4 % 128;
        int i5 = i4 % 2;
        return generateKey$lambda$39;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$ERRHOGy3cAe79J6waWYHwvLoNrU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeHandphoneVerification$lambda$29 = changeHandphoneVerification$lambda$29(function1, obj);
        int i4 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemChangeHandphoneVerification$lambda$29;
    }

    public static /* synthetic */ BaseItem $r8$lambda$EmUxvg2gpv0aoAT1eXL12HEsWAI(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            changeEmail$lambda$23(function1, obj);
            throw null;
        }
        BaseItem baseItemChangeEmail$lambda$23 = changeEmail$lambda$23(function1, obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i3 % 128;
        int i4 = i3 % 2;
        return baseItemChangeEmail$lambda$23;
    }

    /* JADX INFO: renamed from: $r8$lambda$HNBK_lBd-7uOJK-n73GXHUs671w, reason: not valid java name */
    public static /* synthetic */ BaseItem m7766$r8$lambda$HNBK_lBd7uOJKn73GXHUs671w(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return changeEmail$lambda$22(baseItem);
        }
        changeEmail$lambda$22(baseItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VerificationSignatureItem $r8$lambda$JJfU_PyxitYK2Nnqnu0aHCB3bj4(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeEmailVerificationOtp$lambda$20 = changeEmailVerificationOtp$lambda$20(verificationSignatureItem);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return verificationSignatureItemChangeEmailVerificationOtp$lambda$20;
        }
        throw null;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$L6ukdK8AROHVhRqX5NQZkUzsEQs(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return changeHandphoneVerificationEmail$lambda$24(verificationItem);
        }
        changeHandphoneVerificationEmail$lambda$24(verificationItem);
        throw null;
    }

    public static /* synthetic */ VerificationSignatureItem $r8$lambda$MGVg8my9MbtxBAV6YVdjqOZPjY4(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeHandphoneVerificationEmailOtp$lambda$26 = changeHandphoneVerificationEmailOtp$lambda$26(verificationSignatureItem);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return verificationSignatureItemChangeHandphoneVerificationEmailOtp$lambda$26;
    }

    /* JADX INFO: renamed from: $r8$lambda$OTtd-fSOHkMCFYclePQMZEH2CNQ, reason: not valid java name */
    public static /* synthetic */ ProfilePictureItem m7767$r8$lambda$OTtdfSOHkMCFYclePQMZEH2CNQ(ProfilePictureItem profilePictureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        ProfilePictureItem profilePictureItemPostChangeProfilePicture$lambda$8 = postChangeProfilePicture$lambda$8(profilePictureItem);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return profilePictureItemPostChangeProfilePicture$lambda$8;
    }

    public static /* synthetic */ VerificationSignatureItem $r8$lambda$OYq6DvirmdCNjalXW0cnIDuXo8s(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeEmailVerificationOtp$lambda$21 = changeEmailVerificationOtp$lambda$21(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationSignatureItemChangeEmailVerificationOtp$lambda$21;
        }
        throw null;
    }

    public static /* synthetic */ KeyResponse $r8$lambda$QnQFfwRV91BkOCluPH9a4XRCn6c(KeyResponse keyResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        KeyResponse generateKey$lambda$38 = getGenerateKey$lambda$38(keyResponse);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return generateKey$lambda$38;
    }

    /* JADX INFO: renamed from: $r8$lambda$QpyR65y6X2_YeLv63GU-yHniuTw, reason: not valid java name */
    public static /* synthetic */ ClientToApiResponse m7768$r8$lambda$QpyR65y6X2_YeLv63GUyHniuTw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ClientToApiResponse clientToApi$lambda$43 = getClientToApi$lambda$43(function1, obj);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        b = i5 % 128;
        int i6 = i5 % 2;
        return clientToApi$lambda$43;
    }

    /* JADX INFO: renamed from: $r8$lambda$SNPO6iORfKfFYUxUFyNHJ1C-yEo, reason: not valid java name */
    public static /* synthetic */ VerificationSignatureItem m7769$r8$lambda$SNPO6iORfKfFYUxUFyNHJ1CyEo(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeHandphoneVerificationOtp$lambda$30 = changeHandphoneVerificationOtp$lambda$30(verificationSignatureItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return verificationSignatureItemChangeHandphoneVerificationOtp$lambda$30;
    }

    /* JADX INFO: renamed from: $r8$lambda$U-RdtYhRg1KOWanEQXm2RlpqOiw, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7770$r8$lambda$URdtYhRg1KOWanEQXm2RlpqOiw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return postEmailVerification$lambda$5(function1, obj);
        }
        postEmailVerification$lambda$5(function1, obj);
        throw null;
    }

    public static /* synthetic */ KpjItemAdded $r8$lambda$U3iz0BrmEdbMVlw9piIhI6dlFZo(KpjItemAdded kpjItemAdded) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            postAddKpj$lambda$2(kpjItemAdded);
            obj.hashCode();
            throw null;
        }
        KpjItemAdded kpjItemAddedPostAddKpj$lambda$2 = postAddKpj$lambda$2(kpjItemAdded);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return kpjItemAddedPostAddKpj$lambda$2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$UqpwKnIisFkgWO4GfOrWpL5cOQ0(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeEmailVerification$lambda$18 = changeEmailVerification$lambda$18(verificationItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemChangeEmailVerification$lambda$18;
    }

    /* JADX INFO: renamed from: $r8$lambda$UyOHLSWJPl-HkiETficSVdC4rkU, reason: not valid java name */
    public static /* synthetic */ VerificationSignatureItem m7771$r8$lambda$UyOHLSWJPlHkiETficSVdC4rkU(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeEmailVerificationHandphoneOtp$lambda$16 = changeEmailVerificationHandphoneOtp$lambda$16(verificationSignatureItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItemChangeEmailVerificationHandphoneOtp$lambda$16;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$aE2h8VOyLF8nFm3mNyrDcj5gcLg(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeEmailVerificationHandphone$lambda$14 = changeEmailVerificationHandphone$lambda$14(verificationItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationItemChangeEmailVerificationHandphone$lambda$14;
        }
        throw null;
    }

    public static /* synthetic */ ApitoClientResponse $r8$lambda$aFrnyh95DdRVxW1MnkvsuxWDR0U(ApitoClientResponse apitoClientResponse) {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ApitoClientResponse apiToClient$lambda$40 = getApiToClient$lambda$40(apitoClientResponse);
        int i4 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return apiToClient$lambda$40;
    }

    public static /* synthetic */ BaseItem $r8$lambda$b0rlTeB3dutxzq1oqj37A77ZhQQ(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        BaseItem timeServer$lambda$34 = getTimeServer$lambda$34(baseItem);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return timeServer$lambda$34;
    }

    /* JADX INFO: renamed from: $r8$lambda$bhjfalmQCMkoD_Q9F0OFS-FAwW4, reason: not valid java name */
    public static /* synthetic */ ChangeEmailItem m7772$r8$lambda$bhjfalmQCMkoD_Q9F0OFSFAwW4(ChangeEmailItem changeEmailItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        ChangeEmailItem changeEmailItemPostChangeEmail$lambda$0 = postChangeEmail$lambda$0(changeEmailItem);
        int i4 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return changeEmailItemPostChangeEmail$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$by3SI5x6yE0bkjIT8OU3muLmLFE(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem baseItemChangeHandphone$lambda$33 = changeHandphone$lambda$33(function1, obj);
        int i4 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItemChangeHandphone$lambda$33;
        }
        throw null;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$c9nFw9ZUi3FAhiVX6Nn0UQMu6Ww(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostPhoneVerification$lambda$6 = postPhoneVerification$lambda$6(verificationItem);
        int i4 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemPostPhoneVerification$lambda$6;
    }

    public static /* synthetic */ KpjItemAdded $r8$lambda$hr6nfhT1rvMEbRjlAwvuNDY5a8U(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        b = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            postAddKpj$lambda$3(function1, obj);
            obj2.hashCode();
            throw null;
        }
        KpjItemAdded kpjItemAddedPostAddKpj$lambda$3 = postAddKpj$lambda$3(function1, obj);
        int i3 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return kpjItemAddedPostAddKpj$lambda$3;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$ktDRx1wP2to0Qtn3M-rOLJ7akpo, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7773$r8$lambda$ktDRx1wP2to0Qtn3MrOLJ7akpo(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeEmailVerificationHandphone$lambda$15 = changeEmailVerificationHandphone$lambda$15(function1, obj);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return verificationItemChangeEmailVerificationHandphone$lambda$15;
    }

    public static /* synthetic */ VerificationItem $r8$lambda$mEYs7kwMP4JhK1yVFftJim5eYLw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemChangeHandphoneVerificationEmail$lambda$25 = changeHandphoneVerificationEmail$lambda$25(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationItemChangeHandphoneVerificationEmail$lambda$25;
    }

    public static /* synthetic */ ClientToApiResponse $r8$lambda$pRys1v88lGfnYUtSIuH0lLgjbY0(ClientToApiResponse clientToApiResponse) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getClientToApi$lambda$42(clientToApiResponse);
        }
        getClientToApi$lambda$42(clientToApiResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ChangePasswordItem $r8$lambda$qoFRNPokK4GqIEFxSAuoMYFzdHA(ChangePasswordItem changePasswordItem) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ChangePasswordItem changePasswordItemPostChangePassword$lambda$12 = postChangePassword$lambda$12(changePasswordItem);
        int i4 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return changePasswordItemPostChangePassword$lambda$12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$qsLqoGwvUZqesq1jRiZGN1-5WQ4, reason: not valid java name */
    public static /* synthetic */ VerificationSignatureItem m7774$r8$lambda$qsLqoGwvUZqesq1jRiZGN15WQ4(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationSignatureItem verificationSignatureItemChangeHandphoneVerificationOtp$lambda$31 = changeHandphoneVerificationOtp$lambda$31(function1, obj);
        int i4 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItemChangeHandphoneVerificationOtp$lambda$31;
    }

    /* JADX INFO: renamed from: $r8$lambda$tPHBdok2dARaitg-BMVM9UZvs0s, reason: not valid java name */
    public static /* synthetic */ ApitoClientResponse m7775$r8$lambda$tPHBdok2dARaitgBMVM9UZvs0s(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getApiToClient$lambda$41(function1, obj);
        }
        getApiToClient$lambda$41(function1, obj);
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$v_-QTcu_Qppn-VRdkjGTbSog5J0, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7776$r8$lambda$v_QTcu_QppnVRdkjGTbSog5J0(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return changeHandphoneVerification$lambda$28(verificationItem);
        }
        changeHandphoneVerification$lambda$28(verificationItem);
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$wNmfUU12nbrZ6KpflBXkH0JpZPM(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return changeHandphone$lambda$32(baseItem);
        }
        changeHandphone$lambda$32(baseItem);
        throw null;
    }

    public static /* synthetic */ BaseItem $r8$lambda$xYsrtnZlKX5Q8c1aIG5sJ6yyvZQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BaseItem timeServer$lambda$35 = getTimeServer$lambda$35(function1, obj);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return timeServer$lambda$35;
    }

    public static /* synthetic */ ChangeEmailItem $r8$lambda$xdc49lisrpkhFpfA9d1OSxVKlwY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ChangeEmailItem changeEmailItemPostChangeEmail$lambda$1 = postChangeEmail$lambda$1(function1, obj);
        int i4 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return changeEmailItemPostChangeEmail$lambda$1;
    }

    public static /* synthetic */ ChangePasswordItem $r8$lambda$yhmJx1aGZvJFFoaRIzhnJGNGafM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ChangePasswordItem changePasswordItemPostChangePassword$lambda$13 = postChangePassword$lambda$13(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return changePasswordItemPostChangePassword$lambda$13;
    }

    /* JADX INFO: renamed from: $r8$lambda$z53OYa0su-NYt6iAz4zKsQf6G8Q, reason: not valid java name */
    public static /* synthetic */ VerificationItem m7777$r8$lambda$z53OYa0suNYt6iAz4zKsQf6G8Q(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        VerificationItem verificationItemPostEmailVerification$lambda$4 = postEmailVerification$lambda$4(verificationItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return verificationItemPostEmailVerification$lambda$4;
    }

    static {
        asInterface = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = g + 51;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    private static final BaseItem changeEmail$lambda$22(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static final VerificationItem changeEmailVerification$lambda$18(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return verificationItem;
    }

    private static final VerificationItem changeEmailVerificationHandphone$lambda$14(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        if (i3 == 0) {
            return verificationItem;
        }
        throw null;
    }

    private static final VerificationSignatureItem changeEmailVerificationHandphoneOtp$lambda$16(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        int i4 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItem;
    }

    private static final VerificationSignatureItem changeEmailVerificationOtp$lambda$20(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        int i4 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return verificationSignatureItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final BaseItem changeHandphone$lambda$32(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return baseItem;
    }

    private static final VerificationItem changeHandphoneVerification$lambda$28(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationItem;
    }

    private static final VerificationItem changeHandphoneVerificationEmail$lambda$24(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return verificationItem;
        }
        throw null;
    }

    private static final VerificationSignatureItem changeHandphoneVerificationEmailOtp$lambda$26(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItem;
    }

    private static final VerificationSignatureItem changeHandphoneVerificationOtp$lambda$30(VerificationSignatureItem verificationSignatureItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return verificationSignatureItem;
    }

    private static final ApitoClientResponse getApiToClient$lambda$40(ApitoClientResponse apitoClientResponse) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(apitoClientResponse, "");
        int i4 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return apitoClientResponse;
    }

    private static final ClientToApiResponse getClientToApi$lambda$42(ClientToApiResponse clientToApiResponse) {
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(clientToApiResponse, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return clientToApiResponse;
        }
        throw null;
    }

    private static final KeyResponse getGenerateKey$lambda$38(KeyResponse keyResponse) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(keyResponse, "");
        if (i3 != 0) {
            return keyResponse;
        }
        throw null;
    }

    private static final BaseItem getTimeDetailServer$lambda$36(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItem;
        }
        obj.hashCode();
        throw null;
    }

    private static final BaseItem getTimeServer$lambda$34(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static final KpjItemAdded postAddKpj$lambda$2(KpjItemAdded kpjItemAdded) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpjItemAdded, "");
        int i4 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return kpjItemAdded;
    }

    private static final ChangeEmailItem postChangeEmail$lambda$0(ChangeEmailItem changeEmailItem) {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(changeEmailItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        b = i4 % 128;
        int i5 = i4 % 2;
        return changeEmailItem;
    }

    private static final ChangePasswordItem postChangePassword$lambda$12(ChangePasswordItem changePasswordItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(changePasswordItem, "");
        int i4 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return changePasswordItem;
    }

    private static final ChangePhoneItem postChangePhoneNumber$lambda$10(ChangePhoneItem changePhoneItem) {
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(changePhoneItem, "");
        if (i3 == 0) {
            return changePhoneItem;
        }
        throw null;
    }

    private static final ProfilePictureItem postChangeProfilePicture$lambda$8(ProfilePictureItem profilePictureItem) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(profilePictureItem, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i4 % 128;
        int i5 = i4 % 2;
        return profilePictureItem;
    }

    private static final VerificationItem postEmailVerification$lambda$4(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i4 % 128;
        int i5 = i4 % 2;
        return verificationItem;
    }

    private static final VerificationItem postPhoneVerification$lambda$6(VerificationItem verificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verificationItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return verificationItem;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3159234274423526267L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.setting.SettingDataStore.$$c
            int r6 = 104 - r6
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.SettingDataStore.$$g(byte, byte, byte):java.lang.String");
    }
}
