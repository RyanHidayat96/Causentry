package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbw extends zzcbn {
    private final transient byte[][] zzb;
    private final transient int[] zzc;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {41, 2, 45, -60, -21, -7, 54, -61, -23, -3, -18, -10, 0, -19, 62, -75, -11, 4, -23, 5, -18, -15, 10, -28, 2, -15, -8, 55, -72, -1, -17, 2, -12, -22, -10, 2, -10, -16, 57, -60, -11, -9, -21, -15, -2, -15, 10, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -73, 0, -27, 13, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -41, -32, -27, 30, -33, -16, -8, 0, 6, -24, -22, 0, -6, -12, -3, -7, -28, 2, -15, -8, 19, -28, -23, 5, -24, 42, -43, -26, 2, -22, 4, -20, -14, 76, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 56};
    private static final int $$e = 21;
    private static final byte[] $$a = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 63;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47210, 47261, 47207, 47257, 47260, 47202, 47197, 47256, 47224, 47250, 47255, 47206, 47262, 47176, 47263, 47208, 47200, 47259, 47225, 47178, 47253, 47223, 47203, 47254, 47201, 47204, 47171};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719435;
    private static boolean b = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcbw(byte[][] bArr, int[] iArr) {
        super(zzcbn.zza.zza());
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.zzb = bArr;
        this.zzc = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r8 = r8 * 4
            int r8 = r8 + 84
            byte[] r1 = com.google.android.libraries.places.internal.zzcbw.$$a
            int r7 = r7 * 52
            int r7 = 108 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbw.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 87
            int r8 = r8 + 53
            int r7 = r7 * 139
            int r7 = 143 - r7
            byte[] r0 = com.google.android.libraries.places.internal.zzcbw.$$d
            int r9 = r9 * 15
            int r9 = 99 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-9)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbw.d(byte, short, short, java.lang.Object[]):void");
    }

    private final zzcbn zzs() {
        int i = 2 % 2;
        zzcbn zzcbnVar = new zzcbn(zzk());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        g = i2 % 128;
        int i3 = i2 % 2;
        return zzcbnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = g + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj == this) {
            int i4 = i3 + 31;
            g = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof zzcbn) {
            zzcbn zzcbnVar = (zzcbn) obj;
            return zzcbnVar.zzj() == zzj() && zzn(0, zzcbnVar, 0, zzj());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        g = i2 % 128;
        int i3 = i2 % 2;
        String string = zzs().toString();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final String zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        g = i2 % 128;
        int i3 = i2 % 2;
        String strZzg = zzs().zzg();
        int i4 = g + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return strZzg;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final zzcbn zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzcbn zzcbnVarZzh = zzs().zzh();
        int i4 = g + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzcbnVarZzh;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final int zzj() {
        int i = 2 % 2;
        int i2 = g + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzc[this.zzb.length - 1];
        int i6 = i3 + 35;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return i5;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte[] zzl() {
        int i = 2 % 2;
        int i2 = g + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrZzk = zzk();
        int i4 = g + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return bArrZzk;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte zzi(int i) {
        int i2;
        int i3 = 2 % 2;
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int[] iArr = this.zzc;
        zzcbf.zza(iArr[length - 1], i, 1L);
        int iZza = zzccf.zza(this, i);
        if (iZza == 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            g = i4 % 128;
            int i5 = i4 % 2;
            i2 = 0;
        } else {
            i2 = iArr[iZza - 1];
        }
        byte b2 = bArr[iZza][(i - i2) + iArr[length + iZza]];
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        g = i6 % 128;
        int i7 = i6 % 2;
        return b2;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            throw null;
        }
        int iZzb = zzb();
        if (iZzb != 0) {
            return iZzb;
        }
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.zzc;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = i6;
            while (i8 < (i7 - i5) + i6) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                g = i9 % 128;
                if (i9 % 2 == 0) {
                    i4 = (i4 - 28) >> bArr2[i8];
                    i8 += 25;
                } else {
                    i4 = (i4 * 31) + bArr2[i8];
                    i8++;
                }
            }
            i3++;
            i5 = i7;
        }
        zzc(i4);
        return i4;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte[] zzk() {
        int i = 2 % 2;
        int i2 = g + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[zzj()];
        byte[][] bArr2 = this.zzb;
        int length = bArr2.length;
        int i4 = g + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.zzc;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            int i11 = i10 - i7;
            ArraysKt.copyInto(bArr2[i6], bArr, i8, i9, i9 + i11);
            i8 += i11;
            i6++;
            i7 = i10;
        }
        int i12 = g + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
        if (i12 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final boolean zzn(int i, zzcbn zzcbnVar, int i2, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(zzcbnVar, "");
        if (zzj() - i3 < 0) {
            return false;
        }
        int iZza = zzccf.zza(this, 0);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i5 >= i3) {
                return true;
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            int i9 = i8 % 128;
            g = i9;
            if (i8 % 2 == 0) {
                throw null;
            }
            if (iZza == 0) {
                int i10 = i9 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                if (i10 % 2 != 0) {
                    iZza = 1;
                } else {
                    iZza = 0;
                    i7 = 0;
                }
            } else {
                i7 = this.zzc[iZza - 1];
                int i11 = i9 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 5 / 3;
                }
            }
            int[] iArr = this.zzc;
            int i13 = iArr[iZza];
            byte[][] bArr = this.zzb;
            int i14 = iArr[bArr.length + iZza];
            int iMin = Math.min(i3, (i13 - i7) + i7) - i5;
            if (!zzcbnVar.zzo(i6, bArr[iZza], i14 + (i5 - i7), iMin)) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                g = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            i6 += iMin;
            i5 += iMin;
            iZza++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final void zzm(zzcbj zzcbjVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        int iZza = zzccf.zza(this, 0);
        int i6 = 0;
        while (i6 < i2) {
            if (iZza == 0) {
                int i7 = g + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 != 0) {
                    i3 = 1;
                    iZza = 0;
                } else {
                    iZza = 0;
                    i3 = 0;
                }
            } else {
                i3 = this.zzc[iZza - 1];
            }
            int[] iArr = this.zzc;
            int i8 = iArr[iZza];
            byte[][] bArr = this.zzb;
            int i9 = iArr[bArr.length + iZza];
            int iMin = Math.min(i2, (i8 - i3) + i3) - i6;
            int i10 = i9 + (i6 - i3);
            zzcbu zzcbuVar = new zzcbu(bArr[iZza], i10, i10 + iMin, true, false);
            zzcbu zzcbuVar2 = zzcbjVar.zza;
            if (zzcbuVar2 == null) {
                zzcbuVar.zzg = zzcbuVar;
                zzcbuVar.zzf = zzcbuVar.zzg;
                zzcbjVar.zza = zzcbuVar.zzf;
                i4 = g + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            } else {
                Intrinsics.checkNotNull(zzcbuVar2);
                zzcbu zzcbuVar3 = zzcbuVar2.zzg;
                Intrinsics.checkNotNull(zzcbuVar3);
                zzcbuVar3.zzc(zzcbuVar);
                i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                g = i4 % 128;
            }
            int i11 = i4 % 2;
            i6 += iMin;
            iZza++;
        }
        zzcbjVar.zzd(zzcbjVar.zzb() + ((long) i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r11 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r11 <= (r10.length - r12)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r12 = r12 + r9;
        r2 = com.google.android.libraries.places.internal.zzccf.zza(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r9 >= r12) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r3 = com.google.android.libraries.places.internal.zzcbw.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r4 = r3 + 123;
        com.google.android.libraries.places.internal.zzcbw.g = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((r4 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r2 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r3 + 13;
        com.google.android.libraries.places.internal.zzcbw.g = r3 % 128;
        r3 = r3 % 2;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r3 = r8.zzc[r2 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r4 = r8.zzc;
        r5 = r4[r2];
        r6 = r8.zzb;
        r4 = r4[r6.length + r2];
        r5 = java.lang.Math.min(r12, (r5 - r3) + r3) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (com.google.android.libraries.places.internal.zzcbf.zzb(r6[r2], r4 + (r9 - r3), r10, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r11 = r11 + r5;
        r9 = r9 + r5;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r9 = null;
        r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r11 >= 0) goto L12;
     */
    @Override // com.google.android.libraries.places.internal.zzcbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzo(int r9, byte[] r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzcbw.g
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzcbw.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            r1 = 0
            if (r9 < 0) goto L83
            int r2 = r8.zzj()
            int r2 = r2 - r12
            if (r9 > r2) goto L83
            int r2 = com.google.android.libraries.places.internal.zzcbw.g
            int r2 = r2 + 83
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzcbw.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L2c
            r2 = 64
            int r2 = r2 / r1
            if (r11 < 0) goto L83
            goto L2e
        L2c:
            if (r11 < 0) goto L83
        L2e:
            int r2 = r10.length
            int r2 = r2 - r12
            if (r11 <= r2) goto L33
            return r1
        L33:
            int r12 = r12 + r9
            int r2 = com.google.android.libraries.places.internal.zzccf.zza(r8, r9)
        L38:
            if (r9 >= r12) goto L81
            int r3 = com.google.android.libraries.places.internal.zzcbw.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r4 = r3 + 123
            int r5 = r4 % 128
            com.google.android.libraries.places.internal.zzcbw.g = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L7c
            if (r2 != 0) goto L51
            int r3 = r3 + 13
            int r2 = r3 % 128
            com.google.android.libraries.places.internal.zzcbw.g = r2
            int r3 = r3 % r0
            r2 = r1
            r3 = r2
            goto L57
        L51:
            int[] r3 = r8.zzc
            int r4 = r2 + (-1)
            r3 = r3[r4]
        L57:
            int[] r4 = r8.zzc
            r5 = r4[r2]
            byte[][] r6 = r8.zzb
            r7 = r6
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r7 = r7.length
            int r7 = r7 + r2
            r4 = r4[r7]
            int r5 = r5 - r3
            int r5 = r5 + r3
            int r5 = java.lang.Math.min(r12, r5)
            int r5 = r5 - r9
            r6 = r6[r2]
            int r3 = r9 - r3
            int r4 = r4 + r3
            boolean r3 = com.google.android.libraries.places.internal.zzcbf.zzb(r6, r4, r10, r11, r5)
            if (r3 != 0) goto L77
            return r1
        L77:
            int r11 = r11 + r5
            int r9 = r9 + r5
            int r2 = r2 + 1
            goto L38
        L7c:
            r9 = 0
            r9.hashCode()
            throw r9
        L81:
            r9 = 1
            return r9
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbw.zzo(int, byte[], int, int):boolean");
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 3;
        int i5 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + i4;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cArgb = (char) (Color.argb(i5, i5, i5, i5) + 31339);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2994;
                            int iLastIndexOf = 16 - TextUtils.lastIndexOf("", '0', i5);
                            byte b2 = $$c[i4];
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, windowTouchSlop, iLastIndexOf, 1182129903, false, $$g((byte) (b2 - 1), (byte) (-b2), b2), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char size = (char) (31339 - View.MeasureSpec.getSize(0));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2994;
                        int iIndexOf = 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b3 = $$c[3];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iCombineMeasuredStates, iIndexOf, 1182129903, false, $$g((byte) (b3 - 1), (byte) (-b3), b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                i4 = 3;
                i5 = 0;
            }
            int i8 = $11 + 59;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr4;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43325), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 253, (ViewConfiguration.getTouchSlop() >> 8) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
            if (TuitionPaymentFragmentbindingInflater1) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $11 + 29;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 33602);
                        int i13 = 3086 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                        byte b4 = $$c[3];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = (byte) (-b4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, i13, iNormalizeMetaState, -2146875848, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                int i14 = $11 + 91;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                return;
            }
            if (b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter = (char) (33602 - TextUtils.getOffsetAfter("", 0));
                        int iGreen = 3085 - Color.green(0);
                        int iBlue = Color.blue(0) + 26;
                        byte b7 = $$c[3];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = (byte) (-b7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iGreen, iBlue, -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i16 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01e0  */
    public final byte[][] zzq() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
            int size = View.MeasureSpec.getSize(0) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[40], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, packedPositionGroup, size, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - TextUtils.getOffsetAfter("", 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - ExpandableListView.getPackedPositionType(0L), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
            int iMyPid = 33 - (Process.myPid() >> 22);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, longPressTimeout, iMyPid, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (Process.getGidForName("") + 1);
                int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, iMakeMeasureSpec, edgeSlop, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-1256452869) + (((~(176993764 | i4)) | 623067675) * 184) + ((iIdentityHashCode | 168341888) * (-184)) + ((~((-631719552) | i4)) * 184) + 1636606071;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, View.combineMeasuredStates(0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, 126 - MotionEvent.axisFromString(""), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = g + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                        g = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                    g = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            g = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1636606071};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[130];
                Object[] objArr13 = new Object[1];
                d(b6, b6, bArr4[12], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[12];
                Object[] objArr14 = new Object[1];
                d(b7, b7, bArr4[130], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int edgeSlop2 = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int i16 = 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[5];
                        byte b9 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b8, b9, b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, edgeSlop2, i16, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, TextUtils.getOffsetBefore("", 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                            int absoluteGravity = 33 - Gravity.getAbsoluteGravity(0, 0);
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            Object[] objArr18 = new Object[1];
                            a(b10, bArr6[5], b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iKeyCodeFromString, absoluteGravity, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 33;
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            a(b11, bArr7[40], b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, threadPriority, iKeyCodeFromString2, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            g = i19 % 128;
            int i20 = i19 % 2;
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i21 + (((~(i24 | 577664153)) | (~((-231049163) | i24)) | 226591554) * (-397)) + 878981638 + ((iIdentityHashCode2 | 799798099) * 397);
            int i26 = i25 ^ (i25 << 13);
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[2])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i28 = 0;
                while (i28 < strArr3.length) {
                    int i29 = g + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                    if (i29 % 2 != 0) {
                        arrayList.add(strArr3[i28]);
                        i28 += 7;
                    } else {
                        arrayList.add(strArr3[i28]);
                        i28++;
                    }
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode3;
            int i34 = i30 + 596375563 + (((~((-803072016) | i33)) | 5505028 | (~((-5641301) | i33))) * (-1136)) + (((~((-803072016) | iIdentityHashCode3)) | (~((-5641301) | iIdentityHashCode3)) | (~(803208287 | i33))) * (-568)) + (((~(iIdentityHashCode3 | (-5505029))) | (~(i33 | 5641300)) | (~(803072015 | i33))) * 568);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[2])[0] = i36 ^ (i36 << 5);
        }
        return this.zzb;
    }

    public final int[] zzr() {
        int[] iArr;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            iArr = this.zzc;
            int i4 = 16 / 0;
        } else {
            iArr = this.zzc;
        }
        int i5 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    private static String $$g(byte b2, int i, short s) {
        int i2 = s + 67;
        int i3 = b2 * 3;
        byte[] bArr = $$c;
        int i4 = i + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i4 + (-i2);
            i4 = i4;
        }
        while (true) {
            int i7 = i4 + 1;
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i7];
            i4 = i7;
        }
    }
}
