package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzid extends zzmf implements zznn {
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static boolean b;
    private static final zzid zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private zzig zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private zzhy zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private zzhe zzal;
    private int zzam;
    private zzha zzan;
    private zzis zzap;
    private long zzaq;
    private zzho zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -81, 2, 79, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 62, 11, 11, -64, 58, 17, 3, 5, 7, 4, -59, 56, 20, -2, -54, 24, 52, -2, -64, 36, 46, 2, 1, 14, 11, -36, 31, 25, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
    private static final int $$e = 39;
    private static final byte[] $$a = {112, 19, -59, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 199;
    private static int g = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private zzmo zzf = zzcv();
    private zzmo zzg = zzcv();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzw = "";
    private String zzy = "";
    private String zzB = "";
    private String zzC = "";
    private zzmo zzE = zzcv();
    private String zzF = "";
    private String zzJ = "";
    private String zzM = "";
    private String zzN = "";
    private String zzP = "";
    private zzmm zzR = zzcs();
    private String zzU = "";
    private String zzV = "";
    private String zzY = "";
    private String zzab = "";
    private zzmo zzac = zzmf.zzcv();
    private String zzad = "";
    private String zzag = "";
    private String zzai = "";
    private String zzak = "";
    private String zzao = "";
    private String zzar = "";

    static {
        asInterface = 1;
        b();
        zzid zzidVar = new zzid();
        zzat = zzidVar;
        zzmf.zzcp(zzid.class, zzidVar);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zzid() {
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
    private static void a(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzid.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r1 = 53 - r6
            int r5 = 144 - r5
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void e(byte b2, short s, byte b3, Object[] objArr) {
        int i = s + 98;
        int i2 = b3 * 2;
        byte[] bArr = $$d;
        int i3 = 49 - (b2 * 46);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (i + i3) - 5;
            i3 = i3;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i5;
            i = (i + bArr[i6]) - 5;
            i3 = i6;
        }
    }

    public static zzic zzaE() {
        int i = 2 % 2;
        int i2 = g + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = (zzic) zzat.zzck();
        int i4 = d + 71;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return zzicVar;
        }
        throw null;
    }

    public final zzho zzaD() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 35;
        d = i3 % 128;
        int i4 = i3 % 2;
        zzho zzhoVarZzc = this.zzas;
        if (zzhoVarZzc == null) {
            int i5 = i2 + 17;
            d = i5 % 128;
            int i6 = i5 % 2;
            zzhoVarZzc = zzho.zzc();
            if (i6 == 0) {
                int i7 = 38 / 0;
            }
        }
        int i8 = g + 31;
        d = i8 % 128;
        int i9 = i8 % 2;
        return zzhoVarZzc;
    }

    final /* synthetic */ void zzaK() {
        int i = 2 % 2;
        int i2 = d + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzf = zzcv();
        if (i3 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzaZ(String str) {
        int i = 2 % 2;
        int i2 = g + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
        int i4 = d + 37;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final zzhe zzat() {
        zzhe zzheVarZzi;
        int i = 2 % 2;
        int i2 = g + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            zzheVarZzi = this.zzal;
            int i3 = 50 / 0;
            if (zzheVarZzi == null) {
                zzheVarZzi = zzhe.zzi();
            }
        } else {
            zzheVarZzi = this.zzal;
            if (zzheVarZzi == null) {
                zzheVarZzi = zzhe.zzi();
            }
        }
        int i4 = d + 17;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return zzheVarZzi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzha zzax() {
        int i = 2 % 2;
        int i2 = g + 27;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzha zzhaVarZzs = this.zzan;
        if (zzhaVarZzs == null) {
            zzhaVarZzs = zzha.zzs();
        }
        int i3 = g + 33;
        d = i3 % 128;
        int i4 = i3 % 2;
        return zzhaVarZzs;
    }

    public final zzis zzaz() {
        int i = 2 % 2;
        int i2 = d + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzis zzisVar = this.zzap;
        if (zzisVar != null) {
            return zzisVar;
        }
        zzis zzisVarZzc = zzis.zzc();
        int i4 = d + 7;
        g = i4 % 128;
        int i5 = i4 % 2;
        return zzisVarZzc;
    }

    final /* synthetic */ void zzbB(String str) {
        int i = 2 % 2;
        int i2 = d + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        if (i3 != 0) {
            this.zzb |= Integer.MIN_VALUE;
            this.zzM = str;
            int i4 = 82 / 0;
        } else {
            this.zzb |= Integer.MIN_VALUE;
            this.zzM = str;
        }
        int i5 = g + 107;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbE(zzig zzigVar) {
        int i = 2 % 2;
        int i2 = g + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzigVar.getClass();
        this.zzQ = zzigVar;
        this.zzd |= 8;
        int i4 = d + 91;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbJ(String str) {
        int i = 2 % 2;
        int i2 = g + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
        int i4 = d + 17;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    final /* synthetic */ void zzbM(String str) {
        int i = 2 % 2;
        int i2 = d + 113;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
        int i4 = d + 15;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbR(String str) {
        int i = 2 % 2;
        int i2 = g + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        if (i3 == 0) {
            this.zzd |= 524288;
            this.zzai = str;
            throw null;
        }
        this.zzd |= 524288;
        this.zzai = str;
        int i4 = g + 45;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbT(zzhe zzheVar) {
        int i = 2 % 2;
        int i2 = g + 111;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzheVar.getClass();
        this.zzal = zzheVar;
        this.zzd |= 4194304;
        int i4 = g + 41;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbV(zzha zzhaVar) {
        int i = 2 % 2;
        int i2 = g + 45;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhaVar.getClass();
        this.zzan = zzhaVar;
        this.zzd |= 16777216;
        int i4 = g + 71;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbZ(zzho zzhoVar) {
        int i = 2 % 2;
        int i2 = g + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhoVar.getClass();
        this.zzas = zzhoVar;
        this.zzd |= 536870912;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = g + 43;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzba(String str) {
        int i = 2 % 2;
        int i2 = d + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb = i3 != 0 ? this.zzb | 3026 : this.zzb | 256;
        this.zzo = str;
        int i4 = g + 11;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbc(String str) {
        int i = 2 % 2;
        int i2 = d + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb = i3 != 0 ? this.zzb | 23401 : this.zzb | 512;
        this.zzp = str;
        int i4 = d + 89;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbe(String str) {
        int i = 2 % 2;
        int i2 = d + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        int i4 = this.zzb;
        this.zzb = i3 != 0 ? i4 | 29455 : i4 | 2048;
        this.zzr = str;
    }

    final /* synthetic */ void zzbf(String str) {
        int i = 2 % 2;
        int i2 = g + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb = i3 == 0 ? this.zzb | 1996 : this.zzb | 4096;
        this.zzs = str;
        int i4 = g + 7;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbg(String str) {
        int i = 2 % 2;
        int i2 = d + 93;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
        int i4 = d + 115;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    public static zzic zzaF(zzid zzidVar) {
        int i = 2 % 2;
        int i2 = g + 105;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            zzmb zzmbVarZzck = zzat.zzck();
            zzmbVarZzck.zzbd(zzidVar);
            return (zzic) zzmbVarZzck;
        }
        zzmb zzmbVarZzck2 = zzat.zzck();
        zzmbVarZzck2.zzbd(zzidVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void zzcy() {
        int i = 2 % 2;
        int i2 = d + 121;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzmo zzmoVar = this.zzf;
        if (zzmoVar.zza()) {
            return;
        }
        int i4 = d + 91;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.zzf = zzmf.zzcw(zzmoVar);
        if (i5 != 0) {
            throw null;
        }
    }

    private final void zzcz() {
        int i = 2 % 2;
        int i2 = d + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzmo zzmoVar = this.zzg;
        if (zzmoVar.zza()) {
            return;
        }
        this.zzg = zzmf.zzcw(zzmoVar);
        int i4 = g + 11;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzaJ(Iterable iterable) {
        int i = 2 % 2;
        int i2 = g + 113;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzcy();
        zzks.zzce(iterable, this.zzf);
        int i4 = d + 113;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    final /* synthetic */ void zzaL(int i) {
        int i2 = 2 % 2;
        int i3 = d + 19;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzcy();
        this.zzf.remove(i);
        int i5 = d + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzaO(Iterable iterable) {
        int i = 2 % 2;
        int i2 = g + 89;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzcz();
        zzks.zzce(iterable, this.zzg);
        int i4 = g + 53;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzaP(int i) {
        int i2 = 2 % 2;
        int i3 = g + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        zzcz();
        this.zzg.remove(i);
        int i5 = g + 109;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzaH(int i, zzhs zzhsVar) {
        int i2 = 2 % 2;
        int i3 = d + 37;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            zzhsVar.getClass();
            zzcy();
            this.zzf.set(i, zzhsVar);
        } else {
            zzhsVar.getClass();
            zzcy();
            this.zzf.set(i, zzhsVar);
            throw null;
        }
    }

    final /* synthetic */ void zzaI(zzhs zzhsVar) {
        int i = 2 % 2;
        int i2 = g + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzhsVar.getClass();
        zzcy();
        this.zzf.add(zzhsVar);
        int i4 = d + 65;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzaM(int i, zziu zziuVar) {
        int i2 = 2 % 2;
        int i3 = d + 69;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            zziuVar.getClass();
            zzcz();
            this.zzg.set(i, zziuVar);
        } else {
            zziuVar.getClass();
            zzcz();
            this.zzg.set(i, zziuVar);
            int i4 = 22 / 0;
        }
    }

    final /* synthetic */ void zzaN(zziu zziuVar) {
        int i = 2 % 2;
        int i2 = d + 81;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            zziuVar.getClass();
            zzcz();
            this.zzg.add(zziuVar);
            throw null;
        }
        zziuVar.getClass();
        zzcz();
        this.zzg.add(zziuVar);
        int i3 = g + 115;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    final /* synthetic */ void zzbL(Iterable iterable) {
        int i = 2 % 2;
        int i2 = g + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        zzmo zzmoVar = this.zzac;
        if (!zzmoVar.zza()) {
            this.zzac = zzmf.zzcw(zzmoVar);
        }
        zzks.zzce(iterable, this.zzac);
        int i4 = g + 39;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbF(Iterable iterable) {
        int i = 2 % 2;
        int i2 = g + 37;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzR.zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzmm zzmmVar = this.zzR;
        if (!zzmmVar.zza()) {
            int size = zzmmVar.size();
            this.zzR = zzmmVar.zzg(size + size);
        }
        zzks.zzce(iterable, this.zzR);
        int i3 = g + 107;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Color.blue(i4)), View.getDefaultSize(i4, i4) + 2994, 17 - Drawable.resolveOpacity(i4, i4), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31340), (-16774222) - Color.rgb(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                i4 = 0;
            }
            int i8 = $10 + 107;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 253, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i10 = $10 + 41;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (33602 - ExpandableListView.getPackedPositionGroup(0L));
                    int i12 = 3085 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 27;
                    byte b6 = (byte) ($$f & 3);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i12, iLastIndexOf, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i13 = 0;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33602);
                    int iKeyCodeFromString = 3085 - KeyEvent.keyCodeFromString("");
                    int i14 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b8 = (byte) ($$f & 3);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iKeyCodeFromString, i14, -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i15 = $10 + 97;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    final /* synthetic */ void zzbj(String str) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
            int iMyTid = 28 - (Process.myTid() >> 22);
            byte[] bArr = $$a;
            short s = bArr[7];
            Object[] objArr3 = new Object[1];
            a(s, (byte) (s | 52), bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetAfter, iMyTid, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - TextUtils.getTrimmedLength(""), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int iAxisFromString = 920 - MotionEvent.axisFromString("");
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            a((short) 104, b2, b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iAxisFromString, jumpTapTimeout, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = d + 103;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                int i4 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr7 = new Object[1];
                a((short) 141, (byte) 15, $$a[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iRgb, i4, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyPid = Process.myPid();
            int i5 = (~((-1520485200) | iMyPid)) | 167805772;
            int i6 = ~((~iMyPid) | 1606273871);
            int i7 = (-961586141) + ((i5 | i6) * (-470)) + (((~(iMyPid | (-1352679428))) | i6) * 470) + 1912720758;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(null, null, TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), 0, 1912720758};
                byte[] bArr2 = $$d;
                Object[] objArr12 = new Object[1];
                e(bArr2[20], bArr2[0], bArr2[41], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b3 = bArr2[20];
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                e(b3, b4, b4, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
                    int iAlpha = 921 - Color.alpha(0);
                    int iRgb2 = Color.rgb(0, 0, 0) + 16777244;
                    Object[] objArr14 = new Object[1];
                    a((short) 141, (byte) 15, $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iAlpha, iRgb2, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(null, null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                        int i10 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        a((short) 104, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, deadChar, i10, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize2 = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 922;
                        int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                        byte[] bArr3 = $$a;
                        short s2 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        a(s2, (byte) (s2 | 52), bArr3[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, iAxisFromString2, trimmedLength, -1048449946, false, (String) objArr18[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i14 = ~iMyUid;
            int i15 = i13 + (-1992129140) + (((~((-93528564) | i14)) | (~((-1680551081) | i14))) * (-867)) + (((~((-93528564) | iMyUid)) | 67313824 | (~((-1680551081) | iMyUid))) * (-1734)) + (((~(iMyUid | (-1613237257))) | (~(i14 | (-67313825))) | (~((-26214740) | iMyUid))) * 867);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[0])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i18 = d;
                int i19 = i18 + 7;
                g = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i18 + 9;
                g = i21 % 128;
                int i22 = i21 % 2;
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyUid2 = Process.myUid();
            int i24 = ~iMyUid2;
            int i25 = i23 + 766618914 + (((~(i24 | 1019905862)) | 754173781) * (-1042)) + ((1019905862 | iMyUid2) * 521) + (((~(iMyUid2 | (-754173782))) | 750946116 | (~(i24 | 1023133527))) * 521);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
            int i28 = d + 119;
            g = i28 % 128;
            int i29 = i28 % 2;
        }
        str.getClass();
        int i30 = this.zzb;
        int i31 = ((int[]) objArr2[0])[0];
        int i32 = ((i31 * i31) - (~(-(1371526391 * i31)))) - 1;
        int i33 = -(i31 * 999565521);
        int i34 = ((i32 ^ i33) + ((i33 & i32) << 1)) - (-919681808);
        int i35 = i34 >> 19;
        int i36 = (((i35 | (-16383)) << 1) - (i35 ^ (-16383))) / 8192;
        int i37 = (i34 - (~((i36 & 1) + (i36 | 1)))) - 1;
        int i38 = i34 >> 28;
        int i39 = ((i38 & (-31)) + (i38 | (-31))) / 16;
        int i40 = -(i37 ^ ((i39 ^ 1) + ((i39 & 1) << 1)));
        int i41 = (i40 & 6) + (i40 | 6);
        int i42 = i41 >> 28;
        int i43 = ((i42 ^ (-31)) + ((i42 & (-31)) << 1)) / 16;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        this.zzb = i30 | (266993664 / (((-(((i44 | 1) << 1) - (i44 ^ 1))) & i41) * 679));
        this.zzw = str;
    }

    final /* synthetic */ void zzbn(String str) {
        int i = 2 % 2;
        int i2 = d + 49;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        if (i3 == 0) {
            this.zzb = 262144 | this.zzb;
            this.zzy = str;
        } else {
            this.zzb = 262144 | this.zzb;
            this.zzy = str;
            int i4 = 76 / 0;
        }
    }

    final /* synthetic */ void zzbt(String str) {
        int i = 2 % 2;
        int i2 = d + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
        int i4 = d + 17;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbw() {
        int i = 2 % 2;
        int i2 = d + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzE = zzcv();
        int i4 = d + 31;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbx(String str) {
        int i = 2 % 2;
        int i2 = g + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
        int i4 = d + 87;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int zzd() {
        int size;
        int i = 2 % 2;
        int i2 = d + 121;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            size = this.zzf.size();
            int i3 = 43 / 0;
        } else {
            size = this.zzf.size();
        }
        int i4 = d + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final zzhs zze(int i) {
        int i2 = 2 % 2;
        int i3 = g + 13;
        d = i3 % 128;
        int i4 = i3 % 2;
        zzhs zzhsVar = (zzhs) this.zzf.get(i);
        if (i4 != 0) {
            return zzhsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int zzg() {
        int i = 2 % 2;
        int i2 = d + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzmo zzmoVar = this.zzg;
        if (i3 == 0) {
            return zzmoVar.size();
        }
        zzmoVar.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zziu zzh(int i) {
        int i2 = 2 % 2;
        int i3 = g + 103;
        d = i3 % 128;
        int i4 = i3 % 2;
        zziu zziuVar = (zziu) this.zzg.get(i);
        if (i4 != 0) {
            return zziuVar;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        int i4 = g + 121;
        int i5 = i4 % 128;
        d = i5;
        if (i4 % 2 != 0 ? i3 == 2 : i3 == 5) {
            return zzcq(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", zzhs.class, "zzg", zziu.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", zzhg.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", zzgw.zza, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        int i6 = i5 + 91;
        g = i6 % 128;
        if (i6 % 2 == 0 ? i3 == 3 : i3 == 5) {
            return new zzid();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzic(bArr);
        }
        if (i3 == 5) {
            return zzat;
        }
        throw null;
    }

    final /* synthetic */ void zzbv(Iterable iterable) {
        int i = 2 % 2;
        int i2 = d + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzmo zzmoVar = this.zzE;
        if (!zzmoVar.zza()) {
            int i4 = d + 13;
            g = i4 % 128;
            int i5 = i4 % 2;
            this.zzE = zzmf.zzcw(zzmoVar);
        }
        zzks.zzce(iterable, this.zzE);
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    public final boolean zzae() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = this.zzd & 128;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            Object[] objArr2 = new Object[1];
            a((short) 141, (byte) 15, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, fadingEdgeLength, threadPriority, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
            int gidForName = Process.getGidForName("") + 11;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            a((short) 104, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iCombineMeasuredStates, gidForName, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 59;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int i5 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b3 = $$a[7];
                Object[] objArr6 = new Object[1];
                a((short) 52, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, packedPositionChild, i5, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-1024258668) | (~iIdentityHashCode));
            int i7 = (((((-1068367616) | i6) | (~(1024258667 | iIdentityHashCode))) * (-338)) - 290691116) + (((~(iIdentityHashCode | (-44108949))) | i6) * 338) + 1084965651;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            int i10 = d + 89;
            g = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(null, null, Color.green(0) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, 127 - View.resolveSize(0, 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1084965651};
                byte[] bArr = $$d;
                byte b4 = bArr[0];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                e(b4, b5, (byte) (b5 | 22), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr[20];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                e(b6, b7, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                        int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        a((short) 52, b8, b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, scrollBarFadeDuration, scrollDefaultDelay, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                            int scrollDefaultDelay2 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                            byte b9 = $$a[7];
                            Object[] objArr18 = new Object[1];
                            a((short) 104, b9, b9, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType2, scrollDefaultDelay2, iRgb, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
                            int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            Object[] objArr19 = new Object[1];
                            a((short) 141, (byte) 15, $$a[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, capsMode, doubleTapTimeout, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i12 = d + 57;
        g = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i15 = i14 + 212240184 + (((~(iFreeMemory | 679546669)) | 639236440) * (-668)) + ((679546669 | (~(639236440 | iFreeMemory))) * 1336) + ((iFreeMemory | 781844349) * 668);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        Object obj = objArr20[1];
        ((int[]) obj)[0] = i17 ^ (i17 << 5);
        int i18 = d;
        int i19 = i18 + 81;
        g = i19 % 128;
        int i20 = i19 % 2;
        if (i2 == 0) {
            return false;
        }
        int i21 = i18 + 69;
        g = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) obj)[0];
        int i24 = i23 * i23;
        int i25 = -(923370156 * i23);
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        int i27 = -(i23 * 2037912978);
        int i28 = (((i26 | i27) << 1) - (i27 ^ i26)) - (-37841857);
        int i29 = i28 >> 18;
        int i30 = (((i29 | (-32767)) << 1) - (i29 ^ (-32767))) / 16384;
        int i31 = (i30 & 1) + (i30 | 1);
        int i32 = (i28 ^ i31) + ((i31 & i28) << 1);
        int i33 = i28 >> 26;
        int i34 = ((i33 ^ ComposerKt.defaultsKey) + ((i33 & ComposerKt.defaultsKey) << 1)) / 64;
        int i35 = -(((i34 ^ 1) + ((i34 & 1) << 1)) ^ i32);
        int i36 = ((i35 | 8) << 1) - (i35 ^ 8);
        int i37 = i36 >> 16;
        int i38 = (((i37 | (-131071)) << 1) - (i37 ^ (-131071))) / 65536;
        int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
        return 14256 / (((-((i39 ^ 1) + ((i39 & 1) << 1))) & i36) * 1782);
    }

    static /* synthetic */ zzid zzca() {
        zzid zzidVar;
        int i = 2 % 2;
        int i2 = g + 123;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            zzidVar = zzat;
            int i4 = 74 / 0;
        } else {
            zzidVar = zzat;
        }
        int i5 = i3 + 59;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return zzidVar;
    }

    public final String zzA() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 107;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzs;
        int i5 = i2 + 37;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzB() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 31;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzt;
        int i5 = i2 + 117;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean zzC() {
        int i = 2 % 2;
        int i2 = g + 109;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 16384) == 0) {
            return false;
        }
        int i5 = i3 + 91;
        g = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 95;
        g = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final long zzD() {
        int i = 2 % 2;
        int i2 = g + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzu;
        }
        int i3 = 22 / 0;
        return this.zzu;
    }

    public final boolean zzE() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 91;
        d = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 32768) != 0) {
            int i5 = i2 + 93;
            d = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 25;
        d = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final long zzF() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 33;
        d = i3 % 128;
        int i4 = i3 % 2;
        long j = this.zzv;
        int i5 = i2 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzG() {
        int i = 2 % 2;
        int i2 = g + 51;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzw;
        }
        throw null;
    }

    public final boolean zzH() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 5;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.zzb & 131072) == 0) {
            return false;
        }
        int i4 = i2 + 123;
        g = i4 % 128;
        return i4 % 2 == 0;
    }

    public final boolean zzI() {
        int i = 2 % 2;
        int i2 = d + 107;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = this.zzx;
        int i5 = i3 + 113;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return z;
    }

    public final String zzJ() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 119;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzy;
        int i5 = i2 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzK() {
        int i = 2 % 2;
        if ((this.zzb & 524288) == 0) {
            return false;
        }
        int i2 = g + 27;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final long zzL() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        long j = this.zzz;
        int i5 = i2 + 39;
        d = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r5.zzb & 1048576) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r5.zzb & 1048576) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = r1 + 49;
        com.google.android.gms.internal.measurement.zzid.d = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzM() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zzid.g
            int r2 = r1 + 71
            int r3 = r2 % 128
            com.google.android.gms.internal.measurement.zzid.d = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != 0) goto L1a
            int r2 = r5.zzb
            r2 = r2 & r4
            r4 = 74
            int r4 = r4 / r3
            if (r2 == 0) goto L28
            goto L1f
        L1a:
            int r2 = r5.zzb
            r2 = r2 & r4
            if (r2 == 0) goto L28
        L1f:
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zzid.d = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.zzM():boolean");
    }

    public final int zzN() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 35;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.zzA;
        int i5 = i2 + 99;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String zzO() {
        String str;
        int i = 2 % 2;
        int i2 = g + 111;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.zzB;
            int i4 = 14 / 0;
        } else {
            str = this.zzB;
        }
        int i5 = i3 + 13;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String zzP() {
        int i = 2 % 2;
        int i2 = g + 33;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.zzC;
        int i4 = i3 + 89;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean zzQ() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 19;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
            if ((this.zzb & 8388608) != 0) {
                return true;
            }
        } else if ((this.zzb & 8388608) != 0) {
            return true;
        }
        int i5 = i2 + 37;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return false;
    }

    public final boolean zzR() {
        boolean z;
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            z = this.zzD;
            int i4 = 57 / 0;
        } else {
            z = this.zzD;
        }
        int i5 = i3 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List zzS() {
        int i = 2 % 2;
        int i2 = d + 49;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzT() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 91;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzF;
        int i5 = i2 + 111;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean zzU() {
        int i = 2 % 2;
        int i2 = d + 13;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.zzb & 33554432) == 0) {
            return false;
        }
        int i4 = i3 + 115;
        d = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final int zzV() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 71;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.zzG;
        int i5 = i2 + 67;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean zzW() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        if ((this.zzb & 536870912) != 0) {
            int i6 = i2 + 13;
            g = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i4 + 121;
        d = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final long zzX() {
        int i = 2 % 2;
        int i2 = d + 83;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzY() {
        int i = 2 % 2;
        int i2 = g + 19;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            int i4 = i3 + 61;
            g = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = i3 + 9;
        g = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final String zzZ() {
        int i = 2 % 2;
        int i2 = d + 89;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.zzM;
        int i5 = i3 + 21;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zza() {
        int i = 2 % 2;
        if ((this.zzb & 1) != 0) {
            int i2 = d + 117;
            g = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = g + 111;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean zzaA() {
        int i = 2 % 2;
        int i2 = g + 17;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if ((this.zzd & 134217728) == 0) {
            return false;
        }
        int i4 = i3 + 1;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final long zzaB() {
        int i = 2 % 2;
        int i2 = g + 63;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzaq;
        }
        throw null;
    }

    public final boolean zzaC() {
        int i = 2 % 2;
        int i2 = d + 33;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if ((this.zzd & 536870912) == 0) {
            return false;
        }
        int i4 = i3 + 119;
        d = i4 % 128;
        return i4 % 2 != 0;
    }

    final /* synthetic */ void zzaG(int i) {
        int i2 = 2 % 2;
        int i3 = d + 33;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.zzb |= 1;
        this.zze = 1;
        int i6 = i4 + 103;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
        }
    }

    final /* synthetic */ void zzaQ(long j) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 65;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zzb |= 2;
        this.zzh = j;
        int i5 = i2 + 45;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzaR() {
        int i = 2 % 2;
        int i2 = g + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzb;
        this.zzb = i3 == 0 ? i4 & 87 : i4 & (-3);
        this.zzh = 0L;
    }

    final /* synthetic */ void zzaS(long j) {
        int i = 2 % 2;
        int i2 = g + 69;
        int i3 = i2 % 128;
        d = i3;
        this.zzb = i2 % 2 == 0 ? this.zzb | 3 : this.zzb | 4;
        this.zzi = j;
        int i4 = i3 + 113;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzaT(long j) {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzb |= 8;
        this.zzj = j;
        int i5 = i3 + 101;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    final /* synthetic */ void zzaU(long j) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 25;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zzb |= 16;
        this.zzk = j;
        int i5 = i2 + 89;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzaV() {
        int i = 2 % 2;
        int i2 = d + 97;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzb &= -17;
        this.zzk = 0L;
        int i5 = i3 + 79;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzaW(long j) {
        int i = 2 % 2;
        int i2 = d + 121;
        int i3 = i2 % 128;
        g = i3;
        this.zzb = i2 % 2 != 0 ? this.zzb | 113 : this.zzb | 32;
        this.zzl = j;
        int i4 = i3 + 121;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzaX() {
        long j;
        int i = 2 % 2;
        int i2 = g + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzb;
        if (i3 == 0) {
            this.zzb = i4 & 35;
            j = 1;
        } else {
            this.zzb = i4 & (-33);
            j = 0;
        }
        this.zzl = j;
    }

    final /* synthetic */ void zzaY(String str) {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzb |= 64;
        this.zzm = "android";
        int i5 = i3 + 33;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final boolean zzaa() {
        int i = 2 % 2;
        int i2 = g + 87;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if ((this.zzd & 2) == 0) {
            return false;
        }
        int i5 = i3 + 99;
        g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final int zzab() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 11;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.zzO;
        int i5 = i2 + 5;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean zzac() {
        int i = 2 % 2;
        if ((this.zzd & 16) == 0) {
            return false;
        }
        int i2 = d;
        int i3 = i2 + 85;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long zzad() {
        int i = 2 % 2;
        int i2 = g + 97;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        long j = this.zzS;
        int i5 = i3 + 125;
        g = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String zzaf() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 125;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzV;
        int i5 = i2 + 27;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean zzag() {
        int i = 2 % 2;
        int i2 = d + 19;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            if ((this.zzd & 19196) == 0) {
                return false;
            }
        } else if ((this.zzd & 8192) == 0) {
            return false;
        }
        int i4 = i3 + 91;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzah() {
        int i = 2 % 2;
        int i2 = d + 125;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzab;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzai() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        if ((this.zzd & 32768) != 0) {
            int i6 = i2 + 55;
            g = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i4 + 17;
        d = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final long zzaj() {
        int i = 2 % 2;
        int i2 = g + 55;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzae;
        }
        throw null;
    }

    public final boolean zzak() {
        int i = 2 % 2;
        int i2 = g + 9;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        boolean z = this.zzaf;
        int i5 = i3 + 85;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean zzal() {
        int i = 2 % 2;
        int i2 = d + 81;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.zzd & 131072) != 0) {
            return true;
        }
        int i4 = i3 + 51;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final String zzam() {
        int i = 2 % 2;
        int i2 = g + 47;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.zzag;
        int i5 = i3 + 91;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzan() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 35;
        g = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzd & 262144) == 0) {
            return false;
        }
        int i5 = i2 + 11;
        int i6 = i5 % 128;
        g = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 15;
        d = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 72 / 0;
        }
        return true;
    }

    public final boolean zzao() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 117;
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzah;
        int i5 = i2 + 77;
        d = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean zzap() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 103;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
            if ((this.zzd & 524288) != 0) {
                return true;
            }
        } else if ((this.zzd & 524288) != 0) {
            return true;
        }
        int i5 = i2 + 47;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final String zzaq() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 103;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzai;
        int i5 = i2 + 123;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final int zzar() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 109;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zzaj;
        int i6 = i2 + 113;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean zzas() {
        int i = 2 % 2;
        int i2 = d + 71;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((this.zzd & 4194304) == 0) {
            return false;
        }
        int i4 = i3 + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r5.zzd & 8388608) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r5.zzd & 8388608) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r1 = r1 + 53;
        com.google.android.gms.internal.measurement.zzid.g = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzau() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zzid.d
            int r2 = r1 + 111
            int r3 = r2 % 128
            com.google.android.gms.internal.measurement.zzid.g = r3
            int r2 = r2 % r0
            r3 = 8388608(0x800000, float:1.1754944E-38)
            r4 = 0
            if (r2 == 0) goto L19
            int r2 = r5.zzd
            r2 = r2 & r3
            int r3 = r4 / r4
            if (r2 == 0) goto L2c
            goto L1e
        L19:
            int r2 = r5.zzd
            r2 = r2 & r3
            if (r2 == 0) goto L2c
        L1e:
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zzid.g = r2
            int r1 = r1 % r0
            r0 = 1
            if (r1 == 0) goto L2b
            r1 = 71
            int r1 = r1 / r4
        L2b:
            return r0
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.zzau():boolean");
    }

    public final int zzav() {
        int i = 2 % 2;
        int i2 = d + 47;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzam;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r5.zzd & 16777216) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r5.zzd & 16777216) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = r2 + 115;
        com.google.android.gms.internal.measurement.zzid.g = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaw() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.measurement.zzid.g
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.google.android.gms.internal.measurement.zzid.d = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != 0) goto L1a
            int r1 = r5.zzd
            r1 = r1 & r4
            r4 = 59
            int r4 = r4 / r3
            if (r1 == 0) goto L28
            goto L1f
        L1a:
            int r1 = r5.zzd
            r1 = r1 & r4
            if (r1 == 0) goto L28
        L1f:
            int r2 = r2 + 115
            int r1 = r2 % 128
            com.google.android.gms.internal.measurement.zzid.g = r1
            int r2 = r2 % r0
            r0 = 1
            return r0
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.zzaw():boolean");
    }

    public final boolean zzay() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 111;
        d = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzd & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            return false;
        }
        int i5 = i2 + 49;
        d = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = g + 75;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.zze;
        int i6 = i3 + 113;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    final /* synthetic */ void zzbA(long j) {
        int i = 2 % 2;
        int i2 = g + 21;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.zzb |= 536870912;
        this.zzK = j;
        int i5 = i3 + 15;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzbC() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 41;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            this.zzb &= Integer.MAX_VALUE;
            this.zzM = zzat.zzM;
            int i4 = 6 / 0;
        } else {
            this.zzb &= Integer.MAX_VALUE;
            this.zzM = zzat.zzM;
        }
        int i5 = i2 + 49;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbD(int i) {
        int i2 = 2 % 2;
        int i3 = d + 95;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.zzd = 2 | this.zzd;
        this.zzO = i;
    }

    final /* synthetic */ void zzbG(long j) {
        int i = 2 % 2;
        int i2 = g + 97;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.zzd |= 16;
        this.zzS = j;
        int i5 = i3 + 9;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbH(long j) {
        int i = 2 % 2;
        int i2 = d + 61;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzd |= 32;
        this.zzT = j;
        int i5 = i3 + 9;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbI(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 77;
        g = i3 % 128;
        this.zzd = i3 % 2 != 0 ? this.zzd | 25980 : this.zzd | 128;
        this.zzV = str;
        int i4 = i2 + 99;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbK() {
        zzid zzidVar;
        int i = 2 % 2;
        int i2 = d + 47;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzd;
        if (i3 != 0) {
            this.zzd = i4 & 1394;
            zzidVar = zzat;
        } else {
            this.zzd = i4 & (-8193);
            zzidVar = zzat;
        }
        this.zzab = zzidVar.zzab;
    }

    final /* synthetic */ void zzbN(long j) {
        int i = 2 % 2;
        int i2 = d + 73;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzd |= 32768;
        this.zzae = j;
        int i5 = i3 + 1;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbO(boolean z) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 105;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzd |= 65536;
            this.zzaf = z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zzd |= 65536;
        this.zzaf = z;
        int i4 = i2 + 3;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    final /* synthetic */ void zzbP(String str) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 103;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zzd |= 131072;
        this.zzag = str;
        int i5 = i2 + 107;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbQ(boolean z) {
        int i = 2 % 2;
        int i2 = d + 53;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzd = 262144 | this.zzd;
            this.zzah = z;
        } else {
            this.zzd = 262144 | this.zzd;
            this.zzah = z;
            int i3 = 71 / 0;
        }
    }

    final /* synthetic */ void zzbS(int i) {
        int i2 = 2 % 2;
        int i3 = g + 87;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        this.zzd |= 1048576;
        this.zzaj = i;
        int i6 = i4 + 49;
        g = i6 % 128;
        int i7 = i6 % 2;
    }

    final /* synthetic */ void zzbU(int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 53;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            this.zzd |= 8388608;
            this.zzam = i;
            throw null;
        }
        this.zzd |= 8388608;
        this.zzam = i;
        int i5 = i3 + 107;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzbW(zzis zzisVar) {
        int i = 2 % 2;
        int i2 = g + 109;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.zzap = zzisVar;
        this.zzd |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i5 = i3 + 71;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbX(long j) {
        int i = 2 % 2;
        int i2 = d + 73;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzd = 134217728 | this.zzd;
            this.zzaq = j;
        } else {
            this.zzd = 134217728 | this.zzd;
            this.zzaq = j;
            int i3 = 32 / 0;
        }
    }

    final /* synthetic */ void zzbY(String str) {
        int i = 2 % 2;
        int i2 = d + 29;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzd |= 268435456;
            this.zzar = "";
        } else {
            this.zzd |= 268435456;
            this.zzar = "";
            int i3 = 57 / 0;
        }
    }

    final /* synthetic */ void zzbb() {
        int i = 2 % 2;
        int i2 = g + 111;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.zzb &= -257;
        this.zzo = zzat.zzo;
        int i5 = i3 + 17;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzbd(int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 5;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.zzb |= 1024;
        this.zzq = i;
        int i6 = i3 + 67;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbh(long j) {
        int i = 2 % 2;
        int i2 = d + 75;
        int i3 = i2 % 128;
        g = i3;
        this.zzb = i2 % 2 != 0 ? this.zzb | 8565 : this.zzb | 16384;
        this.zzu = j;
        int i4 = i3 + 5;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    final /* synthetic */ void zzbi(long j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 79;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.zzb |= 32768;
        this.zzv = 133005L;
        int i5 = i2 + 61;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbk() {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            this.zzb &= -65537;
            this.zzw = zzat.zzw;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
        int i4 = i3 + 49;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzbl(boolean z) {
        int i = 2 % 2;
        int i2 = d + 3;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzb |= 131072;
        this.zzx = z;
        int i5 = i3 + 7;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    final /* synthetic */ void zzbm() {
        int i = 2 % 2;
        int i2 = d + 93;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzb &= -131073;
        this.zzx = false;
    }

    final /* synthetic */ void zzbo() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
        int i5 = i2 + 41;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzbp(long j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 23;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            this.zzb |= 524288;
            this.zzz = j;
            throw null;
        }
        this.zzb |= 524288;
        this.zzz = j;
        int i4 = i2 + 85;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzbq(int i) {
        int i2 = 2 % 2;
        int i3 = d + 119;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzb = 1048576 | this.zzb;
            this.zzA = i;
        } else {
            this.zzb = 1048576 | this.zzb;
            this.zzA = i;
            throw null;
        }
    }

    final /* synthetic */ void zzbr(String str) {
        int i = 2 % 2;
        int i2 = d + 75;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.zzb |= 2097152;
            this.zzB = str;
            obj.hashCode();
            throw null;
        }
        this.zzb |= 2097152;
        this.zzB = str;
        int i4 = i3 + 63;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzbs() {
        int i = 2 % 2;
        int i2 = d + 123;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb = (-2097153) & this.zzb;
            this.zzB = zzat.zzB;
        } else {
            this.zzb = (-2097153) & this.zzb;
            this.zzB = zzat.zzB;
            throw null;
        }
    }

    final /* synthetic */ void zzbu(boolean z) {
        int i = 2 % 2;
        int i2 = d + 79;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.zzb |= 8388608;
        this.zzD = z;
        int i5 = i3 + 31;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzby(int i) {
        int i2 = 2 % 2;
        int i3 = d + 49;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzb = 33554432 | this.zzb;
            this.zzG = i;
        } else {
            this.zzb = 33554432 | this.zzb;
            this.zzG = i;
            int i4 = 25 / 0;
        }
    }

    final /* synthetic */ void zzbz() {
        int i = 2 % 2;
        int i2 = g + 61;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzb = (-268435457) & this.zzb;
            this.zzJ = zzat.zzJ;
        } else {
            this.zzb = (-268435457) & this.zzb;
            this.zzJ = zzat.zzJ;
            throw null;
        }
    }

    public final List zzc() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 3;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzmo zzmoVar = this.zzf;
        int i5 = i2 + 121;
        g = i5 % 128;
        int i6 = i5 % 2;
        return zzmoVar;
    }

    public final List zzf() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 107;
        d = i3 % 128;
        int i4 = i3 % 2;
        zzmo zzmoVar = this.zzg;
        int i5 = i2 + 73;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return zzmoVar;
        }
        throw null;
    }

    public final boolean zzi() {
        int i = 2 % 2;
        int i2 = g + 73;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 2) == 0) {
            return false;
        }
        int i5 = i3 + 73;
        g = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final long zzj() {
        int i = 2 % 2;
        int i2 = d + 3;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        long j = this.zzh;
        int i5 = i3 + 23;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return j;
    }

    public final boolean zzk() {
        int i = 2 % 2;
        int i2 = d + 21;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 4) == 0) {
            return false;
        }
        int i5 = i3 + 31;
        d = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final long zzm() {
        int i = 2 % 2;
        int i2 = d + 65;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzi;
        }
        int i3 = 35 / 0;
        return this.zzi;
    }

    public final boolean zzn() {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 8) != 0) {
            return true;
        }
        int i5 = i3 + 37;
        d = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final long zzo() {
        int i = 2 % 2;
        int i2 = d + 87;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzj;
        }
        int i3 = 18 / 0;
        return this.zzj;
    }

    public final boolean zzp() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 1;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            if ((this.zzb & 43) == 0) {
                return false;
            }
        } else if ((this.zzb & 16) == 0) {
            return false;
        }
        int i4 = i2 + 99;
        g = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final long zzq() {
        int i = 2 % 2;
        int i2 = d + 29;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzk;
        }
        throw null;
    }

    public final boolean zzr() {
        int i = 2 % 2;
        if ((this.zzb & 32) != 0) {
            int i2 = g + 63;
            d = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = d + 67;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final long zzs() {
        int i = 2 % 2;
        int i2 = d + 69;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.zzl;
        int i4 = i3 + 55;
        d = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final String zzt() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 117;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzm;
        int i5 = i2 + 55;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String zzu() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 25;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzn;
        int i5 = i2 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzv() {
        int i = 2 % 2;
        int i2 = d + 75;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzw() {
        String str;
        int i = 2 % 2;
        int i2 = d + 21;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            str = this.zzp;
            int i4 = 71 / 0;
        } else {
            str = this.zzp;
        }
        int i5 = i3 + 47;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final boolean zzx() {
        int i = 2 % 2;
        int i2 = d + 37;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            if ((this.zzb & 18708) == 0) {
                return false;
            }
        } else if ((this.zzb & 1024) == 0) {
            return false;
        }
        int i4 = i3 + 115;
        d = i4 % 128;
        return i4 % 2 != 0;
    }

    public final int zzy() {
        int i = 2 % 2;
        int i2 = g + 85;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzq;
        }
        throw null;
    }

    public final String zzz() {
        int i = 2 % 2;
        int i2 = g + 115;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.zzr;
        int i5 = i3 + 115;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47410, 47397, 47407, 47393, 47396, 47402, 47333, 47392, 47360, 47450, 47455, 47406, 47398, 47376, 47399, 47408, 47400, 47395, 47361, 47378, 47453, 47423, 47403, 47454, 47401, 47404, 47371};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719635;
        b = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, byte r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzid.$$c
            int r7 = 68 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = 3 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.$$g(byte, short, byte):java.lang.String");
    }
}
