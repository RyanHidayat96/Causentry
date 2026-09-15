package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
final class zzh {
    private Long zzA;
    private long zzB;
    private String zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private String zzG;
    private byte[] zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private boolean zzQ;
    private long zzR;
    private long zzS;
    private final zzic zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private Boolean zzq;
    private long zzr;
    private List zzs;
    private String zzt;
    private boolean zzu;
    private long zzv;
    private long zzw;
    private int zzx;
    private boolean zzy;
    private Long zzz;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {97, 58, 103, -72, 7, 0, 7, 9, 7, 22, -40, 45, -12, 43, -4, 7, 7, 24, 13, 10, 6, -4, -56, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
    private static final int $$e = 4;
    private static final byte[] $$a = {63, 56, -36, -117, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 129;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int d = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 26261;
    private static char b = 21;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 15112;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 19227;

    zzh(zzic zzicVar, String str) {
        Preconditions.checkNotNull(zzicVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzicVar;
        this.zzb = str;
        zzicVar.zzaW().zzg();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = 103 - r5
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 * 52
            int r0 = 53 - r6
            byte[] r1 = com.google.android.gms.measurement.internal.zzh.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzh.a(byte, byte, byte, java.lang.Object[]):void");
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
    private static void e(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzh.$$d
            int r5 = r5 * 20
            int r1 = 73 - r5
            int r7 = r7 * 32
            int r7 = r7 + 84
            int r6 = r6 * 72
            int r6 = 76 - r6
            byte[] r1 = new byte[r1]
            int r5 = 72 - r5
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzh.e(int, byte, short, java.lang.Object[]):void");
    }

    public final void zzA(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzn != j) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
            d = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzn = j;
    }

    public final long zzB() {
        int i = 2 % 2;
        int i2 = d + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        long j = this.zzr;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 71;
        d = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public final void zzC(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 49;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzr != j) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
            d = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = d + 25;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzr = j;
    }

    public final boolean zzD() {
        int i = 2 % 2;
        int i2 = d + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzhz zzhzVarZzaW = this.zza.zzaW();
        if (i3 == 0) {
            zzhzVarZzaW.zzg();
            return this.zzo;
        }
        zzhzVarZzaW.zzg();
        throw null;
    }

    public final void zzE(boolean z) {
        int i = 2 % 2;
        int i2 = d + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        boolean z3 = false;
        if (this.zzo != z) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 45;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                z3 = true;
            }
        }
        this.zzQ = z2 | z3;
        this.zzo = z;
    }

    public final long zzG() {
        int i = 2 % 2;
        int i2 = d + 13;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzg;
        int i4 = d + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long zzH() {
        int i = 2 % 2;
        int i2 = d + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzR;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
        d = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final void zzI(long j) {
        int i = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        boolean z2 = false;
        if (this.zzR != j) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzR = j;
        int i3 = d + 21;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final long zzJ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzS;
        int i4 = d + 87;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzK(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzS != j) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 123;
            d = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzS = j;
    }

    public final long zzN() {
        int i = 2 % 2;
        int i2 = d + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzhz zzhzVarZzaW = this.zza.zzaW();
        if (i3 == 0) {
            zzhzVarZzaW.zzg();
            return this.zzJ;
        }
        zzhzVarZzaW.zzg();
        int i4 = 95 / 0;
        return this.zzJ;
    }

    public final void zzO(long j) {
        int i = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        boolean z2 = false;
        if (this.zzJ != j) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzJ = j;
        int i3 = d + 69;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final long zzP() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzK;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 5;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final void zzQ(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzK != j) {
            int i3 = d + 25;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzK = j;
    }

    public final long zzR() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzL;
        int i4 = d + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final void zzS(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzL != j) {
            int i4 = d + 77;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = d + 113;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzL = j;
    }

    public final long zzT() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhz zzhzVarZzaW = this.zza.zzaW();
        if (i3 != 0) {
            zzhzVarZzaW.zzg();
            return this.zzM;
        }
        zzhzVarZzaW.zzg();
        int i4 = 91 / 0;
        return this.zzM;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v7 boolean) = (r1v6 boolean), (r1v12 boolean) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzU(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            int i3 = 50 / 0;
            if (this.zzM != j) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 95;
                d = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            }
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            if (this.zzM != j) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 95;
                d = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzM = j;
        int i8 = TuitionPaymentFragmentbindingInflater1 + 93;
        d = i8 % 128;
        int i9 = i8 % 2;
    }

    public final long zzV() {
        int i = 2 % 2;
        int i2 = d + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzO;
        int i4 = d + 17;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final void zzW(long j) {
        boolean z;
        int i = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzO != j) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
            d = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z2 | z;
        this.zzO = j;
        int i4 = d + 31;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long zzX() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        long j = this.zzN;
        int i3 = d + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public final void zzY(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        boolean z2 = false;
        if (this.zzN != j) {
            int i3 = d + 109;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzN = j;
    }

    public final String zzZ() {
        int i = 2 % 2;
        int i2 = d + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzP;
        int i4 = d + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
        d = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int zzaA() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.zza.zzaW().zzg();
            i = this.zzD;
            int i4 = 1 / 0;
        } else {
            this.zza.zzaW().zzg();
            i = this.zzD;
        }
        int i5 = d + 119;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final void zzaB(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 65;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzD != i) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 111;
            d = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzD = i;
    }

    public final int zzaC() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        int i4 = this.zzE;
        int i5 = d + 119;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return i4;
    }

    public final void zzaD(int i) {
        boolean z;
        int i2 = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzE != i) {
            int i3 = d + 63;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 25;
            d = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzE = i;
    }

    public final void zzaE(long j) {
        int i = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        boolean z2 = false;
        if (this.zzF != j) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzF = j;
        int i3 = d + 29;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final long zzaF() {
        int i = 2 % 2;
        int i2 = d + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        if (i3 == 0) {
            return this.zzF;
        }
        throw null;
    }

    public final void zzaG(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzQ;
        boolean z2 = false;
        if (this.zzG != str) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 63;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzG = str;
    }

    public final String zzaH() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        String str = this.zzG;
        int i3 = d + 21;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040 A[PHI: r1
  0x0040: PHI (r1v9 boolean) = (r1v6 boolean), (r1v12 boolean) binds: [B:8:0x002f, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v7 boolean) = (r1v6 boolean), (r1v12 boolean) binds: [B:8:0x002f, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzaI(byte[] bArr) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
        d = i3 % 128;
        boolean z2 = false;
        if (i3 % 2 == 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            int i4 = 14 / 0;
            if (this.zzH != bArr) {
                i = d + 33;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    z2 = true;
                }
            } else {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 67;
                d = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            if (this.zzH != bArr) {
                i = d + 33;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    z2 = true;
                }
            } else {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 67;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        this.zzQ = z | z2;
        this.zzH = bArr;
    }

    public final byte[] zzaJ() {
        int i = 2 % 2;
        int i2 = d + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        byte[] bArr = this.zzH;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return bArr;
    }

    public final void zzaK(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.zza.zzaW().zzg();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzI != i) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 93;
            d = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 33;
            d = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzI = i;
    }

    public final int zzaL() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        int i4 = this.zzI;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 69;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean zzac() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zzaW().zzg();
        boolean z = this.zzp;
        int i3 = d + 5;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public final void zzad(boolean z) {
        int i = 2 % 2;
        int i2 = d + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        boolean z3 = false;
        if (this.zzp != z) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 11;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                z3 = true;
            }
        } else {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 21;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        this.zzQ = z2 | z3;
        this.zzp = z;
    }

    public final Boolean zzae() {
        int i = 2 % 2;
        int i2 = d + 49;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zza.zzaW().zzg();
        Boolean bool = this.zzq;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        d = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    public final List zzag() {
        int i = 2 % 2;
        int i2 = d + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        List list = this.zzs;
        int i4 = d + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final boolean zzai() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzu;
        int i4 = d + 51;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v7 boolean) = (r1v6 boolean), (r1v11 boolean) binds: [B:8:0x002f, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzaj(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = d + 27;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        boolean z3 = false;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            z2 = this.zzQ;
            int i3 = 17 / 0;
            if (this.zzu != z) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
                d = i4 % 128;
                int i5 = i4 % 2;
                z3 = true;
            }
        } else {
            this.zza.zzaW().zzg();
            z2 = this.zzQ;
            if (this.zzu != z) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 123;
                d = i6 % 128;
                int i7 = i6 % 2;
                z3 = true;
            }
        }
        this.zzQ = z2 | z3;
        this.zzu = z;
    }

    public final long zzak() {
        long j;
        int i = 2 % 2;
        int i2 = d + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            j = this.zzv;
            int i3 = 53 / 0;
        } else {
            this.zza.zzaW().zzg();
            j = this.zzv;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
        d = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final void zzal(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 125;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzv != j) {
            int i4 = d + 105;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = d + 65;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 3;
            }
            z = false;
        }
        this.zzQ = z | z2;
        this.zzv = j;
    }

    public final long zzam() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhz zzhzVarZzaW = this.zza.zzaW();
        if (i3 != 0) {
            zzhzVarZzaW.zzg();
            return this.zzw;
        }
        zzhzVarZzaW.zzg();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzan(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzw != j) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
            d = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 109;
            d = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzw = j;
    }

