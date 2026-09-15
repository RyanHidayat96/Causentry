package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableList;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class zzod {
    private final Map zza;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, 1, -22, 1, -12, -7, -28, -5, 3, -25, -13, 1, -17, -15, 51, 9, -27, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 177;
    private static final byte[] $$a = {106, -93, -11, -74, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 209;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 60373;
    private static char b = 41491;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 63378;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 11675;

    zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 93 - r5
            int r7 = r7 * 4
            int r7 = 84 - r7
            byte[] r0 = com.google.android.gms.measurement.internal.zzod.$$a
            int r6 = r6 * 15
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r5]
        L29:
            int r7 = r7 + r4
            int r5 = r5 + 1
            int r7 = r7 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzod.a(short, byte, int, java.lang.Object[]):void");
    }

    private static void e(short s, byte b2, byte b3, Object[] objArr) {
        int i = 108 - (b2 * 24);
        int i2 = s * 36;
        int i3 = (b3 * 16) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i2 + 17];
        int i4 = i2 + 16;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i3 + (-i);
            int i7 = i3 + 1;
            int i8 = i6 - 10;
            i5 = -1;
            i3 = i7;
            i = i8;
        }
        while (true) {
            int i9 = i5 + 1;
            bArr2[i9] = (byte) i;
            if (i9 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i3;
            i5 = i9;
            i3 = i10 + 1;
            i = (i + (-bArr[i3])) - 10;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                char c = 1;
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i4 = $11 + 95;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 5;
                }
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    int i8 = $10 + 105;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47773);
                            int iGreen = 468 - Color.green(i3);
                            int keyRepeatTimeout = 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, iGreen, keyRepeatTimeout, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (Process.myTid() >> 22)), 467 - Process.getGidForName(""), MotionEvent.axisFromString("") + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        c = 1;
                        i3 = 0;
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
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2323 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    private final Bundle zzf() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int iZzg;
        String str;
        String str2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int i2 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            a((byte) 89, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i2, i3, -1650998592, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{47773, 29464, 40634, 4154, 5128, 33014, 44601, 35897, 36203, 50416, 22860, 16573, 40885, 46141, 21501, 51057, 51815, 26558, 20940, 53438, 8275, 46687, 43124, 62431}, 22 - Color.green(0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{589, 28518, 20350, 48495, 46348, 23727, 14710, Typography.doublePrime, 59310, 42524, 14215, 32433, 42827, 50762, 3539, 33411, 40432, 46003}, 14 - TextUtils.lastIndexOf("", '0'), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
            int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b3 = (byte) ($$b >>> 2);
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            a(b3, bArr[28], bArr[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i4, keyRepeatDelay, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b4, bArr2[28], b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, touchSlop2, minimumFlingVelocity, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyTid = Process.myTid();
            int i5 = ~iMyTid;
            int i6 = (-102487340) + (((~((-42469403) | i5)) | (~((-896792518) | iMyTid))) * 520);
            int i7 = ~(896792517 | i5);
            int i8 = ~(iMyTid | 937102746);
            int i9 = i6 + ((i7 | i8) * (-1040)) + ((i8 | (~(i5 | (-937102747))) | (-939261920)) * 520) + 1246842018;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{41574, 5778, 24991, 7176, 56069, 54123, 29290, 17845, 53560, 45334, 10573, 43081, 49709, 4283, 36962, 21036, 41180, 34611, 52765, Typography.nbsp, 30632, 54426, 33554, 56162, 16455, 1615, 15407, 56990}, View.resolveSize(0, 0) + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{64465, 57427, 47032, 38914, 15866, 18843, 23679, 15622, 12414, 10786, 46388, 42131, 30291, 5146, 51905, 529, 26363, 51131, 25682, 8137}, 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{40794, 21725, 50066, 56137, 62165, 28278, 56657, 4788, 56911, 39609, 65217, 55972, 30563, 11220, 18871, 22252, 51803, 53880}, 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{55727, 61924, 5310, 12712, 19826, 2869, 34218, 14356, 32305, 55407, 54955, 21336, 46592, 58255, 47938, 30867, 41280, 8349}, 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i12 = d + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 1246842018};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (bArr3[4] - 1);
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                e(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[4];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                e(b7, b8, b8, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        a(b9, bArr4[28], b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, scrollDefaultDelay, iLastIndexOf, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{47773, 29464, 40634, 4154, 5128, 33014, 44601, 35897, 36203, 50416, 22860, 16573, 40885, 46141, 21501, 51057, 51815, 26558, 20940, 53438, 8275, 46687, 43124, 62431}, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{589, 28518, 20350, 48495, 46348, 23727, 14710, Typography.doublePrime, 59310, 42524, 14215, 32433, 42827, 50762, 3539, 33411, 40432, 46003}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                            byte b10 = (byte) ($$b >>> 2);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(b10, bArr5[28], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i14, trimmedLength, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int iRgb = Color.rgb(0, 0, 0) + 16778092;
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                            byte b11 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            a((byte) 89, b11, b11, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iRgb, iNormalizeMetaState, -1650998592, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                        d = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = 977655940 + ((~(iIdentityHashCode | 658616347)) * 216);
            int i21 = ~iIdentityHashCode;
            int i22 = i19 + i20 + ((668711519 | i21) * (-216)) + (((~(i21 | 658616347)) | (-618306119)) * 216);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
        } else {
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i25 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt();
            int i26 = i25 + 942639068 + (((~(787460911 | iNextInt)) | 245969451) * (-502)) + ((~((~iNextInt) | 1073740591)) * (-502)) + (((~(iNextInt | (-827771141))) | 787460911) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[1])[0] = i28 ^ (i28 << 5);
        }
        Map map = this.zza;
        String strConcat = "15;20;3;2;7;".concat("1");
        int i29 = ((int[]) objArr2[1])[0];
        int i30 = i29 * i29;
        int i31 = -(1458716796 * i29);
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        int i33 = -(i29 * 19660546);
        int i34 = (i32 & i33) + (i33 | i32);
        int i35 = (i34 ^ 1683083393) + ((1683083393 & i34) << 1);
        int i36 = (((i35 >> 29) - 15) / 8) + 1;
        int i37 = -(((((i35 >> 15) - 262143) / 131072) + 1) ^ ((i35 ^ i36) + ((i36 & i35) << 1)));
        int i38 = (i37 & 5) + (i37 | 5);
        int i39 = i38 >> 22;
        int i40 = ((i39 ^ (-2047)) + ((i39 & (-2047)) << 1)) / 1024;
        int i41 = ((i40 | 1) << 1) - (i40 ^ 1);
        if (strConcat.substring(40320 / (((-(((i41 | 1) << 1) - (i41 ^ 1))) & i38) * 672)).equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
            d = i42 % 128;
            int i43 = i42 % 2;
            String str3 = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str3)) {
                Bundle bundle = new Bundle();
                if (str3.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str3.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str3.length() > 3) {
                    String str4 = zzjk.AD_PERSONALIZATION.zze;
                    if (str3.charAt(2) == '1' && str3.charAt(3) == '1') {
                        int i44 = d + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
                        int i45 = i44 % 2;
                        str2 = "granted";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str4, str2);
                }
                if (str3.length() > 6 && iZzg >= 4) {
                    String str5 = zzjk.AD_USER_DATA.zze;
                    if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                        int i46 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                        d = i46 % 128;
                        if (i46 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str = "granted";
                    } else {
                        str = "denied";
                    }
                    bundle.putString(str5, str);
                    int i47 = d + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i47 % 128;
                    int i48 = i47 % 2;
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = zza().hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        d = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = d + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strZza = zza();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return strZza;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj instanceof zzod) {
            boolean zEqualsIgnoreCase = zza().equalsIgnoreCase(((zzod) obj).zza());
            int i2 = d + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 63 / 0;
            }
            return zEqualsIgnoreCase;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final String zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.zza.get("PurposeDiagnostics");
        if (TextUtils.isEmpty(str)) {
            int i4 = d + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            str = "200000";
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private final int zzg() {
        int i;
        int i2 = 2 % 2;
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (!(!TextUtils.isEmpty(str))) {
                i = -1;
            } else {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                d = i3 % 128;
                int i4 = i3 % 2;
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzd(zzod zzodVar) {
        String str;
        int i = 2 % 2;
        Map map = zzodVar.zza;
        String str2 = "0";
        if (map.isEmpty() || ((String) map.get("Version")) != null) {
            str = "0";
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "1";
        }
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        if (bundleZzb.size() == bundleZzb2.size()) {
            if (Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage"))) {
                if (!Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization"))) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                    d = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                } else if (!Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) {
                    int i4 = d + 123;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            return str.concat(str2);
        }
        int i6 = d + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        str2 = "1";
        return str.concat(str2);
    }

    final String zza() {
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        ImmutableList immutableList = zzof.zza;
        int size = immutableList.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = d + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            String str = (String) immutableList.get(i3);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                    d = i6 % 128;
                    int i7 = i6 % 2;
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                d = i % 128;
            } else {
                i = d + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            }
            int i8 = i % 2;
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x008b, please report this as an issue */
    public final Bundle zzb() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        int i = 2 % 2;
        zzfx zzfxVar = zzfy.zzaZ;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            Map map2 = this.zza;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                int i2 = d + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                if (!(!((Boolean) zzfxVar.zzb(null)).booleanValue())) {
                    return zzf();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    bundle = new Bundle();
                    String str3 = zzjk.AD_STORAGE.zze;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = zzjk.AD_PERSONALIZATION.zze;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        int i4 = d + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                        int i5 = i4 % 2;
                        if (Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                            str2 = "granted";
                        } else {
                            str2 = "denied";
                        }
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str4, str2);
                    if (zzg() >= 4) {
                        bundle.putString(zzjk.AD_USER_DATA.zze, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.zza;
            if (!(!"1".equals(map3.get("GoogleConsent"))) && "1".equals(map3.get("gdprApplies"))) {
                int i6 = d + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                if ("1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                    if (!(!((Boolean) zzfxVar.zzb(null)).booleanValue())) {
                        return zzf();
                    }
                    map = this.zza;
                    if (map.get("Version") == null) {
                        return zzf();
                    }
                    if (zzg() >= 0) {
                        bundle = new Bundle();
                        String str5 = zzjk.AD_STORAGE.zze;
                        if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                            str = "denied";
                        } else {
                            str = "granted";
                        }
                        bundle.putString(str5, str);
                        String str6 = zzjk.AD_PERSONALIZATION.zze;
                        if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                            int i8 = d + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                            int i9 = i8 % 2;
                            if (Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                                str2 = "granted";
                            } else {
                                str2 = "denied";
                            }
                        } else {
                            str2 = "denied";
                        }
                        bundle.putString(str6, str2);
                        if (zzg() >= 4) {
                            bundle.putString(zzjk.AD_USER_DATA.zze, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                        }
                        return bundle;
                    }
                }
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    public final String zze() {
        int i;
        int i2;
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder("1");
        try {
            String str = (String) this.zza.get("CmpSdkID");
            i = TextUtils.isEmpty(str) ? -1 : Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iZzg = zzg();
        if (iZzg >= 0) {
            int i4 = d + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            if (iZzg <= 63) {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzg));
            } else {
                sb.append("0");
            }
        } else {
            sb.append("0");
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        if (true != "1".equals(map.get("gdprApplies"))) {
            i2 = 0;
        } else {
            int i6 = d + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            i2 = 2;
        }
        int i8 = i2 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            int i9 = d + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            i8 = i9 % 2 != 0 ? 59 : i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzod.$$c
            int r7 = r7 * 2
            int r7 = 108 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzod.$$g(short, int, int):java.lang.String");
    }
}
