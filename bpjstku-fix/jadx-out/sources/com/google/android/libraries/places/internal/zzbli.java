package com.google.android.libraries.places.internal;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class zzbli extends zzbfg {
    private final zzblj zza;

    zzbli(zzblj zzbljVar, zzbwk zzbwkVar) {
        if (zzbljVar == null) {
            throw new NullPointerException("tracer");
        }
        this.zza = zzbljVar;
        if (zzbwkVar == null) {
            throw new NullPointerException("time");
        }
    }

    static void zzc(zzbhf zzbhfVar, int i, String str) {
        Level levelZzf = zzf(i);
        if (zzblj.zza.isLoggable(levelZzf)) {
            zzblj.zzc(zzbhfVar, levelZzf, str);
        }
    }

    static void zzd(zzbhf zzbhfVar, int i, String str, Object... objArr) {
        Level levelZzf = zzf(2);
        if (zzblj.zza.isLoggable(levelZzf)) {
            zzblj.zzc(zzbhfVar, levelZzf, MessageFormat.format(str, objArr));
        }
    }

    private final boolean zze(int i) {
        if (i == 1) {
            return false;
        }
        this.zza.zzb();
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbfg
    public final void zza(int i, String str) {
        zzc(this.zza.zzd(), i, str);
        zze(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbfg
    public final void zzb(int i, String str, Object... objArr) {
        Level levelZzf = zzf(i);
        zze(i);
        zza(i, zzblj.zza.isLoggable(levelZzf) ? MessageFormat.format(str, objArr) : null);
    }

    private static Level zzf(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }
}
