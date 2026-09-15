package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    private final Fragment zza;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, 11, -9, -106, -3, 26, -25, 45, -2, 28, -2, 7, 29, -26, 30, 25, 7, 8, 20, 10, 0, 17, 10, -16, 29, 18, 4, 9, 28, 6, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 109;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 28;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59676, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59700, 59766, 59765, 59789, 59779, 59762, 59786, 59802, 59778, 59777, 59777, 59778, 59789, 59750, 59737, 59745, 59776, 59784, 59753, 59759, 59786, 59788, 59776, 59789, 59791, 59785, 59761, 59894, 59407, 59400, 59895, 59889, 59401, 59872, 59874, 59402, 59892, 59888, 59900, 59896, 59888, 59892, 59894, 59892, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59765, 59901, 59898, 59903, 59896, 59898, 59901, 59893, 59888, 59888, 59400, 59878, 59882, 59900, 59889, 59881, 59664, 59709, 59712, 59752, 59758, 59718, 59718, 59757, 59716, 59708, 59717, 59759, 59754, 59754, 59752, 59758, 59712, 59713, 59713, 59719, 59759, 59753, 59712, 59709, 59699, 59718, 59713, 59710, 59709, 59713, 59719, 59711, 59715, 59712, 59711, 59719, 59758, 59716, 59709, 59711, 59718, 59752, 59719, 59711, 59706, 59710, 59710, 59714, 59718, 59698, 59709, 59719, 59712, 59705, 59714, 59719, 59717, 59752, 59719, 59708, 59709, 59718, 59718, 59704, 59753, 59848, 59848, 59813, 59807, 59800, 59815, 59814, 59812, 59853, 59815, 59809, 59855, 59815, 59814, 59813, 59807, 59800, 59806, 59806, 59806, 59804, 59812, 59812, 59814, 59815, 59815, 59813, 59804, 59804, 59793, 59794, 59794, 59813, 59815, 59807, 59800, 59814, 59855, 59809, 59800, 59815, 59853, 59812, 59804, 59805, 59807, 59807, 59804, 59812, 59812, 59793, 59813, 59815, 59807, 59800, 59808, 59854, 59814, 59807, 59808, 59810, 59807, 59812};

    private SupportFragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.dynamic.SupportFragmentWrapper.$$a
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.SupportFragmentWrapper.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 25
            int r0 = r5 + 28
            byte[] r1 = com.google.android.gms.dynamic.SupportFragmentWrapper.$$d
            int r6 = r6 * 31
            int r6 = 115 - r6
            byte[] r0 = new byte[r0]
            int r5 = r5 + 27
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2b:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.SupportFragmentWrapper.d(short, short, short, java.lang.Object[]):void");
    }

    public static SupportFragmentWrapper wrap(Fragment fragment) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        int i4 = i3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01b4 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:7:0x0020, B:9:0x0031, B:10:0x0069, B:23:0x00b6, B:25:0x00ce, B:26:0x010a, B:38:0x01a7, B:40:0x01b4, B:42:0x01f6, B:32:0x0131, B:34:0x0149, B:35:0x018a), top: B:75:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x01f5  */
    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i9 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b2 = (byte) i9;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), ImageFormat.getBitsPerPixel(i4) + 1271, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2)).charValue();
                    i10++;
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 0;
                    i9 = -1;
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
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            char[] cArr5 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                int i13 = $10 + 119;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 3225 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (KeyEvent.getMaxKeyCode() >> 16), 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    int i16 = $11 + 101;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        i = 5;
                        i2 = 3;
                    }
                    c = cArr5[setvideostabilizationmode.b];
                    Object[] objArr4 = {setvideostabilizationmode, setvideostabilizationmode};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (41242 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1704, (ViewConfiguration.getPressedStateDuration() >> 16) + 21, -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4);
                } else {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 387247676, false, $$g(b8, (byte) (b8 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    i = $11 + 57;
                    $10 = i % 128;
                    i2 = 2;
                }
                int i18 = i % i2;
                c = cArr5[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (b9 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (41242 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1704, (ViewConfiguration.getPressedStateDuration() >> 16) + 21, -1434471773, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6);
            }
            int i19 = $11 + 57;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 3 / 5;
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i21 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr4, i21, i8);
            System.arraycopy(cArr6, i8, cArr4, 0, i21);
        }
        if (z) {
            int i22 = $11 + 17;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 1;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                cArr[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i23 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i23;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop3;
                    }
                    int i24 = $11 + 111;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[4]);
                        setvideostabilizationmode.b--;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:27:0x0209  */
    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37567);
            int iIndexOf = 625 - TextUtils.indexOf("", "", 0);
            int iAlpha = Color.alpha(0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iIndexOf, iAlpha, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 15}, false, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
            int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
            int iResolveSizeAndState = 14 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, capsMode, iResolveSizeAndState, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 37567);
                int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[5];
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i2, threadPriority, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iMyUid = Process.myUid();
            int i5 = ((1149834164 + (((~((-906264611) | iMyUid)) | (~(917473510 | iMyUid))) * 69)) + (((~(iMyUid | 916752422)) | ((~((-906985699) | iMyUid)) | 721088)) * (-69))) - 1460378961;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[]{i4}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 27, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 145, 0}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = b + 25;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 74 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i10 = b + 23;
                            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                            int i11 = i10 % 2;
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = b + 23;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 141, 3}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{113, 64, 0, 17}, true, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{177, 64, 97, 0}, false, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 2110929307};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[20];
                Object[] objArr15 = new Object[1];
                d(b7, b7, bArr4[32], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = (byte) (-bArr4[32]);
                Object[] objArr16 = new Object[1];
                d(b8, b8, bArr4[5], objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr17[0])[0];
                int i15 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i16 = b + 99;
                    TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                    int i17 = i16 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) (37567 - Color.blue(0));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
                        int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[5];
                        byte b10 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, doubleTapTimeout, tapTimeout, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{0, 22, 0, 15}, false, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 37567);
                            int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i18 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            a(b11, b11, bArr6[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, keyRepeatTimeout, i18, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
                            int maxKeyCode = 625 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iAlpha2 = 14 - Color.alpha(0);
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[7];
                            byte b13 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            a(b12, b13, b13, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, maxKeyCode, iAlpha2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 == i19) {
            int i21 = TuitionPaymentFragmentbindingInflater1 + 115;
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[1])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i24};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = i23 + 378411976 + (((~((-999976140) | iIdentityHashCode)) | 823659529) * 336) + (((~(iIdentityHashCode | 823761981)) | (-1000078592)) * (-168)) + (((~((~iIdentityHashCode) | 823761981)) | (-999976140)) * 168);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
            Object[] objArr23 = {new int[]{i25}, new int[1], iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i29 = ((int[]) objArr[1])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i30};
            int[] iArr4 = {i31};
            int iNextInt = new Random().nextInt();
            int i32 = ~((-695409547) | iNextInt);
            int i33 = 1344616344 + ((674435712 | i32) * (-280)) + ((i32 | (~((-1128328575) | iNextInt))) * 140);
            int i34 = ~((-20973835) | iNextInt);
            int i35 = ~iNextInt;
            int i36 = i29 + i33 + (((~(i35 | (-1107354741))) | i34 | (~((-674435713) | i35))) * 140);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[1])[0] = i38 ^ (i38 << 5);
            Object[] objArr24 = {iArr4, new int[1], iArr3, strArr4};
        }
        boolean zIsVisible = this.zza.isVisible();
        int i39 = b + 121;
        TuitionPaymentFragmentbindingInflater1 = i39 % 128;
        if (i39 % 2 != 0) {
            return zIsVisible;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int id2 = this.zza.getId();
        int i4 = b + 85;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return id2;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.getTargetRequestCode();
            throw null;
        }
        int targetRequestCode = this.zza.getTargetRequestCode();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
        b = i3 % 128;
        int i4 = i3 % 2;
        return targetRequestCode;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzd() {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.getArguments();
            throw null;
        }
        Bundle arguments = this.zza.getArguments();
        int i3 = b + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return arguments;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        SupportFragmentWrapper supportFragmentWrapperWrap = wrap(this.zza.getParentFragment());
        int i4 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return supportFragmentWrapperWrap;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzf() {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Fragment targetFragment = this.zza.getTargetFragment();
        if (i3 != 0) {
            return wrap(targetFragment);
        }
        wrap(targetFragment);
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzj() {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.zza;
        if (i3 != 0) {
            return fragment.getTag();
        }
        fragment.getTag();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zza.setHasOptionsMenu(z);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zza.setMenuVisibility(z);
        int i4 = b + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z) {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.setRetainInstance(z);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean z) {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.setUserVisibleHint(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(Intent intent) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.startActivity(intent);
            int i3 = 36 / 0;
        } else {
            this.zza.startActivity(intent);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(Intent intent, int i) {
        int i2 = 2 % 2;
        int i3 = b + 81;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.zza.startActivityForResult(intent, i);
            obj.hashCode();
            throw null;
        }
        this.zza.startActivityForResult(intent, i);
        int i4 = b + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean retainInstance = this.zza.getRetainInstance();
        int i4 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return retainInstance;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean userVisibleHint = this.zza.getUserVisibleHint();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return userVisibleHint;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.zza;
        if (i3 == 0) {
            return fragment.isAdded();
        }
        fragment.isAdded();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.zza;
        if (i3 == 0) {
            return fragment.isDetached();
        }
        fragment.isDetached();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.zza;
        if (i3 == 0) {
            return fragment.isHidden();
        }
        fragment.isHidden();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        int i = 2 % 2;
        int i2 = b + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsInLayout = this.zza.isInLayout();
        int i4 = b + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return zIsInLayout;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsRemoving = this.zza.isRemoving();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 9;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsRemoving;
        }
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsResumed = this.zza.isResumed();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsResumed;
        }
        throw null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zza.getActivity());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iObjectWrapperWrap;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return ObjectWrapper.wrap(this.zza.getResources());
        }
        int i3 = 14 / 0;
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            ObjectWrapper.wrap(this.zza.getView());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zza.getView());
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        b = i3 % 128;
        int i4 = i3 % 2;
        return iObjectWrapperWrap;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(IObjectWrapper iObjectWrapper) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(IObjectWrapper iObjectWrapper) {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r8 = 105 - r8
            int r6 = r6 + 4
            byte[] r0 = com.google.android.gms.dynamic.SupportFragmentWrapper.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.SupportFragmentWrapper.$$g(short, int, int):java.lang.String");
    }
}
