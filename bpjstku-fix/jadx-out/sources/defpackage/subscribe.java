package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.midtrans.sdk.corekit.core.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class subscribe {
    private static String TuitionPaymentFragmentbindingInflater1 = "a";
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 149;
    private static final byte[] $$a = {109, 7, 114, -90, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 84;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2478846282913596214L;

    private static void a(byte b, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i = 4 - (b2 * 4);
        int i2 = s * 3;
        int i3 = (b * 2) + 103;
        byte[] bArr2 = new byte[14 - i2];
        int i4 = 13 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (-bArr[i]) + i3;
            i++;
            i5 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.subscribe.$$d
            int r6 = r6 + 84
            int r5 = r5 * 52
            int r1 = r5 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.subscribe.b(int, byte, short, java.lang.Object[]):void");
    }

    public static String TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/stat"));
            String[] strArrSplit = bufferedReader.readLine().split("[ ]+", 9);
            long j = Long.parseLong(strArrSplit[1]) + Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]);
            long j2 = Long.parseLong(strArrSplit[4]);
            long j3 = Long.parseLong(strArrSplit[5]);
            long j4 = Long.parseLong(strArrSplit[6]);
            long j5 = Long.parseLong(strArrSplit[7]);
            bufferedReader.close();
            float fRound = (Math.round((100 * j) / ((((j2 + j) + j3) + j4) + j5)) * 100) / 100;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(fRound));
            sb.append("%");
            String string = sb.toString();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        } catch (Exception e2) {
            String str = TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb2 = new StringBuilder("cpu:");
            sb2.append(e2.getMessage());
            Logger.e(str, sb2.toString());
            return "0";
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 119;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64838), KeyEvent.normalizeMetaState(0) + 1356, 37 - Process.getGidForName(""), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47773), 468 - TextUtils.getOffsetAfter("", 0), 13 - View.combineMeasuredStates(0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x04f0  */
    public static String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        Method method;
        int i3 = 2 % 2;
        String[] strArr = new String[2];
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b = (byte) 0;
        byte b2 = b;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b, b2, b3, objArr);
        Method method2 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        a(b, b2, b3, objArr2);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iArgb = 2823 - Color.argb(0, 0, 0, 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            Object[] objArr3 = new Object[1];
            b(b4, bArr[7], b4, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iArgb, offsetAfter, 1814927978, false, (String) objArr3[0], null);
        }
        long j = 0;
        int i4 = 16;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") + 2823, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                Method method3 = declaredMethods[i7];
                try {
                    Object[] objArr4 = new Object[1];
                    c(new char[]{1593, 46260, 27649, 21718, 1619, 40325, 16087, 12103, 41815, 31304, 39808, 30088, 19678, 51018, 61779, 37571, 59807, 44488, 11780, 16133, 37709, 2762, 35820, 17475, 15373, 55116, 57486, 57986}, (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1, objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[0]);
                    char[] cArr = new char[i4];
                    // fill-array-data instruction
                    cArr[0] = 50637;
                    cArr[1] = 31387;
                    cArr[2] = 7381;
                    cArr[3] = 30026;
                    cArr[4] = 50602;
                    cArr[5] = 21422;
                    cArr[6] = 19969;
                    cArr[7] = 3831;
                    cArr[8] = 24802;
                    cArr[9] = 46191;
                    cArr[10] = 60252;
                    cArr[11] = 21532;
                    cArr[12] = 36644;
                    cArr[13] = 2350;
                    cArr[14] = 33159;
                    cArr[15] = 45897;
                    Object[] objArr5 = new Object[1];
                    c(cArr, TextUtils.lastIndexOf("", '0') + 1, objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method3, null)).intValue())};
                    Object[] objArr7 = new Object[1];
                    c(new char[]{19529, 26072, Typography.doublePrime, 12938, 19491, 19689, 29413, 18715, 59687, 43812, 55218, 5076, 1710, 5670, 48481, 62623, 41967, 31908, 25142, 22873, 55613, 56230, 51166, 8725, 30317, 1569, 44213, 34003, 37804, 28026}, TextUtils.getTrimmedLength(""), objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    c(new char[]{25929, 51728, 58728, 55772, 25888, 58163, 46982, 41549, 49277, 1257, 4862, 63625}, View.combineMeasuredStates(0, 0), objArr8);
                    if (!(!((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue())) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        c(new char[]{1593, 46260, 27649, 21718, 1619, 40325, 16087, 12103, 41815, 31304, 39808, 30088, 19678, 51018, 61779, 37571, 59807, 44488, 11780, 16133, 37709, 2762, 35820, 17475, 15373, 55116, 57486, 57986}, TextUtils.indexOf("", ""), objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        c(new char[]{56674, 10046, 1355, 2593, 56581, 3595, 22431, 29059, 30791, 59866, 62174, 11107, 38796, 21690, 38930, 52257, 12999}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
                        if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method3, null))) {
                            Object[] objArr11 = new Object[1];
                            c(new char[]{1593, 46260, 27649, 21718, 1619, 40325, 16087, 12103, 41815, 31304, 39808, 30088, 19678, 51018, 61779, 37571, 59807, 44488, 11780, 16133, 37709, 2762, 35820, 17475, 15373, 55116, 57486, 57986}, Drawable.resolveOpacity(0, 0), objArr11);
                            Class<?> cls7 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            c(new char[]{7331, 30536, 17315, 42992, 7364, 24189, 4471, 56400, 47490, 47530, 46114, 34477, 22086, 1260, 57062, 25074, 62263, 28193, 435, 52261, 35280}, Color.argb(0, 0, 0, 0), objArr12);
                            Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method3, null);
                            if (objArr13.length == 2) {
                                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                int i9 = i8 % 2;
                                if (Long.TYPE.equals(objArr13[0])) {
                                    Object[] objArr14 = new Object[1];
                                    c(new char[]{1593, 46260, 27649, 21718, 1619, 40325, 16087, 12103, 41815, 31304, 39808, 30088, 19678, 51018, 61779, 37571, 59807, 44488, 11780, 16133, 37709, 2762, 35820, 17475, 15373, 55116, 57486, 57986}, Color.alpha(0), objArr14);
                                    if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                            int size = View.MeasureSpec.getSize(0) + 2823;
                                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                            byte[] bArr2 = $$d;
                                            byte b5 = bArr2[5];
                                            Object[] objArr15 = new Object[1];
                                            b(b5, bArr2[7], b5, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, size, maxKeyCode, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                                            int i10 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            byte b6 = bArr3[5];
                                            Object[] objArr16 = new Object[1];
                                            b(b6, bArr3[7], b6, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, maximumDrawingCacheSize, i10, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        try {
                                            Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2823;
                                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                                byte[] bArr4 = $$d;
                                                byte b7 = bArr4[7];
                                                Object[] objArr18 = new Object[1];
                                                b(b7, bArr4[10], b7, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, scrollDefaultDelay, longPressTimeout, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                            break;
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
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    i4 = 16;
                    j = 0;
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
            char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iIndexOf = TextUtils.indexOf("", "") + 2823;
            int gidForName = 21 - Process.getGidForName("");
            byte[] bArr5 = $$d;
            byte b8 = bArr5[5];
            Object[] objArr19 = new Object[1];
            b(b8, bArr5[7], b8, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize2, iIndexOf, gidForName, 1814927978, false, (String) objArr19[0], null);
        }
        Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2823;
            int iAlpha = Color.alpha(0) + 22;
            byte b9 = $$d[7];
            byte b10 = b9;
            Object[] objArr21 = new Object[1];
            b(b10, (byte) (b10 | 14), b9, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, offsetAfter2, iAlpha, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
        Object[] objArr22 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cAlpha = (char) (Color.alpha(0) + 37657);
            int iMyTid = 2720 - (Process.myTid() >> 22);
            int i11 = 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b11 = $$d[7];
            byte b12 = b11;
            Object[] objArr23 = new Object[1];
            b(b12, (byte) (b12 | 14), b11, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, iMyTid, i11, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
        long j2 = 231930660;
        long j3 = -496;
        long j4 = (j3 * j2) + (j3 * jLongValue);
        long j5 = 497;
        long j6 = -1;
        long j7 = j2 ^ j6;
        long j8 = jLongValue ^ j6;
        long j9 = j7 | j8;
        long j10 = (int) Runtime.getRuntime().totalMemory();
        long j11 = j10 ^ j6;
        long j12 = j4 + ((j9 ^ j6) * j5) + ((((j9 | j10) ^ j6) | (((j8 | j11) | j2) ^ j6)) * j5) + (j5 * ((j6 ^ ((j8 | j2) | j10)) | ((j7 | j11) ^ j6) | ((j7 | jLongValue) ^ j6))) + ((long) (-2042336505));
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i12 = ((int) (j12 >> 32)) & (((((~((-173929353) | elapsedCpuTime)) | 1091670442) * 262) - 1685593678) + (((~((~elapsedCpuTime) | (-173929353))) | 1091670442) * 262));
        int i13 = (int) Runtime.getRuntime().totalMemory();
        int i14 = 1747070571 + ((1376359497 | i13) * 614);
        int i15 = ~i13;
        int i16 = i12 | (((int) j12) & (i14 + (((~((-1043237648) | i15)) | 302546953 | (~(1814503238 | i15))) * (-1228)) + (((~(i15 | 2117050191)) | (~((-740690695) | i15))) * 614)));
        int i17 = i16 >>> 24;
        int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
        if (i17 != 0) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            i = 2;
            int i20 = i19 % 2;
            z = true;
        } else {
            i = 2;
            z = false;
        }
        if (z) {
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            int i22 = i21 % i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i24 = i23 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
            if (i24 % i != 0) {
                int i25 = 76 / 0;
                if (i18 < i) {
                    method = methodArr[i18];
                    if (method != null) {
                        int i26 = i23 + 89;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        int i27 = i26 % i;
                        string = method.toString();
                    }
                }
            } else if (i18 < i) {
                method = methodArr[i18];
                if (method != null) {
                    int i28 = i23 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                    int i29 = i28 % i;
                    string = method.toString();
                }
            }
            string = null;
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i17 + 6) * i2 != 0) {
            new int[0][-1] = 1;
            int i30 = 0 % 2;
            Toast.makeText((Context) null, 1, 1).show();
        }
        try {
            String str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
            strArr[0] = activity.getApplication().getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
            strArr[1] = str;
            return strArr;
        } catch (Exception e2) {
            String str2 = TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("appinfo:");
            sb.append(e2.getMessage());
            Logger.d(str2, sb.toString());
            return strArr;
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1(TelephonyManager telephonyManager) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return telephonyManager.getDataNetworkType();
            }
            telephonyManager.getDataNetworkType();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, int r8, byte r9) {
        /*
            int r9 = r9 * 4
            int r9 = 107 - r9
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = defpackage.subscribe.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.subscribe.$$g(int, int, byte):java.lang.String");
    }
}
