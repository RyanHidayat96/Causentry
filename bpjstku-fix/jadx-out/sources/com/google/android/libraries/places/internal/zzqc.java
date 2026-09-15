package com.google.android.libraries.places.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzqc implements zzra {
    private final UUID zza;
    private final String zzb;
    private final String zzc;
    private Thread zzd;

    zzqc(String str, String str2, String str3, int i, UUID uuid, String str4, zzqy zzqyVar) {
        this.zzc = str;
        this.zza = uuid;
        this.zzb = str4;
        zzrj zzrjVar = zzqyVar.zzc;
        this.zzd = Thread.currentThread();
    }

    public static String zzf(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    public final String toString() {
        int length = 0;
        for (zzqc zzqcVar = this; zzqcVar != null; zzqcVar = null) {
            length = zzqcVar.zze().length();
        }
        char[] cArr = new char[length];
        for (zzqc zzqcVar2 = this; zzqcVar2 != null; zzqcVar2 = null) {
            String strZze = zzqcVar2.zze();
            length -= strZze.length();
            strZze.getChars(0, strZze.length(), cArr, length);
        }
        return new String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzra zzb() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzqy zzqyVarZzd = zzqj.zzd();
        zzra zzraVar = zzqyVarZzd.zzb;
        if (zzraVar == null) {
            String strZze = zze();
            StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 101);
            sb.append("Tried to end [");
            sb.append(strZze);
            sb.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new zzqk(sb.toString());
        }
        if (this != zzraVar) {
            String strZze2 = zze();
            String strZze3 = zzraVar.zze();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze2).length() + 79 + String.valueOf(strZze3).length() + 1);
            sb2.append("Tried to end span ");
            sb2.append(strZze2);
            sb2.append(", but that span is not the current span. The current span is ");
            sb2.append(strZze3);
            sb2.append(".");
            throw new zzql(sb2.toString());
        }
        zzqj.zzc(zzqyVarZzd, null);
        this.zzd = null;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final Thread zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final UUID zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final String zze() {
        return this.zzc;
    }
}
