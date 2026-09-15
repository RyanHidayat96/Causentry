package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.recalculateAvailableCameras;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgj {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    static final recalculateAvailableCameras zza;
    private static final zzbgj zzb;
    private final Map zzc;
    private final byte[] zzd;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$d = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -102, -34, -3, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 244;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    static {
        b = 1;
        b();
        zza = recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zzb = new zzbgj(zzbfs.zza, false, new zzbgj(new zzbfr(), true, new zzbgj()));
        int i = TuitionPaymentFragmentbindingInflater1 + 35;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private zzbgj() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        byte[] bArr = $$a;
        int i = (b2 * 2) + 84;
        int i2 = b4 * 2;
        int i3 = 4 - (b3 * 3);
        byte[] bArr2 = new byte[i2 + 53];
        int i4 = i2 + 52;
        int i5 = -1;
        if (bArr == null) {
            i = (i4 + (-i3)) - 11;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i = (i + (-bArr[i3])) - 11;
            i3 = i7 + 1;
            i5 = i6;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 3292;
                        int i7 = 32 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, i7, 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i3 = -1870535734;
                    i5 = 0;
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
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 53;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 31 - (ViewConfiguration.getEdgeSlop() >> 16), 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                } else {
                    length3 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 3291 - KeyEvent.getDeadChar(0, 0), Color.argb(0, 0, 0, 0) + 31, 1948206109, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i10++;
                }
                length3 = length3;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        int i12 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $11 + 87;
            $10 = i13 % 128;
            int i14 = i13 % i12;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 2559, 29 - Gravity.getAbsoluteGravity(0, 0), 683220507, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i15--;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 28879), 348 - View.combineMeasuredStates(0, 0), Color.blue(0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i12 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final zzbgh zzc(String str) throws Throwable {
        long j;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 46401), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 19 - (ViewConfiguration.getLongPressTimeout() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new int[]{-1136968832, -280417581, -370440744, 1763795122, -1967928409, 561903370, 2051099470, 1253145502, -986894300, -1916918130, -76918032, -1100768907, 1480917183, -1767895513}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        int i4 = 10;
        Object[] objArr2 = new Object[1];
        a(new int[]{-1495954995, -1511378369, -220460205, -1805619760, 1205670165, -217964934, 1917655352, -1810073250, 1489232682, -1095661904}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = i3;
        long j2 = -1;
        long j3 = elapsedCpuTime ^ j2;
        long j4 = 164;
        long j5 = j2 ^ 796804056044331085L;
        long j6 = (((long) 165) * 1300453118697627902L) + (((long) (-163)) * 796804056044331085L) + (((long) (-328)) * (((j3 | 796804056044331085L) ^ j2) | 1300453118697627902L)) + ((elapsedCpuTime | 1300453118697627902L) * j4) + (j4 * (((j3 | 1949763118043095295L) ^ j2) | (((j2 ^ 1300453118697627902L) | j5) ^ j2) | ((j5 | elapsedCpuTime) ^ j2)));
        int i6 = 0;
        while (true) {
            if (i6 == i4) {
                int length = str != null ? str.length() : 0;
                try {
                    Object[] objArr3 = {1753892636};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1133, 18 - KeyEvent.getDeadChar(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -411380572, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
                        int gidForName = Process.getGidForName("") + 16;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iIndexOf, gidForName, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45992), TextUtils.indexOf("", "", 0) + 1117, 17 - Gravity.getAbsoluteGravity(0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i7 = ((int[]) objArr6[1])[0];
                    int i8 = ((int[]) objArr6[3])[0];
                    if (i8 == i7) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        int i10 = i9 % 2;
                        while (i2 < strArr.length) {
                            arrayList.add(strArr[i2]);
                            i2++;
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 2 / 2;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i8));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37835 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - (Process.myPid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i13 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i14 = 0;
            long j7 = jLongValue;
            while (true) {
                int i15 = 0;
                while (i15 != 8) {
                    i13 = (((((int) (j7 >> i15)) & 255) + (i13 << 6)) + (i13 << 16)) - i13;
                    i15++;
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                    int i17 = i16 % 2;
                    j6 = j6;
                }
                j = j6;
                if (i14 != 0) {
                    break;
                }
                i14++;
                j7 = j;
                j6 = j7;
            }
            int i18 = i5;
            if (i13 == i18) {
                break;
            }
            jLongValue -= 1024;
            i6++;
            i5 = i18;
            j6 = j;
            i4 = 10;
        }
        zzbgi zzbgiVar = (zzbgi) this.zzc.get(str);
        if (zzbgiVar == null) {
            return null;
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        int i20 = i19 % 2;
        zzbgh zzbghVar = zzbgiVar.zza;
        if (i20 == 0) {
            return zzbghVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zzbgj(zzbgh zzbghVar, boolean z, zzbgj zzbgjVar) {
        String strZza = zzbghVar.zza();
        if (!(!strZza.contains(","))) {
            throw new IllegalArgumentException("Comma is currently not allowed in message encoding");
        }
        int size = zzbgjVar.zzc.size();
        if (!zzbgjVar.zzc.containsKey(zzbghVar.zza())) {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
            size = i % 2 == 0 ? size << 1 : size + 1;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (zzbgi zzbgiVar : zzbgjVar.zzc.values()) {
            String strZza2 = zzbgiVar.zza.zza();
            if (!strZza2.equals(strZza)) {
                linkedHashMap.put(strZza2, new zzbgi(zzbgiVar.zza, zzbgiVar.zzb));
            }
        }
        linkedHashMap.put(strZza, new zzbgi(zzbghVar, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = mapUnmodifiableMap;
        recalculateAvailableCameras recalculateavailablecameras = zza;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        Iterator it = mapUnmodifiableMap.entrySet().iterator();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 % 2;
        }
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z2 = ((zzbgi) ((Map.Entry) it.next()).getValue()).zzb;
                throw null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((zzbgi) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
        }
        this.zzd = recalculateavailablecameras.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new StringBuilder(), Collections.unmodifiableSet(hashSet).iterator()).toString().getBytes(Charset.forName("US-ASCII"));
    }

    public static zzbgj zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return zzb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final byte[] zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.zzd;
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{-1064991745, -1318703465, 946769659, -1322201407, 1405432256, -1891826951, 904080274, -2110920592, 929929102, 208101060, 239522338, 1411092561, -1393282290, 2071004665, 1112645942, 342382625, -971061813, 1966260170};
    }

    private static String $$e(byte b2, short s, byte b3) {
        byte[] bArr = $$c;
        int i = b2 * 3;
        int i2 = (b3 * 2) + 4;
        int i3 = 122 - (s * 56);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i3 = i + i2;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            int i5 = bArr[i2];
            i2++;
            i3 += i5;
        }
    }
}
