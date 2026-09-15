package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcd implements Map.Entry, Comparable {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ zzbcg zza;
    private final Comparable zzb;
    private Object zzc;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, 65, -33, 120, -8, -25, 40, -41, -28, 4, 37, -8, -41, -32, -8, -17, 3, -29, -11, -7, 3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 151;
    private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 68;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f789a = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -1168780718;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795604;
    private static int b = 1917957873;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {69, -71, 78, 100, -101, 69, -68, 76, -73, 107, 104, -10, 73, 12, -121, -74, -73, -80, 67, -69, 64, -28, 24, -23, 20, 23, -32, 15, -14, -29, -18, 31, 19, -23, 27, 48, -55, 57, -62, 30, 29, -1, -63, 53, -51, 6, -11, -45, 45, -49, -6, 14, -41, 32, 14, -23, -30, 52, -2, -16, 14, -3, -14, -6, 0, -26, -26, -26, -26};

    zzbcd(zzbcg zzbcgVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 107 - r6
            int r7 = r7 * 15
            int r0 = 53 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzbcd.$$a
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcd.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 19
            int r6 = r6 + 84
            int r8 = r8 * 35
            int r0 = r8 + 18
            int r7 = r7 * 17
            int r7 = 21 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzbcd.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 17
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r7 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcd.e(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r4 = r4 + 59;
        com.google.android.libraries.places.internal.zzbcd.f789a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        return r4.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 103;
        r4 = r2 % 128;
        com.google.android.libraries.places.internal.zzbcd.asBinder = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean zzb(java.lang.Object r4, java.lang.Object r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzbcd.asBinder
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzbcd.f789a = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 93
            int r1 = r1 / r3
            if (r4 != 0) goto L32
            goto L17
        L15:
            if (r4 != 0) goto L32
        L17:
            int r2 = r2 + 103
            int r4 = r2 % 128
            com.google.android.libraries.places.internal.zzbcd.asBinder = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            r1 = 44
            int r1 = r1 / r3
            if (r5 == 0) goto L30
            goto L28
        L26:
            if (r5 == 0) goto L30
        L28:
            int r4 = r4 + 59
            int r5 = r4 % 128
            com.google.android.libraries.places.internal.zzbcd.f789a = r5
            int r4 = r4 % r0
            return r3
        L30:
            r4 = 1
            return r4
        L32:
            boolean r4 = r4.equals(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcd.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Comparable comparable = this.zzb;
        int iHashCode2 = 0;
        if (comparable == null) {
            int i2 = asBinder + 125;
            f789a = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = comparable.hashCode();
        }
        Object obj = this.zzc;
        if (obj != null) {
            int i4 = asBinder + 59;
            f789a = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = obj.hashCode();
            int i6 = f789a + 63;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = iHashCode ^ iHashCode2;
        int i9 = f789a + 81;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        f789a = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.compareTo(((zzbcd) obj).zzb);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iCompareTo = this.zzb.compareTo(((zzbcd) obj).zzb);
        int i3 = f789a + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return iCompareTo;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            int i2 = asBinder + 95;
            f789a = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(!zzb(this.zzb, entry.getKey()))) {
            int i4 = asBinder + 119;
            f789a = i4 % 128;
            int i5 = i4 % 2;
            Object obj2 = this.zzc;
            Object value = entry.getValue();
            if (i5 == 0) {
                zzb(obj2, value);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (zzb(obj2, value)) {
                return true;
            }
        }
        return false;
    }

    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), View.getDefaultSize(0, 0) + 2267, 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 67;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int iIndexOf = 3358 - TextUtils.indexOf("", "");
                            int size = View.MeasureSpec.getSize(0) + 18;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, iIndexOf, size, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - Color.argb(0, 0, 0, 0), 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 55904), Color.green(0) + 2855, (ViewConfiguration.getEdgeSlop() >> 16) + 13, -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i9 = 0; i9 < length3; i9++) {
                        int i10 = $11 + 87;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i12 = $10 + 3;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43043 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 3112;
            int iArgb = Color.argb(0, 0, 0, 0) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, iArgb, -1272852037, false, (String) objArr2[0], null);
        }
        Object obj2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(16979529 - TextUtils.lastIndexOf("", '0'), (-52) - View.MeasureSpec.getSize(0), (short) TextUtils.getCapsMode("", 0, 0), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 85), TextUtils.getCapsMode("", 0, 0) - 922259124, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(16979534 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-59) - ExpandableListView.getPackedPositionType(0L), (short) View.getDefaultSize(0, 0), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 7), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 922259102, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3111;
            int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
            byte[] bArr2 = $$a;
            byte b4 = bArr2[132];
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, minimumFlingVelocity, iKeyCodeFromString, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f789a + 101;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iMyTid = 3111 - (Process.myTid() >> 22);
                int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
                byte[] bArr3 = $$a;
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b6, bArr3[132], b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iMyTid, iNormalizeMetaState, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 1206478406 + (((~((-811171000) | i6)) | (~((-893860460) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | (-811171000))) | (~(i6 | (-893860460))) | (-895450880)) * (-370)) + 585641819;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(16979539 - Drawable.resolveOpacity(0, 0), (-59) - ImageFormat.getBitsPerPixel(0), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((-34) - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 922259089, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(16979537 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-58) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (View.resolveSize(0, 0) + 29), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 922259074, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1189985627};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[24];
                byte b8 = b7;
                Object[] objArr11 = new Object[1];
                e(b7, b8, (byte) (b8 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr4[24];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr12 = new Object[1];
                e(b10, b10, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 43042);
                    int windowTouchSlop = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iMyPid = 22 - (Process.myPid() >> 22);
                    byte[] bArr5 = $$a;
                    byte b11 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    c(b11, bArr5[132], b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, windowTouchSlop, iMyPid, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    d(16979530 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 52, (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (byte) ((-85) - (ViewConfiguration.getTapTimeout() >> 16)), (-922259123) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    d(Gravity.getAbsoluteGravity(0, 0) + 16979534, TextUtils.getOffsetBefore("", 0) - 59, (short) View.combineMeasuredStates(0, 0), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 6), (-922259102) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                        int jumpTapTimeout = 3111 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i10 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[132];
                        byte b13 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        c(b12, b13, b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, jumpTapTimeout, i10, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43042);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                        int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr7 = $$a;
                        byte b14 = bArr7[37];
                        byte b15 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        c(b14, b15, b15, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, packedPositionGroup, tapTimeout, -1272852037, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = asBinder + 119;
            f789a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i15 + 1723541638 + (((~((~iIdentityHashCode2) | 744284840)) | (-1029699323)) * 529) + (((~(iIdentityHashCode2 | 744284840)) | (-960746619)) * 529);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
            Object[] objArr18 = {new int[1], new int[]{i17}, new int[]{i16}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i21 = i12 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i25 = i22 + 1879698000 + (((~((-400735623) | iFreeMemory)) | 94419332) * 345) + (((~((-400735623) | (~iFreeMemory))) | 1209876504) * 345) + ((~(iFreeMemory | (-94419333))) * 345);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
            Object[] objArr19 = {new int[1], new int[]{i24}, new int[]{i23}, strArr4};
        }
        this.zza.zzh();
        Object obj3 = this.zzc;
        this.zzc = obj;
        int i28 = asBinder + 75;
        f789a = i28 % 128;
        if (i28 % 2 != 0) {
            return obj3;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        String string = sb.toString();
        int i2 = asBinder + 79;
        f789a = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        int i = 2 % 2;
        int i2 = f789a;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Comparable comparable = this.zzb;
        int i5 = i2 + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return comparable;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = 2 % 2;
        int i2 = f789a + 43;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzc;
        }
        throw null;
    }

    public final Comparable zza() {
        int i = 2 % 2;
        int i2 = f789a;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Comparable comparable = this.zzb;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return comparable;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r7 = r7 + 117
            byte[] r0 = com.google.android.libraries.places.internal.zzbcd.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbcd.$$g(short, short, short):java.lang.String");
    }
}
