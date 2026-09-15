package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import androidx.recyclerview.widget.ItemTouchHelper;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
final class zzew extends zzdr implements RandomAccess, zzez, zzge {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final zzew zza;
    private int[] zzb;
    private int zzc;
    private static final byte[] $$c = {15, -9, 64, -81};
    private static final int $$f = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -50, -56, -93, -41, -9, -7, -21, -8, 9, -9, -18, -1, 10, -42, -5, 4, -3, -10, -10, -22, 38, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 126;
    private static final byte[] $$a = {92, 126, -38, -95, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 38;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = new zzew(new int[0], 0, false);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    zzew() {
        this(new int[10], 0, true);
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
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.auth.zzew.$$a
            int r6 = 53 - r6
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzew.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 11
            int r0 = 53 - r6
            byte[] r1 = com.google.android.gms.internal.auth.zzew.$$d
            int r7 = r7 * 41
            int r7 = r7 + 4
            int r8 = r8 * 16
            int r8 = 84 - r8
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzew.d(short, int, short, java.lang.Object[]):void");
    }

    private final String zzf(int i) {
        int i2 = 2 % 2;
        String str = "Index:" + i + ", Size:" + this.zzc;
        int i3 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private final void zzg(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
            if (i >= 0) {
                if (i < this.zzc) {
                    int i6 = i3 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            }
        } else if (i >= 0) {
            if (i < this.zzc) {
                int i8 = i3 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf = indexOf(obj);
        if (i3 == 0) {
            int i4 = 65 / 0;
            if (iIndexOf != -1) {
                return true;
            }
        } else if (iIndexOf != -1) {
            return true;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 1;
        int i5 = 0;
        while (i5 < this.zzc) {
            i4 = (i4 * 31) + this.zzb[i5];
            i5++;
            int i6 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* synthetic */ zzez zzd(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        zzew zzewVar = new zzew(Arrays.copyOf(this.zzb, i), this.zzc, true);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return zzewVar;
    }

    private zzew(int[] iArr, int i, boolean z) {
        super(z);
        this.zzb = iArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int i5 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        int[] iArr = this.zzb;
        if (i6 == 0) {
            System.arraycopy(iArr, i2, iArr, i, this.zzc >> i2);
            this.zzc >>= i2 + i;
            this.modCount /= 0;
        } else {
            System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzg(i);
        int[] iArr = this.zzb;
        int i5 = iArr[i];
        iArr[i] = iIntValue;
        Integer numValueOf = Integer.valueOf(i5);
        int i6 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return numValueOf;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzg(i);
        Integer numValueOf = Integer.valueOf(this.zzb[i]);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return numValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof Integer;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i3 = this.zzc;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 96 / 0;
                if (this.zzb[i6] == iIntValue) {
                    return i6;
                }
            } else {
                if (this.zzb[i6] == iIntValue) {
                    return i6;
                }
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2 = 2 % 2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = this.zzc;
            if (i <= i6) {
                int[] iArr = this.zzb;
                if (i6 < iArr.length) {
                    int i7 = i4 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    int i8 = i7 % 2;
                    System.arraycopy(iArr, i, iArr, i + 1, i6 - i);
                } else {
                    int[] iArr2 = new int[((i6 * 3) / 2) + 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
                    this.zzb = iArr2;
                }
                this.zzb[i] = iIntValue;
                this.zzc++;
                this.modCount++;
                int i9 = b + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzew)) {
            return super.addAll(collection);
        }
        zzew zzewVar = (zzew) collection;
        int i4 = zzewVar.zzc;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = b + 67;
        int i7 = i6 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7;
        int i8 = i6 % 2;
        int i9 = i5 + i4;
        int[] iArr = this.zzb;
        if (i9 > iArr.length) {
            int i10 = i7 + 95;
            b = i10 % 128;
            int i11 = i10 % 2;
            this.zzb = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(zzewVar.zzb, 0, this.zzb, this.zzc, zzewVar.zzc);
        this.zzc = i9;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return super.equals(obj);
        }
        zzew zzewVar = (zzew) obj;
        if (this.zzc != zzewVar.zzc) {
            return false;
        }
        int[] iArr = zzewVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            int i5 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (this.zzb[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void zze(int i) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            zza();
            int length = this.zzb.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zza();
        int i4 = this.zzc;
        int[] iArr = this.zzb;
        if (i4 == iArr.length) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int[] iArr2 = new int[(i4 << 5) - 4];
                System.arraycopy(iArr, 0, iArr2, 1, i4);
                this.zzb = iArr2;
            } else {
                int[] iArr3 = new int[((i4 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr3, 0, i4);
                this.zzb = iArr3;
            }
        }
        int[] iArr4 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        iArr4[i6] = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2 = 2 % 2;
        zza();
        zzg(i);
        int[] iArr = this.zzb;
        int i3 = iArr[i];
        int i4 = this.zzc;
        if (i < i4 - 1) {
            int i5 = b + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            System.arraycopy(iArr, i + 1, iArr, i, (i4 - i) - 1);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        zze((i2 % 2 == 0 ? (Integer) obj : (Integer) obj).intValue());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), TextUtils.getCapsMode("", 0, 0) + 3291, 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 651 - View.combineMeasuredStates(0, 0), 44 - TextUtils.getCapsMode("", 0, 0), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 21;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 39;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $10 + 87;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 651, 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    try {
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 1;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i10 = $10 + 67;
        $11 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0250  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iAxisFromString = MotionEvent.axisFromString("") + 922;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
            byte b2 = $$a[37];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) 52, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, doubleTapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 245 - View.resolveSize(0, 0), 22 - (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 248, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, new char[]{5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iLastIndexOf, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, bArr2[33], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, absoluteGravity, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = 330525785 + (((-167940429) | (~iIdentityHashCode)) * (-490)) + (((~(iIdentityHashCode | (-1335540045))) | 1167599616) * 490) + 657615060;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(true, 245 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 26, 20 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, Color.alpha(0) + 252, 18 - ((Process.getThreadPriority(0) + 20) >> 6), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i5 = b + 113;
                int i6 = i5 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
                if (i5 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if (!(!(applicationContext instanceof ContextWrapper))) {
                    int i7 = i6 + 53;
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
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
            Object[] objArr10 = new Object[1];
            c(false, 244 - TextUtils.getOffsetBefore("", 0), 15 - Process.getGidForName(""), 7 - TextUtils.getOffsetBefore("", 0), new char[]{65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(true, 248 - TextUtils.indexOf("", "", 0, 0), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 15 - (Process.myPid() >> 22), new char[]{65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            b = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 793654260};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[78];
                Object[] objArr13 = new Object[1];
                d(b5, bArr3[55], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[55];
                Object[] objArr14 = new Object[1];
                d(b6, bArr3[78], b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                    int iAxisFromString2 = 920 - MotionEvent.axisFromString("");
                    int fadingEdgeLength2 = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    a(b7, bArr4[33], b7, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iAxisFromString2, fadingEdgeLength2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 245, 22 - (ViewConfiguration.getTapTimeout() >> 16), 21 - TextUtils.indexOf("", ""), new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(true, TextUtils.indexOf((CharSequence) "", '0') + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (-16777201) - Color.rgb(0, 0, 0), 11 - (Process.myPid() >> 22), new char[]{5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r'}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b8, b8, bArr5[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, offsetBefore, absoluteGravity2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString2 = (char) (31532 - MotionEvent.axisFromString(""));
                        int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                        byte b9 = $$a[37];
                        Object[] objArr20 = new Object[1];
                        a(b9, (byte) 52, b9, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString2, scrollBarSize, bitsPerPixel, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                b = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr) {
                    int i14 = b + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i17 = i16 + (((~((-2239505) | iIdentityHashCode2)) * 521) - 1556968976) + (((~((~iIdentityHashCode2) | (-2239505))) | 136053251) * 521);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
        int i20 = this.zzc;
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        b = i21 % 128;
        int i22 = i21 % 2;
        return i20;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = -83722256;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r5 = 120 - r5
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.internal.auth.zzew.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzew.$$g(int, short, short):java.lang.String");
    }
}
