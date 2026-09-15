package com.google.android.gms.internal.auth;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
class zzgv extends AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile zzgt zze;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$d = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 48, -62, 38, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 168;
    private static int b = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 37232;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 17808;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 32944;
    private static char TuitionPaymentFragmentbindingInflater1 = 9213;
    private List zzb = Collections.emptyList();
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = 84 - r6
            int r5 = r5 * 2
            int r0 = r5 + 53
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.internal.auth.zzgv.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 52
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgv.c(int, int, int, java.lang.Object[]):void");
    }

    private final void zzn() {
        int i = 2 % 2;
        int i2 = b + 97;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
        int i4 = i3 + 83;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        int i = 2 % 2;
        int i2 = b + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.zze == null) {
            this.zze = new zzgt(this, null);
            int i4 = asInterface + 31;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        zzgt zzgtVar = this.zze;
        int i6 = asInterface + 91;
        b = i6 % 128;
        int i7 = i6 % 2;
        return zzgtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objZze = zze((Comparable) obj, obj2);
        int i4 = asInterface + 17;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return objZze;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzk((Comparable) obj);
            throw null;
        }
        Comparable comparable = (Comparable) obj;
        if (zzk(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        int i3 = b + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1 r3 r4
  0x0026: PHI (r1v8 int) = (r1v5 int), (r1v15 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r4v10 int) = (r4v0 int), (r4v11 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    private final int zzk(Comparable comparable) {
        int size;
        int i;
        int i2;
        int iCompareTo;
        int i3 = 2 % 2;
        int i4 = asInterface + 15;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            size = this.zzb.size();
            i = size - 1;
            i2 = 1;
            if (i >= 0) {
                iCompareTo = comparable.compareTo(((zzgp) this.zzb.get(i)).zza());
                if (iCompareTo > 0) {
                    int i5 = -(size + 1);
                    int i6 = b + 25;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return i5;
                }
                if (iCompareTo == 0) {
                    int i8 = asInterface + 91;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    return i;
                }
            }
        } else {
            size = this.zzb.size();
            i = size - 1;
            i2 = 0;
            if (i >= 0) {
                iCompareTo = comparable.compareTo(((zzgp) this.zzb.get(i)).zza());
                if (iCompareTo > 0) {
                    int i10 = -(size + 1);
                    int i11 = b + 25;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    return i10;
                }
                if (iCompareTo == 0) {
                    int i13 = asInterface + 91;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    return i;
                }
            }
        }
        while (i2 <= i) {
            int i15 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgp) this.zzb.get(i15)).zza());
            if (iCompareTo2 < 0) {
                i = i15 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i15;
                }
                int i16 = b + 101;
                asInterface = i16 % 128;
                i2 = i16 % 2 == 0 ? i15 - 1 : i15 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return ((com.google.android.gms.internal.auth.zzgp) r3.zzb.get(r1)).getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = r3.zzc.get(r4);
        r1 = com.google.android.gms.internal.auth.zzgv.b + 7;
        com.google.android.gms.internal.auth.zzgv.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzgv.b + 85;
        com.google.android.gms.internal.auth.zzgv.asInterface = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.auth.zzgv.asInterface
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.google.android.gms.internal.auth.zzgv.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r1 = r3.zzk(r4)
            r2 = 98
            int r2 = r2 / 0
            if (r1 < 0) goto L39
            goto L23
        L1b:
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r1 = r3.zzk(r4)
            if (r1 < 0) goto L39
        L23:
            int r4 = com.google.android.gms.internal.auth.zzgv.b
            int r4 = r4 + 85
            int r2 = r4 % 128
            com.google.android.gms.internal.auth.zzgv.asInterface = r2
            int r4 = r4 % r0
            java.util.List r4 = r3.zzb
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.auth.zzgp r4 = (com.google.android.gms.internal.auth.zzgp) r4
            java.lang.Object r4 = r4.getValue()
            return r4
        L39:
            java.util.Map r1 = r3.zzc
            java.lang.Object r4 = r1.get(r4)
            int r1 = com.google.android.gms.internal.auth.zzgv.b
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.google.android.gms.internal.auth.zzgv.asInterface = r2
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgv.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb;
        int i = 2 % 2;
        int i2 = b + 113;
        asInterface = i2 % 128;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            iZzb = zzb();
            iHashCode = 1;
        } else {
            iZzb = zzb();
        }
        while (iHashCode < iZzb) {
            iHashCode += ((zzgp) this.zzb.get(iHashCode)).hashCode();
            iHashCode++;
            int i3 = b + 47;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        if (this.zzc.size() <= 0) {
            return iHashCode;
        }
        int i5 = asInterface + 91;
        b = i5 % 128;
        return i5 % 2 != 0 ? iHashCode % this.zzc.hashCode() : iHashCode + this.zzc.hashCode();
    }

    private final SortedMap zzm() {
        int i = 2 % 2;
        int i2 = b + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        SortedMap sortedMap = (SortedMap) this.zzc;
        int i4 = b + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return sortedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = 2 % 2;
        zzn();
        if (!this.zzb.isEmpty()) {
            int i2 = b + 57;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                this.zzb.clear();
                int i3 = 47 / 0;
            } else {
                this.zzb.clear();
            }
        }
        if (!this.zzc.isEmpty()) {
            int i4 = asInterface + 107;
            b = i4 % 128;
            int i5 = i4 % 2;
            this.zzc.clear();
        }
        int i6 = asInterface + 37;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        b = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            zzn();
            zzk((Comparable) obj);
            obj2.hashCode();
            throw null;
        }
        zzn();
        Comparable comparable = (Comparable) obj;
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            return zzl(iZzk);
        }
        if (this.zzc.isEmpty()) {
            int i3 = asInterface + 99;
            b = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Object objRemove = this.zzc.remove(comparable);
        int i5 = b + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return objRemove;
    }

    private final Object zzl(int i) {
        int i2 = 2 % 2;
        int i3 = b + 65;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            zzn();
            ((zzgp) this.zzb.remove(i)).getValue();
            this.zzc.isEmpty();
            throw null;
        }
        zzn();
        Object value = ((zzgp) this.zzb.remove(i)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgp(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
            int i4 = b + 105;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgv)) {
            return super.equals(obj);
        }
        zzgv zzgvVar = (zzgv) obj;
        int size = size();
        if (size != zzgvVar.size()) {
            int i4 = b + 7;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzgvVar.zzb()) {
            return entrySet().equals(zzgvVar.entrySet());
        }
        for (int i6 = 0; i6 < iZzb; i6++) {
            int i7 = asInterface + 47;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 75 / 0;
                if (!zzg(i6).equals(zzgvVar.zzg(i6))) {
                    return false;
                }
            } else {
                if (!zzg(i6).equals(zzgvVar.zzg(i6))) {
                    return false;
                }
            }
        }
        if (iZzb == size) {
            return true;
        }
        int i9 = asInterface + 63;
        b = i9 % 128;
        int i10 = i9 % 2;
        return this.zzc.equals(zzgvVar.zzc);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 3;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char pressedStateDuration = (char) (47773 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iResolveSizeAndState = 468 - View.resolveSizeAndState(0, 0, 0);
                        int scrollDefaultDelay = 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iResolveSizeAndState, scrollDefaultDelay, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getJumpTapTimeout() >> 16) + 468, 13 - View.getDefaultSize(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 115;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2323 - View.MeasureSpec.getSize(0), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i12 = $10 + 87;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() throws Throwable {
        String str;
        int iIntValue;
        String str2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46401), TextUtils.getOffsetAfter("", 0) + 40, Color.alpha(0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{51106, 22216, 13842, 38658, 12254, 5860, 64389, 8489, 59793, 25890, 64634, 64491, 28357, 15825, 9373, 42834, 22145, 21043, 13510, 22915, 31887, 59614, 10181, 39293}, 21 - Process.getGidForName(""), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{2064, 20904, 53539, 36167, 58687, 31309, 32883, 6178, 29044, 35334, 1976, 54404, 34121, 32312, 19618, 65025, 27621, 23190}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 399;
        long j2 = (j * 713279086995997546L) + (j * 1383978087745961441L);
        long j3 = 398;
        String str3 = "";
        long j4 = -1;
        long j5 = ((j4 ^ 713279086995997546L) | 1383978087745961441L) ^ j4;
        long j6 = j4 ^ 1383978087745961441L;
        long j7 = (j6 | 713279086995997546L) ^ j4;
        long j8 = jLongValue;
        long jIdentityHashCode = System.identityHashCode(this);
        long j9 = j2 + ((j5 | j7 | ((j6 | jIdentityHashCode) ^ j4)) * j3) + (((long) (-1194)) * 2015065876354416619L) + (j3 * ((j4 ^ (j6 | (jIdentityHashCode ^ j4))) | j5 | j7));
        int i3 = 0;
        try {
            while (i3 != 10) {
                int i4 = b + 87;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    str2 = str3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 58 - TextUtils.indexOf((CharSequence) str2, '0', 0, 0), TextUtils.lastIndexOf(str2, '0', 0) + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                } else {
                    str2 = str3;
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i7 = 0;
                long j10 = j8;
                while (true) {
                    int i8 = 0;
                    while (i8 != 8) {
                        int i9 = b + 61;
                        asInterface = i9 % 128;
                        if (i9 % 2 == 0) {
                            i6 = (((((int) (j10 >>> i8)) & 11087) << (i6 * 112)) / (i6 >> 87)) << i6;
                            i8 += 121;
                        } else {
                            i6 = (((((int) (j10 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            i8++;
                        }
                    }
                    if (i7 != 0) {
                        break;
                    }
                    i7++;
                    j10 = j9;
                }
                if (i6 == i2) {
                    return this.zzb.size() + this.zzc.size();
                }
                int i10 = asInterface + 17;
                b = i10 % 128;
                int i11 = i10 % 2;
                j8 -= 1024;
                i3++;
                str3 = str2;
            }
            Object[] objArr3 = {-841774430};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46038), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1134, Process.getGidForName(str) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 2020513329, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(str));
                int trimmedLength = 1031 - TextUtils.getTrimmedLength(str);
                int iArgb = Color.argb(0, 0, 0, 0) + 15;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr5 = new Object[1];
                c(b2, b2, bArr[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, trimmedLength, iArgb, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), TextUtils.indexOf(str, str) + 1117, 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i12 = ((int[]) objArr6[1])[0];
            int i13 = ((int[]) objArr6[3])[0];
            if (i13 != i12) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str4 : strArr) {
                        arrayList.add(str4);
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            }
            return this.zzb.size() + this.zzc.size();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        str = str3;
        Object[] objArr7 = new Object[1];
        a(new char[]{39156, 18115, 4551, 10978, 25384, 17220, 13469, 15133, 63939, 47983, 11208, 45341, 23961, 53835, 56565, 17767, 14237, 64830}, 16 - (Process.myPid() >> 22), objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        a(new char[]{10314, 17392, 1801, 4263, 62363, 11988, 50161, 28501, 43349, 39745, 63451, 32130, 29547, 33561, 60447, 18979, 57574, 15429}, KeyEvent.normalizeMetaState(0) + 16, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = b + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List list = this.zzb;
        if (i3 != 0) {
            return list.size();
        }
        list.size();
        throw null;
    }

    public final Map.Entry zzg(int i) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map.Entry entry = (Map.Entry) this.zzb.get(i);
        int i5 = b + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return entry;
    }

    public final Iterable zzc() {
        int i = 2 % 2;
        if (!this.zzc.isEmpty()) {
            return this.zzc.entrySet();
        }
        int i2 = b + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Iterable iterableZza = zzgo.zza();
        int i4 = b + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return iterableZza;
    }

    public void zza() {
        Map mapUnmodifiableMap;
        int i = 2 % 2;
        int i2 = asInterface + 47;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (this.zzd) {
            return;
        }
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        if (this.zzf.isEmpty()) {
            int i7 = b + 71;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = mapUnmodifiableMap;
        this.zzd = true;
    }

    public final Object zze(Comparable comparable, Object obj) {
        int i = 2 % 2;
        zzn();
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            int i2 = b + 89;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return ((zzgp) this.zzb.get(iZzk)).setValue(obj);
            }
            ((zzgp) this.zzb.get(iZzk)).setValue(obj);
            throw null;
        }
        zzn();
        if (this.zzb.isEmpty()) {
            int i3 = b + 51;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (!(this.zzb instanceof ArrayList)) {
                this.zzb = new ArrayList(this.zza);
            }
        }
        int i5 = -(iZzk + 1);
        if (i5 >= this.zza) {
            int i6 = b + 103;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i8 = this.zza;
        if (size == i8) {
            int i9 = b + 119;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                zzgp zzgpVar = (zzgp) this.zzb.remove(i8 << 1);
                zzm().put(zzgpVar.zza(), zzgpVar.getValue());
            } else {
                zzgp zzgpVar2 = (zzgp) this.zzb.remove(i8 - 1);
                zzm().put(zzgpVar2.zza(), zzgpVar2.getValue());
            }
        }
        this.zzb.add(i5, new zzgp(this, comparable, obj));
        return null;
    }

    static /* synthetic */ Object zzd(zzgv zzgvVar, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            zzgvVar.zzl(i);
            throw null;
        }
        Object objZzl = zzgvVar.zzl(i);
        int i4 = b + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objZzl;
    }

    static /* synthetic */ List zzf(zzgv zzgvVar) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        List list = zzgvVar.zzb;
        int i5 = i3 + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return list;
    }

    static /* synthetic */ Map zzh(zzgv zzgvVar) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        Map map = zzgvVar.zzc;
        if (i3 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void zzi(zzgv zzgvVar) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzgvVar.zzn();
        int i4 = b + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean zzj() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.zzd;
        int i4 = i2 + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r5 = r5 * 4
            int r5 = 108 - r5
            byte[] r1 = com.google.android.gms.internal.auth.zzgv.$$c
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r5 = r6
            r3 = r7
            goto L29
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            r3 = r1[r5]
        L29:
            int r3 = -r3
            int r6 = r6 + r3
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgv.$$e(byte, int, int):java.lang.String");
    }
}
