package defpackage;

import android.graphics.Color;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.databinding.ActivityRegistrationVerifyPhoneOtpBinding;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyPhoneOtpActivity;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BrowserActionItem implements notifyStateAttached {
    private /* synthetic */ NewRegistrationVerifyPhoneOtpActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ ActivityRegistrationVerifyPhoneOtpBinding b;
    private static final byte[] $$c = {65, -122, -65, 2};
    private static final int $$f = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 253;
    private static final byte[] $$a = {88, 99, -94, -58, 14, -16, 6, 0, -22, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12};
    private static final int $$b = 117;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f90a = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
    private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 59280;

    public /* synthetic */ BrowserActionItem(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, NewRegistrationVerifyPhoneOtpActivity newRegistrationVerifyPhoneOtpActivity) {
        this.b = activityRegistrationVerifyPhoneOtpBinding;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = newRegistrationVerifyPhoneOtpActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 12
            int r7 = 118 - r7
            int r8 = r8 * 5
            int r8 = 9 - r8
            int r9 = r9 * 28
            int r9 = 34 - r9
            byte[] r0 = defpackage.BrowserActionItem.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + 1
            int r8 = r8 + r7
            int r7 = r8 + (-3)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BrowserActionItem.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.BrowserActionItem.$$d
            int r7 = r7 * 52
            int r1 = r7 + 1
            int r5 = r5 + 4
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r6 = r5
            r3 = r7
            goto L29
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            int r6 = r6 + 1
            r3 = r0[r6]
        L29:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BrowserActionItem.e(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // defpackage.notifyStateAttached
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = f90a + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i4 = d + 99;
        f90a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void f(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 1;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 % 2;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 45;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') + 8280), 1235 - (ViewConfiguration.getScrollBarSize() >> 8), 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$g(b, b, $$c[3]), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2764 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, 1504416861, false, $$g(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.indexOf("", "", 0)), View.MeasureSpec.getSize(0) + 253, 22 - View.MeasureSpec.makeMeasureSpec(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char threadPriority = (char) (65200 - ((Process.getThreadPriority(0) + 20) >> 6));
                                int mirror = 2939 - AndroidCharacter.getMirror('0');
                                int mode = View.MeasureSpec.getMode(0) + 17;
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                String str$$g = $$g(b4, b5, (byte) (b5 + 1));
                                i2 = 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, mirror, mode, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i3 = i2;
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
    }

    /* JADX WARN: Code duplicated, block: B:112:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0652 A[Catch: all -> 0x0944, TryCatch #0 {all -> 0x0944, blocks: (B:76:0x063b, B:78:0x0652, B:79:0x0699, B:95:0x0728, B:97:0x0735, B:98:0x0775, B:100:0x0794, B:102:0x07e9), top: B:127:0x063b }] */
    public static int b(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        Integer num;
        Class<?> cls;
        char[] cArr;
        char[] cArr2;
        char mode;
        int gidForName;
        int i6;
        int i7;
        int i8;
        char c;
        char[] cArr3;
        char[] cArr4;
        int trimmedLength;
        char[] cArr5;
        char[] cArr6;
        char c2;
        int iMakeMeasureSpec;
        int i9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i10 = 2;
        int i11 = 2 % 2;
        int i12 = f90a;
        int i13 = 1;
        int i14 = ((i12 | 115) << 1) - (i12 ^ 115);
        d = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr = $$a;
        byte b = bArr[7];
        byte b2 = (byte) (-bArr[15]);
        Object[] objArr = new Object[1];
        c(b, b2, b2, objArr);
        int i16 = 0;
        String str = (String) objArr[0];
        int i17 = f90a;
        int i18 = ((i17 | 79) << 1) - (i17 ^ 79);
        d = i18 % 128;
        int i19 = i18 % 2;
        byte b3 = (byte) (-bArr[15]);
        byte b4 = bArr[7];
        Object[] objArr2 = new Object[1];
        c(b3, b4, b4, objArr2);
        Method method = OkHostnameVerifier.class.getMethod(str, String.class, Class.forName((String) objArr2[0]));
        int i20 = f90a;
        int i21 = (i20 ^ 105) + ((i20 & 105) << 1);
        d = i21 % 128;
        int i22 = i21 % 2;
        Method[] methodArr = {method};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(0, 0);
            int i23 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr2 = $$d;
            byte b5 = bArr2[5];
            Object[] objArr3 = new Object[1];
            e((byte) (-b5), bArr2[7], b5, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iCombineMeasuredStates, i23, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i24 = f90a + 15;
            d = i24 % 128;
            int i25 = i24 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 2823 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i26 = 0;
            while (true) {
                if (i26 < length) {
                    int i27 = f90a + 79;
                    int i28 = i27 % 128;
                    d = i28;
                    if (i27 % i10 != 0) {
                        Method method2 = declaredMethods[i26];
                        throw null;
                    }
                    Method method3 = declaredMethods[i26];
                    int i29 = ((i28 | 13) << i13) - (i28 ^ 13);
                    f90a = i29 % 128;
                    int i30 = i29 % i10;
                    try {
                        Object[] objArr4 = new Object[i13];
                        f(new char[]{0, 0, 0, 0}, new char[]{53254, 23161, 32994, 4055}, (char) View.MeasureSpec.getSize(i16), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{42085, 27569, 7897, 41119, 36467, 1198, 36338, 2504, 30228, 22392, 25596, 4623, 9445, 11523, 43358, 4660, 43839, 42523, 13020, 14459, 22388, 33215, 13546, 11161}, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[i16]);
                        char[] cArr7 = {0, 0, 0, 0};
                        char[] cArr8 = {14081, 59688, 65272, 34509};
                        int i31 = d;
                        int i32 = (i31 ^ 99) + ((i31 & 99) << i13);
                        f90a = i32 % 128;
                        if (i32 % i10 == 0) {
                            Object[] objArr5 = new Object[i13];
                            f(cArr7, cArr8, (char) (TypedValue.complexToFraction(i16, f, f) > 1.0f ? 1 : (TypedValue.complexToFraction(i16, f, f) == 1.0f ? 0 : -1)), KeyEvent.getMaxKeyCode() >> 65, new char[]{49029, 20263, 44165, 18724, 32016, 60178, 64892, 24394, 35941, 19647, 48339, 52171}, objArr5);
                            num = (Integer) cls2.getMethod((String) objArr5[i16], null).invoke(method3, null);
                        } else {
                            Object[] objArr6 = new Object[i13];
                            f(cArr7, cArr8, (char) (TypedValue.complexToFraction(i16, f, f) > f ? 1 : (TypedValue.complexToFraction(i16, f, f) == f ? 0 : -1)), KeyEvent.getMaxKeyCode() >> 16, new char[]{49029, 20263, 44165, 18724, 32016, 60178, 64892, 24394, 35941, 19647, 48339, 52171}, objArr6);
                            num = (Integer) cls2.getMethod((String) objArr6[i16], null).invoke(method3, null);
                        }
                        Object[] objArr7 = new Object[i13];
                        objArr7[i16] = Integer.valueOf(num.intValue());
                        char[] cArr9 = {0, 0, 0, 0};
                        char[] cArr10 = {42930, 25103, 18243, 49630};
                        char mirror = AndroidCharacter.getMirror('0');
                        char c3 = (char) ((mirror ^ 56855) + ((mirror & 56855) << i13));
                        int offsetAfter = TextUtils.getOffsetAfter("", i16);
                        int i33 = d;
                        int i34 = ((i33 | 1) << i13) - (i33 ^ i13);
                        f90a = i34 % 128;
                        if (i34 % 2 == 0) {
                            Object[] objArr8 = new Object[i13];
                            f(cArr9, cArr10, c3, offsetAfter, new char[]{35267, 34831, 38839, 56442, 24272, 25050, 63198, 11480, 9347, 6325, 2778, 20809, 58986, 59278, 42995, 28321, 47096, 64892, 16268, 51414, 64086, 16003, 3794, 19676, 40604, 34004}, objArr8);
                            cls = Class.forName((String) objArr8[i16]);
                            cArr = new char[]{0, 0, 0, 0};
                            cArr2 = new char[]{10058, 43434, 35422, 50405};
                            mode = (char) View.MeasureSpec.getMode(i13);
                            gidForName = Process.getGidForName("");
                        } else {
                            Object[] objArr9 = new Object[i13];
                            f(cArr9, cArr10, c3, offsetAfter, new char[]{35267, 34831, 38839, 56442, 24272, 25050, 63198, 11480, 9347, 6325, 2778, 20809, 58986, 59278, 42995, 28321, 47096, 64892, 16268, 51414, 64086, 16003, 3794, 19676, 40604, 34004}, objArr9);
                            cls = Class.forName((String) objArr9[i16]);
                            cArr = new char[]{0, 0, 0, 0};
                            cArr2 = new char[]{10058, 43434, 35422, 50405};
                            mode = (char) View.MeasureSpec.getMode(i16);
                            gidForName = Process.getGidForName("");
                        }
                        int i35 = -gidForName;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        char[] cArr11 = cArr2;
                        char c4 = mode;
                        char[] cArr12 = cArr;
                        int i36 = (i35 * 375) + 747;
                        int i37 = ~i35;
                        int i38 = ~((i37 ^ (-1)) | i37);
                        int i39 = f90a;
                        int i40 = ((i39 | 19) << 1) - (i39 ^ 19);
                        d = i40 % 128;
                        if (i40 % 2 != 0) {
                            int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i42 = ~((i41 ^ i35) | (i41 & i35));
                            i6 = i36 / ((-374) >> ((i38 ^ i42) | (i42 & i38)));
                            i7 = 748 << (~i35);
                        } else {
                            int i43 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i44 = ~((i43 ^ i35) | (i43 & i35));
                            int i45 = ((i38 ^ i44) | (i44 & i38)) * (-374);
                            int i46 = (i36 ^ i45) + ((i45 & i36) << i13);
                            int i47 = -(-((~i35) * 748));
                            i6 = i46 ^ i47;
                            i7 = (i47 & i46) << i13;
                        }
                        int i48 = i6 + i7;
                        int i49 = ~(~i35);
                        int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i51 = ~((i50 & i35) | (i50 ^ i35));
                        int i52 = i49 ^ i51;
                        Object[] objArr10 = new Object[i13];
                        f(cArr12, cArr11, c4, (i48 - (~(-(-(374 * ((i49 & i51) | i52)))))) - 1, new char[]{1505, 61726, 12474, 33010, 54224, 43720, 60965, 3140}, objArr10);
                        String str2 = (String) objArr10[i16];
                        Class<?>[] clsArr = new Class[i13];
                        int i53 = f90a;
                        int i54 = (i53 ^ 41) + ((i53 & 41) << i13);
                        d = i54 % 128;
                        if (i54 % 2 != 0) {
                            clsArr[0] = Integer.TYPE;
                            ((Boolean) cls.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue();
                            throw null;
                        }
                        clsArr[i16] = Integer.TYPE;
                        if (((((Boolean) cls.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue() ? 1 : 0) ^ i13) == 0) {
                            Class cls3 = Long.TYPE;
                            char[] cArr13 = {0, 0, 0, 0};
                            char[] cArr14 = {53254, 23161, 32994, 4055};
                            int i55 = -((byte) KeyEvent.getModifierMetaStateMask());
                            char c5 = (char) ((i55 ^ (-1)) + (i55 << i13));
                            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                            int i56 = f90a;
                            int i57 = ((i56 | 97) << i13) - (i56 ^ 97);
                            d = i57 % 128;
                            int i58 = i57 % 2;
                            int i59 = -(globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i60 = i59 * (-375);
                            int i61 = f90a;
                            int i62 = ((i61 | 99) << 1) - (i61 ^ 99);
                            int i63 = i62 % 128;
                            d = i63;
                            int i64 = i62 % 2;
                            int i65 = ((i60 | (-375)) << i13) - (i60 ^ (-375));
                            int i66 = ~i59;
                            int i67 = ~((i66 ^ (-2)) | (i66 & (-2)));
                            int i68 = i63 + 89;
                            f90a = i68 % 128;
                            int i69 = i68 % 2;
                            int i70 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | i67;
                            int i71 = ~(i59 | 1);
                            int i72 = 376 * ((i70 & i71) | (i70 ^ i71));
                            int i73 = (i65 & i72) + (i72 | i65);
                            int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i75 = ~((i74 & i59) | (i74 ^ i59));
                            int i76 = ((i71 & i75) | (i75 ^ i71)) * (-376);
                            int i77 = ((i73 | i76) << 1) - (i73 ^ i76);
                            int i78 = ~i59;
                            int i79 = ~((i78 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i78 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i80 = (i77 - (~(-(-(((i79 & 1) | (i79 ^ 1)) * 376))))) - 1;
                            Object[] objArr11 = new Object[1];
                            f(cArr13, cArr14, c5, i80, new char[]{42085, 27569, 7897, 41119, 36467, 1198, 36338, 2504, 30228, 22392, 25596, 4623, 9445, 11523, 43358, 4660, 43839, 42523, 13020, 14459, 22388, 33215, 13546, 11161}, objArr11);
                            Class<?> cls4 = Class.forName((String) objArr11[0]);
                            char[] cArr15 = {0, 0, 0, 0};
                            int i81 = d + 97;
                            f90a = i81 % 128;
                            if (i81 % 2 == 0) {
                                c = (char) (35616 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                cArr3 = new char[]{2174, 40336, 8314, 139};
                                cArr4 = new char[]{19332, 59914, 39714, 13997, 65155, 24051, 38618, 42529, 38646, 32724, 26702, 41587, 8872};
                                trimmedLength = 2057146376 % TextUtils.getTrimmedLength("");
                                i8 = 1;
                            } else {
                                char c6 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35616);
                                int i82 = -TextUtils.getTrimmedLength("");
                                i8 = 1;
                                c = c6;
                                cArr3 = new char[]{2174, 40336, 8314, 139};
                                cArr4 = new char[]{19332, 59914, 39714, 13997, 65155, 24051, 38618, 42529, 38646, 32724, 26702, 41587, 8872};
                                trimmedLength = ((i82 | 2057146376) << 1) - (i82 ^ 2057146376);
                            }
                            Object[] objArr12 = new Object[i8];
                            f(cArr15, cArr3, c, trimmedLength, cArr4, objArr12);
                            if (cls3.equals(cls4.getMethod((String) objArr12[0], null).invoke(method3, null))) {
                                int i83 = f90a;
                                int i84 = (i83 ^ 83) + ((i83 & 83) << 1);
                                d = i84 % 128;
                                int i85 = i84 % 2;
                                Object[] objArr13 = new Object[1];
                                f(new char[]{0, 0, 0, 0}, new char[]{53254, 23161, 32994, 4055}, (char) (Process.myPid() >> 22), TextUtils.indexOf("", "", 0, 0), new char[]{42085, 27569, 7897, 41119, 36467, 1198, 36338, 2504, 30228, 22392, 25596, 4623, 9445, 11523, 43358, 4660, 43839, 42523, 13020, 14459, 22388, 33215, 13546, 11161}, objArr13);
                                Class<?> cls5 = Class.forName((String) objArr13[0]);
                                int size = View.MeasureSpec.getSize(0);
                                int i86 = -Color.green(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i87 = i86 * 491;
                                int i88 = ((i87 | (-34073183)) << 1) - (i87 ^ (-34073183));
                                int i89 = ~i86;
                                int i90 = (1387670264 & i89) | (i89 ^ 1387670264);
                                int i91 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i92 = (i88 - (~(-(-(((i90 ^ i91) | (i90 & i91)) * (-490)))))) - 1;
                                int i93 = ((~((i86 & 1387670264) | (1387670264 ^ i86))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 1387670264) | (1387670264 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 490;
                                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                                int i95 = -(-(i89 * 490));
                                Object[] objArr14 = new Object[1];
                                f(new char[]{0, 0, 0, 0}, new char[]{1874, 18901, 9133, 16269}, (char) ((size & 36131) + (size | 36131)), ((i94 | i95) << 1) - (i95 ^ i94), new char[]{62165, 14905, 48631, 44002, 15890, 16508, 43481, 7797, 19778, 2575, 4534, 22048, 39677, 42944, 5504, Typography.tm, 40182}, objArr14);
                                Object[] objArr15 = (Object[]) cls5.getMethod((String) objArr14[0], null).invoke(method3, null);
                                if (objArr15.length == 2 && Long.TYPE.equals(objArr15[0])) {
                                    int i96 = d;
                                    int i97 = (i96 & 91) + (i96 | 91);
                                    f90a = i97 % 128;
                                    if (i97 % 2 == 0) {
                                        cArr5 = new char[]{0, 0, 0, 0};
                                        cArr6 = new char[]{53254, 23161, 32994, 4055};
                                        c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1));
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1);
                                    } else {
                                        cArr5 = new char[]{0, 0, 0, 0};
                                        cArr6 = new char[]{53254, 23161, 32994, 4055};
                                        c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                    }
                                    char[] cArr16 = cArr6;
                                    char[] cArr17 = cArr5;
                                    char c7 = c2;
                                    int i98 = iMakeMeasureSpec;
                                    int i99 = f90a + 3;
                                    d = i99 % 128;
                                    if (i99 % 2 != 0) {
                                        Object[] objArr16 = new Object[1];
                                        f(cArr17, cArr16, c7, i98, new char[]{42085, 27569, 7897, 41119, 36467, 1198, 36338, 2504, 30228, 22392, 25596, 4623, 9445, 11523, 43358, 4660, 43839, 42523, 13020, 14459, 22388, 33215, 13546, 11161}, objArr16);
                                        if (!(!Class.forName((String) objArr16[0]).equals(objArr15[0]))) {
                                            i9 = 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char threadPriority = (char) ((Process.getThreadPriority(i9) + 20) >> 6);
                                                int i100 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                                int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                byte[] bArr3 = $$d;
                                                byte b6 = bArr3[5];
                                                Object[] objArr17 = new Object[1];
                                                e((byte) (-b6), bArr3[7], b6, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i100, scrollBarFadeDuration, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cMyTid = (char) (Process.myTid() >> 22);
                                                int i101 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte[] bArr4 = $$d;
                                                byte b7 = bArr4[5];
                                                Object[] objArr18 = new Object[1];
                                                e((byte) (-b7), bArr4[7], b7, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i101, minimumFlingVelocity, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            try {
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                    int mode2 = 2823 - View.MeasureSpec.getMode(0);
                                                    int iIndexOf = TextUtils.indexOf("", "") + 22;
                                                    byte[] bArr5 = $$d;
                                                    Object[] objArr20 = new Object[1];
                                                    e((byte) 51, bArr5[10], bArr5[7], objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, mode2, iIndexOf, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        Object[] objArr21 = new Object[1];
                                        f(cArr17, cArr16, c7, i98, new char[]{42085, 27569, 7897, 41119, 36467, 1198, 36338, 2504, 30228, 22392, 25596, 4623, 9445, 11523, 43358, 4660, 43839, 42523, 13020, 14459, 22388, 33215, 13546, 11161}, objArr21);
                                        i9 = 0;
                                        if (Class.forName((String) objArr21[0]).equals(objArr15[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char threadPriority2 = (char) ((Process.getThreadPriority(i9) + 20) >> 6);
                                                int i102 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                                int scrollBarFadeDuration2 = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                byte[] bArr6 = $$d;
                                                byte b8 = bArr6[5];
                                                Object[] objArr110 = new Object[1];
                                                e((byte) (-b8), bArr6[7], b8, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority2, i102, scrollBarFadeDuration2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cMyTid2 = (char) (Process.myTid() >> 22);
                                                int i103 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                int minimumFlingVelocity2 = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte[] bArr7 = $$d;
                                                byte b9 = bArr7[5];
                                                Object[] objArr111 = new Object[1];
                                                e((byte) (-b9), bArr7[7], b9, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid2, i103, minimumFlingVelocity2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                                int mode3 = 2823 - View.MeasureSpec.getMode(0);
                                                int iIndexOf2 = TextUtils.indexOf("", "") + 22;
                                                byte[] bArr8 = $$d;
                                                Object[] objArr22 = new Object[1];
                                                e((byte) 51, bArr8[10], bArr8[7], objArr22);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb2, mode3, iIndexOf2, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i26++;
                        i10 = 2;
                        i13 = 1;
                        f = 0.0f;
                        i16 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c8 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i104 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
            int i105 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            byte[] bArr9 = $$d;
            byte b10 = bArr9[5];
            Object[] objArr23 = new Object[1];
            e((byte) (-b10), bArr9[7], b10, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c8, i104, i105, 1814927978, false, (String) objArr23[0], null);
        }
        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cRed = (char) Color.red(0);
            int iAlpha = 2823 - Color.alpha(0);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            Object[] objArr25 = new Object[1];
            e((byte) 51, (byte) 14, $$d[7], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iAlpha, iResolveOpacity, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr24);
        Object[] objArr26 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cGreen = (char) (37657 - Color.green(0));
            int i106 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2720;
            int iIndexOf3 = 18 - TextUtils.indexOf((CharSequence) "", '0');
            Object[] objArr27 = new Object[1];
            e((byte) 51, (byte) 14, $$d[7], objArr27);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, i106, iIndexOf3, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr26)).longValue();
        long j = -103888469;
        long j2 = -183;
        long j3 = -1;
        long j4 = j ^ j3;
        long jMaxMemory = ((long) ((int) Runtime.getRuntime().maxMemory())) ^ j3;
        long j5 = j4 | jMaxMemory;
        long j6 = jLongValue ^ j3;
        long j7 = j6 | jMaxMemory;
        long j8 = (j2 * j) + (j2 * jLongValue) + (((long) (-184)) * (((j5 | jLongValue) ^ j3) | ((j7 | j) ^ j3)));
        long j9 = 184;
        long j10 = j8 + (((j7 ^ j3) | ((j4 | j6) ^ j3) | (j5 ^ j3)) * j9) + (j9 * (j | jLongValue)) + ((long) (-1706517376));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i107 = ~iUptimeMillis;
        int i108 = (~(202611066 | i107)) | (-1841299328) | (~(1639837477 | i107));
        int i109 = ((int) (j10 >> 32)) & (1019311338 + (((~(iUptimeMillis | (-1149217))) | i108) * 590) + (i108 * (-1180)) + (((~((-1639837478) | i107)) | (~(i107 | (-202611067)))) * 590));
        int iMyUid = Process.myUid();
        int i110 = i109 | (((int) j10) & (1918789481 + (((~((-327553248) | iMyUid)) | (-1109673163)) * 191) + (((~((~iMyUid) | (-327553248))) | 293736469) * 191)));
        int i111 = i110 >>> 24;
        int i112 = i110 & ViewCompat.MEASURED_SIZE_MASK;
        if (i111 != 0) {
            int i113 = d + 49;
            f90a = i113 % 128;
            int i114 = i113 % 2;
            i2 = 2;
            i3 = 1;
        } else {
            int i115 = f90a;
            int i116 = (i115 & 39) + (i115 | 39);
            d = i116 % 128;
            i2 = 2;
            int i117 = i116 % 2;
            i3 = i;
        }
        if (i3 != 0) {
            int i118 = d + 65;
            f90a = i118 % 128;
            if (i118 % i2 == 0) {
                i4 = i;
                i5 = 1;
            } else {
                i5 = 1;
                i4 = 1;
            }
        } else {
            i4 = i;
            i5 = 1;
        }
        if (i3 == i5 && i112 < i5) {
            int i119 = f90a;
            int i120 = (i119 & 51) + (i119 | 51);
            d = i120 % 128;
            int i121 = i120 % 2;
            Method method4 = methodArr[i112];
            if (method4 != null) {
                LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                string = method4.toString();
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i122 = i111 * 111;
        int i123 = ((-654) & i122) + (i122 | (-654));
        int i124 = ~(i111 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
        int i125 = ((i124 & (-7)) | ((-7) ^ i124)) * (-220);
        int i126 = (i123 ^ i125) + ((i125 & i123) << 1);
        int i127 = ~((i111 ^ 6) | (i111 & 6));
        int i128 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i111) | (i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
        int i129 = -(-(((i128 & i127) | (i127 ^ i128)) * 220));
        int i130 = (i126 ^ i129) + ((i129 & i126) << 1);
        int i131 = ~(((-7) ^ i111) | ((-7) & i111));
        int i132 = ~i111;
        int i133 = (i130 + ((i131 | (~((i132 & 6) | (i132 ^ 6)))) * 110)) * i4;
        int i134 = d + 75;
        f90a = i134 % 128;
        int i135 = i134 % 2;
        return i133;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = defpackage.BrowserActionItem.$$c
            int r8 = 104 - r8
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BrowserActionItem.$$g(byte, int, byte):java.lang.String");
    }
}
