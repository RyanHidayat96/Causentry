package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzave extends zzbae implements zzbbm {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final zzave zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, 1, 70, -122, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 59, 0, -15, -5, 16, -14, 3, -4, -67, 73, -3, -5};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 124;
    private static int g = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zzave zzaveVar = new zzave();
        zzi = zzaveVar;
        zzbae.zzbn(zzave.class, zzaveVar);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private zzave() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzave.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r5 = r5 * 52
            int r5 = 55 - r5
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2d:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzave.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 99 - r6
            int r7 = r7 * 34
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzave.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + 3
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzave.d(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzave();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzavd(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzave.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $10 + 47;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 3;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $11 + 61;
            $10 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRgb = (char) ((-16768888) - Color.rgb(i4, i4, i4));
                    int iMyTid = 1235 - (Process.myTid() >> 22);
                    int iMyTid2 = (Process.myTid() >> 22) + 35;
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iMyTid, iMyTid2, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cBlue = (char) Color.blue(i4);
                    int i9 = (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2764;
                    int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    String str$$g2 = $$g(b4, b5, (byte) (b5 + 2));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, i9, maxKeyCode, 1504416861, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i10 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i4] = sessionProcessor;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf = (char) (43324 - TextUtils.lastIndexOf("", '0'));
                    int bitsPerPixel = 252 - ImageFormat.getBitsPerPixel(i4);
                    int iArgb = Color.argb(i4, i4, i4, i4) + 22;
                    c2 = 3;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, bitsPerPixel, iArgb, -721491957, false, "j", clsArr3);
                } else {
                    c2 = 3;
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 65200);
                    int deadChar = KeyEvent.getDeadChar(i4, i4) + 2891;
                    int modifierMetaStateMask = 16 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b6 = (byte) i4;
                    byte b7 = b6;
                    String str$$g3 = $$g(b6, b7, (byte) (b7 + 1));
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, deadChar, modifierMetaStateMask, 2012627446, false, str$$g3, clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final boolean zzh() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int pressedStateDuration = 14 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b2 = (byte) (-$$a[5]);
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iResolveSizeAndState, pressedStateDuration, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{6296, 59599, 52537, 50865}, new char[]{36361, 48623, 63183, 62628}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0), new char[]{52889, 22718, 5455, 62451, 5559, 23577, 12904, 28229, 14977, 53789, 47844, 29602, 58440, 46802, 14493, 61142, 7564, 41112, 9615, 39356, 16694, 34709}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{6296, 59599, 52537, 50865}, new char[]{17099, 58316, 38054, 51016}, (char) (18580 - KeyEvent.keyCodeFromString("")), (-1495020478) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{230, 20372, 24078, 20628, 32254, 52165, 16235, 3840, 21582, 4676, 55083, 42996, 24739, 27766, 2798}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[5]);
            byte b5 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b4, b5, b5, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, packedPositionGroup, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (37567 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr7 = new Object[1];
                a(b6, b7, b7, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, minimumFlingVelocity, touchSlop, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i5};
            int iNextInt = new Random().nextInt(1466698052);
            int i7 = 1394912856 + (((~iNextInt) | 811082764) * 1324) + (((~(iNextInt | 811312236)) | (~(1012425884 | iNextInt))) * (-1324)) + 1658924089;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{56752, 3726, 42105, 5410}, (char) (8868 - TextUtils.indexOf("", "", 0, 0)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{25171, 8931, 10543, 22439, 36854, 534, 24432, 32422, 27422, 27947, 18858, 8897, 62833, 39793, 29776, 11414, 46345, 26822, 34651, 3356, 65468, 60479, 28540, 38810, 11325, 19215}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{13476, 62096, 10004, 38930}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 4648), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{49702, 31752, 39998, 49113, 2522, 42714, 17678, 27035, 38202, 63906, 24684, 55897, 45163, 60840, 54331, 48333, 26914, 8347}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{9901, 50846, 58376, 30576}, (char) (28900 - View.resolveSize(0, 0)), View.MeasureSpec.getMode(0), new char[]{34553, 51988, 2994, 19216, 61421, 34925, 43222, 44439, 44237, 62194, 44295, 39110, 5841, 10765, 13743, 33404}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{45625, 25323, 19627, 57115}, (char) (6988 - View.MeasureSpec.makeMeasureSpec(0, 0)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{36872, 54819, 6534, 11732, 48403, 25576, 14790, 32559, 54728, 61888, 13287, 28850, 33732, 2941, 21348, 36380}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{15777, 22087, 54397, 55164}, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0), new char[]{31270, 9271, 37006, 1044, 45059, 55178, 7806, 36619, 60033, 2661, 36341, 10573, 10820, 16345, 31881, 58165, 40903, 46399, 30171, 7059, 62549, 33226, 46156, 31865, 49261, 37095, 17879, 28391, 49292, 65316, 31602, 64110, 32318, 1168, '\'', 49832, 27201, 60250, 32231, 52407, 55760, 15549, 29728, 49317, 26657, 31670, 54388, 64081, 41021, 956, 21772, 46279, 11331, 20429, 42956, 29308, 63225, 175, 35339, 20902, 5817, 33641, 50176, 8122}, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c(new char[]{6296, 59599, 52537, 50865}, new char[]{39280, 21816, 8849, 20269}, (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{14607, 46555, 1398, 33144, 36772, 16915, 36746, 49504, 55299, 7130, 38708, 58029, 51643, 33598, 368, 51244, 32533, 28458, 58477, 26004, 54307, 52042, 39708, 59453, 56684, 64894, 32212, 5521, 8063, 51853, 64848, 47011, 31307, 5464, 2330, 19155, 44070, 23681, 3294, 14508, 62351, 60526, 59903, 2708, 24015, 17193, 60276, 5790, 52846, 25135, 63180, 26673, 24568, 51287, 25039, 42173, 22394, 45691, 37140, 17845, 65015, 40433, 52247, 58012}, objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i10 = asBinder + 57;
            g = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1361854361};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[27];
                byte b9 = bArr2[1];
                Object[] objArr16 = new Object[1];
                d(b8, b9, (byte) (-b9), objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b10 = bArr2[1];
                byte b11 = bArr2[27];
                Object[] objArr17 = new Object[1];
                d(b10, b11, (byte) (b11 | 33), objArr17);
                Object[] objArr18 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i12 = ((int[]) objArr18[0])[0];
                int i13 = ((int[]) objArr18[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumFlingVelocity = (char) (37567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
                        int iRgb = (-16777202) - Color.rgb(0, 0, 0);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr19 = new Object[1];
                        a(b12, b13, b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, windowTouchSlop, iRgb, -973632554, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr18);
                    try {
                        Object[] objArr20 = new Object[1];
                        c(new char[]{6296, 59599, 52537, 50865}, new char[]{36361, 48623, 63183, 62628}, (char) (TextUtils.lastIndexOf("", '0') + 1), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{52889, 22718, 5455, 62451, 5559, 23577, 12904, 28229, 14977, 53789, 47844, 29602, 58440, 46802, 14493, 61142, 7564, 41112, 9615, 39356, 16694, 34709}, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        c(new char[]{6296, 59599, 52537, 50865}, new char[]{17099, 58316, 38054, 51016}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18579), (-1495020478) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{230, 20372, 24078, 20628, 32254, 52165, 16235, 3840, 21582, 4676, 55083, 42996, 24739, 27766, 2798}, objArr21);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char touchSlop2 = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 14;
                            byte[] bArr3 = $$a;
                            byte b14 = (byte) (-bArr3[5]);
                            byte b15 = bArr3[7];
                            Object[] objArr22 = new Object[1];
                            a(b14, b15, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, iIndexOf, offsetAfter, -976899241, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                            int size = 625 - View.MeasureSpec.getSize(0);
                            int iIndexOf2 = 14 - TextUtils.indexOf("", "", 0, 0);
                            byte b16 = (byte) (-$$a[5]);
                            byte b17 = b16;
                            Object[] objArr23 = new Object[1];
                            a(b16, b17, b17, objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, size, iIndexOf2, -477065106, false, (String) objArr23[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr18;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i17};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode;
            int i20 = i16 + (-117538998) + ((iIdentityHashCode | 398242999) * (-859)) + (((~(iIdentityHashCode | (-347345938))) | (~(398242999 | i19))) * 859) + (((~((-1425495122) | i19)) | 1078149184) * 859);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
            objArr2 = new Object[]{new int[]{i18}, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            int[] iArr3 = new int[i15];
            int i23 = i15 - 1;
            iArr3[i23] = 1;
            Toast.makeText((Context) null, iArr3[((i15 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i25};
            int iNextInt2 = new Random().nextInt();
            int i27 = ~(507166468 | iNextInt2);
            int i28 = i24 + 280843948 + ((1078018048 | i27) * (-814)) + ((i27 | (~((~iNextInt2) | (-1316571653))) | 268612864) * 407) + (((~(iNextInt2 | 1316571652)) | (~((-507166469) | iNextInt2)) | 268612864) * 407);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[]{i26}, new int[1], iArr4, strArr5};
        }
        int i31 = this.zzb;
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = ((((i32 * i32) - (~(-(26608512 * i32)))) - 1) - (~(-(i32 * (-337780616))))) - 1;
        int i34 = (i33 ^ (-218861552)) + (((-218861552) & i33) << 1);
        int i35 = i34 >> 27;
        int i36 = (((i35 | (-63)) << 1) - (i35 ^ (-63))) / 32;
        int i37 = (i34 - (~(((i36 | 1) << 1) - (i36 ^ 1)))) - 1;
        int i38 = i34 >> 22;
        int i39 = (((i38 | (-2047)) << 1) - (i38 ^ (-2047))) / 1024;
        int i40 = -(i37 ^ ((i39 ^ 1) + ((i39 & 1) << 1)));
        int i41 = (i40 & 8) + (i40 | 8);
        int i42 = i41 >> 28;
        int i43 = ((i42 & (-31)) + (i42 | (-31))) / 16;
        int i44 = (i43 & 1) + (i43 | 1);
        return (i31 & (75008 / (((-(((i44 | 1) << 1) - (i44 ^ 1))) & i41) * 1172))) != 0;
    }

    public static zzave zzj() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzave zzaveVar = zzi;
        int i5 = i2 + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return zzaveVar;
    }

    static /* synthetic */ zzave zzk() {
        int i = 2 % 2;
        int i2 = g + 41;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return zzi;
        }
        throw null;
    }

    public final boolean zza() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 3;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if ((this.zzb & 1) != 0) {
            int i6 = i2 + 35;
            asBinder = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = i4 + 13;
        g = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean zzc() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.zze;
        int i4 = i2 + 47;
        g = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean zzd() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        g = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 2) == 0) {
            return false;
        }
        int i5 = i2 + 61;
        g = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 85;
        g = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zze() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzf;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean zzf() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 85;
        g = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 4) == 0) {
            return false;
        }
        int i5 = i2 + 47;
        g = i5 % 128;
        return i5 % 2 == 0;
    }

    public final boolean zzg() {
        int i = 2 % 2;
        int i2 = g + 23;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzg;
        }
        throw null;
    }

    public final boolean zzi() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzh;
        int i5 = i2 + 63;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return z;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7047887444817649065L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        b = (char) 34097;
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
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.google.android.libraries.places.internal.zzave.$$c
            int r9 = r9 + 102
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
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzave.$$g(int, short, byte):java.lang.String");
    }
}
