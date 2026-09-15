package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class zzff {
    private final String zza;
    private final int zzb;
    private final zzfe zzc;
    private final boolean zzd;
    private final int zze;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$d = 238;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 126, -84, 108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 24;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {53388, 16751, 62289, 25947, 38706, 2328, 47873, 11703, 24546, 61906, 25595, 38298, 1924, 47202, 10865, 23644, 52800, 24578, 37401, 1030, 46846, 10458, 45561, Typography.leftDoubleQuote, 37413, 1064, 63071, 26725, 55920, 19642, 16025, 37041, 712, 62668, 26341, 55565, 19217, 61309, 32410, 52409, 23218, 43145, 14055, 34046, 4621, 24592, 52853, 23676, 43594, 14452, 34719, 5530, 25518, 45557, Typography.mdash, 37409, 1078, 63064, 26729, 55904, 19601, 16052, 37041, 727, 62672, 26319, 55567, 19216, 15661};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8251947619691798640L;

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    public zzff(WifiInfo wifiInfo, ScanResult scanResult) {
        zzfe zzfeVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        boolean z = true;
        if (TextUtils.isEmpty(str2)) {
            zzfeVar = zzfe.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            if (!(!upperCase.equals("[ESS]")) || upperCase.equals("[IBSS]")) {
                zzfeVar = zzfe.NONE;
            } else if (!(!upperCase.matches(".*WPA[0-9]*-PSK.*"))) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    zzfe zzfeVar2 = zzfe.PSK;
                    throw null;
                }
                zzfeVar = zzfe.PSK;
            } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                int i4 = b + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                zzfeVar = zzfe.EAP;
            } else {
                zzfeVar = zzfe.OTHER;
                int i6 = b + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 3;
                }
            }
            int i8 = 2 % 2;
        }
        if (wifiInfo != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            b = i9 % 128;
            int i10 = i9 % 2;
            if (TextUtils.isEmpty(str)) {
                z = false;
            } else {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                b = i11 % 128;
                int i12 = i11 % 2;
                boolean zEqualsIgnoreCase = str.equalsIgnoreCase(wifiInfo.getBSSID());
                if (i12 == 0 && !zEqualsIgnoreCase) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = zzfeVar;
        this.zzd = z;
        this.zze = i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzff.$$a
            int r6 = r6 * 3
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzff.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            i3 = 584784343;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i5])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 2187, 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33016), 3011 - ExpandableListView.getPackedPositionType(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 321985076, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - KeyEvent.normalizeMetaState(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3375, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i6 = $11 + 59;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i8 = $11 + 81;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 36505), TextUtils.lastIndexOf("", '0') + 3377, 17 - Gravity.getAbsoluteGravity(0, 0), -968507904, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            i3 = 584784343;
        }
        objArr[0] = new String(cArr);
    }

    public final zzfe zzc() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Color.alpha(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, ExpandableListView.getPackedPositionType(0L) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, (char) (24944 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(22 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 521;
        long j2 = -1;
        long j3 = j2 ^ 4131469851175308798L;
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j4 = ((j2 ^ (-2034212676433349811L)) | 4131469851175308798L) ^ j2;
        long j5 = (((long) (-520)) * 4131469851175308798L) + (((long) 522) * (-2034212676433349811L)) + ((((j3 | (-2034212676433349811L)) | startUptimeMillis) ^ j2) * j) + (((long) (-1042)) * j4) + (j * ((((j3 | (startUptimeMillis ^ j2)) | (-2034212676433349811L)) ^ j2) | j4));
        int i4 = 0;
        long j6 = jLongValue;
        try {
            while (i4 != 10) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                b = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                int i7 = 8;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(i2, i2) + 37836), Color.alpha(i2) + 59, (ViewConfiguration.getScrollBarSize() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i9 = i2;
                long j7 = j6;
                while (true) {
                    int i10 = i2;
                    while (i10 != i7) {
                        int i11 = b + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 == 0) {
                            i8 = (((((int) (j7 >>> i10)) & 14004) >>> (i8 + 36)) - (i8 - 5)) >> i8;
                            i10 += 42;
                        } else {
                            i8 = (((((int) (j7 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                            i10++;
                        }
                        i7 = 8;
                    }
                    if (i9 != 0) {
                        break;
                    }
                    i9++;
                    j7 = j5;
                    i2 = 0;
                    i7 = 8;
                }
                if (i8 == i3) {
                    return this.zzc;
                }
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                b = i12 % 128;
                int i13 = i12 % 2;
                j6 -= 1024;
                i4++;
                i2 = 0;
            }
            Object[] objArr3 = {-141413625};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46037 - ImageFormat.getBitsPerPixel(0)), 1134 - View.getDefaultSize(0, 0), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 104257598, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, i14, absoluteGravity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (46041 - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1116, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i15 = ((int[]) objArr6[1])[0];
            int i16 = ((int[]) objArr6[3])[0];
            if (i16 != i15) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i16];
                int i19 = i16 - 1;
                iArr[i19] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i19) % 2) - 1], 1).show();
            }
            return this.zzc;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i20 = i2;
        Object[] objArr7 = new Object[1];
        a(Color.red(i20) + 37, TextUtils.indexOf((CharSequence) "", '0', i20) + 17, (char) (24203 - (ViewConfiguration.getTapTimeout() >> 16)), objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[i20]);
        Object[] objArr8 = new Object[1];
        a(53 - View.MeasureSpec.makeMeasureSpec(i20, i20), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[i20], Object.class).invoke(null, this)).intValue();
    }

    public final String zza() {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zzb;
        int i6 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final boolean zzd() {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int zze() {
        int i = 2 % 2;
        int i2 = b + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.zze;
        int i5 = i3 + 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = com.google.android.libraries.places.internal.zzff.$$c
            int r6 = r6 * 3
            int r6 = r6 + 109
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzff.$$e(short, byte, byte):java.lang.String");
    }
}
