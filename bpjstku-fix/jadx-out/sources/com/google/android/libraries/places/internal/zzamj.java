package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamj extends zzbae implements zzbbm {
    private static final zzamj zzB;
    private static volatile zzbbt zzC;
    private int zzb;
    private int zze;
    private zzaje zzh;
    private zzana zzi;
    private zzalh zzj;
    private zzakb zzk;
    private zzalf zzl;
    private zzakd zzm;
    private zzald zzn;
    private zzanc zzo;
    private zzanc zzp;
    private zzalj zzq;
    private zzakr zzr;
    private zzaml zzs;
    private zzamn zzt;
    private zzaly zzu;
    private zzalo zzv;
    private zzamp zzw;
    private zzamu zzx;
    private zzamx zzy;
    private zzalf zzz;
    private byte zzA = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzamj zzamjVar = new zzamj();
        zzB = zzamjVar;
        zzbae.zzbn(zzamj.class, zzamjVar);
    }

    private zzamj() {
    }

    public static zzamh zza() {
        return (zzamh) zzB.zzbj();
    }

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zze(zzalf zzalfVar) {
        this.zzl = zzalfVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(zzakd zzakdVar) {
        this.zzm = zzakdVar;
        this.zzb |= 256;
    }

    final /* synthetic */ void zzg(zzamu zzamuVar) {
        this.zzx = zzamuVar;
        this.zzb |= 524288;
    }

    final /* synthetic */ void zzh(zzamx zzamxVar) {
        this.zzy = zzamxVar;
        this.zzb |= 1048576;
    }

    final /* synthetic */ void zzi(zzalf zzalfVar) {
        this.zzz = zzalfVar;
        this.zzb |= 2097152;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return zzbo(zzB, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"zzb", "zze", zzami.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzamj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamh(bArr);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            this.zzA = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzC;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamj.class) {
            zzazzVar = zzC;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzB);
                zzC = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
