package com.google.android.gms.internal.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzan implements Iterator {
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -50, -56, -93, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 109;
    private static final byte[] $$a = {94, -56, 58, -24, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 154;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 46654;
    private static char b = 62700;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 50749;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 55402;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r7 = r7 + 1
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r0 = com.google.android.gms.internal.common.zzan.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            int r9 = r9 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzan.a(short, short, int, java.lang.Object[]):void");
    }

    private static void d(short s, byte b2, short s2, Object[] objArr) {
        int i = s2 * 17;
        int i2 = s + 4;
        byte[] bArr = $$d;
        int i3 = 99 - (b2 * 15);
        byte[] bArr2 = new byte[i + 36];
        int i4 = i + 35;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i4 + (-i2)) - 8;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i6;
            i3 = (i3 + (-bArr[i7])) - 8;
            i2 = i7;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $11 + 19;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 3;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 47774);
                        int doubleTapTimeout = 468 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iArgb = 13 - Color.argb(0, 0, 0, 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, doubleTapTimeout, iArgb, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 47774), 468 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore("", 0) + 2323, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i12 = $10 + 15;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 5;
            }
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (31533 - Color.blue(0));
            int i2 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "") + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i2, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{45120, 24318, 22908, 27655, 44618, 46303, 8002, 26669, 59715, 19438, 30936, 16952, 57385, 53251, 52203, 38891, 22385, 11062, 1937, 54868, 9535, 1653, 18106, 52879}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{5981, 15774, 63855, 41147, 39717, 35271, 9032, 39075, 142, 43402, 11595, 51373, 6927, 29766, 53772, 49919, 3254, 23231}, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
            int i3 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i4 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, i3, i4, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                int iMyPid = (Process.myPid() >> 22) + 921;
                int i7 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr2[17] + 1), bArr2[80], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iMyPid, i7, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i8}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = ~elapsedCpuTime;
            int i10 = (-1667435935) + (((~(1451320528 | i9)) | 20744459) * (-1188));
            int i11 = (~(elapsedCpuTime | (-1451320529))) | 20744459;
            int i12 = ~(322759115 | i9);
            int i13 = i10 + ((i11 | i12) * 594) + (((~((-1451320529) | i9)) | 1149305872 | i12) * 594) + 570161796;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{24032, 46101, 7090, 19313, 42982, 48465, 30049, 17513, 39808, 50765, 61231, 50369, 60512, 22536, 40539, 53537, 43815, 21436, 2240, 58708, 40873, 26334, 25526, 2694, 29208, 59351, 6017, 16974}, View.getDefaultSize(0, 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{32456, 45329, 46633, 48625, 36498, 39943, 34025, 26026, 36965, 6933, 47135, 65185, 54308, 41790, 40336, 39455, 54205, 55799, 65270, 8432}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                    asInterface = i16 % 128;
                    int i17 = i16 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{40163, 7275, 40136, 17656, 22401, 64801, 6759, 13151, 52092, 53070, 34959, 45780, 51172, 32151, 23184, 13153, 6445, 43569}, TextUtils.getOffsetAfter("", 0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{54467, 62407, 56571, 11112, 13590, 46256, 6146, 40152, 23737, 31965, 31780, 44700, 10485, 40756, 31959, 48186, 14757, 27579}, 16 - Color.red(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 570161796};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[14];
                byte b5 = bArr3[49];
                Object[] objArr13 = new Object[1];
                d(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[78];
                byte b7 = bArr3[72];
                Object[] objArr14 = new Object[1];
                d(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName = (char) (31532 - Process.getGidForName(""));
                    int mode = View.MeasureSpec.getMode(0) + 921;
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (bArr4[17] + 1), bArr4[80], bArr4[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, mode, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{45120, 24318, 22908, 27655, 44618, 46303, 8002, 26669, 59715, 19438, 30936, 16952, 57385, 53251, 52203, 38891, 22385, 11062, 1937, 54868, 9535, 1653, 18106, 52879}, Drawable.resolveOpacity(0, 0) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{5981, 15774, 63855, 41147, 39717, 35271, 9032, 39075, 142, 43402, 11595, 51373, 6927, 29766, 53772, 49919, 3254, 23231}, 15 - (KeyEvent.getMaxKeyCode() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                        int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, maximumDrawingCacheSize, tapTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue2 = (char) (Color.blue(0) + 31533);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                        int iAlpha = Color.alpha(0) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b9, bArr5[7], b9, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue2, iLastIndexOf2, iAlpha, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i22 = 0;
                while (i22 < strArr.length) {
                    arrayList.add(strArr[i22]);
                    i22++;
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                    asInterface = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i26}, (String[]) objArr[4]};
            int i27 = (int) Runtime.getRuntime().totalMemory();
            int i28 = i25 + (((788831605 + (((~i27) | (-1765387524)) * 1444)) + (((~(i27 | 1749799119)) | ((~(24280524 | i27)) | (-1769733584))) * (-1444))) - 995495306);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr21[0])[0] = i30 ^ (i30 << 5);
        } else {
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i32}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode;
            int i34 = i31 + 199383487 + (((-75531298) | iIdentityHashCode) * (-676)) + (((~(993884638 | i33)) | 75531297) * 676) + (((~(iIdentityHashCode | 1069415935)) | (~(i33 | (-780195006))) | 704663708) * 676);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr22[0])[0] = i36 ^ (i36 << 5);
        }
        throw new UnsupportedOperationException();
    }

    protected zzan() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r7 = r7 * 3
            int r7 = r7 + 108
            byte[] r1 = com.google.android.gms.internal.common.zzan.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r1 != 0) goto L19
            r7 = r6
            r4 = r8
            goto L2b
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r4 = r1[r7]
        L2b:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzan.$$g(int, byte, byte):java.lang.String");
    }
}
