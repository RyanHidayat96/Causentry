package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcn {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final zzbcn zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;
    private static final byte[] $$d = {92, 126, -38, -95, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -26, 8};
    private static final int $$e = 99;
    private static final byte[] $$a = {88, 99, -94, -58, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 237;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = 0;

    private zzbcn() {
        this(0, new int[8], new Object[8], true);
    }

    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3 = i2 + 4;
        byte[] bArr = $$a;
        int i4 = s * 15;
        int i5 = 84 - (i * 3);
        byte[] bArr2 = new byte[i4 + 38];
        int i6 = i4 + 37;
        int i7 = -1;
        if (bArr == null) {
            int i8 = (i3 + i6) - 11;
            i3 = i3;
            i5 = i8;
        }
        while (true) {
            int i9 = i3 + 1;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i9;
            i5 = (i5 + bArr[i9]) - 11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 98
            int r6 = r6 * 53
            int r0 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = com.google.android.libraries.places.internal.zzbcn.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcn.d(byte, short, short, java.lang.Object[]):void");
    }

    final void zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i5 = i3 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        int i3 = 0;
        int iHashCode = 17;
        int i4 = 0;
        int i5 = 17;
        while (i4 < i2) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                i5 = (i5 + 20) << iArr[i4];
                i4 += 95;
            } else {
                i5 = (i5 * 31) + iArr[i4];
                i4++;
            }
        }
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        while (i3 < i7) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                iHashCode = (iHashCode / 8) * objArr[i3].hashCode();
                i3 += 120;
            } else {
                iHashCode = (iHashCode * 31) + objArr[i3].hashCode();
                i3++;
            }
        }
        int i9 = ((((i2 + 527) * 31) + i5) * 31) + iHashCode;
        int i10 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    final void zzf(zzbcz zzbczVar) throws IOException {
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < this.zzb) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            zzbczVar.zzv(this.zzc[i2] >>> 3, this.zzd[i2]);
            i2++;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    final void zzj(StringBuilder sb, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < this.zzb) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                zzbbn.zzb(sb, i, String.valueOf(this.zzc[i5] / 4), this.zzd[i5]);
                i5 += 118;
            } else {
                zzbbn.zzb(sb, i, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
                i5++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[PHI: r2
  0x002b: PHI (r2v5 int) = (r2v4 int), (r2v8 int) binds: [B:12:0x0029, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzm(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        int i5 = i4 % 128;
        TuitionPaymentFragmentbindingInflater1 = i5;
        if (i4 % 2 == 0) {
            int length = this.zzc.length;
            throw null;
        }
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i6 = i5 + 25;
            int i7 = i6 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
            if (i6 % 2 != 0) {
                int i8 = this.zzb;
                i2 = i8 * (i8 / 3);
                if (i2 >= i) {
                    i = i2;
                }
            } else {
                int i9 = this.zzb;
                i2 = i9 + (i9 / 2);
                if (i2 >= i) {
                    i = i2;
                }
            }
            if (i < 8) {
                int i10 = i7 + 75;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                i = i10 % 2 == 0 ? 42 : 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbcn)) {
            return false;
        }
        zzbcn zzbcnVar = (zzbcn) obj;
        int i3 = this.zzb;
        if (i3 == zzbcnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzbcnVar.zzc;
            for (int i4 = 0; i4 < i3; i4++) {
                if (iArr[i4] == iArr2[i4]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzbcnVar.zzd;
            int i5 = this.zzb;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                if (objArr[i6].equals(objArr2[i6])) {
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    i6 = i9 % 2 != 0 ? i6 + 77 : i6 + 1;
                }
            }
            return true;
        }
        return false;
    }

    final void zzk(int i, Object obj) {
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            zze();
            zzm(this.zzb >>> 1);
            int[] iArr = this.zzc;
            i2 = this.zzb;
            iArr[i2] = i;
            this.zzd[i2] = obj;
        } else {
            zze();
            zzm(this.zzb + 1);
            int[] iArr2 = this.zzc;
            int i5 = this.zzb;
            iArr2[i5] = i;
            this.zzd[i5] = obj;
            i2 = i5 + 1;
        }
        this.zzb = i2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    static zzbcn zzc(zzbcn zzbcnVar, zzbcn zzbcnVar2) {
        int i = 2 % 2;
        int i2 = zzbcnVar.zzb + zzbcnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzbcnVar.zzc, i2);
        System.arraycopy(zzbcnVar2.zzc, 0, iArrCopyOf, zzbcnVar.zzb, zzbcnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzbcnVar.zzd, i2);
        System.arraycopy(zzbcnVar2.zzd, 0, objArrCopyOf, zzbcnVar.zzb, zzbcnVar2.zzb);
        zzbcn zzbcnVar3 = new zzbcn(i2, iArrCopyOf, objArrCopyOf, true);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zzbcnVar3;
    }

    public final void zzg(zzbcz zzbczVar) throws IOException {
        int i = 2 % 2;
        if (this.zzb != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 89;
                int i6 = i5 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6;
                int i7 = i5 % 2;
                int i8 = this.zzc[i4];
                Object obj = this.zzd[i4];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 != 0) {
                    int i11 = i6 + 33;
                    TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                    if (i11 % 2 != 0 ? i9 == 1 : i9 == 0) {
                        zzbczVar.zzj(i10, ((Long) obj).longValue());
                    } else if (i9 == 2) {
                        zzbczVar.zzn(i10, (zzayz) obj);
                    } else if (i9 != 3) {
                        int i12 = i6 + 33;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        if (i9 != 5) {
                            throw new RuntimeException(new zzbaq("Protocol message tag had invalid wire type."));
                        }
                        int i14 = i6 + 49;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        int i15 = i14 % 2;
                        zzbczVar.zzk(i10, ((Integer) obj).intValue());
                    } else {
                        zzbczVar.zzt(i10);
                        ((zzbcn) obj).zzg(zzbczVar);
                        zzbczVar.zzu(i10);
                    }
                } else {
                    zzbczVar.zzc(i10, ((Long) obj).longValue());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r4 >= r8.zzb) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r2 = com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentbindingInflater1 = r2 % 128;
        r2 = r2 % 2;
        r2 = r8.zzc[r4];
        r3 = (com.google.android.libraries.places.internal.zzayz) r8.zzd[r4];
        r5 = com.google.android.libraries.places.internal.zzazi.zzz(8);
        r6 = com.google.android.libraries.places.internal.zzazi.zzz(16);
        r2 = com.google.android.libraries.places.internal.zzazi.zzz(r2 >>> 3);
        r7 = com.google.android.libraries.places.internal.zzazi.zzz(24);
        r3 = r3.zzc();
        r1 = r1 + (((r5 + r5) + (r6 + r2)) + (r7 + (com.google.android.libraries.places.internal.zzazi.zzz(r3) + r3)));
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r8.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r2 = r2 + 57;
        com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentbindingInflater1 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzh() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            r3 = -1
            r4 = 0
            if (r1 == 0) goto L18
            int r1 = r8.zze
            r5 = 40
            int r5 = r5 / r4
            if (r1 != r3) goto L61
            goto L1c
        L18:
            int r1 = r8.zze
            if (r1 != r3) goto L61
        L1c:
            r1 = r4
        L1d:
            int r2 = r8.zzb
            if (r4 >= r2) goto L5e
            int r2 = com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r2 + 91
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            int[] r2 = r8.zzc
            r2 = r2[r4]
            java.lang.Object[] r3 = r8.zzd
            r3 = r3[r4]
            com.google.android.libraries.places.internal.zzayz r3 = (com.google.android.libraries.places.internal.zzayz) r3
            r5 = 8
            int r5 = com.google.android.libraries.places.internal.zzazi.zzz(r5)
            r6 = 16
            int r6 = com.google.android.libraries.places.internal.zzazi.zzz(r6)
            int r2 = r2 >>> 3
            int r2 = com.google.android.libraries.places.internal.zzazi.zzz(r2)
            r7 = 24
            int r7 = com.google.android.libraries.places.internal.zzazi.zzz(r7)
            int r3 = r3.zzc()
            int r5 = r5 + r5
            int r6 = r6 + r2
            int r5 = r5 + r6
            int r2 = com.google.android.libraries.places.internal.zzazi.zzz(r3)
            int r2 = r2 + r3
            int r7 = r7 + r2
            int r5 = r5 + r7
            int r1 = r1 + r5
            int r4 = r4 + 1
            goto L1d
        L5e:
            r8.zze = r1
            return r1
        L61:
            int r2 = r2 + 57
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzbcn.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcn.zzh():int");
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i = 2 % 2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    iZzz2 = zzazi.zzz(i6 << 3) + 8;
                } else if (i7 != 2) {
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 29;
                    int i9 = i8 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9;
                    if (i8 % 2 == 0 ? i7 == 3 : i7 == 5) {
                        int iZzz3 = zzazi.zzz(i6 << 3);
                        iZzz = iZzz3 + iZzz3;
                        iZzA = ((zzbcn) this.zzd[i4]).zzi();
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException(new zzbaq("Protocol message tag had invalid wire type."));
                        }
                        int i10 = i9 + 39;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        int i11 = i10 % 2;
                        iZzz2 = zzazi.zzz(i6 << 3) + 4;
                    }
                } else {
                    zzayz zzayzVar = (zzayz) this.zzd[i4];
                    int iZzz4 = zzazi.zzz(i6 << 3);
                    int iZzc = zzayzVar.zzc();
                    iZzz2 = iZzz4 + zzazi.zzz(iZzc) + iZzc;
                }
                i3 += iZzz2;
            } else {
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzz = zzazi.zzz(i6 << 3);
                iZzA = zzazi.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i3 += iZzz2;
        }
        this.zze = i3;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a8  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 25;
        while (true) {
            $11 = i3 % 128;
            int i4 = i3 % 2;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19472), 2625 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 481 - View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $10 + 97;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 9;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39422), 481 - View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionType(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39421), 481 - KeyEvent.normalizeMetaState(0), 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0218  */
    /* JADX WARN: Code duplicated, block: B:27:0x0222  */
    final zzbcn zzl(zzbcn zzbcnVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
            int iResolveSize = 10 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iKeyCodeFromString, iResolveSize, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{54891, 33163, 31152, 53685, 35289, 25032, 55796, 45485, 26909, 49438, 47474, 4380, 51527, 41306, 6508, 61806, 43159, 150, 63656, 20696, 2245, 57594}, 22511 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{54895, 37335, 22793, 361, 51389, 45082, 30792, 9103, 60391, 21330, 6796, 49893, 35375, 30106, 15809}, (Process.myTid() >> 22) + 18353, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, (byte) (b3 | 36), bArr2[28], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, offsetBefore, iLastIndexOf, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[7], bArr3[0], bArr3[28], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, fadingEdgeLength, i6, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((((~(14678099 | i7)) | (~((-54988329) | iIdentityHashCode))) | (~(i7 | 54988328))) * 959) - 984610373) + (((~(iIdentityHashCode | 54988328)) | (~(i7 | (-54988329))) | (~(14678099 | iIdentityHashCode))) * 959) + 839098544;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{54891, 3655, 26152, 24081, 46825, 61132, 50876, 16081, 6003, 20289, 42788, 40869, 63471, 12206, 1940, 31854, 21580, 35888, 58376, 56554, 13538, 27837, 17786, 48458, 38179, 52485}, 55332 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{54889, 46890, 5330, 62855, 21307, 12493, 37248, 32536, 56530, 48519, 6964, 63684, 22933, 10042, 34008, 26008, 49973, 41153}, 24916 - ImageFormat.getBitsPerPixel(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 19 / 0;
                    if (!(!(applicationContext instanceof ContextWrapper))) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{54880, 34282, 29054, 11496, 38944, 30691, 9069, 40675, 19045, 14765, 38227, 16632, 15477, 60403, 18273, 13032}, 21376 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{54883, 28825, 39809, 8833, 19874, 38064, 16308, 18098, 57850, 2244, 21471, 64255, 1501, 44270, 63468, 7702}, ((Process.getThreadPriority(0) + 20) >> 6) + 42743, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 839098544};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[50];
                byte b5 = (byte) (-b4);
                Object[] objArr13 = new Object[1];
                d(b5, b5, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = (byte) (bArr4[50] + 1);
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                d(b6, b7, (byte) (b7 | 52), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                        int size = 10 - View.MeasureSpec.getSize(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr5[7], bArr5[0], bArr5[28], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, iResolveOpacity, size, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{54891, 33163, 31152, 53685, 35289, 25032, 55796, 45485, 26909, 49438, 47474, 4380, 51527, 41306, 6508, 61806, 43159, 150, 63656, 20696, 2245, 57594}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22511, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{54895, 37335, 22793, 361, 51389, 45082, 30792, 9103, 60391, 21330, 6796, 49893, 35375, 30106, 15809}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18352, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
                            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            a(b8, (byte) (b8 | 36), bArr6[28], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, offsetBefore2, windowTouchSlop, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iArgb = 10 - Color.argb(0, 0, 0, 0);
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b9, bArr7[5], b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, scrollBarFadeDuration, iArgb, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            throw new RuntimeException(String.valueOf(i16));
        }
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i18 = ~((~new Random().nextInt(49796362)) | (-642357927));
        int i19 = i17 + (((-788118272) | i18) * (-970)) + 416151194 + ((i18 | 145760345) * 970);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
        int i22 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
        int i23 = i22 % 2;
        if (zzbcnVar.equals(zza)) {
            return this;
        }
        zze();
        int i24 = this.zzb + zzbcnVar.zzb;
        zzm(i24);
        int[] iArr = zzbcnVar.zzc;
        int i25 = ((int[]) objArr21[1])[0];
        int i26 = i25 * i25;
        int i27 = -(1578148429 * i25);
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        int i29 = -(i25 * 478431571);
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        int i31 = (i30 & 1920452864) + (1920452864 | i30);
        int i32 = i31 >> 26;
        int i33 = (((i32 | ComposerKt.defaultsKey) << 1) - (i32 ^ ComposerKt.defaultsKey)) / 64;
        int i34 = (i31 - (~(((i33 | 1) << 1) - (i33 ^ 1)))) - 1;
        int i35 = i31 >> 27;
        int i36 = ((i35 & (-63)) + (i35 | (-63))) / 32;
        int i37 = -(i34 ^ (((i36 | 1) << 1) - (i36 ^ 1)));
        int i38 = (i37 ^ 4) + ((i37 & 4) << 1);
        int i39 = (((i38 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
        System.arraycopy(iArr, 0 / (((-(((i39 | 1) << 1) - (i39 ^ 1))) & i38) * 83), this.zzc, this.zzb, zzbcnVar.zzb);
        System.arraycopy(zzbcnVar.zzd, 0, this.zzd, this.zzb, zzbcnVar.zzb);
        this.zzb = i24;
        return this;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzbcn(0, new int[0], new Object[0], false);
        int i = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    private zzbcn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzbcn zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zza;
        }
        throw null;
    }

    static zzbcn zzb() {
        int i = 2 % 2;
        zzbcn zzbcnVar = new zzbcn(0, new int[8], new Object[8], true);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzbcnVar;
        }
        throw null;
    }

    public final void zzd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.zzf) {
            return;
        }
        int i4 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        this.zzf = false;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -3908749779737018607L;
    }
}
