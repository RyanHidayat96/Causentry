package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxi extends zzbae implements zzbbm {
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f785a;
    private static char b;
    private static final zzaxi zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private zzbeg zzg;
    private zzbeg zzh;
    private double zzi;
    private zzasu zzj;
    private zzbck zzk;
    private zzbec zzn;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$d = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 15;
    private static int g = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private String zze = "";
    private String zzf = "";
    private String zzl = "";
    private String zzm = "";

    static {
        f785a = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zzaxi zzaxiVar = new zzaxi();
        zzo = zzaxiVar;
        zzbae.zzbn(zzaxi.class, zzaxiVar);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        f785a = i % 128;
        int i2 = i % 2;
    }

    private zzaxi() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 84
            int r7 = r7 * 4
            int r0 = r7 + 53
            byte[] r1 = com.google.android.libraries.places.internal.zzaxi.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaxi.e(byte, short, short, java.lang.Object[]):void");
    }

    public final zzbeg zzd() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            zzbeg zzbegVar = this.zzg;
            int i4 = 61 / 0;
            if (zzbegVar != null) {
                return zzbegVar;
            }
        } else {
            zzbeg zzbegVar2 = this.zzg;
            if (zzbegVar2 != null) {
                return zzbegVar2;
            }
        }
        int i5 = i2 + 97;
        g = i5 % 128;
        int i6 = i5 % 2;
        return zzbeg.zzf();
    }

    public final zzbeg zzf() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 117;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzbeg zzbegVar = this.zzh;
        if (zzbegVar != null) {
            return zzbegVar;
        }
        int i5 = i2 + 3;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return zzbeg.zzf();
        }
        zzbeg.zzf();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzasu zzi() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 33;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            zzasu zzasuVar = this.zzj;
            int i4 = 69 / 0;
            if (zzasuVar != null) {
                return zzasuVar;
            }
        } else {
            zzasu zzasuVar2 = this.zzj;
            if (zzasuVar2 != null) {
                return zzasuVar2;
            }
        }
        int i5 = i2 + 51;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return zzasu.zze();
        }
        zzasu.zze();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzbck zzk() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 81;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzbck zzbckVar = this.zzk;
        if (zzbckVar != null) {
            return zzbckVar;
        }
        int i5 = i2 + 93;
        g = i5 % 128;
        int i6 = i5 % 2;
        zzbck zzbckVarZzg = zzbck.zzg();
        int i7 = g + 63;
        d = i7 % 128;
        int i8 = i7 % 2;
        return zzbckVarZzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzo, "\u0000\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000fȈ\u0010Ȉ\u0011ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzi", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzaxi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxh(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxi.class) {
            zzazzVar = zzp;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzo);
                zzp = zzazzVar;
            }
        }
        return zzazzVar;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 51;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i9 = i6;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0)), 468 - TextUtils.getTrimmedLength(""), 13 - Color.green(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47821 - AndroidCharacter.getMirror('0')), 468 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int maxKeyCode = 2323 - (KeyEvent.getMaxKeyCode() >> 16);
                int iMyPid = 44 - (Process.myPid() >> 22);
                byte b2 = (byte) ($$d - 3);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, maxKeyCode, iMyPid, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final boolean zzc() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46401), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{46251, 16854, 10088, 50240, 61841, 39659, 32886, 24776, 23358, 30136, 60633, 14715, 52134, 35516, 39325, 54890, 38138, 11224, 55439, 11302, 41706, 30246, 17793, 63404}, TextUtils.indexOf("", "") + 22, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{22465, 391, 40346, 14456, 51145, 37397, 7769, 61762, 10206, 24059, 14885, 32041, 12178, 62802, 55711, 12136, 40778, 39447}, TextUtils.getOffsetAfter("", 0) + 15, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int i5 = i4;
        long j2 = -1;
        long j3 = j2 ^ (-1635624810930734667L);
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode | 3732881985672693654L;
        long j5 = (((long) (-1335)) * 3732881985672693654L) + (((long) (-667)) * (-1635624810930734667L)) + (((long) (-668)) * (j3 | (j4 ^ j2))) + (((long) 1336) * ((j2 ^ (j3 | jIdentityHashCode)) | 3732881985672693654L)) + (((long) 668) * (j4 | j3));
        int i6 = 0;
        while (true) {
            if (i6 == 10) {
                Object[] objArr3 = new Object[1];
                c(new char[]{37821, 43354, 3243, 24189, 56509, 38854, 24883, 13823, 28164, 56703, 47106, 31350, 57627, 55490, 42218, 54902, 37734, 42554}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{61254, 22718, 51855, 10998, 28995, 46308, 8177, 55320, 22397, 51172, 42982, 2364, 62035, 33764, 23828, 31542, 42917, 60092}, (KeyEvent.getMaxKeyCode() >> 16) + 16, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1246457322};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - Gravity.getAbsoluteGravity(0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, TextUtils.getOffsetAfter("", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 46598644, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                        int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        e(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, absoluteGravity, iLastIndexOf, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1117 - View.getDefaultSize(0, 0), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    int i7 = ((int[]) objArr8[1])[0];
                    int i8 = ((int[]) objArr8[3])[0];
                    if (i8 == i7) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i9 = 0;
                        while (i9 < strArr.length) {
                            arrayList.add(strArr[i9]);
                            i9++;
                            int i10 = g + 9;
                            d = i10 % 128;
                            int i11 = i10 % 2;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 37835), 58 - MotionEvent.axisFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            long j6 = jLongValue;
            int i13 = 0;
            while (true) {
                for (int i14 = 0; i14 != 8; i14++) {
                    int i15 = d + 11;
                    g = i15 % 128;
                    int i16 = i15 % 2;
                    i12 = (((((int) (j6 >> i14)) & 255) + (i12 << 6)) + (i12 << 16)) - i12;
                }
                if (i13 != 0) {
                    break;
                }
                i13++;
                j6 = j5;
            }
            int i17 = i5;
            if (i12 == i17) {
                break;
            }
            int i18 = g + 29;
            d = i18 % 128;
            if (i18 % 2 == 0) {
                jLongValue ^= 1024;
                i6 += 61;
            } else {
                jLongValue -= 1024;
                i6++;
            }
            i5 = i17;
            j = 0;
        }
        return (this.zzb & 1) != 0;
    }

    static /* synthetic */ zzaxi zzm() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 53;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzaxi zzaxiVar = zzo;
        int i5 = i2 + 69;
        g = i5 % 128;
        int i6 = i5 % 2;
        return zzaxiVar;
    }

    public final String zza() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 51;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.zzf;
        int i4 = i2 + 67;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean zze() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 51;
        d = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 2) == 0) {
            return false;
        }
        int i5 = i2 + 61;
        d = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 81;
        d = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final double zzg() {
        int i = 2 % 2;
        int i2 = g + 37;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzi;
        }
        int i3 = 74 / 0;
        return this.zzi;
    }

    public final boolean zzh() {
        int i = 2 % 2;
        boolean z = false;
        if ((this.zzb & 4) != 0) {
            int i2 = d + 95;
            int i3 = i2 % 128;
            g = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 93;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        return z;
    }

    public final boolean zzj() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        g = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 8) != 0) {
            return true;
        }
        int i5 = i2 + 69;
        g = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final String zzl() {
        String str;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 115;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.zzl;
            int i4 = 49 / 0;
        } else {
            str = this.zzl;
        }
        int i5 = i2 + 49;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 44498;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57058;
        TuitionPaymentFragmentbindingInflater1 = (char) 58959;
        b = (char) 32081;
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
    private static java.lang.String $$e(byte r5, byte r6, short r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 108
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzaxi.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaxi.$$e(byte, byte, short):java.lang.String");
    }
}
