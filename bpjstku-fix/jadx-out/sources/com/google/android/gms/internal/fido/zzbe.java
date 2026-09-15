package com.google.android.gms.internal.fido;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
class zzbe extends zzbf {
    final zzbb zzb;
    final Character zzc;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 23, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$e = 180;
    private static final byte[] $$a = {99, -43, -44, -62, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 173;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47213, 47200, 47210, 47260, 47263, 47205, 47136, 47259, 47227, 47253, 47258, 47209, 47201, 47179, 47202, 47211, 47203, 47262, 47228, 47181, 47256, 47226, 47206, 47257};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719438;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean b = true;

    zzbe(zzbb zzbbVar, Character ch) {
        this.zzb = zzbbVar;
        if (ch != null) {
            ch.charValue();
            if (zzbbVar.zzb('=')) {
                throw new IllegalArgumentException(zzan.zza("Padding character %s was already in alphabet", ch));
            }
            int i = TuitionPaymentFragmentbindingInflater1 + 21;
            g = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.zzc = ch;
        int i3 = g + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r7 = 103 - r7
            byte[] r1 = com.google.android.gms.internal.fido.zzbe.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2c
        L12:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbe.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.fido.zzbe.$$d
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r6 = r6 + 4
            int r8 = r8 * 17
            int r8 = r8 + 36
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbe.d(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v8 int) = (r1v5 int), (r1v10 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v4 java.lang.Character) = (r3v0 java.lang.Character), (r3v5 java.lang.Character) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v10 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        Character ch;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        g = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.zzb.hashCode();
            ch = this.zzc;
            int i3 = 8 / 0;
            if (ch == null) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 57;
                g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = ch.hashCode();
            }
        } else {
            iHashCode = this.zzb.hashCode();
            ch = this.zzc;
            if (ch == null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 57;
                g = i6 % 128;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = ch.hashCode();
            }
        }
        return iHashCode ^ iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (!this.zzb.equals(zzbeVar.zzb)) {
            return false;
        }
        Character ch = this.zzc;
        Character ch2 = zzbeVar.zzc;
        if (ch != ch2) {
            if (ch == null) {
                return false;
            }
            int i2 = g + 67;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                ch.equals(ch2);
                throw null;
            }
            if (!ch.equals(ch2)) {
                return false;
            }
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 55;
        g = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
                g = i2 % 128;
                int i3 = i2 % 2;
                sb.append(".omitPadding()");
                int i4 = g + 71;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f = 0.0f;
        if (cArr4 != null) {
            int i4 = $11 + 117;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 31339);
                        int i5 = 2994 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                        int i6 = 17 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, i6, 1182129903, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        char c2 = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), 253 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0') + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        long j = 0;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i7 = $11 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] >> iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - View.getDefaultSize(0, 0)), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 3084, 26 - TextUtils.getOffsetBefore("", 0), -2146875848, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33601), (KeyEvent.getMaxKeyCode() >> 16) + 3085, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i10 = $11 + 85;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i12 = $10 + 41;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] >>> iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i13 = $11 + 117;
        $10 = i13 % 128;
        if (i13 % 2 != 0) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        } else {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", c2, 0, 0) + 33603), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3084, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, -2146875848, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            c2 = '0';
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzbb zzbbVar = this.zzb;
        int iZza = zzbbVar.zzc * zzbh.zza(i, zzbbVar.zzd, RoundingMode.CEILING);
        int i5 = g + 57;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return iZza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i3 = 2 % 2;
        int i4 = g + 41;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        int i6 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b2 = (byte) (-bArr2[5]);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 & 5), bArr2[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iResolveOpacity, iIndexOf, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(null, null, (-16777089) - Color.rgb(0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iAlpha = 876 - Color.alpha(0);
            int i7 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr3 = $$a;
            byte b3 = bArr3[5];
            Object[] objArr6 = new Object[1];
            a((byte) (-b3), bArr3[10], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iAlpha, i7, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i8 = g + 79;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i10 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b4 = $$a[7];
                Object[] objArr7 = new Object[1];
                a((byte) 51, b4, b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, i10, doubleTapTimeout, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i11 = ~(844696983 | i);
            int i12 = ~i;
            int i13 = (-2139924100) + ((i11 | (~((-35196052) | i12))) * (-406)) + ((~(920203263 | i12)) * (-406)) + (((~((-885007213) | i)) | (~(i12 | (-844696984)))) * 406) + 1641161541;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
        } else {
            Object[] objArr9 = new Object[1];
            c(null, null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(null, null, KeyEvent.keyCodeFromString("") + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            int i16 = g + 95;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 1641161541};
                byte[] bArr4 = $$d;
                Object[] objArr12 = new Object[1];
                d(bArr4[1], bArr4[14], bArr4[49], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                d((byte) (-bArr4[78]), bArr4[49], bArr4[14], objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    int i18 = g + 91;
                    TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                    int i19 = i18 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                        int maximumDrawingCacheSize2 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b5 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((byte) 51, b5, b5, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, edgeSlop, maximumDrawingCacheSize2, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(null, null, TextUtils.getOffsetBefore("", 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i20 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b6 = bArr5[5];
                            byte b7 = b6;
                            Object[] objArr17 = new Object[1];
                            a((byte) (-b6), bArr5[10], b7, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i20, jumpTapTimeout, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                            int iResolveOpacity2 = 10 + Drawable.resolveOpacity(0, 0);
                            byte[] bArr6 = $$a;
                            byte b8 = (byte) (-bArr6[5]);
                            Object[] objArr18 = new Object[1];
                            a(b8, (byte) (b8 & 5), bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, longPressTimeout, iResolveOpacity2, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        if (i22 == i21) {
            int i23 = g + 11;
            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
            int i24 = i23 % 2;
            int i25 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i26 = i25 + 2063533684 + ((1055487581 | i) * 376) + (((~((~i) | 549373849)) | 507588676) * (-376)) + (((~(i | (-549373850))) | (-509063621)) * 376);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
        } else {
            int[] iArr = new int[i22];
            int i29 = i22 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i22 * i29) % 2) - 1], 1).show();
            int i30 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i31 = i30 + 1027735392 + (((~(725605579 | i)) | (-765915809)) * (-964)) + (((~((~i) | 725605579)) | (-801111788)) * (-964));
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
        }
        int length = bArr.length;
        int i34 = ((int[]) objArr2[1])[0];
        int i35 = i34 * i34;
        int i36 = -(1387453865 * i34);
        int i37 = (i35 & i36) + (i35 | i36);
        int i38 = -(i34 * (-1317623233));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = (i39 ^ 69050512) + ((69050512 & i39) << 1);
        int i41 = i40 >> 22;
        int i42 = ((i41 ^ (-2047)) + ((i41 & (-2047)) << 1)) / 1024;
        int i43 = (i42 & 1) + (i42 | 1);
        int i44 = (i40 & i43) + (i43 | i40);
        int i45 = i40 >> 16;
        int i46 = ((i45 & (-131071)) + (i45 | (-131071))) / 65536;
        int i47 = (-(((i46 & 1) + (i46 | 1)) ^ i44)) + 2;
        int i48 = i47 >> 16;
        int i49 = ((i48 ^ (-131071)) + ((i48 & (-131071)) << 1)) / 65536;
        int i50 = (i49 & 1) + (i49 | 1);
        zzam.zze(0 / ((i47 & (-((i50 & 1) + (i50 | 1)))) * 1251), i2, length);
        while (i6 < i2) {
            zzc(appendable, bArr, i6, Math.min(this.zzb.zzd, i2 - i6));
            i6 += this.zzb.zzd;
        }
    }

    zzbe(String str, String str2, Character ch) {
        this(new zzbb(str, str2.toCharArray()), ch);
    }

    final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        int i3 = 2 % 2;
        zzam.zze(i, i + i2, bArr.length);
        int i4 = 0;
        if (i2 <= this.zzb.zzd) {
            int i5 = g + 97;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        zzam.zzc(z);
        long j = 0;
        int i7 = 0;
        while (i7 < i2) {
            j = (j | ((long) (bArr[i + i7] & UByte.MAX_VALUE))) << 8;
            i7++;
            int i8 = g + 79;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
            }
        }
        int i10 = this.zzb.zzb;
        while (i4 < i2 * 8) {
            int i11 = g + 43;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j >>> ((((i2 + 1) * 8) - i10) - i4)))));
            i4 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i4 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i4 += this.zzb.zzb;
            }
        }
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
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.fido.zzbe.$$c
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 + 67
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbe.$$g(byte, byte, short):java.lang.String");
    }
}
