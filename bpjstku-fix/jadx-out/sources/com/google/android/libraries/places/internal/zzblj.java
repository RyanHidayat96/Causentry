package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzblj {
    static final Logger zza = Logger.getLogger(zzbfg.class.getName());
    private final Object zzb = new Object();
    private final zzbhf zzc;

    zzblj(zzbhf zzbhfVar, int i, long j, String str) {
        if (str == null) {
            throw new NullPointerException("description");
        }
        if (zzbhfVar == null) {
            throw new NullPointerException("logId");
        }
        this.zzc = zzbhfVar;
        zzbgu zzbguVar = new zzbgu();
        zzbguVar.zza(str.concat(" created"));
        zzbguVar.zzc(zzbgv.CT_INFO);
        zzbguVar.zzb(j);
        zza(zzbguVar.zze());
    }

    static void zzc(zzbhf zzbhfVar, Level level, String str) {
        Logger logger = zza;
        if (logger.isLoggable(level)) {
            String strValueOf = String.valueOf(zzbhfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 3 + String.valueOf(str).length());
            sb.append("[");
            sb.append(strValueOf);
            sb.append("] ");
            sb.append(str);
            LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void zza(zzbgw zzbgwVar) {
        Level level;
        int iOrdinal = zzbgwVar.zzb.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.zzb) {
        }
        zzc(this.zzc, level, zzbgwVar.zza);
    }

    final boolean zzb() {
        synchronized (this.zzb) {
        }
        return false;
    }

    final zzbhf zzd() {
        return this.zzc;
    }
}
