package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class getCameraIds {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static final CameraInfoInternal TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char b;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 86;
    private static final byte[] $$a = {25, 5, -88, -44, -2, 15, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 104;
    private static int asInterface = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraInfoInternal("PhoneskyVerificationUtils");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b2 * 2) + 103;
        int i3 = b3 * 3;
        int i4 = 4 - (i * 3);
        byte[] bArr2 = new byte[i3 + 14];
        int i5 = i3 + 13;
        int i6 = -1;
        if (bArr == null) {
            i2 = i4 + i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            int i8 = i4 + 1;
            i2 = i7 + bArr[i4];
            i4 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getCameraIds.$$d
            int r8 = r8 + 4
            int r9 = r9 * 52
            int r9 = r9 + 1
            int r7 = 103 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCameraIds.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:138:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x05ef  */
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) throws Throwable {
        String string;
        Method method;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b2 = (byte) 0;
        byte b3 = b2;
        byte b4 = b3;
        Object[] objArr = new Object[1];
        a(b2, b3, b4, objArr);
        Method method2 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        a(b2, b3, b4, objArr2);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        char c = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
            int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$d;
            byte b5 = bArr[10];
            byte b6 = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b5, (byte) (-b6), b6, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iIndexOf, keyRepeatTimeout, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 2824, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i2 = 0;
            while (i2 < length) {
                Method method3 = declaredMethods[i2];
                try {
                    Object[] objArr4 = new Object[1];
                    d(new char[]{'\r', 17, '\n', 15, 1, '\b', '\r', 28, 14, 5, '!', 22, 19, 6, 18, 3, 2, '\b', 3, 27, Typography.quote, '\b', 4, 2}, (byte) (92 - TextUtils.indexOf("", "", 0)), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    d(new char[]{15, 23, '!', Typography.quote, 4, 2, 24, 23, 27, 23, 4, Typography.quote}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 57), 12 - (Process.myPid() >> 22), objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method3, null)).intValue())};
                    Object[] objArr7 = new Object[1];
                    d(new char[]{'\r', 17, '\n', 15, 1, '\b', '\r', 28, 14, 5, '!', 22, 19, 6, 18, 3, 2, '\b', 3, '\t', 5, 25, 23, 24, 22, '!'}, (byte) (97 - TextUtils.lastIndexOf("", c, 0)), TextUtils.getTrimmedLength("") + 26, objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[0]);
                    char[] cArr = {24, 29, Typography.quote, '\r', '#', 26, 15, 27};
                    byte windowTouchSlop = (byte) (123 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iLastIndexOf = 7 - TextUtils.lastIndexOf("", c);
                    Object[] objArr8 = new Object[1];
                    d(cArr, windowTouchSlop, iLastIndexOf, objArr8);
                    if (!(!((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue())) {
                        int i3 = g + 7;
                        asInterface = i3 % 128;
                        int i4 = i3 % 2;
                        Class cls5 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        d(new char[]{'\r', 17, '\n', 15, 1, '\b', '\r', 28, 14, 5, '!', 22, 19, 6, 18, 3, 2, '\b', 3, 27, Typography.quote, '\b', 4, 2}, (byte) (92 - Color.blue(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(new char[]{15, 23, '#', 20, 20, '!', 22, ' ', 28, 19, 7, 18, 13894}, (byte) (71 - (ViewConfiguration.getLongPressTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, objArr10);
                        if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method3, null))) {
                            Object[] objArr11 = new Object[1];
                            d(new char[]{'\r', 17, '\n', 15, 1, '\b', '\r', 28, 14, 5, '!', 22, 19, 6, 18, 3, 2, '\b', 3, 27, Typography.quote, '\b', 4, 2}, (byte) (92 - (ViewConfiguration.getScrollBarSize() >> 8)), 24 - TextUtils.getTrimmedLength(""), objArr11);
                            Class<?> cls7 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(new char[]{15, 23, '!', 30, 22, 4, 17, 16, 20, '!', 22, '!', 18, '\n', 20, 22, 13868}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 68), Process.getGidForName("") + 18, objArr12);
                            Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method3, null);
                            if (objArr13.length == 2) {
                                int i5 = asInterface + 75;
                                g = i5 % 128;
                                int i6 = i5 % 2;
                                if (!Long.TYPE.equals(objArr13[0])) {
                                    continue;
                                } else {
                                    int i7 = g + 91;
                                    asInterface = i7 % 128;
                                    int i8 = i7 % 2;
                                    Object[] objArr14 = new Object[1];
                                    d(new char[]{'\r', 17, '\n', 15, 1, '\b', '\r', 28, 14, 5, '!', 22, 19, 6, 18, 3, 2, '\b', 3, 27, Typography.quote, '\b', 4, 2}, (byte) (92 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 24 - View.MeasureSpec.getMode(0), objArr14);
                                    if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                        int i9 = asInterface + 63;
                                        g = i9 % 128;
                                        int i10 = i9 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 2824;
                                            int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0);
                                            byte[] bArr2 = $$d;
                                            byte b7 = bArr2[10];
                                            byte b8 = bArr2[5];
                                            Object[] objArr15 = new Object[1];
                                            c(b7, (byte) (-b8), b8, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iLastIndexOf2, iIndexOf2, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                            int i11 = 2823 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            byte[] bArr3 = $$d;
                                            byte b9 = bArr3[10];
                                            byte b10 = bArr3[5];
                                            Object[] objArr16 = new Object[1];
                                            c(b9, (byte) (-b10), b10, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, i11, jumpTapTimeout, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        try {
                                            Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                int doubleTapTimeout = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int i12 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                byte b11 = $$d[7];
                                                byte b12 = b11;
                                                Object[] objArr18 = new Object[1];
                                                c(b12, (byte) (b12 | 51), b11, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, doubleTapTimeout, i12, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
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
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                    c = '0';
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
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iRgb = Color.rgb(0, 0, 0) + 16777238;
            byte[] bArr4 = $$d;
            byte b13 = bArr4[10];
            byte b14 = bArr4[5];
            Object[] objArr19 = new Object[1];
            c(b13, (byte) (-b14), b14, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, scrollBarFadeDuration, iRgb, 1814927978, false, (String) objArr19[0], null);
        }
        Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2823;
            int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
            byte[] bArr5 = $$d;
            Object[] objArr21 = new Object[1];
            c((byte) (bArr5[19] - 1), (byte) 51, bArr5[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, offsetBefore, iKeyCodeFromString, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
        Object[] objArr22 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37658);
            int edgeSlop = 2720 - (ViewConfiguration.getEdgeSlop() >> 16);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 19;
            byte[] bArr6 = $$d;
            Object[] objArr23 = new Object[1];
            c((byte) (bArr6[19] - 1), (byte) 51, bArr6[7], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, edgeSlop, packedPositionGroup, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
        long j = -1694208088;
        long j2 = -560;
        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        long j3 = -1;
        long j4 = startElapsedRealtime ^ j3;
        long j5 = (((long) (-559)) * j) + (((long) 561) * jLongValue) + (((j4 | j) ^ j3) * j2) + (j2 * ((((jLongValue ^ j3) | j) | startElapsedRealtime) ^ j3)) + (((long) 560) * (((j4 | jLongValue) ^ j3) | (((j ^ j3) | jLongValue) ^ j3))) + ((long) (-116197757));
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i13 = ~startUptimeMillis;
        int i14 = ((int) (j5 >> 32)) & (1871737038 + (((~(652890780 | i13)) | (~((-2090117192) | startUptimeMillis))) * 1900) + (((~(i13 | 2090117191)) | (~((-652890781) | startUptimeMillis))) * (-950)) + (((~(startUptimeMillis | 2090117191)) | (~(i13 | (-652890781)))) * 950));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i15 = i14 | (((int) j5) & (2005432269 + (((~(757468376 | iUptimeMillis)) | (-765873370)) * 104) + ((~((~iUptimeMillis) | (-671353041))) * (-104)) + ((iUptimeMillis | (-679758034)) * 104)));
        int i16 = i15 >>> 24;
        int i17 = i15 & ViewCompat.MEASURED_SIZE_MASK;
        int i18 = i16 != 0 ? 1 : 0;
        if (i18 == 0 || i17 >= 2 || (method = methodArr[i17]) == null) {
            string = null;
        } else {
            int i19 = g + 45;
            asInterface = i19 % 128;
            if (i19 % 2 != 0) {
                method.toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            string = method.toString();
            int i20 = g + 43;
            asInterface = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 5 % 4;
            }
        }
        arrayList.add(string);
        if ((i16 + 6) * i18 != 0) {
            int i22 = 0 % 2;
            throw new ArithmeticException();
        }
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        CameraInfoInternal cameraInfoInternal = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr24 = new Object[0];
                        if (Log.isLoggable("PlayCore", 5)) {
                            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr24);
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strB = holdsCameraSlot.b(signature.toByteArray());
                            arrayList2.add(strB);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strB)) {
                                return true;
                            }
                            if (!Build.TAGS.contains("dev-keys")) {
                                int i23 = g + 63;
                                asInterface = i23 % 128;
                                int i24 = i23 % 2;
                                if (!Build.TAGS.contains("test-keys")) {
                                    continue;
                                } else if (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strB)) {
                                    return true;
                                }
                            } else if (!"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strB)) {
                                return true;
                            }
                        }
                        CameraInfoInternal cameraInfoInternal2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ", ");
                            }
                        }
                        String str = String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString());
                        Object[] objArr25 = new Object[0];
                        if (Log.isLoggable("PlayCore", 5)) {
                            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, str, objArr25);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    CameraInfoInternal cameraInfoInternal3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr26 = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Play Store package is not found.", objArr26);
                    }
                }
            } else {
                CameraInfoInternal cameraInfoInternal4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr27 = new Object[0];
                if (Log.isLoggable("PlayCore", 5)) {
                    int i25 = asInterface + 43;
                    g = i25 % 128;
                    int i26 = i25 % 2;
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Play Store package is disabled.", objArr27);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            CameraInfoInternal cameraInfoInternal5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object[] objArr28 = new Object[0];
            if (Log.isLoggable("PlayCore", 5)) {
                CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal5.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Play Store package is not found.", objArr28);
                int i27 = g + 37;
                asInterface = i27 % 128;
                int i28 = i27 % 2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0130  */
    /* JADX WARN: Code duplicated, block: B:34:0x0149  */
    /* JADX WARN: Code duplicated, block: B:37:0x0194 A[Catch: all -> 0x0370, TryCatch #0 {all -> 0x0370, blocks: (B:7:0x0026, B:9:0x0034, B:10:0x0068, B:14:0x0089, B:16:0x009c, B:17:0x00d1, B:35:0x014b, B:37:0x0194, B:38:0x0214, B:42:0x0232, B:44:0x026e, B:46:0x02de), top: B:63:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0227  */
    /* JADX WARN: Code duplicated, block: B:44:0x026e A[Catch: all -> 0x0370, TryCatch #0 {all -> 0x0370, blocks: (B:7:0x0026, B:9:0x0034, B:10:0x0068, B:14:0x0089, B:16:0x009c, B:17:0x00d1, B:35:0x014b, B:37:0x0194, B:38:0x0214, B:42:0x0232, B:44:0x026e, B:46:0x02de), top: B:63:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x02db  */
    /* JADX WARN: Code duplicated, block: B:48:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0309  */
    /* JADX WARN: Code duplicated, block: B:51:0x033a  */
    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        Object obj2 = null;
        char c = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 61;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 2267;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
                        byte b3 = (byte) (-$$c[c]);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, mode, iResolveSizeAndState, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 119;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cRed = (char) Color.red(0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267;
            int iRgb = (-16777183) - Color.rgb(0, 0, 0);
            byte b5 = (byte) (-$$c[3]);
            byte b6 = (byte) (b5 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, windowTouchSlop, iRgb, -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $11 + 79;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i12 = $10 + 125;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 49267);
                            int i13 = 3262 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int scrollBarFadeDuration = 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte b7 = (byte) (-$$c[3]);
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i13, scrollBarFadeDuration, -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i14 = $10 + 105;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char defaultSize = (char) (22878 - View.getDefaultSize(0, 0));
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 594;
                                int jumpTapTimeout = 17 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte b9 = (byte) (-$$c[3]);
                                byte b10 = (byte) (b9 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, maximumDrawingCacheSize, jumpTapTimeout, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i17 = $11 + 87;
                                $10 = i17 % 128;
                                int i18 = i17 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                            } else {
                                int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i21];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i22];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cNormalizeMetaState2 = (char) (KeyEvent.normalizeMetaState(0) + 49267);
                            int i110 = 3262 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int scrollBarFadeDuration2 = 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte b11 = (byte) (-$$c[3]);
                            byte b12 = (byte) (b11 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState2, i110, scrollBarFadeDuration2, -127612708, false, $$g(b11, b12, (byte) (b12 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i111 = $10 + 105;
                            $11 = i111 % 128;
                            int i112 = i111 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char defaultSize2 = (char) (22878 - View.getDefaultSize(0, 0));
                                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 594;
                                int jumpTapTimeout2 = 17 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte b13 = (byte) (-$$c[3]);
                                byte b14 = (byte) (b13 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize2, maximumDrawingCacheSize2, jumpTapTimeout2, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i114 = $11 + 87;
                                $10 = i114 % 128;
                                int i115 = i114 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i116 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i116];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                            } else {
                                int i24 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i25 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i24];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i25];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i26 = 0; i26 < i; i26++) {
            cArr4[i26] = (char) (cArr4[i26] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60056, 60063, 60117, 60052, 59745, 59749, 60034, 60055, 60059, 60045, 60051, 59748, 60049, 59747, 59753, 60054, 60058, 60060, 60061, 60043, 60046, 60062, 60079, 60073, 59744, 60053, 59750, 59746, 60040, 60050, 59751, 60085, 60047, 60086, 60041, 60075};
        b = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = defpackage.getCameraIds.$$c
            int r7 = r7 + 4
            int r9 = 116 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCameraIds.$$g(int, short, short):java.lang.String");
    }
}
