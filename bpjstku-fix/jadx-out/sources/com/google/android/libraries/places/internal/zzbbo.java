package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbo<T> implements zzbbz<T> {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzbbl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzbcm zzm;
    private final zzazq zzn;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, 115, -83, 116, 13, 10, -25, 53, 10, -14, 23, 16, 22, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 243;
    private static final byte[] $$a = {94, 6, -99, -107, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 187;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = new int[0];
        zzb = zzbct.zzq();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    private static void a(int i, byte b2, int i2, Object[] objArr) {
        int i3 = 56 - (i2 * 52);
        int i4 = (i * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b2];
        int i5 = 52 - b2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + (-i3)) - 10;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i4 = (i4 + (-bArr[i3])) - 10;
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbbo.$$d
            int r5 = r5 * 28
            int r1 = 38 - r5
            int r6 = r6 * 13
            int r6 = 97 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = 37 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.d(byte, short, byte, java.lang.Object[]):void");
    }

    private static boolean zzB(Object obj) {
        int i = 2 % 2;
        int i2 = b + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            if (obj instanceof zzbae) {
                return ((zzbae) obj).zzbd();
            }
            return true;
        }
        int i5 = i3 + 77;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static double zzD(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        double dDoubleValue = ((Double) zzbct.zzn(obj, j)).doubleValue();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return dDoubleValue;
    }

    private static float zzE(Object obj, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) zzbct.zzn(obj, j)).floatValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static int zzF(Object obj, long j) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) zzbct.zzn(obj, j);
        if (i3 == 0) {
            iIntValue = num.intValue();
            int i4 = 28 / 0;
        } else {
            iIntValue = num.intValue();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        b = i5 % 128;
        int i6 = i5 % 2;
        return iIntValue;
    }

    private static long zzG(Object obj, long j) {
        long jLongValue;
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Long l = (Long) zzbct.zzn(obj, j);
        if (i3 != 0) {
            jLongValue = l.longValue();
            int i4 = 92 / 0;
        } else {
            jLongValue = l.longValue();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        b = i5 % 128;
        int i6 = i5 % 2;
        return jLongValue;
    }

    private static boolean zzH(Object obj, long j) {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) zzbct.zzn(obj, j)).booleanValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private final boolean zzI(Object obj, Object obj2, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (zzK(obj, i) != zzK(obj2, i)) {
            return false;
        }
        int i5 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i7 = i6 + 87;
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        if (i2 == 1048575) {
            int i10 = i8 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            return zzK(obj, i);
        }
        if ((i3 & i4) == 0) {
            return false;
        }
        int i12 = i6 + 17;
        b = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    private final Object zzo(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i / 3;
        Object obj = this.zzd[i6 + i6];
        int i7 = i4 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    private final zzbak zzp(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i / 3;
        zzbak zzbakVar = (zzbak) this.zzd[i6 + i6 + 1];
        int i7 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 == 0) {
            return zzbakVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void zzC(Object obj) {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            zzbct.zzd(obj, zzy(i2) & 1048575);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (zzbct.zzd(obj, zzy(i2) & 1048575) != i) {
            return false;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return true;
    }

    private final void zzN(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        zzbct.zze(obj, zzy(i2) & 1048575, i);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void zzr(Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzL(obj, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private final void zzt(Object obj, int i, int i2, Object obj2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i4 % 128;
        int i5 = i4 % 2;
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzN(obj, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
    }

    private static boolean zzv(Object obj, int i, zzbbz zzbbzVar) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zZzi = zzbbzVar.zzi(zzbct.zzn(obj, i & 1048575));
        int i5 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zZzi;
        }
        throw null;
    }

    private final void zzw(Object obj, int i, zzbby zzbbyVar) throws IOException {
        int i2 = 2 % 2;
        long j = i & 1048575;
        if (!zzA(i)) {
            if (this.zzi) {
                zzbct.zzo(obj, j, zzbbyVar.zzm());
                return;
            }
            zzbct.zzo(obj, j, zzbbyVar.zzs());
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            zzbct.zzo(obj, j, zzbbyVar.zzn());
            return;
        }
        zzbct.zzo(obj, j, zzbbyVar.zzn());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void zzL(Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzbct.zze(obj, j, (1 << (iZzy >>> 20)) | zzbct.zzd(obj, j));
        int i5 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void zzO(int i, Object obj, zzbcz zzbczVar) throws IOException {
        int i2 = 2 % 2;
        if (!(obj instanceof String)) {
            zzbczVar.zzn(i, (zzayz) obj);
            int i3 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            zzbczVar.zzm(i, (String) obj);
        } else {
            zzbczVar.zzm(i, (String) obj);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r2 = com.google.android.libraries.places.internal.zzbbv.zza().zzb((java.lang.Class) r1[r5 + 1]);
        r1[r5] = r2;
        r5 = com.google.android.libraries.places.internal.zzbbo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        com.google.android.libraries.places.internal.zzbbo.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.libraries.places.internal.zzbbz zzn(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzbbo.b
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzbbo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = r4.zzd
            int r5 = r5 % 3
            int r5 = r5 << r5
            r2 = r1[r5]
            com.google.android.libraries.places.internal.zzbbz r2 = (com.google.android.libraries.places.internal.zzbbz) r2
            if (r2 == 0) goto L26
            goto L25
        L1a:
            java.lang.Object[] r1 = r4.zzd
            int r5 = r5 / 3
            int r5 = r5 + r5
            r2 = r1[r5]
            com.google.android.libraries.places.internal.zzbbz r2 = (com.google.android.libraries.places.internal.zzbbz) r2
            if (r2 == 0) goto L26
        L25:
            return r2
        L26:
            com.google.android.libraries.places.internal.zzbbv r2 = com.google.android.libraries.places.internal.zzbbv.zza()
            int r3 = r5 + 1
            r3 = r1[r3]
            java.lang.Class r3 = (java.lang.Class) r3
            com.google.android.libraries.places.internal.zzbbz r2 = r2.zzb(r3)
            r1[r5] = r2
            int r5 = com.google.android.libraries.places.internal.zzbbo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r5 = r5 + 75
            int r1 = r5 % 128
            com.google.android.libraries.places.internal.zzbbo.b = r1
            int r5 = r5 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzn(int):com.google.android.libraries.places.internal.zzbbz");
    }

    private final void zzl(Object obj, Object obj2, int i) throws Throwable {
        Object objZza;
        int i2 = 2 % 2;
        if (!zzK(obj2, i)) {
            int i3 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
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
        zzbbz zzbbzVarZzn = zzn(i);
        if (!zzK(obj, i)) {
            if (zzB(object)) {
                Object objZza2 = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza2, object);
                unsafe.putObject(obj, j, objZza2);
            } else {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    unsafe.putObject(obj, j, object);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                unsafe.putObject(obj, j, object);
            }
            zzL(obj, i);
            return;
        }
        Object object2 = unsafe.getObject(obj, j);
        if (!zzB(object2)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                objZza = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza, object2);
                unsafe.putObject(obj, j, objZza);
                int i8 = 55 / 0;
            } else {
                objZza = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza, object2);
                unsafe.putObject(obj, j, objZza);
            }
            object2 = objZza;
        }
        zzbbzVarZzn.zzd(object2, object);
    }

    private static Field zzk(Class cls, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        b = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                cls.getDeclaredField(str);
                throw null;
            }
            Field declaredField = cls.getDeclaredField(str);
            int i3 = b + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
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

    private final void zzm(Object obj, Object obj2, int i) throws Throwable {
        int i2 = 2 % 2;
        int[] iArr = this.zzc;
        int i3 = iArr[i];
        if (zzM(obj2, i3, i)) {
            int iZzx = zzx(i);
            Unsafe unsafe = zzb;
            long j = iZzx & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i4 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i4);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzbbz zzbbzVarZzn = zzn(i);
            if (zzM(obj, i3, i)) {
                Object object2 = unsafe.getObject(obj, j);
                if (!zzB(object2)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    Object objZza = zzbbzVarZzn.zza();
                    zzbbzVarZzn.zzd(objZza, object2);
                    unsafe.putObject(obj, j, objZza);
                    object2 = objZza;
                }
                zzbbzVarZzn.zzd(object2, object);
                return;
            }
            int i7 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            if (zzB(object)) {
                Object objZza2 = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza2, object);
                unsafe.putObject(obj, j, objZza2);
                int i9 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                unsafe.putObject(obj, j, object);
            }
            zzN(obj, i3, i);
            int i11 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private final Object zzs(Object obj, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
        zzbbz zzbbzVarZzn = zzn(i2);
        if (!zzM(obj, i, i2)) {
            return zzbbzVarZzn.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        Object obj2 = null;
        if (zzB(object)) {
            int i6 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return object;
            }
            obj2.hashCode();
            throw null;
        }
        Object objZza = zzbbzVarZzn.zza();
        if (object != null) {
            int i7 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            zzbbzVarZzn.zzd(objZza, object);
            if (i8 != 0) {
                throw null;
            }
        }
        return objZza;
    }

    private final Object zzq(Object obj, int i) throws Throwable {
        int i2 = 2 % 2;
        zzbbz zzbbzVarZzn = zzn(i);
        int iZzx = zzx(i);
        if (!zzK(obj, i)) {
            return zzbbzVarZzn.zza();
        }
        Object object = zzb.getObject(obj, 1048575 & iZzx);
        if (!zzB(object)) {
            Object objZza = zzbbzVarZzn.zza();
            if (object != null) {
                zzbbzVarZzn.zzd(objZza, object);
            }
            return objZza;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 5;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 77;
        b = i6 % 128;
        int i7 = i6 % 2;
        return object;
    }

    private final Object zzu(Object obj, int i, Object obj2, zzbcm zzbcmVar, Object obj3) {
        int i2 = 2 % 2;
        int i3 = this.zzc[i];
        Object objZzn = zzbct.zzn(obj, zzx(i) & 1048575);
        if (objZzn != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (zzp(i) != null) {
                throw null;
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    private final boolean zzK(Object obj, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzbct.zzd(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i);
        long j2 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzbct.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzbct.zzj(obj, j2)) != 0;
            case 2:
                return zzbct.zzf(obj, j2) != 0;
            case 3:
                return zzbct.zzf(obj, j2) != 0;
            case 4:
                return zzbct.zzd(obj, j2) != 0;
            case 5:
                return zzbct.zzf(obj, j2) != 0;
            case 6:
                return zzbct.zzd(obj, j2) != 0;
            case 7:
                return zzbct.zzh(obj, j2);
            case 8:
                Object objZzn = zzbct.zzn(obj, j2);
                if (!(objZzn instanceof String)) {
                    if (objZzn instanceof zzayz) {
                        return !zzayz.zzb.equals(objZzn);
                    }
                    throw new IllegalArgumentException();
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                b = i5 % 128;
                int i6 = i5 % 2;
                return !((String) objZzn).isEmpty();
            case 9:
                if (zzbct.zzn(obj, j2) == null) {
                    return false;
                }
                int i7 = b + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                return true;
            case 10:
                if (zzayz.zzb.equals(zzbct.zzn(obj, j2))) {
                    return false;
                }
                int i9 = b + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                return i9 % 2 == 0;
            case 11:
                if (zzbct.zzd(obj, j2) == 0) {
                    return false;
                }
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                b = i10 % 128;
                return i10 % 2 != 0;
            case 12:
                return zzbct.zzd(obj, j2) != 0;
            case 13:
                return zzbct.zzd(obj, j2) != 0;
            case 14:
                if (zzbct.zzf(obj, j2) == 0) {
                    return false;
                }
                int i11 = b + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                int i12 = i11 % 2;
                return true;
            case 15:
                if (zzbct.zzd(obj, j2) == 0) {
                    return false;
                }
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                b = i13 % 128;
                return i13 % 2 != 0;
            case 16:
                return zzbct.zzf(obj, j2) != 0;
            case 17:
                if (zzbct.zzn(obj, j2) == null) {
                    return false;
                }
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                b = i14 % 128;
                int i15 = i14 % 2;
                return true;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d2  */
    static zzbbo zzj(Class cls, zzbbi zzbbiVar, zzbbr zzbbrVar, zzbay zzbayVar, zzbcm zzbcmVar, zzazq zzazqVar, zzbbg zzbbgVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int[] iArr2;
        int i15;
        Class<?> cls2;
        int iObjectFieldOffset;
        Class<?> cls3;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        Field fieldZzk;
        int i18;
        char cCharAt9;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldZzk2;
        int i24;
        Object obj2;
        Field fieldZzk3;
        int i25;
        int i26;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        int i32 = 2;
        int i33 = 2 % 2;
        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        b = i34 % 128;
        int i35 = i34 % 2;
        if (!(zzbbiVar instanceof zzbbx)) {
            throw null;
        }
        zzbbx zzbbxVar = (zzbbx) zzbbiVar;
        String strZzd = zzbbxVar.zzd();
        int length = strZzd.length();
        int i36 = 0;
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i = i37 + 1;
                if (strZzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i;
            }
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 13;
            while (true) {
                i31 = i38 + 1;
                cCharAt13 = strZzd.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i31;
            }
            iCharAt3 = i39 | (cCharAt13 << i40);
            i38 = i31;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
        } else {
            int i41 = i38 + 1;
            int iCharAt4 = strZzd.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt8 = strZzd.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt4 = i42 | (cCharAt8 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt5 = strZzd.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt5 = i45 | (cCharAt7 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int iCharAt6 = strZzd.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt6 = i48 | (cCharAt6 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strZzd.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = b + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                int i52 = i51 % 2;
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i50 = i10;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i50 = i10;
            }
            int i55 = i50 + 1;
            iCharAt = strZzd.charAt(i50);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt4 = strZzd.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            iCharAt2 = strZzd.charAt(i55);
            if (iCharAt2 >= 55296) {
                int i59 = iCharAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt3 = strZzd.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    int i61 = b + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61 % 128;
                    int i62 = i61 % 2;
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt2 = i59 | (cCharAt3 << i60);
                i58 = i8;
            }
            int i63 = i58 + 1;
            int iCharAt8 = strZzd.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i7 = i63 + 1;
                    cCharAt2 = strZzd.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i7;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i7;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strZzd.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i6 = i66 + 1;
                    cCharAt = strZzd.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i6;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i6;
            }
            int[] iArr3 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            i3 = iCharAt9;
            i36 = iCharAt4;
            iArr = iArr3;
            i4 = iCharAt6;
            i5 = iCharAt7;
            i38 = i66;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzbbxVar.zze();
        Class<?> cls4 = zzbbxVar.zzb().getClass();
        int i69 = i3 + iCharAt2;
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt + iCharAt];
        int i70 = i3;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i38 < length) {
            int i74 = i38 + 1;
            int iCharAt10 = strZzd.charAt(i38);
            if (iCharAt10 >= c) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i30 = i76 + 1;
                    cCharAt12 = strZzd.charAt(i76);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i30;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i14 = i30;
            } else {
                i14 = i74;
            }
            int i78 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i79 = b + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i79 % 128;
                if (i79 % i32 != 0) {
                    i28 = iCharAt11 & 17350;
                    i29 = 63;
                } else {
                    i28 = iCharAt11 & 8191;
                    i29 = 13;
                }
                while (true) {
                    i78++;
                    cCharAt11 = strZzd.charAt(i78);
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i28 |= (cCharAt11 & 8191) << i29;
                    i29 += 13;
                    i78 = i78;
                }
                iCharAt11 = i28 | (cCharAt11 << i29);
            }
            int i80 = i78;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i81 = iCharAt11 & 255;
            int i82 = iCharAt11 & 2048;
            int i83 = i73;
            int i84 = iCharAt10;
            if (i81 >= 51) {
                int i85 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i85 % 128;
                int i86 = i85 % 2;
                int i87 = i80 + 1;
                int iCharAt12 = strZzd.charAt(i80);
                if (iCharAt12 >= 55296) {
                    int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                    b = i88 % 128;
                    if (i88 % 2 == 0) {
                        i25 = iCharAt12 & 6655;
                        i26 = 66;
                    } else {
                        i25 = iCharAt12 & 8191;
                        i26 = 13;
                    }
                    int i89 = i87;
                    while (true) {
                        i27 = i89 + 1;
                        cCharAt10 = strZzd.charAt(i89);
                        iArr2 = iArr4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i25 |= (cCharAt10 & 8191) << i26;
                        i26 += 13;
                        i89 = i27;
                        iArr4 = iArr2;
                    }
                    iCharAt12 = i25 | (cCharAt10 << i26);
                    i87 = i27;
                } else {
                    iArr2 = iArr4;
                }
                int i90 = i81 - 51;
                if (i90 == 9 || i90 == 17) {
                    i21 = i87;
                    i22 = i2 + 1;
                    int i91 = i72 / 3;
                    objArr[i91 + i91 + 1] = objArrZze[i2];
                } else {
                    int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    i21 = i87;
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    if (i90 == 12) {
                        if (zzbbxVar.zzc() == 1 || i82 != 0) {
                            i22 = i2 + 1;
                            int i94 = i72 / 3;
                            objArr[i94 + i94 + 1] = objArrZze[i2];
                        } else {
                            i82 = 0;
                        }
                    }
                    i23 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i23];
                    if (obj instanceof Field) {
                        fieldZzk2 = (Field) obj;
                    } else {
                        fieldZzk2 = zzk(cls4, (String) obj);
                        objArrZze[i23] = fieldZzk2;
                    }
                    int i95 = i82;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzk2);
                    i24 = i23 + 1;
                    obj2 = objArrZze[i24];
                    if (obj2 instanceof Field) {
                        fieldZzk3 = (Field) obj2;
                    } else {
                        fieldZzk3 = zzk(cls4, (String) obj2);
                        objArrZze[i24] = fieldZzk3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzk3);
                    i36 = i36;
                    i82 = i95;
                    i16 = 0;
                    Class<?> cls5 = cls4;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i17 = iObjectFieldOffset4;
                    i38 = i21;
                    i15 = i2;
                    cls3 = cls5;
                }
                i2 = i22;
                i23 = iCharAt12 + iCharAt12;
                obj = objArrZze[i23];
                if (obj instanceof Field) {
                    fieldZzk2 = (Field) obj;
                } else {
                    fieldZzk2 = zzk(cls4, (String) obj);
                    objArrZze[i23] = fieldZzk2;
                }
                int i96 = i82;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzk2);
                i24 = i23 + 1;
                obj2 = objArrZze[i24];
                if (obj2 instanceof Field) {
                    fieldZzk3 = (Field) obj2;
                } else {
                    fieldZzk3 = zzk(cls4, (String) obj2);
                    objArrZze[i24] = fieldZzk3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzk3);
                i36 = i36;
                i82 = i96;
                i16 = 0;
                Class<?> cls6 = cls4;
                iObjectFieldOffset = iObjectFieldOffset5;
                i17 = iObjectFieldOffset6;
                i38 = i21;
                i15 = i2;
                cls3 = cls6;
            } else {
                iArr2 = iArr4;
                i15 = i2 + 1;
                Field fieldZzk4 = zzk(cls4, (String) objArrZze[i2]);
                if (i81 == 9 || i81 == 17) {
                    cls2 = cls4;
                    int i97 = i72 / 3;
                    objArr[i97 + i97 + 1] = fieldZzk4.getType();
                } else {
                    if (i81 != 27) {
                        int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                        cls2 = cls4;
                        int i99 = i98 % 128;
                        b = i99;
                        int i100 = i98 % 2;
                        if (i81 != 49) {
                            if (i81 == 12 || i81 == 30 || i81 == 44) {
                                if (zzbbxVar.zzc() == 1 || i82 != 0) {
                                }
                            } else if (i81 == 50) {
                                int i101 = i2 + 2;
                                int i102 = i70 + 1;
                                iArr[i70] = i72;
                                int i103 = i72 / 3;
                                int i104 = i103 + i103;
                                objArr[i104] = objArrZze[i15];
                                if (i82 != 0) {
                                    int i105 = i99 + 37;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i105 % 128;
                                    if (i105 % 2 != 0) {
                                        objArr[i104] = objArrZze[i101];
                                        i15 = i2 + 58;
                                    } else {
                                        objArr[i104 + 1] = objArrZze[i101];
                                        i15 = i2 + 3;
                                    }
                                    i70 = i102;
                                } else {
                                    i15 = i101;
                                    i70 = i102;
                                }
                            }
                            i82 = 0;
                        }
                    } else {
                        cls2 = cls4;
                    }
                    int i106 = i72 / 3;
                    objArr[i106 + i106 + 1] = objArrZze[i15];
                    i15 = i2 + 2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzk4);
                if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                    i36 = i36;
                    cls3 = cls2;
                    iObjectFieldOffset2 = 1048575;
                    i16 = 0;
                } else {
                    int i107 = i80 + 1;
                    int iCharAt13 = strZzd.charAt(i80);
                    if (iCharAt13 >= 55296) {
                        int i108 = iCharAt13 & 8191;
                        int i109 = 13;
                        while (true) {
                            i18 = i107 + 1;
                            cCharAt9 = strZzd.charAt(i107);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i108 |= (cCharAt9 & 8191) << i109;
                            i109 += 13;
                            i107 = i18;
                        }
                        iCharAt13 = i108 | (cCharAt9 << i109);
                        i107 = i18;
                    }
                    int i110 = i36 + i36 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i110];
                    if (obj3 instanceof Field) {
                        fieldZzk = (Field) obj3;
                        cls3 = cls2;
                    } else {
                        cls3 = cls2;
                        fieldZzk = zzk(cls3, (String) obj3);
                        objArrZze[i110] = fieldZzk;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzk);
                    i16 = iCharAt13 % 32;
                    i80 = i107;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
                int i111 = iObjectFieldOffset2;
                i38 = i80;
                i17 = i111;
            }
            iArr2[i72] = i84;
            int i112 = (iCharAt11 & 512) != 0 ? 536870912 : 0;
            int i113 = (iCharAt11 & 256) != 0 ? 268435456 : 0;
            if (i82 != 0) {
                int i114 = b + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
                i19 = 2;
                int i115 = i114 % 2;
                i20 = Integer.MIN_VALUE;
            } else {
                i19 = 2;
                i20 = 0;
            }
            iArr2[i72 + 1] = (i81 << 20) | i20 | i113 | i112 | iObjectFieldOffset;
            iArr2[i72 + 2] = i17 | (i16 << 20);
            i72 += 3;
            i32 = i19;
            cls4 = cls3;
            i73 = i83;
            length = length;
            i36 = i36;
            i2 = i15;
            iArr4 = iArr2;
            c = 55296;
        }
        return new zzbbo(iArr4, objArr, i4, i5, zzbbxVar.zzb(), false, iArr, i3, i69, zzbbrVar, zzbayVar, zzbcmVar, zzazqVar, zzbbgVar);
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c = '0';
        if (cArr2 != null) {
            int i8 = $11 + 93;
            int i9 = i8 % 128;
            $10 = i9;
            int i10 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = i9 + 35;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length) {
                int i14 = $10 + 113;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr2[i13]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cArgb = (char) Color.argb(i2, i2, i2, i2);
                        int threadPriority = 1270 - ((Process.getThreadPriority(i2) + 20) >> 6);
                        int iIndexOf = 17 - TextUtils.indexOf("", c, i2);
                        byte b2 = (byte) i2;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, threadPriority, iIndexOf, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i13++;
                    i2 = 0;
                    i4 = 1;
                    c = '0';
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i16 = $10 + 31;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char c2 = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i18 = $11 + 67;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 3225 - (Process.myPid() >> 22), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i20 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3226 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 14, 2133916302, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i21 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943), 1755 - Color.green(0), ImageFormat.getBitsPerPixel(0) + 24, 387247676, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c2 = cArr5[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - View.MeasureSpec.getSize(0)), AndroidCharacter.getMirror('0') + 1657, 21 - TextUtils.indexOf("", ""), -1434471773, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            int i22 = $11 + 95;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 5 % 3;
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            int i24 = $11 + 13;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i26 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i26, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i26);
        }
        if (!(!z)) {
            int i27 = $11 + 81;
            $10 = i27 % 128;
            if (i27 % 2 != 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                int i28 = $10 + 15;
                $11 = i28 % 128;
                int i29 = i28 % 2;
                cArr[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            int i30 = 0;
            while (true) {
                setvideostabilizationmode.b = i30;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i30 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final int zzx(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) 52, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maxKeyCode, threadPriority, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 72, 19}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 78, 10}, true, null, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
            int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, maximumFlingVelocity, tapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                int iAlpha = Color.alpha(0) + 921;
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (-bArr2[33]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, iAlpha, defaultSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (((134002307 + ((((~((-509669383) | i5)) | 171986948) | (~((-1264410262) | i5))) * (-1136))) + ((((~((-509669383) | iIdentityHashCode)) | (~((-1264410262) | iIdentityHashCode))) | (~(1602092695 | i5))) * (-568))) + (((~(iIdentityHashCode | (-171986949))) | ((~(i5 | 1264410261)) | (~(509669382 | i5)))) * 568)) - 1322828968;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            int i9 = b + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 10}, true, new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = b + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                int i12 = i11 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            b = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1322828968};
                byte[] bArr3 = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr3[0], bArr3[37], bArr3[16], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(bArr3[37], bArr3[0], (byte) (-bArr3[34]), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 31534);
                    int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i15 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b5 = bArr4[80];
                    Object[] objArr13 = new Object[1];
                    a(b5, (byte) (-bArr4[33]), b5, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, scrollBarFadeDuration, i15, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new int[]{0, 22, 72, 19}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new int[]{22, 15, 78, 10}, true, null, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i16 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[80];
                        Object[] objArr16 = new Object[1];
                        a(b6, b6, bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity2, i16, iLastIndexOf, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity3 = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i17 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b7 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        a(b7, (byte) 52, b7, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity3, i17, doubleTapTimeout, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[3])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = b;
                int i21 = i20 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                int i22 = i21 % 2;
                int i23 = i20 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i25 = ((int[]) objArr[0])[0];
        int i26 = ((int[]) objArr[3])[0];
        int i27 = ((int[]) objArr[1])[0];
        new int[1][0] = i26;
        new int[1][0] = i27;
        int i28 = ~i;
        int i29 = i25 + (((1053551265 + (((~((-1279518830) | i28)) | (~((-494560815) | i))) * (-370))) + ((((~(i28 | (-494560815))) | (~((-1279518830) | i))) | (-1568403056)) * (-370))) - 488545760);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        int[] iArr = {i31 ^ (i31 << 5)};
        int i32 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
        int i33 = i32 % 2;
        int[] iArr2 = this.zzc;
        int i34 = iArr[0];
        int i35 = i34 * i34;
        int i36 = -(337436464 * i34);
        int i37 = (i35 & i36) + (i35 | i36);
        int i38 = -(i34 * 705756774);
        int i39 = (i37 & i38) + (i38 | i37);
        int i40 = ((i39 | 329389305) << 1) - (329389305 ^ i39);
        int i41 = i40 >> 27;
        int i42 = ((i41 ^ (-63)) + ((i41 & (-63)) << 1)) / 32;
        int i43 = (i42 & 1) + (i42 | 1);
        int i44 = (i40 & i43) + (i43 | i40);
        int i45 = i40 >> 23;
        int i46 = (((i45 | (-1023)) << 1) - (i45 ^ (-1023))) / 512;
        int i47 = -(((i46 ^ 1) + ((i46 & 1) << 1)) ^ i44);
        int i48 = ((i47 | 4) << 1) - (i47 ^ 4);
        int i49 = i48 >> 26;
        int i50 = ((i49 & ComposerKt.defaultsKey) + (i49 | ComposerKt.defaultsKey)) / 64;
        int i51 = (i50 ^ 1) + ((i50 & 1) << 1);
        return iArr2[i + (6852 / (((-((i51 ^ 1) + ((i51 & 1) << 1))) & i48) * 1713))];
    }

    private final int zzy(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 95;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.zzc[i + 2];
        int i7 = i3 + 91;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return i6;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final Object zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzbae zzbaeVarZzbg = ((zzbae) this.zzg).zzbg();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzbaeVarZzbg;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzh(Object obj) throws Throwable {
        int i = 2 % 2;
        if (zzB(obj)) {
            if (obj instanceof zzbae) {
                zzbae zzbaeVar = (zzbae) obj;
                zzbaeVar.zzbk(Integer.MAX_VALUE);
                zzbaeVar.zza = 0;
                zzbaeVar.zzbe();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int iZzx = zzx(i2);
                int iZzz = zzz(iZzx);
                long j = iZzx & 1048575;
                if (iZzz != 9) {
                    if (iZzz != 60 && iZzz != 68) {
                        int i3 = b + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                        int i4 = i3 % 2;
                        switch (iZzz) {
                            case 17:
                                if (zzK(obj, i2)) {
                                    zzn(i2).zzh(zzb.getObject(obj, j));
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
                                ((zzbao) zzbct.zzn(obj, j)).zzb();
                                int i5 = b + 17;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                int i6 = i5 % 2;
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzbbf) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (!(!zzM(obj, iArr[i2], i2))) {
                        int i7 = b + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                        int i8 = i7 % 2;
                        zzn(i2).zzh(zzb.getObject(obj, j));
                    }
                } else if (zzK(obj, i2)) {
                    zzn(i2).zzh(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                int i9 = b + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % 2;
                this.zzn.zzb(obj);
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzi(Object obj) throws Throwable {
        int i;
        int i2;
        List list;
        zzbbz zzbbzVarZzn;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i11 = iArr[i10];
            int i12 = iArr2[i11];
            int iZzx = zzx(i11);
            int i13 = iArr2[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i9 = zzb.getInt(obj, i14);
                }
                i2 = i9;
                i = i14;
            } else {
                i = i8;
                i2 = i9;
            }
            if ((268435456 & iZzx) != 0) {
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                if (!zzJ(obj, i11, i, i2, i15)) {
                    return false;
                }
            }
            int iZzz = zzz(iZzx);
            if (iZzz != 9) {
                int i18 = b;
                int i19 = i18 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                if (i19 % 2 == 0 ? iZzz == 17 : iZzz == 73) {
                    if (zzJ(obj, i11, i, i2, i15) && !zzv(obj, iZzx, zzn(i11))) {
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        return false;
                    }
                } else if (iZzz != 27) {
                    int i22 = i18 + 37;
                    int i23 = i22 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23;
                    int i24 = i22 % 2;
                    if (iZzz == 60 || iZzz == 68) {
                        if (zzM(obj, i12, i11) && !zzv(obj, iZzx, zzn(i11))) {
                            return false;
                        }
                    } else if (iZzz != 49) {
                        int i25 = i23 + 97;
                        int i26 = i25 % 128;
                        b = i26;
                        int i27 = i25 % 2;
                        if (iZzz == 50) {
                            int i28 = i26 + 61;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                            int i29 = i28 % 2;
                            if (!((zzbbf) zzbct.zzn(obj, iZzx & 1048575)).isEmpty()) {
                                int i30 = b + 9;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
                                int i31 = i30 % 2;
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        list = (List) zzbct.zzn(obj, iZzx & 1048575);
                        if (list.isEmpty()) {
                            continue;
                        } else {
                            zzbbzVarZzn = zzn(i11);
                            i3 = 0;
                            while (i3 < list.size()) {
                                if (!zzbbzVarZzn.zzi(list.get(i3))) {
                                    return false;
                                }
                                i3++;
                                i4 = b + 35;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i32 = 4 % 3;
                                }
                            }
                        }
                    }
                } else {
                    list = (List) zzbct.zzn(obj, iZzx & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzbbzVarZzn = zzn(i11);
                        i3 = 0;
                        while (i3 < list.size()) {
                            if (!zzbbzVarZzn.zzi(list.get(i3))) {
                                return false;
                            }
                            i3++;
                            i4 = b + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i33 = 4 % 3;
                            }
                        }
                    }
                }
            } else if (zzJ(obj, i11, i, i2, i15)) {
                continue;
            }
            i10++;
            i8 = i;
            i9 = i2;
        }
        return (this.zzh && (((zzbab) obj).zzb.zzh() ^ true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d5 A[PHI: r7
  0x01d5: PHI (r7v3 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9 A[PHI: r7
  0x01e9: PHI (r7v2 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0202 A[PHI: r7
  0x0202: PHI (r7v1 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[PHI: r7
  0x0042: PHI (r7v21 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:169:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:185:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[PHI: r7
  0x007a: PHI (r7v20 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0087 A[PHI: r7
  0x0087: PHI (r7v19 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0097 A[PHI: r7
  0x0097: PHI (r7v18 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0 A[PHI: r7
  0x00b0: PHI (r7v17 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[PHI: r7
  0x00c4: PHI (r7v16 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[PHI: r7
  0x00d6: PHI (r7v15 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[PHI: r7
  0x00ea: PHI (r7v14 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc A[PHI: r7
  0x00fc: PHI (r7v13 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e A[PHI: r7
  0x010e: PHI (r7v12 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[PHI: r7
  0x0120: PHI (r7v11 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0136 A[PHI: r7
  0x0136: PHI (r7v10 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x014c A[PHI: r7
  0x014c: PHI (r7v9 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0162 A[PHI: r7
  0x0162: PHI (r7v8 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0174 A[PHI: r7
  0x0174: PHI (r7v7 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x017d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192 A[PHI: r7
  0x0192: PHI (r7v6 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1 A[PHI: r7
  0x01b1: PHI (r7v5 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c2 A[PHI: r7
  0x01c2: PHI (r7v4 long) = (r7v0 long), (r7v22 long) binds: [B:11:0x003d, B:8:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzb(Object obj, Object obj2) throws Throwable {
        long j;
        boolean zZzB;
        long jZzy;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int iZzx = zzx(i5);
                int iZzz = zzz(iZzx);
                j = iZzx & 1048575;
                int i7 = 5 / 0;
                switch (iZzz) {
                    case 0:
                        if (zzI(obj, obj2, i5) || Double.doubleToLongBits(zzbct.zzl(obj, j)) != Double.doubleToLongBits(zzbct.zzl(obj2, j))) {
                            return false;
                        }
                        break;
                        break;
                    case 1:
                        if (zzI(obj, obj2, i5) || Float.floatToIntBits(zzbct.zzj(obj, j)) != Float.floatToIntBits(zzbct.zzj(obj2, j))) {
                            return false;
                        }
                        break;
                        break;
                    case 2:
                        if (!(!zzI(obj, obj2, i5)) || zzbct.zzf(obj, j) != zzbct.zzf(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 3:
                        if (zzI(obj, obj2, i5) || zzbct.zzf(obj, j) != zzbct.zzf(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 4:
                        if (zzI(obj, obj2, i5) || zzbct.zzd(obj, j) != zzbct.zzd(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i5)) {
                            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                            b = i8 % 128;
                            int i9 = i8 % 2;
                            if (zzbct.zzf(obj, j) == zzbct.zzf(obj2, j)) {
                                break;
                            }
                        }
                        return false;
                    case 6:
                        if (!zzI(obj, obj2, i5)) {
                            int i10 = b + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                            int i11 = i10 % 2;
                            if (zzbct.zzd(obj, j) == zzbct.zzd(obj2, j)) {
                                break;
                            }
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i5) || zzbct.zzh(obj, j) != zzbct.zzh(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 8:
                        if (zzI(obj, obj2, i5) || !zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                            return false;
                        }
                        break;
                        break;
                    case 9:
                        if (zzI(obj, obj2, i5) || !zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                            return false;
                        }
                        break;
                        break;
                    case 10:
                        if (zzI(obj, obj2, i5) || !zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                            return false;
                        }
                        break;
                        break;
                    case 11:
                        if (zzI(obj, obj2, i5) || zzbct.zzd(obj, j) != zzbct.zzd(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 12:
                        if (zzI(obj, obj2, i5) || zzbct.zzd(obj, j) != zzbct.zzd(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 13:
                        if (zzI(obj, obj2, i5) || zzbct.zzd(obj, j) != zzbct.zzd(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 14:
                        if (zzI(obj, obj2, i5) || zzbct.zzf(obj, j) != zzbct.zzf(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 15:
                        if (zzI(obj, obj2, i5) || zzbct.zzd(obj, j) != zzbct.zzd(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 16:
                        if (zzI(obj, obj2, i5) || zzbct.zzf(obj, j) != zzbct.zzf(obj2, j)) {
                            return false;
                        }
                        break;
                        break;
                    case 17:
                        if ((!zzI(obj, obj2, i5)) || !zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                            return false;
                        }
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
                        zZzB = zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                        if (!zZzB) {
                            return false;
                        }
                        break;
                        break;
                    case 50:
                        zZzB = zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                        if (!zZzB) {
                            return false;
                        }
                        break;
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
                        jZzy = zzy(i5) & 1048575;
                        if (zzbct.zzd(obj, jZzy) == zzbct.zzd(obj2, jZzy)) {
                            i = b + 51;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                            if (i % 2 == 0) {
                                zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                                throw null;
                            }
                            if (!zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                                break;
                            }
                        }
                        return false;
                    default:
                        continue;
                }
            } else {
                int iZzx2 = zzx(i5);
                j = iZzx2 & 1048575;
                switch (zzz(iZzx2)) {
                    case 0:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 1:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 2:
                        if (!(!zzI(obj, obj2, i5))) {
                        }
                        return false;
                    case 3:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 4:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 5:
                        if (!zzI(obj, obj2, i5)) {
                            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                            b = i12 % 128;
                            int i13 = i12 % 2;
                            if (zzbct.zzf(obj, j) == zzbct.zzf(obj2, j)) {
                                break;
                            }
                        }
                        return false;
                    case 6:
                        if (!zzI(obj, obj2, i5)) {
                            int i14 = b + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                            int i15 = i14 % 2;
                            if (zzbct.zzd(obj, j) == zzbct.zzd(obj2, j)) {
                                break;
                            }
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 8:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 9:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 10:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 11:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 12:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 13:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 14:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 15:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 16:
                        if (zzI(obj, obj2, i5)) {
                        }
                        return false;
                    case 17:
                        if (!zzI(obj, obj2, i5)) {
                            break;
                        }
                        return false;
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
                        zZzB = zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                        if (!zZzB) {
                            return false;
                        }
                        break;
                        break;
                    case 50:
                        zZzB = zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                        if (!zZzB) {
                            return false;
                        }
                        break;
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
                        jZzy = zzy(i5) & 1048575;
                        if (zzbct.zzd(obj, jZzy) == zzbct.zzd(obj2, jZzy)) {
                            i = b + 51;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                            if (i % 2 == 0) {
                                zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j));
                                throw null;
                            }
                            if (!zzbcb.zzB(zzbct.zzn(obj, j), zzbct.zzn(obj2, j))) {
                                break;
                            }
                        }
                        return false;
                    default:
                        continue;
                }
            }
        }
        if (!((zzbae) obj).zzc.equals(((zzbae) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzbab) obj).zzb.equals(((zzbab) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zzc(Object obj) throws Throwable {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i6 >= iArr.length) {
                int iHashCode = (i7 * 53) + ((zzbae) obj).zzc.hashCode();
                if (!this.zzh) {
                    return iHashCode;
                }
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                b = i8 % 128;
                int i9 = i8 % 2;
                return (iHashCode * 53) + ((zzbab) obj).zzb.zza.hashCode();
            }
            int i10 = b + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            int iZzx = zzx(i6);
            int iZzz = zzz(iZzx);
            int i12 = iArr[i6];
            long j = iZzx & 1048575;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i = i7 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzbct.zzl(obj, j));
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i7 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzbct.zzj(obj, j));
                    i7 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i7 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i7 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i7 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i7 * 53;
                    iFloatToIntBits = zzbap.zzb(zzbct.zzh(obj, j));
                    i7 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i7 * 53;
                    iFloatToIntBits = ((String) zzbct.zzn(obj, j)).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i7 * 53;
                    Object objZzn = zzbct.zzn(obj, j);
                    if (objZzn != null) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                        b = i13 % 128;
                        if (i13 % 2 == 0) {
                            iHashCode2 = objZzn.hashCode();
                            int i14 = 86 / 0;
                        } else {
                            iHashCode2 = objZzn.hashCode();
                        }
                    }
                    i7 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i7 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j);
                    i7 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i7 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j);
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i7 * 53;
                    Object objZzn2 = zzbct.zzn(obj, j);
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
                    iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i7 * 53;
                    iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                    i7 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzD(obj, j));
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzE(obj, j));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i12, i6)) {
                        int i15 = b + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            i = i7 / 18;
                            jDoubleToLongBits = zzG(obj, j);
                        } else {
                            i = i7 * 53;
                            jDoubleToLongBits = zzG(obj, j);
                        }
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzG(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i12, i6)) {
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            i = i7 - 27;
                            jDoubleToLongBits = zzG(obj, j);
                        } else {
                            i = i7 * 53;
                            jDoubleToLongBits = zzG(obj, j);
                        }
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzbap.zzb(zzH(obj, j));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = ((String) zzbct.zzn(obj, j)).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i12, i6)) {
                        int i17 = b + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                        int i18 = i17 % 2;
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (!(!zzM(obj, i12, i6))) {
                        i = i7 * 53;
                        jDoubleToLongBits = zzG(obj, j);
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzF(obj, j);
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i12, i6)) {
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                        b = i19 % 128;
                        if (i19 % 2 == 0) {
                            i = i7 << 36;
                            jDoubleToLongBits = zzG(obj, j);
                        } else {
                            i = i7 * 53;
                            jDoubleToLongBits = zzG(obj, j);
                        }
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i12, i6)) {
                        i = i7 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j).hashCode();
                        i7 = i + iFloatToIntBits;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzd(Object obj, Object obj2) throws Throwable {
        int i;
        int i2 = 2 % 2;
        zzC(obj);
        int i3 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                zzbcb.zzD(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzbcb.zzC(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i3);
            int iZzz = zzz(iZzx);
            int i4 = iArr[i3];
            long j = iZzx & 1048575;
            Object obj3 = null;
            switch (iZzz) {
                case 0:
                    if (zzK(obj2, i3)) {
                        int i5 = b + 1;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                        if (i5 % 2 != 0) {
                            zzbct.zzm(obj, j, zzbct.zzl(obj2, j));
                            zzL(obj, i3);
                            throw null;
                        }
                        zzbct.zzm(obj, j, zzbct.zzl(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 1:
                    if (zzK(obj2, i3)) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                        b = i6 % 128;
                        int i7 = i6 % 2;
                        zzbct.zzk(obj, j, zzbct.zzj(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 2:
                    if (zzK(obj2, i3)) {
                        zzbct.zzg(obj, j, zzbct.zzf(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 3:
                    if (zzK(obj2, i3)) {
                        zzbct.zzg(obj, j, zzbct.zzf(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 4:
                    if (zzK(obj2, i3)) {
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 5:
                    if (zzK(obj2, i3)) {
                        zzbct.zzg(obj, j, zzbct.zzf(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 6:
                    if (zzK(obj2, i3)) {
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 7:
                    if (zzK(obj2, i3)) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            zzbct.zzi(obj, j, zzbct.zzh(obj2, j));
                            zzL(obj, i3);
                            obj3.hashCode();
                            throw null;
                        }
                        zzbct.zzi(obj, j, zzbct.zzh(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 8:
                    if (zzK(obj2, i3)) {
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            zzbct.zzo(obj, j, zzbct.zzn(obj2, j));
                            zzL(obj, i3);
                            obj3.hashCode();
                            throw null;
                        }
                        zzbct.zzo(obj, j, zzbct.zzn(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 9:
                    zzl(obj, obj2, i3);
                    continue;
                    i3 += 3;
                    break;
                case 10:
                    if (zzK(obj2, i3)) {
                        zzbct.zzo(obj, j, zzbct.zzn(obj2, j));
                        zzL(obj, i3);
                        i = b + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                        break;
                    }
                    i3 += 3;
                    break;
                case 11:
                    if (zzK(obj2, i3)) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                        b = i10 % 128;
                        int i11 = i10 % 2;
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 12:
                    if (zzK(obj2, i3)) {
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 13:
                    if (zzK(obj2, i3)) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                        b = i12 % 128;
                        if (i12 % 2 == 0) {
                            zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                            zzL(obj, i3);
                            throw null;
                        }
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 14:
                    if (zzK(obj2, i3)) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        zzbct.zzg(obj, j, zzbct.zzf(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 15:
                    if (zzK(obj2, i3)) {
                        zzbct.zze(obj, j, zzbct.zzd(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 16:
                    if (zzK(obj2, i3)) {
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        zzbct.zzg(obj, j, zzbct.zzf(obj2, j));
                        zzL(obj, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 17:
                    zzl(obj, obj2, i3);
                    continue;
                    i3 += 3;
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
                    zzbao zzbaoVarZzg = (zzbao) zzbct.zzn(obj, j);
                    zzbao zzbaoVar = (zzbao) zzbct.zzn(obj2, j);
                    int size = zzbaoVarZzg.size();
                    int size2 = zzbaoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzbaoVarZzg.zza()) {
                            zzbaoVarZzg = zzbaoVarZzg.zzg(size2 + size);
                        }
                        zzbaoVarZzg.addAll(zzbaoVar);
                    }
                    if (size > 0) {
                        zzbaoVar = zzbaoVarZzg;
                    }
                    zzbct.zzo(obj, j, zzbaoVar);
                    continue;
                    i3 += 3;
                    break;
                case 50:
                    zzbct.zzo(obj, j, zzbbg.zza(zzbct.zzn(obj, j), zzbct.zzn(obj2, j)));
                    continue;
                    i3 += 3;
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
                    if (zzM(obj2, i4, i3)) {
                        zzbct.zzo(obj, j, zzbct.zzn(obj2, j));
                        zzN(obj, i4, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 60:
                    zzm(obj, obj2, i3);
                    continue;
                    i3 += 3;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i4, i3)) {
                        zzbct.zzo(obj, j, zzbct.zzn(obj2, j));
                        zzN(obj, i4, i3);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    break;
                case 68:
                    zzm(obj, obj2, i3);
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                    b = i17 % 128;
                    if (i17 % 2 == 0) {
                        i = 3;
                        break;
                    }
                    i3 += 3;
                    break;
                default:
                    continue;
                    i3 += 3;
                    break;
            }
            int i18 = i % 2;
            i3 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzf(Object obj, zzbcz zzbczVar) throws Throwable {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        boolean z;
        boolean z2;
        int i5 = 2 % 2;
        if (this.zzh) {
            int i6 = b + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            zzazu zzazuVar = ((zzbab) obj).zzb;
            if (zzazuVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZze = zzazuVar.zze();
                entry = (Map.Entry) itZze.next();
                it = itZze;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < iArr.length) {
            int iZzx = zzx(i11);
            int iZzz = zzz(iZzx);
            int i12 = iArr[i11];
            if (iZzz <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i2 = i10;
                i3 = 1 << (i13 >>> 20);
                i = i9;
            } else {
                i = i9;
                i2 = i10;
                i3 = 0;
            }
            while (true) {
                if (entry != null) {
                    zzazq zzazqVar = this.zzn;
                    i12 = i12;
                    if (i12 >= 525004180) {
                        zzazqVar.zzc(zzbczVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i12 = i12;
                }
            }
            long j = iZzx & 1048575;
            switch (iZzz) {
                case 0:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i15 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzf(i15, zzbct.zzl(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 1:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i16 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zze(i16, zzbct.zzj(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 2:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i17 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzc(i17, unsafe.getLong(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 3:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i18 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzh(i18, unsafe.getLong(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 4:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i19 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzi(i19, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 5:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i20 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzj(i20, unsafe.getLong(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 6:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i21 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzk(i21, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 7:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i22 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzl(i22, zzbct.zzh(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 8:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i23 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzO(i23, unsafe.getObject(obj, j), zzbczVar);
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 9:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i24 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzr(i24, unsafe.getObject(obj, j), zzn(i4));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 10:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i25 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzn(i25, (zzayz) unsafe.getObject(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 11:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i26 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzo(i26, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 12:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i27 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzg(i27, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 13:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i28 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzb(i28, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 14:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i29 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzd(i29, unsafe.getLong(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 15:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i30 = i12;
                    i4 = i11;
                    if (!(!zzJ(obj, i4, i, i2, i3))) {
                        zzbczVar.zzp(i30, unsafe.getInt(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 16:
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    int i31 = i12;
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzbczVar.zzq(i31, unsafe.getLong(obj, j));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 17:
                    entry = entry;
                    it = it;
                    c = 2;
                    int i32 = i12;
                    iArr = iArr;
                    int i33 = i2;
                    i2 = i2;
                    i4 = i11;
                    if (zzJ(obj, i11, i, i33, i3)) {
                        zzbczVar.zzs(i32, unsafe.getObject(obj, j), zzn(i4));
                    }
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 18:
                    z = false;
                    c = 2;
                    zzbcb.zza(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 19:
                    z = false;
                    c = 2;
                    zzbcb.zzb(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 20:
                    z = false;
                    c = 2;
                    zzbcb.zzc(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 21:
                    z = false;
                    c = 2;
                    zzbcb.zzd(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 22:
                    z = false;
                    c = 2;
                    zzbcb.zzh(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 23:
                    z = false;
                    c = 2;
                    zzbcb.zzf(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 24:
                    z = false;
                    c = 2;
                    zzbcb.zzk(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 25:
                    c = 2;
                    z = false;
                    zzbcb.zzn(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 26:
                    int i34 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j);
                    if (list == null || list.isEmpty()) {
                        c = 2;
                    } else {
                        int i35 = b + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
                        c = 2;
                        int i36 = i35 % 2;
                        zzbczVar.zzF(i34, list);
                    }
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 27:
                    int i37 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzbbz zzbbzVarZzn = zzn(i11);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i38 = 0; i38 < list2.size(); i38++) {
                            ((zzazj) zzbczVar).zzr(i37, list2.get(i38), zzbbzVarZzn);
                        }
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 28:
                    int i39 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j);
                    if (list3 != null) {
                        int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        if (!list3.isEmpty()) {
                            zzbczVar.zzG(i39, list3);
                        }
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 29:
                    z2 = false;
                    zzbcb.zzi(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 30:
                    z2 = false;
                    zzbcb.zzm(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 31:
                    z2 = false;
                    zzbcb.zzl(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 32:
                    z2 = false;
                    zzbcb.zzg(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 33:
                    z2 = false;
                    zzbcb.zzj(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 34:
                    z2 = false;
                    zzbcb.zze(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, false);
                    entry = entry;
                    it = it;
                    iArr = iArr;
                    i2 = i2;
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 35:
                    zzbcb.zza(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 36:
                    zzbcb.zzb(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 37:
                    zzbcb.zzc(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 38:
                    zzbcb.zzd(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 39:
                    zzbcb.zzh(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 40:
                    zzbcb.zzf(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 41:
                    zzbcb.zzk(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 42:
                    zzbcb.zzn(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 43:
                    zzbcb.zzi(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 44:
                    zzbcb.zzm(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 45:
                    zzbcb.zzl(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 46:
                    zzbcb.zzg(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 47:
                    zzbcb.zzj(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 48:
                    zzbcb.zze(iArr[i11], (List) unsafe.getObject(obj, j), zzbczVar, true);
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 49:
                    int i42 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzbbz zzbbzVarZzn2 = zzn(i11);
                    if (list4 != null) {
                        int i43 = b + 87;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i43 % 128;
                        int i44 = i43 % 2;
                        if (!list4.isEmpty()) {
                            for (int i45 = 0; i45 < list4.size(); i45++) {
                                ((zzazj) zzbczVar).zzs(i42, list4.get(i45), zzbbzVarZzn2);
                            }
                        }
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 51:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzf(i12, zzD(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 52:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zze(i12, zzE(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 53:
                    if (!(!zzM(obj, i12, i11))) {
                        zzbczVar.zzc(i12, zzG(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 54:
                    if (zzM(obj, i12, i11)) {
                        int i46 = b + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i46 % 128;
                        int i47 = i46 % 2;
                        zzbczVar.zzh(i12, zzG(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 55:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzi(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 56:
                    if (!(!zzM(obj, i12, i11))) {
                        zzbczVar.zzj(i12, zzG(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 57:
                    if (zzM(obj, i12, i11)) {
                        int i48 = b + 37;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        int i49 = i48 % 2;
                        zzbczVar.zzk(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 58:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzl(i12, zzH(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 59:
                    if (zzM(obj, i12, i11)) {
                        zzO(i12, unsafe.getObject(obj, j), zzbczVar);
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 60:
                    if (zzM(obj, i12, i11)) {
                        int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        b = i50 % 128;
                        if (i50 % 2 == 0) {
                            zzbczVar.zzr(i12, unsafe.getObject(obj, j), zzn(i11));
                            int i51 = 97 / 0;
                        } else {
                            zzbczVar.zzr(i12, unsafe.getObject(obj, j), zzn(i11));
                        }
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 61:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzn(i12, (zzayz) unsafe.getObject(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 62:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzo(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 63:
                    if (zzM(obj, i12, i11)) {
                        int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        zzbczVar.zzg(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 64:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzb(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 65:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzd(i12, zzG(obj, j));
                        int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                        b = i54 % 128;
                        int i55 = i54 % 2;
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 66:
                    if (!(!zzM(obj, i12, i11))) {
                        int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                        b = i56 % 128;
                        if (i56 % 2 == 0) {
                            zzbczVar.zzp(i12, zzF(obj, j));
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        zzbczVar.zzp(i12, zzF(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 67:
                    if (!(!zzM(obj, i12, i11))) {
                        zzbczVar.zzq(i12, zzG(obj, j));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                case 68:
                    if (zzM(obj, i12, i11)) {
                        zzbczVar.zzs(i12, unsafe.getObject(obj, j), zzn(i11));
                    }
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
                default:
                    c = 2;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    it = it;
                    i8 = 1048575;
                    entry = entry;
                    iArr = iArr;
                    i10 = i2;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzn.zzc(zzbczVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((zzbae) obj).zzc.zzg(zzbczVar);
    }

    /* JADX WARN: Code duplicated, block: B:235:0x06fe A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #8 {all -> 0x008e, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:11:0x0038, B:26:0x0066, B:34:0x0081, B:35:0x0086, B:36:0x008d, B:39:0x0091, B:43:0x00a7, B:44:0x00ab, B:78:0x01b7, B:86:0x01da, B:83:0x01c4, B:85:0x01ca, B:46:0x00b1, B:47:0x00bb, B:48:0x00c5, B:49:0x00cf, B:50:0x00d9, B:51:0x00e0, B:52:0x00e1, B:53:0x00eb, B:54:0x00f1, B:56:0x00f9, B:58:0x010e, B:59:0x0119, B:60:0x011e, B:61:0x012a, B:63:0x0132, B:66:0x0150, B:67:0x015b, B:68:0x0160, B:69:0x016b, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018b, B:74:0x0194, B:75:0x019d, B:76:0x01a6, B:77:0x01af, B:87:0x01df, B:88:0x01e6, B:89:0x01e7, B:90:0x01eb, B:92:0x01ee, B:93:0x01f2, B:29:0x006c, B:99:0x021a, B:100:0x021e, B:107:0x0236, B:224:0x06d6, B:226:0x06da, B:235:0x06fe, B:236:0x0703, B:227:0x06db, B:109:0x023c, B:110:0x024e, B:111:0x0260, B:112:0x0272, B:113:0x0284, B:114:0x0296, B:116:0x02a0, B:119:0x02a7, B:120:0x02ad, B:121:0x02bb, B:122:0x02cd, B:123:0x02db, B:124:0x02ed, B:125:0x02f5, B:126:0x0307, B:127:0x0319, B:128:0x032b, B:129:0x033d, B:130:0x034f, B:131:0x0361, B:132:0x0373, B:134:0x0385, B:138:0x03a0, B:140:0x03ab, B:145:0x03bb, B:147:0x03d8, B:149:0x03dd, B:143:0x03b0, B:146:0x03cb, B:153:0x03e7, B:155:0x03fa, B:156:0x0407, B:157:0x0414, B:158:0x0421, B:159:0x042e, B:161:0x0443, B:162:0x0449, B:163:0x0455, B:164:0x0461, B:165:0x046d, B:166:0x0479, B:167:0x0485, B:168:0x0491, B:169:0x049d, B:170:0x04a9, B:171:0x04b5, B:172:0x04c1, B:173:0x04cd, B:174:0x04d9, B:177:0x04e8, B:179:0x04f8, B:181:0x0501, B:182:0x050d, B:186:0x051d, B:187:0x052c, B:189:0x0533, B:190:0x0542, B:191:0x0550, B:192:0x055c, B:193:0x0568, B:194:0x0574, B:195:0x0580, B:196:0x058c, B:197:0x0598, B:198:0x05a4, B:199:0x05b0, B:200:0x05c3, B:201:0x05d2, B:202:0x05e1, B:203:0x05f0, B:204:0x05ff, B:206:0x060a, B:209:0x0611, B:210:0x0617, B:211:0x0621, B:212:0x0630, B:213:0x063f, B:214:0x0652, B:215:0x065b, B:216:0x066a, B:217:0x0679, B:218:0x0688, B:219:0x0697, B:220:0x06a6, B:221:0x06b5, B:222:0x06c4), top: B:271:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x070f A[LOOP:2: B:239:0x070b->B:241:0x070f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0723  */
    /* JADX WARN: Code duplicated, block: B:372:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4 A[Catch: all -> 0x008e, TryCatch #8 {all -> 0x008e, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:11:0x0038, B:26:0x0066, B:34:0x0081, B:35:0x0086, B:36:0x008d, B:39:0x0091, B:43:0x00a7, B:44:0x00ab, B:78:0x01b7, B:86:0x01da, B:83:0x01c4, B:85:0x01ca, B:46:0x00b1, B:47:0x00bb, B:48:0x00c5, B:49:0x00cf, B:50:0x00d9, B:51:0x00e0, B:52:0x00e1, B:53:0x00eb, B:54:0x00f1, B:56:0x00f9, B:58:0x010e, B:59:0x0119, B:60:0x011e, B:61:0x012a, B:63:0x0132, B:66:0x0150, B:67:0x015b, B:68:0x0160, B:69:0x016b, B:70:0x0170, B:71:0x0179, B:72:0x0182, B:73:0x018b, B:74:0x0194, B:75:0x019d, B:76:0x01a6, B:77:0x01af, B:87:0x01df, B:88:0x01e6, B:89:0x01e7, B:90:0x01eb, B:92:0x01ee, B:93:0x01f2, B:29:0x006c, B:99:0x021a, B:100:0x021e, B:107:0x0236, B:224:0x06d6, B:226:0x06da, B:235:0x06fe, B:236:0x0703, B:227:0x06db, B:109:0x023c, B:110:0x024e, B:111:0x0260, B:112:0x0272, B:113:0x0284, B:114:0x0296, B:116:0x02a0, B:119:0x02a7, B:120:0x02ad, B:121:0x02bb, B:122:0x02cd, B:123:0x02db, B:124:0x02ed, B:125:0x02f5, B:126:0x0307, B:127:0x0319, B:128:0x032b, B:129:0x033d, B:130:0x034f, B:131:0x0361, B:132:0x0373, B:134:0x0385, B:138:0x03a0, B:140:0x03ab, B:145:0x03bb, B:147:0x03d8, B:149:0x03dd, B:143:0x03b0, B:146:0x03cb, B:153:0x03e7, B:155:0x03fa, B:156:0x0407, B:157:0x0414, B:158:0x0421, B:159:0x042e, B:161:0x0443, B:162:0x0449, B:163:0x0455, B:164:0x0461, B:165:0x046d, B:166:0x0479, B:167:0x0485, B:168:0x0491, B:169:0x049d, B:170:0x04a9, B:171:0x04b5, B:172:0x04c1, B:173:0x04cd, B:174:0x04d9, B:177:0x04e8, B:179:0x04f8, B:181:0x0501, B:182:0x050d, B:186:0x051d, B:187:0x052c, B:189:0x0533, B:190:0x0542, B:191:0x0550, B:192:0x055c, B:193:0x0568, B:194:0x0574, B:195:0x0580, B:196:0x058c, B:197:0x0598, B:198:0x05a4, B:199:0x05b0, B:200:0x05c3, B:201:0x05d2, B:202:0x05e1, B:203:0x05f0, B:204:0x05ff, B:206:0x060a, B:209:0x0611, B:210:0x0617, B:211:0x0621, B:212:0x0630, B:213:0x063f, B:214:0x0652, B:215:0x065b, B:216:0x066a, B:217:0x0679, B:218:0x0688, B:219:0x0697, B:220:0x06a6, B:221:0x06b5, B:222:0x06c4), top: B:271:0x0014 }] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzg(Object obj, zzbby zzbbyVar, zzazp zzazpVar) throws IOException {
        int i;
        Object objZzo;
        int iOrdinal;
        Object objZzf;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        zzC(obj);
        zzbcm zzbcmVar = this.zzm;
        zzazq zzazqVar = this.zzn;
        Object objZzh = null;
        zzazu zzazuVarZza = null;
        while (true) {
            try {
                int iZzb = zzbbyVar.zzb();
                int i6 = 1;
                if (iZzb < this.zze || iZzb > this.zzf) {
                    i = -1;
                } else {
                    int[] iArr = this.zzc;
                    int length = (iArr.length / 3) - 1;
                    int i7 = 0;
                    while (true) {
                        if (i7 <= length) {
                            int i8 = b + 7;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                            int i9 = i8 % 2;
                            int i10 = (length + i7) >>> i6;
                            i = i10 * 3;
                            int i11 = iArr[i];
                            if (iZzb != i11) {
                                if (iZzb < i11) {
                                    length = i10 - 1;
                                } else {
                                    i7 = i10 + 1;
                                }
                                i6 = 1;
                            }
                        } else {
                            i = -1;
                        }
                    }
                }
                if (i >= 0) {
                    int iZzx = zzx(i);
                    try {
                        switch (zzz(iZzx)) {
                            case 0:
                                zzbct.zzm(obj, iZzx & 1048575, zzbbyVar.zze());
                                zzL(obj, i);
                                break;
                            case 1:
                                zzbct.zzk(obj, iZzx & 1048575, zzbbyVar.zzf());
                                zzL(obj, i);
                                break;
                            case 2:
                                zzbct.zzg(obj, iZzx & 1048575, zzbbyVar.zzh());
                                zzL(obj, i);
                                break;
                            case 3:
                                zzbct.zzg(obj, iZzx & 1048575, zzbbyVar.zzg());
                                zzL(obj, i);
                                break;
                            case 4:
                                zzbct.zze(obj, iZzx & 1048575, zzbbyVar.zzi());
                                zzL(obj, i);
                                break;
                            case 5:
                                zzbct.zzg(obj, iZzx & 1048575, zzbbyVar.zzj());
                                zzL(obj, i);
                                break;
                            case 6:
                                zzbct.zze(obj, iZzx & 1048575, zzbbyVar.zzk());
                                zzL(obj, i);
                                break;
                            case 7:
                                zzbct.zzi(obj, iZzx & 1048575, zzbbyVar.zzl());
                                zzL(obj, i);
                                break;
                            case 8:
                                zzw(obj, iZzx, zzbbyVar);
                                zzL(obj, i);
                                break;
                            case 9:
                                zzbbl zzbblVar = (zzbbl) zzq(obj, i);
                                zzbbyVar.zzq(zzbblVar, zzn(i), zzazpVar);
                                zzr(obj, i, zzbblVar);
                                break;
                            case 10:
                                zzbct.zzo(obj, iZzx & 1048575, zzbbyVar.zzs());
                                zzL(obj, i);
                                break;
                            case 11:
                                zzbct.zze(obj, iZzx & 1048575, zzbbyVar.zzt());
                                zzL(obj, i);
                                break;
                            case 12:
                                int iZzu = zzbbyVar.zzu();
                                zzbak zzbakVarZzp = zzp(i);
                                if (zzbakVarZzp == null || zzbakVarZzp.zza(iZzu)) {
                                    zzbct.zze(obj, iZzx & 1048575, iZzu);
                                    zzL(obj, i);
                                } else {
                                    objZzh = zzbcb.zzF(obj, iZzb, iZzu, objZzh, zzbcmVar);
                                }
                                break;
                            case 13:
                                zzbct.zze(obj, iZzx & 1048575, zzbbyVar.zzv());
                                zzL(obj, i);
                                break;
                            case 14:
                                zzbct.zzg(obj, iZzx & 1048575, zzbbyVar.zzw());
                                zzL(obj, i);
                                break;
                            case 15:
                                zzbct.zze(obj, iZzx & 1048575, zzbbyVar.zzx());
                                zzL(obj, i);
                                break;
                            case 16:
                                zzbct.zzg(obj, iZzx & 1048575, zzbbyVar.zzy());
                                zzL(obj, i);
                                break;
                            case 17:
                                zzbbl zzbblVar2 = (zzbbl) zzq(obj, i);
                                zzbbyVar.zzr(zzbblVar2, zzn(i), zzazpVar);
                                zzr(obj, i, zzbblVar2);
                                break;
                            case 18:
                                zzbbyVar.zzz(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 19:
                                zzbbyVar.zzA(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 20:
                                zzbbyVar.zzC(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 21:
                                zzbbyVar.zzB(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 22:
                                zzbbyVar.zzD(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 23:
                                zzbbyVar.zzE(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 24:
                                zzbbyVar.zzF(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 25:
                                zzbbyVar.zzG(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 26:
                                if (zzA(iZzx)) {
                                    ((zzazd) zzbbyVar).zzH(zzbay.zza(obj, iZzx & 1048575), true);
                                } else {
                                    ((zzazd) zzbbyVar).zzH(zzbay.zza(obj, iZzx & 1048575), false);
                                }
                                break;
                            case 27:
                                zzbbyVar.zzI(zzbay.zza(obj, iZzx & 1048575), zzn(i), zzazpVar);
                                break;
                            case 28:
                                zzbbyVar.zzK(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 29:
                                zzbbyVar.zzL(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 30:
                                try {
                                    List listZza = zzbay.zza(obj, iZzx & 1048575);
                                    zzbbyVar.zzM(listZza);
                                    objZzh = zzbcb.zzE(obj, iZzb, listZza, zzp(i), objZzh, zzbcmVar);
                                } catch (zzbaq unused) {
                                    i2 = 0;
                                    if (objZzh == null) {
                                        objZzh = zzbcmVar.zzh(obj);
                                    }
                                    if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                        for (i3 = this.zzk; i3 < this.zzl; i3++) {
                                            zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                        }
                                        if (objZzh != null) {
                                            zzbcmVar.zzi(obj, objZzh);
                                        }
                                    }
                                }
                                break;
                            case 31:
                                zzbbyVar.zzN(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 32:
                                zzbbyVar.zzO(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 33:
                                zzbbyVar.zzP(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 34:
                                zzbbyVar.zzQ(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 35:
                                zzbbyVar.zzz(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 36:
                                zzbbyVar.zzA(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 37:
                                zzbbyVar.zzC(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 38:
                                zzbbyVar.zzB(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 39:
                                zzbbyVar.zzD(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 40:
                                zzbbyVar.zzE(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 41:
                                zzbbyVar.zzF(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 42:
                                zzbbyVar.zzG(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 43:
                                zzbbyVar.zzL(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 44:
                                List listZza2 = zzbay.zza(obj, iZzx & 1048575);
                                zzbbyVar.zzM(listZza2);
                                try {
                                    objZzh = zzbcb.zzE(obj, iZzb, listZza2, zzp(i), objZzh, zzbcmVar);
                                } catch (zzbaq unused2) {
                                    i2 = 0;
                                    if (objZzh == null) {
                                        objZzh = zzbcmVar.zzh(obj);
                                    }
                                    if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                        while (i3 < this.zzl) {
                                            zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                        }
                                        if (objZzh != null) {
                                            zzbcmVar.zzi(obj, objZzh);
                                        }
                                    }
                                }
                                break;
                            case 45:
                                zzbbyVar.zzN(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 46:
                                zzbbyVar.zzO(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 47:
                                zzbbyVar.zzP(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 48:
                                zzbbyVar.zzQ(zzbay.zza(obj, iZzx & 1048575));
                                break;
                            case 49:
                                i4 = 0;
                                try {
                                    zzbbyVar.zzJ(zzbay.zza(obj, iZzx & 1048575), zzn(i), zzazpVar);
                                } catch (zzbaq unused3) {
                                    i2 = i4;
                                    if (objZzh == null) {
                                        objZzh = zzbcmVar.zzh(obj);
                                    }
                                    if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                        while (i3 < this.zzl) {
                                            zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                        }
                                        if (objZzh != null) {
                                            zzbcmVar.zzi(obj, objZzh);
                                        }
                                    }
                                }
                                break;
                            case 50:
                                try {
                                    Object objZzo2 = zzo(i);
                                    long jZzx = zzx(i) & 1048575;
                                    Object objZzn = zzbct.zzn(obj, jZzx);
                                    if (objZzn != null) {
                                        int i12 = b + 29;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            i4 = 0;
                                            int i13 = 9 / 0;
                                            if (!((zzbbf) objZzn).zze()) {
                                                Object objZzc = zzbbf.zza().zzc();
                                                zzbbg.zza(objZzc, objZzn);
                                                zzbct.zzo(obj, jZzx, objZzc);
                                                objZzn = objZzc;
                                            }
                                        } else {
                                            i4 = 0;
                                            if (!((zzbbf) objZzn).zze()) {
                                                Object objZzc2 = zzbbf.zza().zzc();
                                                zzbbg.zza(objZzc2, objZzn);
                                                zzbct.zzo(obj, jZzx, objZzc2);
                                                objZzn = objZzc2;
                                            }
                                        }
                                    } else {
                                        i4 = 0;
                                        objZzn = zzbbf.zza().zzc();
                                        zzbct.zzo(obj, jZzx, objZzn);
                                    }
                                    try {
                                        throw null;
                                    } catch (zzbaq unused4) {
                                        i2 = i4;
                                    }
                                } catch (zzbaq unused5) {
                                    i4 = 0;
                                    i2 = i4;
                                }
                                break;
                            case 51:
                                zzbct.zzo(obj, iZzx & 1048575, Double.valueOf(zzbbyVar.zze()));
                                zzN(obj, iZzb, i);
                                break;
                            case 52:
                                zzbct.zzo(obj, iZzx & 1048575, Float.valueOf(zzbbyVar.zzf()));
                                zzN(obj, iZzb, i);
                                break;
                            case 53:
                                zzbct.zzo(obj, iZzx & 1048575, Long.valueOf(zzbbyVar.zzh()));
                                zzN(obj, iZzb, i);
                                break;
                            case 54:
                                zzbct.zzo(obj, iZzx & 1048575, Long.valueOf(zzbbyVar.zzg()));
                                zzN(obj, iZzb, i);
                                break;
                            case 55:
                                zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(zzbbyVar.zzi()));
                                zzN(obj, iZzb, i);
                                break;
                            case 56:
                                zzbct.zzo(obj, iZzx & 1048575, Long.valueOf(zzbbyVar.zzj()));
                                zzN(obj, iZzb, i);
                                break;
                            case 57:
                                zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(zzbbyVar.zzk()));
                                zzN(obj, iZzb, i);
                                break;
                            case 58:
                                zzbct.zzo(obj, iZzx & 1048575, Boolean.valueOf(zzbbyVar.zzl()));
                                zzN(obj, iZzb, i);
                                break;
                            case 59:
                                zzw(obj, iZzx, zzbbyVar);
                                zzN(obj, iZzb, i);
                                break;
                            case 60:
                                zzbbl zzbblVar3 = (zzbbl) zzs(obj, iZzb, i);
                                zzbbyVar.zzq(zzbblVar3, zzn(i), zzazpVar);
                                zzt(obj, iZzb, i, zzbblVar3);
                                break;
                            case 61:
                                zzbct.zzo(obj, iZzx & 1048575, zzbbyVar.zzs());
                                zzN(obj, iZzb, i);
                                break;
                            case 62:
                                zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(zzbbyVar.zzt()));
                                zzN(obj, iZzb, i);
                                break;
                            case 63:
                                int iZzu2 = zzbbyVar.zzu();
                                zzbak zzbakVarZzp2 = zzp(i);
                                if (zzbakVarZzp2 == null || zzbakVarZzp2.zza(iZzu2)) {
                                    zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(iZzu2));
                                    zzN(obj, iZzb, i);
                                } else {
                                    objZzh = zzbcb.zzF(obj, iZzb, iZzu2, objZzh, zzbcmVar);
                                }
                                break;
                            case 64:
                                zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(zzbbyVar.zzv()));
                                zzN(obj, iZzb, i);
                                break;
                            case 65:
                                zzbct.zzo(obj, iZzx & 1048575, Long.valueOf(zzbbyVar.zzw()));
                                zzN(obj, iZzb, i);
                                break;
                            case 66:
                                zzbct.zzo(obj, iZzx & 1048575, Integer.valueOf(zzbbyVar.zzx()));
                                zzN(obj, iZzb, i);
                                break;
                            case 67:
                                zzbct.zzo(obj, iZzx & 1048575, Long.valueOf(zzbbyVar.zzy()));
                                zzN(obj, iZzb, i);
                                break;
                            case 68:
                                zzbbl zzbblVar4 = (zzbbl) zzs(obj, iZzb, i);
                                zzbbyVar.zzr(zzbblVar4, zzn(i), zzazpVar);
                                zzt(obj, iZzb, i, zzbblVar4);
                                break;
                            default:
                                i2 = 0;
                                try {
                                    if (objZzh == null) {
                                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                                        b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            zzbcmVar.zzh(obj);
                                            throw null;
                                        }
                                        try {
                                            objZzh = zzbcmVar.zzh(obj);
                                        } catch (zzbaq unused6) {
                                            if (objZzh == null) {
                                                objZzh = zzbcmVar.zzh(obj);
                                            }
                                            if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                                while (i3 < this.zzl) {
                                                    zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                                }
                                            }
                                        }
                                        break;
                                        if (objZzh == null) {
                                            objZzh = zzbcmVar.zzh(obj);
                                        }
                                        if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                            while (i3 < this.zzl) {
                                                zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                            }
                                        }
                                    }
                                    if (!zzbcmVar.zzk(objZzh, zzbbyVar, 0)) {
                                        for (int i15 = this.zzk; i15 < this.zzl; i15++) {
                                            zzu(obj, this.zzj[i15], objZzh, zzbcmVar, obj);
                                        }
                                    }
                                    break;
                                } catch (zzbaq unused7) {
                                    if (objZzh == null) {
                                        objZzh = zzbcmVar.zzh(obj);
                                    }
                                    if (!zzbcmVar.zzk(objZzh, zzbbyVar, i2)) {
                                        while (i3 < this.zzl) {
                                            zzu(obj, this.zzj[i3], objZzh, zzbcmVar, obj);
                                        }
                                    }
                                }
                                break;
                        }
                    } catch (zzbaq unused8) {
                        i2 = 0;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    for (int i16 = this.zzk; i16 < this.zzl; i16++) {
                        zzu(obj, this.zzj[i16], objZzh, zzbcmVar, obj);
                    }
                } else {
                    zzbad zzbadVarZzb = !this.zzh ? null : zzazpVar.zzb(this.zzg, iZzb);
                    if (zzbadVarZzb != null) {
                        if (zzazuVarZza == null) {
                            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            b = i17 % 128;
                            if (i17 % 2 == 0) {
                                zzazqVar.zza(obj);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            zzazuVarZza = zzazqVar.zza(obj);
                        }
                        zzbad zzbadVar = zzbadVarZzb;
                        zzbac zzbacVar = zzbadVarZzb.zzb;
                        zzbcx zzbcxVar = zzbcx.ENUM;
                        zzbcx zzbcxVar2 = zzbacVar.zzb;
                        if (zzbcxVar2 == zzbcxVar) {
                            zzbbyVar.zzi();
                            throw null;
                        }
                        int i18 = b + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                        if (i18 % 2 != 0) {
                            zzbcxVar2.ordinal();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        switch (zzbcxVar2) {
                            case DOUBLE:
                                objZzo = Double.valueOf(zzbbyVar.zze());
                                iOrdinal = zzbcxVar2.ordinal();
                                if ((iOrdinal != 9 || iOrdinal == 10) && (objZzf = zzazuVarZza.zzf(zzbacVar)) != null) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case FLOAT:
                                objZzo = Float.valueOf(zzbbyVar.zzf());
                                iOrdinal = zzbcxVar2.ordinal();
                                objZzo = iOrdinal != 9 ? ((zzbbl) objZzf).zzbx().zzw((zzbbl) objZzo).zzF() : ((zzbbl) objZzf).zzbx().zzw((zzbbl) objZzo).zzF();
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case INT64:
                                objZzo = Long.valueOf(zzbbyVar.zzh());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case UINT64:
                                objZzo = Long.valueOf(zzbbyVar.zzg());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case INT32:
                                objZzo = Integer.valueOf(zzbbyVar.zzi());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case FIXED64:
                                objZzo = Long.valueOf(zzbbyVar.zzj());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case FIXED32:
                                objZzo = Integer.valueOf(zzbbyVar.zzk());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case BOOL:
                                objZzo = Boolean.valueOf(zzbbyVar.zzl());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case STRING:
                                objZzo = zzbbyVar.zzm();
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case GROUP:
                                Object objZzf2 = zzazuVarZza.zzf(zzbacVar);
                                if (objZzf2 instanceof zzbae) {
                                    zzbbz zzbbzVarZzb = zzbbv.zza().zzb(objZzf2.getClass());
                                    if (!((zzbae) objZzf2).zzbd()) {
                                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                                        b = i19 % 128;
                                        int i20 = i19 % 2;
                                        Object objZza = zzbbzVarZzb.zza();
                                        zzbbzVarZzb.zzd(objZza, objZzf2);
                                        zzazuVarZza.zzg(zzbacVar, objZza);
                                        objZzf2 = objZza;
                                    }
                                    zzbbyVar.zzr(objZzf2, zzbbzVarZzb, zzazpVar);
                                } else {
                                    objZzo = zzbbyVar.zzp(zzbadVarZzb.zza.getClass(), zzazpVar);
                                    iOrdinal = zzbcxVar2.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    zzazuVarZza.zzg(zzbacVar, objZzo);
                                }
                                break;
                            case MESSAGE:
                                Object objZzf3 = zzazuVarZza.zzf(zzbacVar);
                                if (objZzf3 instanceof zzbae) {
                                    zzbbz zzbbzVarZzb2 = zzbbv.zza().zzb(objZzf3.getClass());
                                    if (!((zzbae) objZzf3).zzbd()) {
                                        Object objZza2 = zzbbzVarZzb2.zza();
                                        zzbbzVarZzb2.zzd(objZza2, objZzf3);
                                        zzazuVarZza.zzg(zzbacVar, objZza2);
                                        objZzf3 = objZza2;
                                    }
                                    zzbbyVar.zzq(objZzf3, zzbbzVarZzb2, zzazpVar);
                                } else {
                                    objZzo = zzbbyVar.zzo(zzbadVarZzb.zza.getClass(), zzazpVar);
                                    iOrdinal = zzbcxVar2.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    zzazuVarZza.zzg(zzbacVar, objZzo);
                                }
                                break;
                            case BYTES:
                                objZzo = zzbbyVar.zzs();
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case UINT32:
                                objZzo = Integer.valueOf(zzbbyVar.zzt());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case ENUM:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case SFIXED32:
                                objZzo = Integer.valueOf(zzbbyVar.zzv());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case SFIXED64:
                                objZzo = Long.valueOf(zzbbyVar.zzw());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case SINT32:
                                objZzo = Integer.valueOf(zzbbyVar.zzx());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            case SINT64:
                                objZzo = Long.valueOf(zzbbyVar.zzy());
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                            default:
                                objZzo = null;
                                iOrdinal = zzbcxVar2.ordinal();
                                if (iOrdinal != 9) {
                                }
                                zzazuVarZza.zzg(zzbacVar, objZzo);
                                break;
                        }
                    } else {
                        if (objZzh == null) {
                            objZzh = zzbcmVar.zzh(obj);
                        }
                        if (!zzbcmVar.zzk(objZzh, zzbbyVar, 0)) {
                            int i21 = b + 33;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                            int i22 = i21 % 2;
                            for (int i23 = this.zzk; i23 < this.zzl; i23++) {
                                zzu(obj, this.zzj[i23], objZzh, zzbcmVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i24 = this.zzk; i24 < this.zzl; i24++) {
                    zzu(obj, this.zzj[i24], objZzh, zzbcmVar, obj);
                }
                if (objZzh != null) {
                    int i25 = b + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                    int i26 = i25 % 2;
                    zzbcmVar.zzi(obj, objZzh);
                }
                throw th;
            }
        }
        if (objZzh != null) {
            zzbcmVar.zzi(obj, objZzh);
        }
    }

    /* JADX WARN: Code duplicated, block: B:215:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:218:0x05bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v215, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v298, types: [int] */
    /* JADX WARN: Type inference failed for: r0v310 */
    /* JADX WARN: Type inference failed for: r0v313 */
    /* JADX WARN: Type inference failed for: r0v314 */
    /* JADX WARN: Type inference failed for: r0v315 */
    /* JADX WARN: Type inference failed for: r0v316 */
    /* JADX WARN: Type inference failed for: r0v317 */
    /* JADX WARN: Type inference failed for: r0v318 */
    /* JADX WARN: Type inference failed for: r0v319 */
    /* JADX WARN: Type inference failed for: r0v320 */
    /* JADX WARN: Type inference failed for: r0v321 */
    /* JADX WARN: Type inference failed for: r0v322 */
    /* JADX WARN: Type inference failed for: r0v323 */
    /* JADX WARN: Type inference failed for: r0v324 */
    /* JADX WARN: Type inference failed for: r0v325 */
    /* JADX WARN: Type inference failed for: r0v326 */
    /* JADX WARN: Type inference failed for: r0v327 */
    /* JADX WARN: Type inference failed for: r0v328 */
    /* JADX WARN: Type inference failed for: r0v329 */
    /* JADX WARN: Type inference failed for: r0v330 */
    /* JADX WARN: Type inference failed for: r0v331 */
    /* JADX WARN: Type inference failed for: r0v332 */
    /* JADX WARN: Type inference failed for: r0v333 */
    /* JADX WARN: Type inference failed for: r0v334 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v103, types: [int] */
    /* JADX WARN: Type inference failed for: r1v106, types: [int] */
    /* JADX WARN: Type inference failed for: r1v133, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v46, types: [int] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v62, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r2v124 */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v48, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v58, types: [int] */
    /* JADX WARN: Type inference failed for: r2v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v63, types: [int] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65, types: [int] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70, types: [int] */
    /* JADX WARN: Type inference failed for: r2v71, types: [int] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v57, types: [int] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59, types: [int] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zze(Object obj) throws Throwable {
        ?? r17;
        int i;
        ?? r5;
        int iZzz;
        int iZzz2;
        int iZzz3;
        int iZzA;
        int iZzz4;
        ?? Zzz;
        int iZzz5;
        int iZzz6;
        int iZzc;
        ?? Zzo;
        int size;
        int iZzp;
        int iZzz7;
        int iZzB;
        zzbax zzbaxVar;
        ?? r3;
        ?? ZzG;
        int iZzD;
        ?? Zzz2;
        int iZzz8;
        int iZzA2;
        int iZzx;
        int iZzz9;
        int iZzz10;
        int iZzz11;
        int iZzz12;
        int iZzz13;
        int iZzc2;
        ?? r0;
        int i2 = 2 % 2;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        ?? r11 = 0;
        int i4 = 1048575;
        ?? r1 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                int iZzi = i6 + ((zzbae) obj).zzc.zzi();
                if (!this.zzh) {
                    return iZzi;
                }
                zzbcg zzbcgVar = ((zzbab) obj).zzb.zza;
                int iZzc3 = zzbcgVar.zzc();
                int iZzk = 0;
                for (int i7 = 0; i7 < iZzc3; i7++) {
                    Map.Entry entryZzd = zzbcgVar.zzd(i7);
                    iZzk += zzazu.zzk((zzazt) ((zzbcd) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzbcgVar.zze()) {
                    iZzk += zzazu.zzk((zzazt) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzk;
            }
            int iZzx2 = zzx(i5);
            int iZzz14 = zzz(iZzx2);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & i3;
            if (iZzz14 <= 17) {
                if (i10 != i4) {
                    i4 = i10;
                    r0 = i10 == i3 ? r11 : unsafe.getInt(obj, i10);
                }
                r17 = r0;
                i = i4;
                r5 = 1 << (i9 >>> 20);
            } else {
                r0 = r1;
                r17 = r1;
                i = i4;
                r5 = r11;
            }
            if (iZzz14 >= zzazv.DOUBLE_LIST_PACKED.zza()) {
                zzazv.SINT64_LIST_PACKED.zza();
            }
            long j = iZzx2 & i3;
            switch (iZzz14) {
                case 0:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        iZzz = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz + 8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 1:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        iZzz2 = zzazi.zzz(i8 << 3);
                        Zzz = iZzz2 + 4;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 2:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzA(j2);
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 3:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i11 = b + 61;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            long j3 = unsafe.getLong(obj, j);
                            iZzz3 = zzazi.zzz(i8 * 2);
                            iZzA = zzazi.zzA(j3);
                        } else {
                            long j4 = unsafe.getLong(obj, j);
                            iZzz3 = zzazi.zzz(i8 << 3);
                            iZzA = zzazi.zzA(j4);
                        }
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 4:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzA(j5);
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 5:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        iZzz4 = zzazi.zzz(i8 << 3);
                        Zzz = iZzz4 + 8;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 6:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i12 = b + 41;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                        int i13 = i12 % 2;
                        iZzz2 = zzazi.zzz(i8 << 3);
                        Zzz = iZzz2 + 4;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 7:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i14 = b + 121;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                        Zzz = i14 % 2 != 0 ? zzazi.zzz(i8 >>> 2) : zzazi.zzz(i8 << 3) + 1;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 8:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i15 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzayz) {
                            int iZzz15 = zzazi.zzz(i15);
                            int iZzc4 = ((zzayz) object).zzc();
                            iZzz5 = zzazi.zzz(iZzc4);
                            iZzz6 = iZzz15;
                            iZzc = iZzc4;
                            Zzz = iZzz6 + iZzz5 + iZzc;
                            i6 += Zzz;
                        } else {
                            iZzz3 = zzazi.zzz(i15);
                            iZzA = zzazi.zzB((String) object);
                            Zzz = iZzz3 + iZzA;
                            i6 += Zzz;
                        }
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 9:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        Zzz2 = zzbcb.zzz(i8, unsafe.getObject(obj, j), zzn(i5));
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 10:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        zzayz zzayzVar = (zzayz) unsafe.getObject(obj, j);
                        iZzz6 = zzazi.zzz(i8 << 3);
                        iZzc = zzayzVar.zzc();
                        iZzz5 = zzazi.zzz(iZzc);
                        Zzz = iZzz6 + iZzz5 + iZzc;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 11:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i16 = unsafe.getInt(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzz(i16);
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 12:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        long j6 = unsafe.getInt(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzA(j6);
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 13:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        iZzz2 = zzazi.zzz(i8 << 3);
                        Zzz = iZzz2 + 4;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 14:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        iZzz4 = zzazi.zzz(i8 << 3);
                        Zzz = iZzz4 + 8;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 15:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        int i17 = unsafe.getInt(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzz((i17 + i17) ^ (i17 >> 31));
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 16:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        long j7 = unsafe.getLong(obj, j);
                        iZzz3 = zzazi.zzz(i8 << 3);
                        iZzA = zzazi.zzA((j7 + j7) ^ (j7 >> 63));
                        Zzz = iZzz3 + iZzA;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 17:
                    if (zzJ(obj, i5, i, r17 == true ? 1 : 0, r5)) {
                        Zzz2 = zzazi.zzG(i8, (zzbbl) unsafe.getObject(obj, j), zzn(i5));
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 18:
                    Zzz2 = zzbcb.zzy(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 19:
                    Zzz2 = zzbcb.zzw(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    if (list.size() == 0) {
                        Zzo = r11;
                    } else {
                        Zzo = zzbcb.zzo(list) + (list.size() * zzazi.zzz(i8 << 3));
                    }
                    i6 += Zzo;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    size = list2.size();
                    if (size != 0) {
                        iZzp = zzbcb.zzp(list2);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i18 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i18;
                        Zzz2 = iZzA2 + iZzz8;
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    size = list3.size();
                    if (size != 0) {
                        iZzp = zzbcb.zzs(list3);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i19 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i19;
                        Zzz2 = iZzA2 + iZzz8;
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 23:
                    Zzz2 = zzbcb.zzy(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 24:
                    Zzz2 = zzbcb.zzw(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 25:
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        Zzz2 = size2 * (zzazi.zzz(i8 << 3) + 1);
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 26:
                    ?? r2 = (List) unsafe.getObject(obj, j);
                    int size3 = r2.size();
                    if (size3 != 0) {
                        Zzo = zzazi.zzz(i8 << 3) * size3;
                        if (r2 instanceof zzbax) {
                            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            b = i20 % 128;
                            if (i20 % 2 == 0) {
                                zzbaxVar = (zzbax) r2;
                                r3 = 1;
                            } else {
                                zzbaxVar = (zzbax) r2;
                                r3 = r11;
                            }
                            while (r3 < size3) {
                                Object objZzc = zzbaxVar.zzc();
                                if (!(objZzc instanceof zzayz)) {
                                    Zzo += zzazi.zzB((String) objZzc);
                                } else {
                                    int iZzc5 = ((zzayz) objZzc).zzc();
                                    Zzo += zzazi.zzz(iZzc5) + iZzc5;
                                }
                                r3++;
                            }
                        } else {
                            for (?? r4 = r11; r4 < size3; r4++) {
                                Object obj2 = r2.get(r4);
                                if (obj2 instanceof zzayz) {
                                    Zzo = Zzo;
                                    int iZzc6 = ((zzayz) obj2).zzc();
                                    iZzB = Zzo + zzazi.zzz(iZzc6) + iZzc6;
                                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                    b = i21 % 128;
                                    int i22 = i21 % 2;
                                } else {
                                    Zzo = Zzo;
                                    iZzB = Zzo + zzazi.zzB((String) obj2);
                                }
                                Zzo = iZzB;
                            }
                            Zzo = Zzo;
                        }
                    } else {
                        Zzo = r11;
                    }
                    i6 += Zzo;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 27:
                    ?? r6 = (List) unsafe.getObject(obj, j);
                    zzbbz zzbbzVarZzn = zzn(i5);
                    int size4 = r6.size();
                    if (size4 == 0) {
                        ZzG = r11;
                    } else {
                        int iZzz16 = zzazi.zzz(i8 << 3) * size4;
                        for (?? r7 = r11; r7 < size4; r7++) {
                            Object obj3 = r6.get(r7);
                            if (obj3 instanceof zzbaw) {
                                ZzG = iZzz16;
                                int iZzb = ((zzbaw) obj3).zzb();
                                iZzD = (ZzG == true ? 1 : 0) + zzazi.zzz(iZzb) + iZzb;
                            } else {
                                ZzG = iZzz16;
                                iZzD = (ZzG == true ? 1 : 0) + zzazi.zzD((zzbbl) obj3, zzbbzVarZzn);
                            }
                            ZzG = iZzD;
                        }
                        ZzG = iZzz16;
                    }
                    i6 += ZzG;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 28:
                    ?? r8 = (List) unsafe.getObject(obj, j);
                    int size5 = r8.size();
                    if (size5 == 0) {
                        Zzz = r11;
                    } else {
                        Zzz = size5 * zzazi.zzz(i8 << 3);
                        ?? r9 = r11;
                        while (r9 < r8.size()) {
                            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                            b = i23 % 128;
                            if (i23 % 2 == 0) {
                                int iZzc7 = ((zzayz) r8.get(r9)).zzc();
                                Zzz %= zzazi.zzz(iZzc7) >> iZzc7;
                                r9 += 95;
                            } else {
                                int iZzc8 = ((zzayz) r8.get(r9)).zzc();
                                Zzz += zzazi.zzz(iZzc8) + iZzc8;
                                r9++;
                            }
                        }
                    }
                    i6 += Zzz;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 29:
                    List list4 = (List) unsafe.getObject(obj, j);
                    size = list4.size();
                    if (size != 0) {
                        iZzp = zzbcb.zzt(list4);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i110 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i110;
                        Zzz2 = iZzA2 + iZzz8;
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 30:
                    List list5 = (List) unsafe.getObject(obj, j);
                    size = list5.size();
                    if (size != 0) {
                        iZzp = zzbcb.zzr(list5);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i111 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i111;
                        Zzz2 = iZzA2 + iZzz8;
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 31:
                    Zzz2 = zzbcb.zzw(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 32:
                    Zzz2 = zzbcb.zzy(i8, (List) unsafe.getObject(obj, j), r11);
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 33:
                    List list6 = (List) unsafe.getObject(obj, j);
                    size = list6.size();
                    if (size != 0) {
                        iZzp = zzbcb.zzu(list6);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i112 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i112;
                        Zzz2 = iZzA2 + iZzz8;
                    } else {
                        Zzz2 = r11;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 34:
                    List list7 = (List) unsafe.getObject(obj, j);
                    size = list7.size();
                    if (size == 0) {
                        Zzz2 = r11;
                    } else {
                        iZzp = zzbcb.zzq(list7);
                        iZzz7 = zzazi.zzz(i8 << 3);
                        int i113 = size * iZzz7;
                        iZzz8 = iZzp;
                        iZzA2 = i113;
                        Zzz2 = iZzA2 + iZzz8;
                    }
                    i6 += Zzz2;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 35:
                    iZzx = zzbcb.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 36:
                    iZzx = zzbcb.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 37:
                    iZzx = zzbcb.zzo((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 38:
                    iZzx = zzbcb.zzp((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 39:
                    iZzx = zzbcb.zzs((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 40:
                    iZzx = zzbcb.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            iZzz9 = zzazi.zzz(i8 << 3);
                            iZzz10 = zzazi.zzz(iZzx);
                        } else {
                            iZzz9 = zzazi.zzz(i8 << 3);
                            iZzz10 = zzazi.zzz(iZzx);
                        }
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 41:
                    iZzx = zzbcb.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 42:
                    iZzx = ((List) unsafe.getObject(obj, j)).size();
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 43:
                    iZzx = zzbcb.zzt((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 44:
                    iZzx = zzbcb.zzr((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 45:
                    iZzx = zzbcb.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 46:
                    iZzx = zzbcb.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 47:
                    iZzx = zzbcb.zzu((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 48:
                    iZzx = zzbcb.zzq((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzazi.zzz(i8 << 3);
                        iZzz10 = zzazi.zzz(iZzx);
                        Zzz = iZzz9 + iZzz10 + iZzx;
                        i6 += Zzz;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 49:
                    ?? r10 = (List) unsafe.getObject(obj, j);
                    zzbbz zzbbzVarZzn2 = zzn(i5);
                    int size6 = r10.size();
                    ZzG = r11;
                    if (size6 != 0) {
                        for (?? r12 = ZzG; r12 < size6; r12++) {
                            ZzG = ZzG;
                            ZzG += zzazi.zzG(i8, (zzbbl) r10.get(r12), zzbbzVarZzn2);
                        }
                        ZzG = ZzG;
                    }
                    i6 += ZzG;
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 50:
                    zzbbf zzbbfVar = (zzbbf) unsafe.getObject(obj, j);
                    if (zzbbfVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzbbfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                        int i25 = b + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                        if (i25 % 2 != 0) {
                            throw null;
                        }
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                case 51:
                    if (zzM(obj, i8, i5)) {
                        iZzz = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz + 8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 52:
                    if (zzM(obj, i8, i5)) {
                        iZzz11 = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz11 + 4;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 53:
                    if (zzM(obj, i8, i5)) {
                        long jZzG = zzG(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzA(jZzG);
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 54:
                    if (zzM(obj, i8, i5)) {
                        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        long jZzG2 = zzG(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzA(jZzG2);
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 55:
                    if (zzM(obj, i8, i5)) {
                        long jZzF = zzF(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzA(jZzF);
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 56:
                    if (zzM(obj, i8, i5)) {
                        iZzz = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz + 8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 57:
                    if (zzM(obj, i8, i5)) {
                        iZzz11 = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz11 + 4;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 58:
                    if (zzM(obj, i8, i5)) {
                        Zzz2 = zzazi.zzz(i8 << 3) + 1;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 59:
                    if (zzM(obj, i8, i5)) {
                        int i28 = i8 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzayz) {
                            int iZzz17 = zzazi.zzz(i28);
                            int iZzc9 = ((zzayz) object2).zzc();
                            iZzz12 = zzazi.zzz(iZzc9);
                            iZzz13 = iZzz17;
                            iZzc2 = iZzc9;
                            Zzz2 = iZzz13 + iZzz12 + iZzc2;
                            i6 += Zzz2;
                        } else {
                            iZzz8 = zzazi.zzz(i28);
                            iZzA2 = zzazi.zzB((String) object2);
                            Zzz2 = iZzA2 + iZzz8;
                            i6 += Zzz2;
                        }
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 60:
                    if (zzM(obj, i8, i5)) {
                        Zzz2 = zzbcb.zzz(i8, unsafe.getObject(obj, j), zzn(i5));
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 61:
                    if (zzM(obj, i8, i5)) {
                        zzayz zzayzVar2 = (zzayz) unsafe.getObject(obj, j);
                        iZzz13 = zzazi.zzz(i8 << 3);
                        iZzc2 = zzayzVar2.zzc();
                        iZzz12 = zzazi.zzz(iZzc2);
                        Zzz2 = iZzz13 + iZzz12 + iZzc2;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 62:
                    if (zzM(obj, i8, i5)) {
                        int iZzF = zzF(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzz(iZzF);
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 63:
                    if (zzM(obj, i8, i5)) {
                        long jZzF2 = zzF(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzA(jZzF2);
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 64:
                    if (zzM(obj, i8, i5)) {
                        iZzz11 = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz11 + 4;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 65:
                    if (zzM(obj, i8, i5)) {
                        iZzz = zzazi.zzz(i8 << 3);
                        Zzz2 = iZzz + 8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 66:
                    if (zzM(obj, i8, i5)) {
                        int iZzF2 = zzF(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzz((iZzF2 + iZzF2) ^ (iZzF2 >> 31));
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 67:
                    if (zzM(obj, i8, i5)) {
                        long jZzG3 = zzG(obj, j);
                        iZzz8 = zzazi.zzz(i8 << 3);
                        iZzA2 = zzazi.zzA((jZzG3 + jZzG3) ^ (jZzG3 >> 63));
                        Zzz2 = iZzA2 + iZzz8;
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                case 68:
                    if (zzM(obj, i8, i5)) {
                        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            ?? r13 = 60 / r11;
                            Zzz2 = zzazi.zzG(i8, (zzbbl) unsafe.getObject(obj, j), zzn(i5));
                        } else {
                            Zzz2 = zzazi.zzG(i8, (zzbbl) unsafe.getObject(obj, j), zzn(i5));
                        }
                        i6 += Zzz2;
                    }
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
                default:
                    i5 += 3;
                    r1 = r17;
                    i4 = i;
                    i3 = 1048575;
                    r11 = 0;
                    break;
            }
        }
    }

    private zzbbo(int[] iArr, Object[] objArr, int i, int i2, zzbbl zzbblVar, boolean z, int[] iArr2, int i3, int i4, zzbbr zzbbrVar, zzbay zzbayVar, zzbcm zzbcmVar, zzazq zzazqVar, zzbbg zzbbgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzbblVar instanceof zzbae;
        boolean z2 = false;
        if (zzazqVar != null && (zzbblVar instanceof zzbab)) {
            int i5 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            z2 = i5 % 2 == 0;
            int i6 = 2 % 2;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzbcmVar;
        this.zzn = zzazqVar;
        this.zzg = zzbblVar;
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    private static boolean zzA(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((i & 536870912) == 0) {
            return false;
        }
        int i5 = i4 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static int zzz(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (i >>> 20) & 255;
        int i7 = i3 + 63;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 71 / 0;
        }
        return i6;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59734, 59827, 59839, 59813, 59802, 59805, 59826, 59795, 59779, 59813, 59829, 59824, 59839, 59834, 59819, 59796, 59838, 59834, 59812, 59813, 59812, 59834, 59812, 59832, 59819, 59833, 59832, 59850, 59829, 59812, 59825, 59832, 59832, 59824, 59836, 59849, 59825, 59705, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59699, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745};
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
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbbo.$$c
            int r8 = 105 - r8
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.$$g(byte, byte, short):java.lang.String");
    }
}
