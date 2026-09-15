package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhr extends zzmb implements zznn {
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, -8, 5, 78, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -23, 17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 77;
    private static final byte[] $$a = {46, 126, -84, 108, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 113;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 27005;
    private static char b = 5846;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 797;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 64898;

    /* synthetic */ zzhr(byte[] bArr) {
        super(zzhs.zzv());
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
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzhr.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 + 1
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
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
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzhr.$$d
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 * 11
            int r1 = r7 + 38
            int r6 = r6 * 48
            int r6 = 52 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + 3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.d(int, short, int, java.lang.Object[]):void");
    }

    public final List zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List listUnmodifiableList = Collections.unmodifiableList(((zzhs) this.zza).zza());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return listUnmodifiableList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzhs zzhsVar = (zzhs) this.zza;
        if (i3 != 0) {
            return zzhsVar.zzb();
        }
        zzhsVar.zzb();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzhw zzc(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zzhw zzhwVarZzc = ((zzhs) this.zza).zzc(i);
        int i5 = asInterface + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzhwVarZzc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzhr zzd(int i, zzhw zzhwVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            zzaX();
            ((zzhs) this.zza).zzm(i, zzhwVar);
            return this;
        }
        zzaX();
        ((zzhs) this.zza).zzm(i, zzhwVar);
        throw null;
    }

    public final zzhr zze(int i, zzhv zzhvVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            zzaX();
            ((zzhs) this.zza).zzm(i, (zzhw) zzhvVar.zzbc());
            return this;
        }
        zzaX();
        ((zzhs) this.zza).zzm(i, (zzhw) zzhvVar.zzbc());
        throw null;
    }

    public final zzhr zzf(zzhw zzhwVar) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzaX();
            ((zzhs) this.zza).zzn(zzhwVar);
            int i3 = 72 / 0;
        } else {
            zzaX();
            ((zzhs) this.zza).zzn(zzhwVar);
        }
        return this;
    }

    public final zzhr zzg(zzhv zzhvVar) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzaX();
        ((zzhs) this.zza).zzn((zzhw) zzhvVar.zzbc());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return this;
    }

    public final zzhr zzh(Iterable iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            zzaX();
            ((zzhs) this.zza).zzo(iterable);
            return this;
        }
        zzaX();
        ((zzhs) this.zza).zzo(iterable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i4 = $11 + 105;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) (47773 - (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i12, iKeyCodeFromString, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 468, 12 - ImageFormat.getBitsPerPixel(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i13 = $10 + 35;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    c = 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int packedPositionChild = 2322 - ExpandableListView.getPackedPositionChild(0L);
                int iResolveSizeAndState = 44 - View.resolveSizeAndState(0, 0, 0);
                byte b2 = (byte) ($$c[1] - 1);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, packedPositionChild, iResolveSizeAndState, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final String zzk() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            ((zzhs) this.zza).zzd();
            throw null;
        }
        String strZzd = ((zzhs) this.zza).zzd();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return strZzd;
    }

    public final boolean zzm() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzhs zzhsVar = (zzhs) this.zza;
        if (i3 != 0) {
            return zzhsVar.zze();
        }
        zzhsVar.zze();
        throw null;
    }

    public final long zzn() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            ((zzhs) this.zza).zzf();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZzf = ((zzhs) this.zza).zzf();
        int i3 = asInterface + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return jZzf;
    }

    public final long zzp() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzhs zzhsVar = (zzhs) this.zza;
        if (i3 == 0) {
            return zzhsVar.zzh();
        }
        zzhsVar.zzh();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0214  */
    public final zzhr zzi() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        zzaX();
        zzmf zzmfVar = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int iIndexOf = 921 - TextUtils.indexOf("", "");
            int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[80], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf, threadPriority, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{20640, 43248, 48745, 41876, 8476, 12757, 33314, 42485, 51139, 20126, 20119, 21388, 44528, 26865, 51447, 41357, 45626, 64286, 11352, 139, 6346, 39426, 44883, 46951}, 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{3898, 59831, 51865, 39500, 40324, 29460, 53786, 54673, 41257, 20516, 890, 33040, 51916, 2387, 31526, 51761, 18842, 12932}, 15 - KeyEvent.normalizeMetaState(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
            int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[7], (byte) 52, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                byte b3 = $$a[80];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 37), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, offsetBefore, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~elapsedCpuTime;
            int i6 = ((((~(i5 | 1174564564)) | ((~((-599515080) | i5)) | 565809411)) * (-397)) - 175335989) + ((elapsedCpuTime | 1706668307) * 397) + 1928236737;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{21329, 64663, 50978, 21870, 18088, 1732, 62197, 42353, 23403, 63838, 21886, 10887, 42564, 21781, 2975, 18123, 6020, 17070, 14017, 47434, 55967, 53674, 48657, 755, 59619, 54020, 43438, 15645}, 26 - TextUtils.indexOf("", "", 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{3138, 39221, 52307, 29509, 37474, 34569, 56525, 61415, 5052, 34803, 16514, 11688, 34971, 22652, 52086, 37404, 60987, 38176, 47042, 47107}, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = asInterface;
                int i10 = i9 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = i9 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
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
            c(new char[]{38761, 44259, 51254, 40027, 3829, 29215, 59967, 789, 51764, 32653, 56120, 61947, 58379, 63820, 6784, 39668, 6945, 4131}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{47325, 45619, 27018, 32873, 8353, 41869, 38644, 31480, 12352, 60134, 30688, 3626, 48700, 44116, 3362, 60178, 43573, 50349}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1928236737};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (-bArr3[35]);
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (bArr3[35] + 1);
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb2 = (char) ((-16745683) - Color.rgb(0, 0, 0));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                    byte b9 = $$a[80];
                    byte b10 = b9;
                    Object[] objArr15 = new Object[1];
                    a(b10, (byte) (b10 | 37), b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb2, packedPositionType, iNormalizeMetaState, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{20640, 43248, 48745, 41876, 8476, 12757, 33314, 42485, 51139, 20126, 20119, 21388, 44528, 26865, 51447, 41357, 45626, 64286, 11352, 139, 6346, 39426, 44883, 46951}, 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{3898, 59831, 51865, 39500, 40324, 29460, 53786, 54673, 41257, 20516, 890, 33040, 51916, 2387, 31526, 51761, 18842, 12932}, (Process.myPid() >> 22) + 15, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
                        int iIndexOf2 = TextUtils.indexOf("", "") + 921;
                        int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr4[7], (byte) 52, bArr4[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, iIndexOf2, iLastIndexOf2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                        int iMyPid = (Process.myPid() >> 22) + 921;
                        int size = View.MeasureSpec.getSize(0) + 28;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        Object[] objArr19 = new Object[1];
                        a(b11, bArr5[80], b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iMyPid, size, -1048449946, false, (String) objArr19[0], null);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i16}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = i15 + (-721234925) + (((~(iIdentityHashCode | 1555109777)) | 218969866) * 191) + (((~((~iIdentityHashCode) | 1555109777)) | 17571850) * 191);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
            ((zzhs) zzmfVar).zzp();
            return this;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i21 = i20 + 29;
            asInterface = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 + 103;
            asInterface = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 5 % 4;
            }
            while (i2 < strArr.length) {
                int i25 = asInterface + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                if (i25 % 2 != 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 110;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
        }
        throw null;
    }

    public final zzhr zzj(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzaX();
        ((zzhs) this.zza).zzq(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final zzhr zzl(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            zzaX();
            ((zzhs) this.zza).zzr(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzaX();
        ((zzhs) this.zza).zzr(str);
        int i3 = asInterface + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public final zzhr zzo(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            zzaX();
            ((zzhs) this.zza).zzs(j);
            int i3 = 14 / 0;
        } else {
            zzaX();
            ((zzhs) this.zza).zzs(j);
        }
        return this;
    }

    public final zzhr zzq(long j) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzaX();
        ((zzhs) this.zza).zzt(j);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final zzhr zzr(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzaX();
        ((zzhs) this.zza).zzu(j);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private zzhr() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.internal.measurement.zzhr.$$c
            int r8 = r8 * 2
            int r8 = 108 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.$$g(short, short, short):java.lang.String");
    }
}
