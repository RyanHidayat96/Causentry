package com.google.android.gms.fido.fido2.api.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    private final long zza;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, 25, -47, -94, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 27, -13, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 143;
    private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 54;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    public zzab(long j) {
        this.zza = ((Long) Preconditions.checkNotNull(Long.valueOf(j))).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.google.android.gms.fido.fido2.api.common.zzab.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzab.a(short, int, short, java.lang.Object[]):void");
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
    private static void d(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.fido.fido2.api.common.zzab.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r9 = r9 * 4
            int r9 = r9 + 49
            int r8 = r8 * 48
            int r8 = 52 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L2b:
            int r8 = r8 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzab.d(short, short, int, java.lang.Object[]):void");
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = -1870535734;
        char c = '0';
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), 3290 - TextUtils.lastIndexOf("", c, i5, i5), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1870535734;
                    c = '0';
                    j = 0;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr6 != null) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 105;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i8]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3290, 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i8++;
                iArr6 = iArr6;
                i4 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        int i11 = $10 + 35;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $10 + 79;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i15 = 17; i15 > 1; i15--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i15];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (Process.myPid() >> 22) + 2559, 29 - TextUtils.getTrimmedLength(""), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28878 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 347, 'I' - AndroidCharacter.getMirror('0'), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Type inference failed for: r2v78, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
            int mode = View.MeasureSpec.getMode(0) + 625;
            int iBlue = Color.blue(0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, (byte) (-bArr[5]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, mode, iBlue, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{139991530, -110214544, -906324539, 1281948874, 298030836, -57742889, -1920835979, -541150893, -1395718792, 441743261, 1794105038, 603158558, 2032417264, -1731533707}, 22 - TextUtils.getTrimmedLength(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{1882419820, -181082332, 1948668528, 516472588, 1060209250, -379004864, -213525332, -1823063083, -350063314, -552224114}, TextUtils.getOffsetBefore("", 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int packedPositionGroup = 625 - ExpandableListView.getPackedPositionGroup(0L);
            int iGreen = Color.green(0) + 14;
            byte b3 = (byte) (-$$a[5]);
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, iGreen, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 625;
                int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = (byte) (-bArr2[5]);
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iMakeMeasureSpec, scrollBarFadeDuration, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = ~((-299213708) | i6);
            int i8 = 2078931120 + ((16876162 | i7) * (-280)) + ((i7 | (~((-1524524414) | i6))) * 140);
            int i9 = ~((-282337546) | i6);
            int i10 = ~i6;
            int i11 = (i8 + (((~(i10 | (-1242186869))) | (i9 | (~((-16876163) | i10)))) * 140)) - 137401533;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{1274645518, 225490266, -1633557791, -1150750159, 1955683884, 7900656, -1657277895, -228832150, 1504125844, -904493672, -663361302, 1159502262, 85098219, -1348800216, -1526829737, 2039995057}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{-1224740652, -164339986, 1871914115, -457628695, 715567400, 627834168, 1158309495, -345181652, 300645518, 1592103522, -528986386, -1767360074}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{1608411298, 1029055694, -1582147642, 776701377, 1576092269, -444715257, 1147306604, 34489421, 305383026, -776359437}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{1081177458, -1269215944, 1902906934, -817463570, 2051822277, 1735583496, 1346303721, -1543480511, 1037733219, 1617601780}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{561713315, 1831719033, 719097074, -1397979279, -568610746, 786636785, 1252874846, 1357883594, -2108612397, -929037858, -1047942328, 1708331821, 2114545371, -2044967061, -973810880, -1159409255, 90314241, 2052639957, -736982235, 1678620135, -147677697, -1227125632, -993200839, -1581724869, -1856078723, 1606281899, -1732810205, 161549585, -1593965931, -525090759, 1232292578, 191743415, -1233295808, 976234484}, 63 - ExpandableListView.getPackedPositionChild(0L), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{1911399727, 1703254422, 1023424948, 1004619571, -1911143324, 1790774780, 294992104, 1657532038, -978394567, -1205792831, -2102054989, 537026751, 1355562619, 2002697269, -161884140, -1274547072, -1784653582, -141250295, -1764639571, -1444461289, -1220610449, -211829002, -1181093305, 1524412136, 1385421681, -143847527, -1961258578, 396214558, -16443157, 2056810482, -365800743, 1895099753, 1566365890, 1588984418}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -137401533};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[45];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr15 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr3[45];
                byte b10 = b9;
                Object[] objArr16 = new Object[1];
                d(b10, (byte) (b10 - 1), b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr17[0])[0];
                int i17 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iBlue2 = 625 - Color.blue(0);
                        int iMyPid = (Process.myPid() >> 22) + 14;
                        byte[] bArr4 = $$a;
                        byte b11 = (byte) (-bArr4[5]);
                        Object[] objArr18 = new Object[1];
                        a(b11, b11, bArr4[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iBlue2, iMyPid, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{139991530, -110214544, -906324539, 1281948874, 298030836, -57742889, -1920835979, -541150893, -1395718792, 441743261, 1794105038, 603158558, 2032417264, -1731533707}, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{1882419820, -181082332, 1948668528, 516472588, 1060209250, -379004864, -213525332, -1823063083, -350063314, -552224114}, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration2 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int i18 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 14;
                            byte b12 = (byte) (-$$a[5]);
                            byte b13 = b12;
                            Object[] objArr21 = new Object[1];
                            a(b12, b13, b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration2, i18, iNormalizeMetaState, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37566);
                            int i19 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 624;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[7];
                            Object[] objArr22 = new Object[1];
                            a(b14, b14, (byte) (-bArr5[5]), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i19, maximumDrawingCacheSize, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i20 = TuitionPaymentFragmentbindingInflater1 + 73;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                        int i21 = i20 % 2;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i22 = TuitionPaymentFragmentbindingInflater1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                int i23 = i22 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int iIdentityHashCode = System.identityHashCode(this);
        int i27 = ~iIdentityHashCode;
        int i28 = i24 + (-2007392400) + (((~((-1744959093) | i27)) | 78779028) * (-90)) + (((~((-1744959093) | iIdentityHashCode)) | (-1823733493)) * (-45)) + (((~(iIdentityHashCode | (-78779029))) | (-1744959093) | (~(i27 | 78779028))) * 45);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        Object obj2 = new Object[]{new int[]{i26}, new int[1], new int[]{i25}, strArr4}[1];
        ((int[]) obj2)[0] = i30 ^ (i30 << 5);
        if (!(obj instanceof zzab) || this.zza != ((zzab) obj).zza) {
            return false;
        }
        int i31 = ((int[]) obj2)[0];
        int i32 = i31 * i31;
        int i33 = -(528105080 * i31);
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = -(i31 * 1824547370);
        int i36 = (i34 & i35) + (i35 | i34);
        int i37 = ((i36 | (-1752385119)) << 1) - ((-1752385119) ^ i36);
        int i38 = i37 >> 26;
        int i39 = (((i38 | ComposerKt.defaultsKey) << 1) - (i38 ^ ComposerKt.defaultsKey)) / 64;
        int i40 = (-(((i37 - (~((i39 & 1) + (i39 | 1)))) - 1) ^ ((((i37 >> 16) - 131071) / 65536) + 1))) + 7;
        int i41 = i40 >> 28;
        return 13930 / ((i40 & (-(((((i41 | (-31)) << 1) - (i41 ^ (-31))) / 16) + 2))) * 1990);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? Objects.hashCode(Long.valueOf(this.zza)) : Objects.hashCode(Long.valueOf(this.zza));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CREATOR = new zzac();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{1626945667, -675203941, 291354334, 1493852800, -1939268091, -1060996230, -248712196, 830551179, 844052999, 936034601, -723353433, 1654173826, 413703567, -671164735, -428199448, 897706326, -1623554162, -1810788092};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.google.android.gms.fido.fido2.api.common.zzab.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzab.$$g(short, int, byte):java.lang.String");
    }
}