    public final int zzao() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        if (i3 != 0) {
            return this.zzx;
        }
        throw null;
    }

    public final void zzap(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = d + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzx != i) {
            int i5 = TuitionPaymentFragmentbindingInflater1;
            int i6 = i5 + 43;
            d = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 39;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 2;
            }
            z = true;
        } else {
            int i10 = d + 23;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        this.zzQ = z | z2;
        this.zzx = i;
    }

    public final boolean zzaq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z = this.zzy;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 19;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return z;
    }

    public final void zzar(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z3 = this.zzQ;
        if (this.zzy != z) {
            int i4 = d + 33;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzQ = z3 | z2;
        this.zzy = z;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 17;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 35 / 0;
        }
    }

    public final Long zzas() {
        Long l;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            l = this.zzz;
            int i3 = 39 / 0;
        } else {
            this.zza.zzaW().zzg();
            l = this.zzz;
        }
        int i4 = d + 15;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final Long zzau() {
        int i = 2 % 2;
        int i2 = d + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        Long l = this.zzA;
        int i4 = d + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final long zzaw() {
        int i = 2 % 2;
        int i2 = d + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        if (i3 == 0) {
            return this.zzB;
        }
        int i4 = 15 / 0;
        return this.zzB;
    }

    public final void zzax(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzB != j) {
            int i4 = TuitionPaymentFragmentbindingInflater1;
            int i5 = i4 + 47;
            d = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 31;
            d = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzB = j;
    }

    public final String zzay() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzC;
        int i4 = d + 27;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzaz(String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzC != str) {
            int i4 = d + 23;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzC = str;
    }

    public final void zzb() {
        int i = 2 % 2;
        int i2 = d + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ = i3 != 0;
    }

    public final String zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzb;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 71;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String zzd() {
        int i = 2 % 2;
        int i2 = d + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzc;
        int i4 = d + 117;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzd;
        int i4 = d + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String zzh() {
        int i = 2 % 2;
        int i2 = d + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        if (i3 == 0) {
            return this.zzt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zze;
        int i4 = d + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzf;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long zzn() {
        long j;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            j = this.zzh;
            int i3 = 89 / 0;
        } else {
            this.zza.zzaW().zzg();
            j = this.zzh;
        }
        int i4 = d + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v7 boolean) = (r1v6 boolean), (r1v11 boolean) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzo(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            int i3 = 87 / 0;
            if (this.zzh != j) {
                int i4 = d + 107;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            }
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            if (this.zzh != j) {
                int i6 = d + 107;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzh = j;
    }

    public final long zzp() {
        int i = 2 % 2;
        int i2 = d + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        long j = this.zzi;
        int i3 = d + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final void zzq(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzi != j) {
            int i4 = d + 67;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzi = j;
    }

    public final String zzr() {
        int i = 2 % 2;
        int i2 = d + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzj;
        int i4 = d + 113;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long zzt() {
        int i = 2 % 2;
        int i2 = d + 13;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            throw null;
        }
        this.zza.zzaW().zzg();
        long j = this.zzk;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v7 boolean) = (r1v6 boolean), (r1v11 boolean) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzu(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        d = i2 % 128;
        boolean z2 = false;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            int i3 = 25 / 0;
            if (this.zzk != j) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
                d = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            }
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            if (this.zzk != j) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 125;
                d = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            }
        }
        this.zzQ = z | z2;
        this.zzk = j;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final void zzF(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 23;
        d = i3 % 128;
        boolean z2 = true;
        if (i3 % 2 != 0 ? j < 0 : j < 0) {
            z = false;
        } else {
            int i4 = i2 + 105;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        Preconditions.checkArgument(z);
        this.zza.zzaW().zzg();
        boolean z3 = this.zzQ;
        if (this.zzg != j) {
            int i5 = d + 63;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z2 = false;
        }
        this.zzQ = z3 | z2;
        this.zzg = j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1
  0x0038: PHI (r1v5 com.google.android.gms.measurement.internal.zzic) = (r1v4 com.google.android.gms.measurement.internal.zzic), (r1v12 com.google.android.gms.measurement.internal.zzic) binds: [B:9:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0024 A[PHI: r6
  0x0024: PHI (r6v3 long) = (r6v2 long), (r6v6 long) binds: [B:9:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzL() {
        zzic zzicVar;
        long j;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        d = i2 % 128;
        long j2 = 0;
        if (i2 % 2 == 0) {
            zzicVar = this.zza;
            zzicVar.zzaW().zzg();
            j = this.zzg % 0;
            if (j > SieveCacheKt.NodeLinkMask) {
                zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            } else {
                j2 = j;
            }
        } else {
            zzicVar = this.zza;
            zzicVar.zzaW().zzg();
            j = this.zzg + 1;
            if (j > SieveCacheKt.NodeLinkMask) {
                zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            } else {
                j2 = j;
            }
        }
        this.zzQ = true;
        this.zzg = j2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 5;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String zzaa() {
        int i = 2 % 2;
        int i2 = d + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        String str = this.zzP;
        zzab(null);
        int i4 = d + 101;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void zzab(String str) {
        boolean zEquals;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            zEquals = this.zzQ | Objects.equals(this.zzP, str);
        } else {
            this.zza.zzaW().zzg();
            zEquals = this.zzQ | (!Objects.equals(this.zzP, str));
        }
        this.zzQ = zEquals;
        this.zzP = str;
    }

    public final void zzaf(Boolean bool) {
        boolean z;
        Boolean bool2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            bool2 = this.zzq;
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            bool2 = this.zzq;
        }
        this.zzQ = z | (!Objects.equals(bool2, bool));
        this.zzq = bool;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzat(Long l) {
        boolean z;
        Long l2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            l2 = this.zzz;
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            l2 = this.zzz;
        }
        this.zzQ = z | (!Objects.equals(l2, l));
        this.zzz = l;
    }

    public final void zzav(Long l) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzA, l);
        this.zzA = l;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zze(String str) {
        boolean z;
        String str2;
        int i = 2 % 2;
        int i2 = d + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            str2 = this.zzc;
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            str2 = this.zzc;
        }
        this.zzQ = z | (!Objects.equals(str2, str));
        this.zzc = str;
    }

    public final void zzi(String str) {
        int i = 2 % 2;
        int i2 = d + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzt, str);
        this.zzt = str;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void zzk(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zze, str);
        this.zze = str;
        int i4 = d + 91;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void zzm(String str) {
        int i = 2 % 2;
        int i2 = d + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzf, str);
        this.zzf = str;
        int i4 = d + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzs(String str) {
        boolean z;
        String str2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            str2 = this.zzj;
        } else {
            this.zza.zzaW().zzg();
            z = this.zzQ;
            str2 = this.zzj;
        }
        this.zzQ = z | (!Objects.equals(str2, str));
        this.zzj = str;
    }

    public final void zzM(long j) {
        int i = 2 % 2;
        int i2 = d + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        long j2 = this.zzg + j;
        if (j2 > SieveCacheKt.NodeLinkMask) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
                j2 = (-1) % j;
            } else {
                zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
                j2 = j - 1;
            }
        }
        long j3 = this.zzF + 1;
        if (j3 > SieveCacheKt.NodeLinkMask) {
            zzicVar.zzaV().zze().zzb("Delivery index overflow. appId", zzgu.zzl(this.zzb));
            j3 = 0;
        }
        this.zzQ = true;
        this.zzg = j2;
        this.zzF = j3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    public final void zzah(List list) {
        ArrayList arrayList;
        int i;
        int i2 = 2 % 2;
        this.zza.zzaW().zzg();
        if (Objects.equals(this.zzs, list)) {
            return;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 83;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            this.zzQ = false;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                i = i3 + 93;
                d = i % 128;
                if (i % 2 == 0) {
                    int i5 = 2 % 4;
                }
                arrayList = null;
            }
        } else {
            this.zzQ = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                i = i3 + 93;
                d = i % 128;
                if (i % 2 == 0) {
                    int i6 = 2 % 4;
                }
                arrayList = null;
            }
        }
        this.zzs = arrayList;
    }

    public final void zzg(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        if (true == TextUtils.isEmpty(str)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
            int i5 = i4 % 128;
            d = i5;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + 79;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            }
            str = null;
        }
        this.zzQ |= !Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $11 + 57;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i6;
                int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47772);
                        int defaultSize = View.getDefaultSize(0, 0) + 468;
                        int iAxisFromString = MotionEvent.axisFromString("") + 14;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, defaultSize, iAxisFromString, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 468, View.MeasureSpec.getSize(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i7 + 1;
                    c2 = 1;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2323 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 45, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            i3 = $10 + 53;
            $11 = i3 % 128;
        }
    }

    public final String zzv() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[19] - 1);
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iIndexOf, iResolveOpacity, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{57934, 39443, 31199, 5622, 10174, 10030, 59920, 11054, 54516, 29784, 26750, 54823, 53471, 57560, 47144, 65487, 6885, 34895, 53076, 52796, 11674, 61812, 24637, 475}, 22 - Color.blue(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{41239, 2204, 28884, 18870, 2936, 60044, 46669, 11108, 44721, 55504, 14530, 48475, 22844, 43797, 52476, 48856, 22327, 16825}, TextUtils.getTrimmedLength("") + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[10], bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, scrollDefaultDelay, iArgb, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr3[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, windowTouchSlop, iIndexOf2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i6 = ~(329701969 | iFreeMemory);
            int i7 = (((427525515 + (((-331341438) | i6) * (-814))) + ((i6 | ((~((~iFreeMemory) | 289391740)) | 287752272)) * 407)) + (((~(iFreeMemory | (-289391741))) | ((~((-329701970) | iFreeMemory)) | 287752272)) * 407)) - 1646628350;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{46020, 28554, 44349, 39620, 29231, 2749, 34185, 37265, 45907, 7556, 17641, 23479, 37248, 7428, 16578, 62641, 22463, 46527, 10494, 43272, 20893, 17261, 44046, 44342, 18570, 32172, 43561, 11527}, 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{27, 12404, 18414, 21077, 61091, 58364, 9034, 12697, 12888, 58982, 9899, 5454, 28103, 20242, 41234, 63680, 47121, 1445, 59948, 16546}, 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i10 = d + 39;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{46166, 45739, 7690, 42347, 59871, 36069, 40506, 63457, 13130, 1099, 29270, 4319, 45875, 13543, 454, 13821, 19120, 29363}, 16 - TextUtils.getTrimmedLength(""), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{53427, 38498, 45612, 42584, 61775, 15821, 8696, 27633, 34558, 29803, 61703, 47753, 43172, 55868, 5692, 1139, 33881, 39709}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = d + 43;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1646628350};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[5];
                byte b6 = bArr4[34];
                Object[] objArr13 = new Object[1];
                e(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[34];
                byte b8 = bArr4[5];
                Object[] objArr14 = new Object[1];
                e(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, bArr5[5], b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iCombineMeasuredStates, i14, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new char[]{57934, 39443, 31199, 5622, 10174, 10030, 59920, 11054, 54516, 29784, 26750, 54823, 53471, 57560, 47144, 65487, 6885, 34895, 53076, 52796, 11674, 61812, 24637, 475}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new char[]{41239, 2204, 28884, 18870, 2936, 60044, 46669, 11108, 44721, 55504, 14530, 48475, 22844, 43797, 52476, 48856, 22327, 16825}, ExpandableListView.getPackedPositionType(0L) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int threadPriority2 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr6[10], bArr6[7], bArr6[5], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, threadPriority2, packedPositionType, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                            int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                            byte[] bArr7 = $$a;
                            byte b10 = (byte) (bArr7[19] - 1);
                            byte b11 = bArr7[5];
                            Object[] objArr19 = new Object[1];
                            a(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, iLastIndexOf, i15, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[c])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt();
            int i19 = ~iNextInt;
            int i20 = i18 + 366949782 + ((iNextInt | 1045337437) * (-859)) + (((~(iNextInt | (-67666006))) | (~(1045337437 | i19))) * 859) + (((~(1005027208 | i19)) | (-1072693214)) * 859);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr20[1])[0] = i22 ^ (i22 << 5);
        } else {
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = i23 + (((~((-874774787) | iIdentityHashCode)) | (-918364000)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 403669962 + ((~((~iIdentityHashCode) | (-874774787))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[1])[0] = i26 ^ (i26 << 5);
            int i27 = d + 115;
            TuitionPaymentFragmentbindingInflater1 = i27 % 128;
            int i28 = i27 % 2;
        }
        this.zza.zzaW().zzg();
        return this.zzl;
    }

    public final long zzx() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhz zzhzVarZzaW = this.zza.zzaW();
        if (i3 != 0) {
            zzhzVarZzaW.zzg();
            return this.zzm;
        }
        zzhzVarZzaW.zzg();
        throw null;
    }

    public final void zzy(long j) {
        boolean z;
        int i = 2 % 2;
        this.zza.zzaW().zzg();
        boolean z2 = this.zzQ;
        if (this.zzm != j) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        this.zzQ = z | z2;
        this.zzm = j;
    }

    public final long zzz() {
        int i = 2 % 2;
        int i2 = d + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        long j = this.zzn;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final void zzw(String str) {
        int i = 2 % 2;
        int i2 = d + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzl, str);
        this.zzl = str;
        int i4 = d + 59;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.google.android.gms.measurement.internal.zzh.$$c
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzh.$$g(int, short, byte):java.lang.String");
    }
}
