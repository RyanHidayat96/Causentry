package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakz extends zzbae implements zzbbm {
    private static final zzakz zzU;
    private static volatile zzbbt zzV;
    private zzaif zzA;
    private zzany zzB;
    private boolean zzC;
    private zzaip zzE;
    private boolean zzF;
    private int zzH;
    private int zzK;
    private int zzM;
    private int zzN;
    private zzbdw zzO;
    private zzahl zzP;
    private boolean zzQ;
    private zzajc zzR;
    private zzajx zzS;
    private int zzb;
    private int zze;
    private int zzf;
    private zzuq zzh;
    private zzzw zzi;
    private int zzj;
    private float zzk;
    private zzamj zzm;
    private zzais zzo;
    private zzajj zzp;
    private zzamb zzq;
    private zzalm zzr;
    private zzalu zzs;
    private zzalq zzt;
    private zzamg zzu;
    private zzakm zzv;
    private zzalb zzw;
    private zzalw zzx;
    private zzakp zzy;
    private zzajm zzz;
    private byte zzT = 2;
    private int zzg = 1;
    private zzbao zzl = zzbu();
    private zzbao zzn = zzbu();
    private String zzD = "";
    private String zzG = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzL = "";

    static {
        zzakz zzakzVar = new zzakz();
        zzU = zzakzVar;
        zzbae.zzbn(zzakz.class, zzakzVar);
    }

    private zzakz() {
    }

    public static zzaks zza() {
        return (zzaks) zzU.zzbj();
    }

    final /* synthetic */ void zzc(zzuq zzuqVar) {
        this.zzh = zzuqVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzd(zzamj zzamjVar) {
        this.zzm = zzamjVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void zze(zzamb zzambVar) {
        this.zzq = zzambVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void zzf(zzalm zzalmVar) {
        this.zzr = zzalmVar;
        this.zzb |= 1024;
    }

    final /* synthetic */ void zzg(zzakm zzakmVar) {
        this.zzv = zzakmVar;
        this.zzb |= 16384;
    }

    final /* synthetic */ void zzh(zzaip zzaipVar) {
        this.zzE = zzaipVar;
        this.zzb |= 8388608;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzb |= 33554432;
        this.zzG = str;
    }

    final /* synthetic */ void zzl(String str) {
        this.zzb |= BasicMeasure.EXACTLY;
        this.zzL = str;
    }

    final /* synthetic */ void zzm(zzbdw zzbdwVar) {
        this.zzO = zzbdwVar;
        this.zze |= 2;
    }

    final /* synthetic */ void zzn(zzahl zzahlVar) {
        this.zzP = zzahlVar;
        this.zze |= 4;
    }

    final /* synthetic */ void zzp(zzajc zzajcVar) {
        this.zzR = zzajcVar;
        this.zze |= 16;
    }

    final /* synthetic */ void zzq(zzajx zzajxVar) {
        this.zzS = zzajxVar;
        this.zze |= 32;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzT);
        }
        if (i2 == 2) {
            return zzbo(zzU, "\u0001(\u0000\u0002\u0001((\u0000\u0002\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0006\u001b\u0007ဉ\u0007\bᐉ\b\t᠌\u0004\nခ\u0005\u000bဇ\u0015\fဉ\t\rဈ\u0016\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014\u001bဇ\u0018\u001cဈ\u0019\u001d᠌\u001a\u001eဈ\u001b\u001fဈ\u001c ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!%ဉ\"&ဇ#'ဉ$(ဉ%", new Object[]{"zzb", "zze", "zzg", zzaku.zza, "zzh", "zzi", "zzl", zzaoo.class, "zzm", "zzn", zzais.class, "zzo", "zzp", "zzj", zzakt.zza, "zzk", "zzC", "zzq", "zzD", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzE", "zzf", "zzB", "zzF", "zzG", "zzH", zzakv.zza, "zzI", "zzJ", "zzK", zzaky.zza, "zzL", "zzM", zzakx.zza, "zzN", zzakw.zza, "zzO", "zzP", "zzQ", "zzR", "zzS"});
        }
        if (i2 == 3) {
            return new zzakz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaks(bArr);
        }
        if (i2 == 5) {
            return zzU;
        }
        if (i2 != 6) {
            this.zzT = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzV;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakz.class) {
            zzazzVar = zzV;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzU);
                zzV = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzi(boolean z) {
        this.zzb |= 16777216;
        this.zzF = z;
    }

    final /* synthetic */ void zzk(String str) {
        this.zzb |= 134217728;
        this.zzI = "4.4.1";
    }

    final /* synthetic */ void zzo(boolean z) {
        this.zze |= 8;
        this.zzQ = z;
    }

    final /* synthetic */ void zzs(int i) {
        this.zzg = i;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzt(int i) {
        this.zzK = i - 1;
        this.zzb |= 536870912;
    }

    final /* synthetic */ void zzu(int i) {
        this.zzM = i - 1;
        this.zzb |= Integer.MIN_VALUE;
    }

    final /* synthetic */ void zzv(int i) {
        this.zzN = i - 1;
        this.zze |= 1;
    }
}
