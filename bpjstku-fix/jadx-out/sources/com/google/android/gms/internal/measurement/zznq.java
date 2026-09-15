package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.zaq;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class zznq implements zznx {
    private static int $10 = 0;
    private static int $11 = 1;
    private final zznm zza;
    private final zzoi zzb;
    private final boolean zzc;
    private final zzls zzd;
    private static final byte[] $$d = {115, 98, 19, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 236;
    private static final byte[] $$a = {118, 35, -100, -35, -7, 23, -19, 25, -72, 55, 17, 9, -7, 6, -3, -63, 71, -1, -9, 0, -51, 39, 20, 0, 17, -11, 17, -39, 28, 22, -36, 31, -9, 0};
    private static final int $$b = 121;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1679701183462984834L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 106 - r7
            byte[] r0 = com.google.android.gms.internal.measurement.zznq.$$a
            int r9 = r9 * 4
            int r9 = r9 + 31
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
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
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-2)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznq.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 103 - r5
            byte[] r0 = com.google.android.gms.internal.measurement.zznq.$$d
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznq.b(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zznm zznmVar = this.zza;
        if (!(zznmVar instanceof zzmf)) {
            zznm zznmVarZzbf = zznmVar.zzcC().zzbf();
            int i5 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return zznmVarZzbf;
        }
        int i7 = i2 + 41;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            return ((zzmf) zznmVar).zzch();
        }
        ((zzmf) zznmVar).zzch();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zznz.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zznz.zzC(this.zzd, obj, obj2);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zZze = ((zzmc) obj).zzb.zze();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zZze;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i = 2 % 2;
        int iHashCode = ((zzmf) obj).zzc.hashCode();
        if (this.zzc) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r4
  0x0029: PHI (r4v7 com.google.android.gms.internal.measurement.zzmf) = (r4v6 com.google.android.gms.internal.measurement.zzmf), (r4v12 com.google.android.gms.internal.measurement.zzmf) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        zzmf zzmfVar;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            zzmfVar = (zzmf) obj;
            int i5 = 12 / 0;
            if (zzmfVar.zzc == zzoj.zza()) {
                zzmfVar.zzc = zzoj.zzb();
                int i6 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            zzmfVar = (zzmf) obj;
            if (zzmfVar.zzc == zzoj.zza()) {
                zzmfVar.zzc = zzoj.zzb();
                int i8 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i = 2 % 2;
        int iZzh = ((zzmf) obj).zzc.zzh();
        if (!this.zzc) {
            return iZzh;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iZzg = iZzh + ((zzmc) obj).zzb.zzg();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return iZzg;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        int i = 2 % 2;
        Iterator itZzc = ((zzmc) obj).zzb.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzlv zzlvVar = (zzlv) entry.getKey();
            if (zzlvVar.zzc() != zzou.MESSAGE || zzlvVar.zzd() || zzlvVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            if (entry instanceof zzmt) {
                int i5 = i2 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                zzovVar.zzv(zzlvVar.zza(), ((zzmt) entry).zza().zzc());
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                zzovVar.zzv(zzlvVar.zza(), entry.getValue());
            }
        }
        ((zzmf) obj).zzc.zzf(zzovVar);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 19472), 2625 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() + TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9053247990562531611L;
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.getDefaultSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 481, TextUtils.indexOf("", "") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19472), (ViewConfiguration.getScrollBarSize() >> 8) + 2624, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 39422), (Process.myTid() >> 22) + 481, TextUtils.indexOf("", "", 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 105;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39423), 482 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private zznq(zzoi zzoiVar, zzls zzlsVar, zznm zznmVar) {
        this.zzb = zzoiVar;
        this.zzc = zznmVar instanceof zzmc;
        this.zzd = zzlsVar;
        this.zza = zznmVar;
    }

    static zznq zzg(zzoi zzoiVar, zzls zzlsVar, zznm zznmVar) {
        int i = 2 % 2;
        zznq zznqVar = new zznq(zzoiVar, zzlsVar, zznmVar);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zznqVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x07ab  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        Constructor[] constructorArr;
        Class<?> cls;
        Class<?>[] clsArr;
        char c;
        int i;
        int i2;
        int i3;
        String string;
        int i4;
        int i5;
        int i6;
        Class<?> cls2;
        String str;
        Class<?>[] clsArr2;
        Class<?> cls3;
        char c2;
        int i7;
        int i8;
        int iIndexOf;
        int iTuitionPaymentFragmentbindingInflater1;
        int i9;
        char[] cArr;
        int iMyPid;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = TuitionPaymentFragmentbindingInflater1;
        int i14 = 1;
        int i15 = ((i13 | 23) << 1) - (i13 ^ 23);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
        int i16 = 0;
        if (i15 % 2 != 0) {
            constructorArr = new Constructor[0];
            byte[] bArr = $$a;
            byte b = bArr[19];
            Object[] objArr = new Object[1];
            a(b, bArr[17], b, objArr);
            cls = Class.forName((String) objArr[0]);
            clsArr = new Class[5];
            c = 1;
        } else {
            constructorArr = new Constructor[1];
            byte[] bArr2 = $$a;
            byte b2 = bArr2[19];
            Object[] objArr2 = new Object[1];
            a(b2, bArr2[17], b2, objArr2);
            cls = Class.forName((String) objArr2[0]);
            clsArr = new Class[2];
            c = 0;
        }
        clsArr[0] = byte[].class;
        clsArr[1] = String.class;
        constructorArr[c] = cls.getDeclaredConstructor(clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
            int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr3 = $$d;
            Object[] objArr3 = new Object[1];
            b(bArr3[2], bArr3[7], (byte) (-bArr3[5]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iNormalizeMetaState, keyRepeatTimeout, 1814927978, false, (String) objArr3[0], null);
        }
        Class<?>[] clsArr3 = null;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            char c3 = '0';
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0')), ExpandableListView.getPackedPositionChild(0L) + 2824, 22 - TextUtils.indexOf("", "", 0))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i17 = 0;
            while (i17 < length) {
                Method method = declaredMethods[i17];
                int i18 = TuitionPaymentFragmentbindingInflater1 + 73;
                int i19 = i18 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19;
                int i20 = i18 % 2;
                int i21 = (i19 ^ 57) + ((i19 & 57) << i14);
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = i21 % 2;
                try {
                    int i23 = -Color.alpha(i16);
                    int i24 = (i23 ^ 27733) + ((i23 & 27733) << i14);
                    Object[] objArr4 = new Object[i14];
                    c(new char[]{58867, 35245, 15685, 41223, 21731, 63580, 27654, 5028, 34646, 11082, 57017, 16987, 62979, 26020, 2394, 48385, 8381, 54290, 30766, 61363, 37705, 1800, 43704, 24158}, i24, objArr4);
                    Class<?> cls4 = Class.forName((String) objArr4[i16]);
                    int iIndexOf2 = TextUtils.indexOf("", c3, i16, i16) + 52370;
                    Object[] objArr5 = new Object[i14];
                    c(new char[]{58878, 10605, 31951, 32871, 55218, 6952, 11926, 29192, 33144, 54501, 6209, 12241}, iIndexOf2, objArr5);
                    int iIntValue = ((Integer) cls4.getMethod((String) objArr5[i16], clsArr3).invoke(method, clsArr3)).intValue();
                    Object[] objArr6 = new Object[i14];
                    int i25 = TuitionPaymentFragmentbindingInflater1 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                    int i26 = i25 % 2;
                    objArr6[i16] = Integer.valueOf(iIntValue);
                    char[] cArr2 = {58867, 58407, 58961, 57445, 58059, 60590, 61122, 59630, 60166, 62816, 63325, 61801, 62347, 64934, 65486, 63979, 63517, 64120, 50298, 50811, 49297, 49851, 52437, 52985, 51476, 52012};
                    int mode = View.MeasureSpec.getMode(i16);
                    int iTuitionPaymentFragmentbindingInflater2 = zaq.TuitionPaymentFragmentbindingInflater1();
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                    int i28 = i27 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i28;
                    int i29 = i27 % 2;
                    int i30 = 55 * mode;
                    int i31 = (i30 ^ (-51253)) + ((i30 & (-51253)) << i14);
                    int i32 = ~mode;
                    int i33 = ~(i32 | 479);
                    int i34 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i35 = (i28 ^ 37) + ((i28 & 37) << i14);
                    int i36 = i35 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i36;
                    if (i35 % 2 != 0) {
                        int i37 = ~(i34 | 479);
                        i6 = i31 >>> ((-108) - ((i37 & i33) | (i33 ^ i37)));
                        int i38 = ~((i32 & iTuitionPaymentFragmentbindingInflater2) | (i32 ^ iTuitionPaymentFragmentbindingInflater2));
                        int i39 = ~(((-480) & mode) | ((-480) ^ mode));
                        i5 = (i38 & i39) | (i38 ^ i39);
                    } else {
                        int i40 = ~((i34 & 479) | (i34 ^ 479));
                        int i41 = (i31 - (~(-(-(((i40 & i33) | (i33 ^ i40)) * (-108)))))) - 1;
                        i5 = (~(((-480) & mode) | ((-480) ^ mode))) | (~((i32 ^ iTuitionPaymentFragmentbindingInflater2) | (i32 & iTuitionPaymentFragmentbindingInflater2)));
                        i6 = i41;
                    }
                    int i42 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i43 = ~((i42 & mode) | (i42 ^ mode));
                    int i44 = (i6 - (~(-(-(54 * ((i5 & i43) | (i5 ^ i43))))))) - 1;
                    int i45 = ~((mode & (-480)) | ((-480) ^ mode));
                    int i46 = ((i45 & iTuitionPaymentFragmentbindingInflater2) | (iTuitionPaymentFragmentbindingInflater2 ^ i45)) * 54;
                    int i47 = ((i36 | 29) << 1) - (i36 ^ 29);
                    TuitionPaymentFragmentbindingInflater1 = i47 % 128;
                    if (i47 % 2 == 0) {
                        int i48 = i44 << i46;
                        Object[] objArr7 = new Object[1];
                        c(cArr2, i48, objArr7);
                        cls2 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        c(new char[]{58864, 39593, 6993, 38961, 6369, 39359, 7805, 40745}, 22494 - ExpandableListView.getPackedPositionChild(1L), objArr8);
                        str = (String) objArr8[0];
                        clsArr2 = new Class[0];
                        cls3 = Integer.TYPE;
                        c2 = 1;
                    } else {
                        int i49 = (i44 ^ i46) + ((i44 & i46) << 1);
                        Object[] objArr9 = new Object[1];
                        c(cArr2, i49, objArr9);
                        cls2 = Class.forName((String) objArr9[0]);
                        int i50 = -ExpandableListView.getPackedPositionChild(0L);
                        int i51 = (i50 ^ 32578) + ((i50 & 32578) << 1);
                        Object[] objArr10 = new Object[1];
                        c(new char[]{58864, 39593, 6993, 38961, 6369, 39359, 7805, 40745}, i51, objArr10);
                        str = (String) objArr10[0];
                        clsArr2 = new Class[1];
                        cls3 = Integer.TYPE;
                        c2 = 0;
                    }
                    int i52 = TuitionPaymentFragmentbindingInflater1 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52 % 128;
                    int i53 = i52 % 2;
                    clsArr2[c2] = cls3;
                    if (!(!((Boolean) cls2.getMethod(str, clsArr2).invoke(null, objArr6)).booleanValue())) {
                        int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i55 = (i54 & 77) + (i54 | 77);
                        TuitionPaymentFragmentbindingInflater1 = i55 % 128;
                        int i56 = i55 % 2;
                        Class cls5 = Long.TYPE;
                        char[] cArr3 = {58867, 35245, 15685, 41223, 21731, 63580, 27654, 5028, 34646, 11082, 57017, 16987, 62979, 26020, 2394, 48385, 8381, 54290, 30766, 61363, 37705, 1800, 43704, 24158};
                        char mirror = AndroidCharacter.getMirror('0');
                        int iTuitionPaymentFragmentbindingInflater3 = zaq.TuitionPaymentFragmentbindingInflater1();
                        int i57 = TuitionPaymentFragmentbindingInflater1 + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i57 % 128;
                        if (i57 % 2 != 0) {
                            i7 = ((-184) - (~(-mirror))) / (-27500);
                            i8 = (~mirror) | 27685;
                        } else {
                            int i58 = mirror * 65353;
                            i7 = (i58 | 5121725) + (i58 & 5121725);
                            int i59 = ~mirror;
                            i8 = (i59 & 27685) | (i59 ^ 27685);
                        }
                        int i60 = ~i8;
                        int i61 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i62 = ~((i61 & 27685) | (i61 ^ 27685));
                        int i63 = i7 + (184 * ((i60 & i62) | (i60 ^ i62)));
                        int i64 = -(-(((~((-27686) | mirror)) | iTuitionPaymentFragmentbindingInflater3) * (-184)));
                        int i65 = ~mirror;
                        int i66 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i67 = (i63 & i64) + (i63 | i64) + ((~((i66 & i65) | (i65 ^ i66))) * 184);
                        Object[] objArr11 = new Object[1];
                        c(cArr3, i67, objArr11);
                        Class<?> cls6 = Class.forName((String) objArr11[0]);
                        char[] cArr4 = {58878, 51259, 48739, 27806, 21216, 270, 63302, 42394, 35791, 32306, 11302, 4708, 49320};
                        int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i69 = (i68 ^ 93) + ((i68 & 93) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                        if (i69 % 2 == 0) {
                            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 1);
                            iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                            i9 = ((-500) << iIndexOf) << (-500);
                        } else {
                            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                            int i70 = iIndexOf * (-500);
                            i9 = (i70 | (-5860000)) + (i70 & (-5860000));
                        }
                        int i71 = ~((-11721) | iIndexOf);
                        int i72 = ~iIndexOf;
                        int i73 = (i72 & 11720) | (i72 ^ 11720);
                        int i74 = ~((i73 & iTuitionPaymentFragmentbindingInflater1) | (i73 ^ iTuitionPaymentFragmentbindingInflater1));
                        int i75 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING * ((i71 & i74) | (i71 ^ i74))));
                        int i76 = (i9 & i75) + (i9 | i75);
                        int i77 = TuitionPaymentFragmentbindingInflater1 + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i77 % 128;
                        int i78 = i77 % 2;
                        int i79 = ~iIndexOf;
                        int i80 = -(-(1002 * (~((i79 ^ (-11721)) | (i79 & (-11721))))));
                        int i81 = (i76 & i80) + (i80 | i76);
                        int i82 = (~iTuitionPaymentFragmentbindingInflater1) | i79;
                        int i83 = -(-((~((i82 & 11720) | (i82 ^ 11720))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                        int i84 = (i81 ^ i83) + ((i83 & i81) << 1);
                        Object[] objArr12 = new Object[1];
                        c(cArr4, i84, objArr12);
                        if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method, null))) {
                            int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i86 = (i85 & 123) + (i85 | 123);
                            TuitionPaymentFragmentbindingInflater1 = i86 % 128;
                            int i87 = i86 % 2;
                            int iGreen = Color.green(0);
                            int i88 = ((iGreen | 27733) << 1) - (iGreen ^ 27733);
                            Object[] objArr13 = new Object[1];
                            c(new char[]{58867, 35245, 15685, 41223, 21731, 63580, 27654, 5028, 34646, 11082, 57017, 16987, 62979, 26020, 2394, 48385, 8381, 54290, 30766, 61363, 37705, 1800, 43704, 24158}, i88, objArr13);
                            Class<?> cls7 = Class.forName((String) objArr13[0]);
                            int iGreen2 = Color.green(0);
                            int iTuitionPaymentFragmentbindingInflater4 = zaq.TuitionPaymentFragmentbindingInflater1();
                            int i89 = iGreen2 * (-55);
                            int i90 = (i89 & (-904585)) + (i89 | (-904585)) + (((~((iGreen2 ^ iTuitionPaymentFragmentbindingInflater4) | (iGreen2 & iTuitionPaymentFragmentbindingInflater4))) | 16447) * 56);
                            int i91 = (~((iGreen2 ^ 16447) | (iGreen2 & 16447))) * (-56);
                            int i92 = ~iTuitionPaymentFragmentbindingInflater4;
                            int i93 = ~((i92 & 16447) | (i92 ^ 16447));
                            int i94 = (((i90 & i91) + (i91 | i90)) - (~(-(-(((i93 & iGreen2) | (iGreen2 ^ i93)) * 56))))) - 1;
                            Object[] objArr14 = new Object[1];
                            c(new char[]{58878, 42435, 26003, 9588, 58628, 42192, 25730, 9293, 58372, 42970, 26506, 10078, 59193, 42707, 26267, 9805, 58906}, i94, objArr14);
                            Object[] objArr15 = (Object[]) cls7.getMethod((String) objArr14[0], null).invoke(method, null);
                            if (objArr15.length == 2 && Long.TYPE.equals(objArr15[0])) {
                                int i95 = TuitionPaymentFragmentbindingInflater1 + 5;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i95 % 128;
                                if (i95 % 2 != 0) {
                                    cArr = new char[]{58867, 35245, 15685, 41223, 21731, 63580, 27654, 5028, 34646, 11082, 57017, 16987, 62979, 26020, 2394, 48385, 8381, 54290, 30766, 61363, 37705, 1800, 43704, 24158};
                                    iMyPid = Process.myPid();
                                    i10 = 30170;
                                    i11 = 43;
                                } else {
                                    cArr = new char[]{58867, 35245, 15685, 41223, 21731, 63580, 27654, 5028, 34646, 11082, 57017, 16987, 62979, 26020, 2394, 48385, 8381, 54290, 30766, 61363, 37705, 1800, 43704, 24158};
                                    iMyPid = Process.myPid();
                                    i10 = 27733;
                                    i11 = 22;
                                }
                                int i96 = iMyPid >> i11;
                                int i97 = (i10 ^ i96) + ((i96 & i10) << 1);
                                Object[] objArr16 = new Object[1];
                                c(cArr, i97, objArr16);
                                if (Class.forName((String) objArr16[0]).equals(objArr15[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cResolveSize = (char) View.resolveSize(0, 0);
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                        int iArgb = 22 - Color.argb(0, 0, 0, 0);
                                        byte[] bArr4 = $$d;
                                        Object[] objArr17 = new Object[1];
                                        b(bArr4[2], bArr4[7], (byte) (-bArr4[5]), objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, iLastIndexOf, iArgb, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                        int iMyTid = 2823 - (Process.myTid() >> 22);
                                        int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                                        byte[] bArr5 = $$d;
                                        Object[] objArr18 = new Object[1];
                                        b(bArr5[2], bArr5[7], (byte) (-bArr5[5]), objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iMyTid, iResolveSizeAndState, 1814927978, false, (String) objArr18[0], null);
                                    }
                                    try {
                                        Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                            int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(0, 0);
                                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                                            byte[] bArr6 = $$d;
                                            byte b3 = bArr6[7];
                                            Object[] objArr20 = new Object[1];
                                            b(b3, (byte) (-bArr6[5]), b3, objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, iCombineMeasuredStates, touchSlop, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr19)).longValue();
                                        int i98 = TuitionPaymentFragmentbindingInflater1;
                                        int i99 = ((i98 | 109) << 1) - (i98 ^ 109);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i99 % 128;
                                        if (i99 % 2 == 0) {
                                            break;
                                        }
                                        throw null;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    i17++;
                    c3 = '0';
                    i14 = 1;
                    i16 = 0;
                    clsArr3 = null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c5 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int scrollDefaultDelay = 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr7 = $$d;
            Object[] objArr21 = new Object[1];
            b(bArr7[2], bArr7[7], (byte) (-bArr7[5]), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c5, scrollDefaultDelay, iMakeMeasureSpec, 1814927978, false, (String) objArr21[0], null);
        }
        Object[] objArr22 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
            int iGreen3 = Color.green(0) + 22;
            byte[] bArr8 = $$d;
            Object[] objArr23 = new Object[1];
            b((byte) (bArr8[51] - 1), (byte) (-bArr8[5]), bArr8[7], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, keyRepeatDelay, iGreen3, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22);
        Object[] objArr24 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37657);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2721;
            int iRed = 19 - Color.red(0);
            byte[] bArr9 = $$d;
            Object[] objArr25 = new Object[1];
            b(bArr9[14], (byte) (-bArr9[5]), bArr9[7], objArr25);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, modifierMetaStateMask, iRed, 865785343, false, (String) objArr25[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).longValue();
        long j = 66186033;
        long j2 = -1;
        long j3 = j ^ j2;
        long jNextInt = new Random().nextInt(1209112199);
        long j4 = (j3 | (jNextInt ^ j2)) ^ j2;
        long j5 = 338;
        long j6 = (((long) (-337)) * j) + (((long) 339) * jLongValue) + (((long) (-338)) * (j4 | (((jLongValue ^ j2) | j) ^ j2) | ((j | jNextInt) ^ j2))) + (((j3 | jLongValue) ^ j2) * j5) + (j5 * (j4 | ((jNextInt | (jLongValue | j)) ^ j2))) + ((long) (-1090241655));
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i100 = ~((-67765387) | iMaxMemory);
        int i101 = ~iMaxMemory;
        int i102 = (((int) (j6 >> 32)) & (635053320 + ((1476067195 | iElapsedRealtime) * (-627)) + (((~((-1473950500) | iElapsedRealtime)) | (-36724089)) * (-627)) + (((~(iElapsedRealtime | (-36724089))) | (~((~iElapsedRealtime) | 1473950499))) * 627))) | (((int) j6) & ((-2038855459) + ((i100 | (~((-4227393) | i101))) * 920) + (((~(1509219188 | i101)) | 67765386) * 920) + (((~(iMaxMemory | (-4227393))) | (~((-67765387) | i101)) | (~(1576984574 | iMaxMemory))) * 920)));
        int i103 = i102 >>> 24;
        int i104 = i102 & ViewCompat.MEASURED_SIZE_MASK;
        if (i103 != 0) {
            int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i106 = (i105 & 115) + (i105 | 115);
            TuitionPaymentFragmentbindingInflater1 = i106 % 128;
            i3 = (i106 % 2 == 0 ? 1 : i) ^ 1;
            i2 = 2;
        } else {
            int i107 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i107 % 128;
            i2 = 2;
            int i108 = i107 % 2;
            i3 = i;
        }
        if (i3 != 0) {
            int i109 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            int i110 = i109 % 128;
            TuitionPaymentFragmentbindingInflater1 = i110;
            int i111 = i109 % i2;
            int i112 = ((i110 | 67) << 1) - (i110 ^ 67);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
            int i113 = i112 % i2;
            i = 1;
        }
        if (i3 == 0 || i104 >= constructorArr.length) {
            string = null;
        } else {
            int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentbindingInflater1 = i114 % 128;
            int i115 = i114 % 2;
            Constructor constructor = constructorArr[i104];
            if (constructor != null) {
                string = constructor.toString();
            } else {
                string = null;
            }
        }
        list.add(string);
        int iTuitionPaymentFragmentbindingInflater5 = zaq.TuitionPaymentFragmentbindingInflater1();
        int i116 = TuitionPaymentFragmentbindingInflater1;
        int i117 = (i116 & 67) + (i116 | 67);
        int i118 = i117 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i118;
        int i119 = i117 % 2;
        int i120 = ~i103;
        int i121 = ~((i120 ^ iTuitionPaymentFragmentbindingInflater5) | (i120 & iTuitionPaymentFragmentbindingInflater5));
        int i122 = ~iTuitionPaymentFragmentbindingInflater5;
        int i123 = ~((i122 ^ 6) | (i122 & 6));
        int i124 = (((-3090) + (i103 * 517)) - (~((((i121 & i123) | (i121 ^ i123)) | (~(i122 | i103))) * (-516)))) - 1;
        int i125 = (i120 & (-7)) | ((-7) ^ i120);
        int i126 = ~((i125 & iTuitionPaymentFragmentbindingInflater5) | (i125 ^ iTuitionPaymentFragmentbindingInflater5));
        int i127 = i118 + 115;
        int i128 = i127 % 128;
        TuitionPaymentFragmentbindingInflater1 = i128;
        int i129 = i127 % 2;
        int i130 = ~iTuitionPaymentFragmentbindingInflater5;
        if (i129 == 0) {
            int i131 = ~(i130 | (-7) | i103);
            i4 = i124 % (516 << ((i131 & i126) | (i126 ^ i131)));
        } else {
            int i132 = (i130 & (-7)) | ((-7) ^ i130);
            int i133 = ~((i132 & i103) | (i132 ^ i103));
            i4 = i124 + (((i133 & i126) | (i126 ^ i133)) * 516);
        }
        int i134 = ~(((-7) ^ i103) | ((-7) & i103));
        int i135 = i128 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135 % 128;
        int i136 = i135 % 2;
        int i137 = ~(i103 | i122);
        int i138 = (i134 & i137) | (i134 ^ i137);
        return i136 != 0 ? (i4 << (516 >> i138)) / i : (i4 + (516 * i138)) * i;
    }
}
