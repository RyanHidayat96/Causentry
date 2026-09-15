package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.RandomAccess;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class zzayr extends zzayp implements RandomAccess, zzbag, zzbbu {
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, -19, -5, 56, -64, -15, -7, 1, -12, 0, 48, -58, -20, 3, -21, -4, -1, -2, 47, -70, 5, -26, 8, -20, 2, 1, -18, 55, -61, -4, -26, 8, -18, 0, -1, -15, -1, -20, Base64.padSymbol, -38, -27, -26, 8, -20, 2, 1, -18, 34, -37, -18, 0, -16, 3, -4, -24, 71, -27, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 58};
    private static final int $$e = 217;
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 229;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f787a = 1;
    private static int g = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzayr(zArr, 0, false);
        int i = g + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    zzayr() {
        this(zza, 0, true);
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = s2 * 52;
        int i3 = 103 - i;
        byte[] bArr = $$a;
        int i4 = 56 - (s * 52);
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (i3 + (-i4)) - 11;
            i4++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            int i9 = i4 + 1;
            i6 = i7;
            i3 = (i8 + (-bArr[i4])) - 11;
            i4 = i9;
        }
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
    private static void e(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 53
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzayr.$$d
            int r8 = r8 * 56
            int r8 = 60 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-7)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzayr.e(byte, int, byte, java.lang.Object[]):void");
    }

    private static int zzh(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder + 109;
        f787a = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = (i << 8) + 1;
            i3 = 13;
        } else {
            i2 = ((i * 3) / 2) + 1;
            i3 = 10;
        }
        int iMax = Math.max(i2, i3);
        int i6 = f787a + 7;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return iMax;
    }

    private final void zzi(int i) {
        int i2 = 2 % 2;
        int i3 = f787a;
        int i4 = i3 + 115;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i >= 0) {
            int i5 = i3 + 53;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (i < this.zzc) {
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzj(i));
    }

    private final String zzj(int i) {
        int i2;
        byte b2;
        int i3 = 2 % 2;
        int i4 = asBinder + 107;
        f787a = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = this.zzc;
            b2 = 38;
        } else {
            i2 = this.zzc;
            b2 = 13;
        }
        String strZzb = zzays.zzb(i2, i, b2, "Index:", ", Size:");
        int i5 = f787a + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return strZzb;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int i3 = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzbC();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
        int i4 = asBinder;
        int i5 = i4 + 75;
        f787a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i2 < length) {
            int i8 = i4 + 107;
            f787a = i8 % 128;
            if (i8 % 2 == 0) {
                System.arraycopy(zArr, i, zArr, i7, i2 >>> i);
            } else {
                System.arraycopy(zArr, i, zArr, i7, i2 - i);
            }
        } else {
            boolean[] zArr2 = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i);
            System.arraycopy(this.zzb, i, zArr2, i7, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
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
            int i3 = $10 + 47;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 47774);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 469;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iLastIndexOf, maximumDrawingCacheSize, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i9 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarSize() >> 8)), 467 - TextUtils.indexOf((CharSequence) "", '0'), View.getDefaultSize(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 2323, 43 - ImageFormat.getBitsPerPixel(0), -1312321721, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i10 = $11 + 19;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        if (indexOf(obj) == -1) {
            return false;
        }
        int i2 = asBinder + 91;
        int i3 = i2 % 128;
        f787a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f787a + 123;
        asBinder = i2 % 128;
        int i3 = 0;
        int iZzb = 1;
        if (i2 % 2 != 0) {
            iZzb = 0;
            i3 = 1;
        }
        while (i3 < this.zzc) {
            iZzb = (iZzb * 31) + zzbap.zzb(this.zzb[i3]);
            i3++;
            int i4 = f787a + 113;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f787a + 69;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return iZzb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r4 = com.google.android.libraries.places.internal.zzayr.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = java.util.Arrays.copyOf(r3.zzb, r4);
        r1 = com.google.android.libraries.places.internal.zzayr.asBinder + 13;
        com.google.android.libraries.places.internal.zzayr.f787a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return new com.google.android.libraries.places.internal.zzayr(r4, r3.zzc, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4 >= r3.zzc) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4 >= r3.zzc) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L11;
     */
    @Override // com.google.android.libraries.places.internal.zzbag
    /* JADX INFO: renamed from: zzd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzbag zzg(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzayr.f787a
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzayr.asBinder = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int r1 = r3.zzc
            r2 = 59
            int r2 = r2 / 0
            if (r4 < r1) goto L38
            goto L1b
        L17:
            int r1 = r3.zzc
            if (r4 < r1) goto L38
        L1b:
            if (r4 != 0) goto L20
            boolean[] r4 = com.google.android.libraries.places.internal.zzayr.zza
            goto L2f
        L20:
            boolean[] r1 = r3.zzb
            boolean[] r4 = java.util.Arrays.copyOf(r1, r4)
            int r1 = com.google.android.libraries.places.internal.zzayr.asBinder
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzayr.f787a = r2
            int r1 = r1 % r0
        L2f:
            int r0 = r3.zzc
            com.google.android.libraries.places.internal.zzayr r1 = new com.google.android.libraries.places.internal.zzayr
            r2 = 1
            r1.<init>(r4, r0, r2)
            return r1
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzayr.zzg(int):com.google.android.libraries.places.internal.zzbag");
    }

    @Override // com.google.android.libraries.places.internal.zzbao, com.google.android.libraries.places.internal.zzbag
    public final /* synthetic */ zzbao zzg(int i) {
        int i2 = 2 % 2;
        int i3 = f787a + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzbag zzbagVarZzg = zzg(i);
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        return zzbagVarZzg;
    }

    private zzayr(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        int i3 = 2 % 2;
        zzbC();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i4 = f787a + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
        int i6 = asBinder + 75;
        f787a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f787a + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzbC();
        zzi(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        Boolean boolValueOf = Boolean.valueOf(z);
        int i5 = f787a + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return boolValueOf;
    }

    public final boolean zze(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        f787a = i3 % 128;
        if (i3 % 2 != 0) {
            zzi(i);
            return this.zzb[i];
        }
        zzi(i);
        boolean z = this.zzb[i];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2 = 2 % 2;
        int i3 = f787a + 5;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            zzi(i);
            return Boolean.valueOf(this.zzb[i]);
        }
        zzi(i);
        int i4 = 78 / 0;
        return Boolean.valueOf(this.zzb[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = f787a;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof Boolean)) {
            int i5 = i2 + 1;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        int i8 = asBinder + 11;
        f787a = i8 % 128;
        int i9 = i8 % 2;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0229  */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        zzbC();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iAxisFromString = MotionEvent.axisFromString("") + 11;
            byte b2 = $$a[5];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, (byte) (b3 + 4), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, jumpTapTimeout, iAxisFromString, 252381699, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{11040, 58167, 3413, 52675, 46600, 62034, 42600, 7460, 63135, 43123, 62946, 8156, 31351, 22281, 54007, 24825, 46907, 39804, 22806, 17135, 9708, 30094, 50026, 28045}, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{7942, 53122, 61301, 57380, 56501, 1299, 52738, 28616, 62798, 34987, 'u', 48080, 7505, 8611, 17400, 53957, 31341, 2083}, 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int iMyPid = 876 - (Process.myPid() >> 22);
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            c(bArr[5], bArr[10], bArr[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMyPid, mirror, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f787a + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                c(b4, b4, bArr2[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, edgeSlop, jumpTapTimeout2, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iNextInt = new Random().nextInt();
            int i4 = ~((-785357676) | iNextInt);
            int i5 = (-451337492) + ((742949122 | i4) * (-280)) + ((i4 | (~(745047446 | iNextInt))) * 140);
            int i6 = ~((-42408554) | iNextInt);
            int i7 = ~iNextInt;
            int i8 = i5 + (((~(i7 | 787455999)) | i6 | (~((-742949123) | i7))) * 140) + 603882212;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            d(new char[]{42027, 55763, 24244, 6388, 33734, 18668, 14854, 1248, 29720, 41374, 6946, 39044, 60488, 30019, 45579, 12310, 44215, 46200, 8337, 50131, 23087, 20133, 48267, 37551, 14318, 63002, 54873, 2495}, 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new char[]{62252, 13943, 20569, 25008, 60314, 28726, 46038, 26660, 53506, 11624, 5979, 37602, 33968, 56195, 44096, 18514, 58361, 63944, 25563, 52125}, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = f787a + 49;
                    asBinder = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            d(new char[]{12650, 18952, 39775, 30858, 10615, 36487, 34602, 32068, 58620, 38001, 52722, 32326, 59853, 18497, 7625, 53488, 49679, 58775}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            d(new char[]{40512, 30745, 21055, 32906, 15132, 39017, 8136, 5499, 20247, 61750, 23961, 60392, 47549, 26661, 57815, 42798, 52445, 21280}, 16 - (ViewConfiguration.getScrollBarSize() >> 8), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 603882212};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[10];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                e(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[12];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                e(b7, b8, b8, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                        int iResolveSize = View.resolveSize(0, 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        c(b9, b9, bArr4[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, doubleTapTimeout, iResolveSize, 256017550, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        d(new char[]{11040, 58167, 3413, 52675, 46600, 62034, 42600, 7460, 63135, 43123, 62946, 8156, 31351, 22281, 54007, 24825, 46907, 39804, 22806, 17135, 9708, 30094, 50026, 28045}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        d(new char[]{7942, 53122, 61301, 57380, 56501, 1299, 52738, 28616, 62798, 34987, 'u', 48080, 7505, 8611, 17400, 53957, 31341, 2083}, 15 - Color.red(0), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int iRed = 876 - Color.red(0);
                            int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[5], bArr5[10], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iRed, i12, 2009631821, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int mirror2 = ':' - AndroidCharacter.getMirror('0');
                            byte b10 = $$a[5];
                            byte b11 = b10;
                            Object[] objArr21 = new Object[1];
                            c(b11, (byte) (b11 + 4), b10, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, scrollDefaultDelay, mirror2, 252381699, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + (-228659168) + (((~(173792563 | iIdentityHashCode)) | (-214102793)) * (-964)) + (((~((~iIdentityHashCode) | 173792563)) | (-249298748)) * (-964));
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[1])[0] = i18 ^ (i18 << 5);
        } else {
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i19 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = ~(183200801 | iIdentityHashCode2);
            int i21 = i19 + (-1083174789) + (((-183467630) | i20) * (-814)) + ((i20 | (~((~iIdentityHashCode2) | 142890572)) | 142623744) * 407) + (((~(iIdentityHashCode2 | (-142890573))) | (~((-183200802) | iIdentityHashCode2)) | 142623744) * 407);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        }
        if (!(collection instanceof zzayr)) {
            int i24 = asBinder + 81;
            f787a = i24 % 128;
            if (i24 % 2 != 0) {
                return super.addAll(collection);
            }
            super.addAll(collection);
            obj.hashCode();
            throw null;
        }
        zzayr zzayrVar = (zzayr) collection;
        int i25 = zzayrVar.zzc;
        if (i25 == 0) {
            int i26 = ((int[]) objArr2[1])[0];
            int i27 = i26 * i26;
            int i28 = -(601689219 * i26);
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = -(i26 * (-1428354729));
            int i31 = ((i29 ^ i30) + ((i30 & i29) << 1)) - 1498849431;
            int i32 = i31 >> 22;
            int i33 = (((i32 | (-2047)) << 1) - (i32 ^ (-2047))) / 1024;
            int i34 = (i33 & 1) + (i33 | 1);
            int i35 = (-(((((i31 >> 27) - 63) / 32) + 1) ^ (((i31 | i34) << 1) - (i34 ^ i31)))) + 7;
            int i36 = i35 >> 22;
            int i37 = (((i36 | (-2047)) << 1) - (i36 ^ (-2047))) / 1024;
            int i38 = (i37 & 1) + (i37 | 1);
            return 0 / ((i35 & (-((i38 & 1) + (i38 | 1)))) * 320);
        }
        int i39 = this.zzc;
        if (Integer.MAX_VALUE - i39 < i25) {
            throw new OutOfMemoryError();
        }
        int i40 = i39 + i25;
        boolean[] zArr = this.zzb;
        if (i40 > zArr.length) {
            int i41 = asBinder + 37;
            f787a = i41 % 128;
            if (i41 % 2 == 0) {
                this.zzb = Arrays.copyOf(zArr, i40);
                throw null;
            }
            this.zzb = Arrays.copyOf(zArr, i40);
        }
        System.arraycopy(zzayrVar.zzb, 0, this.zzb, this.zzc, zzayrVar.zzc);
        this.zzc = i40;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        f787a = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 83;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof zzayr)) {
            return super.equals(obj);
        }
        zzayr zzayrVar = (zzayr) obj;
        if (this.zzc == zzayrVar.zzc) {
            boolean[] zArr = zzayrVar.zzb;
            for (int i7 = 0; i7 < this.zzc; i7++) {
                if (this.zzb[i7] != zArr[i7]) {
                    return false;
                }
            }
            int i8 = f787a + 35;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = i2 + 59;
        f787a = i10 % 128;
        return i10 % 2 == 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r1 r2 r3
  0x002d: PHI (r1v5 boolean[]) = (r1v4 boolean[]), (r1v9 boolean[]) binds: [B:8:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:8:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        boolean[] zArr;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = f787a + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            zzbC();
            zzi(i);
            zArr = this.zzb;
            z = zArr[i];
            i2 = this.zzc;
            if (i < i2) {
                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
            }
        } else {
            zzbC();
            zzi(i);
            zArr = this.zzb;
            z = zArr[i];
            i2 = this.zzc;
            if (i < i2 - 1) {
                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
            }
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        Boolean boolValueOf = Boolean.valueOf(z);
        int i5 = f787a + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return boolValueOf;
    }

    public final void zzf(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        f787a = i2 % 128;
        int i3 = i2 % 2;
        zzbC();
        int i4 = this.zzc;
        int length = this.zzb.length;
        if (i4 == length) {
            boolean[] zArr = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zArr2[i5] = z;
        int i6 = asBinder + 37;
        f787a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 111;
        f787a = i2 % 128;
        if (i2 % 2 == 0) {
            zzf(((Boolean) obj).booleanValue());
            z = false;
        } else {
            zzf(((Boolean) obj).booleanValue());
            z = true;
        }
        int i3 = f787a + 125;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = 2 % 2;
        int i2 = f787a + 19;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzc;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 62303;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 35964;
        b = (char) 18772;
        TuitionPaymentFragmentbindingInflater1 = (char) 36530;
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
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzayr.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 * 4
            int r6 = r6 + 108
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r8 = r8 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzayr.$$g(int, int, int):java.lang.String");
    }
}
