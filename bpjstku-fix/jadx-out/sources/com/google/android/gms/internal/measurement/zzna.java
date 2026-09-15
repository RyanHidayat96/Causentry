package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class zzna extends zzku implements RandomAccess, zzmn, zznt {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private static final long[] zza;
    private static final zzna zzb;
    private long[] zzc;
    private int zzd;
    private static final byte[] $$c = {57, -56, 23, -36};
    private static final int $$f = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, 22, 11, 19, -41, 45, 13, 3, -7, 37, -22, 48, 9, 6, 15, 9, -23, 43, 8, -3, 6, 22, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 102;
    private static final byte[] $$a = {7, 15, 25, 25, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 229;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentbindingInflater1();
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzna(jArr, 0, false);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    zzna() {
        this(zza, 0, true);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 55 - r9
            int r8 = r8 + 1
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.google.android.gms.internal.measurement.zzna.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-10)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzna.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r6 = r6 + 22
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = com.google.android.gms.internal.measurement.zzna.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzna.d(int, short, byte, java.lang.Object[]):void");
    }

    private static int zzi(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = (i >>> 2) * 5;
            i3 = 72;
        } else {
            i2 = ((i * 3) / 2) + 1;
            i3 = 10;
        }
        int iMax = Math.max(i2, i3);
        int i6 = asBinder + 23;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return iMax;
    }

    private final void zzj(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (i >= 0) {
            int i6 = i3 + 101;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            if (i < this.zzd) {
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzk(i));
    }

    private final String zzk(int i) {
        int i2;
        byte b2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = this.zzd;
            b2 = 110;
        } else {
            i2 = this.zzd;
            b2 = 13;
        }
        return zzkw.zza(i2, i, b2, "Index:", ", Size:");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (indexOf(obj) == -1) {
            return false;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2 == 0 ? 0 : 1;
        for (int i4 = 0; i4 < this.zzd; i4++) {
            int i5 = asBinder + 111;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            long j = this.zzc[i4];
            byte[] bArr = zzmp.zzb;
            i3 = (i3 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i3;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 53;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            zzcF();
            throw null;
        }
        zzcF();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        long[] jArr = this.zzc;
        if (i6 == 0) {
            System.arraycopy(jArr, i2, jArr, i, this.zzd << i2);
            this.zzd >>>= i2 / i;
            this.modCount %= 1;
        } else {
            System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
            this.zzd -= i2 - i;
            this.modCount++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        Long lValueOf;
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            long jLongValue = ((Long) obj).longValue();
            zzcF();
            zzj(i);
            long[] jArr = this.zzc;
            long j = jArr[i];
            jArr[i] = jLongValue;
            lValueOf = Long.valueOf(j);
            int i4 = 34 / 0;
        } else {
            long jLongValue2 = ((Long) obj).longValue();
            zzcF();
            zzj(i);
            long[] jArr2 = this.zzc;
            long j2 = jArr2[i];
            jArr2[i] = jLongValue2;
            lValueOf = Long.valueOf(j2);
        }
        int i5 = asBinder + 85;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return lValueOf;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final long zzc(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzj(i);
        long j = this.zzc[i];
        int i5 = TuitionPaymentFragmentbindingInflater1 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 115;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            zzj(i);
            return Long.valueOf(this.zzc[i]);
        }
        zzj(i);
        int i4 = 59 / 0;
        return Long.valueOf(this.zzc[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof Long)) {
            int i2 = asBinder + 27;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i4 = this.zzd;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = asBinder;
            int i7 = i6 + 13;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            Object obj2 = null;
            if (i7 % 2 != 0) {
                long j = this.zzc[i5];
                throw null;
            }
            if (this.zzc[i5] == jLongValue) {
                int i8 = i6 + 121;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 == 0) {
                    return i5;
                }
                obj2.hashCode();
                throw null;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            ((Long) obj).longValue();
            zzcF();
            throw null;
        }
        long jLongValue = ((Long) obj).longValue();
        zzcF();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i5 = asBinder;
        int i6 = i5 + 45;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            int i9 = i5 + 99;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 != 0) {
                System.arraycopy(jArr, i, jArr, i8, i2 >> i);
            } else {
                System.arraycopy(jArr, i, jArr, i8, i2 - i);
            }
            int i10 = asBinder + 63;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i);
            System.arraycopy(this.zzc, i, jArr2, i8, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = jLongValue;
        this.zzd++;
        this.modCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return super.addAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.zzna) r8;
        r1 = r8.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r1 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r8 = com.google.android.gms.internal.measurement.zzna.TuitionPaymentFragmentbindingInflater1 + 27;
        com.google.android.gms.internal.measurement.zzna.asBinder = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r4 = r7.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if ((Integer.MAX_VALUE - r4) < r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r4 = r4 + r1;
        r1 = r7.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r4 <= r1.length) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r5 = com.google.android.gms.internal.measurement.zzna.asBinder + 29;
        com.google.android.gms.internal.measurement.zzna.TuitionPaymentFragmentbindingInflater1 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if ((r5 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r7.zzc = java.util.Arrays.copyOf(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        r7.zzc = java.util.Arrays.copyOf(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        java.lang.System.arraycopy(r8.zzc, 0, r7.zzc, r7.zzd, r8.zzd);
        r7.zzd = r4;
        r7.modCount++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        throw new java.lang.OutOfMemoryError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((!(r8 instanceof com.google.android.gms.internal.measurement.zzna)) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r8 instanceof com.google.android.gms.internal.measurement.zzna) == false) goto L9;
     */
    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean addAll(java.util.Collection r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zzna.asBinder
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zzna.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            r7.zzcF()
            byte[] r1 = com.google.android.gms.internal.measurement.zzmp.zzb
            r8.getClass()
            boolean r1 = r8 instanceof com.google.android.gms.internal.measurement.zzna
            r4 = 1
            int r4 = r4 / r2
            r1 = r1 ^ r3
            if (r1 == r3) goto L2c
            goto L31
        L20:
            r7.zzcF()
            byte[] r1 = com.google.android.gms.internal.measurement.zzmp.zzb
            r8.getClass()
            boolean r1 = r8 instanceof com.google.android.gms.internal.measurement.zzna
            if (r1 != 0) goto L31
        L2c:
            boolean r8 = super.addAll(r8)
            return r8
        L31:
            com.google.android.gms.internal.measurement.zzna r8 = (com.google.android.gms.internal.measurement.zzna) r8
            int r1 = r8.zzd
            if (r1 != 0) goto L41
            int r8 = com.google.android.gms.internal.measurement.zzna.TuitionPaymentFragmentbindingInflater1
            int r8 = r8 + 27
            int r1 = r8 % 128
            com.google.android.gms.internal.measurement.zzna.asBinder = r1
            int r8 = r8 % r0
            return r2
        L41:
            int r4 = r7.zzd
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r5 - r4
            if (r5 < r1) goto L7c
            int r4 = r4 + r1
            long[] r1 = r7.zzc
            int r5 = r1.length
            if (r4 <= r5) goto L69
            int r5 = com.google.android.gms.internal.measurement.zzna.asBinder
            int r5 = r5 + 29
            int r6 = r5 % 128
            com.google.android.gms.internal.measurement.zzna.TuitionPaymentFragmentbindingInflater1 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L61
            long[] r0 = java.util.Arrays.copyOf(r1, r4)
            r7.zzc = r0
            goto L69
        L61:
            long[] r8 = java.util.Arrays.copyOf(r1, r4)
            r7.zzc = r8
            r8 = 0
            throw r8
        L69:
            long[] r0 = r8.zzc
            long[] r1 = r7.zzc
            int r5 = r7.zzd
            int r8 = r8.zzd
            java.lang.System.arraycopy(r0, r2, r1, r5, r8)
            r7.zzd = r4
            int r8 = r7.modCount
            int r8 = r8 + r3
            r7.modCount = r8
            return r3
        L7c:
            java.lang.OutOfMemoryError r8 = new java.lang.OutOfMemoryError
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzna.addAll(java.util.Collection):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 79;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof zzna)) {
            return super.equals(obj);
        }
        zzna zznaVar = (zzna) obj;
        if (this.zzd != zznaVar.zzd) {
            return false;
        }
        long[] jArr = zznaVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != jArr[i7]) {
                int i8 = asBinder + 3;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzcF();
        zzj(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        int i5 = this.zzd;
        if (i < i5 - 1) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 103;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                System.arraycopy(jArr, i / 0, jArr, i, (i5 >>> i) - 1);
            } else {
                System.arraycopy(jArr, i + 1, jArr, i, (i5 - i) - 1);
            }
            int i7 = TuitionPaymentFragmentbindingInflater1 + 27;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        this.zzd--;
        this.modCount++;
        Long lValueOf = Long.valueOf(j);
        int i9 = TuitionPaymentFragmentbindingInflater1 + 87;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return lValueOf;
    }

    /* JADX WARN: Type inference failed for: r5v51, types: [boolean, int] */
    @Override // com.google.android.gms.internal.measurement.zzmn
    /* JADX INFO: renamed from: zzd */
    public final zzmn zzg(int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (Color.blue(0) + 31533);
            int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i5, iKeyCodeFromString, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{24, '\f', 0, 17, 3, 23, 1, 17, 3, '\r', 15, 1, 5, '\t', 14, 0, '\r', '\f', 18, 3, 6, 7}, (byte) (50 - TextUtils.getCapsMode("", 0, 0)), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{3, 14, 23, 22, '\t', 3, 3, 2, 2, 24, 14, 11, 17, '\r', 13825}, (byte) (2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (31533 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
            int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b3 = $$a[7];
            Object[] objArr6 = new Object[1];
            a(b3, (byte) 52, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, i6, scrollDefaultDelay, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                int size = 28 - View.MeasureSpec.getSize(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b4, (byte) (b4 | 36), bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, iLastIndexOf, size, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyUid = Process.myUid();
            int i7 = ((2106421723 + (((~((-1324429972) | iMyUid)) | 180424704) * 576)) + (((~((~iMyUid) | (-1144005268))) | 269224968) * 576)) - 283320878;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{24, '\f', 0, 17, 3, 23, 1, 17, 23, 22, 1, 21, 0, '\n', '\r', 15, 15, 19, 14, 5, 23, 4, 19, 0, 2, 7}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 40), 25 - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{7, 15, 13855, 13855, '\t', 19, 15, 0, 13857, 13857, 18, 23, 7, 20, '\r', 15, 24, '\r'}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 55), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -1128735278};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (bArr3[58] - 1);
                byte b6 = bArr3[28];
                Object[] objArr12 = new Object[1];
                d(b5, b6, (byte) (b6 + 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr3[58];
                Object[] objArr13 = new Object[1];
                d(b7, (byte) (-bArr3[31]), b7, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[7];
                    Object[] objArr14 = new Object[1];
                    a(b8, (byte) (b8 | 36), bArr4[80], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, absoluteGravity, i10, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{24, '\f', 0, 17, 3, 23, 1, 17, 3, '\r', 15, 1, 5, '\t', 14, 0, '\r', '\f', 18, 3, 6, 7}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 50), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{3, 14, 23, 22, '\t', 3, 3, 2, 2, 24, 14, 11, 17, '\r', 13825}, (byte) (2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                        int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0);
                        byte b9 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        a(b9, (byte) 52, b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, threadPriority, iLastIndexOf2, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                        int iLastIndexOf3 = 27 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        a(b10, b10, bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iResolveSizeAndState, iLastIndexOf3, -1048449946, false, (String) objArr18[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i13 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(118619193);
            int i14 = ~iNextInt;
            int i15 = i13 + (-21847353) + (((~((-896870474) | i14)) | (-877209171) | (~(896870473 | iNextInt))) * (-564)) + ((~(iNextInt | (-525843))) * 1128) + (((~((-877209171) | i14)) | (-897396316)) * 564);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[0])[0] = i17 ^ (i17 << 5);
        } else {
            int i18 = asBinder + 107;
            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = ~iIdentityHashCode;
            int i22 = i20 + (-843772541) + (((~(1241730403 | i21)) | 364380184) * 184) + ((iIdentityHashCode | 1073761347) * (-184)) + ((~((-532349241) | i21)) * 184);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
        }
        if (i >= this.zzd) {
            long[] jArrCopyOf = i == 0 ? zza : Arrays.copyOf(this.zzc, i);
            int i25 = this.zzd;
            int i26 = ((int[]) objArr2[0])[0];
            int i27 = ((((i26 * i26) - (~(-(20202449 * i26)))) - 1) - (~(-(i26 * (-835932827))))) - 1;
            int i28 = (i27 & (-940462631)) + ((-940462631) | i27);
            int i29 = ((i28 >> 18) - 32767) / 16384;
            int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
            int i31 = (i28 & i30) + (i30 | i28);
            int i32 = i28 >> 28;
            int i33 = ((i32 & (-31)) + (i32 | (-31))) / 16;
            int i34 = (-(i31 ^ ((i33 ^ 1) + ((i33 & 1) << 1)))) + 1;
            int i35 = i34 >> 16;
            return new zzna(jArrCopyOf, i25, 1720 / ((i34 & (-((((i35 ^ (-131071)) + ((i35 & (-131071)) << 1)) / 65536) + 2))) * 1720));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmo zzg(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzmn zzmnVarZzg = zzg(i);
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 7;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return zzmnVarZzg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zzna(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    final void zzh(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 113;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            int length = this.zzc.length;
            throw null;
        }
        int length2 = this.zzc.length;
        if (i <= length2) {
            int i5 = i4 + 21;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (length2 != 0) {
            while (length2 < i) {
                length2 = zzi(length2);
            }
            this.zzc = Arrays.copyOf(this.zzc, length2);
            return;
        }
        this.zzc = new long[Math.max(i, 10)];
    }

    public final void zzf(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzcF();
        int i4 = this.zzd;
        int length = this.zzc.length;
        if (i4 == length) {
            int i5 = asBinder + 27;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        jArr2[i7] = j;
        int i8 = asBinder + 53;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzf(((Long) obj).longValue());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        char c = '0';
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf("", c, 0)), Drawable.resolveOpacity(0, 0) + 2267, 33 - KeyEvent.normalizeMetaState(0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), 2267 - Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        char c2 = 7;
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[c2] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Color.blue(0)), 3260 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - View.getDefaultSize(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 594, TextUtils.getCapsMode("", 0, 0) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i6 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i6];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i7 = $10 + 111;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i9 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i9];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        } else {
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c2 = 7;
            }
        }
        int i13 = 0;
        while (i13 < i) {
            int i14 = $11 + 7;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr4[i13] = (char) (cArr4[i13] ^ 14311);
                i13 += 57;
            } else {
                cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                i13++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static zzna zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return zzb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzd;
        if (i3 != 0) {
            int i5 = 16 / 0;
        }
        return i4;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{60072, 60073, 60063, 60051, 60062, 60056, 60048, 60075, 60040, 60034, 60047, 60088, 60054, 60055, 60053, 60041, 60117, 60046, 60050, 60045, 60090, 60043, 60058, 60052, 60079};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = 116 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = com.google.android.gms.internal.measurement.zzna.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzna.$$g(int, byte, int):java.lang.String");
    }
}
