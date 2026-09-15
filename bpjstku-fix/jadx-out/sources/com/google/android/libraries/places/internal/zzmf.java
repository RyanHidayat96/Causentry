package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmf {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;
    private PlacesAppCheckTokenProvider zzd;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$d = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 50, 102, 124, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 195;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int[] b = {-351419303, 999132317, 1272888264, 552621478, 284622472, 915533300, 1461960904, 618745769, -2127232072, -1100422327, 86326551, -393121821, 987961088, -1300579104, -676856368, -1820221762, -1734727417, 1492429645};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzmf.$$a
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r6 = r6 * 2
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmf.c(byte, byte, int, java.lang.Object[]):void");
    }

    public final void zza(String str, Locale locale) {
        synchronized (this) {
            try {
                if (str == null) {
                    throw new NullPointerException("API Key must not be null.");
                }
                if (!(!str.isEmpty())) {
                    throw new IllegalArgumentException("API Key must not be empty.");
                }
                this.zza = str;
                this.zzb = locale;
                this.zzc = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(String str, Locale locale) {
        synchronized (this) {
            zza(str, locale);
            this.zzc = true;
        }
    }

    public final String zzf() {
        String str;
        synchronized (this) {
            if (!zzc()) {
                throw new IllegalStateException("ApiConfig must be initialized.");
            }
            str = this.zza;
        }
        return str;
    }

    public final Locale zzg() {
        Locale locale;
        synchronized (this) {
            if (!zzc()) {
                throw new IllegalStateException("ApiConfig must be initialized.");
            }
            locale = this.zzb == null ? Locale.getDefault() : this.zzb;
        }
        return locale;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3291, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $11 + 113;
            $10 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 73;
                $10 = i12 % 128;
                int i13 = i12 % i9;
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", i6, i6), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3291, AndroidCharacter.getMirror('0') - 17, 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                iArr5 = iArr5;
                i5 = 1;
                i6 = 0;
                i9 = 2;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $11 + 111;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                int i18 = $10 + 103;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2559, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, 683220507, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 348, KeyEvent.keyCodeFromString("") + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

    public final PlacesAppCheckTokenProvider zzi() throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        String str3 = "";
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 46400), 'X' - AndroidCharacter.getMirror('0'), 18 - ImageFormat.getBitsPerPixel(0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new int[]{-1613042968, 1612005925, 1111649384, -2884618, -978229953, -1659487769, 1621587639, -2079782384, 645737962, 865663243, -828852849, 56396615, -1238589402, 1012128791}, KeyEvent.getDeadChar(0, 0) + 22, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new int[]{-957750676, -1776120860, 1456619606, -794472785, 1052823961, -187919378, 76959880, -1570395325, -1834265146, 1510492080}, 14 - MotionEvent.axisFromString(""), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 471;
        long j2 = (j * 1875442057826897384L) + (j * 221815116915061603L);
        long j3 = -470;
        long j4 = -1;
        long j5 = j4 ^ 221815116915061603L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = ((jIdentityHashCode ^ j4) | 1952006687466045419L) ^ j4;
        long j7 = j2 + (j3 * 1952006687466045419L) + (j3 * ((((j4 ^ 1875442057826897384L) | j5) ^ j4) | ((j5 | jIdentityHashCode) ^ j4) | j6)) + (((long) 470) * (((jIdentityHashCode | (j5 | 1875442057826897384L)) ^ j4) | j6));
        int i5 = 0;
        long j8 = jLongValue;
        while (true) {
            if (i5 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.indexOf(str3, str3)), KeyEvent.normalizeMetaState(0) + 59, TextUtils.getCapsMode(str3, 0, 0) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i7 = 0;
                long j9 = j8;
                while (true) {
                    int i8 = 0;
                    while (i8 != 8) {
                        i6 = (((((int) (j9 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                        i8++;
                        str3 = str3;
                    }
                    str2 = str3;
                    if (i7 != 0) {
                        break;
                    }
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    int i10 = i9 % 2;
                    i7++;
                    j9 = j7;
                    str3 = str2;
                }
                if (i6 == i4) {
                    break;
                }
                j8 -= 1024;
                i5++;
                str3 = str2;
            } else {
                String str4 = str3;
                Object[] objArr3 = new Object[1];
                a(new int[]{-1051375296, -398832456, 1410602802, -95139391, 1833263319, 1052843072, -847015432, 785846608, -227013844, 58610955}, ImageFormat.getBitsPerPixel(0) + 17, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new int[]{-1915677552, -2112122205, -476038206, -17298758, -1525880624, 467032107, 1235801387, -1682270742, -1231399247, -1132008347}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-318077402};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        str = str4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 46039), 1133 - TextUtils.indexOf((CharSequence) str, '0'), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                    } else {
                        str = str4;
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1810019562, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                        int iLastIndexOf = 14 - TextUtils.lastIndexOf(str, '0', 0, 0);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, keyRepeatDelay, iLastIndexOf, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45993), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, TextUtils.indexOf(str, str, 0) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        for (String str5 : strArr) {
                            arrayList.add(str5);
                        }
                        throw null;
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        if (zzc()) {
            return this.zzd;
        }
        throw new IllegalStateException("ApiConfig must be initialized.");
    }

    public final boolean zzc() {
        String str;
        synchronized (this) {
            str = this.zza;
        }
        return str != null;
    }

    public final void zzd(PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.zzd == null) {
            this.zzd = placesAppCheckTokenProvider;
        }
        int i4 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = null;
            this.zzc = false;
            this.zzd = null;
        }
    }

    public final boolean zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzc;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 56
            int r6 = r6 + 66
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzmf.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmf.$$e(short, byte, short):java.lang.String");
    }
}
