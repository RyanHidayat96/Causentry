package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
class zzbnz implements zzblr {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile boolean zza;
    private zzblt zzb;
    private zzblr zzc;
    private zzbjv zzd;
    private zzbny zzf;
    private long zzg;
    private long zzh;
    private static final byte[] $$d = {25, -93, -120, -48, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -48, -17, 4, 15, Base64.padSymbol, -48, -12, 10, 62, -66, 13, 5, -4, 8, -2, 67, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 27, -17};
    private static final int $$e = 142;
    private static final byte[] $$a = {102, -96, -78, -55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 24;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2703714871182529286L;
    private List zze = new ArrayList();
    private List zzi = new ArrayList();

    zzbnz() {
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
    private static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 84 - r9
            byte[] r0 = com.google.android.libraries.places.internal.zzbnz.$$a
            int r8 = r8 * 15
            int r8 = 53 - r8
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnz.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 + 98
            byte[] r0 = com.google.android.libraries.places.internal.zzbnz.$$d
            int r7 = r7 * 50
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnz.d(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzg() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.zze = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.zza = r0     // Catch: java.lang.Throwable -> L3b
            com.google.android.libraries.places.internal.zzbny r0 = r3.zzf     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            if (r0 == 0) goto L1c
            r0.zze()
        L1c:
            return
        L1d:
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L3b
            r3.zze = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnz.zzg():void");
    }

    private final void zzh(Runnable runnable) {
        if (!(this.zzb != null)) {
            throw new IllegalStateException("May only be called after start");
        }
        synchronized (this) {
            if (this.zza) {
                runnable.run();
            } else {
                this.zze.add(runnable);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zzbjv zzbjvVar;
        boolean z;
        if (zzbltVar == null) {
            throw new NullPointerException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        if (!(this.zzb == null)) {
            throw new IllegalStateException("already started");
        }
        synchronized (this) {
            zzbjvVar = this.zzd;
            z = this.zza;
            if (!z) {
                zzbny zzbnyVar = new zzbny(zzbltVar);
                this.zzf = zzbnyVar;
                zzbltVar = zzbnyVar;
            }
            this.zzb = zzbltVar;
            this.zzg = System.nanoTime();
        }
        if (zzbjvVar != null) {
            zzbltVar.zzc(zzbjvVar, zzbls.PROCESSED, new zzbip());
        } else if (z) {
            zzi(zzbltVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public void zzl(zzbjv zzbjvVar) {
        boolean z = false;
        if (!(this.zzb != null)) {
            throw new IllegalStateException("May only be called after start");
        }
        if (zzbjvVar == null) {
            throw new NullPointerException("reason");
        }
        synchronized (this) {
            if (this.zzc == null) {
                zzj(zzbst.zza);
                this.zzd = zzbjvVar;
            } else {
                z = true;
            }
        }
        if (z) {
            zzh(new zzbns(this, zzbjvVar));
            return;
        }
        zzg();
        zze(zzbjvVar);
        this.zzb.zzc(zzbjvVar, zzbls.PROCESSED, new zzbip());
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.zza) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
            b = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        boolean zZzm = this.zzc.zzm();
        int i6 = TuitionPaymentFragmentbindingInflater1 + 97;
        b = i6 % 128;
        int i7 = i6 % 2;
        return zZzm;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public void zzn(zzbpl zzbplVar) {
        synchronized (this) {
            if (this.zzb == null) {
                return;
            }
            if (this.zzc != null) {
                zzbplVar.zzb("buffered_nanos", Long.valueOf(this.zzh - this.zzg));
                this.zzc.zzn(zzbplVar);
            } else {
                zzbplVar.zzb("buffered_nanos", Long.valueOf(System.nanoTime() - this.zzg));
                zzbplVar.zza("waiting_for_connection");
            }
        }
    }

    final Runnable zzo(zzblr zzblrVar) {
        synchronized (this) {
            if (this.zzc == null) {
                if (zzblrVar == null) {
                    throw new NullPointerException("stream");
                }
                zzj(zzblrVar);
                zzblt zzbltVar = this.zzb;
                if (zzbltVar == null) {
                    this.zze = null;
                    this.zza = true;
                }
                if (zzbltVar != null) {
                    zzi(zzbltVar);
                    return new zzbnp(this);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[PHI: r2
  0x001d: PHI (r2v5 com.google.android.libraries.places.internal.zzblr) = (r2v2 com.google.android.libraries.places.internal.zzblr), (r2v6 com.google.android.libraries.places.internal.zzblr) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 com.google.android.libraries.places.internal.zzblr) = (r2v2 com.google.android.libraries.places.internal.zzblr), (r2v6 com.google.android.libraries.places.internal.zzblr) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzj(zzblr zzblrVar) {
        zzblr zzblrVar2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            zzblrVar2 = this.zzc;
            int i4 = 78 / 0;
            if (zzblrVar2 == null) {
                z = true;
            } else {
                int i5 = i2 + 39;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            zzblrVar2 = this.zzc;
            if (zzblrVar2 == null) {
                z = true;
            } else {
                int i7 = i2 + 39;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (!z) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("realStream already set to %s", zzblrVar2));
        }
        this.zzc = zzblrVar;
        this.zzh = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (this.zzb == null) {
            int i5 = i3 + 19;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called before start");
        }
        this.zzi.add(new zzbno(this, zzbggVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 75;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zzb == null) {
            int i5 = i4 + 81;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called before start");
        }
        this.zzi.add(new zzbnn(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 47;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (this.zzb == null) {
            int i6 = i3 + 75;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called before start");
        }
        this.zzi.add(new zzbnm(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (this.zzb != null) {
            int i5 = i2 + 99;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (!z) {
            throw new IllegalStateException("May only be called after start");
        }
        zzh(new zzbnt(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!(this.zzb != null))) {
            throw new IllegalStateException("May only be called before start");
        }
        this.zzi.add(new zzbnj(this));
        int i3 = b + 21;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void zzi(zzblt zzbltVar) {
        Iterator it;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            it = this.zzi.iterator();
            int i3 = 95 / 0;
        } else {
            it = this.zzi.iterator();
        }
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
            b = i4 % 128;
            int i5 = i4 % 2;
            ((Runnable) it.next()).run();
        }
        this.zzi = null;
        this.zzc.zzf(zzbltVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.zzb == null) {
            int i5 = i2 + 61;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called before start");
        }
        if (zzbgjVar == null) {
            throw new NullPointerException("decompressorRegistry");
        }
        this.zzi.add(new zzbnl(this, zzbgjVar));
        int i7 = b + 77;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 39 / 0;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 123;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19472), View.MeasureSpec.makeMeasureSpec(0, 0) + 2624, TextUtils.getOffsetBefore("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() + (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 482, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19473), (KeyEvent.getMaxKeyCode() >> 16) + 2624, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39422), 480 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 91;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), (ViewConfiguration.getWindowTouchSlop() >> 8) + 481, (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = b + 7;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
            int iGreen = 3111 - Color.green(0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[40];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iGreen, offsetAfter, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{14972, 20500, 61111, 1370, 37870, 11895, 17427, 53986, 26954, 34801, 4661, 43043, 50864, 23893, 60363, 1649, 39936, 10889, 16719, 57303, 27250, 32773}, TextUtils.getTrimmedLength("") + 27239, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{14968, 64832, 46110, 28670, 9898, 55693, 37215, 18456, 1008, 15045, 64923, 46450, 27704, 9997, 57046}, 50993 - Color.green(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 3111;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, offsetAfter2, maximumDrawingCacheSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = b + 41;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter3 = (char) (TextUtils.getOffsetAfter("", 0) + 43042);
                int iAlpha = Color.alpha(0) + 3111;
                int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr3 = $$a;
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b6, bArr3[5], b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter3, iAlpha, bitsPerPixel, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int[] iArr2 = {i8};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~((-468411017) | iIdentityHashCode);
            int i10 = ~iIdentityHashCode;
            int i11 = ((((-1266554990) + ((i9 | (~(1236620442 | i10))) * (-1808))) + (((~((-161562761) | iIdentityHashCode)) | (~(i10 | 1543468698))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iIdentityHashCode | (-1236620443))) | 306848256) | (~(468411016 | i10))) * TypedValues.Custom.TYPE_BOOLEAN)) - 987228237;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            try {
                Object[] objArr8 = {null, Integer.valueOf(i), 0, -987228237};
                byte b7 = (byte) ($$d[11] + 1);
                byte b8 = (byte) (-b7);
                Object[] objArr9 = new Object[1];
                d(b7, b8, b8, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b9 = (byte) 0;
                Object[] objArr10 = new Object[1];
                d((byte) 49, b9, b9, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43042);
                    int iRgb = Color.rgb(0, 0, 0) + 16780327;
                    int maximumDrawingCacheSize2 = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[7];
                    Object[] objArr11 = new Object[1];
                    a(b10, bArr4[5], b10, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iRgb, maximumDrawingCacheSize2, 154975793, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{14972, 20500, 61111, 1370, 37870, 11895, 17427, 53986, 26954, 34801, 4661, 43043, 50864, 23893, 60363, 1649, 39936, 10889, 16719, 57303, 27250, 32773}, TextUtils.getCapsMode("", 0, 0) + 27239, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{14968, 64832, 46110, 28670, 9898, 55693, 37215, 18456, 1008, 15045, 64923, 46450, 27704, 9997, 57046}, 50993 - (KeyEvent.getMaxKeyCode() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                        int keyRepeatDelay = 3111 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int keyRepeatDelay2 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[5];
                        byte b12 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b11, b12, b12, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, keyRepeatDelay, keyRepeatDelay2, -1269618118, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3111;
                        int defaultSize = 22 - View.getDefaultSize(0, 0);
                        byte[] bArr6 = $$a;
                        byte b13 = bArr6[40];
                        byte b14 = bArr6[7];
                        Object[] objArr15 = new Object[1];
                        a(b13, b14, b14, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i14, defaultSize, -1272852037, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i17 = TuitionPaymentFragmentbindingInflater1 + 3;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = TuitionPaymentFragmentbindingInflater1 + 27;
        int i20 = i19 % 128;
        b = i20;
        int i21 = i19 % 2;
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[1])[0];
        new int[1][0] = i23;
        new int[1][0] = i24;
        int i25 = ~(1193815742 | i);
        int i26 = i22 + ((1090528922 | i25) * (-196)) + 1930955130 + ((i25 | 103286820) * 196);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        int[] iArr3 = {i28 ^ (i28 << 5)};
        int i29 = i20 + 99;
        TuitionPaymentFragmentbindingInflater1 = i29 % 128;
        int i30 = i29 % 2;
        int i31 = i20 + 31;
        TuitionPaymentFragmentbindingInflater1 = i31 % 128;
        int i32 = i31 % 2;
        boolean z = this.zzb != null;
        int i33 = iArr3[0];
        int i34 = i33 * i33;
        int i35 = -(434543477 * i33);
        int i36 = (((i34 & i35) + (i34 | i35)) - (~(-(i33 * (-4474551))))) - 1;
        int i37 = ((i36 | 505499457) << 1) - (505499457 ^ i36);
        int i38 = i37 >> 25;
        int i39 = (i37 - (~((((i38 ^ (-255)) + ((i38 & (-255)) << 1)) / 128) + 1))) - 1;
        int i40 = i37 >> 16;
        int i41 = (((-131071) & i40) + (i40 | (-131071))) / 65536;
        int i42 = -(i39 ^ (((i41 | 1) << 1) - (i41 ^ 1)));
        int i43 = (i42 ^ 4) + ((i42 & 4) << 1);
        int i44 = ((i43 >> 21) - 4095) / 2048;
        int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
        String strSubstring = "22,0,May only be called after start".substring(32340 / (((-((i45 ^ 1) + ((i45 & 1) << 1))) & i43) * 1617));
        if (!z) {
            throw new IllegalStateException(String.valueOf(strSubstring));
        }
        if (this.zza) {
            this.zzc.zzs(i);
        } else {
            zzh(new zzbni(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.zzb != null) {
            z = true;
        } else {
            int i4 = i2 + 95;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called after start");
        }
        if (this.zza) {
            this.zzc.zzu();
        } else {
            zzh(new zzbnr(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        int i = 2 % 2;
        boolean z = false;
        if (this.zzb == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
        }
        if (!z) {
            throw new IllegalStateException("May only be called before start");
        }
        if (zzbfuVar != null) {
            this.zzi.add(new zzbnk(this, zzbfuVar));
            int i3 = b + 39;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw new NullPointerException("compressor");
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zzb != null) {
            int i4 = i2 + 87;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("May only be called after start");
        }
        if (inputStream == null) {
            throw new NullPointerException("message");
        }
        if (!this.zza) {
            zzh(new zzbnq(this, inputStream));
            return;
        }
        int i6 = b + 101;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            this.zzc.zzt(inputStream);
        } else {
            this.zzc.zzt(inputStream);
            int i7 = 42 / 0;
        }
    }

    final /* synthetic */ void zzp() {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (KeyEvent.getMaxKeyCode() >> 16)), 40 - View.resolveSizeAndState(0, 0, 0), Color.red(0) + 19, 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionChild(0L) + 60, ExpandableListView.getPackedPositionType(0L) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarSize() >> 8)), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long jIdentityHashCode = System.identityHashCode(this);
        long j2 = -1;
        long j3 = jIdentityHashCode ^ j2;
        long j4 = 164;
        long j5 = j2 ^ 5005665762005140234L;
        long j6 = (((long) 165) * 513587735154646005L) + (((long) (-163)) * 5005665762005140234L) + (((long) (-328)) * (((j3 | 5005665762005140234L) ^ j2) | 513587735154646005L)) + ((jIdentityHashCode | 513587735154646005L) * j4) + (j4 * (((j3 | 5149782061173169151L) ^ j2) | (((j2 ^ 513587735154646005L) | j5) ^ j2) | ((j5 | jIdentityHashCode) ^ j2)));
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            int i7 = b + 109;
            int i8 = i7 % 128;
            TuitionPaymentFragmentbindingInflater1 = i8;
            int i9 = i7 % 2;
            i5++;
            int i10 = i8 + 111;
            b = i10 % 128;
            int i11 = i10 % 2;
            j = j6;
        }
        if (i4 != i2) {
            int i12 = TuitionPaymentFragmentbindingInflater1 + 57;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - TextUtils.indexOf("", "")), 40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                Toast.makeText((Context) null, i3 * ((i3 % (i3 / 0)) << 3), 1).show();
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (46400 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 19 - Color.green(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
            }
        }
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = 73 / 0;
        throw null;
    }

    protected void zze(zzbjv zzbjvVar) {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ zzblr zzq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 3;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzblr zzblrVar = this.zzc;
        int i5 = i2 + 33;
        b = i5 % 128;
        int i6 = i5 % 2;
        return zzblrVar;
    }
}
