package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f822a;
    private static char[] b;
    private long clickTimestamp;
    private String deepLink;
    private String dynamicLink;
    private Bundle extensionBundle;
    private int minVersion;
    private Uri redirectUrl;
    private static final byte[] $$c = {15, -9, 64, -81};
    private static final int $$f = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {39, 27, 2, 54, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -57, -6, -6, 69, -51, -20, 1, 12, 58, -51, -15, 7, 59, -69, 10, 2, -7, 5, -5, 64, -36, -19, -17, 7, 12, 2, -19, 11, -6, 1, 44, -45, -6, 7, 10, 17, -18, -13, -4, 13, 6, -2, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
    private static final int $$e = 193;
    private static final byte[] $$a = {110, -73, -111, 99, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 76;
    private static int d = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = r6 + 1
            int r8 = r8 + 4
            byte[] r0 = com.google.firebase.dynamiclinks.internal.DynamicLinkData.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.internal.DynamicLinkData.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 60
            int r7 = 63 - r7
            byte[] r0 = com.google.firebase.dynamiclinks.internal.DynamicLinkData.$$d
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r6 = r6 * 8
            int r1 = r6 + 53
            byte[] r1 = new byte[r1]
            int r6 = r6 + 52
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
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
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L31:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.internal.DynamicLinkData.f(int, short, short, java.lang.Object[]):void");
    }

    public String getDynamicLink() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 43;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dynamicLink;
        int i4 = i2 + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setDynamicLink(String str) {
        int i = 2 % 2;
        int i2 = d + 53;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.dynamicLink = str;
        int i5 = i3 + 57;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getDeepLink() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.deepLink;
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setDeepLink(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.deepLink = str;
        int i5 = i2 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMinVersion() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.minVersion;
        int i5 = i2 + 19;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setMinVersion(int i) {
        int i2 = 2 % 2;
        int i3 = d + 117;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.minVersion = i;
        int i6 = i4 + 9;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public long getClickTimestamp() {
        int i = 2 % 2;
        int i2 = d + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.clickTimestamp;
        }
        throw null;
    }

    public void setClickTimestamp(long j) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.clickTimestamp = j;
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 31339), 2994 - Color.blue(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 11;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0', 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 253, 22 - KeyEvent.keyCodeFromString(""), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - TextUtils.indexOf("", "")), 3085 - (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i6 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $10 + 13;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 83;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16810818), 3085 - TextUtils.indexOf("", "", 0, 0), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x020c  */
    /* JADX WARN: Code duplicated, block: B:27:0x020e  */
    public Bundle getExtensionBundle() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int gidForName = Process.getGidForName("") + 922;
            int i2 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, gidForName, i2, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int maximumFlingVelocity2 = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i3 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, maximumFlingVelocity2, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) (31533 - Color.alpha(0));
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                int i5 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b3 = (byte) (bArr3[17] + 1);
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b3, b4, (byte) (b4 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, i4, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1173713855 + (((~(1438510735 | iIdentityHashCode)) | 335568908) * (-756)) + (((~iIdentityHashCode) | 1438510735) * 756) + 1964186617;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = asBinder + 59;
                    d = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 59 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(null, null, TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = d + 57;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1964186617};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[28];
                Object[] objArr13 = new Object[1];
                f(b5, b5, bArr4[9], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[9];
                Object[] objArr14 = new Object[1];
                f(b6, b6, bArr4[28], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                    int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                    byte[] bArr5 = $$a;
                    byte b7 = (byte) (bArr5[17] + 1);
                    byte b8 = bArr5[7];
                    Object[] objArr16 = new Object[1];
                    c(b7, b8, (byte) (b8 | 50), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, doubleTapTimeout, iKeyCodeFromString, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(null, null, 175 - AndroidCharacter.getMirror('0'), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec2 = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int packedPositionChild = 920 - ExpandableListView.getPackedPositionChild(0L);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                        byte[] bArr6 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, bArr6[7], bArr6[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec2, packedPositionChild, iResolveSizeAndState, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int defaultSize = 921 - View.getDefaultSize(0, 0);
                        int iRed = 28 + Color.red(0);
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        c(b9, b9, bArr7[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, defaultSize, iRed, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i15 + 709982763 + (((~((-67112737) | (~iIdentityHashCode2))) | (~(1706966907 | iIdentityHashCode2))) * (-272)) + (((~((-632438627) | iIdentityHashCode2)) | 565325890) * (-272)) + (((~(iIdentityHashCode2 | 632438626)) | 1141641017) * 272);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i20 = ~iMaxMemory;
            int i21 = i19 + 2028655102 + ((858839625 | i20) * (-757)) + ((~((-76358675) | iMaxMemory)) * 1514) + (((~(iMaxMemory | 935198299)) | (~(i20 | (-915240019))) | 838881344) * 757);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr22[0])[0] = i23 ^ (i23 << 5);
        }
        Bundle bundle = this.extensionBundle;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        int i24 = d + 81;
        asBinder = i24 % 128;
        int i25 = i24 % 2;
        return bundle2;
    }

    public void setRedirectUrl(Uri uri) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.redirectUrl = uri;
        int i5 = i2 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public Uri getRedirectUrl() {
        int i = 2 % 2;
        int i2 = d + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Uri uri = this.redirectUrl;
        int i4 = i3 + 35;
        d = i4 % 128;
        int i5 = i4 % 2;
        return uri;
    }

    public void setExtensionData(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.extensionBundle = bundle;
        int i5 = i3 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        f822a = 1;
        TuitionPaymentFragmentbindingInflater1();
        CREATOR = new DynamicLinkDataCreator();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        f822a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLinkData(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.dynamicLink = str;
        this.deepLink = str2;
        this.minVersion = i;
        this.clickTimestamp = j;
        this.extensionBundle = bundle;
        this.redirectUrl = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        d = i3 % 128;
        int i4 = i3 % 2;
        DynamicLinkDataCreator.writeToParcel(this, parcel, i);
        int i5 = d + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{47294, 47281, 47291, 47277, 47280, 47286, 47217, 47276, 47244, 47270, 47275, 47290, 47282, 47260, 47283, 47292, 47284, 47279, 47245, 47262, 47273, 47243, 47287, 47274, 47285, 47288, 47255};
        TuitionPaymentFragmentbindingInflater1 = 2047719519;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.google.firebase.dynamiclinks.internal.DynamicLinkData.$$c
            int r9 = r9 + 67
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2c
        L14:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.internal.DynamicLinkData.$$g(int, short, byte):java.lang.String");
    }
}
