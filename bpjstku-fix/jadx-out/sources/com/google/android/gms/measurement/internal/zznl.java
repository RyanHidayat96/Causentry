package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zznl extends zzg {
    private final zznf zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzay zzd;
    private ScheduledExecutorService zze;
    private final zzog zzf;
    private final List zzg;
    private final zzay zzh;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {64, 73, -26, 82, 2, -21, 2, -11, -6, -23, -8, 28, -46, -11, -14, -8, 24, -43, -6, 3, -4, -11, -11, 42, -56, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 26, -42, -10, -4, -29, 0, -17, 24, -43, -6, 3, -4, -11, -11, 12, -43, -6, 3, -11, -23, -9, -5, -12, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
    private static final int $$e = 23;
    private static final byte[] $$a = {14, 116, 92, -78, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 33;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60088, 60053, 60043, 60051, 60072, 60050, 60073, 60091, 60048, 60045, 60040, 60054, 60063, 60062, 60055, 60034, 60117, 60090, 60046, 60052, 60079, 60047, 60058, 60041, 60056};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    protected zznl(zzic zzicVar) {
        super(zzicVar);
        this.zzg = new ArrayList();
        this.zzf = new zzog(zzicVar.zzaZ());
        this.zza = new zznf(this);
        this.zzd = new zzmm(this, zzicVar);
        this.zzh = new zzmq(this, zzicVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.measurement.internal.zznl.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 24
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.measurement.internal.zznl.$$d
            int r8 = r8 * 34
            int r8 = r8 + 38
            int r6 = r6 * 71
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-9)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.c(byte, byte, int, java.lang.Object[]):void");
    }

    private final boolean zzad() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzu.zzaU();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    final /* synthetic */ void zzS(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                zzgb zzgbVar = this.zzb;
                if (zzgbVar == null) {
                    this.zzu.zzaV().zzb().zza("Failed to request trigger URIs; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgbVar.zzD(zzrVar, bundle, new zzme(this, atomicReference));
                zzae();
            } catch (RemoteException e2) {
                this.zzu.zzaV().zzb().zzb("Failed to request trigger URIs; remote exception", e2);
                atomicReference.notifyAll();
            }
        }
    }

    final /* synthetic */ void zzT(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        synchronized (atomicReference) {
            try {
                zzgb zzgbVar = this.zzb;
                if (zzgbVar == null) {
                    this.zzu.zzaV().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgbVar.zzB(zzrVar, zzooVar, new zzmf(this, atomicReference));
                zzae();
            } catch (RemoteException e2) {
                this.zzu.zzaV().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", e2);
                atomicReference.notifyAll();
            }
        }
    }

    public final boolean zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzg();
            zzb();
            int i3 = 58 / 0;
            if (this.zzb != null) {
                return true;
            }
        } else {
            zzg();
            zzb();
            if (this.zzb != null) {
                return true;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    protected final void zzG(zzlu zzluVar) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmn(this, zzluVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
    }

    protected final void zzk(boolean z) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzQ();
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void zzl() {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR();
            }
        });
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzC(AtomicReference atomicReference) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmi(this, atomicReference, zzah(false)));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmj(this, zzah(false), zzcuVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected final void zzF() {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzml(this, zzah(true)));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void zzL(zzgb zzgbVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = zzgbVar;
        zzae();
        zzag();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    protected final void zzi() {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmr(this, zzah(true)));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if (r6.zzu.zzk().zzah() >= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.zzaJ.zzb(null)).intValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r6.zzu.zzk().zzah() >= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.zzaJ.zzb(null)).intValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzO() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            r6.zzg()
            r6.zzb()
            boolean r1 = r6.zzK()
            r2 = 1
            if (r1 == 0) goto L65
            int r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 11
            int r3 = r1 % 128
            com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1 = r3
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L42
            com.google.android.gms.measurement.internal.zzic r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzpp r1 = r1.zzk()
            int r1 = r1.zzah()
            com.google.android.gms.measurement.internal.zzfx r5 = com.google.android.gms.measurement.internal.zzfy.zzaJ
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 56
            int r5 = r5 / r3
            if (r1 < r4) goto L5b
            goto L5a
        L42:
            com.google.android.gms.measurement.internal.zzic r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzpp r1 = r1.zzk()
            int r1 = r1.zzah()
            com.google.android.gms.measurement.internal.zzfx r5 = com.google.android.gms.measurement.internal.zzfy.zzaJ
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r1 < r4) goto L5b
        L5a:
            return r2
        L5b:
            int r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.zzO():boolean");
    }

    final boolean zzP() {
        int i = 2 % 2;
        zzg();
        zzb();
        if (!zzK()) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return this.zzu.zzk().zzah() >= 241200;
        }
        this.zzu.zzk().zzah();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzW(ComponentName componentName) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            this.zzu.zzaV().zzk().zzb("Disconnected from device MeasurementService", componentName);
            zzg();
            zzI();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final void zzj(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzg();
            zzb();
            zzO();
            throw null;
        }
        zzg();
        zzb();
        if (zzO()) {
            zzaf(new zzms(this, zzah(false)));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void zzae() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((Long) zzfy.zzY.zzb(null)).longValue());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzM() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzb();
        zznf zznfVar = this.zza;
        zznfVar.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzu.zzaY(), zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        Object obj = null;
        this.zzb = null;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected final void zzA(zzpl zzplVar) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzad();
        zzaf(new zzmg(this, zzah(true), this.zzu.zzm().zzj(zzplVar), zzplVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    protected final void zzB() {
        int i = 2 % 2;
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(false);
        zzad();
        this.zzu.zzm().zzh();
        zzaf(new zzmh(this, zzrVarZzah));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r0 = zzah(false);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
        r1.zzz(r0);
        zzae();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r4.zzu.zzaV().zzb().zzb("Failed to send Dma consent settings to the service", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r4.zzu.zzaV().zzb().zza("Failed to send Dma consent settings to service");
        r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1 + 103;
        com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void zzR() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            com.google.android.gms.measurement.internal.zzgb r1 = r4.zzb
            r3 = 29
            int r3 = r3 / r2
            if (r1 != 0) goto L39
            goto L1b
        L17:
            com.google.android.gms.measurement.internal.zzgb r1 = r4.zzb
            if (r1 != 0) goto L39
        L1b:
            com.google.android.gms.measurement.internal.zzic r1 = r4.zzu
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzb()
            java.lang.String r3 = "Failed to send Dma consent settings to service"
            r1.zza(r3)
            int r1 = com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 103
            int r3 = r1 % 128
            com.google.android.gms.measurement.internal.zznl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L38
            r0 = 85
            int r0 = r0 / r2
        L38:
            return
        L39:
            com.google.android.gms.measurement.internal.zzr r0 = r4.zzah(r2)     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: android.os.RemoteException -> L47
            r1.zzz(r0)     // Catch: android.os.RemoteException -> L47
            r4.zzae()     // Catch: android.os.RemoteException -> L47
            return
        L47:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzic r1 = r4.zzu
            com.google.android.gms.measurement.internal.zzgu r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzb()
            java.lang.String r2 = "Failed to send Dma consent settings to the service"
            r1.zzb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.zzR():void");
    }

    private final zzr zzah(boolean z) {
        Pair pairZzb;
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        zzicVar.zzaU();
        zzgi zzgiVarZzv = this.zzu.zzv();
        String string = null;
        if (z) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                zzhf zzhfVar = zzicVar.zzaV().zzu.zzd().zzb;
                throw null;
            }
            zzic zzicVar2 = zzicVar.zzaV().zzu;
            if (zzicVar2.zzd().zzb != null && (pairZzb = zzicVar2.zzd().zzb.zzb()) != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 != 0) {
                    Pair pair = zzhh.zza;
                    throw null;
                }
                if (pairZzb == zzhh.zza) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 5;
                    }
                } else {
                    String strValueOf = String.valueOf(pairZzb.second);
                    String str = (String) pairZzb.first;
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length());
                    sb.append(strValueOf);
                    sb.append(":");
                    sb.append(str);
                    string = sb.toString();
                }
            }
        }
        return zzgiVarZzv.zzh(string);
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcu zzcuVar, zzbg zzbgVar, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzg();
            zzb();
            this.zzu.zzk().zzai(12451000);
            throw null;
        }
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzai(12451000) != 0) {
            zzicVar.zzaV().zze().zza("Not bundling data. Service unavailable or out of date");
            zzicVar.zzk().zzao(zzcuVar, new byte[0]);
        } else {
            zzaf(new zzmp(this, zzbgVar, str, zzcuVar));
            int i3 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    final /* synthetic */ void zzQ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            this.zzu.zzaV().zzb().zza("Failed to send storage consent settings to service");
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
                return;
            }
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgbVar.zzy(zzrVarZzah);
            zzae();
        } catch (RemoteException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to send storage consent settings to the service", e2);
        }
    }

    final /* synthetic */ void zzU(zzr zzrVar, zzaf zzafVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            this.zzu.zzaV().zzb().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzgbVar.zzC(zzrVar, zzafVar);
            zzae();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            this.zzu.zzaV().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e2);
        }
    }

    private final void zzaf(Runnable runnable) throws IllegalStateException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        if (zzh()) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            runnable.run();
            return;
        }
        List list = this.zzg;
        long size = list.size();
        zzic zzicVar = this.zzu;
        zzicVar.zzc();
        if (size >= 1000) {
            zzicVar.zzaV().zzb().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzb(60000L);
        zzI();
    }

    private final void zzag() {
        int i = 2 % 2;
        zzg();
        zzgs zzgsVarZzk = this.zzu.zzaV().zzk();
        List list = this.zzg;
        zzgsVarZzk.zzb("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                ((Runnable) it.next()).run();
                throw null;
            }
            try {
                ((Runnable) it.next()).run();
                int i3 = TuitionPaymentFragmentbindingInflater1 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            } catch (RuntimeException e2) {
                this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", e2);
            }
            this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", e2);
        }
        this.zzg.clear();
        this.zzh.zzd();
    }

    protected final void zzE() {
        int i = 2 % 2;
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(true);
        zzad();
        this.zzu.zzc().zzp(null, zzfy.zzbb);
        this.zzu.zzm().zzn();
        zzaf(new zzmk(this, zzrVarZzah, true));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    public final void zzH(Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        zzg();
        zzb();
        zzbe zzbeVar = new zzbe(bundle);
        zzad();
        if (this.zzu.zzc().zzp(null, zzfy.zzbb)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                this.zzu.zzm().zzl(zzbeVar);
                throw null;
            }
            if (this.zzu.zzm().zzl(zzbeVar)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i4 = i3 + 45;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                boolean z2 = i4 % 2 == 0;
                int i5 = i3 + 97;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                z = z2;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        zzaf(new zzmo(this, true, zzah(false), z, zzbeVar, bundle));
    }

    final void zzI() {
        int i = 2 % 2;
        zzg();
        zzb();
        if (zzh()) {
            return;
        }
        if (zzK()) {
            this.zza.zzc();
            return;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzE()) {
            return;
        }
        zzicVar.zzaU();
        List<ResolveInfo> listQueryIntentServices = zzicVar.zzaY().getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices != null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            if (!listQueryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context contextZzaY = zzicVar.zzaY();
                zzicVar.zzaU();
                intent.setComponent(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent);
                return;
            }
        }
        zzicVar.zzaV().zzb().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    final boolean zzK() {
        Boolean boolValueOf;
        int iZzai;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            zzg();
            zzb();
            throw null;
        }
        zzg();
        zzb();
        if (this.zzc == null) {
            zzg();
            zzb();
            zzic zzicVar = this.zzu;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            boolean z = false;
            if (zzhhVarZzd.zzd().contains("use_service")) {
                boolValueOf = Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("use_service", false));
            } else {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                boolValueOf = null;
            }
            boolean z2 = true;
            if (boolValueOf != null) {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                if (!boolValueOf.booleanValue()) {
                    zzicVar.zzaU();
                    if (this.zzu.zzv().zzo() == 1) {
                        z = true;
                    } else {
                        zzicVar.zzaV().zzk().zza("Checking service availability");
                        iZzai = zzicVar.zzk().zzai(12451000);
                        if (iZzai != 0) {
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i9 = i + 119;
                            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                            int i10 = i9 % 2;
                            if (iZzai != 1) {
                                int i11 = i + 125;
                                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                int i12 = i11 % 2;
                                if (iZzai != 2) {
                                    if (iZzai != 3) {
                                        int i13 = i + 59;
                                        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                        int i14 = i13 % 2;
                                        if (iZzai != 9) {
                                            zzicVar.zzaV().zze().zza("Service invalid");
                                        } else if (iZzai != 18) {
                                            zzicVar.zzaV().zze().zzb("Unexpected service status", Integer.valueOf(iZzai));
                                        } else {
                                            zzicVar.zzaV().zze().zza("Service updating");
                                        }
                                    } else {
                                        zzicVar.zzaV().zze().zza("Service disabled");
                                    }
                                    i2 = TuitionPaymentFragmentbindingInflater1 + 79;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        int i15 = 4 / 3;
                                    }
                                    z2 = false;
                                } else {
                                    zzicVar.zzaV().zzj().zza("Service container out of date");
                                    if (zzicVar.zzk().zzah() >= 17443) {
                                        z = boolValueOf == null;
                                        z2 = false;
                                    }
                                }
                            } else {
                                zzicVar.zzaV().zzk().zza("Service missing");
                            }
                        } else {
                            zzicVar.zzaV().zzk().zza("Service available");
                            int i16 = TuitionPaymentFragmentbindingInflater1 + 117;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        z = true;
                    }
                    if (!z) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        int i19 = i18 % 2;
                        if (zzicVar.zzc().zzE()) {
                            zzicVar.zzaV().zzb().zza("No way to upload. Consider using the full version of Analytics");
                        } else if (z2) {
                            zzhh zzhhVarZzd2 = zzicVar.zzd();
                            zzhhVarZzd2.zzg();
                            SharedPreferences.Editor editorEdit = zzhhVarZzd2.zzd().edit();
                            editorEdit.putBoolean("use_service", z);
                            editorEdit.apply();
                        }
                    } else if (z2) {
                        zzhh zzhhVarZzd3 = zzicVar.zzd();
                        zzhhVarZzd3.zzg();
                        SharedPreferences.Editor editorEdit2 = zzhhVarZzd3.zzd().edit();
                        editorEdit2.putBoolean("use_service", z);
                        editorEdit2.apply();
                    }
                    z2 = z;
                } else {
                    int i20 = TuitionPaymentFragmentbindingInflater1 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    if (i20 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                zzicVar.zzaU();
                if (this.zzu.zzv().zzo() == 1) {
                    z = true;
                } else {
                    zzicVar.zzaV().zzk().zza("Checking service availability");
                    iZzai = zzicVar.zzk().zzai(12451000);
                    if (iZzai != 0) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i21 = i + 119;
                        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                        int i110 = i21 % 2;
                        if (iZzai != 1) {
                            int i111 = i + 125;
                            TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                            int i112 = i111 % 2;
                            if (iZzai != 2) {
                                if (iZzai != 3) {
                                    int i113 = i + 59;
                                    TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                                    int i114 = i113 % 2;
                                    if (iZzai != 9) {
                                        zzicVar.zzaV().zze().zza("Service invalid");
                                    } else if (iZzai != 18) {
                                        zzicVar.zzaV().zze().zzb("Unexpected service status", Integer.valueOf(iZzai));
                                    } else {
                                        zzicVar.zzaV().zze().zza("Service updating");
                                    }
                                } else {
                                    zzicVar.zzaV().zze().zza("Service disabled");
                                }
                                i2 = TuitionPaymentFragmentbindingInflater1 + 79;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i115 = 4 / 3;
                                }
                                z2 = false;
                            } else {
                                zzicVar.zzaV().zzj().zza("Service container out of date");
                                if (zzicVar.zzk().zzah() >= 17443) {
                                    z = boolValueOf == null;
                                    z2 = false;
                                }
                            }
                        } else {
                            zzicVar.zzaV().zzk().zza("Service missing");
                        }
                    } else {
                        zzicVar.zzaV().zzk().zza("Service available");
                        int i116 = TuitionPaymentFragmentbindingInflater1 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i116 % 128;
                        int i117 = i116 % 2;
                    }
                    z = true;
                }
                if (!z) {
                    int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    TuitionPaymentFragmentbindingInflater1 = i118 % 128;
                    int i119 = i118 % 2;
                    if (zzicVar.zzc().zzE()) {
                        zzicVar.zzaV().zzb().zza("No way to upload. Consider using the full version of Analytics");
                    } else if (z2) {
                        zzhh zzhhVarZzd4 = zzicVar.zzd();
                        zzhhVarZzd4.zzg();
                        SharedPreferences.Editor editorEdit3 = zzhhVarZzd4.zzd().edit();
                        editorEdit3.putBoolean("use_service", z);
                        editorEdit3.apply();
                    }
                } else if (z2) {
                    zzhh zzhhVarZzd5 = zzicVar.zzd();
                    zzhhVarZzd5.zzg();
                    SharedPreferences.Editor editorEdit4 = zzhhVarZzd5.zzd().edit();
                    editorEdit4.putBoolean("use_service", z);
                    editorEdit4.apply();
                }
                z2 = z;
            }
            this.zzc = Boolean.valueOf(z2);
        }
        return this.zzc.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x012c  */
    final void zzm(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        long jElapsedRealtime;
        long j;
        long jCurrentTimeMillis;
        long j2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzg();
        zzb();
        zzad();
        zzic zzicVar = this.zzu;
        zzicVar.zzc();
        zzr zzrVar2 = zzrVar;
        int size = 100;
        int i5 = 0;
        for (int i6 = 100; i5 < 1001 && size == i6; i6 = 100) {
            zzic zzicVar2 = this.zzu;
            ArrayList arrayList = new ArrayList();
            List listZzm = zzicVar2.zzm().zzm(i6);
            if (listZzm != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % i;
                arrayList.addAll(listZzm);
                size = listZzm.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null) {
                int i9 = TuitionPaymentFragmentbindingInflater1 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % i;
                if (size < i6) {
                    arrayList.add(new zzgk(abstractSafeParcelable, zzrVar2.zzc, zzrVar2.zzj));
                }
            }
            String str = null;
            boolean zZzp = zzicVar.zzc().zzp(null, zzfy.zzaO);
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                zzgk zzgkVar = (zzgk) arrayList.get(i11);
                AbstractSafeParcelable abstractSafeParcelable2 = zzgkVar.zza;
                if (zzicVar.zzc().zzp(str, zzfy.zzbb)) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                    if (i12 % 2 != 0) {
                        TextUtils.isEmpty(zzgkVar.zzb);
                        throw null;
                    }
                    String str2 = zzgkVar.zzb;
                    if (!TextUtils.isEmpty(str2)) {
                        zzrVar2 = new zzr(zzrVar2.zza, zzrVar2.zzb, str2, zzgkVar.zzc, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE);
                    }
                }
                zzr zzrVar3 = zzrVar2;
                if (abstractSafeParcelable2 instanceof zzbg) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i14 = i13 + 21;
                    TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                    int i15 = i14 % 2;
                    if (!zZzp) {
                        int i16 = i13 + 125;
                        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 2 / 2;
                        }
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    } else {
                        try {
                            zzic zzicVar3 = this.zzu;
                            jCurrentTimeMillis = zzicVar3.zzaZ().currentTimeMillis();
                            try {
                                jElapsedRealtime = zzicVar3.zzaZ().elapsedRealtime();
                            } catch (RemoteException e2) {
                                e = e2;
                                j = jCurrentTimeMillis;
                                jElapsedRealtime = 0;
                                this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                                if (!(!zZzp) && j != 0) {
                                    zzic zzicVar4 = this.zzu;
                                    zzgq.zza(zzicVar4).zzb(36301, 13, j, zzicVar4.zzaZ().currentTimeMillis(), (int) (zzicVar4.zzaZ().elapsedRealtime() - jElapsedRealtime));
                                }
                                str = null;
                                i11++;
                                zzrVar2 = zzrVar3;
                            }
                        } catch (RemoteException e3) {
                            e = e3;
                            jElapsedRealtime = 0;
                            j = 0;
                        }
                    }
                    try {
                        zzgbVar.zze((zzbg) abstractSafeParcelable2, zzrVar3);
                        if (zZzp) {
                            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                            int i19 = i18 % 2;
                            zzicVar.zzaV().zzk().zza("Logging telemetry for logEvent from database");
                            zzic zzicVar5 = this.zzu;
                            j2 = jCurrentTimeMillis;
                            try {
                                zzgq.zza(zzicVar5).zzb(36301, 0, j2, zzicVar5.zzaZ().currentTimeMillis(), (int) (zzicVar5.zzaZ().elapsedRealtime() - jElapsedRealtime));
                            } catch (RemoteException e4) {
                                e = e4;
                                j = j2;
                                this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                                if (!(!zZzp)) {
                                    zzic zzicVar6 = this.zzu;
                                    zzgq.zza(zzicVar6).zzb(36301, 13, j, zzicVar6.zzaZ().currentTimeMillis(), (int) (zzicVar6.zzaZ().elapsedRealtime() - jElapsedRealtime));
                                }
                            }
                        }
                    } catch (RemoteException e5) {
                        e = e5;
                        j2 = jCurrentTimeMillis;
                    }
                } else if (abstractSafeParcelable2 instanceof zzpl) {
                    int i20 = TuitionPaymentFragmentbindingInflater1 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        zzgbVar.zzf((zzpl) abstractSafeParcelable2, zzrVar3);
                    } catch (RemoteException e6) {
                        this.zzu.zzaV().zzb().zzb("Failed to send user property to the service", e6);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof zzah) {
                        try {
                            zzgbVar.zzn((zzah) abstractSafeParcelable2, zzrVar3);
                        } catch (RemoteException e7) {
                            this.zzu.zzaV().zzb().zzb("Failed to send conditional user property to the service", e7);
                        }
                    } else {
                        zzic zzicVar7 = this.zzu;
                        str = null;
                        if (zzicVar7.zzc().zzp(null, zzfy.zzbb) && (abstractSafeParcelable2 instanceof zzbe)) {
                            try {
                                zzgbVar.zzu(((zzbe) abstractSafeParcelable2).zzf(), zzrVar3);
                            } catch (RemoteException e8) {
                                this.zzu.zzaV().zzb().zzb("Failed to send default event parameters to the service", e8);
                            }
                        } else {
                            zzicVar7.zzaV().zzb().zza("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i11++;
                    zzrVar2 = zzrVar3;
                }
                str = null;
                i11++;
                zzrVar2 = zzrVar3;
            }
            i5++;
            i = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x0150  */
    /* JADX WARN: Code duplicated, block: B:43:0x019c A[Catch: all -> 0x0383, TryCatch #1 {all -> 0x0383, blocks: (B:19:0x0083, B:22:0x0098, B:23:0x00cc, B:41:0x0152, B:43:0x019c, B:44:0x0213), top: B:79:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0226  */
    /* JADX WARN: Code duplicated, block: B:50:0x0263 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:48:0x0228, B:50:0x0263, B:52:0x02d1), top: B:77:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0304  */
    /* JADX WARN: Code duplicated, block: B:62:0x0336  */
    private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                        int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                        byte b2 = $$c[0];
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, absoluteGravity, iResolveSizeAndState, -1927765101, false, $$g(b3, (byte) (b3 - 1), b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i8++;
                    i5 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
                int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
                byte b4 = $$c[0];
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iLastIndexOf, i9, -1927765101, false, $$g(b5, (byte) (b5 - 1), b4), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i3 = i - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i10 = $10 + 53;
                $11 = i10 % 128;
                i2 = 2;
                int i11 = i10 % 2;
            } else {
                i2 = 2;
                i3 = i;
            }
            if (i3 > 1) {
                int i12 = $11 + 21;
                $10 = i12 % 128;
                int i13 = i12 % i2;
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                    int i14 = $10 + 51;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumFlingVelocity = (char) (49267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3261;
                                int iGreen = 30 - Color.green(0);
                                byte b6 = $$c[0];
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, jumpTapTimeout, iGreen, -127612708, false, $$g(b7, (byte) (-b7), b6), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                try {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b8 = (byte) 3;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - KeyEvent.getDeadChar(0, 0)), 594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0'), 1570859318, false, $$g(b8, (byte) (b8 - 4), $$c[0]), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i16 = $10 + 53;
                                    $11 = i16 % 128;
                                    int i17 = i16 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                } else {
                                    int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                                }
                            }
                        }
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumFlingVelocity2 = (char) (49267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3261;
                                int iGreen2 = 30 - Color.green(0);
                                byte b9 = $$c[0];
                                byte b10 = (byte) (b9 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity2, jumpTapTimeout2, iGreen2, -127612708, false, $$g(b10, (byte) (-b10), b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b11 = (byte) 3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - KeyEvent.getDeadChar(0, 0)), 594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0'), 1570859318, false, $$g(b11, (byte) (b11 - 4), $$c[0]), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i111 = $10 + 53;
                                    $11 = i111 % 128;
                                    int i112 = i111 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                                } else {
                                    int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                                }
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i24 = 0;
            while (i24 < i) {
                int i25 = $11 + 87;
                $10 = i25 % 128;
                if (i25 % 2 != 0) {
                    cArr4[i24] = (char) (cArr4[i24] ^ 602);
                    i24 += 71;
                } else {
                    cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                    i24++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    protected final void zzq(AtomicReference atomicReference, String str, String str2, String str3) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmv(this, atomicReference, null, str2, str3, zzah(false)));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void zzs(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmw(this, str, str2, zzah(false), zzcuVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
    }

    protected final void zzt(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmx(this, atomicReference, null, str2, str3, zzah(false), z));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void zzu(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2, boolean z) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmc(this, str, str2, zzah(false), z, zzcuVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
    }

    protected final void zzv(AtomicReference atomicReference, boolean z) {
        int i = 2 % 2;
        zzg();
        zzb();
        zzaf(new zzmd(this, atomicReference, zzah(false), z));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final void zzw(final AtomicReference atomicReference, final Bundle bundle) {
        int i = 2 % 2;
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS(atomicReference, zzrVarZzah, bundle);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected final void zzx(final AtomicReference atomicReference, final zzoo zzooVar) {
        int i = 2 % 2;
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT(atomicReference, zzrVarZzah, zzooVar);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected final void zzy(final zzaf zzafVar) {
        int i = 2 % 2;
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(true);
        Preconditions.checkNotNull(zzrVarZzah);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzU(zzrVarZzah, zzafVar);
            }
        });
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0233  */
    /* JADX WARN: Code duplicated, block: B:26:0x023d  */
    /* JADX WARN: Type inference failed for: r3v26, types: [boolean, int] */
    protected final void zzn(zzbg zzbgVar, String str) {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(zzbgVar);
        zzg();
        zzb();
        zzad();
        zzic zzicVar = this.zzu;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte[] bArr = $$a;
            byte b = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b, bArr[7], b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionChild, tapTimeout, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new char[]{21, 2, '\r', 22, 15, '\t', 11, 17, 15, 14, 19, 1, 20, 15, 23, 11, '\n', 1, 19, 24, 23, '\t'}, (byte) (49 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new char[]{14, '\n', 2, 7, 11, 14, 11, 7, '\f', 23, 11, 24, 6, '\n', 13931}, (byte) (KeyEvent.keyCodeFromString("") + 108), Process.getGidForName("") + 16, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (Color.red(0) + 31533);
            int iBlue = 921 - Color.blue(0);
            int gidForName = Process.getGidForName("") + 29;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iBlue, gidForName, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                byte b5 = bArr2[80];
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, keyRepeatDelay, maximumDrawingCacheSize, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyPid = Process.myPid();
            int i4 = (((~((-1519767522) | iMyPid)) | 1438495067) * 398) + 1131453159 + (((~((~iMyPid) | (-1519767522))) | 1438495067) * 398) + 989501760;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(new char[]{21, 2, '\r', 22, 15, '\t', 11, 17, 2, 7, 1, 17, 19, 22, 20, 6, 5, 6, 20, 16, 23, 0, 3, 18, 2, 17}, (byte) (84 - ExpandableListView.getPackedPositionType(0L)), TextUtils.lastIndexOf("", '0', 0, 0) + 27, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(new char[]{23, 19, 13837, 13837, 11, 3, 22, 16, 13839, 13839, '\n', '\t', 20, 23, 20, 6, 16, 4}, (byte) (View.resolveSize(0, 0) + 37), 18 - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 24 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            int i9 = TuitionPaymentFragmentbindingInflater1 + 85;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        int i11 = TuitionPaymentFragmentbindingInflater1 + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        int i12 = i11 % 2;
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), 0, 989501760};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[57];
                byte b7 = bArr3[26];
                Object[] objArr12 = new Object[1];
                c(b6, b7, b7, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = bArr3[26];
                byte b9 = bArr3[57];
                Object[] objArr13 = new Object[1];
                c(b8, b9, b9, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                    int i13 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[7];
                    byte b11 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    a(b10, b11, (byte) (b11 | 37), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, i13, packedPositionType, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    b(new char[]{21, 2, '\r', 22, 15, '\t', 11, 17, 15, 14, 19, 1, 20, 15, 23, 11, '\n', 1, 19, 24, 23, '\t'}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49), Color.blue(0) + 22, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    b(new char[]{14, '\n', 2, 7, 11, 14, 11, 7, '\f', 23, 11, 24, 6, '\n', 13931}, (byte) (108 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                        byte b12 = $$a[80];
                        byte b13 = b12;
                        Object[] objArr18 = new Object[1];
                        a(b12, b13, (byte) (b13 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, tapTimeout2, keyRepeatTimeout, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild2 = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                        int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int tapTimeout3 = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b14 = bArr5[80];
                        byte b15 = b14;
                        byte b16 = bArr5[7];
                        byte b17 = b14;
                        Object[] objArr19 = new Object[1];
                        a(b15, b16, b17, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild2, iMakeMeasureSpec, tapTimeout3, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i17 = ~Process.myTid();
            int i18 = i16 + (-558376287) + (((-360972306) | i17) * 494) + (((~(i17 | 1245330790)) | (-1438526548)) * 494);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = i21 % 2;
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            int[] iArr = new int[i15];
            int i23 = i15 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = i24 + 1824764935 + (((~((-1645934722) | iIdentityHashCode)) | (-128144923)) * (-948)) + ((~((~iIdentityHashCode) | (-33705985))) * (-948)) + 615513752;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        boolean zZzi = zzicVar.zzm().zzi(zzbgVar);
        zzr zzrVarZzah = zzah(true);
        int i28 = ((int[]) objArr2[0])[0];
        int i29 = i28 * i28;
        int i30 = -(1484961983 * i28);
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = -(i28 * 263294775);
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        int i34 = ((i33 | 1275762713) << 1) - (1275762713 ^ i33);
        int i35 = ((i34 >> 26) + ComposerKt.defaultsKey) / 64;
        int i36 = i34 >> 16;
        int i37 = -(((i34 - (~((i35 ^ 1) + ((i35 & 1) << 1)))) - 1) ^ (((((i36 | (-131071)) << 1) - (i36 ^ (-131071))) / 65536) + 1));
        int i38 = ((i37 | 6) << 1) - (i37 ^ 6);
        int i39 = ((i38 >> 25) - 255) / 128;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        zzaf(new zzmt(this, 2442 / (((-((i40 ^ 1) + ((i40 & 1) << 1))) & i38) * 407), zzrVarZzah, zZzi, zzbgVar, str));
        int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 49 / 0;
        }
    }

    protected final void zzp(zzah zzahVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzb();
        this.zzu.zzaU();
        zzaf(new zzmu(this, true, zzah(true), this.zzu.zzm().zzk(zzahVar), new zzah(zzahVar), zzahVar));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final zzao zzz() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzb();
        zzgb zzgbVar = this.zzb;
        if (zzgbVar != null) {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            try {
                zzao zzaoVarZzw = zzgbVar.zzw(zzrVarZzah);
                zzae();
                return zzaoVarZzw;
            } catch (RemoteException e2) {
                this.zzu.zzaV().zzb().zzb("Failed to get consents; remote exception", e2);
                return null;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        zzI();
        this.zzu.zzaV().zzj().zza("Failed to get consents; not connected to service yet.");
        return null;
    }

    final Boolean zzJ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.zzc;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    final /* synthetic */ void zzV() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzae();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzX() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzag();
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
    }

    final /* synthetic */ zznf zzY() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zznf zznfVar = this.zza;
        int i4 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zznfVar;
    }

    final /* synthetic */ zzgb zzZ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzb;
        }
        throw null;
    }

    final /* synthetic */ void zzaa(zzgb zzgbVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        this.zzb = null;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    final /* synthetic */ ScheduledExecutorService zzab() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        ScheduledExecutorService scheduledExecutorService = this.zze;
        int i5 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return scheduledExecutorService;
    }

    final /* synthetic */ void zzac(ScheduledExecutorService scheduledExecutorService) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.zze = scheduledExecutorService;
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        int i6 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.measurement.internal.zznl.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 + 113
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznl.$$g(byte, byte, short):java.lang.String");
    }
}
