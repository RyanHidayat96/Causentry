package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zznp<T> implements zznx<T> {
    private static int[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -81, 2, 79};
    private static final int $$e = 45;
    private static final byte[] $$a = {87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 49;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        zza = new int[0];
        zzb = zzop.zzq();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
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
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.google.android.gms.internal.measurement.zznp.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
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
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 20
            int r8 = r8 + 78
            byte[] r1 = com.google.android.gms.internal.measurement.zznp.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.d(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzmf) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return ((com.google.android.gms.internal.measurement.zzmf) r4).zzcf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 107;
        com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzA(java.lang.Object r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zznp.b = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 93
            int r1 = r1 / r3
            if (r4 != 0) goto L1f
            goto L17
        L15:
            if (r4 != 0) goto L1f
        L17:
            int r2 = r2 + 107
            int r4 = r2 % 128
            com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r2 = r2 % r0
            return r3
        L1f:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzmf
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.measurement.zzmf r4 = (com.google.android.gms.internal.measurement.zzmf) r4
            boolean r4 = r4.zzcf()
            return r4
        L2a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzA(java.lang.Object):boolean");
    }

    private static double zzC(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        double dDoubleValue = ((Double) zzop.zzn(obj, j)).doubleValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return dDoubleValue;
    }

    private static float zzD(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) zzop.zzn(obj, j)).floatValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return fFloatValue;
    }

    private static int zzE(Object obj, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) zzop.zzn(obj, j)).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static long zzF(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Long l = (Long) zzop.zzn(obj, j);
        if (i3 == 0) {
            return l.longValue();
        }
        l.longValue();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static boolean zzG(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) zzop.zzn(obj, j)).booleanValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zZzJ = zzJ(obj, i);
        boolean zZzJ2 = zzJ(obj2, i);
        if (i4 == 0) {
            int i5 = 25 / 0;
            if (zZzJ == zZzJ2) {
                return true;
            }
        } else if (zZzJ == zZzJ2) {
            return true;
        }
        int i6 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i7 = i6 + 113;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (i2 == 1048575) {
            return zzJ(obj, i);
        }
        if ((i3 & i4) == 0) {
            return false;
        }
        int i9 = i6 + 13;
        b = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x002f A[SYNTHETIC] */
    private final int zzN(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i7 = b;
            int i8 = i7 + 93;
            int i9 = i8 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9;
            if (i8 % 2 != 0) {
                i3 = (length % i2) + 1;
                i4 = i3 >>> 4;
                i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                    int i10 = i9 + 39;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    i2 = i3 + 1;
                    int i12 = i7 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                    int i13 = i12 % 2;
                }
            } else {
                i3 = (length + i2) >>> 1;
                i4 = i3 * 3;
                i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                    int i14 = i9 + 39;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    i2 = i3 + 1;
                    int i16 = i7 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
        }
        return -1;
    }

    private static void zzB(Object obj) {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (!zzA(obj)) {
            String strValueOf = String.valueOf(obj);
            String.valueOf(strValueOf);
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(strValueOf)));
        }
        int i4 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean zzL(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (zzop.zzd(obj, zzy(i2) & 1048575) != i) {
            return false;
        }
        int i6 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        return i6 % 2 == 0;
    }

    private final void zzM(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        zzop.zze(obj, zzy(i2) & 1048575, i);
        int i6 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static zzoj zzg(Object obj) {
        int i = 2 % 2;
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzb = zzmfVar.zzc;
        if (zzojVarZzb == zzoj.zza()) {
            int i2 = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            zzojVarZzb = zzoj.zzb();
            zzmfVar.zzc = zzojVarZzb;
        }
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zzojVarZzb;
    }

    private final void zzK(Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j));
        int i5 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r5.zzm(r3, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r4 instanceof java.lang.String) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r4 instanceof java.lang.String) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r5.zzn(r3, (com.google.android.gms.internal.measurement.zzlh) r4);
        r3 = com.google.android.gms.internal.measurement.zznp.b + 9;
        com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzP(int r3, java.lang.Object r4, com.google.android.gms.internal.measurement.zzov r5) throws java.io.IOException {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zznp.b = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            boolean r1 = r4 instanceof java.lang.String
            r2 = 20
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L2b
        L17:
            boolean r1 = r4 instanceof java.lang.String
            r2 = 1
            if (r1 == r2) goto L2b
        L1c:
            com.google.android.gms.internal.measurement.zzlh r4 = (com.google.android.gms.internal.measurement.zzlh) r4
            r5.zzn(r3, r4)
            int r3 = com.google.android.gms.internal.measurement.zznp.b
            int r3 = r3 + 9
            int r4 = r3 % 128
            com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r3 = r3 % r0
            return
        L2b:
            java.lang.String r4 = (java.lang.String) r4
            r5.zzm(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzP(int, java.lang.Object, com.google.android.gms.internal.measurement.zzov):void");
    }

    private final void zzn(Object obj, Object obj2, int i) {
        int i2 = 2 % 2;
        int i3 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        if (zzJ(obj2, i)) {
            int iZzx = zzx(i);
            Unsafe unsafe = zzb;
            long j = iZzx & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i5 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i5);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            int i6 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            zznx zznxVarZzp = zzp(i);
            if (zzJ(obj, i)) {
                Object object2 = unsafe.getObject(obj, j);
                if (!zzA(object2)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object2);
                    unsafe.putObject(obj, j, objZza);
                    object2 = objZza;
                }
                zznxVarZzp.zzd(object2, object);
                return;
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                zzA(object);
                throw null;
            }
            if (zzA(object)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object);
                unsafe.putObject(obj, j, objZza2);
            } else {
                int i9 = b + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                unsafe.putObject(obj, j, object);
            }
            zzK(obj, i);
        }
    }

    private static Field zzm(Class cls, String str) {
        int i = 2 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    int i4 = b + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            zzot zzotVar2 = zzot.DOUBLE;
            zzotVar.ordinal();
            obj.hashCode();
            throw null;
        }
        zzot zzotVar3 = zzot.DOUBLE;
        switch (zzotVar) {
            case DOUBLE:
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                return i + 8;
            case FLOAT:
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                int i5 = i + 4;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    return i5;
                }
                throw null;
            case INT64:
            case UINT64:
                int iZzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                int i7 = b + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                return iZzc;
            case INT32:
            case UINT32:
            case ENUM:
                int iZza = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case FIXED64:
            case SFIXED64:
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                return i + 8;
            case FIXED32:
            case SFIXED32:
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                return i + 4;
            case BOOL:
                int iZzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case STRING:
                return zzkx.zzf(bArr, i, zzkwVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case BYTES:
                int iZzg = zzkx.zzg(bArr, i, zzkwVar);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                b = i9 % 128;
                int i10 = i9 % 2;
                return iZzg;
            case SINT32:
                int iZza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case SINT64:
                int iZzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private final boolean zzJ(Object obj, int i) {
        int i2 = 2 % 2;
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i);
        long j2 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                if (Double.doubleToRawLongBits(zzop.zzl(obj, j2)) == 0) {
                    return false;
                }
                int i3 = b + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                return true;
            case 1:
                if (Float.floatToRawIntBits(zzop.zzj(obj, j2)) == 0) {
                    return false;
                }
                int i5 = b + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                if (zzop.zzf(obj, j2) == 0) {
                    return false;
                }
                int i7 = b + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                return true;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object objZzn = zzop.zzn(obj, j2);
                if (!(!(objZzn instanceof String))) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                if (zzop.zzd(obj, j2) == 0) {
                    return false;
                }
                int i9 = b + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                return i9 % 2 == 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                if (zzop.zzf(obj, j2) == 0) {
                    return false;
                }
                int i10 = b + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                if (i10 % 2 == 0) {
                    return true;
                }
                throw null;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                if (zzop.zzn(obj, j2) == null) {
                    return false;
                }
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                b = i11 % 128;
                int i12 = i11 % 2;
                return true;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0405  */
    static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char cCharAt;
        int i11;
        char cCharAt2;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        int i15;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        String str;
        int i23;
        int iObjectFieldOffset;
        int i24;
        int i25;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        Field fieldZzm;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzm2;
        int i32;
        Object obj2;
        Field fieldZzm3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        int i37 = 2 % 2;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String strZzd = zznwVar.zzd();
        int length = strZzd.length();
        int iCharAt2 = 0;
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            b = i38 % 128;
            int i39 = i38 % 2;
            int i40 = 1;
            while (true) {
                i = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i;
            }
        } else {
            i = 1;
        }
        int i41 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i42 = iCharAt3 & 8191;
            int i43 = 13;
            while (true) {
                i36 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                b = i44 % 128;
                if (i44 % 2 == 0) {
                    i42 |= (cCharAt13 & 9828) - i43;
                    i43 += 16;
                } else {
                    i42 |= (cCharAt13 & 8191) << i43;
                    i43 += 13;
                }
                i41 = i36;
            }
            iCharAt3 = i42 | (cCharAt13 << i43);
            i41 = i36;
        }
        if (iCharAt3 == 0) {
            i7 = 0;
            i3 = 0;
            iCharAt = 0;
            i5 = 0;
            i6 = 0;
            i4 = 0;
            iArr = zza;
        } else {
            int i45 = i41 + 1;
            int iCharAt4 = strZzd.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    cCharAt8 = strZzd.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                iCharAt4 = i46 | (cCharAt8 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strZzd.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    cCharAt7 = strZzd.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                iCharAt5 = i49 | (cCharAt7 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strZzd.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    cCharAt6 = strZzd.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                iCharAt6 = i52 | (cCharAt6 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strZzd.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                b = i55 % 128;
                if (i55 % 2 == 0) {
                    i14 = iCharAt7 & 20517;
                    i15 = 92;
                } else {
                    i14 = iCharAt7 & 8191;
                    i15 = 13;
                }
                while (true) {
                    i16 = i54 + 1;
                    cCharAt5 = strZzd.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i14 |= (cCharAt5 & 8191) << i15;
                    i15 += 13;
                    i54 = i16;
                }
                iCharAt7 = (cCharAt5 << i15) | i14;
                i54 = i16;
            }
            int i56 = i54 + 1;
            iCharAt = strZzd.charAt(i54);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i13 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i13;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i13;
            }
            int i59 = i56 + 1;
            iCharAt2 = strZzd.charAt(i56);
            if (iCharAt2 >= 55296) {
                int i60 = iCharAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i12 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i12;
                }
                iCharAt2 = i60 | (cCharAt3 << i61);
                i59 = i12;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strZzd.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i11 = i64 + 1;
                    cCharAt2 = strZzd.charAt(i64);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    b = i66 % 128;
                    int i67 = i66 % 2;
                    i63 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i64 = i11;
                }
                iCharAt8 = i63 | (cCharAt2 << i65);
                i2 = i11;
            } else {
                i2 = i62;
            }
            int i68 = i2 + 1;
            int iCharAt9 = strZzd.charAt(i2);
            if (iCharAt9 >= 55296) {
                int i69 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i69 % 128;
                if (i69 % 2 != 0) {
                    i8 = iCharAt9 & 20390;
                    i9 = 28;
                } else {
                    i8 = iCharAt9 & 8191;
                    i9 = 13;
                }
                while (true) {
                    i10 = i68 + 1;
                    cCharAt = strZzd.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i8 |= (cCharAt & 8191) << i9;
                    i9 += 13;
                    i68 = i10;
                }
                iCharAt9 = (cCharAt << i9) | i8;
                i68 = i10;
            }
            i3 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i4 = iCharAt9;
            i5 = iCharAt6;
            i6 = iCharAt7;
            i7 = iCharAt4;
            i41 = i68;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i70 = i4 + iCharAt2;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt + iCharAt];
        int i71 = i4;
        int i72 = i70;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= c) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i35 = i77 + 1;
                    cCharAt12 = strZzd.charAt(i77);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i35;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i20 = i35;
            } else {
                i20 = i75;
            }
            int i79 = i20 + 1;
            int iCharAt11 = strZzd.charAt(i20);
            if (iCharAt11 >= c) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i34 = i81 + 1;
                    cCharAt11 = strZzd.charAt(i81);
                    i21 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i34;
                    length = i21;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i79;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i83 = iCharAt11 & 255;
            int i84 = i74;
            int i85 = iCharAt11 & 2048;
            int[] iArr3 = iArr2;
            int i86 = iCharAt10;
            if (i83 >= 51) {
                i26 = i22 + 1;
                int iCharAt12 = strZzd.charAt(i22);
                if (iCharAt12 >= 55296) {
                    int i87 = b + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i87 % 128;
                    int i88 = i87 % 2;
                    int i89 = iCharAt12 & 8191;
                    int i90 = i26;
                    int i91 = 13;
                    while (true) {
                        i33 = i90 + 1;
                        cCharAt10 = strZzd.charAt(i90);
                        i23 = i7;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                        b = i92 % 128;
                        int i93 = i92 % 2;
                        i89 |= (cCharAt10 & 8191) << i91;
                        i91 += 13;
                        i90 = i33;
                        i7 = i23;
                        strZzd = strZzd;
                    }
                    str = strZzd;
                    iCharAt12 = i89 | (cCharAt10 << i91);
                    i26 = i33;
                } else {
                    str = strZzd;
                    i23 = i7;
                }
                int i94 = i83 - 51;
                if (i94 == 9 || i94 == 17) {
                    i30 = i3 + 1;
                    int i95 = i73 / 3;
                    objArr[i95 + i95 + 1] = objArrZze[i3];
                } else {
                    if (i94 == 12) {
                        if (zznwVar.zzc() == 1 || i85 != 0) {
                            i30 = i3 + 1;
                            int i96 = i73 / 3;
                            objArr[i96 + i96 + 1] = objArrZze[i3];
                        } else {
                            i85 = 0;
                        }
                    }
                    i31 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                        b = i97 % 128;
                        int i98 = i97 % 2;
                        fieldZzm2 = (Field) obj;
                    } else {
                        fieldZzm2 = zzm(cls2, (String) obj);
                        objArrZze[i31] = fieldZzm2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZzm3 = (Field) obj2;
                    } else {
                        fieldZzm3 = zzm(cls2, (String) obj2);
                        objArrZze[i32] = fieldZzm3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm3);
                    i25 = 0;
                }
                i3 = i30;
                i31 = iCharAt12 + iCharAt12;
                obj = objArrZze[i31];
                if (obj instanceof Field) {
                    int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                    b = i99 % 128;
                    int i910 = i99 % 2;
                    fieldZzm2 = (Field) obj;
                } else {
                    fieldZzm2 = zzm(cls2, (String) obj);
                    objArrZze[i31] = fieldZzm2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm2);
                i32 = i31 + 1;
                obj2 = objArrZze[i32];
                if (obj2 instanceof Field) {
                    fieldZzm3 = (Field) obj2;
                } else {
                    fieldZzm3 = zzm(cls2, (String) obj2);
                    objArrZze[i32] = fieldZzm3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm3);
                i25 = 0;
            } else {
                str = strZzd;
                i23 = i7;
                int i100 = i3 + 1;
                Field fieldZzm4 = zzm(cls2, (String) objArrZze[i3]);
                if (i83 == 9 || i83 == 17) {
                    int i101 = i73 / 3;
                    objArr[i101 + i101 + 1] = fieldZzm4.getType();
                } else {
                    if (i83 == 27) {
                        i28 = 1;
                        i29 = i3 + 2;
                    } else if (i83 == 49) {
                        int i102 = b + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i102 % 128;
                        int i103 = i102 % 2;
                        i29 = i3 + 2;
                        i28 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            if (zznwVar.zzc() == 1 || i85 != 0) {
                                i29 = i3 + 2;
                                int i104 = i73 / 3;
                                objArr[i104 + i104 + 1] = objArrZze[i100];
                                i100 = i29;
                            }
                        } else if (i83 == 50) {
                            int i105 = i3 + 2;
                            int i106 = i71 + 1;
                            iArr[i71] = i73;
                            int i107 = i73 / 3;
                            int i108 = i107 + i107;
                            objArr[i108] = objArrZze[i100];
                            if (i85 != 0) {
                                objArr[i108 + 1] = objArrZze[i105];
                                i100 = i3 + 3;
                                i71 = i106;
                            } else {
                                i100 = i105;
                                i71 = i106;
                            }
                        }
                        i85 = 0;
                    }
                    int i109 = i73 / 3;
                    objArr[i109 + i109 + i28] = objArrZze[i100];
                    i100 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzm4);
                if ((iCharAt11 & 4096) != 0) {
                    int i110 = b + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i110 % 128;
                    if (i110 % 2 == 0 ? i83 > 17 : i83 > 42) {
                        iObjectFieldOffset = 1048575;
                        i24 = 0;
                    } else {
                        int i111 = i22 + 1;
                        int iCharAt13 = str.charAt(i22);
                        if (iCharAt13 >= 55296) {
                            int i112 = iCharAt13 & 8191;
                            int i113 = 13;
                            while (true) {
                                i27 = i111 + 1;
                                cCharAt9 = str.charAt(i111);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i112 |= (cCharAt9 & 8191) << i113;
                                i113 += 13;
                                i111 = i27;
                            }
                            iCharAt13 = i112 | (cCharAt9 << i113);
                        } else {
                            i27 = i111;
                        }
                        int i114 = i23 + i23 + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i114];
                        if (obj3 instanceof Field) {
                            fieldZzm = (Field) obj3;
                        } else {
                            fieldZzm = zzm(cls2, (String) obj3);
                            objArrZze[i114] = fieldZzm;
                        }
                        str = str;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm);
                        i24 = iCharAt13 % 32;
                        i22 = i27;
                    }
                } else {
                    iObjectFieldOffset = 1048575;
                    i24 = 0;
                }
                if (i83 >= 18 && i83 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                i3 = i100;
                int i115 = i22;
                i25 = i24;
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i26 = i115;
            }
            iArr3[i73] = i86;
            iArr3[i73 + 1] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i85 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset2;
            iArr3[i73 + 2] = (i25 << 20) | iObjectFieldOffset;
            i73 += 3;
            i41 = i26;
            i74 = i84;
            iArr2 = iArr3;
            length = i21;
            i7 = i23;
            strZzd = str;
            c = 55296;
        }
        return new zznp(iArr2, objArr, i5, i6, zznwVar.zzb(), false, iArr, i4, i70, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int length;
        int[] iArr2;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
        int i6 = -1870535734;
        float f = 0.0f;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int i9 = $10 + 125;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i4 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRed = (char) Color.red(0);
                        int minimumFlingVelocity = 3291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i10 = 32 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, minimumFlingVelocity, i10, 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i4] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i4++;
                    i6 = -1870535734;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i8, i8);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i8, i8) + 3292;
                    int i12 = 31 - (TypedValue.complexToFraction(i8, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i8, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b4 = (byte) i8;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iIndexOf, i12, 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                i7 = 1;
                i8 = 0;
            }
            int i13 = $11 + 3;
            $10 = i13 % 128;
            i2 = 2;
            int i14 = i13 % 2;
            iArr5 = iArr6;
            i3 = 0;
        } else {
            i2 = 2;
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i3] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                try {
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 2560, ImageFormat.getBitsPerPixel(0) + 30, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i15--;
                    int i17 = $10 + 125;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 28879), 348 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16777241, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final Object zzq(int i) {
        int i2 = 2 % 2;
        int i3 = b + 79;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2;
        int i6 = i / 3;
        Object obj = this.zzd[i6 + i6];
        int i7 = i4 + 89;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private final zzmk zzr(int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = i >>> 3;
            obj = this.zzd[i5 >>> i5];
        } else {
            int i6 = i / 3;
            obj = this.zzd[i6 + i6 + 1];
        }
        zzmk zzmkVar = (zzmk) obj;
        int i7 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 == 0) {
            return zzmkVar;
        }
        throw null;
    }

    private final int zzx(int i) {
        int i2 = 2 % 2;
        int i3 = b + 81;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2 != 0 ? this.zzc[i] : this.zzc[i + 1];
        int i6 = i4 + 91;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int zzy(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2 == 0 ? this.zzc[i << 2] : this.zzc[i + 2];
        int i6 = i4 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            ((zzmf) this.zzg).zzch();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzmf zzmfVarZzch = ((zzmf) this.zzg).zzch();
        int i3 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return zzmfVarZzch;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        int i3 = 2 % 2;
        int i4 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            zzh(obj, bArr, i, i2, 0, zzkwVar);
        } else {
            zzh(obj, bArr, i, i2, 0, zzkwVar);
        }
    }

    private final void zzt(Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            zzb.putObject(obj, 1048575 & zzx(i), obj2);
            zzK(obj, i);
        } else {
            zzb.putObject(obj, 1048575 & zzx(i), obj2);
            zzK(obj, i);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        int i3 = 2 % 2;
        int i4 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean zZzk = zznxVar.zzk(zzop.zzn(obj, i & 1048575));
        int i5 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return zZzk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r0 = com.google.android.gms.internal.measurement.zznu.zza().zzb((java.lang.Class) r1[r5 + 1]);
        r1[r5] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = r2 + 41;
        com.google.android.gms.internal.measurement.zznp.b = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.measurement.zznx zzp(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zznp.b
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zznp.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = r4.zzd
            int r5 = r5 % 5
            int r5 = r5 + r5
            r3 = r1[r5]
            com.google.android.gms.internal.measurement.zznx r3 = (com.google.android.gms.internal.measurement.zznx) r3
            if (r3 == 0) goto L31
            goto L25
        L1a:
            java.lang.Object[] r1 = r4.zzd
            int r5 = r5 / 3
            int r5 = r5 + r5
            r3 = r1[r5]
            com.google.android.gms.internal.measurement.zznx r3 = (com.google.android.gms.internal.measurement.zznx) r3
            if (r3 == 0) goto L31
        L25:
            int r2 = r2 + 41
            int r5 = r2 % 128
            com.google.android.gms.internal.measurement.zznp.b = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L2f
            return r3
        L2f:
            r5 = 0
            throw r5
        L31:
            com.google.android.gms.internal.measurement.zznu r0 = com.google.android.gms.internal.measurement.zznu.zza()
            int r2 = r5 + 1
            r2 = r1[r2]
            java.lang.Class r2 = (java.lang.Class) r2
            com.google.android.gms.internal.measurement.zznx r0 = r0.zzb(r2)
            r1[r5] = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzp(int):com.google.android.gms.internal.measurement.zznx");
    }

    private final void zzo(Object obj, Object obj2, int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2;
        int i3 = 2 % 2;
        int[] iArr = this.zzc;
        int i4 = iArr[i];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iAlpha = 876 - Color.alpha(0);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 14), bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, packedPositionGroup, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{759416560, 725892701, -1387523499, 1998922012, 509042351, 1619956687, 889789594, -1211270179, 572018191, -140572512, 812787330, -1292520495, -596876828, 1244533857}, 22 - View.combineMeasuredStates(0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{1435065271, -1812462558, -289281309, -1808238630, -941598103, 1943381995, 494174658, -1931256374, 1050734163, 735863591}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr6 = new Object[1];
            a(b3, bArr2[7], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, i5, keyRepeatDelay, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b4, bArr3[10], b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, tapTimeout, modifierMetaStateMask, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyUid = Process.myUid();
            int i8 = ~iMyUid;
            int i9 = (~(794715187 | i8)) | (-1071611452) | (~(835025416 | i8));
            int i10 = 566028172 + (((~(iMyUid | (-558129153))) | i9) * 590) + (i9 * (-1180)) + (((~((-835025417) | i8)) | (~(i8 | (-794715188)))) * 590) + 1574265643;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{727832466, 1213138056, 1232483611, -201342302, 1050449700, -462614410, 1998426352, 275124043, 1519963887, 1477915289, -48112753, -773022756, 892942588, 571746564, 872760610, 1038214146}, KeyEvent.keyCodeFromString("") + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{1324797689, 1435721833, -1128092005, 219545192, -791987017, 294705792, 632619902, 1497070299, -991675681, 1680524488, 768184530, -2022037666}, 18 - Color.argb(0, 0, 0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 1574265643};
                byte[] bArr4 = $$d;
                byte b5 = (byte) (bArr4[0] - 1);
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                d(b5, b6, b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr4[0];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr13 = new Object[1];
                d(b8, b8, b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    int i13 = b + 75;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int mode = 876 - View.MeasureSpec.getMode(0);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        byte b10 = b9;
                        byte b11 = bArr5[10];
                        byte b12 = b9;
                        Object[] objArr15 = new Object[1];
                        a(b10, b11, b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, mode, packedPositionGroup2, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new int[]{759416560, 725892701, -1387523499, 1998922012, 509042351, 1619956687, 889789594, -1211270179, 572018191, -140572512, 812787330, -1292520495, -596876828, 1244533857}, KeyEvent.getDeadChar(0, 0) + 22, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new int[]{1435065271, -1812462558, -289281309, -1808238630, -941598103, 1943381995, 494174658, -1931256374, 1050734163, 735863591}, 15 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iMyPid = 876 - (Process.myPid() >> 22);
                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                            byte[] bArr6 = $$a;
                            byte b13 = bArr6[5];
                            Object[] objArr18 = new Object[1];
                            a(b13, bArr6[7], b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iMyPid, jumpTapTimeout2, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                            int i15 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            a(b14, (byte) (b14 | 14), bArr7[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionType, i15, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~(1033453439 | iIdentityHashCode);
            int i20 = i18 + (-1954498124) + ((5448 | i19) * (-476)) + (i19 * 952) + ((~((~iIdentityHashCode) | 1033453439)) * 476);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            b = i23 % 128;
            int i24 = i23 % 2;
            i2 = 2;
        } else {
            int[] iArr2 = new int[i17];
            int i25 = i17 - 1;
            iArr2[i25] = 1;
            Toast.makeText((Context) null, iArr2[((i17 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i27 = ~i;
            int i28 = i26 + 1736304884 + ((~(386780887 | i27)) * (-560)) + ((~(397410263 | i)) * (-560)) + (((~(i27 | (-346470659))) | 335841282) * 560);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            int i31 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
            i2 = 2;
            int i32 = i31 % 2;
        }
        if (!zzL(obj2, i4, i)) {
            int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            b = i33 % 128;
            int i34 = i33 % i2;
            return;
        }
        int iZzx = zzx(i);
        Unsafe unsafe = zzb;
        int i35 = ((int[]) objArr2[1])[0];
        int i36 = ((i35 * i35) - (~(-(2096711145 * i35)))) - 1;
        int i37 = -(i35 * 1810931687);
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        int i39 = ((i38 | 1220244032) << 1) - (1220244032 ^ i38);
        int i40 = i39 >> 15;
        int i41 = (((i40 & (-262143)) + (i40 | (-262143))) / 131072) + 1;
        int i42 = (i39 & i41) + (i39 | i41);
        int i43 = i39 >> 25;
        int i44 = ((i43 ^ (-255)) + ((i43 & (-255)) << 1)) / 128;
        int i45 = -(i42 ^ ((i44 ^ 1) + ((i44 & 1) << 1)));
        int i46 = (i45 & 5) + (i45 | 5);
        int i47 = i46 >> 28;
        int i48 = ((i47 & (-31)) + (i47 | (-31))) / 16;
        int i49 = (i48 & 1) + (i48 | 1);
        long j2 = iZzx & (146800500 / (((-(((i49 | 1) << 1) - (i49 ^ 1))) & i46) * 28));
        Object object = unsafe.getObject(obj2, j2);
        if (object == null) {
            int i50 = iArr[i];
            String string = obj2.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i50).length() + 38 + string.length());
            sb.append("Source subfield ");
            sb.append(i50);
            sb.append(" is present but null: ");
            sb.append(string);
            throw new IllegalStateException(sb.toString());
        }
        zznx zznxVarZzp = zzp(i);
        if (!zzL(obj, i4, i)) {
            if (zzA(object)) {
                Object objZza = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza, object);
                unsafe.putObject(obj, j2, objZza);
            } else {
                unsafe.putObject(obj, j2, object);
            }
            zzM(obj, i4, i);
            return;
        }
        Object object2 = unsafe.getObject(obj, j2);
        if (!zzA(object2)) {
            Object objZza2 = zznxVarZzp.zza();
            zznxVarZzp.zzd(objZza2, object2);
            unsafe.putObject(obj, j2, objZza2);
            object2 = objZza2;
        }
        zznxVarZzp.zzd(object2, object);
    }

    private final Object zzu(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            zzp(i2);
            zzL(obj, i, i2);
            throw null;
        }
        zznx zznxVarZzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            int i5 = b + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            int i7 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final Object zzs(Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zznx zznxVarZzp = zzp(i);
        int iZzx = zzx(i);
        if (!zzJ(obj, i)) {
            int i5 = b + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return zznxVarZzp.zza();
            }
            zznxVarZzp.zza();
            throw null;
        }
        Object object = zzb.getObject(obj, 1048575 & iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            int i6 = b + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            b = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < iArr.length; i6 += 3) {
                int iZzx = zzx(i6);
                int iZzz = zzz(iZzx);
                long j = iZzx & 1048575;
                if (iZzz == 9) {
                    if (zzJ(obj, i6)) {
                        zzp(i6).zzj(zzb.getObject(obj, j));
                    }
                } else if (iZzz != 60) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    b = i7 % 128;
                    if (i7 % 2 != 0 ? iZzz != 68 : iZzz != 63) {
                        switch (iZzz) {
                            case 17:
                                if (zzJ(obj, i6)) {
                                    zzp(i6).zzj(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzmo) zzop.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    int i8 = b + 5;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        ((zzng) object).zzd();
                                        unsafe.putObject(obj, j, object);
                                        int i9 = 33 / 0;
                                    } else {
                                        ((zzng) object).zzd();
                                        unsafe.putObject(obj, j, object);
                                    }
                                }
                                break;
                        }
                    } else if (zzL(obj, iArr[i6], i6)) {
                        zzp(i6).zzj(zzb.getObject(obj, j));
                    }
                } else if (zzL(obj, iArr[i6], i6)) {
                    zzp(i6).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a A[LOOP:2: B:59:0x0130->B:64:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0169 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zznx zznxVarZzp;
        int i3;
        int i4 = 2 % 2;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.zzj) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            b = i8 % 128;
            int i9 = i8 % 2;
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i10 = iArr[i7];
            int i11 = iArr2[i10];
            int iZzx = zzx(i10);
            int i12 = iArr2[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i5) {
                if (i13 != 1048575) {
                    int i15 = b + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    i6 = zzb.getInt(obj, i13);
                }
                i2 = i6;
                i = i13;
            } else {
                i = i5;
                i2 = i6;
            }
            if ((268435456 & iZzx) != 0 && !zzI(obj, i10, i, i2, i14)) {
                return false;
            }
            int iZzz = zzz(iZzx);
            if (iZzz != 9) {
                int i17 = b;
                int i18 = i17 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                int i19 = i18 % 2;
                if (iZzz == 17) {
                    if (zzI(obj, i10, i, i2, i14) && !zzw(obj, iZzx, zzp(i10))) {
                        return false;
                    }
                } else if (iZzz == 27) {
                    list = (List) zzop.zzn(obj, iZzx & 1048575);
                    if (!list.isEmpty()) {
                        zznxVarZzp = zzp(i10);
                        for (i3 = 0; i3 < list.size(); i3++) {
                            int i20 = b + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                            int i21 = i20 % 2;
                            if (!zznxVarZzp.zzk(list.get(i3))) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                } else if (iZzz != 60) {
                    int i22 = i17 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                    int i23 = i22 % 2;
                    if (iZzz == 68) {
                        if (zzL(obj, i11, i10) && !zzw(obj, iZzx, zzp(i10))) {
                            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                            b = i24 % 128;
                            return i24 % 2 == 0;
                        }
                    } else if (iZzz == 49) {
                        list = (List) zzop.zzn(obj, iZzx & 1048575);
                        if (!list.isEmpty()) {
                            zznxVarZzp = zzp(i10);
                            while (i3 < list.size()) {
                                int i25 = b + 47;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                                int i26 = i25 % 2;
                                if (!zznxVarZzp.zzk(list.get(i3))) {
                                    return false;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (iZzz != 50) {
                        continue;
                    } else {
                        zzng zzngVar = (zzng) zzop.zzn(obj, iZzx & 1048575);
                        if (!zzngVar.isEmpty() && ((zznf) zzq(i10)).zze().zzc.zza() == zzou.MESSAGE) {
                            zznx zznxVarZzb = null;
                            for (Object obj2 : zzngVar.values()) {
                                if (zznxVarZzb == null) {
                                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                                    b = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                                        int i28 = 0 / 0;
                                    } else {
                                        zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                                    }
                                }
                                if (!zznxVarZzb.zzk(obj2)) {
                                    return false;
                                }
                            }
                        }
                    }
                } else if (zzL(obj, i11, i10)) {
                    continue;
                }
            } else if (zzI(obj, i10, i, i2, i14)) {
                continue;
            }
            i7++;
            i5 = i;
            i6 = i2;
        }
        if (this.zzh) {
            int i29 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
            int i30 = i29 % 2;
            if (!((zzmc) obj).zzb.zze()) {
                int i31 = b + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
                int i32 = i31 % 2;
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        int i = 2 % 2;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzx = zzx(i2);
            long j = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i2) || Double.doubleToLongBits(zzop.zzl(obj, j)) != Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (zzH(obj, obj2, i2)) {
                        int i3 = b + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                        int i4 = i3 % 2;
                        if (Float.floatToIntBits(zzop.zzj(obj, j)) == Float.floatToIntBits(zzop.zzj(obj2, j))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (zzH(obj, obj2, i2)) {
                        int i7 = b + 75;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                        int i8 = i7 % 2;
                        if (zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i2) || zzop.zzh(obj, j) != zzop.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (zzH(obj, obj2, i2)) {
                        int i9 = b + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        int i10 = i9 % 2;
                        if (zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i2) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzB) {
                return false;
            }
        }
        if (((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            if (this.zzh) {
                return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
            }
            return true;
        }
        int i11 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i6 >= iArr.length) {
                int iHashCode = (i7 * 53) + ((zzmf) obj).zzc.hashCode();
                if (!this.zzh) {
                    return iHashCode;
                }
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                b = i8 % 128;
                int i9 = i8 % 2;
                return (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode();
            }
            int iZzx = zzx(i6);
            int iZzz = zzz(iZzx);
            int i10 = iArr[i6];
            long j = iZzx & 1048575;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i = i7 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i7 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i7 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i7 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i7 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i7 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i7 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i7 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i7 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i7 * 53;
                    Object objZzn = zzop.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i7 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i7 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i7 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i7 * 53;
                    Object objZzn2 = zzop.zzn(obj, j);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i7 = i2 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i7 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzL(obj, i10, i6)) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                        b = i11 % 128;
                        int i12 = i11 % 2;
                        i = i7 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzE(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzE(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzL(obj, i10, i6)) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                        b = i13 % 128;
                        if (i13 % 2 == 0) {
                            i = i7 % 48;
                            iFloatToIntBits = zzmp.zzb(zzG(obj, j));
                        } else {
                            i = i7 * 53;
                            iFloatToIntBits = zzmp.zzb(zzG(obj, j));
                        }
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzL(obj, i10, i6)) {
                        int i14 = b + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        int i15 = i14 % 2;
                        i = i7 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzL(obj, i10, i6)) {
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            i = i7 * 80;
                            iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        } else {
                            i = i7 * 53;
                            iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        }
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzL(obj, i10, i6)) {
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        i = i7 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzE(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzL(obj, i10, i6)) {
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                        b = i19 % 128;
                        if (i19 % 2 == 0) {
                            i = i7 + 91;
                            iFloatToIntBits = zzE(obj, j);
                        } else {
                            i = i7 * 53;
                            iFloatToIntBits = zzE(obj, j);
                        }
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzE(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzL(obj, i10, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzE(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzL(obj, i10, i6)) {
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                        b = i20 % 128;
                        if (i20 % 2 == 0) {
                            i = i7 + 56;
                            jDoubleToLongBits = zzF(obj, j);
                            byte[] bArr12 = zzmp.zzb;
                        } else {
                            i = i7 * 53;
                            jDoubleToLongBits = zzF(obj, j);
                            byte[] bArr13 = zzmp.zzb;
                        }
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzL(obj, i10, i6)) {
                        int i21 = b + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                        int i22 = i21 % 2;
                        i = i7 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        zzB(obj);
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i4);
            int iZzz = zzz(iZzx);
            int i5 = iArr[i4];
            long j = iZzx & 1048575;
            switch (iZzz) {
                case 0:
                    if (zzJ(obj2, i4)) {
                        int i6 = b + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        if (i6 % 2 == 0) {
                            zzop.zzm(obj, j, zzop.zzl(obj2, j));
                            zzK(obj, i4);
                        } else {
                            zzop.zzm(obj, j, zzop.zzl(obj2, j));
                            zzK(obj, i4);
                            i = 57;
                            int i7 = i / 0;
                        }
                    }
                    break;
                case 1:
                    if (zzJ(obj2, i4)) {
                        int i8 = b + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                        int i9 = i8 % 2;
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 2:
                    if (zzJ(obj2, i4)) {
                        int i10 = b + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                        int i11 = i10 % 2;
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 3:
                    if (zzJ(obj2, i4)) {
                        int i12 = b + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                        int i13 = i12 % 2;
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 4:
                    if (zzJ(obj2, i4)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 5:
                    if (zzJ(obj2, i4)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 6:
                    if (zzJ(obj2, i4)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i4);
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 5 / 3;
                        }
                    }
                    break;
                case 7:
                    if (zzJ(obj2, i4)) {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 8:
                    if (zzJ(obj2, i4)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 9:
                    zzn(obj, obj2, i4);
                    break;
                case 10:
                    if (zzJ(obj2, i4)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 11:
                    if (zzJ(obj2, i4)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 12:
                    if (zzJ(obj2, i4)) {
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 13:
                    if (zzJ(obj2, i4)) {
                        int i18 = b + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                        if (i18 % 2 == 0) {
                            zzop.zze(obj, j, zzop.zzd(obj2, j));
                            zzK(obj, i4);
                        } else {
                            zzop.zze(obj, j, zzop.zzd(obj2, j));
                            zzK(obj, i4);
                            i = 80;
                            int i19 = i / 0;
                        }
                    }
                    break;
                case 14:
                    if (zzJ(obj2, i4)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 15:
                    if (zzJ(obj2, i4)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 16:
                    if (zzJ(obj2, i4)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i4);
                    }
                    break;
                case 17:
                    zzn(obj, obj2, i4);
                    i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                    b = i2 % 128;
                    int i20 = i2 % 2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j, zzmoVar);
                    i2 = b + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    int i21 = i2 % 2;
                    break;
                case 50:
                    int i22 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!(!zzL(obj2, i5, i4))) {
                        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i5, i4);
                    }
                    break;
                case 60:
                    zzo(obj, obj2, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzL(obj2, i5, i4)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i5, i4);
                    }
                    break;
                case 68:
                    zzo(obj, obj2, i4);
                    break;
            }
            i4 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        Map.Entry entry;
        int i;
        int i2;
        int i3;
        int i4;
        Map.Entry entry2;
        int[] iArr;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        if (this.zzh) {
            int i9 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (zzlwVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzlwVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr2.length) {
            int iZzx = zzx(i14);
            int iZzz = zzz(iZzx);
            int i15 = iArr2[i14];
            if (iZzz <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                int i18 = 1 << (i16 >>> 20);
                i2 = i13;
                i3 = i18;
                i = i12;
            } else {
                i = i12;
                i2 = i13;
                i3 = 0;
            }
            if (entry != null) {
                throw null;
            }
            int i19 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            if (i19 % i7 != 0) {
                throw null;
            }
            long j = iZzx & i11;
            switch (iZzz) {
                case 0:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i4, i2, i3)) {
                        zzovVar.zzf(i15, zzop.zzl(obj, j));
                    }
                    break;
                case 1:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    if (!(!zzI(obj, i5, i4, i2, i3))) {
                        zzovVar.zze(i15, zzop.zzj(obj, j));
                    }
                    break;
                case 2:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i4, i2, i3)) {
                        zzovVar.zzc(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i4, i2, i3)) {
                        int i20 = b + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                        int i21 = i20 % 2;
                        zzovVar.zzh(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i4, i2, i3)) {
                        zzovVar.zzi(i15, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    iArr = iArr2;
                    i5 = i14;
                    i4 = i;
                    entry2 = entry;
                    if (!(!zzI(obj, i5, i, i2, i3))) {
                        zzovVar.zzj(i15, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzk(i15, unsafe.getInt(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 7:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzl(i15, zzop.zzh(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 8:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                        b = i22 % 128;
                        if (i22 % 2 == 0) {
                            zzP(i15, unsafe.getObject(obj, j), zzovVar);
                            i6 = 93;
                            int i23 = i6 / 0;
                        } else {
                            zzP(i15, unsafe.getObject(obj, j), zzovVar);
                        }
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 9:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzr(i15, unsafe.getObject(obj, j), zzp(i5));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 10:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzn(i15, (zzlh) unsafe.getObject(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 11:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzo(i15, unsafe.getInt(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 12:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzg(i15, unsafe.getInt(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 13:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzb(i15, unsafe.getInt(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 14:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzd(i15, unsafe.getLong(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 15:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        zzovVar.zzp(i15, unsafe.getInt(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 16:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i5, i, i2, i3)) {
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            zzovVar.zzq(i15, unsafe.getLong(obj, j));
                            i6 = 20;
                            int i25 = i6 / 0;
                        } else {
                            zzovVar.zzq(i15, unsafe.getLong(obj, j));
                        }
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 17:
                    iArr = iArr2;
                    i5 = i14;
                    if (zzI(obj, i14, i, i2, i3)) {
                        zzovVar.zzs(i15, unsafe.getObject(obj, j), zzp(i5));
                    }
                    i4 = i;
                    entry2 = entry;
                    break;
                case 18:
                    zznz.zza(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 19:
                    zznz.zzb(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 20:
                    zznz.zzc(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 21:
                    zznz.zzd(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 22:
                    zznz.zzh(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 23:
                    zznz.zzf(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 24:
                    zznz.zzk(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 25:
                    zznz.zzn(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 26:
                    int i26 = iArr2[i14];
                    List list = (List) unsafe.getObject(obj, j);
                    int i27 = zznz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzovVar.zzF(i26, list);
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 27:
                    int i28 = iArr2[i14];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp = zzp(i14);
                    int i29 = zznz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i30 = 0; i30 < list2.size(); i30++) {
                            int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                            b = i31 % 128;
                            int i32 = i31 % i7;
                            ((zzln) zzovVar).zzr(i28, list2.get(i30), zznxVarZzp);
                        }
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 28:
                    int i33 = iArr2[i14];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i34 = zznz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzovVar.zzG(i33, list3);
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 29:
                    zznz.zzi(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 30:
                    zznz.zzm(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 31:
                    zznz.zzl(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 32:
                    zznz.zzg(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 33:
                    zznz.zzj(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 34:
                    zznz.zze(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, false);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 35:
                    zznz.zza(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 36:
                    zznz.zzb(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 37:
                    zznz.zzc(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 38:
                    zznz.zzd(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 39:
                    zznz.zzh(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 40:
                    zznz.zzf(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 41:
                    zznz.zzk(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 42:
                    zznz.zzn(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 43:
                    zznz.zzi(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 44:
                    zznz.zzm(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 45:
                    zznz.zzl(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 46:
                    zznz.zzg(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 47:
                    zznz.zzj(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 48:
                    zznz.zze(iArr2[i14], (List) unsafe.getObject(obj, j), zzovVar, true);
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 49:
                    int i35 = iArr2[i14];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp2 = zzp(i14);
                    int i36 = zznz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i37 = 0; i37 < list4.size(); i37++) {
                            int i38 = b + 119;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                            int i39 = i38 % i7;
                            ((zzln) zzovVar).zzs(i35, list4.get(i37), zznxVarZzp2);
                        }
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        int i40 = b + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i40 % 128;
                        int i41 = i40 % i7;
                        zzovVar.zzM(i15, ((zznf) zzq(i14)).zze(), (zzng) object);
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 51:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzf(i15, zzC(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 52:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zze(i15, zzD(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 53:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzc(i15, zzF(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 54:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzh(i15, zzF(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 55:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzi(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 56:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzj(i15, zzF(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 57:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzk(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 58:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzl(i15, zzG(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 59:
                    if (zzL(obj, i15, i14)) {
                        zzP(i15, unsafe.getObject(obj, j), zzovVar);
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 60:
                    if (zzL(obj, i15, i14)) {
                        int i42 = b + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i42 % 128;
                        int i43 = i42 % i7;
                        zzovVar.zzr(i15, unsafe.getObject(obj, j), zzp(i14));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 61:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzn(i15, (zzlh) unsafe.getObject(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 62:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzo(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 63:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzg(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 64:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzb(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 65:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzd(i15, zzF(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 66:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzp(i15, zzE(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 67:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzq(i15, zzF(obj, j));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                case 68:
                    if (zzL(obj, i15, i14)) {
                        zzovVar.zzs(i15, unsafe.getObject(obj, j), zzp(i14));
                    }
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
                default:
                    i4 = i;
                    entry2 = entry;
                    iArr = iArr2;
                    i5 = i14;
                    break;
            }
            i14 = i5 + 3;
            entry = entry2;
            i13 = i2;
            iArr2 = iArr;
            i12 = i4;
            i7 = 2;
            i11 = 1048575;
        }
        Map.Entry entry3 = entry;
        if (entry3 != null) {
            throw null;
        }
        int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        b = i44 % 128;
        if (i44 % 2 != 0) {
            ((zzmf) obj).zzc.zzg(zzovVar);
        } else {
            ((zzmf) obj).zzc.zzg(zzovVar);
            int i45 = 55 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:219:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:225:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:228:0x05d3 A[PHI: r13
  0x05d3: PHI (r13v4 int) = 
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v6 int)
  (r13v1 int)
  (r13v7 int)
  (r13v8 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
  (r13v1 int)
 binds: [B:19:0x0061, B:139:0x03b3, B:136:0x039c, B:133:0x0385, B:130:0x036e, B:127:0x0357, B:124:0x033f, B:121:0x0327, B:118:0x030f, B:115:0x02f5, B:112:0x02dd, B:109:0x02c5, B:106:0x02ad, B:103:0x0295, B:168:0x047f, B:100:0x027d, B:179:0x04c7, B:227:0x05d2, B:83:0x020a, B:79:0x01f1, B:76:0x01db, B:73:0x01c5, B:70:0x01ae, B:67:0x0198, B:64:0x018b, B:61:0x017c, B:54:0x0148, B:47:0x011a, B:44:0x00ff, B:41:0x00e9, B:38:0x00d2, B:35:0x00c4, B:32:0x00b6, B:29:0x009c, B:25:0x0081, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i;
        int i2;
        int i3;
        int iZzz;
        int iZzz2;
        int iZzz3;
        int iZzA;
        int iZzz4;
        int iZzz5;
        int iZzz6;
        int iZzz7;
        int iZzc;
        int iZzo;
        int size;
        int iZzp;
        int iZzz8;
        boolean z;
        boolean z2;
        int iZzw;
        int iZzz9;
        int i4;
        int iZzz10;
        int iZzA2;
        int iZzx;
        int iZzz11;
        int iZzz12;
        int iZzz13;
        int iZzz14;
        int iZzz15;
        int iZzz16;
        int iZzc2;
        int i5 = 2 % 2;
        Unsafe unsafe = zzb;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int iZzj = 0;
                int iZzi = i10 + ((zzmf) obj).zzc.zzi();
                if (!this.zzh) {
                    return iZzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int iZzc3 = zzoeVar.zzc();
                for (int i11 = 0; i11 < iZzc3; i11++) {
                    Map.Entry entryZzd = zzoeVar.zzd(i11);
                    iZzj += zzlw.zzj((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    iZzj += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzx2 = zzx(i9);
            int iZzz17 = zzz(iZzx2);
            int i14 = iArr[i9];
            int i15 = iArr[i9 + 2];
            int i16 = i15 & i6;
            if (iZzz17 <= 17) {
                if (i16 != i7) {
                    int i17 = b + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                    int i18 = i17 % 2;
                    i8 = i16 == i6 ? 0 : unsafe.getInt(obj, i16);
                    i7 = i16;
                }
                i = i8;
                i2 = i7;
                i3 = 1 << (i15 >>> 20);
            } else {
                i = i8;
                i2 = i7;
                i3 = 0;
            }
            if (iZzz17 >= zzlx.DOUBLE_LIST_PACKED.zza()) {
                zzlx.SINT64_LIST_PACKED.zza();
            }
            long j = iZzx2 & i6;
            Object obj2 = null;
            switch (iZzz17) {
                case 0:
                    if (!(!zzI(obj, i9, i2, i, i3))) {
                        iZzz = zzlm.zzz(i14 << 3) + 8;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 1:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzz5 = iZzz2 + 4;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 2:
                    if (zzI(obj, i9, i2, i, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j2);
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 3:
                    if (zzI(obj, i9, i2, i, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j3);
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 4:
                    if (zzI(obj, i9, i2, i, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j4);
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 5:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz4 = zzlm.zzz(i14 << 3);
                        iZzz5 = iZzz4 + 8;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 6:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzz5 = iZzz2 + 4;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 7:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz5 = zzlm.zzz(i14 << 3) + 1;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 8:
                    if (zzI(obj, i9, i2, i, i3)) {
                        int i19 = b + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = i14 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzlh) {
                            int iZzz18 = zzlm.zzz(i21);
                            int iZzc4 = ((zzlh) object).zzc();
                            iZzz6 = zzlm.zzz(iZzc4);
                            iZzz7 = iZzz18;
                            iZzc = iZzc4;
                            iZzz5 = iZzz7 + iZzz6 + iZzc;
                            i10 += iZzz5;
                        } else {
                            iZzz3 = zzlm.zzz(i21);
                            iZzA = zzlm.zzB((String) object);
                            iZzz5 = iZzz3 + iZzA;
                            i10 += iZzz5;
                        }
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 9:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz = zznz.zzz(i14, unsafe.getObject(obj, j), zzp(i9));
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 10:
                    if (zzI(obj, i9, i2, i, i3)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j);
                        iZzz7 = zzlm.zzz(i14 << 3);
                        iZzc = zzlhVar.zzc();
                        iZzz6 = zzlm.zzz(iZzc);
                        iZzz5 = iZzz7 + iZzz6 + iZzc;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 11:
                    if (zzI(obj, i9, i2, i, i3)) {
                        int i22 = unsafe.getInt(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzz(i22);
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 12:
                    if (zzI(obj, i9, i2, i, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j5);
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 13:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzz5 = iZzz2 + 4;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 14:
                    if (zzI(obj, i9, i2, i, i3)) {
                        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                        b = i23 % 128;
                        iZzz4 = i23 % 2 == 0 ? zzlm.zzz(i14 >>> 3) : zzlm.zzz(i14 << 3);
                        iZzz5 = iZzz4 + 8;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 15:
                    if (zzI(obj, i9, i2, i, i3)) {
                        int i24 = b + 41;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                        int i25 = i24 % 2;
                        int i26 = unsafe.getInt(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzz((i26 + i26) ^ (i26 >> 31));
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 16:
                    if (zzI(obj, i9, i2, i, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA((j6 + j6) ^ (j6 >> 63));
                        iZzz5 = iZzz3 + iZzA;
                        i10 += iZzz5;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 17:
                    if (zzI(obj, i9, i2, i, i3)) {
                        iZzz = zzlm.zzG(i14, (zznm) unsafe.getObject(obj, j), zzp(i9));
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 18:
                    iZzz = zznz.zzy(i14, (List) unsafe.getObject(obj, j), false);
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 19:
                    iZzz = zznz.zzw(i14, (List) unsafe.getObject(obj, j), false);
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i27 = zznz.zza;
                    if (list.size() == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i14 << 3));
                    }
                    i10 += iZzo;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i28 = zznz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzp(list2);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i29 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i29;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i30 = zznz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzs(list3);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i210 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i210;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 23:
                    z = false;
                    iZzz = zznz.zzy(i14, (List) unsafe.getObject(obj, j), false);
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 24:
                    z2 = false;
                    iZzw = zznz.zzw(i14, (List) unsafe.getObject(obj, j), false);
                    iZzz = iZzw;
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i31 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz = 0;
                    } else {
                        iZzz = size2 * (zzlm.zzz(i14 << 3) + 1);
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i32 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzo = 0;
                    } else {
                        int iZzz19 = zzlm.zzz(i14 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i33 = 0; i33 < size3; i33++) {
                                Object objZzc = zzmxVar.zzc();
                                if (objZzc instanceof zzlh) {
                                    int iZzc5 = ((zzlh) objZzc).zzc();
                                    iZzz19 += zzlm.zzz(iZzc5) + iZzc5;
                                } else {
                                    iZzz19 += zzlm.zzB((String) objZzc);
                                }
                            }
                        } else {
                            for (int i34 = 0; i34 < size3; i34++) {
                                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                b = i35 % 128;
                                if (i35 % 2 == 0) {
                                    boolean z3 = list5.get(i34) instanceof zzlh;
                                    throw null;
                                }
                                Object obj3 = list5.get(i34);
                                if (obj3 instanceof zzlh) {
                                    int iZzc6 = ((zzlh) obj3).zzc();
                                    iZzz19 += zzlm.zzz(iZzc6) + iZzc6;
                                } else {
                                    iZzz19 += zzlm.zzB((String) obj3);
                                }
                            }
                        }
                        iZzo = iZzz19;
                    }
                    i10 += iZzo;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp = zzp(i9);
                    int i36 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = zzlm.zzz(i14 << 3) * size4;
                        int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                        b = i37 % 128;
                        int i38 = i37 % 2;
                        for (int i39 = 0; i39 < size4; i39++) {
                            Object obj4 = list6.get(i39);
                            if (obj4 instanceof zzmw) {
                                int iZzb = ((zzmw) obj4).zzb();
                                iZzz9 += zzlm.zzz(iZzb) + iZzb;
                            } else {
                                iZzz9 += zzlm.zzD((zznm) obj4, zznxVarZzp);
                            }
                        }
                    }
                    i10 += iZzz9;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i40 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        i4 = 0;
                    } else {
                        int iZzz20 = size5 * zzlm.zzz(i14 << 3);
                        for (int i41 = 0; i41 < list7.size(); i41++) {
                            int iZzc7 = ((zzlh) list7.get(i41)).zzc();
                            iZzz20 += zzlm.zzz(iZzc7) + iZzc7;
                        }
                        i4 = iZzz20;
                    }
                    i10 += i4;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i42 = zznz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzt(list8);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i211 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i211;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i43 = zznz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzr(list9);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i212 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i212;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 31:
                    z = false;
                    iZzz = zznz.zzw(i14, (List) unsafe.getObject(obj, j), false);
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 32:
                    z2 = false;
                    iZzw = zznz.zzy(i14, (List) unsafe.getObject(obj, j), false);
                    iZzz = iZzw;
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i44 = zznz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzu(list10);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i213 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i213;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i45 = zznz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zznz.zzq(list11);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        int i214 = size * iZzz8;
                        iZzz10 = iZzp;
                        iZzA2 = i214;
                        iZzz = iZzA2 + iZzz10;
                    }
                    i10 += iZzz;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 35:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 36:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 37:
                    iZzx = zznz.zzo((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 38:
                    iZzx = zznz.zzp((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 39:
                    iZzx = zznz.zzs((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 40:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 41:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i46 = zznz.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 43:
                    iZzx = zznz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 44:
                    iZzx = zznz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 45:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 46:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 47:
                    iZzx = zznz.zzu((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 48:
                    iZzx = zznz.zzq((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        i4 = iZzx + iZzz11 + iZzz12;
                        i10 += i4;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp2 = zzp(i9);
                    int i47 = zznz.zza;
                    int size6 = list13.size();
                    iZzz9 = 0;
                    if (size6 != 0) {
                        for (int i48 = 0; i48 < size6; i48++) {
                            iZzz9 += zzlm.zzG(i14, (zznm) list13.get(i48), zznxVarZzp2);
                        }
                    }
                    i10 += iZzz9;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j);
                    zznf zznfVar = (zznf) zzq(i9);
                    if (zzngVar.isEmpty()) {
                        iZzo = 0;
                    } else {
                        iZzo = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            iZzo += zznfVar.zzd(i14, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i10 += iZzo;
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 51:
                    if (zzL(obj, i14, i9)) {
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz13 + 8;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 52:
                    if (zzL(obj, i14, i9)) {
                        int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                        b = i49 % 128;
                        int i50 = i49 % 2;
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz14 + 4;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 53:
                    if (zzL(obj, i14, i9)) {
                        long jZzF = zzF(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzF);
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 54:
                    if (zzL(obj, i14, i9)) {
                        long jZzF2 = zzF(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzF2);
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 55:
                    if (zzL(obj, i14, i9)) {
                        long jZzE = zzE(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzE);
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 56:
                    if (zzL(obj, i14, i9)) {
                        int i51 = b + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                        int i52 = i51 % 2;
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz13 + 8;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 57:
                    if (zzL(obj, i14, i9)) {
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz14 + 4;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 58:
                    if (zzL(obj, i14, i9)) {
                        iZzz = zzlm.zzz(i14 << 3) + 1;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 59:
                    if (zzL(obj, i14, i9)) {
                        int i53 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzlh) {
                            int iZzz21 = zzlm.zzz(i53);
                            int iZzc8 = ((zzlh) object2).zzc();
                            iZzz15 = zzlm.zzz(iZzc8);
                            iZzz16 = iZzz21;
                            iZzc2 = iZzc8;
                            iZzz = iZzz16 + iZzz15 + iZzc2;
                            i10 += iZzz;
                        } else {
                            iZzz10 = zzlm.zzz(i53);
                            iZzA2 = zzlm.zzB((String) object2);
                            iZzz = iZzA2 + iZzz10;
                            i10 += iZzz;
                        }
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 60:
                    if (zzL(obj, i14, i9)) {
                        int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            zznz.zzz(i14, unsafe.getObject(obj, j), zzp(i9));
                            obj2.hashCode();
                            throw null;
                        }
                        iZzz = zznz.zzz(i14, unsafe.getObject(obj, j), zzp(i9));
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 61:
                    if (zzL(obj, i14, i9)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j);
                        iZzz16 = zzlm.zzz(i14 << 3);
                        iZzc2 = zzlhVar2.zzc();
                        iZzz15 = zzlm.zzz(iZzc2);
                        iZzz = iZzz16 + iZzz15 + iZzc2;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 62:
                    if (zzL(obj, i14, i9)) {
                        int iZzE = zzE(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzz(iZzE);
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 63:
                    if (zzL(obj, i14, i9)) {
                        long jZzE2 = zzE(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzE2);
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 64:
                    if (zzL(obj, i14, i9)) {
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz14 + 4;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 65:
                    if (zzL(obj, i14, i9)) {
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz = iZzz13 + 8;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 66:
                    if (zzL(obj, i14, i9)) {
                        int iZzE2 = zzE(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzz((iZzE2 + iZzE2) ^ (iZzE2 >> 31));
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 67:
                    if (!(!zzL(obj, i14, i9))) {
                        long jZzF3 = zzF(obj, j);
                        iZzz10 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA((jZzF3 + jZzF3) ^ (jZzF3 >> 63));
                        iZzz = iZzA2 + iZzz10;
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                case 68:
                    if (zzL(obj, i14, i9)) {
                        iZzz = zzlm.zzG(i14, (zznm) unsafe.getObject(obj, j), zzp(i9));
                        i10 += iZzz;
                    }
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
                default:
                    i9 += 3;
                    i8 = i;
                    i7 = i2;
                    i6 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:310:0x07c4 A[PHI: r2
  0x07c4: PHI (r2v202 int) = (r2v201 int), (r2v205 int) binds: [B:309:0x07c2, B:306:0x07b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x07d0 A[PHI: r2
  0x07d0: PHI (r2v204 int) = (r2v201 int), (r2v205 int) binds: [B:309:0x07c2, B:306:0x07b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:575:0x0e3b A[PHI: r8 r11 r16 r18
  0x0e3b: PHI (r8v62 java.lang.Object) = 
  (r8v38 java.lang.Object)
  (r8v39 java.lang.Object)
  (r8v40 java.lang.Object)
  (r8v41 java.lang.Object)
  (r8v42 java.lang.Object)
  (r8v43 java.lang.Object)
  (r8v45 java.lang.Object)
  (r8v47 java.lang.Object)
  (r8v53 java.lang.Object)
  (r8v63 java.lang.Object)
 binds: [B:572:0x0e23, B:569:0x0e03, B:566:0x0de7, B:563:0x0dcc, B:560:0x0db0, B:557:0x0d93, B:550:0x0d6d, B:534:0x0d22, B:525:0x0cd8, B:500:0x0c2a] A[DONT_GENERATE, DONT_INLINE]
  0x0e3b: PHI (r11v51 int) = 
  (r11v28 int)
  (r11v29 int)
  (r11v30 int)
  (r11v31 int)
  (r11v32 int)
  (r11v33 int)
  (r11v35 int)
  (r11v37 int)
  (r11v43 int)
  (r11v52 int)
 binds: [B:572:0x0e23, B:569:0x0e03, B:566:0x0de7, B:563:0x0dcc, B:560:0x0db0, B:557:0x0d93, B:550:0x0d6d, B:534:0x0d22, B:525:0x0cd8, B:500:0x0c2a] A[DONT_GENERATE, DONT_INLINE]
  0x0e3b: PHI (r16v35 int) = 
  (r16v19 int)
  (r16v20 int)
  (r16v21 int)
  (r16v22 int)
  (r16v23 int)
  (r16v24 int)
  (r16v26 int)
  (r16v28 int)
  (r16v31 int)
  (r16v36 int)
 binds: [B:572:0x0e23, B:569:0x0e03, B:566:0x0de7, B:563:0x0dcc, B:560:0x0db0, B:557:0x0d93, B:550:0x0d6d, B:534:0x0d22, B:525:0x0cd8, B:500:0x0c2a] A[DONT_GENERATE, DONT_INLINE]
  0x0e3b: PHI (r18v23 int) = 
  (r18v6 int)
  (r18v7 int)
  (r18v8 int)
  (r18v9 int)
  (r18v10 int)
  (r18v11 int)
  (r18v13 int)
  (r18v17 int)
  (r18v19 int)
  (r18v24 int)
 binds: [B:572:0x0e23, B:569:0x0e03, B:566:0x0de7, B:563:0x0dcc, B:560:0x0db0, B:557:0x0d93, B:550:0x0d6d, B:534:0x0d22, B:525:0x0cd8, B:500:0x0c2a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:579:0x0e50  */
    /* JADX WARN: Code duplicated, block: B:581:0x0e59 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:585:0x0e66  */
    /* JADX WARN: Code duplicated, block: B:587:0x0e70  */
    /* JADX WARN: Code duplicated, block: B:589:0x0e7a  */
    /* JADX WARN: Code duplicated, block: B:592:0x0e8e  */
    /* JADX WARN: Code duplicated, block: B:669:0x0e8a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0e3e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x0abc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.measurement.zzoj] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v94 */
    final int zzh(Object obj, byte[] bArr, int i, int i2, int i3, zzkw zzkwVar) throws IOException {
        int i4;
        int i5;
        zznp<T> zznpVar;
        String str;
        Object obj2;
        Unsafe unsafe;
        int i6;
        zzmk zzmkVarZzr;
        int i7;
        int iZzN;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        zzlr zzlrVar;
        zznm zznmVar;
        int i13;
        zznp<T> zznpVar2;
        zznp<T> zznpVar3;
        int iZzj;
        boolean z;
        zznp<T> zznpVar4;
        int i14;
        int iZzc;
        int i15;
        int i16;
        Unsafe unsafe2;
        int i17;
        String str3;
        int iZzc2;
        int iZzj2;
        int i18;
        int iZzg;
        int iZza;
        int i19;
        boolean z2;
        Unsafe unsafe3;
        int i20;
        int i21;
        zzne zzneVar;
        boolean z3;
        zzng zzngVar;
        Object obj3;
        boolean z4;
        zzng zzngVarZzc;
        zzmo zzmoVar;
        int i22;
        int i23;
        int i24;
        int iZza2;
        int i25;
        int iZzl;
        int i26;
        boolean z5;
        boolean z6;
        int i27;
        int iZzn;
        Object obj4;
        int i28;
        int iZzl2;
        int i29;
        int i30;
        int i31;
        int i32;
        zzmo zzmoVarZzg;
        zznp<T> zznpVar5 = this;
        Object obj5 = obj;
        int i33 = 2 % 2;
        zzB(obj);
        Unsafe unsafe4 = zzb;
        int iZzo = i;
        int i34 = 0;
        int i35 = 1048575;
        int i36 = 0;
        int i37 = -1;
        int i38 = 0;
        while (true) {
            int i39 = i37;
            i4 = i34;
            int i40 = i36;
            i5 = i35;
            int i41 = i39;
            while (true) {
                if (iZzo < i2) {
                    int iZzb = iZzo + 1;
                    int i42 = bArr[iZzo];
                    if (i42 < 0) {
                        iZzb = zzkx.zzb(i42, bArr, iZzb, zzkwVar);
                        i42 = zzkwVar.zza;
                    }
                    int i43 = i42 >>> 3;
                    if (i43 > i41) {
                        int i44 = i40 / 3;
                        if (i43 < zznpVar5.zze || i43 > zznpVar5.zzf) {
                            i7 = 0;
                            i8 = -1;
                            iZzN = -1;
                        } else {
                            int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                            b = i45 % 128;
                            int i46 = i45 % 2;
                            iZzN = zznpVar5.zzN(i43, i44);
                            i8 = -1;
                            i7 = 0;
                        }
                    } else if (i43 < zznpVar5.zze || i43 > zznpVar5.zzf) {
                        i7 = 0;
                        i8 = -1;
                        iZzN = -1;
                    } else {
                        i7 = 0;
                        iZzN = zznpVar5.zzN(i43, 0);
                        i8 = -1;
                    }
                    if (iZzN == i8) {
                        str2 = "Failed to parse the message.";
                        i9 = i43;
                        zznpVar = zznpVar5;
                        i40 = i7;
                        i6 = i42;
                    } else {
                        int i47 = i42 & 7;
                        int[] iArr = zznpVar5.zzc;
                        int i48 = i42;
                        int i49 = iArr[iZzN + 1];
                        str2 = "Failed to parse the message.";
                        int iZzz = zzz(i49);
                        long j = i49 & 1048575;
                        i9 = i43;
                        if (iZzz <= 17) {
                            int i50 = iArr[iZzN + 2];
                            int i51 = 1 << (i50 >>> 20);
                            int i52 = 1048575;
                            int i53 = i50 & 1048575;
                            if (i53 != i5) {
                                if (i5 != 1048575) {
                                    unsafe4.putInt(obj5, i5, i4);
                                    i52 = 1048575;
                                }
                                i4 = i53 == i52 ? 0 : unsafe4.getInt(obj5, i53);
                            } else {
                                i53 = i5;
                            }
                            switch (iZzz) {
                                case 0:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    i53 = i53;
                                    zznpVar = this;
                                    if (i47 == 1) {
                                        iZzo = iZzb + 8;
                                        i34 = i4 | i51;
                                        zzop.zzm(obj5, j, Double.longBitsToDouble(zzkx.zze(bArr, iZzb)));
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 1:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    i53 = i53;
                                    zznpVar = this;
                                    if (i47 == 5) {
                                        iZzo = iZzb + 4;
                                        i34 = i4 | i51;
                                        zzop.zzk(obj5, j, Float.intBitsToFloat(zzkx.zzd(bArr, iZzb)));
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 2:
                                case 3:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    i53 = i53;
                                    zznpVar = this;
                                    if (i47 != 0) {
                                        i6 = i13;
                                        i5 = i53;
                                    } else {
                                        i14 = i51 | i4;
                                        iZzc = zzkx.zzc(bArr, iZzb, zzkwVar);
                                        unsafe4.putLong(obj, j, zzkwVar.zzb);
                                        i4 = i14;
                                        iZzo = iZzc;
                                        i2 = i2;
                                        i3 = i3;
                                        i40 = i40;
                                        zznpVar5 = zznpVar;
                                        i41 = i9;
                                        i5 = i53;
                                        i38 = i13;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    i53 = i53;
                                    zznpVar = this;
                                    if (i47 == 0) {
                                        i34 = i4 | i51;
                                        iZzo = zzkx.zza(bArr, iZzb, zzkwVar);
                                        unsafe4.putInt(obj5, j, zzkwVar.zza);
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 5:
                                case 14:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    zznpVar2 = this;
                                    i53 = i53;
                                    if (i47 != 1) {
                                        zznpVar = zznpVar2;
                                        i6 = i13;
                                        i5 = i53;
                                    } else {
                                        iZzc = iZzb + 8;
                                        i14 = i51 | i4;
                                        zznpVar = zznpVar2;
                                        unsafe4.putLong(obj, j, zzkx.zze(bArr, iZzb));
                                        i4 = i14;
                                        iZzo = iZzc;
                                        i2 = i2;
                                        i3 = i3;
                                        i40 = i40;
                                        zznpVar5 = zznpVar;
                                        i41 = i9;
                                        i5 = i53;
                                        i38 = i13;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    zznpVar2 = this;
                                    i53 = i53;
                                    if (i47 == 5) {
                                        i34 = i4 | i51;
                                        unsafe4.putInt(obj5, j, zzkx.zzd(bArr, iZzb));
                                        iZzo = iZzb + 4;
                                        zznpVar = zznpVar2;
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    zznpVar = zznpVar2;
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 7:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    zznpVar2 = this;
                                    i53 = i53;
                                    if (i47 == 0) {
                                        i34 = i4 | i51;
                                        iZzo = zzkx.zzc(bArr, iZzb, zzkwVar);
                                        zzop.zzi(obj5, j, zzkwVar.zzb != 0);
                                        zznpVar = zznpVar2;
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    zznpVar = zznpVar2;
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 8:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    zznpVar2 = this;
                                    i53 = i53;
                                    if (i47 == 2) {
                                        if ((i49 & 536870912) != 0) {
                                            iZzo = zzkx.zzf(bArr, iZzb, zzkwVar);
                                        } else {
                                            iZzo = zzkx.zza(bArr, iZzb, zzkwVar);
                                            int i54 = zzkwVar.zza;
                                            if (i54 < 0) {
                                                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i54 == 0) {
                                                zzkwVar.zzc = "";
                                            } else {
                                                zzkwVar.zzc = new String(bArr, iZzo, i54, zzmp.zza);
                                                iZzo += i54;
                                            }
                                        }
                                        i34 = i4 | i51;
                                        unsafe4.putObject(obj5, j, zzkwVar.zzc);
                                        zznpVar = zznpVar2;
                                        i40 = i40;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    zznpVar = zznpVar2;
                                    i6 = i13;
                                    i5 = i53;
                                    break;
                                case 9:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    zznpVar2 = this;
                                    if (i47 != 2) {
                                        i53 = i53;
                                        zznpVar = zznpVar2;
                                        i6 = i13;
                                        i5 = i53;
                                    } else {
                                        int i55 = i4 | i51;
                                        Object objZzs = zznpVar2.zzs(obj5, i40);
                                        zznpVar3 = zznpVar2;
                                        iZzj = zzkx.zzj(objZzs, zznpVar2.zzp(i40), bArr, iZzb, i2, zzkwVar);
                                        zznpVar3.zzt(obj5, i40, objZzs);
                                        i4 = i55;
                                        i40 = i40;
                                        iZzo = iZzj;
                                        i34 = i4;
                                        zznpVar = zznpVar3;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    break;
                                case 10:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    z = false;
                                    zznpVar4 = this;
                                    if (i47 == 2) {
                                        i4 |= i51;
                                        iZzj = zzkx.zzg(bArr, iZzb, zzkwVar);
                                        unsafe4.putObject(obj5, j, zzkwVar.zzc);
                                        zznpVar3 = zznpVar4;
                                        i40 = i40;
                                        iZzo = iZzj;
                                        i34 = i4;
                                        zznpVar = zznpVar3;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    i6 = i13;
                                    i53 = i53;
                                    zznpVar = zznpVar4;
                                    i5 = i53;
                                    break;
                                case 12:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    z = false;
                                    if (i47 != 0) {
                                        zznpVar4 = this;
                                        i6 = i13;
                                        i53 = i53;
                                        zznpVar = zznpVar4;
                                        i5 = i53;
                                    } else {
                                        int iZza3 = zzkx.zza(bArr, iZzb, zzkwVar);
                                        int i56 = zzkwVar.zza;
                                        zznpVar4 = this;
                                        zzmk zzmkVarZzr2 = zznpVar4.zzr(i40);
                                        if ((i49 & Integer.MIN_VALUE) == 0 || zzmkVarZzr2 == null || zzmkVarZzr2.zza(i56)) {
                                            i4 |= i51;
                                            unsafe4.putInt(obj5, j, i56);
                                        } else {
                                            zzg(obj).zzk(i13 == true ? 1 : 0, Long.valueOf(i56));
                                        }
                                        iZzj = iZza3;
                                        zznpVar3 = zznpVar4;
                                        i40 = i40;
                                        iZzo = iZzj;
                                        i34 = i4;
                                        zznpVar = zznpVar3;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    break;
                                case 15:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    z = false;
                                    if (i47 != 0) {
                                        zznpVar4 = this;
                                        i6 = i13;
                                        i53 = i53;
                                        zznpVar = zznpVar4;
                                        i5 = i53;
                                    } else {
                                        i4 |= i51;
                                        int iZza4 = zzkx.zza(bArr, iZzb, zzkwVar);
                                        unsafe4.putInt(obj5, j, zzlj.zzb(zzkwVar.zza));
                                        zznpVar4 = this;
                                        iZzj = iZza4;
                                        zznpVar3 = zznpVar4;
                                        i40 = i40;
                                        iZzo = iZzj;
                                        i34 = i4;
                                        zznpVar = zznpVar3;
                                        i12 = i9;
                                        i35 = i53;
                                        i38 = i13;
                                        obj2 = obj5;
                                        unsafe = unsafe4;
                                        unsafe4 = unsafe;
                                        obj5 = obj2;
                                        i37 = i12;
                                        zznpVar5 = zznpVar;
                                        i36 = i40;
                                    }
                                    break;
                                case 16:
                                    if (i47 != 0) {
                                        i40 = iZzN;
                                        i6 = i48 == true ? 1 : 0;
                                        i53 = i53;
                                        zznpVar = this;
                                        i5 = i53;
                                    } else {
                                        int iZzc3 = zzkx.zzc(bArr, iZzb, zzkwVar);
                                        i40 = iZzN;
                                        unsafe4.putLong(obj, j, zzlj.zzc(zzkwVar.zzb));
                                        i4 |= i51;
                                        iZzo = iZzc3;
                                        i53 = i53;
                                        i13 = i48 == true ? 1 : 0;
                                        zznpVar = this;
                                        i2 = i2;
                                        i3 = i3;
                                        i40 = i40;
                                        zznpVar5 = zznpVar;
                                        i41 = i9;
                                        i5 = i53;
                                        i38 = i13;
                                    }
                                    break;
                                default:
                                    i40 = iZzN;
                                    i13 = i48 == true ? 1 : 0;
                                    i53 = i53;
                                    zznpVar = this;
                                    if (i47 != 3) {
                                        i6 = i13;
                                        i5 = i53;
                                    } else {
                                        Object objZzs2 = zznpVar.zzs(obj5, i40);
                                        iZzo = zzkx.zzk(objZzs2, zznpVar.zzp(i40), bArr, iZzb, i2, (i9 << 3) | 4, zzkwVar);
                                        zznpVar.zzt(obj5, i40, objZzs2);
                                        obj2 = obj5;
                                        i40 = i40;
                                        i4 |= i51;
                                        unsafe = unsafe4;
                                        i12 = i9;
                                        i5 = i53;
                                        i3 = i3;
                                        i38 = i13 == true ? 1 : 0;
                                    }
                                    unsafe4 = unsafe;
                                    obj5 = obj2;
                                    i41 = i12;
                                    zznpVar5 = zznpVar;
                                    i3 = i3;
                                    i2 = i2;
                                    break;
                            }
                        } else {
                            zznpVar = zznpVar5;
                            i40 = iZzN;
                            i5 = i5;
                            i11 = i4;
                            if (iZzz == 27) {
                                if (i47 == 2) {
                                    zzmo zzmoVarZzg2 = (zzmo) unsafe4.getObject(obj5, j);
                                    if (!zzmoVarZzg2.zza()) {
                                        int size = zzmoVarZzg2.size();
                                        zzmoVarZzg2 = zzmoVarZzg2.zzg(size == 0 ? 10 : size + size);
                                        unsafe4.putObject(obj5, j, zzmoVarZzg2);
                                    }
                                    iZzo = zzkx.zzn(zznpVar.zzp(i40), i48 == true ? 1 : 0, bArr, iZzb, i2, zzmoVarZzg2, zzkwVar);
                                    i3 = i3;
                                    i40 = i40;
                                    zznpVar5 = zznpVar;
                                    i41 = i9;
                                    i5 = i5;
                                    i4 = i11;
                                    i38 = i48 == true ? 1 : 0;
                                } else {
                                    i15 = i48 == true ? 1 : 0;
                                    i16 = iZzb;
                                    unsafe2 = unsafe4;
                                    i17 = i9;
                                    str3 = str2;
                                }
                                i2 = i2;
                            } else {
                                int i57 = i48 == true ? 1 : 0;
                                if (iZzz <= 49) {
                                    long j2 = i49;
                                    zzmo zzmoVar2 = (zzmo) unsafe4.getObject(obj5, j);
                                    if (zzmoVar2.zza()) {
                                        zzmoVar = zzmoVar2;
                                    } else {
                                        int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                                        b = i58 % 128;
                                        if (i58 % 2 == 0) {
                                            int size2 = zzmoVar2.size();
                                            zzmoVarZzg = zzmoVar2.zzg(size2 << size2);
                                            unsafe4.putObject(obj5, j, zzmoVarZzg);
                                        } else {
                                            int size3 = zzmoVar2.size();
                                            zzmoVarZzg = zzmoVar2.zzg(size3 + size3);
                                            unsafe4.putObject(obj5, j, zzmoVarZzg);
                                        }
                                        zzmoVar = zzmoVarZzg;
                                    }
                                    switch (iZzz) {
                                        case 18:
                                        case 35:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 1) {
                                                    int i59 = zzkx.zza;
                                                    zzlo zzloVar = (zzlo) zzmoVar;
                                                    zzloVar.zzf(Double.longBitsToDouble(zzkx.zze(bArr, iZzb)));
                                                    iZza2 = iZzb + 8;
                                                    while (iZza2 < i22) {
                                                        int iZza5 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            zzloVar.zzf(Double.longBitsToDouble(zzkx.zze(bArr, iZza5)));
                                                            iZza2 = iZza5 + 8;
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i60 = zzkx.zza;
                                                zzlo zzloVar2 = (zzlo) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i61 = zzkwVar.zza;
                                                int i62 = iZza2 + i61;
                                                if (i62 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzloVar2.zzh(zzloVar2.size() + (i61 / 8));
                                                while (iZza2 < i62) {
                                                    int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                                                    b = i63 % 128;
                                                    if (i63 % 2 == 0) {
                                                        zzloVar2.zzf(Double.longBitsToDouble(zzkx.zze(bArr, iZza2)));
                                                        iZza2 += 41;
                                                    } else {
                                                        zzloVar2.zzf(Double.longBitsToDouble(zzkx.zze(bArr, iZza2)));
                                                        iZza2 += 8;
                                                    }
                                                }
                                                if (iZza2 != i62) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 5) {
                                                    int i64 = zzkx.zza;
                                                    zzly zzlyVar = (zzly) zzmoVar;
                                                    zzlyVar.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, iZzb)));
                                                    iZza2 = iZzb + 4;
                                                    while (iZza2 < i22) {
                                                        int iZza6 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            zzlyVar.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, iZza6)));
                                                            iZza2 = iZza6 + 4;
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i65 = zzkx.zza;
                                                zzly zzlyVar2 = (zzly) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i66 = zzkwVar.zza;
                                                int i67 = iZza2 + i66;
                                                if (i67 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlyVar2.zzh(zzlyVar2.size() + (i66 / 4));
                                                while (iZza2 < i67) {
                                                    zzlyVar2.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, iZza2)));
                                                    iZza2 += 4;
                                                }
                                                if (iZza2 != i67) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 0) {
                                                    int i68 = zzkx.zza;
                                                    zzna zznaVar = (zzna) zzmoVar;
                                                    iZza2 = zzkx.zzc(bArr, iZzb, zzkwVar);
                                                    zznaVar.zzf(zzkwVar.zzb);
                                                    while (iZza2 < i22) {
                                                        int iZza7 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            iZza2 = zzkx.zzc(bArr, iZza7, zzkwVar);
                                                            zznaVar.zzf(zzkwVar.zzb);
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i69 = zzkx.zza;
                                                zzna zznaVar2 = (zzna) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i70 = zzkwVar.zza + iZza2;
                                                while (iZza2 < i70) {
                                                    iZza2 = zzkx.zzc(bArr, iZza2, zzkwVar);
                                                    zznaVar2.zzf(zzkwVar.zzb);
                                                }
                                                if (iZza2 != i70) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 0) {
                                                    zzmo zzmoVar3 = zzmoVar;
                                                    i25 = i24;
                                                    i40 = i40;
                                                    iZzl = zzkx.zzl(i23 == true ? 1 : 0, bArr, iZzb, i2, zzmoVar3, zzkwVar);
                                                    iZzb = iZzb;
                                                    i26 = i23 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i11 = i11;
                                                    i24 = i25;
                                                    i38 = i26;
                                                    i40 = i40;
                                                    i17 = i24;
                                                    i4 = i11;
                                                    iZzo = iZzl;
                                                    if (iZzo == iZzb) {
                                                        i19 = iZzo;
                                                        i20 = i40;
                                                        i21 = i38 == true ? 1 : 0;
                                                    } else {
                                                        i2 = i22;
                                                        zznpVar5 = zznpVar;
                                                        unsafe4 = unsafe3;
                                                        i41 = i17;
                                                        i3 = i3;
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                                break;
                                            } else {
                                                iZza2 = zzkx.zzm(bArr, iZzb, zzmoVar, zzkwVar);
                                                i40 = i40;
                                                iZzl = iZza2;
                                                iZzb = iZzb;
                                                i26 = i23;
                                                i5 = i5;
                                                i38 = i26;
                                                i40 = i40;
                                                i17 = i24;
                                                i4 = i11;
                                                iZzo = iZzl;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 1) {
                                                    int i71 = zzkx.zza;
                                                    zzna zznaVar3 = (zzna) zzmoVar;
                                                    zznaVar3.zzf(zzkx.zze(bArr, iZzb));
                                                    iZza2 = iZzb + 8;
                                                    while (iZza2 < i22) {
                                                        int iZza8 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            zznaVar3.zzf(zzkx.zze(bArr, iZza8));
                                                            iZza2 = iZza8 + 8;
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i72 = zzkx.zza;
                                                zzna zznaVar4 = (zzna) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i73 = zzkwVar.zza;
                                                int i74 = iZza2 + i73;
                                                if (i74 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zznaVar4.zzh(zznaVar4.size() + (i73 / 8));
                                                while (iZza2 < i74) {
                                                    zznaVar4.zzf(zzkx.zze(bArr, iZza2));
                                                    iZza2 += 8;
                                                }
                                                if (iZza2 != i74) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 5) {
                                                    int i75 = zzkx.zza;
                                                    zzmg zzmgVar = (zzmg) zzmoVar;
                                                    zzmgVar.zzh(zzkx.zzd(bArr, iZzb));
                                                    iZza2 = iZzb + 4;
                                                    while (iZza2 < i22) {
                                                        int i76 = b + 75;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i76 % 128;
                                                        int i77 = i76 % 2;
                                                        int iZza9 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            zzmgVar.zzh(zzkx.zzd(bArr, iZza9));
                                                            iZza2 = iZza9 + 4;
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i78 = zzkx.zza;
                                                zzmg zzmgVar2 = (zzmg) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i79 = zzkwVar.zza;
                                                int i80 = iZza2 + i79;
                                                if (i80 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmgVar2.zzi(zzmgVar2.size() + (i79 / 4));
                                                while (iZza2 < i80) {
                                                    zzmgVar2.zzh(zzkx.zzd(bArr, iZza2));
                                                    iZza2 += 4;
                                                }
                                                if (iZza2 != i80) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 != 2) {
                                                if (i47 == 0) {
                                                    int i81 = zzkx.zza;
                                                    zzky zzkyVar = (zzky) zzmoVar;
                                                    iZza2 = zzkx.zzc(bArr, iZzb, zzkwVar);
                                                    zzkyVar.zzf(zzkwVar.zzb != 0);
                                                    while (iZza2 < i22) {
                                                        int iZza10 = zzkx.zza(bArr, iZza2, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            iZza2 = zzkx.zzc(bArr, iZza10, zzkwVar);
                                                            if (zzkwVar.zzb != 0) {
                                                                int i82 = b + 69;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i82 % 128;
                                                                int i83 = i82 % 2;
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            zzkyVar.zzf(z5);
                                                        }
                                                    }
                                                }
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i84 = zzkx.zza;
                                                zzky zzkyVar2 = (zzky) zzmoVar;
                                                iZza2 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i85 = zzkwVar.zza + iZza2;
                                                while (iZza2 < i85) {
                                                    int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                                                    b = i86 % 128;
                                                    if (i86 % 2 == 0) {
                                                        iZza2 = zzkx.zzc(bArr, iZza2, zzkwVar);
                                                        if (zzkwVar.zzb != 1) {
                                                            int i87 = b + 83;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i87 % 128;
                                                            int i88 = i87 % 2;
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                    } else {
                                                        iZza2 = zzkx.zzc(bArr, iZza2, zzkwVar);
                                                        if (zzkwVar.zzb != 0) {
                                                            int i89 = b + 83;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i89 % 128;
                                                            int i810 = i89 % 2;
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                    }
                                                    zzkyVar2.zzf(z6);
                                                }
                                                if (iZza2 != i85) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            iZzl = iZza2;
                                            iZzb = iZzb;
                                            i26 = i23;
                                            i5 = i5;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 26:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            i27 = i9;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            if (i47 != 2) {
                                                i24 = i27;
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                if ((j2 & 536870912) == 0) {
                                                    int iZza11 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                    int i90 = zzkwVar.zza;
                                                    if (i90 < 0) {
                                                        throw new zzmr(r2);
                                                    }
                                                    if (i90 == 0) {
                                                        zzmoVar.add("");
                                                        obj4 = "";
                                                    } else {
                                                        zzmoVar.add(new String(bArr, iZza11, i90, zzmp.zza));
                                                        obj4 = "";
                                                        iZza11 += i90;
                                                    }
                                                    while (iZza11 < i22) {
                                                        int iZza12 = zzkx.zza(bArr, iZza11, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            iZza11 = zzkx.zza(bArr, iZza12, zzkwVar);
                                                            int i91 = zzkwVar.zza;
                                                            if (i91 < 0) {
                                                                throw new zzmr(r2);
                                                            }
                                                            if (i91 == 0) {
                                                                zzmoVar.add(obj4);
                                                            } else {
                                                                boolean z7 = i23 == true ? 1 : 0;
                                                                zzmoVar.add(new String(bArr, iZza11, i91, zzmp.zza));
                                                                i23 = z7 ? 1 : 0;
                                                                i40 = i40;
                                                                iZza11 += i91;
                                                            }
                                                        } else {
                                                            iZzn = iZza11;
                                                            i40 = i40;
                                                        }
                                                    }
                                                    iZzn = iZza11;
                                                    i40 = i40;
                                                } else {
                                                    int iZza13 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                    int i92 = zzkwVar.zza;
                                                    if (i92 < 0) {
                                                        throw new zzmr(r2);
                                                    }
                                                    if (i92 == 0) {
                                                        zzmoVar.add("");
                                                    } else {
                                                        int i93 = iZza13 + i92;
                                                        if (!zzos.zza(bArr, iZza13, i93)) {
                                                            throw new zzmr("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzmoVar.add(new String(bArr, iZza13, i92, zzmp.zza));
                                                        iZza13 = i93;
                                                    }
                                                    while (iZza13 < i22) {
                                                        int iZza14 = zzkx.zza(bArr, iZza13, zzkwVar);
                                                        if (i23 == zzkwVar.zza) {
                                                            iZza13 = zzkx.zza(bArr, iZza14, zzkwVar);
                                                            int i94 = zzkwVar.zza;
                                                            if (i94 < 0) {
                                                                throw new zzmr(r2);
                                                            }
                                                            if (i94 == 0) {
                                                                zzmoVar.add("");
                                                            } else {
                                                                int i95 = iZza13 + i94;
                                                                if (!zzos.zza(bArr, iZza13, i95)) {
                                                                    throw new zzmr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzmoVar.add(new String(bArr, iZza13, i94, zzmp.zza));
                                                                iZza13 = i95;
                                                            }
                                                        } else {
                                                            iZzn = iZza13;
                                                            iZzb = iZzb;
                                                            i11 = i11;
                                                        }
                                                    }
                                                    iZzn = iZza13;
                                                    iZzb = iZzb;
                                                    i11 = i11;
                                                }
                                                iZzl = iZzn;
                                                i11 = i11;
                                                i26 = i23;
                                                i24 = i27;
                                                i38 = i26;
                                                i40 = i40;
                                                i17 = i24;
                                                i4 = i11;
                                                iZzo = iZzl;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            }
                                            break;
                                        case 27:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            i23 = i57 == true ? 1 : 0;
                                            i28 = i9;
                                            if (i47 == 2) {
                                                i27 = i28;
                                                str = str2;
                                                iZzn = zzkx.zzn(zznpVar.zzp(i40), i23 == true ? 1 : 0, bArr, iZzb, i2, zzmoVar, zzkwVar);
                                                iZzb = iZzb;
                                                i11 = i11;
                                                iZzl = iZzn;
                                                i11 = i11;
                                                i26 = i23;
                                                i24 = i27;
                                                i38 = i26;
                                                i40 = i40;
                                                i17 = i24;
                                                i4 = i11;
                                                iZzo = iZzl;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            }
                                            str = str2;
                                            iZzb = iZzb;
                                            i17 = i28;
                                            iZzo = iZzb;
                                            iZzb = iZzo;
                                            i38 = i23;
                                            i4 = i11;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 28:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            i23 = i57 == true ? 1 : 0;
                                            i28 = i9;
                                            if (i47 == 2) {
                                                int iZza15 = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i96 = zzkwVar.zza;
                                                if (i96 < 0) {
                                                    throw new zzmr(r2);
                                                }
                                                if (i96 > bArr.length - iZza15) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i96 == 0) {
                                                    zzmoVar.add(zzlh.zzb);
                                                } else {
                                                    zzmoVar.add(zzlh.zzh(bArr, iZza15, i96));
                                                    iZza15 += i96;
                                                }
                                                while (iZza15 < i22) {
                                                    int iZza16 = zzkx.zza(bArr, iZza15, zzkwVar);
                                                    if (i23 != zzkwVar.zza) {
                                                        iZzl = iZza15;
                                                        i25 = i28;
                                                        i26 = i23 == true ? 1 : 0;
                                                        str = str2;
                                                        i11 = i11;
                                                        i24 = i25;
                                                        i38 = i26;
                                                        i40 = i40;
                                                        i17 = i24;
                                                        i4 = i11;
                                                        iZzo = iZzl;
                                                        if (iZzo == iZzb) {
                                                            i19 = iZzo;
                                                            i20 = i40;
                                                            i21 = i38 == true ? 1 : 0;
                                                        } else {
                                                            i2 = i22;
                                                            zznpVar5 = zznpVar;
                                                            unsafe4 = unsafe3;
                                                            i41 = i17;
                                                            i3 = i3;
                                                        }
                                                        break;
                                                    } else {
                                                        iZza15 = zzkx.zza(bArr, iZza16, zzkwVar);
                                                        int i97 = zzkwVar.zza;
                                                        if (i97 < 0) {
                                                            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i97 > bArr.length - iZza15) {
                                                            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i97 == 0) {
                                                            zzmoVar.add(zzlh.zzb);
                                                        } else {
                                                            zzmoVar.add(zzlh.zzh(bArr, iZza15, i97));
                                                            iZza15 += i97;
                                                        }
                                                    }
                                                }
                                                iZzl = iZza15;
                                                i25 = i28;
                                                i26 = i23 == true ? 1 : 0;
                                                str = str2;
                                                i11 = i11;
                                                i24 = i25;
                                                i38 = i26;
                                                i40 = i40;
                                                i17 = i24;
                                                i4 = i11;
                                                iZzo = iZzl;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            }
                                            str = str2;
                                            iZzb = iZzb;
                                            i17 = i28;
                                            iZzo = iZzb;
                                            iZzb = iZzo;
                                            i38 = i23;
                                            i4 = i11;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i22 = i2;
                                            if (i47 == 2) {
                                                iZzl2 = zzkx.zzm(bArr, iZzb, zzmoVar, zzkwVar);
                                            } else if (i47 != 0) {
                                                unsafe3 = unsafe4;
                                                iZzb = iZzb;
                                                i23 = i57 == true ? 1 : 0;
                                                i17 = i9;
                                                str = str2;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                iZzl2 = zzkx.zzl(i57 == true ? 1 : 0, bArr, iZzb, i2, zzmoVar, zzkwVar);
                                            }
                                            zzmk zzmkVarZzr3 = zznpVar.zzr(i40);
                                            zzoi zzoiVar = zznpVar.zzl;
                                            int i98 = zznz.zza;
                                            if (zzmkVarZzr3 == null) {
                                                i29 = iZzl2;
                                                unsafe3 = unsafe4;
                                                i30 = i57;
                                                i31 = i9;
                                            } else if (zzmoVar instanceof RandomAccess) {
                                                int size4 = zzmoVar.size();
                                                i29 = iZzl2;
                                                Object objZzE = null;
                                                int i99 = 0;
                                                int i100 = 0;
                                                while (i99 < size4) {
                                                    int i101 = i57;
                                                    int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                                                    Unsafe unsafe5 = unsafe4;
                                                    b = i102 % 128;
                                                    if (i102 % 2 == 0) {
                                                        zzmkVarZzr3.zza(((Integer) zzmoVar.get(i99)).intValue());
                                                        throw null;
                                                    }
                                                    int iIntValue = ((Integer) zzmoVar.get(i99)).intValue();
                                                    if (zzmkVarZzr3.zza(iIntValue)) {
                                                        if (i99 != i100) {
                                                            zzmoVar.set(i100, Integer.valueOf(iIntValue));
                                                        }
                                                        i100++;
                                                        i32 = i9;
                                                    } else {
                                                        i32 = i9;
                                                        objZzE = zznz.zzE(obj5, i32, iIntValue, objZzE, zzoiVar);
                                                    }
                                                    i99++;
                                                    i9 = i32;
                                                    i57 = i101 == true ? 1 : 0;
                                                    unsafe4 = unsafe5;
                                                }
                                                unsafe3 = unsafe4;
                                                i30 = i57;
                                                i31 = i9;
                                                if (i100 != size4) {
                                                    zzmoVar.subList(i100, size4).clear();
                                                }
                                            } else {
                                                i29 = iZzl2;
                                                unsafe3 = unsafe4;
                                                i30 = i57;
                                                i31 = i9;
                                                Iterator it = zzmoVar.iterator();
                                                Object objZzE2 = null;
                                                while (it.hasNext()) {
                                                    int iIntValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzmkVarZzr3.zza(iIntValue2)) {
                                                        objZzE2 = zznz.zzE(obj5, i31, iIntValue2, objZzE2, zzoiVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i40 = i40;
                                            iZzb = iZzb;
                                            i24 = i31;
                                            iZzl = i29;
                                            i5 = i5;
                                            str = str2;
                                            i26 = i30;
                                            i38 = i26;
                                            i40 = i40;
                                            i17 = i24;
                                            i4 = i11;
                                            iZzo = iZzl;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i22 = i2;
                                            if (i47 != 2) {
                                                if (i47 == 0) {
                                                    int i103 = zzkx.zza;
                                                    zzmg zzmgVar3 = (zzmg) zzmoVar;
                                                    iZzo = zzkx.zza(bArr, iZzb, zzkwVar);
                                                    zzmgVar3.zzh(zzlj.zzb(zzkwVar.zza));
                                                    while (iZzo < i22) {
                                                        int iZza17 = zzkx.zza(bArr, iZzo, zzkwVar);
                                                        if (i57 == zzkwVar.zza) {
                                                            iZzo = zzkx.zza(bArr, iZza17, zzkwVar);
                                                            zzmgVar3.zzh(zzlj.zzb(zzkwVar.zza));
                                                        }
                                                    }
                                                }
                                                iZzb = iZzb;
                                                unsafe3 = unsafe4;
                                                i17 = i9;
                                                str = str2;
                                                i23 = i57 == true ? 1 : 0;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                            } else {
                                                int i104 = zzkx.zza;
                                                zzmg zzmgVar4 = (zzmg) zzmoVar;
                                                iZzo = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i105 = zzkwVar.zza + iZzo;
                                                while (iZzo < i105) {
                                                    iZzo = zzkx.zza(bArr, iZzo, zzkwVar);
                                                    zzmgVar4.zzh(zzlj.zzb(zzkwVar.zza));
                                                }
                                                if (iZzo != i105) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i40 = i40;
                                            unsafe3 = unsafe4;
                                            i17 = i9;
                                            str = str2;
                                            i38 = i57 == true ? 1 : 0;
                                            i4 = i11;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i47 == 2) {
                                                int i106 = zzkx.zza;
                                                zzna zznaVar5 = (zzna) zzmoVar;
                                                iZzo = zzkx.zza(bArr, iZzb, zzkwVar);
                                                int i107 = zzkwVar.zza + iZzo;
                                                while (iZzo < i107) {
                                                    iZzo = zzkx.zzc(bArr, iZzo, zzkwVar);
                                                    zznaVar5.zzf(zzlj.zzc(zzkwVar.zzb));
                                                }
                                                if (iZzo != i107) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i22 = i2;
                                            } else if (i47 != 0) {
                                                i22 = i2;
                                                iZzb = iZzb;
                                                unsafe3 = unsafe4;
                                                i17 = i9;
                                                str = str2;
                                                i23 = i57 == true ? 1 : 0;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                                i38 = i23;
                                                i4 = i11;
                                                if (iZzo == iZzb) {
                                                    i19 = iZzo;
                                                    i20 = i40;
                                                    i21 = i38 == true ? 1 : 0;
                                                } else {
                                                    i2 = i22;
                                                    zznpVar5 = zznpVar;
                                                    unsafe4 = unsafe3;
                                                    i41 = i17;
                                                    i3 = i3;
                                                }
                                                break;
                                            } else {
                                                int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                                                b = i108 % 128;
                                                int i109 = i108 % 2;
                                                int i110 = zzkx.zza;
                                                zzna zznaVar6 = (zzna) zzmoVar;
                                                iZzo = zzkx.zzc(bArr, iZzb, zzkwVar);
                                                zznaVar6.zzf(zzlj.zzc(zzkwVar.zzb));
                                                i22 = i2;
                                                while (iZzo < i22) {
                                                    int iZza18 = zzkx.zza(bArr, iZzo, zzkwVar);
                                                    if (i57 == zzkwVar.zza) {
                                                        iZzo = zzkx.zzc(bArr, iZza18, zzkwVar);
                                                        zznaVar6.zzf(zzlj.zzc(zzkwVar.zzb));
                                                    }
                                                }
                                            }
                                            i40 = i40;
                                            unsafe3 = unsafe4;
                                            i17 = i9;
                                            str = str2;
                                            i38 = i57 == true ? 1 : 0;
                                            i4 = i11;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                        default:
                                            i22 = i2;
                                            iZzb = iZzb;
                                            unsafe3 = unsafe4;
                                            str = str2;
                                            i23 = i57 == true ? 1 : 0;
                                            i24 = i9;
                                            if (i47 == 3) {
                                                int i111 = ((i23 == true ? 1 : 0) & (-8)) | 4;
                                                zznx zznxVarZzp = zznpVar.zzp(i40);
                                                i17 = i24;
                                                iZzo = zzkx.zzi(zznxVarZzp, bArr, iZzb, i2, i111, zzkwVar);
                                                zzmoVar.add(zzkwVar.zzc);
                                                while (iZzo < i22) {
                                                    int iZza19 = zzkx.zza(bArr, iZzo, zzkwVar);
                                                    if (i23 == zzkwVar.zza) {
                                                        iZzo = zzkx.zzi(zznxVarZzp, bArr, iZza19, i2, i111, zzkwVar);
                                                        zzmoVar.add(zzkwVar.zzc);
                                                    } else {
                                                        iZzb = iZzb;
                                                    }
                                                }
                                                iZzb = iZzb;
                                            } else {
                                                i17 = i24;
                                                iZzo = iZzb;
                                                iZzb = iZzo;
                                            }
                                            i38 = i23;
                                            i4 = i11;
                                            if (iZzo == iZzb) {
                                                i19 = iZzo;
                                                i20 = i40;
                                                i21 = i38 == true ? 1 : 0;
                                            } else {
                                                i2 = i22;
                                                zznpVar5 = zznpVar;
                                                unsafe4 = unsafe3;
                                                i41 = i17;
                                                i3 = i3;
                                            }
                                            break;
                                    }
                                } else {
                                    unsafe2 = unsafe4;
                                    i17 = i9;
                                    str = str2;
                                    boolean z8 = i57 == true ? 1 : 0;
                                    i16 = iZzb;
                                    if (iZzz != 50) {
                                        unsafe = unsafe2;
                                        long j3 = iArr[i40 + 2] & 1048575;
                                        switch (iZzz) {
                                            case 51:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 1) {
                                                    iZzc2 = i16 + 8;
                                                    unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i16))));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3 || i3 == 0) {
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i112 = zzlr.zzb;
                                                            int i113 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i114 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = i10;
                                                        i5 = i5;
                                                        i4 = i11;
                                                    }
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 52:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 5) {
                                                    iZzc2 = i16 + 4;
                                                    unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i16))));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i115 = zzlr.zzb;
                                                        int i116 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i117 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 0) {
                                                    iZzc2 = zzkx.zzc(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkwVar.zzb));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i118 = zzlr.zzb;
                                                        int i119 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1110 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 0) {
                                                    iZzc2 = zzkx.zza(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkwVar.zza));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i1111 = zzlr.zzb;
                                                        int i1112 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1113 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 1) {
                                                    iZzc2 = i16 + 8;
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkx.zze(bArr, i16)));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i1114 = zzlr.zzb;
                                                        int i1115 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1116 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 5) {
                                                    iZzc2 = i16 + 4;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkx.zzd(bArr, i16)));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i1117 = zzlr.zzb;
                                                        int i1118 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1119 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 58:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 0) {
                                                    iZzc2 = zzkx.zzc(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, Boolean.valueOf(zzkwVar.zzb != 0));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZzc2;
                                                } else {
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i11110 = zzlr.zzb;
                                                        int i11111 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i11112 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 59:
                                                obj2 = obj;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 2) {
                                                    int iZza20 = zzkx.zza(bArr, i16, zzkwVar);
                                                    int i120 = zzkwVar.zza;
                                                    if (i120 == 0) {
                                                        unsafe.putObject(obj2, j, "");
                                                    } else {
                                                        int i121 = iZza20 + i120;
                                                        if ((i49 & 536870912) != 0 && !zzos.zza(bArr, iZza20, i121)) {
                                                            throw new zzmr("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j, new String(bArr, iZza20, i120, zzmp.zza));
                                                        iZza20 = i121;
                                                    }
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZza20;
                                                } else {
                                                    i40 = i40;
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i11113 = zzlr.zzb;
                                                        int i11114 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i11115 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 60:
                                                obj2 = obj;
                                                i12 = i17;
                                                if (i47 == 2) {
                                                    Object objZzu = zznpVar.zzu(obj2, i12, i40);
                                                    zznx zznxVarZzp2 = zznpVar.zzp(i40);
                                                    i38 = z8 ? 1 : 0;
                                                    iZzj2 = zzkx.zzj(objZzu, zznxVarZzp2, bArr, i16, i2, zzkwVar);
                                                    zznpVar.zzv(obj2, i12, i40, objZzu);
                                                    i40 = i40;
                                                } else {
                                                    i38 = z8 ? 1 : 0;
                                                    i40 = i40;
                                                    iZzj2 = i16;
                                                }
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i11116 = zzlr.zzb;
                                                        int i11117 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i11118 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 61:
                                                obj2 = obj;
                                                i18 = z8 ? 1 : 0;
                                                i12 = i17;
                                                if (i47 == 2) {
                                                    iZzg = zzkx.zzg(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, zzkwVar.zzc);
                                                    unsafe.putInt(obj2, j3, i12);
                                                    i40 = i40;
                                                    iZzj2 = iZzg;
                                                    i38 = i18;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i11119 = zzlr.zzb;
                                                            int i111110 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i111111 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                }
                                                i40 = i40;
                                                i38 = i18;
                                                iZzj2 = i16;
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i111112 = zzlr.zzb;
                                                        int i111113 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i111114 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 63:
                                                obj2 = obj;
                                                i12 = i17;
                                                if (i47 == 0) {
                                                    int iZza21 = zzkx.zza(bArr, i16, zzkwVar);
                                                    int i122 = zzkwVar.zza;
                                                    zzmk zzmkVarZzr4 = zznpVar.zzr(i40);
                                                    if (zzmkVarZzr4 == null || zzmkVarZzr4.zza(i122)) {
                                                        i18 = z8 ? 1 : 0;
                                                        unsafe.putObject(obj2, j, Integer.valueOf(i122));
                                                        unsafe.putInt(obj2, j3, i12);
                                                    } else {
                                                        zzoj zzojVarZzg = zzg(obj);
                                                        Long lValueOf = Long.valueOf(i122);
                                                        i18 = z8 ? 1 : 0;
                                                        zzojVarZzg.zzk(i18 == true ? 1 : 0, lValueOf);
                                                    }
                                                    iZzg = iZza21;
                                                    i40 = i40;
                                                    iZzj2 = iZzg;
                                                    i38 = i18;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i111115 = zzlr.zzb;
                                                            int i111116 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i111117 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                }
                                                i18 = z8 ? 1 : 0;
                                                i40 = i40;
                                                i38 = i18;
                                                iZzj2 = i16;
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i111118 = zzlr.zzb;
                                                        int i111119 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1111110 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 66:
                                                obj2 = obj;
                                                i12 = i17;
                                                if (i47 == 0) {
                                                    iZza = zzkx.zza(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzlj.zzb(zzkwVar.zza)));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZza;
                                                    i40 = i40;
                                                    i38 = z8 ? 1 : 0;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i1111111 = zzlr.zzb;
                                                            int i1111112 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i1111113 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                }
                                                i18 = z8 ? 1 : 0;
                                                i40 = i40;
                                                i38 = i18;
                                                iZzj2 = i16;
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i1111114 = zzlr.zzb;
                                                        int i1111115 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i1111116 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                            case 67:
                                                obj2 = obj;
                                                i12 = i17;
                                                if (i47 != 0) {
                                                    i18 = z8 ? 1 : 0;
                                                    i40 = i40;
                                                    i38 = i18;
                                                    iZzj2 = i16;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i1111117 = zzlr.zzb;
                                                            int i1111118 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i1111119 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                } else {
                                                    iZza = zzkx.zzc(bArr, i16, zzkwVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzlj.zzc(zzkwVar.zzb)));
                                                    unsafe.putInt(obj2, j3, i12);
                                                    iZzj2 = iZza;
                                                    i40 = i40;
                                                    i38 = z8 ? 1 : 0;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i11111110 = zzlr.zzb;
                                                            int i11111111 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i11111112 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i47 == 3) {
                                                    Object objZzu2 = zznpVar.zzu(obj, i17, i40);
                                                    int iZzk = zzkx.zzk(objZzu2, zznpVar.zzp(i40), bArr, i16, i2, ((z8 ? 1 : 0) & (-8)) | 4, zzkwVar);
                                                    zznpVar.zzv(obj, i17, i40, objZzu2);
                                                    iZzg = iZzk;
                                                    obj2 = obj;
                                                    i12 = i17;
                                                    i18 = z8 ? 1 : 0;
                                                    i40 = i40;
                                                    iZzj2 = iZzg;
                                                    i38 = i18;
                                                    if (iZzj2 == i16) {
                                                        i10 = iZzj2;
                                                        i6 = i38 == true ? 1 : 0;
                                                        i40 = i40;
                                                        if (i6 == i3) {
                                                        }
                                                        if (zznpVar.zzh) {
                                                            zzlrVar = zzkwVar.zzd;
                                                            int i11111113 = zzlr.zzb;
                                                            int i11111114 = zznu.zza;
                                                            if (zzlrVar != zzlr.zza) {
                                                                zznmVar = zznpVar.zzg;
                                                                int i11111115 = zzkx.zza;
                                                                if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                    throw null;
                                                                }
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            } else {
                                                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                            }
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                        i40 = i40;
                                                        i38 = i6 == true ? 1 : 0;
                                                        i5 = i5;
                                                        i4 = i11;
                                                        unsafe4 = unsafe;
                                                        obj5 = obj2;
                                                        i41 = i12;
                                                        zznpVar5 = zznpVar;
                                                        i3 = i3;
                                                        i2 = i2;
                                                    } else {
                                                        iZzo = iZzj2;
                                                        i35 = i5;
                                                        i34 = i11;
                                                    }
                                                    break;
                                                }
                                            default:
                                                obj2 = obj;
                                                i40 = i40;
                                                i38 = z8 ? 1 : 0;
                                                i12 = i17;
                                                iZzj2 = i16;
                                                if (iZzj2 == i16) {
                                                    i10 = iZzj2;
                                                    i6 = i38 == true ? 1 : 0;
                                                    i40 = i40;
                                                    if (i6 == i3) {
                                                    }
                                                    if (zznpVar.zzh) {
                                                        zzlrVar = zzkwVar.zzd;
                                                        int i11111116 = zzlr.zzb;
                                                        int i11111117 = zznu.zza;
                                                        if (zzlrVar != zzlr.zza) {
                                                            zznmVar = zznpVar.zzg;
                                                            int i11111118 = zzkx.zza;
                                                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                                                throw null;
                                                            }
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        } else {
                                                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                        }
                                                    } else {
                                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                                    }
                                                    i40 = i40;
                                                    i38 = i6 == true ? 1 : 0;
                                                    i5 = i5;
                                                    i4 = i11;
                                                    unsafe4 = unsafe;
                                                    obj5 = obj2;
                                                    i41 = i12;
                                                    zznpVar5 = zznpVar;
                                                    i3 = i3;
                                                    i2 = i2;
                                                } else {
                                                    iZzo = iZzj2;
                                                    i35 = i5;
                                                    i34 = i11;
                                                }
                                                break;
                                        }
                                    } else if (i47 == 2) {
                                        Object objZzq = zznpVar.zzq(i40);
                                        Unsafe unsafe6 = unsafe2;
                                        Object object = unsafe6.getObject(obj5, j);
                                        if (!((zzng) object).zze()) {
                                            int i123 = b + 33;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i123 % 128;
                                            if (i123 % 2 != 0) {
                                                zzngVarZzc = zzng.zza().zzc();
                                                zznh.zza(zzngVarZzc, object);
                                                unsafe6.putObject(obj5, j, zzngVarZzc);
                                                int i124 = 87 / 0;
                                            } else {
                                                zzngVarZzc = zzng.zza().zzc();
                                                zznh.zza(zzngVarZzc, object);
                                                unsafe6.putObject(obj5, j, zzngVarZzc);
                                            }
                                            object = zzngVarZzc;
                                        }
                                        zzne zzneVarZze = ((zznf) objZzq).zze();
                                        zzng zzngVar2 = (zzng) object;
                                        int iZza22 = zzkx.zza(bArr, i16, zzkwVar);
                                        int i125 = zzkwVar.zza;
                                        if (i125 < 0 || i125 > i2 - iZza22) {
                                            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        i19 = iZza22 + i125;
                                        Object obj6 = zzneVarZze.zzb;
                                        Object obj7 = zzneVarZze.zzd;
                                        Object obj8 = obj6;
                                        Object obj9 = obj7;
                                        while (iZza22 < i19) {
                                            Object obj10 = obj9;
                                            int iZzb2 = iZza22 + 1;
                                            int i126 = bArr[iZza22];
                                            if (i126 < 0) {
                                                z2 = z8;
                                                iZzb2 = zzkx.zzb(i126, bArr, iZzb2, zzkwVar);
                                                i126 = zzkwVar.zza;
                                            }
                                            z2 = z8;
                                            Object obj11 = obj8;
                                            int i127 = i126 >>> 3;
                                            zzng zzngVar3 = zzngVar2;
                                            int i128 = i126 & 7;
                                            Unsafe unsafe7 = unsafe6;
                                            if (i127 != 1) {
                                                if (i127 == 2) {
                                                    zzot zzotVar = zzneVarZze.zzc;
                                                    if (i128 == zzotVar.zzb()) {
                                                        z3 = z2;
                                                        obj11 = obj11;
                                                        obj3 = obj7;
                                                        zzngVar = zzngVar3;
                                                        zzneVar = zzneVarZze;
                                                        iZza22 = zzO(bArr, iZzb2, i2, zzotVar, obj7.getClass(), zzkwVar);
                                                        obj9 = zzkwVar.zzc;
                                                    }
                                                    obj8 = obj11;
                                                    zzneVarZze = zzneVar;
                                                    zzngVar2 = zzngVar;
                                                    obj7 = obj3;
                                                    z2 = z3;
                                                    unsafe6 = unsafe7;
                                                }
                                                zzneVar = zzneVarZze;
                                                z4 = z2;
                                                zzngVar = zzngVar3;
                                                obj3 = obj7;
                                            } else {
                                                zzneVar = zzneVarZze;
                                                z3 = z2;
                                                zzngVar = zzngVar3;
                                                obj3 = obj7;
                                                zzot zzotVar2 = zzneVar.zza;
                                                if (i128 == zzotVar2.zzb()) {
                                                    z4 = z3;
                                                    iZza22 = zzO(bArr, iZzb2, i2, zzotVar2, null, zzkwVar);
                                                    obj8 = zzkwVar.zzc;
                                                    obj9 = obj10;
                                                }
                                                zzneVarZze = zzneVar;
                                                zzngVar2 = zzngVar;
                                                obj7 = obj3;
                                                z2 = z3;
                                                unsafe6 = unsafe7;
                                            }
                                            z4 = z3;
                                            iZza22 = zzkx.zzp(i126, bArr, iZzb2, i2, zzkwVar);
                                            obj9 = obj10;
                                            z3 = z4;
                                            obj8 = obj11;
                                            zzneVarZze = zzneVar;
                                            zzngVar2 = zzngVar;
                                            obj7 = obj3;
                                            z2 = z3;
                                            unsafe6 = unsafe7;
                                        }
                                        z2 = z8;
                                        Object obj12 = obj9;
                                        unsafe3 = unsafe6;
                                        boolean z9 = z2;
                                        Object obj13 = obj8;
                                        zzng zzngVar4 = zzngVar2;
                                        if (iZza22 != i19) {
                                            throw new zzmr(str);
                                        }
                                        zzngVar4.put(obj13, obj12);
                                        if (i19 != i16) {
                                            obj2 = obj;
                                            i40 = i40;
                                            iZzo = i19;
                                            i35 = i5;
                                            i34 = i11;
                                            i38 = z9 ? 1 : 0;
                                            unsafe = unsafe3;
                                            i12 = i17;
                                        } else {
                                            i20 = i40;
                                            i5 = i5;
                                            i4 = i11;
                                            i21 = z9 ? 1 : 0;
                                        }
                                    } else {
                                        i15 = z8 ? 1 : 0;
                                        str3 = str;
                                    }
                                    unsafe4 = unsafe;
                                    obj5 = obj2;
                                    i37 = i12;
                                    zznpVar5 = zznpVar;
                                    i36 = i40;
                                }
                                obj2 = obj;
                                i40 = i20;
                                i5 = i5;
                                i11 = i4;
                                i10 = i19;
                                unsafe = unsafe3;
                                i12 = i17;
                                i6 = i21;
                                if (i6 == i3) {
                                }
                                if (zznpVar.zzh) {
                                    zzlrVar = zzkwVar.zzd;
                                    int i11111119 = zzlr.zzb;
                                    int i111111110 = zznu.zza;
                                    if (zzlrVar != zzlr.zza) {
                                        zznmVar = zznpVar.zzg;
                                        int i111111111 = zzkx.zza;
                                        if (zzlrVar.zzb(zznmVar, i12) == null) {
                                            throw null;
                                        }
                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                    } else {
                                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                    }
                                } else {
                                    iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                }
                                i40 = i40;
                                i38 = i6 == true ? 1 : 0;
                                i5 = i5;
                                i4 = i11;
                                unsafe4 = unsafe;
                                obj5 = obj2;
                                i41 = i12;
                                zznpVar5 = zznpVar;
                                i3 = i3;
                                i2 = i2;
                            }
                            obj2 = obj;
                            i10 = i16;
                            str = str3;
                            i6 = i15;
                            unsafe = unsafe2;
                            i12 = i17;
                            if (i6 == i3) {
                            }
                            if (zznpVar.zzh) {
                                zzlrVar = zzkwVar.zzd;
                                int i111111112 = zzlr.zzb;
                                int i111111113 = zznu.zza;
                                if (zzlrVar != zzlr.zza) {
                                    zznmVar = zznpVar.zzg;
                                    int i111111114 = zzkx.zza;
                                    if (zzlrVar.zzb(zznmVar, i12) == null) {
                                        throw null;
                                    }
                                    iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                } else {
                                    iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                                }
                            } else {
                                iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                            }
                            i40 = i40;
                            i38 = i6 == true ? 1 : 0;
                            i5 = i5;
                            i4 = i11;
                            unsafe4 = unsafe;
                            obj5 = obj2;
                            i41 = i12;
                            zznpVar5 = zznpVar;
                            i3 = i3;
                            i2 = i2;
                        }
                    }
                    obj2 = obj5;
                    i5 = i5;
                    i10 = iZzb;
                    i11 = i4;
                    unsafe = unsafe4;
                    i12 = i9;
                    str = str2;
                    if (i6 == i3) {
                    }
                    if (zznpVar.zzh) {
                        zzlrVar = zzkwVar.zzd;
                        int i111111115 = zzlr.zzb;
                        int i111111116 = zznu.zza;
                        if (zzlrVar != zzlr.zza) {
                            zznmVar = zznpVar.zzg;
                            int i111111117 = zzkx.zza;
                            if (zzlrVar.zzb(zznmVar, i12) == null) {
                                throw null;
                            }
                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                        } else {
                            iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                        }
                    } else {
                        iZzo = zzkx.zzo(i6 == true ? 1 : 0 ? 1 : 0, bArr, i10, i2, zzg(obj), zzkwVar);
                    }
                    i40 = i40;
                    i38 = i6 == true ? 1 : 0;
                    i5 = i5;
                    i4 = i11;
                    unsafe4 = unsafe;
                    obj5 = obj2;
                    i41 = i12;
                    zznpVar5 = zznpVar;
                    i3 = i3;
                    i2 = i2;
                } else {
                    zznpVar = zznpVar5;
                    str = "Failed to parse the message.";
                    i3 = i3;
                    obj2 = obj5;
                    unsafe = unsafe4;
                    i6 = i38;
                }
            }
        }
        if (i5 != 1048575) {
            unsafe.putInt(obj2, i5, i4);
        }
        int i129 = zznpVar.zzj;
        ?? Zza = 0;
        while (i129 < zznpVar.zzk) {
            int[] iArr2 = zznpVar.zzi;
            zzoi zzoiVar2 = zznpVar.zzl;
            int[] iArr3 = zznpVar.zzc;
            int i130 = iArr2[i129];
            int i131 = iArr3[i130];
            Object objZzn = zzop.zzn(obj2, zznpVar.zzx(i130) & 1048575);
            if (objZzn != null && (zzmkVarZzr = zznpVar.zzr(i130)) != null) {
                zzne zzneVarZze2 = ((zznf) zznpVar.zzq(i130)).zze();
                Iterator it2 = ((zzng) objZzn).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!zzmkVarZzr.zza(((Integer) entry.getValue()).intValue())) {
                        if (Zza == 0) {
                            Zza = zzoiVar2.zza(obj2);
                        }
                        int iZzc4 = zznf.zzc(zzneVarZze2, entry.getKey(), entry.getValue());
                        zzlh zzlhVar = zzlh.zzb;
                        byte[] bArr2 = new byte[iZzc4];
                        int i132 = zzlm.zzb;
                        zzoi zzoiVar3 = zzoiVar2;
                        zzlk zzlkVar = new zzlk(bArr2, 0, iZzc4);
                        try {
                            zznf.zzb(zzlkVar, zzneVarZze2, entry.getKey(), entry.getValue());
                            ((zzoj) Zza).zzk((i131 << 3) | 2, zzle.zza(zzlkVar, bArr2));
                            it2.remove();
                            zzoiVar2 = zzoiVar3;
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            i129++;
            Zza = (zzoj) Zza;
        }
        if (Zza != 0) {
            ((zzmf) obj2).zzc = Zza;
        }
        if (i3 != 0) {
            String str4 = str;
            if (iZzo > i2 || i6 != i3) {
                throw new zzmr(str4);
            }
        } else if (iZzo != i2) {
            throw new zzmr(str);
        }
        return iZzo;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        boolean z2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        if (zzlsVar != null) {
            z2 = true;
            if (!(zznmVar instanceof zzmc)) {
                z2 = false;
            } else {
                int i5 = b + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            }
        } else {
            z2 = false;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    private static int zzz(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 43;
        b = i4 % 128;
        int i5 = i4 % 2 == 0 ? (i - 37) & 16874 : (i >>> 20) & 255;
        int i6 = i3 + 55;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{-1263721832, -2110106065, 520178943, -1025938444, -1555246413, -1787438517, 2127087557, 127237655, -1557946084, 856535489, -1298277169, -204657159, 232674637, 1231522934, 109205945, 230436574, -1305238012, 279081507};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zznp.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.$$g(byte, int, short):java.lang.String");
    }
}
