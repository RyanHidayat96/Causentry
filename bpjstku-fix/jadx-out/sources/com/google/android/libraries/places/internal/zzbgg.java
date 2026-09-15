package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgg implements Comparable {
    public static final /* synthetic */ int zza = 0;
    private static final zzbgf zzb = new zzbge(null);
    private static final long zzc;
    private static final long zzd;
    private static final long zze;
    private final zzbgf zzf;
    private final long zzg;
    private volatile boolean zzh;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        zzc = nanos;
        zzd = -nanos;
        zze = TimeUnit.SECONDS.toNanos(1L);
    }

    private zzbgg(zzbgf zzbgfVar, long j, long j2, boolean z) {
        this.zzf = zzbgfVar;
        long jMin = Math.min(zzc, Math.max(zzd, j2));
        this.zzg = j + jMin;
        this.zzh = jMin <= 0;
    }

    public static zzbgg zza(long j, TimeUnit timeUnit) {
        zzbgf zzbgfVar = zzb;
        Objects.requireNonNull(timeUnit, "units");
        return new zzbgg(zzbgfVar, System.nanoTime(), timeUnit.toNanos(j), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbgg)) {
            return false;
        }
        zzbgg zzbggVar = (zzbgg) obj;
        return this.zzf == zzbggVar.zzf && this.zzg == zzbggVar.zzg;
    }

    public final int hashCode() {
        return Objects.hash(this.zzf, Long.valueOf(this.zzg));
    }

    public final String toString() {
        long jZzc = zzc(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jZzc);
        long j = zze;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jZzc) % j;
        StringBuilder sb = new StringBuilder();
        if (jZzc < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        zzbgf zzbgfVar = this.zzf;
        if (zzbgfVar != zzb) {
            String string = zzbgfVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 10);
            sb2.append(" (ticker=");
            sb2.append(string);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public final boolean zzb() {
        if (!this.zzh) {
            if (this.zzg - System.nanoTime() > 0) {
                return false;
            }
            this.zzh = true;
        }
        return true;
    }

    public final long zzc(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.zzh && this.zzg - jNanoTime <= 0) {
            this.zzh = true;
        }
        return timeUnit.convert(this.zzg - jNanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbgg zzbggVar) {
        zzbgf zzbgfVar = this.zzf;
        zzbgf zzbgfVar2 = zzbggVar.zzf;
        if (zzbgfVar == zzbgfVar2) {
            return Long.compare(this.zzg, zzbggVar.zzg);
        }
        String string = zzbgfVar.toString();
        String string2 = zzbgfVar2.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14 + string2.length() + 58);
        sb.append("Tickers (");
        sb.append(string);
        sb.append(" and ");
        sb.append(string2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }
}
