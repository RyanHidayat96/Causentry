package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFLogger;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1cSDK {
    private static final byte[] $$c = {84, 10, 24, -102};
    private static final int $$d = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {115, 98, 19, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 173;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 19829;
    private static char TuitionPaymentFragmentbindingInflater1 = 31506;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 31932;
    private static char b = 46702;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.appsflyer.internal.AFj1cSDK.$$a
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = 53 - r7
            int r9 = r9 * 52
            int r9 = 55 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1cSDK.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static String getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = g + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            String revenue = getRevenue(messageDigest.digest());
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
            }
            return revenue;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e2);
            return null;
        }
    }

    private static String getRevenue(byte[] bArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = g + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                byte b2 = bArr[i2];
                sb.append(Integer.toString(0, 10).substring(1));
                i2 += 56;
            } else {
                sb.append(Integer.toString((bArr[i2] & UByte.MAX_VALUE) + 256, 16).substring(1));
                i2++;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            g = i4 % 128;
            int i5 = i4 % 2;
        }
        return sb.toString();
    }

    public static byte[] getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        int i2 = g + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] bArrDigest = messageDigest.digest();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            g = i4 % 128;
            int i5 = i4 % 2;
            return bArrDigest;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e2);
            return null;
        }
    }

    public static long getMediationNetwork(byte[] bArr) {
        int i = 2 % 2;
        if (bArr == null) {
            return -1L;
        }
        int i2 = g;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
            if (bArr.length <= 0) {
                return -1L;
            }
        } else if (bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            int i5 = i2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
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
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 117;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i7 = (c3 + i3) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) (47773 - (Process.myPid() >> 22));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 468;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, maximumFlingVelocity, scrollDefaultDelay, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i9 = i4;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 47773), 467 - ExpandableListView.getPackedPositionChild(0L), 13 - View.MeasureSpec.getSize(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i9 + 1;
                    int i10 = $10 + 19;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2322 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf("", "") + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public static String getRevenue(String str, String str2) {
        int i;
        String string;
        Constructor constructor;
        int i2 = 2;
        int i3 = 2 % 2;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            int length = str != null ? str.length() : 0;
            Constructor[] constructorArr = {Class.forName("javax.crypto.spec.SecretKeySpec").getDeclaredConstructor(byte[].class, String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr = new Object[1];
                a(b2, b2, bArr[5], objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iNormalizeMetaState, iIndexOf, 1814927978, false, (String) objArr[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredMethods();
                int length2 = declaredMethods.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    int i7 = i6 % 128;
                    g = i7;
                    int i8 = i6 % i2;
                    Method method = declaredMethods[i5];
                    int i9 = i7 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % i2;
                    try {
                        Object[] objArr2 = new Object[1];
                        c(new char[]{10863, 37386, 48618, 54795, 60695, 2922, 38910, 30816, 29680, 59952, 31415, 42951, 40828, 21903, 55033, 19208, 37098, 34040, 32381, 35665, 35966, 20988, 34214, Typography.nbsp, 20637, 22377}, 23 - TextUtils.lastIndexOf("", '0', i4, i4), objArr2);
                        Class<?> cls = Class.forName((String) objArr2[i4]);
                        Object[] objArr3 = new Object[1];
                        c(new char[]{40266, 45751, 59931, 9464, 33555, 61008, 980, 2422, 25090, 45702, 17313, 54703, 22760, 659}, (Process.myTid() >> 22) + 12, objArr3);
                        int iIntValue = ((Integer) cls.getMethod((String) objArr3[i4], null).invoke(method, null)).intValue();
                        Object[] objArr4 = new Object[1];
                        objArr4[i4] = Integer.valueOf(iIntValue);
                        Object[] objArr5 = new Object[1];
                        c(new char[]{1661, 37995, 9275, 9790, 36518, 61194, 18164, 40098, 19495, 41891, 44486, 61743, 18732, 53023, 1865, 15207, 12150, 26518, 31090, 3645, 44300, 34261, 37960, 42195, 28364, 64303, 13303, 32444}, (ViewConfiguration.getTapTimeout() >> 16) + 26, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[i4]);
                        int iIndexOf2 = 8 - TextUtils.indexOf("", "", i4, i4);
                        Object[] objArr6 = new Object[1];
                        c(new char[]{22577, 39556, 50241, 14645, 57047, 48654, 9548, 45685, 59450, 41294}, iIndexOf2, objArr6);
                        if (((Boolean) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, objArr4)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr7 = new Object[1];
                            c(new char[]{10863, 37386, 48618, 54795, 60695, 2922, 38910, 30816, 29680, 59952, 31415, 42951, 40828, 21903, 55033, 19208, 37098, 34040, 32381, 35665, 35966, 20988, 34214, Typography.nbsp, 20637, 22377}, 24 - View.combineMeasuredStates(0, 0), objArr7);
                            Class<?> cls4 = Class.forName((String) objArr7[0]);
                            Object[] objArr8 = new Object[1];
                            c(new char[]{52397, 25114, 28032, 34106, 26425, 8602, 43198, 32422, 3439, 7902, 29917, 513, 48648, 9445, 48962, 13423}, 13 - TextUtils.getOffsetAfter("", 0), objArr8);
                            if (cls3.equals(cls4.getMethod((String) objArr8[0], null).invoke(method, null))) {
                                Object[] objArr9 = new Object[1];
                                c(new char[]{10863, 37386, 48618, 54795, 60695, 2922, 38910, 30816, 29680, 59952, 31415, 42951, 40828, 21903, 55033, 19208, 37098, 34040, 32381, 35665, 35966, 20988, 34214, Typography.nbsp, 20637, 22377}, 24 - (ViewConfiguration.getTouchSlop() >> 8), objArr9);
                                Class<?> cls5 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                c(new char[]{20261, 35287, 50949, 22886, 42550, 58010, 9784, 51664, 12228, 41920, 28226, 27521, 45053, 57424, 21385, 11163, 2032, 44800, 55271, 37783}, KeyEvent.normalizeMetaState(0) + 17, objArr10);
                                Object[] objArr11 = (Object[]) cls5.getMethod((String) objArr10[0], null).invoke(method, null);
                                if (objArr11.length == 2 && !(!Long.TYPE.equals(objArr11[0]))) {
                                    Object[] objArr12 = new Object[1];
                                    c(new char[]{10863, 37386, 48618, 54795, 60695, 2922, 38910, 30816, 29680, 59952, 31415, 42951, 40828, 21903, 55033, 19208, 37098, 34040, 32381, 35665, 35966, 20988, 34214, Typography.nbsp, 20637, 22377}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, objArr12);
                                    if (Class.forName((String) objArr12[0]).equals(objArr11[1])) {
                                        int i11 = g + 69;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                        int i12 = i11 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cGreen = (char) Color.green(0);
                                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
                                            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0);
                                            byte[] bArr2 = $$a;
                                            byte b3 = bArr2[7];
                                            Object[] objArr13 = new Object[1];
                                            a(b3, b3, bArr2[5], objArr13);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iKeyCodeFromString, iLastIndexOf, 1814927978, false, (String) objArr13[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int threadPriority = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                            byte[] bArr3 = $$a;
                                            byte b4 = bArr3[7];
                                            Object[] objArr14 = new Object[1];
                                            a(b4, b4, bArr3[5], objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, threadPriority, iResolveSizeAndState, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        try {
                                            Object[] objArr15 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                int iMyPid = 2823 - (Process.myPid() >> 22);
                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                                                byte[] bArr4 = $$a;
                                                Object[] objArr16 = new Object[1];
                                                a(bArr4[5], bArr4[2], bArr4[7], objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iMyPid, iLastIndexOf2, -2137287382, false, (String) objArr16[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr15)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i5++;
                        i2 = 2;
                        i4 = 0;
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
                char size = (char) View.MeasureSpec.getSize(0);
                int iAlpha = 2823 - Color.alpha(0);
                int i13 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr5 = $$a;
                byte b5 = bArr5[7];
                Object[] objArr17 = new Object[1];
                a(b5, b5, bArr5[5], objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, iAlpha, i13, 1814927978, false, (String) objArr17[0], null);
            }
            try {
                Object[] objArr18 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                    int iMyTid = 22 - (Process.myTid() >> 22);
                    byte[] bArr6 = $$a;
                    Object[] objArr19 = new Object[1];
                    a(bArr6[5], (byte) 14, bArr6[7], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, scrollBarSize, iMyTid, 1025296417, false, (String) objArr19[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr18);
                try {
                    Object[] objArr20 = {0, constructorArr, null};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37656);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2720;
                        int iCombineMeasuredStates = 19 - View.combineMeasuredStates(0, 0);
                        byte[] bArr7 = $$a;
                        Object[] objArr21 = new Object[1];
                        a(bArr7[5], (byte) (-bArr7[33]), bArr7[7], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iResolveOpacity, iCombineMeasuredStates, 865785343, false, (String) objArr21[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
                    long j = 868231738;
                    long j2 = -575;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = 576;
                    long j5 = -1;
                    long j6 = j ^ j5;
                    long j7 = jLongValue ^ j5;
                    long j8 = (j6 | j7) ^ j5;
                    int i14 = length;
                    long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    long j9 = j3 + ((j8 | ((j7 | jFreeMemory) ^ j5)) * j4) + (((((j7 | (jFreeMemory ^ j5)) | j) ^ j5) | ((j6 | jLongValue) ^ j5)) * j4) + (j4 * j8) + ((long) (-1892287360));
                    int iMyTid2 = Process.myTid();
                    int i15 = (-818885110) + (((~(1897755779 | iMyTid2)) | (-2034070996) | (~(959985105 | iMyTid2))) * (-880));
                    int i16 = (~(1897755779 | (~iMyTid2))) | (-959985106);
                    int i17 = ~(iMyTid2 | (-1897755780));
                    int i18 = ((int) (j9 >> 32)) & (i15 + ((i16 | i17) * (-880)) + (i17 * 880));
                    int i19 = (int) j9;
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i20 = i18 | (i19 & ((((~(1043627280 | iUptimeMillis)) | 692168073) * 398) + 195508677 + (((~((~iUptimeMillis) | 1043627280)) | 692168073) * 398)));
                    int i21 = i20 >>> 24;
                    int i22 = i20 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i21 != 0) {
                        int i23 = g + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                        int i24 = i23 % 2;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i25 = (i ^ 1) ^ 1;
                    if (i == 0 || i22 >= 1 || (constructor = constructorArr[i22]) == null) {
                        string = null;
                    } else {
                        int i26 = g + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        if (i26 % 2 != 0) {
                            constructor.toString();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        string = constructor.toString();
                    }
                    arrayList.add(string);
                    if ((i21 + 6) * i25 != 0) {
                        throw new RuntimeException(String.valueOf(i14));
                    }
                    mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
                    String lowerCase = getRevenue(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
                    int i27 = g + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 12 / 0;
                    }
                    return lowerCase;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2, true);
            return e2.getMessage();
        }
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFc1pSDK aFc1pSDK) throws IllegalStateException {
        int i = 2 % 2;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                int i3 = i2 % 128;
                g = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String strComponent1 = AFc1pSDK.component1();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(strComponent1);
        return getRevenue(sb.toString(), AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork)).equals(str2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = 108 - r6
            byte[] r0 = com.appsflyer.internal.AFj1cSDK.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1cSDK.$$e(short, int, byte):java.lang.String");
    }
}
