package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqb implements Runnable {
    final /* synthetic */ zzbqe zza;
    private static final byte[] $$c = {63, 56, -36, -117};
    private static final int $$f = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, 15, 18, -11, 21, 7, 5, 7, 29, -5, -23, 56, -7, 32, -12, 11, 20, 3, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 254;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int d = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47353, 47340, 47350, 47336, 47339, 47345, 47276, 47335, 47303, 47329, 47334, 47349, 47341, 47319, 47342, 47351, 47343, 47338, 47304, 47321, 47332, 47302, 47346, 47333, 47344, 47347, 47314, 47272, 47348, 47352, 47268, 47265, 47269, 47267, 47273, 47271, 47270, 47266, 47274};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719578;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean b = true;

    zzbqb(zzbqe zzbqeVar) {
        Objects.requireNonNull(zzbqeVar);
        this.zza = zzbqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbqb.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 52
            int r1 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L32
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqb.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 21
            int r8 = r8 + 84
            int r6 = r6 * 35
            int r0 = r6 + 18
            int r7 = r7 * 17
            int r7 = 20 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzbqb.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 17
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L32
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqb.e(short, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 101;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror(c) + 31291);
                        int iIndexOf = TextUtils.indexOf("", "", i3) + 2994;
                        int size = View.MeasureSpec.getSize(i3) + 17;
                        byte b2 = (byte) ($$f & 3);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, iIndexOf, size, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43326), 253 - TextUtils.indexOf("", ""), KeyEvent.getDeadChar(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i9 = 33602;
        int i10 = 1687675375;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $11 + 35;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] * i] * iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i9 - (ViewConfiguration.getTouchSlop() >> 8)), 3085 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.indexOf("", "", 0)), Color.alpha(0) + 3085, 26 - TextUtils.getOffsetBefore("", 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                i9 = 33602;
                i10 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (TuitionPaymentFragmentbindingInflater1) {
            int i12 = $10 + 95;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3085 - TextUtils.getOffsetAfter("", 0), 26 - KeyEvent.getDeadChar(0, 0), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i13 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            while (true) {
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i14 = $11 + 25;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] + iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int mode = View.MeasureSpec.getMode(0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iResolveSizeAndState, mode, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - Color.red(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iResolveSizeAndState2 = 625 - View.resolveSizeAndState(0, 0, 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSizeAndState2, pressedStateDuration, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = d + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (37568 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int size = View.MeasureSpec.getSize(0) + 625;
                int i5 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b5, bArr2[7], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, size, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iMyUid = Process.myUid();
            int i8 = ~iMyUid;
            int i9 = ~(25581391 | i8);
            int i10 = (((1176993752 + ((1781113008 | i9) * (-712))) + (((~(iMyUid | 1806694399)) | (~(i8 | (-1781113009)))) * (-712))) + (((-1798156730) | i9) * 712)) - 1373121854;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 127 - (Process.myPid() >> 22), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr10 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(null, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(null, null, 127 - TextUtils.indexOf("", ""), new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1373121854};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[54];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr15 = new Object[1];
                e(b7, b8, b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr3[54];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr16 = new Object[1];
                e(b9, b10, b10, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 626;
                        int iAlpha = Color.alpha(0) + 14;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[5];
                        Object[] objArr17 = new Object[1];
                        a(b11, bArr4[7], b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iLastIndexOf, iAlpha, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 37567);
                            int iIndexOf = 625 - TextUtils.indexOf("", "", 0);
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 15;
                            byte b12 = $$a[5];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, b13, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iIndexOf, iIndexOf2, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyTid = (char) (37567 - (Process.myTid() >> 22));
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 626;
                            int packedPositionType = 14 - ExpandableListView.getPackedPositionType(0L);
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[7];
                            Object[] objArr21 = new Object[1];
                            a(b14, bArr5[5], b14, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, iIndexOf3, packedPositionType, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i16};
            int iMyTid = Process.myTid();
            int i18 = i15 + 1488469666 + (((~((~iMyTid) | (-103270339))) | 1720467782) * (-235)) + (((~((-103270339) | iMyTid)) | 1720467782) * (-470)) + (((~(iMyTid | (-2328193))) | 1619525636) * 235);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[1])[0] = i20 ^ (i20 << 5);
            Object[] objArr22 = {new int[]{i17}, new int[1], iArr2, strArr2};
            zzbqe zzbqeVar = this.zza;
            zzbqg zzbqgVar = zzbqeVar.zzc;
            zzbqgVar.zzI(null);
            if (zzbqgVar.zzF() == null) {
                zzbmg zzbmgVar = zzbqeVar.zza;
                if (zzbqgVar.zzA() == zzbmgVar) {
                    zzbqgVar.zzD(zzbmgVar);
                    zzbqgVar.zzB(null);
                    zzbqgVar.zzH(zzbqgVar.zzr().zzf());
                    zzbqgVar.zzh(zzbfy.READY);
                    return;
                }
                return;
            }
            if (zzbqgVar.zzC() == null) {
                int i21 = ((int[]) objArr22[1])[0];
                int i22 = ((i21 * i21) - (~(-(690827937 * i21)))) - 1;
                int i23 = -(i21 * 782202235);
                int i24 = ((i22 ^ i23) + ((i23 & i22) << 1)) - 658427708;
                int i25 = i24 >> 20;
                int i26 = ((i25 & (-8191)) + (i25 | (-8191))) / 4096;
                int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                int i28 = (i24 ^ i27) + ((i27 & i24) << 1);
                int i29 = i24 >> 25;
                int i30 = ((i29 ^ (-255)) + ((i29 & (-255)) << 1)) / 128;
                int i31 = (-(((i30 & 1) + (i30 | 1)) ^ i28)) + 4;
                int i32 = i31 >> 20;
                int i33 = ((i32 & (-8191)) + (i32 | (-8191))) / 4096;
                i2 = 3884 / ((i31 & (-(((i33 & 1) + (1 | i33)) + 1))) * 971);
            } else {
                int i34 = d + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                int i35 = i34 % 2;
            }
            if (i2 == 0) {
                throw new IllegalStateException("Unexpected non-null activeTransport");
            }
            zzbqeVar.zza.zzd(zzbqgVar.zzF());
            int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            d = i36 % 128;
            int i37 = i36 % 2;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 == null) {
            throw null;
        }
        int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        d = i38 % 128;
        while (true) {
            int i39 = i38 % 2;
            if (i2 >= strArr3.length) {
                throw null;
            }
            arrayList.add(strArr3[i2]);
            i2++;
            i38 = d + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r6 = r6 + 67
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = com.google.android.libraries.places.internal.zzbqb.$$c
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqb.$$g(int, short, int):java.lang.String");
    }
}
