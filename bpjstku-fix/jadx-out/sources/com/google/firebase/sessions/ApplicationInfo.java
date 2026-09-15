package com.google.firebase.sessions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015"}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "", "p0", "p1", "p2", "p3", "Lcom/google/firebase/sessions/LogEnvironment;", "p4", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/LogEnvironment;", "component6", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)Lcom/google/firebase/sessions/ApplicationInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", RemoteConfigConstants.RequestFieldKey.APP_ID, "Ljava/lang/String;", "getAppId", "deviceModel", "getDeviceModel", "sessionSdkVersion", "getSessionSdkVersion", "osVersion", "getOsVersion", "logEnvironment", "Lcom/google/firebase/sessions/LogEnvironment;", "getLogEnvironment", "androidAppInfo", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAndroidAppInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplicationInfo {
    private final AndroidApplicationInfo androidAppInfo;
    private final String appId;
    private final String deviceModel;
    private final LogEnvironment logEnvironment;
    private final String osVersion;
    private final String sessionSdkVersion;
    private static final byte[] $$c = {51, -99, -8, -59};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {56, 94, 119, -19, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, 67, -8, 23, -11, 17, -5, -4, 15, -58, 57, 16, 1, 7, 7, -64, 75, 3, -7, 7, 1, 15, -7, 0, 18, -65, 35, 24, 23, -11, 17, -5, -4, 15, -36, 57, -7, -9, 16, 0, -2, -28, 48, 1, 7, 7, 5, -75, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -44, 9, -1, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
    private static final int $$e = 38;
    private static final byte[] $$a = {15, -9, 64, -81, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 144;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 13951;
    private static char b = 35883;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 58846;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 22639;

    private static void a(int i, int i2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = (s * 14) + 84;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i3 + (-i4)) - 10;
            i4 = i4;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i6;
            i3 = (i3 + (-bArr[i7])) - 10;
            i4 = i7;
        }
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
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 40
            int r0 = r8 + 53
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r1 = com.google.firebase.sessions.ApplicationInfo.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 52
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-4)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.ApplicationInfo.e(short, byte, short, java.lang.Object[]):void");
    }

    public ApplicationInfo(String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(logEnvironment, "");
        Intrinsics.checkNotNullParameter(androidApplicationInfo, "");
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidApplicationInfo;
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = d + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.appId;
        int i4 = i3 + 83;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return str;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 41;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i4;
                int i8 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char fadingEdgeLength = (char) (47773 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i10, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myTid() >> 22) + 47773), 468 - Color.blue(0), 13 - Color.alpha(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i7 + 1;
                    int i12 = $10 + 53;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 2323, 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final String getDeviceModel() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
            int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
            int iBlue = Color.blue(0) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[37], bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, bitsPerPixel, iBlue, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{57339, 53900, 56988, 53629, 5366, 59259, 47653, 7970, 32524, 3739, 63372, 20788, 21026, 22066, 15939, 14135, 40779, 27841, 6538, 65136, 16372, 33138, 48220, 49545}, 22 - TextUtils.getOffsetBefore("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{17812, 11174, 62046, 60540, 15010, 48066, 3900, 55672, 4211, 52849, 53060, 40870, 10445, 58896, 3736, 14414, 38153, 40790}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
            int iIndexOf = TextUtils.indexOf("", "") + 921;
            int bitsPerPixel2 = 27 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            Object[] objArr5 = new Object[1];
            a(b2, (byte) (b2 & 52), bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iIndexOf, bitsPerPixel2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                int i2 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b3 = (byte) (bArr3[17] + 1);
                byte b4 = bArr3[80];
                Object[] objArr6 = new Object[1];
                a((byte) 51, b3, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionGroup, i2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i3}, (String[]) objArr7[4]};
            int i4 = ~new Random().nextInt(1981939883);
            int i5 = ((308058175 + ((~((-338709532) | i4)) * (-783))) + (((~(i4 | 1254851200)) | (-519228444)) * 783)) - 2146212819;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{49778, 42193, 53594, 45057, 4144, 39701, 682, 26841, 2906, 26620, 3230, 2952, 899, 6739, 19449, 1793, 11652, 52204, 39434, 11806, 38208, 30831, 42116, 44119, 53357, 57453, 47529, 22375}, (Process.myTid() >> 22) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{47453, 44288, 4016, 15760, 62759, 47380, 49873, 57160, 50782, 15476, 62661, 46325, 10514, 44861, 8822, 17665, 32156, 20066, 41891, 60245}, 18 - Color.alpha(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                d = i8 % 128;
                int i9 = i8 % 2;
                if (!(!(applicationContext instanceof ContextWrapper)) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i10 = d + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    int i11 = i10 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{16544, 9052, 31693, 47771, 63926, 65334, 15831, 35385, 53167, 45253, 27616, 52895, 51766, 21051, 38000, 31543, 12669, 9412}, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{1288, 57654, 57555, 30616, 23325, 56337, 45813, 16610, 62589, 61286, 62304, 60601, 36480, 36411, 14966, 6038, 37140, 40600}, ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -2146212819};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[18];
                Object[] objArr13 = new Object[1];
                e(b5, bArr4[20], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[44];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                e(b7, (byte) (b7 | 91), b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                    int iArgb = 921 - Color.argb(0, 0, 0, 0);
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) 51, (byte) (bArr5[17] + 1), bArr5[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iArgb, tapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{57339, 53900, 56988, 53629, 5366, 59259, 47653, 7970, 32524, 3739, 63372, 20788, 21026, 22066, 15939, 14135, 40779, 27841, 6538, 65136, 16372, 33138, 48220, 49545}, Drawable.resolveOpacity(0, 0) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{17812, 11174, 62046, 60540, 15010, 48066, 3900, 55672, 4211, 52849, 53060, 40870, 10445, 58896, 3736, 14414, 38153, 40790}, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                        int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[37];
                        Object[] objArr19 = new Object[1];
                        a(b8, (byte) (b8 & 52), bArr6[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, longPressTimeout, maximumFlingVelocity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int iGreen = Color.green(0) + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr7[37], bArr7[80], bArr7[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, tapTimeout2, iGreen, -1048449946, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i15}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i16 = ~elapsedCpuTime;
            int i17 = i14 + 81443043 + (((~((-992750582) | i16)) | 704651940) * 168) + ((~((-704651941) | elapsedCpuTime)) * 168) + (((~(elapsedCpuTime | (-288098642))) | (~(i16 | (-781329063))) | 76677122) * 168);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = 0;
                while (i20 < strArr.length) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                    d = i21 % 128;
                    if (i21 % 2 == 0) {
                        arrayList.add(strArr[i20]);
                        i20 += 42;
                    } else {
                        arrayList.add(strArr[i20]);
                        i20++;
                    }
                }
            }
            int[] iArr = new int[i13];
            int i22 = i13 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i25 = i23 + 413785123 + (((~(326207221 | iMyPid)) | (-1467860984) | (~(1447872422 | iMyPid))) * (-744)) + (((~iMyPid) | 306218660) * 744) + ((iMyPid | 1467860983) * 744);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        }
        return this.deviceModel;
    }

    public final String getSessionSdkVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.sessionSdkVersion;
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOsVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 83;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.osVersion;
        int i4 = i2 + 7;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final LogEnvironment getLogEnvironment() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 123;
        d = i3 % 128;
        int i4 = i3 % 2;
        LogEnvironment logEnvironment = this.logEnvironment;
        int i5 = i2 + 31;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return logEnvironment;
    }

    public final AndroidApplicationInfo getAndroidAppInfo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 29;
        d = i3 % 128;
        int i4 = i3 % 2;
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo;
        int i5 = i2 + 109;
        d = i5 % 128;
        int i6 = i5 % 2;
        return androidApplicationInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i, Object obj) {
        String str5;
        String str6;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        String str7 = (i & 1) != 0 ? applicationInfo.appId : str;
        if ((i & 2) != 0) {
            int i6 = i4 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            str5 = applicationInfo.deviceModel;
        } else {
            str5 = str2;
        }
        String str8 = (i & 4) != 0 ? applicationInfo.sessionSdkVersion : str3;
        if ((i & 8) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            d = i8 % 128;
            int i9 = i8 % 2;
            str6 = applicationInfo.osVersion;
        } else {
            str6 = str4;
        }
        return applicationInfo.copy(str7, str5, str8, str6, (i & 16) != 0 ? applicationInfo.logEnvironment : logEnvironment, (i & 32) != 0 ? applicationInfo.androidAppInfo : androidApplicationInfo);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 45;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appId;
        int i5 = i2 + 57;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 7;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.deviceModel;
        int i4 = i2 + 73;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sessionSdkVersion;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = d + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.osVersion;
        int i5 = i3 + 117;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LogEnvironment component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logEnvironment;
        }
        throw null;
    }

    public final AndroidApplicationInfo component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.androidAppInfo;
        }
        throw null;
    }

    public final ApplicationInfo copy(String p0, String p1, String p2, String p3, LogEnvironment p4, AndroidApplicationInfo p5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        ApplicationInfo applicationInfo = new ApplicationInfo(p0, p1, p2, p3, p4, p5);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return applicationInfo;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ApplicationInfo)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            d = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) p0;
        if (!Intrinsics.areEqual(this.appId, applicationInfo.appId)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            d = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.deviceModel, applicationInfo.deviceModel)) {
            return Intrinsics.areEqual(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && Intrinsics.areEqual(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && Intrinsics.areEqual(this.androidAppInfo, applicationInfo.androidAppInfo);
        }
        int i5 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        return i5 % 2 != 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
        int i4 = d + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ApplicationInfo(appId=");
        sb.append(this.appId);
        sb.append(", deviceModel=");
        sb.append(this.deviceModel);
        sb.append(", sessionSdkVersion=");
        sb.append(this.sessionSdkVersion);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append(", logEnvironment=");
        sb.append(this.logEnvironment);
        sb.append(", androidAppInfo=");
        sb.append(this.androidAppInfo);
        sb.append(')');
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 108 - r6
            byte[] r0 = com.google.firebase.sessions.ApplicationInfo.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.ApplicationInfo.$$g(int, byte, byte):java.lang.String");
    }
}
