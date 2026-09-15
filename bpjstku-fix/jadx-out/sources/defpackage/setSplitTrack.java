package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MediatorLiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.domain.registration.general.model.Verification;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setSplitTrack extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<KeyResponse>> INotificationSideChannel;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> INotificationSideChannelDefault;
    public final LiveData<Map<ValidationType, Boolean>> INotificationSideChannelStub;
    public final MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> INotificationSideChannelStubProxy;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> IconCompatParcelizer;
    public final BackHandlerKtExternalSyntheticLambda1 MediaBrowserCompat;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<MembershipCheckItem>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<ActivationItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<Map<ValidationType, Boolean>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> f1390a;
    public final LiveData<Boolean> asBinder;
    public final acquireBuffer asInterface;
    public final MutableLiveData<String> b;
    public final LiveData<Boolean> cancel;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> cancelAll;
    public final registerlambda1 connect;
    public final MutableLiveData<VirtualCameraAdapter1<MembershipCheckNew>> d;
    public final MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> disconnect;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> g;
    public final MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> getExtras;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> getInterfaceDescriptor;
    private final MutableLiveData<Boolean> getItem;
    private final MutableLiveData<String> getNotifyChildrenChangedOptions;
    public final MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> getRoot;
    private final getDarkScrimactivity getSessionToken;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> notify;
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> onTransact;
    public final MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> read;
    private final MediatorLiveData<Boolean> sendCustomAction;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> write;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {90, 46, 113, 8};
        private static final int $$f = 243;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 17, 12, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
        private static final int $$e = 0;
        private static final byte[] $$a = {87, 51, -85, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 223;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int b = -83722436;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r9 = r9 * 3
                int r9 = r9 + 84
                int r8 = r8 + 4
                int r7 = r7 * 15
                int r7 = r7 + 38
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r8
                goto L2d
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-11)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                int r7 = r7 * 48
                int r7 = 51 - r7
                int r6 = r6 * 4
                int r1 = 53 - r6
                int r8 = r8 * 15
                int r8 = r8 + 84
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r6
                r4 = r2
                goto L30
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L30:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + 3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d(short, int, byte, java.lang.Object[]):void");
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) throws Throwable {
            char c;
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43043);
                int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0, 0);
                int iGreen = Color.green(0) + 22;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[5], bArr[132], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, iGreen, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(false, 192 - TextUtils.indexOf((CharSequence) "", '0', 0), 22 - KeyEvent.normalizeMetaState(0), 6 - MotionEvent.axisFromString(""), new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(false, 198 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14 - MotionEvent.axisFromString(""), Process.getGidForName("") + 11, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char size = (char) (43042 - View.MeasureSpec.getSize(0));
                int mirror = AndroidCharacter.getMirror('0') + 3063;
                int iMyTid = 22 - (Process.myTid() >> 22);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr2[5], bArr2[1], bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, mirror, iMyTid, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
                    int iLastIndexOf2 = 3110 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    a(b3, (byte) (b3 | 103), b2, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iLastIndexOf2, scrollBarSize, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i4 = ((int[]) objArr7[2])[0];
                int i5 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int i6 = ~Process.myUid();
                int i7 = ~(705348068 | i6);
                int i8 = 917213570 + ((i7 | 999683390) * 764) + (((~(i6 | 999683390)) | 655552) * (-1528)) + ((295646426 | i7) * 764) + 1733765526;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
                c = 2;
            } else {
                Object[] objArr8 = new Object[1];
                c(true, 192 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, Drawable.resolveOpacity(0, 0) + 3, new char[]{20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(true, 196 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 16, Color.blue(0) + 15, new char[]{65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535}, objArr9);
                try {
                    Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1733765526};
                    byte b4 = $$d[35];
                    byte b5 = b4;
                    Object[] objArr11 = new Object[1];
                    d(b4, b5, b5, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b6 = (byte) $$e;
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    d(b6, b7, b7, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43042);
                        int iAlpha = Color.alpha(0) + 3111;
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        a(b9, (byte) (b9 | 103), b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iAlpha, i11, 154975793, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(false, 192 - Process.getGidForName(""), TextUtils.getCapsMode("", 0, 0) + 22, 7 - Color.green(0), new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(false, Gravity.getAbsoluteGravity(0, 0) + 197, MotionEvent.axisFromString("") + 16, (Process.myPid() >> 22) + 10, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 43042);
                            int i12 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr3 = $$a;
                            Object[] objArr17 = new Object[1];
                            a(bArr3[5], bArr3[1], bArr3[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, i12, packedPositionGroup, -1269618118, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cGreen = (char) (43042 - Color.green(0));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
                            int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr4[5], bArr4[132], bArr4[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, scrollDefaultDelay, i13, -1272852037, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                        c = 2;
                        int i15 = i14 % 2;
                        objArr = objArr13;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[c])[0];
            if (i17 == i16) {
                Object[] objArr19 = new Object[4];
                objArr19[0] = new int[1];
                objArr19[1] = new int[]{i};
                objArr19[c] = new int[]{i};
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[c])[0];
                int i20 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int i21 = ~((~Process.myTid()) | 1254377263);
                int i22 = i18 + ((1073741836 | i21) * (-970)) + 434854396 + ((i21 | 180635427) * 970);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr19[0])[0] = i24 ^ (i24 << 5);
                objArr19[3] = strArr2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                    int i26 = i25 % 2;
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i17];
                int i27 = i17 - 1;
                iArr[i27] = 1;
                Toast.makeText((Context) null, iArr[((i17 * i27) % 2) - 1], 1).show();
                int i28 = ((int[]) objArr[0])[0];
                int i29 = ((int[]) objArr[2])[0];
                int i30 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i31 = i28 + (-1562831124) + (((~((-1130107980) | iIdentityHashCode)) | 574923479) * (-366)) + (((~(iIdentityHashCode | (-1092097033))) | 536912532) * 366);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr[0])[0] = i33 ^ (i33 << 5);
                Object[] objArr20 = {new int[1], new int[]{i30}, new int[]{i29}, strArr4};
            }
            function1.invoke(obj);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0168  */
        /* JADX WARN: Code duplicated, block: B:37:0x0169  */
        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (true) {
                i4 = 29209604;
                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                    break;
                }
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.normalizeMetaState(0), 3291 - TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
                            int minimumFlingVelocity = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte b4 = (byte) ($$f & 5);
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, keyRepeatDelay, minimumFlingVelocity, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
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
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i3 > 0) {
                int i7 = $11 + 39;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                int i9 = $10 + 93;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iResolveSizeAndState = 651 - View.resolveSizeAndState(0, 0, 0);
                        int trimmedLength = 44 - TextUtils.getTrimmedLength("");
                        byte b6 = (byte) ($$f & 5);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, iResolveSizeAndState, trimmedLength, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 29209604;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof Observer)) {
                return false;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = i3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            int i4 = 22 / 0;
            return functionDelegate.hashCode();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r5, short r6, short r7) {
            /*
                byte[] r0 = setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r7 = r7 * 4
                int r1 = r7 + 1
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r5 = 120 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r5
                r5 = r7
                r4 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r3 = r0[r6]
            L27:
                int r5 = r5 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(int, short, short):java.lang.String");
        }
    }

    public setSplitTrack(BackHandlerKtExternalSyntheticLambda1 backHandlerKtExternalSyntheticLambda1, getDarkScrimactivity getdarkscrimactivity, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(backHandlerKtExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(getdarkscrimactivity, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.MediaBrowserCompat = backHandlerKtExternalSyntheticLambda1;
        this.getSessionToken = getdarkscrimactivity;
        this.connect = registerlambda1Var;
        this.asInterface = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = new MutableLiveData<>();
        this.IconCompatParcelizer = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData2 = new MutableLiveData<>();
        this.onTransact = mutableLiveData2;
        this.TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>();
        this.d = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData3 = new MutableLiveData<>();
        this.write = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData4 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData5 = new MutableLiveData<>();
        this.f1390a = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData6 = new MutableLiveData<>();
        this.INotificationSideChannelDefault = mutableLiveData6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData7 = new MutableLiveData<>();
        this.g = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData8 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData9 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData10 = new MutableLiveData<>();
        this.notify = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData11 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData12 = new MutableLiveData<>();
        this.getExtras = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData13 = new MutableLiveData<>();
        this.disconnect = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData14 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData15 = new MutableLiveData<>();
        this.getRoot = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData16 = new MutableLiveData<>();
        this.read = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> mutableLiveData17 = new MutableLiveData<>();
        this.INotificationSideChannelStubProxy = mutableLiveData17;
        MutableLiveData<Map<ValidationType, Boolean>> mutableLiveData18 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData18;
        MutableLiveData<Map<ValidationType, Boolean>> mutableLiveData19 = mutableLiveData18;
        this.INotificationSideChannelStub = mutableLiveData19;
        MutableLiveData<Boolean> mutableLiveData20 = new MutableLiveData<>();
        this.getItem = mutableLiveData20;
        MutableLiveData<Boolean> mutableLiveData21 = mutableLiveData20;
        this.asBinder = mutableLiveData21;
        MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        this.sendCustomAction = mediatorLiveData;
        this.cancel = mediatorLiveData;
        MutableLiveData<String> mutableLiveData22 = new MutableLiveData<>();
        this.b = mutableLiveData22;
        MutableLiveData<String> mutableLiveData23 = new MutableLiveData<>();
        this.getNotifyChildrenChangedOptions = mutableLiveData23;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar17 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mediatorLiveData.addSource(mutableLiveData19, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getCurrentContentInsetRight
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (Map) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData21, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getNavButtonView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData22, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getLogo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.b(this.b);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData23, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getNavigationContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PhoneVerificationRequestAuth phoneVerificationRequestAuth) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequestAuth, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.getSessionToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequestAuth)));
        final Function1 function1 = new Function1() { // from class: ThemeUtils
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.d(this.TuitionPaymentFragmentbindingInflater1, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: SwitchCompatInspectionCompanion
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: checkAppCompatTheme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.asInterface(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: createDisabledStateList
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.f1390a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.getSessionToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: setThumbTextPadding
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setThumbResource
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setThumbDrawable
            private static final byte[] $$c = {25, -93, -120, -48};
            private static final int $$d = 130;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 236;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int asInterface = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 120458168;
            private static char b = 34097;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.setThumbDrawable.$$a
                    int r1 = 53 - r6
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1a:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r5
                L2e:
                    int r8 = r8 + r7
                    int r7 = r3 + 1
                    int r8 = r8 + (-11)
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setThumbDrawable.a(short, int, short, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
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
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 8328);
                            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1235;
                            int jumpTapTimeout = 35 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b2 = (byte) ($$d & 15);
                            byte b3 = (byte) (b2 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, i3, jumpTapTimeout, -653973969, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2764, 14 - TextUtils.indexOf("", ""), 1504416861, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 253, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 65201), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2891, TextUtils.getOffsetBefore("", 0) + 17, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i4 = $11 + 47;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
                int i6 = $11 + 25;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                int i2 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int offsetAfter = 651 - TextUtils.getOffsetAfter("", 0);
                    int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, offsetAfter, i3, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{19877, 55435, 53982, 52429}, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0, 0), new char[]{62049, 35283, 60992, 22910, 35409, 33350, 23003, 18552, 30619, 60346, 40108, 9039, 16805, 61840, 44262, 65286, 15732, 49545, 46626, 54890, 60337, 20989}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{58283, 8292, 16308, 39963}, (char) (6974 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1272945436) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{56057, 33910, 42024, 49397, 6820, 27453, 25352, 60374, 47116, 17652, 58944, 21652, 37634, 53645, 10115}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int maximumFlingVelocity = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i4 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b4 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 52, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, maximumFlingVelocity, i4, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = TuitionPaymentFragmentbindingInflater1 + 15;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 651;
                        int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) (bArr2[33] - 1), bArr2[80], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveSizeAndState, iLastIndexOf, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i7 = ((int[]) objArr7[2])[0];
                    int i8 = ((int[]) objArr7[0])[0];
                    int i9 = ~(System.identityHashCode(this) | 670899685);
                    int i10 = (((-3529135) | i9) * (-658)) + 1078937771 + ((i9 | (-670948848)) * 658) + 1611062210;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getTrimmedLength(""), 1610 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1611062210, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 651;
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 45;
                            byte b5 = $$a[7];
                            Object[] objArr9 = new Object[1];
                            a((byte) 52, b5, b5, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iIndexOf, iIndexOf2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 695, 97 - TextUtils.lastIndexOf("", '0', 0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 793, 83 - (ViewConfiguration.getLongPressTimeout() >> 16)), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                            int iLastIndexOf2 = 650 - TextUtils.lastIndexOf("", '0', 0);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 44;
                            byte[] bArr3 = $$a;
                            Object[] objArr10 = new Object[1];
                            a((byte) (bArr3[33] - 1), bArr3[80], bArr3[7], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iLastIndexOf2, deadChar, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{19877, 55435, 53982, 52429}, (char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{62049, 35283, 60992, 22910, 35409, 33350, 23003, 18552, 30619, 60346, 40108, 9039, 16805, 61840, 44262, 65286, 15732, 49545, 46626, 54890, 60337, 20989}, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{58283, 8292, 16308, 39963}, (char) (6975 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.blue(0) - 1272945437, new char[]{56057, 33910, 42024, 49397, 6820, 27453, 25352, 60374, 47116, 17652, 58944, 21652, 37634, 53645, 10115}, objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                                int i13 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650;
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                                byte b6 = $$a[7];
                                Object[] objArr13 = new Object[1];
                                a((byte) 52, b6, b6, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength2, i13, iResolveOpacity, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                int scrollBarFadeDuration = 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
                                byte[] bArr4 = $$a;
                                byte b7 = bArr4[7];
                                byte b8 = bArr4[80];
                                Object[] objArr14 = new Object[1];
                                a(b7, b8, b8, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, scrollBarFadeDuration, scrollBarSize, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr == null) {
                        throw null;
                    }
                    while (i2 < strArr.length) {
                        int i14 = asInterface + 37;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        if (i14 % 2 != 0) {
                            arrayList.add(strArr[i2]);
                            i2 += 4;
                        } else {
                            arrayList.add(strArr[i2]);
                            i2++;
                        }
                    }
                    throw null;
                }
                Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[2])[0];
                int i17 = ((int[]) objArr[0])[0];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i18 = i15 + 1049828164 + (((~(startElapsedRealtime | 621524172)) | 13912882) * 305) + (((~((~startElapsedRealtime) | 621524172)) | 618093362) * 305);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
                int i21 = TuitionPaymentFragmentbindingInflater1 + 83;
                asInterface = i21 % 128;
                int i22 = i21 % 2;
                Unit unitAsBinder = setSplitTrack.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
                int i23 = TuitionPaymentFragmentbindingInflater1 + 87;
                asInterface = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 15 / 0;
                }
                return unitAsBinder;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r5, short r6, int r7) {
                /*
                    int r7 = r7 * 4
                    int r7 = 1 - r7
                    byte[] r0 = defpackage.setThumbDrawable.$$c
                    int r6 = r6 + 4
                    int r5 = 104 - r5
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r4 = r7
                    r3 = r2
                    goto L24
                L12:
                    r3 = r2
                L13:
                    int r6 = r6 + 1
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L22:
                    r4 = r0[r6]
                L24:
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setThumbDrawable.$$e(byte, short, int):java.lang.String");
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setTrackResource
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.getSessionToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest))).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new SwitchCompatEmojiCompatInitCallback(new Function1() { // from class: setTrackTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.g(this.b, (Verification) obj);
            }
        }), new SwitchCompat1(new Function1() { // from class: onInitialized
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.getExtras(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final RegisterRequest registerRequest) {
        Intrinsics.checkNotNullParameter(registerRequest, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: onEmojiCompatInitializedForSwitchText
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objectRef, this, registerRequest, task);
                }
            }));
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) objectRef.element, registerRequest);
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, RegisterRequest registerRequest) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.write;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.b(RegisterRequest.copy$default(registerRequest, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, 64511, null))));
        final Function1 function1 = new Function1() { // from class: Toolbar
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: length
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final ensureLogoView ensurelogoview = new ensureLogoView(this);
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: addCustomViewsWithGravity
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ensurelogoview.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: getSubtitleTextView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getNavigationIcon
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getTitleMarginTop
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.d(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getTitleMarginStart
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, EmailVerificationRequest emailVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(emailVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, emailVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: isBackInvokedCallbackEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Verification) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: onRtlPropertiesChanged
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        }, new setContentInsetsRelative(new Function1() { // from class: setContentInsetEndWithActions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.connect(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.IconCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: getTitleTextView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setBackInvokedCallbackEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: removeChildrenForExpandedActionView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.INotificationSideChannelStubProxy(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setCollapseContentDescription
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, PhoneVerificationRequest phoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(phoneVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.IconCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, phoneVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: TintInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: shouldWrap
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: TintTypedArray
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.read(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: obtainStyledAttributes
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(MembershipCheckRequest membershipCheckRequest) {
        Intrinsics.checkNotNullParameter(membershipCheckRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MembershipCheckItem>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(membershipCheckRequest)));
        final Function1 function1 = new Function1() { // from class: setSwitchMinWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.b(this.TuitionPaymentFragmentbindingInflater1, (MembershipCheckItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setSwitchTypeface
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setSwitchPadding
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.getItem(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setTextOn
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, MembershipCheckRequest membershipCheckRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(membershipCheckRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MembershipCheckNew>> mutableLiveData = this.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, membershipCheckRequest)));
        final Function1 function1 = new Function1() { // from class: setThumbTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.b(this.TuitionPaymentFragmentbindingInflater1, (MembershipCheckNew) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setTrackDrawable
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setTrackTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.MediaBrowserCompat(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setThumbTintMode
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, ActivationRequest activationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, activationRequest)));
        final Function1 function1 = new Function1() { // from class: getCurrentContentInsetStart
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ActivationItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getOuterActionMenuPresenter
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getTitleMarginEnd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getTitleMarginBottom
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, UpdateActivationRequest updateActivationRequest) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(updateActivationRequest.copy((1023 & 1) != 0 ? updateActivationRequest.identityNumber : null, (1023 & 2) != 0 ? updateActivationRequest.kpj : null, (1023 & 4) != 0 ? updateActivationRequest.name : null, (1023 & 8) != 0 ? updateActivationRequest.dateOfBirth : null, (1023 & 16) != 0 ? updateActivationRequest.email : null, (1023 & 32) != 0 ? updateActivationRequest.handphone : null, (1023 & 64) != 0 ? updateActivationRequest.password : null, (1023 & 128) != 0 ? updateActivationRequest.checkSum : null, (1023 & 256) != 0 ? updateActivationRequest.identityType : null, (1023 & 512) != 0 ? updateActivationRequest.segmenCode : null, (1023 & 1024) != 0 ? updateActivationRequest.registerId : str))));
        final Function1 function1 = new Function1() { // from class: setCollapseIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onPopulateAccessibilityEvent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setSwitchTextAppearance
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.cancelAll(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setTextOff
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, VerifyCountBiometricRequest verifyCountBiometricRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(verifyCountBiometricRequest, "");
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = this.getExtras;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, verifyCountBiometricRequest)));
        final Function1 function1 = new Function1() { // from class: getViewListMeasuredWidth
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 841257430;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VerifyBiometricResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getVerticalMargins
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getCurrentMenuItems
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isChildOrHidden
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(GenerateKeyRequest generateKeyRequest) {
        Intrinsics.checkNotNullParameter(generateKeyRequest, "");
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData = this.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.b(generateKeyRequest)));
        final Function1 function1 = new Function1() { // from class: getContentInsetLeft
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (KeyResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getCurrentContentInsetEnd
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getContentInsetStart
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.INotificationSideChannelStub(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getCurrentContentInsetLeft
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, final NewActivationRequest newActivationRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(newActivationRequest, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: TintResources
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    setSplitTrack.b(objectRef, this, str, newActivationRequest, task);
                }
            }));
        } else {
            TuitionPaymentFragmentbindingInflater1(str, (String) objectRef.element, newActivationRequest);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String str, final NewRegisterRequest newRegisterRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(newRegisterRequest, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: ensureContentInsets
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objectRef, this, str, newRegisterRequest, task);
                }
            }));
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, (String) objectRef.element, newRegisterRequest);
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1(String str, String str2, NewActivationRequest newActivationRequest) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.notify;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, NewActivationRequest.copy$default(newActivationRequest, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194175, null))));
        final Function1 function1 = new Function1() { // from class: getFont
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getIndex
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getPositionDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getNonResourceString
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, NewRegisterRequest newRegisterRequest) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.cancelAll;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, newRegisterRequest.copy((8387583 & 1) != 0 ? newRegisterRequest.deviceId : null, (8387583 & 2) != 0 ? newRegisterRequest.email : null, (8387583 & 4) != 0 ? newRegisterRequest.kewarganegaraan : null, (8387583 & 8) != 0 ? newRegisterRequest.kodeSegmen : null, (8387583 & 16) != 0 ? newRegisterRequest.kpj : null, (8387583 & 32) != 0 ? newRegisterRequest.namaTk : null, (8387583 & 64) != 0 ? newRegisterRequest.nik : null, (8387583 & 128) != 0 ? newRegisterRequest.noHp : null, (8387583 & 256) != 0 ? newRegisterRequest.passpor : null, (8387583 & 512) != 0 ? newRegisterRequest.password : null, (8387583 & 1024) != 0 ? newRegisterRequest.registerId : str2, (8387583 & 2048) != 0 ? newRegisterRequest.tglLahir : null, (8387583 & 4096) != 0 ? newRegisterRequest.checkSum : null, (8387583 & 8192) != 0 ? newRegisterRequest.biometricStatus : null, (8387583 & 16384) != 0 ? newRegisterRequest.file : null, (8387583 & 32768) != 0 ? newRegisterRequest.file2 : null, (8387583 & 65536) != 0 ? newRegisterRequest.file3 : null, (8387583 & 131072) != 0 ? newRegisterRequest.fileKtp : null, (8387583 & 262144) != 0 ? newRegisterRequest.latitude : null, (8387583 & 524288) != 0 ? newRegisterRequest.longitude : null, (8387583 & 1048576) != 0 ? newRegisterRequest.locality : null, (8387583 & 2097152) != 0 ? newRegisterRequest.deviceBrand : null, (8387583 & 4194304) != 0 ? newRegisterRequest.deviceModel : null))));
        final Function1 function1 = new Function1() { // from class: getChildTop
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getChildVerticalGravity
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ensureNavButtonView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getHorizontalMargins
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OcrKtpRequest ocrKtpRequest) {
        Intrinsics.checkNotNullParameter(ocrKtpRequest, "");
        MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> mutableLiveData = this.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat.b(ocrKtpRequest)));
        final Function1 function1 = new Function1() { // from class: getCollapseContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (OcrKtpResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getContentInsetEndWithActions
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getCollapseIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSplitTrack.IconCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getContentInsetRight
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getNotifyChildrenChangedOptions.setValue(str2);
        this.b.setValue(str);
        this.getItem.setValue(Boolean.valueOf(Intrinsics.areEqual(str2, str)));
    }

    private static boolean b(Map<ValidationType, Boolean> map) {
        Collection<Boolean> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private final boolean b() {
        String value = this.getNotifyChildrenChangedOptions.getValue();
        if (value == null) {
            value = "";
        }
        String value2 = this.b.getValue();
        return Intrinsics.areEqual(value, value2 != null ? value2 : "");
    }

    public static Map<ValidationType, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        Pair[] pairArr = new Pair[4];
        ValidationType validationType = ValidationType.LENGTH;
        int length = str.length();
        boolean z4 = true;
        pairArr[0] = TuplesKt.to(validationType, Boolean.valueOf(8 <= length && length < 21));
        ValidationType validationType2 = ValidationType.UPPER_LOWER_CASE;
        String str2 = str;
        int i = 0;
        while (true) {
            if (i >= str2.length()) {
                z = false;
                break;
            }
            if (Character.isUpperCase(str2.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str2.length()) {
                z2 = false;
                break;
            }
            if (Character.isLowerCase(str2.charAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        pairArr[1] = TuplesKt.to(validationType2, Boolean.valueOf(z && z2));
        ValidationType validationType3 = ValidationType.DIGIT;
        int i3 = 0;
        while (true) {
            if (i3 >= str2.length()) {
                z3 = false;
                break;
            }
            if (Character.isDigit(str2.charAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        pairArr[2] = TuplesKt.to(validationType3, Boolean.valueOf(z3));
        ValidationType validationType4 = ValidationType.SPECIAL_CHAR;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            if (StringsKt.contains$default((CharSequence) "!@#$%^&*()_-+=<>?/{}~|", str2.charAt(i4), false, 2, (Object) null)) {
                pairArr[3] = TuplesKt.to(validationType4, Boolean.valueOf(z4));
                return MapsKt.mapOf(pairArr);
            }
        }
        z4 = false;
        pairArr[3] = TuplesKt.to(validationType4, Boolean.valueOf(z4));
        return MapsKt.mapOf(pairArr);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.asInterface.isDisposed()) {
            return;
        }
        this.asInterface.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSplitTrack setsplittrack, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = setsplittrack.notify;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.INotificationSideChannelStubProxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, Map map) {
        MediatorLiveData<Boolean> mediatorLiveData = setsplittrack.sendCustomAction;
        Intrinsics.checkNotNull(map);
        mediatorLiveData.setValue(Boolean.valueOf(b((Map<ValidationType, Boolean>) map) && setsplittrack.b()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSplitTrack setsplittrack, VerifyBiometricResponse verifyBiometricResponse) {
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.disconnect;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.ObjectRef objectRef, setSplitTrack setsplittrack, String str, NewRegisterRequest newRegisterRequest, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, (String) objectRef.element, newRegisterRequest);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.getExtras);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.disconnect);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.g;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.f1390a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.disconnect);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, MembershipCheckNew membershipCheckNew) {
        MutableLiveData<VirtualCameraAdapter1<MembershipCheckNew>> mutableLiveData = setsplittrack.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(membershipCheckNew));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack) {
        MediatorLiveData<Boolean> mediatorLiveData = setsplittrack.sendCustomAction;
        Map<ValidationType, Boolean> value = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (value == null) {
            value = MapsKt.emptyMap();
        }
        mediatorLiveData.setValue(Boolean.valueOf(b(value) && setsplittrack.b()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, MembershipCheckItem membershipCheckItem) {
        MutableLiveData<VirtualCameraAdapter1<MembershipCheckItem>> mutableLiveData = setsplittrack.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(membershipCheckItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.getRoot);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, KeyResponse keyResponse) {
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData = setsplittrack.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(keyResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSplitTrack setsplittrack, VerifyBiometricResponse verifyBiometricResponse) {
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.disconnect;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.write);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, Boolean bool) {
        MediatorLiveData<Boolean> mediatorLiveData = setsplittrack.sendCustomAction;
        Map<ValidationType, Boolean> value = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (value == null) {
            value = MapsKt.emptyMap();
        }
        mediatorLiveData.setValue(Boolean.valueOf(b(value) && bool.booleanValue()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Ref.ObjectRef objectRef, setSplitTrack setsplittrack, RegisterRequest registerRequest, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) objectRef.element, registerRequest);
    }

    public static /* synthetic */ Unit g(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack) {
        MediatorLiveData<Boolean> mediatorLiveData = setsplittrack.sendCustomAction;
        Map<ValidationType, Boolean> value = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (value == null) {
            value = MapsKt.emptyMap();
        }
        mediatorLiveData.setValue(Boolean.valueOf(b(value) && setsplittrack.b()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.f1390a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getExtras(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.INotificationSideChannelDefault);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.IconCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit connect(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSplitTrack setsplittrack, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = setsplittrack.write;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.IconCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.IconCompatParcelizer;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit read(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.IconCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getItem(setSplitTrack setsplittrack, Throwable th) {
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "ini errornya: ".concat(String.valueOf(th.getMessage())), 0).show();
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit RemoteActionCompatParcelizer(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, ActivationItem activationItem) {
        MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(activationItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, ActivationItem activationItem) {
        MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(activationItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.g;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit MediaBrowserCompat(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelDefault(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit write(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, VerifyBiometricResponse verifyBiometricResponse) {
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.getExtras;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Ref.ObjectRef objectRef, setSplitTrack setsplittrack, UpdateActivationRequest updateActivationRequest, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1((String) objectRef.element, updateActivationRequest);
    }

    public static /* synthetic */ Unit INotificationSideChannelStub(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, VerifyBiometricResponse verifyBiometricResponse) {
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.getRoot;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.read);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSplitTrack setsplittrack, VerifyBiometricResponse verifyBiometricResponse) {
        MutableLiveData<VirtualCameraAdapter1<VerifyBiometricResponse>> mutableLiveData = setsplittrack.read;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verifyBiometricResponse));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void b(Ref.ObjectRef objectRef, setSplitTrack setsplittrack, String str, NewActivationRequest newActivationRequest, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        setsplittrack.TuitionPaymentFragmentbindingInflater1(str, (String) objectRef.element, newActivationRequest);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, OcrKtpResponse ocrKtpResponse) {
        MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> mutableLiveData = setsplittrack.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(ocrKtpResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSplitTrack setsplittrack, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = setsplittrack.cancelAll;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IconCompatParcelizer(setSplitTrack setsplittrack, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setsplittrack.INotificationSideChannelStubProxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSplitTrack setsplittrack, OcrKtpResponse ocrKtpResponse) {
        MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> mutableLiveData = setsplittrack.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(ocrKtpResponse));
        return Unit.INSTANCE;
    }
}
