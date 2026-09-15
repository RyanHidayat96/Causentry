package com.appsflyer.internal;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1aSDK implements AFg1bSDK {
    private AFh1zSDK AFAdRevenueData;
    private AFh1wSDK getCurrencyIso4217Code;
    private AFg1fSDK getMediationNetwork;
    private final AFc1dSDK getRevenue;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$d = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 135;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 43232;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 32445;
    private static char b = 35563;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 63661;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = com.appsflyer.internal.AFg1aSDK.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1aSDK.a(byte, int, short, java.lang.Object[]):void");
    }

    public AFg1aSDK(AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getRevenue = aFc1dSDK;
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
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionType = (char) (47773 - ExpandableListView.getPackedPositionType(0L));
                        int keyRepeatTimeout = 468 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int scrollDefaultDelay = 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, keyRepeatTimeout, scrollDefaultDelay, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getEdgeSlop() >> 16)), (Process.myTid() >> 22) + 468, 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i11 + 1;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2322, 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1312321721, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
            int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[80], (byte) 52, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, i5, iMakeMeasureSpec, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{8595, 35837, 17613, 48800, 31233, 26576, 32008, 28590, 29883, 8361, 24985, 46779, 34680, 27598, 11714, 54380, 27441, 3311, 2677, 50442, 38793, 18756, 8844, 'I'}, View.resolveSize(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{55415, 2905, 10913, 29538, 40887, 29956, 45859, 4634, 50986, 23212, 51725, 55831, 14789, 18912, 6925, 63185, 40121, 5317}, Process.getGidForName("") + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int i6 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i7 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i6, i7, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
                int i9 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 37), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i8, i9, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i10 = ((int[]) objArr7[2])[0];
            int i11 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = ~iIdentityHashCode;
            int i13 = (-150226935) + ((~(523384342 | i12)) * (-560)) + ((~(iIdentityHashCode | 536870526)) * (-560)) + (((~((-519953533) | i12)) | 506467348) * 560) + 647118952;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[3])[0] = i15 ^ (i15 << 5);
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), 1610 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 647118952, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                    int packedPositionType = 651 - ExpandableListView.getPackedPositionType(0L);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 44;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    a(b5, b5, bArr3[80], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, packedPositionType, capsMode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getEdgeSlop() >> 16), 694 - TextUtils.indexOf((CharSequence) "", '0', 0), 97 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 793 - View.resolveSizeAndState(0, 0, 0), MotionEvent.axisFromString("") + 84), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "");
                    int iMakeMeasureSpec2 = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    a(b7, (byte) (b7 | 37), b6, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, iMakeMeasureSpec2, longPressTimeout, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{8595, 35837, 17613, 48800, 31233, 26576, 32008, 28590, 29883, 8361, 24985, 46779, 34680, 27598, 11714, 54380, 27441, 3311, 2677, 50442, 38793, 18756, 8844, 'I'}, 21 - TextUtils.lastIndexOf("", '0', 0), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{55415, 2905, 10913, 29538, 40887, 29956, 45859, 4634, 50986, 23212, 51725, 55831, 14789, 18912, 6925, 63185, 40121, 5317}, ((Process.getThreadPriority(0) + 20) >> 6) + 15, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
                        int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        Object[] objArr14 = new Object[1];
                        a(b8, b8, bArr4[80], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, iMakeMeasureSpec3, i18, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int touchSlop = 651 - (ViewConfiguration.getTouchSlop() >> 8);
                        int i19 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr5[80], (byte) 52, bArr5[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, touchSlop, i19, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    arrayList.add(strArr[i4]);
                    i4++;
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                    asBinder = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i24 = ((int[]) objArr[3])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i27 = ~startUptimeMillis;
        int i28 = i24 + 1057061635 + (((~((-788155873) | i27)) | (-784725063)) * (-602)) + (((~(startUptimeMillis | (-788155873))) | 3803552 | (~((-372743) | i27))) * (-301)) + ((~(i27 | (-784725063))) * 301);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        if (aFh1zSDK != null) {
            int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            asBinder = i31 % 128;
            int i32 = i31 % 2;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            int i33 = ((int[]) objArr16[3])[0];
            int i34 = i33 * i33;
            int i35 = -(279016873 * i33);
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            int i37 = -(i33 * (-1559296643));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            int i39 = ((i38 | 752837225) << 1) - (752837225 ^ i38);
            int i40 = i39 >> 15;
            int i41 = ((((-262143) | i40) << 1) - (i40 ^ (-262143))) / 131072;
            int i42 = (i41 & 1) + (i41 | 1);
            int i43 = (i39 ^ i42) + ((i42 & i39) << 1);
            int i44 = ((i39 >> 25) - 255) / 128;
            int i45 = -(i43 ^ ((i44 & 1) + (i44 | 1)));
            int i46 = ((i45 | 7) << 1) - (i45 ^ 7);
            int i47 = ((i46 >> 21) - 4095) / 2048;
            int i48 = (i47 & 1) + (i47 | 1);
            AFg1gSDK[] aFg1gSDKArr = new AFg1gSDK[9170 / (((-(((i48 | 1) << 1) - (i48 ^ 1))) & i46) * 1310)];
            aFg1gSDKArr[0] = aFh1zSDK;
            aFLogger.unregisterClient(aFg1gSDKArr);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        if (aFh1wSDK != null) {
            int i5 = i3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.getCurrencyIso4217Code = null;
            int i7 = asBinder + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        if (aFg1fSDK != null) {
            int i5 = i3 + 79;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 2, null);
                aFLogger.unregisterClient(aFg1fSDK);
            } else {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1gSDK.v$default(aFLogger2, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
                aFLogger2.unregisterClient(aFg1fSDK);
            }
            this.getMediationNetwork = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1 r3
  0x0021: PHI (r1v5 com.appsflyer.AFLogger) = (r1v4 com.appsflyer.AFLogger), (r1v10 com.appsflyer.AFLogger) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r3v2 com.appsflyer.internal.AFg1gSDK[]) = (r3v1 com.appsflyer.internal.AFg1gSDK[]), (r3v4 com.appsflyer.internal.AFg1gSDK[]) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1bSDK
    public final void component4() {
        AFLogger aFLogger;
        AFg1gSDK[] aFg1gSDKArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[0];
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = new AFg1fSDK();
            }
        } else {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[1];
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = new AFg1fSDK();
            }
        }
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFg1fSDK);
        aFg1gSDKArr[0] = aFg1fSDK;
        aFLogger.registerClient(aFg1gSDKArr);
        int i3 = asBinder + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1 r3
  0x0021: PHI (r1v5 com.appsflyer.AFLogger) = (r1v4 com.appsflyer.AFLogger), (r1v10 com.appsflyer.AFLogger) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r3v2 com.appsflyer.internal.AFg1gSDK[]) = (r3v1 com.appsflyer.internal.AFg1gSDK[]), (r3v4 com.appsflyer.internal.AFg1gSDK[]) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFLogger aFLogger;
        AFg1gSDK[] aFg1gSDKArr;
        int i = 2 % 2;
        int i2 = asBinder + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[0];
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = new AFh1wSDK(this.getRevenue);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[1];
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = new AFh1wSDK(this.getRevenue);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(aFh1wSDK);
        aFg1gSDKArr[0] = aFh1wSDK;
        aFLogger.registerClient(aFg1gSDKArr);
        int i7 = asBinder + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r1 r2
  0x0020: PHI (r1v5 com.appsflyer.AFLogger) = (r1v4 com.appsflyer.AFLogger), (r1v7 com.appsflyer.AFLogger) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x0020: PHI (r2v3 com.appsflyer.internal.AFg1gSDK[]) = (r2v2 com.appsflyer.internal.AFg1gSDK[]), (r2v5 com.appsflyer.internal.AFg1gSDK[]) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger;
        AFg1gSDK[] aFg1gSDKArr;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[1];
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = new AFh1zSDK(this.getRevenue);
                i = asBinder + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 != 0) {
                    int i4 = 4 / 5;
                }
            }
        } else {
            aFLogger = AFLogger.INSTANCE;
            aFg1gSDKArr = new AFg1gSDK[1];
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = new AFh1zSDK(this.getRevenue);
                i = asBinder + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 != 0) {
                    int i5 = 4 / 5;
                }
            }
        }
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFh1zSDK);
        aFg1gSDKArr[0] = aFh1zSDK;
        aFLogger.registerClient(aFg1gSDKArr);
    }

    private static String $$e(short s, byte b2, int i) {
        byte[] bArr = $$c;
        int i2 = 108 - (s * 2);
        int i3 = b2 * 3;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4++;
            i2 += bArr[i4];
        }
    }
}
