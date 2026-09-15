package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzazi extends zzays {
    private static final Logger zza = Logger.getLogger(zzazi.class.getName());
    private static final boolean zzb = zzbct.zza();
    public static final /* synthetic */ int zzf = 0;
    zzazj zze;

    public static int zzA(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzbcw.zza(str);
        } catch (zzbcv unused) {
            length = str.getBytes(zzbap.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zzbbl zzbblVar) {
        int iZzbl = zzbblVar.zzbl();
        return zzz(iZzbl) + iZzbl;
    }

    static int zzD(zzbbl zzbblVar, zzbbz zzbbzVar) {
        int iZzbb = ((zzaym) zzbblVar).zzbb(zzbbzVar);
        return zzz(iZzbb) + iZzbb;
    }

    @Deprecated
    static int zzG(int i, zzbbl zzbblVar, zzbbz zzbbzVar) {
        int iZzz = zzz(i << 3);
        return iZzz + iZzz + ((zzaym) zzbblVar).zzbb(zzbbzVar);
    }

    public static zzazi zzy(byte[] bArr, int i, int i2) {
        return new zzazf(bArr, i, i2);
    }

    public static int zzz(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzc() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(String str, zzbcv zzbcvVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzbcvVar);
        byte[] bytes = str.getBytes(zzbap.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzazg(e2);
        }
    }

    public abstract void zzK(int i, int i2) throws IOException;

    public abstract void zzL(int i, int i2) throws IOException;

    public abstract void zzM(int i, int i2) throws IOException;

    public abstract void zzN(int i, int i2) throws IOException;

    public abstract void zzO(int i, long j) throws IOException;

    @Override // com.google.android.libraries.places.internal.zzays
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc();

    public abstract void zzi(int i, long j) throws IOException;

    public abstract void zzj(int i, boolean z) throws IOException;

    public abstract void zzk(int i, String str) throws IOException;

    public abstract void zzl(int i, zzayz zzayzVar) throws IOException;

    abstract void zzm(int i, zzbbl zzbblVar, zzbbz zzbbzVar) throws IOException;

    public abstract void zzn(int i, zzbbl zzbblVar) throws IOException;

    public abstract void zzo(int i, zzayz zzayzVar) throws IOException;

    public abstract void zzp(byte b) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(long j) throws IOException;

    public abstract void zzu(long j) throws IOException;

    public abstract void zzx() throws IOException;

    private zzazi() {
        throw null;
    }

    /* synthetic */ zzazi(byte[] bArr) {
    }
}
