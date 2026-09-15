package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzazc {
    public static final /* synthetic */ int zzf = 0;
    private static volatile int zzg = 100;
    int zza;
    int zzb;
    final int zzc = zzg;
    int zzd = Integer.MAX_VALUE;
    zzazd zze;

    public static zzazc zzF(InputStream inputStream, int i) {
        return new zzazb(inputStream, 4096, null);
    }

    public static zzazc zzG(byte[] bArr, int i, int i2) {
        return zzH(bArr, 0, i2, false);
    }

    static zzazc zzH(byte[] bArr, int i, int i2, boolean z) {
        zzaza zzazaVar = new zzaza(bArr, 0, i2, z, null);
        try {
            zzazaVar.zzz(i2);
            return zzazaVar;
        } catch (zzbar e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zzM(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzN(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void zzA(int i);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final void zzI() throws zzbar {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzbar("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzJ() throws zzbar {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzK() throws IOException {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzI();
            this.zzb++;
            zZzc = zzc(iZza);
            this.zzb--;
        } while (zZzc);
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i) throws zzbar;

    public abstract boolean zzc(int i) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzayz zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i) throws zzbar;

    private zzazc() {
    }

    /* synthetic */ zzazc(byte[] bArr) {
    }

    public final int zzL(int i) {
        int i2 = this.zzd;
        this.zzd = Integer.MAX_VALUE;
        return i2;
    }
}
