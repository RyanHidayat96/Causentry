package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SequentialExecutor;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzapy extends zzbfi {
    private final zzbfe zza;
    private final zzbiu zzb;
    private final ImmutableList zzc;
    private final Executor zzd;
    private final zzbfd zzj;
    private int zzk;
    private zzapx zzl;
    private int zzn;
    private zzbfh zzo;
    private zzbip zzp;
    private final zzapw zzr;
    private zzbfi zzt;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$f = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {123, -2, -101, -104, -16, -2, 59, -55, -19, -4, -7, 9, -10, -17, 16, -17, 64, -63, -9, -10, 11, -17, 0, 9, -15, 58, -23, -9, -38, 51, -63, 21, 11, -11, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
    private static final int $$e = 204;
    private static final byte[] $$a = {106, -66, 28, 119, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 35;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722489;
    private final Set zze = Collections.newSetFromMap(new IdentityHashMap());
    private final LinkedHashMap zzf = new LinkedHashMap();
    private final Set zzg = Collections.newSetFromMap(new IdentityHashMap());
    private boolean zzq = false;
    private boolean zzs = false;
    private final Deque zzh = new ArrayDeque();
    private final Queue zzm = new ArrayDeque();
    private final Queue zzi = new ArrayDeque();

    zzapy(zzbfe zzbfeVar, zzbiu zzbiuVar, zzbfd zzbfdVar, int i, ImmutableList immutableList) {
        this.zza = zzbfeVar;
        this.zzb = zzbiuVar;
        this.zzj = zzbfdVar;
        this.zzc = immutableList;
        this.zzl = zzapx.zzb(immutableList.size());
        Executor executorZzj = zzbfdVar.zzj();
        if (executorZzj == null) {
            executorZzj = DirectExecutor.INSTANCE;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        zzapw zzapwVar = new zzapw(executorZzj);
        this.zzr = zzapwVar;
        final SequentialExecutor sequentialExecutor = new SequentialExecutor(zzapwVar);
        this.zzd = new Executor() { // from class: com.google.android.libraries.places.internal.zzapp
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(final Runnable runnable) {
                final zzapy zzapyVar = this.zza;
                sequentialExecutor.execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzapyVar.zzp(runnable);
                    }
                });
            }
        };
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 11 - r5
            byte[] r1 = com.google.android.libraries.places.internal.zzapy.$$a
            int r6 = r6 * 10
            int r6 = 13 - r6
            int r7 = r7 * 3
            int r7 = r7 + 97
            byte[] r0 = new byte[r0]
            int r5 = 10 - r5
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r5
            r7 = r6
            goto L2d
        L16:
            r4 = r7
            r7 = r6
            r6 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2d:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-5)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzapy.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 30
            int r6 = 34 - r6
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r7 = r7 * 22
            int r0 = r7 + 31
            byte[] r1 = com.google.android.libraries.places.internal.zzapy.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 30
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-4)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzapy.d(short, byte, byte, java.lang.Object[]):void");
    }

    private final zzaoy zzv(zzaoy zzaoyVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzbfd zzbfdVar = this.zzj;
        if (zzbfdVar == zzaoyVar.zzc()) {
            return zzaoyVar;
        }
        zzaoy zzaoyVarZza = zzaoy.zza(this.zzb, zzbfdVar, zzaoyVar.zzb(), zzaoyVar.zzd());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzaoyVarZza;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(final int i) {
        synchronized (this.zzm) {
            this.zzn += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.zzm;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.zzn;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.zzn--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.zzo.zzb(it.next());
                }
                if (zIsEmpty) {
                    this.zzo.zzc(zzbjv.zza, null);
                }
            }
        }
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzm(i);
            }
        }));
    }

    final /* synthetic */ void zzf(zzbip zzbipVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzt(zzbipVar);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzg(zzaoy zzaoyVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzu(zzaoyVar);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean zzx(zzaqg zzaqgVar) {
        int i = 2 % 2;
        int iOrdinal = zzaqgVar.zzc().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            throw null;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        if (iOrdinal == 2) {
            throw null;
        }
        if (iOrdinal == 3) {
            final ListenableFuture listenableFutureZzd = zzaqgVar.zzd();
            this.zze.add(listenableFutureZzd);
            listenableFutureZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(listenableFutureZzd);
                }
            }), this.zzd);
            return false;
        }
        if (iOrdinal != 4) {
            throw new IllegalStateException("Unrecognized outcome type: ".concat(String.valueOf(String.valueOf(zzaqgVar.zzc()))));
        }
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            this.zzl.zza();
            return false;
        }
        this.zzl.zza();
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, final zzbip zzbipVar) {
        int i = 2 % 2;
        ImmutableList immutableList = this.zzc;
        Set set = this.zzg;
        Executor executor = this.zzd;
        this.zzo = new zzapu(this, new zzaql(new zzaqa(zzbfhVar, immutableList, set, executor)));
        this.zzp = zzbipVar;
        executor.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzape
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzbipVar);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(final Object obj) {
        int i = 2 % 2;
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj(obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        int i = 2 % 2;
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn();
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(final String str, final Throwable th) {
        int i = 2 % 2;
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str, th);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void zzC() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
            if (!this.zzq) {
                return;
            }
        } else if (!this.zzq) {
            return;
        }
        zzapv zzapvVar = (zzapv) this.zzh.peekLast();
        int iZzg = this.zzl.zzg() - 1;
        if (iZzg == 1) {
            if (zzapvVar != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                if (!zzapvVar.zzb()) {
                    return;
                }
            }
            zzw();
            return;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i7 = i6 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            if (iZzg != 3) {
                return;
            }
        } else if (iZzg != 3) {
            return;
        }
        int i8 = i6 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        if (zzapvVar == null) {
            int i10 = i6 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            this.zzt.zzd();
        }
    }

    private final void zzB() {
        int i = 2 % 2;
        while (true) {
            Deque deque = this.zzh;
            if (!(!deque.isEmpty())) {
                return;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                ((zzapv) deque.peek()).zza();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!((zzapv) deque.peek()).zza()) {
                return;
            }
            Object objZzc = ((zzapv) deque.poll()).zzc();
            if (this.zzl.zzg() == 4) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                this.zzt.zzb(objZzc);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                this.zzi.add(objZzc);
            }
        }
    }

    private final void zzy() {
        int iZze;
        int iZzf;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iZzg = this.zzl.zzg() - 1;
        if (iZzg != 1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (iZzg == 3) {
                for (zzapv zzapvVar : this.zzh) {
                    zzz(zzapvVar, zzapvVar.zze(), this.zzl.zzd());
                }
                return;
            }
            return;
        }
        for (zzapv zzapvVar2 : this.zzh) {
            if (zzapvVar2.zze() <= this.zzl.zzf()) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 == 0) {
                    iZze = zzapvVar2.zze();
                    iZzf = this.zzl.zzf() / 0;
                } else {
                    iZze = zzapvVar2.zze();
                    iZzf = this.zzl.zzf() + 1;
                }
                zzz(zzapvVar2, iZze, iZzf);
            }
        }
    }

    private final void zzw() {
        int i = 2 % 2;
        while (true) {
            zzapx zzapxVarZzc = this.zzl.zzc();
            this.zzl = zzapxVarZzc;
            int iZzg = zzapxVarZzc.zzg() - 1;
            if (iZzg == 0) {
                zzt(this.zzp);
                return;
            }
            if (iZzg != 2) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    zzy();
                    obj.hashCode();
                    throw null;
                }
                zzy();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            zzbfi zzbfiVarZza = this.zza.zza(this.zzb, this.zzj);
            this.zzt = zzbfiVarZza;
            zzbfiVarZza.zza(this.zzo, this.zzp);
            int i4 = this.zzk;
            if (i4 > 0) {
                this.zzt.zzc(i4);
            }
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                this.zzt.zzb(it.next());
            }
            if (this.zzq) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                if (this.zzh.isEmpty()) {
                    this.zzt.zzd();
                }
            }
        }
    }

    private final void zzt(zzbip zzbipVar) {
        int i = 2 % 2;
        final zzaoy zzaoyVarZza = zzaoy.zza(this.zzb, this.zzj, zzbipVar, this.zza.zzb());
        ImmutableList immutableList = (ImmutableList) this.zzc.get(this.zzl.zze());
        int size = immutableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzapa zzapaVar = (zzapa) immutableList.get(i2);
            zzaqg zzaqgVarZza = zzapaVar.zza(zzv(zzaoyVarZza));
            if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                ListenableFuture listenableFutureZzd = zzaqgVarZza.zzd();
                this.zzf.put(zzapaVar, listenableFutureZzd);
                listenableFutureZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(zzaoyVarZza);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZza);
            this.zzg.add(zzapaVar);
        }
        if (this.zzf.isEmpty()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            zzw();
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private final void zzz(final zzapv zzapvVar, int i, int i2) {
        int i3 = 2 % 2;
        final zzaoz zzaozVarZza = zzaoz.zza(zzapvVar.zzc());
        while (i < i2) {
            ImmutableList immutableList = (ImmutableList) this.zzc.get(i);
            int size = immutableList.size();
            for (int i4 = 0; i4 < size; i4++) {
                zzapa zzapaVar = (zzapa) immutableList.get(i4);
                zzaqg zzaqgVarZza = zzaqg.zza();
                if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                    ListenableFuture listenableFutureZzd = zzaqgVarZza.zzd();
                    zzapvVar.zzd().put(zzapaVar, listenableFutureZzd);
                    listenableFutureZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk(zzaozVarZza, zzapvVar);
                        }
                    }), this.zzd);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                }
                zzx(zzaqgVarZza);
            }
            i++;
        }
        zzapvVar.zzf(i2);
        if (zzapvVar.zzd().isEmpty()) {
            zzB();
            zzC();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void zzA(final zzaoz zzaozVar, final zzapv zzapvVar) {
        int i = 2 % 2;
        Iterator it = zzapvVar.zzd().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzapa zzapaVar = (zzapa) entry.getKey();
            zzaqg zzaqgVarZza = zzaqg.zza();
            if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                ListenableFuture listenableFutureZzd = zzaqgVarZza.zzd();
                zzapvVar.zzd().put(zzapaVar, listenableFutureZzd);
                listenableFutureZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl(zzaozVar, zzapvVar);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZza);
        }
        if (zzapvVar.zzd().isEmpty()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                zzB();
                zzC();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            zzB();
            zzC();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void zzu(final zzaoy zzaoyVar) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = this.zzf;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                it.remove();
                ((zzapa) entry.getKey()).zzb(zzv(zzaoyVar)).zzc().equals(zzaqe.CONTINUE_AFTER);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.remove();
            zzapa zzapaVar = (zzapa) entry.getKey();
            zzaqg zzaqgVarZzb = zzapaVar.zzb(zzv(zzaoyVar));
            if (zzaqgVarZzb.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                ListenableFuture listenableFutureZzd = zzaqgVarZzb.zzd();
                linkedHashMap.put(zzapaVar, listenableFutureZzd);
                listenableFutureZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaph
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() throws Throwable {
                        this.zza.zzh(zzaoyVar);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZzb);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!linkedHashMap.isEmpty() || this.zzs) {
            return;
        }
        zzw();
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $10 + 73;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i9 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3290 - TextUtils.lastIndexOf("", '0'), 31 - TextUtils.getTrimmedLength(""), 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 652, TextUtils.indexOf((CharSequence) "", '0') + 45, -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i10 = $11 + 107;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i12 = $11 + 61;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 652, 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    final /* synthetic */ void zzh(zzaoy zzaoyVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i4 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
            byte b = $$a[11];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 1), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i4, iLastIndexOf, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 199 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 204, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, 2 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b3 = bArr[8];
            byte b4 = bArr[11];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, packedPositionChild, tapTimeout, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iRgb = Color.rgb(0, 0, 0) + 16778092;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                byte b5 = (byte) ($$b & 15);
                byte b6 = $$a[11];
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iRgb, packedPositionType, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = 978639948 + ((iIdentityHashCode | (-295580754)) * 140) + (((~((-295580754) | i7)) | 268697600) * (-280)) + (((~(iIdentityHashCode | (-268697601))) | (~(335890982 | i7)) | (-362774136)) * 140) + 806366408;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(false, (ViewConfiguration.getScrollBarSize() >> 8) + 199, Color.green(0) + 16, (Process.myPid() >> 22) + 9, new char[]{'\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, (Process.myPid() >> 22) + 203, (KeyEvent.getMaxKeyCode() >> 16) + 16, View.resolveSize(0, 0) + 11, new char[]{3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), 806366408};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[81];
                Object[] objArr11 = new Object[1];
                d(b7, bArr2[22], b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[22];
                Object[] objArr12 = new Object[1];
                d(b8, bArr2[81], b8, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                    byte b9 = (byte) ($$b & 15);
                    byte b10 = $$a[11];
                    Object[] objArr14 = new Object[1];
                    a(b9, b10, b10, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, scrollBarSize, modifierMetaStateMask, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 200, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(false, 205 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                        byte[] bArr3 = $$a;
                        byte b11 = bArr3[8];
                        byte b12 = bArr3[11];
                        Object[] objArr17 = new Object[1];
                        a(b11, b12, (byte) (b12 + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iResolveSizeAndState, deadChar, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 11;
                        byte b13 = $$a[11];
                        byte b14 = b13;
                        Object[] objArr18 = new Object[1];
                        a(b14, (byte) (b14 + 1), b13, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iNormalizeMetaState, iLastIndexOf2, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode2;
            int i19 = i17 + (-1001888132) + ((913898231 | iIdentityHashCode2) * (-676)) + (((~(880283767 | i18)) | (-913898232)) * 676) + (((~(iIdentityHashCode2 | (-33614465))) | (~(i18 | 839973538)) | 73924693) * 676);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[1])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i25 = i24 + (-1249419084) + (((~((-134235650) | (~iIdentityHashCode3))) | (~((-93925421) | iIdentityHashCode3))) * (-272)) + (((~((-973098706) | iIdentityHashCode3)) | 838863056) * (-272)) + (((~(iIdentityHashCode3 | 973098705)) | (-932788477)) * 272);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[1])[0] = i27 ^ (i27 << 5);
        }
        zzu(zzaoyVar);
    }

    final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zze.remove(listenableFuture);
        if (i3 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzk(zzaoz zzaozVar, zzapv zzapvVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzA(zzaozVar, zzapvVar);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzl(zzaoz zzaozVar, zzapv zzapvVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzA(zzaozVar, zzapvVar);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.zzs) {
            this.zzq = true;
            zzC();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    final /* synthetic */ void zzm(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
            if (!this.zzs) {
                if (this.zzl.zzg() == 4) {
                    this.zzt.zzc(i);
                    return;
                }
                this.zzk += i;
            }
        } else if (!this.zzs) {
            if (this.zzl.zzg() == 4) {
                this.zzt.zzc(i);
                return;
            }
            this.zzk += i;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzj(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        this.zzh.add(new zzapv(this, obj, null));
        zzy();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    final /* synthetic */ void zzo(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = this.zze.iterator();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 3;
        }
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(true);
        }
        zzbfi zzbfiVar = this.zzt;
        if (zzbfiVar != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            zzbfiVar.zze(str, th);
            if (i7 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    final /* synthetic */ void zzp(Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                runnable.run();
                int i3 = 67 / 0;
            } else {
                runnable.run();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            this.zzs = true;
            zzbfh zzbfhVar = this.zzo;
            if (zzbfhVar != null) {
                zzbfhVar.zzc(zzbjv.zzb(th), new zzbip());
                if (this.zzt != null && this.zzl.zzg() == 4) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                    this.zzt.zze(null, th);
                }
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 23 / 0;
            }
        }
    }

    final /* synthetic */ Executor zzq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Executor executor = this.zzd;
        int i5 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return executor;
    }

    final /* synthetic */ zzapx zzr() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        zzapx zzapxVar = this.zzl;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return zzapxVar;
    }

    final /* synthetic */ zzapw zzs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzapy.$$c
            int r6 = 120 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzapy.$$g(int, int, short):java.lang.String");
    }
}
