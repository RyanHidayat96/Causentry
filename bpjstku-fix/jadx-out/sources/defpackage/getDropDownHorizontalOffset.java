package defpackage;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDropDownHorizontalOffset implements Function1 {
    private /* synthetic */ DeviceUnlinkingLivenessActivity b;
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 76;
    private static final byte[] $$a = {51, -99, -8, -59, -16, 15, 0, 11};
    private static final int $$b = 39;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722431;

    public /* synthetic */ getDropDownHorizontalOffset(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        this.b = deviceUnlinkingLivenessActivity;
    }

    private static void a(byte b, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 98 - (i * 2);
        int i3 = b * 2;
        int i4 = 3 - (b2 * 2);
        byte[] bArr2 = new byte[5 - i3];
        int i5 = 4 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i4 + (-i2) + 3;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i4 + 1;
            i2 = i2 + (-bArr[i7]) + 3;
            i4 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            byte[] r0 = defpackage.getDropDownHorizontalOffset.$$d
            int r8 = r8 * 52
            int r8 = 53 - r8
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDropDownHorizontalOffset.c(short, byte, int, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = this.b;
        UserLocationComplete userLocationComplete = (UserLocationComplete) obj;
        if (i3 == 0) {
            return DeviceUnlinkingLivenessActivity.b(deviceUnlinkingLivenessActivity, userLocationComplete);
        }
        DeviceUnlinkingLivenessActivity.b(deviceUnlinkingLivenessActivity, userLocationComplete);
        throw null;
    }

    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 97;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 3290 - TextUtils.lastIndexOf("", '0'), 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 651 - TextUtils.indexOf("", ""), 43 - ImageFormat.getBitsPerPixel(0), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 39;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651, 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0b39 A[PHI: r0 r1
  0x0b39: PHI (r0v26 int) = (r0v25 int), (r0v41 int) binds: [B:112:0x0b37, B:109:0x0b2d] A[DONT_GENERATE, DONT_INLINE]
  0x0b39: PHI (r1v26 int) = (r1v25 int), (r1v35 int) binds: [B:112:0x0b37, B:109:0x0b2d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0b3b A[PHI: r0 r1
  0x0b3b: PHI (r0v38 int) = (r0v25 int), (r0v41 int) binds: [B:112:0x0b37, B:109:0x0b2d] A[DONT_GENERATE, DONT_INLINE]
  0x0b3b: PHI (r1v34 int) = (r1v25 int), (r1v35 int) binds: [B:112:0x0b37, B:109:0x0b2d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:137:0x0938 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0823 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x093d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x093d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0743 A[PHI: r0
  0x0743: PHI (r0v130 java.lang.Object[]) = (r0v129 java.lang.Object[]), (r0v180 java.lang.Object[]) binds: [B:59:0x0741, B:54:0x0724] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0750  */
    /* JADX WARN: Code duplicated, block: B:64:0x079d  */
    /* JADX WARN: Code duplicated, block: B:66:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x082c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0872  */
    /* JADX WARN: Code duplicated, block: B:79:0x08c6 A[Catch: all -> 0x0b9c, TryCatch #1 {all -> 0x0b9c, blocks: (B:77:0x08af, B:79:0x08c6, B:80:0x0915, B:98:0x09a3, B:100:0x09b1, B:101:0x09fd, B:103:0x0a1b, B:105:0x0a69), top: B:134:0x08af }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0933  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        int i6;
        int i7;
        int i8;
        Class<?> cls;
        int iResolveSize;
        int iAxisFromString;
        char[] cArr;
        int i9;
        boolean z;
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i20;
        int i21 = 2;
        int i22 = 2 % 2;
        int i23 = 1;
        byte b = $$a[6];
        byte b2 = b;
        Object[] objArr2 = new Object[1];
        a(b, b2, b2, objArr2);
        int i24 = 0;
        String str2 = (String) objArr2[0];
        int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
        int i26 = i25 % 2;
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod(str2, new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
            int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$d;
            byte b3 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b3, (byte) (-bArr[2]), b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, offsetAfter, windowTouchSlop, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2823, 22 - TextUtils.indexOf("", ""))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i27 = 0;
            while (i27 < length) {
                Method method = declaredMethods[i27];
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                if (i28 % i21 == 0) {
                    int i29 = 3 % i21;
                }
                try {
                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i30 = 71017 - (~(modifierMetaStateMask * 530));
                    int i31 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i32 = ~((i31 ^ modifierMetaStateMask) | (i31 & modifierMetaStateMask));
                    int i33 = ~((modifierMetaStateMask ^ 132) | (modifierMetaStateMask & 132));
                    int i34 = ((i33 & i32) | (i32 ^ i33)) * 529;
                    int i35 = (i30 & i34) + (i34 | i30);
                    int i36 = ~((modifierMetaStateMask ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (modifierMetaStateMask & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i37 = -(-(((i36 & (-133)) | ((-133) ^ i36)) * 529));
                    int i38 = (i35 ^ i37) + ((i37 & i35) << i23);
                    int i39 = -TextUtils.indexOf("", "", i24);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i40 = ~i39;
                    int i41 = (((i39 * 592) - 14160) - (~((~((i40 ^ 24) | (i40 & 24))) * (-1182)))) - i23;
                    int i42 = (i40 & (-25)) | (i40 ^ (-25));
                    int i43 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i44 = ~((i42 ^ i43) | (i42 & i43));
                    int i45 = ~((i39 ^ 24) | (i39 & 24));
                    int i46 = ~i39;
                    int i47 = (i46 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ i46);
                    int i48 = ((i41 + (((i44 ^ i45) | (i44 & i45)) * (-591))) - (~(-(-(((i47 & (-25)) | (i47 ^ (-25))) * 591))))) - 1;
                    int i49 = -TextUtils.indexOf("", "", i24);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i50 = ~i49;
                    int i51 = ~(i50 | 18);
                    int i52 = (-19) | i49;
                    int i53 = (i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i55 = (i54 ^ 53) + ((i54 & 53) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55 % 128;
                    int i56 = i55 % i21;
                    int i57 = (((i49 * 450) - 8064) - (~(-(-(449 * ((~i53) | i51)))))) - i23;
                    int i58 = -(-((~((i50 ^ 18) | (i50 & 18))) * (-1347)));
                    int i59 = (i57 ^ i58) + ((i58 & i57) << i23);
                    int i60 = ~i49;
                    int i61 = ~((i60 & 18) | (i60 ^ 18));
                    int i62 = (-19) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i63 = i59 + ((i61 | (~((i49 & i62) | (i62 ^ i49)))) * 449);
                    Object[] objArr4 = new Object[i23];
                    d(true, i38, i48, i63, new char[]{65486, 20, 3, 5, '\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 139;
                    int i64 = -TextUtils.indexOf("", "");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i65 = i64 * 51;
                    int i66 = (i65 & (-588)) + (i65 | (-588));
                    int i67 = -(-(((i64 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i64 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7)) * (-50)));
                    int i68 = ((i66 | i67) << i23) - (i67 ^ i66);
                    int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                    int i70 = i69 % i21;
                    int i71 = (~i64) | (-13);
                    int i72 = ~((i71 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i71 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                    int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i74 = ((-13) ^ i73) | ((-13) & i73);
                    int i75 = ~((i74 ^ i64) | (i74 & i64));
                    int i76 = (((i68 - (~(50 * ((i72 ^ i75) | (i75 & i72))))) - i23) - (~(-(-((((~(((-13) & i73) | ((-13) ^ i73))) | (~(((-13) ^ i64) | ((-13) & i64)))) | (~((i64 & i73) | (i73 ^ i64)))) * 50))))) - 1;
                    int i77 = -TextUtils.lastIndexOf("", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i78 = (i77 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i77 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                    int i79 = ~i78;
                    int i80 = (((i77 * (-1335)) - 4669) - (~(-(-((((-8) ^ i79) | (i79 & (-8))) * (-668)))))) - i23;
                    int i81 = ~(((-8) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-8)));
                    int i82 = i77 ^ i81;
                    Object[] objArr5 = new Object[i23];
                    d(false, pressedStateDuration, i76, ((i80 + (((i77 & i81) | i82) * 1336)) - (~((i78 | (-8)) * 668))) - 1, new char[]{7, 65532, 1, 65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509}, objArr5);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method, null)).intValue();
                    Object[] objArr6 = new Object[i23];
                    objArr6[0] = Integer.valueOf(iIntValue);
                    int i83 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i84 = ((i83 | 132) << i23) - (i83 ^ 132);
                    int i85 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i86 = ((i85 | 26) << i23) - (i85 ^ 26);
                    int i87 = -View.combineMeasuredStates(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i88 = i87 * 71;
                    int i89 = ((i88 | (-1380)) << i23) - (i88 ^ (-1380));
                    int i90 = ~i87;
                    int i91 = ~((i90 ^ 20) | (i90 & 20));
                    int i92 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 20) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 20));
                    int i93 = -(-(((i91 & i92) | (i91 ^ i92)) * (-140)));
                    int i94 = ((i89 | i93) << i23) - (i89 ^ i93);
                    int i95 = -(-((~((i87 ^ 20) | (i87 & 20) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * 70));
                    int i96 = (i94 ^ i95) + ((i95 & i94) << i23);
                    int i97 = ~(i90 | 20);
                    int i98 = ~(((-21) & i87) | ((-21) ^ i87));
                    int i99 = -(-(((~((i87 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i87 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9))) | (i97 & i98) | (i97 ^ i98)) * 70));
                    Object[] objArr7 = new Object[i23];
                    d(false, i84, i86, (i96 ^ i99) + ((i99 & i96) << i23), new char[]{0, '\r', 6, 65485, 17, 4, 5, 11, 4, 2, 19, 65485, 65516, 14, 3, '\b', 5, '\b', 4, 17, '\t', 0, 21, 0, 65485, 11}, objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i101 = ((i100 | 85) << i23) - (i100 ^ 85);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i101 % 128;
                    int i102 = i101 % i21;
                    int i103 = (-574) * iResolveOpacity;
                    int i104 = ((i103 | (-79786)) << i23) - (i103 ^ (-79786));
                    int i105 = ~iResolveOpacity;
                    int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                    int i107 = ~((i105 ^ i106) | (i105 & i106));
                    int i108 = ~(((-140) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-140) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                    int i109 = i104 + (((i107 ^ i108) | (i108 & i107)) * 1150);
                    int i110 = ~((-140) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                    int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                    int i112 = ~((i111 ^ 139) | (i111 & 139));
                    int i113 = -(-(((i110 & i112) | (i110 ^ i112)) * (-575)));
                    int i114 = (i109 ^ i113) + ((i113 & i109) << 1);
                    int i115 = ~((i105 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i105));
                    int i116 = ~((i106 ^ iResolveOpacity) | (iResolveOpacity & i106));
                    int i117 = i114 + (((i115 & i116) | (i115 ^ i116)) * 575);
                    int i118 = -ExpandableListView.getPackedPositionGroup(0L);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i120 = (i119 ^ 37) + ((i119 & 37) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i120 % 128;
                    int i121 = i120 % 2;
                    int i122 = (i118 * 567) - 4520;
                    int i123 = ~i118;
                    int i124 = -(-(((~((i123 ^ 8) | (i123 & 8))) | (~(i123 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) * (-566)));
                    int i125 = ((i122 | i124) << 1) - (i122 ^ i124);
                    int i126 = (~((i118 & (-9)) | ((-9) ^ i118))) * 566;
                    int i127 = (i125 & i126) + (i126 | i125);
                    int i128 = (i123 ^ (-9)) | (i123 & (-9));
                    int i129 = -(-((~((i128 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i128 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) * 566));
                    int i130 = (i127 ^ i129) + ((i129 & i127) << 1);
                    int i131 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    Object[] objArr8 = new Object[1];
                    d(false, i117, i130, (i131 ^ 7) + ((i131 & 7) << 1), new char[]{1, 11, 65510, 65529, '\f', 1, 14, 65533}, objArr8);
                    if (((Boolean) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                        int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i132 % 128;
                        int i133 = i132 % 2;
                        Class cls4 = Long.TYPE;
                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i134 = (fadingEdgeLength * (-721)) - 94451;
                        int i135 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                        int i136 = ~fadingEdgeLength;
                        int i137 = ~((i136 ^ (-132)) | (i136 & (-132)));
                        int i138 = (i135 & i137) | (i135 ^ i137);
                        int i139 = ~((fadingEdgeLength ^ 131) | (fadingEdgeLength & 131));
                        int i140 = ((i138 & i139) | (i138 ^ i139)) * 1444;
                        int i141 = (i134 & i140) + (i134 | i140);
                        int i142 = (~((fadingEdgeLength ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (fadingEdgeLength & iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) | i139;
                        int i143 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & 131) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ 131));
                        int i144 = -(-(((i143 & i142) | (i142 ^ i143)) * (-1444)));
                        int i145 = (i141 & i144) + (i144 | i141);
                        int i146 = ~((i136 ^ 131) | (i136 & 131));
                        int i147 = ~((fadingEdgeLength & (-132)) | ((-132) ^ fadingEdgeLength));
                        int i148 = (i145 - (~(((i147 & i146) | (i146 ^ i147)) * 722))) - 1;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i149 = (iResolveSizeAndState * 567) - 13560;
                        int i150 = ~iResolveSizeAndState;
                        int i151 = ~((i150 & 24) | (i150 ^ 24));
                        int i152 = ~iResolveSizeAndState;
                        int i153 = ~((i152 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i152 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                        int i154 = -(-(((i151 & i153) | (i151 ^ i153)) * (-566)));
                        int i155 = ((i149 | i154) << 1) - (i149 ^ i154);
                        int i156 = -(-((~((iResolveSizeAndState & (-25)) | ((-25) ^ iResolveSizeAndState))) * 566));
                        int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
                        int i158 = (i152 ^ (-25)) | ((-25) & i152);
                        Object[] objArr9 = new Object[1];
                        d(true, i148, (i157 - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i158) | (i158 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) * 566))) - 1, TextUtils.indexOf((CharSequence) "", '0') + 19, new char[]{65486, 20, 3, 5, '\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517}, objArr9);
                        Class<?> cls5 = Class.forName((String) objArr9[0]);
                        int i159 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 140;
                        int i160 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i161 = (i160 & 13) + (i160 | 13);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                        int i163 = (((packedPositionChild * 765) - 13743) - (~(((~((i162 ^ packedPositionChild) | (i162 & packedPositionChild))) | 9) * 764))) - 1;
                        int i164 = ~packedPositionChild;
                        int i165 = ~((i164 & 9) | (i164 ^ 9));
                        int i166 = ~((i162 & 9) | (i162 ^ 9));
                        int i167 = ((i166 & i165) | (i165 ^ i166)) * (-1528);
                        int i168 = (i163 & i167) + (i163 | i167);
                        int i169 = ~((~packedPositionChild) | 9);
                        int i170 = ~(((-10) & packedPositionChild) | ((-10) ^ packedPositionChild));
                        int i171 = i169 ^ i170;
                        Object[] objArr10 = new Object[1];
                        d(false, i159, i161, i168 + (((~(packedPositionChild | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault14))) | (i169 & i170) | i171) * 764), new char[]{'\n', 11, '\b', 4, 65514, 15, 6, 65531, 65533, 65531, '\n', 65512, 65531}, objArr10);
                        if (!(!cls4.equals(cls5.getMethod((String) objArr10[0], null).invoke(method, null)))) {
                            int iKeyCodeFromString = 131 - KeyEvent.keyCodeFromString("");
                            int i172 = -TextUtils.indexOf((CharSequence) "", '0');
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i173 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i174 = ((i173 | 107) << 1) - (i173 ^ 107);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i174 % 128;
                            int i175 = i174 % 2 == 0 ? ((860 << i172) >>> (-881)) >>> ((-859) >>> ((i172 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i172 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) : (((i172 * 860) - 19734) - (~(-(-(((i172 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i172 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15)) * (-859)))))) - 1;
                            int i176 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                            int i177 = ~((i176 & i172) | (i176 ^ i172));
                            int i178 = i173 + 77;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i178 % 128;
                            if (i178 % 2 == 0) {
                                int i179 = ~i172;
                                int i180 = (i179 & (-24)) | (i179 ^ (-24));
                                i6 = i175 << (858 - (~(-(-((~((i180 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) | i177)))));
                                int i181 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                i7 = (i181 & (-24)) | ((-24) ^ i181);
                            } else {
                                int i182 = ~i172;
                                int i183 = (i182 & (-24)) | (i182 ^ (-24));
                                int i184 = ~((i183 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i183 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                int i185 = 859 * ((i184 & i177) | (i177 ^ i184));
                                i6 = ((i175 | i185) << 1) - (i175 ^ i185);
                                int i186 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                i7 = (i186 & (-24)) | ((-24) ^ i186);
                            }
                            int i187 = ~i7;
                            int i188 = ~((i172 & (-24)) | ((-24) ^ i172));
                            int i189 = -(-(859 * ((i188 & i187) | (i187 ^ i188))));
                            int i190 = (i6 & i189) + (i189 | i6);
                            int iIndexOf = TextUtils.indexOf("", "");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i191 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i191 % 128;
                            if (i191 % 2 == 0) {
                                int i192 = ~iIndexOf;
                                int i193 = (i192 & (-19)) | (i192 ^ (-19));
                                int i194 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                i8 = (((491 % iIndexOf) >> (-128188416)) - (~(-((-490) / ((i193 & i194) | (i193 ^ i194)))))) - 1;
                            } else {
                                int i195 = iIndexOf * 491;
                                int i196 = (i195 ^ (-8802)) + ((i195 & (-8802)) << 1);
                                int i197 = ~iIndexOf;
                                int i198 = (i197 & (-19)) | (i197 ^ (-19));
                                int i199 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                int i200 = ((i198 & i199) | (i198 ^ i199)) * (-490);
                                i8 = ((i200 & i196) << 1) + (i196 ^ i200);
                            }
                            int i201 = ~(((-19) ^ iIndexOf) | ((-19) & iIndexOf));
                            int i202 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault16 | (-19));
                            int i203 = -(-(490 * ((i202 & i201) | (i201 ^ i202))));
                            Object[] objArr11 = new Object[1];
                            d(true, iKeyCodeFromString, i190, (((i8 | i203) << 1) - (i203 ^ i8)) + ((~iIndexOf) * 490), new char[]{65486, 20, 3, 5, '\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517}, objArr11);
                            String str3 = (String) objArr11[0];
                            int i204 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i205 = (i204 & 97) + (i204 | 97);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i205 % 128;
                            if (i205 % 2 != 0) {
                                cls = Class.forName(str3);
                                iResolveSize = 7669 >> View.resolveSize(1, 1);
                                iAxisFromString = 10 << MotionEvent.axisFromString("");
                                cArr = new char[]{65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535};
                                i9 = 81 / (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1));
                                z = true;
                            } else {
                                cls = Class.forName(str3);
                                int iResolveSize2 = 139 - View.resolveSize(0, 0);
                                int iAxisFromString2 = MotionEvent.axisFromString("") + 18;
                                int i206 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                iResolveSize = iResolveSize2;
                                iAxisFromString = iAxisFromString2;
                                cArr = new char[]{65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535};
                                i9 = (i206 & 15) + (i206 | 15);
                                z = false;
                            }
                            int i207 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i208 = (i207 ^ 95) + ((i207 & 95) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i208 % 128;
                            if (i208 % 2 != 0) {
                                Object[] objArr12 = new Object[1];
                                d(z, iResolveSize, iAxisFromString, i9, cArr, objArr12);
                                objArr = (Object[]) cls.getMethod((String) objArr12[0], null).invoke(method, null);
                                if (objArr.length != 5) {
                                    continue;
                                } else if (!(!Long.TYPE.equals(objArr[0]))) {
                                    int i209 = -Color.blue(0);
                                    i10 = (i209 ^ 131) + ((i209 & 131) << 1);
                                    int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                    int i210 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i211 = (i210 ^ 115) + ((i210 & 115) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i211 % 128;
                                    int i212 = i211 % 2;
                                    i11 = (24 & scrollBarSize) + (scrollBarSize | 24);
                                    i12 = -ExpandableListView.getPackedPositionType(0L);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i213 = i12 * 659;
                                    i13 = (i213 ^ (-11826)) + ((i213 & (-11826)) << 1);
                                    i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i15 = (i14 & 19) + (i14 | 19);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i214 = ~i12;
                                    int i215 = ~((i214 & 18) | (i214 ^ 18));
                                    int i216 = ~(((-19) ^ i12) | ((-19) & i12));
                                    int i217 = (i215 & i216) | (i215 ^ i216);
                                    int i218 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i12) | (i12 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    int i219 = ~i218;
                                    int i220 = (-658) * ((i217 & i219) | (i217 ^ i219));
                                    i16 = ((i13 | i220) << 1) - (i13 ^ i220);
                                    i17 = (i14 & 37) + (i14 | 37);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        i19 = (i12 & (-19)) | ((-19) ^ i12);
                                        i18 = i16 >>> (658 << (~i19));
                                    } else {
                                        i18 = i16 + ((~(((-19) & i12) | ((-19) ^ i12))) * 658);
                                        i19 = (i12 & (-19)) | ((-19) ^ i12);
                                    }
                                    int i221 = ~i19;
                                    int i222 = ~i218;
                                    Object[] objArr13 = new Object[1];
                                    d(true, i10, i11, (i18 - (~(-(-(658 * ((i221 & i222) | (i221 ^ i222))))))) - 1, new char[]{65486, 20, 3, 5, '\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517}, objArr13);
                                    str = (String) objArr13[0];
                                    int i223 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i224 = (i223 & 91) + (i223 | 91);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i224 % 128;
                                    int i225 = i224 % 2;
                                    if (Class.forName(str).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int mode = View.MeasureSpec.getMode(0) + 2823;
                                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                            byte[] bArr2 = $$d;
                                            byte b4 = bArr2[7];
                                            Object[] objArr14 = new Object[1];
                                            c(b4, (byte) (-bArr2[2]), b4, objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, mode, longPressTimeout, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int iRgb = Color.rgb(0, 0, 0) + 16780039;
                                            int defaultSize = View.getDefaultSize(0, 0) + 22;
                                            byte[] bArr3 = $$d;
                                            byte b5 = bArr3[7];
                                            Object[] objArr15 = new Object[1];
                                            c(b5, (byte) (-bArr3[2]), b5, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, iRgb, defaultSize, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        try {
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                int maximumFlingVelocity = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int i226 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                                byte[] bArr4 = $$d;
                                                Object[] objArr17 = new Object[1];
                                                c(bArr4[54], bArr4[7], (byte) (-bArr4[2]), objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, maximumFlingVelocity, i226, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                            int i227 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            i20 = ((i227 | 91) << 1) - (i227 ^ 91);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                break;
                                            }
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                Object[] objArr18 = new Object[1];
                                d(z, iResolveSize, iAxisFromString, i9, cArr, objArr18);
                                objArr = (Object[]) cls.getMethod((String) objArr18[0], null).invoke(method, null);
                                if (objArr.length != 2) {
                                    continue;
                                } else if (!(!Long.TYPE.equals(objArr[0]))) {
                                    int i2010 = -Color.blue(0);
                                    i10 = (i2010 ^ 131) + ((i2010 & 131) << 1);
                                    int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                                    int i2110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i2111 = (i2110 ^ 115) + ((i2110 & 115) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2111 % 128;
                                    int i2112 = i2111 % 2;
                                    i11 = (24 & scrollBarSize2) + (scrollBarSize2 | 24);
                                    i12 = -ExpandableListView.getPackedPositionType(0L);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i2113 = i12 * 659;
                                    i13 = (i2113 ^ (-11826)) + ((i2113 & (-11826)) << 1);
                                    i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i15 = (i14 & 19) + (i14 | 19);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    int i2114 = ~i12;
                                    int i2115 = ~((i2114 & 18) | (i2114 ^ 18));
                                    int i2116 = ~(((-19) ^ i12) | ((-19) & i12));
                                    int i2117 = (i2115 & i2116) | (i2115 ^ i2116);
                                    int i2118 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i12) | (i12 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    int i2119 = ~i2118;
                                    int i228 = (-658) * ((i2117 & i2119) | (i2117 ^ i2119));
                                    i16 = ((i13 | i228) << 1) - (i13 ^ i228);
                                    i17 = (i14 & 37) + (i14 | 37);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        i19 = (i12 & (-19)) | ((-19) ^ i12);
                                        i18 = i16 >>> (658 << (~i19));
                                    } else {
                                        i18 = i16 + ((~(((-19) & i12) | ((-19) ^ i12))) * 658);
                                        i19 = (i12 & (-19)) | ((-19) ^ i12);
                                    }
                                    int i229 = ~i19;
                                    int i2210 = ~i2118;
                                    Object[] objArr19 = new Object[1];
                                    d(true, i10, i11, (i18 - (~(-(-(658 * ((i229 & i2210) | (i229 ^ i2210))))))) - 1, new char[]{65486, 20, 3, 5, '\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517}, objArr19);
                                    str = (String) objArr19[0];
                                    int i2211 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i2212 = (i2211 & 91) + (i2211 | 91);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2212 % 128;
                                    int i2213 = i2212 % 2;
                                    if (Class.forName(str).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int mode2 = View.MeasureSpec.getMode(0) + 2823;
                                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                            byte[] bArr5 = $$d;
                                            byte b6 = bArr5[7];
                                            Object[] objArr110 = new Object[1];
                                            c(b6, (byte) (-bArr5[2]), b6, objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay2, mode2, longPressTimeout2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int iRgb2 = Color.rgb(0, 0, 0) + 16780039;
                                            int defaultSize2 = View.getDefaultSize(0, 0) + 22;
                                            byte[] bArr6 = $$d;
                                            byte b7 = bArr6[7];
                                            Object[] objArr111 = new Object[1];
                                            c(b7, (byte) (-bArr6[2]), b7, objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity2, iRgb2, defaultSize2, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                            int maximumFlingVelocity2 = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i2214 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                            byte[] bArr7 = $$d;
                                            Object[] objArr113 = new Object[1];
                                            c(bArr7[54], bArr7[7], (byte) (-bArr7[2]), objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, maximumFlingVelocity2, i2214, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        int i2215 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        i20 = ((i2215 | 91) << 1) - (i2215 ^ 91);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            break;
                                        }
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i27++;
                    int i230 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i230 % 128;
                    int i231 = i230 % 2;
                    i21 = 2;
                    i23 = 1;
                    i24 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
            byte[] bArr8 = $$d;
            byte b8 = bArr8[7];
            Object[] objArr20 = new Object[1];
            c(b8, (byte) (-bArr8[2]), b8, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, windowTouchSlop2, bitsPerPixel, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int i232 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
            int bitsPerPixel2 = 21 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr9 = $$d;
            Object[] objArr22 = new Object[1];
            c((byte) (bArr9[3] - 1), bArr9[7], (byte) (-bArr9[2]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i232, bitsPerPixel2, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 37657);
            int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2720;
            int packedPositionGroup = 19 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr10 = $$d;
            Object[] objArr24 = new Object[1];
            c((byte) (bArr10[3] - 1), bArr10[7], (byte) (-bArr10[2]), objArr24);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, scrollDefaultDelay3, packedPositionGroup, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -594092457;
        long j2 = -1;
        long j3 = j ^ j2;
        long j4 = 191;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j5 = (((long) (-381)) * j) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue) + (((long) (-191)) * j3) + ((j | ((jLongValue | jElapsedRealtime) ^ j2)) * j4) + (j4 * (((jLongValue | (jElapsedRealtime ^ j2)) ^ j2) | ((j3 | jLongValue) ^ j2))) + ((long) (-1216313388));
        int i233 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i234 = ((i233 | 107) << 1) - (i233 ^ 107);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i234 % 128;
        int i235 = i234 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i236 = ((int) (j5 >> 32)) & ((-324262908) + ((~((-553714691) | elapsedCpuTime)) * 623) + (((~elapsedCpuTime) | (-2137776056)) * (-623)) + (((~(elapsedCpuTime | (-627132168))) | (~((-2064358579) | elapsedCpuTime)) | 553714690) * 623));
        int iMyUid = Process.myUid();
        int i237 = ~iMyUid;
        int i238 = (~((-1876568288) | i237)) | 1166026889;
        int i239 = ~(iMyUid | (-270631201));
        int i240 = 1324740038 + ((i238 | i239) * (-713)) + (i239 * 1426) + ((~((-981172599) | i237)) * 713);
        int i241 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i242 = ((i241 | 9) << 1) - (i241 ^ 9);
        int i243 = i242 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i243;
        int i244 = ((int) j5) & i240;
        if (i242 % 2 != 0) {
            int i245 = (i236 & i244) | (i236 ^ i244);
            i2 = i245 - 14;
            i3 = i245 & ViewCompat.MEASURED_SIZE_MASK;
            if (i2 != 0) {
                i4 = 1;
            } else {
                i4 = i;
            }
        } else {
            int i246 = i236 | i244;
            i2 = i246 >>> 24;
            i3 = i246 & ViewCompat.MEASURED_SIZE_MASK;
            if (i2 != 0) {
                i4 = 1;
            } else {
                i4 = i;
            }
        }
        if (i4 != 0) {
            int i247 = (i243 ^ 33) + ((i243 & 33) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i247 % 128;
            int i248 = i247 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        if (i4 != 0) {
            int i249 = (i243 & 15) + (i243 | 15);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i249 % 128;
            int i250 = i249 % 2;
            if (i3 < 1) {
                int i251 = (i243 & 91) + (i243 | 91);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i251 % 128;
                int i252 = i251 % 2;
                Method method2 = methodArr[i3];
                if (method2 != null) {
                    string = method2.toString();
                    int i253 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i254 = (i253 ^ 57) + ((i253 & 57) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i254 % 128;
                    int i255 = i254 % 2;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int i256 = ((i2 ^ 6) + ((i2 & 6) << 1)) * i5;
        int i257 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i258 = (i257 & 47) + (i257 | 47);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i258 % 128;
        int i259 = i258 % 2;
        return i256;
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
    private static java.lang.String $$g(int r7, short r8, int r9) {
        /*
            byte[] r0 = defpackage.getDropDownHorizontalOffset.$$c
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 + 119
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDropDownHorizontalOffset.$$g(int, short, int):java.lang.String");
    }
}
