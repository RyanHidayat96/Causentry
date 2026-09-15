package com.midtrans.sdk.corekit.models;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class UserAddress implements Serializable {
    private String address;
    private int addressType;
    private String city;
    private String country;
    private String zipcode;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 218;
    private static final byte[] $$a = {51, -5, 77, 89, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 235;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {159707201, 1242266189, -16499160, -1291092785, 832204169, -1194590447, 1140676837, 99143920, -1959327346, 1241322596, 63241616, 1973843216, 53930791, -1016581341, 102996947, -462437529, -331813501, -148403006};

    private static void a(byte b, short s, byte b2, Object[] objArr) {
        int i = (b2 * 6) + 97;
        int i2 = s * 19;
        int i3 = 36 - (b * 32);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[33 - i2];
        int i4 = 32 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i = (i3 + (-i4)) - 2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i3];
                i3++;
                i = (i + (-b3)) - 2;
            }
        }
    }

    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2 = 55 - (b * 52);
        byte[] bArr = $$d;
        int i3 = b2 * 52;
        int i4 = 103 - i;
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + (-i5)) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i4 = (i4 + (-bArr[i2])) - 11;
            }
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = -1870535734;
        char c = '0';
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 75;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", c, i5) + 3292, View.MeasureSpec.makeMeasureSpec(i5, i5) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -1870535734;
                    c = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 11;
                $11 = i13 % 128;
                int i14 = i13 % i10;
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3291 - (ViewConfiguration.getWindowTouchSlop() >> 8), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i12++;
                    iArr5 = iArr5;
                    i4 = 1;
                    i10 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = $10 + 21;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            for (int i17 = 17; i17 > 1; i17--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 2559, 28 - MotionEvent.axisFromString(""), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28880), 348 - (ViewConfiguration.getEdgeSlop() >> 16), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public String getAddress() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getAddressType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = this.addressType;
        int i6 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getCity() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 == 0) {
            str = this.city;
            int i4 = 77 / 0;
        } else {
            str = this.city;
        }
        int i5 = i3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public String getCountry() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.country;
            int i4 = 16 / 0;
        } else {
            str = this.country;
        }
        int i5 = i2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getZipcode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.zipcode;
        int i5 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAddress(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.address = str;
        int i5 = i2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setAddressType(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.addressType = i;
        int i6 = i3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setCity(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.city = str;
        int i5 = i2 + 87;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCountry(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.country = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setZipcode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.zipcode = str;
        int i5 = i3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x03c7 A[Catch: all -> 0x0645, TRY_ENTER, TryCatch #0 {all -> 0x0645, blocks: (B:16:0x0119, B:18:0x01af, B:22:0x0264, B:30:0x02c9, B:35:0x03a9, B:38:0x03c7, B:44:0x0411, B:46:0x043b, B:45:0x0423, B:39:0x03e3, B:25:0x0289), top: B:129:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x03e3 A[Catch: all -> 0x0645, TRY_LEAVE, TryCatch #0 {all -> 0x0645, blocks: (B:16:0x0119, B:18:0x01af, B:22:0x0264, B:30:0x02c9, B:35:0x03a9, B:38:0x03c7, B:44:0x0411, B:46:0x043b, B:45:0x0423, B:39:0x03e3, B:25:0x0289), top: B:129:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x040f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0423 A[Catch: all -> 0x0645, TryCatch #0 {all -> 0x0645, blocks: (B:16:0x0119, B:18:0x01af, B:22:0x0264, B:30:0x02c9, B:35:0x03a9, B:38:0x03c7, B:44:0x0411, B:46:0x043b, B:45:0x0423, B:39:0x03e3, B:25:0x0289), top: B:129:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0529  */
    /* JADX WARN: Code duplicated, block: B:71:0x057c  */
    /* JADX WARN: Code duplicated, block: B:75:0x05db A[Catch: all -> 0x08d7, TryCatch #1 {all -> 0x08d7, blocks: (B:73:0x05c4, B:75:0x05db, B:76:0x0623, B:90:0x069f, B:92:0x06ac, B:93:0x06ee, B:95:0x070d, B:97:0x075b), top: B:131:0x05c4 }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        long j;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        String string;
        Method method;
        int i5;
        Class cls;
        Class<?> cls2;
        Object[] objArr;
        int[] iArr;
        int edgeSlop;
        int i6;
        Class<?> cls3;
        int[] iArr2;
        int scrollBarSize;
        int i7;
        int i8;
        Object[] objArr2;
        Method method2;
        Object[] objArr3;
        int[] iArr3;
        int i9;
        int i10;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i12 = 2;
        int i13 = 2 % 2;
        Method[] methodArr = new Method[2];
        byte[] bArr = $$a;
        byte b = bArr[7];
        byte b2 = bArr[28];
        int i14 = 1;
        Object[] objArr4 = new Object[1];
        a(b, b2, b2, objArr4);
        int i15 = 0;
        Class<?> cls4 = Class.forName((String) objArr4[0]);
        byte b3 = bArr[28];
        byte b4 = bArr[7];
        Object[] objArr5 = new Object[1];
        a(b3, b4, b4, objArr5);
        String str = (String) objArr5[0];
        int i16 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
        methodArr[0] = i16 % 2 == 0 ? cls4.getMethod(str, PackageManager.PackageInfoFlags.class, String.class) : cls4.getMethod(str, String.class, PackageManager.PackageInfoFlags.class);
        Class<?> cls5 = Class.forName("android.app.ApplicationPackageManager");
        byte b5 = bArr[28];
        byte b6 = bArr[7];
        Object[] objArr6 = new Object[1];
        a(b5, b6, b6, objArr6);
        String str2 = (String) objArr6[0];
        int i17 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
        int i18 = i17 % 2;
        methodArr[1] = cls5.getMethod(str2, String.class, PackageManager.PackageInfoFlags.class);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
            int iGreen = 22 - Color.green(0);
            byte[] bArr2 = $$d;
            Object[] objArr7 = new Object[1];
            b(bArr2[5], bArr2[10], bArr2[7], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, keyRepeatDelay, iGreen, 1814927978, false, (String) objArr7[0], null);
        }
        Class<?>[] clsArr = null;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getPressedStateDuration() >> 16), AndroidCharacter.getMirror('0') + 2775, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i20 = (i19 ^ 119) + ((i19 & 119) << 1);
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (true) {
                if (i22 < length) {
                    int i23 = TuitionPaymentFragmentbindingInflater1;
                    int i24 = (i23 ^ 67) + ((i23 & 67) << i14);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    if (i24 % i12 == 0) {
                        Method method3 = declaredMethods[i22];
                        throw null;
                    }
                    Method method4 = declaredMethods[i22];
                    try {
                        int i25 = -ImageFormat.getBitsPerPixel(i15);
                        Object[] objArr8 = new Object[i14];
                        c(new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873}, ((i25 | 23) << 1) - (i25 ^ 23), objArr8);
                        Class<?> cls6 = Class.forName((String) objArr8[i15]);
                        int[] iArr4 = {-1703834825, -272792977, 250116962, -2028381240, 431553571, 1491998769, -411424067, -1318001445};
                        int i26 = (TypedValue.complexToFraction(i15, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i15, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater1 = zzir.TuitionPaymentFragmentbindingInflater1();
                        int i27 = TuitionPaymentFragmentbindingInflater1 + 63;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                        int i28 = i27 % i12;
                        int i29 = 677 * i26;
                        int i30 = ((i29 | (-8100)) << i14) - (i29 ^ (-8100));
                        int i31 = (i26 ^ iTuitionPaymentFragmentbindingInflater1) | (i26 & iTuitionPaymentFragmentbindingInflater1);
                        int i32 = ((i31 ^ (-13)) | (i31 & (-13))) * (-676);
                        int i33 = ((i30 | i32) << 1) - (i32 ^ i30);
                        int i34 = ~(((-13) ^ i26) | ((-13) & i26));
                        int i35 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i36 = ~(i35 | i26);
                        int i37 = -(-(((i34 ^ i36) | (i36 & i34)) * 676));
                        int i38 = ((i33 | i37) << i14) - (i33 ^ i37);
                        int i39 = ~((~i26) | (-13));
                        int i40 = ~((-13) | i35);
                        int i41 = (i39 ^ i40) | (i39 & i40);
                        zzir.TuitionPaymentFragmentbindingInflater1();
                        zzir.TuitionPaymentFragmentbindingInflater1();
                        int i42 = ~((i26 & 12) | (i26 ^ 12) | iTuitionPaymentFragmentbindingInflater1);
                        int i43 = i38 + (676 * ((i41 & i42) | (i41 ^ i42)));
                        Object[] objArr9 = new Object[i14];
                        c(iArr4, i43, objArr9);
                        Object[] objArr10 = new Object[i14];
                        objArr10[i15] = Integer.valueOf(((Integer) cls6.getMethod((String) objArr9[i15], clsArr).invoke(method4, clsArr)).intValue());
                        Object[] objArr11 = new Object[i14];
                        c(new int[]{585027107, 204694185, 1619519674, -1160763794, 1760907278, -681017083, 1379856088, 746185385, -2049182488, -202680812, -233197886, -2100215028, -639172884, 2134141017, 1051073195, -1484477674}, 25 - (~View.resolveSize(i15, i15)), objArr11);
                        Class<?> cls7 = Class.forName((String) objArr11[i15]);
                        int[] iArr5 = {482531062, -1516819270, -160046294, -806284949, -470336782, -726646432};
                        int iCombineMeasuredStates = View.combineMeasuredStates(i15, i15);
                        int iTuitionPaymentFragmentbindingInflater2 = zzir.TuitionPaymentFragmentbindingInflater1();
                        int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i45 = (i44 & 75) + (i44 | 75);
                        TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = ~iCombineMeasuredStates;
                        int i48 = (i47 ^ 8) | (i47 & 8);
                        int i49 = ~i48;
                        int i50 = length;
                        int i51 = ~iCombineMeasuredStates;
                        int i52 = ~((i51 ^ iTuitionPaymentFragmentbindingInflater2) | (i51 & iTuitionPaymentFragmentbindingInflater2));
                        int i53 = ((755 * iCombineMeasuredStates) - 6024) + (((i49 ^ i52) | (i49 & i52) | (~((8 ^ iTuitionPaymentFragmentbindingInflater2) | (8 & iTuitionPaymentFragmentbindingInflater2)))) * (-754));
                        int i54 = ((i44 | 111) << 1) - (i44 ^ 111);
                        int i55 = i54 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i55;
                        int i56 = i54 % 2;
                        int i57 = ~((i48 & iTuitionPaymentFragmentbindingInflater2) | (i48 ^ iTuitionPaymentFragmentbindingInflater2));
                        int i58 = ~iTuitionPaymentFragmentbindingInflater2;
                        int i59 = (iCombineMeasuredStates & i58) | (i58 ^ iCombineMeasuredStates);
                        int i60 = ~((i59 & 8) | (i59 ^ 8));
                        int i61 = i53 + (((i57 & i60) | (i57 ^ i60)) * (-754));
                        int i62 = i55 + 19;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i62 % 128;
                        if (i62 % 2 == 0) {
                            int i63 = i47 ^ i58;
                            Object[] objArr12 = new Object[1];
                            c(iArr5, i61 % (754 >>> ((i58 & i47) | i63)), objArr12);
                            if (((Boolean) cls7.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).booleanValue()) {
                                i5 = 1;
                                int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i65 = (i64 ^ 25) + ((i64 & 25) << i5);
                                TuitionPaymentFragmentbindingInflater1 = i65 % 128;
                                int i66 = i65 % 2;
                                cls = Long.TYPE;
                                int i67 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater3 = zzir.TuitionPaymentFragmentbindingInflater1();
                                int i68 = i67 * (-813);
                                int i69 = ((i68 | 9792) << 1) - (i68 ^ 9792);
                                int i70 = ~(((-25) & i67) | ((-25) ^ i67));
                                int i71 = ~((i67 ^ iTuitionPaymentFragmentbindingInflater3) | (i67 & iTuitionPaymentFragmentbindingInflater3));
                                int i72 = i69 + (((i70 & i71) | (i70 ^ i71)) * (-814));
                                int i73 = ~((-25) | (~iTuitionPaymentFragmentbindingInflater3));
                                int i74 = ~i67;
                                int i75 = ~((i74 & 24) | (i74 ^ 24));
                                int i76 = (i73 & i75) | (i73 ^ i75);
                                int i77 = -(-(((i76 & i71) | (i76 ^ i71)) * 407));
                                int i78 = (i72 & i77) + (i77 | i72);
                                int i79 = ~i67;
                                int i80 = ~(i79 | 24);
                                int i81 = ~(i79 | iTuitionPaymentFragmentbindingInflater3);
                                int i82 = (i81 & i80) | (i80 ^ i81);
                                int i83 = ~((iTuitionPaymentFragmentbindingInflater3 & 24) | (iTuitionPaymentFragmentbindingInflater3 ^ 24));
                                int i84 = (i78 - (~(((i83 & i82) | (i82 ^ i83)) * 407))) - 1;
                                Object[] objArr13 = new Object[1];
                                c(new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873}, i84, objArr13);
                                cls2 = Class.forName((String) objArr13[0]);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                                int iTuitionPaymentFragmentbindingInflater4 = zzir.TuitionPaymentFragmentbindingInflater1();
                                int i85 = ~iTuitionPaymentFragmentbindingInflater4;
                                int i86 = ~iLastIndexOf;
                                int i87 = ~(i86 | (-15));
                                int i88 = (((iLastIndexOf * (-661)) - 9254) - (~(-(-(((i85 & i87) | (i85 ^ i87)) * 1324))))) - 1;
                                int i89 = ~((iLastIndexOf ^ iTuitionPaymentFragmentbindingInflater4) | (iLastIndexOf & iTuitionPaymentFragmentbindingInflater4));
                                int i90 = ~((iTuitionPaymentFragmentbindingInflater4 & 14) | (iTuitionPaymentFragmentbindingInflater4 ^ 14));
                                int i91 = ((i90 & i89) | (i89 ^ i90)) * (-1324);
                                int i92 = (((i88 | i91) << 1) - (i91 ^ i88)) + (((~((i86 ^ 14) | (i86 & 14))) | (~((-15) | iLastIndexOf))) * 662);
                                objArr = new Object[1];
                                c(new int[]{-265830931, 2004056829, -687350903, 273426968, -2141981780, -1642035110, -1858273801, 1646666371, 1557461044, 1330277069}, i92, objArr);
                                if (!cls.equals(cls2.getMethod((String) objArr[0], null).invoke(method4, null))) {
                                    continue;
                                } else {
                                    iArr = new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873};
                                    edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i93 = TuitionPaymentFragmentbindingInflater1;
                                    i6 = (i93 & 79) + (i93 | 79);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        Object[] objArr14 = new Object[1];
                                        c(iArr, edgeSlop, objArr14);
                                        cls3 = Class.forName((String) objArr14[0]);
                                        iArr2 = new int[]{1490770404, -1815118116, -1959799745, 417839214, 1233152496, -725470252, 495320026, 1954479893, -1471542167, -228945601, 325682986, 189982951};
                                        scrollBarSize = ViewConfiguration.getScrollBarSize();
                                        i7 = 72;
                                    } else {
                                        Object[] objArr15 = new Object[1];
                                        c(iArr, edgeSlop, objArr15);
                                        cls3 = Class.forName((String) objArr15[0]);
                                        iArr2 = new int[]{1490770404, -1815118116, -1959799745, 417839214, 1233152496, -725470252, 495320026, 1954479893, -1471542167, -228945601, 325682986, 189982951};
                                        scrollBarSize = ViewConfiguration.getScrollBarSize();
                                        i7 = 17;
                                    }
                                    int i94 = TuitionPaymentFragmentbindingInflater1;
                                    i8 = (i94 ^ 9) + ((i94 & 9) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i95 = i7 / (scrollBarSize - 112);
                                        Object[] objArr16 = new Object[1];
                                        c(iArr2, i95, objArr16);
                                        method2 = cls3.getMethod((String) objArr16[0], null);
                                        objArr2 = null;
                                    } else {
                                        int i96 = -(-(scrollBarSize >> 8));
                                        int i97 = (i7 & i96) + (i96 | i7);
                                        Object[] objArr17 = new Object[1];
                                        c(iArr2, i97, objArr17);
                                        objArr2 = null;
                                        method2 = cls3.getMethod((String) objArr17[0], null);
                                    }
                                    objArr3 = (Object[]) method2.invoke(method4, objArr2);
                                    if (objArr3.length == 2 && Long.TYPE.equals(objArr3[0])) {
                                        int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                                        TuitionPaymentFragmentbindingInflater1 = i98 % 128;
                                        if (i98 % 2 != 0) {
                                            iArr3 = new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873};
                                            i9 = (TypedValue.complexToFraction(1, 0.0f, 2.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 0.0f, 2.0f) == 1.0f ? 0 : -1));
                                            i10 = 109;
                                        } else {
                                            iArr3 = new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873};
                                            i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            i10 = 24;
                                        }
                                        int iTuitionPaymentFragmentbindingInflater5 = zzir.TuitionPaymentFragmentbindingInflater1();
                                        int i99 = i9 * 960;
                                        int i100 = TuitionPaymentFragmentbindingInflater1 + 99;
                                        int i101 = i100 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i101;
                                        int i102 = i100 % 2 == 0 ? i99 % ((-1917) / i10) : (i99 - (~(-(-(i10 * (-1917)))))) - 1;
                                        int i103 = ~i10;
                                        int i104 = ~iTuitionPaymentFragmentbindingInflater5;
                                        int i105 = -(-(959 * ((~(i103 | i104)) | (~(i9 | iTuitionPaymentFragmentbindingInflater5)))));
                                        int i106 = ~i10;
                                        int i107 = ((((i102 | i105) << 1) - (i102 ^ i105)) - (~(i106 * (-959)))) - 1;
                                        int i108 = i101 + 51;
                                        TuitionPaymentFragmentbindingInflater1 = i108 % 128;
                                        int i109 = i108 % 2;
                                        int i110 = ~((iTuitionPaymentFragmentbindingInflater5 & i106) | (i106 ^ iTuitionPaymentFragmentbindingInflater5));
                                        int i111 = i101 + 121;
                                        TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                                        int i112 = i111 % 2;
                                        int i113 = ~((i9 & i104) | (i104 ^ i9));
                                        int i114 = 959 * ((i113 & i110) | (i110 ^ i113));
                                        int i115 = ((i107 | i114) << 1) - (i114 ^ i107);
                                        Object[] objArr18 = new Object[1];
                                        c(iArr3, i115, objArr18);
                                        Class<?> cls8 = Class.forName((String) objArr18[0]);
                                        int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                                        TuitionPaymentFragmentbindingInflater1 = i116 % 128;
                                        if (i116 % 2 != 0) {
                                            i11 = 1;
                                            boolean zEquals = cls8.equals(objArr3[1]);
                                            int i117 = 49 / 0;
                                            if (zEquals) {
                                                int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i119 = (i118 ^ 5) + ((i118 & 5) << i11);
                                                TuitionPaymentFragmentbindingInflater1 = i119 % 128;
                                                int i120 = i119 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 2823;
                                                    int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                                    byte[] bArr3 = $$d;
                                                    Object[] objArr19 = new Object[1];
                                                    b(bArr3[5], bArr3[10], bArr3[7], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, packedPositionType2, touchSlop, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                    int i121 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    Object[] objArr20 = new Object[1];
                                                    b(bArr4[5], bArr4[10], bArr4[7], objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i121, absoluteGravity, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                try {
                                                    Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                                        int defaultSize = View.getDefaultSize(0, 0) + 2823;
                                                        int mirror2 = 'F' - AndroidCharacter.getMirror('0');
                                                        byte[] bArr5 = $$d;
                                                        byte b7 = bArr5[7];
                                                        Object[] objArr22 = new Object[1];
                                                        b(b7, b7, bArr5[5], objArr22);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, defaultSize, mirror2, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr21)).longValue();
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            i11 = 1;
                                            if (cls8.equals(objArr3[1])) {
                                                int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i1111 = (i1110 ^ 5) + ((i1110 & 5) << i11);
                                                TuitionPaymentFragmentbindingInflater1 = i1111 % 128;
                                                int i122 = i1111 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 2823;
                                                    int touchSlop2 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                                    byte[] bArr6 = $$d;
                                                    Object[] objArr110 = new Object[1];
                                                    b(bArr6[5], bArr6[10], bArr6[7], objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, packedPositionType3, touchSlop2, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                    int i123 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 22;
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr23 = new Object[1];
                                                    b(bArr7[5], bArr7[10], bArr7[7], objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i123, absoluteGravity2, 1814927978, false, (String) objArr23[0], null);
                                                }
                                                Object[] objArr24 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char mirror3 = (char) ('0' - AndroidCharacter.getMirror('0'));
                                                    int defaultSize2 = View.getDefaultSize(0, 0) + 2823;
                                                    int mirror4 = 'F' - AndroidCharacter.getMirror('0');
                                                    byte[] bArr8 = $$d;
                                                    byte b8 = bArr8[7];
                                                    Object[] objArr25 = new Object[1];
                                                    b(b8, b8, bArr8[5], objArr25);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror3, defaultSize2, mirror4, -2137287382, false, (String) objArr25[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr24)).longValue();
                                            }
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int i124 = ((~iTuitionPaymentFragmentbindingInflater2) | i47) * 754;
                            int i125 = ((i61 | i124) << 1) - (i61 ^ i124);
                            Object[] objArr26 = new Object[1];
                            c(iArr5, i125, objArr26);
                            boolean zBooleanValue = ((Boolean) cls7.getMethod((String) objArr26[0], Integer.TYPE).invoke(null, objArr10)).booleanValue();
                            i5 = 1;
                            if (!zBooleanValue) {
                                continue;
                            } else {
                                int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i611 = (i610 ^ 25) + ((i610 & 25) << i5);
                                TuitionPaymentFragmentbindingInflater1 = i611 % 128;
                                int i612 = i611 % 2;
                                cls = Long.TYPE;
                                int i613 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater6 = zzir.TuitionPaymentFragmentbindingInflater1();
                                int i614 = i613 * (-813);
                                int i615 = ((i614 | 9792) << 1) - (i614 ^ 9792);
                                int i710 = ~(((-25) & i613) | ((-25) ^ i613));
                                int i711 = ~((i613 ^ iTuitionPaymentFragmentbindingInflater6) | (i613 & iTuitionPaymentFragmentbindingInflater6));
                                int i712 = i615 + (((i710 & i711) | (i710 ^ i711)) * (-814));
                                int i713 = ~((-25) | (~iTuitionPaymentFragmentbindingInflater6));
                                int i714 = ~i613;
                                int i715 = ~((i714 & 24) | (i714 ^ 24));
                                int i716 = (i713 & i715) | (i713 ^ i715);
                                int i717 = -(-(((i716 & i711) | (i716 ^ i711)) * 407));
                                int i718 = (i712 & i717) + (i717 | i712);
                                int i719 = ~i613;
                                int i810 = ~(i719 | 24);
                                int i811 = ~(i719 | iTuitionPaymentFragmentbindingInflater6);
                                int i812 = (i811 & i810) | (i810 ^ i811);
                                int i813 = ~((iTuitionPaymentFragmentbindingInflater6 & 24) | (iTuitionPaymentFragmentbindingInflater6 ^ 24));
                                int i814 = (i718 - (~(((i813 & i812) | (i812 ^ i813)) * 407))) - 1;
                                Object[] objArr111 = new Object[1];
                                c(new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873}, i814, objArr111);
                                cls2 = Class.forName((String) objArr111[0]);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                int iTuitionPaymentFragmentbindingInflater7 = zzir.TuitionPaymentFragmentbindingInflater1();
                                int i815 = ~iTuitionPaymentFragmentbindingInflater7;
                                int i816 = ~iLastIndexOf2;
                                int i817 = ~(i816 | (-15));
                                int i818 = (((iLastIndexOf2 * (-661)) - 9254) - (~(-(-(((i815 & i817) | (i815 ^ i817)) * 1324))))) - 1;
                                int i819 = ~((iLastIndexOf2 ^ iTuitionPaymentFragmentbindingInflater7) | (iLastIndexOf2 & iTuitionPaymentFragmentbindingInflater7));
                                int i910 = ~((iTuitionPaymentFragmentbindingInflater7 & 14) | (iTuitionPaymentFragmentbindingInflater7 ^ 14));
                                int i911 = ((i910 & i819) | (i819 ^ i910)) * (-1324);
                                int i912 = (((i818 | i911) << 1) - (i911 ^ i818)) + (((~((i816 ^ 14) | (i816 & 14))) | (~((-15) | iLastIndexOf2))) * 662);
                                objArr = new Object[1];
                                c(new int[]{-265830931, 2004056829, -687350903, 273426968, -2141981780, -1642035110, -1858273801, 1646666371, 1557461044, 1330277069}, i912, objArr);
                                if (!cls.equals(cls2.getMethod((String) objArr[0], null).invoke(method4, null))) {
                                    continue;
                                } else {
                                    iArr = new int[]{-537229598, 33204248, -398727003, 143554205, -1764498540, 1587176160, 78027415, -1192187687, -414143685, 766812717, 150642889, -131423230, 1963535183, -1733709873};
                                    edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i913 = TuitionPaymentFragmentbindingInflater1;
                                    i6 = (i913 & 79) + (i913 | 79);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        Object[] objArr112 = new Object[1];
                                        c(iArr, edgeSlop, objArr112);
                                        cls3 = Class.forName((String) objArr112[0]);
                                        iArr2 = new int[]{1490770404, -1815118116, -1959799745, 417839214, 1233152496, -725470252, 495320026, 1954479893, -1471542167, -228945601, 325682986, 189982951};
                                        scrollBarSize = ViewConfiguration.getScrollBarSize();
                                        i7 = 72;
                                    } else {
                                        Object[] objArr113 = new Object[1];
                                        c(iArr, edgeSlop, objArr113);
                                        cls3 = Class.forName((String) objArr113[0]);
                                        iArr2 = new int[]{1490770404, -1815118116, -1959799745, 417839214, 1233152496, -725470252, 495320026, 1954479893, -1471542167, -228945601, 325682986, 189982951};
                                        scrollBarSize = ViewConfiguration.getScrollBarSize();
                                        i7 = 17;
                                    }
                                    int i914 = TuitionPaymentFragmentbindingInflater1;
                                    i8 = (i914 ^ 9) + ((i914 & 9) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int i915 = i7 / (scrollBarSize - 112);
                                        Object[] objArr114 = new Object[1];
                                        c(iArr2, i915, objArr114);
                                        method2 = cls3.getMethod((String) objArr114[0], null);
                                        objArr2 = null;
                                    } else {
                                        int i916 = -(-(scrollBarSize >> 8));
                                        int i917 = (i7 & i916) + (i916 | i7);
                                        Object[] objArr115 = new Object[1];
                                        c(iArr2, i917, objArr115);
                                        objArr2 = null;
                                        method2 = cls3.getMethod((String) objArr115[0], null);
                                    }
                                    objArr3 = (Object[]) method2.invoke(method4, objArr2);
                                    if (objArr3.length == 2) {
                                        continue;
                                    }
                                }
                            }
                        }
                        i22 = (i22 & 1) + (i22 | 1);
                        length = i50;
                        i12 = 2;
                        clsArr = null;
                        i15 = 0;
                        i14 = 1;
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
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int absoluteGravity3 = 2823 - Gravity.getAbsoluteGravity(0, 0);
            int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr9 = $$d;
            Object[] objArr27 = new Object[1];
            b(bArr9[5], bArr9[10], bArr9[7], objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, absoluteGravity3, threadPriority, 1814927978, false, (String) objArr27[0], null);
        }
        Object[] objArr28 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iIndexOf = 2823 - TextUtils.indexOf("", "", 0);
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr10 = $$d;
            byte b9 = bArr10[7];
            Object[] objArr29 = new Object[1];
            b(b9, (byte) (b9 + 5), bArr10[5], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iIndexOf, iLastIndexOf3, 1025296417, false, (String) objArr29[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr28);
        Object[] objArr30 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37657);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2720;
            int doubleTapTimeout = 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr11 = $$d;
            byte b10 = bArr11[7];
            Object[] objArr31 = new Object[1];
            b(b10, (byte) (b10 + 5), bArr11[5], objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop2, capsMode, doubleTapTimeout, -1568796068, false, (String) objArr31[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr30)).longValue();
        int i126 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i126 % 128;
        if (i126 % 2 != 0) {
            long j2 = -876214346;
            long j3 = 672;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j4 = -1;
            long j5 = jUptimeMillis ^ j4;
            long j6 = jLongValue ^ j4;
            j = (((long) 673) * j2) + (((long) (-1343)) * jLongValue) + ((((j2 | jUptimeMillis) ^ j4) | jLongValue) * j3) + (((long) (-672)) * (((jUptimeMillis | jLongValue) ^ j4) | (((j2 ^ j4) | j5) ^ j4))) + (j3 * (((j6 | j2) ^ j4) | ((j6 | j5) ^ j4))) + ((long) (-934191499));
            i = (int) (j << 101);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i127 = ~iMaxMemory;
            i2 = ((((~(i127 | (-506106137))) | ((~((-1943332548) | i127)) | 302022656)) * (-397)) - 737102378) + ((iMaxMemory | (-1845393372)) * 397);
        } else {
            long j7 = -750777269;
            long elapsedCpuTime = (int) Process.getElapsedCpuTime();
            long j8 = -1;
            long j9 = elapsedCpuTime ^ j8;
            long j10 = jLongValue ^ j8;
            j = (((long) 758) * j7) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j7 | j9)) + (((long) 1514) * (((j10 | j7) | elapsedCpuTime) ^ j8)) + (((long) 757) * ((((j7 | jLongValue) | elapsedCpuTime) ^ j8) | (((j7 ^ j8) | j10) ^ j8) | ((j9 | j10) ^ j8))) + ((long) (-1059628576));
            i = (int) (j >> 32);
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            i2 = (-1031729986) + (((~((-404031020) | (~startUptimeMillis))) | (-1033195392)) * (-591)) + ((startUptimeMillis | (-404031020)) * 591);
        }
        int i128 = i & i2;
        int i129 = ~((~new Random().nextInt()) | (-404659182));
        int i130 = ((int) j) & (((629219344 | i129) * (-374)) + 2086086345 + ((i129 | (-1033878526)) * 374));
        int i131 = (i128 & i130) | (i128 ^ i130);
        int i132 = i131 >>> 24;
        int i133 = i131 & ViewCompat.MEASURED_SIZE_MASK;
        if (i132 != 0) {
            int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentbindingInflater1 = i134 % 128;
            int i135 = i134 % 2;
            z = true;
        } else {
            int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentbindingInflater1 = i136 % 128;
            if (i136 % 2 != 0) {
                int i137 = 5 % 2;
            }
            z = false;
        }
        if (z) {
            int i138 = TuitionPaymentFragmentbindingInflater1;
            int i139 = (i138 & 23) + (i138 | 23);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i139 % 128;
            i3 = 2;
            if (i139 % 2 != 0) {
                i4 = 1;
            }
            if (z || i133 >= i3 || (method = methodArr[i133]) == null) {
                string = null;
            } else {
                string = method.toString();
            }
            list.add(string);
            int i140 = TuitionPaymentFragmentbindingInflater1;
            int i141 = (i140 & 119) + (i140 | 119);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i141 % 128;
            int i142 = i141 % 2;
            return ((i132 ^ 6) + ((i132 & 6) << 1)) * i4;
        }
        i3 = 2;
        int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i143 % 128;
        int i144 = i143 % 2;
        i4 = 0;
        if (z) {
            string = null;
        } else {
            string = null;
        }
        list.add(string);
        int i145 = TuitionPaymentFragmentbindingInflater1;
        int i146 = (i145 & 119) + (i145 | 119);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i146 % 128;
        int i147 = i146 % 2;
        return ((i132 ^ 6) + ((i132 & 6) << 1)) * i4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = com.midtrans.sdk.corekit.models.UserAddress.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.UserAddress.$$g(byte, byte, byte):java.lang.String");
    }
}
