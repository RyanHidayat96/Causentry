package com.google.mlkit.common.sdkinternal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.android.gms.internal.mlkit_common.zziu;
import com.google.android.gms.internal.mlkit_common.zziv;
import com.google.android.gms.internal.mlkit_common.zziz;
import com.google.android.gms.internal.mlkit_common.zzja;
import com.google.android.gms.internal.mlkit_common.zzmq;
import com.google.android.gms.internal.mlkit_common.zzmt;
import com.google.android.gms.internal.mlkit_common.zznb;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class CloseGuard implements Closeable {
    public static final int API_TRANSLATE = 1;
    private final AtomicBoolean zza = new AtomicBoolean();
    private final String zzb;
    private final Cleaner.Cleanable zzc;

    /* JADX INFO: loaded from: classes5.dex */
    public static class Factory {
        private final Cleaner zza;
        private static final byte[] $$c = {68, 83, 49, -116};
        private static final int $$f = 236;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 235;
        private static final byte[] $$a = {21, -108, 100, 114, 1, 31, -11, 33, -64, 63, 25, 17, 1, 14, 5, -55, 31, 48, 17, 2, 7, 23, 8, 25, -33, 47, 15, 11, -9, 23, -1, 12};
        private static final int $$b = 234;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {433538832, -1729863219, -1780694, 404519899, 319430748, 398004814, -283051704, 2001449042, -1672260936, -1898301535, -346549088, 944703404, 852447635, -874011602, -278915158, 1708712703, -1724625615, -1294454239};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.mlkit.common.sdkinternal.CloseGuard.Factory.$$a
                int r6 = r6 * 8
                int r1 = 19 - r6
                int r8 = r8 * 3
                int r8 = 106 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r6 = 18 - r6
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r7
                goto L2e
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
            L2e:
                int r7 = r7 + r4
                int r7 = r7 + (-10)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.CloseGuard.Factory.a(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 84
                byte[] r0 = com.google.mlkit.common.sdkinternal.CloseGuard.Factory.$$d
                int r9 = r9 * 52
                int r9 = r9 + 1
                int r7 = r7 * 52
                int r7 = 55 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2c:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.CloseGuard.Factory.c(byte, byte, int, java.lang.Object[]):void");
        }

        public CloseGuard create(Object obj, int i, Runnable runnable) {
            int i2 = 2 % 2;
            CloseGuard closeGuard = new CloseGuard(obj, i, this.zza, runnable, zznb.zzb("common"));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                return closeGuard;
            }
            throw null;
        }

        private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = -1870535734;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i8 = 0;
                while (i8 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3291 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 31, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i8++;
                        i5 = -1870535734;
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
                int i9 = $10 + 1;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr6[i3]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) i7;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3291, TextUtils.lastIndexOf("", '0') + 32, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i3++;
                    iArr6 = iArr6;
                    i6 = 1;
                    i7 = 0;
                }
                i2 = i7;
                iArr6 = iArr2;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr6, i2, iArr5, i2, length3);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                for (int i12 = 17; i12 > 1; i12--) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i12];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2559 - Color.blue(0), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                }
                int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28879), ((Process.getThreadPriority(0) + 20) >> 6) + 348, (ViewConfiguration.getWindowTouchSlop() >> 8) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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
            int i15 = $11 + 103;
            $10 = i15 % 128;
            int i16 = i15 % 2;
        }

        public Factory(Cleaner cleaner) {
            this.zza = cleaner;
        }

        /* JADX WARN: Code duplicated, block: B:110:0x07e2  */
        /* JADX WARN: Code duplicated, block: B:127:0x05b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x0371  */
        /* JADX WARN: Code duplicated, block: B:44:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:45:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:48:0x040b  */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
            int i;
            int i2;
            String string;
            int i3;
            Method[] methodArr;
            Class cls;
            int[] iArr;
            int iRed;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4;
            int i5;
            Class<?> cls2;
            int[] iArr2;
            int i6;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            Object[] objArr;
            int i18 = 2;
            int i19 = 2 % 2;
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 1;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[4] - 1);
            byte b2 = bArr[30];
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 + 1), objArr2);
            char c = 0;
            Class<?> cls3 = Class.forName((String) objArr2[0]);
            byte b3 = bArr[4];
            Object[] objArr3 = new Object[1];
            a(b3, bArr[11], b3, objArr3);
            String str = (String) objArr3[0];
            int i23 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
            int i24 = i23 % 2;
            Method[] methodArr2 = {cls3.getMethod(str, String.class, Provider.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                int iGreen = 22 - Color.green(0);
                byte[] bArr2 = $$d;
                byte b4 = bArr2[5];
                Object[] objArr4 = new Object[1];
                c(b4, bArr2[7], b4, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iNormalizeMetaState, iGreen, 1814927978, false, (String) objArr4[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22 - TextUtils.indexOf("", ""))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i25 = 0;
                while (i25 < length) {
                    Method method = declaredMethods[i25];
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i27 = (i26 & 49) + (i26 | 49);
                    TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                    int i28 = i27 % i18;
                    try {
                        int i29 = -KeyEvent.keyCodeFromString("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i30 = (i29 * (-419)) + 10104;
                        int i31 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | 24)) * TypedValues.CycleType.TYPE_EASING;
                        int i32 = (i30 & i31) + (i31 | i30);
                        int i33 = ~i29;
                        int i34 = i32 + (((i33 & 24) | (i33 ^ 24)) * (-420));
                        int i35 = ~((~i29) | (-25));
                        int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i37 = ~((i36 & 24) | (i36 ^ 24));
                        int i38 = ((i37 & i35) | (i35 ^ i37)) * TypedValues.CycleType.TYPE_EASING;
                        int i39 = (i34 ^ i38) + ((i38 & i34) << i22);
                        Object[] objArr5 = new Object[i22];
                        d(new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418}, i39, objArr5);
                        Class<?> cls4 = Class.forName((String) objArr5[c]);
                        int[] iArr3 = {-2041200340, 1593269669, -734136543, -1791971864, -420951227, -1771767759, 1732395674, 1633271746};
                        int iMyPid = Process.myPid() >> 22;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                        int i41 = i40 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i41;
                        if (i40 % i18 == 0) {
                            int i42 = -(-iMyPid);
                            int i43 = (i42 & 51) + (i42 | 51);
                            i3 = (((i43 | (-37)) << i22) - (i43 ^ (-37))) >> (((iMyPid ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iMyPid & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * (-50));
                        } else {
                            int i44 = iMyPid * 51;
                            int i45 = (i44 & (-588)) + (i44 | (-588));
                            int i46 = ((iMyPid ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iMyPid & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * (-50);
                            i3 = (i45 ^ i46) + ((i46 & i45) << i22);
                        }
                        int i47 = ~iMyPid;
                        int i48 = (i47 ^ (-13)) | (i47 & (-13));
                        int i49 = ~((i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i51 = ~(((-13) ^ i50) | ((-13) & i50) | iMyPid);
                        int i52 = (i3 - (~(50 * ((i49 ^ i51) | (i51 & i49))))) - i22;
                        int i53 = ~(i50 | (-13));
                        int i54 = (i41 ^ 87) + ((i41 & 87) << i22);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i54 % 128;
                        int i55 = i54 % 2;
                        int i56 = ~(((-13) & iMyPid) | ((-13) ^ iMyPid));
                        int i57 = (i56 & i53) | (i53 ^ i56);
                        int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i59 = ~((i58 & iMyPid) | (i58 ^ iMyPid));
                        int i60 = i52 + (50 * ((i57 & i59) | (i57 ^ i59)));
                        Object[] objArr6 = new Object[i22];
                        d(iArr3, i60, objArr6);
                        Object[] objArr7 = new Object[i22];
                        objArr7[0] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr6[0], null).invoke(method, null)).intValue());
                        int i61 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i62 = (i61 ^ 26) + ((i61 & 26) << i22);
                        Object[] objArr8 = new Object[i22];
                        d(new int[]{603237257, -2072825702, 280750300, 1943608983, -515677413, -1154414750, 20209218, -1198315279, 755065343, 1799718402, 1510054737, -2118583166, -1756732368, 1901323680, 527811650, 2011768050}, i62, objArr8);
                        Class<?> cls5 = Class.forName((String) objArr8[0]);
                        int i63 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int i64 = (i63 & 8) + (i63 | 8);
                        Object[] objArr9 = new Object[i22];
                        d(new int[]{1523700351, -892281532, -828649771, 1612834129, -1652103564, -1848357411}, i64, objArr9);
                        String str2 = (String) objArr9[0];
                        Class<?>[] clsArr = new Class[i22];
                        clsArr[0] = Integer.TYPE;
                        if (((Boolean) cls5.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue()) {
                            int i65 = TuitionPaymentFragmentbindingInflater1 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i65 % 128;
                            if (i65 % 2 != 0) {
                                cls = Long.TYPE;
                                iArr = new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418};
                                iRed = Color.red(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i4 = (-115) % iRed;
                                i5 = 50;
                            } else {
                                cls = Long.TYPE;
                                iArr = new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418};
                                iRed = Color.red(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i4 = iRed * (-115);
                                i5 = 24;
                            }
                            int i66 = TuitionPaymentFragmentbindingInflater1 + 95;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                            int i67 = i66 % 2;
                            int i68 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | iRed;
                            int i69 = (((i4 + (i5 * (-115))) - (~(-(-((~((i68 & i5) | (i68 ^ i5))) * (-116)))))) - i22) + (((iRed ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iRed & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 116);
                            int i70 = ~iRed;
                            int i71 = ~i5;
                            int i72 = ~((i70 & i71) | (i70 ^ i71));
                            int i73 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i71) | (i71 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i74 = (i69 - (~(-(-(((i73 & i72) | (i72 ^ i73)) * 116))))) - i22;
                            Object[] objArr10 = new Object[i22];
                            d(iArr, i74, objArr10);
                            Class<?> cls6 = Class.forName((String) objArr10[0]);
                            int[] iArr4 = {-1137052664, -2038627843, 656294521, -840080428, -1573783857, -1139965432, -1630299647, 1367732356, -1713021825, 1150392894};
                            int i75 = -View.resolveSize(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i76 = TuitionPaymentFragmentbindingInflater1;
                            int i77 = ((i76 | 49) << i22) - (i76 ^ 49);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i77 % 128;
                            int i78 = i77 % 2;
                            int i79 = i75 * (-495);
                            int i80 = (i79 ^ (-6435)) + ((i79 & (-6435)) << i22);
                            int i81 = ~i75;
                            int i82 = ~((i81 ^ (-14)) | (i81 & (-14)));
                            int i83 = ~i75;
                            methodArr = declaredMethods;
                            int i84 = ~((i83 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i83 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                            int i85 = i80 + (((i82 ^ i84) | (i84 & i82)) * 992);
                            int i86 = ~((i83 & (-14)) | (i83 ^ (-14)));
                            int i87 = (i76 & 89) + (i76 | 89);
                            int i88 = i87 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i88;
                            int i89 = i87 % 2;
                            int i90 = ~(i81 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                            int i91 = (i86 & i90) | (i86 ^ i90);
                            int i92 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i75;
                            int i93 = ~((i92 & 13) | (i92 ^ 13));
                            int i94 = -(-((-496) * ((i91 & i93) | (i91 ^ i93))));
                            int i95 = ((i85 | i94) << 1) - (i94 ^ i85);
                            int i96 = i88 + 123;
                            TuitionPaymentFragmentbindingInflater1 = i96 % 128;
                            if (i96 % 2 == 0) {
                                int i97 = 496 % (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | 13);
                                int i98 = (i95 ^ i97) + ((i97 & i95) << 1);
                                Object[] objArr11 = new Object[1];
                                d(iArr4, i98, objArr11);
                                if (cls.equals(cls6.getMethod((String) objArr11[0], null).invoke(method, null))) {
                                    Object[] objArr12 = new Object[1];
                                    d(new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418}, 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                                    cls2 = Class.forName((String) objArr12[0]);
                                    iArr2 = new int[]{1927390569, -328091474, -285249367, 105611780, -1269888772, 1095276265, 1351416815, -447016976, 296474248, 987969616, -444734506, 1736490408};
                                    i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i99 = i6 * (-496);
                                    i7 = (i99 ^ (-7936)) + ((i99 & (-7936)) << 1);
                                    i8 = ~i6;
                                    i9 = (i8 ^ (-17)) | (i8 & (-17));
                                    int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i10 = (i100 & 61) + (i100 | 61);
                                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        i12 = i7 >>> (497 >>> (~i9));
                                        int i101 = ~i6;
                                        int i102 = (i101 & (-17)) | (i101 ^ (-17));
                                        i13 = ~((i102 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i102 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        i11 = 1;
                                    } else {
                                        i11 = 1;
                                        i12 = (i7 - (~((~i9) * 497))) - 1;
                                        i13 = ~((i9 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    }
                                    int i103 = (i100 ^ 19) + ((i100 & 19) << i11);
                                    i14 = i103 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i14;
                                    int i104 = i103 % 2;
                                    i15 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i105 = ~(((-17) & i15) | ((-17) ^ i15) | i6);
                                    i16 = i12 + (497 * ((i13 & i105) | (i13 ^ i105)));
                                    i17 = ((i14 | 57) << 1) - (i14 ^ 57);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i106 = ~((~i6) | i15);
                                    int i107 = ~((i8 & 16) | (i8 ^ 16));
                                    int i108 = (i107 & i106) | (i106 ^ i107);
                                    int i109 = (i14 & 41) + (i14 | 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i109 % 128;
                                    int i110 = i109 % 2;
                                    int i111 = i6 | (-17);
                                    int i112 = ~((i111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i113 = -(-(497 * ((i112 & i108) | (i108 ^ i112))));
                                    int i114 = ((i16 | i113) << 1) - (i113 ^ i16);
                                    Object[] objArr13 = new Object[1];
                                    d(iArr2, i114, objArr13);
                                    Method method2 = cls2.getMethod((String) objArr13[0], null);
                                    int i115 = TuitionPaymentFragmentbindingInflater1;
                                    int i116 = (i115 ^ 17) + ((i115 & 17) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i116 % 128;
                                    int i117 = i116 % 2;
                                    objArr = (Object[]) method2.invoke(method, null);
                                    if (objArr.length == 2 && Long.TYPE.equals(objArr[0])) {
                                        int i118 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        Object[] objArr14 = new Object[1];
                                        d(new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418}, (i118 & 23) + (i118 | 23), objArr14);
                                        String str3 = (String) objArr14[0];
                                        int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                                        TuitionPaymentFragmentbindingInflater1 = i119 % 128;
                                        int i120 = i119 % 2;
                                        if (Class.forName(str3).equals(objArr[1])) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                int iMyTid = (Process.myTid() >> 22) + 2823;
                                                int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                byte[] bArr3 = $$d;
                                                byte b5 = bArr3[5];
                                                Object[] objArr15 = new Object[1];
                                                c(b5, bArr3[7], b5, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iMyTid, iIndexOf, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i121 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                int i122 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                                                byte[] bArr4 = $$d;
                                                byte b6 = bArr4[5];
                                                Object[] objArr16 = new Object[1];
                                                c(b6, bArr4[7], b6, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i121, i122, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int iMyTid2 = (Process.myTid() >> 22) + 2823;
                                                    int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                    byte[] bArr5 = $$d;
                                                    byte b7 = bArr5[7];
                                                    Object[] objArr18 = new Object[1];
                                                    c(b7, bArr5[10], b7, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iMyTid2, packedPositionGroup, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
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
                                Object[] objArr19 = new Object[1];
                                d(iArr4, i95 + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 13) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 13)) * 496), objArr19);
                                if (cls.equals(cls6.getMethod((String) objArr19[0], null).invoke(method, null))) {
                                    Object[] objArr110 = new Object[1];
                                    d(new int[]{1942383353, 1200848171, -2074072611, -162196848, 1514009716, 1176107990, -489422546, -48450384, -2122719670, -1671831388, 926909237, -1044746969, 731098158, 1935071418}, 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr110);
                                    cls2 = Class.forName((String) objArr110[0]);
                                    iArr2 = new int[]{1927390569, -328091474, -285249367, 105611780, -1269888772, 1095276265, 1351416815, -447016976, 296474248, 987969616, -444734506, 1736490408};
                                    i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i910 = i6 * (-496);
                                    i7 = (i910 ^ (-7936)) + ((i910 & (-7936)) << 1);
                                    i8 = ~i6;
                                    i9 = (i8 ^ (-17)) | (i8 & (-17));
                                    int i1010 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i10 = (i1010 & 61) + (i1010 | 61);
                                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        i12 = i7 >>> (497 >>> (~i9));
                                        int i1011 = ~i6;
                                        int i1012 = (i1011 & (-17)) | (i1011 ^ (-17));
                                        i13 = ~((i1012 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1012 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        i11 = 1;
                                    } else {
                                        i11 = 1;
                                        i12 = (i7 - (~((~i9) * 497))) - 1;
                                        i13 = ~((i9 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    }
                                    int i1013 = (i1010 ^ 19) + ((i1010 & 19) << i11);
                                    i14 = i1013 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i14;
                                    int i1014 = i1013 % 2;
                                    i15 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1015 = ~(((-17) & i15) | ((-17) ^ i15) | i6);
                                    i16 = i12 + (497 * ((i13 & i1015) | (i13 ^ i1015)));
                                    i17 = ((i14 | 57) << 1) - (i14 ^ 57);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    int i1016 = ~((~i6) | i15);
                                    int i1017 = ~((i8 & 16) | (i8 ^ 16));
                                    int i1018 = (i1017 & i1016) | (i1016 ^ i1017);
                                    int i1019 = (i14 & 41) + (i14 | 41);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1019 % 128;
                                    int i1110 = i1019 % 2;
                                    int i1111 = i6 | (-17);
                                    int i1112 = ~((i1111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i1113 = -(-(497 * ((i1112 & i1018) | (i1018 ^ i1112))));
                                    int i1114 = ((i16 | i1113) << 1) - (i1113 ^ i16);
                                    Object[] objArr111 = new Object[1];
                                    d(iArr2, i1114, objArr111);
                                    Method method3 = cls2.getMethod((String) objArr111[0], null);
                                    int i1115 = TuitionPaymentFragmentbindingInflater1;
                                    int i1116 = (i1115 ^ 17) + ((i1115 & 17) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1116 % 128;
                                    int i1117 = i1116 % 2;
                                    objArr = (Object[]) method3.invoke(method, null);
                                    if (objArr.length == 2) {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            methodArr = declaredMethods;
                        }
                        i25 = (i25 ^ 1) + ((i25 & 1) << 1);
                        declaredMethods = methodArr;
                        i18 = 2;
                        i22 = 1;
                        c = 0;
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
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int i123 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                int i124 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                byte[] bArr6 = $$d;
                byte b8 = bArr6[5];
                Object[] objArr20 = new Object[1];
                c(b8, bArr6[7], b8, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, i123, i124, 1814927978, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int i125 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                byte b9 = $$d[7];
                byte b10 = b9;
                Object[] objArr22 = new Object[1];
                c(b10, (byte) (b10 | 14), b9, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, i125, iIndexOf2, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
            Object[] objArr23 = {0, methodArr2, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 37658);
                int i126 = 2721 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf3 = 19 - TextUtils.indexOf("", "");
                byte b11 = $$d[7];
                byte b12 = b11;
                Object[] objArr24 = new Object[1];
                c(b12, (byte) (b12 | 14), b11, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild2, i126, iIndexOf3, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
            long j = 94734522;
            long j2 = -1;
            long j3 = j ^ j2;
            long j4 = (int) Runtime.getRuntime().totalMemory();
            long j5 = (((long) 284) * j) + (((long) (-282)) * jLongValue) + (((long) (-283)) * (((j3 | j4) ^ j2) | ((j3 | jLongValue) ^ j2)));
            long j6 = 283;
            long j7 = jLongValue ^ j2;
            long j8 = j5 + (((j7 | j) ^ j2) * j6) + (j6 * (((j7 | j3) | j4) ^ j2)) + ((long) (-1905140367));
            int iMyPid2 = Process.myPid();
            int i127 = ((int) (j8 >> 32)) & (635053320 + (((-538976257) | iMyPid2) * (-627)) + (((~(548823173 | iMyPid2)) | 1986049584) * (-627)) + (((~(iMyPid2 | 1986049584)) | (~((~iMyPid2) | (-548823174)))) * 627));
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i128 = ~startElapsedRealtime;
            int i129 = ((int) j8) & (1503234081 + (((~((-5439491) | i128)) | (-1431786920)) * 220) + (((~(i128 | (-1096225064))) | (-341001347)) * (-440)) + ((startElapsedRealtime | (-5439491)) * 220));
            int i130 = (i127 & i129) | (i127 ^ i129);
            int i131 = i130 >>> 24;
            int i132 = i130 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z = i131 != 0;
            if (z) {
                int i133 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i134 = (i133 & 93) + (i133 | 93);
                TuitionPaymentFragmentbindingInflater1 = i134 % 128;
                i = 2;
                int i135 = i134 % 2;
                i2 = 1;
            } else {
                i = 2;
                int i136 = TuitionPaymentFragmentbindingInflater1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                int i137 = i136 % 2;
                i2 = 0;
            }
            if (!z || i132 >= 1) {
                string = null;
            } else {
                int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i139 = i138 + 125;
                TuitionPaymentFragmentbindingInflater1 = i139 % 128;
                if (i139 % i == 0) {
                    Method method4 = methodArr2[i132];
                    throw null;
                }
                Method method5 = methodArr2[i132];
                if (method5 != null) {
                    int i140 = (i138 & 41) + (i138 | 41);
                    TuitionPaymentFragmentbindingInflater1 = i140 % 128;
                    int i141 = i140 % 2;
                    string = method5.toString();
                    if (i141 == 0) {
                        int i142 = 97 / 0;
                    }
                } else {
                    string = null;
                }
            }
            list.add(string);
            int i143 = ((i131 | 6) << 1) - (i131 ^ 6);
            int i144 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i144 % 128;
            return i144 % 2 != 0 ? i143 >>> i2 : i143 * i2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, int r8, short r9) {
            /*
                byte[] r0 = com.google.mlkit.common.sdkinternal.CloseGuard.Factory.$$c
                int r7 = r7 * 56
                int r7 = r7 + 66
                int r9 = r9 * 4
                int r9 = r9 + 1
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2a:
                int r7 = -r7
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.CloseGuard.Factory.$$g(int, int, short):java.lang.String");
        }
    }

    CloseGuard(Object obj, int i, Cleaner cleaner, Runnable runnable, zzmq zzmqVar) {
        this.zzb = obj.toString();
        this.zzc = cleaner.register(obj, new zze(this, i, zzmqVar, runnable));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.set(true);
        this.zzc.clean();
    }

    final /* synthetic */ void zza(int i, zzmq zzmqVar, Runnable runnable) {
        if (!this.zza.get()) {
            new Object[]{this.zzb};
            zzja zzjaVar = new zzja();
            zziv zzivVar = new zziv();
            zzivVar.zzb(zziu.zzb(i));
            zzjaVar.zzh(zzivVar.zzc());
            zzmqVar.zzd(zzmt.zzf(zzjaVar), zziz.HANDLE_LEAKED);
        }
        runnable.run();
    }
}
