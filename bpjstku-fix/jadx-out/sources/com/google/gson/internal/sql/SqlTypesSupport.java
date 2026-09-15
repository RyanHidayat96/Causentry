package com.google.gson.internal.sql;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class SqlTypesSupport {
    public static final DefaultDateTypeAdapter.DateType<? extends Date> DATE_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter.DateType<? extends Date> TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        SUPPORTS_SQL_TYPES = z;
        if (z) {
            DATE_DATE_TYPE = new DefaultDateTypeAdapter.DateType<java.sql.Date>(java.sql.Date.class) { // from class: com.google.gson.internal.sql.SqlTypesSupport.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                public java.sql.Date deserialize(Date date) {
                    return new java.sql.Date(date.getTime());
                }
            };
            TIMESTAMP_DATE_TYPE = new DefaultDateTypeAdapter.DateType<Timestamp>(Timestamp.class) { // from class: com.google.gson.internal.sql.SqlTypesSupport.2
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {2, -84, 82, -15, -9, 62, -71, 10, 1, -5, -20, 8, -16, 14, -22, 71, -62, -8, -9, 12, -16, 1, 10, -14, 59, -68, -4, 8, -16, 14, -22, 2, -6, -4, 66, -68, 10, -20, 11, -16, -7, 18, -4, -13, 4, 52, -36, -22, -20, 11, -16, -7, 18, -4, -13, 4, 18, -40, 16, -13, 0, -13, 8};
                private static final int $$e = 27;
                private static final byte[] $$a = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                private static final int $$b = 13;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int b = 1;
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3220860934010247978L;

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
                    /*
                        byte[] r0 = com.google.gson.internal.sql.SqlTypesSupport.AnonymousClass2.$$a
                        int r7 = 93 - r7
                        int r9 = r9 * 4
                        int r9 = r9 + 84
                        int r8 = r8 * 15
                        int r8 = 53 - r8
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r8
                        r4 = r2
                        goto L29
                    L14:
                        r3 = r2
                    L15:
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        if (r4 != r8) goto L24
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L24:
                        r3 = r0[r7]
                        r6 = r3
                        r3 = r9
                        r9 = r6
                    L29:
                        int r9 = -r9
                        int r3 = r3 + r9
                        int r7 = r7 + 1
                        int r9 = r3 + (-11)
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.sql.SqlTypesSupport.AnonymousClass2.a(int, short, byte, java.lang.Object[]):void");
                }

                private static void d(byte b2, byte b3, int i, Object[] objArr) {
                    byte[] bArr = $$d;
                    int i2 = 105 - (i * 7);
                    int i3 = 62 - (b2 * 59);
                    int i4 = b3 * 59;
                    byte[] bArr2 = new byte[i4 + 1];
                    int i5 = -1;
                    if (bArr == null) {
                        i2 = (i3 + (-i2)) - 3;
                        i3 = i3;
                    }
                    while (true) {
                        i5++;
                        bArr2[i5] = (byte) i2;
                        if (i5 == i4) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        }
                        int i6 = i3 + 1;
                        i2 = (i2 + (-bArr[i6])) - 3;
                        i3 = i6;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:46:0x0198  */
                /* JADX WARN: Code duplicated, block: B:47:0x0199  */
                private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                    Throwable cause;
                    int i2 = 2 % 2;
                    getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                    getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i3 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 2625, 13 - (ViewConfiguration.getScrollBarSize() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                            try {
                                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.makeMeasureSpec(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 480, (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                int i4 = $10 + 33;
                                $11 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (Throwable th) {
                                Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th2) {
                            Throwable cause3 = th2.getCause();
                            if (cause3 == null) {
                                throw th2;
                            }
                            throw cause3;
                        }
                    }
                    char[] cArr2 = new char[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i6 = $11 + 85;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 39422), 481 - View.resolveSizeAndState(0, 0, 0), 37 - ExpandableListView.getPackedPositionGroup(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            throw null;
                        }
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        try {
                            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 39422), 480 - ExpandableListView.getPackedPositionChild(0L), (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } catch (Throwable th3) {
                            cause = th3.getCause();
                            if (cause != null) {
                                throw th3;
                            }
                            throw cause;
                        }
                        cause = th3.getCause();
                        if (cause != null) {
                            throw th3;
                        }
                        throw cause;
                    }
                    objArr[0] = new String(cArr2);
                }

                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                public /* bridge */ /* synthetic */ Date deserialize(Date date) throws Throwable {
                    Object[] objArr;
                    char c = 2;
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iResolveSize = 876 - View.resolveSize(0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a((byte) 89, bArr[5], bArr[7], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iResolveSize, iResolveSizeAndState, -1650998592, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{45648, 12324, 46755, 13618, 48050, 15935, 48311, 9026, 41350, 9233, 43729, 10539, 44940, 4733, 37119, 5985, 38380, 6233, 40699, 7551, 33742, 1613}, 33404 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{45652, 30116, 15778, 58794, 44454, 21897, 7555, 50604, 36252, 46481, 32231, 9718, 60916, 38393, 24010}, 51194 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                        int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b2 = (byte) ($$b << 2);
                        byte b3 = $$a[7];
                        Object[] objArr5 = new Object[1];
                        a(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i4, keyRepeatDelay, 2012020043, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                        b = i5 % 128;
                        int i6 = i5 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iMyTid = 876 - (Process.myTid() >> 22);
                            int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte b4 = $$a[7];
                            byte b5 = b4;
                            Object[] objArr6 = new Object[1];
                            a(b4, b5, b5, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iMyTid, i7, 2012931276, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                        int iNextInt = new Random().nextInt();
                        int i8 = (-208210156) + (((~((-847213824) | iNextInt)) | 40313045) * 1504) + ((~(iNextInt | (-806900779))) * (-1504)) + 1770198280;
                        int i9 = (i8 << 13) ^ i8;
                        int i10 = i9 ^ (i9 >>> 17);
                        ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
                        int i11 = b + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{45648, 43440, 34187, 57742, 56802, 14835, 5583, 29078, 27944, 18726, 42263, 33114, 64836, 55665, 13655, 4441, 3255, 26759, 17547, 41205, 40137, 63682, 54473, 12333, 11320, 2050}, 7150 - ImageFormat.getBitsPerPixel(0), objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{45650, 23565, 28369, 30872, 2928, 5426, 10227, 12687, 49161, 53968, 64647, 36731, 39230, 44005, 46523, 17439, 22222, 24710}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61000, objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        Object[] objArr10 = new Object[1];
                        c(new char[]{45659, 23695, 28665, 32461, 2403, 6150, 11114, 14918, 50350, 55240, 59092, 61917, 32822, 37654, 41574, 19789}, 61151 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new char[]{45656, 9198, 37154, 1902, 62633, 27391, 55335, 20053, 16289, 44483, 780, 61776, 26294, 54305, 19055, 15265}, TextUtils.indexOf((CharSequence) "", '0', 0) + 37308, objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 2022955432};
                            byte[] bArr2 = $$d;
                            byte b6 = bArr2[8];
                            Object[] objArr13 = new Object[1];
                            d(b6, b6, bArr2[60], objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b7 = bArr2[60];
                            Object[] objArr14 = new Object[1];
                            d(b7, b7, bArr2[8], objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                                b = i13 % 128;
                                int i14 = i13 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                    int iIndexOf = TextUtils.indexOf("", "") + 876;
                                    int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                                    byte b8 = $$a[7];
                                    byte b9 = b8;
                                    Object[] objArr16 = new Object[1];
                                    a(b8, b9, b9, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iIndexOf, capsMode, 2012931276, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(new char[]{45648, 12324, 46755, 13618, 48050, 15935, 48311, 9026, 41350, 9233, 43729, 10539, 44940, 4733, 37119, 5985, 38380, 6233, 40699, 7551, 33742, 1613}, 33403 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(new char[]{45652, 30116, 15778, 58794, 44454, 21897, 7555, 50604, 36252, 46481, 32231, 9718, 60916, 38393, 24010}, Gravity.getAbsoluteGravity(0, 0) + 51193, objArr18);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                        int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i15 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        byte b10 = (byte) ($$b << 2);
                                        byte b11 = $$a[7];
                                        Object[] objArr19 = new Object[1];
                                        a(b10, b11, b11, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, jumpTapTimeout, i15, 2012020043, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char cMyTid = (char) (Process.myTid() >> 22);
                                        int size = View.MeasureSpec.getSize(0) + 876;
                                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 10;
                                        byte[] bArr3 = $$a;
                                        byte b12 = bArr3[5];
                                        byte b13 = bArr3[7];
                                        Object[] objArr20 = new Object[1];
                                        a((byte) 89, b12, b13, objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, size, capsMode2, -1650998592, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused2) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                            c = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i16 = ((int[]) objArr[c])[0];
                    int i17 = ((int[]) objArr[0])[0];
                    if (i17 == i16) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        int i20 = ((int[]) objArr[1])[0];
                        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int i21 = ~((~((int) Process.getStartUptimeMillis())) | 312327191);
                        int i22 = i20 + (((269788162 | i21) * (-374)) - 867859950) + ((i21 | 42539029) * 374);
                        int i23 = (i22 << 13) ^ i22;
                        int i24 = i23 ^ (i23 >>> 17);
                        ((int[]) objArr21[1])[0] = i24 ^ (i24 << 5);
                    } else {
                        Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                        int i25 = ((int[]) objArr[1])[0];
                        Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i26 = i25 + ((((-1540703468) + (((~(848280269 | iIdentityHashCode)) | (-888590499)) * (-948))) + ((~((~iIdentityHashCode) | (-74465315))) * (-948))) - 1410515700);
                        int i27 = (i26 << 13) ^ i26;
                        int i28 = i27 ^ (i27 >>> 17);
                        ((int[]) objArr22[1])[0] = i28 ^ (i28 << 5);
                    }
                    return deserialize(date);
                }

                @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                protected Timestamp deserialize(Date date) {
                    int i = 2 % 2;
                    Timestamp timestamp = new Timestamp(date.getTime());
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    return timestamp;
                }
            };
            DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
            TIME_FACTORY = SqlTimeTypeAdapter.FACTORY;
            TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.FACTORY;
            return;
        }
        DATE_DATE_TYPE = null;
        TIMESTAMP_DATE_TYPE = null;
        DATE_FACTORY = null;
        TIME_FACTORY = null;
        TIMESTAMP_FACTORY = null;
    }

    private SqlTypesSupport() {
    }
}
