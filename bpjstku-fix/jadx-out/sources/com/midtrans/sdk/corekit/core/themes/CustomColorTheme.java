package com.midtrans.sdk.corekit.core.themes;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.point.PointDataStore;
import com.midtrans.sdk.corekit.core.Logger;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class CustomColorTheme implements BaseColorTheme {
    private String colorPrimaryDarkHex;
    private String colorPrimaryHex;
    private String colorSecondaryHex;
    private static final byte[] $$c = {114, -115, 48, 84};
    private static final int $$d = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, 6, -99, -107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 53;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {60050, 60049, 60043, 60051, 60034, 60083, 60073, 60040, 60053, 60045, 60058, 60088, 60048, 60052, 60057, 60062, 60054, 60041, 60060, 60047, 60055, 60117, 60063, 60072, 60056};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 84
            int r7 = 92 - r7
            int r8 = r8 * 15
            int r8 = 53 - r8
            byte[] r0 = com.midtrans.sdk.corekit.core.themes.CustomColorTheme.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.themes.CustomColorTheme.a(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryColor() throws Throwable {
        Object[] objArr;
        String lowerCase;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 89, bArr[28], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, i3, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\r', 5, 2, 22, '\n', 3, 23, 22, '\f', '\b', 22, 24, 2, '\t', 15, 16, 21, 16, 23, '\n', 22, 14}, (byte) (TextUtils.getOffsetBefore("", 0) + 79), 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{20, 0, '\f', 0, 5, 17, 21, 7, 20, 15, 24, 15, 1, 15, 13868}, (byte) (46 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 15 - View.MeasureSpec.getSize(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
            int iAxisFromString = MotionEvent.axisFromString("") + 1756;
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
            byte b2 = (byte) ($$b - 1);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, iAxisFromString, i4, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, maximumDrawingCacheSize, i7, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i8}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = ~elapsedCpuTime;
            int i10 = (((103761587 + (((~(123363609 | i9)) | (~((-335966036) | elapsedCpuTime))) * 1900)) + (((~(i9 | 335966035)) | (~(elapsedCpuTime | (-123363610)))) * (-950))) + (((~(elapsedCpuTime | 335966035)) | (~(i9 | (-123363610)))) * 950)) - 1261677325;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 11, 5, 14, 22, 21, '\r', 5, 16, 23, 24, 3, '\t', 17, 16, 17}, (byte) (ExpandableListView.getPackedPositionType(0L) + 81), 16 - Color.blue(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{2, 20, 18, 5, 15, 4, 24, '\t', '\n', 15, '\b', 2, '\f', 14, 20, 17}, (byte) (108 - (ViewConfiguration.getScrollBarSize() >> 8)), KeyEvent.getDeadChar(0, 0) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-350709128};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1725 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1261677325, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                    int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                    int size = View.MeasureSpec.getSize(0) + 23;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    a(b6, b7, b7, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iArgb, size, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{'\r', 5, 2, 22, '\n', 3, 23, 22, '\f', '\b', 22, 24, 2, '\t', 15, 16, 21, 16, 23, '\n', 22, 14}, (byte) (79 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{20, 0, '\f', 0, 5, 17, 21, 7, 20, 15, 24, 15, 1, 15, 13868}, (byte) (TextUtils.lastIndexOf("", '0', 0) + 46), (ViewConfiguration.getTapTimeout() >> 16) + 15, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                        int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b8 = (byte) ($$b - 1);
                        byte b9 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, packedPositionGroup, keyRepeatDelay, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                        int iGreen = 1755 - Color.green(0);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a((byte) 89, bArr2[28], bArr2[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, iGreen, edgeSlop2, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i15 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                int i18 = i17 % 2;
            }
            throw null;
        }
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i20}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iNextInt = new Random().nextInt();
        int i21 = i19 + 370336724 + (((-545259922) | iNextInt) * (-627)) + (((~(635696539 | iNextInt)) | 848298965) * (-627)) + (((~(iNextInt | 848298965)) | (~((~iNextInt) | (-635696540)))) * 627);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
        try {
            if (this.colorPrimaryHex.startsWith("#")) {
                lowerCase = this.colorPrimaryHex.toLowerCase();
            } else {
                int i24 = ((int[]) objArr16[3])[0];
                int i25 = ((i24 * i24) - (~(-(1527159735 * i24)))) - 1;
                int i26 = -(i24 * 355459893);
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                int i28 = ((i27 | 312429156) << 1) - (312429156 ^ i27);
                int i29 = i28 >> 20;
                int i30 = (i28 - (~((((i29 ^ (-8191)) + ((i29 & (-8191)) << 1)) / 4096) + 1))) - 1;
                int i31 = i28 >> 24;
                int i32 = (((i31 | (-511)) << 1) - (i31 ^ (-511))) / 256;
                int i33 = -(i30 ^ (((i32 | 1) << 1) - (i32 ^ 1)));
                int i34 = ((i33 | 3) << 1) - (i33 ^ 3);
                int i35 = i34 >> 16;
                int i36 = (((((-131071) | i35) << 1) - (i35 ^ (-131071))) / 65536) + 1;
                StringBuilder sb = new StringBuilder("29/24/16/17/23/#".substring(66915 / (((-((i36 & 1) + (i36 | 1))) & i34) * 1487)));
                sb.append(this.colorPrimaryHex.toLowerCase());
                lowerCase = sb.toString();
                int i37 = TuitionPaymentFragmentbindingInflater1 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                int i38 = i37 % 2;
            }
            return Color.parseColor(lowerCase);
        } catch (Exception unused2) {
            Logger.e("Color cannot be parsed. Reverted back to default grey color.");
            return Color.parseColor("#999999");
        }
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i4 = 1770390596;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267, 33 - TextUtils.getCapsMode("", 0, 0), -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2267 - TextUtils.indexOf("", "", 0), 33 - TextUtils.indexOf("", "", 0), -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 95;
                cArr4[i2] = (char) (cArr[i2] / b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 67;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $11 + 35;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 49267), 3262 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 30, -127612708, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i12 = $11 + 105;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = (byte) (b9 + 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22879 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 594 - KeyEvent.keyCodeFromString(""), (Process.myTid() >> 22) + 17, 1570859318, false, $$e(b9, b10, (byte) (b10 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i15 = $10 + 103;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                            } else {
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            int i22 = $10 + 43;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public CustomColorTheme(String str, String str2, String str3) {
        this.colorPrimaryHex = str;
        this.colorPrimaryDarkHex = str2;
        this.colorSecondaryHex = str3;
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryDarkColor() {
        String lowerCase;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (this.colorPrimaryDarkHex.startsWith("#")) {
                lowerCase = this.colorPrimaryDarkHex.toLowerCase();
                int i4 = TuitionPaymentFragmentbindingInflater1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                StringBuilder sb = new StringBuilder("#");
                sb.append(this.colorPrimaryDarkHex.toLowerCase());
                lowerCase = sb.toString();
            }
            return Color.parseColor(lowerCase);
        } catch (Exception unused) {
            Logger.e("Color cannot be parsed. Reverted back to default grey color.");
            return Color.parseColor("#737373");
        }
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getSecondaryColor() {
        String lowerCase;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                this.colorSecondaryHex.startsWith("#");
                throw null;
            }
            if (this.colorSecondaryHex.startsWith("#")) {
                lowerCase = this.colorSecondaryHex.toLowerCase();
            } else {
                StringBuilder sb = new StringBuilder("#");
                sb.append(this.colorSecondaryHex.toLowerCase());
                lowerCase = sb.toString();
                int i3 = TuitionPaymentFragmentbindingInflater1 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
            int color = Color.parseColor(lowerCase);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                return color;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            Logger.e("Color cannot be parsed. Reverted back to default grey color.");
            return Color.parseColor("#adadad");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, short r8, int r9) {
        /*
            int r8 = r8 + 113
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = com.midtrans.sdk.corekit.core.themes.CustomColorTheme.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.themes.CustomColorTheme.$$e(byte, short, int):java.lang.String");
    }
}
